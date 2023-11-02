package p366u9;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p196k9.C9211b;
import p441y8.C13932c;
import p461z8.AbstractC14124f;

/* renamed from: u9.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12926q0 extends AbstractC2168g<InterfaceC12932t0> {
    public C12926q0(Context context, Looper looper, C2158d c2158d, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 148, c2158d, interfaceC14125a, interfaceC14126b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.fido.fido2.regular.START";
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: m */
    public final int mo638m() {
        return 13000000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: r */
    public final /* synthetic */ IInterface mo3013r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
        if (queryLocalInterface instanceof InterfaceC12932t0) {
            return (InterfaceC12932t0) queryLocalInterface;
        }
        return new C12936v0(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: u */
    public final C13932c[] mo3024u() {
        return new C13932c[]{C9211b.f24244a};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.regular.START");
        return bundle;
    }
}
