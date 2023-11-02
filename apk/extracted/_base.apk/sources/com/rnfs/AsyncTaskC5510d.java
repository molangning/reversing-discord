package com.rnfs;

import android.os.AsyncTask;
import android.os.Build;
import com.rnfs.C5504a;
import java.net.HttpURLConnection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.rnfs.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AsyncTaskC5510d extends AsyncTask<C5504a, long[], C5508b> {

    /* renamed from: a */
    private C5504a f15499a;

    /* renamed from: b */
    private AtomicBoolean f15500b = new AtomicBoolean(false);

    /* renamed from: c */
    C5508b f15501c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.rnfs.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5511a implements Runnable {
        RunnableC5511a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AsyncTaskC5510d asyncTaskC5510d = AsyncTaskC5510d.this;
                asyncTaskC5510d.m25104d(asyncTaskC5510d.f15499a, AsyncTaskC5510d.this.f15501c);
                AsyncTaskC5510d.this.f15499a.f15493h.mo25109a(AsyncTaskC5510d.this.f15501c);
            } catch (Exception e) {
                AsyncTaskC5510d asyncTaskC5510d2 = AsyncTaskC5510d.this;
                asyncTaskC5510d2.f15501c.f15498c = e;
                asyncTaskC5510d2.f15499a.f15493h.mo25109a(AsyncTaskC5510d.this.f15501c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0225  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25104d(com.rnfs.C5504a r30, com.rnfs.C5508b r31) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.AsyncTaskC5510d.m25104d(com.rnfs.a, com.rnfs.b):void");
    }

    /* renamed from: e */
    private long m25103e(HttpURLConnection httpURLConnection) {
        long contentLengthLong;
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = httpURLConnection.getContentLengthLong();
            return contentLengthLong;
        }
        return httpURLConnection.getContentLength();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: c */
    public C5508b doInBackground(C5504a... c5504aArr) {
        this.f15499a = c5504aArr[0];
        this.f15501c = new C5508b();
        new Thread(new RunnableC5511a()).start();
        return this.f15501c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: f */
    public void onProgressUpdate(long[]... jArr) {
        super.onProgressUpdate(jArr);
        C5504a.InterfaceC5506b interfaceC5506b = this.f15499a.f15495j;
        if (interfaceC5506b != null) {
            long[] jArr2 = jArr[0];
            interfaceC5506b.mo25110a(jArr2[0], jArr2[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m25101g() {
        this.f15500b.set(true);
    }
}
