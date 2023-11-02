package p299q9;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: q9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC11808g extends BinderC11805d implements InterfaceC11809h {
    public AbstractBinderC11808g() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // p299q9.BinderC11805d
    /* renamed from: b */
    protected final boolean mo6835b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo6834y((Status) C11806e.m6838a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}