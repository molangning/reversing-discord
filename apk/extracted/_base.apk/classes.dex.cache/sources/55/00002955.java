package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.google.android.exoplayer2.C4392d;
import com.google.android.exoplayer2.audio.AudioAttributes;
import org.webrtc.MediaStreamTrack;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4392d {

    /* renamed from: a */
    private final AudioManager f11445a;

    /* renamed from: b */
    private final C4393a f11446b;

    /* renamed from: c */
    private InterfaceC4394b f11447c;

    /* renamed from: d */
    private AudioAttributes f11448d;

    /* renamed from: f */
    private int f11450f;

    /* renamed from: h */
    private AudioFocusRequest f11452h;

    /* renamed from: i */
    private boolean f11453i;

    /* renamed from: g */
    private float f11451g = 1.0f;

    /* renamed from: e */
    private int f11449e = 0;

    /* renamed from: com.google.android.exoplayer2.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4393a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: j */
        private final Handler f11454j;

        public C4393a(Handler handler) {
            C4392d.this = r1;
            this.f11454j = handler;
        }

        /* renamed from: b */
        public /* synthetic */ void m29545b(int i) {
            C4392d.this.m29556h(i);
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            this.f11454j.post(new Runnable() { // from class: com.google.android.exoplayer2.c
                @Override // java.lang.Runnable
                public final void run() {
                    C4392d.C4393a.this.m29545b(i);
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4394b {
        /* renamed from: o */
        void mo29544o(float f);

        /* renamed from: t */
        void mo29543t(int i);
    }

    public C4392d(Context context, Handler handler, InterfaceC4394b interfaceC4394b) {
        this.f11445a = (AudioManager) C9149a.m16448e((AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        this.f11447c = interfaceC4394b;
        this.f11446b = new C4393a(handler);
    }

    /* renamed from: a */
    private void m29563a() {
        if (this.f11449e == 0) {
            return;
        }
        if (C9191p0.f24171a >= 26) {
            m29561c();
        } else {
            m29562b();
        }
        m29550n(0);
    }

    /* renamed from: b */
    private void m29562b() {
        this.f11445a.abandonAudioFocus(this.f11446b);
    }

    /* renamed from: c */
    private void m29561c() {
        AudioFocusRequest audioFocusRequest = this.f11452h;
        if (audioFocusRequest != null) {
            this.f11445a.abandonAudioFocusRequest(audioFocusRequest);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    private static int m29559e(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return 0;
        }
        switch (audioAttributes.f11428c) {
            case 0:
                C9197r.m16178h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (audioAttributes.f11426a == 1) {
                    return 2;
                }
                break;
            case 15:
            default:
                C9197r.m16178h("AudioFocusManager", "Unidentified audio usage: " + audioAttributes.f11428c);
                return 0;
            case 16:
                if (C9191p0.f24171a < 19) {
                    return 2;
                }
                return 4;
        }
        return 3;
    }

    /* renamed from: f */
    private void m29558f(int i) {
        InterfaceC4394b interfaceC4394b = this.f11447c;
        if (interfaceC4394b != null) {
            interfaceC4394b.mo29543t(i);
        }
    }

    /* renamed from: h */
    public void m29556h(int i) {
        if (i != -3 && i != -2) {
            if (i != -1) {
                if (i != 1) {
                    C9197r.m16178h("AudioFocusManager", "Unknown focus change type: " + i);
                    return;
                }
                m29550n(1);
                m29558f(1);
                return;
            }
            m29558f(-1);
            m29563a();
        } else if (i != -2 && !m29547q()) {
            m29550n(3);
        } else {
            m29558f(0);
            m29550n(2);
        }
    }

    /* renamed from: j */
    private int m29554j() {
        int m29553k;
        if (this.f11449e == 1) {
            return 1;
        }
        if (C9191p0.f24171a >= 26) {
            m29553k = m29552l();
        } else {
            m29553k = m29553k();
        }
        if (m29553k == 1) {
            m29550n(1);
            return 1;
        }
        m29550n(0);
        return -1;
    }

    /* renamed from: k */
    private int m29553k() {
        return this.f11445a.requestAudioFocus(this.f11446b, C9191p0.m16252e0(((AudioAttributes) C9149a.m16448e(this.f11448d)).f11428c), this.f11450f);
    }

    /* renamed from: l */
    private int m29552l() {
        AudioFocusRequest.Builder builder;
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder willPauseWhenDucked;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int requestAudioFocus;
        AudioFocusRequest audioFocusRequest = this.f11452h;
        if (audioFocusRequest == null || this.f11453i) {
            if (audioFocusRequest == null) {
                builder = new AudioFocusRequest.Builder(this.f11450f);
            } else {
                builder = new AudioFocusRequest.Builder(this.f11452h);
            }
            boolean m29547q = m29547q();
            audioAttributes = builder.setAudioAttributes(((AudioAttributes) C9149a.m16448e(this.f11448d)).m29568a());
            willPauseWhenDucked = audioAttributes.setWillPauseWhenDucked(m29547q);
            onAudioFocusChangeListener = willPauseWhenDucked.setOnAudioFocusChangeListener(this.f11446b);
            build = onAudioFocusChangeListener.build();
            this.f11452h = build;
            this.f11453i = false;
        }
        requestAudioFocus = this.f11445a.requestAudioFocus(this.f11452h);
        return requestAudioFocus;
    }

    /* renamed from: n */
    private void m29550n(int i) {
        float f;
        if (this.f11449e == i) {
            return;
        }
        this.f11449e = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f11451g == f) {
            return;
        }
        this.f11451g = f;
        InterfaceC4394b interfaceC4394b = this.f11447c;
        if (interfaceC4394b != null) {
            interfaceC4394b.mo29544o(f);
        }
    }

    /* renamed from: o */
    private boolean m29549o(int i) {
        return i == 1 || this.f11450f != 1;
    }

    /* renamed from: q */
    private boolean m29547q() {
        AudioAttributes audioAttributes = this.f11448d;
        return audioAttributes != null && audioAttributes.f11426a == 1;
    }

    /* renamed from: g */
    public float m29557g() {
        return this.f11451g;
    }

    /* renamed from: i */
    public void m29555i() {
        this.f11447c = null;
        m29563a();
    }

    /* renamed from: m */
    public void m29551m(AudioAttributes audioAttributes) {
        if (!C9191p0.m16257c(this.f11448d, audioAttributes)) {
            this.f11448d = audioAttributes;
            int m29559e = m29559e(audioAttributes);
            this.f11450f = m29559e;
            boolean z = true;
            if (m29559e != 1 && m29559e != 0) {
                z = false;
            }
            C9149a.m16451b(z, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    /* renamed from: p */
    public int m29548p(boolean z, int i) {
        if (m29549o(i)) {
            m29563a();
            if (!z) {
                return -1;
            }
            return 1;
        } else if (!z) {
            return -1;
        } else {
            return m29554j();
        }
    }
}