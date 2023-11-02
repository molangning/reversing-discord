package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.C4713b;
import com.google.firebase.messaging.C5067b;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p119g9.C6587j;

/* renamed from: com.google.firebase.messaging.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5076d {

    /* renamed from: a */
    private final ExecutorService f14325a;

    /* renamed from: b */
    private final Context f14326b;

    /* renamed from: c */
    private final C5083f0 f14327c;

    public C5076d(Context context, C5083f0 c5083f0, ExecutorService executorService) {
        this.f14325a = executorService;
        this.f14326b = context;
        this.f14327c = c5083f0;
    }

    /* renamed from: b */
    private boolean m26312b() {
        if (((KeyguardManager) this.f14326b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!C6587j.m22362f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f14326b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m26311c(C5067b.C5068a c5068a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f14326b.getSystemService("notification")).notify(c5068a.f14317b, c5068a.f14318c, c5068a.f14316a.m38984g());
    }

    /* renamed from: d */
    private C5069b0 m26310d() {
        C5069b0 m26322j = C5069b0.m26322j(this.f14327c.m26257p("gcm.n.image"));
        if (m26322j != null) {
            m26322j.m26319q(this.f14325a);
        }
        return m26322j;
    }

    /* renamed from: e */
    private void m26309e(NotificationCompat.Builder builder, C5069b0 c5069b0) {
        if (c5069b0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) C4713b.m28007b(c5069b0.m26321m(), 5L, TimeUnit.SECONDS);
            builder.m39011L(bitmap);
            builder.m38987e0(new NotificationCompat.C0719e().m38893z(bitmap).m38894y(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c5069b0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c5069b0.close();
        }
    }

    /* renamed from: a */
    public boolean m26313a() {
        if (this.f14327c.m26272a("gcm.n.noui")) {
            return true;
        }
        if (m26312b()) {
            return false;
        }
        C5069b0 m26310d = m26310d();
        C5067b.C5068a m26339d = C5067b.m26339d(this.f14326b, this.f14327c);
        m26309e(m26339d.f14316a, m26310d);
        m26311c(m26339d);
        return true;
    }
}