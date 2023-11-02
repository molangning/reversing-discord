package p010a9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p029b9.C2158d;
import p029b9.C2198p;
import p029b9.C2202q0;
import p082ea.C6187a;
import p082ea.C6191e;
import p082ea.InterfaceC6192f;
import p101fa.BinderC6355d;
import p101fa.C6363l;
import p441y8.C13930a;
import p461z8.AbstractC14124f;
import p461z8.C14107a;

/* renamed from: a9.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC0100e0 extends BinderC6355d implements AbstractC14124f.InterfaceC14125a, AbstractC14124f.InterfaceC14126b {

    /* renamed from: j */
    private static final C14107a.AbstractC14108a<? extends InterfaceC6192f, C6187a> f443j = C6191e.f17519c;

    /* renamed from: c */
    private final Context f444c;

    /* renamed from: d */
    private final Handler f445d;

    /* renamed from: e */
    private final C14107a.AbstractC14108a<? extends InterfaceC6192f, C6187a> f446e;

    /* renamed from: f */
    private final Set<Scope> f447f;

    /* renamed from: g */
    private final C2158d f448g;

    /* renamed from: h */
    private InterfaceC6192f f449h;

    /* renamed from: i */
    private InterfaceC0098d0 f450i;

    public BinderC0100e0(Context context, Handler handler, C2158d c2158d) {
        C14107a.AbstractC14108a<? extends InterfaceC6192f, C6187a> abstractC14108a = f443j;
        this.f444c = context;
        this.f445d = handler;
        this.f448g = (C2158d) C2198p.m33984k(c2158d, "ClientSettings must not be null");
        this.f447f = c2158d.m34067g();
        this.f446e = abstractC14108a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i0 */
    public static /* bridge */ /* synthetic */ void m41146i0(BinderC0100e0 binderC0100e0, C6363l c6363l) {
        C13930a m22858r = c6363l.m22858r();
        if (m22858r.m1146H()) {
            C2202q0 c2202q0 = (C2202q0) C2198p.m33985j(c6363l.m22857z());
            C13930a m33974r = c2202q0.m33974r();
            if (!m33974r.m1146H()) {
                String valueOf = String.valueOf(m33974r);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                binderC0100e0.f450i.mo28067b(m33974r);
                binderC0100e0.f449h.mo639l();
                return;
            }
            binderC0100e0.f450i.mo28066c(c2202q0.m33973z(), binderC0100e0.f447f);
        } else {
            binderC0100e0.f450i.mo28067b(m22858r);
        }
        binderC0100e0.f449h.mo639l();
    }

    @Override // p010a9.InterfaceC0097d
    /* renamed from: b */
    public final void mo28095b(Bundle bundle) {
        this.f449h.mo22862k(this);
    }

    @Override // p101fa.InterfaceC6357f
    /* renamed from: b0 */
    public final void mo22860b0(C6363l c6363l) {
        this.f445d.post(new RunnableC0096c0(this, c6363l));
    }

    @Override // p010a9.InterfaceC0105h
    /* renamed from: c */
    public final void mo28094c(C13930a c13930a) {
        this.f450i.mo28067b(c13930a);
    }

    @Override // p010a9.InterfaceC0097d
    /* renamed from: e */
    public final void mo28092e(int i) {
        this.f449h.mo639l();
    }

    /* renamed from: j0 */
    public final void m41145j0(InterfaceC0098d0 interfaceC0098d0) {
        InterfaceC6192f interfaceC6192f = this.f449h;
        if (interfaceC6192f != null) {
            interfaceC6192f.mo639l();
        }
        this.f448g.m34063k(Integer.valueOf(System.identityHashCode(this)));
        C14107a.AbstractC14108a<? extends InterfaceC6192f, C6187a> abstractC14108a = this.f446e;
        Context context = this.f444c;
        Looper looper = this.f445d.getLooper();
        C2158d c2158d = this.f448g;
        this.f449h = abstractC14108a.mo651b(context, looper, c2158d, c2158d.m34066h(), this, this);
        this.f450i = interfaceC0098d0;
        Set<Scope> set = this.f447f;
        if (set != null && !set.isEmpty()) {
            this.f449h.mo22863h();
        } else {
            this.f445d.post(new RunnableC0094b0(this));
        }
    }

    /* renamed from: k0 */
    public final void m41144k0() {
        InterfaceC6192f interfaceC6192f = this.f449h;
        if (interfaceC6192f != null) {
            interfaceC6192f.mo639l();
        }
    }
}
