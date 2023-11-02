package p385v9;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: v9.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13198l0 extends C13202n0 {
    @Override // p385v9.C13202n0
    /* renamed from: a */
    public final C13200m0 mo3032a(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor;
        ParcelFileDescriptor parcelFileDescriptor2;
        C13200m0 mo3032a = super.mo3032a(parcel);
        parcelFileDescriptor = mo3032a.f34226k;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor2 = mo3032a.f34226k;
            mo3032a.f34225j = C13200m0.m3039A(parcelFileDescriptor2);
        }
        return mo3032a;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return mo3032a(parcel);
    }
}