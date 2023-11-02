package p206l1;

import java.util.Arrays;
import p291q1.C11672d;
import p291q1.C11679k;

/* renamed from: l1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10008d {

    /* renamed from: a */
    private final float[] f25958a;

    /* renamed from: b */
    private final int[] f25959b;

    public C10008d(float[] fArr, int[] iArr) {
        this.f25958a = fArr;
        this.f25959b = iArr;
    }

    /* renamed from: b */
    private int m12616b(float f) {
        int binarySearch = Arrays.binarySearch(this.f25958a, f);
        if (binarySearch >= 0) {
            return this.f25959b[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.f25959b[0];
        }
        int[] iArr = this.f25959b;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f25958a;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return C11672d.m7241c((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    /* renamed from: a */
    public C10008d m12617a(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m12616b(fArr[i]);
        }
        return new C10008d(fArr, iArr);
    }

    /* renamed from: c */
    public int[] m12615c() {
        return this.f25959b;
    }

    /* renamed from: d */
    public float[] m12614d() {
        return this.f25958a;
    }

    /* renamed from: e */
    public int m12613e() {
        return this.f25959b.length;
    }

    /* renamed from: f */
    public void m12612f(C10008d c10008d, C10008d c10008d2, float f) {
        if (c10008d.f25959b.length == c10008d2.f25959b.length) {
            for (int i = 0; i < c10008d.f25959b.length; i++) {
                this.f25958a[i] = C11679k.m7195i(c10008d.f25958a[i], c10008d2.f25958a[i], f);
                this.f25959b[i] = C11672d.m7241c(f, c10008d.f25959b[i], c10008d2.f25959b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c10008d.f25959b.length + " vs " + c10008d2.f25959b.length + ")");
    }
}