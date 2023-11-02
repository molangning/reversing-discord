package p195k8;

import java.util.NoSuchElementException;

/* renamed from: k8.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9186n {

    /* renamed from: a */
    private int f24161a = 0;

    /* renamed from: b */
    private int f24162b = -1;

    /* renamed from: c */
    private int f24163c = 0;

    /* renamed from: d */
    private int[] f24164d;

    /* renamed from: e */
    private int f24165e;

    public C9186n() {
        int[] iArr = new int[16];
        this.f24164d = iArr;
        this.f24165e = iArr.length - 1;
    }

    /* renamed from: c */
    private void m16320c() {
        int[] iArr = this.f24164d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i = this.f24161a;
            int i2 = length2 - i;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            System.arraycopy(this.f24164d, 0, iArr2, i2, i);
            this.f24161a = 0;
            this.f24162b = this.f24163c - 1;
            this.f24164d = iArr2;
            this.f24165e = iArr2.length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public void m16322a(int i) {
        if (this.f24163c == this.f24164d.length) {
            m16320c();
        }
        int i2 = (this.f24162b + 1) & this.f24165e;
        this.f24162b = i2;
        this.f24164d[i2] = i;
        this.f24163c++;
    }

    /* renamed from: b */
    public void m16321b() {
        this.f24161a = 0;
        this.f24162b = -1;
        this.f24163c = 0;
    }

    /* renamed from: d */
    public boolean m16319d() {
        return this.f24163c == 0;
    }

    /* renamed from: e */
    public int m16318e() {
        int i = this.f24163c;
        if (i != 0) {
            int[] iArr = this.f24164d;
            int i2 = this.f24161a;
            int i3 = iArr[i2];
            this.f24161a = (i2 + 1) & this.f24165e;
            this.f24163c = i - 1;
            return i3;
        }
        throw new NoSuchElementException();
    }
}
