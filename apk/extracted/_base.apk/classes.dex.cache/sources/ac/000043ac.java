package p243n6;

/* renamed from: n6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10506a {

    /* renamed from: d */
    public static final C10506a f27477d = new C10506a(0, 0, 0);

    /* renamed from: a */
    public final int f27478a;

    /* renamed from: b */
    public final int f27479b;

    /* renamed from: c */
    public final int f27480c;

    public C10506a(int i, int i2, int i3) {
        this.f27478a = i;
        this.f27479b = i2;
        this.f27480c = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10506a)) {
            return false;
        }
        C10506a c10506a = (C10506a) obj;
        if (this.f27478a == c10506a.f27478a && this.f27479b == c10506a.f27479b && this.f27480c == c10506a.f27480c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f27478a) * 31) + this.f27479b) * 31) + this.f27480c;
    }
}