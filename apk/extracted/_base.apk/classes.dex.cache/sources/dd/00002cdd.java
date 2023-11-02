package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.BinderC5074c1;
import java.util.concurrent.ExecutorService;
import p134ha.InterfaceC7046d;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class EnhancedIntentService extends Service {
    private static final String TAG = "EnhancedIntentService";
    private Binder binder;
    private int lastStartId;
    final ExecutorService executor = C5098m.m26209b();
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5059a implements BinderC5074c1.InterfaceC5075a {
        C5059a() {
            EnhancedIntentService.this = r1;
        }

        @Override // com.google.firebase.messaging.BinderC5074c1.InterfaceC5075a
        /* renamed from: a */
        public Task<Void> mo26314a(Intent intent) {
            return EnhancedIntentService.this.processIntent(intent);
        }
    }

    private void finishTask(Intent intent) {
        if (intent != null) {
            C5066a1.m26346b(intent);
        }
        synchronized (this.lock) {
            int i = this.runningTasks - 1;
            this.runningTasks = i;
            if (i == 0) {
                stopSelfResultHook(this.lastStartId);
            }
        }
    }

    public /* synthetic */ void lambda$onStartCommand$1(Intent intent, Task task) {
        finishTask(intent);
    }

    public /* synthetic */ void lambda$processIntent$0(Intent intent, TaskCompletionSource taskCompletionSource) {
        try {
            handleIntent(intent);
        } finally {
            taskCompletionSource.m28011c(null);
        }
    }

    public Task<Void> processIntent(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return C4713b.m28004e(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.e
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedIntentService.this.lambda$processIntent$0(intent, taskCompletionSource);
            }
        });
        return taskCompletionSource.m28013a();
    }

    protected Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new BinderC5074c1(new C5059a());
        }
        return this.binder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        Task<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.mo27970n()) {
            finishTask(intent);
            return 2;
        }
        processIntent.mo27981c(new ExecutorC5082f(), new InterfaceC7046d() { // from class: com.google.firebase.messaging.g
            @Override // p134ha.InterfaceC7046d
            /* renamed from: a */
            public final void mo1614a(Task task) {
                EnhancedIntentService.this.lambda$onStartCommand$1(intent, task);
            }
        });
        return 3;
    }

    boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}