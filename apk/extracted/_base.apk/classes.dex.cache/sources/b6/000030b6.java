package p063da;

import android.os.Parcel;
import com.google.android.gms.nearby.messages.internal.Update;
import java.util.ArrayList;
import p385v9.BinderC13169b;
import p385v9.C13172c;

/* renamed from: da.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractBinderC5802o extends BinderC13169b implements InterfaceC5803p {
    public AbstractBinderC5802o() {
        super("com.google.android.gms.nearby.messages.internal.IMessageListener");
    }

    @Override // p385v9.BinderC13169b
    /* renamed from: b */
    protected final boolean mo3012b(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return false;
                }
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Update.CREATOR);
                C13172c.m3064b(parcel);
                mo3067C(createTypedArrayList);
            } else {
                C5793f c5793f = (C5793f) C13172c.m3065a(parcel, C5793f.CREATOR);
                C13172c.m3064b(parcel);
            }
        } else {
            C5793f c5793f2 = (C5793f) C13172c.m3065a(parcel, C5793f.CREATOR);
            C13172c.m3064b(parcel);
        }
        return true;
    }
}