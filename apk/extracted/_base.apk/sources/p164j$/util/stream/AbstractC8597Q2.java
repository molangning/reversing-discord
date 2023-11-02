package p164j$.util.stream;

import java.util.Arrays;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.Q2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
abstract class AbstractC8597Q2 extends AbstractC8653e implements Iterable {

    /* renamed from: e */
    Object f22745e;

    /* renamed from: f */
    Object[] f22746f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8597Q2() {
        this.f22745e = newArray(16);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC8597Q2(int i) {
        super(i);
        this.f22745e = newArray(1 << this.f22841a);
    }

    /* renamed from: b */
    public Object mo17430b() {
        long count = count();
        if (count < 2147483639) {
            Object newArray = newArray((int) count);
            mo17429c(0, newArray);
            return newArray;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    /* renamed from: c */
    public void mo17429c(int i, Object obj) {
        long j = i;
        long count = count() + j;
        if (count > mo17554t(obj) || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f22843c == 0) {
            System.arraycopy(this.f22745e, 0, obj, i, this.f22842b);
            return;
        }
        for (int i2 = 0; i2 < this.f22843c; i2++) {
            Object obj2 = this.f22746f[i2];
            System.arraycopy(obj2, 0, obj, i, mo17554t(obj2));
            i += mo17554t(this.f22746f[i2]);
        }
        int i3 = this.f22842b;
        if (i3 > 0) {
            System.arraycopy(this.f22745e, 0, obj, i, i3);
        }
    }

    @Override // p164j$.util.stream.AbstractC8653e
    public final void clear() {
        Object[] objArr = this.f22746f;
        if (objArr != null) {
            this.f22745e = objArr[0];
            this.f22746f = null;
            this.f22844d = null;
        }
        this.f22842b = 0;
        this.f22843c = 0;
    }

    /* renamed from: d */
    public void mo17428d(Object obj) {
        for (int i = 0; i < this.f22843c; i++) {
            Object obj2 = this.f22746f[i];
            mo17555s(obj2, 0, mo17554t(obj2), obj);
        }
        mo17555s(this.f22745e, 0, this.f22842b, obj);
    }

    public abstract Object newArray(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo17555s(Object obj, int i, int i2, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo17554t(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: u */
    public final int m17553u(long j) {
        if (this.f22843c == 0) {
            if (j < this.f22842b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else if (j < count()) {
            for (int i = 0; i <= this.f22843c; i++) {
                if (j < this.f22844d[i] + mo17554t(this.f22746f[i])) {
                    return i;
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public final void m17552v(long j) {
        long mo17554t;
        int i;
        int i2 = this.f22843c;
        if (i2 == 0) {
            mo17554t = mo17554t(this.f22745e);
        } else {
            mo17554t = mo17554t(this.f22746f[i2]) + this.f22844d[i2];
        }
        if (j <= mo17554t) {
            return;
        }
        if (this.f22746f == null) {
            Object[] mo17551w = mo17551w();
            this.f22746f = mo17551w;
            this.f22844d = new long[8];
            mo17551w[0] = this.f22745e;
        }
        int i3 = this.f22843c;
        while (true) {
            i3++;
            if (j <= mo17554t) {
                return;
            }
            Object[] objArr = this.f22746f;
            if (i3 >= objArr.length) {
                int length = objArr.length * 2;
                this.f22746f = Arrays.copyOf(objArr, length);
                this.f22844d = Arrays.copyOf(this.f22844d, length);
            }
            int i4 = this.f22841a;
            if (i3 != 0 && i3 != 1) {
                i4 = Math.min((i4 + i3) - 1, 30);
            }
            int i5 = 1 << i4;
            this.f22746f[i3] = newArray(i5);
            long[] jArr = this.f22844d;
            jArr[i3] = jArr[i3 - 1] + mo17554t(this.f22746f[i]);
            mo17554t += i5;
        }
    }

    /* renamed from: w */
    protected abstract Object[] mo17551w();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x */
    public final void m17550x() {
        long mo17554t;
        if (this.f22842b == mo17554t(this.f22745e)) {
            if (this.f22746f == null) {
                Object[] mo17551w = mo17551w();
                this.f22746f = mo17551w;
                this.f22844d = new long[8];
                mo17551w[0] = this.f22745e;
            }
            int i = this.f22843c;
            int i2 = i + 1;
            Object[] objArr = this.f22746f;
            if (i2 >= objArr.length || objArr[i2] == null) {
                if (i == 0) {
                    mo17554t = mo17554t(this.f22745e);
                } else {
                    mo17554t = mo17554t(objArr[i]) + this.f22844d[i];
                }
                m17552v(mo17554t + 1);
            }
            this.f22842b = 0;
            int i3 = this.f22843c + 1;
            this.f22843c = i3;
            this.f22745e = this.f22746f[i3];
        }
    }
}
