package p164j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8479l implements InterfaceC8483n {

    /* renamed from: a */
    public final /* synthetic */ DoubleConsumer f22602a;

    private /* synthetic */ C8479l(DoubleConsumer doubleConsumer) {
        this.f22602a = doubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8483n m17660a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C8481m ? ((C8481m) doubleConsumer).f22603a : new C8479l(doubleConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8483n
    public final /* synthetic */ void accept(double d) {
        this.f22602a.accept(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8479l) {
            obj = ((C8479l) obj).f22602a;
        }
        return this.f22602a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22602a.hashCode();
    }

    @Override // p164j$.util.function.InterfaceC8483n
    /* renamed from: n */
    public final /* synthetic */ InterfaceC8483n mo17299n(InterfaceC8483n interfaceC8483n) {
        return m17660a(this.f22602a.andThen(C8481m.m17659a(interfaceC8483n)));
    }
}
