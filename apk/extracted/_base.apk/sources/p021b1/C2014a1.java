package p021b1;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import p034c1.InterfaceC2381b;
import p054d1.C5722d;
import p054d1.InterfaceC5732h;

/* renamed from: b1.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2014a1 implements InterfaceC2034f0 {

    /* renamed from: a */
    private boolean f5518a;

    /* renamed from: b */
    private InterfaceC2025c0 f5519b;

    /* renamed from: c */
    private EnumC2104w f5520c;

    /* renamed from: d */
    private List<C2024c> f5521d;

    /* renamed from: e */
    private InterfaceC5732h f5522e;

    /* renamed from: f */
    private WeakReference<InterfaceC2013a0> f5523f;

    /* renamed from: g */
    private InterfaceC2381b f5524g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2015a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2024c f5525j;

        RunnableC2015a(C2024c c2024c) {
            this.f5525j = c2024c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2014a1.this.f5521d.add(this.f5525j);
            C2014a1.this.f5519b.mo34443c("Added sdk_click %d", Integer.valueOf(C2014a1.this.f5521d.size()));
            C2014a1.this.f5519b.mo34439g("%s", this.f5525j.m34680g());
            C2014a1.this.m34694p();
        }
    }

    /* renamed from: b1.a1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2016b implements Runnable {
        RunnableC2016b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2013a0 interfaceC2013a0 = (InterfaceC2013a0) C2014a1.this.f5523f.get();
            C2032e1 c2032e1 = new C2032e1(interfaceC2013a0.getContext());
            try {
                JSONArray m34601m = c2032e1.m34601m();
                boolean z = false;
                for (int i = 0; i < m34601m.length(); i++) {
                    JSONArray jSONArray = m34601m.getJSONArray(i);
                    if (jSONArray.optInt(2, -1) == 0) {
                        String optString = jSONArray.optString(0, null);
                        long optLong = jSONArray.optLong(1, -1L);
                        jSONArray.put(2, 1);
                        C2014a1.this.mo34575d(C2094u0.m34272d(optString, optLong, interfaceC2013a0.mo34703z(), interfaceC2013a0.mo34735C(), interfaceC2013a0.mo34705x(), interfaceC2013a0.mo34724e()));
                        z = true;
                    }
                }
                if (z) {
                    c2032e1.m34620B(m34601m);
                }
            } catch (JSONException e) {
                C2014a1.this.f5519b.mo34444b("Send saved raw referrers error (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: b1.a1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2017c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5528j;

        /* renamed from: k */
        final /* synthetic */ String f5529k;

        RunnableC2017c(String str, String str2) {
            this.f5528j = str;
            this.f5529k = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC2013a0 interfaceC2013a0 = (InterfaceC2013a0) C2014a1.this.f5523f.get();
            if (interfaceC2013a0 == null) {
                return;
            }
            C2014a1.this.mo34575d(C2094u0.m34273c(this.f5528j, this.f5529k, interfaceC2013a0.mo34703z(), interfaceC2013a0.mo34735C(), interfaceC2013a0.mo34705x(), interfaceC2013a0.mo34724e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2018d implements Runnable {
        RunnableC2018d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2014a1.this.m34693q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a1$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2019e implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2024c f5532j;

        RunnableC2019e(C2024c c2024c) {
            this.f5532j = c2024c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2014a1.this.m34692r(this.f5532j);
            C2014a1.this.m34694p();
        }
    }

    public C2014a1(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        mo34574e(interfaceC2013a0, z, interfaceC2381b);
        this.f5519b = C2055l.m34422j();
        this.f5520c = C2055l.m34418n();
        this.f5522e = new C5722d("SdkClickHandler");
    }

    /* renamed from: n */
    private Map<String, String> m34696n() {
        HashMap hashMap = new HashMap();
        C2085t0.m34315l(hashMap, "sent_at", C2043h1.f5688b.format(Long.valueOf(System.currentTimeMillis())));
        int size = this.f5521d.size() - 1;
        if (size > 0) {
            C2085t0.m34317j(hashMap, "queue_size", size);
        }
        return hashMap;
    }

    /* renamed from: o */
    private void m34695o(C2024c c2024c) {
        this.f5519b.mo34444b("Retrying sdk_click package for the %d time", Integer.valueOf(c2024c.m34669r()));
        mo34575d(c2024c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m34694p() {
        this.f5522e.submit(new RunnableC2018d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m34693q() {
        InterfaceC2013a0 interfaceC2013a0 = this.f5523f.get();
        if (interfaceC2013a0.mo34703z() == null || interfaceC2013a0.mo34703z().f5593m || this.f5518a || this.f5521d.isEmpty()) {
            return;
        }
        C2024c remove = this.f5521d.remove(0);
        int m34671p = remove.m34671p();
        RunnableC2019e runnableC2019e = new RunnableC2019e(remove);
        if (m34671p <= 0) {
            runnableC2019e.run();
            return;
        }
        long m34512H = C2043h1.m34512H(m34671p, this.f5520c);
        this.f5519b.mo34439g("Waiting for %s seconds before retrying sdk_click for the %d time", C2043h1.f5687a.format(m34512H / 1000.0d), Integer.valueOf(m34671p));
        this.f5522e.mo24609b(runnableC2019e, m34512H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m34692r(C2024c c2024c) {
        boolean z;
        boolean z2;
        String str;
        long j;
        long j2;
        long j3;
        long j4;
        String str2;
        String str3;
        Boolean bool;
        boolean z3;
        long j5;
        String str4;
        InterfaceC2013a0 interfaceC2013a0 = this.f5523f.get();
        String str5 = c2024c.m34674m().get("source");
        if (str5 != null && str5.equals("reftag")) {
            z = true;
        } else {
            z = false;
        }
        String str6 = c2024c.m34674m().get("raw_referrer");
        if (z && new C2032e1(interfaceC2013a0.getContext()).m34602l(str6, c2024c.m34684c()) == null) {
            return;
        }
        if (str5 != null && str5.equals("install_referrer")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = c2024c.m34683d();
            j3 = c2024c.m34677j();
            str = c2024c.m34674m().get("referrer");
            j4 = c2024c.m34682e();
            long m34676k = c2024c.m34676k();
            String m34675l = c2024c.m34675l();
            bool = c2024c.m34678i();
            str3 = c2024c.m34674m().get("referrer_api");
            j2 = m34676k;
            str2 = m34675l;
        } else {
            str = null;
            j = -1;
            j2 = -1;
            j3 = -1;
            j4 = -1;
            str2 = null;
            str3 = null;
            bool = null;
        }
        String str7 = str2;
        if (str5 != null && str5.equals("preinstall")) {
            z3 = true;
        } else {
            z3 = false;
        }
        C2114z0 mo33548a = this.f5524g.mo33548a(c2024c, m34696n());
        if (!(mo33548a instanceof C2023b1)) {
            return;
        }
        C2023b1 c2023b1 = (C2023b1) mo33548a;
        if (c2023b1.f5953b) {
            m34695o(c2024c);
        } else if (interfaceC2013a0 == null) {
        } else {
            if (c2023b1.f5959h == EnumC2035f1.OPTED_OUT) {
                interfaceC2013a0.mo34728J();
                return;
            }
            if (z) {
                j5 = j2;
                new C2032e1(interfaceC2013a0.getContext()).m34592v(str6, c2024c.m34684c());
            } else {
                j5 = j2;
            }
            if (z2) {
                c2023b1.f5551p = j;
                c2023b1.f5552q = j3;
                c2023b1.f5553r = str;
                c2023b1.f5554s = j4;
                c2023b1.f5555t = j5;
                c2023b1.f5556u = str7;
                c2023b1.f5557v = bool;
                c2023b1.f5558w = str3;
                c2023b1.f5550o = true;
            }
            if (z3 && (str4 = c2024c.m34674m().get("found_location")) != null && !str4.isEmpty()) {
                C2032e1 c2032e1 = new C2032e1(interfaceC2013a0.getContext());
                if ("system_installer_referrer".equalsIgnoreCase(str4)) {
                    c2032e1.m34594t();
                } else {
                    c2032e1.m34615G(C2105w0.m34233k(str4, c2032e1.m34605i()));
                }
            }
            interfaceC2013a0.mo34720i(c2023b1);
        }
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: a */
    public void mo34578a() {
        this.f5519b.mo34439g("SdkClickHandler teardown", new Object[0]);
        InterfaceC5732h interfaceC5732h = this.f5522e;
        if (interfaceC5732h != null) {
            interfaceC5732h.mo24610a();
        }
        List<C2024c> list = this.f5521d;
        if (list != null) {
            list.clear();
        }
        WeakReference<InterfaceC2013a0> weakReference = this.f5523f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5519b = null;
        this.f5521d = null;
        this.f5520c = null;
        this.f5522e = null;
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: b */
    public void mo34577b() {
        this.f5518a = true;
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: c */
    public void mo34576c() {
        this.f5518a = false;
        m34694p();
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: d */
    public void mo34575d(C2024c c2024c) {
        this.f5522e.submit(new RunnableC2015a(c2024c));
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: e */
    public void mo34574e(InterfaceC2013a0 interfaceC2013a0, boolean z, InterfaceC2381b interfaceC2381b) {
        this.f5518a = !z;
        this.f5521d = new ArrayList();
        this.f5523f = new WeakReference<>(interfaceC2013a0);
        this.f5524g = interfaceC2381b;
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: f */
    public void mo34573f() {
        this.f5522e.submit(new RunnableC2016b());
    }

    @Override // p021b1.InterfaceC2034f0
    /* renamed from: g */
    public void mo34572g(String str, String str2) {
        this.f5522e.submit(new RunnableC2017c(str, str2));
    }
}
