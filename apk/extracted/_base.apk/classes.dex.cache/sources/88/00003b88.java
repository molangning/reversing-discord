package p164j$.util.function;

import java.util.function.LongToIntFunction;

/* renamed from: j$.util.function.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8490q0 implements LongToIntFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8492r0 f22609a;

    private /* synthetic */ C8490q0(InterfaceC8492r0 interfaceC8492r0) {
        this.f22609a = interfaceC8492r0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongToIntFunction m17651a(InterfaceC8492r0 interfaceC8492r0) {
        if (interfaceC8492r0 == null) {
            return null;
        }
        return interfaceC8492r0 instanceof C8488p0 ? ((C8488p0) interfaceC8492r0).f22608a : new C8490q0(interfaceC8492r0);
    }

    @Override // java.util.function.LongToIntFunction
    public final /* synthetic */ int applyAsInt(long j) {
        return ((C8488p0) this.f22609a).m17653a(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8492r0 interfaceC8492r0 = this.f22609a;
        if (obj instanceof C8490q0) {
            obj = ((C8490q0) obj).f22609a;
        }
        return interfaceC8492r0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22609a.hashCode();
    }
}