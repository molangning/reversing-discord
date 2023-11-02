package p164j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8478k0 implements LongPredicate {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8480l0 f22601a;

    private /* synthetic */ C8478k0(InterfaceC8480l0 interfaceC8480l0) {
        this.f22601a = interfaceC8480l0;
    }

    /* renamed from: a */
    public static /* synthetic */ LongPredicate m17661a(InterfaceC8480l0 interfaceC8480l0) {
        if (interfaceC8480l0 == null) {
            return null;
        }
        return interfaceC8480l0 instanceof C8476j0 ? ((C8476j0) interfaceC8480l0).f22598a : new C8478k0(interfaceC8480l0);
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate and(LongPredicate longPredicate) {
        return m17661a(((C8476j0) this.f22601a).m17666a(C8476j0.m17665b(longPredicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8480l0 interfaceC8480l0 = this.f22601a;
        if (obj instanceof C8478k0) {
            obj = ((C8478k0) obj).f22601a;
        }
        return interfaceC8480l0.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22601a.hashCode();
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate negate() {
        return m17661a(((C8476j0) this.f22601a).m17664c());
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ LongPredicate or(LongPredicate longPredicate) {
        return m17661a(((C8476j0) this.f22601a).m17663d(C8476j0.m17665b(longPredicate)));
    }

    @Override // java.util.function.LongPredicate
    public final /* synthetic */ boolean test(long j) {
        return ((C8476j0) this.f22601a).m17662e(j);
    }
}