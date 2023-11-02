package com.facebook.react.modules.fresco;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.producers.NetworkFetcher;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {
    private static final String TAG = "ReactOkHttpNetworkFetcher";
    private final Executor mCancellationExecutor;
    private final OkHttpClient mOkHttpClient;

    public ReactOkHttpNetworkFetcher(OkHttpClient okHttpClient) {
        super(okHttpClient);
        this.mOkHttpClient = okHttpClient;
        this.mCancellationExecutor = okHttpClient.m8798r().m8941d();
    }

    private Map<String, String> getHeaders(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher, com.facebook.imagepipeline.producers.NetworkFetcher
    public void fetch(OkHttpNetworkFetcher.OkHttpNetworkFetchState okHttpNetworkFetchState, NetworkFetcher.Callback callback) {
        okHttpNetworkFetchState.f10266f = SystemClock.elapsedRealtime();
        Uri m30911g = okHttpNetworkFetchState.m30911g();
        Map<String, String> headers = okHttpNetworkFetchState.m30916b().mo30851l() instanceof ReactNetworkImageRequest ? getHeaders(((ReactNetworkImageRequest) okHttpNetworkFetchState.m30916b().mo30851l()).getHeaders()) : null;
        if (headers == null) {
            headers = Collections.emptyMap();
        }
        fetchWithRequest(okHttpNetworkFetchState, callback, new Request.Builder().m8731c(new CacheControl.C11188a().m8968e().m8972a()).m8722l(m30911g.toString()).m8728f(Headers.m8926i(headers)).m8730d().m8732b());
    }
}
