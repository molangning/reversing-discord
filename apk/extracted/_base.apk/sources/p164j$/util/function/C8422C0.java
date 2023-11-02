package p164j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.C0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8422C0 implements InterfaceC8426E0 {

    /* renamed from: a */
    public final /* synthetic */ ObjLongConsumer f22544a;

    private /* synthetic */ C8422C0(ObjLongConsumer objLongConsumer) {
        this.f22544a = objLongConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8426E0 m17712a(ObjLongConsumer objLongConsumer) {
        if (objLongConsumer == null) {
            return null;
        }
        return objLongConsumer instanceof C8424D0 ? ((C8424D0) objLongConsumer).f22547a : new C8422C0(objLongConsumer);
    }

    @Override // p164j$.util.function.InterfaceC8426E0
    public final /* synthetic */ void accept(Object obj, long j) {
        this.f22544a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8422C0) {
            obj = ((C8422C0) obj).f22544a;
        }
        return this.f22544a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22544a.hashCode();
    }
}
