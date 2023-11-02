package p164j$.util.function;

import java.util.function.DoubleFunction;

/* renamed from: j$.util.function.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8487p implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC8489q f22607a;

    private /* synthetic */ C8487p(InterfaceC8489q interfaceC8489q) {
        this.f22607a = interfaceC8489q;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleFunction m17654a(InterfaceC8489q interfaceC8489q) {
        if (interfaceC8489q == null) {
            return null;
        }
        return interfaceC8489q instanceof C8485o ? ((C8485o) interfaceC8489q).f22606a : new C8487p(interfaceC8489q);
    }

    @Override // java.util.function.DoubleFunction
    public final /* synthetic */ Object apply(double d) {
        return this.f22607a.apply(d);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC8489q interfaceC8489q = this.f22607a;
        if (obj instanceof C8487p) {
            obj = ((C8487p) obj).f22607a;
        }
        return interfaceC8489q.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22607a.hashCode();
    }
}
