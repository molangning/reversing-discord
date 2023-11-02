package p167j1;

import androidx.core.util.C1136d;

/* renamed from: j1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8788i<T> {

    /* renamed from: a */
    T f23061a;

    /* renamed from: b */
    T f23062b;

    /* renamed from: a */
    private static boolean m17246a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public void m17245b(T t, T t2) {
        this.f23061a = t;
        this.f23062b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1136d)) {
            return false;
        }
        C1136d c1136d = (C1136d) obj;
        if (!m17246a(c1136d.f3508a, this.f23061a) || !m17246a(c1136d.f3509b, this.f23062b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        T t = this.f23061a;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.f23062b;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f23061a + " " + this.f23062b + "}";
    }
}
