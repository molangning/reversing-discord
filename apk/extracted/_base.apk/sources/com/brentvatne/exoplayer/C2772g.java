package com.brentvatne.exoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.C4462c;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.C4474a;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.webrtc.MediaStreamTrack;
import p003a2.C0011a;
import p003a2.InterfaceC0012b;
import p040c7.AbstractC2429n;
import p040c7.C2440x;
import p060d7.InterfaceC5779e;
import p099f8.AbstractC6341j;
import p099f8.C6318a;
import p099f8.C6325f;
import p151i6.C7392d;
import p151i6.C7394e;
import p151i6.C7404o;
import p153i8.C7457n;
import p153i8.C7458o;
import p153i8.InterfaceC7444e;
import p195k8.C9191p0;
import p229m7.C10279b;
import p229m7.C10284c0;
import p229m7.C10306i0;
import p229m7.C10338r0;
import p229m7.C10344s0;
import p229m7.InterfaceC10341s;
import p259o6.C11006g0;
import p259o6.C11014h0;
import p259o6.C11015i;
import p259o6.C11032l0;
import p259o6.C11038o;
import p259o6.InterfaceC11045v;
import p259o6.InterfaceC11049x;
import p454z1.C14069a;
import p454z1.C14070b;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.brentvatne.exoplayer.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C2772g extends FrameLayout implements LifecycleEventListener, Player.InterfaceC4371a, InterfaceC7444e.InterfaceC7445a, InterfaceC0012b, AudioManager.OnAudioFocusChangeListener, InterfaceC5779e, InterfaceC11045v {

    /* renamed from: o0 */
    private static final CookieManager f7453o0;

    /* renamed from: A */
    private boolean f7454A;

    /* renamed from: B */
    private boolean f7455B;

    /* renamed from: C */
    private boolean f7456C;

    /* renamed from: D */
    private float f7457D;

    /* renamed from: E */
    private float f7458E;

    /* renamed from: F */
    private int f7459F;

    /* renamed from: G */
    private int f7460G;

    /* renamed from: H */
    private long f7461H;

    /* renamed from: I */
    private int f7462I;

    /* renamed from: J */
    private int f7463J;

    /* renamed from: K */
    private int f7464K;

    /* renamed from: L */
    private int f7465L;

    /* renamed from: M */
    private Handler f7466M;

    /* renamed from: N */
    private Uri f7467N;

    /* renamed from: O */
    private String f7468O;

    /* renamed from: P */
    private boolean f7469P;

    /* renamed from: Q */
    private String f7470Q;

    /* renamed from: R */
    private Dynamic f7471R;

    /* renamed from: S */
    private String f7472S;

    /* renamed from: T */
    private Dynamic f7473T;

    /* renamed from: U */
    private String f7474U;

    /* renamed from: V */
    private Dynamic f7475V;

    /* renamed from: W */
    private ReadableArray f7476W;

    /* renamed from: a0 */
    private boolean f7477a0;

    /* renamed from: b0 */
    private boolean f7478b0;

    /* renamed from: c0 */
    private float f7479c0;

    /* renamed from: d0 */
    private boolean f7480d0;

    /* renamed from: e0 */
    private Map<String, String> f7481e0;

    /* renamed from: f0 */
    private boolean f7482f0;

    /* renamed from: g0 */
    private UUID f7483g0;

    /* renamed from: h0 */
    private String f7484h0;

    /* renamed from: i0 */
    private String[] f7485i0;

    /* renamed from: j */
    private final C2780i f7486j;

    /* renamed from: j0 */
    private boolean f7487j0;

    /* renamed from: k */
    private final InterfaceC2771f f7488k;

    /* renamed from: k0 */
    private final ThemedReactContext f7489k0;

    /* renamed from: l */
    private final C7458o f7490l;

    /* renamed from: l0 */
    private final AudioManager f7491l0;

    /* renamed from: m */
    private PlayerControlView f7492m;

    /* renamed from: m0 */
    private final C0011a f7493m0;

    /* renamed from: n */
    private View f7494n;

    /* renamed from: n0 */
    private final Handler f7495n0;

    /* renamed from: o */
    private Player.InterfaceC4371a f7496o;

    /* renamed from: p */
    private C2767d f7497p;

    /* renamed from: q */
    private DataSource.Factory f7498q;

    /* renamed from: r */
    private SimpleExoPlayer f7499r;

    /* renamed from: s */
    private C6325f f7500s;

    /* renamed from: t */
    private boolean f7501t;

    /* renamed from: u */
    private int f7502u;

    /* renamed from: v */
    private long f7503v;

    /* renamed from: w */
    private boolean f7504w;

    /* renamed from: x */
    private boolean f7505x;

    /* renamed from: y */
    private boolean f7506y;

    /* renamed from: z */
    private boolean f7507z;

    /* renamed from: com.brentvatne.exoplayer.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class HandlerC2773a extends Handler {
        HandlerC2773a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1 && C2772g.this.f7499r != null && C2772g.this.f7499r.mo29505P() == 3 && C2772g.this.f7499r.mo29522F()) {
                long mo29491Y = C2772g.this.f7499r.mo29491Y();
                C2772g.this.f7486j.m32293o(mo29491Y, (C2772g.this.f7499r.m29536Z() * C2772g.this.f7499r.getDuration()) / 100, C2772g.this.f7499r.getDuration(), C2772g.this.m32336j0(mo29491Y));
                sendMessageDelayed(obtainMessage(1), Math.round(C2772g.this.f7479c0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC2774b implements View.OnClickListener {
        View$OnClickListenerC2774b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2772g.this.m32347e1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC2775c implements View.OnClickListener {
        View$OnClickListenerC2775c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (C2772g.this.f7499r != null && C2772g.this.f7499r.mo29505P() == 4) {
                C2772g.this.f7499r.m29533c0(0L);
            }
            C2772g.this.m32393J0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.g$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC2776d implements View.OnClickListener {
        View$OnClickListenerC2776d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C2772g.this.m32393J0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.g$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C2777e implements Player.InterfaceC4371a {
        C2777e() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            C7404o.m20747a(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
            C7404o.m20746b(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
            C7404o.m20745c(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onIsLoadingChanged(boolean z) {
            C7404o.m20744d(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onIsPlayingChanged(boolean z) {
            C7404o.m20743e(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onLoadingChanged(boolean z) {
            C7404o.m20742f(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
            C7404o.m20741g(this, mediaItem, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
            C7404o.m20740h(this, z, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C7404o.m20739i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackStateChanged(int i) {
            C7404o.m20738j(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
            C7404o.m20737k(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlayerError(ExoPlaybackException exoPlaybackException) {
            C7404o.m20736l(this, exoPlaybackException);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlayerStateChanged(boolean z, int i) {
            C2772g c2772g = C2772g.this;
            c2772g.m32318t0(c2772g.f7494n);
            C2772g.this.f7499r.mo29466k(C2772g.this.f7496o);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPositionDiscontinuity(int i) {
            C7404o.m20734n(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onRepeatModeChanged(int i) {
            C7404o.m20733o(this, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onSeekProcessed() {
            C7404o.m20732p(this);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
            C7404o.m20731q(this, z);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onStaticMetadataChanged(List list) {
            C7404o.m20730r(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
            C7404o.m20729s(this, timeline, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onTimelineChanged(Timeline timeline, Object obj, int i) {
            C7404o.m20728t(this, timeline, obj, i);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            C7404o.m20727u(this, trackGroupArray, trackSelectionArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.brentvatne.exoplayer.g$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2778f implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2772g f7513j;

        RunnableC2778f(C2772g c2772g) {
            this.f7513j = c2772g;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            InterfaceC11049x m32366X;
            boolean z;
            int i2;
            C2772g c2772g;
            if (C2772g.this.f7499r == null) {
                C2772g.this.f7500s = new C6325f(new C6318a.C6320b());
                C6325f c6325f = C2772g.this.f7500s;
                C6325f.C6331e m22958o = C2772g.this.f7500s.m22958o();
                if (C2772g.this.f7460G == 0) {
                    i2 = ViewDefaults.NUMBER_OF_LINES;
                } else {
                    i2 = C2772g.this.f7460G;
                }
                c6325f.m22963N(m22958o.m22927g(i2));
                C7457n c7457n = new C7457n(true, 65536);
                C7392d.C7393a c7393a = new C7392d.C7393a();
                c7393a.m20772c(c7457n);
                c7393a.m20771d(C2772g.this.f7462I, C2772g.this.f7463J, C2772g.this.f7464K, C2772g.this.f7465L);
                c7393a.m20769f(-1);
                c7393a.m20770e(true);
                C7392d m20773b = c7393a.m20773b();
                C7394e m20761i = new C7394e(C2772g.this.getContext()).m20761i(0);
                C2772g c2772g2 = C2772g.this;
                c2772g2.f7499r = new SimpleExoPlayer.C4375b(c2772g2.getContext(), m20761i).m29743z(C2772g.this.f7500s).m29745x(C2772g.this.f7490l).m29744y(m20773b).m29746w();
                C2772g.this.f7499r.mo29514K(this.f7513j);
                C2772g.this.f7499r.m29835F0(this.f7513j);
                C2772g.this.f7497p.setPlayer(C2772g.this.f7499r);
                C2772g.this.f7493m0.m41401b(this.f7513j);
                C2772g.this.f7490l.mo20634f(new Handler(), this.f7513j);
                C2772g.this.m32389L0(!c2772g.f7507z);
                C2772g.this.f7501t = true;
                C2772g.this.f7499r.m29811Z0(new PlaybackParameters(C2772g.this.f7457D, 1.0f));
            }
            if (C2772g.this.f7501t && C2772g.this.f7467N != null) {
                C2772g.this.f7497p.m32418g();
                if (this.f7513j.f7483g0 != null) {
                    try {
                        m32366X = C2772g.this.m32366X(this.f7513j.f7483g0, this.f7513j.f7484h0, this.f7513j.f7485i0);
                    } catch (C11032l0 e) {
                        if (C9191p0.f24171a < 18) {
                            i = C14070b.f36216a;
                        } else if (e.f28895j == 1) {
                            i = C14070b.f36218c;
                        } else {
                            i = C14070b.f36217b;
                        }
                        C2772g.this.f7486j.m32302f(C2772g.this.getResources().getString(i), e);
                        return;
                    }
                } else {
                    m32366X = null;
                }
                ArrayList m32356b0 = C2772g.this.m32356b0();
                C2772g c2772g3 = C2772g.this;
                InterfaceC10341s m32362Z = c2772g3.m32362Z(c2772g3.f7467N, C2772g.this.f7468O, m32366X);
                if (m32356b0.size() != 0) {
                    m32356b0.add(0, m32362Z);
                    m32362Z = new C10284c0((InterfaceC10341s[]) m32356b0.toArray(new InterfaceC10341s[m32356b0.size()]));
                }
                if (C2772g.this.f7502u != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C2772g.this.f7499r.mo29524E(C2772g.this.f7502u, C2772g.this.f7503v);
                }
                C2772g.this.f7499r.m29820R0(m32362Z, !z, false);
                C2772g.this.f7501t = false;
                C2772g c2772g4 = C2772g.this;
                c2772g4.m32318t0(c2772g4.f7497p);
                C2772g.this.f7486j.m32295m();
                C2772g.this.f7504w = true;
            }
            C2772g.this.m32327o0();
            C2772g c2772g5 = C2772g.this;
            c2772g5.m32309z0(c2772g5.f7487j0);
            C2772g.this.m32370V();
        }
    }

    static {
        CookieManager cookieManager = new CookieManager();
        f7453o0 = cookieManager;
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
    }

    public C2772g(ThemedReactContext themedReactContext, InterfaceC2771f interfaceC2771f) {
        super(themedReactContext);
        this.f7455B = false;
        this.f7456C = false;
        this.f7457D = 1.0f;
        this.f7458E = 1.0f;
        this.f7459F = 3;
        this.f7460G = 0;
        this.f7461H = -9223372036854775807L;
        this.f7462I = 50000;
        this.f7463J = 50000;
        this.f7464K = 2500;
        this.f7465L = 5000;
        this.f7478b0 = true;
        this.f7479c0 = 250.0f;
        this.f7480d0 = false;
        this.f7482f0 = false;
        this.f7483g0 = null;
        this.f7484h0 = null;
        this.f7485i0 = null;
        this.f7495n0 = new HandlerC2773a();
        this.f7489k0 = themedReactContext;
        this.f7486j = new C2780i(themedReactContext);
        this.f7488k = interfaceC2771f;
        this.f7490l = interfaceC2771f.mo32412b();
        m32342g0();
        this.f7491l0 = (AudioManager) themedReactContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        themedReactContext.addLifecycleEventListener(this);
        this.f7493m0 = new C0011a(themedReactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L0 */
    public void m32389L0(boolean z) {
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer == null) {
            return;
        }
        if (z) {
            boolean m32314w0 = m32314w0();
            this.f7456C = m32314w0;
            if (m32314w0) {
                this.f7499r.mo29457n(true);
                return;
            }
            return;
        }
        simpleExoPlayer.mo29457n(false);
    }

    /* renamed from: U */
    private void m32372U() {
        if (this.f7499r == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f7492m.setLayoutParams(layoutParams);
        int indexOfChild = indexOfChild(this.f7492m);
        if (indexOfChild != -1) {
            removeViewAt(indexOfChild);
        }
        addView(this.f7492m, 1, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m32370V() {
        m32379Q0(this.f7469P);
        m32395I0(this.f7455B);
    }

    /* renamed from: W */
    private DataSource.Factory m32368W(boolean z) {
        C7458o c7458o;
        ThemedReactContext themedReactContext = this.f7489k0;
        if (z) {
            c7458o = this.f7490l;
        } else {
            c7458o = null;
        }
        return C2765b.m32428c(themedReactContext, c7458o, this.f7481e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public InterfaceC11049x m32366X(UUID uuid, String str, String[] strArr) {
        if (C9191p0.f24171a < 18) {
            return null;
        }
        C11014h0 c11014h0 = new C11014h0(str, m32364Y(false));
        if (strArr != null) {
            for (int i = 0; i < strArr.length - 1; i += 2) {
                c11014h0.m9355e(strArr[i], strArr[i + 1]);
            }
        }
        return new C11015i(uuid, C11006g0.m9383z(uuid), c11014h0, null, false, 3);
    }

    /* renamed from: Y */
    private InterfaceC4540f.InterfaceC4543c m32364Y(boolean z) {
        return C2765b.m32427d(this.f7489k0, z ? this.f7490l : null, this.f7481e0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public InterfaceC10341s m32362Z(Uri uri, String str, InterfaceC11049x interfaceC11049x) {
        String lastPathSegment;
        if (!TextUtils.isEmpty(str)) {
            lastPathSegment = "." + str;
        } else {
            lastPathSegment = uri.getLastPathSegment();
        }
        int m16236m0 = C9191p0.m16236m0(lastPathSegment);
        if (m16236m0 != 0) {
            if (m16236m0 != 1) {
                if (m16236m0 != 2) {
                    if (m16236m0 == 3) {
                        return new C10306i0.C10308b(this.f7498q).m11867e(interfaceC11049x).m11865g(this.f7488k.mo32413a(this.f7459F)).m11870b(uri);
                    }
                    throw new IllegalStateException("Unsupported type: " + m16236m0);
                }
                return new HlsMediaSource.Factory(this.f7498q).m29005e(interfaceC11049x).m29003g(this.f7488k.mo32413a(this.f7459F)).m29008b(uri);
            }
            return new SsMediaSource.Factory(new C4474a.C4475a(this.f7498q), m32368W(false)).m28991e(interfaceC11049x).m28989g(this.f7488k.mo32413a(this.f7459F)).m28994b(uri);
        }
        return new DashMediaSource.Factory(new C4462c.C4463a(this.f7498q), m32368W(false)).m29104e(interfaceC11049x).m29102g(this.f7488k.mo32413a(this.f7459F)).m29107b(uri);
    }

    /* renamed from: a0 */
    private InterfaceC10341s m32359a0(String str, Uri uri, String str2, String str3) {
        return new C10338r0.C10340b(this.f7498q).m11737a(uri, Format.m29924d(str, str2, -1, str3), -9223372036854775807L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b0 */
    public ArrayList<InterfaceC10341s> m32356b0() {
        String str;
        ArrayList<InterfaceC10341s> arrayList = new ArrayList<>();
        if (this.f7476W == null) {
            return arrayList;
        }
        for (int i = 0; i < this.f7476W.size(); i++) {
            ReadableMap map = this.f7476W.getMap(i);
            String string = map.getString("language");
            if (map.hasKey("title")) {
                str = map.getString("title");
            } else {
                str = string + " " + i;
            }
            InterfaceC10341s m32359a0 = m32359a0(str, Uri.parse(map.getString("uri")), map.getString("type"), string);
            if (m32359a0 != null) {
                arrayList.add(m32359a0);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r0 != 4) goto L11;
     */
    /* renamed from: b1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m32355b1() {
        /*
            r3 = this;
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f7499r
            if (r0 == 0) goto L25
            int r0 = r0.mo29505P()
            r1 = 1
            if (r0 == r1) goto L21
            r2 = 2
            if (r0 == r2) goto L15
            r2 = 3
            if (r0 == r2) goto L15
            r1 = 4
            if (r0 == r1) goto L21
            goto L28
        L15:
            com.google.android.exoplayer2.SimpleExoPlayer r0 = r3.f7499r
            boolean r0 = r0.mo29522F()
            if (r0 != 0) goto L28
            r3.m32389L0(r1)
            goto L28
        L21:
            r3.m32329n0()
            goto L28
        L25:
            r3.m32329n0()
        L28:
            boolean r0 = r3.f7477a0
            if (r0 != 0) goto L31
            boolean r0 = r3.f7478b0
            r3.setKeepScreenOn(r0)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brentvatne.exoplayer.C2772g.m32355b1():void");
    }

    /* renamed from: c1 */
    private void m32352c1() {
        this.f7495n0.sendEmptyMessage(1);
    }

    /* renamed from: d0 */
    private void m32350d0() {
        this.f7495n0.removeMessages(1);
    }

    /* renamed from: d1 */
    private void m32349d1() {
        m32321r0();
        m32317u0();
    }

    /* renamed from: e0 */
    private void m32348e0() {
        this.f7502u = -1;
        this.f7503v = -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public void m32347e1() {
        if (this.f7499r == null) {
            return;
        }
        m32318t0(this.f7492m);
        if (this.f7492m.m28925J()) {
            this.f7492m.m28928G();
        } else {
            this.f7492m.m28919P();
        }
    }

    /* renamed from: f1 */
    private void m32344f1() {
        long j;
        this.f7502u = this.f7499r.mo29463l();
        if (this.f7499r.mo29532h()) {
            j = Math.max(0L, this.f7499r.mo29491Y());
        } else {
            j = -9223372036854775807L;
        }
        this.f7503v = j;
    }

    /* renamed from: g0 */
    private void m32342g0() {
        m32348e0();
        this.f7498q = m32368W(true);
        CookieHandler cookieHandler = CookieHandler.getDefault();
        CookieManager cookieManager = f7453o0;
        if (cookieHandler != cookieManager) {
            CookieHandler.setDefault(cookieManager);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        C2767d c2767d = new C2767d(getContext());
        this.f7497p = c2767d;
        c2767d.setLayoutParams(layoutParams);
        addView(this.f7497p, 0, layoutParams);
        this.f7466M = new Handler();
    }

    /* renamed from: g1 */
    private void m32341g1() {
        int i;
        String str;
        if (this.f7504w) {
            int i2 = 0;
            this.f7504w = false;
            m32373T0(this.f7470Q, this.f7471R);
            m32367W0(this.f7472S, this.f7473T);
            m32371U0(this.f7474U, this.f7475V);
            Format m29826M0 = this.f7499r.m29826M0();
            if (m29826M0 != null) {
                i = m29826M0.f11202z;
            } else {
                i = 0;
            }
            if (m29826M0 != null) {
                i2 = m29826M0.f11171A;
            }
            int i3 = i2;
            if (m29826M0 != null) {
                str = m29826M0.f11186j;
            } else {
                str = "-1";
            }
            this.f7486j.m32296l(this.f7499r.getDuration(), this.f7499r.mo29491Y(), i, i3, m32339h0(), m32335k0(), m32331m0(), str);
        }
    }

    /* renamed from: h0 */
    private WritableArray m32339h0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC6341j.C6342a m22901g = this.f7500s.m22901g();
        int m32333l0 = m32333l0(1);
        if (m22901g != null && m32333l0 != -1) {
            TrackGroupArray m22893e = m22901g.m22893e(m32333l0);
            for (int i = 0; i < m22893e.f11764j; i++) {
                Format m11721a = m22893e.m29144a(i).m11721a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = m11721a.f11186j;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", m11721a.f11197u);
                String str3 = m11721a.f11188l;
                if (str3 == null) {
                    str3 = "";
                }
                createMap.putString("language", str3);
                int i2 = m11721a.f11193q;
                if (i2 != -1) {
                    str2 = String.format(Locale.US, "%.2fMbps", Float.valueOf(i2 / 1000000.0f));
                }
                createMap.putString("bitrate", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: i0 */
    private int m32338i0(TrackGroupArray trackGroupArray) {
        if (trackGroupArray.f11764j == 0) {
            return -1;
        }
        String language = Locale.getDefault().getLanguage();
        String iSO3Language = Locale.getDefault().getISO3Language();
        for (int i = 0; i < trackGroupArray.f11764j; i++) {
            String str = trackGroupArray.m29144a(i).m11721a(0).f11188l;
            if (str != null && (str.equals(language) || str.equals(iSO3Language))) {
                return i;
            }
        }
        return 0;
    }

    /* renamed from: k0 */
    private WritableArray m32335k0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC6341j.C6342a m22901g = this.f7500s.m22901g();
        int m32333l0 = m32333l0(3);
        if (m22901g != null && m32333l0 != -1) {
            TrackGroupArray m22893e = m22901g.m22893e(m32333l0);
            for (int i = 0; i < m22893e.f11764j; i++) {
                Format m11721a = m22893e.m29144a(i).m11721a(0);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("index", i);
                String str = m11721a.f11186j;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                createMap.putString("title", str);
                createMap.putString("type", m11721a.f11197u);
                String str3 = m11721a.f11188l;
                if (str3 != null) {
                    str2 = str3;
                }
                createMap.putString("language", str2);
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    /* renamed from: m0 */
    private WritableArray m32331m0() {
        WritableArray createArray = Arguments.createArray();
        AbstractC6341j.C6342a m22901g = this.f7500s.m22901g();
        int m32333l0 = m32333l0(2);
        if (m22901g != null && m32333l0 != -1) {
            TrackGroupArray m22893e = m22901g.m22893e(m32333l0);
            for (int i = 0; i < m22893e.f11764j; i++) {
                C10344s0 m29144a = m22893e.m29144a(i);
                for (int i2 = 0; i2 < m29144a.f27056j; i2++) {
                    Format m11721a = m29144a.m11721a(i2);
                    WritableMap createMap = Arguments.createMap();
                    int i3 = m11721a.f11202z;
                    if (i3 == -1) {
                        i3 = 0;
                    }
                    createMap.putInt("width", i3);
                    int i4 = m11721a.f11171A;
                    if (i4 == -1) {
                        i4 = 0;
                    }
                    createMap.putInt("height", i4);
                    int i5 = m11721a.f11193q;
                    if (i5 == -1) {
                        i5 = 0;
                    }
                    createMap.putInt("bitrate", i5);
                    String str = m11721a.f11194r;
                    if (str == null) {
                        str = "";
                    }
                    createMap.putString("codecs", str);
                    String str2 = m11721a.f11186j;
                    if (str2 == null) {
                        str2 = String.valueOf(i2);
                    }
                    createMap.putString("trackId", str2);
                    createArray.pushMap(createMap);
                }
            }
        }
        return createArray;
    }

    /* renamed from: n0 */
    private void m32329n0() {
        new Handler().postDelayed(new RunnableC2778f(this), 1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public void m32327o0() {
        if (this.f7492m == null) {
            this.f7492m = new PlayerControlView(getContext());
        }
        this.f7492m.setPlayer(this.f7499r);
        this.f7492m.m28919P();
        this.f7494n = this.f7492m.findViewById(C14069a.f36215c);
        this.f7497p.setOnClickListener(new View$OnClickListenerC2774b());
        ((ImageButton) this.f7492m.findViewById(C14069a.f36214b)).setOnClickListener(new View$OnClickListenerC2775c());
        ((ImageButton) this.f7492m.findViewById(C14069a.f36213a)).setOnClickListener(new View$OnClickListenerC2776d());
        C2777e c2777e = new C2777e();
        this.f7496o = c2777e;
        this.f7499r.mo29514K(c2777e);
    }

    /* renamed from: p0 */
    private static boolean m32325p0(ExoPlaybackException exoPlaybackException) {
        Log.e("ExoPlayer Exception", exoPlaybackException.toString());
        if (exoPlaybackException.f11162j != 0) {
            return false;
        }
        for (Throwable m29927h = exoPlaybackException.m29927h(); m29927h != null; m29927h = m29927h.getCause()) {
            if ((m29927h instanceof C10279b) || (m29927h instanceof InterfaceC4540f.C4544d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q0 */
    private void m32323q0(boolean z) {
        if (this.f7454A == z) {
            return;
        }
        this.f7454A = z;
        if (z) {
            this.f7486j.m32304d(true);
        } else {
            this.f7486j.m32304d(false);
        }
    }

    /* renamed from: r0 */
    private void m32321r0() {
        if (this.f7505x) {
            m32403E0(false);
        }
        this.f7491l0.abandonAudioFocus(this);
    }

    /* renamed from: s0 */
    private void m32319s0() {
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null && simpleExoPlayer.mo29522F()) {
            m32389L0(false);
        }
        setKeepScreenOn(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public void m32318t0(View view) {
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* renamed from: u0 */
    private void m32317u0() {
        if (this.f7499r != null) {
            m32344f1();
            this.f7499r.m29819S0();
            this.f7499r.m29818T0(this);
            this.f7500s = null;
            this.f7499r = null;
        }
        this.f7495n0.removeMessages(1);
        this.f7489k0.removeLifecycleEventListener(this);
        this.f7493m0.m41402a();
        this.f7490l.mo20637a(this);
    }

    /* renamed from: v0 */
    private void m32316v0() {
        this.f7501t = true;
        m32329n0();
    }

    /* renamed from: w0 */
    private boolean m32314w0() {
        if (this.f7477a0 || this.f7467N == null || this.f7456C || this.f7491l0.requestAudioFocus(this, 3, 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: A0 */
    public void m32410A0(boolean z) {
        this.f7477a0 = z;
    }

    /* renamed from: B0 */
    public void m32408B0(String[] strArr) {
        this.f7485i0 = strArr;
    }

    /* renamed from: C0 */
    public void m32406C0(String str) {
        this.f7484h0 = str;
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: D */
    public void mo9295D(int i, InterfaceC10341s.C10342a c10342a, Exception exc) {
        Log.d("DRM Info", "onDrmSessionManagerError");
        this.f7486j.m32302f("onDrmSessionManagerError", exc);
    }

    /* renamed from: D0 */
    public void m32405D0(UUID uuid) {
        this.f7483g0 = uuid;
    }

    /* renamed from: E0 */
    public void m32403E0(boolean z) {
        int i;
        if (z == this.f7505x) {
            return;
        }
        this.f7505x = z;
        Activity currentActivity = this.f7489k0.getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        View decorView = currentActivity.getWindow().getDecorView();
        if (this.f7505x) {
            if (C9191p0.f24171a >= 19) {
                i = 4102;
            } else {
                i = 6;
            }
            this.f7486j.m32298j();
            decorView.setSystemUiVisibility(i);
            this.f7486j.m32300h();
            return;
        }
        this.f7486j.m32299i();
        decorView.setSystemUiVisibility(0);
        this.f7486j.m32301g();
    }

    /* renamed from: F0 */
    public void m32401F0(boolean z) {
        this.f7497p.setHideShutterView(z);
    }

    /* renamed from: G0 */
    public void m32399G0(int i) {
        this.f7460G = i;
        if (this.f7499r != null) {
            C6325f c6325f = this.f7500s;
            C6325f.C6331e m22958o = c6325f.m22958o();
            int i2 = this.f7460G;
            if (i2 == 0) {
                i2 = ViewDefaults.NUMBER_OF_LINES;
            }
            c6325f.m22963N(m22958o.m22927g(i2));
        }
    }

    /* renamed from: H0 */
    public void m32397H0(int i) {
        this.f7459F = i;
        m32317u0();
        m32329n0();
    }

    /* renamed from: I0 */
    public void m32395I0(boolean z) {
        float f;
        this.f7455B = z;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        this.f7458E = f;
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.m29803e1(f);
        }
    }

    /* renamed from: J0 */
    public void m32393J0(boolean z) {
        this.f7507z = z;
        if (this.f7499r != null) {
            if (!z) {
                m32355b1();
            } else {
                m32319s0();
            }
        }
    }

    /* renamed from: K0 */
    public void m32391K0(boolean z) {
        this.f7480d0 = z;
    }

    /* renamed from: M0 */
    public void m32387M0(boolean z) {
        this.f7478b0 = z;
    }

    /* renamed from: N0 */
    public void m32385N0(float f) {
        this.f7479c0 = f;
    }

    /* renamed from: O0 */
    public void m32383O0(float f) {
        this.f7457D = f;
        if (this.f7499r != null) {
            this.f7499r.m29811Z0(new PlaybackParameters(this.f7457D, 1.0f));
        }
    }

    /* renamed from: P0 */
    public void m32381P0(Uri uri, String str) {
        if (uri != null) {
            boolean equals = uri.equals(this.f7467N);
            this.f7467N = uri;
            this.f7468O = str;
            this.f7498q = m32368W(true);
            if (!equals) {
                m32316v0();
            }
        }
    }

    /* renamed from: Q0 */
    public void m32379Q0(boolean z) {
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            if (z) {
                simpleExoPlayer.mo29501S(1);
            } else {
                simpleExoPlayer.mo29501S(0);
            }
        }
        this.f7469P = z;
    }

    /* renamed from: R0 */
    public void m32377R0(boolean z) {
        this.f7482f0 = z;
    }

    /* renamed from: S0 */
    public void m32375S0(int i) {
        this.f7497p.setResizeMode(i);
    }

    /* renamed from: T0 */
    public void m32373T0(String str, Dynamic dynamic) {
        this.f7470Q = str;
        this.f7471R = dynamic;
        m32369V0(1, str, dynamic);
    }

    /* renamed from: U0 */
    public void m32371U0(String str, Dynamic dynamic) {
        this.f7474U = str;
        this.f7475V = dynamic;
        m32369V0(3, str, dynamic);
    }

    /* renamed from: V0 */
    public void m32369V0(int i, String str, Dynamic dynamic) {
        int m32333l0;
        AbstractC6341j.C6342a m22901g;
        int m32338i0;
        if (this.f7499r == null || (m32333l0 = m32333l0(i)) == -1 || (m22901g = this.f7500s.m22901g()) == null) {
            return;
        }
        TrackGroupArray m22893e = m22901g.m22893e(m32333l0);
        int[] iArr = {0};
        if (TextUtils.isEmpty(str)) {
            str = "default";
        }
        C6325f.C6329d mo22884a = this.f7500s.m22951v().m22939j().m22925i(m32333l0, true).mo22884a();
        if (str.equals("disabled")) {
            this.f7500s.m22964M(mo22884a);
            return;
        }
        if (str.equals("language")) {
            m32338i0 = 0;
            while (m32338i0 < m22893e.f11764j) {
                String str2 = m22893e.m29144a(m32338i0).m11721a(0).f11188l;
                if (str2 != null && str2.equals(dynamic.asString())) {
                    break;
                }
                m32338i0++;
            }
            m32338i0 = -1;
        } else if (str.equals("title")) {
            m32338i0 = 0;
            while (m32338i0 < m22893e.f11764j) {
                String str3 = m22893e.m29144a(m32338i0).m11721a(0).f11186j;
                if (str3 != null && str3.equals(dynamic.asString())) {
                    break;
                }
                m32338i0++;
            }
            m32338i0 = -1;
        } else if (str.equals("index")) {
            if (dynamic.asInt() < m22893e.f11764j) {
                m32338i0 = dynamic.asInt();
            }
            m32338i0 = -1;
        } else if (str.equals("resolution")) {
            int asInt = dynamic.asInt();
            int i2 = -1;
            for (int i3 = 0; i3 < m22893e.f11764j; i3++) {
                C10344s0 m29144a = m22893e.m29144a(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= m29144a.f27056j) {
                        break;
                    } else if (m29144a.m11721a(i4).f11171A == asInt) {
                        iArr[0] = i4;
                        i2 = i3;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            m32338i0 = i2;
        } else if (m32333l0 == 3 && C9191p0.f24171a > 18) {
            CaptioningManager captioningManager = (CaptioningManager) this.f7489k0.getSystemService("captioning");
            if (captioningManager != null && captioningManager.isEnabled()) {
                m32338i0 = m32338i0(m22893e);
            }
            m32338i0 = -1;
        } else {
            if (m32333l0 == 1) {
                m32338i0 = m32338i0(m22893e);
            }
            m32338i0 = -1;
        }
        if (m32338i0 == -1 && i == 2 && m22893e.f11764j != 0) {
            C10344s0 m29144a2 = m22893e.m29144a(0);
            iArr = new int[m29144a2.f27056j];
            for (int i5 = 0; i5 < m29144a2.f27056j; i5++) {
                iArr[i5] = i5;
            }
            m32338i0 = 0;
        }
        if (m32338i0 == -1) {
            this.f7500s.m22964M(mo22884a);
        } else {
            this.f7500s.m22964M(this.f7500s.m22951v().m22939j().m22925i(m32333l0, false).m22924j(m32333l0, m22893e, new C6325f.C6332f(m32338i0, iArr)).mo22884a());
        }
    }

    /* renamed from: W0 */
    public void m32367W0(String str, Dynamic dynamic) {
        this.f7472S = str;
        this.f7473T = dynamic;
        m32369V0(2, str, dynamic);
    }

    /* renamed from: X0 */
    public void m32365X0(Uri uri, String str, Map<String, String> map) {
        if (uri != null) {
            boolean equals = uri.equals(this.f7467N);
            this.f7467N = uri;
            this.f7468O = str;
            this.f7481e0 = map;
            this.f7498q = C2765b.m32428c(this.f7489k0, this.f7490l, map);
            if (!equals) {
                m32316v0();
            }
        }
    }

    /* renamed from: Y0 */
    public void m32363Y0(ReadableArray readableArray) {
        this.f7476W = readableArray;
        m32316v0();
    }

    /* renamed from: Z0 */
    public void m32361Z0(boolean z) {
        boolean z2;
        if (z && this.f7483g0 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f7497p.setUseTextureView(z2);
    }

    /* renamed from: a1 */
    public void m32358a1(float f) {
        this.f7458E = f;
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.m29803e1(f);
        }
    }

    @Override // p003a2.InterfaceC0012b
    /* renamed from: b */
    public void mo32357b() {
        this.f7486j.m32307a();
    }

    /* renamed from: c0 */
    public void m32353c0() {
        m32349d1();
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: e */
    public /* synthetic */ void mo9294e(int i, InterfaceC10341s.C10342a c10342a) {
        C11038o.m9296b(this, i, c10342a);
    }

    /* renamed from: f0 */
    public void m32345f0() {
        if (this.f7467N != null) {
            this.f7499r.m29800f1(true);
            this.f7467N = null;
            this.f7468O = null;
            this.f7481e0 = null;
            this.f7498q = null;
            m32348e0();
        }
    }

    @Override // p060d7.InterfaceC5779e
    /* renamed from: i */
    public void mo24518i(Metadata metadata) {
        this.f7486j.m32288t(metadata);
    }

    /* renamed from: j0 */
    public double m32336j0(long j) {
        Timeline.C4379c c4379c = new Timeline.C4379c();
        if (!this.f7499r.mo29438v().m29737q()) {
            this.f7499r.mo29438v().m29738n(this.f7499r.mo29463l(), c4379c);
        }
        return c4379c.f11384f + j;
    }

    @Override // p153i8.InterfaceC7444e.InterfaceC7445a
    /* renamed from: k */
    public void mo20664k(int i, long j, long j2) {
        int i2;
        String str;
        if (this.f7482f0) {
            SimpleExoPlayer simpleExoPlayer = this.f7499r;
            if (simpleExoPlayer == null) {
                this.f7486j.m32305c(j2, 0, 0, "-1");
                return;
            }
            Format m29826M0 = simpleExoPlayer.m29826M0();
            int i3 = 0;
            if (m29826M0 != null) {
                i2 = m29826M0.f11202z;
            } else {
                i2 = 0;
            }
            if (m29826M0 != null) {
                i3 = m29826M0.f11171A;
            }
            int i4 = i3;
            if (m29826M0 != null) {
                str = m29826M0.f11186j;
            } else {
                str = "-1";
            }
            this.f7486j.m32305c(j2, i4, i2, str);
        }
    }

    /* renamed from: l0 */
    public int m32333l0(int i) {
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            int m29827L0 = simpleExoPlayer.m29827L0();
            for (int i2 = 0; i2 < m29827L0; i2++) {
                if (this.f7499r.mo29529B(i2) == i) {
                    return i2;
                }
            }
            return -1;
        }
        return -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m32329n0();
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i != -2) {
            if (i != -1) {
                if (i == 1) {
                    this.f7456C = true;
                    this.f7486j.m32306b(true);
                }
            } else {
                this.f7456C = false;
                this.f7486j.m32306b(false);
                m32319s0();
                this.f7491l0.abandonAudioFocus(this);
            }
        } else {
            this.f7486j.m32306b(false);
        }
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            if (i == -3) {
                if (!this.f7455B) {
                    simpleExoPlayer.m29803e1(this.f7458E * 0.8f);
                }
            } else if (i == 1 && !this.f7455B) {
                simpleExoPlayer.m29803e1(this.f7458E * 1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        C7404o.m20747a(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onExperimentalOffloadSchedulingEnabledChanged(boolean z) {
        C7404o.m20746b(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onExperimentalSleepingForOffloadChanged(boolean z) {
        C7404o.m20745c(this, z);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        m32349d1();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.f7506y = true;
        if (this.f7480d0) {
            return;
        }
        m32389L0(false);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (!this.f7480d0 || !this.f7506y) {
            m32389L0(!this.f7507z);
        }
        this.f7506y = false;
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onIsLoadingChanged(boolean z) {
        C7404o.m20744d(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onIsPlayingChanged(boolean z) {
        C7404o.m20743e(this, z);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onLoadingChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
        C7404o.m20741g(this, mediaItem, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        C7404o.m20740h(this, z, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        this.f7486j.m32294n(playbackParameters.f11302a);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onPlaybackStateChanged(int i) {
        C7404o.m20738j(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        C7404o.m20737k(this, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String str = "ExoPlaybackException type : " + exoPlaybackException.f11162j;
        int i = exoPlaybackException.f11162j;
        if (i == 1) {
            Exception m29928g = exoPlaybackException.m29928g();
            if (m29928g instanceof AbstractC2429n.C2430a) {
                AbstractC2429n.C2430a c2430a = (AbstractC2429n.C2430a) m29928g;
                str = c2430a.f6721l.f6634a == null ? c2430a.getCause() instanceof C2440x.C2443c ? getResources().getString(C14070b.f36222g) : c2430a.f6720k ? getResources().getString(C14070b.f36221f, c2430a.f6719j) : getResources().getString(C14070b.f36220e, c2430a.f6719j) : getResources().getString(C14070b.f36219d, c2430a.f6721l.f6634a);
            }
        } else if (i == 0) {
            str = getResources().getString(C14070b.f36223h);
        }
        this.f7486j.m32302f(str, exoPlaybackException);
        this.f7501t = true;
        if (m32325p0(exoPlaybackException)) {
            m32348e0();
            m32329n0();
            return;
        }
        m32344f1();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onPlayerStateChanged(boolean z, int i) {
        String str;
        String str2 = "onStateChanged: playWhenReady=" + z + ", playbackState=";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = str2 + "unknown";
                    } else {
                        str = str2 + "ended";
                        this.f7486j.m32303e();
                        m32321r0();
                        setKeepScreenOn(false);
                    }
                } else {
                    str = str2 + "ready";
                    this.f7486j.m32292p();
                    m32323q0(false);
                    m32352c1();
                    m32341g1();
                    PlayerControlView playerControlView = this.f7492m;
                    if (playerControlView != null) {
                        playerControlView.m28919P();
                    }
                    setKeepScreenOn(this.f7478b0);
                }
            } else {
                str = str2 + "buffering";
                m32323q0(true);
                m32350d0();
                setKeepScreenOn(this.f7478b0);
            }
        } else {
            String str3 = str2 + "idle";
            this.f7486j.m32297k();
            m32350d0();
            if (!z) {
                setKeepScreenOn(false);
            }
            str = str3;
        }
        Log.d("ReactExoplayerView", str);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onPositionDiscontinuity(int i) {
        if (this.f7501t) {
            m32344f1();
        }
        if (i == 0 && this.f7499r.mo29497V() == 1) {
            this.f7486j.m32303e();
        }
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onRepeatModeChanged(int i) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onSeekProcessed() {
        this.f7486j.m32290r(this.f7499r.mo29491Y(), this.f7461H);
        this.f7461H = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onStaticMetadataChanged(List list) {
        C7404o.m20730r(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
        C7404o.m20729s(this, timeline, i);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onTimelineChanged(Timeline timeline, Object obj, int i) {
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // android.view.View
    public void setId(int i) {
        super.setId(i);
        this.f7486j.m32289s(i);
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: t */
    public void mo9293t(int i, InterfaceC10341s.C10342a c10342a) {
        Log.d("DRM Info", "onDrmKeysRestored");
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: u */
    public /* synthetic */ void mo9292u(int i, InterfaceC10341s.C10342a c10342a) {
        C11038o.m9297a(this, i, c10342a);
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: v */
    public void mo9291v(int i, InterfaceC10341s.C10342a c10342a) {
        Log.d("DRM Info", "onDrmKeysRemoved");
    }

    /* renamed from: x0 */
    public void m32312x0(long j) {
        SimpleExoPlayer simpleExoPlayer = this.f7499r;
        if (simpleExoPlayer != null) {
            this.f7461H = j;
            simpleExoPlayer.m29533c0(j);
        }
    }

    /* renamed from: y0 */
    public void m32310y0(int i, int i2, int i3, int i4) {
        this.f7462I = i;
        this.f7463J = i2;
        this.f7464K = i3;
        this.f7465L = i4;
        m32317u0();
        m32329n0();
    }

    @Override // p259o6.InterfaceC11045v
    /* renamed from: z */
    public void mo9290z(int i, InterfaceC10341s.C10342a c10342a) {
        Log.d("DRM Info", "onDrmKeysLoaded");
    }

    /* renamed from: z0 */
    public void m32309z0(boolean z) {
        this.f7487j0 = z;
        if (this.f7499r != null && this.f7497p != null) {
            if (z) {
                m32372U();
                return;
            }
            int indexOfChild = indexOfChild(this.f7492m);
            if (indexOfChild != -1) {
                removeViewAt(indexOfChild);
            }
        }
    }
}
