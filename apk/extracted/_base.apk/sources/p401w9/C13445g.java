package p401w9;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13445g extends AbstractC13442e0 {

    /* renamed from: p */
    static final AbstractC13442e0 f34691p = new C13445g(null, new Object[0], 0);

    /* renamed from: m */
    private final transient Object f34692m;

    /* renamed from: n */
    final transient Object[] f34693n;

    /* renamed from: o */
    private final transient int f34694o;

    private C13445g(Object obj, Object[] objArr, int i) {
        this.f34692m = obj;
        this.f34693n = objArr;
        this.f34694o = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v4, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* renamed from: g */
    public static C13445g m2479g(int i, Object[] objArr, C13440d0 c13440d0) {
        int i2;
        short[] sArr;
        byte[] bArr;
        Object[] objArr2;
        int i3 = i;
        Object[] objArr3 = objArr;
        if (i3 == 0) {
            return (C13445g) f34691p;
        }
        Object obj = null;
        if (i3 == 1) {
            Object obj2 = objArr3[0];
            obj2.getClass();
            Object obj3 = objArr3[1];
            obj3.getClass();
            C13462w.m2435a(obj2, obj3);
            return new C13445g(null, objArr3, 1);
        }
        C13459t.m2440b(i3, objArr3.length >> 1, "index");
        char c = 2;
        int max = Math.max(i3, 2);
        if (max < 751619276) {
            i2 = Integer.highestOneBit(max - 1);
            do {
                i2 += i2;
            } while (i2 * 0.7d < max);
        } else {
            i2 = 1073741824;
            if (max >= 1073741824) {
                throw new IllegalArgumentException("collection too large");
            }
        }
        if (i3 == 1) {
            Object obj4 = objArr3[0];
            obj4.getClass();
            Object obj5 = objArr3[1];
            obj5.getClass();
            C13462w.m2435a(obj4, obj5);
        } else {
            int i4 = i2 - 1;
            char c2 = 65535;
            if (i2 <= 128) {
                byte[] bArr2 = new byte[i2];
                Arrays.fill(bArr2, (byte) -1);
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    int i7 = i5 + i5;
                    int i8 = i6 + i6;
                    Object obj6 = objArr3[i8];
                    obj6.getClass();
                    Object obj7 = objArr3[i8 ^ 1];
                    obj7.getClass();
                    C13462w.m2435a(obj6, obj7);
                    int m2434a = C13463x.m2434a(obj6.hashCode());
                    while (true) {
                        int i9 = m2434a & i4;
                        int i10 = bArr2[i9] & 255;
                        if (i10 == 255) {
                            bArr2[i9] = (byte) i7;
                            if (i5 < i6) {
                                objArr3[i7] = obj6;
                                objArr3[i7 ^ 1] = obj7;
                            }
                            i5++;
                        } else if (obj6.equals(objArr3[i10])) {
                            int i11 = i10 ^ 1;
                            Object obj8 = objArr3[i11];
                            obj8.getClass();
                            C13438c0 c13438c0 = new C13438c0(obj6, obj7, obj8);
                            objArr3[i11] = obj7;
                            obj = c13438c0;
                            break;
                        } else {
                            m2434a = i9 + 1;
                        }
                    }
                }
                if (i5 == i3) {
                    bArr = bArr2;
                    c = 2;
                    obj = bArr;
                } else {
                    obj = new Object[]{bArr2, Integer.valueOf(i5), obj};
                    c = 2;
                }
            } else if (i2 <= 32768) {
                sArr = new short[i2];
                Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    Object obj9 = objArr3[i15];
                    obj9.getClass();
                    Object obj10 = objArr3[i15 ^ 1];
                    obj10.getClass();
                    C13462w.m2435a(obj9, obj10);
                    int m2434a2 = C13463x.m2434a(obj9.hashCode());
                    while (true) {
                        int i16 = m2434a2 & i4;
                        char c3 = (char) sArr[i16];
                        if (c3 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArr3[i14] = obj9;
                                objArr3[i14 ^ 1] = obj10;
                            }
                            i12++;
                        } else if (obj9.equals(objArr3[c3])) {
                            int i17 = c3 ^ 1;
                            Object obj11 = objArr3[i17];
                            obj11.getClass();
                            C13438c0 c13438c02 = new C13438c0(obj9, obj10, obj11);
                            objArr3[i17] = obj10;
                            obj = c13438c02;
                            break;
                        } else {
                            m2434a2 = i16 + 1;
                        }
                    }
                }
                if (i12 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i12), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c = 2;
                obj = bArr;
            } else {
                sArr = new int[i2];
                Arrays.fill((int[]) sArr, -1);
                int i18 = 0;
                int i19 = 0;
                while (i18 < i3) {
                    int i20 = i19 + i19;
                    int i21 = i18 + i18;
                    Object obj12 = objArr3[i21];
                    obj12.getClass();
                    Object obj13 = objArr3[i21 ^ 1];
                    obj13.getClass();
                    C13462w.m2435a(obj12, obj13);
                    int m2434a3 = C13463x.m2434a(obj12.hashCode());
                    while (true) {
                        int i22 = m2434a3 & i4;
                        ?? r15 = sArr[i22];
                        if (r15 == c2) {
                            sArr[i22] = i20;
                            if (i19 < i18) {
                                objArr3[i20] = obj12;
                                objArr3[i20 ^ 1] = obj13;
                            }
                            i19++;
                        } else if (obj12.equals(objArr3[r15])) {
                            int i23 = r15 ^ 1;
                            Object obj14 = objArr3[i23];
                            obj14.getClass();
                            C13438c0 c13438c03 = new C13438c0(obj12, obj13, obj14);
                            objArr3[i23] = obj13;
                            obj = c13438c03;
                            break;
                        } else {
                            m2434a3 = i22 + 1;
                            c2 = 65535;
                        }
                    }
                    i18++;
                    c2 = 65535;
                }
                if (i19 != i3) {
                    c = 2;
                    objArr2 = new Object[]{sArr, Integer.valueOf(i19), obj};
                    obj = objArr2;
                }
                bArr = sArr;
                c = 2;
                obj = bArr;
            }
        }
        if (obj instanceof Object[]) {
            Object[] objArr4 = (Object[]) obj;
            c13440d0.f34681c = (C13438c0) objArr4[c];
            Object obj15 = objArr4[0];
            int intValue = ((Integer) objArr4[1]).intValue();
            objArr3 = Arrays.copyOf(objArr3, intValue + intValue);
            obj = obj15;
            i3 = intValue;
        }
        return new C13445g(obj, objArr3, i3);
    }

    @Override // p401w9.AbstractC13442e0
    /* renamed from: a */
    final AbstractC13464y mo2482a() {
        return new C13443f(this.f34693n, 1, this.f34694o);
    }

    @Override // p401w9.AbstractC13442e0
    /* renamed from: c */
    final AbstractC13444f0 mo2481c() {
        return new C13439d(this, this.f34693n, 0, this.f34694o);
    }

    @Override // p401w9.AbstractC13442e0
    /* renamed from: e */
    final AbstractC13444f0 mo2480e() {
        return new C13441e(this, new C13443f(this.f34693n, 0, this.f34694o));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f A[RETURN] */
    @Override // p401w9.AbstractC13442e0, java.util.Map, p164j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f34692m
            java.lang.Object[] r1 = r9.f34693n
            int r2 = r9.f34694o
            r3 = 0
            if (r10 != 0) goto Lc
        L9:
            r10 = r3
            goto L9c
        Lc:
            r4 = 1
            if (r2 != r4) goto L22
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L9
            r10 = r1[r4]
            r10.getClass()
            goto L9c
        L22:
            if (r0 != 0) goto L25
            goto L9
        L25:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L51
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = p401w9.C13463x.m2434a(r0)
        L38:
            r0 = r0 & r6
            r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L9
        L41:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L4e:
            int r0 = r0 + 1
            goto L38
        L51:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L7d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + (-1)
            int r0 = r10.hashCode()
            int r0 = p401w9.C13463x.m2434a(r0)
        L63:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L9
        L6d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L9c
        L7a:
            int r0 = r0 + 1
            goto L63
        L7d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = p401w9.C13463x.m2434a(r6)
        L89:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L90
            goto L9
        L90:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r3
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: p401w9.C13445g.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, p164j$.util.Map
    public final int size() {
        return this.f34694o;
    }
}
