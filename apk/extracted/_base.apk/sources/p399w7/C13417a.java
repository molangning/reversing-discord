package p399w7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p383v7.AbstractC13139k;
import p383v7.C13127b;
import p383v7.C13138j;
import p383v7.InterfaceC13133f;

/* renamed from: w7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13417a extends AbstractC13426e {

    /* renamed from: h */
    private final int f34543h;

    /* renamed from: i */
    private final int f34544i;

    /* renamed from: j */
    private final int f34545j;

    /* renamed from: k */
    private final long f34546k;

    /* renamed from: n */
    private List<C13127b> f34549n;

    /* renamed from: o */
    private List<C13127b> f34550o;

    /* renamed from: p */
    private int f34551p;

    /* renamed from: q */
    private int f34552q;

    /* renamed from: r */
    private boolean f34553r;

    /* renamed from: s */
    private boolean f34554s;

    /* renamed from: t */
    private byte f34555t;

    /* renamed from: u */
    private byte f34556u;

    /* renamed from: w */
    private boolean f34558w;

    /* renamed from: x */
    private long f34559x;

    /* renamed from: y */
    private static final int[] f34540y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: z */
    private static final int[] f34541z = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: A */
    private static final int[] f34534A = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: B */
    private static final int[] f34535B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, ItemTouchHelper.AbstractC1746c.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: C */
    private static final int[] f34536C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: D */
    private static final int[] f34537D = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: E */
    private static final int[] f34538E = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: F */
    private static final boolean[] f34539F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: g */
    private final C9208y f34542g = new C9208y();

    /* renamed from: l */
    private final ArrayList<C13418a> f34547l = new ArrayList<>();

    /* renamed from: m */
    private C13418a f34548m = new C13418a(0, 4);

    /* renamed from: v */
    private int f34557v = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13418a {

        /* renamed from: a */
        private final List<C13419a> f34560a = new ArrayList();

        /* renamed from: b */
        private final List<SpannableString> f34561b = new ArrayList();

        /* renamed from: c */
        private final StringBuilder f34562c = new StringBuilder();

        /* renamed from: d */
        private int f34563d;

        /* renamed from: e */
        private int f34564e;

        /* renamed from: f */
        private int f34565f;

        /* renamed from: g */
        private int f34566g;

        /* renamed from: h */
        private int f34567h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w7.a$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C13419a {

            /* renamed from: a */
            public final int f34568a;

            /* renamed from: b */
            public final boolean f34569b;

            /* renamed from: c */
            public int f34570c;

            public C13419a(int i, boolean z, int i2) {
                this.f34568a = i;
                this.f34569b = z;
                this.f34570c = i2;
            }
        }

        public C13418a(int i, int i2) {
            m2560j(i);
            this.f34567h = i2;
        }

        /* renamed from: h */
        private SpannableString m2562h() {
            int i;
            boolean z;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f34562c);
            int length = spannableStringBuilder.length();
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            boolean z2 = false;
            while (i6 < this.f34560a.size()) {
                C13419a c13419a = this.f34560a.get(i6);
                boolean z3 = c13419a.f34569b;
                int i8 = c13419a.f34568a;
                if (i8 != 8) {
                    if (i8 == 7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i8 != 7) {
                        i5 = C13417a.f34534A[i8];
                    }
                    z2 = z;
                }
                int i9 = c13419a.f34570c;
                i6++;
                if (i6 < this.f34560a.size()) {
                    i = this.f34560a.get(i6).f34570c;
                } else {
                    i = length;
                }
                if (i9 != i) {
                    if (i2 != -1 && !z3) {
                        m2553q(spannableStringBuilder, i2, i9);
                        i2 = -1;
                    } else if (i2 == -1 && z3) {
                        i2 = i9;
                    }
                    if (i3 != -1 && !z2) {
                        m2555o(spannableStringBuilder, i3, i9);
                        i3 = -1;
                    } else if (i3 == -1 && z2) {
                        i3 = i9;
                    }
                    if (i5 != i4) {
                        m2556n(spannableStringBuilder, i7, i9, i4);
                        i4 = i5;
                        i7 = i9;
                    }
                }
            }
            if (i2 != -1 && i2 != length) {
                m2553q(spannableStringBuilder, i2, length);
            }
            if (i3 != -1 && i3 != length) {
                m2555o(spannableStringBuilder, i3, length);
            }
            if (i7 != length) {
                m2556n(spannableStringBuilder, i7, length, i4);
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: n */
        private static void m2556n(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
        }

        /* renamed from: o */
        private static void m2555o(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        /* renamed from: q */
        private static void m2553q(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        /* renamed from: e */
        public void m2565e(char c) {
            if (this.f34562c.length() < 32) {
                this.f34562c.append(c);
            }
        }

        /* renamed from: f */
        public void m2564f() {
            int length = this.f34562c.length();
            if (length > 0) {
                this.f34562c.delete(length - 1, length);
                for (int size = this.f34560a.size() - 1; size >= 0; size--) {
                    C13419a c13419a = this.f34560a.get(size);
                    int i = c13419a.f34570c;
                    if (i == length) {
                        c13419a.f34570c = i - 1;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: g */
        public C13127b m2563g(int i) {
            float f;
            int i2 = this.f34564e + this.f34565f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f34561b.size(); i4++) {
                spannableStringBuilder.append(C9191p0.m16266X0(this.f34561b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(C9191p0.m16266X0(m2562h(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.f34566g == 2 && (Math.abs(i5) < 3 || length < 0)) {
                    i = 1;
                } else if (this.f34566g == 2 && i5 > 0) {
                    i = 2;
                } else {
                    i = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.f34563d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f34566g == 1) {
                i6 -= this.f34567h - 1;
            }
            return new C13127b.C13129b().m3142n(spannableStringBuilder).m3141o(Layout.Alignment.ALIGN_NORMAL).m3148h(i6, 1).m3146j(f).m3145k(i).m3155a();
        }

        /* renamed from: i */
        public boolean m2561i() {
            if (this.f34560a.isEmpty() && this.f34561b.isEmpty() && this.f34562c.length() == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public void m2560j(int i) {
            this.f34566g = i;
            this.f34560a.clear();
            this.f34561b.clear();
            this.f34562c.setLength(0);
            this.f34563d = 15;
            this.f34564e = 0;
            this.f34565f = 0;
        }

        /* renamed from: k */
        public void m2559k() {
            this.f34561b.add(m2562h());
            this.f34562c.setLength(0);
            this.f34560a.clear();
            int min = Math.min(this.f34567h, this.f34563d);
            while (this.f34561b.size() >= min) {
                this.f34561b.remove(0);
            }
        }

        /* renamed from: l */
        public void m2558l(int i) {
            this.f34566g = i;
        }

        /* renamed from: m */
        public void m2557m(int i) {
            this.f34567h = i;
        }

        /* renamed from: p */
        public void m2554p(int i, boolean z) {
            this.f34560a.add(new C13419a(i, z, this.f34562c.length()));
        }
    }

    public C13417a(String str, int i, long j) {
        long j2;
        int i2;
        if (j > 0) {
            j2 = j * 1000;
        } else {
            j2 = -9223372036854775807L;
        }
        this.f34546k = j2;
        if ("application/x-mp4-cea-608".equals(str)) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f34543h = i2;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        C9197r.m16178h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f34545j = 0;
                        this.f34544i = 0;
                    } else {
                        this.f34545j = 1;
                        this.f34544i = 1;
                    }
                } else {
                    this.f34545j = 0;
                    this.f34544i = 1;
                }
            } else {
                this.f34545j = 1;
                this.f34544i = 0;
            }
        } else {
            this.f34545j = 0;
            this.f34544i = 0;
        }
        m2585M(0);
        m2586L();
        this.f34558w = true;
        this.f34559x = -9223372036854775807L;
    }

    /* renamed from: A */
    private static boolean m2597A(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    /* renamed from: B */
    private static boolean m2596B(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    /* renamed from: C */
    private static boolean m2595C(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    /* renamed from: D */
    private static boolean m2594D(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    /* renamed from: E */
    private static boolean m2593E(byte b) {
        return (b & 240) == 16;
    }

    /* renamed from: F */
    private boolean m2592F(boolean z, byte b, byte b2) {
        if (z && m2593E(b)) {
            if (this.f34554s && this.f34555t == b && this.f34556u == b2) {
                this.f34554s = false;
                return true;
            }
            this.f34554s = true;
            this.f34555t = b;
            this.f34556u = b2;
        } else {
            this.f34554s = false;
        }
        return false;
    }

    /* renamed from: G */
    private static boolean m2591G(byte b) {
        return (b & 247) == 20;
    }

    /* renamed from: H */
    private static boolean m2590H(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    /* renamed from: I */
    private static boolean m2589I(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    /* renamed from: J */
    private static boolean m2588J(byte b) {
        return 1 <= b && b <= 15;
    }

    /* renamed from: K */
    private void m2587K(byte b, byte b2) {
        if (m2588J(b)) {
            this.f34558w = false;
        } else if (m2591G(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 41:
                                break;
                            case 42:
                            case 43:
                                this.f34558w = false;
                                return;
                            default:
                                return;
                        }
                }
            }
            this.f34558w = true;
        }
    }

    /* renamed from: L */
    private void m2586L() {
        this.f34548m.m2560j(this.f34551p);
        this.f34547l.clear();
        this.f34547l.add(this.f34548m);
    }

    /* renamed from: M */
    private void m2585M(int i) {
        int i2 = this.f34551p;
        if (i2 == i) {
            return;
        }
        this.f34551p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.f34547l.size(); i3++) {
                this.f34547l.get(i3).m2558l(i);
            }
            return;
        }
        m2586L();
        if (i2 == 3 || i == 1 || i == 0) {
            this.f34549n = Collections.emptyList();
        }
    }

    /* renamed from: N */
    private void m2584N(int i) {
        this.f34552q = i;
        this.f34548m.m2557m(i);
    }

    /* renamed from: O */
    private boolean m2583O() {
        if (this.f34546k == -9223372036854775807L || this.f34559x == -9223372036854775807L || m2505j() - this.f34559x < this.f34546k) {
            return false;
        }
        return true;
    }

    /* renamed from: P */
    private boolean m2582P(byte b) {
        if (m2570z(b)) {
            this.f34557v = m2579q(b);
        }
        if (this.f34557v == this.f34545j) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private static char m2580p(byte b) {
        return (char) f34535B[(b & Byte.MAX_VALUE) - 32];
    }

    /* renamed from: q */
    private static int m2579q(byte b) {
        return (b >> 3) & 1;
    }

    /* renamed from: r */
    private List<C13127b> m2578r() {
        int size = this.f34547l.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            C13127b m2563g = this.f34547l.get(i2).m2563g(Integer.MIN_VALUE);
            arrayList.add(m2563g);
            if (m2563g != null) {
                i = Math.min(i, m2563g.f34109h);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            C13127b c13127b = (C13127b) arrayList.get(i3);
            if (c13127b != null) {
                if (c13127b.f34109h != i) {
                    c13127b = (C13127b) C9149a.m16448e(this.f34547l.get(i3).m2563g(i));
                }
                arrayList2.add(c13127b);
            }
        }
        return arrayList2;
    }

    /* renamed from: s */
    private static char m2577s(byte b) {
        return (char) f34537D[b & 31];
    }

    /* renamed from: t */
    private static char m2576t(byte b) {
        return (char) f34538E[b & 31];
    }

    /* renamed from: u */
    private static char m2575u(byte b, byte b2) {
        if ((b & 1) == 0) {
            return m2577s(b2);
        }
        return m2576t(b2);
    }

    /* renamed from: v */
    private static char m2574v(byte b) {
        return (char) f34536C[b & 15];
    }

    /* renamed from: w */
    private void m2573w(byte b) {
        boolean z;
        this.f34548m.m2565e(' ');
        if ((b & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f34548m.m2554p((b >> 1) & 7, z);
    }

    /* renamed from: x */
    private void m2572x(byte b) {
        if (b != 32) {
            if (b != 41) {
                switch (b) {
                    case 37:
                        m2585M(1);
                        m2584N(2);
                        return;
                    case 38:
                        m2585M(1);
                        m2584N(3);
                        return;
                    case 39:
                        m2585M(1);
                        m2584N(4);
                        return;
                    default:
                        int i = this.f34551p;
                        if (i == 0) {
                            return;
                        }
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.f34549n = Collections.emptyList();
                                    int i2 = this.f34551p;
                                    if (i2 == 1 || i2 == 3) {
                                        m2586L();
                                        return;
                                    }
                                    return;
                                case 45:
                                    if (i == 1 && !this.f34548m.m2561i()) {
                                        this.f34548m.m2559k();
                                        return;
                                    }
                                    return;
                                case 46:
                                    m2586L();
                                    return;
                                case 47:
                                    this.f34549n = m2578r();
                                    m2586L();
                                    return;
                                default:
                                    return;
                            }
                        }
                        this.f34548m.m2564f();
                        return;
                }
            }
            m2585M(3);
            return;
        }
        m2585M(2);
    }

    /* renamed from: y */
    private void m2571y(byte b, byte b2) {
        boolean z;
        boolean z2;
        int i;
        int i2 = f34540y[b & 7];
        boolean z3 = false;
        if ((b2 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2++;
        }
        if (i2 != this.f34548m.f34563d) {
            if (this.f34551p != 1 && !this.f34548m.m2561i()) {
                C13418a c13418a = new C13418a(this.f34551p, this.f34552q);
                this.f34548m = c13418a;
                this.f34547l.add(c13418a);
            }
            this.f34548m.f34563d = i2;
        }
        if ((b2 & 16) == 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 & 1) == 1) {
            z3 = true;
        }
        int i3 = (b2 >> 1) & 7;
        C13418a c13418a2 = this.f34548m;
        if (z2) {
            i = 8;
        } else {
            i = i3;
        }
        c13418a2.m2554p(i, z3);
        if (z2) {
            this.f34548m.f34564e = f34541z[i3];
        }
    }

    /* renamed from: z */
    private static boolean m2570z(byte b) {
        return (b & 224) == 0;
    }

    @Override // p399w7.AbstractC13426e, p383v7.InterfaceC13134g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2514a(long j) {
        super.mo2514a(j);
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: e */
    protected InterfaceC13133f mo2510e() {
        List<C13127b> list = this.f34549n;
        this.f34550o = list;
        return new C13430f((List) C9149a.m16448e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0017 A[SYNTHETIC] */
    @Override // p399w7.AbstractC13426e
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void mo2509f(p383v7.C13138j r10) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p399w7.C13417a.mo2509f(v7.j):void");
    }

    @Override // p399w7.AbstractC13426e, p228m6.InterfaceC10269e
    public void flush() {
        super.flush();
        this.f34549n = null;
        this.f34550o = null;
        m2585M(0);
        m2584N(4);
        m2586L();
        this.f34553r = false;
        this.f34554s = false;
        this.f34555t = (byte) 0;
        this.f34556u = (byte) 0;
        this.f34557v = 0;
        this.f34558w = true;
        this.f34559x = -9223372036854775807L;
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C13138j mo2508g() {
        return super.mo2511d();
    }

    @Override // p399w7.AbstractC13426e, p228m6.InterfaceC10269e
    /* renamed from: h */
    public AbstractC13139k mo2513b() {
        AbstractC13139k m2506i;
        AbstractC13139k mo2513b = super.mo2513b();
        if (mo2513b != null) {
            return mo2513b;
        }
        if (m2583O() && (m2506i = m2506i()) != null) {
            this.f34549n = Collections.emptyList();
            this.f34559x = -9223372036854775807L;
            m2506i.m3125p(m2505j(), mo2510e(), Long.MAX_VALUE);
            return m2506i;
        }
        return null;
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: k */
    protected boolean mo2504k() {
        return this.f34549n != this.f34550o;
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo2503l(C13138j c13138j) {
        super.mo2512c(c13138j);
    }

    @Override // p399w7.AbstractC13426e, p228m6.InterfaceC10269e
    public void release() {
    }
}
