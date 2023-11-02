package p384v8;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p283p9.C11468c;
import p441y8.C13937h;
import p461z8.AbstractC14124f;

/* renamed from: v8.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13150i extends AbstractC2168g {

    /* renamed from: R */
    private final GoogleSignInOptions f34170R;

    public C13150i(Context context, Looper looper, C2158d c2158d, GoogleSignInOptions googleSignInOptions, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 91, c2158d, interfaceC14125a, interfaceC14126b);
        GoogleSignInOptions.C4597a c4597a;
        if (googleSignInOptions != null) {
            c4597a = new GoogleSignInOptions.C4597a(googleSignInOptions);
        } else {
            c4597a = new GoogleSignInOptions.C4597a();
        }
        c4597a.m28262e(C11468c.m8031a());
        if (!c2158d.m34070d().isEmpty()) {
            for (Scope scope : c2158d.m34070d()) {
                c4597a.m28263d(scope, new Scope[0]);
            }
        }
        this.f34170R = c4597a.m28266a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    /* renamed from: k0 */
    public final GoogleSignInOptions m3090k0() {
        return this.f34170R;
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C13162u) {
            return (C13162u) queryLocalInterface;
        }
        return new C13162u(iBinder);
    }
}
