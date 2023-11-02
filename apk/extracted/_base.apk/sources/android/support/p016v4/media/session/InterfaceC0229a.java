package android.support.p016v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface InterfaceC0229a extends IInterface {

    /* renamed from: android.support.v4.media.session.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractBinderC0230a extends Binder implements InterfaceC0229a {
        public AbstractBinderC0230a() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                boolean z = false;
                Bundle bundle = null;
                ParcelableVolumeInfo parcelableVolumeInfo = null;
                Bundle bundle2 = null;
                CharSequence charSequence = null;
                MediaMetadataCompat mediaMetadataCompat = null;
                PlaybackStateCompat playbackStateCompat = null;
                switch (i) {
                    case 1:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        String readString = parcel.readString();
                        if (parcel.readInt() != 0) {
                            bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo40843e0(readString, bundle);
                        return true;
                    case 2:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo40860s();
                        return true;
                    case 3:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            playbackStateCompat = PlaybackStateCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo40844d0(playbackStateCompat);
                        return true;
                    case 4:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(parcel);
                        }
                        mo40859t(mediaMetadataCompat);
                        return true;
                    case 5:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo40861m(parcel.createTypedArrayList(MediaSessionCompat.QueueItem.CREATOR));
                        return true;
                    case 6:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
                        }
                        mo40862T(charSequence);
                        return true;
                    case 7:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        }
                        mo40863L(bundle2);
                        return true;
                    case 8:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            parcelableVolumeInfo = ParcelableVolumeInfo.CREATOR.createFromParcel(parcel);
                        }
                        mo40864F(parcelableVolumeInfo);
                        return true;
                    case 9:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        onRepeatModeChanged(parcel.readInt());
                        return true;
                    case 10:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo40845S(z);
                        return true;
                    case 11:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (parcel.readInt() != 0) {
                            z = true;
                        }
                        mo40846O(z);
                        return true;
                    case 12:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo40841w(parcel.readInt());
                        return true;
                    case 13:
                        parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
                        mo40842l();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
    }

    /* renamed from: F */
    void mo40864F(ParcelableVolumeInfo parcelableVolumeInfo);

    /* renamed from: L */
    void mo40863L(Bundle bundle);

    /* renamed from: O */
    void mo40846O(boolean z);

    /* renamed from: S */
    void mo40845S(boolean z);

    /* renamed from: T */
    void mo40862T(CharSequence charSequence);

    /* renamed from: d0 */
    void mo40844d0(PlaybackStateCompat playbackStateCompat);

    /* renamed from: e0 */
    void mo40843e0(String str, Bundle bundle);

    /* renamed from: l */
    void mo40842l();

    /* renamed from: m */
    void mo40861m(List<MediaSessionCompat.QueueItem> list);

    void onRepeatModeChanged(int i);

    /* renamed from: s */
    void mo40860s();

    /* renamed from: t */
    void mo40859t(MediaMetadataCompat mediaMetadataCompat);

    /* renamed from: w */
    void mo40841w(int i);
}
