package androidx.core.view.animation;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.view.animation.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1226a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.animation.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1227a {
        /* renamed from: a */
        static PathInterpolator m37494a(float f, float f2) {
            return new PathInterpolator(f, f2);
        }

        /* renamed from: b */
        static PathInterpolator m37493b(float f, float f2, float f3, float f4) {
            return new PathInterpolator(f, f2, f3, f4);
        }

        /* renamed from: c */
        static PathInterpolator m37492c(Path path) {
            return new PathInterpolator(path);
        }
    }

    /* renamed from: a */
    public static Interpolator m37496a(float f, float f2, float f3, float f4) {
        return C1227a.m37493b(f, f2, f3, f4);
    }

    /* renamed from: b */
    public static Interpolator m37495b(Path path) {
        return C1227a.m37492c(path);
    }
}