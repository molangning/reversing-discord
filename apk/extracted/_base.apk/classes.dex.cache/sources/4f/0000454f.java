package p251nj;

import p162ij.InterfaceC7664p;
import p184jj.AbstractC8978d;

/* renamed from: nj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C10918c extends AbstractC8978d<Integer> {

    /* renamed from: n */
    public static final InterfaceC7664p<Integer> f28654n = new C10918c("YEAR_OF_DISPLAY", 0, 1, 9999);
    private static final long serialVersionUID = 1;

    /* renamed from: k */
    private final transient char f28655k;

    /* renamed from: l */
    private final transient Integer f28656l;

    /* renamed from: m */
    private final transient Integer f28657m;

    public C10918c(String str, char c, int i, int i2) {
        super(str);
        this.f28655k = c;
        this.f28656l = Integer.valueOf(i);
        this.f28657m = Integer.valueOf(i2);
    }

    private Object readResolve() {
        return f28654n;
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
        return this.f28655k;
    }

    @Override // p162ij.InterfaceC7664p
    public final Class<Integer> getType() {
        return Integer.class;
    }

    @Override // p162ij.AbstractC7635e
    /* renamed from: v */
    protected boolean mo9550v() {
        return true;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: w */
    public Integer mo9551e() {
        return this.f28657m;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: x */
    public Integer mo9554U() {
        return this.f28656l;
    }
}