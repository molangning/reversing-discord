package p029b9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: b9.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2196o0 extends AbstractC2461a {
    public static final Parcelable.Creator<C2196o0> CREATOR = new C2199p0();

    /* renamed from: j */
    final int f6184j;

    /* renamed from: k */
    private final Account f6185k;

    /* renamed from: l */
    private final int f6186l;

    /* renamed from: m */
    private final GoogleSignInAccount f6187m;

    public C2196o0(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f6184j = i;
        this.f6185k = account;
        this.f6186l = i2;
        this.f6187m = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f6184j);
        C2464c.m33170n(parcel, 2, this.f6185k, i, false);
        C2464c.m33174j(parcel, 3, this.f6186l);
        C2464c.m33170n(parcel, 4, this.f6187m, i, false);
        C2464c.m33182b(parcel, m33183a);
    }

    public C2196o0(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}