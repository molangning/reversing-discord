package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1876e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T> ObjectAnimator m35154a(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
