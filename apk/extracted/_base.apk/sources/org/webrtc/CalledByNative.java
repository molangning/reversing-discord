package org.webrtc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public @interface CalledByNative {
    String value() default "";
}
