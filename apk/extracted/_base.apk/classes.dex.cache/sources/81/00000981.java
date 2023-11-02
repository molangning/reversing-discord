package p029b9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import p351t9.BinderC12606b;

/* renamed from: b9.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC2177j extends IInterface {

    /* renamed from: b9.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractBinderC2178a extends BinderC12606b implements InterfaceC2177j {
        /* renamed from: c */
        public static InterfaceC2177j m34026c(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof InterfaceC2177j) {
                return (InterfaceC2177j) queryLocalInterface;
            }
            return new C2203q1(iBinder);
        }
    }

    /* renamed from: Y */
    Account mo33972Y();
}