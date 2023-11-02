package p063da;

import android.os.Parcel;
import p385v9.BinderC13169b;

/* renamed from: da.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC5806s extends BinderC13169b implements InterfaceC5807t {
    public AbstractBinderC5806s() {
        super("com.google.android.gms.nearby.messages.internal.IPublishCallback");
    }

    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo24501a();
            return true;
        }
        return false;
    }
}
