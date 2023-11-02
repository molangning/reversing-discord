package p164j$.util;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8379a0 implements Spliterator {

    /* renamed from: a */
    private final Collection f22452a;

    /* renamed from: b */
    private Iterator f22453b = null;

    /* renamed from: c */
    private final int f22454c;

    /* renamed from: d */
    private long f22455d;

    /* renamed from: e */
    private int f22456e;

    public C8379a0(int i, Collection collection) {
        this.f22452a = collection;
        this.f22454c = (i & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? i | 64 | 16384 : i;
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        consumer.getClass();
        if (this.f22453b == null) {
            Collection collection = this.f22452a;
            this.f22453b = collection.iterator();
            this.f22455d = collection.size();
        }
        if (this.f22453b.hasNext()) {
            consumer.accept(this.f22453b.next());
            return true;
        }
        return false;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return this.f22454c;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        if (this.f22453b == null) {
            Collection collection = this.f22452a;
            this.f22453b = collection.iterator();
            long size = collection.size();
            this.f22455d = size;
            return size;
        }
        return this.f22455d;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        Iterator it = this.f22453b;
        if (it == null) {
            Collection collection = this.f22452a;
            Iterator it2 = collection.iterator();
            this.f22453b = it2;
            this.f22455d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // p164j$.util.Spliterator
    public Comparator getComparator() {
        if (AbstractC8516n.m17605j(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC8516n.m17606i(this);
    }

    @Override // p164j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return AbstractC8516n.m17605j(this, i);
    }

    @Override // p164j$.util.Spliterator
    public final Spliterator trySplit() {
        long j;
        java.util.Iterator it = this.f22453b;
        if (it == null) {
            Collection collection = this.f22452a;
            java.util.Iterator it2 = collection.iterator();
            this.f22453b = it2;
            j = collection.size();
            this.f22455d = j;
            it = it2;
        } else {
            j = this.f22455d;
        }
        if (j <= 1 || !it.hasNext()) {
            return null;
        }
        int i = this.f22456e + 1024;
        if (i > j) {
            i = (int) j;
        }
        if (i > 33554432) {
            i = 33554432;
        }
        Object[] objArr = new Object[i];
        int i2 = 0;
        do {
            objArr[i2] = it.next();
            i2++;
            if (i2 >= i) {
                break;
            }
        } while (it.hasNext());
        this.f22456e = i2;
        long j2 = this.f22455d;
        if (j2 != Long.MAX_VALUE) {
            this.f22455d = j2 - i2;
        }
        return new C8371T(objArr, 0, i2, this.f22454c);
    }
}
