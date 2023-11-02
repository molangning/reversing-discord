package p335s5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: s5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12400c {
    static {
        C12400c.class.getClassLoader();
    }

    private C12400c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m5408a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m5407b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
