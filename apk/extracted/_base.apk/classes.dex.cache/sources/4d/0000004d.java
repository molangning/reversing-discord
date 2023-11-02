package p008a7;

import java.util.Arrays;
import p195k8.C9149a;

/* renamed from: a7.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C0077u {

    /* renamed from: a */
    private final int f373a;

    /* renamed from: b */
    private boolean f374b;

    /* renamed from: c */
    private boolean f375c;

    /* renamed from: d */
    public byte[] f376d;

    /* renamed from: e */
    public int f377e;

    public C0077u(int i, int i2) {
        this.f373a = i;
        byte[] bArr = new byte[i2 + 3];
        this.f376d = bArr;
        bArr[2] = 1;
    }

    /* renamed from: a */
    public void m41210a(byte[] bArr, int i, int i2) {
        if (!this.f374b) {
            return;
        }
        int i3 = i2 - i;
        byte[] bArr2 = this.f376d;
        int length = bArr2.length;
        int i4 = this.f377e;
        if (length < i4 + i3) {
            this.f376d = Arrays.copyOf(bArr2, (i4 + i3) * 2);
        }
        System.arraycopy(bArr, i, this.f376d, this.f377e, i3);
        this.f377e += i3;
    }

    /* renamed from: b */
    public boolean m41209b(int i) {
        if (!this.f374b) {
            return false;
        }
        this.f377e -= i;
        this.f374b = false;
        this.f375c = true;
        return true;
    }

    /* renamed from: c */
    public boolean m41208c() {
        return this.f375c;
    }

    /* renamed from: d */
    public void m41207d() {
        this.f374b = false;
        this.f375c = false;
    }

    /* renamed from: e */
    public void m41206e(int i) {
        boolean z = true;
        C9149a.m16447f(!this.f374b);
        if (i != this.f373a) {
            z = false;
        }
        this.f374b = z;
        if (z) {
            this.f377e = 3;
            this.f375c = false;
        }
    }
}