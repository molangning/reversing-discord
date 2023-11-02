package p066dd;

import java.util.ArrayList;
import java.util.List;
import lc.C10120b;
import p136hc.C7064j;
import p136hc.InterfaceC7070p;

/* renamed from: dd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5813b {

    /* renamed from: a */
    private final C10120b f16635a;

    /* renamed from: c */
    private final int f16637c;

    /* renamed from: d */
    private final int f16638d;

    /* renamed from: e */
    private final int f16639e;

    /* renamed from: f */
    private final int f16640f;

    /* renamed from: g */
    private final float f16641g;

    /* renamed from: i */
    private final InterfaceC7070p f16643i;

    /* renamed from: b */
    private final List<C5812a> f16636b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f16642h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5813b(C10120b c10120b, int i, int i2, int i3, int i4, float f, InterfaceC7070p interfaceC7070p) {
        this.f16635a = c10120b;
        this.f16637c = i;
        this.f16638d = i2;
        this.f16639e = i3;
        this.f16640f = i4;
        this.f16641g = f;
        this.f16643i = interfaceC7070p;
    }

    /* renamed from: a */
    private static float m24491a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    private float m24490b(int i, int i2, int i3, int i4) {
        C10120b c10120b = this.f16635a;
        int m12249j = c10120b.m12249j();
        int[] iArr = this.f16642h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && c10120b.m12252e(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !c10120b.m12252e(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < m12249j && c10120b.m12252e(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != m12249j && iArr[1] <= i3) {
                while (i8 < m12249j && !c10120b.m12252e(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m24488d(iArr)) {
                    return m24491a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m24488d(int[] iArr) {
        float f = this.f16641g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private C5812a m24487e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m24491a = m24491a(iArr, i2);
        float m24490b = m24490b(i, (int) m24491a, iArr[1] * 2, i3);
        if (!Float.isNaN(m24490b)) {
            float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (C5812a c5812a : this.f16636b) {
                if (c5812a.m24493f(f, m24490b, m24491a)) {
                    return c5812a.m24492g(m24490b, m24491a, f);
                }
            }
            C5812a c5812a2 = new C5812a(m24491a, m24490b, f);
            this.f16636b.add(c5812a2);
            InterfaceC7070p interfaceC7070p = this.f16643i;
            if (interfaceC7070p != null) {
                interfaceC7070p.m21452a(c5812a2);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C5812a m24489c() {
        int i;
        C5812a m24487e;
        C5812a m24487e2;
        int i2 = this.f16637c;
        int i3 = this.f16640f;
        int i4 = this.f16639e + i2;
        int i5 = this.f16638d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f16635a.m12252e(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (this.f16635a.m12252e(i8, i7)) {
                    if (i9 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i9 == 2) {
                        if (m24488d(iArr) && (m24487e2 = m24487e(iArr, i7, i8)) != null) {
                            return m24487e2;
                        }
                        iArr[0] = iArr[2];
                        iArr[1] = 1;
                        iArr[2] = 0;
                        i9 = 1;
                    } else {
                        i9++;
                        iArr[i9] = iArr[i9] + 1;
                    }
                } else {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (m24488d(iArr) && (m24487e = m24487e(iArr, i7, i4)) != null) {
                return m24487e;
            }
        }
        if (!this.f16636b.isEmpty()) {
            return this.f16636b.get(0);
        }
        throw C7064j.m21461a();
    }
}
