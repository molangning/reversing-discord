package p418x6;

import p195k8.C9191p0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13702d {

    /* renamed from: x6.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13704b {

        /* renamed from: a */
        public final long[] f35250a;

        /* renamed from: b */
        public final int[] f35251b;

        /* renamed from: c */
        public final int f35252c;

        /* renamed from: d */
        public final long[] f35253d;

        /* renamed from: e */
        public final int[] f35254e;

        /* renamed from: f */
        public final long f35255f;

        private C13704b(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
            this.f35250a = jArr;
            this.f35251b = iArr;
            this.f35252c = i;
            this.f35253d = jArr2;
            this.f35254e = iArr2;
            this.f35255f = j;
        }
    }

    /* renamed from: a */
    public static C13704b m1755a(int i, long[] jArr, int[] iArr, long j) {
        int i2 = 8192 / i;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += C9191p0.m16239l(i4, i2);
        }
        long[] jArr2 = new long[i3];
        int[] iArr2 = new int[i3];
        long[] jArr3 = new long[i3];
        int[] iArr3 = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int i9 = iArr[i8];
            long j2 = jArr[i8];
            while (i9 > 0) {
                int min = Math.min(i2, i9);
                jArr2[i6] = j2;
                int i10 = i * min;
                iArr2[i6] = i10;
                i7 = Math.max(i7, i10);
                jArr3[i6] = i5 * j;
                iArr3[i6] = 1;
                j2 += iArr2[i6];
                i5 += min;
                i9 -= min;
                i6++;
            }
        }
        return new C13704b(jArr2, iArr2, i7, jArr3, iArr3, j * i5);
    }
}