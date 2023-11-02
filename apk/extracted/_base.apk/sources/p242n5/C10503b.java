package p242n5;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10503b {

    /* renamed from: c */
    private final int f27468c;

    /* renamed from: a */
    private final C10503b f27466a = null;

    /* renamed from: e */
    private boolean f27470e = true;

    /* renamed from: d */
    private final int f27469d = -1;

    /* renamed from: g */
    private boolean f27472g = false;

    /* renamed from: f */
    private int f27471f = 0;

    /* renamed from: b */
    private final AtomicReference<C10505b> f27467b = new AtomicReference<>(C10505b.m11340a(64));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n5.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10504a {
    }

    /* renamed from: n5.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C10505b {

        /* renamed from: a */
        final int f27473a;

        /* renamed from: b */
        final int f27474b;

        /* renamed from: c */
        final String[] f27475c;

        /* renamed from: d */
        final C10504a[] f27476d;

        public C10505b(int i, int i2, String[] strArr, C10504a[] c10504aArr) {
            this.f27473a = i;
            this.f27474b = i2;
            this.f27475c = strArr;
            this.f27476d = c10504aArr;
        }

        /* renamed from: a */
        public static C10505b m11340a(int i) {
            return new C10505b(0, 0, new String[i], new C10504a[i >> 1]);
        }
    }

    private C10503b(int i) {
        this.f27468c = i;
    }

    /* renamed from: a */
    public static C10503b m11342a() {
        long currentTimeMillis = System.currentTimeMillis();
        return m11341b((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    /* renamed from: b */
    protected static C10503b m11341b(int i) {
        return new C10503b(i);
    }
}
