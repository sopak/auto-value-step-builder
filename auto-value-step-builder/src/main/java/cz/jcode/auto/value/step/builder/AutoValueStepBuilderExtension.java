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

import com.google.auto.service.AutoService;
import com.google.auto.value.extension.AutoValueExtension;

@AutoService(AutoValueExtension.class)
public class AutoValueStepBuilderExtension extends AutoValueExtension
{

    public AutoValueStepBuilderExtension()
    {
        super();
    }

    @Override
    public boolean applicable(Context context)
    {
        try {

            return null != context.autoValueClass().getAnnotation(AutoValueStepBuilder.class);
        } catch (Throwable e) {
            System.out.println(e);
            throw e;
        }
    }

    @Override
    public boolean mustBeFinal(Context context) {
        //TODO final until I can find real final classname to create new instance
        return true;
    }

    @Override
    public String generateClass(Context context, String className, String classToExtend, boolean isFinal)
    {
        try {
            String generated = new Generator(context, className, classToExtend, isFinal).generate();
            return generated;
        } catch (Throwable e) {
            System.out.println(e);
            throw e;
        }
    }
}
