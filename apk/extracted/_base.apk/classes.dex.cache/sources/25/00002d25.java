package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import androidx.collection.C0624a;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.firebase.messaging.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5126y0 {

    /* renamed from: i */
    private static final long f14418i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final Context f14419a;

    /* renamed from: b */
    private final C5080e0 f14420b;

    /* renamed from: c */
    private final C5127z f14421c;

    /* renamed from: d */
    private final FirebaseMessaging f14422d;

    /* renamed from: f */
    private final ScheduledExecutorService f14424f;

    /* renamed from: h */
    private final C5122w0 f14426h;

    /* renamed from: e */
    private final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f14423e = new C0624a();

    /* renamed from: g */
    private boolean f14425g = false;

    private C5126y0(FirebaseMessaging firebaseMessaging, C5080e0 c5080e0, C5122w0 c5122w0, C5127z c5127z, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f14422d = firebaseMessaging;
        this.f14420b = c5080e0;
        this.f14426h = c5122w0;
        this.f14421c = c5127z;
        this.f14419a = context;
        this.f14424f = scheduledExecutorService;
    }

    /* renamed from: b */
    private static <T> void m26154b(Task<T> task) {
        try {
            C4713b.m28007b(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* renamed from: c */
    private void m26153c(String str) {
        m26154b(this.f14421c.m26128k(this.f14422d.m26375i(), str));
    }

    /* renamed from: d */
    private void m26152d(String str) {
        m26154b(this.f14421c.m26127l(this.f14422d.m26375i(), str));
    }

    /* renamed from: e */
    public static Task<C5126y0> m26151e(final FirebaseMessaging firebaseMessaging, final C5080e0 c5080e0, final C5127z c5127z, final Context context, final ScheduledExecutorService scheduledExecutorService) {
        return C4713b.m28006c(scheduledExecutorService, new Callable() { // from class: com.google.firebase.messaging.x0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C5126y0 m26147i;
                m26147i = C5126y0.m26147i(context, scheduledExecutorService, firebaseMessaging, c5080e0, c5127z);
                return m26147i;
            }
        });
    }

    /* renamed from: g */
    static boolean m26149g() {
        if (!Log.isLoggable("FirebaseMessaging", 3) && (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3))) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static /* synthetic */ C5126y0 m26147i(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, C5080e0 c5080e0, C5127z c5127z) {
        return new C5126y0(firebaseMessaging, c5080e0, C5122w0.m26159a(context, scheduledExecutorService), c5127z, context, scheduledExecutorService);
    }

    /* renamed from: j */
    private void m26146j(C5120v0 c5120v0) {
        synchronized (this.f14423e) {
            String m26160e = c5120v0.m26160e();
            if (!this.f14423e.containsKey(m26160e)) {
                return;
            }
            ArrayDeque<TaskCompletionSource<Void>> arrayDeque = this.f14423e.get(m26160e);
            TaskCompletionSource<Void> poll = arrayDeque.poll();
            if (poll != null) {
                poll.m28011c(null);
            }
            if (arrayDeque.isEmpty()) {
                this.f14423e.remove(m26160e);
            }
        }
    }

    /* renamed from: n */
    private void m26142n() {
        if (!m26148h()) {
            m26139q(0L);
        }
    }

    /* renamed from: f */
    boolean m26150f() {
        return this.f14426h.m26158b() != null;
    }

    /* renamed from: h */
    synchronized boolean m26148h() {
        return this.f14425g;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0079 A[Catch: IOException -> 0x00a2, TryCatch #0 {IOException -> 0x00a2, blocks: (B:45:0x0003, B:60:0x0030, B:62:0x0036, B:63:0x0050, B:65:0x005d, B:66:0x0079, B:68:0x0086, B:50:0x0015, B:53:0x001f), top: B:83:0x0003 }] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    boolean m26145k(com.google.firebase.messaging.C5120v0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 0
            java.lang.String r2 = r7.m26163b()     // Catch: java.io.IOException -> La2
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> La2
            r4 = 83
            r5 = 1
            if (r3 == r4) goto L1f
            r4 = 85
            if (r3 == r4) goto L15
            goto L29
        L15:
            java.lang.String r3 = "U"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = r5
            goto L2a
        L1f:
            java.lang.String r3 = "S"
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = -1
        L2a:
            java.lang.String r3 = " succeeded."
            if (r2 == 0) goto L79
            if (r2 == r5) goto L50
            boolean r2 = m26149g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r3 = "Unknown topic operation"
            r2.append(r3)     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = "."
            r2.append(r7)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L50:
            java.lang.String r2 = r7.m26162c()     // Catch: java.io.IOException -> La2
            r6.m26152d(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m26149g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Unsubscribe from topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.m26162c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
            goto La1
        L79:
            java.lang.String r2 = r7.m26162c()     // Catch: java.io.IOException -> La2
            r6.m26153c(r2)     // Catch: java.io.IOException -> La2
            boolean r2 = m26149g()     // Catch: java.io.IOException -> La2
            if (r2 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La2
            r2.<init>()     // Catch: java.io.IOException -> La2
            java.lang.String r4 = "Subscribe to topic: "
            r2.append(r4)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r7.m26162c()     // Catch: java.io.IOException -> La2
            r2.append(r7)     // Catch: java.io.IOException -> La2
            r2.append(r3)     // Catch: java.io.IOException -> La2
            java.lang.String r7 = r2.toString()     // Catch: java.io.IOException -> La2
            android.util.Log.d(r0, r7)     // Catch: java.io.IOException -> La2
        La1:
            return r5
        La2:
            r7 = move-exception
            java.lang.String r2 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto Lc9
            java.lang.String r2 = "INTERNAL_SERVER_ERROR"
            java.lang.String r3 = r7.getMessage()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lbc
            goto Lc9
        Lbc:
            java.lang.String r2 = r7.getMessage()
            if (r2 != 0) goto Lc8
            java.lang.String r7 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r0, r7)
            return r1
        Lc8:
            throw r7
        Lc9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic operation failed: "
            r2.append(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = ". Will retry Topic operation."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            android.util.Log.e(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5126y0.m26145k(com.google.firebase.messaging.v0):boolean");
    }

    /* renamed from: l */
    public void m26144l(Runnable runnable, long j) {
        this.f14424f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* renamed from: m */
    public synchronized void m26143m(boolean z) {
        this.f14425g = z;
    }

    /* renamed from: o */
    public void m26141o() {
        if (m26150f()) {
            m26142n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x000d, code lost:
        if (m26149g() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x000f, code lost:
        android.util.Log.d("FirebaseMessaging", "topic sync succeeded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0017, code lost:
        return true;
     */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m26140p() {
        /*
            r2 = this;
        L0:
            monitor-enter(r2)
            com.google.firebase.messaging.w0 r0 = r2.f14426h     // Catch: java.lang.Throwable -> L2b
            com.google.firebase.messaging.v0 r0 = r0.m26158b()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L19
            boolean r0 = m26149g()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L16
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch: java.lang.Throwable -> L2b
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            return r0
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r2.m26145k(r0)
            if (r1 != 0) goto L22
            r0 = 0
            return r0
        L22:
            com.google.firebase.messaging.w0 r1 = r2.f14426h
            r1.m26156d(r0)
            r2.m26146j(r0)
            goto L0
        L2b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C5126y0.m26140p():boolean");
    }

    /* renamed from: q */
    public void m26139q(long j) {
        m26144l(new RunnableC5128z0(this, this.f14419a, this.f14420b, Math.min(Math.max(30L, 2 * j), f14418i)), j);
        m26143m(true);
    }
}