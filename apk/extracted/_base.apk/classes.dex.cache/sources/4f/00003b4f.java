package p164j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.N */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8443N implements IntPredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8445O f22567a;

    private /* synthetic */ C8443N(InterfaceC8445O interfaceC8445O) {
        this.f22567a = interfaceC8445O;
    }

    /* renamed from: a */
    public static /* synthetic */ IntPredicate m17694a(InterfaceC8445O interfaceC8445O) {
        if (interfaceC8445O == null) {
            return null;
        }
        return interfaceC8445O instanceof C8441M ? ((C8441M) interfaceC8445O).f22565a : new C8443N(interfaceC8445O);
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return m17694a(((C8441M) this.f22567a).m17700a(C8441M.m17699b(intPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8445O interfaceC8445O = this.f22567a;
        if (obj instanceof C8443N) {
            obj = ((C8443N) obj).f22567a;
        }
        return interfaceC8445O.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22567a.hashCode();
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate negate() {
        return m17694a(((C8441M) this.f22567a).m17698c());
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return m17694a(((C8441M) this.f22567a).m17697d(C8441M.m17699b(intPredicate)));
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return ((C8441M) this.f22567a).m17696e(i);
    }
}