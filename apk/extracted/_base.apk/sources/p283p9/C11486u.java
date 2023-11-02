package p283p9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import p042c9.C2462b;

/* renamed from: p9.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11486u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                credential = (Credential) C2462b.m33206d(parcel, m33194p, Credential.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C11485t(credential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C11485t[i];
    }
}
