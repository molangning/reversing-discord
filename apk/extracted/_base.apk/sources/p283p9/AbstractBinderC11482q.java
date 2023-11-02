package p283p9;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: p9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC11482q extends BinderC11467b implements InterfaceC11483r {
    public AbstractBinderC11482q() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    @Override // p283p9.BinderC11467b
    /* renamed from: b */
    protected final boolean mo3080b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                String readString = parcel.readString();
                C11469d.m8029b(parcel);
                mo8023z((Status) C11469d.m8030a(parcel, Status.CREATOR), readString);
            } else {
                C11469d.m8029b(parcel);
                mo8024d((Status) C11469d.m8030a(parcel, Status.CREATOR));
            }
        } else {
            C11469d.m8029b(parcel);
            mo8025A((Status) C11469d.m8030a(parcel, Status.CREATOR), (Credential) C11469d.m8030a(parcel, Credential.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
