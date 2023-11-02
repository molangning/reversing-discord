package p384v8;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import p283p9.BinderC11467b;
import p283p9.C11469d;

/* renamed from: v8.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC13160s extends BinderC11467b implements InterfaceC13161t {
    public AbstractBinderC13160s() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // p283p9.BinderC11467b
    /* renamed from: b */
    protected final boolean mo3080b(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 101:
                C11469d.m8029b(parcel);
                mo3077q((GoogleSignInAccount) C11469d.m8030a(parcel, GoogleSignInAccount.CREATOR), (Status) C11469d.m8030a(parcel, Status.CREATOR));
                break;
            case 102:
                C11469d.m8029b(parcel);
                mo3078d((Status) C11469d.m8030a(parcel, Status.CREATOR));
                break;
            case 103:
                C11469d.m8029b(parcel);
                mo3079Q((Status) C11469d.m8030a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
