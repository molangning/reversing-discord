package p164j$.util.stream;

import java.util.Comparator;
import p164j$.util.AbstractC8383c0;
import p164j$.util.AbstractC8516n;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.I2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8565I2 implements Spliterator {

    /* renamed from: a */
    int f22698a;

    /* renamed from: b */
    final int f22699b;

    /* renamed from: c */
    int f22700c;

    /* renamed from: d */
    final int f22701d;

    /* renamed from: e */
    Object[] f22702e;

    /* renamed from: f */
    final /* synthetic */ C8600R2 f22703f;

    public C8565I2(C8600R2 c8600r2, int i, int i2, int i3, int i4) {
        this.f22703f = c8600r2;
        this.f22698a = i;
        this.f22699b = i2;
        this.f22700c = i3;
        this.f22701d = i4;
        Object[][] objArr = c8600r2.f22749f;
        this.f22702e = objArr == null ? c8600r2.f22748e : objArr[i];
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        consumer.getClass();
        int i = this.f22698a;
        int i2 = this.f22699b;
        if (i < i2 || (i == i2 && this.f22700c < this.f22701d)) {
            Object[] objArr = this.f22702e;
            int i3 = this.f22700c;
            this.f22700c = i3 + 1;
            consumer.accept(objArr[i3]);
            if (this.f22700c == this.f22702e.length) {
                this.f22700c = 0;
                int i4 = this.f22698a + 1;
                this.f22698a = i4;
                Object[][] objArr2 = this.f22703f.f22749f;
                if (objArr2 != null && i4 <= i2) {
                    this.f22702e = objArr2[i4];
                }
            }
            return true;
        }
        return false;
    }

    @Override // p164j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p164j$.util.Spliterator
    public final long estimateSize() {
        int i = this.f22698a;
        int i2 = this.f22701d;
        int i3 = this.f22699b;
        if (i == i3) {
            return i2 - this.f22700c;
        }
        long[] jArr = this.f22703f.f22844d;
        return ((jArr[i3] + i2) - jArr[i]) - this.f22700c;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C8600R2 c8600r2;
        consumer.getClass();
        int i = this.f22698a;
        int i2 = this.f22701d;
        int i3 = this.f22699b;
        if (i < i3 || (i == i3 && this.f22700c < i2)) {
            int i4 = this.f22700c;
            while (true) {
                c8600r2 = this.f22703f;
                if (i >= i3) {
                    break;
                }
                Object[] objArr = c8600r2.f22749f[i];
                while (i4 < objArr.length) {
                    consumer.accept(objArr[i4]);
                    i4++;
                }
                i++;
                i4 = 0;
            }
            Object[] objArr2 = this.f22698a == i3 ? this.f22702e : c8600r2.f22749f[i3];
            while (i4 < i2) {
                consumer.accept(objArr2[i4]);
                i4++;
            }
            this.f22698a = i3;
            this.f22700c = i2;
        }
    }

    @Override // p164j$.util.Spliterator
    public final Comparator getComparator() {
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
        int i = this.f22698a;
        int i2 = this.f22699b;
        if (i < i2) {
            int i3 = i2 - 1;
            int i4 = this.f22700c;
            C8600R2 c8600r2 = this.f22703f;
            C8565I2 c8565i2 = new C8565I2(c8600r2, i, i3, i4, c8600r2.f22749f[i3].length);
            this.f22698a = i2;
            this.f22700c = 0;
            this.f22702e = c8600r2.f22749f[i2];
            return c8565i2;
        } else if (i == i2) {
            int i5 = this.f22700c;
            int i6 = (this.f22701d - i5) / 2;
            if (i6 == 0) {
                return null;
            }
            Spliterator m17751m = AbstractC8383c0.m17751m(this.f22702e, i5, i5 + i6);
            this.f22700c += i6;
            return m17751m;
        } else {
            return null;
        }
    }
}