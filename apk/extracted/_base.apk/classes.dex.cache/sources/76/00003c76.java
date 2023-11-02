package p164j$.util.stream;

import p164j$.util.concurrent.C8406u;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Function;
import p164j$.util.function.InterfaceC8467f;

/* renamed from: j$.util.stream.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8723s implements InterfaceC8467f {

    /* renamed from: a */
    public final /* synthetic */ int f22939a;

    /* renamed from: b */
    public final /* synthetic */ BiConsumer f22940b;

    public /* synthetic */ C8723s(BiConsumer biConsumer, int i) {
        this.f22939a = i;
        this.f22940b = biConsumer;
    }

    @Override // p164j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo17393a(Function function) {
        switch (this.f22939a) {
            case 0:
                function.getClass();
                return new C8406u(this, function);
            case 1:
                function.getClass();
                return new C8406u(this, function);
            default:
                function.getClass();
                return new C8406u(this, function);
        }
    }

    @Override // p164j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        int i = this.f22939a;
        BiConsumer biConsumer = this.f22940b;
        switch (i) {
            case 0:
                biConsumer.accept(obj, obj2);
                return obj;
            case 1:
                biConsumer.accept(obj, obj2);
                return obj;
            default:
                biConsumer.accept(obj, obj2);
                return obj;
        }
    }
}