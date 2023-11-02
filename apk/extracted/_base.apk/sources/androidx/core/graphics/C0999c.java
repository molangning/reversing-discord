package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.core.util.C1136d;

/* renamed from: androidx.core.graphics.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0999c {

    /* renamed from: a */
    private static final ThreadLocal<C1136d<Rect, Rect>> f3345a = new ThreadLocal<>();

    /* renamed from: androidx.core.graphics.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1000a {
        /* renamed from: a */
        static boolean m38171a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* renamed from: a */
    public static boolean m38172a(Paint paint, String str) {
        return C1000a.m38171a(paint, str);
    }
}
