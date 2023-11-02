package p021b1;

import android.content.Context;
import com.discord.BuildConfig;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicBoolean;
import p054d1.C5722d;
import p054d1.C5735j;
import p054d1.InterfaceC5729f;
import p358u1.InterfaceC12816a;

/* renamed from: b1.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2037g0 implements InvocationHandler {

    /* renamed from: a */
    private int f5635a = 3000;

    /* renamed from: b */
    private int f5636b;

    /* renamed from: c */
    private final AtomicBoolean f5637c;

    /* renamed from: d */
    private InterfaceC2025c0 f5638d;

    /* renamed from: e */
    private Object f5639e;

    /* renamed from: f */
    private Context f5640f;

    /* renamed from: g */
    private C5735j f5641g;

    /* renamed from: h */
    private final InterfaceC2050i0 f5642h;

    /* renamed from: i */
    private Object f5643i;

    /* renamed from: j */
    private InterfaceC5729f f5644j;

    /* renamed from: b1.g0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2038a implements Runnable {
        RunnableC2038a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2037g0.this.m34552s();
        }
    }

    /* renamed from: b1.g0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC2039b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Object f5646j;

        /* renamed from: k */
        final /* synthetic */ Method f5647k;

        /* renamed from: l */
        final /* synthetic */ Object[] f5648l;

        RunnableC2039b(Object obj, Method method, Object[] objArr) {
            this.f5646j = obj;
            this.f5647k = method;
            this.f5648l = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C2037g0.this.m34555p(this.f5646j, this.f5647k, this.f5648l);
            } catch (Throwable th2) {
                C2037g0.this.f5638d.mo34444b("invoke error (%s) thrown by (%s)", th2.getMessage(), th2.getClass().getCanonicalName());
            }
        }
    }

    public C2037g0(Context context, InterfaceC2050i0 interfaceC2050i0) {
        InterfaceC2025c0 m34422j = C2055l.m34422j();
        this.f5638d = m34422j;
        this.f5643i = m34567d(context, interfaceC2050i0, m34422j);
        this.f5640f = context;
        this.f5637c = new AtomicBoolean(true);
        this.f5636b = 0;
        this.f5641g = new C5735j(new RunnableC2038a(), "InstallReferrer");
        this.f5642h = interfaceC2050i0;
        this.f5644j = new C5722d("InstallReferrer");
    }

    /* renamed from: c */
    private void m34568c() {
        Object obj = this.f5639e;
        if (obj == null) {
            return;
        }
        try {
            C2109y0.m34189i(obj, "endConnection", null, new Object[0]);
            this.f5638d.mo34443c("Install Referrer API connection closed", new Object[0]);
        } catch (Exception e) {
            this.f5638d.mo34444b("closeReferrerClient error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
        }
        this.f5639e = null;
    }

    /* renamed from: d */
    private Object m34567d(Context context, InterfaceC2050i0 interfaceC2050i0, InterfaceC2025c0 interfaceC2025c0) {
        return C2109y0.m34195c("com.adjust.sdk.play.InstallReferrer", new Class[]{Context.class, InterfaceC2050i0.class, InterfaceC2025c0.class}, context, interfaceC2050i0, interfaceC2025c0);
    }

    /* renamed from: e */
    private Object m34566e(Context context) {
        try {
            return C2109y0.m34189i(C2109y0.m34187k("com.android.installreferrer.api.InstallReferrerClient", "newBuilder", new Class[]{Context.class}, context), "build", null, new Object[0]);
        } catch (ClassNotFoundException e) {
            this.f5638d.mo34445a("InstallReferrer not integrated in project (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        } catch (Exception e2) {
            this.f5638d.mo34444b("createInstallReferrerClient error (%s) from (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: f */
    private Object m34565f(Class cls) {
        try {
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
        } catch (IllegalArgumentException unused) {
            this.f5638d.mo34444b("InstallReferrer proxy violating parameter restrictions", new Object[0]);
            return null;
        } catch (NullPointerException unused2) {
            this.f5638d.mo34444b("Null argument passed to InstallReferrer proxy", new Object[0]);
            return null;
        }
    }

    /* renamed from: g */
    private Boolean m34564g(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return Boolean.valueOf(((Boolean) C2109y0.m34189i(obj, "getGooglePlayInstantParam", null, new Object[0])).booleanValue());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: h */
    private long m34563h(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C2109y0.m34189i(obj, "getInstallBeginTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e) {
            this.f5638d.mo34444b("getInstallBeginTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    /* renamed from: i */
    private long m34562i(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C2109y0.m34189i(obj, "getInstallBeginTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: j */
    private Object m34561j() {
        Object obj = this.f5639e;
        if (obj == null) {
            return null;
        }
        try {
            return C2109y0.m34189i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e) {
            this.f5638d.mo34444b("getInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: k */
    private Class m34560k() {
        return InterfaceC12816a.class;
    }

    /* renamed from: l */
    private long m34559l(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C2109y0.m34189i(obj, "getReferrerClickTimestampSeconds", null, new Object[0])).longValue();
        } catch (Exception e) {
            this.f5638d.mo34444b("getReferrerClickTimestampSeconds error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return -1L;
        }
    }

    /* renamed from: m */
    private long m34558m(Object obj) {
        if (obj == null) {
            return -1L;
        }
        try {
            return ((Long) C2109y0.m34189i(obj, "getReferrerClickTimestampServerSeconds", null, new Object[0])).longValue();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: n */
    private String m34557n(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) C2109y0.m34189i(obj, "getInstallReferrer", null, new Object[0]);
        } catch (Exception e) {
            this.f5638d.mo34444b("getStringInstallReferrer error (%s) thrown by (%s)", e.getMessage(), e.getClass().getCanonicalName());
            return null;
        }
    }

    /* renamed from: o */
    private String m34556o(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return (String) C2109y0.m34189i(obj, "getInstallVersion", null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public Object m34555p(Object obj, Method method, Object[] objArr) {
        if (method == null) {
            this.f5638d.mo34444b("InstallReferrer invoke method null", new Object[0]);
            return null;
        }
        String name = method.getName();
        if (name == null) {
            this.f5638d.mo34444b("InstallReferrer invoke method name null", new Object[0]);
            return null;
        }
        this.f5638d.mo34443c("InstallReferrer invoke method name: %s", name);
        if (objArr == null) {
            this.f5638d.mo34445a("InstallReferrer invoke args null", new Object[0]);
            objArr = new Object[0];
        }
        for (Object obj2 : objArr) {
            this.f5638d.mo34443c("InstallReferrer invoke arg: %s", obj2);
        }
        if (name.equals("onInstallReferrerSetupFinished")) {
            if (objArr.length != 1) {
                this.f5638d.mo34444b("InstallReferrer invoke onInstallReferrerSetupFinished args lenght not 1: %d", Integer.valueOf(objArr.length));
                return null;
            }
            Object obj3 = objArr[0];
            if (!(obj3 instanceof Integer)) {
                this.f5638d.mo34444b("InstallReferrer invoke onInstallReferrerSetupFinished arg not int", new Object[0]);
                return null;
            }
            Integer num = (Integer) obj3;
            if (num == null) {
                this.f5638d.mo34444b("InstallReferrer invoke onInstallReferrerSetupFinished responseCode arg is null", new Object[0]);
                return null;
            }
            m34554q(num.intValue());
        } else if (name.equals("onInstallReferrerServiceDisconnected")) {
            this.f5638d.mo34443c("Connection to install referrer service was lost. Retrying ...", new Object[0]);
            m34553r();
        }
        return null;
    }

    /* renamed from: q */
    private void m34554q(int i) {
        boolean z = true;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            this.f5638d.mo34443c("Unexpected response code of install referrer response: %d. Closing connection", Integer.valueOf(i));
                        } else {
                            this.f5638d.mo34443c("Install Referrer API general errors caused by incorrect usage. Retrying...", new Object[0]);
                        }
                    } else {
                        this.f5638d.mo34443c("Install Referrer API not supported by the installed Play Store app. Closing connection", new Object[0]);
                    }
                } else {
                    this.f5638d.mo34443c("Could not initiate connection to the Install Referrer service. Retrying...", new Object[0]);
                }
            } else {
                try {
                    Object m34561j = m34561j();
                    String m34557n = m34557n(m34561j);
                    long m34559l = m34559l(m34561j);
                    long m34563h = m34563h(m34561j);
                    this.f5638d.mo34443c("installReferrer: %s, clickTime: %d, installBeginTime: %d", m34557n, Long.valueOf(m34559l), Long.valueOf(m34563h));
                    String m34556o = m34556o(m34561j);
                    long m34558m = m34558m(m34561j);
                    long m34562i = m34562i(m34561j);
                    Boolean m34564g = m34564g(m34561j);
                    this.f5638d.mo34443c("installVersion: %s, clickTimeServer: %d, installBeginServer: %d, googlePlayInstant: %b", m34556o, Long.valueOf(m34558m), Long.valueOf(m34562i), m34564g);
                    this.f5638d.mo34443c("Install Referrer read successfully. Closing connection", new Object[0]);
                    this.f5642h.mo34446a(new C2107x0(m34557n, m34559l, m34563h, m34558m, m34562i, m34556o, m34564g), BuildConfig.FLAVOR);
                } catch (Exception e) {
                    this.f5638d.mo34445a("Couldn't get install referrer from client (%s). Retrying...", e.getMessage());
                }
            }
            z = false;
        } else {
            this.f5638d.mo34443c("Play Store service is not connected now. Retrying...", new Object[0]);
        }
        if (z) {
            m34553r();
            return;
        }
        this.f5637c.set(false);
        m34568c();
    }

    /* renamed from: r */
    private void m34553r() {
        if (!this.f5637c.get()) {
            this.f5638d.mo34443c("Should not try to read Install referrer", new Object[0]);
            m34568c();
        } else if (this.f5636b + 1 > 2) {
            this.f5638d.mo34443c("Limit number of retry of %d for install referrer surpassed", 2);
        } else {
            long m24595g = this.f5641g.m24595g();
            if (m24595g > 0) {
                this.f5638d.mo34443c("Already waiting to retry to read install referrer in %d milliseconds", Long.valueOf(m24595g));
                return;
            }
            int i = this.f5636b + 1;
            this.f5636b = i;
            this.f5638d.mo34443c("Retry number %d to connect to install referrer API", Integer.valueOf(i));
            this.f5641g.m24594h(this.f5635a);
        }
    }

    /* renamed from: t */
    private void m34551t(Class cls, Object obj) {
        try {
            C2109y0.m34189i(this.f5639e, "startConnection", new Class[]{cls}, obj);
        } catch (InvocationTargetException e) {
            if (C2043h1.m34511I(e)) {
                this.f5638d.mo34444b("InstallReferrer encountered an InvocationTargetException %s", C2043h1.m34517C(e));
            }
        } catch (Exception e2) {
            this.f5638d.mo34444b("startConnection error (%s) thrown by (%s)", e2.getMessage(), e2.getClass().getCanonicalName());
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        this.f5644j.submit(new RunnableC2039b(obj, method, objArr));
        return null;
    }

    /* renamed from: s */
    public void m34552s() {
        Class m34560k;
        Object m34565f;
        Object obj = this.f5643i;
        if (obj != null) {
            try {
                C2109y0.m34189i(obj, "startConnection", null, new Object[0]);
                return;
            } catch (Exception e) {
                this.f5638d.mo34444b("Call to Play startConnection error: %s", e.getMessage());
            }
        }
        if (!C2055l.m34411u()) {
            return;
        }
        m34568c();
        if (!this.f5637c.get()) {
            this.f5638d.mo34443c("Should not try to read Install referrer", new Object[0]);
            return;
        }
        Context context = this.f5640f;
        if (context == null) {
            return;
        }
        Object m34566e = m34566e(context);
        this.f5639e = m34566e;
        if (m34566e == null || (m34560k = m34560k()) == null || (m34565f = m34565f(m34560k)) == null) {
            return;
        }
        m34551t(m34560k, m34565f);
    }
}
