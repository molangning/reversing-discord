package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1877f {
    /* renamed from: a */
    public static PropertyValuesHolder m35153a(Property<?, PointF> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}