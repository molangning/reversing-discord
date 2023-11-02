package p445yc;

import lc.C10120b;
import p136hc.C7064j;
import p136hc.C7069o;

/* renamed from: yc.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13974c {

    /* renamed from: a */
    private final C10120b f35952a;

    /* renamed from: b */
    private final C7069o f35953b;

    /* renamed from: c */
    private final C7069o f35954c;

    /* renamed from: d */
    private final C7069o f35955d;

    /* renamed from: e */
    private final C7069o f35956e;

    /* renamed from: f */
    private final int f35957f;

    /* renamed from: g */
    private final int f35958g;

    /* renamed from: h */
    private final int f35959h;

    /* renamed from: i */
    private final int f35960i;

    public C13974c(C10120b c10120b, C7069o c7069o, C7069o c7069o2, C7069o c7069o3, C7069o c7069o4) {
        boolean z = false;
        boolean z2 = c7069o == null || c7069o2 == null;
        z = (c7069o3 == null || c7069o4 == null) ? true : z;
        if (z2 && z) {
            throw C7064j.m21461a();
        }
        if (z2) {
            c7069o = new C7069o(0.0f, c7069o3.m21454d());
            c7069o2 = new C7069o(0.0f, c7069o4.m21454d());
        } else if (z) {
            c7069o3 = new C7069o(c10120b.m12246m() - 1, c7069o.m21454d());
            c7069o4 = new C7069o(c10120b.m12246m() - 1, c7069o2.m21454d());
        }
        this.f35952a = c10120b;
        this.f35953b = c7069o;
        this.f35954c = c7069o2;
        this.f35955d = c7069o3;
        this.f35956e = c7069o4;
        this.f35957f = (int) Math.min(c7069o.m21455c(), c7069o2.m21455c());
        this.f35958g = (int) Math.max(c7069o3.m21455c(), c7069o4.m21455c());
        this.f35959h = (int) Math.min(c7069o.m21454d(), c7069o3.m21454d());
        this.f35960i = (int) Math.max(c7069o2.m21454d(), c7069o4.m21454d());
    }

    /* renamed from: j */
    public static C13974c m1035j(C13974c c13974c, C13974c c13974c2) {
        return c13974c == null ? c13974c2 : c13974c2 == null ? c13974c : new C13974c(c13974c.f35952a, c13974c.f35953b, c13974c.f35954c, c13974c2.f35955d, c13974c2.f35956e);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p445yc.C13974c m1044a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            hc.o r0 = r12.f35953b
            hc.o r1 = r12.f35954c
            hc.o r2 = r12.f35955d
            hc.o r3 = r12.f35956e
            if (r13 <= 0) goto L29
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.m21454d()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            hc.o r13 = new hc.o
            float r4 = r4.m21455c()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L26
            r8 = r13
            goto L2a
        L26:
            r10 = r13
            r8 = r0
            goto L2b
        L29:
            r8 = r0
        L2a:
            r10 = r2
        L2b:
            if (r14 <= 0) goto L5b
            if (r15 == 0) goto L32
            hc.o r13 = r12.f35954c
            goto L34
        L32:
            hc.o r13 = r12.f35956e
        L34:
            float r0 = r13.m21454d()
            int r0 = (int) r0
            int r0 = r0 + r14
            lc.b r14 = r12.f35952a
            int r14 = r14.m12249j()
            if (r0 < r14) goto L4a
            lc.b r14 = r12.f35952a
            int r14 = r14.m12249j()
            int r0 = r14 + (-1)
        L4a:
            hc.o r14 = new hc.o
            float r13 = r13.m21455c()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L58
            r9 = r14
            goto L5c
        L58:
            r11 = r14
            r9 = r1
            goto L5d
        L5b:
            r9 = r1
        L5c:
            r11 = r3
        L5d:
            yc.c r13 = new yc.c
            lc.b r7 = r12.f35952a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p445yc.C13974c.m1044a(int, int, boolean):yc.c");
    }

    /* renamed from: b */
    public C7069o m1043b() {
        return this.f35954c;
    }

    /* renamed from: c */
    public C7069o m1042c() {
        return this.f35956e;
    }

    /* renamed from: d */
    public int m1041d() {
        return this.f35958g;
    }

    /* renamed from: e */
    public int m1040e() {
        return this.f35960i;
    }

    /* renamed from: f */
    public int m1039f() {
        return this.f35957f;
    }

    /* renamed from: g */
    public int m1038g() {
        return this.f35959h;
    }

    /* renamed from: h */
    public C7069o m1037h() {
        return this.f35953b;
    }

    /* renamed from: i */
    public C7069o m1036i() {
        return this.f35955d;
    }

    public C13974c(C13974c c13974c) {
        this.f35952a = c13974c.f35952a;
        this.f35953b = c13974c.m1037h();
        this.f35954c = c13974c.m1043b();
        this.f35955d = c13974c.m1036i();
        this.f35956e = c13974c.m1042c();
        this.f35957f = c13974c.m1039f();
        this.f35958g = c13974c.m1041d();
        this.f35959h = c13974c.m1038g();
        this.f35960i = c13974c.m1040e();
    }
}