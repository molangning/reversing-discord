package p103fc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: fc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6388b {

    /* renamed from: a */
    private static final InterfaceC6387a f18038a;

    /* renamed from: b */
    private static volatile InterfaceC6387a f18039b;

    /* renamed from: fc.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class C6390b implements InterfaceC6387a {
        private C6390b() {
        }

        @Override // p103fc.InterfaceC6387a
        /* renamed from: a */
        public ExecutorService mo22811a(ThreadFactory threadFactory, EnumC6391c enumC6391c) {
            return m22810b(1, threadFactory, enumC6391c);
        }

        /* renamed from: b */
        public ExecutorService m22810b(int i, ThreadFactory threadFactory, EnumC6391c enumC6391c) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C6390b c6390b = new C6390b();
        f18038a = c6390b;
        f18039b = c6390b;
    }

    /* renamed from: a */
    public static InterfaceC6387a m22812a() {
        return f18039b;
    }
}
