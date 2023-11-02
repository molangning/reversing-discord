package p164j$.util.function;

import java.util.function.IntUnaryOperator;

/* renamed from: j$.util.function.W */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8453W implements InterfaceC8455Y {

    /* renamed from: a */
    public final /* synthetic */ IntUnaryOperator f22579a;

    private /* synthetic */ C8453W(IntUnaryOperator intUnaryOperator) {
        this.f22579a = intUnaryOperator;
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC8455Y m17681d(IntUnaryOperator intUnaryOperator) {
        if (intUnaryOperator == null) {
            return null;
        }
        return intUnaryOperator instanceof C8454X ? ((C8454X) intUnaryOperator).f22580a : new C8453W(intUnaryOperator);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8455Y m17684a(InterfaceC8455Y interfaceC8455Y) {
        return m17681d(this.f22579a.andThen(C8454X.m17680a(interfaceC8455Y)));
    }

    /* renamed from: b */
    public final /* synthetic */ int m17683b(int i) {
        return this.f22579a.applyAsInt(i);
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8455Y m17682c(InterfaceC8455Y interfaceC8455Y) {
        return m17681d(this.f22579a.compose(C8454X.m17680a(interfaceC8455Y)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8453W) {
            obj = ((C8453W) obj).f22579a;
        }
        return this.f22579a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22579a.hashCode();
    }
}
