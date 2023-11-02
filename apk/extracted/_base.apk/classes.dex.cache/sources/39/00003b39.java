package p164j$.util.function;

import java.util.function.IntBinaryOperator;

/* renamed from: j$.util.function.E */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8425E implements InterfaceC8429G {

    /* renamed from: a */
    public final /* synthetic */ IntBinaryOperator f22548a;

    private /* synthetic */ C8425E(IntBinaryOperator intBinaryOperator) {
        this.f22548a = intBinaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ InterfaceC8429G m17709a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof C8427F ? ((C8427F) intBinaryOperator).f22549a : new C8425E(intBinaryOperator);
    }

    @Override // p164j$.util.function.InterfaceC8429G
    public final /* synthetic */ int applyAsInt(int i, int i2) {
        return this.f22548a.applyAsInt(i, i2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8425E) {
            obj = ((C8425E) obj).f22548a;
        }
        return this.f22548a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22548a.hashCode();
    }
}