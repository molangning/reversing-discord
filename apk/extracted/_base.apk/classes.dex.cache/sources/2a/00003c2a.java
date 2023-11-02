package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.stream.c3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8647c3 extends AbstractC8652d3 implements Consumer {

    /* renamed from: b */
    final Object[] f22836b = new Object[128];

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22840a;
        this.f22840a = i + 1;
        this.f22836b[i] = obj;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }
}