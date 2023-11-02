package p366u9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p461z8.AbstractC14124f;

/* renamed from: u9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12903f extends AbstractC2168g<InterfaceC12895b> {
    public C12903f(Context context, Looper looper, C2158d c2158d, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 119, c2158d, interfaceC14125a, interfaceC14126b);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return 13000000;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        if (queryLocalInterface instanceof InterfaceC12895b) {
            return (InterfaceC12895b) queryLocalInterface;
        }
        return new C12899d(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }
}