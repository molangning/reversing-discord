package p368uc;

import com.facebook.react.uimanager.ViewDefaults;
import p136hc.C7064j;
import tc.AbstractC12648k;

/* renamed from: uc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12946a extends AbstractC12648k {

    /* renamed from: b */
    private final int[] f33653b;

    /* renamed from: e */
    private final int[] f33656e;

    /* renamed from: f */
    private final int[] f33657f;

    /* renamed from: a */
    private final int[] f33652a = new int[4];

    /* renamed from: c */
    private final float[] f33654c = new float[4];

    /* renamed from: d */
    private final float[] f33655d = new float[4];

    public AbstractC12946a() {
        int[] iArr = new int[8];
        this.f33653b = iArr;
        this.f33656e = new int[iArr.length / 2];
        this.f33657f = new int[iArr.length / 2];
    }

    /* renamed from: g */
    public static void m3634g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: n */
    public static void m3627n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: o */
    public static boolean m3626o(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = ViewDefaults.NUMBER_OF_LINES;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    public static int m3625p(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (AbstractC12648k.m4630d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C7064j.m21461a();
    }

    /* renamed from: h */
    public final int[] m3633h() {
        return this.f33653b;
    }

    /* renamed from: i */
    public final int[] m3632i() {
        return this.f33652a;
    }

    /* renamed from: j */
    public final int[] m3631j() {
        return this.f33657f;
    }

    /* renamed from: k */
    public final float[] m3630k() {
        return this.f33655d;
    }

    /* renamed from: l */
    public final int[] m3629l() {
        return this.f33656e;
    }

    /* renamed from: m */
    public final float[] m3628m() {
        return this.f33654c;
    }
}