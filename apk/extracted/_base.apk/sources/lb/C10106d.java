package lb;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.collection.C0624a;
import androidx.core.p018os.C1074t;
import androidx.lifecycle.C1696m;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C4609a;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p029b9.C2190n;
import p029b9.C2198p;
import p065dc.C5811a;
import p119g9.C6580c;
import p119g9.C6587j;
import p119g9.C6588k;
import p247nb.C10533d;
import p247nb.C10540g;
import p247nb.C10550n;
import p247nb.C10564w;
import p367ub.InterfaceC12944c;
import p386vb.C13234g;
import p423xb.InterfaceC13776b;

/* renamed from: lb.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10106d {

    /* renamed from: k */
    private static final Object f26337k = new Object();

    /* renamed from: l */
    private static final Executor f26338l = new ExecutorC10110d();

    /* renamed from: m */
    static final Map<String, C10106d> f26339m = new C0624a();

    /* renamed from: a */
    private final Context f26340a;

    /* renamed from: b */
    private final String f26341b;

    /* renamed from: c */
    private final C10118k f26342c;

    /* renamed from: d */
    private final C10550n f26343d;

    /* renamed from: g */
    private final C10564w<C5811a> f26346g;

    /* renamed from: h */
    private final InterfaceC13776b<C13234g> f26347h;

    /* renamed from: e */
    private final AtomicBoolean f26344e = new AtomicBoolean(false);

    /* renamed from: f */
    private final AtomicBoolean f26345f = new AtomicBoolean();

    /* renamed from: i */
    private final List<InterfaceC10108b> f26348i = new CopyOnWriteArrayList();

    /* renamed from: j */
    private final List<Object> f26349j = new CopyOnWriteArrayList();

    /* renamed from: lb.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10108b {
        /* renamed from: a */
        void mo12281a(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(14)
    /* renamed from: lb.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10109c implements ComponentCallbacks2C4609a.InterfaceC4610a {

        /* renamed from: a */
        private static AtomicReference<C10109c> f26350a = new AtomicReference<>();

        private C10109c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static void m12278c(Context context) {
            if (C6587j.m22367a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f26350a.get() == null) {
                    C10109c c10109c = new C10109c();
                    if (C1696m.m36034a(f26350a, null, c10109c)) {
                        ComponentCallbacks2C4609a.m28227c(application);
                        ComponentCallbacks2C4609a.m28228b().m28229a(c10109c);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4609a.InterfaceC4610a
        /* renamed from: a */
        public void mo12280a(boolean z) {
            synchronized (C10106d.f26337k) {
                Iterator it = new ArrayList(C10106d.f26339m.values()).iterator();
                while (it.hasNext()) {
                    C10106d c10106d = (C10106d) it.next();
                    if (c10106d.f26344e.get()) {
                        c10106d.m12282x(z);
                    }
                }
            }
        }
    }

    /* renamed from: lb.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class ExecutorC10110d implements Executor {

        /* renamed from: j */
        private static final Handler f26351j = new Handler(Looper.getMainLooper());

        private ExecutorC10110d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f26351j.post(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(24)
    /* renamed from: lb.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10111e extends BroadcastReceiver {

        /* renamed from: b */
        private static AtomicReference<C10111e> f26352b = new AtomicReference<>();

        /* renamed from: a */
        private final Context f26353a;

        public C10111e(Context context) {
            this.f26353a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m12276b(Context context) {
            if (f26352b.get() == null) {
                C10111e c10111e = new C10111e(context);
                if (C1696m.m36034a(f26352b, null, c10111e)) {
                    context.registerReceiver(c10111e, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        /* renamed from: c */
        public void m12275c() {
            this.f26353a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (C10106d.f26337k) {
                for (C10106d c10106d : C10106d.f26339m.values()) {
                    c10106d.m12291o();
                }
            }
            m12275c();
        }
    }

    protected C10106d(final Context context, String str, C10118k c10118k) {
        this.f26340a = (Context) C2198p.m33985j(context);
        this.f26341b = C2198p.m33989f(str);
        this.f26342c = (C10118k) C2198p.m33985j(c10118k);
        C10550n m11255e = C10550n.m11271h(f26338l).m11256d(C10540g.m11284c(context, ComponentDiscoveryService.class).m11285b()).m11257c(new FirebaseCommonRegistrar()).m11258b(C10533d.m11295p(context, Context.class, new Class[0])).m11258b(C10533d.m11295p(this, C10106d.class, new Class[0])).m11258b(C10533d.m11295p(c10118k, C10118k.class, new Class[0])).m11255e();
        this.f26343d = m11255e;
        this.f26346g = new C10564w<>(new InterfaceC13776b() { // from class: lb.b
            @Override // p423xb.InterfaceC13776b
            public final Object get() {
                C5811a m12285u;
                m12285u = C10106d.this.m12285u(context);
                return m12285u;
            }
        });
        this.f26347h = m11255e.mo11275d(C13234g.class);
        m12299g(new InterfaceC10108b() { // from class: lb.c
            @Override // lb.C10106d.InterfaceC10108b
            /* renamed from: a */
            public final void mo12281a(boolean z) {
                C10106d.this.m12284v(z);
            }
        });
    }

    /* renamed from: h */
    private void m12298h() {
        C2198p.m33982m(!this.f26345f.get(), "FirebaseApp was deleted");
    }

    /* renamed from: k */
    public static C10106d m12295k() {
        C10106d c10106d;
        synchronized (f26337k) {
            c10106d = f26339m.get("[DEFAULT]");
            if (c10106d == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C6588k.m22356a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c10106d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m12291o() {
        if (!C1074t.m37954a(this.f26340a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + m12294l());
            C10111e.m12276b(this.f26340a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + m12294l());
        this.f26343d.m11268k(m12286t());
        this.f26347h.get().m2991n();
    }

    /* renamed from: p */
    public static C10106d m12290p(Context context) {
        synchronized (f26337k) {
            if (f26339m.containsKey("[DEFAULT]")) {
                return m12295k();
            }
            C10118k m12272a = C10118k.m12272a(context);
            if (m12272a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m12289q(context, m12272a);
        }
    }

    /* renamed from: q */
    public static C10106d m12289q(Context context, C10118k c10118k) {
        return m12288r(context, c10118k, "[DEFAULT]");
    }

    /* renamed from: r */
    public static C10106d m12288r(Context context, C10118k c10118k, String str) {
        boolean z;
        C10106d c10106d;
        C10109c.m12278c(context);
        String m12283w = m12283w(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f26337k) {
            Map<String, C10106d> map = f26339m;
            if (!map.containsKey(m12283w)) {
                z = true;
            } else {
                z = false;
            }
            C2198p.m33982m(z, "FirebaseApp name " + m12283w + " already exists!");
            C2198p.m33984k(context, "Application context cannot be null.");
            c10106d = new C10106d(context, m12283w, c10118k);
            map.put(m12283w, c10106d);
        }
        c10106d.m12291o();
        return c10106d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ C5811a m12285u(Context context) {
        return new C5811a(context, m12292n(), (InterfaceC12944c) this.f26343d.mo11278a(InterfaceC12944c.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m12284v(boolean z) {
        if (z) {
            return;
        }
        this.f26347h.get().m2991n();
    }

    /* renamed from: w */
    private static String m12283w(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m12282x(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (InterfaceC10108b interfaceC10108b : this.f26348i) {
            interfaceC10108b.mo12281a(z);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10106d)) {
            return false;
        }
        return this.f26341b.equals(((C10106d) obj).m12294l());
    }

    /* renamed from: g */
    public void m12299g(InterfaceC10108b interfaceC10108b) {
        m12298h();
        if (this.f26344e.get() && ComponentCallbacks2C4609a.m28228b().m28226d()) {
            interfaceC10108b.mo12281a(true);
        }
        this.f26348i.add(interfaceC10108b);
    }

    public int hashCode() {
        return this.f26341b.hashCode();
    }

    /* renamed from: i */
    public <T> T m12297i(Class<T> cls) {
        m12298h();
        return (T) this.f26343d.mo11278a(cls);
    }

    /* renamed from: j */
    public Context m12296j() {
        m12298h();
        return this.f26340a;
    }

    /* renamed from: l */
    public String m12294l() {
        m12298h();
        return this.f26341b;
    }

    /* renamed from: m */
    public C10118k m12293m() {
        m12298h();
        return this.f26342c;
    }

    /* renamed from: n */
    public String m12292n() {
        return C6580c.m22383a(m12294l().getBytes(Charset.defaultCharset())) + "+" + C6580c.m22383a(m12293m().m12270c().getBytes(Charset.defaultCharset()));
    }

    /* renamed from: s */
    public boolean m12287s() {
        m12298h();
        return this.f26346g.get().m24496b();
    }

    /* renamed from: t */
    public boolean m12286t() {
        return "[DEFAULT]".equals(m12294l());
    }

    public String toString() {
        return C2190n.m34002d(this).m34001a(ZeroconfModule.KEY_SERVICE_NAME, this.f26341b).m34001a("options", this.f26342c).toString();
    }
}
