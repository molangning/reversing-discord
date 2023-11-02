package gb;

import java.io.Serializable;
import java.util.Comparator;
import p102fb.C6378h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gb.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6669m<T> extends AbstractC6656j0<T> implements Serializable {

    /* renamed from: j */
    final Comparator<T> f18856j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6669m(Comparator<T> comparator) {
        this.f18856j = (Comparator) C6378h.m22834j(comparator);
    }

    @Override // gb.AbstractC6656j0, java.util.Comparator
    public int compare(T t, T t2) {
        return this.f18856j.compare(t, t2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C6669m) {
            return this.f18856j.equals(((C6669m) obj).f18856j);
        }
        return false;
    }

    public int hashCode() {
        return this.f18856j.hashCode();
    }

    public String toString() {
        return this.f18856j.toString();
    }
}
