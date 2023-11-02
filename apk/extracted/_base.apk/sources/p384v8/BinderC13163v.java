package p384v8;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.C4598a;
import com.google.android.gms.auth.api.signin.C4599b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p119g9.C6590m;

/* renamed from: v8.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class BinderC13163v extends AbstractBinderC13158q {

    /* renamed from: c */
    private final Context f34178c;

    public BinderC13163v(Context context) {
        this.f34178c = context;
    }

    /* renamed from: c */
    private final void m3074c() {
        if (C6590m.m22354a(this.f34178c, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        throw new SecurityException("Calling UID " + callingUid + " is not Google Play services.");
    }

    @Override // p384v8.InterfaceC13159r
    /* renamed from: g */
    public final void mo3073g() {
        m3074c();
        C13157p.m3084a(this.f34178c).m3083b();
    }

    @Override // p384v8.InterfaceC13159r
    /* renamed from: k */
    public final void mo3072k() {
        m3074c();
        C13144c m3101b = C13144c.m3101b(this.f34178c);
        GoogleSignInAccount m3100c = m3101b.m3100c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.f12604u;
        if (m3100c != null) {
            googleSignInOptions = m3101b.m3099d();
        }
        C4599b m28260a = C4598a.m28260a(this.f34178c, googleSignInOptions);
        if (m3100c != null) {
            m28260a.m28259C();
        } else {
            m28260a.m28258D();
        }
    }
}
