package p362u5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u5.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12853h extends AbstractC12865n {

    /* renamed from: a */
    private final long f33432a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12853h(long j) {
        this.f33432a = j;
    }

    @Override // p362u5.AbstractC12865n
    /* renamed from: c */
    public long mo3764c() {
        return this.f33432a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC12865n) && this.f33432a == ((AbstractC12865n) obj).mo3764c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f33432a;
        return ((int) (j ^ (j >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f33432a + "}";
    }
}
