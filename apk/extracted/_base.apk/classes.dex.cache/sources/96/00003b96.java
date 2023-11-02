package p164j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8504x0 implements ObjDoubleConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8506y0 f22621a;

    private /* synthetic */ C8504x0(InterfaceC8506y0 interfaceC8506y0) {
        this.f22621a = interfaceC8506y0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjDoubleConsumer m17637a(InterfaceC8506y0 interfaceC8506y0) {
        if (interfaceC8506y0 == null) {
            return null;
        }
        return interfaceC8506y0 instanceof C8502w0 ? ((C8502w0) interfaceC8506y0).f22619a : new C8504x0(interfaceC8506y0);
    }

    @Override // java.util.function.ObjDoubleConsumer
    public final /* synthetic */ void accept(Object obj, double d) {
        this.f22621a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8506y0 interfaceC8506y0 = this.f22621a;
        if (obj instanceof C8504x0) {
            obj = ((C8504x0) obj).f22621a;
        }
        return interfaceC8506y0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22621a.hashCode();
    }
}