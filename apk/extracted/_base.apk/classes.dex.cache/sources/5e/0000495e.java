package pf;

import cg.InterfaceC2533a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.jvm.internal.C9597i;
import kotlin.jvm.internal.C9612q;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b(\u0010)B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006-"}, m14357d2 = {"Lpf/h0;", "", "Lpf/g0;", "", "index", "r", "([SI)S", "value", "", "x", "([SIS)V", "", "w", "([S)Ljava/util/Iterator;", "element", "", "k", "([SS)Z", "elements", "o", "([SLjava/util/Collection;)Z", "v", "([S)Z", "", "y", "([S)Ljava/lang/String;", "u", "([S)I", "", "other", "p", "([SLjava/lang/Object;)Z", "", "j", "[S", "getStorage$annotations", "()V", "storage", "t", "size", "e", "(I)[S", "h", "([S)[S", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11566h0 implements Collection<C11563g0>, InterfaceC2533a {

    /* renamed from: j */
    private final short[] f30073j;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lpf/h0$a;", "", "Lpf/g0;", "", "hasNext", "a", "()S", "", "j", "[S", "array", "", "k", "I", "index", "<init>", "([S)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11567a implements Iterator<C11563g0>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final short[] f30074j;

        /* renamed from: k */
        private int f30075k;

        public C11567a(short[] array) {
            C9612q.m13917h(array, "array");
            this.f30074j = array;
        }

        /* renamed from: a */
        public short m7613a() {
            int i = this.f30075k;
            short[] sArr = this.f30074j;
            if (i < sArr.length) {
                this.f30075k = i + 1;
                return C11563g0.m7634b(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f30075k));
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11563g0> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f30075k < this.f30074j.length;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C11563g0.m7635a(m7613a());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C11566h0(short[] sArr) {
        this.f30073j = sArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11566h0 m7629a(short[] sArr) {
        return new C11566h0(sArr);
    }

    /* renamed from: e */
    public static short[] m7628e(int i) {
        return m7627h(new short[i]);
    }

    /* renamed from: h */
    public static short[] m7627h(short[] storage) {
        C9612q.m13917h(storage, "storage");
        return storage;
    }

    /* renamed from: k */
    public static boolean m7625k(short[] sArr, short s) {
        boolean m14188z;
        m14188z = C9538f.m14188z(sArr, s);
        return m14188z;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0031 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7624o(short[] r4, java.util.Collection<pf.C11563g0> r5) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            boolean r0 = r5.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L32
        Ld:
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r5.next()
            boolean r2 = r0 instanceof pf.C11563g0
            r3 = 0
            if (r2 == 0) goto L2e
            pf.g0 r0 = (pf.C11563g0) r0
            short r0 = r0.m7630f()
            boolean r0 = kotlin.collections.C9533b.m14278z(r4, r0)
            if (r0 == 0) goto L2e
            r0 = r1
            goto L2f
        L2e:
            r0 = r3
        L2f:
            if (r0 != 0) goto L11
            r1 = r3
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.C11566h0.m7624o(short[], java.util.Collection):boolean");
    }

    /* renamed from: p */
    public static boolean m7623p(short[] sArr, Object obj) {
        return (obj instanceof C11566h0) && C9612q.m13922c(sArr, ((C11566h0) obj).m7614z());
    }

    /* renamed from: r */
    public static final short m7622r(short[] sArr, int i) {
        return C11563g0.m7634b(sArr[i]);
    }

    /* renamed from: t */
    public static int m7620t(short[] sArr) {
        return sArr.length;
    }

    /* renamed from: u */
    public static int m7619u(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: v */
    public static boolean m7618v(short[] sArr) {
        return sArr.length == 0;
    }

    /* renamed from: w */
    public static java.util.Iterator<C11563g0> m7617w(short[] sArr) {
        return new C11567a(sArr);
    }

    /* renamed from: x */
    public static final void m7616x(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: y */
    public static String m7615y(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C11563g0 c11563g0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C11563g0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C11563g0) {
            return m7626i(((C11563g0) obj).m7630f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return m7624o(this.f30073j, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7623p(this.f30073j, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7619u(this.f30073j);
    }

    /* renamed from: i */
    public boolean m7626i(short s) {
        return m7625k(this.f30073j, s);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7618v(this.f30073j);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C11563g0> iterator() {
        return m7617w(this.f30073j);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    /* renamed from: s */
    public int size() {
        return m7620t(this.f30073j);
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C9597i.m13947a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9612q.m13917h(array, "array");
        return (T[]) C9597i.m13946b(this, array);
    }

    public String toString() {
        return m7615y(this.f30073j);
    }

    /* renamed from: z */
    public final /* synthetic */ short[] m7614z() {
        return this.f30073j;
    }
}