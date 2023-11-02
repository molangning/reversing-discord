package p164j$.util.function;

import java.util.function.ObjDoubleConsumer;

/* renamed from: j$.util.function.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8502w0 implements InterfaceC8506y0 {

    /* renamed from: a */
    public final /* synthetic */ ObjDoubleConsumer f22619a;

    private /* synthetic */ C8502w0(ObjDoubleConsumer objDoubleConsumer) {
        this.f22619a = objDoubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8506y0 m17639a(ObjDoubleConsumer objDoubleConsumer) {
        if (objDoubleConsumer == null) {
            return null;
        }
        return objDoubleConsumer instanceof C8504x0 ? ((C8504x0) objDoubleConsumer).f22621a : new C8502w0(objDoubleConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8506y0
    public final /* synthetic */ void accept(Object obj, double d) {
        this.f22619a.accept(obj, d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8502w0) {
            obj = ((C8502w0) obj).f22619a;
        }
        return this.f22619a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22619a.hashCode();
    }
}