package p385v9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p441y8.C13937h;

/* renamed from: v9.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13217v extends AbstractC2168g {
    public C13217v(Context context, Looper looper, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h, C2158d c2158d) {
        super(context, looper, 69, c2158d, interfaceC0097d, interfaceC0105h);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: Q */
    public final boolean mo3014Q() {
        return true;
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return C13937h.f35888a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (queryLocalInterface instanceof C13204o0) {
            return (C13204o0) queryLocalInterface;
        }
        return new C13204o0(iBinder);
    }
}
