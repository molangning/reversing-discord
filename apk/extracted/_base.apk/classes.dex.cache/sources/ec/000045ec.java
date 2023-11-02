package p262o9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import p010a9.InterfaceC0097d;
import p010a9.InterfaceC0105h;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p298q8.C11796b;
import p298q8.C11797c;
import p441y8.C13937h;

/* renamed from: o9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11075b extends AbstractC2168g<C11076c> {

    /* renamed from: R */
    private final Bundle f29031R;

    public C11075b(Context context, Looper looper, C2158d c2158d, C11797c c11797c, InterfaceC0097d interfaceC0097d, InterfaceC0105h interfaceC0105h) {
        super(context, looper, 16, c2158d, interfaceC0097d, interfaceC0105h);
        Bundle m6841a;
        if (c11797c == null) {
            m6841a = new Bundle();
        } else {
            m6841a = c11797c.m6841a();
        }
        this.f29031R = m6841a;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: Q */
    public final boolean mo3014Q() {
        return true;
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: g */
    public final boolean mo642g() {
        C2158d m34044h0 = m34044h0();
        if (!TextUtils.isEmpty(m34044h0.m34072b()) && !m34044h0.m34069e(C11796b.f30786a).isEmpty()) {
            return true;
        }
        return false;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof C11076c) {
            return (C11076c) queryLocalInterface;
        }
        return new C11076c(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        return this.f29031R;
    }
}