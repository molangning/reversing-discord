package p152i7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p060d7.AbstractC5780f;
import p060d7.C5778d;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9207x;
import p195k8.C9208y;

/* renamed from: i7.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7425h extends AbstractC5780f {

    /* renamed from: b */
    public static final InterfaceC7426a f19956b = new InterfaceC7426a() { // from class: i7.g
        @Override // p152i7.C7425h.InterfaceC7426a
        /* renamed from: a */
        public final boolean mo2621a(int i, int i2, int i3, int i4, int i5) {
            boolean m20678z;
            m20678z = C7425h.m20678z(i, i2, i3, i4, i5);
            return m20678z;
        }
    };

    /* renamed from: a */
    private final InterfaceC7426a f19957a;

    /* renamed from: i7.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7426a {
        /* renamed from: a */
        boolean mo2621a(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: i7.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7427b {

        /* renamed from: a */
        private final int f19958a;

        /* renamed from: b */
        private final boolean f19959b;

        /* renamed from: c */
        private final int f19960c;

        public C7427b(int i, boolean z, int i2) {
            this.f19958a = i;
            this.f19959b = z;
            this.f19960c = i2;
        }
    }

    public C7425h() {
        this(null);
    }

    /* renamed from: A */
    private static int m20703A(C9208y c9208y, int i) {
        byte[] m16094d = c9208y.m16094d();
        int m16093e = c9208y.m16093e();
        int i2 = m16093e;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < m16093e + i) {
                if ((m16094d[i2] & 255) == 255 && m16094d[i3] == 0) {
                    System.arraycopy(m16094d, i2 + 2, m16094d, i3, (i - (i2 - m16093e)) - 2);
                    i--;
                }
                i2 = i3;
            } else {
                return i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0076, code lost:
        if ((r10 & 1) != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0079, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0086, code lost:
        if ((r10 & 128) != 0) goto L33;
     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m20702B(p195k8.C9208y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.m16093e()
        L8:
            int r3 = r18.m16097a()     // Catch: java.lang.Throwable -> Laf
            r4 = 1
            r5 = r20
            if (r3 < r5) goto Lab
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r18.m16084n()     // Catch: java.lang.Throwable -> Laf
            long r8 = r18.m16109F()     // Catch: java.lang.Throwable -> Laf
            int r10 = r18.m16105J()     // Catch: java.lang.Throwable -> Laf
            goto L2c
        L22:
            int r7 = r18.m16108G()     // Catch: java.lang.Throwable -> Laf
            int r8 = r18.m16108G()     // Catch: java.lang.Throwable -> Laf
            long r8 = (long) r8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L3a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3a
            if (r10 != 0) goto L3a
            r1.m16099P(r2)
            return r4
        L3a:
            r7 = 4
            if (r0 != r7) goto L6b
            if (r21 != 0) goto L6b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L4b
            r1.m16099P(r2)
            return r6
        L4b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L6b:
            if (r0 != r7) goto L7b
            r3 = r10 & 64
            if (r3 == 0) goto L73
            r3 = r4
            goto L74
        L73:
            r3 = r6
        L74:
            r7 = r10 & 1
            if (r7 == 0) goto L79
            goto L8b
        L79:
            r4 = r6
            goto L8b
        L7b:
            if (r0 != r3) goto L89
            r3 = r10 & 32
            if (r3 == 0) goto L83
            r3 = r4
            goto L84
        L83:
            r3 = r6
        L84:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L79
            goto L8b
        L89:
            r3 = r6
            r4 = r3
        L8b:
            if (r4 == 0) goto L8f
            int r3 = r3 + 4
        L8f:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L98
            r1.m16099P(r2)
            return r6
        L98:
            int r3 = r18.m16097a()     // Catch: java.lang.Throwable -> Laf
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto La5
            r1.m16099P(r2)
            return r6
        La5:
            int r3 = (int) r8
            r1.m16098Q(r3)     // Catch: java.lang.Throwable -> Laf
            goto L8
        Lab:
            r1.m16099P(r2)
            return r4
        Laf:
            r0 = move-exception
            r1.m16099P(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i7.C7425h.m20702B(k8.y, int, int, boolean):boolean");
    }

    /* renamed from: d */
    private static byte[] m20700d(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return C9191p0.f24176f;
        }
        return Arrays.copyOfRange(bArr, i, i2);
    }

    /* renamed from: f */
    private static C7412a m20698f(C9208y c9208y, int i, int i2) {
        int m20679y;
        String str;
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        int i3 = i - 1;
        byte[] bArr = new byte[i3];
        c9208y.m16088j(bArr, 0, i3);
        if (i2 == 2) {
            str = "image/" + C9191p0.m16272U0(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            m20679y = 2;
        } else {
            m20679y = m20679y(bArr, 0);
            String m16272U0 = C9191p0.m16272U0(new String(bArr, 0, m20679y, "ISO-8859-1"));
            if (m16272U0.indexOf(47) == -1) {
                str = "image/" + m16272U0;
            } else {
                str = m16272U0;
            }
        }
        int i4 = m20679y + 2;
        int m20680x = m20680x(bArr, i4, m16111D);
        return new C7412a(str, new String(bArr, i4, m20680x - i4, m20682v), bArr[m20679y + 1] & 255, m20700d(bArr, m20680x + m20683u(m16111D), i3));
    }

    /* renamed from: g */
    private static C7414b m20697g(C9208y c9208y, int i, String str) {
        byte[] bArr = new byte[i];
        c9208y.m16088j(bArr, 0, i);
        return new C7414b(str, bArr);
    }

    /* renamed from: h */
    private static C7416c m20696h(C9208y c9208y, int i, int i2, boolean z, int i3, InterfaceC7426a interfaceC7426a) {
        long j;
        long j2;
        int m16093e = c9208y.m16093e();
        int m20679y = m20679y(c9208y.m16094d(), m16093e);
        String str = new String(c9208y.m16094d(), m16093e, m20679y - m16093e, "ISO-8859-1");
        c9208y.m16099P(m20679y + 1);
        int m16084n = c9208y.m16084n();
        int m16084n2 = c9208y.m16084n();
        long m16109F = c9208y.m16109F();
        if (m16109F == 4294967295L) {
            j = -1;
        } else {
            j = m16109F;
        }
        long m16109F2 = c9208y.m16109F();
        if (m16109F2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = m16109F2;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = m16093e + i;
        while (c9208y.m16093e() < i4) {
            AbstractC7428i m20693k = m20693k(i2, c9208y, z, i3, interfaceC7426a);
            if (m20693k != null) {
                arrayList.add(m20693k);
            }
        }
        return new C7416c(str, m16084n, m16084n2, j, j2, (AbstractC7428i[]) arrayList.toArray(new AbstractC7428i[0]));
    }

    /* renamed from: i */
    private static C7418d m20695i(C9208y c9208y, int i, int i2, boolean z, int i3, InterfaceC7426a interfaceC7426a) {
        boolean z2;
        boolean z3;
        int m16093e = c9208y.m16093e();
        int m20679y = m20679y(c9208y.m16094d(), m16093e);
        String str = new String(c9208y.m16094d(), m16093e, m20679y - m16093e, "ISO-8859-1");
        c9208y.m16099P(m20679y + 1);
        int m16111D = c9208y.m16111D();
        if ((m16111D & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((m16111D & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int m16111D2 = c9208y.m16111D();
        String[] strArr = new String[m16111D2];
        for (int i4 = 0; i4 < m16111D2; i4++) {
            int m16093e2 = c9208y.m16093e();
            int m20679y2 = m20679y(c9208y.m16094d(), m16093e2);
            strArr[i4] = new String(c9208y.m16094d(), m16093e2, m20679y2 - m16093e2, "ISO-8859-1");
            c9208y.m16099P(m20679y2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = m16093e + i;
        while (c9208y.m16093e() < i5) {
            AbstractC7428i m20693k = m20693k(i2, c9208y, z, i3, interfaceC7426a);
            if (m20693k != null) {
                arrayList.add(m20693k);
            }
        }
        return new C7418d(str, z2, z3, strArr, (AbstractC7428i[]) arrayList.toArray(new AbstractC7428i[0]));
    }

    /* renamed from: j */
    private static C7420e m20694j(C9208y c9208y, int i) {
        if (i < 4) {
            return null;
        }
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        byte[] bArr = new byte[3];
        c9208y.m16088j(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        c9208y.m16088j(bArr2, 0, i2);
        int m20680x = m20680x(bArr2, 0, m16111D);
        String str2 = new String(bArr2, 0, m20680x, m20682v);
        int m20683u = m20680x + m20683u(m16111D);
        return new C7420e(str, str2, m20688p(bArr2, m20683u, m20680x(bArr2, m20683u, m16111D), m20682v));
    }

    /* JADX WARN: Code restructure failed: missing block: B:303:0x0190, code lost:
        if (r13 == 67) goto L98;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static p152i7.AbstractC7428i m20693k(int r19, p195k8.C9208y r20, boolean r21, int r22, p152i7.C7425h.InterfaceC7426a r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p152i7.C7425h.m20693k(int, k8.y, boolean, int, i7.h$a):i7.i");
    }

    /* renamed from: l */
    private static C7422f m20692l(C9208y c9208y, int i) {
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9208y.m16088j(bArr, 0, i2);
        int m20679y = m20679y(bArr, 0);
        String str = new String(bArr, 0, m20679y, "ISO-8859-1");
        int i3 = m20679y + 1;
        int m20680x = m20680x(bArr, i3, m16111D);
        String m20688p = m20688p(bArr, i3, m20680x, m20682v);
        int m20683u = m20680x + m20683u(m16111D);
        int m20680x2 = m20680x(bArr, m20683u, m16111D);
        return new C7422f(str, m20688p, m20688p(bArr, m20683u, m20680x2, m20682v), m20700d(bArr, m20680x2 + m20683u(m16111D), i2));
    }

    /* renamed from: m */
    private static C7427b m20691m(C9208y c9208y) {
        int m16108G;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (c9208y.m16097a() < 10) {
            C9197r.m16178h("Id3Decoder", "Data too short to be an ID3 tag");
            return null;
        }
        boolean z5 = false;
        if (c9208y.m16108G() != 4801587) {
            C9197r.m16178h("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x" + String.format("%06X", Integer.valueOf(m16108G)));
            return null;
        }
        int m16111D = c9208y.m16111D();
        c9208y.m16098Q(1);
        int m16111D2 = c9208y.m16111D();
        int m16112C = c9208y.m16112C();
        if (m16111D == 2) {
            if ((m16111D2 & 64) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                C9197r.m16178h("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                return null;
            }
        } else if (m16111D == 3) {
            if ((m16111D2 & 64) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                int m16084n = c9208y.m16084n();
                c9208y.m16098Q(m16084n);
                m16112C -= m16084n + 4;
            }
        } else if (m16111D == 4) {
            if ((m16111D2 & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int m16112C2 = c9208y.m16112C();
                c9208y.m16098Q(m16112C2 - 4);
                m16112C -= m16112C2;
            }
            if ((m16111D2 & 16) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                m16112C -= 10;
            }
        } else {
            C9197r.m16178h("Id3Decoder", "Skipped ID3 tag with unsupported majorVersion=" + m16111D);
            return null;
        }
        if (m16111D < 4 && (m16111D2 & 128) != 0) {
            z5 = true;
        }
        return new C7427b(m16111D, z5, m16112C);
    }

    /* renamed from: n */
    private static C7431k m20690n(C9208y c9208y, int i) {
        int m16105J = c9208y.m16105J();
        int m16108G = c9208y.m16108G();
        int m16108G2 = c9208y.m16108G();
        int m16111D = c9208y.m16111D();
        int m16111D2 = c9208y.m16111D();
        C9207x c9207x = new C9207x();
        c9207x.m16121m(c9208y);
        int i2 = ((i - 10) * 8) / (m16111D + m16111D2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int m16126h = c9207x.m16126h(m16111D);
            int m16126h2 = c9207x.m16126h(m16111D2);
            iArr[i3] = m16126h;
            iArr2[i3] = m16126h2;
        }
        return new C7431k(m16105J, m16108G, m16108G2, iArr, iArr2);
    }

    /* renamed from: o */
    private static C7433l m20689o(C9208y c9208y, int i) {
        byte[] bArr = new byte[i];
        c9208y.m16088j(bArr, 0, i);
        int m20679y = m20679y(bArr, 0);
        return new C7433l(new String(bArr, 0, m20679y, "ISO-8859-1"), m20700d(bArr, m20679y + 1, i));
    }

    /* renamed from: p */
    private static String m20688p(byte[] bArr, int i, int i2, String str) {
        if (i2 > i && i2 <= bArr.length) {
            return new String(bArr, i, i2 - i, str);
        }
        return "";
    }

    /* renamed from: q */
    private static C7435m m20687q(C9208y c9208y, int i, String str) {
        if (i < 1) {
            return null;
        }
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9208y.m16088j(bArr, 0, i2);
        return new C7435m(str, null, new String(bArr, 0, m20680x(bArr, 0, m16111D), m20682v));
    }

    /* renamed from: r */
    private static C7435m m20686r(C9208y c9208y, int i) {
        if (i < 1) {
            return null;
        }
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9208y.m16088j(bArr, 0, i2);
        int m20680x = m20680x(bArr, 0, m16111D);
        String str = new String(bArr, 0, m20680x, m20682v);
        int m20683u = m20680x + m20683u(m16111D);
        return new C7435m("TXXX", str, m20688p(bArr, m20683u, m20680x(bArr, m20683u, m16111D), m20682v));
    }

    /* renamed from: s */
    private static C7437n m20685s(C9208y c9208y, int i, String str) {
        byte[] bArr = new byte[i];
        c9208y.m16088j(bArr, 0, i);
        return new C7437n(str, null, new String(bArr, 0, m20679y(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: t */
    private static C7437n m20684t(C9208y c9208y, int i) {
        if (i < 1) {
            return null;
        }
        int m16111D = c9208y.m16111D();
        String m20682v = m20682v(m16111D);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        c9208y.m16088j(bArr, 0, i2);
        int m20680x = m20680x(bArr, 0, m16111D);
        String str = new String(bArr, 0, m20680x, m20682v);
        int m20683u = m20680x + m20683u(m16111D);
        return new C7437n("WXXX", str, m20688p(bArr, m20683u, m20679y(bArr, m20683u), "ISO-8859-1"));
    }

    /* renamed from: u */
    private static int m20683u(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: v */
    private static String m20682v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: w */
    private static String m20681w(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    /* renamed from: x */
    private static int m20680x(byte[] bArr, int i, int i2) {
        int m20679y = m20679y(bArr, i);
        if (i2 != 0 && i2 != 3) {
            while (m20679y < bArr.length - 1) {
                if (m20679y % 2 == 0 && bArr[m20679y + 1] == 0) {
                    return m20679y;
                }
                m20679y = m20679y(bArr, m20679y + 1);
            }
            return bArr.length;
        }
        return m20679y;
    }

    /* renamed from: y */
    private static int m20679y(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: z */
    public static /* synthetic */ boolean m20678z(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // p060d7.AbstractC5780f
    /* renamed from: b */
    protected Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer) {
        return m20699e(byteBuffer.array(), byteBuffer.limit());
    }

    /* renamed from: e */
    public Metadata m20699e(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = new ArrayList();
        C9208y c9208y = new C9208y(bArr, i);
        C7427b m20691m = m20691m(c9208y);
        if (m20691m == null) {
            return null;
        }
        int m16093e = c9208y.m16093e();
        if (m20691m.f19958a == 2) {
            i2 = 6;
        } else {
            i2 = 10;
        }
        int i3 = m20691m.f19960c;
        if (m20691m.f19959b) {
            i3 = m20703A(c9208y, m20691m.f19960c);
        }
        c9208y.m16100O(m16093e + i3);
        boolean z = false;
        if (!m20702B(c9208y, m20691m.f19958a, i2, false)) {
            if (m20691m.f19958a == 4 && m20702B(c9208y, 4, i2, true)) {
                z = true;
            } else {
                C9197r.m16178h("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + m20691m.f19958a);
                return null;
            }
        }
        while (c9208y.m16097a() >= i2) {
            AbstractC7428i m20693k = m20693k(m20691m.f19958a, c9208y, z, i2, this.f19957a);
            if (m20693k != null) {
                arrayList.add(m20693k);
            }
        }
        return new Metadata(arrayList);
    }

    public C7425h(InterfaceC7426a interfaceC7426a) {
        this.f19957a = interfaceC7426a;
    }
}