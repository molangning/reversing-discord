package p164j$.util.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import p164j$.util.function.Function;

/* renamed from: j$.util.function.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8465e implements BinaryOperator {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8467f f22591a;

    private /* synthetic */ C8465e(InterfaceC8467f interfaceC8467f) {
        this.f22591a = interfaceC8467f;
    }

    /* renamed from: a */
    public static /* synthetic */ BinaryOperator m17673a(InterfaceC8467f interfaceC8467f) {
        if (interfaceC8467f == null) {
            return null;
        }
        return interfaceC8467f instanceof C8463d ? ((C8463d) interfaceC8467f).f22589a : new C8465e(interfaceC8467f);
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ BiFunction andThen(Function function) {
        return C8459b.m17676a(this.f22591a.mo17393a(Function.VivifiedWrapper.convert(function)));
    }

    @Override // java.util.function.BiFunction
    public final /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.f22591a.apply(obj, obj2);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8467f interfaceC8467f = this.f22591a;
        if (obj instanceof C8465e) {
            obj = ((C8465e) obj).f22591a;
        }
        return interfaceC8467f.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22591a.hashCode();
    }
}
