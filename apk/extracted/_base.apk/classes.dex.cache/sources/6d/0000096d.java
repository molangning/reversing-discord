package p029b9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import p029b9.AbstractC2150c;
import p441y8.C13930a;

/* renamed from: b9.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2157c1 extends AbstractC2208s0 {

    /* renamed from: g */
    public final IBinder f6088g;

    /* renamed from: h */
    final /* synthetic */ AbstractC2150c f6089h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2157c1(AbstractC2150c abstractC2150c, int i, IBinder iBinder, Bundle bundle) {
        super(abstractC2150c, i, bundle);
        this.f6089h = abstractC2150c;
        this.f6088g = iBinder;
    }

    @Override // p029b9.AbstractC2208s0
    /* renamed from: f */
    protected final void mo33965f(C13930a c13930a) {
        if (this.f6089h.f6059E != null) {
            this.f6089h.f6059E.mo34039c(c13930a);
        }
        this.f6089h.m34108K(c13930a);
    }

    @Override // p029b9.AbstractC2208s0
    /* renamed from: g */
    protected final boolean mo33964g() {
        AbstractC2150c.InterfaceC2151a interfaceC2151a;
        AbstractC2150c.InterfaceC2151a interfaceC2151a2;
        try {
            IBinder iBinder = this.f6088g;
            C2198p.m33985j(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f6089h.mo3016D().equals(interfaceDescriptor)) {
                String mo3016D = this.f6089h.mo3016D();
                StringBuilder sb2 = new StringBuilder(String.valueOf(mo3016D).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(mo3016D);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface mo3013r = this.f6089h.mo3013r(this.f6088g);
            if (mo3013r == null || (!AbstractC2150c.m34086e0(this.f6089h, 2, 4, mo3013r) && !AbstractC2150c.m34086e0(this.f6089h, 3, 4, mo3013r))) {
                return false;
            }
            this.f6089h.f6063I = null;
            Bundle m34076w = this.f6089h.m34076w();
            AbstractC2150c abstractC2150c = this.f6089h;
            interfaceC2151a = abstractC2150c.f6058D;
            if (interfaceC2151a != null) {
                interfaceC2151a2 = abstractC2150c.f6058D;
                interfaceC2151a2.mo34047b(m34076w);
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}