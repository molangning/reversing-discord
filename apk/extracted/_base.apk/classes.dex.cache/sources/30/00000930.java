package p021b1;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p034c1.InterfaceC2381b;
import p054d1.C5722d;
import p054d1.InterfaceC5732h;

/* renamed from: b1.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2096v0 implements InterfaceC2028d0, InterfaceC2381b.InterfaceC2382a {

    /* renamed from: b */
    private InterfaceC2381b f5877b;

    /* renamed from: c */
    private WeakReference<InterfaceC2013a0> f5878c;

    /* renamed from: d */
    private List<C2024c> f5879d;

    /* renamed from: e */
    private AtomicBoolean f5880e;

    /* renamed from: f */
    private boolean f5881f;

    /* renamed from: g */
    private Context f5882g;

    /* renamed from: a */
    private InterfaceC5732h f5876a = new C5722d("PackageHandler");

    /* renamed from: h */
    private InterfaceC2025c0 f5883h = C2055l.m34422j();

    /* renamed from: i */
    private EnumC2104w f5884i = C2055l.m34419m();

    /* renamed from: j */
    private EnumC2104w f5885j = C2055l.m34423i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.v0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2097a implements Runnable {
        RunnableC2097a() {
            C2096v0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34249u();
        }
    }

    /* renamed from: b1.v0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2098b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2024c f5887j;

        RunnableC2098b(C2024c c2024c) {
            C2096v0.this = r1;
            this.f5887j = c2024c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34254p(this.f5887j);
        }
    }

    /* renamed from: b1.v0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2099c implements Runnable {
        RunnableC2099c() {
            C2096v0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34247w();
        }
    }

    /* renamed from: b1.v0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2100d implements Runnable {
        RunnableC2100d() {
            C2096v0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34246x();
        }
    }

    /* renamed from: b1.v0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2101e implements Runnable {
        RunnableC2101e() {
            C2096v0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.f5883h.mo34439g("Package handler can send", new Object[0]);
            C2096v0.this.f5880e.set(false);
            C2096v0.this.mo34262g();
        }
    }

    /* renamed from: b1.v0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2102f implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2026c1 f5892j;

        RunnableC2102f(C2026c1 c2026c1) {
            C2096v0.this = r1;
            this.f5892j = c2026c1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34245y(this.f5892j);
        }
    }

    /* renamed from: b1.v0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2103g implements Runnable {
        RunnableC2103g() {
            C2096v0.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2096v0.this.m34251s();
        }
    }

    public C2096v0(InterfaceC2013a0 interfaceC2013a0, Context context, boolean z, InterfaceC2381b interfaceC2381b) {
        mo34265d(interfaceC2013a0, context, z, interfaceC2381b);
        this.f5876a.submit(new RunnableC2097a());
    }

    /* renamed from: p */
    public void m34254p(C2024c c2024c) {
        this.f5879d.add(c2024c);
        this.f5883h.mo34443c("Added package %d (%s)", Integer.valueOf(this.f5879d.size()), c2024c);
        this.f5883h.mo34439g("%s", c2024c.m34680g());
        m34244z();
    }

    /* renamed from: q */
    public static Boolean m34253q(Context context) {
        return Boolean.valueOf(context.deleteFile("AdjustIoPackageQueue"));
    }

    /* renamed from: r */
    public static void m34252r(Context context) {
        m34253q(context);
    }

    /* renamed from: s */
    public void m34251s() {
        this.f5879d.clear();
        m34244z();
    }

    /* renamed from: t */
    private Map<String, String> m34250t() {
        HashMap hashMap = new HashMap();
        C2085t0.m34315l(hashMap, "sent_at", C2043h1.f5688b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f5879d.size() - 1;
        if (size > 0) {
            C2085t0.m34317j(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    /* renamed from: u */
    public void m34249u() {
        this.f5880e = new AtomicBoolean();
        m34248v();
    }

    /* renamed from: v */
    private void m34248v() {
        try {
            this.f5879d = (List) C2043h1.m34490b0(this.f5882g, "AdjustIoPackageQueue", "Package queue", List.class);
        } catch (Exception e) {
            this.f5883h.mo34444b("Failed to read %s file (%s)", "Package queue", e.getMessage());
            this.f5879d = null;
        }
        List<C2024c> list = this.f5879d;
        if (list != null) {
            this.f5883h.mo34443c("Package handler read %d packages", Integer.valueOf(list.size()));
        } else {
            this.f5879d = new ArrayList();
        }
    }

    /* renamed from: w */
    public void m34247w() {
        if (this.f5879d.isEmpty()) {
            return;
        }
        if (this.f5881f) {
            this.f5883h.mo34443c("Package handler is paused", new Object[0]);
        } else if (this.f5880e.getAndSet(true)) {
            this.f5883h.mo34439g("Package handler is already sending", new Object[0]);
        } else {
            Map<String, String> m34250t = m34250t();
            this.f5877b.mo33547b(this.f5879d.get(0), m34250t, this);
        }
    }

    /* renamed from: x */
    public void m34246x() {
        if (this.f5879d.isEmpty()) {
            return;
        }
        this.f5879d.remove(0);
        m34244z();
        this.f5880e.set(false);
        this.f5883h.mo34439g("Package handler can send", new Object[0]);
        m34247w();
    }

    /* renamed from: z */
    private void m34244z() {
        C2043h1.m34478h0(this.f5879d, this.f5882g, "AdjustIoPackageQueue", "Package queue");
        this.f5883h.mo34443c("Package handler wrote %d packages", Integer.valueOf(this.f5879d.size()));
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: a */
    public void mo34268a() {
        this.f5883h.mo34439g("PackageHandler teardown", new Object[0]);
        InterfaceC5732h interfaceC5732h = this.f5876a;
        if (interfaceC5732h != null) {
            interfaceC5732h.mo24610a();
        }
        WeakReference<InterfaceC2013a0> weakReference = this.f5878c;
        if (weakReference != null) {
            weakReference.clear();
        }
        List<C2024c> list = this.f5879d;
        if (list != null) {
            list.clear();
        }
        this.f5876a = null;
        this.f5878c = null;
        this.f5879d = null;
        this.f5880e = null;
        this.f5882g = null;
        this.f5883h = null;
        this.f5884i = null;
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: b */
    public void mo34267b() {
        this.f5881f = true;
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: c */
    public void mo34266c() {
        this.f5881f = false;
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: d */
    public void mo34265d(InterfaceC2013a0 interfaceC2013a0, Context context, boolean z, InterfaceC2381b interfaceC2381b) {
        this.f5878c = new WeakReference<>(interfaceC2013a0);
        this.f5882g = context;
        this.f5881f = !z;
        this.f5877b = interfaceC2381b;
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: e */
    public void mo34264e(C2026c1 c2026c1) {
        C2026c1 c2026c12;
        if (c2026c1 != null) {
            c2026c12 = c2026c1.m34660a();
        } else {
            c2026c12 = null;
        }
        this.f5876a.submit(new RunnableC2102f(c2026c12));
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: f */
    public void mo34263f(C2024c c2024c) {
        this.f5876a.submit(new RunnableC2098b(c2024c));
    }

    @Override // p021b1.InterfaceC2028d0
    public void flush() {
        this.f5876a.submit(new RunnableC2103g());
    }

    @Override // p021b1.InterfaceC2028d0
    /* renamed from: g */
    public void mo34262g() {
        this.f5876a.submit(new RunnableC2099c());
    }

    @Override // p034c1.InterfaceC2381b.InterfaceC2382a
    /* renamed from: h */
    public void mo33546h(C2114z0 c2114z0) {
        long m34512H;
        this.f5883h.mo34443c("Got response in PackageHandler", new Object[0]);
        InterfaceC2013a0 interfaceC2013a0 = this.f5878c.get();
        if (interfaceC2013a0 != null && c2114z0.f5959h == EnumC2035f1.OPTED_OUT) {
            interfaceC2013a0.mo34728J();
        }
        if (!c2114z0.f5953b) {
            this.f5876a.submit(new RunnableC2100d());
            if (interfaceC2013a0 != null) {
                interfaceC2013a0.mo34720i(c2114z0);
                return;
            }
            return;
        }
        if (interfaceC2013a0 != null) {
            interfaceC2013a0.mo34720i(c2114z0);
        }
        RunnableC2101e runnableC2101e = new RunnableC2101e();
        C2024c c2024c = c2114z0.f5964m;
        if (c2024c == null) {
            runnableC2101e.run();
            return;
        }
        int m34669r = c2024c.m34669r();
        C2032e1 c2032e1 = new C2032e1(this.f5882g);
        if (c2114z0.f5964m.m34686a() == EnumC2020b.SESSION && !c2032e1.m34607g()) {
            m34512H = C2043h1.m34512H(m34669r, this.f5885j);
        } else {
            m34512H = C2043h1.m34512H(m34669r, this.f5884i);
        }
        this.f5883h.mo34439g("Waiting for %s seconds before retrying the %d time", C2043h1.f5687a.format(m34512H / 1000.0d), Integer.valueOf(m34669r));
        this.f5876a.mo24609b(runnableC2101e, m34512H);
    }

    /* renamed from: y */
    public void m34245y(C2026c1 c2026c1) {
        if (c2026c1 == null) {
            return;
        }
        this.f5883h.mo34443c("Updating package handler queue", new Object[0]);
        this.f5883h.mo34439g("Session callback parameters: %s", c2026c1.f5576a);
        this.f5883h.mo34439g("Session partner parameters: %s", c2026c1.f5577b);
        for (C2024c c2024c : this.f5879d) {
            Map<String, String> m34674m = c2024c.m34674m();
            C2085t0.m34316k(m34674m, "callback_params", C2043h1.m34495Y(c2026c1.f5576a, c2024c.m34685b(), "Callback"));
            C2085t0.m34316k(m34674m, "partner_params", C2043h1.m34495Y(c2026c1.f5577b, c2024c.m34673n(), "Partner"));
        }
        m34244z();
    }
}