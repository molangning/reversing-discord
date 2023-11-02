package p164j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.X */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8454X implements IntUnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8455Y f22580a;

    private /* synthetic */ C8454X(InterfaceC8455Y interfaceC8455Y) {
        this.f22580a = interfaceC8455Y;
    }

    /* renamed from: a */
    public static /* synthetic */ IntUnaryOperator m17680a(InterfaceC8455Y interfaceC8455Y) {
        if (interfaceC8455Y == null) {
            return null;
        }
        return interfaceC8455Y instanceof C8453W ? ((C8453W) interfaceC8455Y).f22579a : new C8454X(interfaceC8455Y);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator andThen(IntUnaryOperator intUnaryOperator) {
        return m17680a(((C8453W) this.f22580a).m17684a(C8453W.m17681d(intUnaryOperator)));
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ int applyAsInt(int i) {
        return ((C8453W) this.f22580a).m17683b(i);
    }

    @Override // java.util.function.IntUnaryOperator
    public final /* synthetic */ IntUnaryOperator compose(IntUnaryOperator intUnaryOperator) {
        return m17680a(((C8453W) this.f22580a).m17682c(C8453W.m17681d(intUnaryOperator)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8455Y interfaceC8455Y = this.f22580a;
        if (obj instanceof C8454X) {
            obj = ((C8454X) obj).f22580a;
        }
        return interfaceC8455Y.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22580a.hashCode();
    }
}
