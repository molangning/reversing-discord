package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: androidx.core.view.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1336t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1337a {
        /* renamed from: a */
        static void m37320a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
            Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
        }

        /* renamed from: b */
        static void m37319b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
            Gravity.apply(i, i2, i3, rect, rect2, i4);
        }

        /* renamed from: c */
        static void m37318c(int i, Rect rect, Rect rect2, int i2) {
            Gravity.applyDisplay(i, rect, rect2, i2);
        }
    }

    /* renamed from: a */
    public static void m37322a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        C1337a.m37319b(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: b */
    public static int m37321b(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}