package p160ih;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.EnumC7336w1;

/* renamed from: ih.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7527b0 {

    /* renamed from: k */
    public static final C7528a f20785k = new C7528a(null);

    /* renamed from: l */
    public static final C7527b0 f20786l;

    /* renamed from: m */
    public static final C7527b0 f20787m;

    /* renamed from: n */
    public static final C7527b0 f20788n;

    /* renamed from: o */
    public static final C7527b0 f20789o;

    /* renamed from: p */
    public static final C7527b0 f20790p;

    /* renamed from: q */
    public static final C7527b0 f20791q;

    /* renamed from: r */
    public static final C7527b0 f20792r;

    /* renamed from: s */
    public static final C7527b0 f20793s;

    /* renamed from: t */
    public static final C7527b0 f20794t;

    /* renamed from: a */
    private final boolean f20795a;

    /* renamed from: b */
    private final boolean f20796b;

    /* renamed from: c */
    private final boolean f20797c;

    /* renamed from: d */
    private final boolean f20798d;

    /* renamed from: e */
    private final boolean f20799e;

    /* renamed from: f */
    private final C7527b0 f20800f;

    /* renamed from: g */
    private final boolean f20801g;

    /* renamed from: h */
    private final C7527b0 f20802h;

    /* renamed from: i */
    private final C7527b0 f20803i;

    /* renamed from: j */
    private final boolean f20804j;

    /* renamed from: ih.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C7528a {
        private C7528a() {
        }

        public /* synthetic */ C7528a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ih.b0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public /* synthetic */ class C7529b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20805a;

        static {
            int[] iArr = new int[EnumC7336w1.values().length];
            try {
                iArr[EnumC7336w1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7336w1.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20805a = iArr;
        }
    }

    static {
        C7527b0 c7527b0 = new C7527b0(false, false, false, false, false, null, false, null, null, false, 1023, null);
        f20786l = c7527b0;
        C7527b0 c7527b02 = new C7527b0(false, false, false, false, false, null, false, null, null, true, 511, null);
        f20787m = c7527b02;
        f20788n = new C7527b0(false, true, false, false, false, null, false, null, null, false, 1021, null);
        f20789o = new C7527b0(false, false, false, false, false, c7527b0, false, null, null, false, 988, null);
        f20790p = new C7527b0(false, false, false, false, false, c7527b02, false, null, null, true, 476, null);
        f20791q = new C7527b0(false, true, false, false, false, c7527b0, false, null, null, false, 988, null);
        f20792r = new C7527b0(false, false, false, true, false, c7527b0, false, null, null, false, 983, null);
        f20793s = new C7527b0(false, false, false, true, false, c7527b0, false, null, null, false, 919, null);
        f20794t = new C7527b0(false, false, true, false, false, c7527b0, false, null, null, false, 984, null);
    }

    public C7527b0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C7527b0 c7527b0, boolean z6, C7527b0 c7527b02, C7527b0 c7527b03, boolean z7) {
        this.f20795a = z;
        this.f20796b = z2;
        this.f20797c = z3;
        this.f20798d = z4;
        this.f20799e = z5;
        this.f20800f = c7527b0;
        this.f20801g = z6;
        this.f20802h = c7527b02;
        this.f20803i = c7527b03;
        this.f20804j = z7;
    }

    /* renamed from: a */
    public final boolean m20493a() {
        return this.f20801g;
    }

    /* renamed from: b */
    public final boolean m20492b() {
        return this.f20804j;
    }

    /* renamed from: c */
    public final boolean m20491c() {
        return this.f20796b;
    }

    /* renamed from: d */
    public final boolean m20490d() {
        return this.f20795a;
    }

    /* renamed from: e */
    public final boolean m20489e() {
        return this.f20797c;
    }

    /* renamed from: f */
    public final C7527b0 m20488f(EnumC7336w1 effectiveVariance, boolean z) {
        C9612q.m13917h(effectiveVariance, "effectiveVariance");
        if (!z || !this.f20797c) {
            int i = C7529b.f20805a[effectiveVariance.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C7527b0 c7527b0 = this.f20800f;
                    if (c7527b0 != null) {
                        return c7527b0;
                    }
                } else {
                    C7527b0 c7527b02 = this.f20803i;
                    if (c7527b02 != null) {
                        return c7527b02;
                    }
                }
            } else {
                C7527b0 c7527b03 = this.f20802h;
                if (c7527b03 != null) {
                    return c7527b03;
                }
            }
        }
        return this;
    }

    /* renamed from: g */
    public final C7527b0 m20487g() {
        return new C7527b0(this.f20795a, true, this.f20797c, this.f20798d, this.f20799e, this.f20800f, this.f20801g, this.f20802h, this.f20803i, false, 512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C7527b0(boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, p160ih.C7527b0 r17, boolean r18, p160ih.C7527b0 r19, p160ih.C7527b0 r20, boolean r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r12
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r13
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r14
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L1f
            r6 = r5
            goto L20
        L1f:
            r6 = r15
        L20:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            r7 = r5
            goto L28
        L26:
            r7 = r16
        L28:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r17
        L30:
            r9 = r0 & 64
            if (r9 == 0) goto L35
            goto L37
        L35:
            r2 = r18
        L37:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3d
            r9 = r8
            goto L3f
        L3d:
            r9 = r19
        L3f:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L45
            r10 = r8
            goto L47
        L45:
            r10 = r20
        L47:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4c
            goto L4e
        L4c:
            r5 = r21
        L4e:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r2
            r20 = r9
            r21 = r10
            r22 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p160ih.C7527b0.<init>(boolean, boolean, boolean, boolean, boolean, ih.b0, boolean, ih.b0, ih.b0, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
