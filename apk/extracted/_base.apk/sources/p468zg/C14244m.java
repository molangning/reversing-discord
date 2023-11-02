package p468zg;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import pf.C11591x;
import ph.C11632b;
import ph.C11633c;
import ph.C11641i;

/* renamed from: zg.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14244m {

    /* renamed from: a */
    public static final C14244m f36635a;

    /* renamed from: b */
    private static final Map<C11632b, C11632b> f36636b;

    /* renamed from: c */
    private static final Map<C11633c, C11633c> f36637c;

    static {
        Map<C11633c, C11633c> m6744r;
        C14244m c14244m = new C14244m();
        f36635a = c14244m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f36636b = linkedHashMap;
        C11641i c11641i = C11641i.f30262a;
        c14244m.m328c(c11641i.m7404l(), c14244m.m330a("java.util.ArrayList", "java.util.LinkedList"));
        c14244m.m328c(c11641i.m7402n(), c14244m.m330a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        c14244m.m328c(c11641i.m7403m(), c14244m.m330a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        C11632b m7460m = C11632b.m7460m(new C11633c("java.util.function.Function"));
        C9612q.m13918g(m7460m, "topLevel(FqName(\"java.util.function.Function\"))");
        c14244m.m328c(m7460m, c14244m.m330a("java.util.function.UnaryOperator"));
        C11632b m7460m2 = C11632b.m7460m(new C11633c("java.util.function.BiFunction"));
        C9612q.m13918g(m7460m2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        c14244m.m328c(m7460m2, c14244m.m330a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(C11591x.m7577a(((C11632b) entry.getKey()).m7471b(), ((C11632b) entry.getValue()).m7471b()));
        }
        m6744r = C11889v.m6744r(arrayList);
        f36637c = m6744r;
    }

    private C14244m() {
    }

    /* renamed from: a */
    private final List<C11632b> m330a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C11632b.m7460m(new C11633c(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private final void m328c(C11632b c11632b, List<C11632b> list) {
        Map<C11632b, C11632b> map = f36636b;
        for (Object obj : list) {
            C11632b c11632b2 = (C11632b) obj;
            map.put(obj, c11632b);
        }
    }

    /* renamed from: b */
    public final C11633c m329b(C11633c classFqName) {
        C9612q.m13917h(classFqName, "classFqName");
        return f36637c.get(classFqName);
    }
}
