package com.facebook.react.bridge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BackgroundExecutor {
    private static final String TAG = "FabricBackgroundExecutor";
    private final ExecutorService mExecutorService;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class NamedThreadFactory implements ThreadFactory {
        private final String mName;

        public NamedThreadFactory(String str) {
            this.mName = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName(this.mName);
            return newThread;
        }
    }

    @InterfaceC6107a
    private BackgroundExecutor(String str) {
        this.mExecutorService = Executors.newFixedThreadPool(1, new NamedThreadFactory(str));
    }

    @InterfaceC6107a
    private void queueRunnable(Runnable runnable) {
        if (runnable == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("runnable is null"));
            return;
        }
        ExecutorService executorService = this.mExecutorService;
        if (executorService == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("executorService is null"));
        } else {
            executorService.execute(runnable);
        }
    }
}
