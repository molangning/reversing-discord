package p299q9;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: q9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11806e {

    /* renamed from: a */
    private static final ClassLoader f30799a = C11806e.class.getClassLoader();

    private C11806e() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6838a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6837b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
