package p193k6;

/* renamed from: k6.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9128u {

    /* renamed from: a */
    public final int f24052a;

    /* renamed from: b */
    public final float f24053b;

    public C9128u(int i, float f) {
        this.f24052a = i;
        this.f24053b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9128u.class != obj.getClass()) {
            return false;
        }
        C9128u c9128u = (C9128u) obj;
        if (this.f24052a == c9128u.f24052a && Float.compare(c9128u.f24053b, this.f24053b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f24052a) * 31) + Float.floatToIntBits(this.f24053b);
    }
}
