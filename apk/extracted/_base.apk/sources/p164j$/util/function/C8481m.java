package p164j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8481m implements DoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8483n f22603a;

    private /* synthetic */ C8481m(InterfaceC8483n interfaceC8483n) {
        this.f22603a = interfaceC8483n;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleConsumer m17659a(InterfaceC8483n interfaceC8483n) {
        if (interfaceC8483n == null) {
            return null;
        }
        return interfaceC8483n instanceof C8479l ? ((C8479l) interfaceC8483n).f22602a : new C8481m(interfaceC8483n);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        this.f22603a.accept(d);
    }

    @Override // java.util.function.DoubleConsumer
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return m17659a(this.f22603a.mo17299n(C8479l.m17660a(doubleConsumer)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8483n interfaceC8483n = this.f22603a;
        if (obj instanceof C8481m) {
            obj = ((C8481m) obj).f22603a;
        }
        return interfaceC8483n.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22603a.hashCode();
    }
}
