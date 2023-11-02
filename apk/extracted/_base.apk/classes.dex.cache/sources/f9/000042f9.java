package p229m7;

import java.util.Arrays;
import java.util.Random;

/* renamed from: m7.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10327o0 {

    /* renamed from: m7.o0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10328a implements InterfaceC10327o0 {

        /* renamed from: a */
        private final Random f26999a;

        /* renamed from: b */
        private final int[] f27000b;

        /* renamed from: c */
        private final int[] f27001c;

        public C10328a(int i) {
            this(i, new Random());
        }

        /* renamed from: h */
        private static int[] m11760h(int i, Random random) {
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                int nextInt = random.nextInt(i3);
                iArr[i2] = iArr[nextInt];
                iArr[nextInt] = i2;
                i2 = i3;
            }
            return iArr;
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: a */
        public InterfaceC10327o0 mo11767a(int i, int i2) {
            int i3 = i2 - i;
            int[] iArr = new int[this.f27000b.length - i3];
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = this.f27000b;
                if (i4 < iArr2.length) {
                    int i6 = iArr2[i4];
                    if (i6 >= i && i6 < i2) {
                        i5++;
                    } else {
                        int i7 = i4 - i5;
                        if (i6 >= i) {
                            i6 -= i3;
                        }
                        iArr[i7] = i6;
                    }
                    i4++;
                } else {
                    return new C10328a(iArr, new Random(this.f26999a.nextLong()));
                }
            }
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: b */
        public int mo11766b(int i) {
            int i2 = this.f27001c[i] - 1;
            if (i2 < 0) {
                return -1;
            }
            return this.f27000b[i2];
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: c */
        public int mo11765c(int i) {
            int i2 = this.f27001c[i] + 1;
            int[] iArr = this.f27000b;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: d */
        public int mo11764d() {
            int[] iArr = this.f27000b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: e */
        public InterfaceC10327o0 mo11763e() {
            return new C10328a(0, new Random(this.f26999a.nextLong()));
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: f */
        public int mo11762f() {
            int[] iArr = this.f27000b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // p229m7.InterfaceC10327o0
        /* renamed from: g */
        public InterfaceC10327o0 mo11761g(int i, int i2) {
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int i3 = 0;
            int i4 = 0;
            while (i4 < i2) {
                iArr[i4] = this.f26999a.nextInt(this.f27000b.length + 1);
                int i5 = i4 + 1;
                int nextInt = this.f26999a.nextInt(i5);
                iArr2[i4] = iArr2[nextInt];
                iArr2[nextInt] = i4 + i;
                i4 = i5;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f27000b.length + i2];
            int i6 = 0;
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f27000b;
                if (i3 < iArr4.length + i2) {
                    if (i6 < i2 && i7 == iArr[i6]) {
                        iArr3[i3] = iArr2[i6];
                        i6++;
                    } else {
                        int i8 = i7 + 1;
                        int i9 = iArr4[i7];
                        iArr3[i3] = i9;
                        if (i9 >= i) {
                            iArr3[i3] = i9 + i2;
                        }
                        i7 = i8;
                    }
                    i3++;
                } else {
                    return new C10328a(iArr3, new Random(this.f26999a.nextLong()));
                }
            }
        }

        @Override // p229m7.InterfaceC10327o0
        public int getLength() {
            return this.f27000b.length;
        }

        private C10328a(int i, Random random) {
            this(m11760h(i, random), random);
        }

        private C10328a(int[] iArr, Random random) {
            this.f27000b = iArr;
            this.f26999a = random;
            this.f27001c = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f27001c[iArr[i]] = i;
            }
        }
    }

    /* renamed from: a */
    InterfaceC10327o0 mo11767a(int i, int i2);

    /* renamed from: b */
    int mo11766b(int i);

    /* renamed from: c */
    int mo11765c(int i);

    /* renamed from: d */
    int mo11764d();

    /* renamed from: e */
    InterfaceC10327o0 mo11763e();

    /* renamed from: f */
    int mo11762f();

    /* renamed from: g */
    InterfaceC10327o0 mo11761g(int i, int i2);

    int getLength();
}