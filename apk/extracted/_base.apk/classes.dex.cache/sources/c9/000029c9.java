package com.google.android.exoplayer2.p049ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0946a;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.p049ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p117g7.C6561a;
import p118g8.C6570f;
import p118g8.C6571g;
import p118g8.C6572h;
import p118g8.C6574j;
import p118g8.C6575k;
import p118g8.C6576l;
import p132h8.C7036h;
import p132h8.InterfaceC7033e;
import p151i6.C7404o;
import p151i6.InterfaceC7391c;
import p151i6.InterfaceC7403n;
import p152i7.C7412a;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.InterfaceC9178j;
import p213l8.C10078j;
import p213l8.C10086p;
import p213l8.InterfaceC10087q;
import p244n7.C10510b;
import p244n7.C10512d;
import p244n7.InterfaceC10511c;
import p383v7.C13127b;
import p383v7.InterfaceC13140l;

/* renamed from: com.google.android.exoplayer2.ui.PlayerView */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PlayerView extends FrameLayout implements InterfaceC10511c {

    /* renamed from: A */
    private boolean f12105A;

    /* renamed from: B */
    private boolean f12106B;

    /* renamed from: C */
    private CharSequence f12107C;

    /* renamed from: D */
    private int f12108D;

    /* renamed from: E */
    private boolean f12109E;

    /* renamed from: F */
    private boolean f12110F;

    /* renamed from: G */
    private boolean f12111G;

    /* renamed from: H */
    private int f12112H;

    /* renamed from: I */
    private boolean f12113I;

    /* renamed from: j */
    private final View$OnLayoutChangeListenerC4492a f12114j;

    /* renamed from: k */
    private final AspectRatioFrameLayout f12115k;

    /* renamed from: l */
    private final View f12116l;

    /* renamed from: m */
    private final View f12117m;

    /* renamed from: n */
    private final ImageView f12118n;

    /* renamed from: o */
    private final SubtitleView f12119o;

    /* renamed from: p */
    private final View f12120p;

    /* renamed from: q */
    private final TextView f12121q;

    /* renamed from: r */
    private final PlayerControlView f12122r;

    /* renamed from: s */
    private final FrameLayout f12123s;

    /* renamed from: t */
    private final FrameLayout f12124t;

    /* renamed from: u */
    private Player f12125u;

    /* renamed from: v */
    private boolean f12126v;

    /* renamed from: w */
    private PlayerControlView.InterfaceC4491d f12127w;

    /* renamed from: x */
    private boolean f12128x;

    /* renamed from: y */
    private Drawable f12129y;

    /* renamed from: z */
    private int f12130z;

    /* renamed from: com.google.android.exoplayer2.ui.PlayerView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class View$OnLayoutChangeListenerC4492a implements Player.InterfaceC4371a, InterfaceC13140l, InterfaceC10087q, View.OnLayoutChangeListener, InterfaceC7033e, PlayerControlView.InterfaceC4491d {

        /* renamed from: j */
        private final Timeline.C4378b f12131j = new Timeline.C4378b();

        /* renamed from: k */
        private Object f12132k;

        public View$OnLayoutChangeListenerC4492a() {
            PlayerView.this = r1;
        }

        @Override // com.google.android.exoplayer2.p049ui.PlayerControlView.InterfaceC4491d
        /* renamed from: a */
        public void mo28843a(int i) {
            PlayerView.this.m28875J();
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: d */
        public void mo12310d(int i, int i2, int i3, float f) {
            float f2;
            if (i2 != 0 && i != 0) {
                f2 = (i * f) / i2;
            } else {
                f2 = 1.0f;
            }
            if (PlayerView.this.f12117m instanceof TextureView) {
                if (i3 == 90 || i3 == 270) {
                    f2 = 1.0f / f2;
                }
                if (PlayerView.this.f12112H != 0) {
                    PlayerView.this.f12117m.removeOnLayoutChangeListener(this);
                }
                PlayerView.this.f12112H = i3;
                if (PlayerView.this.f12112H != 0) {
                    PlayerView.this.f12117m.addOnLayoutChangeListener(this);
                }
                PlayerView.m28853q((TextureView) PlayerView.this.f12117m, PlayerView.this.f12112H);
            }
            PlayerView playerView = PlayerView.this;
            playerView.m28884A(f2, playerView.f12115k, PlayerView.this.f12117m);
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: e */
        public void mo12309e() {
            if (PlayerView.this.f12116l != null) {
                PlayerView.this.f12116l.setVisibility(4);
            }
        }

        @Override // p213l8.InterfaceC10087q
        /* renamed from: f */
        public /* synthetic */ void mo12308f(int i, int i2) {
            C10086p.m12311a(this, i, i2);
        }

        @Override // p383v7.InterfaceC13140l
        /* renamed from: n */
        public void mo3124n(List<C13127b> list) {
            if (PlayerView.this.f12119o != null) {
                PlayerView.this.f12119o.mo3124n(list);
            }
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

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            PlayerView.m28853q((TextureView) view, PlayerView.this.f12112H);
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
            PlayerView.this.m28876I();
            PlayerView.this.m28874K();
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            C7404o.m20739i(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onPlaybackStateChanged(int i) {
            PlayerView.this.m28876I();
            PlayerView.this.m28873L();
            PlayerView.this.m28874K();
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
        public void onPositionDiscontinuity(int i) {
            if (PlayerView.this.m28845y() && PlayerView.this.f12110F) {
                PlayerView.this.m28847w();
            }
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

        @Override // p132h8.InterfaceC7033e
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.m28877H();
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
        public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
            Player player = (Player) C9149a.m16448e(PlayerView.this.f12125u);
            Timeline mo29438v = player.mo29438v();
            if (mo29438v.m29737q()) {
                this.f12132k = null;
            } else if (!player.mo29440u().m29142d()) {
                this.f12132k = mo29438v.mo11757g(player.mo29517I(), this.f12131j, true).f11372b;
            } else {
                Object obj = this.f12132k;
                if (obj != null) {
                    int mo11758b = mo29438v.mo11758b(obj);
                    if (mo11758b != -1) {
                        if (player.mo29463l() == mo29438v.m29741f(mo11758b, this.f12131j).f11373c) {
                            return;
                        }
                    }
                    this.f12132k = null;
                }
            }
            PlayerView.this.m28872M(false);
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: B */
    private boolean m28883B(Metadata metadata) {
        byte[] bArr;
        int i;
        boolean z = false;
        int i2 = -1;
        for (int i3 = 0; i3 < metadata.m29247e(); i3++) {
            Metadata.InterfaceC4429b m29248d = metadata.m29248d(i3);
            if (m29248d instanceof C7412a) {
                C7412a c7412a = (C7412a) m29248d;
                bArr = c7412a.f19936n;
                i = c7412a.f19935m;
            } else if (m29248d instanceof C6561a) {
                C6561a c6561a = (C6561a) m29248d;
                bArr = c6561a.f18601q;
                i = c6561a.f18594j;
            } else {
                continue;
            }
            if (i2 == -1 || i == 3) {
                z = m28882C(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i == 3) {
                    break;
                }
                i2 = i;
            }
        }
        return z;
    }

    @RequiresNonNull({"artworkView"})
    /* renamed from: C */
    private boolean m28882C(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                m28884A(intrinsicWidth / intrinsicHeight, this.f12115k, this.f12118n);
                this.f12118n.setImageDrawable(drawable);
                this.f12118n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    private static void m28881D(AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* renamed from: E */
    private boolean m28880E() {
        Player player = this.f12125u;
        if (player == null) {
            return true;
        }
        int mo29505P = player.mo29505P();
        if (this.f12109E && (mo29505P == 1 || mo29505P == 4 || !this.f12125u.mo29522F())) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    private void m28878G(boolean z) {
        int i;
        if (!m28870O()) {
            return;
        }
        PlayerControlView playerControlView = this.f12122r;
        if (z) {
            i = 0;
        } else {
            i = this.f12108D;
        }
        playerControlView.setShowTimeoutMs(i);
        this.f12122r.m28919P();
    }

    /* renamed from: H */
    public boolean m28877H() {
        if (m28870O() && this.f12125u != null) {
            if (!this.f12122r.m28925J()) {
                m28844z(true);
            } else if (this.f12111G) {
                this.f12122r.m28928G();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x001d, code lost:
        if (r4.f12125u.mo29522F() == false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0026  */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m28876I() {
        /*
            r4 = this;
            android.view.View r0 = r4.f12120p
            if (r0 == 0) goto L2b
            com.google.android.exoplayer2.Player r0 = r4.f12125u
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.mo29505P()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f12130z
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.google.android.exoplayer2.Player r0 = r4.f12125u
            boolean r0 = r0.mo29522F()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f12120p
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.PlayerView.m28876I():void");
    }

    /* renamed from: J */
    public void m28875J() {
        PlayerControlView playerControlView = this.f12122r;
        String str = null;
        if (playerControlView != null && this.f12126v) {
            if (playerControlView.getVisibility() == 0) {
                if (this.f12111G) {
                    str = getResources().getString(C6575k.f18644a);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(C6575k.f18648e));
            return;
        }
        setContentDescription(null);
    }

    /* renamed from: K */
    public void m28874K() {
        if (m28845y() && this.f12110F) {
            m28847w();
        } else {
            m28844z(false);
        }
    }

    /* renamed from: L */
    public void m28873L() {
        TextView textView = this.f12121q;
        if (textView != null) {
            CharSequence charSequence = this.f12107C;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f12121q.setVisibility(0);
                return;
            }
            Player player = this.f12125u;
            if (player != null) {
                player.mo29460m();
            }
            this.f12121q.setVisibility(8);
        }
    }

    /* renamed from: M */
    public void m28872M(boolean z) {
        Player player = this.f12125u;
        if (player != null && !player.mo29440u().m29142d()) {
            if (z && !this.f12105A) {
                m28852r();
            }
            TrackSelectionArray mo29531A = player.mo29531A();
            for (int i = 0; i < mo29531A.f11998a; i++) {
                if (player.mo29529B(i) == 2 && mo29531A.m28969a(i) != null) {
                    m28848v();
                    return;
                }
            }
            m28852r();
            if (m28871N()) {
                for (Metadata metadata : player.mo29475g()) {
                    if (m28883B(metadata)) {
                        return;
                    }
                }
                if (m28882C(this.f12129y)) {
                    return;
                }
            }
            m28848v();
        } else if (!this.f12105A) {
            m28848v();
            m28852r();
        }
    }

    @EnsuresNonNullIf(expression = {"artworkView"}, result = true)
    /* renamed from: N */
    private boolean m28871N() {
        if (this.f12128x) {
            C9149a.m16445h(this.f12118n);
            return true;
        }
        return false;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = true)
    /* renamed from: O */
    private boolean m28870O() {
        if (this.f12126v) {
            C9149a.m16445h(this.f12122r);
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public static void m28853q(TextureView textureView, int i) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* renamed from: r */
    private void m28852r() {
        View view = this.f12116l;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: s */
    private static void m28851s(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C6571g.f18615f));
        imageView.setBackgroundColor(resources.getColor(C6570f.f18609a));
    }

    /* renamed from: t */
    private static void m28850t(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(C6571g.f18615f, null));
        imageView.setBackgroundColor(resources.getColor(C6570f.f18609a, null));
    }

    /* renamed from: v */
    private void m28848v() {
        ImageView imageView = this.f12118n;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f12118n.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: x */
    private boolean m28846x(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    /* renamed from: y */
    public boolean m28845y() {
        Player player = this.f12125u;
        return player != null && player.mo29483d() && this.f12125u.mo29522F();
    }

    /* renamed from: z */
    private void m28844z(boolean z) {
        boolean z2;
        if ((!m28845y() || !this.f12110F) && m28870O()) {
            if (this.f12122r.m28925J() && this.f12122r.getShowTimeoutMs() <= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean m28880E = m28880E();
            if (z || z2 || m28880E) {
                m28878G(m28880E);
            }
        }
    }

    /* renamed from: A */
    protected void m28884A(float f, AspectRatioFrameLayout aspectRatioFrameLayout, View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof C7036h) {
                f = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* renamed from: F */
    public void m28879F() {
        m28878G(m28880E());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.f12125u;
        if (player != null && player.mo29483d()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean m28846x = m28846x(keyEvent.getKeyCode());
        if (m28846x && m28870O() && !this.f12122r.m28925J()) {
            m28844z(true);
            return true;
        } else if (!m28849u(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            if (m28846x && m28870O()) {
                m28844z(true);
            }
            return false;
        } else {
            m28844z(true);
            return true;
        }
    }

    public List<C10512d> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f12124t;
        if (frameLayout != null) {
            arrayList.add(new C10512d(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f12122r;
        if (playerControlView != null) {
            arrayList.add(new C10512d(playerControlView, 0));
        }
        return AbstractC6693s.m22134u(arrayList);
    }

    @Deprecated
    public /* bridge */ /* synthetic */ View[] getAdOverlayViews() {
        return C10510b.m11331a(this);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C9149a.m16444i(this.f12123s, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f12109E;
    }

    public boolean getControllerHideOnTouch() {
        return this.f12111G;
    }

    public int getControllerShowTimeoutMs() {
        return this.f12108D;
    }

    public Drawable getDefaultArtwork() {
        return this.f12129y;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f12124t;
    }

    public Player getPlayer() {
        return this.f12125u;
    }

    public int getResizeMode() {
        C9149a.m16445h(this.f12115k);
        return this.f12115k.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f12119o;
    }

    public boolean getUseArtwork() {
        return this.f12128x;
    }

    public boolean getUseController() {
        return this.f12126v;
    }

    public View getVideoSurfaceView() {
        return this.f12117m;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m28870O() || this.f12125u == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.f12113I) {
                return false;
            }
            this.f12113I = false;
            performClick();
            return true;
        }
        this.f12113I = true;
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m28870O() && this.f12125u != null) {
            m28844z(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return m28877H();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.InterfaceC4486b interfaceC4486b) {
        C9149a.m16445h(this.f12115k);
        this.f12115k.setAspectRatioListener(interfaceC4486b);
    }

    public void setControlDispatcher(InterfaceC7391c interfaceC7391c) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setControlDispatcher(interfaceC7391c);
    }

    public void setControllerAutoShow(boolean z) {
        this.f12109E = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.f12110F = z;
    }

    public void setControllerHideOnTouch(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12111G = z;
        m28875J();
    }

    public void setControllerShowTimeoutMs(int i) {
        C9149a.m16445h(this.f12122r);
        this.f12108D = i;
        if (this.f12122r.m28925J()) {
            m28879F();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.InterfaceC4491d interfaceC4491d) {
        C9149a.m16445h(this.f12122r);
        PlayerControlView.InterfaceC4491d interfaceC4491d2 = this.f12127w;
        if (interfaceC4491d2 == interfaceC4491d) {
            return;
        }
        if (interfaceC4491d2 != null) {
            this.f12122r.m28924K(interfaceC4491d2);
        }
        this.f12127w = interfaceC4491d;
        if (interfaceC4491d != null) {
            this.f12122r.m28885z(interfaceC4491d);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z;
        if (this.f12121q != null) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        this.f12107C = charSequence;
        m28873L();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f12129y != drawable) {
            this.f12129y = drawable;
            m28872M(false);
        }
    }

    public void setErrorMessageProvider(InterfaceC9178j<? super ExoPlaybackException> interfaceC9178j) {
        if (interfaceC9178j != null) {
            m28873L();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setFastForwardIncrementMs(i);
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.f12105A != z) {
            this.f12105A = z;
            m28872M(false);
        }
    }

    @Deprecated
    public void setPlaybackPreparer(InterfaceC7403n interfaceC7403n) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setPlaybackPreparer(interfaceC7403n);
    }

    public void setPlayer(Player player) {
        boolean z;
        boolean z2;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (player != null && player.mo29436w() != Looper.getMainLooper()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9149a.m16452a(z2);
        Player player2 = this.f12125u;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo29466k(this.f12114j);
            Player.InterfaceC4373c mo29454o = player2.mo29454o();
            if (mo29454o != null) {
                mo29454o.mo29795i(this.f12114j);
                View view = this.f12117m;
                if (view instanceof TextureView) {
                    mo29454o.mo29830J((TextureView) view);
                } else if (view instanceof C7036h) {
                    ((C7036h) view).setVideoComponent(null);
                } else if (view instanceof SurfaceView) {
                    mo29454o.mo29817U((SurfaceView) view);
                }
            }
            Player.InterfaceC4372b mo29527C = player2.mo29527C();
            if (mo29527C != null) {
                mo29527C.mo29774x(this.f12114j);
            }
        }
        SubtitleView subtitleView = this.f12119o;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f12125u = player;
        if (m28870O()) {
            this.f12122r.setPlayer(player);
        }
        m28876I();
        m28873L();
        m28872M(true);
        if (player != null) {
            Player.InterfaceC4373c mo29454o2 = player.mo29454o();
            if (mo29454o2 != null) {
                View view2 = this.f12117m;
                if (view2 instanceof TextureView) {
                    mo29454o2.mo29770z((TextureView) view2);
                } else if (view2 instanceof C7036h) {
                    ((C7036h) view2).setVideoComponent(mo29454o2);
                } else if (view2 instanceof SurfaceView) {
                    mo29454o2.mo29792j((SurfaceView) view2);
                }
                mo29454o2.mo29833H(this.f12114j);
            }
            Player.InterfaceC4372b mo29527C2 = player.mo29527C();
            if (mo29527C2 != null) {
                mo29527C2.mo29838D(this.f12114j);
                SubtitleView subtitleView2 = this.f12119o;
                if (subtitleView2 != null) {
                    subtitleView2.setCues(mo29527C2.mo29783q());
                }
            }
            player.mo29514K(this.f12114j);
            m28844z(false);
            return;
        }
        m28847w();
    }

    public void setRepeatToggleModes(int i) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setRepeatToggleModes(i);
    }

    public void setResizeMode(int i) {
        C9149a.m16445h(this.f12115k);
        this.f12115k.setResizeMode(i);
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setRewindIncrementMs(i);
    }

    public void setShowBuffering(int i) {
        if (this.f12130z != i) {
            this.f12130z = i;
            m28876I();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowFastForwardButton(z);
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowMultiWindowTimeBar(z);
    }

    public void setShowNextButton(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowNextButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowPreviousButton(z);
    }

    public void setShowRewindButton(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowRewindButton(z);
    }

    public void setShowShuffleButton(boolean z) {
        C9149a.m16445h(this.f12122r);
        this.f12122r.setShowShuffleButton(z);
    }

    public void setShutterBackgroundColor(int i) {
        View view = this.f12116l;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setUseArtwork(boolean z) {
        boolean z2;
        if (z && this.f12118n == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9149a.m16447f(z2);
        if (this.f12128x != z) {
            this.f12128x = z;
            m28872M(false);
        }
    }

    public void setUseController(boolean z) {
        boolean z2;
        if (z && this.f12122r == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        C9149a.m16447f(z2);
        if (this.f12126v == z) {
            return;
        }
        this.f12126v = z;
        if (m28870O()) {
            this.f12122r.setPlayer(this.f12125u);
        } else {
            PlayerControlView playerControlView = this.f12122r;
            if (playerControlView != null) {
                playerControlView.m28928G();
                this.f12122r.setPlayer(null);
            }
        }
        m28875J();
    }

    public void setUseSensorRotation(boolean z) {
        if (this.f12106B != z) {
            this.f12106B = z;
            View view = this.f12117m;
            if (view instanceof C7036h) {
                ((C7036h) view).setUseSensorRotation(z);
            }
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f12117m;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    /* renamed from: u */
    public boolean m28849u(KeyEvent keyEvent) {
        return m28870O() && this.f12122r.m28933B(keyEvent);
    }

    /* renamed from: w */
    public void m28847w() {
        PlayerControlView playerControlView = this.f12122r;
        if (playerControlView != null) {
            playerControlView.m28928G();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        boolean z4;
        boolean z5;
        int i7;
        boolean z6;
        int i8;
        View$OnLayoutChangeListenerC4492a view$OnLayoutChangeListenerC4492a = new View$OnLayoutChangeListenerC4492a();
        this.f12114j = view$OnLayoutChangeListenerC4492a;
        if (isInEditMode()) {
            this.f12115k = null;
            this.f12116l = null;
            this.f12117m = null;
            this.f12118n = null;
            this.f12119o = null;
            this.f12120p = null;
            this.f12121q = null;
            this.f12122r = null;
            this.f12123s = null;
            this.f12124t = null;
            ImageView imageView = new ImageView(context);
            if (C9191p0.f24171a >= 23) {
                m28850t(getResources(), imageView);
            } else {
                m28851s(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i9 = C6574j.f18643c;
        this.f12106B = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6576l.f18674I, 0, 0);
            try {
                int i10 = C6576l.f18684S;
                boolean hasValue = obtainStyledAttributes.hasValue(i10);
                int color = obtainStyledAttributes.getColor(i10, 0);
                int resourceId = obtainStyledAttributes.getResourceId(C6576l.f18680O, i9);
                boolean z7 = obtainStyledAttributes.getBoolean(C6576l.f18686U, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(C6576l.f18676K, 0);
                boolean z8 = obtainStyledAttributes.getBoolean(C6576l.f18687V, true);
                int i11 = obtainStyledAttributes.getInt(C6576l.f18685T, 1);
                int i12 = obtainStyledAttributes.getInt(C6576l.f18681P, 0);
                int i13 = obtainStyledAttributes.getInt(C6576l.f18683R, 5000);
                boolean z9 = obtainStyledAttributes.getBoolean(C6576l.f18678M, true);
                boolean z10 = obtainStyledAttributes.getBoolean(C6576l.f18675J, true);
                i3 = obtainStyledAttributes.getInteger(C6576l.f18682Q, 0);
                this.f12105A = obtainStyledAttributes.getBoolean(C6576l.f18679N, this.f12105A);
                boolean z11 = obtainStyledAttributes.getBoolean(C6576l.f18677L, true);
                this.f12106B = obtainStyledAttributes.getBoolean(C6576l.f18688W, this.f12106B);
                obtainStyledAttributes.recycle();
                z3 = z9;
                i9 = resourceId;
                z = z10;
                z2 = z11;
                i2 = i13;
                z6 = z8;
                i4 = i12;
                i7 = resourceId2;
                z5 = z7;
                z4 = hasValue;
                i6 = color;
                i5 = i11;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i2 = 5000;
            z = true;
            i3 = 0;
            z2 = true;
            i4 = 0;
            z3 = true;
            i5 = 1;
            i6 = 0;
            z4 = false;
            z5 = true;
            i7 = 0;
            z6 = true;
        }
        LayoutInflater.from(context).inflate(i9, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(C6572h.f18619d);
        this.f12115k = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            m28881D(aspectRatioFrameLayout, i4);
        }
        View findViewById = findViewById(C6572h.f18636u);
        this.f12116l = findViewById;
        if (findViewById != null && z4) {
            findViewById.setBackgroundColor(i6);
        }
        if (aspectRatioFrameLayout != null && i5 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i5 == 2) {
                this.f12117m = new TextureView(context);
            } else if (i5 == 3) {
                C7036h c7036h = new C7036h(context);
                c7036h.setSingleTapListener(view$OnLayoutChangeListenerC4492a);
                c7036h.setUseSensorRotation(this.f12106B);
                this.f12117m = c7036h;
            } else if (i5 != 4) {
                this.f12117m = new SurfaceView(context);
            } else {
                this.f12117m = new C10078j(context);
            }
            this.f12117m.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.f12117m, 0);
        } else {
            this.f12117m = null;
        }
        this.f12123s = (FrameLayout) findViewById(C6572h.f18616a);
        this.f12124t = (FrameLayout) findViewById(C6572h.f18626k);
        ImageView imageView2 = (ImageView) findViewById(C6572h.f18617b);
        this.f12118n = imageView2;
        this.f12128x = z5 && imageView2 != null;
        if (i7 != 0) {
            this.f12129y = C0946a.m38399e(getContext(), i7);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(C6572h.f18637v);
        this.f12119o = subtitleView;
        if (subtitleView != null) {
            subtitleView.m28839d();
            subtitleView.m28838e();
        }
        View findViewById2 = findViewById(C6572h.f18618c);
        this.f12120p = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f12130z = i3;
        TextView textView = (TextView) findViewById(C6572h.f18623h);
        this.f12121q = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i14 = C6572h.f18620e;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i14);
        View findViewById3 = findViewById(C6572h.f18621f);
        if (playerControlView != null) {
            this.f12122r = playerControlView;
            i8 = 0;
        } else if (findViewById3 != null) {
            i8 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f12122r = playerControlView2;
            playerControlView2.setId(i14);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            i8 = 0;
            this.f12122r = null;
        }
        PlayerControlView playerControlView3 = this.f12122r;
        this.f12108D = playerControlView3 != null ? i2 : i8;
        this.f12111G = z3;
        this.f12109E = z;
        this.f12110F = z2;
        this.f12126v = (!z6 || playerControlView3 == null) ? i8 : 1;
        m28847w();
        m28875J();
        PlayerControlView playerControlView4 = this.f12122r;
        if (playerControlView4 != null) {
            playerControlView4.m28885z(view$OnLayoutChangeListenerC4492a);
        }
    }
}