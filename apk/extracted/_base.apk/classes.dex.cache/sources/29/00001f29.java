package com.discord.samsung;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.lifecycle.C1699p;
import androidx.lifecycle.LifecycleOwner;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.samsung.SamsungConnectActivity;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9654p;
import kotlin.text.C9659r;
import kotlinx.coroutines.C9818l;
import okhttp3.Response;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003*\u0001\b\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J,\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\rH\u0002J\b\u0010\u0016\u001a\u00020\rH\u0016J\u0010\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0014\u0010!\u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0002J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006&"}, m14357d2 = {"Lcom/discord/samsung/SamsungModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "connectionPromise", "Lcom/facebook/react/bridge/Promise;", "samsungActivityEventListener", "com/discord/samsung/SamsungModule$samsungActivityEventListener$1", "Lcom/discord/samsung/SamsungModule$samsungActivityEventListener$1;", "checkIfOAuthRequest", "", "clientId", "", BaseJavaModule.METHOD_TYPE_PROMISE, "finishSamsungAuthorization", "authCode", "location", "state", "getAccountUrlAndAuthCode", "getAccountUrlFromAuthServerUrl", "authServerUrl", "getName", "handleAuthResult", "result", "Lcom/discord/samsung/SamsungConnectActivity$Result;", "handleSamsungCallback", "Landroid/net/Uri;", "response", "Lokhttp3/Response;", "rejectConnection", "throwable", "", "resolveConnection", "what", "", "showConnectionDisclaimer", "Companion", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SamsungModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final Intent disclaimerIntent;
    private Promise connectionPromise;
    private final SamsungModule$samsungActivityEventListener$1 samsungActivityEventListener;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0005\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/samsung/SamsungModule$Companion;", "", "()V", "disclaimerIntent", "Landroid/content/Intent;", "RequestCode", "SamsungCallbackException", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {

        @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/samsung/SamsungModule$Companion$RequestCode;", "", "()V", "Auth", "", "ConnectionDisclaimer", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class RequestCode {
            public static final int Auth = 101;
            public static final int ConnectionDisclaimer = 100;
            public static final RequestCode INSTANCE = new RequestCode();

            private RequestCode() {
            }
        }

        @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/samsung/SamsungModule$Companion$SamsungCallbackException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "errorCode", "", "errorMsg", "(Ljava/lang/String;Ljava/lang/String;)V", "samsung_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
        public static final class SamsungCallbackException extends IllegalStateException {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SamsungCallbackException(String errorCode, String str) {
                super("[" + errorCode + "] " + str);
                C9612q.m13917h(errorCode, "errorCode");
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        Intent putExtra = new Intent("com.msc.action.samsungaccount.REQUEST_NEW_THIRD_PARTY_INTEGRATION_WITH_SAMSUNG_ACCOUNT").putExtra("client_id", BuildConfig.SAMSUNGxDISCORD_CLIENT_ID).putExtra("progress_theme", "dark");
        C9612q.m13918g(putExtra, "Intent(\"com.msc.action.s…\"progress_theme\", \"dark\")");
        disclaimerIntent = putExtra;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.discord.samsung.SamsungModule$samsungActivityEventListener$1, com.facebook.react.bridge.ActivityEventListener] */
    public SamsungModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        ?? r2 = new BaseActivityEventListener() { // from class: com.discord.samsung.SamsungModule$samsungActivityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                String str;
                Bundle extras;
                Bundle extras2;
                String str2 = null;
                if (i != 100) {
                    if (i != 101) {
                        super.onActivityResult(activity, i, i2, intent);
                        return;
                    }
                    int i3 = 0;
                    if (i2 == 500) {
                        SamsungModule samsungModule = SamsungModule.this;
                        if (intent != null) {
                            i3 = intent.getIntExtra(SamsungConnectActivity.EXTRA_ATTEMPT_COUNT, 0);
                        }
                        samsungModule.handleAuthResult(new SamsungConnectActivity.Result.Failure(true, i3));
                    } else if (intent == null) {
                        SamsungModule.this.handleAuthResult(new SamsungConnectActivity.Result.Failure(false, 0, 2, null));
                    } else {
                        String stringExtra = intent.getStringExtra(SamsungConnectActivity.EXTRA_REQ_AUTH_PARAM_AUTH_CODE);
                        String str3 = "";
                        if (stringExtra == null) {
                            stringExtra = "";
                        }
                        String stringExtra2 = intent.getStringExtra(SamsungConnectActivity.EXTRA_REQ_AUTH_PARAM_AUTH_SERVER_URL);
                        if (stringExtra2 != null) {
                            str3 = stringExtra2;
                        }
                        SamsungModule.this.handleAuthResult(new SamsungConnectActivity.Result.Success(stringExtra, str3));
                    }
                } else if (i2 == -1) {
                    SamsungModule.resolveConnection$default(SamsungModule.this, null, 1, null);
                } else {
                    if (intent != null && (extras2 = intent.getExtras()) != null) {
                        str = extras2.getString("error_message");
                    } else {
                        str = null;
                    }
                    if (intent != null && (extras = intent.getExtras()) != null) {
                        str2 = extras.getString("error_code");
                    }
                    SamsungModule.this.rejectConnection(new Throwable("Connection requires disclaimer acceptance. [" + str2 + "] " + str));
                }
            }
        };
        this.samsungActivityEventListener = r2;
        getReactApplicationContext().addActivityEventListener(r2);
    }

    private final String getAccountUrlFromAuthServerUrl(String str) {
        String m13674a1;
        m13674a1 = C9659r.m13674a1(str, 2);
        int hashCode = m13674a1.hashCode();
        if (hashCode == 3179) {
            return !m13674a1.equals("cn") ? "https://account.samsung.com" : "https://account.samsung.cn";
        } else if (hashCode != 3248) {
            return (hashCode == 3742 && m13674a1.equals("us")) ? "https://us.account.samsung.com" : "https://account.samsung.com";
        } else {
            m13674a1.equals("eu");
            return "https://account.samsung.com";
        }
    }

    public final void handleAuthResult(SamsungConnectActivity.Result result) {
        if (result instanceof SamsungConnectActivity.Result.Success) {
            SamsungConnectActivity.Result.Success success = (SamsungConnectActivity.Result.Success) result;
            resolveConnection(NativeArrayExtensionsKt.nativeArrayOf(getAccountUrlFromAuthServerUrl(success.getServerUrl()), success.getAuthCode()));
        } else if (result instanceof SamsungConnectActivity.Result.Failure) {
            SamsungConnectActivity.Result.Failure failure = (SamsungConnectActivity.Result.Failure) result;
            if (failure.isRetryAllowed() && failure.getAttemptCount() < 2) {
                Activity currentActivity = getCurrentActivity();
                C9612q.m13920e(currentActivity);
                SamsungConnectActivity.Companion companion = SamsungConnectActivity.Companion;
                Activity currentActivity2 = getCurrentActivity();
                C9612q.m13920e(currentActivity2);
                currentActivity.startActivityForResult(companion.getIntent(currentActivity2, failure.getAttemptCount()), 101);
                return;
            }
            int attemptCount = failure.getAttemptCount();
            boolean isRetryAllowed = failure.isRetryAllowed();
            rejectConnection(new Throwable("Attempts: " + attemptCount + ", Retry: " + isRetryAllowed));
        }
    }

    public final Uri handleSamsungCallback(Response response) {
        Uri uri;
        String query;
        String str = null;
        String m8690v = Response.m8690v(response, "Location", null, 2, null);
        if (m8690v != null) {
            uri = Uri.parse(m8690v);
        } else {
            uri = null;
        }
        boolean z = false;
        if (uri != null && (query = uri.getQuery()) != null) {
            z = C9654p.m13731M(query, "error", false, 2, null);
        }
        if (!z && (response.m8701X() || response.m8709D())) {
            return uri;
        }
        String str2 = (uri == null || (str2 = uri.getQueryParameter("error")) == null) ? "unknown" : "unknown";
        if (uri != null) {
            str = uri.getQueryParameter("error_description");
        }
        throw new Companion.SamsungCallbackException(str2, str);
    }

    public final void rejectConnection(Throwable th2) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.reject(th2);
        }
        this.connectionPromise = null;
    }

    private final void resolveConnection(Object obj) {
        Promise promise = this.connectionPromise;
        if (promise != null) {
            promise.resolve(obj);
        }
        this.connectionPromise = null;
    }

    public static /* synthetic */ void resolveConnection$default(SamsungModule samsungModule, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        samsungModule.resolveConnection(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0021, code lost:
        if (r3 != false) goto L7;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void checkIfOAuthRequest(java.lang.String r3, com.facebook.react.bridge.Promise r4) {
        /*
            r2 = this;
            java.lang.String r0 = "clientId"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = "promise"
            kotlin.jvm.internal.C9612q.m13917h(r4, r0)
            java.lang.String r0 = "591317049637339146"
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r0)
            if (r3 == 0) goto L24
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r3 < r0) goto L24
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            r1 = 1
            boolean r3 = kotlin.text.C9642f.m13793t(r3, r0, r1)
            if (r3 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            r4.resolve(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.samsung.SamsungModule.checkIfOAuthRequest(java.lang.String, com.facebook.react.bridge.Promise):void");
    }

    @ReactMethod
    public final void finishSamsungAuthorization(String authCode, String str, String str2, Promise promise) {
        C9612q.m13917h(authCode, "authCode");
        C9612q.m13917h(promise, "promise");
        this.connectionPromise = promise;
        Activity currentActivity = getCurrentActivity();
        C9612q.m13919f(currentActivity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        C9818l.m13179d(C1699p.m36032a((LifecycleOwner) currentActivity), null, null, new SamsungModule$finishSamsungAuthorization$1(str, this, str2, authCode, null), 3, null);
    }

    @ReactMethod
    public final void getAccountUrlAndAuthCode(Promise promise) {
        Object m7596b;
        C9612q.m13917h(promise, "promise");
        this.connectionPromise = promise;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            SamsungConnectActivity.Companion companion = SamsungConnectActivity.Companion;
            Activity currentActivity = getCurrentActivity();
            C9612q.m13920e(currentActivity);
            m7596b = C11583s.m7596b(Boolean.valueOf(reactApplicationContext.startActivityForResult(SamsungConnectActivity.Companion.getIntent$default(companion, currentActivity, 0, 2, null), 101, Bundle.EMPTY)));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        Throwable m7593e = C11583s.m7593e(m7596b);
        if (m7593e != null) {
            rejectConnection(m7593e);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Samsung";
    }

    @ReactMethod
    public final void showConnectionDisclaimer(Promise promise) {
        Object m7596b;
        C9612q.m13917h(promise, "promise");
        this.connectionPromise = promise;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(Boolean.valueOf(getReactApplicationContext().startActivityForResult(disclaimerIntent, 100, Bundle.EMPTY)));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        Throwable m7593e = C11583s.m7593e(m7596b);
        if (m7593e != null) {
            rejectConnection(m7593e);
        }
    }
}