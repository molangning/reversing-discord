package com.google.android.exoplayer2;

import com.google.android.exoplayer2.Timeline;
import p151i6.InterfaceC7391c;

/* renamed from: com.google.android.exoplayer2.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4401g implements InterfaceC7391c {

    /* renamed from: a */
    private final Timeline.C4379c f11518a;

    /* renamed from: b */
    private long f11519b;

    /* renamed from: c */
    private long f11520c;

    public C4401g() {
        this(15000L, 5000L);
    }

    /* renamed from: l */
    private static void m29421l(Player player, long j) {
        long mo29491Y = player.mo29491Y() + j;
        long duration = player.getDuration();
        if (duration != -9223372036854775807L) {
            mo29491Y = Math.min(mo29491Y, duration);
        }
        player.mo29524E(player.mo29463l(), Math.max(mo29491Y, 0L));
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: a */
    public boolean mo20790a(Player player) {
        if (mo20785f() && player.mo29532h()) {
            m29421l(player, -this.f11519b);
            return true;
        }
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: b */
    public boolean mo20789b(Player player, int i, long j) {
        player.mo29524E(i, j);
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: c */
    public boolean mo20788c(Player player, boolean z) {
        player.mo29520G(z);
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: d */
    public boolean mo20787d(Player player, int i) {
        player.mo29501S(i);
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: e */
    public boolean mo20786e(Player player) {
        if (mo20781j() && player.mo29532h()) {
            m29421l(player, this.f11520c);
            return true;
        }
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: f */
    public boolean mo20785f() {
        return this.f11519b > 0;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: g */
    public boolean mo20784g(Player player) {
        player.mo29485c();
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: h */
    public boolean mo20783h(Player player) {
        boolean z;
        Timeline mo29438v = player.mo29438v();
        if (!mo29438v.m29737q() && !player.mo29483d()) {
            int mo29463l = player.mo29463l();
            mo29438v.m29738n(mo29463l, this.f11518a);
            int mo29539N = player.mo29539N();
            if (this.f11518a.m29715f() && !this.f11518a.f11386h) {
                z = true;
            } else {
                z = false;
            }
            if (mo29539N != -1 && (player.mo29491Y() <= 3000 || z)) {
                player.mo29524E(mo29539N, -9223372036854775807L);
            } else if (!z) {
                player.mo29524E(mo29463l, 0L);
            }
        }
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: i */
    public boolean mo20782i(Player player) {
        Timeline mo29438v = player.mo29438v();
        if (!mo29438v.m29737q() && !player.mo29483d()) {
            int mo29463l = player.mo29463l();
            mo29438v.m29738n(mo29463l, this.f11518a);
            int mo29537T = player.mo29537T();
            if (mo29537T != -1) {
                player.mo29524E(mo29537T, -9223372036854775807L);
            } else if (this.f11518a.m29715f() && this.f11518a.f11387i) {
                player.mo29524E(mo29463l, -9223372036854775807L);
            }
        }
        return true;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: j */
    public boolean mo20781j() {
        return this.f11520c > 0;
    }

    @Override // p151i6.InterfaceC7391c
    /* renamed from: k */
    public boolean mo20780k(Player player, boolean z) {
        player.mo29457n(z);
        return true;
    }

    @Deprecated
    /* renamed from: m */
    public void m29420m(long j) {
        this.f11520c = j;
    }

    @Deprecated
    /* renamed from: n */
    public void m29419n(long j) {
        this.f11519b = j;
    }

    public C4401g(long j, long j2) {
        this.f11520c = j;
        this.f11519b = j2;
        this.f11518a = new Timeline.C4379c();
    }
}