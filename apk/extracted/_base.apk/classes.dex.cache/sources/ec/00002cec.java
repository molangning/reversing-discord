package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p029b9.C2198p;
import p135hb.C7052a;

/* renamed from: com.google.firebase.messaging.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5069b0 implements Closeable {

    /* renamed from: j */
    private final URL f14319j;

    /* renamed from: k */
    private volatile Future<?> f14320k;

    /* renamed from: l */
    private Task<Bitmap> f14321l;

    private C5069b0(URL url) {
        this.f14319j = url;
    }

    /* renamed from: i */
    private byte[] m26323i() {
        URLConnection openConnection = this.f14319j.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] m21483c = C7052a.m21483c(C7052a.m21484b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + m21483c.length + " bytes from " + this.f14319j);
                }
                if (m21483c.length <= 1048576) {
                    return m21483c;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: j */
    public static C5069b0 m26322j(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C5069b0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* renamed from: o */
    public /* synthetic */ void m26320o(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.m28011c(m26324h());
        } catch (Exception e) {
            taskCompletionSource.m28012b(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f14320k.cancel(true);
    }

    /* renamed from: h */
    public Bitmap m26324h() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f14319j);
        }
        byte[] m26323i = m26323i();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m26323i, 0, m26323i.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f14319j);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f14319j);
    }

    /* renamed from: m */
    public Task<Bitmap> m26321m() {
        return (Task) C2198p.m33985j(this.f14321l);
    }

    /* renamed from: q */
    public void m26319q(ExecutorService executorService) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f14320k = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.a0
            @Override // java.lang.Runnable
            public final void run() {
                C5069b0.this.m26320o(taskCompletionSource);
            }
        });
        this.f14321l = taskCompletionSource.m28013a();
    }
}