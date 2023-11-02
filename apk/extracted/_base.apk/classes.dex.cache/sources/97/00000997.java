package p029b9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p042c9.C2462b;

/* renamed from: b9.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2199p0 implements Parcelable.Creator<C2196o0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2196o0 createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i2 = 0;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            C2462b.m33187w(parcel, m33194p);
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) C2462b.m33206d(parcel, m33194p, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        i2 = C2462b.m33192r(parcel, m33194p);
                    }
                } else {
                    account = (Account) C2462b.m33206d(parcel, m33194p, Account.CREATOR);
                }
            } else {
                i = C2462b.m33192r(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2196o0(i, account, i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2196o0[] newArray(int i) {
        return new C2196o0[i];
    }
}