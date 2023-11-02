package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.emoji2.text.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1492b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.emoji2.text.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1493a {
        /* renamed from: a */
        public static Handler m36671a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: b */
    public static ThreadPoolExecutor m36674b(final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.a
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m36673c;
                m36673c = C1492b.m36673c(str, runnable);
                return m36673c;
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* renamed from: c */
    public static /* synthetic */ Thread m36673c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    /* renamed from: d */
    public static Handler m36672d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return C1493a.m36671a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}