package p164j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8493s implements DoublePredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8495t f22611a;

    private /* synthetic */ C8493s(InterfaceC8495t interfaceC8495t) {
        this.f22611a = interfaceC8495t;
    }

    /* renamed from: a */
    public static /* synthetic */ DoublePredicate m17645a(InterfaceC8495t interfaceC8495t) {
        if (interfaceC8495t == null) {
            return null;
        }
        return interfaceC8495t instanceof C8491r ? ((C8491r) interfaceC8495t).f22610a : new C8493s(interfaceC8495t);
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return m17645a(((C8491r) this.f22611a).m17650a(C8491r.m17649b(doublePredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8495t interfaceC8495t = this.f22611a;
        if (obj instanceof C8493s) {
            obj = ((C8493s) obj).f22611a;
        }
        return interfaceC8495t.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22611a.hashCode();
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate negate() {
        return m17645a(((C8491r) this.f22611a).m17648c());
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return m17645a(((C8491r) this.f22611a).m17647d(C8491r.m17649b(doublePredicate)));
    }

    @Override // java.util.function.DoublePredicate
    public final /* synthetic */ boolean test(double d) {
        return ((C8491r) this.f22611a).m17646e(d);
    }
}
