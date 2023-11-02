package p394w2;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: w2.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13373g<E> extends HashSet<E> {
    private C13373g(Set<E> set) {
        super(set);
    }

    /* renamed from: d */
    public static <E> C13373g<E> m2693d(E... eArr) {
        HashSet hashSet = new HashSet(eArr.length);
        Collections.addAll(hashSet, eArr);
        return new C13373g<>(hashSet);
    }
}