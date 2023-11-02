package com.facebook.imagepipeline.common;

import p075e3.C6099b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RotationOptions {

    /* renamed from: c */
    private static final RotationOptions f10304c = new RotationOptions(-1, false);

    /* renamed from: d */
    private static final RotationOptions f10305d = new RotationOptions(-2, false);

    /* renamed from: e */
    private static final RotationOptions f10306e = new RotationOptions(-1, true);

    /* renamed from: a */
    private final int f10307a;

    /* renamed from: b */
    private final boolean f10308b;

    private RotationOptions(int i, boolean z) {
        this.f10307a = i;
        this.f10308b = z;
    }

    /* renamed from: a */
    public static RotationOptions m31189a() {
        return f10304c;
    }

    /* renamed from: b */
    public static RotationOptions m31188b() {
        return f10306e;
    }

    /* renamed from: d */
    public static RotationOptions m31186d() {
        return f10305d;
    }

    /* renamed from: c */
    public boolean m31187c() {
        return this.f10308b;
    }

    /* renamed from: e */
    public int m31185e() {
        if (!m31183g()) {
            return this.f10307a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        if (this.f10307a == rotationOptions.f10307a && this.f10308b == rotationOptions.f10308b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m31184f() {
        return this.f10307a != -2;
    }

    /* renamed from: g */
    public boolean m31183g() {
        return this.f10307a == -1;
    }

    public int hashCode() {
        return C6099b.m23579c(Integer.valueOf(this.f10307a), Boolean.valueOf(this.f10308b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f10307a), Boolean.valueOf(this.f10308b));
    }
}