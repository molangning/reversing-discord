package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.C3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8536C3 extends AbstractC8624X2 {
    C8536C3(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z) {
        super(abstractC8744w0, spliterator, z);
    }

    public C8536C3(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z) {
        super(abstractC8744w0, c8633a, z);
    }

    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    public final boolean mo17305a(Consumer consumer) {
        Object obj;
        consumer.getClass();
        boolean m17531e = m17531e();
        if (m17531e) {
            C8600R2 c8600r2 = (C8600R2) this.f22810h;
            long j = this.f22809g;
            if (c8600r2.f22843c != 0) {
                if (j < c8600r2.count()) {
                    for (int i = 0; i <= c8600r2.f22843c; i++) {
                        long j2 = c8600r2.f22844d[i];
                        Object[] objArr = c8600r2.f22749f[i];
                        if (j < objArr.length + j2) {
                            obj = objArr[(int) (j - j2)];
                        }
                    }
                    throw new IndexOutOfBoundsException(Long.toString(j));
                }
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else if (j >= c8600r2.f22842b) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            } else {
                obj = c8600r2.f22748e[(int) j];
            }
            consumer.accept(obj);
        }
        return m17531e;
    }

    @Override // p164j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f22810h != null || this.f22811i) {
            do {
            } while (mo17305a(consumer));
            return;
        }
        consumer.getClass();
        m17529h();
        C8531B3 c8531b3 = new C8531B3(consumer, 1);
        this.f22804b.mo17321w1(this.f22806d, c8531b3);
        this.f22811i = true;
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: i */
    final void mo17436i() {
        C8600R2 c8600r2 = new C8600R2();
        this.f22810h = c8600r2;
        this.f22807e = this.f22804b.mo17319x1(new C8531B3(c8600r2, 0));
        this.f22808f = new C8633a(7, this);
    }

    @Override // p164j$.util.stream.AbstractC8624X2
    /* renamed from: j */
    final AbstractC8624X2 mo17435j(Spliterator spliterator) {
        return new C8536C3(this.f22804b, spliterator, this.f22803a);
    }
}