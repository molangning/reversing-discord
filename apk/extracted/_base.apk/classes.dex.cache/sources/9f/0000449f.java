package net.time4j.history;

import net.time4j.base.C10616c;
import p162ij.InterfaceC7649i;

/* renamed from: net.time4j.history.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC10744j implements InterfaceC7649i {
    BC,
    AD,
    HISPANIC,
    BYZANTINE,
    AB_URBE_CONDITA;

    /* renamed from: net.time4j.history.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static /* synthetic */ class C10745a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28062a;

        static {
            int[] iArr = new int[EnumC10744j.values().length];
            f28062a = iArr;
            try {
                iArr[EnumC10744j.BC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28062a[EnumC10744j.AD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28062a[EnumC10744j.HISPANIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28062a[EnumC10744j.BYZANTINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f28062a[EnumC10744j.AB_URBE_CONDITA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: a */
    public int m10367a(int i) {
        try {
            int i2 = C10745a.f28062a[ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return C10616c.m11030l(i, 753);
                            }
                            throw new UnsupportedOperationException(name());
                        }
                        return C10616c.m11030l(i, 5508);
                    }
                    return C10616c.m11030l(i, 38);
                }
                return i;
            }
            return C10616c.m11030l(1, i);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i);
        }
    }

    /* renamed from: b */
    public int m10366b(EnumC10744j enumC10744j, int i) {
        int m10367a = enumC10744j.m10367a(i);
        try {
            int i2 = C10745a.f28062a[ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                return C10616c.m11037e(m10367a, 753);
                            }
                            throw new UnsupportedOperationException(name());
                        }
                        return C10616c.m11037e(m10367a, 5508);
                    }
                    return C10616c.m11037e(m10367a, 38);
                }
                return m10367a;
            }
            return C10616c.m11030l(1, m10367a);
        } catch (ArithmeticException unused) {
            throw new IllegalArgumentException("Out of range: " + i);
        }
    }
}