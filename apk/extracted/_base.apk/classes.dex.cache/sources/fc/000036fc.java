package p151i6;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import java.util.List;

/* renamed from: i6.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final /* synthetic */ class C7404o {
    /* renamed from: a */
    public static void m20747a(Player.InterfaceC4371a interfaceC4371a, Player player, Player.Events events) {
    }

    /* renamed from: b */
    public static void m20746b(Player.InterfaceC4371a interfaceC4371a, boolean z) {
    }

    /* renamed from: c */
    public static void m20745c(Player.InterfaceC4371a interfaceC4371a, boolean z) {
    }

    /* renamed from: d */
    public static void m20744d(Player.InterfaceC4371a interfaceC4371a, boolean z) {
        interfaceC4371a.onLoadingChanged(z);
    }

    /* renamed from: e */
    public static void m20743e(Player.InterfaceC4371a interfaceC4371a, boolean z) {
    }

    @Deprecated
    /* renamed from: f */
    public static void m20742f(Player.InterfaceC4371a interfaceC4371a, boolean z) {
    }

    /* renamed from: g */
    public static void m20741g(Player.InterfaceC4371a interfaceC4371a, MediaItem mediaItem, int i) {
    }

    /* renamed from: h */
    public static void m20740h(Player.InterfaceC4371a interfaceC4371a, boolean z, int i) {
    }

    /* renamed from: i */
    public static void m20739i(Player.InterfaceC4371a interfaceC4371a, PlaybackParameters playbackParameters) {
    }

    /* renamed from: j */
    public static void m20738j(Player.InterfaceC4371a interfaceC4371a, int i) {
    }

    /* renamed from: k */
    public static void m20737k(Player.InterfaceC4371a interfaceC4371a, int i) {
    }

    /* renamed from: l */
    public static void m20736l(Player.InterfaceC4371a interfaceC4371a, ExoPlaybackException exoPlaybackException) {
    }

    @Deprecated
    /* renamed from: m */
    public static void m20735m(Player.InterfaceC4371a interfaceC4371a, boolean z, int i) {
    }

    /* renamed from: n */
    public static void m20734n(Player.InterfaceC4371a interfaceC4371a, int i) {
    }

    /* renamed from: o */
    public static void m20733o(Player.InterfaceC4371a interfaceC4371a, int i) {
    }

    @Deprecated
    /* renamed from: p */
    public static void m20732p(Player.InterfaceC4371a interfaceC4371a) {
    }

    /* renamed from: q */
    public static void m20731q(Player.InterfaceC4371a interfaceC4371a, boolean z) {
    }

    /* renamed from: r */
    public static void m20730r(Player.InterfaceC4371a interfaceC4371a, List list) {
    }

    /* renamed from: s */
    public static void m20729s(Player.InterfaceC4371a interfaceC4371a, Timeline timeline, int i) {
        Object obj;
        if (timeline.mo11753p() == 1) {
            obj = timeline.m29738n(0, new Timeline.C4379c()).f11382d;
        } else {
            obj = null;
        }
        interfaceC4371a.onTimelineChanged(timeline, obj, i);
    }

    @Deprecated
    /* renamed from: t */
    public static void m20728t(Player.InterfaceC4371a interfaceC4371a, Timeline timeline, Object obj, int i) {
    }

    /* renamed from: u */
    public static void m20727u(Player.InterfaceC4371a interfaceC4371a, TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }
}