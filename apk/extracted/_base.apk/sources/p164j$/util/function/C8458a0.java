package p164j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8458a0 implements LongBinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8460b0 f22583a;

    private /* synthetic */ C8458a0(InterfaceC8460b0 interfaceC8460b0) {
        this.f22583a = interfaceC8460b0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongBinaryOperator m17677a(InterfaceC8460b0 interfaceC8460b0) {
        if (interfaceC8460b0 == null) {
            return null;
        }
        return interfaceC8460b0 instanceof C8456Z ? ((C8456Z) interfaceC8460b0).f22581a : new C8458a0(interfaceC8460b0);
    }

    @Override // java.util.function.LongBinaryOperator
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f22583a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8460b0 interfaceC8460b0 = this.f22583a;
        if (obj instanceof C8458a0) {
            obj = ((C8458a0) obj).f22583a;
        }
        return interfaceC8460b0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22583a.hashCode();
    }
}
