package p401w9;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: w9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC13452m extends BinderC13455p implements InterfaceC13453n {
    /* renamed from: b */
    public static InterfaceC13453n m2459b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
        if (queryLocalInterface instanceof InterfaceC13453n) {
            return (InterfaceC13453n) queryLocalInterface;
        }
        return new C13451l(iBinder);
    }
}
