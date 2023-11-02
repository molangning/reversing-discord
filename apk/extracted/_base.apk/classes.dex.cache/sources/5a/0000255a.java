package com.facebook.react.devsupport.interfaces;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DevBundleDownloadListener {
    void onFailure(Exception exc);

    void onProgress(String str, Integer num, Integer num2);

    void onSuccess();
}