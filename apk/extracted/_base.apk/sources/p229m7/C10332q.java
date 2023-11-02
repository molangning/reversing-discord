package p229m7;

/* renamed from: m7.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10332q {

    /* renamed from: a */
    public final Object f27016a;

    /* renamed from: b */
    public final int f27017b;

    /* renamed from: c */
    public final int f27018c;

    /* renamed from: d */
    public final long f27019d;

    /* renamed from: e */
    public final int f27020e;

    public C10332q(Object obj) {
        this(obj, -1L);
    }

    /* renamed from: a */
    public C10332q m11752a(Object obj) {
        if (this.f27016a.equals(obj)) {
            return this;
        }
        return new C10332q(obj, this.f27017b, this.f27018c, this.f27019d, this.f27020e);
    }

    /* renamed from: b */
    public boolean m11751b() {
        return this.f27017b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10332q)) {
            return false;
        }
        C10332q c10332q = (C10332q) obj;
        if (this.f27016a.equals(c10332q.f27016a) && this.f27017b == c10332q.f27017b && this.f27018c == c10332q.f27018c && this.f27019d == c10332q.f27019d && this.f27020e == c10332q.f27020e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f27016a.hashCode()) * 31) + this.f27017b) * 31) + this.f27018c) * 31) + ((int) this.f27019d)) * 31) + this.f27020e;
    }

    public C10332q(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public C10332q(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public C10332q(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C10332q(C10332q c10332q) {
        this.f27016a = c10332q.f27016a;
        this.f27017b = c10332q.f27017b;
        this.f27018c = c10332q.f27018c;
        this.f27019d = c10332q.f27019d;
        this.f27020e = c10332q.f27020e;
    }

    private C10332q(Object obj, int i, int i2, long j, int i3) {
        this.f27016a = obj;
        this.f27017b = i;
        this.f27018c = i2;
        this.f27019d = j;
        this.f27020e = i3;
    }
}
