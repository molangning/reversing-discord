package com.facebook.hermes.intl;

import android.icu.text.CompactDecimalFormat;
import android.icu.text.DecimalFormat;
import android.icu.text.DecimalFormatSymbols;
import android.icu.text.MeasureFormat;
import android.icu.text.NumberFormat;
import android.icu.text.NumberingSystem;
import android.icu.util.Currency;
import android.icu.util.Measure;
import android.icu.util.MeasureUnit;
import android.icu.util.ULocale;
import com.facebook.hermes.intl.InterfaceC3662c;
import java.text.AttributedCharacterIterator;
import java.text.Format;
import java.util.ArrayList;
import java.util.Set;
import p128h4.C6935j;
import p128h4.C6947l;
import p128h4.C7014z;
import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3695q implements InterfaceC3662c {

    /* renamed from: a */
    private Format f10257a;

    /* renamed from: b */
    private android.icu.text.NumberFormat f10258b;

    /* renamed from: c */
    private C7014z f10259c;

    /* renamed from: d */
    private InterfaceC3662c.EnumC3670h f10260d;

    /* renamed from: e */
    private MeasureUnit f10261e;

    /* renamed from: com.facebook.hermes.intl.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C3696a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10262a;

        static {
            int[] iArr = new int[InterfaceC3662c.EnumC3669g.values().length];
            f10262a = iArr;
            try {
                iArr[InterfaceC3662c.EnumC3669g.NEVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10262a[InterfaceC3662c.EnumC3669g.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10262a[InterfaceC3662c.EnumC3669g.EXCEPTZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: n */
    public static int m31214n(String str) {
        Currency currency;
        int defaultFractionDigits;
        try {
            currency = Currency.getInstance(str);
            defaultFractionDigits = currency.getDefaultFractionDigits();
            return defaultFractionDigits;
        } catch (IllegalArgumentException unused) {
            throw new C6947l("Invalid currency code !");
        }
    }

    /* renamed from: o */
    private void m31213o(android.icu.text.NumberFormat numberFormat, InterfaceC6895b<?> interfaceC6895b, InterfaceC3662c.EnumC3670h enumC3670h) {
        this.f10258b = numberFormat;
        this.f10257a = numberFormat;
        this.f10259c = (C7014z) interfaceC6895b;
        this.f10260d = enumC3670h;
        numberFormat.setRoundingMode(4);
    }

    /* renamed from: p */
    private static MeasureUnit m31212p(String str) {
        Set<MeasureUnit> available;
        String subtype;
        String subtype2;
        String type;
        available = MeasureUnit.getAvailable();
        for (MeasureUnit measureUnit : available) {
            subtype = measureUnit.getSubtype();
            if (!subtype.equals(str)) {
                subtype2 = measureUnit.getSubtype();
                StringBuilder sb2 = new StringBuilder();
                type = measureUnit.getType();
                sb2.append(type);
                sb2.append("-");
                sb2.append(str);
                if (subtype2.equals(sb2.toString())) {
                }
            }
            return measureUnit;
        }
        throw new C6947l("Unknown unit: " + str);
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: a */
    public AttributedCharacterIterator mo31227a(double d) {
        ULocale forLanguageTag;
        android.icu.text.NumberFormat numberFormat;
        AttributedCharacterIterator formatToCharacterIterator;
        ULocale forLanguageTag2;
        android.icu.text.NumberFormat numberFormat2;
        AttributedCharacterIterator formatToCharacterIterator2;
        ULocale uLocale;
        android.icu.text.NumberFormat numberFormat3;
        AttributedCharacterIterator formatToCharacterIterator3;
        try {
            try {
                Format format = this.f10257a;
                if ((format instanceof MeasureFormat) && this.f10261e != null) {
                    return format.formatToCharacterIterator(new Measure(Double.valueOf(d), this.f10261e));
                }
                return format.formatToCharacterIterator(Double.valueOf(d));
            } catch (NumberFormatException unused) {
                uLocale = ULocale.getDefault();
                numberFormat3 = android.icu.text.NumberFormat.getInstance(uLocale);
                formatToCharacterIterator3 = numberFormat3.formatToCharacterIterator(Double.valueOf(d));
                return formatToCharacterIterator3;
            } catch (Exception unused2) {
                forLanguageTag2 = ULocale.forLanguageTag("en");
                numberFormat2 = android.icu.text.NumberFormat.getInstance(forLanguageTag2);
                formatToCharacterIterator2 = numberFormat2.formatToCharacterIterator(Double.valueOf(d));
                return formatToCharacterIterator2;
            }
        } catch (RuntimeException unused3) {
            forLanguageTag = ULocale.forLanguageTag("en");
            numberFormat = android.icu.text.NumberFormat.getInstance(forLanguageTag);
            formatToCharacterIterator = numberFormat.formatToCharacterIterator(Double.valueOf(d));
            return formatToCharacterIterator;
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: b */
    public String mo31226b(double d) {
        ULocale forLanguageTag;
        android.icu.text.NumberFormat numberFormat;
        String format;
        ULocale uLocale;
        android.icu.text.NumberFormat numberFormat2;
        String format2;
        try {
            try {
                Format format3 = this.f10257a;
                if ((format3 instanceof MeasureFormat) && this.f10261e != null) {
                    return format3.format(new Measure(Double.valueOf(d), this.f10261e));
                }
                return format3.format(Double.valueOf(d));
            } catch (RuntimeException unused) {
                forLanguageTag = ULocale.forLanguageTag("en");
                numberFormat = android.icu.text.NumberFormat.getInstance(forLanguageTag);
                format = numberFormat.format(d);
                return format;
            }
        } catch (NumberFormatException unused2) {
            uLocale = ULocale.getDefault();
            numberFormat2 = android.icu.text.NumberFormat.getInstance(uLocale);
            format2 = numberFormat2.format(d);
            return format2;
        }
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: c */
    public String mo31225c(InterfaceC6895b<?> interfaceC6895b) {
        NumberingSystem numberingSystem;
        String name;
        numberingSystem = NumberingSystem.getInstance((ULocale) interfaceC6895b.mo21544h());
        name = numberingSystem.getName();
        return name;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: k */
    public String mo31217k(AttributedCharacterIterator.Attribute attribute, double d) {
        NumberFormat.Field field;
        NumberFormat.Field field2;
        NumberFormat.Field field3;
        NumberFormat.Field field4;
        NumberFormat.Field field5;
        NumberFormat.Field field6;
        NumberFormat.Field field7;
        NumberFormat.Field field8;
        NumberFormat.Field field9;
        NumberFormat.Field field10;
        NumberFormat.Field field11;
        field = NumberFormat.Field.SIGN;
        if (attribute == field) {
            if (Double.compare(d, 0.0d) >= 0) {
                return "plusSign";
            }
            return "minusSign";
        }
        field2 = NumberFormat.Field.INTEGER;
        if (attribute == field2) {
            if (Double.isNaN(d)) {
                return "nan";
            }
            if (Double.isInfinite(d)) {
                return "infinity";
            }
            return "integer";
        }
        field3 = NumberFormat.Field.FRACTION;
        if (attribute == field3) {
            return "fraction";
        }
        field4 = NumberFormat.Field.EXPONENT;
        if (attribute == field4) {
            return "exponentInteger";
        }
        field5 = NumberFormat.Field.EXPONENT_SIGN;
        if (attribute == field5) {
            return "exponentMinusSign";
        }
        field6 = NumberFormat.Field.EXPONENT_SYMBOL;
        if (attribute == field6) {
            return "exponentSeparator";
        }
        field7 = NumberFormat.Field.DECIMAL_SEPARATOR;
        if (attribute == field7) {
            return "decimal";
        }
        field8 = NumberFormat.Field.GROUPING_SEPARATOR;
        if (attribute == field8) {
            return "group";
        }
        field9 = NumberFormat.Field.PERCENT;
        if (attribute == field9) {
            return "percentSign";
        }
        field10 = NumberFormat.Field.PERMILLE;
        if (attribute == field10) {
            return "permilleSign";
        }
        field11 = NumberFormat.Field.CURRENCY;
        if (attribute == field11) {
            return "currency";
        }
        if (attribute.toString().equals("android.icu.text.NumberFormat$Field(compact)")) {
            return "compact";
        }
        return "literal";
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: m */
    public C3695q mo31216l(InterfaceC6895b<?> interfaceC6895b, String str, InterfaceC3662c.EnumC3670h enumC3670h, InterfaceC3662c.EnumC3666d enumC3666d, InterfaceC3662c.EnumC3667e enumC3667e, InterfaceC3662c.EnumC3664b enumC3664b) {
        NumberingSystem instanceByName;
        android.icu.text.NumberFormat numberFormat;
        CompactDecimalFormat.CompactStyle compactStyle;
        CompactDecimalFormat compactDecimalFormat;
        if (!str.isEmpty()) {
            try {
                instanceByName = NumberingSystem.getInstanceByName(C6935j.m21637h(str));
                if (instanceByName != null) {
                    ArrayList<String> arrayList = new ArrayList<>();
                    arrayList.add(C6935j.m21637h(str));
                    interfaceC6895b.mo21546f("nu", arrayList);
                } else {
                    throw new C6947l("Invalid numbering system: " + str);
                }
            } catch (RuntimeException unused) {
                throw new C6947l("Invalid numbering system: " + str);
            }
        }
        if (enumC3667e == InterfaceC3662c.EnumC3667e.COMPACT && (enumC3670h == InterfaceC3662c.EnumC3670h.DECIMAL || enumC3670h == InterfaceC3662c.EnumC3670h.UNIT)) {
            if (enumC3664b == InterfaceC3662c.EnumC3664b.SHORT) {
                compactStyle = CompactDecimalFormat.CompactStyle.SHORT;
            } else {
                compactStyle = CompactDecimalFormat.CompactStyle.LONG;
            }
            compactDecimalFormat = CompactDecimalFormat.getInstance((ULocale) interfaceC6895b.mo21544h(), compactStyle);
            m31213o(compactDecimalFormat, interfaceC6895b, enumC3670h);
        } else {
            numberFormat = android.icu.text.NumberFormat.getInstance((ULocale) interfaceC6895b.mo21544h(), enumC3670h.m31309a(enumC3667e, enumC3666d));
            if (enumC3667e == InterfaceC3662c.EnumC3667e.ENGINEERING) {
                numberFormat.setMaximumIntegerDigits(3);
            }
            m31213o(numberFormat, interfaceC6895b, enumC3670h);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: q */
    public C3695q mo31224d(String str, InterfaceC3662c.EnumC3665c enumC3665c) {
        Currency currency;
        DecimalFormatSymbols decimalFormatSymbols;
        if (this.f10260d == InterfaceC3662c.EnumC3670h.CURRENCY) {
            currency = Currency.getInstance(str);
            this.f10258b.setCurrency(currency);
            if (enumC3665c != InterfaceC3662c.EnumC3665c.CODE) {
                str = currency.getName(this.f10259c.mo21544h(), enumC3665c.m31310a(), (boolean[]) null);
            }
            android.icu.text.NumberFormat numberFormat = this.f10258b;
            if (numberFormat instanceof DecimalFormat) {
                DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
                decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
                decimalFormatSymbols.setCurrencySymbol(str);
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: r */
    public C3695q mo31220h(InterfaceC3662c.EnumC3668f enumC3668f, int i, int i2) {
        if (enumC3668f == InterfaceC3662c.EnumC3668f.FRACTION_DIGITS) {
            if (i >= 0) {
                this.f10258b.setMinimumFractionDigits(i);
            }
            if (i2 >= 0) {
                this.f10258b.setMaximumFractionDigits(i2);
            }
            android.icu.text.NumberFormat numberFormat = this.f10258b;
            if (numberFormat instanceof DecimalFormat) {
                ((DecimalFormat) numberFormat).setSignificantDigitsUsed(false);
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: s */
    public C3695q mo31221g(boolean z) {
        this.f10258b.setGroupingUsed(z);
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: t */
    public C3695q mo31222f(int i) {
        if (i != -1) {
            this.f10258b.setMinimumIntegerDigits(i);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: u */
    public C3695q mo31218j(InterfaceC3662c.EnumC3669g enumC3669g) {
        DecimalFormatSymbols decimalFormatSymbols;
        String negativePrefix;
        String negativeSuffix;
        char plusSign;
        char plusSign2;
        android.icu.text.NumberFormat numberFormat = this.f10258b;
        if (numberFormat instanceof DecimalFormat) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
            int i = C3696a.f10262a[enumC3669g.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    negativePrefix = decimalFormat.getNegativePrefix();
                    if (!negativePrefix.isEmpty()) {
                        plusSign2 = decimalFormatSymbols.getPlusSign();
                        decimalFormat.setPositivePrefix(new String(new char[]{plusSign2}));
                    }
                    negativeSuffix = decimalFormat.getNegativeSuffix();
                    if (!negativeSuffix.isEmpty()) {
                        plusSign = decimalFormatSymbols.getPlusSign();
                        decimalFormat.setPositiveSuffix(new String(new char[]{plusSign}));
                    }
                }
            } else {
                decimalFormat.setPositivePrefix("");
                decimalFormat.setPositiveSuffix("");
                decimalFormat.setNegativePrefix("");
                decimalFormat.setNegativeSuffix("");
            }
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: v */
    public C3695q mo31223e(InterfaceC3662c.EnumC3668f enumC3668f, int i, int i2) {
        int minimumSignificantDigits;
        android.icu.text.NumberFormat numberFormat = this.f10258b;
        if ((numberFormat instanceof DecimalFormat) && enumC3668f == InterfaceC3662c.EnumC3668f.SIGNIFICANT_DIGITS) {
            DecimalFormat decimalFormat = (DecimalFormat) numberFormat;
            if (i >= 0) {
                decimalFormat.setMinimumSignificantDigits(i);
            }
            if (i2 >= 0) {
                minimumSignificantDigits = decimalFormat.getMinimumSignificantDigits();
                if (i2 >= minimumSignificantDigits) {
                    decimalFormat.setMaximumSignificantDigits(i2);
                } else {
                    throw new C6947l("maximumSignificantDigits should be at least equal to minimumSignificantDigits");
                }
            }
            decimalFormat.setSignificantDigitsUsed(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.InterfaceC3662c
    /* renamed from: w */
    public C3695q mo31219i(String str, InterfaceC3662c.EnumC3671i enumC3671i) {
        MeasureFormat measureFormat;
        if (this.f10260d == InterfaceC3662c.EnumC3670h.UNIT) {
            this.f10261e = m31212p(str);
            measureFormat = MeasureFormat.getInstance(this.f10259c.mo21544h(), enumC3671i.m31308a(), this.f10258b);
            this.f10257a = measureFormat;
        }
        return this;
    }
}