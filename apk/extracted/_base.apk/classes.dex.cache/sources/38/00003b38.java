package p164j$.util.function;

import java.util.function.ObjLongConsumer;

/* renamed from: j$.util.function.D0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8424D0 implements ObjLongConsumer {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8426E0 f22547a;

    private /* synthetic */ C8424D0(InterfaceC8426E0 interfaceC8426E0) {
        this.f22547a = interfaceC8426E0;
    }

    /* renamed from: a */
    public static /* synthetic */ ObjLongConsumer m17710a(InterfaceC8426E0 interfaceC8426E0) {
        if (interfaceC8426E0 == null) {
            return null;
        }
        return interfaceC8426E0 instanceof C8422C0 ? ((C8422C0) interfaceC8426E0).f22544a : new C8424D0(interfaceC8426E0);
    }

    @Override // java.util.function.ObjLongConsumer
    public final /* synthetic */ void accept(Object obj, long j) {
        this.f22547a.accept(obj, j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8426E0 interfaceC8426E0 = this.f22547a;
        if (obj instanceof C8424D0) {
            obj = ((C8424D0) obj).f22547a;
        }
        return interfaceC8426E0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22547a.hashCode();
    }
}