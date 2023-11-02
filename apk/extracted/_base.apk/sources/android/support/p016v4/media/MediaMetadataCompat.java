package android.support.p016v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p016v4.media.session.MediaSessionCompat;
import androidx.collection.C0624a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: l */
    static final C0624a<String, Integer> f690l;

    /* renamed from: m */
    private static final String[] f691m;

    /* renamed from: n */
    private static final String[] f692n;

    /* renamed from: o */
    private static final String[] f693o;

    /* renamed from: j */
    final Bundle f694j;

    /* renamed from: k */
    private MediaMetadata f695k;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0220a implements Parcelable.Creator<MediaMetadataCompat> {
        C0220a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C0624a<String, Integer> c0624a = new C0624a<>();
        f690l = c0624a;
        c0624a.put("android.media.metadata.TITLE", 1);
        c0624a.put("android.media.metadata.ARTIST", 1);
        c0624a.put("android.media.metadata.DURATION", 0);
        c0624a.put("android.media.metadata.ALBUM", 1);
        c0624a.put("android.media.metadata.AUTHOR", 1);
        c0624a.put("android.media.metadata.WRITER", 1);
        c0624a.put("android.media.metadata.COMPOSER", 1);
        c0624a.put("android.media.metadata.COMPILATION", 1);
        c0624a.put("android.media.metadata.DATE", 1);
        c0624a.put("android.media.metadata.YEAR", 0);
        c0624a.put("android.media.metadata.GENRE", 1);
        c0624a.put("android.media.metadata.TRACK_NUMBER", 0);
        c0624a.put("android.media.metadata.NUM_TRACKS", 0);
        c0624a.put("android.media.metadata.DISC_NUMBER", 0);
        c0624a.put("android.media.metadata.ALBUM_ARTIST", 1);
        c0624a.put("android.media.metadata.ART", 2);
        c0624a.put("android.media.metadata.ART_URI", 1);
        c0624a.put("android.media.metadata.ALBUM_ART", 2);
        c0624a.put("android.media.metadata.ALBUM_ART_URI", 1);
        c0624a.put("android.media.metadata.USER_RATING", 3);
        c0624a.put("android.media.metadata.RATING", 3);
        c0624a.put("android.media.metadata.DISPLAY_TITLE", 1);
        c0624a.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c0624a.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c0624a.put("android.media.metadata.DISPLAY_ICON", 2);
        c0624a.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c0624a.put("android.media.metadata.MEDIA_ID", 1);
        c0624a.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c0624a.put("android.media.metadata.MEDIA_URI", 1);
        c0624a.put("android.media.metadata.ADVERTISEMENT", 0);
        c0624a.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f691m = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f692n = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f693o = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0220a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f694j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    /* renamed from: a */
    public static MediaMetadataCompat m40891a(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            MediaMetadata mediaMetadata = (MediaMetadata) obj;
            mediaMetadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f695k = mediaMetadata;
            return createFromParcel;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f694j);
    }
}
