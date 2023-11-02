package android.support.p016v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0228a();

    /* renamed from: j */
    final int f716j;

    /* renamed from: k */
    final long f717k;

    /* renamed from: l */
    final long f718l;

    /* renamed from: m */
    final float f719m;

    /* renamed from: n */
    final long f720n;

    /* renamed from: o */
    final int f721o;

    /* renamed from: p */
    final CharSequence f722p;

    /* renamed from: q */
    final long f723q;

    /* renamed from: r */
    List<CustomAction> f724r;

    /* renamed from: s */
    final long f725s;

    /* renamed from: t */
    final Bundle f726t;

    /* renamed from: u */
    private PlaybackState f727u;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0228a implements Parcelable.Creator<PlaybackStateCompat> {
        C0228a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f716j = i;
        this.f717k = j;
        this.f718l = j2;
        this.f719m = f;
        this.f720n = j3;
        this.f721o = i2;
        this.f722p = charSequence;
        this.f723q = j4;
        this.f724r = new ArrayList(list);
        this.f725s = j5;
        this.f726t = bundle;
    }

    /* renamed from: a */
    public static PlaybackStateCompat m40870a(Object obj) {
        ArrayList arrayList = null;
        if (obj == null) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> customActions = playbackState.getCustomActions();
        if (customActions != null) {
            arrayList = new ArrayList(customActions.size());
            for (PlaybackState.CustomAction customAction : customActions) {
                arrayList.add(CustomAction.m40869a(customAction));
            }
        }
        Bundle extras = playbackState.getExtras();
        MediaSessionCompat.m40885a(extras);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(playbackState.getState(), playbackState.getPosition(), playbackState.getBufferedPosition(), playbackState.getPlaybackSpeed(), playbackState.getActions(), 0, playbackState.getErrorMessage(), playbackState.getLastPositionUpdateTime(), arrayList, playbackState.getActiveQueueItemId(), extras);
        playbackStateCompat.f727u = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f716j + ", position=" + this.f717k + ", buffered position=" + this.f718l + ", speed=" + this.f719m + ", updated=" + this.f723q + ", actions=" + this.f720n + ", error code=" + this.f721o + ", error message=" + this.f722p + ", custom actions=" + this.f724r + ", active item id=" + this.f725s + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f716j);
        parcel.writeLong(this.f717k);
        parcel.writeFloat(this.f719m);
        parcel.writeLong(this.f723q);
        parcel.writeLong(this.f718l);
        parcel.writeLong(this.f720n);
        TextUtils.writeToParcel(this.f722p, parcel, i);
        parcel.writeTypedList(this.f724r);
        parcel.writeLong(this.f725s);
        parcel.writeBundle(this.f726t);
        parcel.writeInt(this.f721o);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0227a();

        /* renamed from: j */
        private final String f728j;

        /* renamed from: k */
        private final CharSequence f729k;

        /* renamed from: l */
        private final int f730l;

        /* renamed from: m */
        private final Bundle f731m;

        /* renamed from: n */
        private PlaybackState.CustomAction f732n;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0227a implements Parcelable.Creator<CustomAction> {
            C0227a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f728j = str;
            this.f729k = charSequence;
            this.f730l = i;
            this.f731m = bundle;
        }

        /* renamed from: a */
        public static CustomAction m40869a(Object obj) {
            if (obj != null) {
                PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
                Bundle extras = customAction.getExtras();
                MediaSessionCompat.m40885a(extras);
                CustomAction customAction2 = new CustomAction(customAction.getAction(), customAction.getName(), customAction.getIcon(), extras);
                customAction2.f732n = customAction;
                return customAction2;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f729k) + ", mIcon=" + this.f730l + ", mExtras=" + this.f731m;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f728j);
            TextUtils.writeToParcel(this.f729k, parcel, i);
            parcel.writeInt(this.f730l);
            parcel.writeBundle(this.f731m);
        }

        CustomAction(Parcel parcel) {
            this.f728j = parcel.readString();
            this.f729k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f730l = parcel.readInt();
            this.f731m = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f716j = parcel.readInt();
        this.f717k = parcel.readLong();
        this.f719m = parcel.readFloat();
        this.f723q = parcel.readLong();
        this.f718l = parcel.readLong();
        this.f720n = parcel.readLong();
        this.f722p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f724r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f725s = parcel.readLong();
        this.f726t = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f721o = parcel.readInt();
    }
}