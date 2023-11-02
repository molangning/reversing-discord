package p063da;

import android.os.Parcel;
import p385v9.BinderC13169b;
import p385v9.C13172c;

/* renamed from: da.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC5808u extends BinderC13169b implements InterfaceC5809v {
    public AbstractBinderC5808u() {
        super("com.google.android.gms.nearby.messages.internal.IStatusCallback");
    }

    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            boolean m3062d = C13172c.m3062d(parcel);
            C13172c.m3064b(parcel);
            mo3052i(m3062d);
            return true;
        }
        return false;
    }
}
