package com.budiyev.android.codescanner;

/* renamed from: com.budiyev.android.codescanner.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2809i {

    /* renamed from: a */
    private final int f7639a;

    /* renamed from: b */
    private final int f7640b;

    public C2809i(int i, int i2) {
        this.f7639a = i;
        this.f7640b = i2;
    }

    /* renamed from: a */
    public int m32188a() {
        return this.f7639a;
    }

    /* renamed from: b */
    public int m32187b() {
        return this.f7640b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2809i)) {
            return false;
        }
        C2809i c2809i = (C2809i) obj;
        if (this.f7639a == c2809i.f7639a && this.f7640b == c2809i.f7640b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f7639a;
        int i2 = this.f7640b;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return "(" + this.f7639a + "; " + this.f7640b + ")";
    }
}