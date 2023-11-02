package p066dd;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import lc.C10120b;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7059e;
import p136hc.InterfaceC7070p;

/* renamed from: dd.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5816e {

    /* renamed from: a */
    private final C10120b f16648a;

    /* renamed from: c */
    private boolean f16650c;

    /* renamed from: e */
    private final InterfaceC7070p f16652e;

    /* renamed from: b */
    private final List<C5815d> f16649b = new ArrayList();

    /* renamed from: d */
    private final int[] f16651d = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dd.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5818b implements Serializable, Comparator<C5815d> {

        /* renamed from: j */
        private final float f16653j;

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C5815d c5815d, C5815d c5815d2) {
            int compare = Integer.compare(c5815d2.m24474h(), c5815d.m24474h());
            if (compare == 0) {
                return Float.compare(Math.abs(c5815d.m24473i() - this.f16653j), Math.abs(c5815d2.m24473i() - this.f16653j));
            }
            return compare;
        }

        private C5818b(float f) {
            this.f16653j = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: dd.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5819c implements Serializable, Comparator<C5815d> {

        /* renamed from: j */
        private final float f16654j;

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C5815d c5815d, C5815d c5815d2) {
            return Float.compare(Math.abs(c5815d2.m24473i() - this.f16654j), Math.abs(c5815d.m24473i() - this.f16654j));
        }

        private C5819c(float f) {
            this.f16654j = f;
        }
    }

    public C5816e(C10120b c10120b, InterfaceC7070p interfaceC7070p) {
        this.f16648a = c10120b;
        this.f16652e = interfaceC7070p;
    }

    /* renamed from: a */
    private static float m24472a(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    /* renamed from: c */
    private boolean m24470c(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] m24463j = m24463j();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.f16648a.m12252e(i2 - i6, i - i6)) {
            m24463j[2] = m24463j[2] + 1;
            i6++;
        }
        if (m24463j[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.f16648a.m12252e(i2 - i6, i - i6)) {
            m24463j[1] = m24463j[1] + 1;
            i6++;
        }
        if (m24463j[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.f16648a.m12252e(i2 - i6, i - i6)) {
            m24463j[0] = m24463j[0] + 1;
            i6++;
        }
        if (m24463j[0] == 0) {
            return false;
        }
        int m12249j = this.f16648a.m12249j();
        int m12246m = this.f16648a.m12246m();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= m12249j || (i5 = i2 + i7) >= m12246m || !this.f16648a.m12252e(i5, i8)) {
                break;
            }
            m24463j[2] = m24463j[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= m12249j || (i4 = i2 + i7) >= m12246m || this.f16648a.m12252e(i4, i9)) {
                break;
            }
            m24463j[3] = m24463j[3] + 1;
            i7++;
        }
        if (m24463j[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= m12249j || (i3 = i2 + i7) >= m12246m || !this.f16648a.m12252e(i3, i10)) {
                break;
            }
            m24463j[4] = m24463j[4] + 1;
            i7++;
        }
        if (m24463j[4] == 0) {
            return false;
        }
        return m24464i(m24463j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.m12252e(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b1, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b3, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
        if (m24465h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00be, code lost:
        return m24472a(r2, r11);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m24469d(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            lc.b r0 = r10.f16648a
            int r1 = r0.m12246m()
            int[] r2 = r10.m24463j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.m12252e(r3, r12)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.m12252e(r3, r12)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lbf
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lbf
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.m12252e(r3, r12)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.m12252e(r11, r12)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.m12252e(r11, r12)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lbf
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lbf
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.m12252e(r11, r12)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            if (r12 < r14) goto Lb4
            return r6
        Lb4:
            boolean r12 = m24465h(r2)
            if (r12 == 0) goto Lbf
            float r11 = m24472a(r2, r11)
            return r11
        Lbf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dd.C5816e.m24469d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0086, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
        if (r0.m12252e(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008e, code lost:
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0090, code lost:
        if (r9 >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0092, code lost:
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0099, code lost:
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r12 < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b9, code lost:
        if (m24465h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
        return m24472a(r2, r11);
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float m24468e(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            lc.b r0 = r10.f16648a
            int r1 = r0.m12249j()
            int[] r2 = r10.m24463j()
            r3 = r11
        Lb:
            r4 = 2
            r5 = 1
            if (r3 < 0) goto L1d
            boolean r6 = r0.m12252e(r12, r3)
            if (r6 == 0) goto L1d
            r6 = r2[r4]
            int r6 = r6 + r5
            r2[r4] = r6
            int r3 = r3 + (-1)
            goto Lb
        L1d:
            r6 = 2143289344(0x7fc00000, float:NaN)
            if (r3 >= 0) goto L22
            return r6
        L22:
            if (r3 < 0) goto L35
            boolean r7 = r0.m12252e(r12, r3)
            if (r7 != 0) goto L35
            r7 = r2[r5]
            if (r7 > r13) goto L35
            int r7 = r7 + 1
            r2[r5] = r7
            int r3 = r3 + (-1)
            goto L22
        L35:
            if (r3 < 0) goto Lc0
            r7 = r2[r5]
            if (r7 <= r13) goto L3d
            goto Lc0
        L3d:
            r7 = 0
            if (r3 < 0) goto L51
            boolean r8 = r0.m12252e(r12, r3)
            if (r8 == 0) goto L51
            r8 = r2[r7]
            if (r8 > r13) goto L51
            int r8 = r8 + 1
            r2[r7] = r8
            int r3 = r3 + (-1)
            goto L3d
        L51:
            r3 = r2[r7]
            if (r3 <= r13) goto L56
            return r6
        L56:
            int r11 = r11 + r5
        L57:
            if (r11 >= r1) goto L67
            boolean r3 = r0.m12252e(r12, r11)
            if (r3 == 0) goto L67
            r3 = r2[r4]
            int r3 = r3 + r5
            r2[r4] = r3
            int r11 = r11 + 1
            goto L57
        L67:
            if (r11 != r1) goto L6a
            return r6
        L6a:
            r3 = 3
            if (r11 >= r1) goto L7e
            boolean r8 = r0.m12252e(r12, r11)
            if (r8 != 0) goto L7e
            r8 = r2[r3]
            if (r8 >= r13) goto L7e
            int r8 = r8 + 1
            r2[r3] = r8
            int r11 = r11 + 1
            goto L6a
        L7e:
            if (r11 == r1) goto Lc0
            r8 = r2[r3]
            if (r8 < r13) goto L85
            goto Lc0
        L85:
            r8 = 4
            if (r11 >= r1) goto L99
            boolean r9 = r0.m12252e(r12, r11)
            if (r9 == 0) goto L99
            r9 = r2[r8]
            if (r9 >= r13) goto L99
            int r9 = r9 + 1
            r2[r8] = r9
            int r11 = r11 + 1
            goto L85
        L99:
            r12 = r2[r8]
            if (r12 < r13) goto L9e
            return r6
        L9e:
            r13 = r2[r7]
            r0 = r2[r5]
            int r13 = r13 + r0
            r0 = r2[r4]
            int r13 = r13 + r0
            r0 = r2[r3]
            int r13 = r13 + r0
            int r13 = r13 + r12
            int r13 = r13 - r14
            int r12 = java.lang.Math.abs(r13)
            int r12 = r12 * 5
            int r14 = r14 * r4
            if (r12 < r14) goto Lb5
            return r6
        Lb5:
            boolean r12 = m24465h(r2)
            if (r12 == 0) goto Lc0
            float r11 = m24472a(r2, r11)
            return r11
        Lc0:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p066dd.C5816e.m24468e(int, int, int, int):float");
    }

    /* renamed from: g */
    private int m24466g() {
        if (this.f16649b.size() <= 1) {
            return 0;
        }
        C5815d c5815d = null;
        for (C5815d c5815d2 : this.f16649b) {
            if (c5815d2.m24474h() >= 2) {
                if (c5815d == null) {
                    c5815d = c5815d2;
                } else {
                    this.f16650c = true;
                    return ((int) (Math.abs(c5815d.m21455c() - c5815d2.m21455c()) - Math.abs(c5815d.m21454d() - c5815d2.m21454d()))) / 2;
                }
            }
        }
        return 0;
    }

    /* renamed from: h */
    protected static boolean m24465h(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    protected static boolean m24464i(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        if (Math.abs(f - iArr[0]) >= f2 || Math.abs(f - iArr[1]) >= f2 || Math.abs((f * 3.0f) - iArr[2]) >= 3.0f * f2 || Math.abs(f - iArr[3]) >= f2 || Math.abs(f - iArr[4]) >= f2) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private int[] m24463j() {
        m24471b(this.f16651d);
        return this.f16651d;
    }

    /* renamed from: l */
    private boolean m24461l() {
        int size = this.f16649b.size();
        float f = 0.0f;
        int i = 0;
        float f2 = 0.0f;
        for (C5815d c5815d : this.f16649b) {
            if (c5815d.m24474h() >= 2) {
                i++;
                f2 += c5815d.m24473i();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        for (C5815d c5815d2 : this.f16649b) {
            f += Math.abs(c5815d2.m24473i() - f3);
        }
        if (f > f2 * 0.05f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    private C5815d[] m24460m() {
        float f;
        int size = this.f16649b.size();
        if (size >= 3) {
            float f2 = 0.0f;
            if (size > 3) {
                float f3 = 0.0f;
                float f4 = 0.0f;
                for (C5815d c5815d : this.f16649b) {
                    float m24473i = c5815d.m24473i();
                    f3 += m24473i;
                    f4 += m24473i * m24473i;
                }
                float f5 = f3 / size;
                float sqrt = (float) Math.sqrt((f4 / f) - (f5 * f5));
                Collections.sort(this.f16649b, new C5819c(f5));
                float max = Math.max(0.2f * f5, sqrt);
                int i = 0;
                while (i < this.f16649b.size() && this.f16649b.size() > 3) {
                    if (Math.abs(this.f16649b.get(i).m24473i() - f5) > max) {
                        this.f16649b.remove(i);
                        i--;
                    }
                    i++;
                }
            }
            if (this.f16649b.size() > 3) {
                for (C5815d c5815d2 : this.f16649b) {
                    f2 += c5815d2.m24473i();
                }
                Collections.sort(this.f16649b, new C5818b(f2 / this.f16649b.size()));
                List<C5815d> list = this.f16649b;
                list.subList(3, list.size()).clear();
            }
            return new C5815d[]{this.f16649b.get(0), this.f16649b.get(1), this.f16649b.get(2)};
        }
        throw C7064j.m21461a();
    }

    /* renamed from: b */
    protected final void m24471b(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final C5820f m24467f(Map<EnumC7059e, ?> map) {
        boolean z;
        if (map != null && map.containsKey(EnumC7059e.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        int m12249j = this.f16648a.m12249j();
        int m12246m = this.f16648a.m12246m();
        int i = (m12249j * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < m12249j && !z2) {
            m24471b(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < m12246m) {
                if (this.f16648a.m12252e(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else if ((i4 & 1) == 0) {
                    if (i4 == 4) {
                        if (m24465h(iArr)) {
                            if (m24462k(iArr, i2, i3)) {
                                if (this.f16650c) {
                                    z2 = m24461l();
                                } else {
                                    int m24466g = m24466g();
                                    int i5 = iArr[2];
                                    if (m24466g > i5) {
                                        i2 += (m24466g - i5) - 2;
                                        i3 = m12246m - 1;
                                    }
                                }
                                m24471b(iArr);
                                i = 2;
                                i4 = 0;
                            } else {
                                m24459n(iArr);
                            }
                        } else {
                            m24459n(iArr);
                        }
                        i4 = 3;
                    } else {
                        i4++;
                        iArr[i4] = iArr[i4] + 1;
                    }
                } else {
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (m24465h(iArr) && m24462k(iArr, i2, m12246m)) {
                i = iArr[0];
                if (this.f16650c) {
                    z2 = m24461l();
                }
            }
            i2 += i;
        }
        C5815d[] m24460m = m24460m();
        C7069o.m21453e(m24460m);
        return new C5820f(m24460m);
    }

    /* renamed from: k */
    protected final boolean m24462k(int[] iArr, int i, int i2) {
        boolean z = false;
        int i3 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int m24472a = (int) m24472a(iArr, i2);
        float m24468e = m24468e(i, m24472a, iArr[2], i3);
        if (!Float.isNaN(m24468e)) {
            int i4 = (int) m24468e;
            float m24469d = m24469d(m24472a, i4, iArr[2], i3);
            if (!Float.isNaN(m24469d) && m24470c(i4, (int) m24469d)) {
                float f = i3 / 7.0f;
                int i5 = 0;
                while (true) {
                    if (i5 >= this.f16649b.size()) {
                        break;
                    }
                    C5815d c5815d = this.f16649b.get(i5);
                    if (c5815d.m24476f(f, m24468e, m24469d)) {
                        this.f16649b.set(i5, c5815d.m24475g(m24468e, m24469d, f));
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (!z) {
                    C5815d c5815d2 = new C5815d(m24469d, m24468e, f);
                    this.f16649b.add(c5815d2);
                    InterfaceC7070p interfaceC7070p = this.f16652e;
                    if (interfaceC7070p != null) {
                        interfaceC7070p.m21452a(c5815d2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    protected final void m24459n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}
