package android.support.p016v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0217a();

    /* renamed from: j */
    private final int f671j;

    /* renamed from: k */
    private final MediaDescriptionCompat f672k;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0217a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        C0217a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f671j = parcel.readInt();
        this.f672k = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{mFlags=" + this.f671j + ", mDescription=" + this.f672k + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f671j);
        this.f672k.writeToParcel(parcel, i);
    }
}
