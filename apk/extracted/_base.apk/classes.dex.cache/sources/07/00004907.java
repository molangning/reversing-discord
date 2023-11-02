package p283p9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p298q8.C11793a;
import p461z8.AbstractC14124f;

/* renamed from: p9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11479n extends AbstractC2168g {

    /* renamed from: R */
    private final C11793a.C11794a f29812R;

    public C11479n(Context context, Looper looper, C2158d c2158d, C11793a.C11794a c11794a, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 68, c2158d, interfaceC14125a, interfaceC14126b);
        C11793a.C11794a.C11795a c11795a = new C11793a.C11794a.C11795a(c11794a == null ? C11793a.C11794a.f30780m : c11794a);
        c11795a.m6842a(C11468c.m8031a());
        this.f29812R = new C11793a.C11794a(c11795a);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return 12800000;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof C11484s) {
            return (C11484s) queryLocalInterface;
        }
        return new C11484s(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        return this.f29812R.m6846a();
    }
}