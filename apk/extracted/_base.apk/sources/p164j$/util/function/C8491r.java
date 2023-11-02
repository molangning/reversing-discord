package p164j$.util.function;

import java.util.function.DoublePredicate;

/* renamed from: j$.util.function.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8491r implements InterfaceC8495t {

    /* renamed from: a */
    public final /* synthetic */ DoublePredicate f22610a;

    private /* synthetic */ C8491r(DoublePredicate doublePredicate) {
        this.f22610a = doublePredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8495t m17649b(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof C8493s ? ((C8493s) doublePredicate).f22611a : new C8491r(doublePredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8495t m17650a(InterfaceC8495t interfaceC8495t) {
        return m17649b(this.f22610a.and(C8493s.m17645a(interfaceC8495t)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8495t m17648c() {
        return m17649b(this.f22610a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC8495t m17647d(InterfaceC8495t interfaceC8495t) {
        return m17649b(this.f22610a.or(C8493s.m17645a(interfaceC8495t)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m17646e(double d) {
        return this.f22610a.test(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8491r) {
            obj = ((C8491r) obj).f22610a;
        }
        return this.f22610a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22610a.hashCode();
    }
}
