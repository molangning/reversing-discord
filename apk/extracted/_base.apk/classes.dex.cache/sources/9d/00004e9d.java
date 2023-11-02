package p366u9;

import java.util.Arrays;

/* renamed from: u9.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12909i {

    /* renamed from: a */
    private final String f33602a;

    /* renamed from: b */
    private final C12915l f33603b;

    /* renamed from: c */
    private C12915l f33604c;

    /* renamed from: d */
    private boolean f33605d;

    /* JADX INFO: Access modifiers changed from: private */
    public C12909i(String str) {
        C12915l c12915l = new C12915l();
        this.f33603b = c12915l;
        this.f33604c = c12915l;
        this.f33605d = false;
        this.f33602a = (String) C12919n.m3674b(str);
    }

    /* renamed from: c */
    private final C12909i m3683c(String str, Object obj) {
        C12915l c12915l = new C12915l();
        this.f33604c.f33614c = c12915l;
        this.f33604c = c12915l;
        c12915l.f33613b = obj;
        c12915l.f33612a = (String) C12919n.m3674b(str);
        return this;
    }

    /* renamed from: a */
    public final C12909i m3685a(String str, int i) {
        return m3683c(str, String.valueOf(i));
    }

    /* renamed from: b */
    public final C12909i m3684b(String str, Object obj) {
        return m3683c(str, obj);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f33602a);
        sb2.append('{');
        C12915l c12915l = this.f33603b.f33614c;
        String str = "";
        while (c12915l != null) {
            Object obj = c12915l.f33613b;
            sb2.append(str);
            String str2 = c12915l.f33612a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj != null && obj.getClass().isArray()) {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            } else {
                sb2.append(obj);
            }
            c12915l = c12915l.f33614c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}