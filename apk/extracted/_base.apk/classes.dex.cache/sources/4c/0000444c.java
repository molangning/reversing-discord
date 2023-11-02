package net.time4j.calendar;

import p162ij.AbstractC7635e;

/* renamed from: net.time4j.calendar.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
final class C10662m extends AbstractC7635e<Integer> {

    /* renamed from: j */
    static final C10662m f27768j = new C10662m();
    private static final long serialVersionUID = -1117064522468823402L;

    private C10662m() {
        super("RELATED_GREGORIAN_YEAR");
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
        return 'r';
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Integer> getType() {
        return Integer.class;
    }

    protected Object readResolve() {
        return f27768j;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: w */
    public Integer mo9551e() {
        return 999999999;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public Integer mo9554U() {
        return -999999999;
    }
}