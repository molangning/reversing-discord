package p136hc;

/* renamed from: hc.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7061g extends AbstractC7062h {

    /* renamed from: c */
    private final AbstractC7062h f19339c;

    public C7061g(AbstractC7062h abstractC7062h) {
        super(abstractC7062h.m21468d(), abstractC7062h.m21469a());
        this.f19339c = abstractC7062h;
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: b */
    public byte[] mo21460b() {
        byte[] mo21460b = this.f19339c.mo21460b();
        int m21468d = m21468d() * m21469a();
        byte[] bArr = new byte[m21468d];
        for (int i = 0; i < m21468d; i++) {
            bArr[i] = (byte) (255 - (mo21460b[i] & 255));
        }
        return bArr;
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: c */
    public byte[] mo21459c(int i, byte[] bArr) {
        byte[] mo21459c = this.f19339c.mo21459c(i, bArr);
        int m21468d = m21468d();
        for (int i2 = 0; i2 < m21468d; i2++) {
            mo21459c[i2] = (byte) (255 - (mo21459c[i2] & 255));
        }
        return mo21459c;
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: e */
    public AbstractC7062h mo21467e() {
        return this.f19339c;
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: f */
    public boolean mo21466f() {
        return this.f19339c.mo21466f();
    }

    @Override // p136hc.AbstractC7062h
    /* renamed from: g */
    public AbstractC7062h mo21465g() {
        return new C7061g(this.f19339c.mo21465g());
    }
}