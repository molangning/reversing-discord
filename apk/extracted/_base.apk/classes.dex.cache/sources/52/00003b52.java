package p164j$.util.function;

import java.util.function.Function;
import java.util.function.UnaryOperator;
import p164j$.util.function.Function;
import p164j$.util.function.UnaryOperator;

/* renamed from: j$.util.function.O0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8446O0 implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ UnaryOperator f22569a;

    private /* synthetic */ C8446O0(UnaryOperator unaryOperator) {
        this.f22569a = unaryOperator;
    }

    /* renamed from: a */
    public static /* synthetic */ UnaryOperator m17692a(UnaryOperator unaryOperator) {
        if (unaryOperator == null) {
            return null;
        }
        return unaryOperator instanceof UnaryOperator.VivifiedWrapper ? ((UnaryOperator.VivifiedWrapper) unaryOperator).f22578a : new C8446O0(unaryOperator);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return C8423D.m17711a(this.f22569a.mo17686a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f22569a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return C8423D.m17711a(this.f22569a.mo17685b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UnaryOperator unaryOperator = this.f22569a;
        if (obj instanceof C8446O0) {
            obj = ((C8446O0) obj).f22569a;
        }
        return unaryOperator.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22569a.hashCode();
    }
}