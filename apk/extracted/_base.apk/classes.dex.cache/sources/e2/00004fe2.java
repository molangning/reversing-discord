package p386vb;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.p018os.C1074t;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import lb.C10106d;
import org.json.JSONArray;
import org.json.JSONObject;
import p120gc.InterfaceC6727i;
import p247nb.C10533d;
import p247nb.C10558q;
import p247nb.InterfaceC10538e;
import p247nb.InterfaceC10544h;
import p386vb.InterfaceC13239k;
import p423xb.InterfaceC13776b;

/* renamed from: vb.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13234g implements InterfaceC13238j, InterfaceC13239k {

    /* renamed from: f */
    private static final ThreadFactory f34285f = new ThreadFactory() { // from class: vb.b
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m2992m;
            m2992m = C13234g.m2992m(runnable);
            return m2992m;
        }
    };

    /* renamed from: a */
    private final InterfaceC13776b<C13241l> f34286a;

    /* renamed from: b */
    private final Context f34287b;

    /* renamed from: c */
    private final InterfaceC13776b<InterfaceC6727i> f34288c;

    /* renamed from: d */
    private final Set<InterfaceC13235h> f34289d;

    /* renamed from: e */
    private final Executor f34290e;

    private C13234g(final Context context, final String str, Set<InterfaceC13235h> set, InterfaceC13776b<InterfaceC6727i> interfaceC13776b) {
        this(new InterfaceC13776b() { // from class: vb.f
            @Override // p423xb.InterfaceC13776b
            public final Object get() {
                C13241l m2994k;
                m2994k = C13234g.m2994k(context, str);
                return m2994k;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f34285f), interfaceC13776b, context);
    }

    /* renamed from: h */
    public static C10533d<C13234g> m2997h() {
        return C10533d.m11307d(C13234g.class, InterfaceC13238j.class, InterfaceC13239k.class).m11293b(C10558q.m11234i(Context.class)).m11293b(C10558q.m11234i(C10106d.class)).m11293b(C10558q.m11232k(InterfaceC13235h.class)).m11293b(C10558q.m11233j(InterfaceC6727i.class)).m11290e(new InterfaceC10544h() { // from class: vb.e
            @Override // p247nb.InterfaceC10544h
            /* renamed from: a */
            public final Object mo1055a(InterfaceC10538e interfaceC10538e) {
                C13234g m2996i;
                m2996i = C13234g.m2996i(interfaceC10538e);
                return m2996i;
            }
        }).m11291d();
    }

    /* renamed from: i */
    public static /* synthetic */ C13234g m2996i(InterfaceC10538e interfaceC10538e) {
        return new C13234g((Context) interfaceC10538e.mo11278a(Context.class), ((C10106d) interfaceC10538e.mo11278a(C10106d.class)).m12292n(), interfaceC10538e.mo11276c(InterfaceC13235h.class), interfaceC10538e.mo11275d(InterfaceC6727i.class));
    }

    /* renamed from: j */
    public /* synthetic */ String m2995j() {
        String byteArrayOutputStream;
        synchronized (this) {
            C13241l c13241l = this.f34286a.get();
            List<AbstractC13242m> m2984c = c13241l.m2984c();
            c13241l.m2985b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < m2984c.size(); i++) {
                AbstractC13242m abstractC13242m = m2984c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", abstractC13242m.mo2972c());
                jSONObject.put("dates", new JSONArray((Collection) abstractC13242m.mo2973b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
            try {
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return byteArrayOutputStream;
    }

    /* renamed from: k */
    public static /* synthetic */ C13241l m2994k(Context context, String str) {
        return new C13241l(context, str);
    }

    /* renamed from: l */
    public /* synthetic */ Void m2993l() {
        synchronized (this) {
            this.f34286a.get().m2976k(System.currentTimeMillis(), this.f34288c.get().mo22028a());
        }
        return null;
    }

    /* renamed from: m */
    public static /* synthetic */ Thread m2992m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // p386vb.InterfaceC13238j
    /* renamed from: a */
    public Task<String> mo2989a() {
        if (!C1074t.m37954a(this.f34287b)) {
            return C4713b.m28004e("");
        }
        return C4713b.m28006c(this.f34290e, new Callable() { // from class: vb.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String m2995j;
                m2995j = C13234g.this.m2995j();
                return m2995j;
            }
        });
    }

    @Override // p386vb.InterfaceC13239k
    /* renamed from: b */
    public synchronized InterfaceC13239k.EnumC13240a mo2988b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C13241l c13241l = this.f34286a.get();
        if (c13241l.m2978i(currentTimeMillis)) {
            c13241l.m2980g();
            return InterfaceC13239k.EnumC13240a.GLOBAL;
        }
        return InterfaceC13239k.EnumC13240a.NONE;
    }

    /* renamed from: n */
    public Task<Void> m2991n() {
        if (this.f34289d.size() <= 0) {
            return C4713b.m28004e(null);
        }
        if (!C1074t.m37954a(this.f34287b)) {
            return C4713b.m28004e(null);
        }
        return C4713b.m28006c(this.f34290e, new Callable() { // from class: vb.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void m2993l;
                m2993l = C13234g.this.m2993l();
                return m2993l;
            }
        });
    }

    C13234g(InterfaceC13776b<C13241l> interfaceC13776b, Set<InterfaceC13235h> set, Executor executor, InterfaceC13776b<InterfaceC6727i> interfaceC13776b2, Context context) {
        this.f34286a = interfaceC13776b;
        this.f34289d = set;
        this.f34290e = executor;
        this.f34288c = interfaceC13776b2;
        this.f34287b = context;
    }
}