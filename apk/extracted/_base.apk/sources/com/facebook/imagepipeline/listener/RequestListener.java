package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.InterfaceC3822o0;
import com.facebook.imagepipeline.request.ImageRequest;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface RequestListener extends InterfaceC3822o0 {
    void onRequestCancellation(String str);

    void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z);

    void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z);

    void onRequestSuccess(ImageRequest imageRequest, String str, boolean z);
}
