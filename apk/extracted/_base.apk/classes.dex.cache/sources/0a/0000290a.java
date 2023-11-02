package com.facebook.yoga;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class YogaValue {

    /* renamed from: c */
    static final YogaValue f11090c = new YogaValue(Float.NaN, YogaUnit.UNDEFINED);

    /* renamed from: d */
    static final YogaValue f11091d = new YogaValue(0.0f, YogaUnit.POINT);

    /* renamed from: e */
    static final YogaValue f11092e = new YogaValue(Float.NaN, YogaUnit.AUTO);

    /* renamed from: a */
    public final float f11093a;

    /* renamed from: b */
    public final YogaUnit f11094b;

    /* renamed from: com.facebook.yoga.YogaValue$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C4336a {

        /* renamed from: a */
        static final /* synthetic */ int[] f11095a;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            f11095a = iArr;
            try {
                iArr[YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11095a[YogaUnit.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11095a[YogaUnit.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f11095a[YogaUnit.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f, YogaUnit yogaUnit) {
        this.f11093a = f;
        this.f11094b = yogaUnit;
    }

    /* renamed from: a */
    public static YogaValue m29977a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f11090c;
        }
        if ("auto".equals(str)) {
            return f11092e;
        }
        if (str.endsWith("%")) {
            return new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT);
        }
        return new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YogaValue)) {
            return false;
        }
        YogaValue yogaValue = (YogaValue) obj;
        YogaUnit yogaUnit = this.f11094b;
        if (yogaUnit != yogaValue.f11094b) {
            return false;
        }
        if (yogaUnit != YogaUnit.UNDEFINED && yogaUnit != YogaUnit.AUTO && Float.compare(this.f11093a, yogaValue.f11093a) != 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f11093a) + this.f11094b.m29978b();
    }

    public String toString() {
        int i = C4336a.f11095a[this.f11094b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "auto";
                    }
                    throw new IllegalStateException();
                }
                return this.f11093a + "%";
            }
            return Float.toString(this.f11093a);
        }
        return "undefined";
    }

    public YogaValue(float f, int i) {
        this(f, YogaUnit.m29979a(i));
    }
}