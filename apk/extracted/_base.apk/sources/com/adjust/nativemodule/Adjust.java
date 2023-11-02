package com.adjust.nativemodule;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p021b1.C2030e;
import p021b1.C2033f;
import p021b1.C2036g;
import p021b1.C2041h;
import p021b1.C2049i;
import p021b1.C2051j;
import p021b1.C2053k;
import p021b1.C2074o;
import p021b1.C2076p;
import p021b1.C2080r;
import p021b1.C2082s;
import p021b1.EnumC2052j0;
import p021b1.InterfaceC2071m0;
import p021b1.InterfaceC2073n0;
import p021b1.InterfaceC2075o0;
import p021b1.InterfaceC2077p0;
import p021b1.InterfaceC2079q0;
import p021b1.InterfaceC2081r0;
import p021b1.InterfaceC2083s0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Adjust extends ReactContextBaseJavaModule implements LifecycleEventListener, InterfaceC2071m0, InterfaceC2079q0, InterfaceC2077p0, InterfaceC2083s0, InterfaceC2081r0, InterfaceC2073n0 {
    private static String TAG = "AdjustBridge";
    private boolean attributionCallback;
    private boolean deferredDeeplinkCallback;
    private boolean eventTrackingFailedCallback;
    private boolean eventTrackingSucceededCallback;
    private boolean sessionTrackingFailedCallback;
    private boolean sessionTrackingSucceededCallback;
    private boolean shouldLaunchDeeplink;

    /* renamed from: com.adjust.nativemodule.Adjust$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C2694a implements InterfaceC2075o0 {

        /* renamed from: a */
        final /* synthetic */ Callback f7206a;

        C2694a(Callback callback) {
            this.f7206a = callback;
        }

        @Override // p021b1.InterfaceC2075o0
        /* renamed from: a */
        public void mo32711a(String str) {
            this.f7206a.invoke(str);
        }
    }

    public Adjust(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.shouldLaunchDeeplink = true;
    }

    private boolean checkKey(ReadableMap readableMap, String str) {
        return readableMap.hasKey(str) && !readableMap.isNull(str);
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void addSessionCallbackParameter(String str, String str2) {
        C2030e.m34647a(str, str2);
    }

    @ReactMethod
    public void addSessionPartnerParameter(String str, String str2) {
        C2030e.m34646b(str, str2);
    }

    @ReactMethod
    public void appWillOpenUrl(String str) {
        C2030e.m34645c(Uri.parse(str), getReactApplicationContext());
    }

    @ReactMethod
    public void convertUniversalLink(String str, String str2, Callback callback) {
        callback.invoke("");
    }

    @ReactMethod
    public void create(ReadableMap readableMap) {
        boolean z;
        String str;
        if (readableMap == null) {
            return;
        }
        if (checkKey(readableMap, "logLevel") && readableMap.getString("logLevel").equals("SUPPRESS")) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (checkKey(readableMap, "appToken")) {
            str = readableMap.getString("appToken");
        } else {
            str = null;
        }
        if (checkKey(readableMap, "environment")) {
            str2 = readableMap.getString("environment");
        }
        C2041h c2041h = new C2041h(getReactApplicationContext(), str, str2, z);
        if (!c2041h.m34544e()) {
            return;
        }
        if (checkKey(readableMap, "logLevel")) {
            String string = readableMap.getString("logLevel");
            if (string.equals("VERBOSE")) {
                c2041h.m34537l(EnumC2052j0.VERBOSE);
            } else if (string.equals("DEBUG")) {
                c2041h.m34537l(EnumC2052j0.DEBUG);
            } else if (string.equals("INFO")) {
                c2041h.m34537l(EnumC2052j0.INFO);
            } else if (string.equals("WARN")) {
                c2041h.m34537l(EnumC2052j0.WARN);
            } else if (string.equals("ERROR")) {
                c2041h.m34537l(EnumC2052j0.ERROR);
            } else if (string.equals("ASSERT")) {
                c2041h.m34537l(EnumC2052j0.ASSERT);
            } else if (string.equals("SUPPRESS")) {
                c2041h.m34537l(EnumC2052j0.SUPRESS);
            } else {
                c2041h.m34537l(EnumC2052j0.INFO);
            }
        }
        if (checkKey(readableMap, "eventBufferingEnabled")) {
            c2041h.m34539j(Boolean.valueOf(readableMap.getBoolean("eventBufferingEnabled")));
        }
        if (checkKey(readableMap, "sdkPrefix")) {
            c2041h.m34525x(readableMap.getString("sdkPrefix"));
        }
        if (checkKey(readableMap, "processName")) {
            c2041h.m34526w(readableMap.getString("processName"));
        }
        if (checkKey(readableMap, "defaultTracker")) {
            c2041h.m34542g(readableMap.getString("defaultTracker"));
        }
        if (checkKey(readableMap, "externalDeviceId")) {
            c2041h.m34538k(readableMap.getString("externalDeviceId"));
        }
        if (checkKey(readableMap, "urlStrategy")) {
            String string2 = readableMap.getString("urlStrategy");
            if (string2.equalsIgnoreCase("china")) {
                c2041h.m34523z("url_strategy_china");
            } else if (string2.equalsIgnoreCase("india")) {
                c2041h.m34523z("url_strategy_india");
            } else if (string2.equalsIgnoreCase("data-residency-eu")) {
                c2041h.m34523z("data_residency_eu");
            } else if (string2.equalsIgnoreCase("data-residency-us")) {
                c2041h.m34523z("data_residency_us");
            } else if (string2.equalsIgnoreCase("data-residency-tr")) {
                c2041h.m34523z("data_residency_tr");
            }
        }
        if (checkKey(readableMap, "userAgent")) {
            c2041h.m34549A(readableMap.getString("userAgent"));
        }
        if (checkKey(readableMap, "preinstallFilePath")) {
            c2041h.m34528u(readableMap.getString("preinstallFilePath"));
        }
        if (checkKey(readableMap, "secretId") && checkKey(readableMap, "info1") && checkKey(readableMap, "info2") && checkKey(readableMap, "info3") && checkKey(readableMap, "info4")) {
            try {
                c2041h.m34543f(Long.parseLong(readableMap.getString("secretId"), 10), Long.parseLong(readableMap.getString("info1"), 10), Long.parseLong(readableMap.getString("info2"), 10), Long.parseLong(readableMap.getString("info3"), 10), Long.parseLong(readableMap.getString("info4"), 10));
            } catch (NumberFormatException unused) {
            }
        }
        if (checkKey(readableMap, "sendInBackground")) {
            c2041h.m34524y(readableMap.getBoolean("sendInBackground"));
        }
        if (checkKey(readableMap, "isDeviceKnown")) {
            c2041h.m34540i(readableMap.getBoolean("isDeviceKnown"));
        }
        if (checkKey(readableMap, "preinstallTrackingEnabled")) {
            c2041h.m34527v(readableMap.getBoolean("preinstallTrackingEnabled"));
        }
        if (checkKey(readableMap, "needsCost")) {
            c2041h.m34535n(readableMap.getBoolean("needsCost"));
        }
        if (checkKey(readableMap, "shouldLaunchDeeplink")) {
            this.shouldLaunchDeeplink = readableMap.getBoolean("shouldLaunchDeeplink");
        }
        if (checkKey(readableMap, "delayStart")) {
            c2041h.m34541h(readableMap.getDouble("delayStart"));
        }
        if (this.attributionCallback) {
            c2041h.m34534o(this);
        }
        if (this.eventTrackingSucceededCallback) {
            c2041h.m34531r(this);
        }
        if (this.eventTrackingFailedCallback) {
            c2041h.m34532q(this);
        }
        if (this.sessionTrackingSucceededCallback) {
            c2041h.m34529t(this);
        }
        if (this.sessionTrackingFailedCallback) {
            c2041h.m34530s(this);
        }
        if (this.deferredDeeplinkCallback) {
            c2041h.m34533p(this);
        }
        C2030e.m34634n(c2041h);
        C2030e.m34632p();
    }

    @ReactMethod
    public void disableThirdPartySharing() {
        C2030e.m34644d(getReactApplicationContext());
    }

    @ReactMethod
    public void gdprForgetMe() {
        C2030e.m34642f(getReactApplicationContext());
    }

    @ReactMethod
    public void getAdid(Callback callback) {
        callback.invoke(C2030e.m34641g());
    }

    @ReactMethod
    public void getAmazonAdId(Callback callback) {
        callback.invoke(C2030e.m34640h(getReactApplicationContext()));
    }

    @ReactMethod
    public void getAppTrackingAuthorizationStatus(Callback callback) {
        callback.invoke("-1");
    }

    @ReactMethod
    public void getAttribution(Callback callback) {
        callback.invoke(C2695a.m32710a(C2030e.m34639i()));
    }

    @ReactMethod
    public void getGoogleAdId(Callback callback) {
        C2030e.m34637k(getReactApplicationContext(), new C2694a(callback));
    }

    @ReactMethod
    public void getIdfa(Callback callback) {
        callback.invoke("");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Adjust";
    }

    @ReactMethod
    public void getSdkVersion(String str, Callback callback) {
        String m34636l = C2030e.m34636l();
        if (m34636l == null) {
            callback.invoke("");
            return;
        }
        callback.invoke(str + "@" + m34636l);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @ReactMethod
    public void isEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(C2030e.m34635m()));
    }

    @Override // p021b1.InterfaceC2073n0
    public boolean launchReceivedDeeplink(Uri uri) {
        sendEvent(getReactApplicationContext(), "adjust_deferredDeeplink", C2695a.m32709b(uri));
        return this.shouldLaunchDeeplink;
    }

    @Override // p021b1.InterfaceC2071m0
    public void onAttributionChanged(C2036g c2036g) {
        sendEvent(getReactApplicationContext(), "adjust_attribution", C2695a.m32710a(c2036g));
    }

    @Override // p021b1.InterfaceC2077p0
    public void onFinishedEventTrackingFailed(C2051j c2051j) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingFailed", C2695a.m32708c(c2051j));
    }

    @Override // p021b1.InterfaceC2079q0
    public void onFinishedEventTrackingSucceeded(C2053k c2053k) {
        sendEvent(getReactApplicationContext(), "adjust_eventTrackingSucceeded", C2695a.m32707d(c2053k));
    }

    @Override // p021b1.InterfaceC2081r0
    public void onFinishedSessionTrackingFailed(C2074o c2074o) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingFailed", C2695a.m32706e(c2074o));
    }

    @Override // p021b1.InterfaceC2083s0
    public void onFinishedSessionTrackingSucceeded(C2076p c2076p) {
        sendEvent(getReactApplicationContext(), "adjust_sessionTrackingSucceeded", C2695a.m32705f(c2076p));
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        C2030e.m34633o();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C2030e.m34632p();
    }

    @ReactMethod
    public void onPause() {
        C2030e.m34633o();
    }

    @ReactMethod
    public void onResume() {
        C2030e.m34632p();
    }

    @ReactMethod
    public void removeListeners(double d) {
    }

    @ReactMethod
    public void removeSessionCallbackParameter(String str) {
        C2030e.m34631q(str);
    }

    @ReactMethod
    public void removeSessionPartnerParameter(String str) {
        C2030e.m34630r(str);
    }

    @ReactMethod
    public void requestTrackingAuthorizationWithCompletionHandler(Callback callback) {
        callback.invoke("");
    }

    @ReactMethod
    public void resetSessionCallbackParameters() {
        C2030e.m34629s();
    }

    @ReactMethod
    public void resetSessionPartnerParameters() {
        C2030e.m34628t();
    }

    @ReactMethod
    public void sendFirstPackages() {
        C2030e.m34627u();
    }

    @ReactMethod
    public void setAttributionCallbackListener() {
        this.attributionCallback = true;
    }

    @ReactMethod
    public void setDeferredDeeplinkCallbackListener() {
        this.deferredDeeplinkCallback = true;
    }

    @ReactMethod
    public void setEnabled(Boolean bool) {
        C2030e.m34626v(bool.booleanValue());
    }

    @ReactMethod
    public void setEventTrackingFailedCallbackListener() {
        this.eventTrackingFailedCallback = true;
    }

    @ReactMethod
    public void setEventTrackingSucceededCallbackListener() {
        this.eventTrackingSucceededCallback = true;
    }

    @ReactMethod
    public void setOfflineMode(Boolean bool) {
        C2030e.m34625w(bool.booleanValue());
    }

    @ReactMethod
    public void setPushToken(String str) {
        C2030e.m34624x(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setReferrer(String str) {
        C2030e.m34623y(str, getReactApplicationContext());
    }

    @ReactMethod
    public void setSessionTrackingFailedCallbackListener() {
        this.sessionTrackingFailedCallback = true;
    }

    @ReactMethod
    public void setSessionTrackingSucceededCallbackListener() {
        this.sessionTrackingSucceededCallback = true;
    }

    @ReactMethod
    public void setTestOptions(ReadableMap readableMap) {
        if (readableMap == null) {
            return;
        }
        C2080r c2080r = new C2080r();
        if (checkKey(readableMap, "hasContext") && readableMap.getBoolean("hasContext")) {
            c2080r.f5810a = getReactApplicationContext();
        }
        if (checkKey(readableMap, "baseUrl")) {
            c2080r.f5811b = readableMap.getString("baseUrl");
        }
        if (checkKey(readableMap, "gdprUrl")) {
            c2080r.f5812c = readableMap.getString("gdprUrl");
        }
        if (checkKey(readableMap, "subscriptionUrl")) {
            c2080r.f5813d = readableMap.getString("subscriptionUrl");
        }
        if (checkKey(readableMap, "basePath")) {
            c2080r.f5814e = readableMap.getString("basePath");
        }
        if (checkKey(readableMap, "gdprPath")) {
            c2080r.f5815f = readableMap.getString("gdprPath");
        }
        if (checkKey(readableMap, "subscriptionPath")) {
            c2080r.f5816g = readableMap.getString("subscriptionPath");
        }
        if (checkKey(readableMap, "timerIntervalInMilliseconds")) {
            try {
                c2080r.f5817h = Long.valueOf(Long.parseLong(readableMap.getString("timerIntervalInMilliseconds")));
            } catch (NumberFormatException e) {
                e.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "timerStartInMilliseconds")) {
            try {
                c2080r.f5818i = Long.valueOf(Long.parseLong(readableMap.getString("timerStartInMilliseconds")));
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "sessionIntervalInMilliseconds")) {
            try {
                c2080r.f5819j = Long.valueOf(Long.parseLong(readableMap.getString("sessionIntervalInMilliseconds")));
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "subsessionIntervalInMilliseconds")) {
            try {
                c2080r.f5820k = Long.valueOf(Long.parseLong(readableMap.getString("subsessionIntervalInMilliseconds")));
            } catch (NumberFormatException e4) {
                e4.printStackTrace();
                Log.d(TAG, "Can't format number");
            }
        }
        if (checkKey(readableMap, "noBackoffWait")) {
            c2080r.f5823n = Boolean.valueOf(readableMap.getBoolean("noBackoffWait"));
        }
        if (checkKey(readableMap, "teardown")) {
            c2080r.f5821l = Boolean.valueOf(readableMap.getBoolean("teardown"));
        }
        C2030e.m34622z(c2080r);
    }

    @ReactMethod
    public void teardown() {
        this.attributionCallback = false;
        this.eventTrackingSucceededCallback = false;
        this.eventTrackingFailedCallback = false;
        this.sessionTrackingSucceededCallback = false;
        this.sessionTrackingFailedCallback = false;
        this.deferredDeeplinkCallback = false;
    }

    @ReactMethod
    public void trackAdRevenue(String str, String str2) {
        try {
            C2030e.m34652B(str, new JSONObject(str2));
        } catch (JSONException unused) {
            Log.d(TAG, "Give ad revenue payload is not a valid JSON string");
        }
    }

    @ReactMethod
    public void trackAdRevenueNew(ReadableMap readableMap) {
        String str;
        double d;
        int i;
        Map<String, Object> m32703h;
        Map<String, Object> m32703h2;
        String string;
        String string2;
        String string3;
        if (readableMap == null) {
            return;
        }
        if (checkKey(readableMap, "source")) {
            str = readableMap.getString("source");
        } else {
            str = null;
        }
        C2033f c2033f = new C2033f(str);
        if (checkKey(readableMap, "revenue") || checkKey(readableMap, "currency")) {
            try {
                d = Double.parseDouble(readableMap.getString("revenue"));
            } catch (NumberFormatException unused) {
                d = -1.0d;
            }
            c2033f.m34579i(Double.valueOf(d), readableMap.getString("currency"));
        }
        if (checkKey(readableMap, "adImpressionsCount")) {
            try {
                i = Integer.parseInt(readableMap.getString("adImpressionsCount"));
            } catch (NumberFormatException unused2) {
                i = -1;
            }
            c2033f.m34583e(Integer.valueOf(i));
        }
        if (checkKey(readableMap, "adRevenueNetwork") && (string3 = readableMap.getString("adRevenueNetwork")) != null) {
            c2033f.m34582f(string3);
        }
        if (checkKey(readableMap, "adRevenueUnit") && (string2 = readableMap.getString("adRevenueUnit")) != null) {
            c2033f.m34580h(string2);
        }
        if (checkKey(readableMap, "adRevenuePlacement") && (string = readableMap.getString("adRevenuePlacement")) != null) {
            c2033f.m34581g(string);
        }
        if (checkKey(readableMap, "callbackParameters") && (m32703h2 = C2695a.m32703h(readableMap.getMap("callbackParameters"))) != null) {
            for (Map.Entry<String, Object> entry : m32703h2.entrySet()) {
                c2033f.m34587a(entry.getKey(), entry.getValue().toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (m32703h = C2695a.m32703h(readableMap.getMap("partnerParameters"))) != null) {
            for (Map.Entry<String, Object> entry2 : m32703h.entrySet()) {
                c2033f.m34586b(entry2.getKey(), entry2.getValue().toString());
            }
        }
        C2030e.m34653A(c2033f);
    }

    @ReactMethod
    public void trackEvent(ReadableMap readableMap) {
        String str;
        double d;
        String string;
        String string2;
        Map<String, Object> m32703h;
        Map<String, Object> m32703h2;
        if (readableMap == null) {
            return;
        }
        if (checkKey(readableMap, "eventToken")) {
            str = readableMap.getString("eventToken");
        } else {
            str = null;
        }
        C2049i c2049i = new C2049i(str);
        if (!c2049i.m34450e()) {
            return;
        }
        if (checkKey(readableMap, "revenue") || checkKey(readableMap, "currency")) {
            try {
                d = Double.parseDouble(readableMap.getString("revenue"));
            } catch (NumberFormatException unused) {
                d = -1.0d;
            }
            c2049i.m34447h(d, readableMap.getString("currency"));
        }
        if (checkKey(readableMap, "callbackParameters") && (m32703h2 = C2695a.m32703h(readableMap.getMap("callbackParameters"))) != null) {
            for (Map.Entry<String, Object> entry : m32703h2.entrySet()) {
                c2049i.m34454a(entry.getKey(), entry.getValue().toString());
            }
        }
        if (checkKey(readableMap, "partnerParameters") && (m32703h = C2695a.m32703h(readableMap.getMap("partnerParameters"))) != null) {
            for (Map.Entry<String, Object> entry2 : m32703h.entrySet()) {
                c2049i.m34453b(entry2.getKey(), entry2.getValue().toString());
            }
        }
        if (checkKey(readableMap, "transactionId") && (string2 = readableMap.getString("transactionId")) != null) {
            c2049i.m34448g(string2);
        }
        if (checkKey(readableMap, "callbackId") && (string = readableMap.getString("callbackId")) != null) {
            c2049i.m34449f(string);
        }
        C2030e.m34651C(c2049i);
    }

    @ReactMethod
    public void trackMeasurementConsent(boolean z) {
        C2030e.m34650D(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[LOOP:0: B:37:0x0096->B:39:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d4 A[LOOP:1: B:45:0x00ce->B:47:0x00d4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trackPlayStoreSubscription(com.facebook.react.bridge.ReadableMap r11) {
        /*
            r10 = this;
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "price"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.NumberFormatException -> L14
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L14
            goto L16
        L14:
            r0 = -1
        L16:
            r3 = r0
            java.lang.String r0 = "currency"
            boolean r1 = r10.checkKey(r11, r0)
            r2 = 0
            if (r1 == 0) goto L26
            java.lang.String r0 = r11.getString(r0)
            r5 = r0
            goto L27
        L26:
            r5 = r2
        L27:
            java.lang.String r0 = "sku"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L35
            java.lang.String r0 = r11.getString(r0)
            r6 = r0
            goto L36
        L35:
            r6 = r2
        L36:
            java.lang.String r0 = "orderId"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L44
            java.lang.String r0 = r11.getString(r0)
            r7 = r0
            goto L45
        L44:
            r7 = r2
        L45:
            java.lang.String r0 = "signature"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L53
            java.lang.String r0 = r11.getString(r0)
            r8 = r0
            goto L54
        L53:
            r8 = r2
        L54:
            java.lang.String r0 = "purchaseToken"
            boolean r1 = r10.checkKey(r11, r0)
            if (r1 == 0) goto L62
            java.lang.String r0 = r11.getString(r0)
            r9 = r0
            goto L63
        L62:
            r9 = r2
        L63:
            b1.n r0 = new b1.n
            r2 = r0
            r2.<init>(r3, r5, r6, r7, r8, r9)
            java.lang.String r1 = "purchaseTime"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto L7c
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.NumberFormatException -> L7c
            long r1 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L7c
            r0.m34349m(r1)     // Catch: java.lang.NumberFormatException -> L7c
        L7c:
            java.lang.String r1 = "callbackParameters"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto Lb4
            com.facebook.react.bridge.ReadableMap r1 = r11.getMap(r1)
            java.util.Map r1 = com.adjust.nativemodule.C2695a.m32703h(r1)
            if (r1 == 0) goto Lb4
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = r2.toString()
            r0.m34361a(r3, r2)
            goto L96
        Lb4:
            java.lang.String r1 = "partnerParameters"
            boolean r2 = r10.checkKey(r11, r1)
            if (r2 == 0) goto Lec
            com.facebook.react.bridge.ReadableMap r11 = r11.getMap(r1)
            java.util.Map r11 = com.adjust.nativemodule.C2695a.m32703h(r11)
            if (r11 == 0) goto Lec
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        Lce:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto Lec
            java.lang.Object r1 = r11.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = r1.toString()
            r0.m34360b(r2, r1)
            goto Lce
        Lec:
            p021b1.C2030e.m34649E(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adjust.nativemodule.Adjust.trackPlayStoreSubscription(com.facebook.react.bridge.ReadableMap):void");
    }

    @ReactMethod
    public void trackThirdPartySharing(ReadableMap readableMap) {
        Boolean bool;
        List<Object> m32704g;
        if (readableMap == null) {
            return;
        }
        if (checkKey(readableMap, "isEnabled")) {
            bool = Boolean.valueOf(readableMap.getBoolean("isEnabled"));
        } else {
            bool = null;
        }
        C2082s c2082s = new C2082s(bool);
        if (checkKey(readableMap, "granularOptions") && (m32704g = C2695a.m32704g(readableMap.getArray("granularOptions"))) != null) {
            for (int i = 0; i < m32704g.size(); i += 3) {
                c2082s.m34343a(m32704g.get(i).toString(), m32704g.get(i + 1).toString(), m32704g.get(i + 2).toString());
            }
        }
        C2030e.m34648F(c2082s);
    }

    @ReactMethod
    public void updateConversionValue(int i) {
    }
}
