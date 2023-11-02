package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import p098f7.C6317c;
import p151i6.C7399j;
import p195k8.C9191p0;
import p228m6.C10271g;
import p229m7.InterfaceC10320m0;
import p297q7.C11775e;

/* renamed from: com.google.android.exoplayer2.source.dash.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4466d implements InterfaceC10320m0 {

    /* renamed from: j */
    private final Format f11880j;

    /* renamed from: l */
    private long[] f11882l;

    /* renamed from: m */
    private boolean f11883m;

    /* renamed from: n */
    private C11775e f11884n;

    /* renamed from: o */
    private boolean f11885o;

    /* renamed from: p */
    private int f11886p;

    /* renamed from: k */
    private final C6317c f11881k = new C6317c();

    /* renamed from: q */
    private long f11887q = -9223372036854775807L;

    public C4466d(C11775e c11775e, Format format, boolean z) {
        this.f11880j = format;
        this.f11884n = c11775e;
        this.f11882l = c11775e.f30711b;
        m29041d(c11775e, z);
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: a */
    public void mo6236a() {
    }

    /* renamed from: b */
    public String m29043b() {
        return this.f11884n.m6883a();
    }

    /* renamed from: c */
    public void m29042c(long j) {
        boolean z = true;
        int m16253e = C9191p0.m16253e(this.f11882l, j, true, false);
        this.f11886p = m16253e;
        if (!this.f11883m || m16253e != this.f11882l.length) {
            z = false;
        }
        if (!z) {
            j = -9223372036854775807L;
        }
        this.f11887q = j;
    }

    /* renamed from: d */
    public void m29041d(C11775e c11775e, boolean z) {
        long j;
        int i = this.f11886p;
        if (i == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f11882l[i - 1];
        }
        this.f11883m = z;
        this.f11884n = c11775e;
        long[] jArr = c11775e.f30711b;
        this.f11882l = jArr;
        long j2 = this.f11887q;
        if (j2 != -9223372036854775807L) {
            m29042c(j2);
        } else if (j != -9223372036854775807L) {
            this.f11886p = C9191p0.m16253e(jArr, j, false, false);
        }
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: e */
    public boolean mo6232e() {
        return true;
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: i */
    public int mo6231i(C7399j c7399j, C10271g c10271g, boolean z) {
        if (!z && this.f11885o) {
            int i = this.f11886p;
            if (i == this.f11882l.length) {
                if (!this.f11883m) {
                    c10271g.m11986n(4);
                    return -4;
                }
                return -3;
            }
            this.f11886p = i + 1;
            byte[] m22994a = this.f11881k.m22994a(this.f11884n.f30710a[i]);
            c10271g.m11977p(m22994a.length);
            c10271g.f26743l.put(m22994a);
            c10271g.f26745n = this.f11882l[i];
            c10271g.m11986n(1);
            return -4;
        }
        c7399j.f19920b = this.f11880j;
        this.f11885o = true;
        return -5;
    }

    @Override // p229m7.InterfaceC10320m0
    /* renamed from: s */
    public int mo6230s(long j) {
        int max = Math.max(this.f11886p, C9191p0.m16253e(this.f11882l, j, true, false));
        int i = max - this.f11886p;
        this.f11886p = max;
        return i;
    }
}
