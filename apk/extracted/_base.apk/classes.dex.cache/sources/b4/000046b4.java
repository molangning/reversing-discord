package org.chromium.support_lib_boundary;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public interface WebViewProviderFactoryBoundaryInterface {
    InvocationHandler createWebView(WebView webView);

    InvocationHandler getProxyController();

    InvocationHandler getServiceWorkerController();

    InvocationHandler getStatics();

    String[] getSupportedFeatures();

    InvocationHandler getTracingController();

    InvocationHandler getWebkitToCompatConverter();

    void setSupportLibraryVersion(String str);
}