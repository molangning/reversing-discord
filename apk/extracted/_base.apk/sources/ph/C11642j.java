package ph;

import gg.C6759j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import p304qf.C11888u;
import pf.C11591x;

/* renamed from: ph.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C11642j {

    /* renamed from: a */
    private static final C11633c f30314a;

    /* renamed from: b */
    private static final C11633c f30315b;

    static {
        C11633c c11633c = new C11633c("java.lang");
        f30314a = c11633c;
        C11633c m7457c = c11633c.m7457c(C11638f.m7422f("annotation"));
        C9612q.m13918g(m7457c, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f30315b = m7457c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final C11632b m7391k(String str) {
        return new C11632b(C11641i.f30262a.m7414b(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final C11632b m7390l(String str) {
        return new C11632b(C11641i.f30262a.m7410f(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final C11632b m7389m(String str) {
        return new C11632b(C11641i.f30262a.m7413c(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final C11632b m7388n(String str) {
        return new C11632b(C11641i.f30262a.m7412d(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final C11632b m7387o(String str) {
        return new C11632b(C11641i.f30262a.m7411e(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    public static final <K, V> Map<V, K> m7386p(Map<K, ? extends V> map) {
        int m14093t;
        int m6758d;
        int m21930c;
        Set<Map.Entry<K, ? extends V>> entrySet = map.entrySet();
        m14093t = C9546k.m14093t(entrySet, 10);
        m6758d = C11888u.m6758d(m14093t);
        m21930c = C6759j.m21930c(m6758d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair m7577a = C11591x.m7577a(entry.getValue(), entry.getKey());
            linkedHashMap.put(m7577a.m14349c(), m7577a.m14348d());
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final C11632b m7385q(C11638f c11638f) {
        C11641i c11641i = C11641i.f30262a;
        C11633c m7465h = c11641i.m7415a().m7465h();
        return new C11632b(m7465h, C11638f.m7422f(c11638f.m7424d() + c11641i.m7415a().m7463j().m7424d()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final C11632b m7384r(String str) {
        return new C11632b(C11641i.f30262a.m7409g(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final C11632b m7383s(String str) {
        return new C11632b(C11641i.f30262a.m7408h(), C11638f.m7422f(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final C11632b m7382t(C11632b c11632b) {
        C11633c m7410f = C11641i.f30262a.m7410f();
        return new C11632b(m7410f, C11638f.m7422f('U' + c11632b.m7463j().m7424d()));
    }
}
