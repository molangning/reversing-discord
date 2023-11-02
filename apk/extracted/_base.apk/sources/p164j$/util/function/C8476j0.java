package p164j$.util.function;

import java.util.function.LongPredicate;

/* renamed from: j$.util.function.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8476j0 implements InterfaceC8480l0 {

    /* renamed from: a */
    public final /* synthetic */ LongPredicate f22598a;

    private /* synthetic */ C8476j0(LongPredicate longPredicate) {
        this.f22598a = longPredicate;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC8480l0 m17665b(LongPredicate longPredicate) {
        if (longPredicate == null) {
            return null;
        }
        return longPredicate instanceof C8478k0 ? ((C8478k0) longPredicate).f22601a : new C8476j0(longPredicate);
    }

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8480l0 m17666a(InterfaceC8480l0 interfaceC8480l0) {
        return m17665b(this.f22598a.and(C8478k0.m17661a(interfaceC8480l0)));
    }

    /* renamed from: c */
    public final /* synthetic */ InterfaceC8480l0 m17664c() {
        return m17665b(this.f22598a.negate());
    }

    /* renamed from: d */
    public final /* synthetic */ InterfaceC8480l0 m17663d(InterfaceC8480l0 interfaceC8480l0) {
        return m17665b(this.f22598a.or(C8478k0.m17661a(interfaceC8480l0)));
    }

    /* renamed from: e */
    public final /* synthetic */ boolean m17662e(long j) {
        return this.f22598a.test(j);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C8476j0) {
            obj = ((C8476j0) obj).f22598a;
        }
        return this.f22598a.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22598a.hashCode();
    }
}
