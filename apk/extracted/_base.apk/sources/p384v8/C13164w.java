package p384v8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import p042c9.C2462b;

/* renamed from: v8.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13164w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 2) {
                if (m33199k != 5) {
                    C2462b.m33187w(parcel, m33194p);
                } else {
                    googleSignInOptions = (GoogleSignInOptions) C2462b.m33206d(parcel, m33194p, GoogleSignInOptions.CREATOR);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
