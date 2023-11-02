package p304qf;

import gg.C6759j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r\u0012\u0006\u0010&\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(B\u0011\b\u0016\u0012\u0006\u0010\u001f\u001a\u00020\u0005¢\u0006\u0004\b'\u0010)J\u0018\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096\u0002J)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0012J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0013\u001a\u00020\u0005J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0005R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR$\u0010%\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b#\u0010$¨\u0006*"}, m14357d2 = {"Lqf/y;", "T", "Lqf/c;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "", "p", "", "iterator", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "maxCapacity", "o", "element", "", "k", "(Ljava/lang/Object;)V", "n", "r", "[Ljava/lang/Object;", "buffer", "l", "I", "capacity", "m", "startIndex", "<set-?>", "a", "()I", "size", "filledSize", "<init>", "([Ljava/lang/Object;I)V", "(I)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11892y<T> extends AbstractC11866c<T> implements RandomAccess {

    /* renamed from: k */
    private final Object[] f30879k;

    /* renamed from: l */
    private final int f30880l;

    /* renamed from: m */
    private int f30881m;

    /* renamed from: n */
    private int f30882n;

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, m14357d2 = {"qf/y$a", "Lqf/b;", "", "a", "", "l", "I", "count", "m", "index", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qf.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11893a extends AbstractC11864b<T> {

        /* renamed from: l */
        private int f30883l;

        /* renamed from: m */
        private int f30884m;

        /* renamed from: n */
        final /* synthetic */ C11892y<T> f30885n;

        C11893a(C11892y<T> c11892y) {
            this.f30885n = c11892y;
            this.f30883l = c11892y.size();
            this.f30884m = ((C11892y) c11892y).f30881m;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p304qf.AbstractC11864b
        /* renamed from: a */
        protected void mo502a() {
            if (this.f30883l == 0) {
                m6811e();
                return;
            }
            m6810f(((C11892y) this.f30885n).f30879k[this.f30884m]);
            this.f30884m = (this.f30884m + 1) % ((C11892y) this.f30885n).f30880l;
            this.f30883l--;
        }
    }

    public C11892y(Object[] buffer, int i) {
        C9612q.m13917h(buffer, "buffer");
        this.f30879k = buffer;
        if (i >= 0) {
            if (i <= buffer.length) {
                this.f30880l = buffer.length;
                this.f30882n = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    @Override // p304qf.AbstractC11861a
    /* renamed from: a */
    public int mo3916a() {
        return this.f30882n;
    }

    @Override // p304qf.AbstractC11866c, java.util.List
    public T get(int i) {
        AbstractC11866c.f30863j.m6808a(i, size());
        return (T) this.f30879k[(this.f30881m + i) % this.f30880l];
    }

    @Override // p304qf.AbstractC11866c, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<T> iterator() {
        return new C11893a(this);
    }

    /* renamed from: k */
    public final void m6736k(T t) {
        if (!m6734p()) {
            this.f30879k[(this.f30881m + size()) % this.f30880l] = t;
            this.f30882n = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final C11892y<T> m6735o(int i) {
        int m21926g;
        Object[] array;
        int i2 = this.f30880l;
        m21926g = C6759j.m21926g(i2 + (i2 >> 1) + 1, i);
        if (this.f30881m == 0) {
            array = Arrays.copyOf(this.f30879k, m21926g);
            C9612q.m13918g(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[m21926g]);
        }
        return new C11892y<>(array, size());
    }

    /* renamed from: p */
    public final boolean m6734p() {
        return size() == this.f30880l;
    }

    /* renamed from: r */
    public final void m6733r(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (z2) {
                if (i > 0) {
                    int i2 = this.f30881m;
                    int i3 = (i2 + i) % this.f30880l;
                    if (i2 > i3) {
                        C9536e.m14266l(this.f30879k, null, i2, this.f30880l);
                        C9536e.m14266l(this.f30879k, null, 0, i3);
                    } else {
                        C9536e.m14266l(this.f30879k, null, i2, i3);
                    }
                    this.f30881m = i3;
                    this.f30882n = size() - i;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p304qf.AbstractC11861a, java.util.Collection
    public <T> T[] toArray(T[] array) {
        C9612q.m13917h(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            C9612q.m13918g(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.f30881m; i2 < size && i3 < this.f30880l; i3++) {
            array[i2] = this.f30879k[i3];
            i2++;
        }
        while (i2 < size) {
            array[i2] = this.f30879k[i];
            i2++;
            i++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public C11892y(int i) {
        this(new Object[i], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p304qf.AbstractC11861a, java.util.Collection
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}