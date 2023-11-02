package p386vb;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13228a extends AbstractC13242m {

    /* renamed from: a */
    private final String f34279a;

    /* renamed from: b */
    private final List<String> f34280b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13228a(String str, List<String> list) {
        if (str != null) {
            this.f34279a = str;
            if (list != null) {
                this.f34280b = list;
                return;
            }
            throw new NullPointerException("Null usedDates");
        }
        throw new NullPointerException("Null userAgent");
    }

    @Override // p386vb.AbstractC13242m
    /* renamed from: b */
    public List<String> mo2973b() {
        return this.f34280b;
    }

    @Override // p386vb.AbstractC13242m
    /* renamed from: c */
    public String mo2972c() {
        return this.f34279a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC13242m)) {
            return false;
        }
        AbstractC13242m abstractC13242m = (AbstractC13242m) obj;
        if (this.f34279a.equals(abstractC13242m.mo2972c()) && this.f34280b.equals(abstractC13242m.mo2973b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f34279a.hashCode() ^ 1000003) * 1000003) ^ this.f34280b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f34279a + ", usedDates=" + this.f34280b + "}";
    }
}
