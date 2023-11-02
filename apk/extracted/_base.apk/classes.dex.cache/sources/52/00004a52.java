package p299q9;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p441y8.C13932c;
import p441y8.C13937h;

/* renamed from: q9.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11810i extends AbstractC2168g<C11807f> {
    public C11810i(Context context, Looper looper, C2158d c2158d, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
        super(context, looper, 126, c2158d, interfaceC0097d, interfaceC0105h);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
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

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof C11807f) {
            return (C11807f) queryLocalInterface;
        }
        return new C11807f(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: u */
    public final C13932c[] mo3024u() {
        return C11804c.f30798e;
    }
}