package p366u9;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: u9.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12922o0 {

    /* renamed from: a */
    private static final ClassLoader f33616a = C12922o0.class.getClassLoader();

    private C12922o0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m3665a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m3664b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: c */
    public static void m3663c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}