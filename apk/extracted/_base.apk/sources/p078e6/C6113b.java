package p078e6;

import p381v5.AbstractC13093i;
import p381v5.AbstractC13103o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: e6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6113b extends AbstractC6135k {

    /* renamed from: a */
    private final long f17377a;

    /* renamed from: b */
    private final AbstractC13103o f17378b;

    /* renamed from: c */
    private final AbstractC13093i f17379c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6113b(long j, AbstractC13103o abstractC13103o, AbstractC13093i abstractC13093i) {
        this.f17377a = j;
        if (abstractC13103o != null) {
            this.f17378b = abstractC13103o;
            if (abstractC13093i != null) {
                this.f17379c = abstractC13093i;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }

    @Override // p078e6.AbstractC6135k
    /* renamed from: b */
    public AbstractC13093i mo23519b() {
        return this.f17379c;
    }

    @Override // p078e6.AbstractC6135k
    /* renamed from: c */
    public long mo23518c() {
        return this.f17377a;
    }

    @Override // p078e6.AbstractC6135k
    /* renamed from: d */
    public AbstractC13103o mo23517d() {
        return this.f17378b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6135k)) {
            return false;
        }
        AbstractC6135k abstractC6135k = (AbstractC6135k) obj;
        if (this.f17377a == abstractC6135k.mo23518c() && this.f17378b.equals(abstractC6135k.mo23517d()) && this.f17379c.equals(abstractC6135k.mo23519b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f17377a;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f17378b.hashCode()) * 1000003) ^ this.f17379c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f17377a + ", transportContext=" + this.f17378b + ", event=" + this.f17379c + "}";
    }
}
