package p164j$.util.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.R2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
class C8600R2 extends AbstractC8653e implements Consumer, Iterable {

    /* renamed from: e */
    protected Object[] f22748e = new Object[1 << 4];

    /* renamed from: f */
    protected Object[][] f22749f;

    @Override // p164j$.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i = this.f22842b;
        Object[] objArr = this.f22748e;
        if (i == objArr.length) {
            if (this.f22749f == null) {
                Object[][] objArr2 = new Object[8];
                this.f22749f = objArr2;
                this.f22844d = new long[8];
                objArr2[0] = objArr;
            }
            int i2 = this.f22843c;
            int i3 = i2 + 1;
            Object[][] objArr3 = this.f22749f;
            if (i3 >= objArr3.length || objArr3[i3] == null) {
                if (i2 == 0) {
                    length = objArr.length;
                } else {
                    length = objArr3[i2].length + this.f22844d[i2];
                }
                m17549s(length + 1);
            }
            this.f22842b = 0;
            int i4 = this.f22843c + 1;
            this.f22843c = i4;
            this.f22748e = this.f22749f[i4];
        }
        Object[] objArr4 = this.f22748e;
        int i5 = this.f22842b;
        this.f22842b = i5 + 1;
        objArr4[i5] = obj;
    }

    @Override // p164j$.util.stream.AbstractC8653e
    public final void clear() {
        Object[][] objArr = this.f22749f;
        if (objArr != null) {
            this.f22748e = objArr[0];
            int i = 0;
            while (true) {
                Object[] objArr2 = this.f22748e;
                if (i >= objArr2.length) {
                    break;
                }
                objArr2[i] = null;
                i++;
            }
            this.f22749f = null;
            this.f22844d = null;
        } else {
            for (int i2 = 0; i2 < this.f22842b; i2++) {
                this.f22748e[i2] = null;
            }
        }
        this.f22842b = 0;
        this.f22843c = 0;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    public void forEach(Consumer consumer) {
        for (int i = 0; i < this.f22843c; i++) {
            for (Object obj : this.f22749f[i]) {
                consumer.accept(obj);
            }
        }
        for (int i2 = 0; i2 < this.f22842b; i2++) {
            consumer.accept(this.f22748e[i2]);
        }
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC8383c0.m17755i(spliterator());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public final void m17549s(long j) {
        long length;
        Object[][] objArr;
        int i;
        int i2 = this.f22843c;
        if (i2 == 0) {
            length = this.f22748e.length;
        } else {
            length = this.f22749f[i2].length + this.f22844d[i2];
        }
        if (j <= length) {
            return;
        }
        if (this.f22749f == null) {
            Object[][] objArr2 = new Object[8];
            this.f22749f = objArr2;
            this.f22844d = new long[8];
            objArr2[0] = this.f22748e;
        }
        while (true) {
            i2++;
            if (j <= length) {
                return;
            }
            Object[][] objArr3 = this.f22749f;
            if (i2 >= objArr3.length) {
                int length2 = objArr3.length * 2;
                this.f22749f = (Object[][]) Arrays.copyOf(objArr3, length2);
                this.f22844d = Arrays.copyOf(this.f22844d, length2);
            }
            int i3 = this.f22841a;
            if (i2 != 0 && i2 != 1) {
                i3 = Math.min((i3 + i2) - 1, 30);
            }
            int i4 = 1 << i3;
            this.f22749f[i2] = new Object[i4];
            long[] jArr = this.f22844d;
            jArr[i2] = jArr[i2 - 1] + objArr[i].length;
            length += i4;
        }
    }

    @Override // java.lang.Iterable
    public Spliterator spliterator() {
        return new C8565I2(this, 0, this.f22843c, 0, this.f22842b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        forEach(new C8633a(8, arrayList));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
