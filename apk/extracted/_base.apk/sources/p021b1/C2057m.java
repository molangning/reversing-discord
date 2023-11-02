package p021b1;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: b1.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2057m {

    /* renamed from: a */
    private String f5749a;

    /* renamed from: d */
    private InterfaceC2013a0 f5752d;

    /* renamed from: f */
    private String f5754f;

    /* renamed from: g */
    private String f5755g;

    /* renamed from: h */
    private String f5756h;

    /* renamed from: b */
    private Boolean f5750b = null;

    /* renamed from: c */
    private boolean f5751c = false;

    /* renamed from: e */
    private C2070m f5753e = new C2070m();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2058a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5757j;

        RunnableC2058a(Context context) {
            this.f5757j = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5757j).m34617E();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2059b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5759j;

        RunnableC2059b(Context context) {
            this.f5759j = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5759j).m34618D();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2060c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5761j;

        /* renamed from: k */
        final /* synthetic */ Uri f5762k;

        /* renamed from: l */
        final /* synthetic */ long f5763l;

        RunnableC2060c(Context context, Uri uri, long j) {
            this.f5761j = context;
            this.f5762k = uri;
            this.f5763l = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5761j).m34590x(this.f5762k, this.f5763l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2061d implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5765j;

        RunnableC2061d(Context context) {
            this.f5765j = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5765j).m34614H();
        }
    }

    /* renamed from: b1.m$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2062e implements InterfaceC2031e0 {

        /* renamed from: a */
        final /* synthetic */ String f5767a;

        /* renamed from: b */
        final /* synthetic */ String f5768b;

        C2062e(String str, String str2) {
            this.f5767a = str;
            this.f5768b = str2;
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34763t0(this.f5767a, this.f5768b);
        }
    }

    /* renamed from: b1.m$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2063f implements InterfaceC2031e0 {

        /* renamed from: a */
        final /* synthetic */ String f5770a;

        /* renamed from: b */
        final /* synthetic */ String f5771b;

        C2063f(String str, String str2) {
            this.f5770a = str;
            this.f5771b = str2;
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34761u0(this.f5770a, this.f5771b);
        }
    }

    /* renamed from: b1.m$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2064g implements InterfaceC2031e0 {

        /* renamed from: a */
        final /* synthetic */ String f5773a;

        C2064g(String str) {
            this.f5773a = str;
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34762t1(this.f5773a);
        }
    }

    /* renamed from: b1.m$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2065h implements InterfaceC2031e0 {

        /* renamed from: a */
        final /* synthetic */ String f5775a;

        C2065h(String str) {
            this.f5775a = str;
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34760u1(this.f5775a);
        }
    }

    /* renamed from: b1.m$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2066i implements InterfaceC2031e0 {
        C2066i() {
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34758v1();
        }
    }

    /* renamed from: b1.m$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2067j implements InterfaceC2031e0 {
        C2067j() {
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34756w1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2068k implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5779j;

        /* renamed from: k */
        final /* synthetic */ String f5780k;

        /* renamed from: l */
        final /* synthetic */ long f5781l;

        RunnableC2068k(Context context, String str, long j) {
            this.f5779j = context;
            this.f5780k = str;
            this.f5781l = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5779j).m34621A(this.f5780k, this.f5781l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.m$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2069l implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Context f5783j;

        /* renamed from: k */
        final /* synthetic */ String f5784k;

        RunnableC2069l(Context context, String str) {
            this.f5783j = context;
            this.f5784k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            new C2032e1(this.f5783j).m34588z(this.f5784k);
        }
    }

    /* renamed from: b1.m$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C2070m {

        /* renamed from: a */
        public List<InterfaceC2031e0> f5786a = new ArrayList();

        /* renamed from: b */
        public List<C2082s> f5787b = new ArrayList();

        /* renamed from: c */
        public Boolean f5788c = null;
    }

    /* renamed from: E */
    private void m34397E(Context context) {
        C2043h1.m34486d0(new RunnableC2061d(context));
    }

    /* renamed from: d */
    private boolean m34385d(String str) {
        return m34384e(str, false);
    }

    /* renamed from: e */
    private boolean m34384e(String str, boolean z) {
        if (this.f5752d != null) {
            return true;
        }
        if (str == null) {
            C2055l.m34422j().mo34444b("Adjust not initialized correctly", new Object[0]);
            return false;
        }
        if (z) {
            C2055l.m34422j().mo34445a("Adjust not initialized, but %s saved for launch", str);
        } else {
            C2055l.m34422j().mo34445a("Adjust not initialized, can't perform %s", str);
        }
        return false;
    }

    /* renamed from: f */
    private boolean m34383f(boolean z, String str, String str2) {
        if (z) {
            return m34384e(str, true);
        }
        return m34384e(str2, true);
    }

    /* renamed from: m */
    private boolean m34376m() {
        Boolean bool = this.f5750b;
        return bool == null || bool.booleanValue();
    }

    /* renamed from: u */
    private void m34368u(Uri uri, long j, Context context) {
        C2043h1.m34486d0(new RunnableC2060c(context, uri, j));
    }

    /* renamed from: v */
    private void m34367v(Context context) {
        C2043h1.m34486d0(new RunnableC2059b(context));
    }

    /* renamed from: w */
    private void m34366w(Context context) {
        C2043h1.m34486d0(new RunnableC2058a(context));
    }

    /* renamed from: x */
    private void m34365x(String str, Context context) {
        C2043h1.m34486d0(new RunnableC2069l(context, str));
    }

    /* renamed from: y */
    private void m34364y(String str, long j, Context context) {
        C2043h1.m34486d0(new RunnableC2068k(context, str, j));
    }

    /* renamed from: A */
    public void m34401A(String str, Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null && str.length() != 0) {
            m34364y(str, currentTimeMillis, context);
            if (m34384e("referrer", true) && this.f5752d.isEnabled()) {
                this.f5752d.mo34730H();
                return;
            }
            return;
        }
        C2055l.m34422j().mo34445a("Skipping INSTALL_REFERRER intent referrer processing (null or empty)", new Object[0]);
    }

    /* renamed from: B */
    public void m34400B(boolean z) {
        this.f5750b = Boolean.valueOf(z);
        if (m34383f(z, "enabled mode", "disabled mode")) {
            this.f5752d.setEnabled(z);
        }
    }

    /* renamed from: C */
    public void m34399C(boolean z) {
        if (!m34383f(z, "offline mode", "online mode")) {
            this.f5751c = z;
        } else {
            this.f5752d.mo34706w(z);
        }
    }

    /* renamed from: D */
    public void m34398D(String str, Context context) {
        m34365x(str, context);
        if (m34384e("push token", true) && this.f5752d.isEnabled()) {
            this.f5752d.mo34717l(str, true);
        }
    }

    /* renamed from: F */
    public void m34396F(C2080r c2080r) {
        String str = c2080r.f5814e;
        if (str != null) {
            this.f5754f = str;
        }
        String str2 = c2080r.f5815f;
        if (str2 != null) {
            this.f5755g = str2;
        }
        String str3 = c2080r.f5816g;
        if (str3 != null) {
            this.f5756h = str3;
        }
        String str4 = c2080r.f5811b;
        if (str4 != null) {
            C2055l.m34410v(str4);
        }
        String str5 = c2080r.f5812c;
        if (str5 != null) {
            C2055l.m34409w(str5);
        }
        String str6 = c2080r.f5813d;
        if (str6 != null) {
            C2055l.m34437A(str6);
        }
        Long l = c2080r.f5817h;
        if (l != null) {
            C2055l.m34435C(l.longValue());
        }
        if (c2080r.f5818i != null) {
            C2055l.m34434D(c2080r.f5817h.longValue());
        }
        Long l2 = c2080r.f5819j;
        if (l2 != null) {
            C2055l.m34406z(l2.longValue());
        }
        Long l3 = c2080r.f5820k;
        if (l3 != null) {
            C2055l.m34436B(l3.longValue());
        }
        Boolean bool = c2080r.f5822m;
        if (bool != null) {
            C2055l.m34433E(bool.booleanValue());
        }
        if (c2080r.f5823n != null) {
            EnumC2104w enumC2104w = EnumC2104w.NO_WAIT;
            C2055l.m34408x(enumC2104w);
            C2055l.m34407y(enumC2104w);
        }
        Boolean bool2 = c2080r.f5824o;
        if (bool2 != null && bool2.booleanValue()) {
            C2055l.m34430b();
        }
        Boolean bool3 = c2080r.f5825p;
        if (bool3 != null && bool3.booleanValue()) {
            C2055l.m34431a();
        }
    }

    /* renamed from: G */
    public void m34395G() {
        if (!m34385d("teardown")) {
            return;
        }
        this.f5752d.mo34727a();
        this.f5752d = null;
    }

    /* renamed from: H */
    public void m34394H(C2033f c2033f) {
        if (!m34385d("trackAdRevenue")) {
            return;
        }
        this.f5752d.mo34733E(c2033f);
    }

    /* renamed from: I */
    public void m34393I(String str, JSONObject jSONObject) {
        if (!m34385d("trackAdRevenue")) {
            return;
        }
        this.f5752d.mo34713p(str, jSONObject);
    }

    /* renamed from: J */
    public void m34392J(C2049i c2049i) {
        if (!m34385d("trackEvent")) {
            return;
        }
        this.f5752d.mo34734D(c2049i);
    }

    /* renamed from: K */
    public void m34391K(boolean z) {
        if (!m34384e("measurement consent", true)) {
            this.f5753e.f5788c = Boolean.valueOf(z);
            return;
        }
        this.f5752d.mo34723f(z);
    }

    /* renamed from: L */
    public void m34390L(C2072n c2072n) {
        if (!m34385d("trackPlayStoreSubscription")) {
            return;
        }
        this.f5752d.mo34714o(c2072n);
    }

    /* renamed from: M */
    public void m34389M(C2082s c2082s) {
        if (!m34384e("third party sharing", true)) {
            this.f5753e.f5787b.add(c2082s);
        } else {
            this.f5752d.mo34722g(c2082s);
        }
    }

    /* renamed from: a */
    public void m34388a(String str, String str2) {
        if (m34384e("adding session callback parameter", true)) {
            this.f5752d.mo34710s(str, str2);
        } else {
            this.f5753e.f5786a.add(new C2062e(str, str2));
        }
    }

    /* renamed from: b */
    public void m34387b(String str, String str2) {
        if (m34384e("adding session partner parameter", true)) {
            this.f5752d.mo34737A(str, str2);
        } else {
            this.f5753e.f5786a.add(new C2063f(str, str2));
        }
    }

    /* renamed from: c */
    public void m34386c(Uri uri, Context context) {
        if (uri != null && uri.toString().length() != 0) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!m34384e("appWillOpenUrl", true)) {
                m34368u(uri, currentTimeMillis, context);
                return;
            } else {
                this.f5752d.mo34708u(uri, currentTimeMillis);
                return;
            }
        }
        C2055l.m34422j().mo34445a("Skipping deep link processing (null or empty)", new Object[0]);
    }

    /* renamed from: g */
    public void m34382g(Context context) {
        if (!m34384e("disable third party sharing", true)) {
            m34367v(context);
        } else {
            this.f5752d.mo34709t();
        }
    }

    /* renamed from: h */
    public void m34381h(Context context) {
        m34366w(context);
        if (m34384e("gdpr", true) && this.f5752d.isEnabled()) {
            this.f5752d.mo34704y();
        }
    }

    /* renamed from: i */
    public String m34380i() {
        if (!m34385d("getAdid")) {
            return null;
        }
        return this.f5752d.mo34718k();
    }

    /* renamed from: j */
    public C2036g m34379j() {
        if (!m34385d("getAttribution")) {
            return null;
        }
        return this.f5752d.mo34725d();
    }

    /* renamed from: k */
    public String m34378k() {
        return C2043h1.m34514F();
    }

    /* renamed from: l */
    public boolean m34377l() {
        if (!m34385d("isEnabled")) {
            return m34376m();
        }
        return this.f5752d.isEnabled();
    }

    /* renamed from: n */
    public void m34375n(C2041h c2041h) {
        if (c2041h == null) {
            C2055l.m34422j().mo34444b("AdjustConfig missing", new Object[0]);
        } else if (!c2041h.m34544e()) {
            C2055l.m34422j().mo34444b("AdjustConfig not initialized correctly", new Object[0]);
        } else if (this.f5752d != null) {
            C2055l.m34422j().mo34444b("Adjust already initialized", new Object[0]);
        } else {
            c2041h.f5677u = this.f5753e;
            c2041h.f5680x = this.f5749a;
            c2041h.f5681y = this.f5750b;
            c2041h.f5682z = this.f5751c;
            c2041h.f5657a = this.f5754f;
            c2041h.f5658b = this.f5755g;
            c2041h.f5659c = this.f5756h;
            this.f5752d = C2055l.m34429c(c2041h);
            m34397E(c2041h.f5660d);
        }
    }

    /* renamed from: o */
    public void m34374o() {
        if (!m34385d("onPause")) {
            return;
        }
        this.f5752d.mo34736B();
    }

    /* renamed from: p */
    public void m34373p() {
        if (!m34385d("onResume")) {
            return;
        }
        this.f5752d.mo34726b();
    }

    /* renamed from: q */
    public void m34372q(String str) {
        if (m34384e("removing session callback parameter", true)) {
            this.f5752d.mo34707v(str);
        } else {
            this.f5753e.f5786a.add(new C2064g(str));
        }
    }

    /* renamed from: r */
    public void m34371r(String str) {
        if (m34384e("removing session partner parameter", true)) {
            this.f5752d.mo34721h(str);
        } else {
            this.f5753e.f5786a.add(new C2065h(str));
        }
    }

    /* renamed from: s */
    public void m34370s() {
        if (m34384e("resetting session callback parameters", true)) {
            this.f5752d.mo34729I();
        } else {
            this.f5753e.f5786a.add(new C2066i());
        }
    }

    /* renamed from: t */
    public void m34369t() {
        if (m34384e("resetting session partner parameters", true)) {
            this.f5752d.mo34719j();
        } else {
            this.f5753e.f5786a.add(new C2067j());
        }
    }

    /* renamed from: z */
    public void m34363z() {
        if (!m34385d("sendFirstPackages")) {
            return;
        }
        this.f5752d.mo34711r();
    }
}
