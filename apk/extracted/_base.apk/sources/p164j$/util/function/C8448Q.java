package p164j$.util.function;

import java.util.function.IntToDoubleFunction;

/* renamed from: j$.util.function.Q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8448Q implements IntToDoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8449S f22572a;

    private /* synthetic */ C8448Q(InterfaceC8449S interfaceC8449S) {
        this.f22572a = interfaceC8449S;
    }

    /* renamed from: a */
    public static /* synthetic */ IntToDoubleFunction m17689a(InterfaceC8449S interfaceC8449S) {
        if (interfaceC8449S == null) {
            return null;
        }
        return interfaceC8449S instanceof C8447P ? ((C8447P) interfaceC8449S).f22570a : new C8448Q(interfaceC8449S);
    }

    @Override // java.util.function.IntToDoubleFunction
    public final /* synthetic */ double applyAsDouble(int i) {
        return ((C8447P) this.f22572a).m17691a(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8449S interfaceC8449S = this.f22572a;
        if (obj instanceof C8448Q) {
            obj = ((C8448Q) obj).f22572a;
        }
        return interfaceC8449S.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22572a.hashCode();
    }
}
