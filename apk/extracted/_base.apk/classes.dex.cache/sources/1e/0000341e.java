package gb;

import java.util.AbstractMap;
import java.util.Map;
import p102fb.C6378h;

/* renamed from: gb.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6670m0<K, V> extends AbstractC6701u<K, V> {

    /* renamed from: q */
    static final AbstractC6701u<Object, Object> f18857q = new C6670m0(null, new Object[0], 0);

    /* renamed from: n */
    private final transient Object f18858n;

    /* renamed from: o */
    final transient Object[] f18859o;

    /* renamed from: p */
    private final transient int f18860p;

    /* renamed from: gb.m0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C6671a<K, V> extends AbstractC6711w<Map.Entry<K, V>> {

        /* renamed from: l */
        private final transient AbstractC6701u<K, V> f18861l;

        /* renamed from: m */
        private final transient Object[] f18862m;

        /* renamed from: n */
        private final transient int f18863n;

        /* renamed from: o */
        private final transient int f18864o;

        /* renamed from: gb.m0$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C6672a extends AbstractC6693s<Map.Entry<K, V>> {
            C6672a() {
                C6671a.this = r1;
            }

            @Override // java.util.List
            /* renamed from: E */
            public Map.Entry<K, V> get(int i) {
                C6378h.m22836h(i, C6671a.this.f18864o);
                int i2 = i * 2;
                return new AbstractMap.SimpleImmutableEntry(C6671a.this.f18862m[C6671a.this.f18863n + i2], C6671a.this.f18862m[i2 + (C6671a.this.f18863n ^ 1)]);
            }

            @Override // gb.AbstractC6683q
            /* renamed from: k */
            public boolean mo22122k() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return C6671a.this.f18864o;
            }
        }

        C6671a(AbstractC6701u<K, V> abstractC6701u, Object[] objArr, int i, int i2) {
            this.f18861l = abstractC6701u;
            this.f18862m = objArr;
            this.f18863n = i;
            this.f18864o = i2;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f18861l.get(key))) {
                return false;
            }
            return true;
        }

        @Override // gb.AbstractC6683q
        /* renamed from: d */
        public int mo22075d(Object[] objArr, int i) {
            return mo22073a().mo22075d(objArr, i);
        }

        @Override // gb.AbstractC6683q
        /* renamed from: k */
        public boolean mo22122k() {
            return true;
        }

        @Override // gb.AbstractC6711w, gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public AbstractC6703u0<Map.Entry<K, V>> iterator() {
            return mo22073a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f18864o;
        }

        @Override // gb.AbstractC6711w
        /* renamed from: u */
        AbstractC6693s<Map.Entry<K, V>> mo22067u() {
            return new C6672a();
        }
    }

    /* renamed from: gb.m0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6673b<K> extends AbstractC6711w<K> {

        /* renamed from: l */
        private final transient AbstractC6701u<K, ?> f18866l;

        /* renamed from: m */
        private final transient AbstractC6693s<K> f18867m;

        C6673b(AbstractC6701u<K, ?> abstractC6701u, AbstractC6693s<K> abstractC6693s) {
            this.f18866l = abstractC6701u;
            this.f18867m = abstractC6693s;
        }

        @Override // gb.AbstractC6711w, gb.AbstractC6683q
        /* renamed from: a */
        public AbstractC6693s<K> mo22073a() {
            return this.f18867m;
        }

        @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f18866l.get(obj) != null;
        }

        @Override // gb.AbstractC6683q
        /* renamed from: d */
        public int mo22075d(Object[] objArr, int i) {
            return mo22073a().mo22075d(objArr, i);
        }

        @Override // gb.AbstractC6683q
        /* renamed from: k */
        public boolean mo22122k() {
            return true;
        }

        @Override // gb.AbstractC6711w, gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: o */
        public AbstractC6703u0<K> iterator() {
            return mo22073a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f18866l.size();
        }
    }

    /* renamed from: gb.m0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C6674c extends AbstractC6693s<Object> {

        /* renamed from: l */
        private final transient Object[] f18868l;

        /* renamed from: m */
        private final transient int f18869m;

        /* renamed from: n */
        private final transient int f18870n;

        C6674c(Object[] objArr, int i, int i2) {
            this.f18868l = objArr;
            this.f18869m = i;
            this.f18870n = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            C6378h.m22836h(i, this.f18870n);
            return this.f18868l[(i * 2) + this.f18869m];
        }

        @Override // gb.AbstractC6683q
        /* renamed from: k */
        public boolean mo22122k() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f18870n;
        }
    }

    private C6670m0(Object obj, Object[] objArr, int i) {
        this.f18858n = obj;
        this.f18859o = objArr;
        this.f18860p = i;
    }

    /* renamed from: m */
    public static <K, V> C6670m0<K, V> m22178m(int i, Object[] objArr) {
        if (i == 0) {
            return (C6670m0) f18857q;
        }
        if (i == 1) {
            C6653i.m22246a(objArr[0], objArr[1]);
            return new C6670m0<>(null, objArr, 1);
        }
        C6378h.m22832l(i, objArr.length >> 1);
        return new C6670m0<>(m22177n(objArr, i, AbstractC6711w.m22071p(i), 0), objArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0039, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0079, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00b0, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static java.lang.Object m22177n(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto Le
            r10 = r9[r12]
            r11 = r12 ^ 1
            r9 = r9[r11]
            gb.C6653i.m22246a(r10, r9)
            r9 = 0
            return r9
        Le:
            int r0 = r11 + (-1)
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L50
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L1b:
            if (r2 >= r10) goto L4f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            gb.C6653i.m22246a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = gb.C6681p.m22157b(r5)
        L31:
            r5 = r5 & r0
            r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L3f
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L1b
        L3f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L4a
            int r5 = r5 + 1
            goto L31
        L4a:
            java.lang.IllegalArgumentException r9 = m22176o(r3, r4, r9, r6)
            throw r9
        L4f:
            return r11
        L50:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L90
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L5a:
            if (r2 >= r10) goto L8f
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            r4 = r1 ^ 1
            r4 = r9[r4]
            gb.C6653i.m22246a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = gb.C6681p.m22157b(r5)
        L70:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L7f
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L5a
        L7f:
            r7 = r9[r6]
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L8a
            int r5 = r5 + 1
            goto L70
        L8a:
            java.lang.IllegalArgumentException r9 = m22176o(r3, r4, r9, r6)
            throw r9
        L8f:
            return r11
        L90:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L95:
            if (r2 >= r10) goto Lc5
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            r5 = r1 ^ 1
            r5 = r9[r5]
            gb.C6653i.m22246a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = gb.C6681p.m22157b(r6)
        Lab:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto Lb5
            r11[r6] = r1
            int r2 = r2 + 1
            goto L95
        Lb5:
            r8 = r9[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto Lc0
            int r6 = r6 + 1
            goto Lab
        Lc0:
            java.lang.IllegalArgumentException r9 = m22176o(r4, r5, r9, r7)
            throw r9
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gb.C6670m0.m22177n(java.lang.Object[], int, int, int):java.lang.Object");
    }

    /* renamed from: o */
    private static IllegalArgumentException m22176o(Object obj, Object obj2, Object[] objArr, int i) {
        return new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i] + "=" + objArr[i ^ 1]);
    }

    /* renamed from: p */
    static Object m22175p(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            if (!objArr[i2].equals(obj2)) {
                return null;
            }
            return objArr[i2 ^ 1];
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int m22157b = C6681p.m22157b(obj2.hashCode());
                while (true) {
                    int i3 = m22157b & length;
                    int i4 = bArr[i3] & 255;
                    if (i4 == 255) {
                        return null;
                    }
                    if (objArr[i4].equals(obj2)) {
                        return objArr[i4 ^ 1];
                    }
                    m22157b = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int m22157b2 = C6681p.m22157b(obj2.hashCode());
                while (true) {
                    int i5 = m22157b2 & length2;
                    int i6 = sArr[i5] & 65535;
                    if (i6 == 65535) {
                        return null;
                    }
                    if (objArr[i6].equals(obj2)) {
                        return objArr[i6 ^ 1];
                    }
                    m22157b2 = i5 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int m22157b3 = C6681p.m22157b(obj2.hashCode());
                while (true) {
                    int i7 = m22157b3 & length3;
                    int i8 = iArr[i7];
                    if (i8 == -1) {
                        return null;
                    }
                    if (objArr[i8].equals(obj2)) {
                        return objArr[i8 ^ 1];
                    }
                    m22157b3 = i7 + 1;
                }
            }
        }
    }

    @Override // gb.AbstractC6701u
    /* renamed from: e */
    AbstractC6711w<Map.Entry<K, V>> mo22110e() {
        return new C6671a(this, this.f18859o, 0, this.f18860p);
    }

    @Override // gb.AbstractC6701u
    /* renamed from: f */
    AbstractC6711w<K> mo22109f() {
        return new C6673b(this, new C6674c(this.f18859o, 0, this.f18860p));
    }

    @Override // gb.AbstractC6701u
    /* renamed from: g */
    AbstractC6683q<V> mo22108g() {
        return new C6674c(this.f18859o, 1, this.f18860p);
    }

    @Override // gb.AbstractC6701u, java.util.Map, p164j$.util.Map
    public V get(Object obj) {
        return (V) m22175p(this.f18858n, this.f18859o, this.f18860p, 0, obj);
    }

    @Override // gb.AbstractC6701u
    /* renamed from: i */
    boolean mo22106i() {
        return false;
    }

    @Override // java.util.Map, p164j$.util.Map
    public int size() {
        return this.f18860p;
    }
}