package p070di;

import kh.C9386c;
import kh.C9439q;
import kh.C9450s;
import kh.EnumC9417k;
import kh.EnumC9471x;
import kotlin.jvm.internal.C9612q;
import p142hi.EnumC7336w1;
import p305qg.EnumC11915e0;
import p305qg.EnumC11918f;
import pf.C11581q;

/* renamed from: di.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5910a0 {

    /* renamed from: a */
    public static final C5910a0 f16858a = new C5910a0();

    /* renamed from: di.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C5911a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16859a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16860b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f16861c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f16862d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f16863e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f16864f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f16865g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f16866h;

        static {
            int[] iArr = new int[EnumC9417k.values().length];
            try {
                iArr[EnumC9417k.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9417k.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9417k.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9417k.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16859a = iArr;
            int[] iArr2 = new int[EnumC11915e0.values().length];
            try {
                iArr2[EnumC11915e0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC11915e0.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC11915e0.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC11915e0.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f16860b = iArr2;
            int[] iArr3 = new int[EnumC9471x.values().length];
            try {
                iArr3[EnumC9471x.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[EnumC9471x.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[EnumC9471x.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[EnumC9471x.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[EnumC9471x.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[EnumC9471x.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f16861c = iArr3;
            int[] iArr4 = new int[C9386c.EnumC9389c.values().length];
            try {
                iArr4[C9386c.EnumC9389c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[C9386c.EnumC9389c.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[C9386c.EnumC9389c.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[C9386c.EnumC9389c.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[C9386c.EnumC9389c.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[C9386c.EnumC9389c.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[C9386c.EnumC9389c.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            f16862d = iArr4;
            int[] iArr5 = new int[EnumC11918f.values().length];
            try {
                iArr5[EnumC11918f.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[EnumC11918f.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[EnumC11918f.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[EnumC11918f.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[EnumC11918f.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[EnumC11918f.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            f16863e = iArr5;
            int[] iArr6 = new int[C9450s.EnumC9453c.values().length];
            try {
                iArr6[C9450s.EnumC9453c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[C9450s.EnumC9453c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[C9450s.EnumC9453c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            f16864f = iArr6;
            int[] iArr7 = new int[C9439q.C9441b.EnumC9444c.values().length];
            try {
                iArr7[C9439q.C9441b.EnumC9444c.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[C9439q.C9441b.EnumC9444c.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[C9439q.C9441b.EnumC9444c.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[C9439q.C9441b.EnumC9444c.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            f16865g = iArr7;
            int[] iArr8 = new int[EnumC7336w1.values().length];
            try {
                iArr8[EnumC7336w1.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[EnumC7336w1.OUT_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[EnumC7336w1.INVARIANT.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            f16866h = iArr8;
        }
    }

    private C5910a0() {
    }

    /* renamed from: a */
    public final EnumC11918f m24187a(C9386c.EnumC9389c enumC9389c) {
        int i;
        if (enumC9389c == null) {
            i = -1;
        } else {
            i = C5911a.f16862d[enumC9389c.ordinal()];
        }
        switch (i) {
            case 1:
                return EnumC11918f.CLASS;
            case 2:
                return EnumC11918f.INTERFACE;
            case 3:
                return EnumC11918f.ENUM_CLASS;
            case 4:
                return EnumC11918f.ENUM_ENTRY;
            case 5:
                return EnumC11918f.ANNOTATION_CLASS;
            case 6:
            case 7:
                return EnumC11918f.OBJECT;
            default:
                return EnumC11918f.CLASS;
        }
    }

    /* renamed from: b */
    public final EnumC11915e0 m24186b(EnumC9417k enumC9417k) {
        int i;
        if (enumC9417k == null) {
            i = -1;
        } else {
            i = C5911a.f16859a[enumC9417k.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return EnumC11915e0.FINAL;
                    }
                    return EnumC11915e0.SEALED;
                }
                return EnumC11915e0.ABSTRACT;
            }
            return EnumC11915e0.OPEN;
        }
        return EnumC11915e0.FINAL;
    }

    /* renamed from: c */
    public final EnumC7336w1 m24185c(C9439q.C9441b.EnumC9444c projection) {
        C9612q.m13917h(projection, "projection");
        int i = C5911a.f16865g[projection.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        throw new C11581q();
                    }
                    throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
                }
                return EnumC7336w1.INVARIANT;
            }
            return EnumC7336w1.OUT_VARIANCE;
        }
        return EnumC7336w1.IN_VARIANCE;
    }

    /* renamed from: d */
    public final EnumC7336w1 m24184d(C9450s.EnumC9453c variance) {
        C9612q.m13917h(variance, "variance");
        int i = C5911a.f16864f[variance.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return EnumC7336w1.INVARIANT;
                }
                throw new C11581q();
            }
            return EnumC7336w1.OUT_VARIANCE;
        }
        return EnumC7336w1.IN_VARIANCE;
    }
}
