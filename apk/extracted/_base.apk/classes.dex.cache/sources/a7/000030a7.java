package p062d9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p029b9.C2216w;
import p319r9.C12116d;
import p441y8.C13932c;

/* renamed from: d9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5787e extends AbstractC2168g<C5783a> {

    /* renamed from: R */
    private final C2216w f16615R;

    public C5787e(Context context, Looper looper, C2158d c2158d, C2216w c2216w, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
        super(context, looper, 270, c2158d, interfaceC0097d, interfaceC0105h);
        this.f16615R = c2216w;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: H */
    protected final boolean mo24508H() {
        return true;
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return 203400000;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C5783a) {
            return (C5783a) queryLocalInterface;
        }
        return new C5783a(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: u */
    public final C13932c[] mo3024u() {
        return C12116d.f31427b;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        return this.f16615R.m33954b();
    }
}