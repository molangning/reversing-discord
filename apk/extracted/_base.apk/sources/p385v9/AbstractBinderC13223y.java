package p385v9;

import android.os.Parcel;

/* renamed from: v9.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC13223y extends BinderC13169b implements InterfaceC13225z {
    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    C13172c.m3064b(parcel);
                    mo3011P((C13173c0) C13172c.m3065a(parcel, C13173c0.CREATOR));
                    return true;
                }
                C13191i0 c13191i0 = (C13191i0) C13172c.m3065a(parcel, C13191i0.CREATOR);
                C13172c.m3064b(parcel);
                return true;
            }
            C13172c.m3064b(parcel);
            mo3010U((C13185g0) C13172c.m3065a(parcel, C13185g0.CREATOR));
            return true;
        }
        C13172c.m3064b(parcel);
        mo3009Z((C13179e0) C13172c.m3065a(parcel, C13179e0.CREATOR));
        return true;
    }
}
