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

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b(\u0010)B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 ø\u0001\u0001¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0000X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u0088\u0001%\u0092\u0001\u00020 ø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006-"}, m14357d2 = {"Lpf/a0;", "", "Lpf/z;", "", "index", "r", "([BI)B", "value", "", "x", "([BIB)V", "", "w", "([B)Ljava/util/Iterator;", "element", "", "k", "([BB)Z", "elements", "o", "([BLjava/util/Collection;)Z", "v", "([B)Z", "", "y", "([B)Ljava/lang/String;", "u", "([B)I", "", "other", "p", "([BLjava/lang/Object;)Z", "", "j", "[B", "getStorage$annotations", "()V", "storage", "t", "size", "e", "(I)[B", "h", "([B)[B", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11546a0 implements Collection<C11593z>, InterfaceC2533a {

    /* renamed from: j */
    private final byte[] f30051j;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\u0016\u0010\u0005\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rø\u0001\u0001\u0082\u0002\b\n\u0002\b!\n\u0002\b\u0019¨\u0006\u0011"}, m14357d2 = {"Lpf/a0$a;", "", "Lpf/z;", "", "hasNext", "a", "()B", "", "j", "[B", "array", "", "k", "I", "index", "<init>", "([B)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: pf.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11547a implements Iterator<C11593z>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private final byte[] f30052j;

        /* renamed from: k */
        private int f30053k;

        public C11547a(byte[] array) {
            C9612q.m13917h(array, "array");
            this.f30052j = array;
        }

        /* renamed from: a */
        public byte m7690a() {
            int i = this.f30053k;
            byte[] bArr = this.f30052j;
            if (i < bArr.length) {
                this.f30053k = i + 1;
                return C11593z.m7575b(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f30053k));
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C11593z> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f30053k < this.f30052j.length;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public /* bridge */ /* synthetic */ Object next() {
            return C11593z.m7576a(m7690a());
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ C11546a0(byte[] bArr) {
        this.f30051j = bArr;
    }

    /* renamed from: a */
    public static final /* synthetic */ C11546a0 m7706a(byte[] bArr) {
        return new C11546a0(bArr);
    }

    /* renamed from: e */
    public static byte[] m7705e(int i) {
        return m7704h(new byte[i]);
    }

    /* renamed from: h */
    public static byte[] m7704h(byte[] storage) {
        C9612q.m13917h(storage, "storage");
        return storage;
    }

    /* renamed from: k */
    public static boolean m7702k(byte[] bArr, byte b) {
        boolean m14196v;
        m14196v = C9538f.m14196v(bArr, b);
        return m14196v;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m7701o(byte[] r4, java.util.Collection<pf.C11593z> r5) {
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
            boolean r2 = r0 instanceof pf.C11593z
            r3 = 0
            if (r2 == 0) goto L2e
            pf.z r0 = (pf.C11593z) r0
            byte r0 = r0.m7571f()
            boolean r0 = kotlin.collections.C9533b.m14284v(r4, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: pf.C11546a0.m7701o(byte[], java.util.Collection):boolean");
    }

    /* renamed from: p */
    public static boolean m7700p(byte[] bArr, Object obj) {
        return (obj instanceof C11546a0) && C9612q.m13922c(bArr, ((C11546a0) obj).m7691z());
    }

    /* renamed from: r */
    public static final byte m7699r(byte[] bArr, int i) {
        return C11593z.m7575b(bArr[i]);
    }

    /* renamed from: t */
    public static int m7697t(byte[] bArr) {
        return bArr.length;
    }

    /* renamed from: u */
    public static int m7696u(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: v */
    public static boolean m7695v(byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: w */
    public static java.util.Iterator<C11593z> m7694w(byte[] bArr) {
        return new C11547a(bArr);
    }

    /* renamed from: x */
    public static final void m7693x(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: y */
    public static String m7692y(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(C11593z c11593z) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends C11593z> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C11593z) {
            return m7703i(((C11593z) obj).m7571f());
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return m7701o(this.f30051j, elements);
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        return m7700p(this.f30051j, obj);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return m7696u(this.f30051j);
    }

    /* renamed from: i */
    public boolean m7703i(byte b) {
        return m7702k(this.f30051j, b);
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return m7695v(this.f30051j);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<C11593z> iterator() {
        return m7694w(this.f30051j);
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
        return m7697t(this.f30051j);
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
        return m7692y(this.f30051j);
    }

    /* renamed from: z */
    public final /* synthetic */ byte[] m7691z() {
        return this.f30051j;
    }
}
