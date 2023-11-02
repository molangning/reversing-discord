package p164j$.util.concurrent;

import java.util.concurrent.ConcurrentMap;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.Consumer;
import p164j$.util.function.Function;

/* renamed from: j$.util.concurrent.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8406u implements BiConsumer, BiFunction, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f22523a;

    /* renamed from: b */
    public final /* synthetic */ Object f22524b;

    /* renamed from: c */
    public final /* synthetic */ Object f22525c;

    public /* synthetic */ C8406u(int i, Object obj, Object obj2) {
        this.f22523a = i;
        this.f22524b = obj;
        this.f22525c = obj2;
    }

    public /* synthetic */ C8406u(BiFunction biFunction, Function function) {
        this.f22523a = 2;
        this.f22525c = biFunction;
        this.f22524b = function;
    }

    @Override // p164j$.util.function.BiFunction
    /* renamed from: a */
    public final BiFunction mo17393a(Function function) {
        function.getClass();
        return new C8406u(this, function);
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        ((Consumer) this.f22524b).accept(obj);
        ((Consumer) this.f22525c).accept(obj);
    }

    @Override // p164j$.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.f22523a;
        Object obj3 = this.f22525c;
        Object obj4 = this.f22524b;
        switch (i) {
            case 0:
                ConcurrentMap concurrentMap = (ConcurrentMap) obj4;
                BiFunction biFunction = (BiFunction) obj3;
                while (!concurrentMap.replace(obj, obj2, biFunction.apply(obj, obj2)) && (obj2 = concurrentMap.get(obj)) != null) {
                }
                return;
            default:
                ((BiConsumer) obj4).accept(obj, obj2);
                ((BiConsumer) obj3).accept(obj, obj2);
                return;
        }
    }

    @Override // p164j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((Function) this.f22524b).apply(((BiFunction) this.f22525c).apply(obj, obj2));
    }

    @Override // p164j$.util.function.BiConsumer
    /* renamed from: c */
    public final BiConsumer mo17469c(BiConsumer biConsumer) {
        switch (this.f22523a) {
            case 0:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
            default:
                biConsumer.getClass();
                return new C8406u(1, this, biConsumer);
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }
}