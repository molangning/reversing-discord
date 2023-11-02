package p167j1;

/* renamed from: j1.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8787h {

    /* renamed from: a */
    private final String f23058a;

    /* renamed from: b */
    public final float f23059b;

    /* renamed from: c */
    public final float f23060c;

    public C8787h(String str, float f, float f2) {
        this.f23058a = str;
        this.f23060c = f2;
        this.f23059b = f;
    }

    /* renamed from: a */
    public boolean m17247a(String str) {
        if (this.f23058a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f23058a.endsWith("\r")) {
            String str2 = this.f23058a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
