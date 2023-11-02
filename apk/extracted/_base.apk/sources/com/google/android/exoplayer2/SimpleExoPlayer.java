package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.C4386b;
import com.google.android.exoplayer2.C4392d;
import com.google.android.exoplayer2.C4403h;
import com.google.android.exoplayer2.C4562v0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.C4382a;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p060d7.InterfaceC5779e;
import p099f8.AbstractC6347m;
import p099f8.C6325f;
import p151i6.C7390b;
import p151i6.C7392d;
import p151i6.C7394e;
import p151i6.C7398i;
import p151i6.C7404o;
import p151i6.C7410u;
import p151i6.InterfaceC7401l;
import p151i6.InterfaceC7409t;
import p153i8.C7458o;
import p153i8.InterfaceC7444e;
import p193k6.InterfaceC9088f;
import p193k6.InterfaceC9115q;
import p195k8.C9149a;
import p195k8.C9150a0;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.InterfaceC9155c;
import p213l8.C10078j;
import p213l8.InterfaceC10062a0;
import p213l8.InterfaceC10080l;
import p213l8.InterfaceC10081m;
import p213l8.InterfaceC10087q;
import p229m7.C10309j;
import p229m7.InterfaceC10278a0;
import p229m7.InterfaceC10341s;
import p230m8.InterfaceC10356a;
import p243n6.C10506a;
import p243n6.InterfaceC10507b;
import p296q6.C11744g;
import p296q6.InterfaceC11753o;
import p383v7.C13127b;
import p383v7.InterfaceC13140l;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SimpleExoPlayer extends AbstractC4396e implements Player.InterfaceC4373c, Player.InterfaceC4372b {

    /* renamed from: A */
    private int f11305A;

    /* renamed from: B */
    private DecoderCounters f11306B;

    /* renamed from: C */
    private DecoderCounters f11307C;

    /* renamed from: D */
    private int f11308D;

    /* renamed from: E */
    private AudioAttributes f11309E;

    /* renamed from: F */
    private float f11310F;

    /* renamed from: G */
    private boolean f11311G;

    /* renamed from: H */
    private List<C13127b> f11312H;

    /* renamed from: I */
    private InterfaceC10081m f11313I;

    /* renamed from: J */
    private InterfaceC10356a f11314J;

    /* renamed from: K */
    private boolean f11315K;

    /* renamed from: L */
    private boolean f11316L;

    /* renamed from: M */
    private C9150a0 f11317M;

    /* renamed from: N */
    private boolean f11318N;

    /* renamed from: O */
    private boolean f11319O;

    /* renamed from: P */
    private C10506a f11320P;

    /* renamed from: b */
    protected final InterfaceC4483u0[] f11321b;

    /* renamed from: c */
    private final Context f11322c;

    /* renamed from: d */
    private final C4397e0 f11323d;

    /* renamed from: e */
    private final SurfaceHolder$CallbackC4376c f11324e;

    /* renamed from: f */
    private final CopyOnWriteArraySet<InterfaceC10087q> f11325f;

    /* renamed from: g */
    private final CopyOnWriteArraySet<InterfaceC9088f> f11326g;

    /* renamed from: h */
    private final CopyOnWriteArraySet<InterfaceC13140l> f11327h;

    /* renamed from: i */
    private final CopyOnWriteArraySet<InterfaceC5779e> f11328i;

    /* renamed from: j */
    private final CopyOnWriteArraySet<InterfaceC10507b> f11329j;

    /* renamed from: k */
    private final C4382a f11330k;

    /* renamed from: l */
    private final C4386b f11331l;

    /* renamed from: m */
    private final C4392d f11332m;

    /* renamed from: n */
    private final C4562v0 f11333n;

    /* renamed from: o */
    private final C4569x0 f11334o;

    /* renamed from: p */
    private final C4571y0 f11335p;

    /* renamed from: q */
    private final long f11336q;

    /* renamed from: r */
    private Format f11337r;

    /* renamed from: s */
    private Format f11338s;

    /* renamed from: t */
    private AudioTrack f11339t;

    /* renamed from: u */
    private Surface f11340u;

    /* renamed from: v */
    private boolean f11341v;

    /* renamed from: w */
    private int f11342w;

    /* renamed from: x */
    private SurfaceHolder f11343x;

    /* renamed from: y */
    private TextureView f11344y;

    /* renamed from: z */
    private int f11345z;

    /* renamed from: com.google.android.exoplayer2.SimpleExoPlayer$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4375b {

        /* renamed from: a */
        private final Context f11346a;

        /* renamed from: b */
        private final InterfaceC7409t f11347b;

        /* renamed from: c */
        private InterfaceC9155c f11348c;

        /* renamed from: d */
        private AbstractC6347m f11349d;

        /* renamed from: e */
        private InterfaceC10278a0 f11350e;

        /* renamed from: f */
        private InterfaceC7401l f11351f;

        /* renamed from: g */
        private InterfaceC7444e f11352g;

        /* renamed from: h */
        private C4382a f11353h;

        /* renamed from: i */
        private Looper f11354i;

        /* renamed from: j */
        private C9150a0 f11355j;

        /* renamed from: k */
        private AudioAttributes f11356k;

        /* renamed from: l */
        private boolean f11357l;

        /* renamed from: m */
        private int f11358m;

        /* renamed from: n */
        private boolean f11359n;

        /* renamed from: o */
        private boolean f11360o;

        /* renamed from: p */
        private int f11361p;

        /* renamed from: q */
        private boolean f11362q;

        /* renamed from: r */
        private C7410u f11363r;

        /* renamed from: s */
        private InterfaceC4417i0 f11364s;

        /* renamed from: t */
        private long f11365t;

        /* renamed from: u */
        private long f11366u;

        /* renamed from: v */
        private boolean f11367v;

        /* renamed from: w */
        private boolean f11368w;

        public C4375b(Context context) {
            this(context, new C7394e(context), new C11744g());
        }

        /* renamed from: w */
        public SimpleExoPlayer m29746w() {
            C9149a.m16447f(!this.f11368w);
            this.f11368w = true;
            return new SimpleExoPlayer(this);
        }

        /* renamed from: x */
        public C4375b m29745x(InterfaceC7444e interfaceC7444e) {
            C9149a.m16447f(!this.f11368w);
            this.f11352g = interfaceC7444e;
            return this;
        }

        /* renamed from: y */
        public C4375b m29744y(InterfaceC7401l interfaceC7401l) {
            C9149a.m16447f(!this.f11368w);
            this.f11351f = interfaceC7401l;
            return this;
        }

        /* renamed from: z */
        public C4375b m29743z(AbstractC6347m abstractC6347m) {
            C9149a.m16447f(!this.f11368w);
            this.f11349d = abstractC6347m;
            return this;
        }

        public C4375b(Context context, InterfaceC7409t interfaceC7409t) {
            this(context, interfaceC7409t, new C11744g());
        }

        public C4375b(Context context, InterfaceC7409t interfaceC7409t, InterfaceC11753o interfaceC11753o) {
            this(context, interfaceC7409t, new C6325f(context), new C10309j(context, interfaceC11753o), new C7392d(), C7458o.m20630l(context), new C4382a(InterfaceC9155c.f24108a));
        }

        public C4375b(Context context, InterfaceC7409t interfaceC7409t, AbstractC6347m abstractC6347m, InterfaceC10278a0 interfaceC10278a0, InterfaceC7401l interfaceC7401l, InterfaceC7444e interfaceC7444e, C4382a c4382a) {
            this.f11346a = context;
            this.f11347b = interfaceC7409t;
            this.f11349d = abstractC6347m;
            this.f11350e = interfaceC10278a0;
            this.f11351f = interfaceC7401l;
            this.f11352g = interfaceC7444e;
            this.f11353h = c4382a;
            this.f11354i = C9191p0.m16283P();
            this.f11356k = AudioAttributes.f11425f;
            this.f11358m = 0;
            this.f11361p = 1;
            this.f11362q = true;
            this.f11363r = C7410u.f19930g;
            this.f11364s = new C4403h.C4405b().m29414a();
            this.f11348c = InterfaceC9155c.f24108a;
            this.f11365t = 500L;
            this.f11366u = 2000L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.SimpleExoPlayer$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class SurfaceHolder$CallbackC4376c implements InterfaceC10062a0, InterfaceC9115q, InterfaceC13140l, InterfaceC5779e, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, C4392d.InterfaceC4394b, C4386b.InterfaceC4388b, C4562v0.InterfaceC4564b, Player.InterfaceC4371a {
        private SurfaceHolder$CallbackC4376c() {
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: C */
        public void mo16603C(int i, long j, long j2) {
            SimpleExoPlayer.this.f11330k.mo16603C(i, j, j2);
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: E */
        public void mo12468E(long j, int i) {
            SimpleExoPlayer.this.f11330k.mo12468E(j, i);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: a */
        public void mo16602a(boolean z) {
            if (SimpleExoPlayer.this.f11311G == z) {
                return;
            }
            SimpleExoPlayer.this.f11311G = z;
            SimpleExoPlayer.this.m29822Q0();
        }

        @Override // com.google.android.exoplayer2.C4386b.InterfaceC4388b
        /* renamed from: b */
        public void mo29564b() {
            SimpleExoPlayer.this.m29798g1(false, -1, 3);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: c */
        public void mo16601c(Exception exc) {
            SimpleExoPlayer.this.f11330k.mo16601c(exc);
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: d */
        public void mo12467d(int i, int i2, int i3, float f) {
            SimpleExoPlayer.this.f11330k.mo12467d(i, i2, i3, f);
            Iterator it = SimpleExoPlayer.this.f11325f.iterator();
            while (it.hasNext()) {
                ((InterfaceC10087q) it.next()).mo12310d(i, i2, i3, f);
            }
        }

        @Override // com.google.android.exoplayer2.C4562v0.InterfaceC4564b
        /* renamed from: e */
        public void mo28592e(int i) {
            C10506a m29831I0 = SimpleExoPlayer.m29831I0(SimpleExoPlayer.this.f11333n);
            if (!m29831I0.equals(SimpleExoPlayer.this.f11320P)) {
                SimpleExoPlayer.this.f11320P = m29831I0;
                Iterator it = SimpleExoPlayer.this.f11329j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC10507b) it.next()).m11339a(m29831I0);
                }
            }
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: f */
        public void mo12466f(String str) {
            SimpleExoPlayer.this.f11330k.mo12466f(str);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: g */
        public void mo16600g(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f11307C = decoderCounters;
            SimpleExoPlayer.this.f11330k.mo16600g(decoderCounters);
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: h */
        public void mo12465h(String str, long j, long j2) {
            SimpleExoPlayer.this.f11330k.mo12465h(str, j, j2);
        }

        @Override // p060d7.InterfaceC5779e
        /* renamed from: i */
        public void mo24518i(Metadata metadata) {
            SimpleExoPlayer.this.f11330k.m29655S1(metadata);
            Iterator it = SimpleExoPlayer.this.f11328i.iterator();
            while (it.hasNext()) {
                ((InterfaceC5779e) it.next()).mo24518i(metadata);
            }
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: j */
        public void mo12464j(Surface surface) {
            SimpleExoPlayer.this.f11330k.mo12464j(surface);
            if (SimpleExoPlayer.this.f11340u == surface) {
                Iterator it = SimpleExoPlayer.this.f11325f.iterator();
                while (it.hasNext()) {
                    ((InterfaceC10087q) it.next()).mo12309e();
                }
            }
        }

        @Override // com.google.android.exoplayer2.C4562v0.InterfaceC4564b
        /* renamed from: k */
        public void mo28591k(int i, boolean z) {
            Iterator it = SimpleExoPlayer.this.f11329j.iterator();
            while (it.hasNext()) {
                ((InterfaceC10507b) it.next()).m11338b(i, z);
            }
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: l */
        public void mo16599l(String str) {
            SimpleExoPlayer.this.f11330k.mo16599l(str);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: m */
        public void mo16598m(String str, long j, long j2) {
            SimpleExoPlayer.this.f11330k.mo16598m(str, j, j2);
        }

        @Override // p383v7.InterfaceC13140l
        /* renamed from: n */
        public void mo3124n(List<C13127b> list) {
            SimpleExoPlayer.this.f11312H = list;
            Iterator it = SimpleExoPlayer.this.f11327h.iterator();
            while (it.hasNext()) {
                ((InterfaceC13140l) it.next()).mo3124n(list);
            }
        }

        @Override // com.google.android.exoplayer2.C4392d.InterfaceC4394b
        /* renamed from: o */
        public void mo29544o(float f) {
            SimpleExoPlayer.this.m29814W0();
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
        public void onExperimentalSleepingForOffloadChanged(boolean z) {
            SimpleExoPlayer.this.m29796h1();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onIsLoadingChanged(boolean z) {
            if (SimpleExoPlayer.this.f11317M != null) {
                if (z && !SimpleExoPlayer.this.f11318N) {
                    SimpleExoPlayer.this.f11317M.m16443a(0);
                    SimpleExoPlayer.this.f11318N = true;
                } else if (!z && SimpleExoPlayer.this.f11318N) {
                    SimpleExoPlayer.this.f11317M.m16441c(0);
                    SimpleExoPlayer.this.f11318N = false;
                }
            }
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
        public void onPlayWhenReadyChanged(boolean z, int i) {
            SimpleExoPlayer.this.m29796h1();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C7404o.m20739i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlaybackStateChanged(int i) {
            SimpleExoPlayer.this.m29796h1();
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
        public /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
            C7404o.m20735m(this, z, i);
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

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m29805d1(new Surface(surfaceTexture), true);
            SimpleExoPlayer.this.m29823P0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            SimpleExoPlayer.this.m29805d1(null, true);
            SimpleExoPlayer.this.m29823P0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            SimpleExoPlayer.this.m29823P0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
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

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: p */
        public void mo12463p(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer.this.f11337r = format;
            SimpleExoPlayer.this.f11330k.mo12463p(format, decoderReuseEvaluation);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: q */
        public void mo16597q(long j) {
            SimpleExoPlayer.this.f11330k.mo16597q(j);
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: r */
        public void mo12462r(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f11330k.mo12462r(decoderCounters);
            SimpleExoPlayer.this.f11337r = null;
            SimpleExoPlayer.this.f11306B = null;
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: s */
        public void mo16596s(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f11330k.mo16596s(decoderCounters);
            SimpleExoPlayer.this.f11338s = null;
            SimpleExoPlayer.this.f11307C = null;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            SimpleExoPlayer.this.m29823P0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m29805d1(surfaceHolder.getSurface(), false);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            SimpleExoPlayer.this.m29805d1(null, false);
            SimpleExoPlayer.this.m29823P0(0, 0);
        }

        @Override // com.google.android.exoplayer2.C4392d.InterfaceC4394b
        /* renamed from: t */
        public void mo29543t(int i) {
            boolean mo29522F = SimpleExoPlayer.this.mo29522F();
            SimpleExoPlayer.this.m29798g1(mo29522F, i, SimpleExoPlayer.m29828K0(mo29522F, i));
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: w */
        public void mo12461w(int i, long j) {
            SimpleExoPlayer.this.f11330k.mo12461w(i, j);
        }

        @Override // p193k6.InterfaceC9115q
        /* renamed from: x */
        public void mo16595x(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            SimpleExoPlayer.this.f11338s = format;
            SimpleExoPlayer.this.f11330k.mo16595x(format, decoderReuseEvaluation);
        }

        @Override // p213l8.InterfaceC10062a0
        /* renamed from: y */
        public void mo12460y(DecoderCounters decoderCounters) {
            SimpleExoPlayer.this.f11306B = decoderCounters;
            SimpleExoPlayer.this.f11330k.mo12460y(decoderCounters);
        }
    }

    protected SimpleExoPlayer(C4375b c4375b) {
        AudioAttributes audioAttributes;
        boolean z;
        boolean z2;
        Context applicationContext = c4375b.f11346a.getApplicationContext();
        this.f11322c = applicationContext;
        C4382a c4382a = c4375b.f11353h;
        this.f11330k = c4382a;
        this.f11317M = c4375b.f11355j;
        this.f11309E = c4375b.f11356k;
        this.f11342w = c4375b.f11361p;
        this.f11311G = c4375b.f11360o;
        this.f11336q = c4375b.f11366u;
        SurfaceHolder$CallbackC4376c surfaceHolder$CallbackC4376c = new SurfaceHolder$CallbackC4376c();
        this.f11324e = surfaceHolder$CallbackC4376c;
        this.f11325f = new CopyOnWriteArraySet<>();
        this.f11326g = new CopyOnWriteArraySet<>();
        this.f11327h = new CopyOnWriteArraySet<>();
        this.f11328i = new CopyOnWriteArraySet<>();
        this.f11329j = new CopyOnWriteArraySet<>();
        Handler handler = new Handler(c4375b.f11354i);
        InterfaceC4483u0[] mo20718a = c4375b.f11347b.mo20718a(handler, surfaceHolder$CallbackC4376c, surfaceHolder$CallbackC4376c, surfaceHolder$CallbackC4376c, surfaceHolder$CallbackC4376c);
        this.f11321b = mo20718a;
        this.f11310F = 1.0f;
        if (C9191p0.f24171a < 21) {
            this.f11308D = m29824O0(0);
        } else {
            this.f11308D = C7390b.m20794a(applicationContext);
        }
        this.f11312H = Collections.emptyList();
        this.f11315K = true;
        C4397e0 c4397e0 = new C4397e0(mo20718a, c4375b.f11349d, c4375b.f11350e, c4375b.f11351f, c4375b.f11352g, c4382a, c4375b.f11362q, c4375b.f11363r, c4375b.f11364s, c4375b.f11365t, c4375b.f11367v, c4375b.f11348c, c4375b.f11354i, this);
        this.f11323d = c4397e0;
        c4397e0.mo29514K(surfaceHolder$CallbackC4376c);
        C4386b c4386b = new C4386b(c4375b.f11346a, handler, surfaceHolder$CallbackC4376c);
        this.f11331l = c4386b;
        c4386b.m29565b(c4375b.f11359n);
        C4392d c4392d = new C4392d(c4375b.f11346a, handler, surfaceHolder$CallbackC4376c);
        this.f11332m = c4392d;
        if (c4375b.f11357l) {
            audioAttributes = this.f11309E;
        } else {
            audioAttributes = null;
        }
        c4392d.m29551m(audioAttributes);
        C4562v0 c4562v0 = new C4562v0(c4375b.f11346a, handler, surfaceHolder$CallbackC4376c);
        this.f11333n = c4562v0;
        c4562v0.m28594h(C9191p0.m16252e0(this.f11309E.f11428c));
        C4569x0 c4569x0 = new C4569x0(c4375b.f11346a);
        this.f11334o = c4569x0;
        if (c4375b.f11358m != 0) {
            z = true;
        } else {
            z = false;
        }
        c4569x0.m28587a(z);
        C4571y0 c4571y0 = new C4571y0(c4375b.f11346a);
        this.f11335p = c4571y0;
        if (c4375b.f11358m == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        c4571y0.m28584a(z2);
        this.f11320P = m29831I0(c4562v0);
        m29815V0(1, 102, Integer.valueOf(this.f11308D));
        m29815V0(2, 102, Integer.valueOf(this.f11308D));
        m29815V0(1, 3, this.f11309E);
        m29815V0(2, 4, Integer.valueOf(this.f11342w));
        m29815V0(1, 101, Boolean.valueOf(this.f11311G));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I0 */
    public static C10506a m29831I0(C4562v0 c4562v0) {
        return new C10506a(0, c4562v0.m28598d(), c4562v0.m28599c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public static int m29828K0(boolean z, int i) {
        return (!z || i == 1) ? 1 : 2;
    }

    /* renamed from: O0 */
    private int m29824O0(int i) {
        AudioTrack audioTrack = this.f11339t;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i) {
            this.f11339t.release();
            this.f11339t = null;
        }
        if (this.f11339t == null) {
            this.f11339t = new AudioTrack(3, 4000, 4, 2, 2, 0, i);
        }
        return this.f11339t.getAudioSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0 */
    public void m29823P0(int i, int i2) {
        if (i != this.f11345z || i2 != this.f11305A) {
            this.f11345z = i;
            this.f11305A = i2;
            this.f11330k.m29652T1(i, i2);
            Iterator<InterfaceC10087q> it = this.f11325f.iterator();
            while (it.hasNext()) {
                it.next().mo12308f(i, i2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m29822Q0() {
        this.f11330k.mo16602a(this.f11311G);
        Iterator<InterfaceC9088f> it = this.f11326g.iterator();
        while (it.hasNext()) {
            it.next().m16682a(this.f11311G);
        }
    }

    /* renamed from: U0 */
    private void m29816U0() {
        TextureView textureView = this.f11344y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f11324e) {
                C9197r.m16178h("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f11344y.setSurfaceTextureListener(null);
            }
            this.f11344y = null;
        }
        SurfaceHolder surfaceHolder = this.f11343x;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f11324e);
            this.f11343x = null;
        }
    }

    /* renamed from: V0 */
    private void m29815V0(int i, int i2, Object obj) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11321b) {
            if (interfaceC4483u0.mo20720d() == i) {
                this.f11323d.m29530A0(interfaceC4483u0).m29147n(i2).m29148m(obj).m29149l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public void m29814W0() {
        m29815V0(1, 2, Float.valueOf(this.f11310F * this.f11332m.m29557g()));
    }

    /* renamed from: a1 */
    private void m29809a1(InterfaceC10080l interfaceC10080l) {
        m29815V0(2, 8, interfaceC10080l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public void m29805d1(Surface surface, boolean z) {
        InterfaceC4483u0[] interfaceC4483u0Arr;
        ArrayList<C4446s0> arrayList = new ArrayList();
        for (InterfaceC4483u0 interfaceC4483u0 : this.f11321b) {
            if (interfaceC4483u0.mo20720d() == 2) {
                arrayList.add(this.f11323d.m29530A0(interfaceC4483u0).m29147n(1).m29148m(surface).m29149l());
            }
        }
        Surface surface2 = this.f11340u;
        if (surface2 != null && surface2 != surface) {
            try {
                for (C4446s0 c4446s0 : arrayList) {
                    c4446s0.m29160a(this.f11336q);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                this.f11323d.m29445r1(false, ExoPlaybackException.m29933b(new C7398i(3)));
            }
            if (this.f11341v) {
                this.f11340u.release();
            }
        }
        this.f11340u = surface;
        this.f11341v = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void m29798g1(boolean z, int i, int i2) {
        int i3 = 0;
        boolean z2 = z && i != -1;
        if (z2 && i != 1) {
            i3 = 1;
        }
        this.f11323d.m29452o1(z2, i3, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public void m29796h1() {
        int mo29505P = mo29505P();
        boolean z = true;
        if (mo29505P != 1) {
            if (mo29505P != 2 && mo29505P != 3) {
                if (mo29505P != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean m29829J0 = m29829J0();
                C4569x0 c4569x0 = this.f11334o;
                if (!mo29522F() || m29829J0) {
                    z = false;
                }
                c4569x0.m28586b(z);
                this.f11335p.m28583b(mo29522F());
                return;
            }
        }
        this.f11334o.m28586b(false);
        this.f11335p.m28583b(false);
    }

    /* renamed from: i1 */
    private void m29793i1() {
        IllegalStateException illegalStateException;
        if (Looper.myLooper() != mo29436w()) {
            if (!this.f11315K) {
                if (this.f11316L) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                C9197r.m16177i("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", illegalStateException);
                this.f11316L = true;
                return;
            }
            throw new IllegalStateException("Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: A */
    public TrackSelectionArray mo29531A() {
        m29793i1();
        return this.f11323d.mo29531A();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: B */
    public int mo29529B(int i) {
        m29793i1();
        return this.f11323d.mo29529B(i);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: C */
    public Player.InterfaceC4372b mo29527C() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4372b
    /* renamed from: D */
    public void mo29838D(InterfaceC13140l interfaceC13140l) {
        C9149a.m16448e(interfaceC13140l);
        this.f11327h.add(interfaceC13140l);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: E */
    public void mo29524E(int i, long j) {
        m29793i1();
        this.f11330k.m29658R1();
        this.f11323d.mo29524E(i, j);
    }

    /* renamed from: E0 */
    public void m29836E0(AnalyticsListener analyticsListener) {
        C9149a.m16448e(analyticsListener);
        this.f11330k.m29689H0(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: F */
    public boolean mo29522F() {
        m29793i1();
        return this.f11323d.mo29522F();
    }

    /* renamed from: F0 */
    public void m29835F0(InterfaceC5779e interfaceC5779e) {
        C9149a.m16448e(interfaceC5779e);
        this.f11328i.add(interfaceC5779e);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: G */
    public void mo29520G(boolean z) {
        m29793i1();
        this.f11323d.mo29520G(z);
    }

    /* renamed from: G0 */
    public void m29834G0() {
        m29793i1();
        m29816U0();
        m29805d1(null, false);
        m29823P0(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: H */
    public void mo29833H(InterfaceC10087q interfaceC10087q) {
        C9149a.m16448e(interfaceC10087q);
        this.f11325f.add(interfaceC10087q);
    }

    /* renamed from: H0 */
    public void m29832H0(SurfaceHolder surfaceHolder) {
        m29793i1();
        if (surfaceHolder != null && surfaceHolder == this.f11343x) {
            m29807c1(null);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: I */
    public int mo29517I() {
        m29793i1();
        return this.f11323d.mo29517I();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: J */
    public void mo29830J(TextureView textureView) {
        m29793i1();
        if (textureView != null && textureView == this.f11344y) {
            mo29770z(null);
        }
    }

    /* renamed from: J0 */
    public boolean m29829J0() {
        m29793i1();
        return this.f11323d.m29526C0();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: K */
    public void mo29514K(Player.InterfaceC4371a interfaceC4371a) {
        C9149a.m16448e(interfaceC4371a);
        this.f11323d.mo29514K(interfaceC4371a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: L */
    public int mo29512L() {
        m29793i1();
        return this.f11323d.mo29512L();
    }

    /* renamed from: L0 */
    public int m29827L0() {
        m29793i1();
        return this.f11323d.m29519G0();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: M */
    public long mo29510M() {
        m29793i1();
        return this.f11323d.mo29510M();
    }

    /* renamed from: M0 */
    public Format m29826M0() {
        return this.f11337r;
    }

    /* renamed from: N0 */
    public float m29825N0() {
        return this.f11310F;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: O */
    public long mo29507O() {
        m29793i1();
        return this.f11323d.mo29507O();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: P */
    public int mo29505P() {
        m29793i1();
        return this.f11323d.mo29505P();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: R */
    public void mo29821R(InterfaceC10081m interfaceC10081m) {
        m29793i1();
        if (this.f11313I != interfaceC10081m) {
            return;
        }
        m29815V0(2, 6, null);
    }

    @Deprecated
    /* renamed from: R0 */
    public void m29820R0(InterfaceC10341s interfaceC10341s, boolean z, boolean z2) {
        int i;
        m29793i1();
        List<InterfaceC10341s> singletonList = Collections.singletonList(interfaceC10341s);
        if (z) {
            i = 0;
        } else {
            i = -1;
        }
        m29812Y0(singletonList, i, -9223372036854775807L);
        mo29485c();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: S */
    public void mo29501S(int i) {
        m29793i1();
        this.f11323d.mo29501S(i);
    }

    /* renamed from: S0 */
    public void m29819S0() {
        AudioTrack audioTrack;
        m29793i1();
        if (C9191p0.f24171a < 21 && (audioTrack = this.f11339t) != null) {
            audioTrack.release();
            this.f11339t = null;
        }
        this.f11331l.m29565b(false);
        this.f11333n.m28595g();
        this.f11334o.m28586b(false);
        this.f11335p.m28583b(false);
        this.f11332m.m29555i();
        this.f11323d.m29473g1();
        this.f11330k.m29646V1();
        m29816U0();
        Surface surface = this.f11340u;
        if (surface != null) {
            if (this.f11341v) {
                surface.release();
            }
            this.f11340u = null;
        }
        if (this.f11318N) {
            ((C9150a0) C9149a.m16448e(this.f11317M)).m16441c(0);
            this.f11318N = false;
        }
        this.f11312H = Collections.emptyList();
        this.f11319O = true;
    }

    /* renamed from: T0 */
    public void m29818T0(InterfaceC5779e interfaceC5779e) {
        this.f11328i.remove(interfaceC5779e);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: U */
    public void mo29817U(SurfaceView surfaceView) {
        m29793i1();
        SurfaceHolder surfaceHolder = null;
        if (surfaceView instanceof C10078j) {
            if (surfaceView.getHolder() == this.f11343x) {
                m29809a1(null);
                this.f11343x = null;
                return;
            }
            return;
        }
        if (surfaceView != null) {
            surfaceHolder = surfaceView.getHolder();
        }
        m29832H0(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: V */
    public int mo29497V() {
        m29793i1();
        return this.f11323d.mo29497V();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: W */
    public boolean mo29495W() {
        m29793i1();
        return this.f11323d.mo29495W();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: X */
    public long mo29493X() {
        m29793i1();
        return this.f11323d.mo29493X();
    }

    /* renamed from: X0 */
    public void m29813X0(InterfaceC10341s interfaceC10341s) {
        m29793i1();
        this.f11330k.m29643W1();
        this.f11323d.m29467j1(interfaceC10341s);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Y */
    public long mo29491Y() {
        m29793i1();
        return this.f11323d.mo29491Y();
    }

    /* renamed from: Y0 */
    public void m29812Y0(List<InterfaceC10341s> list, int i, long j) {
        m29793i1();
        this.f11330k.m29643W1();
        this.f11323d.m29461l1(list, i, j);
    }

    /* renamed from: Z0 */
    public void m29811Z0(PlaybackParameters playbackParameters) {
        m29793i1();
        this.f11323d.m29450p1(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: a */
    public void mo29810a(Surface surface) {
        m29793i1();
        m29816U0();
        if (surface != null) {
            m29809a1(null);
        }
        int i = 0;
        m29805d1(surface, false);
        if (surface != null) {
            i = -1;
        }
        m29823P0(i, i);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: b */
    public PlaybackParameters mo29487b() {
        m29793i1();
        return this.f11323d.mo29487b();
    }

    /* renamed from: b1 */
    public void m29808b1(int i) {
        m29793i1();
        this.f11342w = i;
        m29815V0(2, 4, Integer.valueOf(i));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: c */
    public void mo29485c() {
        m29793i1();
        boolean mo29522F = mo29522F();
        int m29548p = this.f11332m.m29548p(mo29522F, 2);
        m29798g1(mo29522F, m29548p, m29828K0(mo29522F, m29548p));
        this.f11323d.mo29485c();
    }

    /* renamed from: c1 */
    public void m29807c1(SurfaceHolder surfaceHolder) {
        m29793i1();
        m29816U0();
        if (surfaceHolder != null) {
            m29809a1(null);
        }
        this.f11343x = surfaceHolder;
        if (surfaceHolder == null) {
            m29805d1(null, false);
            m29823P0(0, 0);
            return;
        }
        surfaceHolder.addCallback(this.f11324e);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            m29805d1(surface, false);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            m29823P0(surfaceFrame.width(), surfaceFrame.height());
            return;
        }
        m29805d1(null, false);
        m29823P0(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: d */
    public boolean mo29483d() {
        m29793i1();
        return this.f11323d.mo29483d();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: e */
    public long mo29480e() {
        m29793i1();
        return this.f11323d.mo29480e();
    }

    /* renamed from: e1 */
    public void m29803e1(float f) {
        m29793i1();
        float m16229q = C9191p0.m16229q(f, 0.0f, 1.0f);
        if (this.f11310F == m16229q) {
            return;
        }
        this.f11310F = m16229q;
        m29814W0();
        this.f11330k.m29649U1(m16229q);
        Iterator<InterfaceC9088f> it = this.f11326g.iterator();
        while (it.hasNext()) {
            it.next().m16681b(m16229q);
        }
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: f */
    public void mo29802f(Surface surface) {
        m29793i1();
        if (surface != null && surface == this.f11340u) {
            m29834G0();
        }
    }

    /* renamed from: f1 */
    public void m29800f1(boolean z) {
        m29793i1();
        this.f11332m.m29548p(mo29522F(), 1);
        this.f11323d.m29448q1(z);
        this.f11312H = Collections.emptyList();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: g */
    public List<Metadata> mo29475g() {
        m29793i1();
        return this.f11323d.mo29475g();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        m29793i1();
        return this.f11323d.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: i */
    public void mo29795i(InterfaceC10087q interfaceC10087q) {
        this.f11325f.remove(interfaceC10087q);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: j */
    public void mo29792j(SurfaceView surfaceView) {
        SurfaceHolder holder;
        m29793i1();
        if (surfaceView instanceof C10078j) {
            InterfaceC10080l videoDecoderOutputBufferRenderer = ((C10078j) surfaceView).getVideoDecoderOutputBufferRenderer();
            m29834G0();
            this.f11343x = surfaceView.getHolder();
            m29809a1(videoDecoderOutputBufferRenderer);
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        m29807c1(holder);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: k */
    public void mo29466k(Player.InterfaceC4371a interfaceC4371a) {
        this.f11323d.mo29466k(interfaceC4371a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: l */
    public int mo29463l() {
        m29793i1();
        return this.f11323d.mo29463l();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: m */
    public ExoPlaybackException mo29460m() {
        m29793i1();
        return this.f11323d.mo29460m();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: n */
    public void mo29457n(boolean z) {
        m29793i1();
        int m29548p = this.f11332m.m29548p(z, mo29505P());
        m29798g1(z, m29548p, m29828K0(z, m29548p));
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: o */
    public Player.InterfaceC4373c mo29454o() {
        return this;
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: p */
    public void mo29785p(InterfaceC10081m interfaceC10081m) {
        m29793i1();
        this.f11313I = interfaceC10081m;
        m29815V0(2, 6, interfaceC10081m);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4372b
    /* renamed from: q */
    public List<C13127b> mo29783q() {
        m29793i1();
        return this.f11312H;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: r */
    public int mo29447r() {
        m29793i1();
        return this.f11323d.mo29447r();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: s */
    public void mo29780s(InterfaceC10356a interfaceC10356a) {
        m29793i1();
        this.f11314J = interfaceC10356a;
        m29815V0(6, 7, interfaceC10356a);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: t */
    public int mo29442t() {
        m29793i1();
        return this.f11323d.mo29442t();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: u */
    public TrackGroupArray mo29440u() {
        m29793i1();
        return this.f11323d.mo29440u();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: v */
    public Timeline mo29438v() {
        m29793i1();
        return this.f11323d.mo29438v();
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: w */
    public Looper mo29436w() {
        return this.f11323d.mo29436w();
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4372b
    /* renamed from: x */
    public void mo29774x(InterfaceC13140l interfaceC13140l) {
        this.f11327h.remove(interfaceC13140l);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: y */
    public void mo29772y(InterfaceC10356a interfaceC10356a) {
        m29793i1();
        if (this.f11314J != interfaceC10356a) {
            return;
        }
        m29815V0(6, 7, null);
    }

    @Override // com.google.android.exoplayer2.Player.InterfaceC4373c
    /* renamed from: z */
    public void mo29770z(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        m29793i1();
        m29816U0();
        if (textureView != null) {
            m29809a1(null);
        }
        this.f11344y = textureView;
        if (textureView == null) {
            m29805d1(null, true);
            m29823P0(0, 0);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            C9197r.m16178h("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f11324e);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            m29805d1(null, true);
            m29823P0(0, 0);
            return;
        }
        m29805d1(new Surface(surfaceTexture), true);
        m29823P0(textureView.getWidth(), textureView.getHeight());
    }
}
