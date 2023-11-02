package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class BlobCollector {
    static {
        SoLoader.m30164r("reactnativeblob");
    }

    BlobCollector() {
    }

    public static void install(final ReactContext reactContext, final BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.modules.blob.BlobCollector.1
            @Override // java.lang.Runnable
            public void run() {
                JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
                if (javaScriptContextHolder != null && javaScriptContextHolder.get() != 0) {
                    BlobCollector.nativeInstall(blobModule, javaScriptContextHolder.get());
                }
            }
        });
    }

    public static native void nativeInstall(Object obj, long j);
}