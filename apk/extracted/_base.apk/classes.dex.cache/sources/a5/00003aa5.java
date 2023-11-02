package p164j$.time.format;

/* renamed from: j$.time.format.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8302e implements InterfaceC8304g {

    /* renamed from: a */
    private final char f22308a;

    public C8302e(char c) {
        this.f22308a = c;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        sb2.append(this.f22308a);
        return true;
    }

    public final String toString() {
        char c = this.f22308a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}