package androidx.core.util;

/* renamed from: androidx.core.util.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1136d<F, S> {

    /* renamed from: a */
    public final F f3508a;

    /* renamed from: b */
    public final S f3509b;

    public C1136d(F f, S s) {
        this.f3508a = f;
        this.f3509b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1136d)) {
            return false;
        }
        C1136d c1136d = (C1136d) obj;
        if (!C1134c.m37835a(c1136d.f3508a, this.f3508a) || !C1134c.m37835a(c1136d.f3509b, this.f3509b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f = this.f3508a;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f3509b;
        return hashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f3508a + " " + this.f3509b + "}";
    }
}
