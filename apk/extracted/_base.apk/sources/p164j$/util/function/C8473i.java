package p164j$.util.function;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.util.function.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8473i implements DoubleBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8475j f22597a;

    private /* synthetic */ C8473i(InterfaceC8475j interfaceC8475j) {
        this.f22597a = interfaceC8475j;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleBinaryOperator m17667a(InterfaceC8475j interfaceC8475j) {
        if (interfaceC8475j == null) {
            return null;
        }
        return interfaceC8475j instanceof C8471h ? ((C8471h) interfaceC8475j).f22595a : new C8473i(interfaceC8475j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public final /* synthetic */ double applyAsDouble(double d, double d2) {
        return this.f22597a.applyAsDouble(d, d2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8475j interfaceC8475j = this.f22597a;
        if (obj instanceof C8473i) {
            obj = ((C8473i) obj).f22597a;
        }
        return interfaceC8475j.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22597a.hashCode();
    }
}
