package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Deprecated
/* renamed from: androidx.lifecycle.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public @interface InterfaceC1703t {
    Lifecycle.EnumC1651b value();
}