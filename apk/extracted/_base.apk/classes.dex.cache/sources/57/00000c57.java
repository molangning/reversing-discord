package com.budiyev.android.codescanner;

import android.graphics.Matrix;

/* renamed from: com.budiyev.android.codescanner.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C2812l {

    /* renamed from: a */
    private final int f7672a;

    /* renamed from: b */
    private final int f7673b;

    /* renamed from: c */
    private final int f7674c;

    /* renamed from: d */
    private final int f7675d;

    public C2812l(int i, int i2, int i3, int i4) {
        this.f7672a = i;
        this.f7673b = i2;
        this.f7674c = i3;
        this.f7675d = i4;
    }

    /* renamed from: a */
    public C2812l m32186a(int i, int i2, int i3, int i4) {
        int i5 = this.f7672a;
        int i6 = this.f7673b;
        int i7 = this.f7674c;
        int i8 = this.f7675d;
        if (i5 >= i && i6 >= i2 && i7 <= i3 && i8 <= i4) {
            return this;
        }
        return new C2812l(Math.max(i5, i), Math.max(i6, i2), Math.min(i7, i3), Math.min(i8, i4));
    }

    /* renamed from: b */
    public C2812l m32185b(C2812l c2812l) {
        int i = this.f7672a;
        int i2 = this.f7673b;
        int i3 = this.f7674c;
        int i4 = this.f7675d;
        int m32179h = m32179h();
        int m32183d = m32183d();
        int i5 = c2812l.f7672a;
        int i6 = c2812l.f7673b;
        int i7 = c2812l.f7674c;
        int i8 = c2812l.f7675d;
        int m32179h2 = c2812l.m32179h();
        int m32183d2 = c2812l.m32183d();
        if (i >= i5 && i2 >= i6 && i3 <= i7 && i4 <= i8) {
            return this;
        }
        int min = Math.min(m32179h, m32179h2);
        int min2 = Math.min(m32183d, m32183d2);
        if (i < i5) {
            i3 = i5 + min;
            i = i5;
        } else if (i3 > i7) {
            i = i7 - min;
            i3 = i7;
        }
        if (i2 < i6) {
            i4 = i6 + min2;
            i2 = i6;
        } else if (i4 > i8) {
            i2 = i8 - min2;
            i4 = i8;
        }
        return new C2812l(i, i2, i3, i4);
    }

    /* renamed from: c */
    public int m32184c() {
        return this.f7675d;
    }

    /* renamed from: d */
    public int m32183d() {
        return this.f7675d - this.f7673b;
    }

    /* renamed from: e */
    public int m32182e() {
        return this.f7672a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2812l)) {
            return false;
        }
        C2812l c2812l = (C2812l) obj;
        if (this.f7672a == c2812l.f7672a && this.f7673b == c2812l.f7673b && this.f7674c == c2812l.f7674c && this.f7675d == c2812l.f7675d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m32181f() {
        return this.f7674c;
    }

    /* renamed from: g */
    public int m32180g() {
        return this.f7673b;
    }

    /* renamed from: h */
    public int m32179h() {
        return this.f7674c - this.f7672a;
    }

    public int hashCode() {
        return (((((this.f7672a * 31) + this.f7673b) * 31) + this.f7674c) * 31) + this.f7675d;
    }

    /* renamed from: i */
    public boolean m32178i(int i, int i2) {
        return this.f7672a < i && this.f7673b < i2 && this.f7674c > i && this.f7675d > i2;
    }

    /* renamed from: j */
    public C2812l m32177j(float f, float f2, float f3) {
        Matrix matrix = new Matrix();
        float[] fArr = {this.f7672a, this.f7673b, this.f7674c, this.f7675d};
        matrix.postRotate(f, f2, f3);
        matrix.mapPoints(fArr);
        int i = (int) fArr[0];
        int i2 = (int) fArr[1];
        int i3 = (int) fArr[2];
        int i4 = (int) fArr[3];
        if (i > i3) {
            i3 = i;
            i = i3;
        }
        if (i2 > i4) {
            i4 = i2;
            i2 = i4;
        }
        return new C2812l(i, i2, i3, i4);
    }

    public String toString() {
        return "[(" + this.f7672a + "; " + this.f7673b + ") - (" + this.f7674c + "; " + this.f7675d + ")]";
    }
}