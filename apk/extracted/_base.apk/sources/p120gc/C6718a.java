package p120gc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: gc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6718a extends AbstractC6723f {

    /* renamed from: a */
    private final String f18932a;

    /* renamed from: b */
    private final String f18933b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6718a(String str, String str2) {
        if (str != null) {
            this.f18932a = str;
            if (str2 != null) {
                this.f18933b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // p120gc.AbstractC6723f
    /* renamed from: b */
    public String mo22034b() {
        return this.f18932a;
    }

    @Override // p120gc.AbstractC6723f
    /* renamed from: c */
    public String mo22033c() {
        return this.f18933b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6723f)) {
            return false;
        }
        AbstractC6723f abstractC6723f = (AbstractC6723f) obj;
        if (this.f18932a.equals(abstractC6723f.mo22034b()) && this.f18933b.equals(abstractC6723f.mo22033c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f18932a.hashCode() ^ 1000003) * 1000003) ^ this.f18933b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f18932a + ", version=" + this.f18933b + "}";
    }
}
