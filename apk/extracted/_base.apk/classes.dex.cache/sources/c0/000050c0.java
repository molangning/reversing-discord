package p401w9;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: w9.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13456q {

    /* renamed from: a */
    private static final ClassLoader f34698a = C13456q.class.getClassLoader();

    private C13456q() {
    }

    /* renamed from: a */
    public static Parcelable m2444a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m2443b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}