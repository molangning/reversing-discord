package p101fa;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p029b9.AbstractC2150c;
import p029b9.AbstractC2168g;
import p029b9.C2158d;
import p029b9.C2196o0;
import p029b9.C2198p;
import p082ea.InterfaceC6192f;
import p384v8.C13144c;
import p441y8.C13930a;
import p441y8.C13937h;
import p461z8.AbstractC14124f;

/* renamed from: fa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6352a extends AbstractC2168g<C6358g> implements InterfaceC6192f {

    /* renamed from: V */
    public static final /* synthetic */ int f17995V = 0;

    /* renamed from: R */
    private final boolean f17996R;

    /* renamed from: S */
    private final C2158d f17997S;

    /* renamed from: T */
    private final Bundle f17998T;

    /* renamed from: U */
    private final Integer f17999U;

    public C6352a(Context context, Looper looper, boolean z, C2158d c2158d, Bundle bundle, AbstractC14124f.InterfaceC14125a interfaceC14125a, AbstractC14124f.InterfaceC14126b interfaceC14126b) {
        super(context, looper, 44, c2158d, interfaceC14125a, interfaceC14126b);
        this.f17996R = true;
        this.f17997S = c2158d;
        this.f17998T = bundle;
        this.f17999U = c2158d.m34065i();
    }

    /* renamed from: k0 */
    public static Bundle m22861k0(C2158d c2158d) {
        c2158d.m34066h();
        Integer m34065i = c2158d.m34065i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c2158d.m34073a());
        if (m34065i != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", m34065i.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: D */
    public final String mo3016D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: E */
    protected final String mo3015E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p029b9.AbstractC2150c, p461z8.C14107a.InterfaceC14116f
    /* renamed from: g */
    public final boolean mo642g() {
        return this.f17996R;
    }

    @Override // p082ea.InterfaceC6192f
    /* renamed from: h */
    public final void mo22863h() {
        m34085f(new AbstractC2150c.C2154d());
    }

    @Override // p082ea.InterfaceC6192f
    /* renamed from: k */
    public final void mo22862k(InterfaceC6357f interfaceC6357f) {
        GoogleSignInAccount googleSignInAccount;
        C2198p.m33984k(interfaceC6357f, "Expecting a valid ISignInCallbacks");
        try {
            Account m34071c = this.f17997S.m34071c();
            if ("<<default account>>".equals(m34071c.name)) {
                googleSignInAccount = C13144c.m3101b(m34075x()).m3100c();
            } else {
                googleSignInAccount = null;
            }
            ((C6358g) m34112C()).m22859g0(new C6361j(1, new C2196o0(m34071c, ((Integer) C2198p.m33985j(this.f17999U)).intValue(), googleSignInAccount)), interfaceC6357f);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                interfaceC6357f.mo22860b0(new C6363l(1, new C13930a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof C6358g) {
            return (C6358g) queryLocalInterface;
        }
        return new C6358g(iBinder);
    }

    @Override // p029b9.AbstractC2150c
    /* renamed from: z */
    public final Bundle mo3023z() {
        if (!m34075x().getPackageName().equals(this.f17997S.m34068f())) {
            this.f17998T.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f17997S.m34068f());
        }
        return this.f17998T;
    }
}