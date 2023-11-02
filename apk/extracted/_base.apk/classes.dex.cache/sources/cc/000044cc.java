package net.time4j;

import p162ij.AbstractC7635e;

/* renamed from: net.time4j.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10789q0 extends AbstractC7635e<C10711g0> implements InterfaceC10840u0 {

    /* renamed from: j */
    static final C10789q0 f28163j = new C10789q0();
    private static final long serialVersionUID = -3712256393866098916L;

    private C10789q0() {
        super("WALL_TIME");
    }

    private Object readResolve() {
        return f28163j;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<C10711g0> getType() {
        return C10711g0.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: w */
    public C10711g0 mo9551e() {
        return C10711g0.m10609N0(23, 59, 59, 999999999);
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public C10711g0 mo9554U() {
        return C10711g0.f27964v;
    }
}