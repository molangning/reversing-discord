package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1422d {

    /* renamed from: androidx.core.widget.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1423a {
        /* renamed from: a */
        static void m36909a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1424b {
        /* renamed from: a */
        public static EdgeEffect m36908a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m36907b(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m36906c(EdgeEffect edgeEffect, float f, float f2) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m36913a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1424b.m36908a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m36912b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1424b.m36907b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m36911c(EdgeEffect edgeEffect, float f, float f2) {
        C1423a.m36909a(edgeEffect, f, f2);
    }

    /* renamed from: d */
    public static float m36910d(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C1424b.m36906c(edgeEffect, f, f2);
        }
        m36911c(edgeEffect, f, f2);
        return f;
    }
}