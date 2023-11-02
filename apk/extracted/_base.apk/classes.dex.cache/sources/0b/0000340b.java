package gb;

import java.io.Serializable;
import p102fb.C6377g;
import p102fb.C6378h;
import p102fb.InterfaceC6376f;

/* renamed from: gb.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6651h<F, T> extends AbstractC6656j0<F> implements Serializable {

    /* renamed from: j */
    final InterfaceC6376f<F, ? extends T> f18827j;

    /* renamed from: k */
    final AbstractC6656j0<T> f18828k;

    public C6651h(InterfaceC6376f<F, ? extends T> interfaceC6376f, AbstractC6656j0<T> abstractC6656j0) {
        this.f18827j = (InterfaceC6376f) C6378h.m22834j(interfaceC6376f);
        this.f18828k = (AbstractC6656j0) C6378h.m22834j(abstractC6656j0);
    }

    @Override // gb.AbstractC6656j0, java.util.Comparator
    public int compare(F f, F f2) {
        return this.f18828k.compare(this.f18827j.apply(f), this.f18827j.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6651h)) {
            return false;
        }
        C6651h c6651h = (C6651h) obj;
        if (this.f18827j.equals(c6651h.f18827j) && this.f18828k.equals(c6651h.f18828k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C6377g.m22844b(this.f18827j, this.f18828k);
    }

    public String toString() {
        return this.f18828k + ".onResultOf(" + this.f18827j + ")";
    }
}