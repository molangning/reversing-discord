package android.support.p016v4.media.session;

import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p016v4.media.MediaMetadataCompat;
import android.support.p016v4.media.session.InterfaceC0229a;
import android.support.p016v4.media.session.MediaSessionCompat;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: android.support.v4.media.session.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0234c implements IBinder.DeathRecipient {

    /* renamed from: a */
    final MediaController.Callback f735a = new C0235a(this);

    /* renamed from: b */
    InterfaceC0229a f736b;

    /* renamed from: android.support.v4.media.session.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0235a extends MediaController.Callback {

        /* renamed from: a */
        private final WeakReference<AbstractC0234c> f737a;

        C0235a(AbstractC0234c abstractC0234c) {
            this.f737a = new WeakReference<>(abstractC0234c);
        }

        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40855a(new C0237d(playbackInfo.getPlaybackType(), AudioAttributesCompat.m35964c(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m40885a(bundle);
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40854b(bundle);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40853c(MediaMetadataCompat.m40891a(mediaMetadata));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null && abstractC0234c.f736b == null) {
                abstractC0234c.m40852d(PlaybackStateCompat.m40870a(playbackState));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40851e(MediaSessionCompat.QueueItem.m40882b(list));
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40850f(charSequence);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40849g();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m40885a(bundle);
            AbstractC0234c abstractC0234c = this.f737a.get();
            if (abstractC0234c != null) {
                InterfaceC0229a interfaceC0229a = abstractC0234c.f736b;
                abstractC0234c.m40848h(str, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class BinderC0236b extends InterfaceC0229a.AbstractBinderC0230a {

        /* renamed from: c */
        private final WeakReference<AbstractC0234c> f738c;

        public BinderC0236b(AbstractC0234c abstractC0234c) {
            this.f738c = new WeakReference<>(abstractC0234c);
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: O */
        public void mo40846O(boolean z) {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(11, Boolean.valueOf(z), null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: S */
        public void mo40845S(boolean z) {
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: d0 */
        public void mo40844d0(PlaybackStateCompat playbackStateCompat) {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(2, playbackStateCompat, null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: e0 */
        public void mo40843e0(String str, Bundle bundle) {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(1, str, bundle);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: l */
        public void mo40842l() {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(13, null, null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        public void onRepeatModeChanged(int i) {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(9, Integer.valueOf(i), null);
            }
        }

        @Override // android.support.p016v4.media.session.InterfaceC0229a
        /* renamed from: w */
        public void mo40841w(int i) {
            AbstractC0234c abstractC0234c = this.f738c.get();
            if (abstractC0234c != null) {
                abstractC0234c.m40847i(12, Integer.valueOf(i), null);
            }
        }
    }

    /* renamed from: a */
    public void m40855a(C0237d c0237d) {
    }

    /* renamed from: b */
    public void m40854b(Bundle bundle) {
    }

    @Override // android.os.IBinder.DeathRecipient
    public void binderDied() {
        m40847i(8, null, null);
    }

    /* renamed from: c */
    public void m40853c(MediaMetadataCompat mediaMetadataCompat) {
    }

    /* renamed from: d */
    public void m40852d(PlaybackStateCompat playbackStateCompat) {
    }

    /* renamed from: e */
    public void m40851e(List<MediaSessionCompat.QueueItem> list) {
    }

    /* renamed from: f */
    public void m40850f(CharSequence charSequence) {
    }

    /* renamed from: g */
    public void m40849g() {
    }

    /* renamed from: h */
    public void m40848h(String str, Bundle bundle) {
    }

    /* renamed from: i */
    public void m40847i(int i, Object obj, Bundle bundle) {
    }
}