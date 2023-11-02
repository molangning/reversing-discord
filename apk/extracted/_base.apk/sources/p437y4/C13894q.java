package p437y4;

import android.graphics.Bitmap;
import p455z2.InterfaceC14074c;

/* renamed from: y4.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13894q implements InterfaceC13883h {

    /* renamed from: a */
    protected final InterfaceC13900w<Bitmap> f35731a = new C13884i();

    /* renamed from: b */
    private final int f35732b;

    /* renamed from: c */
    private int f35733c;

    /* renamed from: d */
    private final InterfaceC13875a0 f35734d;

    /* renamed from: e */
    private int f35735e;

    public C13894q(int i, int i2, InterfaceC13875a0 interfaceC13875a0, InterfaceC14074c interfaceC14074c) {
        this.f35732b = i;
        this.f35733c = i2;
        this.f35734d = interfaceC13875a0;
        if (interfaceC14074c != null) {
            interfaceC14074c.mo729a(this);
        }
    }

    /* renamed from: g */
    private Bitmap m1292g(int i) {
        this.f35734d.mo1270d(i);
        return Bitmap.createBitmap(1, i, Bitmap.Config.ALPHA_8);
    }

    /* renamed from: j */
    private synchronized void m1289j(int i) {
        Bitmap pop;
        while (this.f35735e > i && (pop = this.f35731a.pop()) != null) {
            int mo1265a = this.f35731a.mo1265a(pop);
            this.f35735e -= mo1265a;
            this.f35734d.mo1272b(mo1265a);
        }
    }

    @Override // p455z2.InterfaceC14076e
    /* renamed from: h */
    public synchronized Bitmap get(int i) {
        int i2 = this.f35735e;
        int i3 = this.f35732b;
        if (i2 > i3) {
            m1289j(i3);
        }
        Bitmap bitmap = this.f35731a.get(i);
        if (bitmap != null) {
            int mo1265a = this.f35731a.mo1265a(bitmap);
            this.f35735e -= mo1265a;
            this.f35734d.mo1269e(mo1265a);
            return bitmap;
        }
        return m1292g(i);
    }

    @Override // p455z2.InterfaceC14076e, p004a3.InterfaceC0016c
    /* renamed from: i */
    public void release(Bitmap bitmap) {
        int mo1265a = this.f35731a.mo1265a(bitmap);
        if (mo1265a <= this.f35733c) {
            this.f35734d.mo1271c(mo1265a);
            this.f35731a.put(bitmap);
            synchronized (this) {
                this.f35735e += mo1265a;
            }
        }
    }
}
