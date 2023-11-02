package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4396e implements Player {

    /* renamed from: a */
    protected final Timeline.C4379c f11473a = new Timeline.C4379c();

    /* renamed from: b0 */
    private int m29534b0() {
        int mo29497V = mo29497V();
        if (mo29497V == 1) {
            return 0;
        }
        return mo29497V;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: N */
    public final int mo29539N() {
        Timeline mo29438v = mo29438v();
        if (mo29438v.m29737q()) {
            return -1;
        }
        return mo29438v.mo11841l(mo29463l(), m29534b0(), mo29495W());
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: Q */
    public final boolean mo29538Q() {
        if (mo29505P() == 3 && mo29522F() && mo29442t() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: T */
    public final int mo29537T() {
        Timeline mo29438v = mo29438v();
        if (mo29438v.m29737q()) {
            return -1;
        }
        return mo29438v.mo11842e(mo29463l(), m29534b0(), mo29495W());
    }

    /* renamed from: Z */
    public final int m29536Z() {
        long mo29507O = mo29507O();
        long duration = getDuration();
        if (mo29507O == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return C9191p0.m16227r((int) ((mo29507O * 100) / duration), 0, 100);
    }

    /* renamed from: a0 */
    public final long m29535a0() {
        Timeline mo29438v = mo29438v();
        if (mo29438v.m29737q()) {
            return -9223372036854775807L;
        }
        return mo29438v.m29738n(mo29463l(), this.f11473a).m29717d();
    }

    /* renamed from: c0 */
    public final void m29533c0(long j) {
        mo29524E(mo29463l(), j);
    }

    @Override // com.google.android.exoplayer2.Player
    /* renamed from: h */
    public final boolean mo29532h() {
        Timeline mo29438v = mo29438v();
        if (!mo29438v.m29737q() && mo29438v.m29738n(mo29463l(), this.f11473a).f11386h) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasNext() {
        return mo29537T() != -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean hasPrevious() {
        return mo29539N() != -1;
    }
}
