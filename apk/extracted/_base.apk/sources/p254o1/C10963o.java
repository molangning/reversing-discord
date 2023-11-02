package p254o1;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p206l1.C10008d;
import p275p1.AbstractC11368c;
import p291q1.C11672d;
import p291q1.C11679k;

/* renamed from: o1.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10963o implements InterfaceC10962n0<C10008d> {

    /* renamed from: a */
    private int f28745a;

    public C10963o(int i) {
        this.f28745a = i;
    }

    /* renamed from: b */
    private C10008d m9466b(C10008d c10008d, List<Float> list) {
        int i = this.f28745a * 4;
        if (list.size() <= i) {
            return c10008d;
        }
        float[] m12614d = c10008d.m12614d();
        int[] m12615c = c10008d.m12615c();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] m9463e = m9463e(c10008d.m12614d(), fArr);
        int length = m9463e.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = m9463e[i3];
            int binarySearch = Arrays.binarySearch(m12614d, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = m9464d(f, m12615c[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = m9465c(f, fArr2[binarySearch2], m12614d, m12615c);
            }
        }
        return new C10008d(m9463e, iArr);
    }

    /* renamed from: d */
    private int m9464d(float f, int i, float[] fArr, float[] fArr2) {
        float m7195i;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f2 = fArr[i2];
                int i3 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                if (i3 >= 0 || i2 == fArr.length - 1) {
                    if (i3 <= 0) {
                        m7195i = fArr2[i2];
                    } else {
                        int i4 = i2 - 1;
                        float f3 = fArr[i4];
                        m7195i = C11679k.m7195i(fArr2[i4], fArr2[i2], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (m7195i * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: e */
    protected static float[] m9463e(float[] fArr, float[] fArr2) {
        float f;
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f2 = Float.NaN;
            if (i2 < fArr.length) {
                f = fArr[i2];
            } else {
                f = Float.NaN;
            }
            if (i3 < fArr2.length) {
                f2 = fArr2[i3];
            }
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        if (i == 0) {
            return fArr3;
        }
        return Arrays.copyOf(fArr3, length - i);
    }

    /* renamed from: c */
    int m9465c(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float f5 = (f - f4) / (f3 - f4);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), C11672d.m7241c(f5, Color.red(i4), Color.red(i3)), C11672d.m7241c(f5, Color.green(i4), Color.green(i3)), C11672d.m7241c(f5, Color.blue(i4), Color.blue(i3)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: f */
    public C10008d mo9459a(AbstractC11368c abstractC11368c, float f) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC11368c.mo8221h();
        }
        while (abstractC11368c.mo8216q()) {
            arrayList.add(Float.valueOf((float) abstractC11368c.mo8214t()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f28745a = 2;
        }
        if (z) {
            abstractC11368c.mo8219j();
        }
        if (this.f28745a == -1) {
            this.f28745a = arrayList.size() / 4;
        }
        int i = this.f28745a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f28745a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i3 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i2 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            }
        }
        return m9466b(new C10008d(fArr, iArr), arrayList);
    }
}
