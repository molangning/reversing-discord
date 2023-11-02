package lc;

import p136hc.AbstractC7056b;
import p136hc.AbstractC7062h;
import p136hc.C7064j;

/* renamed from: lc.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10126h extends AbstractC7056b {

    /* renamed from: d */
    private static final byte[] f26414d = new byte[0];

    /* renamed from: b */
    private byte[] f26415b;

    /* renamed from: c */
    private final int[] f26416c;

    public C10126h(AbstractC7062h abstractC7062h) {
        super(abstractC7062h);
        this.f26415b = f26414d;
        this.f26416c = new int[32];
    }

    /* renamed from: g */
    private static int m12219g(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i10 = iArr[i8] * i9 * i9;
            if (i10 > i7) {
                i6 = i8;
                i7 = i10;
            }
        }
        if (i3 <= i6) {
            int i11 = i3;
            i3 = i6;
            i6 = i11;
        }
        if (i3 - i6 > length / 16) {
            int i12 = i3 - 1;
            int i13 = -1;
            int i14 = i12;
            while (i12 > i6) {
                int i15 = i12 - i6;
                int i16 = i15 * i15 * (i3 - i12) * (i2 - iArr[i12]);
                if (i16 > i13) {
                    i14 = i12;
                    i13 = i16;
                }
                i12--;
            }
            return i14 << 3;
        }
        throw C7064j.m21461a();
    }

    /* renamed from: h */
    private void m12218h(int i) {
        if (this.f26415b.length < i) {
            this.f26415b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f26416c[i2] = 0;
        }
    }

    @Override // p136hc.AbstractC7056b
    /* renamed from: b */
    public C10120b mo12212b() {
        AbstractC7062h m21480e = m21480e();
        int m21468d = m21480e.m21468d();
        int m21469a = m21480e.m21469a();
        C10120b c10120b = new C10120b(m21468d, m21469a);
        m12218h(m21468d);
        int[] iArr = this.f26416c;
        for (int i = 1; i < 5; i++) {
            byte[] mo21459c = m21480e.mo21459c((m21469a * i) / 5, this.f26415b);
            int i2 = (m21468d << 2) / 5;
            for (int i3 = m21468d / 5; i3 < i2; i3++) {
                int i4 = (mo21459c[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int m12219g = m12219g(iArr);
        byte[] mo21460b = m21480e.mo21460b();
        for (int i5 = 0; i5 < m21469a; i5++) {
            int i6 = i5 * m21468d;
            for (int i7 = 0; i7 < m21468d; i7++) {
                if ((mo21460b[i6 + i7] & 255) < m12219g) {
                    c10120b.m12244p(i7, i5);
                }
            }
        }
        return c10120b;
    }

    @Override // p136hc.AbstractC7056b
    /* renamed from: c */
    public C10119a mo12220c(int i, C10119a c10119a) {
        AbstractC7062h m21480e = m21480e();
        int m21468d = m21480e.m21468d();
        if (c10119a != null && c10119a.m12261j() >= m21468d) {
            c10119a.m12267b();
        } else {
            c10119a = new C10119a(m21468d);
        }
        m12218h(m21468d);
        byte[] mo21459c = m21480e.mo21459c(i, this.f26415b);
        int[] iArr = this.f26416c;
        for (int i2 = 0; i2 < m21468d; i2++) {
            int i3 = (mo21459c[i2] & 255) >> 3;
            iArr[i3] = iArr[i3] + 1;
        }
        int m12219g = m12219g(iArr);
        if (m21468d < 3) {
            for (int i4 = 0; i4 < m21468d; i4++) {
                if ((mo21459c[i4] & 255) < m12219g) {
                    c10119a.m12257n(i4);
                }
            }
        } else {
            int i5 = mo21459c[1] & 255;
            int i6 = 1;
            int i7 = mo21459c[0] & 255;
            int i8 = i5;
            while (i6 < m21468d - 1) {
                int i9 = i6 + 1;
                int i10 = mo21459c[i9] & 255;
                if ((((i8 << 2) - i7) - i10) / 2 < m12219g) {
                    c10119a.m12257n(i6);
                }
                i7 = i8;
                i6 = i9;
                i8 = i10;
            }
        }
        return c10119a;
    }
}