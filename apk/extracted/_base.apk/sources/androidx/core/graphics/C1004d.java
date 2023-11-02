package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: androidx.core.graphics.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1004d {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1005a {

        /* renamed from: a */
        int f3348a;

        /* renamed from: b */
        boolean f3349b;

        C1005a() {
        }
    }

    /* renamed from: a */
    private static void m38162a(ArrayList<C1006b> arrayList, char c, float[] fArr) {
        arrayList.add(new C1006b(c, fArr));
    }

    /* renamed from: b */
    public static boolean m38161b(C1006b[] c1006bArr, C1006b[] c1006bArr2) {
        if (c1006bArr == null || c1006bArr2 == null || c1006bArr.length != c1006bArr2.length) {
            return false;
        }
        for (int i = 0; i < c1006bArr.length; i++) {
            C1006b c1006b = c1006bArr[i];
            char c = c1006b.f3350a;
            C1006b c1006b2 = c1006bArr2[i];
            if (c != c1006b2.f3350a || c1006b.f3351b.length != c1006b2.f3351b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    static float[] m38160c(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, i, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: d */
    public static C1006b[] m38159d(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int m38154i = m38154i(str, i);
            String trim = str.substring(i2, m38154i).trim();
            if (trim.length() > 0) {
                m38162a(arrayList, trim.charAt(0), m38155h(trim));
            }
            i2 = m38154i;
            i = m38154i + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m38162a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C1006b[]) arrayList.toArray(new C1006b[arrayList.size()]);
    }

    /* renamed from: e */
    public static Path m38158e(String str) {
        Path path = new Path();
        C1006b[] m38159d = m38159d(str);
        if (m38159d != null) {
            try {
                C1006b.m38148e(m38159d, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + str, e);
            }
        }
        return null;
    }

    /* renamed from: f */
    public static C1006b[] m38157f(C1006b[] c1006bArr) {
        if (c1006bArr == null) {
            return null;
        }
        C1006b[] c1006bArr2 = new C1006b[c1006bArr.length];
        for (int i = 0; i < c1006bArr.length; i++) {
            c1006bArr2[i] = new C1006b(c1006bArr[i]);
        }
        return c1006bArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a A[LOOP:0: B:3:0x0007->B:24:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m38156g(java.lang.String r8, int r9, androidx.core.graphics.C1004d.C1005a r10) {
        /*
            r0 = 0
            r10.f3349b = r0
            r1 = r9
            r2 = r0
            r3 = r2
            r4 = r3
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3d
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L35
            r6 = 69
            if (r5 == r6) goto L33
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L33
            switch(r5) {
                case 44: goto L35;
                case 45: goto L2a;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L31
        L22:
            if (r3 != 0) goto L27
            r2 = r0
            r3 = r7
            goto L37
        L27:
            r10.f3349b = r7
            goto L35
        L2a:
            if (r1 == r9) goto L31
            if (r2 != 0) goto L31
            r10.f3349b = r7
            goto L35
        L31:
            r2 = r0
            goto L37
        L33:
            r2 = r7
            goto L37
        L35:
            r2 = r0
            r4 = r7
        L37:
            if (r4 == 0) goto L3a
            goto L3d
        L3a:
            int r1 = r1 + 1
            goto L7
        L3d:
            r10.f3348a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.C1004d.m38156g(java.lang.String, int, androidx.core.graphics.d$a):void");
    }

    /* renamed from: h */
    private static float[] m38155h(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                C1005a c1005a = new C1005a();
                int length = str.length();
                int i = 1;
                int i2 = 0;
                while (i < length) {
                    m38156g(str, i, c1005a);
                    int i3 = c1005a.f3348a;
                    if (i < i3) {
                        fArr[i2] = Float.parseFloat(str.substring(i, i3));
                        i2++;
                    }
                    if (c1005a.f3349b) {
                        i = i3;
                    } else {
                        i = i3 + 1;
                    }
                }
                return m38160c(fArr, 0, i2);
            } catch (NumberFormatException e) {
                throw new RuntimeException("error in parsing \"" + str + "\"", e);
            }
        }
        return new float[0];
    }

    /* renamed from: i */
    private static int m38154i(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    /* renamed from: j */
    public static void m38153j(C1006b[] c1006bArr, C1006b[] c1006bArr2) {
        for (int i = 0; i < c1006bArr2.length; i++) {
            c1006bArr[i].f3350a = c1006bArr2[i].f3350a;
            int i2 = 0;
            while (true) {
                float[] fArr = c1006bArr2[i].f3351b;
                if (i2 < fArr.length) {
                    c1006bArr[i].f3351b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    /* renamed from: androidx.core.graphics.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1006b {

        /* renamed from: a */
        public char f3350a;

        /* renamed from: b */
        public float[] f3351b;

        C1006b(char c, float[] fArr) {
            this.f3350a = c;
            this.f3351b = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        private static void m38152a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            int i3;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            char c4 = 0;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    i2 = i;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    i2 = i;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    i2 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i2 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i4 = 0;
            char c5 = c;
            while (i4 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 != 'H') {
                            if (c3 != 'Q') {
                                if (c3 != 'V') {
                                    if (c3 != 'a') {
                                        if (c3 != 'c') {
                                            if (c3 != 'h') {
                                                if (c3 != 'q') {
                                                    if (c3 != 'v') {
                                                        if (c3 != 'L') {
                                                            if (c3 != 'M') {
                                                                if (c3 != 'S') {
                                                                    if (c3 != 'T') {
                                                                        if (c3 != 'l') {
                                                                            if (c3 != 'm') {
                                                                                if (c3 != 's') {
                                                                                    if (c3 == 't') {
                                                                                        if (c5 != 'q' && c5 != 't' && c5 != 'Q' && c5 != 'T') {
                                                                                            f8 = 0.0f;
                                                                                            f7 = 0.0f;
                                                                                        } else {
                                                                                            f7 = f15 - f11;
                                                                                            f8 = f16 - f12;
                                                                                        }
                                                                                        int i5 = i4 + 0;
                                                                                        int i6 = i4 + 1;
                                                                                        path.rQuadTo(f7, f8, fArr2[i5], fArr2[i6]);
                                                                                        float f19 = f7 + f15;
                                                                                        float f20 = f8 + f16;
                                                                                        f15 += fArr2[i5];
                                                                                        f16 += fArr2[i6];
                                                                                        f12 = f20;
                                                                                        f11 = f19;
                                                                                    }
                                                                                } else {
                                                                                    if (c5 != 'c' && c5 != 's' && c5 != 'C' && c5 != 'S') {
                                                                                        f6 = 0.0f;
                                                                                        f5 = 0.0f;
                                                                                    } else {
                                                                                        float f21 = f15 - f11;
                                                                                        f5 = f16 - f12;
                                                                                        f6 = f21;
                                                                                    }
                                                                                    int i7 = i4 + 0;
                                                                                    int i8 = i4 + 1;
                                                                                    int i9 = i4 + 2;
                                                                                    int i10 = i4 + 3;
                                                                                    path.rCubicTo(f6, f5, fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                                                                                    f = fArr2[i7] + f15;
                                                                                    f2 = fArr2[i8] + f16;
                                                                                    f15 += fArr2[i9];
                                                                                    f3 = fArr2[i10];
                                                                                }
                                                                            } else {
                                                                                float f22 = fArr2[i4 + 0];
                                                                                f15 += f22;
                                                                                float f23 = fArr2[i4 + 1];
                                                                                f16 += f23;
                                                                                if (i4 > 0) {
                                                                                    path.rLineTo(f22, f23);
                                                                                } else {
                                                                                    path.rMoveTo(f22, f23);
                                                                                    i3 = i4;
                                                                                    f18 = f16;
                                                                                    f17 = f15;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i11 = i4 + 0;
                                                                            int i12 = i4 + 1;
                                                                            path.rLineTo(fArr2[i11], fArr2[i12]);
                                                                            f15 += fArr2[i11];
                                                                            f4 = fArr2[i12];
                                                                        }
                                                                    } else {
                                                                        if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                                            f15 = (f15 * 2.0f) - f11;
                                                                            f16 = (f16 * 2.0f) - f12;
                                                                        }
                                                                        int i13 = i4 + 0;
                                                                        int i14 = i4 + 1;
                                                                        path.quadTo(f15, f16, fArr2[i13], fArr2[i14]);
                                                                        float f24 = fArr2[i13];
                                                                        float f25 = fArr2[i14];
                                                                        i3 = i4;
                                                                        f12 = f16;
                                                                        f11 = f15;
                                                                        f15 = f24;
                                                                        f16 = f25;
                                                                    }
                                                                } else {
                                                                    if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                                        f15 = (f15 * 2.0f) - f11;
                                                                        f16 = (f16 * 2.0f) - f12;
                                                                    }
                                                                    float f26 = f16;
                                                                    int i15 = i4 + 0;
                                                                    int i16 = i4 + 1;
                                                                    int i17 = i4 + 2;
                                                                    int i18 = i4 + 3;
                                                                    path.cubicTo(f15, f26, fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                                                                    f = fArr2[i15];
                                                                    f2 = fArr2[i16];
                                                                    f15 = fArr2[i17];
                                                                    f16 = fArr2[i18];
                                                                    f11 = f;
                                                                    f12 = f2;
                                                                }
                                                            } else {
                                                                f15 = fArr2[i4 + 0];
                                                                f16 = fArr2[i4 + 1];
                                                                if (i4 > 0) {
                                                                    path.lineTo(f15, f16);
                                                                } else {
                                                                    path.moveTo(f15, f16);
                                                                    i3 = i4;
                                                                    f18 = f16;
                                                                    f17 = f15;
                                                                }
                                                            }
                                                        } else {
                                                            int i19 = i4 + 0;
                                                            int i20 = i4 + 1;
                                                            path.lineTo(fArr2[i19], fArr2[i20]);
                                                            f15 = fArr2[i19];
                                                            f16 = fArr2[i20];
                                                        }
                                                    } else {
                                                        int i21 = i4 + 0;
                                                        path.rLineTo(0.0f, fArr2[i21]);
                                                        f4 = fArr2[i21];
                                                    }
                                                    f16 += f4;
                                                } else {
                                                    int i22 = i4 + 0;
                                                    int i23 = i4 + 1;
                                                    int i24 = i4 + 2;
                                                    int i25 = i4 + 3;
                                                    path.rQuadTo(fArr2[i22], fArr2[i23], fArr2[i24], fArr2[i25]);
                                                    f = fArr2[i22] + f15;
                                                    f2 = fArr2[i23] + f16;
                                                    f15 += fArr2[i24];
                                                    f3 = fArr2[i25];
                                                }
                                            } else {
                                                int i26 = i4 + 0;
                                                path.rLineTo(fArr2[i26], 0.0f);
                                                f15 += fArr2[i26];
                                            }
                                            i3 = i4;
                                        } else {
                                            int i27 = i4 + 2;
                                            int i28 = i4 + 3;
                                            int i29 = i4 + 4;
                                            int i30 = i4 + 5;
                                            path.rCubicTo(fArr2[i4 + 0], fArr2[i4 + 1], fArr2[i27], fArr2[i28], fArr2[i29], fArr2[i30]);
                                            f = fArr2[i27] + f15;
                                            f2 = fArr2[i28] + f16;
                                            f15 += fArr2[i29];
                                            f3 = fArr2[i30];
                                        }
                                        f16 += f3;
                                        f11 = f;
                                        f12 = f2;
                                        i3 = i4;
                                    } else {
                                        int i31 = i4 + 5;
                                        float f27 = fArr2[i31] + f15;
                                        int i32 = i4 + 6;
                                        float f28 = fArr2[i32] + f16;
                                        float f29 = fArr2[i4 + 0];
                                        float f30 = fArr2[i4 + 1];
                                        float f31 = fArr2[i4 + 2];
                                        if (fArr2[i4 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr2[i4 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        i3 = i4;
                                        m38150c(path, f15, f16, f27, f28, f29, f30, f31, z3, z4);
                                        f15 += fArr2[i31];
                                        f16 += fArr2[i32];
                                    }
                                } else {
                                    i3 = i4;
                                    int i33 = i3 + 0;
                                    path.lineTo(f15, fArr2[i33]);
                                    f16 = fArr2[i33];
                                }
                            } else {
                                i3 = i4;
                                int i34 = i3 + 0;
                                int i35 = i3 + 1;
                                int i36 = i3 + 2;
                                int i37 = i3 + 3;
                                path.quadTo(fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                float f32 = fArr2[i34];
                                float f33 = fArr2[i35];
                                f15 = fArr2[i36];
                                f16 = fArr2[i37];
                                f11 = f32;
                                f12 = f33;
                            }
                        } else {
                            i3 = i4;
                            int i38 = i3 + 0;
                            path.lineTo(fArr2[i38], f16);
                            f15 = fArr2[i38];
                        }
                    } else {
                        i3 = i4;
                        int i39 = i3 + 2;
                        int i40 = i3 + 3;
                        int i41 = i3 + 4;
                        int i42 = i3 + 5;
                        path.cubicTo(fArr2[i3 + 0], fArr2[i3 + 1], fArr2[i39], fArr2[i40], fArr2[i41], fArr2[i42]);
                        f15 = fArr2[i41];
                        float f34 = fArr2[i42];
                        float f35 = fArr2[i39];
                        float f36 = fArr2[i40];
                        f16 = f34;
                        f12 = f36;
                        f11 = f35;
                    }
                    i4 = i3 + i2;
                    c5 = c2;
                    c3 = c5;
                    c4 = 0;
                } else {
                    i3 = i4;
                    float f37 = f16;
                    float f38 = f15;
                    int i43 = i3 + 5;
                    float f39 = fArr2[i43];
                    int i44 = i3 + 6;
                    float f40 = fArr2[i44];
                    float f41 = fArr2[i3 + 0];
                    float f42 = fArr2[i3 + 1];
                    float f43 = fArr2[i3 + 2];
                    if (fArr2[i3 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i3 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m38150c(path, f38, f37, f39, f40, f41, f42, f43, z, z2);
                    f15 = fArr2[i43];
                    f16 = fArr2[i44];
                }
                f12 = f16;
                f11 = f15;
                i4 = i3 + i2;
                c5 = c2;
                c3 = c5;
                c4 = 0;
            }
            fArr[c4] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* renamed from: b */
        private static void m38151b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ceil;
            double d19 = d17;
            double d20 = d14;
            int i = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (i < ceil) {
                double d24 = d23 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d23;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * sin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                sin = sin;
                d21 = d25;
                d15 = d15;
                cos = cos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                ceil = ceil;
                d22 = d26;
                d10 = d3;
            }
        }

        /* renamed from: c */
        private static void m38150c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = f6;
            double d9 = (((-f) * sin) + (d5 * cos)) / d8;
            double d10 = f4;
            double d11 = ((f3 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f3) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                m38150c(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d = d15 - d20;
                d2 = d16 + d19;
            } else {
                d = d15 + d20;
                d2 = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d2, d7 - d);
            double atan22 = Math.atan2(d12 - d2, d11 - d) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z2 != (i >= 0)) {
                atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d21 = d * d6;
            double d22 = d2 * d8;
            m38151b(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d3, d5, radians, atan2, atan22);
        }

        /* renamed from: e */
        public static void m38148e(C1006b[] c1006bArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < c1006bArr.length; i++) {
                C1006b c1006b = c1006bArr[i];
                m38152a(path, fArr, c, c1006b.f3350a, c1006b.f3351b);
                c = c1006bArr[i].f3350a;
            }
        }

        /* renamed from: d */
        public void m38149d(C1006b c1006b, C1006b c1006b2, float f) {
            this.f3350a = c1006b.f3350a;
            int i = 0;
            while (true) {
                float[] fArr = c1006b.f3351b;
                if (i < fArr.length) {
                    this.f3351b[i] = (fArr[i] * (1.0f - f)) + (c1006b2.f3351b[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        C1006b(C1006b c1006b) {
            this.f3350a = c1006b.f3350a;
            float[] fArr = c1006b.f3351b;
            this.f3351b = C1004d.m38160c(fArr, 0, fArr.length);
        }
    }
}
