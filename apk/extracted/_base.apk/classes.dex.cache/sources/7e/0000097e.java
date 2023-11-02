package p029b9;

/* renamed from: b9.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2174i {

    /* renamed from: a */
    private final String f6144a;

    /* renamed from: b */
    private final String f6145b;

    public C2174i(String str) {
        this(str, null);
    }

    public C2174i(String str, String str2) {
        C2198p.m33984k(str, "log tag cannot be null");
        C2198p.m33992c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f6144a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f6145b = null;
        } else {
            this.f6145b = str2;
        }
    }
}