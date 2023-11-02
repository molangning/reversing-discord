package p078e6;

import javax.inject.Provider;
import p116g6.InterfaceC6553a;
import p417x5.InterfaceC13690a;
import p438y5.C13906a;
import p438y5.InterfaceC13907b;

/* renamed from: e6.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6146n0 implements InterfaceC13907b<C6140m0> {

    /* renamed from: a */
    private final Provider<InterfaceC6553a> f17411a;

    /* renamed from: b */
    private final Provider<InterfaceC6553a> f17412b;

    /* renamed from: c */
    private final Provider<AbstractC6119e> f17413c;

    /* renamed from: d */
    private final Provider<C6158t0> f17414d;

    /* renamed from: e */
    private final Provider<String> f17415e;

    public C6146n0(Provider<InterfaceC6553a> provider, Provider<InterfaceC6553a> provider2, Provider<AbstractC6119e> provider3, Provider<C6158t0> provider4, Provider<String> provider5) {
        this.f17411a = provider;
        this.f17412b = provider2;
        this.f17413c = provider3;
        this.f17414d = provider4;
        this.f17415e = provider5;
    }

    /* renamed from: a */
    public static C6146n0 m23432a(Provider<InterfaceC6553a> provider, Provider<InterfaceC6553a> provider2, Provider<AbstractC6119e> provider3, Provider<C6158t0> provider4, Provider<String> provider5) {
        return new C6146n0(provider, provider2, provider3, provider4, provider5);
    }

    /* renamed from: c */
    public static C6140m0 m23430c(InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, Object obj, Object obj2, InterfaceC13690a<String> interfaceC13690a) {
        return new C6140m0(interfaceC6553a, interfaceC6553a2, (AbstractC6119e) obj, (C6158t0) obj2, interfaceC13690a);
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public C6140m0 get() {
        return m23430c(this.f17411a.get(), this.f17412b.get(), this.f17413c.get(), this.f17414d.get(), C13906a.m1225a(this.f17415e));
    }
}