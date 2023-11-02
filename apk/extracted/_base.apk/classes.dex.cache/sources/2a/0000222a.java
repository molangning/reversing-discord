package com.facebook.hermes.intl;

import android.icu.text.MeasureFormat;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import java.text.AttributedCharacterIterator;
import p128h4.C6947l;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC3662c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.hermes.intl.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3663a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10158a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10159b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10160c;

        /* renamed from: d */
        static final /* synthetic */ int[] f10161d;

        /* renamed from: e */
        static final /* synthetic */ int[] f10162e;

        /* renamed from: f */
        static final /* synthetic */ int[] f10163f;

        /* renamed from: g */
        static final /* synthetic */ int[] f10164g;

        static {
            int[] iArr = new int[EnumC3666d.values().length];
            f10164g = iArr;
            try {
                iArr[EnumC3666d.ACCOUNTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10164g[EnumC3666d.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC3665c.values().length];
            f10163f = iArr2;
            try {
                iArr2[EnumC3665c.SYMBOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10163f[EnumC3665c.NARROWSYMBOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10163f[EnumC3665c.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10163f[EnumC3665c.NAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[EnumC3671i.values().length];
            f10162e = iArr3;
            try {
                iArr3[EnumC3671i.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10162e[EnumC3671i.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10162e[EnumC3671i.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[EnumC3669g.values().length];
            f10161d = iArr4;
            try {
                iArr4[EnumC3669g.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10161d[EnumC3669g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10161d[EnumC3669g.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10161d[EnumC3669g.EXCEPTZERO.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr5 = new int[EnumC3664b.values().length];
            f10160c = iArr5;
            try {
                iArr5[EnumC3664b.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10160c[EnumC3664b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr6 = new int[EnumC3667e.values().length];
            f10159b = iArr6;
            try {
                iArr6[EnumC3667e.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10159b[EnumC3667e.SCIENTIFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10159b[EnumC3667e.ENGINEERING.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10159b[EnumC3667e.COMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            int[] iArr7 = new int[EnumC3670h.values().length];
            f10158a = iArr7;
            try {
                iArr7[EnumC3670h.DECIMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10158a[EnumC3670h.PERCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10158a[EnumC3670h.CURRENCY.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10158a[EnumC3670h.UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3664b {
        SHORT,
        LONG;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10160c[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "long";
                }
                throw new IllegalArgumentException();
            }
            return "short";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3665c {
        SYMBOL,
        NARROWSYMBOL,
        CODE,
        NAME;

        /* renamed from: a */
        public int m31310a() {
            return C3663a.f10163f[ordinal()] != 4 ? 0 : 1;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10163f[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return ZeroconfModule.KEY_SERVICE_NAME;
                        }
                        throw new IllegalArgumentException();
                    }
                    return "code";
                }
                return "narrowSymbol";
            }
            return "symbol";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3666d {
        STANDARD,
        ACCOUNTING;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10164g[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "standard";
                }
                throw new IllegalArgumentException();
            }
            return "accounting";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3667e {
        STANDARD,
        SCIENTIFIC,
        ENGINEERING,
        COMPACT;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10159b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "compact";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "engineering";
                }
                return "scientific";
            }
            return "standard";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3668f {
        SIGNIFICANT_DIGITS,
        FRACTION_DIGITS,
        COMPACT_ROUNDING
    }

    /* renamed from: com.facebook.hermes.intl.c$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3669g {
        AUTO,
        ALWAYS,
        NEVER,
        EXCEPTZERO;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10161d[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "exceptZero";
                        }
                        throw new IllegalArgumentException();
                    }
                    return ReactScrollViewHelper.OVER_SCROLL_NEVER;
                }
                return ReactScrollViewHelper.OVER_SCROLL_ALWAYS;
            }
            return "auto";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3670h {
        DECIMAL,
        PERCENT,
        CURRENCY,
        UNIT;

        /* renamed from: a */
        public int m31309a(EnumC3667e enumC3667e, EnumC3666d enumC3666d) {
            int i = C3663a.f10158a[ordinal()];
            if (i == 2) {
                return 2;
            }
            if (i != 3) {
                if (enumC3667e == EnumC3667e.SCIENTIFIC || enumC3667e == EnumC3667e.ENGINEERING) {
                    return 3;
                }
                return 0;
            } else if (enumC3666d == EnumC3666d.ACCOUNTING) {
                return 7;
            } else {
                if (enumC3666d == EnumC3666d.STANDARD) {
                    return 1;
                }
                throw new C6947l("Unrecognized formatting style requested.");
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10158a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return "unit";
                        }
                        throw new IllegalArgumentException();
                    }
                    return "currency";
                }
                return "percent";
            }
            return "decimal";
        }
    }

    /* renamed from: com.facebook.hermes.intl.c$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3671i {
        SHORT,
        NARROW,
        LONG;

        /* renamed from: a */
        public MeasureFormat.FormatWidth m31308a() {
            MeasureFormat.FormatWidth formatWidth;
            MeasureFormat.FormatWidth formatWidth2;
            MeasureFormat.FormatWidth formatWidth3;
            int i = C3663a.f10162e[ordinal()];
            if (i != 2) {
                if (i != 3) {
                    formatWidth3 = MeasureFormat.FormatWidth.SHORT;
                    return formatWidth3;
                }
                formatWidth2 = MeasureFormat.FormatWidth.WIDE;
                return formatWidth2;
            }
            formatWidth = MeasureFormat.FormatWidth.NARROW;
            return formatWidth;
        }

        @Override // java.lang.Enum
        public String toString() {
            int i = C3663a.f10162e[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "long";
                    }
                    throw new IllegalArgumentException();
                }
                return "narrow";
            }
            return "short";
        }
    }

    /* renamed from: a */
    AttributedCharacterIterator mo31227a(double d);

    /* renamed from: b */
    String mo31226b(double d);

    /* renamed from: c */
    String mo31225c(InterfaceC6895b<?> interfaceC6895b);

    /* renamed from: d */
    InterfaceC3662c mo31224d(String str, EnumC3665c enumC3665c);

    /* renamed from: e */
    InterfaceC3662c mo31223e(EnumC3668f enumC3668f, int i, int i2);

    /* renamed from: f */
    InterfaceC3662c mo31222f(int i);

    /* renamed from: g */
    InterfaceC3662c mo31221g(boolean z);

    /* renamed from: h */
    InterfaceC3662c mo31220h(EnumC3668f enumC3668f, int i, int i2);

    /* renamed from: i */
    InterfaceC3662c mo31219i(String str, EnumC3671i enumC3671i);

    /* renamed from: j */
    InterfaceC3662c mo31218j(EnumC3669g enumC3669g);

    /* renamed from: k */
    String mo31217k(AttributedCharacterIterator.Attribute attribute, double d);

    /* renamed from: l */
    InterfaceC3662c mo31216l(InterfaceC6895b<?> interfaceC6895b, String str, EnumC3670h enumC3670h, EnumC3666d enumC3666d, EnumC3667e enumC3667e, EnumC3664b enumC3664b);
}