package nc;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: nc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10568a {

    /* renamed from: h */
    public static final C10568a f27571h = new C10568a(4201, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, 1);

    /* renamed from: i */
    public static final C10568a f27572i = new C10568a(1033, 1024, 1);

    /* renamed from: j */
    public static final C10568a f27573j;

    /* renamed from: k */
    public static final C10568a f27574k;

    /* renamed from: l */
    public static final C10568a f27575l;

    /* renamed from: m */
    public static final C10568a f27576m;

    /* renamed from: n */
    public static final C10568a f27577n;

    /* renamed from: o */
    public static final C10568a f27578o;

    /* renamed from: a */
    private final int[] f27579a;

    /* renamed from: b */
    private final int[] f27580b;

    /* renamed from: c */
    private final C10569b f27581c;

    /* renamed from: d */
    private final C10569b f27582d;

    /* renamed from: e */
    private final int f27583e;

    /* renamed from: f */
    private final int f27584f;

    /* renamed from: g */
    private final int f27585g;

    static {
        C10568a c10568a = new C10568a(67, 64, 1);
        f27573j = c10568a;
        f27574k = new C10568a(19, 16, 1);
        f27575l = new C10568a(285, 256, 0);
        C10568a c10568a2 = new C10568a(301, 256, 1);
        f27576m = c10568a2;
        f27577n = c10568a2;
        f27578o = c10568a;
    }

    public C10568a(int i, int i2, int i3) {
        this.f27584f = i;
        this.f27583e = i2;
        this.f27585g = i3;
        this.f27579a = new int[i2];
        this.f27580b = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f27579a[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f27580b[this.f27579a[i6]] = i6;
        }
        this.f27581c = new C10569b(this, new int[]{0});
        this.f27582d = new C10569b(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m11221a(int i, int i2) {
        return i ^ i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C10569b m11220b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f27581c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C10569b(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m11219c(int i) {
        return this.f27579a[i];
    }

    /* renamed from: d */
    public int m11218d() {
        return this.f27585g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public C10569b m11217e() {
        return this.f27582d;
    }

    /* renamed from: f */
    public int m11216f() {
        return this.f27583e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public C10569b m11215g() {
        return this.f27581c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m11214h(int i) {
        if (i != 0) {
            return this.f27579a[(this.f27583e - this.f27580b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m11213i(int i) {
        if (i != 0) {
            return this.f27580b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m11212j(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f27579a;
        int[] iArr2 = this.f27580b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f27583e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f27584f) + ',' + this.f27583e + ')';
    }
}
