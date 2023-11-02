package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p231m9.C10426y;

/* renamed from: m9.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10385g1 implements Parcelable.Creator<C10426y.EnumC10427a> {
    /* renamed from: a */
    private static C10426y.EnumC10427a m11638a(Parcel parcel) {
        try {
            return C10426y.EnumC10427a.m11576a(parcel.readString());
        } catch (C10426y.C10428b e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10426y.EnumC10427a createFromParcel(Parcel parcel) {
        return m11638a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10426y.EnumC10427a[] newArray(int i) {
        return new C10426y.EnumC10427a[i];
    }
}