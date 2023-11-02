package p164j$.util.stream;

import java.util.List;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8474i0;

/* renamed from: j$.util.stream.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8633a implements InterfaceC8438K0, InterfaceC8474i0, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f22815a;

    /* renamed from: b */
    public final /* synthetic */ Object f22816b;

    public /* synthetic */ C8633a(int i, Object obj) {
        this.f22815a = i;
        this.f22816b = obj;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22815a;
        Object obj2 = this.f22816b;
        switch (i) {
            case 3:
                ((InterfaceC8671h2) obj2).accept(obj);
                return;
            default:
                ((List) obj2).add(obj);
                return;
        }
    }

    @Override // p164j$.util.function.InterfaceC8474i0
    public final Object apply(long j) {
        int i = C8575L0.f22715k;
        return AbstractC8744w0.m17362P0(j, (IntFunction) this.f22816b);
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22815a) {
            case 3:
                consumer.getClass();
                return new C8406u(3, this, consumer);
            default:
                consumer.getClass();
                return new C8406u(3, this, consumer);
        }
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        int i = this.f22815a;
        Object obj = this.f22816b;
        switch (i) {
            case 0:
                return (Spliterator) obj;
            default:
                return ((AbstractC8643c) obj).m17500G1();
        }
    }
}
