package p385v9;

import androidx.collection.SimpleArrayMap;
import java.io.Closeable;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p119g9.C6586i;

/* renamed from: v9.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13196k0 {

    /* renamed from: a */
    private final ExecutorService f34218a;

    /* renamed from: b */
    private volatile InputStream f34219b;

    /* renamed from: c */
    private volatile boolean f34220c;

    /* renamed from: d */
    private final SimpleArrayMap f34221d;

    /* renamed from: e */
    private final SimpleArrayMap f34222e;

    public C13196k0() {
        C13190i.m3045a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f34218a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f34219b = null;
        this.f34220c = false;
        this.f34221d = new SimpleArrayMap();
        this.f34222e = new SimpleArrayMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void m3040a() {
        this.f34220c = true;
        this.f34218a.shutdownNow();
        C6586i.m22368b(this.f34219b);
        for (int i = 0; i < this.f34221d.size(); i++) {
            C6586i.m22368b((Closeable) this.f34221d.m39521n(i));
        }
        this.f34221d.clear();
        for (int i2 = 0; i2 < this.f34222e.size(); i2++) {
            C13206p0 c13206p0 = (C13206p0) this.f34222e.m39521n(i2);
            C6586i.m22369a(c13206p0.m3030r());
            C6586i.m22369a(c13206p0.m3029z());
        }
        this.f34222e.clear();
    }
}
