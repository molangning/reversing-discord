package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.views.image.ReactImageView;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p056d3.InterfaceC5739b;
import p075e3.C6104f;
import p380v4.C13065e;
import p394w2.C13375i;

/* renamed from: com.facebook.imagepipeline.producers.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3847v extends AbstractC3766c<C3850c> {

    /* renamed from: a */
    private int f10814a;

    /* renamed from: b */
    private String f10815b;

    /* renamed from: c */
    private final Map<String, String> f10816c;

    /* renamed from: d */
    private final ExecutorService f10817d;

    /* renamed from: e */
    private final InterfaceC5739b f10818e;

    /* renamed from: com.facebook.imagepipeline.producers.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC3848a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C3850c f10819j;

        /* renamed from: k */
        final /* synthetic */ NetworkFetcher.Callback f10820k;

        RunnableC3848a(C3850c c3850c, NetworkFetcher.Callback callback) {
            C3847v.this = r1;
            this.f10819j = c3850c;
            this.f10820k = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            C3847v.this.m30644e(this.f10819j, this.f10820k);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3849b extends C3772e {

        /* renamed from: a */
        final /* synthetic */ Future f10822a;

        /* renamed from: b */
        final /* synthetic */ NetworkFetcher.Callback f10823b;

        C3849b(Future future, NetworkFetcher.Callback callback) {
            C3847v.this = r1;
            this.f10822a = future;
            this.f10823b = callback;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            if (this.f10822a.cancel(false)) {
                this.f10823b.mo30776a();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.v$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C3850c extends FetchState {

        /* renamed from: f */
        private long f10825f;

        /* renamed from: g */
        private long f10826g;

        /* renamed from: h */
        private long f10827h;

        public C3850c(Consumer<C13065e> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    public C3847v(int i) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f10814a = i;
    }

    /* renamed from: b */
    private HttpURLConnection m30647b(Uri uri, int i) {
        Uri parse;
        String m30646c;
        HttpURLConnection m30639j = m30639j(uri);
        String str = this.f10815b;
        if (str != null) {
            m30639j.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f10816c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m30639j.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        m30639j.setConnectTimeout(this.f10814a);
        int responseCode = m30639j.getResponseCode();
        if (m30641h(responseCode)) {
            return m30639j;
        }
        if (m30642g(responseCode)) {
            String headerField = m30639j.getHeaderField("Location");
            m30639j.disconnect();
            if (headerField == null) {
                parse = null;
            } else {
                parse = Uri.parse(headerField);
            }
            String scheme = uri.getScheme();
            if (i > 0 && parse != null && !C13375i.m2691a(parse.getScheme(), scheme)) {
                return m30647b(parse, i - 1);
            }
            if (i == 0) {
                m30646c = m30646c("URL %s follows too many redirects", uri.toString());
            } else {
                m30646c = m30646c("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode));
            }
            throw new IOException(m30646c);
        }
        m30639j.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    /* renamed from: c */
    private static String m30646c(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    /* renamed from: g */
    private static boolean m30642g(int i) {
        if (i == 307 || i == 308) {
            return true;
        }
        switch (i) {
            case ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS /* 300 */:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: h */
    private static boolean m30641h(int i) {
        return i >= 200 && i < 300;
    }

    /* renamed from: j */
    static HttpURLConnection m30639j(Uri uri) {
        return (HttpURLConnection) C6104f.m23557p(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    /* renamed from: a */
    public C3850c createFetchState(Consumer<C13065e> consumer, ProducerContext producerContext) {
        return new C3850c(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    /* renamed from: d */
    public void fetch(C3850c c3850c, NetworkFetcher.Callback callback) {
        c3850c.f10825f = this.f10818e.now();
        c3850c.m30916b().mo30860c(new C3849b(this.f10817d.submit(new RunnableC3848a(c3850c, callback)), callback));
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void m30644e(com.facebook.imagepipeline.producers.C3847v.C3850c r5, com.facebook.imagepipeline.producers.NetworkFetcher.Callback r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.m30911g()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r2 = 5
            java.net.HttpURLConnection r1 = r4.m30647b(r1, r2)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            d3.b r2 = r4.f10818e     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            long r2 = r2.now()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            com.facebook.imagepipeline.producers.C3847v.C3850c.m30634n(r5, r2)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
            r5 = -1
            r6.mo30775b(r0, r5)     // Catch: java.io.IOException -> L25 java.lang.Throwable -> L3a
        L1d:
            if (r0 == 0) goto L22
            r0.close()     // Catch: java.io.IOException -> L22
        L22:
            if (r1 == 0) goto L39
            goto L36
        L25:
            r5 = move-exception
            goto L2c
        L27:
            r5 = move-exception
            r1 = r0
            goto L3b
        L2a:
            r5 = move-exception
            r1 = r0
        L2c:
            r6.onFailure(r5)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L34
            r0.close()     // Catch: java.io.IOException -> L34
        L34:
            if (r1 == 0) goto L39
        L36:
            r1.disconnect()
        L39:
            return
        L3a:
            r5 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()     // Catch: java.io.IOException -> L40
        L40:
            if (r1 == 0) goto L45
            r1.disconnect()
        L45:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.C3847v.m30644e(com.facebook.imagepipeline.producers.v$c, com.facebook.imagepipeline.producers.NetworkFetcher$Callback):void");
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3766c, com.facebook.imagepipeline.producers.NetworkFetcher
    /* renamed from: f */
    public Map<String, String> getExtraMap(C3850c c3850c, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(c3850c.f10826g - c3850c.f10825f));
        hashMap.put("fetch_time", Long.toString(c3850c.f10827h - c3850c.f10826g));
        hashMap.put("total_time", Long.toString(c3850c.f10827h - c3850c.f10825f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3766c, com.facebook.imagepipeline.producers.NetworkFetcher
    /* renamed from: i */
    public void onFetchCompletion(C3850c c3850c, int i) {
        c3850c.f10827h = this.f10818e.now();
    }

    C3847v(String str, Map<String, String> map, InterfaceC5739b interfaceC5739b) {
        this.f10817d = Executors.newFixedThreadPool(3);
        this.f10818e = interfaceC5739b;
        this.f10816c = map;
        this.f10815b = str;
    }
}