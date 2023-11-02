package p101fa;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p319r9.BinderC12114b;
import p319r9.C12115c;
import p441y8.C13930a;

/* renamed from: fa.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC6356e extends BinderC12114b implements InterfaceC6357f {
    public AbstractBinderC6356e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // p319r9.BinderC12114b
    /* renamed from: g0 */
    protected final boolean mo6137g0(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                C13930a c13930a = (C13930a) C12115c.m6136a(parcel, C13930a.CREATOR);
                C6353b c6353b = (C6353b) C12115c.m6136a(parcel, C6353b.CREATOR);
                break;
            case 4:
                Status status = (Status) C12115c.m6136a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) C12115c.m6136a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) C12115c.m6136a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) C12115c.m6136a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                mo22860b0((C6363l) C12115c.m6136a(parcel, C6363l.CREATOR));
                break;
            case 9:
                C6359h c6359h = (C6359h) C12115c.m6136a(parcel, C6359h.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
