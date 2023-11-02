package p029b9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p042c9.C2462b;
import p042c9.C2464c;
import p441y8.C13932c;

/* renamed from: b9.h1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2173h1 implements Parcelable.Creator<C2165f> {
    /* renamed from: a */
    public static void m34031a(C2165f c2165f, Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, c2165f.f6118j);
        C2464c.m33174j(parcel, 2, c2165f.f6119k);
        C2464c.m33174j(parcel, 3, c2165f.f6120l);
        C2464c.m33168p(parcel, 4, c2165f.f6121m, false);
        C2464c.m33175i(parcel, 5, c2165f.f6122n, false);
        C2464c.m33165s(parcel, 6, c2165f.f6123o, i, false);
        C2464c.m33179e(parcel, 7, c2165f.f6124p, false);
        C2464c.m33170n(parcel, 8, c2165f.f6125q, i, false);
        C2464c.m33165s(parcel, 10, c2165f.f6126r, i, false);
        C2464c.m33165s(parcel, 11, c2165f.f6127s, i, false);
        C2464c.m33181c(parcel, 12, c2165f.f6128t);
        C2464c.m33174j(parcel, 13, c2165f.f6129u);
        C2464c.m33181c(parcel, 14, c2165f.f6130v);
        C2464c.m33168p(parcel, 15, c2165f.m34048r(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2165f createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        C13932c[] c13932cArr = null;
        C13932c[] c13932cArr2 = null;
        String str2 = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 2:
                    i2 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 3:
                    i3 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 4:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 5:
                    iBinder = C2462b.m33193q(parcel, m33194p);
                    break;
                case 6:
                    scopeArr = (Scope[]) C2462b.m33202h(parcel, m33194p, Scope.CREATOR);
                    break;
                case 7:
                    bundle = C2462b.m33209a(parcel, m33194p);
                    break;
                case 8:
                    account = (Account) C2462b.m33206d(parcel, m33194p, Account.CREATOR);
                    break;
                case 9:
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
                case 10:
                    c13932cArr = (C13932c[]) C2462b.m33202h(parcel, m33194p, C13932c.CREATOR);
                    break;
                case 11:
                    c13932cArr2 = (C13932c[]) C2462b.m33202h(parcel, m33194p, C13932c.CREATOR);
                    break;
                case 12:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 13:
                    i4 = C2462b.m33192r(parcel, m33194p);
                    break;
                case 14:
                    z2 = C2462b.m33198l(parcel, m33194p);
                    break;
                case 15:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C2165f(i, i2, i3, str, iBinder, scopeArr, bundle, account, c13932cArr, c13932cArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2165f[] newArray(int i) {
        return new C2165f[i];
    }
}