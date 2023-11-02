package p385v9;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import p042c9.C2462b;

/* renamed from: v9.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13182f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m33186x = C2462b.m33186x(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        BluetoothDevice bluetoothDevice = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m33186x) {
            int m33194p = C2462b.m33194p(parcel);
            int m33199k = C2462b.m33199k(m33194p);
            if (m33199k != 1) {
                if (m33199k != 2) {
                    if (m33199k != 3) {
                        if (m33199k != 4) {
                            if (m33199k != 5) {
                                C2462b.m33187w(parcel, m33194p);
                            } else {
                                bArr = C2462b.m33208b(parcel, m33194p);
                            }
                        } else {
                            bluetoothDevice = (BluetoothDevice) C2462b.m33206d(parcel, m33194p, BluetoothDevice.CREATOR);
                        }
                    } else {
                        str3 = C2462b.m33205e(parcel, m33194p);
                    }
                } else {
                    str2 = C2462b.m33205e(parcel, m33194p);
                }
            } else {
                str = C2462b.m33205e(parcel, m33194p);
            }
        }
        C2462b.m33200j(parcel, m33186x);
        return new C13179e0(str, str2, str3, bluetoothDevice, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new C13179e0[i];
    }
}
