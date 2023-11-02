package p307qi;

import ai.InterfaceC0194h;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.C9612q;
import p327ri.C12258e;

/* renamed from: qi.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12007a {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Collection<T> m6636a(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C9612q.m13917h(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: b */
    public static final C12258e<InterfaceC0194h> m6635b(Iterable<? extends InterfaceC0194h> scopes) {
        boolean z;
        C9612q.m13917h(scopes, "scopes");
        C12258e<InterfaceC0194h> c12258e = new C12258e<>();
        for (InterfaceC0194h interfaceC0194h : scopes) {
            InterfaceC0194h interfaceC0194h2 = interfaceC0194h;
            if (interfaceC0194h2 != null && interfaceC0194h2 != InterfaceC0194h.C0197b.f649b) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c12258e.add(interfaceC0194h);
            }
        }
        return c12258e;
    }
}