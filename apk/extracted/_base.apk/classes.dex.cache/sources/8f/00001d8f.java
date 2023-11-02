package com.discord.react.utilities;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m14357d2 = {"jsiId", "", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "Lcom/facebook/react/bridge/ReactContext;", "react_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ReactContextExtensionsKt {
    public static final long jsiId(ReactContext reactContext) {
        C9612q.m13917h(reactContext, "<this>");
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        C9612q.m13918g(javaScriptContextHolder, "javaScriptContextHolder");
        return jsiId(javaScriptContextHolder);
    }

    public static final long jsiId(JavaScriptContextHolder javaScriptContextHolder) {
        C9612q.m13917h(javaScriptContextHolder, "<this>");
        long j = javaScriptContextHolder.get();
        if (j != 0) {
            return j;
        }
        throw new IllegalStateException("JSI Runtime is not available.".toString());
    }
}