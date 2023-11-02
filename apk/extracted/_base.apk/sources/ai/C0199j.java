package ai;

import java.util.HashSet;
import java.util.Set;
import kotlin.collections.C9550o;
import kotlin.jvm.internal.C9612q;
import ph.C11638f;

/* renamed from: ai.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C0199j {
    /* renamed from: a */
    public static final Set<C11638f> m40971a(Iterable<? extends InterfaceC0194h> iterable) {
        C9612q.m13917h(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (InterfaceC0194h interfaceC0194h : iterable) {
            Set<C11638f> mo4357f = interfaceC0194h.mo4357f();
            if (mo4357f == null) {
                return null;
            }
            C9550o.m14085y(hashSet, mo4357f);
        }
        return hashSet;
    }
}
