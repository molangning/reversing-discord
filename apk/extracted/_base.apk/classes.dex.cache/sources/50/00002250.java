package com.facebook.imagepipeline.backends.okhttp3;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.producers.AbstractC3766c;
import com.facebook.imagepipeline.producers.C3772e;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.FetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.imagepipeline.producers.ProducerContext;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p328rj.InterfaceC12283d;
import p380v4.C13065e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class OkHttpNetworkFetcher extends AbstractC3766c<OkHttpNetworkFetchState> {
    private static final String FETCH_TIME = "fetch_time";
    private static final String IMAGE_SIZE = "image_size";
    private static final String QUEUE_TIME = "queue_time";
    private static final String TOTAL_TIME = "total_time";
    private final CacheControl mCacheControl;
    private final Call.Factory mCallFactory;
    private Executor mCancellationExecutor;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class OkHttpNetworkFetchState extends FetchState {

        /* renamed from: f */
        public long f10266f;

        /* renamed from: g */
        public long f10267g;

        /* renamed from: h */
        public long f10268h;

        public OkHttpNetworkFetchState(Consumer<C13065e> consumer, ProducerContext producerContext) {
            super(consumer, producerContext);
        }
    }

    /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3698a extends C3772e {

        /* renamed from: a */
        final /* synthetic */ Call f10269a;

        /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC3699a implements Runnable {
            RunnableC3699a() {
                C3698a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                C3698a.this.f10269a.cancel();
            }
        }

        C3698a(Call call) {
            OkHttpNetworkFetcher.this = r1;
            this.f10269a = call;
        }

        @Override // com.facebook.imagepipeline.producers.InterfaceC3817m0
        /* renamed from: b */
        public void mo30638b() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f10269a.cancel();
            } else {
                OkHttpNetworkFetcher.this.mCancellationExecutor.execute(new RunnableC3699a());
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3700b implements InterfaceC12283d {

        /* renamed from: a */
        final /* synthetic */ OkHttpNetworkFetchState f10272a;

        /* renamed from: b */
        final /* synthetic */ NetworkFetcher.Callback f10273b;

        C3700b(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
            OkHttpNetworkFetcher.this = r1;
            this.f10272a = okHttpNetworkFetchState;
            this.f10273b = callback;
        }

        @Override // p328rj.InterfaceC12283d
        public void onFailure(Call call, IOException iOException) {
            OkHttpNetworkFetcher.this.handleException(call, iOException, this.f10273b);
        }

        @Override // p328rj.InterfaceC12283d
        public void onResponse(Call call, Response response) {
            this.f10272a.f10267g = SystemClock.elapsedRealtime();
            ResponseBody m8699a = response.m8699a();
            try {
                if (m8699a == null) {
                    OkHttpNetworkFetcher.this.handleException(call, new IOException("Response body null: " + response), this.f10273b);
                    return;
                }
                try {
                } catch (Exception e) {
                    OkHttpNetworkFetcher.this.handleException(call, e, this.f10273b);
                }
                if (!response.m8701X()) {
                    OkHttpNetworkFetcher.this.handleException(call, new IOException("Unexpected HTTP code " + response), this.f10273b);
                    return;
                }
                BytesRange m31198c = BytesRange.m31198c(response.m8692s("Content-Range"));
                if (m31198c != null && (m31198c.f10282a != 0 || m31198c.f10283b != Integer.MAX_VALUE)) {
                    this.f10272a.m30908j(m31198c);
                    this.f10272a.m30909i(8);
                }
                long contentLength = m8699a.contentLength();
                if (contentLength < 0) {
                    contentLength = 0;
                }
                this.f10273b.mo30775b(m8699a.byteStream(), (int) contentLength);
            } finally {
                m8699a.close();
            }
        }
    }

    public OkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.m8798r().m8941d());
    }

    public void handleException(Call call, Exception exc, NetworkFetcher.Callback callback) {
        if (call.mo1988o()) {
            callback.mo30776a();
        } else {
            callback.onFailure(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public /* bridge */ /* synthetic */ FetchState createFetchState(Consumer consumer, ProducerContext producerContext) {
        return createFetchState((Consumer<C13065e>) consumer, producerContext);
    }

    public void fetchWithRequest(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback, Request request) {
        Call mo8811b = this.mCallFactory.mo8811b(request);
        okHttpNetworkFetchState.m30916b().mo30860c(new C3698a(mo8811b));
        mo8811b.mo1994i(new C3700b(okHttpNetworkFetchState, callback));
    }

    public OkHttpNetworkFetcher(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public OkHttpNetworkFetchState createFetchState(Consumer<C13065e> consumer, ProducerContext producerContext) {
        return new OkHttpNetworkFetchState(consumer, producerContext);
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
        okHttpNetworkFetchState.f10266f = SystemClock.elapsedRealtime();
        try {
            Request.Builder m8730d = new Request.Builder().m8722l(okHttpNetworkFetchState.m30911g().toString()).m8730d();
            CacheControl cacheControl = this.mCacheControl;
            if (cacheControl != null) {
                m8730d.m8731c(cacheControl);
            }
            BytesRange bytesRange = okHttpNetworkFetchState.m30916b().mo30851l().getBytesRange();
            if (bytesRange != null) {
                m8730d.m8733a("Range", bytesRange.m31197d());
            }
            fetchWithRequest(okHttpNetworkFetchState, callback, m8730d.m8732b());
        } catch (Exception e) {
            callback.onFailure(e);
        }
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3766c, com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(OkHttpNetworkFetchState okHttpNetworkFetchState, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(QUEUE_TIME, Long.toString(okHttpNetworkFetchState.f10267g - okHttpNetworkFetchState.f10266f));
        hashMap.put(FETCH_TIME, Long.toString(okHttpNetworkFetchState.f10268h - okHttpNetworkFetchState.f10267g));
        hashMap.put(TOTAL_TIME, Long.toString(okHttpNetworkFetchState.f10268h - okHttpNetworkFetchState.f10266f));
        hashMap.put(IMAGE_SIZE, Integer.toString(i));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC3766c, com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(OkHttpNetworkFetchState okHttpNetworkFetchState, int i) {
        okHttpNetworkFetchState.f10268h = SystemClock.elapsedRealtime();
    }

    public OkHttpNetworkFetcher(Call.Factory factory, Executor executor, boolean z) {
        this.mCallFactory = factory;
        this.mCancellationExecutor = executor;
        this.mCacheControl = z ? new CacheControl.C11188a().m8968e().m8972a() : null;
    }
}