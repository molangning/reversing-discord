package p242n5;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10501a {

    /* renamed from: a */
    private final C10501a f27448a = null;

    /* renamed from: b */
    private final AtomicReference<C10502a> f27449b;

    /* renamed from: c */
    private final int f27450c;

    /* renamed from: d */
    private boolean f27451d;

    /* renamed from: e */
    private final boolean f27452e;

    /* renamed from: f */
    private int[] f27453f;

    /* renamed from: g */
    private int f27454g;

    /* renamed from: h */
    private int f27455h;

    /* renamed from: i */
    private int f27456i;

    /* renamed from: j */
    private int f27457j;

    /* renamed from: k */
    private int f27458k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n5.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10502a {

        /* renamed from: a */
        public final int f27459a;

        /* renamed from: b */
        public final int f27460b;

        /* renamed from: c */
        public final int f27461c;

        /* renamed from: d */
        public final int[] f27462d;

        /* renamed from: e */
        public final String[] f27463e;

        /* renamed from: f */
        public final int f27464f;

        /* renamed from: g */
        public final int f27465g;

        public C10502a(int i, int i2, int i3, int[] iArr, String[] strArr, int i4, int i5) {
            this.f27459a = i;
            this.f27460b = i2;
            this.f27461c = i3;
            this.f27462d = iArr;
            this.f27463e = strArr;
            this.f27464f = i4;
            this.f27465g = i5;
        }

        /* renamed from: a */
        public static C10502a m11343a(int i) {
            int i2 = i << 3;
            return new C10502a(i, 0, C10501a.m11352a(i), new int[i2], new String[i << 1], i2 - i, i2);
        }
    }

    private C10501a(int i, boolean z, int i2, boolean z2) {
        this.f27450c = i2;
        this.f27451d = z;
        this.f27452e = z2;
        int i3 = 16;
        if (i >= 16) {
            if (((i - 1) & i) != 0) {
                while (i3 < i) {
                    i3 += i3;
                }
            }
            this.f27449b = new AtomicReference<>(C10502a.m11343a(i));
        }
        i = i3;
        this.f27449b = new AtomicReference<>(C10502a.m11343a(i));
    }

    /* renamed from: a */
    static int m11352a(int i) {
        int i2 = i >> 2;
        if (i2 < 64) {
            return 4;
        }
        if (i2 <= 256) {
            return 5;
        }
        return i2 <= 1024 ? 6 : 7;
    }

    /* renamed from: b */
    private final int m11351b() {
        int i = this.f27454g;
        return (i << 3) - i;
    }

    /* renamed from: c */
    public static C10501a m11350c() {
        long currentTimeMillis = System.currentTimeMillis();
        return m11349d((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: d */
    protected static C10501a m11349d(int i) {
        return new C10501a(64, true, i, true);
    }

    /* renamed from: e */
    public int m11348e() {
        int i = this.f27455h;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f27453f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: f */
    public int m11347f() {
        int i = this.f27456i;
        int i2 = 0;
        for (int i3 = this.f27455h + 3; i3 < i; i3 += 4) {
            if (this.f27453f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: g */
    public int m11346g() {
        return (this.f27458k - m11351b()) >> 2;
    }

    /* renamed from: h */
    public int m11345h() {
        int i = this.f27456i + 3;
        int i2 = this.f27454g + i;
        int i3 = 0;
        while (i < i2) {
            if (this.f27453f[i] != 0) {
                i3++;
            }
            i += 4;
        }
        return i3;
    }

    /* renamed from: i */
    public int m11344i() {
        int i = this.f27454g << 3;
        int i2 = 0;
        for (int i3 = 3; i3 < i; i3 += 4) {
            if (this.f27453f[i3] != 0) {
                i2++;
            }
        }
        return i2;
    }

    public String toString() {
        int m11348e = m11348e();
        int m11347f = m11347f();
        int m11345h = m11345h();
        int m11346g = m11346g();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", C10501a.class.getName(), Integer.valueOf(this.f27457j), Integer.valueOf(this.f27454g), Integer.valueOf(m11348e), Integer.valueOf(m11347f), Integer.valueOf(m11345h), Integer.valueOf(m11346g), Integer.valueOf(m11348e + m11347f + m11345h + m11346g), Integer.valueOf(m11344i()));
    }
}