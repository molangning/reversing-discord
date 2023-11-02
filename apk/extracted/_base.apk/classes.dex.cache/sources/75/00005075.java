package p394w2;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: w2.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13381l {
    /* renamed from: a */
    public static <E> CopyOnWriteArraySet<E> m2672a() {
        return new CopyOnWriteArraySet<>();
    }

    /* renamed from: b */
    public static <E> Set<E> m2671b() {
        return m2670c(new IdentityHashMap());
    }

    /* renamed from: c */
    public static <E> Set<E> m2670c(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }
}