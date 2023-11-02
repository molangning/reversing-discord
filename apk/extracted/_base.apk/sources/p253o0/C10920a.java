package p253o0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C0624a;
import androidx.concurrent.futures.C0648c;
import androidx.core.content.p017pm.AbstractC0963a;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p198kb.InterfaceFutureC9213a;
import p253o0.C10933b;

/* renamed from: o0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10920a extends AbstractC0963a<InterfaceFutureC9213a<Void>> {

    /* renamed from: h */
    private static final Object f28661h = new Object();

    /* renamed from: i */
    private static volatile C10920a f28662i;

    /* renamed from: a */
    final Context f28663a;

    /* renamed from: b */
    final Map<String, C10933b.C10934a> f28664b = new C0624a();

    /* renamed from: c */
    final Map<String, InterfaceFutureC9213a<?>> f28665c = new C0624a();

    /* renamed from: d */
    final ExecutorService f28666d;

    /* renamed from: e */
    private final ExecutorService f28667e;

    /* renamed from: f */
    final File f28668f;

    /* renamed from: g */
    final File f28669g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10921a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ List f28670j;

        RunnableC10921a(List list) {
            this.f28670j = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10920a.this.m9540h(this.f28670j);
            C10933b.m9522f(this.f28670j, C10920a.this.f28668f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10922b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ InterfaceFutureC9213a f28672j;

        /* renamed from: k */
        final /* synthetic */ C0648c f28673k;

        RunnableC10922b(InterfaceFutureC9213a interfaceFutureC9213a, C0648c c0648c) {
            this.f28672j = interfaceFutureC9213a;
            this.f28673k = c0648c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f28672j.get();
                this.f28673k.mo39436p(null);
            } catch (Exception e) {
                this.f28673k.mo39435q(e);
            }
        }
    }

    /* renamed from: o0.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC10923c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ File f28675j;

        RunnableC10923c(File file) {
            this.f28675j = file;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C10920a.m9539i(this.f28675j);
                C10920a.m9539i(C10920a.this.f28669g);
                C10920a c10920a = C10920a.this;
                c10920a.f28664b.putAll(C10933b.m9526b(c10920a.f28668f, c10920a.f28663a));
                C10920a.this.m9540h(new ArrayList(C10920a.this.f28664b.values()));
            } catch (Exception e) {
                Log.w("ShortcutInfoCompatSaver", "ShortcutInfoCompatSaver started with an exceptions ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10924d implements Runnable {

        /* renamed from: j */
        final /* synthetic */ List f28677j;

        /* renamed from: k */
        final /* synthetic */ C0648c f28678k;

        RunnableC10924d(List list, C0648c c0648c) {
            this.f28677j = list;
            this.f28678k = c0648c;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.f28677j) {
                C10920a.this.f28664b.remove(str);
                InterfaceFutureC9213a<?> remove = C10920a.this.f28665c.remove(str);
                if (remove != null) {
                    remove.cancel(false);
                }
            }
            C10920a.this.m9532p(this.f28678k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10925e implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C0648c f28680j;

        RunnableC10925e(C0648c c0648c) {
            this.f28680j = c0648c;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10920a.this.f28664b.clear();
            for (InterfaceFutureC9213a<?> interfaceFutureC9213a : C10920a.this.f28665c.values()) {
                interfaceFutureC9213a.cancel(false);
            }
            C10920a.this.f28665c.clear();
            C10920a.this.m9532p(this.f28680j);
        }
    }

    /* renamed from: o0.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class CallableC10926f implements Callable<ArrayList<ShortcutInfoCompat>> {
        CallableC10926f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public ArrayList<ShortcutInfoCompat> call() {
            ArrayList<ShortcutInfoCompat> arrayList = new ArrayList<>();
            for (C10933b.C10934a c10934a : C10920a.this.f28664b.values()) {
                arrayList.add(new ShortcutInfoCompat.C0962b(c10934a.f28701c).m38343a());
            }
            return arrayList;
        }
    }

    /* renamed from: o0.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class CallableC10927g implements Callable<C10933b.C10934a> {

        /* renamed from: j */
        final /* synthetic */ String f28683j;

        CallableC10927g(String str) {
            this.f28683j = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public C10933b.C10934a call() {
            return C10920a.this.f28664b.get(this.f28683j);
        }
    }

    /* renamed from: o0.a$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class CallableC10928h implements Callable<Bitmap> {

        /* renamed from: j */
        final /* synthetic */ C10933b.C10934a f28685j;

        CallableC10928h(C10933b.C10934a c10934a) {
            this.f28685j = c10934a;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Bitmap call() {
            return BitmapFactory.decodeFile(this.f28685j.f28700b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10929i implements Runnable {

        /* renamed from: j */
        final /* synthetic */ List f28687j;

        /* renamed from: k */
        final /* synthetic */ C0648c f28688k;

        /* renamed from: o0.a$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC10930a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ String f28690j;

            /* renamed from: k */
            final /* synthetic */ InterfaceFutureC9213a f28691k;

            RunnableC10930a(String str, InterfaceFutureC9213a interfaceFutureC9213a) {
                this.f28690j = str;
                this.f28691k = interfaceFutureC9213a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C10920a.this.f28665c.remove(this.f28690j);
                if (this.f28691k.isCancelled()) {
                    return;
                }
                try {
                    this.f28691k.get();
                } catch (Exception e) {
                    RunnableC10929i.this.f28688k.mo39435q(e);
                }
            }
        }

        RunnableC10929i(List list, C0648c c0648c) {
            this.f28687j = list;
            this.f28688k = c0648c;
        }

        @Override // java.lang.Runnable
        public void run() {
            Bitmap bitmap;
            for (ShortcutInfoCompat shortcutInfoCompat : this.f28687j) {
                Set<String> m38358d = shortcutInfoCompat.m38358d();
                if (m38358d != null && !m38358d.isEmpty()) {
                    C10933b.C10934a m9542f = C10920a.this.m9542f(shortcutInfoCompat);
                    IconCompat m38356f = shortcutInfoCompat.m38356f();
                    if (m9542f.f28700b != null) {
                        bitmap = m38356f.m38124n();
                    } else {
                        bitmap = null;
                    }
                    String m38355g = shortcutInfoCompat.m38355g();
                    C10920a.this.f28664b.put(m38355g, m9542f);
                    if (bitmap != null) {
                        InterfaceFutureC9213a<Void> m9533o = C10920a.this.m9533o(bitmap, m9542f.f28700b);
                        InterfaceFutureC9213a<?> put = C10920a.this.f28665c.put(m38355g, m9533o);
                        if (put != null) {
                            put.cancel(false);
                        }
                        m9533o.mo16057a(new RunnableC10930a(m38355g, m9533o), C10920a.this.f28666d);
                    }
                }
            }
            C10920a.this.m9532p(this.f28688k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10931j implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Bitmap f28693j;

        /* renamed from: k */
        final /* synthetic */ String f28694k;

        RunnableC10931j(Bitmap bitmap, String str) {
            this.f28693j = bitmap;
            this.f28694k = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10920a.this.m9534n(this.f28693j, this.f28694k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o0.a$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC10932k implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C0648c f28696j;

        /* renamed from: k */
        final /* synthetic */ Runnable f28697k;

        RunnableC10932k(C0648c c0648c, Runnable runnable) {
            this.f28696j = c0648c;
            this.f28697k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28696j.isCancelled()) {
                return;
            }
            try {
                this.f28697k.run();
                this.f28696j.mo39436p(null);
            } catch (Exception e) {
                this.f28696j.mo39435q(e);
            }
        }
    }

    C10920a(Context context, ExecutorService executorService, ExecutorService executorService2) {
        this.f28663a = context.getApplicationContext();
        this.f28666d = executorService;
        this.f28667e = executorService2;
        File file = new File(context.getFilesDir(), "ShortcutInfoCompatSaver_share_targets");
        this.f28669g = new File(file, "ShortcutInfoCompatSaver_share_targets_bitmaps");
        this.f28668f = new File(file, "targets.xml");
        executorService.submit(new RunnableC10923c(file));
    }

    /* renamed from: g */
    static ExecutorService m9541g() {
        return new ThreadPoolExecutor(0, 1, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    /* renamed from: i */
    static boolean m9539i(File file) {
        if (file.exists() && !file.isDirectory() && !file.delete()) {
            return false;
        }
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /* renamed from: j */
    public static C10920a m9538j(Context context) {
        if (f28662i == null) {
            synchronized (f28661h) {
                if (f28662i == null) {
                    f28662i = new C10920a(context, m9541g(), m9541g());
                }
            }
        }
        return f28662i;
    }

    /* renamed from: q */
    private InterfaceFutureC9213a<Void> m9531q(Runnable runnable) {
        C0648c m39434s = C0648c.m39434s();
        this.f28667e.submit(new RunnableC10932k(m39434s, runnable));
        return m39434s;
    }

    @Override // androidx.core.content.p017pm.AbstractC0963a
    /* renamed from: b */
    public List<ShortcutInfoCompat> mo9546b() {
        return (List) this.f28666d.submit(new CallableC10926f()).get();
    }

    @Override // androidx.core.content.p017pm.AbstractC0963a
    /* renamed from: e */
    public InterfaceFutureC9213a<Void> mo9547a(List<ShortcutInfoCompat> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            arrayList.add(new ShortcutInfoCompat.C0962b(shortcutInfoCompat).m38343a());
        }
        C0648c m39434s = C0648c.m39434s();
        this.f28666d.submit(new RunnableC10929i(arrayList, m39434s));
        return m39434s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r2 != 5) goto L14;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    p253o0.C10933b.C10934a m9542f(androidx.core.content.p017pm.ShortcutInfoCompat r5) {
        /*
            r4 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r5.m38356f()
            r1 = 0
            if (r0 == 0) goto L3b
            int r2 = r0.m38120r()
            r3 = 1
            if (r2 == r3) goto L25
            r3 = 2
            if (r2 == r3) goto L15
            r0 = 5
            if (r2 == r0) goto L25
            goto L3b
        L15:
            android.content.Context r2 = r4.f28663a
            android.content.res.Resources r2 = r2.getResources()
            int r0 = r0.m38123o()
            java.lang.String r0 = r2.getResourceName(r0)
            r2 = r1
            goto L3d
        L25:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r4.f28669g
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r0.<init>(r2, r3)
            java.lang.String r0 = r0.getAbsolutePath()
            r2 = r0
            r0 = r1
            goto L3d
        L3b:
            r0 = r1
            r2 = r0
        L3d:
            androidx.core.content.pm.ShortcutInfoCompat$b r3 = new androidx.core.content.pm.ShortcutInfoCompat$b
            r3.<init>(r5)
            androidx.core.content.pm.ShortcutInfoCompat$b r5 = r3.m38339e(r1)
            androidx.core.content.pm.ShortcutInfoCompat r5 = r5.m38343a()
            o0.b$a r1 = new o0.b$a
            r1.<init>(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p253o0.C10920a.m9542f(androidx.core.content.pm.ShortcutInfoCompat):o0.b$a");
    }

    /* renamed from: h */
    void m9540h(List<C10933b.C10934a> list) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        for (C10933b.C10934a c10934a : list) {
            if (!TextUtils.isEmpty(c10934a.f28700b)) {
                arrayList.add(c10934a.f28700b);
            }
        }
        for (File file : this.f28669g.listFiles()) {
            if (!arrayList.contains(file.getAbsolutePath())) {
                file.delete();
            }
        }
    }

    /* renamed from: k */
    public IconCompat m9537k(String str) {
        int i;
        Bitmap bitmap;
        C10933b.C10934a c10934a = (C10933b.C10934a) this.f28666d.submit(new CallableC10927g(str)).get();
        if (c10934a == null) {
            return null;
        }
        if (!TextUtils.isEmpty(c10934a.f28699a)) {
            try {
                i = this.f28663a.getResources().getIdentifier(c10934a.f28699a, null, null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i != 0) {
                return IconCompat.m38126l(this.f28663a, i);
            }
        }
        if (TextUtils.isEmpty(c10934a.f28700b) || (bitmap = (Bitmap) this.f28667e.submit(new CallableC10928h(c10934a)).get()) == null) {
            return null;
        }
        return IconCompat.m38129i(bitmap);
    }

    @Override // androidx.core.content.p017pm.AbstractC0963a
    /* renamed from: l */
    public InterfaceFutureC9213a<Void> mo9545c() {
        C0648c m39434s = C0648c.m39434s();
        this.f28666d.submit(new RunnableC10925e(m39434s));
        return m39434s;
    }

    @Override // androidx.core.content.p017pm.AbstractC0963a
    /* renamed from: m */
    public InterfaceFutureC9213a<Void> mo9544d(List<String> list) {
        ArrayList arrayList = new ArrayList(list);
        C0648c m39434s = C0648c.m39434s();
        this.f28666d.submit(new RunnableC10924d(arrayList, m39434s));
        return m39434s;
    }

    /* renamed from: n */
    void m9534n(Bitmap bitmap, String str) {
        if (bitmap != null) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
                    try {
                        if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            fileOutputStream.close();
                            return;
                        }
                        Log.wtf("ShortcutInfoCompatSaver", "Unable to compress bitmap");
                        throw new RuntimeException("Unable to compress bitmap for saving " + str);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (IOException | OutOfMemoryError | RuntimeException e) {
                    Log.wtf("ShortcutInfoCompatSaver", "Unable to write bitmap to file", e);
                    throw new RuntimeException("Unable to write bitmap to file " + str, e);
                }
            }
            throw new IllegalArgumentException("path is empty");
        }
        throw new IllegalArgumentException("bitmap is null");
    }

    /* renamed from: o */
    InterfaceFutureC9213a<Void> m9533o(Bitmap bitmap, String str) {
        return m9531q(new RunnableC10931j(bitmap, str));
    }

    /* renamed from: p */
    void m9532p(C0648c<Void> c0648c) {
        InterfaceFutureC9213a<Void> m9531q = m9531q(new RunnableC10921a(new ArrayList(this.f28664b.values())));
        m9531q.mo16057a(new RunnableC10922b(m9531q, c0648c), this.f28666d);
    }
}
