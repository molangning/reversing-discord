package p399w7;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p195k8.C9149a;
import p195k8.C9157d;
import p195k8.C9197r;
import p195k8.C9207x;
import p195k8.C9208y;
import p383v7.AbstractC13139k;
import p383v7.C13127b;
import p383v7.C13138j;
import p383v7.InterfaceC13133f;
import p399w7.C13421c;

/* renamed from: w7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13421c extends AbstractC13426e {

    /* renamed from: g */
    private final C9208y f34571g = new C9208y();

    /* renamed from: h */
    private final C9207x f34572h = new C9207x();

    /* renamed from: i */
    private int f34573i = -1;

    /* renamed from: j */
    private final boolean f34574j;

    /* renamed from: k */
    private final int f34575k;

    /* renamed from: l */
    private final C13423b[] f34576l;

    /* renamed from: m */
    private C13423b f34577m;

    /* renamed from: n */
    private List<C13127b> f34578n;

    /* renamed from: o */
    private List<C13127b> f34579o;

    /* renamed from: p */
    private C13424c f34580p;

    /* renamed from: q */
    private int f34581q;

    /* renamed from: w7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13422a {

        /* renamed from: c */
        private static final Comparator<C13422a> f34582c = new Comparator() { // from class: w7.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m2533c;
                m2533c = C13421c.C13422a.m2533c((C13421c.C13422a) obj, (C13421c.C13422a) obj2);
                return m2533c;
            }
        };

        /* renamed from: a */
        public final C13127b f34583a;

        /* renamed from: b */
        public final int f34584b;

        public C13422a(CharSequence charSequence, Layout.Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
            C13127b.C13129b m3143m = new C13127b.C13129b().m3142n(charSequence).m3141o(alignment).m3148h(f, i).m3147i(i2).m3146j(f2).m3145k(i3).m3143m(f3);
            if (z) {
                m3143m.m3138r(i4);
            }
            this.f34583a = m3143m.m3155a();
            this.f34584b = i5;
        }

        /* renamed from: c */
        public static /* synthetic */ int m2533c(C13422a c13422a, C13422a c13422a2) {
            return Integer.compare(c13422a2.f34584b, c13422a.f34584b);
        }
    }

    /* renamed from: w7.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13423b {

        /* renamed from: A */
        private static final int[] f34585A;

        /* renamed from: B */
        private static final int[] f34586B;

        /* renamed from: C */
        private static final boolean[] f34587C;

        /* renamed from: D */
        private static final int[] f34588D;

        /* renamed from: E */
        private static final int[] f34589E;

        /* renamed from: F */
        private static final int[] f34590F;

        /* renamed from: G */
        private static final int[] f34591G;

        /* renamed from: w */
        public static final int f34592w = m2525h(2, 2, 2, 0);

        /* renamed from: x */
        public static final int f34593x;

        /* renamed from: y */
        public static final int f34594y;

        /* renamed from: z */
        private static final int[] f34595z;

        /* renamed from: a */
        private final List<SpannableString> f34596a = new ArrayList();

        /* renamed from: b */
        private final SpannableStringBuilder f34597b = new SpannableStringBuilder();

        /* renamed from: c */
        private boolean f34598c;

        /* renamed from: d */
        private boolean f34599d;

        /* renamed from: e */
        private int f34600e;

        /* renamed from: f */
        private boolean f34601f;

        /* renamed from: g */
        private int f34602g;

        /* renamed from: h */
        private int f34603h;

        /* renamed from: i */
        private int f34604i;

        /* renamed from: j */
        private int f34605j;

        /* renamed from: k */
        private boolean f34606k;

        /* renamed from: l */
        private int f34607l;

        /* renamed from: m */
        private int f34608m;

        /* renamed from: n */
        private int f34609n;

        /* renamed from: o */
        private int f34610o;

        /* renamed from: p */
        private int f34611p;

        /* renamed from: q */
        private int f34612q;

        /* renamed from: r */
        private int f34613r;

        /* renamed from: s */
        private int f34614s;

        /* renamed from: t */
        private int f34615t;

        /* renamed from: u */
        private int f34616u;

        /* renamed from: v */
        private int f34617v;

        static {
            int m2525h = m2525h(0, 0, 0, 0);
            f34593x = m2525h;
            int m2525h2 = m2525h(0, 0, 0, 3);
            f34594y = m2525h2;
            f34595z = new int[]{0, 0, 0, 0, 0, 2, 0};
            f34585A = new int[]{0, 0, 0, 0, 0, 0, 2};
            f34586B = new int[]{3, 3, 3, 3, 3, 3, 1};
            f34587C = new boolean[]{false, false, false, true, true, true, false};
            f34588D = new int[]{m2525h, m2525h2, m2525h, m2525h, m2525h2, m2525h, m2525h};
            f34589E = new int[]{0, 1, 2, 3, 4, 3, 4};
            f34590F = new int[]{0, 0, 0, 0, 0, 3, 3};
            f34591G = new int[]{m2525h, m2525h, m2525h, m2525h, m2525h, m2525h2, m2525h2};
        }

        public C13423b() {
            m2521l();
        }

        /* renamed from: g */
        public static int m2526g(int i, int i2, int i3) {
            return m2525h(i, i2, i3, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x002e  */
        /* renamed from: h */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int m2525h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                p195k8.C9149a.m16450c(r4, r0, r1)
                p195k8.C9149a.m16450c(r5, r0, r1)
                p195k8.C9149a.m16450c(r6, r0, r1)
                p195k8.C9149a.m16450c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p399w7.C13421c.C13423b.m2525h(int, int, int, int):int");
        }

        /* renamed from: a */
        public void m2532a(char c) {
            if (c == '\n') {
                this.f34596a.add(m2529d());
                this.f34597b.clear();
                if (this.f34611p != -1) {
                    this.f34611p = 0;
                }
                if (this.f34612q != -1) {
                    this.f34612q = 0;
                }
                if (this.f34613r != -1) {
                    this.f34613r = 0;
                }
                if (this.f34615t != -1) {
                    this.f34615t = 0;
                }
                while (true) {
                    if ((this.f34606k && this.f34596a.size() >= this.f34605j) || this.f34596a.size() >= 15) {
                        this.f34596a.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.f34597b.append(c);
            }
        }

        /* renamed from: b */
        public void m2531b() {
            int length = this.f34597b.length();
            if (length > 0) {
                this.f34597b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:68:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00aa  */
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public p399w7.C13421c.C13422a m2530c() {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p399w7.C13421c.C13423b.m2530c():w7.c$a");
        }

        /* renamed from: d */
        public SpannableString m2529d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f34597b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f34611p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f34611p, length, 33);
                }
                if (this.f34612q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f34612q, length, 33);
                }
                if (this.f34613r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f34614s), this.f34613r, length, 33);
                }
                if (this.f34615t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f34616u), this.f34615t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* renamed from: e */
        public void m2528e() {
            this.f34596a.clear();
            this.f34597b.clear();
            this.f34611p = -1;
            this.f34612q = -1;
            this.f34613r = -1;
            this.f34615t = -1;
            this.f34617v = 0;
        }

        /* renamed from: f */
        public void m2527f(boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f34598c = true;
            this.f34599d = z;
            this.f34606k = z2;
            this.f34600e = i;
            this.f34601f = z4;
            this.f34602g = i2;
            this.f34603h = i3;
            this.f34604i = i6;
            int i9 = i4 + 1;
            if (this.f34605j != i9) {
                this.f34605j = i9;
                while (true) {
                    if ((!z2 || this.f34596a.size() < this.f34605j) && this.f34596a.size() < 15) {
                        break;
                    }
                    this.f34596a.remove(0);
                }
            }
            if (i7 != 0 && this.f34608m != i7) {
                this.f34608m = i7;
                int i10 = i7 - 1;
                m2516q(f34588D[i10], f34594y, f34587C[i10], 0, f34585A[i10], f34586B[i10], f34595z[i10]);
            }
            if (i8 != 0 && this.f34609n != i8) {
                this.f34609n = i8;
                int i11 = i8 - 1;
                m2520m(0, 1, 1, false, false, f34590F[i11], f34589E[i11]);
                m2519n(f34592w, f34591G[i11], f34593x);
            }
        }

        /* renamed from: i */
        public boolean m2524i() {
            return this.f34598c;
        }

        /* renamed from: j */
        public boolean m2523j() {
            return !m2524i() || (this.f34596a.isEmpty() && this.f34597b.length() == 0);
        }

        /* renamed from: k */
        public boolean m2522k() {
            return this.f34599d;
        }

        /* renamed from: l */
        public void m2521l() {
            m2528e();
            this.f34598c = false;
            this.f34599d = false;
            this.f34600e = 4;
            this.f34601f = false;
            this.f34602g = 0;
            this.f34603h = 0;
            this.f34604i = 0;
            this.f34605j = 15;
            this.f34606k = true;
            this.f34607l = 0;
            this.f34608m = 0;
            this.f34609n = 0;
            int i = f34593x;
            this.f34610o = i;
            this.f34614s = f34592w;
            this.f34616u = i;
        }

        /* renamed from: m */
        public void m2520m(int i, int i2, int i3, boolean z, boolean z2, int i4, int i5) {
            if (this.f34611p != -1) {
                if (!z) {
                    this.f34597b.setSpan(new StyleSpan(2), this.f34611p, this.f34597b.length(), 33);
                    this.f34611p = -1;
                }
            } else if (z) {
                this.f34611p = this.f34597b.length();
            }
            if (this.f34612q != -1) {
                if (!z2) {
                    this.f34597b.setSpan(new UnderlineSpan(), this.f34612q, this.f34597b.length(), 33);
                    this.f34612q = -1;
                }
            } else if (z2) {
                this.f34612q = this.f34597b.length();
            }
        }

        /* renamed from: n */
        public void m2519n(int i, int i2, int i3) {
            if (this.f34613r != -1 && this.f34614s != i) {
                this.f34597b.setSpan(new ForegroundColorSpan(this.f34614s), this.f34613r, this.f34597b.length(), 33);
            }
            if (i != f34592w) {
                this.f34613r = this.f34597b.length();
                this.f34614s = i;
            }
            if (this.f34615t != -1 && this.f34616u != i2) {
                this.f34597b.setSpan(new BackgroundColorSpan(this.f34616u), this.f34615t, this.f34597b.length(), 33);
            }
            if (i2 != f34593x) {
                this.f34615t = this.f34597b.length();
                this.f34616u = i2;
            }
        }

        /* renamed from: o */
        public void m2518o(int i, int i2) {
            if (this.f34617v != i) {
                m2532a('\n');
            }
            this.f34617v = i;
        }

        /* renamed from: p */
        public void m2517p(boolean z) {
            this.f34599d = z;
        }

        /* renamed from: q */
        public void m2516q(int i, int i2, boolean z, int i3, int i4, int i5, int i6) {
            this.f34610o = i;
            this.f34607l = i6;
        }
    }

    /* renamed from: w7.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13424c {

        /* renamed from: a */
        public final int f34618a;

        /* renamed from: b */
        public final int f34619b;

        /* renamed from: c */
        public final byte[] f34620c;

        /* renamed from: d */
        int f34621d = 0;

        public C13424c(int i, int i2) {
            this.f34618a = i;
            this.f34619b = i2;
            this.f34620c = new byte[(i2 * 2) - 1];
        }
    }

    public C13421c(int i, List<byte[]> list) {
        boolean z = true;
        this.f34575k = i == -1 ? 1 : i;
        this.f34574j = (list == null || !C9157d.m16424h(list)) ? false : z;
        this.f34576l = new C13423b[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.f34576l[i2] = new C13423b();
        }
        this.f34577m = this.f34576l[0];
    }

    /* renamed from: A */
    private void m2552A() {
        int m2525h = C13423b.m2525h(this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2));
        int m2525h2 = C13423b.m2525h(this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2));
        this.f34572h.m16116r(2);
        this.f34577m.m2519n(m2525h, m2525h2, C13423b.m2526g(this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2)));
    }

    /* renamed from: B */
    private void m2551B() {
        this.f34572h.m16116r(4);
        int m16126h = this.f34572h.m16126h(4);
        this.f34572h.m16116r(2);
        this.f34577m.m2518o(m16126h, this.f34572h.m16126h(6));
    }

    /* renamed from: C */
    private void m2550C() {
        int m2525h = C13423b.m2525h(this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2));
        int m16126h = this.f34572h.m16126h(2);
        int m2526g = C13423b.m2526g(this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16126h(2));
        if (this.f34572h.m16127g()) {
            m16126h |= 4;
        }
        boolean m16127g = this.f34572h.m16127g();
        int m16126h2 = this.f34572h.m16126h(2);
        int m16126h3 = this.f34572h.m16126h(2);
        int m16126h4 = this.f34572h.m16126h(2);
        this.f34572h.m16116r(8);
        this.f34577m.m2516q(m2525h, m2526g, m16127g, m16126h, m16126h2, m16126h3, m16126h4);
    }

    @RequiresNonNull({"currentDtvCcPacket"})
    /* renamed from: D */
    private void m2549D() {
        C13424c c13424c = this.f34580p;
        if (c13424c.f34621d != (c13424c.f34619b * 2) - 1) {
            C9197r.m16184b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f34580p.f34619b * 2) - 1) + ", but current index is " + this.f34580p.f34621d + " (sequence number " + this.f34580p.f34618a + ");");
        }
        C9207x c9207x = this.f34572h;
        C13424c c13424c2 = this.f34580p;
        c9207x.m16119o(c13424c2.f34620c, c13424c2.f34621d);
        int m16126h = this.f34572h.m16126h(3);
        int m16126h2 = this.f34572h.m16126h(5);
        if (m16126h == 7) {
            this.f34572h.m16116r(2);
            m16126h = this.f34572h.m16126h(6);
            if (m16126h < 7) {
                C9197r.m16178h("Cea708Decoder", "Invalid extended service number: " + m16126h);
            }
        }
        if (m16126h2 == 0) {
            if (m16126h != 0) {
                C9197r.m16178h("Cea708Decoder", "serviceNumber is non-zero (" + m16126h + ") when blockSize is 0");
            }
        } else if (m16126h != this.f34575k) {
        } else {
            boolean z = false;
            while (this.f34572h.m16132b() > 0) {
                int m16126h3 = this.f34572h.m16126h(8);
                if (m16126h3 != 16) {
                    if (m16126h3 <= 31) {
                        m2545q(m16126h3);
                    } else {
                        if (m16126h3 <= 127) {
                            m2540v(m16126h3);
                        } else if (m16126h3 <= 159) {
                            m2544r(m16126h3);
                        } else if (m16126h3 <= 255) {
                            m2539w(m16126h3);
                        } else {
                            C9197r.m16178h("Cea708Decoder", "Invalid base command: " + m16126h3);
                        }
                        z = true;
                    }
                } else {
                    int m16126h4 = this.f34572h.m16126h(8);
                    if (m16126h4 <= 31) {
                        m2543s(m16126h4);
                    } else {
                        if (m16126h4 <= 127) {
                            m2538x(m16126h4);
                        } else if (m16126h4 <= 159) {
                            m2542t(m16126h4);
                        } else if (m16126h4 <= 255) {
                            m2537y(m16126h4);
                        } else {
                            C9197r.m16178h("Cea708Decoder", "Invalid extended command: " + m16126h4);
                        }
                        z = true;
                    }
                }
            }
            if (z) {
                this.f34578n = m2546p();
            }
        }
    }

    /* renamed from: E */
    private void m2548E() {
        for (int i = 0; i < 8; i++) {
            this.f34576l[i].m2521l();
        }
    }

    /* renamed from: o */
    private void m2547o() {
        if (this.f34580p == null) {
            return;
        }
        m2549D();
        this.f34580p = null;
    }

    /* renamed from: p */
    private List<C13127b> m2546p() {
        C13422a m2530c;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            if (!this.f34576l[i].m2523j() && this.f34576l[i].m2522k() && (m2530c = this.f34576l[i].m2530c()) != null) {
                arrayList.add(m2530c);
            }
        }
        Collections.sort(arrayList, C13422a.f34582c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(((C13422a) arrayList.get(i2)).f34583a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    /* renamed from: q */
    private void m2545q(int i) {
        if (i != 0) {
            if (i != 3) {
                if (i != 8) {
                    switch (i) {
                        case 12:
                            m2548E();
                            return;
                        case 13:
                            this.f34577m.m2532a('\n');
                            return;
                        case 14:
                            return;
                        default:
                            if (i >= 17 && i <= 23) {
                                C9197r.m16178h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i);
                                this.f34572h.m16116r(8);
                                return;
                            } else if (i >= 24 && i <= 31) {
                                C9197r.m16178h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i);
                                this.f34572h.m16116r(16);
                                return;
                            } else {
                                C9197r.m16178h("Cea708Decoder", "Invalid C0 command: " + i);
                                return;
                            }
                    }
                }
                this.f34577m.m2531b();
                return;
            }
            this.f34578n = m2546p();
        }
    }

    /* renamed from: r */
    private void m2544r(int i) {
        C13423b c13423b;
        int i2 = 1;
        switch (i) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i3 = i - 128;
                if (this.f34581q != i3) {
                    this.f34581q = i3;
                    this.f34577m = this.f34576l[i3];
                    return;
                }
                return;
            case 136:
                while (i2 <= 8) {
                    if (this.f34572h.m16127g()) {
                        this.f34576l[8 - i2].m2528e();
                    }
                    i2++;
                }
                return;
            case 137:
                for (int i4 = 1; i4 <= 8; i4++) {
                    if (this.f34572h.m16127g()) {
                        this.f34576l[8 - i4].m2517p(true);
                    }
                }
                return;
            case 138:
                while (i2 <= 8) {
                    if (this.f34572h.m16127g()) {
                        this.f34576l[8 - i2].m2517p(false);
                    }
                    i2++;
                }
                return;
            case 139:
                for (int i5 = 1; i5 <= 8; i5++) {
                    if (this.f34572h.m16127g()) {
                        this.f34576l[8 - i5].m2517p(!c13423b.m2522k());
                    }
                }
                return;
            case 140:
                while (i2 <= 8) {
                    if (this.f34572h.m16127g()) {
                        this.f34576l[8 - i2].m2521l();
                    }
                    i2++;
                }
                return;
            case 141:
                this.f34572h.m16116r(8);
                return;
            case 142:
                return;
            case 143:
                m2548E();
                return;
            case 144:
                if (!this.f34577m.m2524i()) {
                    this.f34572h.m16116r(16);
                    return;
                } else {
                    m2536z();
                    return;
                }
            case 145:
                if (!this.f34577m.m2524i()) {
                    this.f34572h.m16116r(24);
                    return;
                } else {
                    m2552A();
                    return;
                }
            case 146:
                if (!this.f34577m.m2524i()) {
                    this.f34572h.m16116r(16);
                    return;
                } else {
                    m2551B();
                    return;
                }
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                C9197r.m16178h("Cea708Decoder", "Invalid C1 command: " + i);
                return;
            case 151:
                if (!this.f34577m.m2524i()) {
                    this.f34572h.m16116r(32);
                    return;
                } else {
                    m2550C();
                    return;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i6 = i - 152;
                m2541u(i6);
                if (this.f34581q != i6) {
                    this.f34581q = i6;
                    this.f34577m = this.f34576l[i6];
                    return;
                }
                return;
        }
    }

    /* renamed from: s */
    private void m2543s(int i) {
        if (i > 7) {
            if (i <= 15) {
                this.f34572h.m16116r(8);
            } else if (i <= 23) {
                this.f34572h.m16116r(16);
            } else if (i <= 31) {
                this.f34572h.m16116r(24);
            }
        }
    }

    /* renamed from: t */
    private void m2542t(int i) {
        if (i <= 135) {
            this.f34572h.m16116r(32);
        } else if (i <= 143) {
            this.f34572h.m16116r(40);
        } else if (i <= 159) {
            this.f34572h.m16116r(2);
            this.f34572h.m16116r(this.f34572h.m16126h(6) * 8);
        }
    }

    /* renamed from: u */
    private void m2541u(int i) {
        C13423b c13423b = this.f34576l[i];
        this.f34572h.m16116r(2);
        boolean m16127g = this.f34572h.m16127g();
        boolean m16127g2 = this.f34572h.m16127g();
        boolean m16127g3 = this.f34572h.m16127g();
        int m16126h = this.f34572h.m16126h(3);
        boolean m16127g4 = this.f34572h.m16127g();
        int m16126h2 = this.f34572h.m16126h(7);
        int m16126h3 = this.f34572h.m16126h(8);
        int m16126h4 = this.f34572h.m16126h(4);
        int m16126h5 = this.f34572h.m16126h(4);
        this.f34572h.m16116r(2);
        int m16126h6 = this.f34572h.m16126h(6);
        this.f34572h.m16116r(2);
        c13423b.m2527f(m16127g, m16127g2, m16127g3, m16126h, m16127g4, m16126h2, m16126h3, m16126h5, m16126h6, m16126h4, this.f34572h.m16126h(3), this.f34572h.m16126h(3));
    }

    /* renamed from: v */
    private void m2540v(int i) {
        if (i == 127) {
            this.f34577m.m2532a((char) 9835);
        } else {
            this.f34577m.m2532a((char) (i & 255));
        }
    }

    /* renamed from: w */
    private void m2539w(int i) {
        this.f34577m.m2532a((char) (i & 255));
    }

    /* renamed from: x */
    private void m2538x(int i) {
        if (i != 32) {
            if (i != 33) {
                if (i != 37) {
                    if (i != 42) {
                        if (i != 44) {
                            if (i != 63) {
                                if (i != 57) {
                                    if (i != 58) {
                                        if (i != 60) {
                                            if (i != 61) {
                                                switch (i) {
                                                    case 48:
                                                        this.f34577m.m2532a((char) 9608);
                                                        return;
                                                    case 49:
                                                        this.f34577m.m2532a((char) 8216);
                                                        return;
                                                    case 50:
                                                        this.f34577m.m2532a((char) 8217);
                                                        return;
                                                    case 51:
                                                        this.f34577m.m2532a((char) 8220);
                                                        return;
                                                    case 52:
                                                        this.f34577m.m2532a((char) 8221);
                                                        return;
                                                    case 53:
                                                        this.f34577m.m2532a((char) 8226);
                                                        return;
                                                    default:
                                                        switch (i) {
                                                            case 118:
                                                                this.f34577m.m2532a((char) 8539);
                                                                return;
                                                            case 119:
                                                                this.f34577m.m2532a((char) 8540);
                                                                return;
                                                            case 120:
                                                                this.f34577m.m2532a((char) 8541);
                                                                return;
                                                            case 121:
                                                                this.f34577m.m2532a((char) 8542);
                                                                return;
                                                            case 122:
                                                                this.f34577m.m2532a((char) 9474);
                                                                return;
                                                            case 123:
                                                                this.f34577m.m2532a((char) 9488);
                                                                return;
                                                            case 124:
                                                                this.f34577m.m2532a((char) 9492);
                                                                return;
                                                            case 125:
                                                                this.f34577m.m2532a((char) 9472);
                                                                return;
                                                            case 126:
                                                                this.f34577m.m2532a((char) 9496);
                                                                return;
                                                            case 127:
                                                                this.f34577m.m2532a((char) 9484);
                                                                return;
                                                            default:
                                                                C9197r.m16178h("Cea708Decoder", "Invalid G2 character: " + i);
                                                                return;
                                                        }
                                                }
                                            }
                                            this.f34577m.m2532a((char) 8480);
                                            return;
                                        }
                                        this.f34577m.m2532a((char) 339);
                                        return;
                                    }
                                    this.f34577m.m2532a((char) 353);
                                    return;
                                }
                                this.f34577m.m2532a((char) 8482);
                                return;
                            }
                            this.f34577m.m2532a((char) 376);
                            return;
                        }
                        this.f34577m.m2532a((char) 338);
                        return;
                    }
                    this.f34577m.m2532a((char) 352);
                    return;
                }
                this.f34577m.m2532a((char) 8230);
                return;
            }
            this.f34577m.m2532a((char) 160);
            return;
        }
        this.f34577m.m2532a(' ');
    }

    /* renamed from: y */
    private void m2537y(int i) {
        if (i == 160) {
            this.f34577m.m2532a((char) 13252);
            return;
        }
        C9197r.m16178h("Cea708Decoder", "Invalid G3 character: " + i);
        this.f34577m.m2532a('_');
    }

    /* renamed from: z */
    private void m2536z() {
        this.f34577m.m2520m(this.f34572h.m16126h(4), this.f34572h.m16126h(2), this.f34572h.m16126h(2), this.f34572h.m16127g(), this.f34572h.m16127g(), this.f34572h.m16126h(3), this.f34572h.m16126h(3));
    }

    @Override // p399w7.AbstractC13426e, p383v7.InterfaceC13134g
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2514a(long j) {
        super.mo2514a(j);
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: e */
    protected InterfaceC13133f mo2510e() {
        List<C13127b> list = this.f34578n;
        this.f34579o = list;
        return new C13430f((List) C9149a.m16448e(list));
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: f */
    protected void mo2509f(C13138j c13138j) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) C9149a.m16448e(c13138j.f26743l);
        this.f34571g.m16101N(byteBuffer.array(), byteBuffer.limit());
        while (this.f34571g.m16097a() >= 3) {
            int m16111D = this.f34571g.m16111D() & 7;
            int i = m16111D & 3;
            boolean z2 = false;
            if ((m16111D & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte m16111D2 = (byte) this.f34571g.m16111D();
            byte m16111D3 = (byte) this.f34571g.m16111D();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        m2547o();
                        int i2 = (m16111D2 & 192) >> 6;
                        int i3 = this.f34573i;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m2548E();
                            C9197r.m16178h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f34573i + " current=" + i2);
                        }
                        this.f34573i = i2;
                        int i4 = m16111D2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C13424c c13424c = new C13424c(i2, i4);
                        this.f34580p = c13424c;
                        byte[] bArr = c13424c.f34620c;
                        int i5 = c13424c.f34621d;
                        c13424c.f34621d = i5 + 1;
                        bArr[i5] = m16111D3;
                    } else {
                        if (i == 2) {
                            z2 = true;
                        }
                        C9149a.m16452a(z2);
                        C13424c c13424c2 = this.f34580p;
                        if (c13424c2 == null) {
                            C9197r.m16183c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c13424c2.f34620c;
                            int i6 = c13424c2.f34621d;
                            int i7 = i6 + 1;
                            bArr2[i6] = m16111D2;
                            c13424c2.f34621d = i7 + 1;
                            bArr2[i7] = m16111D3;
                        }
                    }
                    C13424c c13424c3 = this.f34580p;
                    if (c13424c3.f34621d == (c13424c3.f34619b * 2) - 1) {
                        m2547o();
                    }
                }
            }
        }
    }

    @Override // p399w7.AbstractC13426e, p228m6.InterfaceC10269e
    public void flush() {
        super.flush();
        this.f34578n = null;
        this.f34579o = null;
        this.f34581q = 0;
        this.f34577m = this.f34576l[0];
        m2548E();
        this.f34580p = null;
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: g */
    public /* bridge */ /* synthetic */ C13138j mo2508g() {
        return super.mo2511d();
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: h */
    public /* bridge */ /* synthetic */ AbstractC13139k mo2507h() {
        return super.mo2513b();
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: k */
    protected boolean mo2504k() {
        return this.f34578n != this.f34579o;
    }

    @Override // p399w7.AbstractC13426e
    /* renamed from: l */
    public /* bridge */ /* synthetic */ void mo2503l(C13138j c13138j) {
        super.mo2512c(c13138j);
    }

    @Override // p399w7.AbstractC13426e, p228m6.InterfaceC10269e
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}