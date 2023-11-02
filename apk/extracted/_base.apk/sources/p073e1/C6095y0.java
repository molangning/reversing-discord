package p073e1;

import java.util.HashMap;
import java.util.Map;

/* renamed from: e1.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6095y0 {

    /* renamed from: b */
    private final C6053j f17351b;

    /* renamed from: a */
    private final Map<String, String> f17350a = new HashMap();

    /* renamed from: d */
    private boolean f17353d = true;

    /* renamed from: c */
    private final C6059j0 f17352c = null;

    public C6095y0(C6053j c6053j) {
        this.f17351b = c6053j;
    }

    /* renamed from: d */
    private void m23584d() {
        C6053j c6053j = this.f17351b;
        if (c6053j != null) {
            c6053j.invalidate();
        }
        C6059j0 c6059j0 = this.f17352c;
        if (c6059j0 != null) {
            c6059j0.invalidateSelf();
        }
    }

    /* renamed from: a */
    public String m23587a(String str) {
        return str;
    }

    /* renamed from: b */
    public String m23586b(String str, String str2) {
        return m23587a(str2);
    }

    /* renamed from: c */
    public final String m23585c(String str, String str2) {
        if (this.f17353d && this.f17350a.containsKey(str2)) {
            return this.f17350a.get(str2);
        }
        String m23586b = m23586b(str, str2);
        if (this.f17353d) {
            this.f17350a.put(str2, m23586b);
        }
        return m23586b;
    }

    /* renamed from: e */
    public void m23583e(String str, String str2) {
        this.f17350a.put(str, str2);
        m23584d();
    }
}
