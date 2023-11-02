package p042c9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2198p;

/* renamed from: c9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2466e {
    /* renamed from: a */
    public static <T extends InterfaceC2465d> T m33159a(byte[] bArr, Parcelable.Creator<T> creator) {
        C2198p.m33985j(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }
}