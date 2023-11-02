package p070di;

import kh.EnumC9415j;
import kh.EnumC9471x;
import kotlin.jvm.internal.C9612q;
import p305qg.AbstractC11988u;
import p305qg.C11974t;
import p305qg.InterfaceC11902b;

/* renamed from: di.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5913b0 {

    /* renamed from: di.b0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C5914a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16872a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f16873b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f16874c;

        static {
            int[] iArr = new int[EnumC9415j.values().length];
            try {
                iArr[EnumC9415j.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9415j.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9415j.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC9415j.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16872a = iArr;
            int[] iArr2 = new int[InterfaceC11902b.EnumC11903a.values().length];
            try {
                iArr2[InterfaceC11902b.EnumC11903a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC11902b.EnumC11903a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC11902b.EnumC11903a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f16873b = iArr2;
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
            f16874c = iArr3;
        }
    }

    /* renamed from: a */
    public static final AbstractC11988u m24183a(C5910a0 c5910a0, EnumC9471x enumC9471x) {
        int i;
        C9612q.m13917h(c5910a0, "<this>");
        if (enumC9471x == null) {
            i = -1;
        } else {
            i = C5914a.f16874c[enumC9471x.ordinal()];
        }
        switch (i) {
            case 1:
                AbstractC11988u INTERNAL = C11974t.f30969d;
                C9612q.m13918g(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                AbstractC11988u PRIVATE = C11974t.f30966a;
                C9612q.m13918g(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                AbstractC11988u PRIVATE_TO_THIS = C11974t.f30967b;
                C9612q.m13918g(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                AbstractC11988u PROTECTED = C11974t.f30968c;
                C9612q.m13918g(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                AbstractC11988u PUBLIC = C11974t.f30970e;
                C9612q.m13918g(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                AbstractC11988u LOCAL = C11974t.f30971f;
                C9612q.m13918g(LOCAL, "LOCAL");
                return LOCAL;
            default:
                AbstractC11988u PRIVATE2 = C11974t.f30966a;
                C9612q.m13918g(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    /* renamed from: b */
    public static final InterfaceC11902b.EnumC11903a m24182b(C5910a0 c5910a0, EnumC9415j enumC9415j) {
        int i;
        C9612q.m13917h(c5910a0, "<this>");
        if (enumC9415j == null) {
            i = -1;
        } else {
            i = C5914a.f16872a[enumC9415j.ordinal()];
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return InterfaceC11902b.EnumC11903a.DECLARATION;
                    }
                    return InterfaceC11902b.EnumC11903a.SYNTHESIZED;
                }
                return InterfaceC11902b.EnumC11903a.DELEGATION;
            }
            return InterfaceC11902b.EnumC11903a.FAKE_OVERRIDE;
        }
        return InterfaceC11902b.EnumC11903a.DECLARATION;
    }
}