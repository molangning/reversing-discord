package p021b1;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Process;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;
import p034c1.C2379a;
import p034c1.C2384d;
import p054d1.C5722d;
import p054d1.C5733i;
import p054d1.C5735j;
import p054d1.InterfaceC5729f;

/* renamed from: b1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1967a implements InterfaceC2013a0 {

    /* renamed from: q */
    private static long f5411q;

    /* renamed from: r */
    private static long f5412r;

    /* renamed from: s */
    private static long f5413s;

    /* renamed from: t */
    private static long f5414t;

    /* renamed from: u */
    private static long f5415u;

    /* renamed from: a */
    private InterfaceC5729f f5416a;

    /* renamed from: b */
    private InterfaceC2028d0 f5417b;

    /* renamed from: c */
    private C2027d f5418c;

    /* renamed from: d */
    private InterfaceC2025c0 f5419d;

    /* renamed from: e */
    private C5733i f5420e;

    /* renamed from: f */
    private C5735j f5421f;

    /* renamed from: g */
    private C5735j f5422g;

    /* renamed from: h */
    private C2005s0 f5423h;

    /* renamed from: i */
    private C2106x f5424i;

    /* renamed from: j */
    private C2041h f5425j;

    /* renamed from: k */
    private C2036g f5426k;

    /* renamed from: l */
    private InterfaceC2022b0 f5427l;

    /* renamed from: m */
    private InterfaceC2034f0 f5428m;

    /* renamed from: n */
    private C2026c1 f5429n;

    /* renamed from: o */
    private C2037g0 f5430o;

    /* renamed from: p */
    private C2042h0 f5431p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1968a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2107x0 f5432j;

        /* renamed from: k */
        final /* synthetic */ String f5433k;

        RunnableC1968a(C2107x0 c2107x0, String str) {
            this.f5432j = c2107x0;
            this.f5433k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34879A1(this.f5432j, this.f5433k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$a0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1969a0 implements Runnable {
        RunnableC1969a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34844P0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1970b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2108y f5436j;

        RunnableC1970b(C2108y c2108y) {
            this.f5436j = c2108y;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34801d1(this.f5436j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$b0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1971b0 implements Runnable {
        RunnableC1971b0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34759v0();
        }
    }

    /* renamed from: b1.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1972c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2023b1 f5439j;

        RunnableC1972c(C2023b1 c2023b1) {
            this.f5439j = c2023b1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34798e1(this.f5439j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$c0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1973c0 implements Runnable {
        RunnableC1973c0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.mo34711r();
        }
    }

    /* renamed from: b1.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1974d implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2029d1 f5442j;

        RunnableC1974d(C2029d1 c2029d1) {
            this.f5442j = c2029d1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34792g1(this.f5442j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$d0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1975d0 implements InterfaceC2050i0 {
        C1975d0() {
        }

        @Override // p021b1.InterfaceC2050i0
        /* renamed from: a */
        public void mo34446a(C2107x0 c2107x0, String str) {
            C1967a.this.m34750z1(c2107x0, str);
        }
    }

    /* renamed from: b1.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1976e implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2095v f5445j;

        RunnableC1976e(C2095v c2095v) {
            this.f5445j = c2095v;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34811a1(this.f5445j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$e0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1977e0 implements InterfaceC2050i0 {
        C1977e0() {
        }

        @Override // p021b1.InterfaceC2050i0
        /* renamed from: a */
        public void mo34446a(C2107x0 c2107x0, String str) {
            C1967a.this.m34750z1(c2107x0, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1978f implements Runnable {
        RunnableC1978f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34752y1();
        }
    }

    /* renamed from: b1.a$f0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1979f0 implements Runnable {
        RunnableC1979f0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34852M1();
            C1967a.this.m34865H1();
            C1967a.this.f5419d.mo34439g("Subsession end", new Object[0]);
            C1967a.this.m34847O0();
        }
    }

    /* renamed from: b1.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1980g implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5450j;

        /* renamed from: k */
        final /* synthetic */ String f5451k;

        RunnableC1980g(String str, String str2) {
            this.f5450j = str;
            this.f5451k = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34763t0(this.f5450j, this.f5451k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$g0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1981g0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2108y f5453j;

        RunnableC1981g0(C2108y c2108y) {
            this.f5453j = c2108y;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5425j == null || C1967a.this.f5425j.f5670n == null) {
                return;
            }
            C1967a.this.f5425j.f5670n.onFinishedEventTrackingSucceeded(this.f5453j.m34198c());
        }
    }

    /* renamed from: b1.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1982h implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5455j;

        /* renamed from: k */
        final /* synthetic */ String f5456k;

        RunnableC1982h(String str, String str2) {
            this.f5455j = str;
            this.f5456k = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34761u0(this.f5455j, this.f5456k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$h0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1983h0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2108y f5458j;

        RunnableC1983h0(C2108y c2108y) {
            this.f5458j = c2108y;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5425j == null || C1967a.this.f5425j.f5671o == null) {
                return;
            }
            C1967a.this.f5425j.f5671o.onFinishedEventTrackingFailed(this.f5458j.m34199b());
        }
    }

    /* renamed from: b1.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1984i implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5460j;

        RunnableC1984i(String str) {
            this.f5460j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34762t1(this.f5460j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$i0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1985i0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2029d1 f5462j;

        RunnableC1985i0(C2029d1 c2029d1) {
            this.f5462j = c2029d1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5425j == null || C1967a.this.f5425j.f5672p == null) {
                return;
            }
            C1967a.this.f5425j.f5672p.onFinishedSessionTrackingSucceeded(this.f5462j.m34654c());
        }
    }

    /* renamed from: b1.a$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1986j implements Runnable {
        RunnableC1986j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34826V0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$j0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1987j0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2029d1 f5465j;

        RunnableC1987j0(C2029d1 c2029d1) {
            this.f5465j = c2029d1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5425j == null || C1967a.this.f5425j.f5673q == null) {
                return;
            }
            C1967a.this.f5425j.f5673q.onFinishedSessionTrackingFailed(this.f5465j.m34655b());
        }
    }

    /* renamed from: b1.a$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1988k implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5467j;

        RunnableC1988k(String str) {
            this.f5467j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34760u1(this.f5467j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$k0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1989k0 implements Runnable {
        RunnableC1989k0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5425j == null || C1967a.this.f5425j.f5667k == null) {
                return;
            }
            C1967a.this.f5425j.f5667k.onAttributionChanged(C1967a.this.f5426k);
        }
    }

    /* renamed from: b1.a$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1990l implements Runnable {
        RunnableC1990l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34758v1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$l0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1991l0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Uri f5471j;

        /* renamed from: k */
        final /* synthetic */ Intent f5472k;

        RunnableC1991l0(Uri uri, Intent intent) {
            this.f5471j = uri;
            this.f5472k = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            if (C1967a.this.f5425j == null) {
                return;
            }
            if (C1967a.this.f5425j.f5674r != null) {
                z = C1967a.this.f5425j.f5674r.launchReceivedDeeplink(this.f5471j);
            } else {
                z = true;
            }
            if (z) {
                C1967a.this.m34808b1(this.f5472k, this.f5471j);
            }
        }
    }

    /* renamed from: b1.a$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1992m implements Runnable {
        RunnableC1992m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34756w1();
        }
    }

    /* renamed from: b1.a$m0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1993m0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2049i f5475j;

        RunnableC1993m0(C2049i c2049i) {
            this.f5475j = c2049i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1967a.this.f5423h.m34749a()) {
                C1967a.this.f5419d.mo34445a("Event tracked before first activity resumed.\nIf it was triggered in the Application class, it might timestamp or even send an install long before the user opens the app.\nPlease check https://github.com/adjust/android_sdk#can-i-trigger-an-event-at-application-launch for more information.", new Object[0]);
                C1967a.this.m34858K1();
            }
            C1967a.this.m34828U1(this.f5475j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1994n implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f5477j;

        /* renamed from: k */
        final /* synthetic */ String f5478k;

        RunnableC1994n(boolean z, String str) {
            this.f5477j = z;
            this.f5478k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f5477j) {
                new C2032e1(C1967a.this.getContext()).m34588z(this.f5478k);
            }
            if (C1967a.this.f5423h.m34749a()) {
                return;
            }
            C1967a.this.m34867G1(this.f5478k);
        }
    }

    /* renamed from: b1.a$n0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1995n0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f5480j;

        RunnableC1995n0(boolean z) {
            this.f5480j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34871E1(this.f5480j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1996o implements Runnable {
        RunnableC1996o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34838R0();
        }
    }

    /* renamed from: b1.a$o0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1997o0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f5483j;

        RunnableC1997o0(boolean z) {
            this.f5483j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34869F1(this.f5483j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1998p implements Runnable {
        RunnableC1998p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34850N0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$p0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1999p0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Uri f5486j;

        /* renamed from: k */
        final /* synthetic */ long f5487k;

        RunnableC1999p0(Uri uri, long j) {
            this.f5486j = uri;
            this.f5487k = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34768q1(this.f5486j, this.f5487k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2000q implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2082s f5489j;

        RunnableC2000q(C2082s c2082s) {
            this.f5489j = c2082s;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34816Y1(this.f5489j);
        }
    }

    /* renamed from: b1.a$q0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2001q0 implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f5491j;

        RunnableC2001q0(boolean z) {
            this.f5491j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34873D1(this.f5491j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2002r implements Runnable {

        /* renamed from: j */
        final /* synthetic */ boolean f5493j;

        RunnableC2002r(boolean z) {
            this.f5493j = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34825V1(this.f5493j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$r0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2003r0 implements Runnable {
        RunnableC2003r0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34875C1();
        }
    }

    /* renamed from: b1.a$s */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2004s implements Runnable {

        /* renamed from: j */
        final /* synthetic */ String f5496j;

        /* renamed from: k */
        final /* synthetic */ JSONObject f5497k;

        RunnableC2004s(String str, JSONObject jSONObject) {
            this.f5496j = str;
            this.f5497k = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34831T1(this.f5496j, this.f5497k);
        }
    }

    /* renamed from: b1.a$s0 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C2005s0 {

        /* renamed from: a */
        boolean f5499a;

        /* renamed from: b */
        boolean f5500b;

        /* renamed from: c */
        boolean f5501c;

        /* renamed from: d */
        boolean f5502d;

        /* renamed from: e */
        boolean f5503e;

        /* renamed from: f */
        boolean f5504f;

        /* renamed from: g */
        boolean f5505g;

        /* renamed from: h */
        boolean f5506h;

        /* renamed from: i */
        boolean f5507i;

        public C2005s0() {
        }

        /* renamed from: a */
        public boolean m34749a() {
            return !this.f5506h;
        }

        /* renamed from: b */
        public boolean m34748b() {
            return this.f5506h;
        }

        /* renamed from: c */
        public boolean m34747c() {
            return this.f5507i;
        }

        /* renamed from: d */
        public boolean m34746d() {
            return !this.f5505g;
        }

        /* renamed from: e */
        public boolean m34745e() {
            return this.f5499a;
        }

        /* renamed from: f */
        public boolean m34744f() {
            return this.f5504f;
        }

        /* renamed from: g */
        public boolean m34743g() {
            return this.f5501c;
        }

        /* renamed from: h */
        public boolean m34742h() {
            return this.f5502d;
        }

        /* renamed from: i */
        public boolean m34741i() {
            return !this.f5501c;
        }

        /* renamed from: j */
        public boolean m34740j() {
            return !this.f5502d;
        }

        /* renamed from: k */
        public boolean m34739k() {
            return this.f5500b;
        }

        /* renamed from: l */
        public boolean m34738l() {
            return this.f5503e;
        }
    }

    /* renamed from: b1.a$t */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2006t implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2033f f5509j;

        RunnableC2006t(C2033f c2033f) {
            this.f5509j = c2033f;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34834S1(this.f5509j);
        }
    }

    /* renamed from: b1.a$u */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2007u implements Runnable {
        RunnableC2007u() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34866H0();
            C1967a.this.m34855L1();
            C1967a.this.m34861J1();
            C1967a.this.f5419d.mo34439g("Subsession start", new Object[0]);
            C1967a.this.m34858K1();
        }
    }

    /* renamed from: b1.a$v */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2008v implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C2072n f5512j;

        RunnableC2008v(C2072n c2072n) {
            this.f5512j = c2072n;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34819X1(this.f5512j);
        }
    }

    /* renamed from: b1.a$w */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2009w implements Runnable {
        RunnableC2009w() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34832T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$x */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2010x implements Runnable {
        RunnableC2010x() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34841Q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$y */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC2011y implements Runnable {
        RunnableC2011y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1967a.this.m34757w0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b1.a$z */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C2012z implements InterfaceC2031e0 {
        C2012z() {
        }

        @Override // p021b1.InterfaceC2031e0
        /* renamed from: a */
        public void mo34362a(C1967a c1967a) {
            c1967a.m34871E1(C1967a.this.f5425j.f5681y.booleanValue());
        }
    }

    private C1967a(C2041h c2041h) {
        boolean z;
        mo34732F(c2041h);
        InterfaceC2025c0 m34422j = C2055l.m34422j();
        this.f5419d = m34422j;
        m34422j.mo34442d();
        this.f5416a = new C5722d("ActivityHandler");
        C2005s0 c2005s0 = new C2005s0();
        this.f5423h = c2005s0;
        Boolean bool = c2041h.f5681y;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        c2005s0.f5499a = z;
        C2005s0 c2005s02 = this.f5423h;
        c2005s02.f5500b = c2041h.f5682z;
        c2005s02.f5501c = true;
        c2005s02.f5502d = false;
        c2005s02.f5503e = false;
        c2005s02.f5505g = false;
        c2005s02.f5506h = false;
        c2005s02.f5507i = false;
        this.f5416a.submit(new RunnableC1986j());
    }

    /* renamed from: A0 */
    private void m34880A0(C2032e1 c2032e1) {
        String m34603k = c2032e1.m34603k();
        if (m34603k != null && !m34603k.equals(this.f5418c.f5605y)) {
            mo34717l(m34603k, true);
        }
        if (c2032e1.m34601m() != null) {
            mo34730H();
        }
        m34872E0();
        this.f5430o.m34552s();
        this.f5431p.m34520c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public void m34879A1(C2107x0 c2107x0, String str) {
        if (!m34823W0() || !m34817Y0(c2107x0) || C2043h1.m34500T(c2107x0, str, this.f5418c)) {
            return;
        }
        this.f5428m.mo34575d(C2094u0.m34274b(c2107x0, str, this.f5418c, this.f5425j, this.f5424i, this.f5429n));
    }

    /* renamed from: B0 */
    private void m34878B0() {
        if (!m34755x0(this.f5418c)) {
            return;
        }
        if (this.f5423h.m34744f() && this.f5423h.m34746d()) {
            return;
        }
        if (this.f5426k != null && !this.f5418c.f5595o) {
            return;
        }
        this.f5427l.mo34297d();
    }

    /* renamed from: B1 */
    private void m34877B1() {
        String m34604j;
        if (m34823W0() && !this.f5423h.m34749a() && (m34604j = new C2032e1(getContext()).m34604j()) != null && !m34604j.isEmpty()) {
            this.f5428m.mo34572g(m34604j, "system_installer_referrer");
        }
    }

    /* renamed from: C0 */
    private boolean m34876C0(C2049i c2049i) {
        if (c2049i == null) {
            this.f5419d.mo34444b("Event missing", new Object[0]);
            return false;
        } else if (!c2049i.m34450e()) {
            this.f5419d.mo34444b("Event not initialized correctly", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C1 */
    public void m34875C1() {
        if (!m34823W0() || this.f5423h.m34749a()) {
            return;
        }
        this.f5428m.mo34573f();
    }

    /* renamed from: D0 */
    private void m34874D0(C2023b1 c2023b1) {
        boolean z;
        if (!c2023b1.f5550o) {
            return;
        }
        String str = c2023b1.f5558w;
        boolean z2 = true;
        if (str != null && str.equalsIgnoreCase("huawei_ads")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2027d c2027d = this.f5418c;
            c2027d.f5586H = c2023b1.f5551p;
            c2027d.f5587I = c2023b1.f5552q;
            c2027d.f5588J = c2023b1.f5553r;
            m34791g2();
            return;
        }
        String str2 = c2023b1.f5558w;
        if (str2 == null || !str2.equalsIgnoreCase("huawei_app_gallery")) {
            z2 = false;
        }
        if (z2) {
            C2027d c2027d2 = this.f5418c;
            c2027d2.f5586H = c2023b1.f5551p;
            c2027d2.f5587I = c2023b1.f5552q;
            c2027d2.f5589K = c2023b1.f5553r;
            m34791g2();
            return;
        }
        C2027d c2027d3 = this.f5418c;
        c2027d3.f5579A = c2023b1.f5551p;
        c2027d3.f5580B = c2023b1.f5552q;
        c2027d3.f5581C = c2023b1.f5553r;
        c2027d3.f5583E = c2023b1.f5554s;
        c2027d3.f5584F = c2023b1.f5555t;
        c2027d3.f5585G = c2023b1.f5556u;
        c2027d3.f5582D = c2023b1.f5557v;
        m34791g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D1 */
    public void m34873D1(boolean z) {
        this.f5418c.f5595o = z;
        m34791g2();
    }

    /* renamed from: E0 */
    private void m34872E0() {
        C2027d c2027d = this.f5418c;
        if (c2027d == null || !c2027d.f5592l || c2027d.f5593m) {
            return;
        }
        m34877B1();
        if (!this.f5425j.f5653D || this.f5423h.m34747c()) {
            return;
        }
        String str = this.f5424i.f5920k;
        if (str != null && !str.isEmpty()) {
            C2032e1 c2032e1 = new C2032e1(getContext());
            long m34605i = c2032e1.m34605i();
            if (C2105w0.m34235i(m34605i)) {
                this.f5423h.f5507i = true;
                return;
            }
            if (C2105w0.m34234j("system_properties", m34605i)) {
                String m34241c = C2105w0.m34241c(this.f5424i.f5920k, this.f5419d);
                if (m34241c != null && !m34241c.isEmpty()) {
                    this.f5428m.mo34572g(m34241c, "system_properties");
                } else {
                    m34605i = C2105w0.m34233k("system_properties", m34605i);
                }
            }
            if (C2105w0.m34234j("system_properties_reflection", m34605i)) {
                String m34238f = C2105w0.m34238f(this.f5424i.f5920k, this.f5419d);
                if (m34238f != null && !m34238f.isEmpty()) {
                    this.f5428m.mo34572g(m34238f, "system_properties_reflection");
                } else {
                    m34605i = C2105w0.m34233k("system_properties_reflection", m34605i);
                }
            }
            if (C2105w0.m34234j("system_properties_path", m34605i)) {
                String m34240d = C2105w0.m34240d(this.f5424i.f5920k, this.f5419d);
                if (m34240d != null && !m34240d.isEmpty()) {
                    this.f5428m.mo34572g(m34240d, "system_properties_path");
                } else {
                    m34605i = C2105w0.m34233k("system_properties_path", m34605i);
                }
            }
            if (C2105w0.m34234j("system_properties_path_reflection", m34605i)) {
                String m34239e = C2105w0.m34239e(this.f5424i.f5920k, this.f5419d);
                if (m34239e != null && !m34239e.isEmpty()) {
                    this.f5428m.mo34572g(m34239e, "system_properties_path_reflection");
                } else {
                    m34605i = C2105w0.m34233k("system_properties_path_reflection", m34605i);
                }
            }
            if (C2105w0.m34234j("content_provider", m34605i)) {
                String m34243a = C2105w0.m34243a(this.f5425j.f5660d, this.f5424i.f5920k, this.f5419d);
                if (m34243a != null && !m34243a.isEmpty()) {
                    this.f5428m.mo34572g(m34243a, "content_provider");
                } else {
                    m34605i = C2105w0.m34233k("content_provider", m34605i);
                }
            }
            if (C2105w0.m34234j("content_provider_intent_action", m34605i)) {
                List<String> m34237g = C2105w0.m34237g(this.f5425j.f5660d, this.f5424i.f5920k, this.f5419d);
                if (m34237g != null && !m34237g.isEmpty()) {
                    for (String str2 : m34237g) {
                        this.f5428m.mo34572g(str2, "content_provider_intent_action");
                    }
                } else {
                    m34605i = C2105w0.m34233k("content_provider_intent_action", m34605i);
                }
            }
            if (C2105w0.m34234j("content_provider_no_permission", m34605i)) {
                List<String> m34236h = C2105w0.m34236h(this.f5425j.f5660d, this.f5424i.f5920k, this.f5419d);
                if (m34236h != null && !m34236h.isEmpty()) {
                    for (String str3 : m34236h) {
                        this.f5428m.mo34572g(str3, "content_provider_no_permission");
                    }
                } else {
                    m34605i = C2105w0.m34233k("content_provider_no_permission", m34605i);
                }
            }
            if (C2105w0.m34234j("file_system", m34605i)) {
                String m34242b = C2105w0.m34242b(this.f5424i.f5920k, this.f5425j.f5656G, this.f5419d);
                if (m34242b != null && !m34242b.isEmpty()) {
                    this.f5428m.mo34572g(m34242b, "file_system");
                } else {
                    m34605i = C2105w0.m34233k("file_system", m34605i);
                }
            }
            c2032e1.m34615G(m34605i);
            this.f5423h.f5507i = true;
            return;
        }
        this.f5419d.mo34443c("Can't read preinstall payload, invalid package name", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E1 */
    public void m34871E1(boolean z) {
        C2027d c2027d;
        if (!m34829U0(m34823W0(), z, "Adjust already enabled", "Adjust already disabled")) {
            return;
        }
        if (z && (c2027d = this.f5418c) != null && c2027d.f5593m) {
            this.f5419d.mo34444b("Re-enabling SDK not possible for forgotten user", new Object[0]);
            return;
        }
        C2005s0 c2005s0 = this.f5423h;
        c2005s0.f5499a = z;
        if (c2005s0.m34749a()) {
            m34794f2(!z, "Handlers will start as paused due to the SDK being disabled", "Handlers will still start as paused", "Handlers will start as active due to the SDK being enabled");
            return;
        }
        this.f5418c.f5592l = z;
        m34791g2();
        if (z) {
            C2032e1 c2032e1 = new C2032e1(getContext());
            if (c2032e1.m34608f()) {
                m34838R0();
            } else {
                if (c2032e1.m34609e()) {
                    m34850N0();
                }
                for (C2082s c2082s : this.f5425j.f5677u.f5787b) {
                    m34816Y1(c2082s);
                }
                Boolean bool = this.f5425j.f5677u.f5788c;
                if (bool != null) {
                    m34825V1(bool.booleanValue());
                }
                this.f5425j.f5677u.f5787b = new ArrayList();
                this.f5425j.f5677u.f5788c = null;
            }
            if (!c2032e1.m34607g()) {
                this.f5419d.mo34443c("Detected that install was not tracked at enable time", new Object[0]);
                m34822W1(System.currentTimeMillis());
            }
            m34880A0(c2032e1);
        }
        m34794f2(!z, "Pausing handlers due to SDK being disabled", "Handlers remain paused", "Resuming handlers due to SDK being enabled");
    }

    /* renamed from: F0 */
    private boolean m34870F0(String str) {
        if (str != null && !str.isEmpty()) {
            if (this.f5418c.m34658c(str)) {
                this.f5419d.mo34438h("Skipping duplicated order ID '%s'", str);
                return false;
            }
            this.f5418c.m34659b(str);
            this.f5419d.mo34439g("Added order ID '%s'", str);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F1 */
    public void m34869F1(boolean z) {
        if (!m34829U0(this.f5423h.m34739k(), z, "Adjust already in offline mode", "Adjust already in online mode")) {
            return;
        }
        C2005s0 c2005s0 = this.f5423h;
        c2005s0.f5500b = z;
        if (c2005s0.m34749a()) {
            m34794f2(z, "Handlers will start paused due to SDK being offline", "Handlers will still start as paused", "Handlers will start as active due to SDK being online");
        } else {
            m34794f2(z, "Pausing handlers to put SDK offline mode", "Handlers remain paused", "Resuming handlers to put SDK in online mode");
        }
    }

    /* renamed from: G0 */
    private Intent m34868G0(Uri uri) {
        Intent intent;
        if (this.f5425j.f5669m == null) {
            intent = new Intent("android.intent.action.VIEW", uri);
        } else {
            C2041h c2041h = this.f5425j;
            intent = new Intent("android.intent.action.VIEW", uri, c2041h.f5660d, c2041h.f5669m);
        }
        intent.setFlags(268435456);
        intent.setPackage(this.f5425j.f5660d.getPackageName());
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G1 */
    public void m34867G1(String str) {
        if (!m34755x0(this.f5418c) || !m34823W0()) {
            return;
        }
        C2027d c2027d = this.f5418c;
        if (c2027d.f5593m || str == null || str.equals(c2027d.f5605y)) {
            return;
        }
        this.f5418c.f5605y = str;
        m34791g2();
        C2024c m34307t = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34307t("push");
        this.f5417b.mo34263f(m34307t);
        new C2032e1(getContext()).m34593u();
        if (this.f5425j.f5665i) {
            this.f5419d.mo34438h("Buffered event %s", m34307t.m34670q());
        } else {
            this.f5417b.mo34262g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H0 */
    public void m34866H0() {
        double d;
        if (this.f5423h.m34740j() || m34820X0()) {
            return;
        }
        Double d2 = this.f5425j.f5676t;
        if (d2 != null) {
            d = d2.doubleValue();
        } else {
            d = 0.0d;
        }
        long m34421k = C2055l.m34421k();
        long j = (long) (1000.0d * d);
        if (j > m34421k) {
            double d3 = m34421k / 1000;
            DecimalFormat decimalFormat = C2043h1.f5687a;
            this.f5419d.mo34445a("Delay start of %s seconds bigger than max allowed value of %s seconds", decimalFormat.format(d), decimalFormat.format(d3));
            d = d3;
        } else {
            m34421k = j;
        }
        this.f5419d.mo34438h("Waiting %s seconds before starting first session", C2043h1.f5687a.format(d));
        this.f5422g.m24594h(m34421k);
        this.f5423h.f5503e = true;
        C2027d c2027d = this.f5418c;
        if (c2027d != null) {
            c2027d.f5603w = true;
            m34791g2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H1 */
    public void m34865H1() {
        if (this.f5421f == null || !m34840Q1() || this.f5421f.m24595g() > 0) {
            return;
        }
        this.f5421f.m24594h(f5413s);
    }

    /* renamed from: I0 */
    public static boolean m34864I0(Context context) {
        return context.deleteFile("AdjustIoActivityState");
    }

    /* renamed from: I1 */
    private void m34863I1() {
        this.f5418c = new C2027d();
        this.f5423h.f5506h = true;
        m34800d2();
        long currentTimeMillis = System.currentTimeMillis();
        C2032e1 c2032e1 = new C2032e1(getContext());
        this.f5418c.f5605y = c2032e1.m34603k();
        if (this.f5423h.m34745e()) {
            if (c2032e1.m34608f()) {
                m34838R0();
            } else {
                if (c2032e1.m34609e()) {
                    m34850N0();
                }
                for (C2082s c2082s : this.f5425j.f5677u.f5787b) {
                    m34816Y1(c2082s);
                }
                Boolean bool = this.f5425j.f5677u.f5788c;
                if (bool != null) {
                    m34825V1(bool.booleanValue());
                }
                this.f5425j.f5677u.f5787b = new ArrayList();
                this.f5425j.f5677u.f5788c = null;
                this.f5418c.f5597q = 1;
                m34813Z1(currentTimeMillis);
                m34880A0(c2032e1);
            }
        }
        this.f5418c.m34657d(currentTimeMillis);
        this.f5418c.f5592l = this.f5423h.m34745e();
        this.f5418c.f5603w = this.f5423h.m34738l();
        m34791g2();
        c2032e1.m34593u();
        c2032e1.m34595s();
        c2032e1.m34596r();
        m34778l1();
    }

    /* renamed from: J0 */
    public static boolean m34862J0(Context context) {
        return context.deleteFile("AdjustAttribution");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J1 */
    public void m34861J1() {
        if (!m34823W0()) {
            return;
        }
        this.f5420e.m24604e();
    }

    /* renamed from: K0 */
    public static boolean m34859K0(Context context) {
        return context.deleteFile("AdjustSessionCallbackParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K1 */
    public void m34858K1() {
        if (this.f5423h.m34749a()) {
            C2078q.m34345d(this.f5425j.f5678v);
            m34863I1();
        } else if (!this.f5418c.f5592l) {
        } else {
            C2078q.m34345d(this.f5425j.f5678v);
            m34800d2();
            m34776m1();
            m34878B0();
            m34778l1();
        }
    }

    /* renamed from: L0 */
    public static boolean m34856L0(Context context) {
        return context.deleteFile("AdjustSessionPartnerParameters");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L1 */
    public void m34855L1() {
        C5735j c5735j = this.f5421f;
        if (c5735j == null) {
            return;
        }
        c5735j.m24597e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M0 */
    public static void m34853M0(Context context) {
        m34864I0(context);
        m34862J0(context);
        m34859K0(context);
        m34856L0(context);
        new C2032e1(context).m34613a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M1 */
    public void m34852M1() {
        this.f5420e.m24603f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N0 */
    public void m34850N0() {
        C2032e1 c2032e1 = new C2032e1(getContext());
        c2032e1.m34618D();
        if (!m34755x0(this.f5418c) || !m34823W0()) {
            return;
        }
        C2027d c2027d = this.f5418c;
        if (c2027d.f5593m || c2027d.f5594n) {
            return;
        }
        c2027d.f5594n = true;
        m34791g2();
        C2024c m34310q = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34310q();
        this.f5417b.mo34263f(m34310q);
        c2032e1.m34596r();
        if (this.f5425j.f5665i) {
            this.f5419d.mo34438h("Buffered event %s", m34310q.m34670q());
        } else {
            this.f5417b.mo34262g();
        }
    }

    /* renamed from: N1 */
    private void m34849N1() {
        synchronized (C2027d.class) {
            if (this.f5418c == null) {
                return;
            }
            this.f5418c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public void m34847O0() {
        if (!m34840Q1()) {
            m34789h1();
        }
        if (m34810a2(System.currentTimeMillis())) {
            m34791g2();
        }
    }

    /* renamed from: O1 */
    private void m34846O1() {
        synchronized (C2026c1.class) {
            if (this.f5429n == null) {
                return;
            }
            this.f5429n = null;
        }
    }

    /* renamed from: P1 */
    private void m34843P1() {
        synchronized (C2036g.class) {
            if (this.f5426k == null) {
                return;
            }
            this.f5426k = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m34841Q0() {
        if (!m34823W0()) {
            m34852M1();
            return;
        }
        if (m34840Q1()) {
            this.f5417b.mo34262g();
        }
        if (m34810a2(System.currentTimeMillis())) {
            m34791g2();
        }
    }

    /* renamed from: Q1 */
    private boolean m34840Q1() {
        return m34837R1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public void m34838R0() {
        if (!m34755x0(this.f5418c) || !m34823W0()) {
            return;
        }
        C2027d c2027d = this.f5418c;
        if (c2027d.f5593m) {
            return;
        }
        c2027d.f5593m = true;
        m34791g2();
        C2024c m34308s = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34308s();
        this.f5417b.mo34263f(m34308s);
        new C2032e1(getContext()).m34595s();
        if (this.f5425j.f5665i) {
            this.f5419d.mo34438h("Buffered event %s", m34308s.m34670q());
        } else {
            this.f5417b.mo34262g();
        }
    }

    /* renamed from: R1 */
    private boolean m34837R1(boolean z) {
        if (m34786i1(z)) {
            return false;
        }
        if (this.f5425j.f5675s) {
            return true;
        }
        return this.f5423h.m34741i();
    }

    /* renamed from: S0 */
    public static C1967a m34835S0(C2041h c2041h) {
        if (c2041h == null) {
            C2055l.m34422j().mo34444b("AdjustConfig missing", new Object[0]);
            return null;
        } else if (!c2041h.m34544e()) {
            C2055l.m34422j().mo34444b("AdjustConfig not initialized correctly", new Object[0]);
            return null;
        } else {
            if (c2041h.f5663g != null) {
                int myPid = Process.myPid();
                ActivityManager activityManager = (ActivityManager) c2041h.f5660d.getSystemService("activity");
                if (activityManager == null) {
                    return null;
                }
                Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (!next.processName.equalsIgnoreCase(c2041h.f5663g)) {
                            C2055l.m34422j().mo34438h("Skipping initialization in background process (%s)", next.processName);
                            return null;
                        }
                    }
                }
            }
            return new C1967a(c2041h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S1 */
    public void m34834S1(C2033f c2033f) {
        if (!m34755x0(this.f5418c) || !m34823W0() || !m34753y0(c2033f) || this.f5418c.f5593m) {
            return;
        }
        this.f5417b.mo34263f(new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34314m(c2033f, this.f5423h.m34742h()));
        this.f5417b.mo34262g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public void m34832T0() {
        this.f5418c.f5593m = true;
        m34791g2();
        this.f5417b.flush();
        m34871E1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T1 */
    public void m34831T1(String str, JSONObject jSONObject) {
        if (!m34755x0(this.f5418c) || !m34823W0() || this.f5418c.f5593m) {
            return;
        }
        this.f5417b.mo34263f(new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34313n(str, jSONObject));
        this.f5417b.mo34262g();
    }

    /* renamed from: U0 */
    private boolean m34829U0(boolean z, boolean z2, String str, String str2) {
        if (z != z2) {
            return true;
        }
        if (z) {
            this.f5419d.mo34443c(str, new Object[0]);
        } else {
            this.f5419d.mo34443c(str2, new Object[0]);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U1 */
    public void m34828U1(C2049i c2049i) {
        if (!m34755x0(this.f5418c) || !m34823W0() || !m34876C0(c2049i) || !m34870F0(c2049i.f5702f) || this.f5418c.f5593m) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f5418c.f5596p++;
        m34810a2(currentTimeMillis);
        C2024c m34309r = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, currentTimeMillis).m34309r(c2049i, this.f5423h.m34742h());
        this.f5417b.mo34263f(m34309r);
        if (this.f5425j.f5665i) {
            this.f5419d.mo34438h("Buffered event %s", m34309r.m34670q());
        } else {
            this.f5417b.mo34262g();
        }
        if (this.f5425j.f5675s && this.f5423h.m34743g()) {
            m34865H1();
        }
        m34791g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public void m34826V0() {
        Double d;
        f5414t = C2055l.m34416p();
        f5415u = C2055l.m34414r();
        f5411q = C2055l.m34413s();
        f5412r = C2055l.m34412t();
        f5413s = C2055l.m34413s();
        m34772o1(this.f5425j.f5660d);
        m34774n1(this.f5425j.f5660d);
        this.f5429n = new C2026c1();
        m34766r1(this.f5425j.f5660d);
        m34764s1(this.f5425j.f5660d);
        C2041h c2041h = this.f5425j;
        if (c2041h.f5681y != null) {
            c2041h.f5677u.f5786a.add(new C2012z());
        }
        if (this.f5423h.m34748b()) {
            C2005s0 c2005s0 = this.f5423h;
            C2027d c2027d = this.f5418c;
            c2005s0.f5499a = c2027d.f5592l;
            c2005s0.f5503e = c2027d.f5603w;
            c2005s0.f5504f = false;
        } else {
            this.f5423h.f5504f = true;
        }
        m34770p1(this.f5425j.f5660d);
        C2041h c2041h2 = this.f5425j;
        this.f5424i = new C2106x(c2041h2.f5660d, c2041h2.f5664h);
        if (this.f5425j.f5665i) {
            this.f5419d.mo34438h("Event buffering is enabled", new Object[0]);
        }
        this.f5424i.m34226A(this.f5425j.f5660d);
        if (this.f5424i.f5910a == null) {
            this.f5419d.mo34445a("Unable to get Google Play Services Advertising ID at start time", new Object[0]);
            C2106x c2106x = this.f5424i;
            if (c2106x.f5915f == null && c2106x.f5916g == null && c2106x.f5917h == null) {
                this.f5419d.mo34444b("Unable to get any device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
            }
        } else {
            this.f5419d.mo34438h("Google Play Services Advertising ID read correctly at start time", new Object[0]);
        }
        String str = this.f5425j.f5666j;
        if (str != null) {
            this.f5419d.mo34438h("Default tracker: '%s'", str);
        }
        String str2 = this.f5425j.f5680x;
        if (str2 != null) {
            this.f5419d.mo34438h("Push token: '%s'", str2);
            if (this.f5423h.m34748b()) {
                mo34717l(this.f5425j.f5680x, false);
            } else {
                new C2032e1(getContext()).m34588z(this.f5425j.f5680x);
            }
        } else if (this.f5423h.m34748b()) {
            mo34717l(new C2032e1(getContext()).m34603k(), true);
        }
        if (this.f5423h.m34748b()) {
            C2032e1 c2032e1 = new C2032e1(getContext());
            if (c2032e1.m34608f()) {
                mo34704y();
            } else {
                if (c2032e1.m34609e()) {
                    mo34709t();
                }
                for (C2082s c2082s : this.f5425j.f5677u.f5787b) {
                    mo34722g(c2082s);
                }
                Boolean bool = this.f5425j.f5677u.f5788c;
                if (bool != null) {
                    mo34723f(bool.booleanValue());
                }
                this.f5425j.f5677u.f5787b = new ArrayList();
                this.f5425j.f5677u.f5788c = null;
            }
        }
        this.f5420e = new C5733i(new RunnableC1969a0(), f5412r, f5411q, "Foreground timer");
        if (this.f5425j.f5675s) {
            this.f5419d.mo34438h("Send in background configured", new Object[0]);
            this.f5421f = new C5735j(new RunnableC1971b0(), "Background timer");
        }
        if (this.f5423h.m34749a() && (d = this.f5425j.f5676t) != null && d.doubleValue() > 0.0d) {
            this.f5419d.mo34438h("Delay start configured", new Object[0]);
            this.f5423h.f5502d = true;
            this.f5422g = new C5735j(new RunnableC1973c0(), "Delay Start timer");
        }
        C2384d.m33534f(this.f5425j.f5679w);
        C2041h c2041h3 = this.f5425j;
        this.f5417b = C2055l.m34420l(this, this.f5425j.f5660d, m34837R1(false), new C2379a(c2041h3.f5655F, c2041h3.f5657a, c2041h3.f5658b, c2041h3.f5659c, this.f5424i.f5919j));
        C2041h c2041h4 = this.f5425j;
        this.f5427l = C2055l.m34428d(this, m34837R1(false), new C2379a(c2041h4.f5655F, c2041h4.f5657a, c2041h4.f5658b, c2041h4.f5659c, this.f5424i.f5919j));
        C2041h c2041h5 = this.f5425j;
        this.f5428m = C2055l.m34417o(this, m34837R1(true), new C2379a(c2041h5.f5655F, c2041h5.f5657a, c2041h5.f5658b, c2041h5.f5659c, this.f5424i.f5919j));
        if (m34820X0()) {
            m34797e2();
        }
        this.f5430o = new C2037g0(this.f5425j.f5660d, new C1975d0());
        this.f5431p = new C2042h0(this.f5425j.f5660d, new C1977e0());
        m34783j1(this.f5425j.f5677u.f5786a);
        m34875C1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V1 */
    public void m34825V1(boolean z) {
        if (!m34755x0(this.f5418c)) {
            this.f5425j.f5677u.f5788c = Boolean.valueOf(z);
        } else if (!m34823W0() || this.f5418c.f5593m) {
        } else {
            C2024c m34306u = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34306u(z);
            this.f5417b.mo34263f(m34306u);
            if (this.f5425j.f5665i) {
                this.f5419d.mo34438h("Buffered event %s", m34306u.m34670q());
            } else {
                this.f5417b.mo34262g();
            }
        }
    }

    /* renamed from: W0 */
    private boolean m34823W0() {
        C2027d c2027d = this.f5418c;
        if (c2027d != null) {
            return c2027d.f5592l;
        }
        return this.f5423h.m34745e();
    }

    /* renamed from: W1 */
    private void m34822W1(long j) {
        C2027d c2027d = this.f5418c;
        c2027d.f5597q++;
        c2027d.f5602v = j - c2027d.f5601u;
        m34813Z1(j);
        this.f5418c.m34657d(j);
        m34791g2();
    }

    /* renamed from: X0 */
    private boolean m34820X0() {
        C2027d c2027d = this.f5418c;
        if (c2027d != null) {
            return c2027d.f5603w;
        }
        return this.f5423h.m34738l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X1 */
    public void m34819X1(C2072n c2072n) {
        if (!m34755x0(this.f5418c) || !m34823W0() || this.f5418c.f5593m) {
            return;
        }
        this.f5417b.mo34263f(new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34304w(c2072n, this.f5423h.m34742h()));
        this.f5417b.mo34262g();
    }

    /* renamed from: Y0 */
    private boolean m34817Y0(C2107x0 c2107x0) {
        String str;
        if (c2107x0 == null || (str = c2107x0.f5936a) == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m34816Y1(C2082s c2082s) {
        if (!m34755x0(this.f5418c)) {
            this.f5425j.f5677u.f5787b.add(c2082s);
        } else if (!m34823W0() || this.f5418c.f5593m) {
        } else {
            C2024c m34303x = new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, System.currentTimeMillis()).m34303x(c2082s);
            this.f5417b.mo34263f(m34303x);
            if (this.f5425j.f5665i) {
                this.f5419d.mo34438h("Buffered event %s", m34303x.m34670q());
            } else {
                this.f5417b.mo34262g();
            }
        }
    }

    /* renamed from: Z0 */
    private void m34814Z0(Handler handler) {
        if (this.f5425j.f5667k == null) {
            return;
        }
        handler.post(new RunnableC1989k0());
    }

    /* renamed from: Z1 */
    private void m34813Z1(long j) {
        this.f5417b.mo34263f(new C2085t0(this.f5425j, this.f5424i, this.f5418c, this.f5429n, j).m34305v(this.f5423h.m34742h()));
        this.f5417b.mo34262g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public void m34811a1(C2095v c2095v) {
        m34807b2(c2095v.f5954c);
        Handler handler = new Handler(this.f5425j.f5660d.getMainLooper());
        if (m34803c2(c2095v.f5960i)) {
            m34814Z0(handler);
        }
        m34780k1(c2095v.f5875o, handler);
    }

    /* renamed from: a2 */
    private boolean m34810a2(long j) {
        if (!m34755x0(this.f5418c)) {
            return false;
        }
        C2027d c2027d = this.f5418c;
        long j2 = j - c2027d.f5601u;
        if (j2 > f5414t) {
            return false;
        }
        c2027d.f5601u = j;
        if (j2 < 0) {
            this.f5419d.mo34444b("Time travel!", new Object[0]);
            return true;
        }
        c2027d.f5599s += j2;
        c2027d.f5600t += j2;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public void m34808b1(Intent intent, Uri uri) {
        boolean z;
        if (this.f5425j.f5660d.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f5419d.mo34444b("Unable to open deferred deep link (%s)", uri);
            return;
        }
        this.f5419d.mo34438h("Open deferred deep link (%s)", uri);
        this.f5425j.f5660d.startActivity(intent);
    }

    /* renamed from: b2 */
    private void m34807b2(String str) {
        if (str == null || str.equals(this.f5418c.f5606z)) {
            return;
        }
        this.f5418c.f5606z = str;
        m34791g2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public void m34801d1(C2108y c2108y) {
        m34807b2(c2108y.f5954c);
        Handler handler = new Handler(this.f5425j.f5660d.getMainLooper());
        boolean z = c2108y.f5952a;
        if (z && this.f5425j.f5670n != null) {
            this.f5419d.mo34443c("Launching success event tracking listener", new Object[0]);
            handler.post(new RunnableC1981g0(c2108y));
        } else if (!z && this.f5425j.f5671o != null) {
            this.f5419d.mo34443c("Launching failed event tracking listener", new Object[0]);
            handler.post(new RunnableC1983h0(c2108y));
        }
    }

    /* renamed from: d2 */
    private void m34800d2() {
        if (!m34840Q1()) {
            m34789h1();
            return;
        }
        m34754x1();
        if (!this.f5425j.f5665i || (this.f5423h.m34744f() && this.f5423h.m34746d())) {
            this.f5417b.mo34262g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public void m34798e1(C2023b1 c2023b1) {
        m34807b2(c2023b1.f5954c);
        Handler handler = new Handler(this.f5425j.f5660d.getMainLooper());
        if (m34803c2(c2023b1.f5960i)) {
            m34814Z0(handler);
        }
    }

    /* renamed from: e2 */
    private void m34797e2() {
        this.f5417b.mo34264e(this.f5429n);
        this.f5423h.f5503e = false;
        C2027d c2027d = this.f5418c;
        if (c2027d != null) {
            c2027d.f5603w = false;
            m34791g2();
        }
    }

    /* renamed from: f1 */
    private void m34795f1(C2029d1 c2029d1, Handler handler) {
        boolean z = c2029d1.f5952a;
        if (z && this.f5425j.f5672p != null) {
            this.f5419d.mo34443c("Launching success session tracking listener", new Object[0]);
            handler.post(new RunnableC1985i0(c2029d1));
        } else if (!z && this.f5425j.f5673q != null) {
            this.f5419d.mo34443c("Launching failed session tracking listener", new Object[0]);
            handler.post(new RunnableC1987j0(c2029d1));
        }
    }

    /* renamed from: f2 */
    private void m34794f2(boolean z, String str, String str2, String str3) {
        if (z) {
            this.f5419d.mo34438h(str, new Object[0]);
        } else if (m34786i1(false)) {
            if (m34786i1(true)) {
                this.f5419d.mo34438h(str2, new Object[0]);
            } else {
                InterfaceC2025c0 interfaceC2025c0 = this.f5419d;
                interfaceC2025c0.mo34438h(str2 + ", except the Sdk Click Handler", new Object[0]);
            }
        } else {
            this.f5419d.mo34438h(str3, new Object[0]);
        }
        m34800d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public void m34792g1(C2029d1 c2029d1) {
        this.f5419d.mo34443c("Launching SessionResponse tasks", new Object[0]);
        m34807b2(c2029d1.f5954c);
        Handler handler = new Handler(this.f5425j.f5660d.getMainLooper());
        if (m34803c2(c2029d1.f5960i)) {
            m34814Z0(handler);
        }
        if (this.f5426k == null && !this.f5418c.f5595o) {
            this.f5427l.mo34297d();
        }
        if (c2029d1.f5952a) {
            new C2032e1(getContext()).m34616F();
        }
        m34795f1(c2029d1, handler);
        this.f5423h.f5505g = true;
    }

    /* renamed from: g2 */
    private void m34791g2() {
        synchronized (C2027d.class) {
            C2027d c2027d = this.f5418c;
            if (c2027d == null) {
                return;
            }
            C2043h1.m34478h0(c2027d, this.f5425j.f5660d, "AdjustIoActivityState", "Activity state");
        }
    }

    /* renamed from: h1 */
    private void m34789h1() {
        this.f5427l.mo34299b();
        this.f5417b.mo34267b();
        if (!m34837R1(true)) {
            this.f5428m.mo34577b();
        } else {
            this.f5428m.mo34576c();
        }
    }

    /* renamed from: h2 */
    private void m34788h2() {
        synchronized (C2036g.class) {
            C2036g c2036g = this.f5426k;
            if (c2036g == null) {
                return;
            }
            C2043h1.m34478h0(c2036g, this.f5425j.f5660d, "AdjustAttribution", "Attribution");
        }
    }

    /* renamed from: i1 */
    private boolean m34786i1(boolean z) {
        if (z) {
            if (!this.f5423h.m34739k() && m34823W0()) {
                return false;
            }
            return true;
        } else if (!this.f5423h.m34739k() && m34823W0() && !this.f5423h.m34742h()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: i2 */
    private void m34785i2() {
        synchronized (C2026c1.class) {
            C2026c1 c2026c1 = this.f5429n;
            if (c2026c1 == null) {
                return;
            }
            C2043h1.m34478h0(c2026c1.f5576a, this.f5425j.f5660d, "AdjustSessionCallbackParameters", "Session Callback parameters");
        }
    }

    /* renamed from: j1 */
    private void m34783j1(List<InterfaceC2031e0> list) {
        if (list == null) {
            return;
        }
        for (InterfaceC2031e0 interfaceC2031e0 : list) {
            interfaceC2031e0.mo34362a(this);
        }
    }

    /* renamed from: j2 */
    private void m34782j2() {
        synchronized (C2026c1.class) {
            C2026c1 c2026c1 = this.f5429n;
            if (c2026c1 == null) {
                return;
            }
            C2043h1.m34478h0(c2026c1.f5577b, this.f5425j.f5660d, "AdjustSessionPartnerParameters", "Session Partner parameters");
        }
    }

    /* renamed from: k1 */
    private void m34780k1(Uri uri, Handler handler) {
        if (uri == null) {
            return;
        }
        this.f5419d.mo34438h("Deferred deeplink received (%s)", uri);
        handler.post(new RunnableC1991l0(uri, m34868G0(uri)));
    }

    /* renamed from: l1 */
    private void m34778l1() {
        if (!m34755x0(this.f5418c)) {
            return;
        }
        C2032e1 c2032e1 = new C2032e1(getContext());
        String m34610d = c2032e1.m34610d();
        long m34611c = c2032e1.m34611c();
        if (m34610d == null || m34611c == -1) {
            return;
        }
        mo34708u(Uri.parse(m34610d), m34611c);
        c2032e1.m34597q();
    }

    /* renamed from: m1 */
    private void m34776m1() {
        if (this.f5418c.f5593m) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C2027d c2027d = this.f5418c;
        long j = currentTimeMillis - c2027d.f5601u;
        if (j < 0) {
            this.f5419d.mo34444b("Time travel!", new Object[0]);
            this.f5418c.f5601u = currentTimeMillis;
            m34791g2();
        } else if (j > f5414t) {
            m34822W1(currentTimeMillis);
            m34751z0();
        } else if (j > f5415u) {
            int i = c2027d.f5598r + 1;
            c2027d.f5598r = i;
            c2027d.f5599s += j;
            c2027d.f5601u = currentTimeMillis;
            this.f5419d.mo34439g("Started subsession %d of session %d", Integer.valueOf(i), Integer.valueOf(this.f5418c.f5597q));
            m34791g2();
            m34872E0();
            this.f5430o.m34552s();
            this.f5431p.m34520c();
        } else {
            this.f5419d.mo34439g("Time span since last activity too short for a new subsession", new Object[0]);
        }
    }

    /* renamed from: n1 */
    private void m34774n1(Context context) {
        try {
            this.f5418c = (C2027d) C2043h1.m34490b0(context, "AdjustIoActivityState", "Activity state", C2027d.class);
        } catch (Exception e) {
            this.f5419d.mo34444b("Failed to read %s file (%s)", "Activity state", e.getMessage());
            this.f5418c = null;
        }
        if (this.f5418c != null) {
            this.f5423h.f5506h = true;
        }
    }

    /* renamed from: o1 */
    private void m34772o1(Context context) {
        try {
            this.f5426k = (C2036g) C2043h1.m34490b0(context, "AdjustAttribution", "Attribution", C2036g.class);
        } catch (Exception e) {
            this.f5419d.mo34444b("Failed to read %s file (%s)", "Attribution", e.getMessage());
            this.f5426k = null;
        }
    }

    /* renamed from: p1 */
    private void m34770p1(Context context) {
        try {
            InputStream open = context.getAssets().open("adjust_config.properties");
            Properties properties = new Properties();
            properties.load(open);
            this.f5419d.mo34439g("adjust_config.properties file read and loaded", new Object[0]);
            String property = properties.getProperty("defaultTracker");
            if (property != null) {
                this.f5425j.f5666j = property;
            }
        } catch (Exception e) {
            this.f5419d.mo34443c("%s file not found in this app", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q1 */
    public void m34768q1(Uri uri, long j) {
        if (!m34823W0()) {
            return;
        }
        if (C2043h1.m34498V(uri)) {
            InterfaceC2025c0 interfaceC2025c0 = this.f5419d;
            interfaceC2025c0.mo34443c("Deep link (" + uri.toString() + ") processing skipped", new Object[0]);
            return;
        }
        C2024c m34275a = C2094u0.m34275a(uri, j, this.f5418c, this.f5425j, this.f5424i, this.f5429n);
        if (m34275a == null) {
            return;
        }
        this.f5428m.mo34575d(m34275a);
    }

    /* renamed from: r1 */
    private void m34766r1(Context context) {
        try {
            this.f5429n.f5576a = (Map) C2043h1.m34490b0(context, "AdjustSessionCallbackParameters", "Session Callback parameters", Map.class);
        } catch (Exception e) {
            this.f5419d.mo34444b("Failed to read %s file (%s)", "Session Callback parameters", e.getMessage());
            this.f5429n.f5576a = null;
        }
    }

    /* renamed from: s1 */
    private void m34764s1(Context context) {
        try {
            this.f5429n.f5577b = (Map) C2043h1.m34490b0(context, "AdjustSessionPartnerParameters", "Session Partner parameters", Map.class);
        } catch (Exception e) {
            this.f5419d.mo34444b("Failed to read %s file (%s)", "Session Partner parameters", e.getMessage());
            this.f5429n.f5577b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public void m34757w0() {
        if (m34840Q1()) {
            this.f5417b.mo34262g();
        }
    }

    /* renamed from: x0 */
    private boolean m34755x0(C2027d c2027d) {
        if (this.f5423h.m34749a()) {
            this.f5419d.mo34444b("Sdk did not yet start", new Object[0]);
            return false;
        }
        return true;
    }

    /* renamed from: x1 */
    private void m34754x1() {
        this.f5427l.mo34298c();
        this.f5417b.mo34266c();
        this.f5428m.mo34576c();
    }

    /* renamed from: y0 */
    private boolean m34753y0(C2033f c2033f) {
        if (c2033f == null) {
            this.f5419d.mo34444b("Ad revenue object missing", new Object[0]);
            return false;
        } else if (!c2033f.m34585c()) {
            this.f5419d.mo34444b("Ad revenue object not initialized correctly", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public void m34752y1() {
        if (this.f5423h.m34740j()) {
            this.f5419d.mo34438h("Start delay expired or never configured", new Object[0]);
            return;
        }
        m34797e2();
        this.f5423h.f5502d = false;
        this.f5422g.m24597e();
        this.f5422g = null;
        m34800d2();
    }

    /* renamed from: z0 */
    private void m34751z0() {
        m34880A0(new C2032e1(getContext()));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: A */
    public void mo34737A(String str, String str2) {
        this.f5416a.submit(new RunnableC1982h(str, str2));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: B */
    public void mo34736B() {
        this.f5423h.f5501c = true;
        this.f5416a.submit(new RunnableC1979f0());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: C */
    public C2041h mo34735C() {
        return this.f5425j;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: D */
    public void mo34734D(C2049i c2049i) {
        this.f5416a.submit(new RunnableC1993m0(c2049i));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: E */
    public void mo34733E(C2033f c2033f) {
        this.f5416a.submit(new RunnableC2006t(c2033f));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: F */
    public void mo34732F(C2041h c2041h) {
        this.f5425j = c2041h;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: G */
    public void mo34731G(C2029d1 c2029d1) {
        this.f5416a.submit(new RunnableC1974d(c2029d1));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: H */
    public void mo34730H() {
        this.f5416a.submit(new RunnableC2003r0());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: I */
    public void mo34729I() {
        this.f5416a.submit(new RunnableC1990l());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: J */
    public void mo34728J() {
        this.f5416a.submit(new RunnableC2009w());
    }

    /* renamed from: P0 */
    public void m34844P0() {
        this.f5416a.submit(new RunnableC2010x());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: a */
    public void mo34727a() {
        C5735j c5735j = this.f5421f;
        if (c5735j != null) {
            c5735j.m24593i();
        }
        C5733i c5733i = this.f5420e;
        if (c5733i != null) {
            c5733i.m24602g();
        }
        C5735j c5735j2 = this.f5422g;
        if (c5735j2 != null) {
            c5735j2.m24593i();
        }
        InterfaceC5729f interfaceC5729f = this.f5416a;
        if (interfaceC5729f != null) {
            interfaceC5729f.mo24610a();
        }
        InterfaceC2028d0 interfaceC2028d0 = this.f5417b;
        if (interfaceC2028d0 != null) {
            interfaceC2028d0.mo34268a();
        }
        InterfaceC2022b0 interfaceC2022b0 = this.f5427l;
        if (interfaceC2022b0 != null) {
            interfaceC2022b0.mo34300a();
        }
        InterfaceC2034f0 interfaceC2034f0 = this.f5428m;
        if (interfaceC2034f0 != null) {
            interfaceC2034f0.mo34578a();
        }
        C2026c1 c2026c1 = this.f5429n;
        if (c2026c1 != null) {
            Map<String, String> map = c2026c1.f5576a;
            if (map != null) {
                map.clear();
            }
            Map<String, String> map2 = this.f5429n.f5577b;
            if (map2 != null) {
                map2.clear();
            }
        }
        m34849N1();
        m34843P1();
        m34846O1();
        this.f5417b = null;
        this.f5419d = null;
        this.f5420e = null;
        this.f5416a = null;
        this.f5421f = null;
        this.f5422g = null;
        this.f5423h = null;
        this.f5424i = null;
        this.f5425j = null;
        this.f5427l = null;
        this.f5428m = null;
        this.f5429n = null;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: b */
    public void mo34726b() {
        this.f5423h.f5501c = false;
        this.f5416a.submit(new RunnableC2007u());
    }

    /* renamed from: c1 */
    public void m34804c1(C2108y c2108y) {
        this.f5416a.submit(new RunnableC1970b(c2108y));
    }

    /* renamed from: c2 */
    public boolean m34803c2(C2036g c2036g) {
        if (c2036g == null || c2036g.equals(this.f5426k)) {
            return false;
        }
        this.f5426k = c2036g;
        m34788h2();
        return true;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: d */
    public C2036g mo34725d() {
        return this.f5426k;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: e */
    public C2026c1 mo34724e() {
        return this.f5429n;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: f */
    public void mo34723f(boolean z) {
        this.f5416a.submit(new RunnableC2002r(z));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: g */
    public void mo34722g(C2082s c2082s) {
        this.f5416a.submit(new RunnableC2000q(c2082s));
    }

    @Override // p021b1.InterfaceC2013a0
    public Context getContext() {
        return this.f5425j.f5660d;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: h */
    public void mo34721h(String str) {
        this.f5416a.submit(new RunnableC1988k(str));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: i */
    public void mo34720i(C2114z0 c2114z0) {
        if (c2114z0 instanceof C2029d1) {
            this.f5419d.mo34443c("Finished tracking session", new Object[0]);
            this.f5427l.mo34294g((C2029d1) c2114z0);
        } else if (c2114z0 instanceof C2023b1) {
            C2023b1 c2023b1 = (C2023b1) c2114z0;
            m34874D0(c2023b1);
            this.f5427l.mo34295f(c2023b1);
        } else if (c2114z0 instanceof C2108y) {
            m34804c1((C2108y) c2114z0);
        }
    }

    @Override // p021b1.InterfaceC2013a0
    public boolean isEnabled() {
        return m34823W0();
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: j */
    public void mo34719j() {
        this.f5416a.submit(new RunnableC1992m());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: k */
    public String mo34718k() {
        C2027d c2027d = this.f5418c;
        if (c2027d == null) {
            return null;
        }
        return c2027d.f5606z;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: l */
    public void mo34717l(String str, boolean z) {
        this.f5416a.submit(new RunnableC1994n(z, str));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: m */
    public void mo34716m(C2095v c2095v) {
        this.f5416a.submit(new RunnableC1976e(c2095v));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: n */
    public void mo34715n(C2023b1 c2023b1) {
        this.f5416a.submit(new RunnableC1972c(c2023b1));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: o */
    public void mo34714o(C2072n c2072n) {
        this.f5416a.submit(new RunnableC2008v(c2072n));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: p */
    public void mo34713p(String str, JSONObject jSONObject) {
        this.f5416a.submit(new RunnableC2004s(str, jSONObject));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: q */
    public void mo34712q(boolean z) {
        this.f5416a.submit(new RunnableC2001q0(z));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: r */
    public void mo34711r() {
        this.f5416a.submit(new RunnableC1978f());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: s */
    public void mo34710s(String str, String str2) {
        this.f5416a.submit(new RunnableC1980g(str, str2));
    }

    @Override // p021b1.InterfaceC2013a0
    public void setEnabled(boolean z) {
        this.f5416a.submit(new RunnableC1995n0(z));
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: t */
    public void mo34709t() {
        this.f5416a.submit(new RunnableC1998p());
    }

    /* renamed from: t0 */
    public void m34763t0(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Session Callback") || !C2043h1.m34497W(str2, "value", "Session Callback")) {
            return;
        }
        C2026c1 c2026c1 = this.f5429n;
        if (c2026c1.f5576a == null) {
            c2026c1.f5576a = new LinkedHashMap();
        }
        String str3 = this.f5429n.f5576a.get(str);
        if (str2.equals(str3)) {
            this.f5419d.mo34439g("Key %s already present with the same value", str);
            return;
        }
        if (str3 != null) {
            this.f5419d.mo34445a("Key %s will be overwritten", str);
        }
        this.f5429n.f5576a.put(str, str2);
        m34785i2();
    }

    /* renamed from: t1 */
    public void m34762t1(String str) {
        if (!C2043h1.m34497W(str, "key", "Session Callback")) {
            return;
        }
        Map<String, String> map = this.f5429n.f5576a;
        if (map == null) {
            this.f5419d.mo34445a("Session Callback parameters are not set", new Object[0]);
        } else if (map.remove(str) == null) {
            this.f5419d.mo34445a("Key %s does not exist", str);
        } else {
            this.f5419d.mo34443c("Key %s will be removed", str);
            m34785i2();
        }
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: u */
    public void mo34708u(Uri uri, long j) {
        this.f5416a.submit(new RunnableC1999p0(uri, j));
    }

    /* renamed from: u0 */
    public void m34761u0(String str, String str2) {
        if (!C2043h1.m34497W(str, "key", "Session Partner") || !C2043h1.m34497W(str2, "value", "Session Partner")) {
            return;
        }
        C2026c1 c2026c1 = this.f5429n;
        if (c2026c1.f5577b == null) {
            c2026c1.f5577b = new LinkedHashMap();
        }
        String str3 = this.f5429n.f5577b.get(str);
        if (str2.equals(str3)) {
            this.f5419d.mo34439g("Key %s already present with the same value", str);
            return;
        }
        if (str3 != null) {
            this.f5419d.mo34445a("Key %s will be overwritten", str);
        }
        this.f5429n.f5577b.put(str, str2);
        m34782j2();
    }

    /* renamed from: u1 */
    public void m34760u1(String str) {
        if (!C2043h1.m34497W(str, "key", "Session Partner")) {
            return;
        }
        Map<String, String> map = this.f5429n.f5577b;
        if (map == null) {
            this.f5419d.mo34445a("Session Partner parameters are not set", new Object[0]);
        } else if (map.remove(str) == null) {
            this.f5419d.mo34445a("Key %s does not exist", str);
        } else {
            this.f5419d.mo34443c("Key %s will be removed", str);
            m34782j2();
        }
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: v */
    public void mo34707v(String str) {
        this.f5416a.submit(new RunnableC1984i(str));
    }

    /* renamed from: v0 */
    public void m34759v0() {
        this.f5416a.submit(new RunnableC2011y());
    }

    /* renamed from: v1 */
    public void m34758v1() {
        if (this.f5429n.f5576a == null) {
            this.f5419d.mo34445a("Session Callback parameters are not set", new Object[0]);
        }
        this.f5429n.f5576a = null;
        m34785i2();
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: w */
    public void mo34706w(boolean z) {
        this.f5416a.submit(new RunnableC1997o0(z));
    }

    /* renamed from: w1 */
    public void m34756w1() {
        if (this.f5429n.f5577b == null) {
            this.f5419d.mo34445a("Session Partner parameters are not set", new Object[0]);
        }
        this.f5429n.f5577b = null;
        m34782j2();
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: x */
    public C2106x mo34705x() {
        return this.f5424i;
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: y */
    public void mo34704y() {
        this.f5416a.submit(new RunnableC1996o());
    }

    @Override // p021b1.InterfaceC2013a0
    /* renamed from: z */
    public C2027d mo34703z() {
        return this.f5418c;
    }

    /* renamed from: z1 */
    public void m34750z1(C2107x0 c2107x0, String str) {
        this.f5416a.submit(new RunnableC1968a(c2107x0, str));
    }
}
