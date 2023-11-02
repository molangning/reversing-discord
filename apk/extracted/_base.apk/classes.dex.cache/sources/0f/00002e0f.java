package com.linkedin.android.litr;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p215ld.C10132b;
import p248nd.AbstractC10577d;
import p248nd.C10572a;
import p248nd.C10578e;
import p369ud.AbstractC12954c;
import p369ud.C12955d;
import p387vd.C13250d;
import p387vd.C13255h;
import sd.InterfaceC12458c;
import sd.InterfaceC12459d;

/* renamed from: com.linkedin.android.litr.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RunnableC5270c implements Runnable {

    /* renamed from: s */
    private static final String f14983s = "c";

    /* renamed from: j */
    List<AbstractC12954c> f14984j;

    /* renamed from: l */
    int f14986l;

    /* renamed from: p */
    private final List<C5267b> f14990p;

    /* renamed from: q */
    private final String f14991q;

    /* renamed from: r */
    private final C5264a f14992r;

    /* renamed from: k */
    float f14985k = 0.0f;

    /* renamed from: m */
    C12955d f14987m = new C12955d();

    /* renamed from: n */
    C13250d f14988n = new C13250d();

    /* renamed from: o */
    C10132b f14989o = new C10132b();

    public RunnableC5270c(String str, List<C5267b> list, int i, C5264a c5264a) {
        this.f14991q = str;
        this.f14990p = list;
        this.f14986l = i;
        this.f14992r = c5264a;
    }

    /* renamed from: h */
    private void m25549h() {
        for (C5267b c5267b : this.f14990p) {
            c5267b.m25568c().seekTo(c5267b.m25568c().getSelection().m25543b(), 0);
        }
    }

    /* renamed from: a */
    void m25556a() {
        this.f14992r.m25575b(this.f14991q, this.f14989o.m12193b());
        m25550g(false);
    }

    /* renamed from: b */
    void m25555b() {
        int size = this.f14990p.size();
        this.f14984j = new ArrayList(size);
        if (size >= 1) {
            for (int i = 0; i < size; i++) {
                C5267b c5267b = this.f14990p.get(i);
                AbstractC12954c m3596a = this.f14987m.m3596a(c5267b.m25565f(), c5267b.m25563h(), c5267b.m25568c(), c5267b.m25570a(), c5267b.m25566e(), c5267b.m25569b(), c5267b.m25567d(), c5267b.m25564g());
                this.f14984j.add(m3596a);
                this.f14989o.m12190e(i, m3596a.mo3600c(), m3596a.mo3599d());
            }
            return;
        }
        throw new C10578e(C10578e.EnumC10579a.NO_TRACKS_FOUND);
    }

    /* renamed from: c */
    boolean m25554c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).delete();
    }

    /* renamed from: d */
    protected void m25553d(Throwable th2) {
        this.f14992r.m25573d(this.f14991q, th2, this.f14989o.m12193b());
        m25550g(false);
    }

    /* renamed from: e */
    void m25552e() {
        for (C5267b c5267b : this.f14990p) {
            this.f14989o.m12194a(c5267b.m25568c().getTrackFormat(c5267b.m25565f()));
        }
    }

    /* renamed from: f */
    boolean m25551f() {
        boolean z;
        boolean z2 = true;
        for (int i = 0; i < this.f14984j.size(); i++) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f14984j.get(i).mo3595g() == 4) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
            this.f14989o.m12192c(i, System.currentTimeMillis() - currentTimeMillis);
        }
        float f = 0.0f;
        for (AbstractC12954c abstractC12954c : this.f14984j) {
            f += abstractC12954c.m3598e();
        }
        float size = f / this.f14984j.size();
        int i2 = this.f14986l;
        if ((i2 == 0 && size != this.f14985k) || (i2 != 0 && size >= this.f14985k + (1.0f / i2))) {
            this.f14992r.m25572e(this.f14991q, size);
            this.f14985k = size;
        }
        return z2;
    }

    /* renamed from: g */
    void m25550g(boolean z) {
        if (this.f14984j != null) {
            for (int i = 0; i < this.f14984j.size(); i++) {
                AbstractC12954c abstractC12954c = this.f14984j.get(i);
                abstractC12954c.mo3593i();
                this.f14989o.m12191d(i, abstractC12954c.m3597f());
            }
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C5267b c5267b : this.f14990p) {
            hashSet.add(c5267b.m25568c());
            hashSet2.add(c5267b.m25567d());
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((InterfaceC12458c) it.next()).release();
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            InterfaceC12459d interfaceC12459d = (InterfaceC12459d) it2.next();
            interfaceC12459d.release();
            if (!z) {
                m25554c(interfaceC12459d.mo5223a());
            }
        }
        if (z) {
            this.f14992r.m25574c(this.f14991q, this.f14989o.m12193b());
        }
    }

    /* renamed from: i */
    void m25548i() {
        for (AbstractC12954c abstractC12954c : this.f14984j) {
            abstractC12954c.mo3594h();
        }
    }

    /* renamed from: j */
    void m25547j() {
        boolean m25551f;
        m25552e();
        m25546k();
        m25555b();
        m25548i();
        m25549h();
        this.f14992r.m25571f(this.f14991q);
        this.f14985k = 0.0f;
        while (true) {
            m25551f = m25551f();
            if (Thread.interrupted()) {
                m25556a();
                m25551f = false;
                break;
            } else if (m25551f) {
                break;
            }
        }
        m25550g(m25551f);
    }

    /* renamed from: k */
    void m25546k() {
        long m2919d = C13255h.m2919d(this.f14990p);
        long j = ((float) m2919d) * 1.1f;
        long m2931a = this.f14988n.m2931a();
        if (m2931a != -1 && m2931a < j) {
            throw new C10572a(m2919d, m2931a);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            m25547j();
        } catch (RuntimeException e) {
            Log.e(f14983s, "Transformation job error", e);
            if (e.getCause() instanceof InterruptedException) {
                m25556a();
            } else {
                m25553d(e);
            }
        } catch (AbstractC10577d e2) {
            Log.e(f14983s, "Transformation job error", e2);
            e2.m11197a(this.f14991q);
            m25553d(e2);
        }
    }
}