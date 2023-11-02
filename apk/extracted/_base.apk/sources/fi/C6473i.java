package fi;

import ai.C0185d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9550o;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import p428xg.C13798a;
import p448yg.EnumC14023d;
import p448yg.InterfaceC14020b;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import sg.InterfaceC12473b;

/* renamed from: fi.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6473i extends AbstractC6451h {

    /* renamed from: g */
    private final InterfaceC11945l0 f18169g;

    /* renamed from: h */
    private final String f18170h;

    /* renamed from: i */
    private final C11633c f18171i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6473i(p305qg.InterfaceC11945l0 r17, kh.C9419l r18, mh.InterfaceC10463c r19, mh.AbstractC10456a r20, fi.InterfaceC6449f r21, p070di.C5939k r22, java.lang.String r23, kotlin.jvm.functions.Function0<? extends java.util.Collection<ph.C11638f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            kotlin.jvm.internal.C9612q.m13917h(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            kotlin.jvm.internal.C9612q.m13917h(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            java.lang.String r0 = "debugName"
            kotlin.jvm.internal.C9612q.m13917h(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            mh.g r10 = new mh.g
            kh.t r0 = r18.m15245W()
            java.lang.String r7 = "proto.typeTable"
            kotlin.jvm.internal.C9612q.m13918g(r0, r7)
            r10.<init>(r0)
            mh.h$a r0 = mh.C10469h.f27350b
            kh.w r7 = r18.m15244X()
            java.lang.String r8 = "proto.versionRequirementTable"
            kotlin.jvm.internal.C9612q.m13918g(r7, r8)
            mh.h r11 = r0.m11461a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            di.m r2 = r7.m24131a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.m15252P()
            java.lang.String r0 = "proto.functionList"
            kotlin.jvm.internal.C9612q.m13918g(r3, r0)
            java.util.List r4 = r18.m15249S()
            java.lang.String r0 = "proto.propertyList"
            kotlin.jvm.internal.C9612q.m13918g(r4, r0)
            java.util.List r7 = r18.m15246V()
            java.lang.String r0 = "proto.typeAliasList"
            kotlin.jvm.internal.C9612q.m13918g(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f18169g = r14
            r6.f18170h = r15
            ph.c r0 = r17.mo4161e()
            r6.f18171i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C6473i.<init>(qg.l0, kh.l, mh.c, mh.a, fi.f, di.k, java.lang.String, kotlin.jvm.functions.Function0):void");
    }

    @Override // fi.AbstractC6451h, ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: g */
    public InterfaceC11927h mo16932g(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        m22656z(name, location);
        return super.mo16932g(name, location);
    }

    @Override // fi.AbstractC6451h
    /* renamed from: i */
    protected void mo22663i(Collection<InterfaceC11947m> result, Function1<? super C11638f, Boolean> nameFilter) {
        C9612q.m13917h(result, "result");
        C9612q.m13917h(nameFilter, "nameFilter");
    }

    @Override // fi.AbstractC6451h
    /* renamed from: m */
    protected C11632b mo22662m(C11638f name) {
        C9612q.m13917h(name, "name");
        return new C11632b(this.f18171i, name);
    }

    @Override // fi.AbstractC6451h
    /* renamed from: s */
    protected Set<C11638f> mo22661s() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    @Override // fi.AbstractC6451h
    /* renamed from: t */
    protected Set<C11638f> mo22660t() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    public String toString() {
        return this.f18170h;
    }

    @Override // fi.AbstractC6451h
    /* renamed from: u */
    protected Set<C11638f> mo22659u() {
        Set<C11638f> m14007d;
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fi.AbstractC6451h
    /* renamed from: w */
    public boolean mo22658w(C11638f name) {
        boolean z;
        C9612q.m13917h(name, "name");
        if (super.mo22658w(name)) {
            return true;
        }
        Iterable<InterfaceC12473b> m24121k = m22724p().m24101c().m24121k();
        if (!(m24121k instanceof Collection) || !((Collection) m24121k).isEmpty()) {
            for (InterfaceC12473b interfaceC12473b : m24121k) {
                if (interfaceC12473b.mo5199b(this.f18171i, name)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    @Override // ai.AbstractC0198i, ai.InterfaceC0200k
    /* renamed from: y */
    public List<InterfaceC11947m> mo4358e(C0185d kindFilter, Function1<? super C11638f, Boolean> nameFilter) {
        List<InterfaceC11947m> m14036n0;
        C9612q.m13917h(kindFilter, "kindFilter");
        C9612q.m13917h(nameFilter, "nameFilter");
        Collection<InterfaceC11947m> m22729j = m22729j(kindFilter, nameFilter, EnumC14023d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<InterfaceC12473b> m24121k = m22724p().m24101c().m24121k();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC12473b interfaceC12473b : m24121k) {
            C9550o.m14085y(arrayList, interfaceC12473b.mo5198c(this.f18171i));
        }
        m14036n0 = C9553r.m14036n0(m22729j, arrayList);
        return m14036n0;
    }

    /* renamed from: z */
    public void m22656z(C11638f name, InterfaceC14020b location) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(location, "location");
        C13798a.m1517b(m22724p().m24101c().m24117o(), location, this.f18169g, name);
    }
}
