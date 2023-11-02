package p063da;

import android.os.Parcel;
import p385v9.BinderC13169b;

/* renamed from: da.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC5789b extends BinderC13169b implements InterfaceC5790c {
    public AbstractBinderC5789b() {
        super("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
    }

    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo24505a();
            return true;
        }
        return false;
    }
}