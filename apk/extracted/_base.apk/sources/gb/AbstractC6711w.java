package gb;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import p102fb.C6378h;

/* renamed from: gb.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC6711w<E> extends AbstractC6683q<E> implements Set<E> {

    /* renamed from: k */
    private transient AbstractC6693s<E> f18924k;

    /* renamed from: A */
    private static boolean m22074A(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static int m22071p(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z = false;
        }
        C6378h.m22839e(z, "collection too large");
        return 1073741824;
    }

    /* renamed from: r */
    private static <E> AbstractC6711w<E> m22070r(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int m22071p = m22071p(i);
                Object[] objArr2 = new Object[m22071p];
                int i2 = m22071p - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object m22243a = C6654i0.m22243a(objArr[i5], i5);
                    int hashCode = m22243a.hashCode();
                    int m22157b = C6681p.m22157b(hashCode);
                    while (true) {
                        int i6 = m22157b & i2;
                        Object obj = objArr2[i6];
                        if (obj == null) {
                            objArr[i4] = m22243a;
                            objArr2[i6] = m22243a;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj.equals(m22243a)) {
                            break;
                        } else {
                            m22157b++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    return new C6697s0(objArr[0], i3);
                }
                if (m22071p(i4) < m22071p / 2) {
                    return m22070r(i4, objArr);
                }
                if (m22074A(i4, objArr.length)) {
                    objArr = Arrays.copyOf(objArr, i4);
                }
                return new C6678n0(objArr, i3, objArr2, i2, i4);
            }
            return m22064x(objArr[0]);
        }
        return m22065w();
    }

    /* renamed from: s */
    public static <E> AbstractC6711w<E> m22069s(Collection<? extends E> collection) {
        if ((collection instanceof AbstractC6711w) && !(collection instanceof SortedSet)) {
            AbstractC6711w<E> abstractC6711w = (AbstractC6711w) collection;
            if (!abstractC6711w.mo22122k()) {
                return abstractC6711w;
            }
        }
        Object[] array = collection.toArray();
        return m22070r(array.length, array);
    }

    /* renamed from: t */
    public static <E> AbstractC6711w<E> m22068t(E[] eArr) {
        int length = eArr.length;
        if (length != 0) {
            if (length != 1) {
                return m22070r(eArr.length, (Object[]) eArr.clone());
            }
            return m22064x(eArr[0]);
        }
        return m22065w();
    }

    /* renamed from: w */
    public static <E> AbstractC6711w<E> m22065w() {
        return C6678n0.f18875q;
    }

    /* renamed from: x */
    public static <E> AbstractC6711w<E> m22064x(E e) {
        return new C6697s0(e);
    }

    /* renamed from: y */
    public static <E> AbstractC6711w<E> m22063y(E e, E e2) {
        return m22070r(2, e, e2);
    }

    /* renamed from: z */
    public static <E> AbstractC6711w<E> m22062z(E e, E e2, E e3) {
        return m22070r(3, e, e2, e3);
    }

    @Override // gb.AbstractC6683q
    /* renamed from: a */
    public AbstractC6693s<E> mo22073a() {
        AbstractC6693s<E> abstractC6693s = this.f18924k;
        if (abstractC6693s == null) {
            AbstractC6693s<E> mo22067u = mo22067u();
            this.f18924k = mo22067u;
            return mo22067u;
        }
        return abstractC6693s;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof AbstractC6711w) && mo22066v() && ((AbstractC6711w) obj).mo22066v() && hashCode() != obj.hashCode()) {
            return false;
        }
        return C6688r0.m22151a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C6688r0.m22150b(this);
    }

    @Override // gb.AbstractC6683q, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: o */
    public abstract AbstractC6703u0<E> iterator();

    /* renamed from: u */
    AbstractC6693s<E> mo22067u() {
        return AbstractC6693s.m22138p(toArray());
    }

    /* renamed from: v */
    boolean mo22066v() {
        return false;
    }
}
