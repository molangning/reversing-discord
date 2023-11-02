package p326rh;

import java.io.IOException;

/* renamed from: rh.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12204m {

    /* renamed from: a */
    private AbstractC12177d f31754a;

    /* renamed from: b */
    private C12183g f31755b;

    /* renamed from: c */
    private volatile boolean f31756c;

    /* renamed from: d */
    protected volatile InterfaceC12210q f31757d;

    /* renamed from: a */
    protected void m5783a(InterfaceC12210q interfaceC12210q) {
        if (this.f31757d != null) {
            return;
        }
        synchronized (this) {
            if (this.f31757d != null) {
                return;
            }
            try {
                if (this.f31754a != null) {
                    this.f31757d = interfaceC12210q.mo5764g().mo5757d(this.f31754a, this.f31755b);
                } else {
                    this.f31757d = interfaceC12210q;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public int m5782b() {
        if (this.f31756c) {
            return this.f31757d.mo5767c();
        }
        return this.f31754a.size();
    }

    /* renamed from: c */
    public InterfaceC12210q m5781c(InterfaceC12210q interfaceC12210q) {
        m5783a(interfaceC12210q);
        return this.f31757d;
    }

    /* renamed from: d */
    public InterfaceC12210q m5780d(InterfaceC12210q interfaceC12210q) {
        InterfaceC12210q interfaceC12210q2 = this.f31757d;
        this.f31757d = interfaceC12210q;
        this.f31754a = null;
        this.f31756c = true;
        return interfaceC12210q2;
    }
}
