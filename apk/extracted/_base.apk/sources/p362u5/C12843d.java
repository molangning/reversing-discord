package p362u5;

import java.util.List;

/* renamed from: u5.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12843d extends AbstractC12857j {

    /* renamed from: a */
    private final List<AbstractC12863m> f33399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12843d(List<AbstractC12863m> list) {
        if (list != null) {
            this.f33399a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // p362u5.AbstractC12857j
    /* renamed from: c */
    public List<AbstractC12863m> mo3809c() {
        return this.f33399a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC12857j) {
            return this.f33399a.equals(((AbstractC12857j) obj).mo3809c());
        }
        return false;
    }

    public int hashCode() {
        return this.f33399a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f33399a + "}";
    }
}
