package p164j$.util.function;

import java.util.function.BinaryOperator;
import p164j$.util.function.BiFunction;

/* renamed from: j$.util.function.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8463d implements InterfaceC8467f {

    /* renamed from: a */
    public final /* synthetic */ BinaryOperator f22589a;

    private /* synthetic */ C8463d(BinaryOperator binaryOperator) {
        this.f22589a = binaryOperator;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8467f m17675b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C8465e ? ((C8465e) binaryOperator).f22591a : new C8463d(binaryOperator);
    }

    @Override // p164j$.util.function.BiFunction
    /* renamed from: a */
    public final /* synthetic */ BiFunction mo17393a(Function function) {
        return BiFunction.VivifiedWrapper.convert(this.f22589a.andThen(C8423D.m17711a(function)));
    }

    @Override // p164j$.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f22589a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8463d) {
            obj = ((C8463d) obj).f22589a;
        }
        return this.f22589a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22589a.hashCode();
    }
}