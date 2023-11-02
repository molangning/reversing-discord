package p164j$.time.format;

/* renamed from: j$.time.format.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8310m implements InterfaceC8304g {

    /* renamed from: a */
    private final String f22326a;

    public C8310m(String str) {
        this.f22326a = str;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        sb2.append(this.f22326a);
        return true;
    }

    public final String toString() {
        String replace = this.f22326a.replace("'", "''");
        return "'" + replace + "'";
    }
}