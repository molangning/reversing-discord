package p319r9;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: r9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12115c {

    /* renamed from: a */
    private static final ClassLoader f31425a = C12115c.class.getClassLoader();

    private C12115c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m6136a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m6135b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m6134c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}