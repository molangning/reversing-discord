package net.time4j;

/* renamed from: net.time4j.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10850y0 extends AbstractC10581a<Integer> implements InterfaceC10683d0 {

    /* renamed from: m */
    static final C10850y0 f28321m = new C10850y0();
    private static final long serialVersionUID = -2378018589067147278L;

    private C10850y0() {
        super("WEEKDAY_IN_MONTH");
    }

    private Object readResolve() {
        return f28321m;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.AbstractC7635e, p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return 'F';
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public Integer mo9551e() {
        return 5;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: y */
    public Integer mo9554U() {
        return 1;
    }
}
