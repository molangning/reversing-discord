package p385v9;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: v9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13172c {

    /* renamed from: a */
    private static final ClassLoader f34185a = C13172c.class.getClassLoader();

    private C13172c() {
    }

    /* renamed from: a */
    public static Parcelable m3065a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m3064b(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + dataAvail);
    }

    /* renamed from: c */
    public static void m3063c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: d */
    public static boolean m3062d(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
