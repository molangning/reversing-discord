package bh;

import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p069dh.C5900l;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11936j1;
import p325rg.InterfaceC12155g;
import p429xh.C13801c;
import ph.C11638f;
import tg.C12713l0;

/* renamed from: bh.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2308h {
    /* renamed from: a */
    public static final List<InterfaceC11936j1> m33665a(Collection<? extends AbstractC7264g0> newValueParameterTypes, Collection<? extends InterfaceC11936j1> oldValueParameters, InterfaceC11897a newOwner) {
        List<Pair> m14067J0;
        int m14093t;
        AbstractC7264g0 abstractC7264g0;
        C9612q.m13917h(newValueParameterTypes, "newValueParameterTypes");
        C9612q.m13917h(oldValueParameters, "oldValueParameters");
        C9612q.m13917h(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        m14067J0 = C9553r.m14067J0(newValueParameterTypes, oldValueParameters);
        m14093t = C9546k.m14093t(m14067J0, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (Pair pair : m14067J0) {
            AbstractC7264g0 abstractC7264g02 = (AbstractC7264g0) pair.m14351a();
            InterfaceC11936j1 interfaceC11936j1 = (InterfaceC11936j1) pair.m14350b();
            int index = interfaceC11936j1.getIndex();
            InterfaceC12155g annotations = interfaceC11936j1.getAnnotations();
            C11638f name = interfaceC11936j1.getName();
            C9612q.m13918g(name, "oldParameter.name");
            boolean mo4379A0 = interfaceC11936j1.mo4379A0();
            boolean mo4374q0 = interfaceC11936j1.mo4374q0();
            boolean mo4375o0 = interfaceC11936j1.mo4375o0();
            if (interfaceC11936j1.mo4373v0() != null) {
                abstractC7264g0 = C13801c.m1499p(newOwner).mo4194n().m9806k(abstractC7264g02);
            } else {
                abstractC7264g0 = null;
            }
            InterfaceC11900a1 mo4160j = interfaceC11936j1.mo4160j();
            C9612q.m13918g(mo4160j, "oldParameter.source");
            arrayList.add(new C12713l0(newOwner, null, index, annotations, name, abstractC7264g02, mo4379A0, mo4374q0, mo4375o0, abstractC7264g0, mo4160j));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final C5900l m33664b(InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(interfaceC11914e, "<this>");
        InterfaceC11914e m1495t = C13801c.m1495t(interfaceC11914e);
        C5900l c5900l = null;
        if (m1495t == null) {
            return null;
        }
        InterfaceC0194h mo4170l0 = m1495t.mo4170l0();
        if (mo4170l0 instanceof C5900l) {
            c5900l = (C5900l) mo4170l0;
        }
        if (c5900l == null) {
            return m33664b(m1495t);
        }
        return c5900l;
    }
}