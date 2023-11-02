package p247nb;

import java.util.Arrays;
import java.util.List;

/* renamed from: nb.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10559r extends C10560s {

    /* renamed from: j */
    private final List<C10533d<?>> f27560j;

    public C10559r(List<C10533d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f27560j = list;
    }
}