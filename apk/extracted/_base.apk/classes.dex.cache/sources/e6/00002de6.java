package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* renamed from: com.horcrux.svg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5243t {

    /* renamed from: a */
    static float f14831a;

    /* renamed from: b */
    private static int f14832b;

    /* renamed from: c */
    private static int f14833c;

    /* renamed from: d */
    private static String f14834d;

    /* renamed from: e */
    private static Path f14835e;

    /* renamed from: f */
    static ArrayList<C5241s> f14836f;

    /* renamed from: g */
    private static float f14837g;

    /* renamed from: h */
    private static float f14838h;

    /* renamed from: i */
    private static float f14839i;

    /* renamed from: j */
    private static float f14840j;

    /* renamed from: k */
    private static float f14841k;

    /* renamed from: l */
    private static float f14842l;

    /* renamed from: m */
    private static boolean f14843m;

    /* renamed from: A */
    private static void m25752A(float f, float f2, float f3, float f4) {
        f14839i = f;
        f14840j = f2;
        m25745e((f14837g * 2.0f) - f14839i, (f14838h * 2.0f) - f14840j, f, f2, f3, f4);
    }

    /* renamed from: B */
    private static void m25751B(float f, float f2) {
        m25750C(f + f14837g, f2 + f14838h);
    }

    /* renamed from: C */
    private static void m25750C(float f, float f2) {
        m25729u((f14837g * 2.0f) - f14839i, (f14838h * 2.0f) - f14840j, f, f2);
    }

    /* renamed from: a */
    private static void m25749a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        m25748b(f, f2, f3, z, z2, f4 + f14837g, f5 + f14838h);
    }

    /* renamed from: b */
    private static void m25748b(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = f14837g;
        float f15 = f14838h;
        if (f2 == 0.0f) {
            if (f == 0.0f) {
                f6 = f5 - f15;
            } else {
                f6 = f;
            }
        } else {
            f6 = f2;
        }
        float abs = Math.abs(f6);
        if (f == 0.0f) {
            f7 = f4 - f14;
        } else {
            f7 = f;
        }
        float abs2 = Math.abs(f7);
        if (abs2 != 0.0f && abs != 0.0f && (f4 != f14 || f5 != f15)) {
            float radians = (float) Math.toRadians(f3);
            double d = radians;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f16 = f4 - f14;
            float f17 = f5 - f15;
            float f18 = ((cos * f16) / 2.0f) + ((sin * f17) / 2.0f);
            float f19 = -sin;
            float f20 = ((f19 * f16) / 2.0f) + ((cos * f17) / 2.0f);
            float f21 = abs2 * abs2;
            float f22 = abs * abs * f18 * f18;
            if ((((f21 * abs) * abs) - ((f21 * f20) * f20)) - f22 < 0.0f) {
                f11 = f19;
                float sqrt = (float) Math.sqrt(1.0f - (f10 / f8));
                abs2 *= sqrt;
                abs *= sqrt;
                f12 = f16 / 2.0f;
                f13 = f17 / 2.0f;
            } else {
                f11 = f19;
                float sqrt2 = (float) Math.sqrt(f10 / (f9 + f22));
                if (z == z2) {
                    sqrt2 = -sqrt2;
                }
                float f23 = (((-sqrt2) * f20) * abs2) / abs;
                float f24 = ((sqrt2 * f18) * abs) / abs2;
                f12 = ((cos * f23) - (sin * f24)) + (f16 / 2.0f);
                f13 = (f17 / 2.0f) + (f23 * sin) + (f24 * cos);
            }
            float f25 = cos / abs2;
            float f26 = sin / abs2;
            float f27 = f11 / abs;
            float f28 = cos / abs;
            float f29 = -f12;
            float f30 = -f13;
            float f31 = abs;
            float f32 = abs2;
            float atan2 = (float) Math.atan2((f27 * f29) + (f28 * f30), (f29 * f25) + (f30 * f26));
            float f33 = f16 - f12;
            float f34 = f17 - f13;
            float atan22 = (float) Math.atan2((f27 * f33) + (f28 * f34), (f25 * f33) + (f26 * f34));
            float f35 = f12 + f14;
            float f36 = f13 + f15;
            float f37 = f16 + f14;
            float f38 = f17 + f15;
            m25727w();
            f14839i = f37;
            f14837g = f37;
            f14840j = f38;
            f14838h = f38;
            if (f32 == f31 && radians == 0.0f) {
                float degrees = (float) Math.toDegrees(atan2);
                float abs3 = Math.abs((degrees - ((float) Math.toDegrees(atan22))) % 360.0f);
                if (!z ? abs3 > 180.0f : abs3 < 180.0f) {
                    abs3 = 360.0f - abs3;
                }
                if (!z2) {
                    abs3 = -abs3;
                }
                float f39 = f14831a;
                f14835e.arcTo(new RectF((f35 - f32) * f39, (f36 - f32) * f39, (f35 + f32) * f39, (f36 + f32) * f39), degrees, abs3);
                f14836f.add(new C5241s(EnumC5213f.kCGPathElementAddCurveToPoint, new C5249w[]{new C5249w(f37, f38)}));
                return;
            }
            m25747c(f35, f36, f32, f31, atan2, atan22, z2, radians);
            return;
        }
        m25738l(f4, f5);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[LOOP:0: B:28:0x0065->B:29:0x0067, LOOP_END] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m25747c(float r24, float r25, float r26, float r27, float r28, float r29, boolean r30, float r31) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5243t.m25747c(float, float, float, float, float, float, boolean, float):void");
    }

    /* renamed from: d */
    private static void m25746d() {
        if (f14843m) {
            f14837g = f14841k;
            f14838h = f14842l;
            f14843m = false;
            f14835e.close();
            f14836f.add(new C5241s(EnumC5213f.kCGPathElementCloseSubpath, new C5249w[]{new C5249w(f14837g, f14838h)}));
        }
    }

    /* renamed from: e */
    private static void m25745e(float f, float f2, float f3, float f4, float f5, float f6) {
        m25727w();
        f14837g = f5;
        f14838h = f6;
        Path path = f14835e;
        float f7 = f14831a;
        path.cubicTo(f * f7, f2 * f7, f3 * f7, f4 * f7, f5 * f7, f6 * f7);
        f14836f.add(new C5241s(EnumC5213f.kCGPathElementAddCurveToPoint, new C5249w[]{new C5249w(f, f2), new C5249w(f3, f4), new C5249w(f5, f6)}));
    }

    /* renamed from: f */
    private static void m25744f(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f14837g;
        float f8 = f14838h;
        m25743g(f + f7, f2 + f8, f3 + f7, f4 + f8, f5 + f7, f6 + f8);
    }

    /* renamed from: g */
    private static void m25743g(float f, float f2, float f3, float f4, float f5, float f6) {
        f14839i = f3;
        f14840j = f4;
        m25745e(f, f2, f3, f4, f5, f6);
    }

    /* renamed from: h */
    private static boolean m25742h(char c) {
        return Character.isUpperCase(c);
    }

    /* renamed from: i */
    private static boolean m25741i(char c) {
        switch (c) {
            case 'A':
            case 'C':
            case 'H':
            case 'L':
            case 'M':
            case 'Q':
            case 'S':
            case 'T':
            case 'V':
            case 'Z':
            case 'a':
            case 'c':
            case 'h':
            case 'l':
            case 'm':
            case 'q':
            case 's':
            case 't':
            case 'v':
            case 'z':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: j */
    private static boolean m25740j(char c) {
        return (c >= '0' && c <= '9') || c == '.' || c == '-' || c == '+';
    }

    /* renamed from: k */
    private static void m25739k(float f, float f2) {
        m25738l(f + f14837g, f2 + f14838h);
    }

    /* renamed from: l */
    private static void m25738l(float f, float f2) {
        m25727w();
        f14837g = f;
        f14839i = f;
        f14838h = f2;
        f14840j = f2;
        Path path = f14835e;
        float f3 = f14831a;
        path.lineTo(f * f3, f3 * f2);
        f14836f.add(new C5241s(EnumC5213f.kCGPathElementAddLineToPoint, new C5249w[]{new C5249w(f, f2)}));
    }

    /* renamed from: m */
    private static void m25737m(float f, float f2) {
        m25736n(f + f14837g, f2 + f14838h);
    }

    /* renamed from: n */
    private static void m25736n(float f, float f2) {
        f14837g = f;
        f14839i = f;
        f14841k = f;
        f14838h = f2;
        f14840j = f2;
        f14842l = f2;
        Path path = f14835e;
        float f3 = f14831a;
        path.moveTo(f * f3, f3 * f2);
        f14836f.add(new C5241s(EnumC5213f.kCGPathElementMoveToPoint, new C5249w[]{new C5249w(f, f2)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x002e A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Path m25735o(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5243t.m25735o(java.lang.String):android.graphics.Path");
    }

    /* renamed from: p */
    private static boolean m25734p() {
        m25725y();
        char charAt = f14834d.charAt(f14832b);
        if (charAt != '0' && charAt != '1') {
            throw new Error(String.format("Unexpected flag '%c' (i=%d, s=%s)", Character.valueOf(charAt), Integer.valueOf(f14832b), f14834d));
        }
        int i = f14832b + 1;
        f14832b = i;
        if (i < f14833c && f14834d.charAt(i) == ',') {
            f14832b++;
        }
        m25725y();
        if (charAt != '1') {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    private static float m25733q() {
        if (f14832b != f14833c) {
            float m25731s = m25731s();
            m25725y();
            m25732r();
            return m25731s;
        }
        throw new Error(String.format("Unexpected end (s=%s)", f14834d));
    }

    /* renamed from: r */
    private static void m25732r() {
        int i = f14832b;
        if (i < f14833c && f14834d.charAt(i) == ',') {
            f14832b++;
        }
    }

    /* renamed from: s */
    private static float m25731s() {
        char charAt;
        m25725y();
        int i = f14832b;
        if (i != f14833c) {
            char charAt2 = f14834d.charAt(i);
            if (charAt2 == '-' || charAt2 == '+') {
                int i2 = f14832b + 1;
                f14832b = i2;
                charAt2 = f14834d.charAt(i2);
            }
            if (charAt2 >= '0' && charAt2 <= '9') {
                m25726x();
                int i3 = f14832b;
                if (i3 < f14833c) {
                    charAt2 = f14834d.charAt(i3);
                }
            } else if (charAt2 != '.') {
                throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt2), Integer.valueOf(f14832b), f14834d));
            }
            if (charAt2 == '.') {
                f14832b++;
                m25726x();
                int i4 = f14832b;
                if (i4 < f14833c) {
                    charAt2 = f14834d.charAt(i4);
                }
            }
            if (charAt2 == 'e' || charAt2 == 'E') {
                int i5 = f14832b;
                if (i5 + 1 < f14833c && (charAt = f14834d.charAt(i5 + 1)) != 'm' && charAt != 'x') {
                    int i6 = f14832b + 1;
                    f14832b = i6;
                    char charAt3 = f14834d.charAt(i6);
                    if (charAt3 != '+' && charAt3 != '-') {
                        if (charAt3 >= '0' && charAt3 <= '9') {
                            m25726x();
                        } else {
                            throw new Error(String.format("Invalid number formating character '%c' (i=%d, s=%s)", Character.valueOf(charAt3), Integer.valueOf(f14832b), f14834d));
                        }
                    } else {
                        f14832b++;
                        m25726x();
                    }
                }
            }
            String substring = f14834d.substring(i, f14832b);
            float parseFloat = Float.parseFloat(substring);
            if (!Float.isInfinite(parseFloat) && !Float.isNaN(parseFloat)) {
                return parseFloat;
            }
            throw new Error(String.format("Invalid number '%s' (start=%d, i=%d, s=%s)", substring, Integer.valueOf(i), Integer.valueOf(f14832b), f14834d));
        }
        throw new Error(String.format("Unexpected end (s=%s)", f14834d));
    }

    /* renamed from: t */
    private static void m25730t(float f, float f2, float f3, float f4) {
        float f5 = f14837g;
        float f6 = f14838h;
        m25729u(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }

    /* renamed from: u */
    private static void m25729u(float f, float f2, float f3, float f4) {
        f14839i = f;
        f14840j = f2;
        float f5 = f * 2.0f;
        float f6 = f2 * 2.0f;
        float f7 = (f14837g + f5) / 3.0f;
        float f8 = (f14838h + f6) / 3.0f;
        m25745e(f7, f8, (f3 + f5) / 3.0f, (f4 + f6) / 3.0f, f3, f4);
    }

    /* renamed from: v */
    private static double m25728v(double d) {
        double pow = Math.pow(10.0d, 4.0d);
        return Math.round(d * pow) / pow;
    }

    /* renamed from: w */
    private static void m25727w() {
        if (!f14843m) {
            f14841k = f14837g;
            f14842l = f14838h;
            f14843m = true;
        }
    }

    /* renamed from: x */
    private static void m25726x() {
        while (true) {
            int i = f14832b;
            if (i >= f14833c || !Character.isDigit(f14834d.charAt(i))) {
                return;
            }
            f14832b++;
        }
    }

    /* renamed from: y */
    private static void m25725y() {
        while (true) {
            int i = f14832b;
            if (i >= f14833c || !Character.isWhitespace(f14834d.charAt(i))) {
                return;
            }
            f14832b++;
        }
    }

    /* renamed from: z */
    private static void m25724z(float f, float f2, float f3, float f4) {
        float f5 = f14837g;
        float f6 = f14838h;
        m25752A(f + f5, f2 + f6, f3 + f5, f4 + f6);
    }
}