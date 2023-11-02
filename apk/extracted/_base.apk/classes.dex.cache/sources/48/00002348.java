package com.facebook.jni.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public @interface DoNotStrip {
}