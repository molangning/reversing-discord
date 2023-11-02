package p160ih;

import fi.EnumC6448e;
import fi.InterfaceC6449f;
import kh.C9419l;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9654p;
import mh.C10466e;
import mh.InterfaceC10463c;
import p070di.C5954t;
import p250nh.C10890a;
import p270oh.C11115e;
import p305qg.InterfaceC11905b1;
import p326rh.AbstractC12188i;
import p449yh.C14027d;
import ph.C11632b;
import ph.C11638f;

/* renamed from: ih.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7550l implements InterfaceC6449f {

    /* renamed from: b */
    private final C14027d f20844b;

    /* renamed from: c */
    private final C14027d f20845c;

    /* renamed from: d */
    private final C5954t<C11115e> f20846d;

    /* renamed from: e */
    private final boolean f20847e;

    /* renamed from: f */
    private final EnumC6448e f20848f;

    /* renamed from: g */
    private final InterfaceC7564r f20849g;

    /* renamed from: h */
    private final String f20850h;

    public C7550l(C14027d className, C14027d c14027d, C9419l packageProto, InterfaceC10463c nameResolver, C5954t<C11115e> c5954t, boolean z, EnumC6448e abiStability, InterfaceC7564r interfaceC7564r) {
        C9612q.m13917h(className, "className");
        C9612q.m13917h(packageProto, "packageProto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(abiStability, "abiStability");
        this.f20844b = className;
        this.f20845c = c14027d;
        this.f20846d = c5954t;
        this.f20847e = z;
        this.f20848f = abiStability;
        this.f20849g = interfaceC7564r;
        AbstractC12188i.C12195f<C9419l, Integer> packageModuleName = C10890a.f28557m;
        C9612q.m13918g(packageModuleName, "packageModuleName");
        Integer num = (Integer) C10466e.m11485a(packageProto, packageModuleName);
        this.f20850h = (num == null || (r2 = nameResolver.getString(num.intValue())) == null) ? "main" : "main";
    }

    @Override // fi.InterfaceC6449f
    /* renamed from: a */
    public String mo20396a() {
        return "Class '" + m20440d().m7471b().m7458b() + '\'';
    }

    @Override // p305qg.InterfaceC11900a1
    /* renamed from: b */
    public InterfaceC11905b1 mo2835b() {
        InterfaceC11905b1 NO_SOURCE_FILE = InterfaceC11905b1.f30908a;
        C9612q.m13918g(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    /* renamed from: d */
    public final C11632b m20440d() {
        return new C11632b(m20439e().m881g(), m20436h());
    }

    /* renamed from: e */
    public C14027d m20439e() {
        return this.f20844b;
    }

    /* renamed from: f */
    public C14027d m20438f() {
        return this.f20845c;
    }

    /* renamed from: g */
    public final InterfaceC7564r m20437g() {
        return this.f20849g;
    }

    /* renamed from: h */
    public final C11638f m20436h() {
        String m13730M0;
        String m882f = m20439e().m882f();
        C9612q.m13918g(m882f, "className.internalName");
        m13730M0 = C9654p.m13730M0(m882f, '/', null, 2, null);
        C11638f m7422f = C11638f.m7422f(m13730M0);
        C9612q.m13918g(m7422f, "identifier(className.int….substringAfterLast('/'))");
        return m7422f;
    }

    public String toString() {
        return C7550l.class.getSimpleName() + ": " + m20439e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7550l(p160ih.InterfaceC7564r r11, kh.C9419l r12, mh.InterfaceC10463c r13, p070di.C5954t<p270oh.C11115e> r14, boolean r15, fi.EnumC6448e r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            r9 = r11
            kotlin.jvm.internal.C9612q.m13917h(r11, r0)
            java.lang.String r0 = "packageProto"
            r4 = r12
            kotlin.jvm.internal.C9612q.m13917h(r12, r0)
            java.lang.String r0 = "nameResolver"
            r5 = r13
            kotlin.jvm.internal.C9612q.m13917h(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.C9612q.m13917h(r8, r0)
            ph.b r0 = r11.mo2851n()
            yh.d r2 = p449yh.C14027d.m886b(r0)
            java.lang.String r0 = "byClassId(kotlinClass.classId)"
            kotlin.jvm.internal.C9612q.m13918g(r2, r0)
            jh.a r0 = r11.mo2854c()
            java.lang.String r0 = r0.m17011e()
            r1 = 0
            if (r0 == 0) goto L40
            int r3 = r0.length()
            if (r3 <= 0) goto L39
            r3 = 1
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L40
            yh.d r1 = p449yh.C14027d.m884d(r0)
        L40:
            r3 = r1
            r1 = r10
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p160ih.C7550l.<init>(ih.r, kh.l, mh.c, di.t, boolean, fi.e):void");
    }
}
