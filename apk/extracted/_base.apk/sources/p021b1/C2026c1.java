package p021b1;

import java.util.HashMap;
import java.util.Map;

/* renamed from: b1.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2026c1 {

    /* renamed from: a */
    Map<String, String> f5576a;

    /* renamed from: b */
    Map<String, String> f5577b;

    /* renamed from: a */
    public C2026c1 m34660a() {
        C2026c1 c2026c1 = new C2026c1();
        if (this.f5576a != null) {
            c2026c1.f5576a = new HashMap(this.f5576a);
        }
        if (this.f5577b != null) {
            c2026c1.f5577b = new HashMap(this.f5577b);
        }
        return c2026c1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2026c1 c2026c1 = (C2026c1) obj;
        if (C2043h1.m34477i(this.f5576a, c2026c1.f5576a) && C2043h1.m34477i(this.f5577b, c2026c1.f5577b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((629 + C2043h1.m34505O(this.f5576a)) * 37) + C2043h1.m34505O(this.f5577b);
    }
}
