package com.facebook.react.modules.fresco;

import android.util.Pair;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import p150i5.C7382a;
import p416x4.C13686a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SystraceRequestListener extends C13686a {
    int mCurrentID = 0;
    Map<String, Pair<Integer, String>> mProducerID = new HashMap();
    Map<String, Pair<Integer, String>> mRequestsID = new HashMap();

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onProducerEvent(String str, String str2, String str3) {
        if (!C7382a.m20808h(0L)) {
            return;
        }
        C7382a.m20804l(0L, "FRESCO_PRODUCER_EVENT_" + str.replace(':', '_') + "_" + str2.replace(':', '_') + "_" + str3.replace(':', '_'), C7382a.EnumC7383a.THREAD);
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
        if (C7382a.m20808h(0L) && this.mProducerID.containsKey(str)) {
            Pair<Integer, String> pair = this.mProducerID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mProducerID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onProducerFinishWithFailure(String str, String str2, Throwable th2, Map<String, String> map) {
        if (C7382a.m20808h(0L) && this.mProducerID.containsKey(str)) {
            Pair<Integer, String> pair = this.mProducerID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mProducerID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
        if (C7382a.m20808h(0L) && this.mProducerID.containsKey(str)) {
            Pair<Integer, String> pair = this.mProducerID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mProducerID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onProducerStart(String str, String str2) {
        if (!C7382a.m20808h(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.mCurrentID), "FRESCO_PRODUCER_" + str2.replace(':', '_'));
        C7382a.m20815a(0L, (String) create.second, this.mCurrentID);
        this.mProducerID.put(str, create);
        this.mCurrentID = this.mCurrentID + 1;
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        if (C7382a.m20808h(0L) && this.mRequestsID.containsKey(str)) {
            Pair<Integer, String> pair = this.mRequestsID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mRequestsID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z) {
        if (C7382a.m20808h(0L) && this.mRequestsID.containsKey(str)) {
            Pair<Integer, String> pair = this.mRequestsID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mRequestsID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        if (!C7382a.m20808h(0L)) {
            return;
        }
        Pair<Integer, String> create = Pair.create(Integer.valueOf(this.mCurrentID), "FRESCO_REQUEST_" + imageRequest.getSourceUri().toString().replace(':', '_'));
        C7382a.m20815a(0L, (String) create.second, this.mCurrentID);
        this.mRequestsID.put(str, create);
        this.mCurrentID = this.mCurrentID + 1;
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        if (C7382a.m20808h(0L) && this.mRequestsID.containsKey(str)) {
            Pair<Integer, String> pair = this.mRequestsID.get(str);
            C7382a.m20811e(0L, (String) pair.second, ((Integer) pair.first).intValue());
            this.mRequestsID.remove(str);
        }
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public boolean requiresExtraMap(String str) {
        return false;
    }
}
