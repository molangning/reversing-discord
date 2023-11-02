package com.discord.browser_manager;

import android.content.Context;
import com.discord.cache.CacheModule;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J \u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0007J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/browser_manager/BrowserManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cacheModule", "Lcom/discord/cache/CacheModule;", "getCacheModule", "()Lcom/discord/cache/CacheModule;", "getConstants", "", "", "", "getName", "openInAppURL", "", "url", "unused", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "openInChromeURL", "newTab", "", "selectBrowser", "browser", "", "Companion", "browser_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BrowserManagerModule extends ReactContextBaseJavaModule {
    @Deprecated
    private static final String BROWSER_CACHE_KEY = "SELECTED_BROWSER";
    @Deprecated
    private static final int BROWSER_CHROME = 2;
    @Deprecated
    private static final int BROWSER_IN_APP = 1;
    @Deprecated
    private static final int BROWSER_SAFARI = 0;
    private static final Companion Companion = new Companion(null);

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/browser_manager/BrowserManagerModule$Companion;", "", "()V", "BROWSER_CACHE_KEY", "", "BROWSER_CHROME", "", "BROWSER_IN_APP", "BROWSER_SAFARI", "browser_manager_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    private final CacheModule getCacheModule() {
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        return companion.get(reactApplicationContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
        r0 = kotlin.text.C9652n.m13769m(r0);
     */
    @Override // com.facebook.react.bridge.BaseJavaModule
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map<java.lang.String, java.lang.Object> getConstants() {
        /*
            r4 = this;
            com.discord.cache.CacheModule r0 = r4.getCacheModule()
            java.lang.String r1 = "SELECTED_BROWSER"
            java.lang.String r0 = r0.getItem(r1)
            r1 = 1
            if (r0 == 0) goto L18
            java.lang.Integer r0 = kotlin.text.C9642f.m13801m(r0)
            if (r0 == 0) goto L18
            int r0 = r0.intValue()
            goto L19
        L18:
            r0 = r1
        L19:
            r2 = 2
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            java.lang.String r3 = "selectedBrowser"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = pf.C11591x.m7577a(r3, r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "isChromeInstalled"
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            kotlin.Pair r0 = pf.C11591x.m7577a(r0, r3)
            r2[r1] = r0
            java.util.Map r0 = p304qf.C11886s.m6767l(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.browser_manager.BrowserManagerModule.getConstants():java.util.Map");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "BrowserManager";
    }

    @ReactMethod
    public final void openInAppURL(String url, String unused, Promise promise) {
        C9612q.m13917h(url, "url");
        C9612q.m13917h(unused, "unused");
        C9612q.m13917h(promise, "promise");
        BrowserManager browserManager = BrowserManager.INSTANCE;
        Context currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = getReactApplicationContext();
        }
        C9612q.m13918g(currentActivity, "currentActivity ?: reactApplicationContext");
        browserManager.tryOpenUrlWithCustomTabs(currentActivity, url, new BrowserManagerModule$openInAppURL$1(promise));
    }

    @ReactMethod
    public final void openInChromeURL(String url, boolean z, Promise promise) {
        C9612q.m13917h(url, "url");
        C9612q.m13917h(promise, "promise");
        BrowserManager browserManager = BrowserManager.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        browserManager.tryOpenUrlExternally(reactApplicationContext, url, new BrowserManagerModule$openInChromeURL$1(promise));
    }

    @ReactMethod
    public final void selectBrowser(int i) {
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalArgumentException("Unknown browser id provided: " + i);
            }
            getCacheModule().setItem(BROWSER_CACHE_KEY, String.valueOf(i));
            return;
        }
        getCacheModule().setItem(BROWSER_CACHE_KEY, NearbyManager.PERMISSION_DENIED);
    }
}
