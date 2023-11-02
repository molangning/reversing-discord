package p164j$.util.concurrent;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: j$.util.concurrent.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8388c implements Collection, Serializable {

    /* renamed from: a */
    final ConcurrentHashMap f22487a;

    public AbstractC8388c(ConcurrentHashMap concurrentHashMap) {
        this.f22487a = concurrentHashMap;
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f22487a.clear();
    }

    @Override // java.util.Collection
    public abstract boolean contains(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:25:0x000c  */
    @Override // java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsAll(java.util.Collection r2) {
        /*
            r1 = this;
            if (r2 == r1) goto L1a
            java.util.Iterator r2 = r2.iterator()
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            if (r0 == 0) goto L18
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L6
        L18:
            r2 = 0
            return r2
        L1a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.AbstractC8388c.containsAll(java.util.Collection):boolean");
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f22487a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public abstract Iterator iterator();

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        Iterator it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f22487a.size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        long mappingCount = this.f22487a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i = (int) mappingCount;
            Object[] objArr = new Object[i];
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == i) {
                    if (i >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = i < 1073741819 ? (i >>> 1) + 1 + i : 2147483639;
                    objArr = Arrays.copyOf(objArr, i3);
                    i = i3;
                }
                objArr[i2] = next;
                i2++;
            }
            return i2 == i ? objArr : Arrays.copyOf(objArr, i2);
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        long mappingCount = this.f22487a.mappingCount();
        if (mappingCount <= 2147483639) {
            int i = (int) mappingCount;
            Object[] objArr2 = objArr.length >= i ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
            int length = objArr2.length;
            Iterator it = iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                if (i2 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i3 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArr2 = Arrays.copyOf(objArr2, i3);
                    length = i3;
                }
                objArr2[i2] = next;
                i2++;
            }
            if (objArr != objArr2 || i2 >= length) {
                return i2 == length ? objArr2 : Arrays.copyOf(objArr2, i2);
            }
            objArr2[i2] = null;
            return objArr2;
        }
        throw new OutOfMemoryError("Required array size too large");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        if (it.hasNext()) {
            while (true) {
                Object next = it.next();
                if (next == this) {
                    next = "(this Collection)";
                }
                sb2.append(next);
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}