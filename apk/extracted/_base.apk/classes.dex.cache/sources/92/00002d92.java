package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class SVGLength {

    /* renamed from: a */
    final double f14534a;

    /* renamed from: b */
    final UnitType f14535b;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    /* renamed from: com.horcrux.svg.SVGLength$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5169a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14542a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f14542a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14542a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14542a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f14534a = 0.0d;
        this.f14535b = UnitType.UNKNOWN;
    }

    /* renamed from: a */
    public static ArrayList<SVGLength> m26000a(Dynamic dynamic) {
        int i = C5169a.f14542a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                ReadableArray asArray = dynamic.asArray();
                int size = asArray.size();
                ArrayList<SVGLength> arrayList = new ArrayList<>(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(m25998c(asArray.getDynamic(i2)));
                }
                return arrayList;
            }
            ArrayList<SVGLength> arrayList2 = new ArrayList<>(1);
            arrayList2.add(new SVGLength(dynamic.asString()));
            return arrayList2;
        }
        ArrayList<SVGLength> arrayList3 = new ArrayList<>(1);
        arrayList3.add(new SVGLength(dynamic.asDouble()));
        return arrayList3;
    }

    /* renamed from: b */
    public static ArrayList<SVGLength> m25999b(ReadableArray readableArray) {
        int size = readableArray.size();
        ArrayList<SVGLength> arrayList = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(m25998c(readableArray.getDynamic(i)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public static SVGLength m25998c(Dynamic dynamic) {
        int i = C5169a.f14542a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return new SVGLength();
            }
            return new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    /* renamed from: d */
    public static SVGLength m25997d(Double d) {
        return d != null ? new SVGLength(d.doubleValue()) : new SVGLength();
    }

    /* renamed from: e */
    public static SVGLength m25996e(String str) {
        return str != null ? new SVGLength(str) : new SVGLength();
    }

    /* renamed from: f */
    public static String m25995f(Dynamic dynamic) {
        int i = C5169a.f14542a[dynamic.getType().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return dynamic.asString();
        }
        return String.valueOf(dynamic.asDouble());
    }

    public SVGLength(double d) {
        this.f14534a = d;
        this.f14535b = UnitType.NUMBER;
    }

    private SVGLength(String str) {
        String trim = str.trim();
        int length = trim.length();
        int i = length - 1;
        if (length != 0 && !trim.equals("normal")) {
            if (trim.codePointAt(i) == 37) {
                this.f14535b = UnitType.PERCENTAGE;
                this.f14534a = Double.valueOf(trim.substring(0, i)).doubleValue();
                return;
            }
            int i2 = length - 2;
            if (i2 > 0) {
                String substring = trim.substring(i2);
                substring.hashCode();
                char c = 65535;
                switch (substring.hashCode()) {
                    case 3178:
                        if (substring.equals("cm")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3240:
                        if (substring.equals("em")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3251:
                        if (substring.equals("ex")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3365:
                        if (substring.equals("in")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3488:
                        if (substring.equals("mm")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 3571:
                        if (substring.equals("pc")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3588:
                        if (substring.equals("pt")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3592:
                        if (substring.equals("px")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.f14535b = UnitType.CM;
                        length = i2;
                        break;
                    case 1:
                        this.f14535b = UnitType.EMS;
                        length = i2;
                        break;
                    case 2:
                        this.f14535b = UnitType.EXS;
                        length = i2;
                        break;
                    case 3:
                        this.f14535b = UnitType.IN;
                        length = i2;
                        break;
                    case 4:
                        this.f14535b = UnitType.MM;
                        length = i2;
                        break;
                    case 5:
                        this.f14535b = UnitType.PC;
                        length = i2;
                        break;
                    case 6:
                        this.f14535b = UnitType.PT;
                        length = i2;
                        break;
                    case 7:
                        this.f14535b = UnitType.NUMBER;
                        length = i2;
                        break;
                    default:
                        this.f14535b = UnitType.NUMBER;
                        break;
                }
                this.f14534a = Double.valueOf(trim.substring(0, length)).doubleValue();
                return;
            }
            this.f14535b = UnitType.NUMBER;
            this.f14534a = Double.valueOf(trim).doubleValue();
            return;
        }
        this.f14535b = UnitType.UNKNOWN;
        this.f14534a = 0.0d;
    }
}