package gb;

import java.io.Serializable;
import p102fb.C6378h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6652h0 extends AbstractC6656j0<Comparable> implements Serializable {

    /* renamed from: j */
    static final C6652h0 f18829j = new C6652h0();

    private C6652h0() {
    }

    @Override // gb.AbstractC6656j0
    /* renamed from: j */
    public <S extends Comparable> AbstractC6656j0<S> mo22155j() {
        return C6680o0.f18882j;
    }

    @Override // gb.AbstractC6656j0, java.util.Comparator
    /* renamed from: l */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6378h.m22834j(comparable);
        C6378h.m22834j(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
