package p440y7;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import p195k8.C9191p0;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13127b;
import p383v7.InterfaceC13133f;

/* renamed from: y7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13927a extends AbstractC13131d {

    /* renamed from: o */
    private final C9208y f35856o;

    /* renamed from: p */
    private final C9208y f35857p;

    /* renamed from: q */
    private final C13928a f35858q;

    /* renamed from: r */
    private Inflater f35859r;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13928a {

        /* renamed from: a */
        private final C9208y f35860a = new C9208y();

        /* renamed from: b */
        private final int[] f35861b = new int[256];

        /* renamed from: c */
        private boolean f35862c;

        /* renamed from: d */
        private int f35863d;

        /* renamed from: e */
        private int f35864e;

        /* renamed from: f */
        private int f35865f;

        /* renamed from: g */
        private int f35866g;

        /* renamed from: h */
        private int f35867h;

        /* renamed from: i */
        private int f35868i;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m1156e(C9208y c9208y, int i) {
            boolean z;
            int m16108G;
            if (i < 4) {
                return;
            }
            c9208y.m16098Q(3);
            if ((c9208y.m16111D() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = i - 4;
            if (z) {
                if (i2 < 7 || (m16108G = c9208y.m16108G()) < 4) {
                    return;
                }
                this.f35867h = c9208y.m16105J();
                this.f35868i = c9208y.m16105J();
                this.f35860a.m16103L(m16108G - 4);
                i2 -= 7;
            }
            int m16093e = this.f35860a.m16093e();
            int m16092f = this.f35860a.m16092f();
            if (m16093e < m16092f && i2 > 0) {
                int min = Math.min(i2, m16092f - m16093e);
                c9208y.m16088j(this.f35860a.m16094d(), m16093e, min);
                this.f35860a.m16099P(m16093e + min);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m1155f(C9208y c9208y, int i) {
            if (i < 19) {
                return;
            }
            this.f35863d = c9208y.m16105J();
            this.f35864e = c9208y.m16105J();
            c9208y.m16098Q(11);
            this.f35865f = c9208y.m16105J();
            this.f35866g = c9208y.m16105J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public void m1154g(C9208y c9208y, int i) {
            if (i % 5 != 2) {
                return;
            }
            c9208y.m16098Q(2);
            Arrays.fill(this.f35861b, 0);
            int i2 = i / 5;
            for (int i3 = 0; i3 < i2; i3++) {
                int m16111D = c9208y.m16111D();
                int m16111D2 = c9208y.m16111D();
                int m16111D3 = c9208y.m16111D();
                int m16111D4 = c9208y.m16111D();
                double d = m16111D2;
                double d2 = m16111D3 - 128;
                double d3 = m16111D4 - 128;
                this.f35861b[m16111D] = (C9191p0.m16227r((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (c9208y.m16111D() << 24) | (C9191p0.m16227r((int) ((1.402d * d2) + d), 0, 255) << 16) | C9191p0.m16227r((int) (d + (d3 * 1.772d)), 0, 255);
            }
            this.f35862c = true;
        }

        /* renamed from: d */
        public C13127b m1157d() {
            int i;
            int m16111D;
            int i2;
            if (this.f35863d != 0 && this.f35864e != 0 && this.f35867h != 0 && this.f35868i != 0 && this.f35860a.m16092f() != 0 && this.f35860a.m16093e() == this.f35860a.m16092f() && this.f35862c) {
                this.f35860a.m16099P(0);
                int i3 = this.f35867h * this.f35868i;
                int[] iArr = new int[i3];
                int i4 = 0;
                while (i4 < i3) {
                    int m16111D2 = this.f35860a.m16111D();
                    if (m16111D2 != 0) {
                        i = i4 + 1;
                        iArr[i4] = this.f35861b[m16111D2];
                    } else {
                        int m16111D3 = this.f35860a.m16111D();
                        if (m16111D3 != 0) {
                            if ((m16111D3 & 64) == 0) {
                                m16111D = m16111D3 & 63;
                            } else {
                                m16111D = ((m16111D3 & 63) << 8) | this.f35860a.m16111D();
                            }
                            if ((m16111D3 & 128) == 0) {
                                i2 = 0;
                            } else {
                                i2 = this.f35861b[this.f35860a.m16111D()];
                            }
                            i = m16111D + i4;
                            Arrays.fill(iArr, i4, i, i2);
                        }
                    }
                    i4 = i;
                }
                return new C13127b.C13129b().m3150f(Bitmap.createBitmap(iArr, this.f35867h, this.f35868i, Bitmap.Config.ARGB_8888)).m3146j(this.f35865f / this.f35863d).m3145k(0).m3148h(this.f35866g / this.f35864e, 0).m3147i(0).m3143m(this.f35867h / this.f35863d).m3149g(this.f35868i / this.f35864e).m3155a();
            }
            return null;
        }

        /* renamed from: h */
        public void m1153h() {
            this.f35863d = 0;
            this.f35864e = 0;
            this.f35865f = 0;
            this.f35866g = 0;
            this.f35867h = 0;
            this.f35868i = 0;
            this.f35860a.m16103L(0);
            this.f35862c = false;
        }
    }

    public C13927a() {
        super("PgsDecoder");
        this.f35856o = new C9208y();
        this.f35857p = new C9208y();
        this.f35858q = new C13928a();
    }

    /* renamed from: B */
    private void m1163B(C9208y c9208y) {
        if (c9208y.m16097a() > 0 && c9208y.m16090h() == 120) {
            if (this.f35859r == null) {
                this.f35859r = new Inflater();
            }
            if (C9191p0.m16234n0(c9208y, this.f35857p, this.f35859r)) {
                c9208y.m16101N(this.f35857p.m16094d(), this.f35857p.m16092f());
            }
        }
    }

    /* renamed from: C */
    private static C13127b m1162C(C9208y c9208y, C13928a c13928a) {
        int m16092f = c9208y.m16092f();
        int m16111D = c9208y.m16111D();
        int m16105J = c9208y.m16105J();
        int m16093e = c9208y.m16093e() + m16105J;
        C13127b c13127b = null;
        if (m16093e > m16092f) {
            c9208y.m16099P(m16092f);
            return null;
        }
        if (m16111D != 128) {
            switch (m16111D) {
                case 20:
                    c13928a.m1154g(c9208y, m16105J);
                    break;
                case 21:
                    c13928a.m1156e(c9208y, m16105J);
                    break;
                case 22:
                    c13928a.m1155f(c9208y, m16105J);
                    break;
            }
        } else {
            c13127b = c13928a.m1157d();
            c13928a.m1153h();
        }
        c9208y.m16099P(m16093e);
        return c13127b;
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        this.f35856o.m16101N(bArr, i);
        m1163B(this.f35856o);
        this.f35858q.m1153h();
        ArrayList arrayList = new ArrayList();
        while (this.f35856o.m16097a() >= 3) {
            C13127b m1162C = m1162C(this.f35856o, this.f35858q);
            if (m1162C != null) {
                arrayList.add(m1162C);
            }
        }
        return new C13929b(Collections.unmodifiableList(arrayList));
    }
}
