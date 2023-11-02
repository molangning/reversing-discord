package p468zg;

import bh.C2302e;
import bh.InterfaceC2300c;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p160ih.AbstractC7551m;
import p160ih.C7575w;
import p234mi.C10472a;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11947m;
import p305qg.InterfaceC11998y;
import p429xh.C13801c;
import p468zg.C14232i0;
import ph.C11638f;
import th.InterfaceC12759f;

/* renamed from: zg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14256t implements InterfaceC12759f {

    /* renamed from: a */
    public static final C14257a f36649a = new C14257a(null);

    /* renamed from: zg.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14257a {
        private C14257a() {
        }

        public /* synthetic */ C14257a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m301b(InterfaceC11998y interfaceC11998y) {
            InterfaceC11914e interfaceC11914e;
            Object m14033q0;
            if (interfaceC11998y.mo4301i().size() != 1) {
                return false;
            }
            InterfaceC11947m mo4163b = interfaceC11998y.mo4163b();
            InterfaceC11914e interfaceC11914e2 = null;
            if (mo4163b instanceof InterfaceC11914e) {
                interfaceC11914e = (InterfaceC11914e) mo4163b;
            } else {
                interfaceC11914e = null;
            }
            if (interfaceC11914e == null) {
                return false;
            }
            List<InterfaceC11936j1> mo4301i = interfaceC11998y.mo4301i();
            C9612q.m13918g(mo4301i, "f.valueParameters");
            m14033q0 = C9553r.m14033q0(mo4301i);
            InterfaceC11927h mo2788p = ((InterfaceC11936j1) m14033q0).getType().mo3564N0().mo2788p();
            if (mo2788p instanceof InterfaceC11914e) {
                interfaceC11914e2 = (InterfaceC11914e) mo2788p;
            }
            if (interfaceC11914e2 == null || !AbstractC10870h.m9793q0(interfaceC11914e) || !C9612q.m13922c(C13801c.m1503l(interfaceC11914e), C13801c.m1503l(interfaceC11914e2))) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final AbstractC7551m m300c(InterfaceC11998y interfaceC11998y, InterfaceC11936j1 interfaceC11936j1) {
            if (!C7575w.m20383e(interfaceC11998y) && !m301b(interfaceC11998y)) {
                AbstractC7264g0 type = interfaceC11936j1.getType();
                C9612q.m13918g(type, "valueParameterDescriptor.type");
                return C7575w.m20381g(type);
            }
            AbstractC7264g0 type2 = interfaceC11936j1.getType();
            C9612q.m13918g(type2, "valueParameterDescriptor.type");
            return C7575w.m20381g(C10472a.m11437u(type2));
        }

        /* renamed from: a */
        public final boolean m302a(InterfaceC11897a superDescriptor, InterfaceC11897a subDescriptor) {
            List<Pair> m14067J0;
            C9612q.m13917h(superDescriptor, "superDescriptor");
            C9612q.m13917h(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof C2302e) && (superDescriptor instanceof InterfaceC11998y)) {
                C2302e c2302e = (C2302e) subDescriptor;
                c2302e.mo4301i().size();
                InterfaceC11998y interfaceC11998y = (InterfaceC11998y) superDescriptor;
                interfaceC11998y.mo4301i().size();
                List<InterfaceC11936j1> mo4301i = c2302e.mo4221a().mo4301i();
                C9612q.m13918g(mo4301i, "subDescriptor.original.valueParameters");
                List<InterfaceC11936j1> mo4301i2 = interfaceC11998y.mo4221a().mo4301i();
                C9612q.m13918g(mo4301i2, "superDescriptor.original.valueParameters");
                m14067J0 = C9553r.m14067J0(mo4301i, mo4301i2);
                for (Pair pair : m14067J0) {
                    InterfaceC11936j1 subParameter = (InterfaceC11936j1) pair.m14351a();
                    InterfaceC11936j1 superParameter = (InterfaceC11936j1) pair.m14350b();
                    C9612q.m13918g(subParameter, "subParameter");
                    boolean z = m300c((InterfaceC11998y) subDescriptor, subParameter) instanceof AbstractC7551m.C7555d;
                    C9612q.m13918g(superParameter, "superParameter");
                    if (z != (m300c(interfaceC11998y, superParameter) instanceof AbstractC7551m.C7555d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m303c(InterfaceC11897a interfaceC11897a, InterfaceC11897a interfaceC11897a2, InterfaceC11914e interfaceC11914e) {
        InterfaceC11998y interfaceC11998y;
        boolean z;
        if ((interfaceC11897a instanceof InterfaceC11902b) && (interfaceC11897a2 instanceof InterfaceC11998y) && !AbstractC10870h.m9814f0(interfaceC11897a2)) {
            C14218f c14218f = C14218f.f36586n;
            InterfaceC11998y interfaceC11998y2 = (InterfaceC11998y) interfaceC11897a2;
            C11638f name = interfaceC11998y2.getName();
            C9612q.m13918g(name, "subDescriptor.name");
            if (!c14218f.m403l(name)) {
                C14232i0.C14233a c14233a = C14232i0.f36605a;
                C11638f name2 = interfaceC11998y2.getName();
                C9612q.m13918g(name2, "subDescriptor.name");
                if (!c14233a.m348k(name2)) {
                    return false;
                }
            }
            InterfaceC11902b m377e = C14226h0.m377e((InterfaceC11902b) interfaceC11897a);
            boolean z2 = interfaceC11897a instanceof InterfaceC11998y;
            if (z2) {
                interfaceC11998y = (InterfaceC11998y) interfaceC11897a;
            } else {
                interfaceC11998y = null;
            }
            if (interfaceC11998y != null && interfaceC11998y2.mo4337C0() == interfaceC11998y.mo4337C0()) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && (m377e == null || !interfaceC11998y2.mo4337C0())) {
                return true;
            }
            if ((interfaceC11914e instanceof InterfaceC2300c) && interfaceC11998y2.mo4297s0() == null && m377e != null && !C14226h0.m376f(interfaceC11914e, m377e)) {
                if ((m377e instanceof InterfaceC11998y) && z2 && C14218f.m404k((InterfaceC11998y) m377e) != null) {
                    String m20385c = C7575w.m20385c(interfaceC11998y2, false, false, 2, null);
                    InterfaceC11998y mo4221a = ((InterfaceC11998y) interfaceC11897a).mo4221a();
                    C9612q.m13918g(mo4221a, "superDescriptor.original");
                    if (C9612q.m13922c(m20385c, C7575w.m20385c(mo4221a, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // th.InterfaceC12759f
    /* renamed from: a */
    public InterfaceC12759f.EnumC12760a mo305a() {
        return InterfaceC12759f.EnumC12760a.CONFLICTS_ONLY;
    }

    @Override // th.InterfaceC12759f
    /* renamed from: b */
    public InterfaceC12759f.EnumC12761b mo304b(InterfaceC11897a superDescriptor, InterfaceC11897a subDescriptor, InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(superDescriptor, "superDescriptor");
        C9612q.m13917h(subDescriptor, "subDescriptor");
        if (m303c(superDescriptor, subDescriptor, interfaceC11914e)) {
            return InterfaceC12759f.EnumC12761b.INCOMPATIBLE;
        }
        if (f36649a.m302a(superDescriptor, subDescriptor)) {
            return InterfaceC12759f.EnumC12761b.INCOMPATIBLE;
        }
        return InterfaceC12759f.EnumC12761b.UNKNOWN;
    }
}