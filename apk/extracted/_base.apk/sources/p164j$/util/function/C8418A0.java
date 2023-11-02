package p164j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.A0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8418A0 implements ObjIntConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8420B0 f22540a;

    private /* synthetic */ C8418A0(InterfaceC8420B0 interfaceC8420B0) {
        this.f22540a = interfaceC8420B0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjIntConsumer m17714a(InterfaceC8420B0 interfaceC8420B0) {
        if (interfaceC8420B0 == null) {
            return null;
        }
        return interfaceC8420B0 instanceof C8508z0 ? ((C8508z0) interfaceC8420B0).f22623a : new C8418A0(interfaceC8420B0);
    }

    @Override // java.util.function.ObjIntConsumer
    public final /* synthetic */ void accept(Object obj, int i) {
        this.f22540a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8420B0 interfaceC8420B0 = this.f22540a;
        if (obj instanceof C8418A0) {
            obj = ((C8418A0) obj).f22540a;
        }
        return interfaceC8420B0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22540a.hashCode();
    }
}
