# auto-value-step-builder
AutoValue extension to create step builder pattern for AutoValue properties

[![Build Status](https://travis-ci.org/sopak/auto-value-step-builder.svg?branch=master)](https://travis-ci.org/sopak/auto-value-step-builder)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/50182c994f8344aca764251ba3f50166)](https://www.codacy.com/app/sopak/auto-value-step-builder?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=sopak/auto-value-step-builder&amp;utm_campaign=Badge_Grade)

This extension was inspired by http://www.svlada.com/step-builder-pattern/

### Java - gradle

```groovy
plugins {
    id "java"
    id "net.ltgt.apt" version "0.12"
    id "idea"
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly "cz.jcode.auto.value:auto-value-step-builder-annotations:0.0.2"
    compileOnly "cz.jcode.auto.value:auto-value-step-builder:0.0.2"
}

idea.module {

    inheritOutputDirs = false

    sourceDirs += file('build/generated/source/apt/main')

    outputDir file('build/classes/main')
    testOutputDir file('build/classes/test')

}
```

## Usage

```java
package test;

import com.google.auto.value.AutoValue;
import cz.jcode.auto.value.step.builder.AutoValueStepBuilder;

import javax.annotation.Nullable;

@AutoValue
@AutoValueStepBuilder
public abstract class Value {
    public abstract String required1();

    public abstract String required2();

    public abstract String required3();

    @Nullable
    public abstract String optional1();

    @Nullable
    public abstract String optional2();

    public static AutoValue_Value.Required1Step step() {
        return AutoValue_Value.step();
    }

    public static AutoValue_Value.Required1LazyStep lazyStep() {
        return AutoValue_Value.lazyStep();
    }
}

```

## Simple Example

```java
package test;

public class Main {
    public static void main(String[] args) {
        Value.step()
                .required1("string")
                .required2("string")
                .required3("string")
                .optional()
                .optional1("optional")
                .optional2(null)
                .build();

        Value.lazyStep()
                .required1(() -> "string")
                .required2(() -> "string")
                .required3(() -> "string")
                .optional()
                .optional1(() -> "optional")
                .optional2(() -> null)
                .build();
    }
}
```
