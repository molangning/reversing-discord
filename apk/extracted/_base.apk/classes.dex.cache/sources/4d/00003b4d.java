package p164j$.util.function;

import java.util.function.IntPredicate;

/* renamed from: j$.util.function.M */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8441M implements InterfaceC8445O {

    /* renamed from: a */
    public final /* synthetic */ IntPredicate f22565a;

    private /* synthetic */ C8441M(IntPredicate intPredicate) {
        this.f22565a = intPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8445O m17699b(IntPredicate intPredicate) {
        if (intPredicate == null) {
            return null;
        }
        return intPredicate instanceof C8443N ? ((C8443N) intPredicate).f22567a : new C8441M(intPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8445O m17700a(InterfaceC8445O interfaceC8445O) {
        return m17699b(this.f22565a.and(C8443N.m17694a(interfaceC8445O)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8445O m17698c() {
        return m17699b(this.f22565a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC8445O m17697d(InterfaceC8445O interfaceC8445O) {
        return m17699b(this.f22565a.or(C8443N.m17694a(interfaceC8445O)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m17696e(int i) {
        return this.f22565a.test(i);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8441M) {
            obj = ((C8441M) obj).f22565a;
        }
        return this.f22565a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22565a.hashCode();
    }
}