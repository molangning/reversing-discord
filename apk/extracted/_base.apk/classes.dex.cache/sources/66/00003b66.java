package p164j$.util.function;

import java.util.function.LongBinaryOperator;

/* renamed from: j$.util.function.Z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8456Z implements InterfaceC8460b0 {

    /* renamed from: a */
    public final /* synthetic */ LongBinaryOperator f22581a;

    private /* synthetic */ C8456Z(LongBinaryOperator longBinaryOperator) {
        this.f22581a = longBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8460b0 m17679a(LongBinaryOperator longBinaryOperator) {
        if (longBinaryOperator == null) {
            return null;
        }
        return longBinaryOperator instanceof C8458a0 ? ((C8458a0) longBinaryOperator).f22583a : new C8456Z(longBinaryOperator);
    }

    @Override // p164j$.util.function.InterfaceC8460b0
    public final /* synthetic */ long applyAsLong(long j, long j2) {
        return this.f22581a.applyAsLong(j, j2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8456Z) {
            obj = ((C8456Z) obj).f22581a;
        }
        return this.f22581a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22581a.hashCode();
    }
}