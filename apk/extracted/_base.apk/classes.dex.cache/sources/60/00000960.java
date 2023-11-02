package p029b9;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import p029b9.InterfaceC2177j;

/* renamed from: b9.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BinderC2144a extends InterfaceC2177j.AbstractBinderC2178a {
    /* renamed from: e */
    public static Account m34124e(InterfaceC2177j interfaceC2177j) {
        Account account = null;
        if (interfaceC2177j != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC2177j.mo33972Y();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }
}