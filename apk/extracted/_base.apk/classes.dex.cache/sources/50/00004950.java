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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b(\u0010)B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006-"}, m14357d2 = {"Lpf/c0;", "", "Lpf/b0;", "", "index", "r", "([II)I", "value", "", "x", "([III)V", "", "w", "([I)Ljava/util/Iterator;", "element", "", "k", "([II)Z", "elements", "o", "([ILjava/util/Collection;)Z", "v", "([I)Z", "", "y", "([I)Ljava/lang/String;", "u", "([I)I", "", "other", "p", "([ILjava/lang/Object;)Z", "", "j", "[I", "getStorage$annotations", "()V", "storage", "t", "size", "e", "(I)[I", "h", "([I)[I", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11552c0 implements Collection<C11549b0>, InterfaceC2533a {

    /* renamed from: j */
    private final int[] f30057j;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lpf/c0$a;", "", "Lpf/b0;", "", "hasNext", "a", "()I", "", "j", "[I", "array", "", "k", "I", "index", "<init>", "([I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.c0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11553a implements Iterator<C11549b0>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final int[] f30058j;

        /* renamed from: k */
        private int f30059k;

        public C11553a(int[] array) {
            C9612q.m13917h(array, "array");
            this.f30058j = array;
        }

        /* renamed from: a */
        public int m7665a() {
            int i = this.f30059k;
            int[] iArr = this.f30058j;
            if (i < iArr.length) {
                this.f30059k = i + 1;
                return C11549b0.m7686b(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f30059k));
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11549b0> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f30059k < this.f30058j.length;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C11549b0.m7687a(m7665a());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C11552c0(int[] iArr) {
        this.f30057j = iArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11552c0 m7681a(int[] iArr) {
        return new C11552c0(iArr);
    }

    /* renamed from: e */
    public static int[] m7680e(int i) {
        return m7679h(new int[i]);
    }

    /* renamed from: h */
    public static int[] m7679h(int[] storage) {
        C9612q.m13917h(storage, "storage");
        return storage;
    }

    /* renamed from: k */
    public static boolean m7677k(int[] iArr, int i) {
        boolean m14194w;
        m14194w = C9538f.m14194w(iArr, i);
        return m14194w;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0031 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7676o(int[] r4, java.util.Collection<pf.C11549b0> r5) {
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
            boolean r2 = r0 instanceof pf.C11549b0
            r3 = 0
            if (r2 == 0) goto L2e
            pf.b0 r0 = (pf.C11549b0) r0
            int r0 = r0.m7682f()
            boolean r0 = kotlin.collections.C9533b.m14282w(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: pf.C11552c0.m7676o(int[], java.util.Collection):boolean");
    }

    /* renamed from: p */
    public static boolean m7675p(int[] iArr, Object obj) {
        return (obj instanceof C11552c0) && C9612q.m13922c(iArr, ((C11552c0) obj).m7666z());
    }

    /* renamed from: r */
    public static final int m7674r(int[] iArr, int i) {
        return C11549b0.m7686b(iArr[i]);
    }

    /* renamed from: t */
    public static int m7672t(int[] iArr) {
        return iArr.length;
    }

    /* renamed from: u */
    public static int m7671u(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: v */
    public static boolean m7670v(int[] iArr) {
        return iArr.length == 0;
    }

    /* renamed from: w */
    public static java.util.Iterator<C11549b0> m7669w(int[] iArr) {
        return new C11553a(iArr);
    }

    /* renamed from: x */
    public static final void m7668x(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: y */
    public static String m7667y(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C11549b0 c11549b0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C11549b0> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C11549b0) {
            return m7678i(((C11549b0) obj).m7682f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return m7676o(this.f30057j, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7675p(this.f30057j, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7671u(this.f30057j);
    }

    /* renamed from: i */
    public boolean m7678i(int i) {
        return m7677k(this.f30057j, i);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7670v(this.f30057j);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C11549b0> iterator() {
        return m7669w(this.f30057j);
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
        return m7672t(this.f30057j);
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
        return m7667y(this.f30057j);
    }

    /* renamed from: z */
    public final /* synthetic */ int[] m7666z() {
        return this.f30057j;
    }
}