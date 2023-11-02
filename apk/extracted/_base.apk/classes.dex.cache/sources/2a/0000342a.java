package gb;

import java.io.Serializable;
import p102fb.C6378h;

/* renamed from: gb.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6682p0<T> extends AbstractC6656j0<T> implements Serializable {

    /* renamed from: j */
    final AbstractC6656j0<? super T> f18883j;

    public C6682p0(AbstractC6656j0<? super T> abstractC6656j0) {
        this.f18883j = (AbstractC6656j0) C6378h.m22834j(abstractC6656j0);
    }

    @Override // gb.AbstractC6656j0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f18883j.compare(t2, t);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6682p0) {
            return this.f18883j.equals(((C6682p0) obj).f18883j);
        }
        return false;
    }

    public int hashCode() {
        return -this.f18883j.hashCode();
    }

    @Override // gb.AbstractC6656j0
    /* renamed from: j */
    public <S extends T> AbstractC6656j0<S> mo22155j() {
        return (AbstractC6656j0<? super T>) this.f18883j;
    }

    public String toString() {
        return this.f18883j + ".reverse()";
    }
}