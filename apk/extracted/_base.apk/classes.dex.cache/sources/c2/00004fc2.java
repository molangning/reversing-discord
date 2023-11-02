package p385v9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v9.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13202n0 implements Parcelable.Creator {
    /* renamed from: a */
    public C13200m0 mo3032a(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            if (C2462b.m33199k(m33194p) != 1) {
                C2462b.m33187w(parcel, m33194p);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C2462b.m33206d(parcel, m33194p, ParcelFileDescriptor.CREATOR);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13200m0(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C13200m0[i];
    }
}