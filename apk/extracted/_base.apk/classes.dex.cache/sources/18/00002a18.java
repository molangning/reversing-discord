package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4562v0 {

    /* renamed from: a */
    private final Context f12412a;

    /* renamed from: b */
    private final Handler f12413b;

    /* renamed from: c */
    private final InterfaceC4564b f12414c;

    /* renamed from: d */
    private final AudioManager f12415d;

    /* renamed from: e */
    private C4565c f12416e;

    /* renamed from: f */
    private int f12417f;

    /* renamed from: g */
    private int f12418g;

    /* renamed from: h */
    private boolean f12419h;

    /* renamed from: com.google.android.exoplayer2.v0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4564b {
        /* renamed from: e */
        void mo28592e(int i);

        /* renamed from: k */
        void mo28591k(int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.v0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4565c extends BroadcastReceiver {
        private C4565c() {
            C4562v0.this = r1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = C4562v0.this.f12413b;
            final C4562v0 c4562v0 = C4562v0.this;
            handler.post(new Runnable() { // from class: com.google.android.exoplayer2.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C4562v0.m28600b(C4562v0.this);
                }
            });
        }
    }

    public C4562v0(Context context, Handler handler, InterfaceC4564b interfaceC4564b) {
        Context applicationContext = context.getApplicationContext();
        this.f12412a = applicationContext;
        this.f12413b = handler;
        this.f12414c = interfaceC4564b;
        AudioManager audioManager = (AudioManager) C9149a.m16445h((AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f12415d = audioManager;
        this.f12417f = 3;
        this.f12418g = m28596f(audioManager, 3);
        this.f12419h = m28597e(audioManager, this.f12417f);
        C4565c c4565c = new C4565c();
        try {
            applicationContext.registerReceiver(c4565c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f12416e = c4565c;
        } catch (RuntimeException e) {
            C9197r.m16177i("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m28600b(C4562v0 c4562v0) {
        c4562v0.m28593i();
    }

    /* renamed from: e */
    private static boolean m28597e(AudioManager audioManager, int i) {
        if (C9191p0.f24171a >= 23) {
            return audioManager.isStreamMute(i);
        }
        if (m28596f(audioManager, i) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static int m28596f(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            C9197r.m16177i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    /* renamed from: i */
    public void m28593i() {
        int m28596f = m28596f(this.f12415d, this.f12417f);
        boolean m28597e = m28597e(this.f12415d, this.f12417f);
        if (this.f12418g != m28596f || this.f12419h != m28597e) {
            this.f12418g = m28596f;
            this.f12419h = m28597e;
            this.f12414c.mo28591k(m28596f, m28597e);
        }
    }

    /* renamed from: c */
    public int m28599c() {
        return this.f12415d.getStreamMaxVolume(this.f12417f);
    }

    /* renamed from: d */
    public int m28598d() {
        int streamMinVolume;
        if (C9191p0.f24171a >= 28) {
            streamMinVolume = this.f12415d.getStreamMinVolume(this.f12417f);
            return streamMinVolume;
        }
        return 0;
    }

    /* renamed from: g */
    public void m28595g() {
        C4565c c4565c = this.f12416e;
        if (c4565c != null) {
            try {
                this.f12412a.unregisterReceiver(c4565c);
            } catch (RuntimeException e) {
                C9197r.m16177i("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.f12416e = null;
        }
    }

    /* renamed from: h */
    public void m28594h(int i) {
        if (this.f12417f == i) {
            return;
        }
        this.f12417f = i;
        m28593i();
        this.f12414c.mo28592e(i);
    }
}