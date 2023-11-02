package gb;

import java.io.Serializable;
import p102fb.C6378h;

/* renamed from: gb.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C6680o0 extends AbstractC6656j0<Comparable> implements Serializable {

    /* renamed from: j */
    static final C6680o0 f18882j = new C6680o0();

    private C6680o0() {
    }

    @Override // gb.AbstractC6656j0
    /* renamed from: j */
    public <S extends Comparable> AbstractC6656j0<S> mo22155j() {
        return AbstractC6656j0.m22235f();
    }

    @Override // gb.AbstractC6656j0, java.util.Comparator
    /* renamed from: l */
    public int compare(Comparable comparable, Comparable comparable2) {
        C6378h.m22834j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
