package com.rnfs;

import android.os.AsyncTask;
import android.webkit.MimeTypeMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.rnfs.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AsyncTaskC5520j extends AsyncTask<C5515h, int[], C5519i> {

    /* renamed from: a */
    private C5515h f15517a;

    /* renamed from: b */
    private C5519i f15518b;

    /* renamed from: c */
    private AtomicBoolean f15519c = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.rnfs.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5521a implements Runnable {
        RunnableC5521a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                AsyncTaskC5520j asyncTaskC5520j = AsyncTaskC5520j.this;
                asyncTaskC5520j.m25090g(asyncTaskC5520j.f15517a, AsyncTaskC5520j.this.f15518b);
                AsyncTaskC5520j.this.f15517a.f15510g.mo25098a(AsyncTaskC5520j.this.f15518b);
            } catch (Exception e) {
                AsyncTaskC5520j.this.f15518b.f15515c = e;
                AsyncTaskC5520j.this.f15517a.f15510g.mo25098a(AsyncTaskC5520j.this.f15518b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0147 A[Catch: all -> 0x01de, TryCatch #8 {all -> 0x01de, blocks: (B:25:0x00fc, B:32:0x0136, B:34:0x0147, B:36:0x017e, B:38:0x0187, B:31:0x0125), top: B:130:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c9  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25090g(com.rnfs.C5515h r37, com.rnfs.C5519i r38) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rnfs.AsyncTaskC5520j.m25090g(com.rnfs.h, com.rnfs.i):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: d */
    public C5519i doInBackground(C5515h... c5515hArr) {
        this.f15517a = c5515hArr[0];
        this.f15518b = new C5519i();
        new Thread(new RunnableC5521a()).start();
        return this.f15518b;
    }

    /* renamed from: e */
    protected String m25092e(String str) {
        String str2;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl.toLowerCase());
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return "*/*";
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public void m25091f() {
        this.f15519c.set(true);
    }
}
