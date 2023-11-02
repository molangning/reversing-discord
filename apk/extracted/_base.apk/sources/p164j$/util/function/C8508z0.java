package p164j$.util.function;

import java.util.function.ObjIntConsumer;

/* renamed from: j$.util.function.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8508z0 implements InterfaceC8420B0 {

    /* renamed from: a */
    public final /* synthetic */ ObjIntConsumer f22623a;

    private /* synthetic */ C8508z0(ObjIntConsumer objIntConsumer) {
        this.f22623a = objIntConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8420B0 m17635a(ObjIntConsumer objIntConsumer) {
        if (objIntConsumer == null) {
            return null;
        }
        return objIntConsumer instanceof C8418A0 ? ((C8418A0) objIntConsumer).f22540a : new C8508z0(objIntConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8420B0
    public final /* synthetic */ void accept(Object obj, int i) {
        this.f22623a.accept(obj, i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8508z0) {
            obj = ((C8508z0) obj).f22623a;
        }
        return this.f22623a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22623a.hashCode();
    }
}
