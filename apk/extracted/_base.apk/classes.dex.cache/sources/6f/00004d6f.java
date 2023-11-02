package p351t9;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: t9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12607c {

    /* renamed from: a */
    private static final ClassLoader f32700a = C12607c.class.getClassLoader();

    private C12607c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m4721a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m4720b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}