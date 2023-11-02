package com.google.android.exoplayer2.source.dash;

import android.os.Handler;
import android.os.Message;
import com.discord.nearby.NearbyManager;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p060d7.C5778d;
import p098f7.C6314a;
import p098f7.C6316b;
import p151i6.C7399j;
import p151i6.C7402m;
import p153i8.InterfaceC7440b;
import p153i8.InterfaceC7451h;
import p195k8.C9191p0;
import p195k8.C9208y;
import p229m7.C10315l0;
import p260o7.AbstractC11058e;
import p296q6.C11730a0;
import p296q6.InterfaceC11732b0;
import p297q7.C11771b;

/* renamed from: com.google.android.exoplayer2.source.dash.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4467e implements Handler.Callback {

    /* renamed from: j */
    private final InterfaceC7440b f11888j;

    /* renamed from: k */
    private final InterfaceC4469b f11889k;

    /* renamed from: o */
    private C11771b f11893o;

    /* renamed from: p */
    private long f11894p;

    /* renamed from: q */
    private boolean f11895q;

    /* renamed from: r */
    private boolean f11896r;

    /* renamed from: s */
    private boolean f11897s;

    /* renamed from: n */
    private final TreeMap<Long, Long> f11892n = new TreeMap<>();

    /* renamed from: m */
    private final Handler f11891m = C9191p0.m16213y(this);

    /* renamed from: l */
    private final C6316b f11890l = new C6316b();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.exoplayer2.source.dash.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4468a {

        /* renamed from: a */
        public final long f11898a;

        /* renamed from: b */
        public final long f11899b;

        public C4468a(long j, long j2) {
            this.f11898a = j;
            this.f11899b = j2;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4469b {
        /* renamed from: a */
        void mo29023a(long j);

        /* renamed from: b */
        void mo29022b();
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.e$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class C4470c implements InterfaceC11732b0 {

        /* renamed from: a */
        private final C10315l0 f11900a;

        /* renamed from: b */
        private final C7399j f11901b = new C7399j();

        /* renamed from: c */
        private final C5778d f11902c = new C5778d();

        /* renamed from: d */
        private long f11903d = -9223372036854775807L;

        C4470c(InterfaceC7440b interfaceC7440b) {
            this.f11900a = C10315l0.m11805k(interfaceC7440b);
        }

        /* renamed from: g */
        private C5778d m29021g() {
            this.f11902c.mo3126f();
            if (this.f11900a.m11824Q(this.f11901b, this.f11902c, false, false) == -4) {
                this.f11902c.m11976q();
                return this.f11902c;
            }
            return null;
        }

        /* renamed from: k */
        private void m29017k(long j, long j2) {
            C4467e.this.f11891m.sendMessage(C4467e.this.f11891m.obtainMessage(1, new C4468a(j, j2)));
        }

        /* renamed from: l */
        private void m29016l() {
            while (this.f11900a.m11831J(false)) {
                C5778d m29021g = m29021g();
                if (m29021g != null) {
                    long j = m29021g.f26745n;
                    Metadata mo24517a = C4467e.this.f11890l.mo24517a(m29021g);
                    if (mo24517a != null) {
                        C6314a c6314a = (C6314a) mo24517a.m29248d(0);
                        if (C4467e.m29033h(c6314a.f17822j, c6314a.f17823k)) {
                            m29015m(j, c6314a);
                        }
                    }
                }
            }
            this.f11900a.m11798r();
        }

        /* renamed from: m */
        private void m29015m(long j, C6314a c6314a) {
            long m29035f = C4467e.m29035f(c6314a);
            if (m29035f == -9223372036854775807L) {
                return;
            }
            m29017k(j, m29035f);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: a */
        public /* synthetic */ void mo6170a(C9208y c9208y, int i) {
            C11730a0.m7041b(this, c9208y, i);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: b */
        public void mo6169b(C9208y c9208y, int i, int i2) {
            this.f11900a.mo6170a(c9208y, i);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: c */
        public void mo6168c(Format format) {
            this.f11900a.mo6168c(format);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: d */
        public /* synthetic */ int mo6167d(InterfaceC7451h interfaceC7451h, int i, boolean z) {
            return C11730a0.m7042a(this, interfaceC7451h, i, z);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: e */
        public int mo6166e(InterfaceC7451h interfaceC7451h, int i, boolean z, int i2) {
            return this.f11900a.mo6167d(interfaceC7451h, i, z);
        }

        @Override // p296q6.InterfaceC11732b0
        /* renamed from: f */
        public void mo6162f(long j, int i, int i2, int i3, InterfaceC11732b0.C11733a c11733a) {
            this.f11900a.mo6162f(j, i, i2, i3, c11733a);
            m29016l();
        }

        /* renamed from: h */
        public boolean m29020h(long j) {
            return C4467e.this.m29031j(j);
        }

        /* renamed from: i */
        public void m29019i(AbstractC11058e abstractC11058e) {
            long j = this.f11903d;
            if (j == -9223372036854775807L || abstractC11058e.f28949h > j) {
                this.f11903d = abstractC11058e.f28949h;
            }
            C4467e.this.m29028m(abstractC11058e);
        }

        /* renamed from: j */
        public boolean m29018j(AbstractC11058e abstractC11058e) {
            boolean z;
            long j = this.f11903d;
            if (j != -9223372036854775807L && j < abstractC11058e.f28948g) {
                z = true;
            } else {
                z = false;
            }
            return C4467e.this.m29027n(z);
        }

        /* renamed from: n */
        public void m29014n() {
            this.f11900a.m11823R();
        }
    }

    public C4467e(C11771b c11771b, InterfaceC4469b interfaceC4469b, InterfaceC7440b interfaceC7440b) {
        this.f11893o = c11771b;
        this.f11889k = interfaceC4469b;
        this.f11888j = interfaceC7440b;
    }

    /* renamed from: e */
    private Map.Entry<Long, Long> m29036e(long j) {
        return this.f11892n.ceilingEntry(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static long m29035f(C6314a c6314a) {
        try {
            return C9191p0.m16306D0(C9191p0.m16305E(c6314a.f17826n));
        } catch (C7402m unused) {
            return -9223372036854775807L;
        }
    }

    /* renamed from: g */
    private void m29034g(long j, long j2) {
        Long l = this.f11892n.get(Long.valueOf(j2));
        if (l == null) {
            this.f11892n.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f11892n.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static boolean m29033h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str) && (NearbyManager.PERMISSION_DENIED.equals(str2) || "2".equals(str2) || "3".equals(str2))) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m29032i() {
        if (!this.f11895q) {
            return;
        }
        this.f11896r = true;
        this.f11895q = false;
        this.f11889k.mo29022b();
    }

    /* renamed from: l */
    private void m29029l() {
        this.f11889k.mo29023a(this.f11894p);
    }

    /* renamed from: p */
    private void m29025p() {
        Iterator<Map.Entry<Long, Long>> it = this.f11892n.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f11893o.f30689h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f11897s) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        C4468a c4468a = (C4468a) message.obj;
        m29034g(c4468a.f11898a, c4468a.f11899b);
        return true;
    }

    /* renamed from: j */
    boolean m29031j(long j) {
        C11771b c11771b = this.f11893o;
        boolean z = false;
        if (!c11771b.f30685d) {
            return false;
        }
        if (this.f11896r) {
            return true;
        }
        Map.Entry<Long, Long> m29036e = m29036e(c11771b.f30689h);
        if (m29036e != null && m29036e.getValue().longValue() < j) {
            this.f11894p = m29036e.getKey().longValue();
            m29029l();
            z = true;
        }
        if (z) {
            m29032i();
        }
        return z;
    }

    /* renamed from: k */
    public C4470c m29030k() {
        return new C4470c(this.f11888j);
    }

    /* renamed from: m */
    void m29028m(AbstractC11058e abstractC11058e) {
        this.f11895q = true;
    }

    /* renamed from: n */
    boolean m29027n(boolean z) {
        if (!this.f11893o.f30685d) {
            return false;
        }
        if (this.f11896r) {
            return true;
        }
        if (!z) {
            return false;
        }
        m29032i();
        return true;
    }

    /* renamed from: o */
    public void m29026o() {
        this.f11897s = true;
        this.f11891m.removeCallbacksAndMessages(null);
    }

    /* renamed from: q */
    public void m29024q(C11771b c11771b) {
        this.f11896r = false;
        this.f11894p = -9223372036854775807L;
        this.f11893o = c11771b;
        m29025p();
    }
}
