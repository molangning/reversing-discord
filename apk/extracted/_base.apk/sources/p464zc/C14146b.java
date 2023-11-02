package p464zc;

/* renamed from: zc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14146b {

    /* renamed from: f */
    public static final C14146b f36388f = new C14146b(929, 3);

    /* renamed from: a */
    private final int[] f36389a;

    /* renamed from: b */
    private final int[] f36390b;

    /* renamed from: c */
    private final C14147c f36391c;

    /* renamed from: d */
    private final C14147c f36392d;

    /* renamed from: e */
    private final int f36393e;

    private C14146b(int i, int i2) {
        this.f36393e = i;
        this.f36389a = new int[i];
        this.f36390b = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f36389a[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f36390b[this.f36389a[i5]] = i5;
        }
        this.f36391c = new C14147c(this, new int[]{0});
        this.f36392d = new C14147c(this, new int[]{1});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m583a(int i, int i2) {
        return (i + i2) % this.f36393e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public C14147c m582b(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.f36391c;
            }
            int[] iArr = new int[i + 1];
            iArr[0] = i2;
            return new C14147c(this, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m581c(int i) {
        return this.f36389a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C14147c m580d() {
        return this.f36392d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m579e() {
        return this.f36393e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public C14147c m578f() {
        return this.f36391c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m577g(int i) {
        if (i != 0) {
            return this.f36389a[(this.f36393e - this.f36390b[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public int m576h(int i) {
        if (i != 0) {
            return this.f36390b[i];
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public int m575i(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f36389a;
        int[] iArr2 = this.f36390b;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f36393e - 1)];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m574j(int i, int i2) {
        int i3 = this.f36393e;
        return ((i + i3) - i2) % i3;
    }
}
