package androidx.core.graphics;

import android.graphics.Rect;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class Insets {

    /* renamed from: e */
    public static final Insets f3339e = new Insets(0, 0, 0, 0);

    /* renamed from: a */
    public final int f3340a;

    /* renamed from: b */
    public final int f3341b;

    /* renamed from: c */
    public final int f3342c;

    /* renamed from: d */
    public final int f3343d;

    /* renamed from: androidx.core.graphics.Insets$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0994a {
        /* renamed from: a */
        static android.graphics.Insets m38188a(int i, int i2, int i3, int i4) {
            android.graphics.Insets of;
            of = android.graphics.Insets.of(i, i2, i3, i4);
            return of;
        }
    }

    private Insets(int i, int i2, int i3, int i4) {
        this.f3340a = i;
        this.f3341b = i2;
        this.f3342c = i3;
        this.f3343d = i4;
    }

    /* renamed from: a */
    public static Insets m38193a(Insets insets, Insets insets2) {
        return m38192b(Math.max(insets.f3340a, insets2.f3340a), Math.max(insets.f3341b, insets2.f3341b), Math.max(insets.f3342c, insets2.f3342c), Math.max(insets.f3343d, insets2.f3343d));
    }

    /* renamed from: b */
    public static Insets m38192b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f3339e;
        }
        return new Insets(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static Insets m38191c(Rect rect) {
        return m38192b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static Insets m38190d(android.graphics.Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m38192b(i, i2, i3, i4);
    }

    /* renamed from: e */
    public android.graphics.Insets m38189e() {
        return C0994a.m38188a(this.f3340a, this.f3341b, this.f3342c, this.f3343d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        if (this.f3343d == insets.f3343d && this.f3340a == insets.f3340a && this.f3342c == insets.f3342c && this.f3341b == insets.f3341b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3340a * 31) + this.f3341b) * 31) + this.f3342c) * 31) + this.f3343d;
    }

    public String toString() {
        return "Insets{left=" + this.f3340a + ", top=" + this.f3341b + ", right=" + this.f3342c + ", bottom=" + this.f3343d + '}';
    }
}
