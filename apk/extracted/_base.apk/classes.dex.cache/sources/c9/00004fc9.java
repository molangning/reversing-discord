package p385v9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.C0626b;
import java.util.Set;
import p011aa.C0130b;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p441y8.C13932c;
import p441y8.C13937h;
import p461z8.AbstractC14124f;
import p462z9.C14138a;
import p462z9.C14139b;

/* renamed from: v9.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13209r extends AbstractC2168g {

    /* renamed from: R */
    private final long f34243R;

    /* renamed from: S */
    private final Set f34244S;

    /* renamed from: T */
    private final Set f34245T;

    /* renamed from: U */
    private final Set f34246U;

    /* renamed from: V */
    private final Set f34247V;

    /* renamed from: W */
    private final Set f34248W;

    /* renamed from: X */
    private C13196k0 f34249X;

    public C13209r(Context context, Looper looper, C2158d c2158d, C0130b c0130b, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 54, c2158d, interfaceC14125a, interfaceC14126b);
        this.f34244S = new C0626b();
        this.f34245T = new C0626b();
        this.f34246U = new C0626b();
        this.f34247V = new C0626b();
        this.f34248W = new C0626b();
        this.f34243R = hashCode();
        C13210r0.m3021b(context.getCacheDir());
    }

    /* renamed from: k0 */
    private final void m3025k0() {
        for (BinderC13201n binderC13201n : this.f34244S) {
            binderC13201n.m3035c();
        }
        for (InterfaceC13203o interfaceC13203o : this.f34245T) {
            interfaceC13203o.m3031a();
        }
        for (InterfaceC13203o interfaceC13203o2 : this.f34246U) {
            interfaceC13203o2.m3031a();
        }
        for (InterfaceC13203o interfaceC13203o3 : this.f34247V) {
            interfaceC13203o3.m3031a();
        }
        for (InterfaceC13203o interfaceC13203o4 : this.f34248W) {
            interfaceC13203o4.m3031a();
        }
        this.f34244S.clear();
        this.f34245T.clear();
        this.f34246U.clear();
        this.f34247V.clear();
        this.f34248W.clear();
        C13196k0 c13196k0 = this.f34249X;
        if (c13196k0 != null) {
            c13196k0.m3040a();
            this.f34249X = null;
        }
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: J */
    public final /* bridge */ /* synthetic */ void mo3027J(IInterface iInterface) {
        super.mo3027J((C13167a0) iInterface);
        this.f34249X = new C13196k0();
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: L */
    public final void mo3026L(int i) {
        if (i == 1) {
            m3025k0();
            i = 1;
        }
        super.mo3026L(i);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: Q */
    public final boolean mo3014Q() {
        return true;
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: e */
    public final boolean mo644e() {
        return C14138a.m593b(m34075x());
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: l */
    public final void mo639l() {
        if (m34094a()) {
            try {
                ((C13167a0) m34112C()).m3068g0(new C13184g());
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        m3025k0();
        super.mo639l();
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return C13937h.f35888a;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (queryLocalInterface instanceof C13167a0) {
            return (C13167a0) queryLocalInterface;
        }
        return new C13167a0(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: u */
    public final C13932c[] mo3024u() {
        return new C13932c[]{C14139b.f36351f, C14139b.f36370y, C14139b.f36333B, C14139b.f36332A, C14139b.f36334C, C14139b.f36371z, C14139b.f36352g};
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.f34243R);
        return bundle;
    }
}