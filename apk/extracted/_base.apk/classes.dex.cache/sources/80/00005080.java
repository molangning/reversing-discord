package p397w5;

import p397w5.AbstractC13398g;

/* renamed from: w5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13392b extends AbstractC13398g {

    /* renamed from: a */
    private final AbstractC13398g.EnumC13399a f34471a;

    /* renamed from: b */
    private final long f34472b;

    public C13392b(AbstractC13398g.EnumC13399a enumC13399a, long j) {
        if (enumC13399a != null) {
            this.f34471a = enumC13399a;
            this.f34472b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // p397w5.AbstractC13398g
    /* renamed from: b */
    public long mo2650b() {
        return this.f34472b;
    }

    @Override // p397w5.AbstractC13398g
    /* renamed from: c */
    public AbstractC13398g.EnumC13399a mo2649c() {
        return this.f34471a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13398g)) {
            return false;
        }
        AbstractC13398g abstractC13398g = (AbstractC13398g) obj;
        if (this.f34471a.equals(abstractC13398g.mo2649c()) && this.f34472b == abstractC13398g.mo2650b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f34472b;
        return ((this.f34471a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f34471a + ", nextRequestWaitMillis=" + this.f34472b + "}";
    }
}