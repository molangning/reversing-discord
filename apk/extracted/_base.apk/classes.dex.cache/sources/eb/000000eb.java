package android.support.p016v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.AbstractC0234c;
import android.support.p016v4.media.session.InterfaceC0231b;
import android.support.p016v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.core.app.C0826i;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p342t0.C12568a;

/* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a */
    final Object f698a;

    /* renamed from: b */
    private final List<AbstractC0234c> f699b;

    /* renamed from: c */
    private HashMap<AbstractC0234c, BinderC0222a> f700c;

    /* renamed from: d */
    final MediaSessionCompat.Token f701d;

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: j */
        private WeakReference<MediaControllerCompat$MediaControllerImplApi21> f702j;

        @Override // android.os.ResultReceiver
        protected void onReceiveResult(int i, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f702j.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f698a) {
                    mediaControllerCompat$MediaControllerImplApi21.f701d.m40876b(InterfaceC0231b.AbstractBinderC0232a.m40858b(C0826i.m38587a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerCompat$MediaControllerImplApi21.f701d.m40875d(C12568a.m4782b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerCompat$MediaControllerImplApi21.m40886a();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class BinderC0222a extends AbstractC0234c.BinderC0236b {
        BinderC0222a(AbstractC0234c abstractC0234c) {
            super(abstractC0234c);
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: F */
        public void mo40864F(ParcelableVolumeInfo parcelableVolumeInfo) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: L */
        public void mo40863L(Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: T */
        public void mo40862T(CharSequence charSequence) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: m */
        public void mo40861m(List<MediaSessionCompat.QueueItem> list) {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: s */
        public void mo40860s() {
            throw new AssertionError();
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: t */
        public void mo40859t(MediaMetadataCompat mediaMetadataCompat) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    void m40886a() {
        if (this.f701d.m40877a() == null) {
            return;
        }
        for (AbstractC0234c abstractC0234c : this.f699b) {
            BinderC0222a binderC0222a = new BinderC0222a(abstractC0234c);
            this.f700c.put(abstractC0234c, binderC0222a);
            abstractC0234c.f736b = binderC0222a;
            try {
                this.f701d.m40877a().mo40856G(binderC0222a);
                abstractC0234c.m40847i(13, null, null);
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            }
        }
        this.f699b.clear();
    }
}