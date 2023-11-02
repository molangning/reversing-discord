package android.support.p016v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0226a();

    /* renamed from: j */
    public int f711j;

    /* renamed from: k */
    public int f712k;

    /* renamed from: l */
    public int f713l;

    /* renamed from: m */
    public int f714m;

    /* renamed from: n */
    public int f715n;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0226a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0226a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f711j = parcel.readInt();
        this.f713l = parcel.readInt();
        this.f714m = parcel.readInt();
        this.f715n = parcel.readInt();
        this.f712k = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f711j);
        parcel.writeInt(this.f713l);
        parcel.writeInt(this.f714m);
        parcel.writeInt(this.f715n);
        parcel.writeInt(this.f712k);
    }
}
