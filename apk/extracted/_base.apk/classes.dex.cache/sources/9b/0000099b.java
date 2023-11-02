package p029b9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import p351t9.C12605a;
import p351t9.C12607c;

/* renamed from: b9.q1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2203q1 extends C12605a implements InterfaceC2177j {
    public C2203q1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // p029b9.InterfaceC2177j
    /* renamed from: Y */
    public final Account mo33972Y() {
        Parcel m4724b = m4724b(2, m4723c());
        Account account = (Account) C12607c.m4721a(m4724b, Account.CREATOR);
        m4724b.recycle();
        return account;
    }
}