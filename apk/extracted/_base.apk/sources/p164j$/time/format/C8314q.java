package p164j$.time.format;

import p164j$.time.AbstractC8329o;
import p164j$.time.C8323i;
import p164j$.time.chrono.InterfaceC8288b;
import p164j$.time.chrono.InterfaceC8293g;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.format.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8314q implements InterfaceC8343k {

    /* renamed from: a */
    final /* synthetic */ InterfaceC8288b f22339a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC8343k f22340b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8293g f22341c;

    /* renamed from: d */
    final /* synthetic */ AbstractC8329o f22342d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8314q(C8323i c8323i, InterfaceC8343k interfaceC8343k, InterfaceC8293g interfaceC8293g, AbstractC8329o abstractC8329o) {
        this.f22339a = c8323i;
        this.f22340b = interfaceC8343k;
        this.f22341c = interfaceC8293g;
        this.f22342d = abstractC8329o;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        InterfaceC8288b interfaceC8288b = this.f22339a;
        return (interfaceC8288b == null || !interfaceC8344l.isDateBased()) ? this.f22340b.mo17805a(interfaceC8344l) : ((C8323i) interfaceC8288b).mo17805a(interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        InterfaceC8288b interfaceC8288b = this.f22339a;
        return (interfaceC8288b == null || !interfaceC8344l.isDateBased()) ? this.f22340b.mo17804b(interfaceC8344l) : ((C8323i) interfaceC8288b).mo17804b(interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        InterfaceC8288b interfaceC8288b = this.f22339a;
        return (interfaceC8288b == null || !interfaceC8344l.isDateBased()) ? this.f22340b.mo17803c(interfaceC8344l) : ((C8323i) interfaceC8288b).mo17803c(interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        return interfaceC8346n == AbstractC8342j.m17812d() ? this.f22341c : interfaceC8346n == AbstractC8342j.m17806j() ? this.f22342d : interfaceC8346n == AbstractC8342j.m17808h() ? this.f22340b.mo17802d(interfaceC8346n) : interfaceC8346n.mo17796a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final /* synthetic */ int mo17801e(EnumC8333a enumC8333a) {
        return AbstractC8342j.m17815a(this, enumC8333a);
    }
}
