package p269og;

import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.collections.C9560w;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import kotlin.text.C9654p;
import ng.InterfaceC10863b;
import ng.InterfaceC10868f;
import p269og.EnumC11102c;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;
import p305qg.InterfaceC11945l0;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;
import sg.InterfaceC12473b;

/* renamed from: og.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C11097a implements InterfaceC12473b {

    /* renamed from: a */
    private final InterfaceC6821n f29046a;

    /* renamed from: b */
    private final InterfaceC11928h0 f29047b;

    public C11097a(InterfaceC6821n storageManager, InterfaceC11928h0 module) {
        C9612q.m13917h(storageManager, "storageManager");
        C9612q.m13917h(module, "module");
        this.f29046a = storageManager;
        this.f29047b = module;
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: a */
    public InterfaceC11914e mo5200a(C11632b classId) {
        boolean m13731M;
        Object m14054V;
        Object m14056T;
        C9612q.m13917h(classId, "classId");
        if (classId.m7462k() || classId.m7461l()) {
            return null;
        }
        String m7458b = classId.m7464i().m7458b();
        C9612q.m13918g(m7458b, "classId.relativeClassName.asString()");
        m13731M = C9654p.m13731M(m7458b, "Function", false, 2, null);
        if (!m13731M) {
            return null;
        }
        C11633c m7465h = classId.m7465h();
        C9612q.m13918g(m7465h, "classId.packageFqName");
        EnumC11102c.C11103a.C11104a m9159c = EnumC11102c.f29060n.m9159c(m7458b, m7465h);
        if (m9159c == null) {
            return null;
        }
        EnumC11102c m9157a = m9159c.m9157a();
        int m9156b = m9159c.m9156b();
        List<InterfaceC11945l0> mo4238h0 = this.f29047b.mo4210H0(m7465h).mo4238h0();
        ArrayList arrayList = new ArrayList();
        for (Object obj : mo4238h0) {
            if (obj instanceof InterfaceC10863b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof InterfaceC10868f) {
                arrayList2.add(obj2);
            }
        }
        m14054V = C9553r.m14054V(arrayList2);
        InterfaceC11945l0 interfaceC11945l0 = (InterfaceC10868f) m14054V;
        if (interfaceC11945l0 == null) {
            m14056T = C9553r.m14056T(arrayList);
            interfaceC11945l0 = (InterfaceC10863b) m14056T;
        }
        return new C11098b(this.f29046a, interfaceC11945l0, m9157a, m9156b);
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: b */
    public boolean mo5199b(C11633c packageFqName, C11638f name) {
        boolean m13758H;
        boolean m13758H2;
        boolean m13758H3;
        boolean m13758H4;
        C9612q.m13917h(packageFqName, "packageFqName");
        C9612q.m13917h(name, "name");
        String m7426b = name.m7426b();
        C9612q.m13918g(m7426b, "name.asString()");
        m13758H = C9653o.m13758H(m7426b, "Function", false, 2, null);
        if (!m13758H) {
            m13758H2 = C9653o.m13758H(m7426b, "KFunction", false, 2, null);
            if (!m13758H2) {
                m13758H3 = C9653o.m13758H(m7426b, "SuspendFunction", false, 2, null);
                if (!m13758H3) {
                    m13758H4 = C9653o.m13758H(m7426b, "KSuspendFunction", false, 2, null);
                    if (!m13758H4) {
                        return false;
                    }
                }
            }
        }
        if (EnumC11102c.f29060n.m9159c(m7426b, packageFqName) == null) {
            return false;
        }
        return true;
    }

    @Override // sg.InterfaceC12473b
    /* renamed from: c */
    public Collection<InterfaceC11914e> mo5198c(C11633c packageFqName) {
        Set m14007d;
        C9612q.m13917h(packageFqName, "packageFqName");
        m14007d = C9560w.m14007d();
        return m14007d;
    }
}