package p164j$.util.function;

import java.util.function.Function;
import p164j$.util.function.Function;

/* renamed from: j$.util.function.D */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8423D implements Function {

    /* renamed from: a */
    public final /* synthetic */ Function f22546a;

    private /* synthetic */ C8423D(Function function) {
        this.f22546a = function;
    }

    /* renamed from: a */
    public static /* synthetic */ Function m17711a(Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof Function.VivifiedWrapper ? ((Function.VivifiedWrapper) function).f22553a : function instanceof UnaryOperator ? C8446O0.m17692a((UnaryOperator) function) : new C8423D(function);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
        return m17711a(this.f22546a.mo17686a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.f22546a.apply(obj);
    }

    @Override // java.util.function.Function
    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
        return m17711a(this.f22546a.mo17685b(Function.VivifiedWrapper.convert(function)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Function function = this.f22546a;
        if (obj instanceof C8423D) {
            obj = ((C8423D) obj).f22546a;
        }
        return function.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22546a.hashCode();
    }
}