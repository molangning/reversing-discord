package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.producers.FetchState;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC3766c<FETCH_STATE extends FetchState> implements NetworkFetcher<FETCH_STATE> {
    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i) {
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public void onFetchCompletion(FETCH_STATE fetch_state, int i) {
    }

    @Override // com.facebook.imagepipeline.producers.NetworkFetcher
    public boolean shouldPropagate(FETCH_STATE fetch_state) {
        return true;
    }
}
