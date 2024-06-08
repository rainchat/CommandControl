package com.rainchat.commandcontrol.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommandNode {
    String value();

    String[] aliases() default {};
}
