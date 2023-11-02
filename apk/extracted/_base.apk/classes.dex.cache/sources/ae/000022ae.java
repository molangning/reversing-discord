package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.FetchState;
import java.io.InputStream;
import java.util.Map;
import p380v4.C13065e;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface NetworkFetcher<FETCH_STATE extends FetchState> {

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface Callback {
        /* renamed from: a */
        void mo30776a();

        /* renamed from: b */
        void mo30775b(InputStream inputStream, int i);

        void onFailure(Throwable th2);
    }

    FETCH_STATE createFetchState(Consumer<C13065e> consumer, ProducerContext producerContext);

    void fetch(FETCH_STATE fetch_state, Callback callback);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}