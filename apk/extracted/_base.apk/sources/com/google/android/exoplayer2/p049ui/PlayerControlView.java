package com.google.android.exoplayer2.p049ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.android.exoplayer2.C4401g;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.p049ui.InterfaceC4508h;
import com.google.android.exoplayer2.p049ui.PlayerControlView;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p118g8.C6571g;
import p118g8.C6572h;
import p118g8.C6573i;
import p118g8.C6574j;
import p118g8.C6575k;
import p118g8.C6576l;
import p151i6.C7390b;
import p151i6.C7397h;
import p151i6.C7404o;
import p151i6.InterfaceC7391c;
import p151i6.InterfaceC7403n;
import p195k8.C9149a;
import p195k8.C9154b0;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.ui.PlayerControlView */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: A */
    private final Timeline.C4379c f12052A;

    /* renamed from: B */
    private final Runnable f12053B;

    /* renamed from: C */
    private final Runnable f12054C;

    /* renamed from: D */
    private final Drawable f12055D;

    /* renamed from: E */
    private final Drawable f12056E;

    /* renamed from: F */
    private final Drawable f12057F;

    /* renamed from: G */
    private final String f12058G;

    /* renamed from: H */
    private final String f12059H;

    /* renamed from: I */
    private final String f12060I;

    /* renamed from: J */
    private final Drawable f12061J;

    /* renamed from: K */
    private final Drawable f12062K;

    /* renamed from: L */
    private final float f12063L;

    /* renamed from: M */
    private final float f12064M;

    /* renamed from: N */
    private final String f12065N;

    /* renamed from: O */
    private final String f12066O;

    /* renamed from: P */
    private Player f12067P;

    /* renamed from: Q */
    private InterfaceC7391c f12068Q;

    /* renamed from: R */
    private boolean f12069R;

    /* renamed from: S */
    private boolean f12070S;

    /* renamed from: T */
    private boolean f12071T;

    /* renamed from: U */
    private boolean f12072U;

    /* renamed from: V */
    private int f12073V;

    /* renamed from: W */
    private int f12074W;

    /* renamed from: a0 */
    private int f12075a0;

    /* renamed from: b0 */
    private boolean f12076b0;

    /* renamed from: c0 */
    private boolean f12077c0;

    /* renamed from: d0 */
    private boolean f12078d0;

    /* renamed from: e0 */
    private boolean f12079e0;

    /* renamed from: f0 */
    private boolean f12080f0;

    /* renamed from: g0 */
    private long f12081g0;

    /* renamed from: h0 */
    private long[] f12082h0;

    /* renamed from: i0 */
    private boolean[] f12083i0;

    /* renamed from: j */
    private final View$OnClickListenerC4489b f12084j;

    /* renamed from: j0 */
    private long[] f12085j0;

    /* renamed from: k */
    private final CopyOnWriteArrayList<InterfaceC4491d> f12086k;

    /* renamed from: k0 */
    private boolean[] f12087k0;

    /* renamed from: l */
    private final View f12088l;

    /* renamed from: l0 */
    private long f12089l0;

    /* renamed from: m */
    private final View f12090m;

    /* renamed from: n */
    private final View f12091n;

    /* renamed from: o */
    private final View f12092o;

    /* renamed from: p */
    private final View f12093p;

    /* renamed from: q */
    private final View f12094q;

    /* renamed from: r */
    private final ImageView f12095r;

    /* renamed from: s */
    private final ImageView f12096s;

    /* renamed from: t */
    private final View f12097t;

    /* renamed from: u */
    private final TextView f12098u;

    /* renamed from: v */
    private final TextView f12099v;

    /* renamed from: w */
    private final InterfaceC4508h f12100w;

    /* renamed from: x */
    private final StringBuilder f12101x;

    /* renamed from: y */
    private final Formatter f12102y;

    /* renamed from: z */
    private final Timeline.C4378b f12103z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class View$OnClickListenerC4489b implements Player.InterfaceC4371a, InterfaceC4508h.InterfaceC4509a, View.OnClickListener {
        private View$OnClickListenerC4489b() {
        }

        @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h.InterfaceC4509a
        /* renamed from: a */
        public void mo28796a(InterfaceC4508h interfaceC4508h, long j) {
            if (PlayerControlView.this.f12099v != null) {
                PlayerControlView.this.f12099v.setText(C9191p0.m16250f0(PlayerControlView.this.f12101x, PlayerControlView.this.f12102y, j));
            }
        }

        @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h.InterfaceC4509a
        /* renamed from: b */
        public void mo28795b(InterfaceC4508h interfaceC4508h, long j, boolean z) {
            PlayerControlView.this.f12072U = false;
            if (!z && PlayerControlView.this.f12067P != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.m28921N(playerControlView.f12067P, j);
            }
        }

        @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h.InterfaceC4509a
        /* renamed from: c */
        public void mo28794c(InterfaceC4508h interfaceC4508h, long j) {
            PlayerControlView.this.f12072U = true;
            if (PlayerControlView.this.f12099v != null) {
                PlayerControlView.this.f12099v.setText(C9191p0.m16250f0(PlayerControlView.this.f12101x, PlayerControlView.this.f12102y, j));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = PlayerControlView.this.f12067P;
            if (player == null) {
                return;
            }
            if (PlayerControlView.this.f12090m == view) {
                PlayerControlView.this.f12068Q.mo20782i(player);
            } else if (PlayerControlView.this.f12088l == view) {
                PlayerControlView.this.f12068Q.mo20783h(player);
            } else if (PlayerControlView.this.f12093p == view) {
                if (player.mo29505P() != 4) {
                    PlayerControlView.this.f12068Q.mo20786e(player);
                }
            } else if (PlayerControlView.this.f12094q == view) {
                PlayerControlView.this.f12068Q.mo20790a(player);
            } else if (PlayerControlView.this.f12091n == view) {
                PlayerControlView.this.m28931D(player);
            } else if (PlayerControlView.this.f12092o == view) {
                PlayerControlView.this.m28932C(player);
            } else if (PlayerControlView.this.f12095r == view) {
                PlayerControlView.this.f12068Q.mo20787d(player, C9154b0.m16434a(player.mo29497V(), PlayerControlView.this.f12075a0));
            } else if (PlayerControlView.this.f12096s == view) {
                PlayerControlView.this.f12068Q.mo20788c(player, !player.mo29495W());
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC4371a
        public void onEvents(Player player, Player.Events events) {
            if (events.mo16147c(5, 6)) {
                PlayerControlView.this.m28915T();
            }
            if (events.mo16147c(5, 6, 8)) {
                PlayerControlView.this.m28914U();
            }
            if (events.mo16148b(9)) {
                PlayerControlView.this.m28913V();
            }
            if (events.mo16148b(10)) {
                PlayerControlView.this.m28912W();
            }
            if (events.mo16147c(9, 10, 12, 0)) {
                PlayerControlView.this.m28916S();
            }
            if (events.mo16147c(12, 0)) {
                PlayerControlView.this.m28911X();
            }
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

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4490c {
    }

    /* renamed from: com.google.android.exoplayer2.ui.PlayerControlView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4491d {
        /* renamed from: a */
        void mo28843a(int i);
    }

    static {
        C7397h.m20760a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private static boolean m28934A(Timeline timeline, Timeline.C4379c c4379c) {
        if (timeline.mo11753p() > 100) {
            return false;
        }
        int mo11753p = timeline.mo11753p();
        for (int i = 0; i < mo11753p; i++) {
            if (timeline.m29738n(i, c4379c).f11394p == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m28932C(Player player) {
        this.f12068Q.mo20780k(player, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public void m28931D(Player player) {
        int mo29505P = player.mo29505P();
        if (mo29505P == 1) {
            this.f12068Q.mo20784g(player);
        } else if (mo29505P == 4) {
            m28922M(player, player.mo29463l(), -9223372036854775807L);
        }
        this.f12068Q.mo20780k(player, true);
    }

    /* renamed from: E */
    private void m28930E(Player player) {
        int mo29505P = player.mo29505P();
        if (mo29505P != 1 && mo29505P != 4 && player.mo29522F()) {
            m28932C(player);
        } else {
            m28931D(player);
        }
    }

    /* renamed from: F */
    private static int m28929F(TypedArray typedArray, int i) {
        return typedArray.getInt(C6576l.f18717z, i);
    }

    /* renamed from: H */
    private void m28927H() {
        removeCallbacks(this.f12054C);
        if (this.f12073V > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.f12073V;
            this.f12081g0 = uptimeMillis + i;
            if (this.f12069R) {
                postDelayed(this.f12054C, i);
                return;
            }
            return;
        }
        this.f12081g0 = -9223372036854775807L;
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: I */
    private static boolean m28926I(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    /* renamed from: L */
    private void m28923L() {
        View view;
        View view2;
        boolean m28920O = m28920O();
        if (!m28920O && (view2 = this.f12091n) != null) {
            view2.requestFocus();
        } else if (m28920O && (view = this.f12092o) != null) {
            view.requestFocus();
        }
    }

    /* renamed from: M */
    private boolean m28922M(Player player, int i, long j) {
        return this.f12068Q.mo20789b(player, i, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public void m28921N(Player player, long j) {
        int mo29463l;
        Timeline mo29438v = player.mo29438v();
        if (this.f12071T && !mo29438v.m29737q()) {
            int mo11753p = mo29438v.mo11753p();
            mo29463l = 0;
            while (true) {
                long m29717d = mo29438v.m29738n(mo29463l, this.f12052A).m29717d();
                if (j < m29717d) {
                    break;
                } else if (mo29463l == mo11753p - 1) {
                    j = m29717d;
                    break;
                } else {
                    j -= m29717d;
                    mo29463l++;
                }
            }
        } else {
            mo29463l = player.mo29463l();
        }
        if (!m28922M(player, mo29463l, j)) {
            m28914U();
        }
    }

    /* renamed from: O */
    private boolean m28920O() {
        Player player = this.f12067P;
        if (player != null && player.mo29505P() != 4 && this.f12067P.mo29505P() != 1 && this.f12067P.mo29522F()) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private void m28918Q() {
        m28915T();
        m28916S();
        m28913V();
        m28912W();
        m28911X();
    }

    /* renamed from: R */
    private void m28917R(boolean z, boolean z2, View view) {
        float f;
        int i;
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        if (z2) {
            f = this.f12063L;
        } else {
            f = this.f12064M;
        }
        view.setAlpha(f);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m28916S() {
        /*
            r8 = this;
            boolean r0 = r8.m28925J()
            if (r0 == 0) goto L9a
            boolean r0 = r8.f12069R
            if (r0 != 0) goto Lc
            goto L9a
        Lc:
            com.google.android.exoplayer2.Player r0 = r8.f12067P
            r1 = 0
            if (r0 == 0) goto L73
            com.google.android.exoplayer2.Timeline r2 = r0.mo29438v()
            boolean r3 = r2.m29737q()
            if (r3 != 0) goto L73
            boolean r3 = r0.mo29483d()
            if (r3 != 0) goto L73
            int r3 = r0.mo29463l()
            com.google.android.exoplayer2.Timeline$c r4 = r8.f12052A
            r2.m29738n(r3, r4)
            com.google.android.exoplayer2.Timeline$c r2 = r8.f12052A
            boolean r3 = r2.f11386h
            r4 = 1
            if (r3 != 0) goto L40
            boolean r2 = r2.m29715f()
            if (r2 == 0) goto L40
            boolean r2 = r0.hasPrevious()
            if (r2 == 0) goto L3e
            goto L40
        L3e:
            r2 = r1
            goto L41
        L40:
            r2 = r4
        L41:
            if (r3 == 0) goto L4d
            i6.c r5 = r8.f12068Q
            boolean r5 = r5.mo20785f()
            if (r5 == 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r1
        L4e:
            if (r3 == 0) goto L5a
            i6.c r6 = r8.f12068Q
            boolean r6 = r6.mo20781j()
            if (r6 == 0) goto L5a
            r6 = r4
            goto L5b
        L5a:
            r6 = r1
        L5b:
            com.google.android.exoplayer2.Timeline$c r7 = r8.f12052A
            boolean r7 = r7.m29715f()
            if (r7 == 0) goto L69
            com.google.android.exoplayer2.Timeline$c r7 = r8.f12052A
            boolean r7 = r7.f11387i
            if (r7 != 0) goto L6f
        L69:
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L70
        L6f:
            r1 = r4
        L70:
            r0 = r1
            r1 = r2
            goto L77
        L73:
            r0 = r1
            r3 = r0
            r5 = r3
            r6 = r5
        L77:
            boolean r2 = r8.f12078d0
            android.view.View r4 = r8.f12088l
            r8.m28917R(r2, r1, r4)
            boolean r1 = r8.f12076b0
            android.view.View r2 = r8.f12094q
            r8.m28917R(r1, r5, r2)
            boolean r1 = r8.f12077c0
            android.view.View r2 = r8.f12093p
            r8.m28917R(r1, r6, r2)
            boolean r1 = r8.f12079e0
            android.view.View r2 = r8.f12090m
            r8.m28917R(r1, r0, r2)
            com.google.android.exoplayer2.ui.h r0 = r8.f12100w
            if (r0 == 0) goto L9a
            r0.setEnabled(r3)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.PlayerControlView.m28916S():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m28915T() {
        boolean z;
        boolean z2;
        int i;
        if (m28925J() && this.f12069R) {
            boolean m28920O = m28920O();
            View view = this.f12091n;
            int i2 = 8;
            boolean z3 = true;
            if (view != null) {
                if (m28920O && view.isFocused()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2 | false;
                View view2 = this.f12091n;
                if (m28920O) {
                    i = 8;
                } else {
                    i = 0;
                }
                view2.setVisibility(i);
            } else {
                z = false;
            }
            View view3 = this.f12092o;
            if (view3 != null) {
                if (m28920O || !view3.isFocused()) {
                    z3 = false;
                }
                z |= z3;
                View view4 = this.f12092o;
                if (m28920O) {
                    i2 = 0;
                }
                view4.setVisibility(i2);
            }
            if (z) {
                m28923L();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public void m28914U() {
        long j;
        long j2;
        int mo29505P;
        long j3;
        if (m28925J() && this.f12069R) {
            Player player = this.f12067P;
            if (player != null) {
                j = this.f12089l0 + player.mo29510M();
                j2 = this.f12089l0 + player.mo29493X();
            } else {
                j = 0;
                j2 = 0;
            }
            TextView textView = this.f12099v;
            if (textView != null && !this.f12072U) {
                textView.setText(C9191p0.m16250f0(this.f12101x, this.f12102y, j));
            }
            InterfaceC4508h interfaceC4508h = this.f12100w;
            if (interfaceC4508h != null) {
                interfaceC4508h.setPosition(j);
                this.f12100w.setBufferedPosition(j2);
            }
            removeCallbacks(this.f12053B);
            if (player == null) {
                mo29505P = 1;
            } else {
                mo29505P = player.mo29505P();
            }
            long j4 = 1000;
            if (player != null && player.mo29538Q()) {
                InterfaceC4508h interfaceC4508h2 = this.f12100w;
                if (interfaceC4508h2 != null) {
                    j3 = interfaceC4508h2.getPreferredUpdateDelay();
                } else {
                    j3 = 1000;
                }
                long min = Math.min(j3, 1000 - (j % 1000));
                float f = player.mo29487b().f11302a;
                if (f > 0.0f) {
                    j4 = ((float) min) / f;
                }
                postDelayed(this.f12053B, C9191p0.m16225s(j4, this.f12074W, 1000L));
            } else if (mo29505P != 4 && mo29505P != 1) {
                postDelayed(this.f12053B, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public void m28913V() {
        ImageView imageView;
        if (m28925J() && this.f12069R && (imageView = this.f12095r) != null) {
            if (this.f12075a0 == 0) {
                m28917R(false, false, imageView);
                return;
            }
            Player player = this.f12067P;
            if (player == null) {
                m28917R(true, false, imageView);
                this.f12095r.setImageDrawable(this.f12055D);
                this.f12095r.setContentDescription(this.f12058G);
                return;
            }
            m28917R(true, true, imageView);
            int mo29497V = player.mo29497V();
            if (mo29497V != 0) {
                if (mo29497V != 1) {
                    if (mo29497V == 2) {
                        this.f12095r.setImageDrawable(this.f12057F);
                        this.f12095r.setContentDescription(this.f12060I);
                    }
                } else {
                    this.f12095r.setImageDrawable(this.f12056E);
                    this.f12095r.setContentDescription(this.f12059H);
                }
            } else {
                this.f12095r.setImageDrawable(this.f12055D);
                this.f12095r.setContentDescription(this.f12058G);
            }
            this.f12095r.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public void m28912W() {
        ImageView imageView;
        Drawable drawable;
        String str;
        if (m28925J() && this.f12069R && (imageView = this.f12096s) != null) {
            Player player = this.f12067P;
            if (!this.f12080f0) {
                m28917R(false, false, imageView);
            } else if (player == null) {
                m28917R(true, false, imageView);
                this.f12096s.setImageDrawable(this.f12062K);
                this.f12096s.setContentDescription(this.f12066O);
            } else {
                m28917R(true, true, imageView);
                ImageView imageView2 = this.f12096s;
                if (player.mo29495W()) {
                    drawable = this.f12061J;
                } else {
                    drawable = this.f12062K;
                }
                imageView2.setImageDrawable(drawable);
                ImageView imageView3 = this.f12096s;
                if (player.mo29495W()) {
                    str = this.f12065N;
                } else {
                    str = this.f12066O;
                }
                imageView3.setContentDescription(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public void m28911X() {
        boolean z;
        int i;
        int i2;
        int i3;
        Timeline.C4379c c4379c;
        int length;
        Player player = this.f12067P;
        if (player == null) {
            return;
        }
        boolean z2 = true;
        if (this.f12070S && m28934A(player.mo29438v(), this.f12052A)) {
            z = true;
        } else {
            z = false;
        }
        this.f12071T = z;
        long j = 0;
        this.f12089l0 = 0L;
        Timeline mo29438v = player.mo29438v();
        if (!mo29438v.m29737q()) {
            int mo29463l = player.mo29463l();
            boolean z3 = this.f12071T;
            if (z3) {
                i2 = 0;
            } else {
                i2 = mo29463l;
            }
            if (z3) {
                i3 = mo29438v.mo11753p() - 1;
            } else {
                i3 = mo29463l;
            }
            long j2 = 0;
            i = 0;
            while (true) {
                if (i2 > i3) {
                    break;
                }
                if (i2 == mo29463l) {
                    this.f12089l0 = C7390b.m20791d(j2);
                }
                mo29438v.m29738n(i2, this.f12052A);
                Timeline.C4379c c4379c2 = this.f12052A;
                if (c4379c2.f11394p == -9223372036854775807L) {
                    C9149a.m16447f(this.f12071T ^ z2);
                    break;
                }
                int i4 = c4379c2.f11391m;
                while (true) {
                    c4379c = this.f12052A;
                    if (i4 <= c4379c.f11392n) {
                        mo29438v.m29741f(i4, this.f12103z);
                        int m29733c = this.f12103z.m29733c();
                        for (int i5 = 0; i5 < m29733c; i5++) {
                            long m29730f = this.f12103z.m29730f(i5);
                            if (m29730f == Long.MIN_VALUE) {
                                long j3 = this.f12103z.f11374d;
                                if (j3 != -9223372036854775807L) {
                                    m29730f = j3;
                                }
                            }
                            long m29724l = m29730f + this.f12103z.m29724l();
                            if (m29724l >= 0) {
                                long[] jArr = this.f12082h0;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.f12082h0 = Arrays.copyOf(jArr, length);
                                    this.f12083i0 = Arrays.copyOf(this.f12083i0, length);
                                }
                                this.f12082h0[i] = C7390b.m20791d(j2 + m29724l);
                                this.f12083i0[i] = this.f12103z.m29723m(i5);
                                i++;
                            }
                        }
                        i4++;
                    }
                }
                j2 += c4379c.f11394p;
                i2++;
                z2 = true;
            }
            j = j2;
        } else {
            i = 0;
        }
        long m20791d = C7390b.m20791d(j);
        TextView textView = this.f12098u;
        if (textView != null) {
            textView.setText(C9191p0.m16250f0(this.f12101x, this.f12102y, m20791d));
        }
        InterfaceC4508h interfaceC4508h = this.f12100w;
        if (interfaceC4508h != null) {
            interfaceC4508h.setDuration(m20791d);
            int length2 = this.f12085j0.length;
            int i6 = i + length2;
            long[] jArr2 = this.f12082h0;
            if (i6 > jArr2.length) {
                this.f12082h0 = Arrays.copyOf(jArr2, i6);
                this.f12083i0 = Arrays.copyOf(this.f12083i0, i6);
            }
            System.arraycopy(this.f12085j0, 0, this.f12082h0, i, length2);
            System.arraycopy(this.f12087k0, 0, this.f12083i0, i, length2);
            this.f12100w.mo28797b(this.f12082h0, this.f12083i0, i6);
        }
        m28914U();
    }

    /* renamed from: B */
    public boolean m28933B(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f12067P;
        if (player != null && m28926I(keyCode)) {
            if (keyEvent.getAction() == 0) {
                if (keyCode == 90) {
                    if (player.mo29505P() != 4) {
                        this.f12068Q.mo20786e(player);
                        return true;
                    }
                    return true;
                } else if (keyCode == 89) {
                    this.f12068Q.mo20790a(player);
                    return true;
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 && keyCode != 85) {
                        if (keyCode != 87) {
                            if (keyCode != 88) {
                                if (keyCode != 126) {
                                    if (keyCode == 127) {
                                        m28932C(player);
                                        return true;
                                    }
                                    return true;
                                }
                                m28931D(player);
                                return true;
                            }
                            this.f12068Q.mo20783h(player);
                            return true;
                        }
                        this.f12068Q.mo20782i(player);
                        return true;
                    }
                    m28930E(player);
                    return true;
                } else {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public void m28928G() {
        if (m28925J()) {
            setVisibility(8);
            Iterator<InterfaceC4491d> it = this.f12086k.iterator();
            while (it.hasNext()) {
                it.next().mo28843a(getVisibility());
            }
            removeCallbacks(this.f12053B);
            removeCallbacks(this.f12054C);
            this.f12081g0 = -9223372036854775807L;
        }
    }

    /* renamed from: J */
    public boolean m28925J() {
        return getVisibility() == 0;
    }

    /* renamed from: K */
    public void m28924K(InterfaceC4491d interfaceC4491d) {
        this.f12086k.remove(interfaceC4491d);
    }

    /* renamed from: P */
    public void m28919P() {
        if (!m28925J()) {
            setVisibility(0);
            Iterator<InterfaceC4491d> it = this.f12086k.iterator();
            while (it.hasNext()) {
                it.next().mo28843a(getVisibility());
            }
            m28918Q();
            m28923L();
        }
        m28927H();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m28933B(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f12054C);
        } else if (motionEvent.getAction() == 1) {
            m28927H();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.f12067P;
    }

    public int getRepeatToggleModes() {
        return this.f12075a0;
    }

    public boolean getShowShuffleButton() {
        return this.f12080f0;
    }

    public int getShowTimeoutMs() {
        return this.f12073V;
    }

    public boolean getShowVrButton() {
        View view = this.f12097t;
        return view != null && view.getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12069R = true;
        long j = this.f12081g0;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m28928G();
            } else {
                postDelayed(this.f12054C, uptimeMillis);
            }
        } else if (m28925J()) {
            m28927H();
        }
        m28918Q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12069R = false;
        removeCallbacks(this.f12053B);
        removeCallbacks(this.f12054C);
    }

    public void setControlDispatcher(InterfaceC7391c interfaceC7391c) {
        if (this.f12068Q != interfaceC7391c) {
            this.f12068Q = interfaceC7391c;
            m28916S();
        }
    }

    @Deprecated
    public void setFastForwardIncrementMs(int i) {
        InterfaceC7391c interfaceC7391c = this.f12068Q;
        if (interfaceC7391c instanceof C4401g) {
            ((C4401g) interfaceC7391c).m29420m(i);
            m28916S();
        }
    }

    @Deprecated
    public void setPlaybackPreparer(InterfaceC7403n interfaceC7403n) {
    }

    public void setPlayer(Player player) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16447f(z);
        if (player != null && player.mo29436w() != Looper.getMainLooper()) {
            z2 = false;
        }
        C9149a.m16452a(z2);
        Player player2 = this.f12067P;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.mo29466k(this.f12084j);
        }
        this.f12067P = player;
        if (player != null) {
            player.mo29514K(this.f12084j);
        }
        m28918Q();
    }

    public void setProgressUpdateListener(InterfaceC4490c interfaceC4490c) {
    }

    public void setRepeatToggleModes(int i) {
        this.f12075a0 = i;
        Player player = this.f12067P;
        if (player != null) {
            int mo29497V = player.mo29497V();
            if (i == 0 && mo29497V != 0) {
                this.f12068Q.mo20787d(this.f12067P, 0);
            } else if (i == 1 && mo29497V == 2) {
                this.f12068Q.mo20787d(this.f12067P, 1);
            } else if (i == 2 && mo29497V == 1) {
                this.f12068Q.mo20787d(this.f12067P, 2);
            }
        }
        m28913V();
    }

    @Deprecated
    public void setRewindIncrementMs(int i) {
        InterfaceC7391c interfaceC7391c = this.f12068Q;
        if (interfaceC7391c instanceof C4401g) {
            ((C4401g) interfaceC7391c).m29419n(i);
            m28916S();
        }
    }

    public void setShowFastForwardButton(boolean z) {
        this.f12077c0 = z;
        m28916S();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f12070S = z;
        m28911X();
    }

    public void setShowNextButton(boolean z) {
        this.f12079e0 = z;
        m28916S();
    }

    public void setShowPreviousButton(boolean z) {
        this.f12078d0 = z;
        m28916S();
    }

    public void setShowRewindButton(boolean z) {
        this.f12076b0 = z;
        m28916S();
    }

    public void setShowShuffleButton(boolean z) {
        this.f12080f0 = z;
        m28912W();
    }

    public void setShowTimeoutMs(int i) {
        this.f12073V = i;
        if (m28925J()) {
            m28927H();
        }
    }

    public void setShowVrButton(boolean z) {
        int i;
        View view = this.f12097t;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f12074W = C9191p0.m16227r(i, 16, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z;
        View view = this.f12097t;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            boolean showVrButton = getShowVrButton();
            if (onClickListener != null) {
                z = true;
            } else {
                z = false;
            }
            m28917R(showVrButton, z, this.f12097t);
        }
    }

    /* renamed from: z */
    public void m28885z(InterfaceC4491d interfaceC4491d) {
        C9149a.m16448e(interfaceC4491d);
        this.f12086k.add(interfaceC4491d);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int i2 = C6574j.f18642b;
        int i3 = 5000;
        this.f12073V = 5000;
        this.f12075a0 = 0;
        this.f12074W = ItemTouchHelper.AbstractC1746c.DEFAULT_DRAG_ANIMATION_DURATION;
        this.f12081g0 = -9223372036854775807L;
        this.f12076b0 = true;
        this.f12077c0 = true;
        this.f12078d0 = true;
        this.f12079e0 = true;
        this.f12080f0 = false;
        int i4 = 15000;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C6576l.f18714w, 0, 0);
            try {
                i3 = obtainStyledAttributes.getInt(C6576l.f18666A, 5000);
                i4 = obtainStyledAttributes.getInt(C6576l.f18716y, 15000);
                this.f12073V = obtainStyledAttributes.getInt(C6576l.f18672G, this.f12073V);
                i2 = obtainStyledAttributes.getResourceId(C6576l.f18715x, i2);
                this.f12075a0 = m28929F(obtainStyledAttributes, this.f12075a0);
                this.f12076b0 = obtainStyledAttributes.getBoolean(C6576l.f18670E, this.f12076b0);
                this.f12077c0 = obtainStyledAttributes.getBoolean(C6576l.f18667B, this.f12077c0);
                this.f12078d0 = obtainStyledAttributes.getBoolean(C6576l.f18669D, this.f12078d0);
                this.f12079e0 = obtainStyledAttributes.getBoolean(C6576l.f18668C, this.f12079e0);
                this.f12080f0 = obtainStyledAttributes.getBoolean(C6576l.f18671F, this.f12080f0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(C6576l.f18673H, this.f12074W));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f12086k = new CopyOnWriteArrayList<>();
        this.f12103z = new Timeline.C4378b();
        this.f12052A = new Timeline.C4379c();
        StringBuilder sb2 = new StringBuilder();
        this.f12101x = sb2;
        this.f12102y = new Formatter(sb2, Locale.getDefault());
        this.f12082h0 = new long[0];
        this.f12083i0 = new boolean[0];
        this.f12085j0 = new long[0];
        this.f12087k0 = new boolean[0];
        View$OnClickListenerC4489b view$OnClickListenerC4489b = new View$OnClickListenerC4489b();
        this.f12084j = view$OnClickListenerC4489b;
        this.f12068Q = new C4401g(i4, i3);
        this.f12053B = new Runnable() { // from class: g8.d
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlView.this.m28914U();
            }
        };
        this.f12054C = new Runnable() { // from class: g8.e
            @Override // java.lang.Runnable
            public final void run() {
                PlayerControlView.this.m28928G();
            }
        };
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        int i5 = C6572h.f18631p;
        InterfaceC4508h interfaceC4508h = (InterfaceC4508h) findViewById(i5);
        View findViewById = findViewById(C6572h.f18632q);
        if (interfaceC4508h != null) {
            this.f12100w = interfaceC4508h;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i5);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.f12100w = defaultTimeBar;
        } else {
            this.f12100w = null;
        }
        this.f12098u = (TextView) findViewById(C6572h.f18622g);
        this.f12099v = (TextView) findViewById(C6572h.f18629n);
        InterfaceC4508h interfaceC4508h2 = this.f12100w;
        if (interfaceC4508h2 != null) {
            interfaceC4508h2.mo28798a(view$OnClickListenerC4489b);
        }
        View findViewById2 = findViewById(C6572h.f18628m);
        this.f12091n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById3 = findViewById(C6572h.f18627l);
        this.f12092o = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById4 = findViewById(C6572h.f18630o);
        this.f12088l = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById5 = findViewById(C6572h.f18625j);
        this.f12090m = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById6 = findViewById(C6572h.f18634s);
        this.f12094q = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById7 = findViewById(C6572h.f18624i);
        this.f12093p = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(view$OnClickListenerC4489b);
        }
        ImageView imageView = (ImageView) findViewById(C6572h.f18633r);
        this.f12095r = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(view$OnClickListenerC4489b);
        }
        ImageView imageView2 = (ImageView) findViewById(C6572h.f18635t);
        this.f12096s = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(view$OnClickListenerC4489b);
        }
        View findViewById8 = findViewById(C6572h.f18638w);
        this.f12097t = findViewById8;
        setShowVrButton(false);
        m28917R(false, false, findViewById8);
        Resources resources = context.getResources();
        this.f12063L = resources.getInteger(C6573i.f18640b) / 100.0f;
        this.f12064M = resources.getInteger(C6573i.f18639a) / 100.0f;
        this.f12055D = resources.getDrawable(C6571g.f18611b);
        this.f12056E = resources.getDrawable(C6571g.f18612c);
        this.f12057F = resources.getDrawable(C6571g.f18610a);
        this.f12061J = resources.getDrawable(C6571g.f18614e);
        this.f12062K = resources.getDrawable(C6571g.f18613d);
        this.f12058G = resources.getString(C6575k.f18646c);
        this.f12059H = resources.getString(C6575k.f18647d);
        this.f12060I = resources.getString(C6575k.f18645b);
        this.f12065N = resources.getString(C6575k.f18650g);
        this.f12066O = resources.getString(C6575k.f18649f);
    }
}
