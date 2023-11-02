package p394w2;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: w2.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13371e<E> extends ArrayList<E> {
    private C13371e(int i) {
        super(i);
    }

    /* renamed from: d */
    public static <E> C13371e<E> m2697d(E... eArr) {
        C13371e<E> c13371e = new C13371e<>(eArr.length);
        Collections.addAll(c13371e, eArr);
        return c13371e;
    }
}
