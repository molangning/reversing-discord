package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p231m9.C10393k;

/* renamed from: m9.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C10411r0 implements Parcelable.Creator<C10393k> {
    /* renamed from: a */
    private static C10393k m11600a(Parcel parcel) {
        try {
            return C10393k.m11630a(parcel.readInt());
        } catch (C10393k.C10394a e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10393k createFromParcel(Parcel parcel) {
        return m11600a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C10393k[] newArray(int i) {
        return new C10393k[i];
    }
}