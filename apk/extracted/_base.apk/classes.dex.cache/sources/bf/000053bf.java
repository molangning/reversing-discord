package p468zg;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p304qf.C11888u;
import p304qf.C11889v;
import pf.C11591x;
import ph.C11633c;
import ph.C11634d;
import ph.C11638f;

/* renamed from: zg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14222g {

    /* renamed from: a */
    public static final C14222g f36589a = new C14222g();

    /* renamed from: b */
    private static final Map<C11633c, C11638f> f36590b;

    /* renamed from: c */
    private static final Map<C11638f, List<C11638f>> f36591c;

    /* renamed from: d */
    private static final Set<C11633c> f36592d;

    /* renamed from: e */
    private static final Set<C11638f> f36593e;

    static {
        C11633c m382d;
        C11633c m382d2;
        C11633c m383c;
        C11633c m383c2;
        C11633c m382d3;
        C11633c m383c3;
        C11633c m383c4;
        C11633c m383c5;
        Map<C11633c, C11638f> m6751k;
        int m14093t;
        int m6758d;
        int m14093t2;
        Set<C11638f> m14071G0;
        List m14063M;
        C11634d c11634d = C10884k.C10885a.f28506s;
        m382d = C14225h.m382d(c11634d, ZeroconfModule.KEY_SERVICE_NAME);
        m382d2 = C14225h.m382d(c11634d, "ordinal");
        m383c = C14225h.m383c(C10884k.C10885a.f28464U, "size");
        C11633c c11633c = C10884k.C10885a.f28468Y;
        m383c2 = C14225h.m383c(c11633c, "size");
        m382d3 = C14225h.m382d(C10884k.C10885a.f28482g, "length");
        m383c3 = C14225h.m383c(c11633c, "keys");
        m383c4 = C14225h.m383c(c11633c, "values");
        m383c5 = C14225h.m383c(c11633c, "entries");
        m6751k = C11889v.m6751k(C11591x.m7577a(m382d, C11638f.m7422f(ZeroconfModule.KEY_SERVICE_NAME)), C11591x.m7577a(m382d2, C11638f.m7422f("ordinal")), C11591x.m7577a(m383c, C11638f.m7422f("size")), C11591x.m7577a(m383c2, C11638f.m7422f("size")), C11591x.m7577a(m382d3, C11638f.m7422f("length")), C11591x.m7577a(m383c3, C11638f.m7422f("keySet")), C11591x.m7577a(m383c4, C11638f.m7422f("values")), C11591x.m7577a(m383c5, C11638f.m7422f("entrySet")));
        f36590b = m6751k;
        Set<Map.Entry<C11633c, C11638f>> entrySet = m6751k.entrySet();
        m14093t = C9546k.m14093t(entrySet, 10);
        ArrayList<Pair> arrayList = new ArrayList(m14093t);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new Pair(((C11633c) entry.getKey()).m7453g(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair : arrayList) {
            C11638f c11638f = (C11638f) pair.m14348d();
            Object obj = linkedHashMap.get(c11638f);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c11638f, obj);
            }
            ((List) obj).add((C11638f) pair.m14349c());
        }
        m6758d = C11888u.m6758d(linkedHashMap.size());
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(m6758d);
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            m14063M = C9553r.m14063M((Iterable) entry2.getValue());
            linkedHashMap2.put(key, m14063M);
        }
        f36591c = linkedHashMap2;
        Set<C11633c> keySet = f36590b.keySet();
        f36592d = keySet;
        m14093t2 = C9546k.m14093t(keySet, 10);
        ArrayList arrayList2 = new ArrayList(m14093t2);
        for (C11633c c11633c2 : keySet) {
            arrayList2.add(c11633c2.m7453g());
        }
        m14071G0 = C9553r.m14071G0(arrayList2);
        f36593e = m14071G0;
    }

    private C14222g() {
    }

    /* renamed from: a */
    public final Map<C11633c, C11638f> m393a() {
        return f36590b;
    }

    /* renamed from: b */
    public final List<C11638f> m392b(C11638f name1) {
        List<C11638f> m14104i;
        C9612q.m13917h(name1, "name1");
        List<C11638f> list = f36591c.get(name1);
        if (list == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return list;
    }

    /* renamed from: c */
    public final Set<C11633c> m391c() {
        return f36592d;
    }

    /* renamed from: d */
    public final Set<C11638f> m390d() {
        return f36593e;
    }
}