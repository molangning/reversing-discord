package p021b1;

import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p034c1.InterfaceC2381b;
import p054d1.C5722d;
import p054d1.C5735j;
import p054d1.InterfaceC5732h;

/* renamed from: b1.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2087u implements InterfaceC2022b0, InterfaceC2381b.InterfaceC2382a {

    /* renamed from: a */
    private boolean f5859a;

    /* renamed from: b */
    private String f5860b;

    /* renamed from: c */
    private InterfaceC2381b f5861c;

    /* renamed from: g */
    private WeakReference<InterfaceC2013a0> f5865g;

    /* renamed from: d */
    private InterfaceC2025c0 f5862d = C2055l.m34422j();

    /* renamed from: f */
    private InterfaceC5732h f5864f = new C5722d("AttributionHandler");

    /* renamed from: e */
    private C5735j f5863e = new C5735j(new RunnableC2088a(), "Attribution timer");

    /* renamed from: b1.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2088a implements Runnable {
        RunnableC2088a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2087u.this.m34277y();
        }
    }

    /* renamed from: b1.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2089b implements Runnable {
        RunnableC2089b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2087u.this.f5860b = "sdk";
            C2087u.this.m34278x(0L);
        }
    }

    /* renamed from: b1.u$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2090c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2029d1 f5868j;

        RunnableC2090c(C2029d1 c2029d1) {
            this.f5868j = c2029d1;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2013a0 interfaceC2013a0 = (InterfaceC2013a0) C2087u.this.f5865g.get();
            if (interfaceC2013a0 == null) {
                return;
            }
            C2087u.this.m34280v(interfaceC2013a0, this.f5868j);
        }
    }

    /* renamed from: b1.u$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2091d implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2023b1 f5870j;

        RunnableC2091d(C2023b1 c2023b1) {
            this.f5870j = c2023b1;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2013a0 interfaceC2013a0 = (InterfaceC2013a0) C2087u.this.f5865g.get();
            if (interfaceC2013a0 == null) {
                return;
            }
            C2087u.this.m34281u(interfaceC2013a0, this.f5870j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.u$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2092e implements Runnable {
        RunnableC2092e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2087u.this.m34276z();
        }
    }

    /* renamed from: b1.u$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2093f implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2114z0 f5873j;

        RunnableC2093f(C2114z0 c2114z0) {
            this.f5873j = c2114z0;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2013a0 interfaceC2013a0 = (InterfaceC2013a0) C2087u.this.f5865g.get();
            if (interfaceC2013a0 == null) {
                return;
            }
            C2114z0 c2114z0 = this.f5873j;
            if (c2114z0.f5959h == EnumC2035f1.OPTED_OUT) {
                interfaceC2013a0.mo34728J();
            } else if (!(c2114z0 instanceof C2095v)) {
            } else {
                C2087u.this.m34283s(interfaceC2013a0, (C2095v) c2114z0);
            }
        }
    }

    public C2087u(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        mo34296e(interfaceC2013a0, z, interfaceC2381b);
    }

    /* renamed from: q */
    private C2024c m34285q() {
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC2013a0 interfaceC2013a0 = this.f5865g.get();
        C2024c m34312o = new C2085t0(interfaceC2013a0.mo34735C(), interfaceC2013a0.mo34705x(), interfaceC2013a0.mo34703z(), interfaceC2013a0.mo34724e(), currentTimeMillis).m34312o(this.f5860b);
        this.f5860b = null;
        return m34312o;
    }

    /* renamed from: r */
    private void m34284r(InterfaceC2013a0 interfaceC2013a0, C2114z0 c2114z0) {
        if (c2114z0.f5957f == null) {
            return;
        }
        Long l = c2114z0.f5961j;
        if (l != null && l.longValue() >= 0) {
            interfaceC2013a0.mo34712q(true);
            this.f5860b = "backend";
            m34278x(l.longValue());
            return;
        }
        interfaceC2013a0.mo34712q(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m34283s(InterfaceC2013a0 interfaceC2013a0, C2095v c2095v) {
        m34284r(interfaceC2013a0, c2095v);
        m34282t(c2095v);
        interfaceC2013a0.mo34716m(c2095v);
    }

    /* renamed from: t */
    private void m34282t(C2095v c2095v) {
        JSONObject optJSONObject;
        String optString;
        JSONObject jSONObject = c2095v.f5957f;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("attribution")) == null || (optString = optJSONObject.optString("deeplink", null)) == null) {
            return;
        }
        c2095v.f5875o = Uri.parse(optString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m34281u(InterfaceC2013a0 interfaceC2013a0, C2023b1 c2023b1) {
        m34284r(interfaceC2013a0, c2023b1);
        interfaceC2013a0.mo34715n(c2023b1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m34280v(InterfaceC2013a0 interfaceC2013a0, C2029d1 c2029d1) {
        m34284r(interfaceC2013a0, c2029d1);
        interfaceC2013a0.mo34731G(c2029d1);
    }

    /* renamed from: w */
    private Map<String, String> m34279w() {
        HashMap hashMap = new HashMap();
        C2085t0.m34315l(hashMap, "sent_at", C2043h1.f5688b.format(Long.valueOf(System.currentTimeMillis())));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m34278x(long j) {
        if (this.f5863e.m24595g() > j) {
            return;
        }
        if (j != 0) {
            this.f5862d.mo34443c("Waiting to query attribution in %s seconds", C2043h1.f5687a.format(j / 1000.0d));
        }
        this.f5863e.m24594h(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m34277y() {
        this.f5864f.submit(new RunnableC2092e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m34276z() {
        if (this.f5865g.get().mo34703z().f5593m) {
            return;
        }
        if (this.f5859a) {
            this.f5862d.mo34443c("Attribution handler is paused", new Object[0]);
            return;
        }
        C2024c m34285q = m34285q();
        this.f5862d.mo34439g("%s", m34285q.m34680g());
        this.f5861c.mo33547b(m34285q, m34279w(), this);
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: a */
    public void mo34300a() {
        this.f5862d.mo34439g("AttributionHandler teardown", new Object[0]);
        C5735j c5735j = this.f5863e;
        if (c5735j != null) {
            c5735j.m24593i();
        }
        InterfaceC5732h interfaceC5732h = this.f5864f;
        if (interfaceC5732h != null) {
            interfaceC5732h.mo24610a();
        }
        WeakReference<InterfaceC2013a0> weakReference = this.f5865g;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5863e = null;
        this.f5862d = null;
        this.f5864f = null;
        this.f5865g = null;
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: b */
    public void mo34299b() {
        this.f5859a = true;
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: c */
    public void mo34298c() {
        this.f5859a = false;
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: d */
    public void mo34297d() {
        this.f5864f.submit(new RunnableC2089b());
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: e */
    public void mo34296e(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        this.f5865g = new WeakReference<>(interfaceC2013a0);
        this.f5859a = !z;
        this.f5861c = interfaceC2381b;
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: f */
    public void mo34295f(C2023b1 c2023b1) {
        this.f5864f.submit(new RunnableC2091d(c2023b1));
    }

    @Override // p021b1.InterfaceC2022b0
    /* renamed from: g */
    public void mo34294g(C2029d1 c2029d1) {
        this.f5864f.submit(new RunnableC2090c(c2029d1));
    }

    @Override // p034c1.InterfaceC2381b.InterfaceC2382a
    /* renamed from: h */
    public void mo33546h(C2114z0 c2114z0) {
        this.f5864f.submit(new RunnableC2093f(c2114z0));
    }
}
