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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b(\u0010)B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006-"}, m14357d2 = {"Lpf/e0;", "", "Lpf/d0;", "", "index", "r", "([JI)J", "value", "", "x", "([JIJ)V", "", "w", "([J)Ljava/util/Iterator;", "element", "", "k", "([JJ)Z", "elements", "o", "([JLjava/util/Collection;)Z", "v", "([J)Z", "", "y", "([J)Ljava/lang/String;", "u", "([J)I", "", "other", "p", "([JLjava/lang/Object;)Z", "", "j", "[J", "getStorage$annotations", "()V", "storage", "t", "size", "e", "(I)[J", "h", "([J)[J", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11558e0 implements Collection<C11555d0>, InterfaceC2533a {

    /* renamed from: j */
    private final long[] f30066j;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lpf/e0$a;", "", "Lpf/d0;", "", "hasNext", "a", "()J", "", "j", "[J", "array", "", "k", "I", "index", "<init>", "([J)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11559a implements Iterator<C11555d0>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final long[] f30067j;

        /* renamed from: k */
        private int f30068k;

        public C11559a(long[] array) {
            C9612q.m13917h(array, "array");
            this.f30067j = array;
        }

        /* renamed from: a */
        public long m7638a() {
            int i = this.f30068k;
            long[] jArr = this.f30067j;
            if (i < jArr.length) {
                this.f30068k = i + 1;
                return C11555d0.m7661b(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f30068k));
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11555d0> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f30068k < this.f30067j.length;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C11555d0.m7662a(m7638a());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C11558e0(long[] jArr) {
        this.f30066j = jArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11558e0 m7654a(long[] jArr) {
        return new C11558e0(jArr);
    }

    /* renamed from: e */
    public static long[] m7653e(int i) {
        return m7652h(new long[i]);
    }

    /* renamed from: h */
    public static long[] m7652h(long[] storage) {
        C9612q.m13917h(storage, "storage");
        return storage;
    }

    /* renamed from: k */
    public static boolean m7650k(long[] jArr, long j) {
        boolean m14192x;
        m14192x = C9538f.m14192x(jArr, j);
        return m14192x;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7649o(long[] r6, java.util.Collection<pf.C11555d0> r7) {
        /*
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C9612q.m13917h(r7, r0)
            boolean r0 = r7.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L32
        Ld:
            java.util.Iterator r7 = r7.iterator()
        L11:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r7.next()
            boolean r2 = r0 instanceof pf.C11555d0
            r3 = 0
            if (r2 == 0) goto L2e
            pf.d0 r0 = (pf.C11555d0) r0
            long r4 = r0.m7657f()
            boolean r0 = kotlin.collections.C9533b.m14280x(r6, r4)
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
        throw new UnsupportedOperationException("Method not decompiled: pf.C11558e0.m7649o(long[], java.util.Collection):boolean");
    }

    /* renamed from: p */
    public static boolean m7648p(long[] jArr, Object obj) {
        return (obj instanceof C11558e0) && C9612q.m13922c(jArr, ((C11558e0) obj).m7639z());
    }

    /* renamed from: r */
    public static final long m7647r(long[] jArr, int i) {
        return C11555d0.m7661b(jArr[i]);
    }

    /* renamed from: t */
    public static int m7645t(long[] jArr) {
        return jArr.length;
    }

    /* renamed from: u */
    public static int m7644u(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: v */
    public static boolean m7643v(long[] jArr) {
        return jArr.length == 0;
    }

    /* renamed from: w */
    public static java.util.Iterator<C11555d0> m7642w(long[] jArr) {
        return new C11559a(jArr);
    }

    /* renamed from: x */
    public static final void m7641x(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: y */
    public static String m7640y(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C11555d0 c11555d0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C11555d0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C11555d0) {
            return m7651i(((C11555d0) obj).m7657f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return m7649o(this.f30066j, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7648p(this.f30066j, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7644u(this.f30066j);
    }

    /* renamed from: i */
    public boolean m7651i(long j) {
        return m7650k(this.f30066j, j);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7643v(this.f30066j);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C11555d0> iterator() {
        return m7642w(this.f30066j);
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
        return m7645t(this.f30066j);
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
        return m7640y(this.f30066j);
    }

    /* renamed from: z */
    public final /* synthetic */ long[] m7639z() {
        return this.f30066j;
    }
}
