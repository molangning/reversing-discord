package ng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p304qf.C11889v;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import pf.C11591x;
import ph.C11632b;
import ph.C11638f;

/* renamed from: ng.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10889o {

    /* renamed from: a */
    public static final C10889o f28538a = new C10889o();

    /* renamed from: b */
    private static final Set<C11638f> f28539b;

    /* renamed from: c */
    private static final Set<C11638f> f28540c;

    /* renamed from: d */
    private static final HashMap<C11632b, C11632b> f28541d;

    /* renamed from: e */
    private static final HashMap<C11632b, C11632b> f28542e;

    /* renamed from: f */
    private static final HashMap<EnumC10887m, C11638f> f28543f;

    /* renamed from: g */
    private static final Set<C11638f> f28544g;

    static {
        Set<C11638f> m14071G0;
        Set<C11638f> m14071G02;
        HashMap<EnumC10887m, C11638f> m6752j;
        EnumC10888n[] values;
        EnumC10888n[] values2 = EnumC10888n.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (EnumC10888n enumC10888n : values2) {
            arrayList.add(enumC10888n.m9739d());
        }
        m14071G0 = C9553r.m14071G0(arrayList);
        f28539b = m14071G0;
        EnumC10887m[] values3 = EnumC10887m.values();
        ArrayList arrayList2 = new ArrayList(values3.length);
        for (EnumC10887m enumC10887m : values3) {
            arrayList2.add(enumC10887m.m9743b());
        }
        m14071G02 = C9553r.m14071G0(arrayList2);
        f28540c = m14071G02;
        f28541d = new HashMap<>();
        f28542e = new HashMap<>();
        m6752j = C11889v.m6752j(C11591x.m7577a(EnumC10887m.f28523l, C11638f.m7422f("ubyteArrayOf")), C11591x.m7577a(EnumC10887m.f28524m, C11638f.m7422f("ushortArrayOf")), C11591x.m7577a(EnumC10887m.f28525n, C11638f.m7422f("uintArrayOf")), C11591x.m7577a(EnumC10887m.f28526o, C11638f.m7422f("ulongArrayOf")));
        f28543f = m6752j;
        EnumC10888n[] values4 = EnumC10888n.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC10888n enumC10888n2 : values4) {
            linkedHashSet.add(enumC10888n2.m9741b().m7463j());
        }
        f28544g = linkedHashSet;
        for (EnumC10888n enumC10888n3 : EnumC10888n.values()) {
            f28541d.put(enumC10888n3.m9741b(), enumC10888n3.m9740c());
            f28542e.put(enumC10888n3.m9740c(), enumC10888n3.m9741b());
        }
    }

    private C10889o() {
    }

    /* renamed from: d */
    public static final boolean m9735d(AbstractC7264g0 type) {
        InterfaceC11927h mo2788p;
        C9612q.m13917h(type, "type");
        if (C7320s1.m20972w(type) || (mo2788p = type.mo3564N0().mo2788p()) == null) {
            return false;
        }
        return f28538a.m9736c(mo2788p);
    }

    /* renamed from: a */
    public final C11632b m9738a(C11632b arrayClassId) {
        C9612q.m13917h(arrayClassId, "arrayClassId");
        return f28541d.get(arrayClassId);
    }

    /* renamed from: b */
    public final boolean m9737b(C11638f name) {
        C9612q.m13917h(name, "name");
        return f28544g.contains(name);
    }

    /* renamed from: c */
    public final boolean m9736c(InterfaceC11947m descriptor) {
        C9612q.m13917h(descriptor, "descriptor");
        InterfaceC11947m mo4163b = descriptor.mo4163b();
        if ((mo4163b instanceof InterfaceC11945l0) && C9612q.m13922c(((InterfaceC11945l0) mo4163b).mo4161e(), C10884k.f28428u) && f28539b.contains(descriptor.getName())) {
            return true;
        }
        return false;
    }
}
