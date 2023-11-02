package p063da;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p385v9.BinderC13169b;
import p385v9.C13172c;

/* renamed from: da.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC5804q extends BinderC13169b implements InterfaceC5805r {
    public AbstractBinderC5804q() {
        super("com.google.android.gms.nearby.messages.internal.INearbyMessagesCallback");
    }

    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            C13172c.m3064b(parcel);
            mo3058H((Status) C13172c.m3065a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
