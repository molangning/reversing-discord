package p202kj;

import java.util.AbstractSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import p162ij.C7666r;
import p162ij.InterfaceC7664p;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C9521v extends AbstractC9519t<C9521v> {

    /* renamed from: t */
    private static final Set<InterfaceC7664p<?>> f25268t;

    /* renamed from: j */
    private Object[] f25269j;

    /* renamed from: k */
    private Object[] f25270k;

    /* renamed from: l */
    private Map<InterfaceC7664p<?>, Object> f25271l;

    /* renamed from: m */
    private int[] f25272m;

    /* renamed from: n */
    private int f25273n;

    /* renamed from: o */
    private int f25274o;

    /* renamed from: p */
    private int f25275p;

    /* renamed from: q */
    private int f25276q;

    /* renamed from: r */
    private boolean f25277r = false;

    /* renamed from: s */
    private int f25278s = -1;

    /* renamed from: kj.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private class C9523b implements Iterator<InterfaceC7664p<?>>, p164j$.util.Iterator {

        /* renamed from: j */
        int f25279j;

        /* renamed from: k */
        int f25280k;

        private C9523b() {
            this.f25279j = C9521v.this.f25273n;
            this.f25280k = C9521v.this.f25276q;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public InterfaceC7664p<?> next() {
            Object obj;
            if (this.f25280k > 0) {
                Object[] objArr = C9521v.this.f25269j;
                do {
                    int i = this.f25279j - 1;
                    this.f25279j = i;
                    if (i >= 0) {
                        obj = objArr[i];
                    }
                } while (obj == null);
                this.f25280k--;
                return (InterfaceC7664p) InterfaceC7664p.class.cast(obj);
            }
            throw new NoSuchElementException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super InterfaceC7664p<?>> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f25280k > 0;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    /* renamed from: kj.v$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private class C9524c extends AbstractSet<InterfaceC7664p<?>> {
        private C9524c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<InterfaceC7664p<?>> iterator() {
            return new C9523b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C9521v.this.f25276q;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(C10697f0.f27908y);
        hashSet.add(C10697f0.f27887C);
        hashSet.add(C10697f0.f27888D);
        hashSet.add(C10711g0.f27935D);
        hashSet.add(C10711g0.f27937F);
        hashSet.add(C10711g0.f27939H);
        hashSet.add(C10711g0.f27943L);
        f25268t = Collections.unmodifiableSet(hashSet);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9521v(int i, boolean z) {
        if (z) {
            this.f25273n = Integer.MIN_VALUE;
            this.f25274o = Integer.MIN_VALUE;
            this.f25275p = Integer.MIN_VALUE;
            this.f25276q = Integer.MIN_VALUE;
            this.f25269j = null;
            this.f25270k = null;
            this.f25272m = new int[3];
            for (int i2 = 0; i2 < 3; i2++) {
                this.f25272m[i2] = Integer.MIN_VALUE;
            }
        } else {
            int m14409S = m14409S(i);
            this.f25273n = m14409S;
            this.f25274o = m14409S - 1;
            this.f25275p = m14404Y(m14409S);
            int i3 = this.f25273n;
            this.f25269j = new Object[i3];
            this.f25270k = null;
            this.f25272m = new int[i3];
            this.f25276q = 0;
        }
        this.f25271l = null;
    }

    /* renamed from: S */
    private static int m14409S(int i) {
        return Math.max(2, m14402a0((int) Math.ceil(i / 0.75f)));
    }

    /* renamed from: U */
    private static InterfaceC7664p<Integer> m14408U(int i) {
        switch (i) {
            case 0:
                return C10697f0.f27908y;
            case 1:
                return C10697f0.f27887C;
            case 2:
                return C10697f0.f27888D;
            case 3:
                return C10711g0.f27935D;
            case 4:
                return C10711g0.f27937F;
            case 5:
                return C10711g0.f27939H;
            case 6:
                return C10711g0.f27943L;
            default:
                throw new IllegalStateException("No element index: " + i);
        }
    }

    /* renamed from: V */
    private int m14407V(InterfaceC7664p<?> interfaceC7664p) {
        Object obj;
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            if (interfaceC7664p == C10697f0.f27908y) {
                return this.f25272m[0];
            }
            if (interfaceC7664p == C10697f0.f27887C) {
                return this.f25272m[1];
            }
            if (interfaceC7664p == C10697f0.f27888D) {
                return this.f25272m[2];
            }
            if (interfaceC7664p == C10711g0.f27935D) {
                return this.f25273n;
            }
            if (interfaceC7664p == C10711g0.f27937F) {
                return this.f25274o;
            }
            if (interfaceC7664p == C10711g0.f27939H) {
                return this.f25275p;
            }
            if (interfaceC7664p == C10711g0.f27943L) {
                return this.f25276q;
            }
            Map<InterfaceC7664p<?>, Object> map = this.f25271l;
            if (map == null || !map.containsKey(interfaceC7664p)) {
                return Integer.MIN_VALUE;
            }
            return ((Integer) Integer.class.cast(map.get(interfaceC7664p))).intValue();
        }
        int m14403Z = m14403Z(interfaceC7664p.hashCode()) & this.f25274o;
        Object obj2 = objArr[m14403Z];
        if (obj2 == null) {
            return Integer.MIN_VALUE;
        }
        if (interfaceC7664p.equals(obj2)) {
            return this.f25272m[m14403Z];
        }
        do {
            m14403Z = (m14403Z + 1) & this.f25274o;
            obj = objArr[m14403Z];
            if (obj == null) {
                return Integer.MIN_VALUE;
            }
        } while (!interfaceC7664p.equals(obj));
        return this.f25272m[m14403Z];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public static boolean m14405X(InterfaceC7664p<?> interfaceC7664p) {
        return f25268t.contains(interfaceC7664p);
    }

    /* renamed from: Y */
    private static int m14404Y(int i) {
        return Math.min((int) Math.ceil(i * 0.75f), i - 1);
    }

    /* renamed from: Z */
    private static int m14403Z(int i) {
        int i2 = i * (-1640531527);
        return i2 ^ (i2 >>> 16);
    }

    /* renamed from: a0 */
    private static int m14402a0(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[SYNTHETIC] */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m14400c0(int r13) {
        /*
            r12 = this;
            java.lang.Object[] r0 = r12.f25269j
            java.lang.Object[] r1 = r12.f25270k
            int[] r2 = r12.f25272m
            int r3 = r13 + (-1)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            if (r1 != 0) goto Le
            r5 = 0
            goto L10
        Le:
            java.lang.Object[] r5 = new java.lang.Object[r13]
        L10:
            int[] r6 = new int[r13]
            int r7 = r12.f25273n
            int r8 = r12.f25276q
            r9 = 0
        L17:
            if (r9 >= r8) goto L46
        L19:
            int r7 = r7 + (-1)
            r10 = r0[r7]
            if (r10 != 0) goto L20
            goto L19
        L20:
            int r10 = r10.hashCode()
            int r10 = m14403Z(r10)
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L35
        L2d:
            int r10 = r10 + 1
            r10 = r10 & r3
            r11 = r4[r10]
            if (r11 == 0) goto L35
            goto L2d
        L35:
            r11 = r0[r7]
            r4[r10] = r11
            if (r1 == 0) goto L3f
            r11 = r1[r7]
            r5[r10] = r11
        L3f:
            r11 = r2[r7]
            r6[r10] = r11
            int r9 = r9 + 1
            goto L17
        L46:
            r12.f25273n = r13
            r12.f25274o = r3
            int r13 = m14404Y(r13)
            r12.f25275p = r13
            r12.f25269j = r4
            r12.f25270k = r5
            r12.f25272m = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9521v.m14400c0(int):void");
    }

    /* renamed from: d0 */
    private void m14399d0(Object obj) {
        Object obj2;
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            if (obj == C10697f0.f27908y) {
                this.f25272m[0] = Integer.MIN_VALUE;
                return;
            } else if (obj == C10697f0.f27887C) {
                this.f25272m[1] = Integer.MIN_VALUE;
                return;
            } else if (obj == C10697f0.f27888D) {
                this.f25272m[2] = Integer.MIN_VALUE;
                return;
            } else if (obj == C10711g0.f27935D) {
                this.f25273n = Integer.MIN_VALUE;
                return;
            } else if (obj == C10711g0.f27937F) {
                this.f25274o = Integer.MIN_VALUE;
                return;
            } else if (obj == C10711g0.f27939H) {
                this.f25275p = Integer.MIN_VALUE;
                return;
            } else if (obj == C10711g0.f27943L) {
                this.f25276q = Integer.MIN_VALUE;
                return;
            } else {
                Map<InterfaceC7664p<?>, Object> map = this.f25271l;
                if (map != null) {
                    map.remove(obj);
                    return;
                }
                return;
            }
        }
        int m14403Z = m14403Z(obj.hashCode()) & this.f25274o;
        Object obj3 = objArr[m14403Z];
        if (obj3 == null) {
            return;
        }
        if (obj.equals(obj3)) {
            m14398e0(m14403Z);
            return;
        }
        do {
            m14403Z = (m14403Z + 1) & this.f25274o;
            obj2 = objArr[m14403Z];
            if (obj2 == null) {
                return;
            }
        } while (!obj.equals(obj2));
        m14398e0(m14403Z);
    }

    /* renamed from: e0 */
    private void m14398e0(int i) {
        Object obj;
        this.f25276q--;
        Object[] objArr = this.f25269j;
        while (true) {
            int i2 = (i + 1) & this.f25274o;
            while (true) {
                obj = objArr[i2];
                if (obj == null) {
                    objArr[i] = null;
                    return;
                }
                int m14403Z = m14403Z(obj.hashCode());
                int i3 = this.f25274o;
                int i4 = m14403Z & i3;
                if (i <= i2) {
                    if (i >= i4 || i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else {
                    if (i >= i4 && i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                }
            }
            objArr[i] = obj;
            Object[] objArr2 = this.f25270k;
            if (objArr2 != null) {
                objArr2[i] = objArr2[i2];
            }
            int[] iArr = this.f25272m;
            iArr[i] = iArr[i2];
            i = i2;
        }
    }

    @Override // p202kj.AbstractC9519t
    /* renamed from: H */
    <E> E mo14416H() {
        return null;
    }

    @Override // p202kj.AbstractC9519t
    /* renamed from: I */
    void mo14415I(InterfaceC7664p<?> interfaceC7664p, int i) {
        Object obj;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            if (interfaceC7664p == C10697f0.f27908y) {
                if (!this.f25277r && (i8 = this.f25272m[0]) != Integer.MIN_VALUE && i8 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25272m[0] = i;
                return;
            } else if (interfaceC7664p == C10697f0.f27887C) {
                if (!this.f25277r && (i7 = this.f25272m[1]) != Integer.MIN_VALUE && i7 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25272m[1] = i;
                return;
            } else if (interfaceC7664p == C10697f0.f27888D) {
                if (!this.f25277r && (i6 = this.f25272m[2]) != Integer.MIN_VALUE && i6 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25272m[2] = i;
                return;
            } else if (interfaceC7664p == C10711g0.f27935D) {
                if (!this.f25277r && (i5 = this.f25273n) != Integer.MIN_VALUE && i5 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25273n = i;
                return;
            } else if (interfaceC7664p == C10711g0.f27937F) {
                if (!this.f25277r && (i4 = this.f25274o) != Integer.MIN_VALUE && i4 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25274o = i;
                return;
            } else if (interfaceC7664p == C10711g0.f27939H) {
                if (!this.f25277r && (i3 = this.f25275p) != Integer.MIN_VALUE && i3 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25275p = i;
                return;
            } else if (interfaceC7664p == C10711g0.f27943L) {
                if (!this.f25277r && (i2 = this.f25276q) != Integer.MIN_VALUE && i2 != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25276q = i;
                return;
            } else {
                Map map = this.f25271l;
                if (map == null) {
                    map = new HashMap();
                    this.f25271l = map;
                }
                Integer valueOf = Integer.valueOf(i);
                if (!this.f25277r && map.containsKey(interfaceC7664p) && !valueOf.equals(map.get(interfaceC7664p))) {
                    throw new C9474a(interfaceC7664p);
                }
                map.put(interfaceC7664p, valueOf);
                return;
            }
        }
        int m14403Z = m14403Z(interfaceC7664p.hashCode()) & this.f25274o;
        Object obj2 = objArr[m14403Z];
        if (obj2 != null) {
            if (obj2.equals(interfaceC7664p)) {
                if (!this.f25277r && this.f25272m[m14403Z] != i) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25272m[m14403Z] = i;
                return;
            }
            do {
                m14403Z = (m14403Z + 1) & this.f25274o;
                obj = objArr[m14403Z];
                if (obj != null) {
                }
            } while (!obj.equals(interfaceC7664p));
            if (!this.f25277r && this.f25272m[m14403Z] != i) {
                throw new C9474a(interfaceC7664p);
            }
            this.f25272m[m14403Z] = i;
            return;
        }
        objArr[m14403Z] = interfaceC7664p;
        this.f25272m[m14403Z] = i;
        int i9 = this.f25276q;
        int i10 = i9 + 1;
        this.f25276q = i10;
        if (i9 >= this.f25275p) {
            m14400c0(m14409S(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p202kj.AbstractC9519t
    /* renamed from: J */
    public void mo14414J(InterfaceC7664p<?> interfaceC7664p, Object obj) {
        Object obj2;
        if (obj == null) {
            m14399d0(interfaceC7664p);
        } else if (interfaceC7664p.getType() == Integer.class) {
            mo14415I(interfaceC7664p, ((Integer) Integer.class.cast(obj)).intValue());
        } else {
            Object[] objArr = this.f25269j;
            if (objArr == null) {
                Map map = this.f25271l;
                if (map == null) {
                    map = new HashMap();
                    this.f25271l = map;
                }
                if (!this.f25277r && map.containsKey(interfaceC7664p) && !obj.equals(map.get(interfaceC7664p))) {
                    throw new C9474a(interfaceC7664p);
                }
                map.put(interfaceC7664p, obj);
                return;
            }
            if (this.f25270k == null) {
                this.f25270k = new Object[this.f25273n];
            }
            int m14403Z = m14403Z(interfaceC7664p.hashCode()) & this.f25274o;
            Object obj3 = objArr[m14403Z];
            if (obj3 != null) {
                if (obj3.equals(interfaceC7664p)) {
                    if (!this.f25277r && !obj.equals(this.f25270k[m14403Z])) {
                        throw new C9474a(interfaceC7664p);
                    }
                    this.f25270k[m14403Z] = obj;
                    return;
                }
                do {
                    m14403Z = (m14403Z + 1) & this.f25274o;
                    obj2 = objArr[m14403Z];
                    if (obj2 != null) {
                    }
                } while (!obj2.equals(interfaceC7664p));
                if (!this.f25277r && !obj.equals(this.f25270k[m14403Z])) {
                    throw new C9474a(interfaceC7664p);
                }
                this.f25270k[m14403Z] = obj;
                return;
            }
            objArr[m14403Z] = interfaceC7664p;
            this.f25270k[m14403Z] = obj;
            int i = this.f25276q;
            int i2 = i + 1;
            this.f25276q = i2;
            if (i >= this.f25275p) {
                m14400c0(m14409S(i2));
            }
        }
    }

    @Override // p202kj.AbstractC9519t
    /* renamed from: K */
    void mo14413K(Object obj) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public int m14406W() {
        return this.f25278s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b0 */
    public void m14401b0(C9521v c9521v) {
        int i = 0;
        if (this.f25269j == null) {
            int i2 = c9521v.f25273n;
            if (i2 != Integer.MIN_VALUE) {
                int i3 = this.f25273n;
                if (i3 != Integer.MIN_VALUE && !this.f25277r && i3 != i2) {
                    throw new C9474a(C10711g0.f27935D);
                }
                this.f25273n = i2;
            }
            int i4 = c9521v.f25274o;
            if (i4 != Integer.MIN_VALUE) {
                int i5 = this.f25274o;
                if (i5 != Integer.MIN_VALUE && !this.f25277r && i5 != i4) {
                    throw new C9474a(C10711g0.f27937F);
                }
                this.f25274o = i4;
            }
            int i6 = c9521v.f25275p;
            if (i6 != Integer.MIN_VALUE) {
                int i7 = this.f25275p;
                if (i7 != Integer.MIN_VALUE && !this.f25277r && i7 != i6) {
                    throw new C9474a(C10711g0.f27939H);
                }
                this.f25275p = i6;
            }
            int i8 = c9521v.f25276q;
            if (i8 != Integer.MIN_VALUE) {
                int i9 = this.f25276q;
                if (i9 != Integer.MIN_VALUE && !this.f25277r && i9 != i8) {
                    throw new C9474a(C10711g0.f27943L);
                }
                this.f25276q = i8;
            }
            while (i < 3) {
                int i10 = c9521v.f25272m[i];
                if (i10 != Integer.MIN_VALUE) {
                    int[] iArr = this.f25272m;
                    int i11 = iArr[i];
                    if (i11 != Integer.MIN_VALUE && !this.f25277r && i11 != i10) {
                        throw new C9474a(m14408U(i));
                    }
                    iArr[i] = i10;
                }
                i++;
            }
            Map<InterfaceC7664p<?>, Object> map = c9521v.f25271l;
            if (map != null) {
                for (InterfaceC7664p<?> interfaceC7664p : map.keySet()) {
                    mo14414J(interfaceC7664p, map.get(interfaceC7664p));
                }
                return;
            }
            return;
        }
        Object[] objArr = c9521v.f25269j;
        while (i < objArr.length) {
            Object obj = objArr[i];
            if (obj != null) {
                InterfaceC7664p<?> interfaceC7664p2 = (InterfaceC7664p) InterfaceC7664p.class.cast(obj);
                if (interfaceC7664p2.getType() == Integer.class) {
                    mo14415I(interfaceC7664p2, c9521v.f25272m[i]);
                } else {
                    mo14414J(interfaceC7664p2, c9521v.f25270k[i]);
                }
            }
            i++;
        }
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: c */
    public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
        return m14407V(interfaceC7664p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void m14397f0() {
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            this.f25273n = Integer.MIN_VALUE;
            this.f25274o = Integer.MIN_VALUE;
            this.f25275p = Integer.MIN_VALUE;
            this.f25276q = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                this.f25272m[i] = Integer.MIN_VALUE;
            }
            this.f25271l = null;
        } else {
            this.f25269j = new Object[objArr.length];
        }
        this.f25276q = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void m14396g0() {
        this.f25277r = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void m14395h0(int i) {
        this.f25278s = i;
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: i */
    public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
        int m14403Z;
        Object obj;
        Object obj2;
        Class<V> type = interfaceC7664p.getType();
        if (type == Integer.class) {
            int m14407V = m14407V(interfaceC7664p);
            if (m14407V != Integer.MIN_VALUE) {
                return type.cast(Integer.valueOf(m14407V));
            }
            throw new C7666r("No value found for: " + interfaceC7664p.name());
        }
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            Map<InterfaceC7664p<?>, Object> map = this.f25271l;
            if (map != null && map.containsKey(interfaceC7664p)) {
                return interfaceC7664p.getType().cast(map.get(interfaceC7664p));
            }
            throw new C7666r("No value found for: " + interfaceC7664p.name());
        } else if (this.f25270k != null && (obj = objArr[(m14403Z = m14403Z(interfaceC7664p.hashCode()) & this.f25274o)]) != null) {
            if (interfaceC7664p.equals(obj)) {
                return type.cast(this.f25270k[m14403Z]);
            }
            do {
                m14403Z = (m14403Z + 1) & this.f25274o;
                obj2 = objArr[m14403Z];
                if (obj2 == null) {
                    throw new C7666r("No value found for: " + interfaceC7664p.name());
                }
            } while (!interfaceC7664p.equals(obj2));
            return type.cast(this.f25270k[m14403Z]);
        } else {
            throw new C7666r("No value found for: " + interfaceC7664p.name());
        }
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: q */
    public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
        Object obj;
        if (interfaceC7664p == null) {
            return false;
        }
        Object[] objArr = this.f25269j;
        if (objArr == null) {
            if (interfaceC7664p == C10697f0.f27908y) {
                if (this.f25272m[0] == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10697f0.f27887C) {
                if (this.f25272m[1] == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10697f0.f27888D) {
                if (this.f25272m[2] == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10711g0.f27935D) {
                if (this.f25273n == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10711g0.f27937F) {
                if (this.f25274o == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10711g0.f27939H) {
                if (this.f25275p == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else if (interfaceC7664p == C10711g0.f27943L) {
                if (this.f25276q == Integer.MIN_VALUE) {
                    return false;
                }
                return true;
            } else {
                Map<InterfaceC7664p<?>, Object> map = this.f25271l;
                if (map == null || !map.containsKey(interfaceC7664p)) {
                    return false;
                }
                return true;
            }
        }
        int m14403Z = m14403Z(interfaceC7664p.hashCode()) & this.f25274o;
        Object obj2 = objArr[m14403Z];
        if (obj2 == null) {
            return false;
        }
        if (interfaceC7664p.equals(obj2)) {
            return true;
        }
        do {
            m14403Z = (m14403Z + 1) & this.f25274o;
            obj = objArr[m14403Z];
            if (obj == null) {
                return false;
            }
        } while (!interfaceC7664p.equals(obj));
        return true;
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: z */
    public Set<InterfaceC7664p<?>> mo14394z() {
        if (this.f25269j == null) {
            HashSet hashSet = new HashSet();
            if (this.f25272m[0] != Integer.MIN_VALUE) {
                hashSet.add(C10697f0.f27908y);
            }
            if (this.f25272m[1] != Integer.MIN_VALUE) {
                hashSet.add(C10697f0.f27887C);
            }
            if (this.f25272m[2] != Integer.MIN_VALUE) {
                hashSet.add(C10697f0.f27888D);
            }
            if (this.f25273n != Integer.MIN_VALUE) {
                hashSet.add(C10711g0.f27935D);
            }
            if (this.f25274o != Integer.MIN_VALUE) {
                hashSet.add(C10711g0.f27937F);
            }
            if (this.f25275p != Integer.MIN_VALUE) {
                hashSet.add(C10711g0.f27939H);
            }
            if (this.f25276q != Integer.MIN_VALUE) {
                hashSet.add(C10711g0.f27943L);
            }
            Map<InterfaceC7664p<?>, Object> map = this.f25271l;
            if (map != null) {
                hashSet.addAll(map.keySet());
            }
            return Collections.unmodifiableSet(hashSet);
        }
        return new C9524c();
    }
}
