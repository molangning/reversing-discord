package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.C1134c;
import java.util.List;

/* renamed from: androidx.core.view.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1330s {

    /* renamed from: a */
    private final DisplayCutout f3658a;

    /* renamed from: androidx.core.view.s$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1331a {
        /* renamed from: a */
        static DisplayCutout m37331a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m37330b(DisplayCutout displayCutout) {
            List<Rect> boundingRects;
            boundingRects = displayCutout.getBoundingRects();
            return boundingRects;
        }

        /* renamed from: c */
        static int m37329c(DisplayCutout displayCutout) {
            int safeInsetBottom;
            safeInsetBottom = displayCutout.getSafeInsetBottom();
            return safeInsetBottom;
        }

        /* renamed from: d */
        static int m37328d(DisplayCutout displayCutout) {
            int safeInsetLeft;
            safeInsetLeft = displayCutout.getSafeInsetLeft();
            return safeInsetLeft;
        }

        /* renamed from: e */
        static int m37327e(DisplayCutout displayCutout) {
            int safeInsetRight;
            safeInsetRight = displayCutout.getSafeInsetRight();
            return safeInsetRight;
        }

        /* renamed from: f */
        static int m37326f(DisplayCutout displayCutout) {
            int safeInsetTop;
            safeInsetTop = displayCutout.getSafeInsetTop();
            return safeInsetTop;
        }
    }

    private C1330s(DisplayCutout displayCutout) {
        this.f3658a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1330s m37332e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1330s(displayCutout);
    }

    /* renamed from: a */
    public int m37336a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1331a.m37329c(this.f3658a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m37335b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1331a.m37328d(this.f3658a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m37334c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1331a.m37327e(this.f3658a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m37333d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1331a.m37326f(this.f3658a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1330s.class == obj.getClass()) {
            return C1134c.m37835a(this.f3658a, ((C1330s) obj).f3658a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f3658a;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f3658a + "}";
    }
}
