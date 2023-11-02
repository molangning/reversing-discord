package p162ij;

/* renamed from: ij.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC7630b0 implements InterfaceC7664p<Boolean> {
    LEAP_SECOND,
    DAYLIGHT_SAVING;

    @Override // p162ij.InterfaceC7664p
    /* renamed from: M */
    public boolean mo9555M() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: V */
    public boolean mo9553V() {
        return false;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: a */
    public char mo9552a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(InterfaceC7662o interfaceC7662o, InterfaceC7662o interfaceC7662o2) {
        boolean mo10210q = interfaceC7662o.mo10210q(this);
        if (mo10210q == interfaceC7662o2.mo10210q(this)) {
            return 0;
        }
        if (mo10210q) {
            return 1;
        }
        return -1;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: c */
    public Boolean mo9551e() {
        return Boolean.TRUE;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: f */
    public Boolean mo9554U() {
        return Boolean.FALSE;
    }

    @Override // p162ij.InterfaceC7664p
    public Class<Boolean> getType() {
        return Boolean.class;
    }

    @Override // p162ij.InterfaceC7664p
    /* renamed from: k */
    public boolean mo9930k() {
        return false;
    }
}
