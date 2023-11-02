package p368uc;

/* renamed from: uc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12947b {

    /* renamed from: a */
    private final int f33658a;

    /* renamed from: b */
    private final int f33659b;

    public C12947b(int i, int i2) {
        this.f33658a = i;
        this.f33659b = i2;
    }

    /* renamed from: a */
    public final int m3624a() {
        return this.f33659b;
    }

    /* renamed from: b */
    public final int m3623b() {
        return this.f33658a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12947b)) {
            return false;
        }
        C12947b c12947b = (C12947b) obj;
        if (this.f33658a != c12947b.f33658a || this.f33659b != c12947b.f33659b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f33658a ^ this.f33659b;
    }

    public final String toString() {
        return this.f33658a + "(" + this.f33659b + ')';
    }
}