/*
 * Copyright 2017 Kamil Sopko (https://github.com/sopak) and contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cz.jcode.auto.value.step.builder;

import com.google.auto.value.processor.AutoValueProcessor;
import com.google.common.collect.ImmutableList;
import com.google.testing.compile.Compilation;
import com.google.testing.compile.JavaFileObjects;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javax.tools.JavaFileObject;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.google.testing.compile.Compiler.javac;

public class GeneratorTest {

    public static Stream<List<String>> inputSourceBlocks() {
        return Stream.of(
                ImmutableList.of(
                        "cz.jcode.auto.value.step.builder.example.simple.Address",
                        "cz.jcode.auto.value.step.builder.example.simple.NoBuilderAddress",
                        "cz.jcode.auto.value.step.builder.example.simple.Person"
                ),
                ImmutableList.of(
                        "cz.jcode.auto.value.step.builder.example.generic.Address",
                        "cz.jcode.auto.value.step.builder.example.generic.NoBuilderAddress",
                        "cz.jcode.auto.value.step.builder.example.generic.Person"
                ),
                ImmutableList.of(
                        "cz.jcode.auto.value.step.builder.example.innerclass.PersonWithAddress"
                ),
                ImmutableList.of(
                        "cz.jcode.auto.value.step.builder.example.inheritance.Child",
                        "cz.jcode.auto.value.step.builder.example.inheritance.OtherInterface",
                        "cz.jcode.auto.value.step.builder.example.inheritance.Parent",
                        "cz.jcode.auto.value.step.builder.example.inheritance.ParentInterface"
                )
        );
    }

    private static List<JavaFileObject> getResourceStrings(String prefix, List<String> classNames) throws IOException {
        return classNames.stream().map(className -> {

            String resourceName = "/" + prefix + "/" + className.replace('.', '/') + ".java";

            try (InputStream stream = GeneratorTest.class.getResourceAsStream(resourceName)) {
                if (stream == null) {
                    return null;
                } else {
                    return JavaFileObjects.forSourceString(className, IOUtils.toString(stream, StandardCharsets.UTF_8));
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }

    @ParameterizedTest
    @MethodSource("inputSourceBlocks")
    public void printAllGenerated(List<String> block) throws IOException {

        List<JavaFileObject> sourceJavaFileObject = getResourceStrings("input", block);

        AutoValueProcessor processor = new AutoValueProcessor();

        Compilation compilation = javac().withProcessors(processor).compile(sourceJavaFileObject);

        ImmutableList<JavaFileObject> javaFileObjects = ImmutableList.<JavaFileObject>builder()
                .addAll(compilation.generatedSourceFiles())
                .build();
        String destination = "src/test/resources/expected";
        Files.createDirectories(Paths.get(destination));

        javaFileObjects.forEach(
                generated -> {
                    try {
                        String fileName = destination + generated.getName().replace("SOURCE_OUTPUT/", "");
                        Path parent = Paths.get(fileName).getParent();
                        Files.createDirectories(parent);

                        try (PrintWriter printWriter = new PrintWriter(fileName)) {
                            printWriter.println(generated.getCharContent(true).toString());
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
        );
    }


}
