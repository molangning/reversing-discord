package p296q6;

/* renamed from: q6.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11769z {

    /* renamed from: c */
    public static final C11769z f30673c = new C11769z(0, 0);

    /* renamed from: a */
    public final long f30674a;

    /* renamed from: b */
    public final long f30675b;

    public C11769z(long j, long j2) {
        this.f30674a = j;
        this.f30675b = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11769z.class != obj.getClass()) {
            return false;
        }
        C11769z c11769z = (C11769z) obj;
        if (this.f30674a == c11769z.f30674a && this.f30675b == c11769z.f30675b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f30674a) * 31) + ((int) this.f30675b);
    }

    public String toString() {
        return "[timeUs=" + this.f30674a + ", position=" + this.f30675b + "]";
    }
}
