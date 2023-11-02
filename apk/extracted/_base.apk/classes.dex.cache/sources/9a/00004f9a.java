package p384v8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import p283p9.C11466a;
import p283p9.C11469d;

/* renamed from: v8.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13162u extends C11466a {
    public C13162u(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    /* renamed from: e */
    public final void m3076e(InterfaceC13161t interfaceC13161t, GoogleSignInOptions googleSignInOptions) {
        Parcel m8033b = m8033b();
        C11469d.m8027d(m8033b, interfaceC13161t);
        C11469d.m8028c(m8033b, googleSignInOptions);
        m8032c(103, m8033b);
    }

    /* renamed from: g0 */
    public final void m3075g0(InterfaceC13161t interfaceC13161t, GoogleSignInOptions googleSignInOptions) {
        Parcel m8033b = m8033b();
        C11469d.m8027d(m8033b, interfaceC13161t);
        C11469d.m8028c(m8033b, googleSignInOptions);
        m8032c(102, m8033b);
    }
}