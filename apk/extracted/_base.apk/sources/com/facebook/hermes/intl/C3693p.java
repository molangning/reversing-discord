package com.facebook.hermes.intl;

import com.facebook.hermes.intl.InterfaceC3662c;
import java.math.RoundingMode;
import java.text.AttributedCharacterIterator;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.util.Currency;
import java.util.Locale;
import p128h4.C6947l;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3693p implements InterfaceC3662c {

    /* renamed from: a */
    private Format f10252a;

    /* renamed from: b */
    private DecimalFormat f10253b;

    /* renamed from: c */
    private C3679h f10254c;

    /* renamed from: d */
    private InterfaceC3662c.EnumC3670h f10255d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.hermes.intl.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3694a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10256a;

        static {
            int[] iArr = new int[InterfaceC3662c.EnumC3665c.values().length];
            f10256a = iArr;
            try {
                iArr[InterfaceC3662c.EnumC3665c.NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10256a[InterfaceC3662c.EnumC3665c.CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10256a[InterfaceC3662c.EnumC3665c.SYMBOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10256a[InterfaceC3662c.EnumC3665c.NARROWSYMBOL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: n */
    public static int m31236n(String str) {
        try {
            return Currency.getInstance(str).getDefaultFractionDigits();
        } catch (IllegalArgumentException unused) {
            throw new C6947l("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m31235o(DecimalFormat decimalFormat, InterfaceC6895b<?> interfaceC6895b, InterfaceC3662c.EnumC3670h enumC3670h) {
        this.f10253b = decimalFormat;
        this.f10252a = decimalFormat;
        this.f10254c = (C3679h) interfaceC6895b;
        this.f10255d = enumC3670h;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: a */
    public AttributedCharacterIterator mo31227a(double d) {
        return this.f10252a.formatToCharacterIterator(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: b */
    public String mo31226b(double d) {
        return this.f10252a.format(Double.valueOf(d));
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: c */
    public String mo31225c(InterfaceC6895b<?> interfaceC6895b) {
        return "latn";
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: k */
    public String mo31217k(AttributedCharacterIterator.Attribute attribute, double d) {
        return "literal";
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: m */
    public C3693p mo31216l(InterfaceC6895b<?> interfaceC6895b, String str, InterfaceC3662c.EnumC3670h enumC3670h, InterfaceC3662c.EnumC3666d enumC3666d, InterfaceC3662c.EnumC3667e enumC3667e, InterfaceC3662c.EnumC3664b enumC3664b) {
        java.text.NumberFormat numberFormat = java.text.NumberFormat.getInstance((Locale) interfaceC6895b.mo21544h());
        numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        m31235o((DecimalFormat) numberFormat, interfaceC6895b, enumC3670h);
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: p */
    public C3693p mo31224d(String str, InterfaceC3662c.EnumC3665c enumC3665c) {
        if (this.f10255d == InterfaceC3662c.EnumC3670h.CURRENCY) {
            Currency currency = Currency.getInstance(str);
            this.f10253b.setCurrency(currency);
            int i = C3694a.f10256a[enumC3665c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    str = currency.getSymbol(this.f10254c.mo21544h());
                }
            } else {
                str = currency.getDisplayName(this.f10254c.mo21544h());
            }
            DecimalFormatSymbols decimalFormatSymbols = this.f10253b.getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(str);
            this.f10253b.setDecimalFormatSymbols(decimalFormatSymbols);
            this.f10253b.getDecimalFormatSymbols().setCurrencySymbol(str);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: q */
    public C3693p mo31220h(InterfaceC3662c.EnumC3668f enumC3668f, int i, int i2) {
        if (enumC3668f == InterfaceC3662c.EnumC3668f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f10253b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f10253b.setMaximumFractionDigits(i2);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: r */
    public C3693p mo31221g(boolean z) {
        this.f10253b.setGroupingUsed(z);
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: s */
    public C3693p mo31222f(int i) {
        if (i != -1) {
            this.f10253b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: t */
    public C3693p mo31218j(InterfaceC3662c.EnumC3669g enumC3669g) {
        if (enumC3669g == InterfaceC3662c.EnumC3669g.NEVER) {
            this.f10253b.setPositivePrefix("");
            this.f10253b.setPositiveSuffix("");
            this.f10253b.setNegativePrefix("");
            this.f10253b.setNegativeSuffix("");
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: u */
    public C3693p mo31223e(InterfaceC3662c.EnumC3668f enumC3668f, int i, int i2) {
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: v */
    public C3693p mo31219i(String str, InterfaceC3662c.EnumC3671i enumC3671i) {
        return this;
    }
}
