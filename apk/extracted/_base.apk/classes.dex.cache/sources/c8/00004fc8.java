package p385v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v9.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13208q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        boolean z = false;
        byte[] bArr = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        Uri uri = null;
        C13200m0 c13200m0 = null;
        String str2 = null;
        String str3 = null;
        long j4 = -1;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            switch (C2462b.m33199k(m33194p)) {
                case 1:
                    j = C2462b.m33190t(parcel, m33194p);
                    break;
                case 2:
                    i = C2462b.m33192r(parcel, m33194p);
                    break;
                case 3:
                    bArr = C2462b.m33208b(parcel, m33194p);
                    break;
                case 4:
                    parcelFileDescriptor = (ParcelFileDescriptor) C2462b.m33206d(parcel, m33194p, ParcelFileDescriptor.CREATOR);
                    break;
                case 5:
                    str = C2462b.m33205e(parcel, m33194p);
                    break;
                case 6:
                    j4 = C2462b.m33190t(parcel, m33194p);
                    break;
                case 7:
                    parcelFileDescriptor2 = (ParcelFileDescriptor) C2462b.m33206d(parcel, m33194p, ParcelFileDescriptor.CREATOR);
                    break;
                case 8:
                    uri = (Uri) C2462b.m33206d(parcel, m33194p, Uri.CREATOR);
                    break;
                case 9:
                    j2 = C2462b.m33190t(parcel, m33194p);
                    break;
                case 10:
                    z = C2462b.m33198l(parcel, m33194p);
                    break;
                case 11:
                    c13200m0 = (C13200m0) C2462b.m33206d(parcel, m33194p, C13200m0.CREATOR);
                    break;
                case 12:
                    j3 = C2462b.m33190t(parcel, m33194p);
                    break;
                case 13:
                    str2 = C2462b.m33205e(parcel, m33194p);
                    break;
                case 14:
                    str3 = C2462b.m33205e(parcel, m33194p);
                    break;
                default:
                    C2462b.m33187w(parcel, m33194p);
                    break;
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13206p0(j, i, bArr, parcelFileDescriptor, str, j4, parcelFileDescriptor2, uri, j2, z, c13200m0, j3, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C13206p0[i];
    }
}