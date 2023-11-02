package ng;

import gi.C6795f;
import gi.InterfaceC6821n;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.C7226c1;
import p142hi.C7267h0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p142hi.InterfaceC7288k1;
import p183ji.C8967k;
import p234mi.C10472a;
import p305qg.C11974t;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import p305qg.InterfaceC11900a1;
import p305qg.InterfaceC11920f1;
import p325rg.InterfaceC12155g;
import ph.C11638f;
import tg.C12711k0;
import tg.C12717m;
import tg.C12747y;

/* renamed from: ng.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10886l {

    /* renamed from: a */
    private static final C12747y f28522a;

    static {
        List<InterfaceC11920f1> m14109d;
        C12717m c12717m = new C12717m(C8967k.f23554a.m16940i(), C10884k.f28420m);
        EnumC11918f enumC11918f = EnumC11918f.INTERFACE;
        C11638f m7453g = C10884k.f28423p.m7453g();
        InterfaceC11900a1 interfaceC11900a1 = InterfaceC11900a1.f30901a;
        InterfaceC6821n interfaceC6821n = C6795f.f19003e;
        C12747y c12747y = new C12747y(c12717m, enumC11918f, false, false, m7453g, interfaceC11900a1, interfaceC6821n);
        c12747y.m4182M0(EnumC11915e0.ABSTRACT);
        c12747y.m4180O0(C11974t.f30970e);
        m14109d = C9544i.m14109d(C12711k0.m4399R0(c12747y, InterfaceC12155g.f31603f.m6037b(), false, EnumC7336w1.IN_VARIANCE, C11638f.m7422f("T"), 0, interfaceC6821n));
        c12747y.m4181N0(m14109d);
        c12747y.m4184K0();
        f28522a = c12747y;
    }

    /* renamed from: a */
    public static final AbstractC7302o0 m9745a(AbstractC7264g0 suspendFunType) {
        int m14093t;
        List m14109d;
        List m14035o0;
        AbstractC7302o0 m9873b;
        C9612q.m13917h(suspendFunType, "suspendFunType");
        C10869g.m9858q(suspendFunType);
        AbstractC10870h m11449i = C10472a.m11449i(suspendFunType);
        InterfaceC12155g annotations = suspendFunType.getAnnotations();
        AbstractC7264g0 m9865j = C10869g.m9865j(suspendFunType);
        List<AbstractC7264g0> m9870e = C10869g.m9870e(suspendFunType);
        List<InterfaceC7288k1> m9863l = C10869g.m9863l(suspendFunType);
        m14093t = C9546k.m14093t(m9863l, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7288k1 interfaceC7288k1 : m9863l) {
            arrayList.add(interfaceC7288k1.getType());
        }
        C7226c1 m21197h = C7226c1.f19622k.m21197h();
        InterfaceC7265g1 mo4173k = f28522a.mo4173k();
        C9612q.m13918g(mo4173k, "FAKE_CONTINUATION_CLASS_DESCRIPTOR.typeConstructor");
        m14109d = C9544i.m14109d(C10472a.m11457a(C10869g.m9864k(suspendFunType)));
        m14035o0 = C9553r.m14035o0(arrayList, C7267h0.m21098j(m21197h, mo4173k, m14109d, false, null, 16, null));
        AbstractC7302o0 m9842I = C10472a.m11449i(suspendFunType).m9842I();
        C9612q.m13918g(m9842I, "suspendFunType.builtIns.nullableAnyType");
        m9873b = C10869g.m9873b(m11449i, annotations, m9865j, m9870e, m14035o0, null, m9842I, (r17 & 128) != 0 ? false : false);
        return m9873b.mo3558U0(suspendFunType.mo3563O0());
    }
}
