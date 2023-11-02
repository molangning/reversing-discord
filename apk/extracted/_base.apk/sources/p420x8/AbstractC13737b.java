package p420x8;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p133h9.ThreadFactoryC7041b;
import p339s9.C12441e;

/* renamed from: x8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC13737b extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f35455a;

    public AbstractC13737b() {
        C12441e.m5279a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC7041b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f35455a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: e */
    private final int m1609e(Context context, Intent intent) {
        Task<Void> m1580c;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m1580c = C4713b.m28004e(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            m1580c = C13761w.m1581b(context).m1580c(2, bundle);
        }
        int mo1612b = mo1612b(context, new C13735a(intent));
        try {
            C4713b.m28007b(m1580c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
            Log.w("CloudMessagingReceiver", sb2.toString());
        }
        return mo1612b;
    }

    /* renamed from: f */
    private final int m1608f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo1611c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* renamed from: a */
    protected Executor m1613a() {
        return this.f35455a;
    }

    /* renamed from: b */
    protected abstract int mo1612b(Context context, C13735a c13735a);

    /* renamed from: c */
    protected void mo1611c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void m1610d(Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int m1609e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                m1609e = m1608f(context, intent2);
            } else {
                m1609e = m1609e(context, intent);
            }
            if (z) {
                pendingResult.setResultCode(m1609e);
            }
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m1613a().execute(new Runnable() { // from class: x8.i
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13737b.this.m1610d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}
