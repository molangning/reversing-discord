package p401w9;

import java.util.Set;

/* renamed from: w9.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13444f0 extends AbstractC13464y implements Set {

    /* renamed from: k */
    private transient AbstractC13436b0 f34690k;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: h */
    public AbstractC13436b0 mo2430h() {
        AbstractC13436b0 abstractC13436b0 = this.f34690k;
        if (abstractC13436b0 == null) {
            AbstractC13436b0 mo2483p = mo2483p();
            this.f34690k = mo2483p;
            return mo2483p;
        }
        return abstractC13436b0;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C13447h.m2477a(this);
    }

    /* renamed from: p */
    AbstractC13436b0 mo2483p() {
        return AbstractC13436b0.m2495r(toArray());
    }
}