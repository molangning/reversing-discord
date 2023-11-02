package p183ji;

import ai.InterfaceC0194h;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7297n1;
import p142hi.C7307p1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11914e;
import tg.C12702h;

/* renamed from: ji.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C8956a extends C12702h {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C8956a(ph.C11638f r21) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r0 = "name"
            r2 = r21
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            ji.k r10 = p183ji.C8967k.f23554a
            qg.h0 r1 = r10.m16940i()
            qg.e0 r3 = p305qg.EnumC11915e0.OPEN
            qg.f r4 = p305qg.EnumC11918f.CLASS
            java.util.List r5 = kotlin.collections.C9543h.m14145i()
            qg.a1 r11 = p305qg.InterfaceC11900a1.f30901a
            r7 = 0
            gi.n r8 = gi.C6795f.f19003e
            r0 = r20
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            rg.g$a r0 = p325rg.InterfaceC12155g.f31603f
            rg.g r0 = r0.m6037b()
            r1 = 1
            tg.f r0 = tg.C12698f.m4443n1(r9, r0, r1, r11)
            java.util.List r2 = kotlin.collections.C9543h.m14145i()
            qg.u r3 = p305qg.C11974t.f30969d
            r0.m4440q1(r2, r3)
            java.lang.String r2 = "create(this, Annotations…          )\n            }"
            kotlin.jvm.internal.C9612q.m13918g(r0, r2)
            ji.g r2 = p183ji.EnumC8963g.SCOPE_FOR_ERROR_CLASS
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]
            ph.f r4 = r0.getName()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "errorConstructor.name.toString()"
            kotlin.jvm.internal.C9612q.m13918g(r4, r5)
            r5 = 0
            r3[r5] = r4
            java.lang.String r4 = ""
            r3[r1] = r4
            ji.f r1 = p183ji.C8967k.m16947b(r2, r3)
            ji.h r2 = new ji.h
            ji.j r14 = p183ji.EnumC8966j.ERROR_CLASS
            java.lang.String[] r3 = new java.lang.String[r5]
            ji.i r12 = r10.m16944e(r14, r3)
            r15 = 0
            r16 = 0
            java.lang.String[] r3 = new java.lang.String[r5]
            r18 = 24
            r19 = 0
            r11 = r2
            r13 = r1
            r17 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0.m4303g1(r2)
            java.util.Set r2 = kotlin.collections.C9558u.m14020c(r0)
            r9.m4429K0(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p183ji.C8956a.<init>(ph.f):void");
    }

    @Override // tg.AbstractC12674a, p305qg.InterfaceC11909c1
    /* renamed from: G0 */
    public InterfaceC11914e mo4225c(C7307p1 substitutor) {
        C9612q.m13917h(substitutor, "substitutor");
        return this;
    }

    @Override // tg.AbstractC12674a, tg.AbstractC12739t
    /* renamed from: g0 */
    public InterfaceC0194h mo4220g0(AbstractC7297n1 typeSubstitution, AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(typeSubstitution, "typeSubstitution");
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        EnumC8963g enumC8963g = EnumC8963g.SCOPE_FOR_ERROR_CLASS;
        String c11638f = getName().toString();
        C9612q.m13918g(c11638f, "name.toString()");
        return C8967k.m16947b(enumC8963g, c11638f, typeSubstitution.toString());
    }

    @Override // tg.C12702h
    public String toString() {
        String m7426b = getName().m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        return m7426b;
    }
}
