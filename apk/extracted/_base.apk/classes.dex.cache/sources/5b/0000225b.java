package com.facebook.imagepipeline.common;

import p075e3.C6099b;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ResizeOptions {

    /* renamed from: a */
    public final int f10300a;

    /* renamed from: b */
    public final int f10301b;

    /* renamed from: c */
    public final float f10302c;

    /* renamed from: d */
    public final float f10303d;

    public ResizeOptions(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    /* renamed from: a */
    public static ResizeOptions m31190a(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        return new ResizeOptions(i, i2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        if (this.f10300a == resizeOptions.f10300a && this.f10301b == resizeOptions.f10301b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6099b.m23581a(this.f10300a, this.f10301b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f10300a), Integer.valueOf(this.f10301b));
    }

    public ResizeOptions(int i, int i2, float f) {
        this(i, i2, f, 0.6666667f);
    }

    public ResizeOptions(int i, int i2, float f, float f2) {
        C13379j.m2682b(Boolean.valueOf(i > 0));
        C13379j.m2682b(Boolean.valueOf(i2 > 0));
        this.f10300a = i;
        this.f10301b = i2;
        this.f10302c = f;
        this.f10303d = f2;
    }
}