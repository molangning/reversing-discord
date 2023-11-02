package ng;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import ph.C11632b;
import ph.C11633c;

/* renamed from: ng.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C10864c {

    /* renamed from: a */
    public static final C10864c f28357a = new C10864c();

    /* renamed from: b */
    private static final Set<C11632b> f28358b;

    static {
        int m14093t;
        List m14035o0;
        List m14035o02;
        List<C11633c> m14035o03;
        Set<EnumC10876i> set = EnumC10876i.f28377o;
        m14093t = C9546k.m14093t(set, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (EnumC10876i enumC10876i : set) {
            arrayList.add(C10884k.m9754c(enumC10876i));
        }
        C11633c m7437l = C10884k.C10885a.f28484h.m7437l();
        C9612q.m13918g(m7437l, "string.toSafe()");
        m14035o0 = C9553r.m14035o0(arrayList, m7437l);
        C11633c m7437l2 = C10884k.C10885a.f28488j.m7437l();
        C9612q.m13918g(m7437l2, "_boolean.toSafe()");
        m14035o02 = C9553r.m14035o0(m14035o0, m7437l2);
        C11633c m7437l3 = C10884k.C10885a.f28506s.m7437l();
        C9612q.m13918g(m7437l3, "_enum.toSafe()");
        m14035o03 = C9553r.m14035o0(m14035o02, m7437l3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C11633c c11633c : m14035o03) {
            linkedHashSet.add(C11632b.m7460m(c11633c));
        }
        f28358b = linkedHashSet;
    }

    private C10864c() {
    }

    /* renamed from: a */
    public final Set<C11632b> m9879a() {
        return f28358b;
    }

    /* renamed from: b */
    public final Set<C11632b> m9878b() {
        return f28358b;
    }
}
