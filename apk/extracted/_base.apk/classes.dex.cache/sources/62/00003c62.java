package p164j$.util.stream;

import java.util.concurrent.atomic.AtomicBoolean;
import p164j$.util.concurrent.C8406u;
import p164j$.util.concurrent.ConcurrentHashMap;
import p164j$.util.function.BiConsumer;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8445O;
import p164j$.util.function.InterfaceC8480l0;
import p164j$.util.function.InterfaceC8495t;
import p164j$.util.function.Predicate;

/* renamed from: j$.util.stream.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8703o implements Consumer, InterfaceC8438K0 {

    /* renamed from: a */
    public final /* synthetic */ int f22900a;

    /* renamed from: b */
    public final /* synthetic */ Object f22901b;

    /* renamed from: c */
    public final /* synthetic */ Object f22902c;

    public /* synthetic */ C8703o(int i, Object obj, Object obj2) {
        this.f22900a = i;
        this.f22901b = obj;
        this.f22902c = obj2;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f22900a;
        Object obj2 = this.f22902c;
        Object obj3 = this.f22901b;
        switch (i) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj2;
                if (obj == null) {
                    atomicBoolean.set(true);
                    return;
                } else {
                    concurrentHashMap.putIfAbsent(obj, Boolean.TRUE);
                    return;
                }
            case 5:
                ((BiConsumer) obj3).accept(obj2, obj);
                return;
            default:
                ((C8657e3) obj3).m17474j((Consumer) obj2, obj);
                return;
        }
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        switch (this.f22900a) {
            case 0:
                consumer.getClass();
                return new C8406u(3, this, consumer);
            case 5:
                consumer.getClass();
                return new C8406u(3, this, consumer);
            default:
                consumer.getClass();
                return new C8406u(3, this, consumer);
        }
    }

    @Override // p164j$.util.function.InterfaceC8438K0
    public final Object get() {
        int i = this.f22900a;
        Object obj = this.f22902c;
        Object obj2 = this.f22901b;
        switch (i) {
            case 1:
                return new C8709p0((InterfaceC8445O) obj, (EnumC8729t0) obj2);
            case 2:
                return new C8704o0((Predicate) obj, (EnumC8729t0) obj2);
            case 3:
                return new C8719r0((InterfaceC8495t) obj, (EnumC8729t0) obj2);
            default:
                return new C8714q0((InterfaceC8480l0) obj, (EnumC8729t0) obj2);
        }
    }
}