package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.core.content.C0946a;
import androidx.core.util.C1136d;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.PermissionAwareActivity;
import com.facebook.react.modules.core.PermissionListener;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.TouchesHelper;
import com.facebook.react.views.scroll.OnScrollDispatchHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ScrollEvent;
import com.facebook.react.views.scroll.ScrollEventType;
import com.reactnativecommunity.webview.C5423b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import je.C8898a;
import je.C8900b;
import je.C8902c;
import je.C8904d;
import je.C8906e;
import je.C8908f;
import je.C8910g;
import je.C8912h;
import org.json.JSONException;
import org.json.JSONObject;
import p392w0.C13355b;
import p392w0.C13356c;
import p392w0.C13363d;
import p414x2.C13677a;

@ReactModule(name = RNCWebViewManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNCWebViewManager extends SimpleViewManager<C5423b> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELEASE = 4001;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String DEFAULT_DOWNLOADING_MESSAGE = "Downloading";
    protected static final String DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebViewContainer";
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static final String TAG = "RNCWebViewManager";
    Set<String> assetLoaderHandlerTypes;
    protected boolean mAllowsFullscreenVideo;
    protected boolean mAllowsProtectedMedia;
    protected String mDownloadingMessage;
    protected String mLackPermissionToDownloadMessage;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected C5409e mWebChromeClient;
    protected InterfaceC5439f1 mWebViewConfig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5405a implements InterfaceC5439f1 {
        C5405a() {
            RNCWebViewManager.this = r1;
        }

        @Override // com.reactnativecommunity.webview.InterfaceC5439f1
        /* renamed from: a */
        public void mo25166a(WebView webView) {
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5406b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ C5410f f15310a;

        /* renamed from: b */
        final /* synthetic */ ThemedReactContext f15311b;

        C5406b(C5410f c5410f, ThemedReactContext themedReactContext) {
            RNCWebViewManager.this = r1;
            this.f15310a = c5410f;
            this.f15311b = themedReactContext;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            this.f15310a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f15311b);
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e) {
                    Log.w(RNCWebViewManager.TAG, "Error getting cookie for DownloadManager", e);
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions(RNCWebViewManager.this.getDownloadingMessage(), RNCWebViewManager.this.getLackPermissionToDownloadMessage())) {
                    module.downloadFile(RNCWebViewManager.this.getDownloadingMessage());
                }
            } catch (IllegalArgumentException e2) {
                Log.w(RNCWebViewManager.TAG, "Unsupported URI, aborting download", e2);
            }
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5407c extends C5409e {

        /* renamed from: x */
        final /* synthetic */ Activity f15313x;

        /* renamed from: y */
        final /* synthetic */ int f15314y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5407c(ReactContext reactContext, WebView webView, Activity activity, int i) {
            super(reactContext, webView);
            RNCWebViewManager.this = r1;
            this.f15313x = activity;
            this.f15314y = i;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f15320l == null) {
                return;
            }
            ViewGroup m25208c = m25208c();
            if (m25208c.getRootView() != this.f15319k.getRootView()) {
                this.f15319k.getRootView().setVisibility(0);
            } else {
                this.f15319k.setVisibility(0);
            }
            this.f15313x.getWindow().clearFlags(512);
            m25208c.removeView(this.f15320l);
            this.f15321m.onCustomViewHidden();
            this.f15320l = null;
            this.f15321m = null;
            this.f15313x.setRequestedOrientation(this.f15314y);
            this.f15318j.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f15320l != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f15320l = view;
            this.f15321m = customViewCallback;
            this.f15313x.setRequestedOrientation(-1);
            this.f15320l.setSystemUiVisibility(7942);
            this.f15313x.getWindow().setFlags(512, 512);
            this.f15320l.setBackgroundColor(-16777216);
            ViewGroup m25208c = m25208c();
            m25208c.addView(this.f15320l, C5409e.f15317w);
            if (m25208c.getRootView() != this.f15319k.getRootView()) {
                this.f15319k.getRootView().setVisibility(8);
            } else {
                this.f15319k.setVisibility(8);
            }
            this.f15318j.addLifecycleEventListener(this);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5408d extends C5409e {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5408d(ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
            RNCWebViewManager.this = r1;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5409e extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: w */
        protected static final FrameLayout.LayoutParams f15317w = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: j */
        protected ReactContext f15318j;

        /* renamed from: k */
        protected View f15319k;

        /* renamed from: l */
        protected View f15320l;

        /* renamed from: m */
        protected WebChromeClient.CustomViewCallback f15321m;

        /* renamed from: n */
        protected PermissionRequest f15322n;

        /* renamed from: o */
        protected List<String> f15323o;

        /* renamed from: p */
        protected GeolocationPermissions.Callback f15324p;

        /* renamed from: q */
        protected String f15325q;

        /* renamed from: r */
        protected boolean f15326r = false;

        /* renamed from: s */
        protected List<String> f15327s = new ArrayList();

        /* renamed from: t */
        protected C5410f.C5412b f15328t = null;

        /* renamed from: u */
        protected boolean f15329u = false;
        @TargetApi(21)

        /* renamed from: v */
        private PermissionListener f15330v = new PermissionListener() { // from class: com.reactnativecommunity.webview.y0
            @Override // com.facebook.react.modules.core.PermissionListener
            public final boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
                boolean m25207d;
                m25207d = RNCWebViewManager.C5409e.this.m25207d(i, strArr, iArr);
                return m25207d;
            }
        };

        public C5409e(ReactContext reactContext, WebView webView) {
            this.f15318j = reactContext;
            this.f15319k = webView;
        }

        /* renamed from: b */
        private PermissionAwareActivity m25209b() {
            Activity currentActivity = this.f15318j.getCurrentActivity();
            if (currentActivity != null) {
                if (currentActivity instanceof PermissionAwareActivity) {
                    return (PermissionAwareActivity) currentActivity;
                }
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }

        /* renamed from: d */
        public /* synthetic */ boolean m25207d(int i, String[] strArr, int[] iArr) {
            PermissionRequest permissionRequest;
            List<String> list;
            boolean z;
            List<String> list2;
            List<String> list3;
            List<String> list4;
            GeolocationPermissions.Callback callback;
            String str;
            this.f15326r = false;
            boolean z2 = false;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str2 = strArr[i2];
                if (iArr[i2] == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f15324p) != null && (str = this.f15325q) != null) {
                    if (z) {
                        callback.invoke(str, true, false);
                    } else {
                        callback.invoke(str, false, false);
                    }
                    this.f15324p = null;
                    this.f15325q = null;
                }
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    if (z && (list4 = this.f15323o) != null) {
                        list4.add("android.webkit.resource.AUDIO_CAPTURE");
                    }
                    z2 = true;
                }
                if (str2.equals("android.permission.CAMERA")) {
                    if (z && (list3 = this.f15323o) != null) {
                        list3.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                    z2 = true;
                }
                if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    if (z && (list2 = this.f15323o) != null) {
                        list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                    }
                    z2 = true;
                }
            }
            if (z2 && (permissionRequest = this.f15322n) != null && (list = this.f15323o) != null) {
                permissionRequest.grant((String[]) list.toArray(new String[0]));
                this.f15322n = null;
                this.f15323o = null;
            }
            if (this.f15327s.isEmpty()) {
                return true;
            }
            m25206e(this.f15327s);
            return false;
        }

        /* renamed from: e */
        private synchronized void m25206e(List<String> list) {
            if (this.f15326r) {
                this.f15327s.addAll(list);
                return;
            }
            PermissionAwareActivity m25209b = m25209b();
            this.f15326r = true;
            m25209b.requestPermissions((String[]) list.toArray(new String[0]), 3, this.f15330v);
            this.f15327s.clear();
        }

        /* renamed from: c */
        protected ViewGroup m25208c() {
            return (ViewGroup) this.f15318j.getCurrentActivity().findViewById(16908290);
        }

        /* renamed from: f */
        public void m25205f(boolean z) {
            this.f15329u = z;
        }

        /* renamed from: g */
        public void m25204g(C5410f.C5412b c5412b) {
            this.f15328t = c5412b;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (C0946a.m38403a(this.f15318j, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f15324p = callback;
                this.f15325q = str;
                m25206e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
                return;
            }
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view = this.f15320l;
            if (view != null && view.getSystemUiVisibility() != 7942) {
                this.f15320l.setSystemUiVisibility(7942);
            }
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f15323o = new ArrayList();
            ArrayList arrayList = new ArrayList();
            String[] resources = permissionRequest.getResources();
            int length = resources.length;
            int i = 0;
            while (true) {
                String str = null;
                if (i >= length) {
                    break;
                }
                String str2 = resources[i];
                if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    str = "android.permission.RECORD_AUDIO";
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    if (!this.f15329u) {
                        str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                    } else {
                        this.f15323o.add(str2);
                    }
                }
                if (str != null) {
                    if (C0946a.m38403a(this.f15318j, str) == 0) {
                        this.f15323o.add(str2);
                    } else {
                        arrayList.add(str);
                    }
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                permissionRequest.grant((String[]) this.f15323o.toArray(new String[0]));
                this.f15323o = null;
                return;
            }
            this.f15322n = permissionRequest;
            m25206e(arrayList);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            String url = webView.getUrl();
            if (this.f15328t.m25191a()) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(TouchesHelper.TARGET_KEY, C5423b.m25172c(webView));
            createMap.putString("title", webView.getTitle());
            createMap.putString("url", url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble("progress", i / 100.0f);
            ((C5410f) webView).m25197g(webView, new C8904d(C5423b.m25172c(webView), createMap));
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            String[] acceptTypes = fileChooserParams.getAcceptTypes();
            boolean z = true;
            if (fileChooserParams.getMode() != 1) {
                z = false;
            }
            return RNCWebViewManager.getModule(this.f15318j).startPhotoPickerIntent(valueCallback, acceptTypes, z);
        }
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5410f extends WebView implements LifecycleEventListener {

        /* renamed from: j */
        protected String f15331j;

        /* renamed from: k */
        protected String f15332k;

        /* renamed from: l */
        protected boolean f15333l;

        /* renamed from: m */
        protected boolean f15334m;

        /* renamed from: n */
        protected boolean f15335n;

        /* renamed from: o */
        protected String f15336o;

        /* renamed from: p */
        protected String f15337p;

        /* renamed from: q */
        protected C5414g f15338q;

        /* renamed from: r */
        protected CatalystInstance f15339r;

        /* renamed from: s */
        protected boolean f15340s;

        /* renamed from: t */
        private OnScrollDispatchHelper f15341t;

        /* renamed from: u */
        protected boolean f15342u;

        /* renamed from: v */
        protected boolean f15343v;

        /* renamed from: w */
        protected C5412b f15344w;

        /* renamed from: x */
        protected ReadableMap f15345x;

        /* renamed from: y */
        WebChromeClient f15346y;

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class RunnableC5411a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ WebView f15347j;

            /* renamed from: k */
            final /* synthetic */ String f15348k;

            /* renamed from: l */
            final /* synthetic */ C5410f f15349l;

            RunnableC5411a(WebView webView, String str, C5410f c5410f) {
                C5410f.this = r1;
                this.f15347j = webView;
                this.f15348k = str;
                this.f15349l = c5410f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C5414g c5414g = C5410f.this.f15338q;
                if (c5414g == null) {
                    return;
                }
                WebView webView = this.f15347j;
                WritableMap m25189a = c5414g.m25189a(webView, webView.getUrl());
                m25189a.putString("data", this.f15348k);
                C5410f c5410f = C5410f.this;
                if (c5410f.f15339r != null) {
                    this.f15349l.m25192l("onMessage", m25189a);
                } else {
                    c5410f.m25197g(this.f15347j, new C8908f(C5423b.m25172c(this.f15347j), m25189a));
                }
            }
        }

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static class C5412b {

            /* renamed from: a */
            private boolean f15351a = false;

            protected C5412b() {
            }

            /* renamed from: a */
            public boolean m25191a() {
                return this.f15351a;
            }

            /* renamed from: b */
            public void m25190b(boolean z) {
                this.f15351a = z;
            }
        }

        /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$f$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class C5413c {

            /* renamed from: a */
            C5410f f15352a;

            C5413c(C5410f c5410f) {
                C5410f.this = r1;
                this.f15352a = c5410f;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f15352a.m25193k(str);
            }
        }

        public C5410f(ThemedReactContext themedReactContext) {
            super(themedReactContext);
            this.f15333l = true;
            this.f15334m = true;
            this.f15335n = false;
            this.f15340s = false;
            this.f15342u = false;
            this.f15343v = false;
            m25199e();
            this.f15344w = new C5412b();
            setBackgroundColor(0);
        }

        /* renamed from: j */
        public /* synthetic */ void m25194j(WebView webView, String str, ReactContext reactContext) {
            WritableMap m25189a = this.f15338q.m25189a(webView, webView.getUrl());
            m25189a.putString("webViewKey", this.f15336o);
            m25189a.putString("data", str);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeWebViewOnMessageWithWebViewKey", m25189a);
        }

        /* renamed from: b */
        public void m25202b() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f15331j) != null && !TextUtils.isEmpty(str)) {
                m25196h("(function() {\n" + this.f15331j + ";\n})();");
            }
        }

        /* renamed from: c */
        public void m25201c() {
            String str;
            if (getSettings().getJavaScriptEnabled() && (str = this.f15332k) != null && !TextUtils.isEmpty(str)) {
                m25196h("(function() {\n" + this.f15332k + ";\n})();");
            }
        }

        /* renamed from: d */
        public void m25200d() {
            setWebViewClient(null);
            destroy();
        }

        @Override // android.webkit.WebView
        public void destroy() {
            WebChromeClient webChromeClient = this.f15346y;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        /* renamed from: e */
        protected void m25199e() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.f15339r = reactContext.getCatalystInstance();
            }
        }

        /* renamed from: f */
        protected C5413c m25198f(C5410f c5410f) {
            return new C5413c(c5410f);
        }

        /* renamed from: g */
        protected void m25197g(WebView webView, Event event) {
            if (event.getViewTag() == -1) {
                C13677a.m1868J(RNCWebViewManager.TAG, "Unable to dispatch event: ", event.getEventName() + "due to RNCWebView not being attached.");
                return;
            }
            ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
        }

        public C5414g getRNCWebViewClient() {
            return this.f15338q;
        }

        /* renamed from: h */
        public void m25196h(String str) {
            evaluateJavascript(str, null);
        }

        /* renamed from: i */
        public boolean m25195i(ReadableMap readableMap) {
            Map hashMap;
            Object hashMap2;
            if (this.f15345x == null || readableMap == null) {
                return true;
            }
            String[] strArr = {"uri", "method", "body", "html", "baseUrl"};
            for (int i = 0; i < 5; i++) {
                String str = strArr[i];
                String string = this.f15345x.getString(str);
                String string2 = readableMap.getString(str);
                if (string2 != null && !string2.equals(string)) {
                    return true;
                }
            }
            ReadableMap map = this.f15345x.getMap("headers");
            ReadableMap map2 = readableMap.getMap("headers");
            if (map == null) {
                hashMap = Collections.emptyMap();
            } else {
                hashMap = map.toHashMap();
            }
            if (map2 == null) {
                hashMap2 = Collections.emptyMap();
            } else {
                hashMap2 = map2.toHashMap();
            }
            return !hashMap.equals(hashMap2);
        }

        /* renamed from: k */
        public void m25193k(final String str) {
            final ReactContext reactContext = (ReactContext) getContext();
            if (this.f15336o != null && this.f15338q != null) {
                reactContext.runOnUiQueueThread(new Runnable() { // from class: com.reactnativecommunity.webview.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        RNCWebViewManager.C5410f.this.m25194j(this, str, reactContext);
                    }
                });
            } else if (this.f15338q != null) {
                post(new RunnableC5411a(this, str, this));
            } else {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("data", str);
                if (this.f15339r != null) {
                    m25192l("onMessage", createMap);
                } else {
                    m25197g(this, new C8908f(C5423b.m25172c(this), createMap));
                }
            }
        }

        /* renamed from: l */
        protected void m25192l(String str, WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.f15339r.callFunction(this.f15337p, str, writableNativeArray);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            m25200d();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            if (!this.f15342u) {
                return;
            }
            if (this.f15341t == null) {
                this.f15341t = new OnScrollDispatchHelper();
            }
            if (this.f15341t.onScrollChanged(i, i2)) {
                m25197g(this, ScrollEvent.obtain(C5423b.m25172c(this), ScrollEventType.SCROLL, i, i2, this.f15341t.getXFlingVelocity(), this.f15341t.getYFlingVelocity(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (this.f15340s) {
                m25197g(this, new ContentSizeChangeEvent(C5423b.m25172c(this), i, i2));
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.f15343v) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onTouchEvent(motionEvent);
        }

        public void setBasicAuthCredential(C5420a c5420a) {
            this.f15338q.m25187c(c5420a);
        }

        public void setHasScrollEvent(boolean z) {
            this.f15342u = z;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.f15338q.m25186d(str);
        }

        public void setInjectedJavaScript(String str) {
            this.f15331j = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.f15332k = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z) {
            this.f15334m = z;
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z) {
            this.f15333l = z;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z) {
            if (this.f15335n == z) {
                return;
            }
            this.f15335n = z;
            if (z) {
                addJavascriptInterface(m25198f(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
            } else {
                removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
            }
        }

        public void setMessagingModuleName(String str) {
            this.f15337p = str;
        }

        public void setNestedScrollEnabled(boolean z) {
            this.f15343v = z;
        }

        public void setSendContentSizeChangeEvents(boolean z) {
            this.f15340s = z;
        }

        public void setSource(ReadableMap readableMap) {
            this.f15345x = readableMap;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.f15346y = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof C5409e) {
                ((C5409e) webChromeClient).m25204g(this.f15344w);
            }
        }

        public void setWebViewAssetLoader(C13356c c13356c) {
            this.f15338q.m25183g(c13356c);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof C5414g) {
                C5414g c5414g = (C5414g) webViewClient;
                this.f15338q = c5414g;
                c5414g.m25185e(this.f15344w);
            }
        }

        public void setWebViewKey(String str) {
            this.f15336o = str;
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mAllowsProtectedMedia = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mDownloadingMessage = null;
        this.mLackPermissionToDownloadMessage = null;
        this.assetLoaderHandlerTypes = new HashSet(Arrays.asList("assets", "internal", "resources"));
        this.mWebViewConfig = new C5405a();
    }

    public String getDownloadingMessage() {
        String str = this.mDownloadingMessage;
        return str == null ? DEFAULT_DOWNLOADING_MESSAGE : str;
    }

    public String getLackPermissionToDownloadMessage() {
        return this.mDownloadingMessage == null ? DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE : this.mLackPermissionToDownloadMessage;
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    public static /* synthetic */ void lambda$addEventEmitters$43(C5410f c5410f) {
        c5410f.setWebViewClient(new C5414g());
    }

    public /* synthetic */ void lambda$onDropViewInstance$45(C5423b c5423b, C5410f c5410f) {
        if (c5410f.f15336o == null) {
            ((ThemedReactContext) c5410f.getContext()).removeLifecycleEventListener(c5410f);
            c5410f.m25200d();
            this.mWebChromeClient = null;
            return;
        }
        c5423b.m25170e();
        C5427b1.f15383a.m25168b().remove(Integer.valueOf(c5410f.getId()));
        if (c5423b.f15379j != 0) {
            ViewGroup viewGroup = (ViewGroup) ((UIManagerModule) ((ReactContext) c5423b.getContext()).getNativeModule(UIManagerModule.class)).resolveView(c5423b.f15379j);
            viewGroup.addView(c5410f);
            c5410f.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getMeasuredHeight(), 1073741824));
            c5410f.layout(0, 0, c5410f.getMeasuredWidth(), c5410f.getMeasuredHeight());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static /* synthetic */ void lambda$receiveCommand$44(String str, ReadableArray readableArray, C5410f c5410f) {
        char c;
        JSONObject jSONObject;
        boolean z = true;
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -948122918:
                if (str.equals("stopLoading")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -759238347:
                if (str.equals("clearCache")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -265032709:
                if (str.equals("clearFormData")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 336631465:
                if (str.equals("loadUrl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 903120263:
                if (str.equals("clearHistory")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1090594823:
                if (str.equals("release")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                c5410f.goBack();
                return;
            case 1:
                c5410f.goForward();
                return;
            case 2:
                c5410f.reload();
                return;
            case 3:
                c5410f.stopLoading();
                return;
            case 4:
                try {
                    new JSONObject().put("data", readableArray.getString(0));
                    c5410f.m25196h("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            case 5:
                c5410f.m25196h(readableArray.getString(0));
                return;
            case 6:
                if (readableArray != null) {
                    c5410f.f15344w.m25190b(false);
                    c5410f.loadUrl(readableArray.getString(0));
                    return;
                }
                throw new RuntimeException("Arguments for loading an url are null!");
            case 7:
                c5410f.requestFocus();
                return;
            case '\b':
                c5410f.clearFormData();
                return;
            case '\t':
                if (readableArray == null || !readableArray.getBoolean(0)) {
                    z = false;
                }
                c5410f.clearCache(z);
                return;
            case '\n':
                c5410f.clearHistory();
                return;
            default:
                return;
        }
    }

    public static /* synthetic */ void lambda$setAllowFileAccess$38(Boolean bool, C5410f c5410f) {
        c5410f.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    public static /* synthetic */ void lambda$setAllowFileAccessFromFileURLs$20(boolean z, C5410f c5410f) {
        c5410f.getSettings().setAllowFileAccessFromFileURLs(z);
    }

    public static /* synthetic */ void lambda$setAllowUniversalAccessFromFileURLs$21(boolean z, C5410f c5410f) {
        c5410f.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    public /* synthetic */ void lambda$setAllowsFullscreenVideo$37(C5423b c5423b, C5410f c5410f) {
        setupWebChromeClient((ReactContext) c5423b.getContext(), c5410f);
    }

    public static /* synthetic */ void lambda$setAssetLoaderConfig$11(C13356c c13356c, C5410f c5410f) {
        c5410f.setWebViewAssetLoader(c13356c);
        if (c5410f.getUrl() != null) {
            c5410f.reload();
        }
    }

    public static /* synthetic */ void lambda$setBasicAuthCredential$31(ReadableMap readableMap, C5410f c5410f) {
        C5420a c5420a;
        if (readableMap != null && readableMap.hasKey("username") && readableMap.hasKey("password")) {
            c5420a = new C5420a(readableMap.getString("username"), readableMap.getString("password"));
        } else {
            c5420a = null;
        }
        c5410f.setBasicAuthCredential(c5420a);
    }

    public static /* synthetic */ void lambda$setBuiltInZoomControls$1(boolean z, C5410f c5410f) {
        c5410f.getSettings().setBuiltInZoomControls(z);
    }

    public static /* synthetic */ void lambda$setCacheEnabled$7(boolean z, C5410f c5410f) {
        c5410f.getSettings().setCacheMode(z ? -1 : 2);
    }

    public static /* synthetic */ void lambda$setCacheMode$8(Integer num, C5410f c5410f) {
        c5410f.getSettings().setCacheMode(num.intValue());
    }

    public static /* synthetic */ void lambda$setDisplayZoomControls$2(boolean z, C5410f c5410f) {
        c5410f.getSettings().setDisplayZoomControls(z);
    }

    public static /* synthetic */ void lambda$setDomStorageEnabled$17(boolean z, C5410f c5410f) {
        c5410f.getSettings().setDomStorageEnabled(z);
    }

    public static /* synthetic */ void lambda$setForceDarkOn$41(boolean z, C5410f c5410f) {
        int i;
        if (Build.VERSION.SDK_INT > 28) {
            if (C13363d.m2705a("FORCE_DARK")) {
                if (z) {
                    i = 2;
                } else {
                    i = 0;
                }
                C13355b.m2716b(c5410f.getSettings(), i);
            }
            if (z && C13363d.m2705a("FORCE_DARK_STRATEGY")) {
                C13355b.m2715c(c5410f.getSettings(), 2);
            }
        }
    }

    public static /* synthetic */ void lambda$setGeolocationEnabled$39(Boolean bool, C5410f c5410f) {
        c5410f.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    public static /* synthetic */ void lambda$setIncognito$29(C5410f c5410f) {
        c5410f.getSettings().setCacheMode(2);
        c5410f.clearHistory();
        c5410f.clearCache(true);
        c5410f.clearFormData();
        c5410f.getSettings().setSavePassword(false);
        c5410f.getSettings().setSaveFormData(false);
    }

    public static /* synthetic */ void lambda$setJavaScriptCanOpenWindowsAutomatically$19(boolean z, C5410f c5410f) {
        c5410f.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
    }

    public static /* synthetic */ void lambda$setJavaScriptEnabled$0(boolean z, C5410f c5410f) {
        c5410f.getSettings().setJavaScriptEnabled(z);
    }

    public static /* synthetic */ void lambda$setMediaPlaybackRequiresUserAction$18(boolean z, C5410f c5410f) {
        c5410f.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    public static /* synthetic */ void lambda$setMinimumFontSize$42(int i, C5410f c5410f) {
        c5410f.getSettings().setMinimumFontSize(i);
    }

    public static /* synthetic */ void lambda$setMixedContentMode$33(C5410f c5410f) {
        c5410f.getSettings().setMixedContentMode(1);
    }

    public static /* synthetic */ void lambda$setMixedContentMode$34(C5410f c5410f) {
        c5410f.getSettings().setMixedContentMode(0);
    }

    public static /* synthetic */ void lambda$setMixedContentMode$35(C5410f c5410f) {
        c5410f.getSettings().setMixedContentMode(2);
    }

    public static /* synthetic */ void lambda$setOverScrollMode$12(Integer num, C5410f c5410f) {
        c5410f.setOverScrollMode(num.intValue());
    }

    public static /* synthetic */ void lambda$setSaveFormDataDisabled$22(boolean z, C5410f c5410f) {
        c5410f.getSettings().setSaveFormData(!z);
    }

    public static /* synthetic */ void lambda$setScalesPageToFit$16(boolean z, C5410f c5410f) {
        c5410f.getSettings().setLoadWithOverviewMode(z);
        c5410f.getSettings().setUseWideViewPort(z);
    }

    public static /* synthetic */ void lambda$setSource$30(ReadableMap readableMap, C5410f c5410f) {
        byte[] bArr;
        String str;
        if (c5410f.f15336o != null && !c5410f.m25195i(readableMap)) {
            return;
        }
        c5410f.setSource(readableMap);
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    str = readableMap.getString("baseUrl");
                } else {
                    str = "";
                }
                c5410f.loadDataWithBaseURL(str, string, HTML_MIME_TYPE, HTML_ENCODING, null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = c5410f.getUrl();
                if (url != null && url.equals(string2)) {
                    return;
                }
                if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                    if (readableMap.hasKey("body")) {
                        String string3 = readableMap.getString("body");
                        try {
                            bArr = string3.getBytes(HTML_ENCODING);
                        } catch (UnsupportedEncodingException unused) {
                            bArr = string3.getBytes();
                        }
                    } else {
                        bArr = null;
                    }
                    if (bArr == null) {
                        bArr = new byte[0];
                    }
                    c5410f.postUrl(string2, bArr);
                    return;
                }
                HashMap hashMap = new HashMap();
                if (readableMap.hasKey("headers")) {
                    ReadableMap map = readableMap.getMap("headers");
                    ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        if ("user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                            if (c5410f.getSettings() != null) {
                                c5410f.getSettings().setUserAgentString(map.getString(nextKey));
                            }
                        } else {
                            hashMap.put(nextKey, map.getString(nextKey));
                        }
                    }
                }
                c5410f.loadUrl(string2, hashMap);
                return;
            }
        }
        c5410f.loadUrl(BLANK_URL);
    }

    public static /* synthetic */ void lambda$setSupportMultipleWindows$3(boolean z, C5410f c5410f) {
        c5410f.getSettings().setSupportMultipleWindows(z);
    }

    public static /* synthetic */ void lambda$setTextZoom$15(int i, C5410f c5410f) {
        c5410f.getSettings().setTextZoom(i);
    }

    public static /* synthetic */ void lambda$setThirdPartyCookiesEnabled$14(boolean z, C5410f c5410f) {
        CookieManager.getInstance().setAcceptThirdPartyCookies(c5410f, z);
    }

    public static /* synthetic */ void lambda$setUrlPrefixesForDefaultIntent$36(ReadableArray readableArray, C5410f c5410f) {
        C5414g rNCWebViewClient = c5410f.getRNCWebViewClient();
        if (rNCWebViewClient != null && readableArray != null) {
            rNCWebViewClient.m25184f(readableArray);
        }
    }

    public static /* synthetic */ void lambda$setWebViewKey$4(String str, C5423b c5423b, Map map, C5410f c5410f) {
        c5410f.setWebViewKey(str);
        C5427b1.f15383a.m25168b().put(Integer.valueOf(c5410f.getId()), Integer.valueOf(c5423b.getId()));
        map.put(str, c5410f);
    }

    protected C5410f createRNCWebViewInstance(ThemedReactContext themedReactContext) {
        return new C5410f(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.builder().put("goBack", 1).put("goForward", 2).put("reload", 3).put("stopLoading", 4).put("postMessage", 5).put("injectJavaScript", 6).put("loadUrl", 7).put("requestFocus", 8).put("clearFormData", Integer.valueOf((int) COMMAND_CLEAR_FORM_DATA)).put("clearCache", Integer.valueOf((int) COMMAND_CLEAR_CACHE)).put("clearHistory", Integer.valueOf((int) COMMAND_CLEAR_HISTORY)).put("release", Integer.valueOf((int) COMMAND_RELEASE)).build();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = MapBuilder.newHashMap();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", MapBuilder.m30470of("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", MapBuilder.m30470of("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", MapBuilder.m30470of("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", MapBuilder.m30470of("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", MapBuilder.m30470of("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", MapBuilder.m30470of("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(ScrollEventType.getJSEventName(ScrollEventType.SCROLL), MapBuilder.m30470of("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", MapBuilder.m30470of("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", MapBuilder.m30470of("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "allowFileAccess")
    public void setAllowFileAccess(C5423b c5423b, final Boolean bool) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.k
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setAllowFileAccess$38(bool, c5410f);
            }
        });
    }

    @ReactProp(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.s0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setAllowFileAccessFromFileURLs$20(z, c5410f);
            }
        });
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.m
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setAllowUniversalAccessFromFileURLs$21(z, c5410f);
            }
        });
    }

    @ReactProp(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(final C5423b c5423b, Boolean bool) {
        boolean z;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.mAllowsFullscreenVideo = z;
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.o
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.this.lambda$setAllowsFullscreenVideo$37(c5423b, c5410f);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0008, code lost:
        r3 = r3.getWebChromeClient();
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "allowsProtectedMedia")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAllowsProtectedMedia(android.webkit.WebView r3, boolean r4) {
        /*
            r2 = this;
            r2.mAllowsProtectedMedia = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            android.webkit.WebChromeClient r3 = com.reactnativecommunity.webview.C5428c.m25167a(r3)
            if (r3 == 0) goto L17
            boolean r0 = r3 instanceof com.reactnativecommunity.webview.RNCWebViewManager.C5409e
            if (r0 == 0) goto L17
            com.reactnativecommunity.webview.RNCWebViewManager$e r3 = (com.reactnativecommunity.webview.RNCWebViewManager.C5409e) r3
            r3.m25205f(r4)
        L17:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativecommunity.webview.RNCWebViewManager.setAllowsProtectedMedia(android.webkit.WebView, boolean):void");
    }

    @ReactProp(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(C5423b c5423b, String str) {
        if (str != null) {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(c5423b.getContext());
            this.mUserAgentWithApplicationName = defaultUserAgent + " " + str;
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        c5423b.m25171d(new C5437f(this));
    }

    @ReactProp(name = "androidAssetLoaderConfig")
    public void setAssetLoaderConfig(C5423b c5423b, ReadableMap readableMap) {
        C13356c.C13358b c13358b = new C13356c.C13358b();
        String string = readableMap.getString("domain");
        if (string != null) {
            c13358b.m2711c(string);
        }
        if (readableMap.hasKey("httpAllowed")) {
            c13358b.m2710d(readableMap.getBoolean("httpAllowed"));
        }
        ReadableArray array = readableMap.getArray("pathHandlers");
        if (array != null && array.size() > 0) {
            for (int i = 0; i < array.size(); i++) {
                ReadableMap map = array.getMap(i);
                String string2 = map.getString("type");
                if (string2 == null) {
                    C13677a.m1870H(TAG, "WebViewAssetLoader error. Path Handler type is null.");
                } else if (!this.assetLoaderHandlerTypes.contains(string2)) {
                    C13677a.m1870H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Unexpected handler type: " + string2 + ". Path Handler type must be one of " + this.assetLoaderHandlerTypes);
                } else {
                    String string3 = map.getString("path");
                    if (string3 == null) {
                        C13677a.m1870H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Handler path is missing");
                    } else if (string2.equals("resources")) {
                        c13358b.m2713a(string3, new C13356c.C13362f(c5423b.getContext()));
                    } else if (string2.equals("assets")) {
                        c13358b.m2713a(string3, new C13356c.C13357a(c5423b.getContext()));
                    } else if (string2.equals("internal")) {
                        String string4 = map.getString("directory");
                        if (string4 == null) {
                            C13677a.m1870H(TAG, "WebViewAssetLoader error. Skipping Path Handler. Directory is missing for internal handler path");
                        } else {
                            c13358b.m2713a(string3, new C13356c.C13359c(c5423b.getContext(), new File(string4)));
                        }
                    }
                }
            }
        } else {
            C13677a.m1870H(TAG, "WebViewAssetLoader error. No Path Handlers found.");
        }
        final C13356c m2712b = c13358b.m2712b();
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.h
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setAssetLoaderConfig$11(C13356c.this, c5410f);
            }
        });
    }

    @ReactProp(name = "basicAuthCredential")
    public void setBasicAuthCredential(C5423b c5423b, final ReadableMap readableMap) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.n0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setBasicAuthCredential$31(ReadableMap.this, c5410f);
            }
        });
    }

    @ReactProp(name = "setBuiltInZoomControls")
    public void setBuiltInZoomControls(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.k0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setBuiltInZoomControls$1(z, c5410f);
            }
        });
    }

    @ReactProp(name = "cacheEnabled")
    public void setCacheEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.z
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setCacheEnabled$7(z, c5410f);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @ReactProp(name = "cacheMode")
    public void setCacheMode(C5423b c5423b, String str) {
        boolean z;
        final int i;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    z = true;
                    break;
                }
                z = true;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    z = false;
                    break;
                }
                z = true;
                break;
            default:
                z = true;
                break;
        }
        if (z) {
            if (!z) {
                if (!z) {
                    i = -1;
                } else {
                    i = 2;
                }
            } else {
                i = 1;
            }
        } else {
            i = 3;
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.g0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setCacheMode$8(i, c5410f);
            }
        });
    }

    @ReactProp(name = "setDisplayZoomControls")
    public void setDisplayZoomControls(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.o0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setDisplayZoomControls$2(z, c5410f);
            }
        });
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.d0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setDomStorageEnabled$17(z, c5410f);
            }
        });
    }

    @ReactProp(name = "downloadingMessage")
    public void setDownloadingMessage(WebView webView, String str) {
        this.mDownloadingMessage = str;
    }

    @ReactProp(name = "forceDarkOn")
    public void setForceDarkOn(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.x0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setForceDarkOn$41(z, c5410f);
            }
        });
    }

    @ReactProp(name = "geolocationEnabled")
    public void setGeolocationEnabled(C5423b c5423b, final Boolean bool) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.n
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setGeolocationEnabled$39(bool, c5410f);
            }
        });
    }

    @ReactProp(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(C5423b c5423b, boolean z) {
        if (z) {
            c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.c0
                @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
                /* renamed from: a */
                public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                    c5410f.setLayerType(1, null);
                }
            });
        }
    }

    @ReactProp(name = "incognito")
    public void setIncognito(C5423b c5423b, boolean z) {
        if (!z) {
            return;
        }
        CookieManager.getInstance().removeAllCookies(null);
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.p
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setIncognito$29(c5410f);
            }
        });
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(C5423b c5423b, final String str) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.y
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setInjectedJavaScript(str);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(C5423b c5423b, final String str) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.u0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setInjectedJavaScriptBeforeContentLoaded(str);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.g
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z);
            }
        });
    }

    @ReactProp(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.i
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setInjectedJavaScriptForMainFrameOnly(z);
            }
        });
    }

    @ReactProp(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.m0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setJavaScriptCanOpenWindowsAutomatically$19(z, c5410f);
            }
        });
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.r0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setJavaScriptEnabled$0(z, c5410f);
            }
        });
    }

    @ReactProp(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownlaodMessage(WebView webView, String str) {
        this.mLackPermissionToDownloadMessage = str;
    }

    @ReactProp(name = "androidLayerType")
    public void setLayerType(C5423b c5423b, String str) {
        final int i;
        str.hashCode();
        if (!str.equals("hardware")) {
            if (!str.equals("software")) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.p0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setLayerType(i, null);
            }
        });
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.q
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setMediaPlaybackRequiresUserAction$18(z, c5410f);
            }
        });
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.i0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setMessagingEnabled(z);
            }
        });
    }

    @ReactProp(name = "messagingModuleName")
    public void setMessagingModuleName(C5423b c5423b, final String str) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.u
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setMessagingModuleName(str);
            }
        });
    }

    @ReactProp(name = "minimumFontSize")
    public void setMinimumFontSize(C5423b c5423b, final int i) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.l
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setMinimumFontSize$42(i, c5410f);
            }
        });
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(C5423b c5423b, String str) {
        if (str != null && !ReactScrollViewHelper.OVER_SCROLL_NEVER.equals(str)) {
            if (ReactScrollViewHelper.OVER_SCROLL_ALWAYS.equals(str)) {
                c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.w
                    @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
                    /* renamed from: a */
                    public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                        RNCWebViewManager.lambda$setMixedContentMode$34(c5410f);
                    }
                });
                return;
            } else if ("compatibility".equals(str)) {
                c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.x
                    @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
                    /* renamed from: a */
                    public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                        RNCWebViewManager.lambda$setMixedContentMode$35(c5410f);
                    }
                });
                return;
            } else {
                return;
            }
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.v
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setMixedContentMode$33(c5410f);
            }
        });
    }

    @ReactProp(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.s
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setNestedScrollEnabled(z);
            }
        });
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.j
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setSendContentSizeChangeEvents(z);
            }
        });
    }

    @ReactProp(name = "onScroll")
    public void setOnScroll(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.v0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setHasScrollEvent(z);
            }
        });
    }

    @ReactProp(name = "overScrollMode")
    public void setOverScrollMode(C5423b c5423b, String str) {
        char c;
        final int i;
        int hashCode = str.hashCode();
        if (hashCode != -1414557169) {
            if (hashCode != 104712844) {
                if (hashCode == 951530617 && str.equals("content")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals(ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
                    c = 0;
                }
                c = 65535;
            }
        } else {
            if (str.equals(ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.j0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setOverScrollMode$12(i, c5410f);
            }
        });
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.t0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setSaveFormDataDisabled$22(z, c5410f);
            }
        });
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.t
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setScalesPageToFit$16(z, c5410f);
            }
        });
    }

    @ReactProp(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.e0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setHorizontalScrollBarEnabled(z);
            }
        });
    }

    @ReactProp(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.h0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                c5410f.setVerticalScrollBarEnabled(z);
            }
        });
    }

    @ReactProp(name = "source")
    public void setSource(C5423b c5423b, final ReadableMap readableMap) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.l0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setSource$30(ReadableMap.this, c5410f);
            }
        });
    }

    @ReactProp(name = "setSupportMultipleWindows")
    public void setSupportMultipleWindows(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.w0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setSupportMultipleWindows$3(z, c5410f);
            }
        });
    }

    @ReactProp(name = "temporaryParentNodeTag")
    public void setTemporaryParentNodeTag(C5423b c5423b, int i) {
        c5423b.f15379j = i;
    }

    @ReactProp(name = "textZoom")
    public void setTextZoom(C5423b c5423b, final int i) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.d
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setTextZoom$15(i, c5410f);
            }
        });
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(C5423b c5423b, final boolean z) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.f0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setThirdPartyCookiesEnabled$14(z, c5410f);
            }
        });
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(C5423b c5423b, final ReadableArray readableArray) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.b0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$setUrlPrefixesForDefaultIntent$36(ReadableArray.this, c5410f);
            }
        });
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(C5423b c5423b, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        c5423b.m25171d(new C5437f(this));
    }

    public void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    @ReactProp(name = "webViewKey")
    public void setWebViewKey(final C5423b c5423b, final String str) {
        final Map<String, WebView> m25169a = C5427b1.f15383a.m25169a();
        if (m25169a.containsKey(str)) {
            C5410f c5410f = (C5410f) m25169a.get(str);
            ViewGroup viewGroup = (ViewGroup) c5410f.getParent();
            if (viewGroup != null && (viewGroup instanceof C5423b)) {
                C5423b c5423b2 = (C5423b) c5410f.getParent();
                c5423b2.m25173b();
                setupWebChromeClient((ThemedReactContext) c5423b2.getContext(), c5410f);
            }
            if (viewGroup != null) {
                viewGroup.removeView(c5410f);
            }
            c5423b.m25174a(c5410f);
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.q0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f2) {
                RNCWebViewManager.lambda$setWebViewKey$4(str, c5423b, m25169a, c5410f2);
            }
        });
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        Activity currentActivity = reactContext.getCurrentActivity();
        if (this.mAllowsFullscreenVideo && currentActivity != null) {
            this.mWebChromeClient = new C5407c(reactContext, webView, currentActivity, currentActivity.getRequestedOrientation());
        } else {
            C5409e c5409e = this.mWebChromeClient;
            if (c5409e != null) {
                c5409e.onHideCustomView();
            }
            this.mWebChromeClient = new C5408d(reactContext, webView);
        }
        this.mWebChromeClient.m25205f(this.mAllowsProtectedMedia);
        webView.setWebChromeClient(this.mWebChromeClient);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, C5423b c5423b) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.r
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$addEventEmitters$43(c5410f);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public C5423b createViewInstance(ThemedReactContext themedReactContext) {
        C5423b c5423b = new C5423b(themedReactContext);
        C5410f createRNCWebViewInstance = createRNCWebViewInstance(themedReactContext);
        c5423b.m25174a(createRNCWebViewInstance);
        C5427b1.f15383a.m25168b().put(Integer.valueOf(createRNCWebViewInstance.getId()), Integer.valueOf(c5423b.getId()));
        setupWebChromeClient(themedReactContext, createRNCWebViewInstance);
        themedReactContext.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.mo25166a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        setAllowUniversalAccessFromFileURLs(c5423b, false);
        setMixedContentMode(c5423b, ReactScrollViewHelper.OVER_SCROLL_NEVER);
        if ((themedReactContext.getApplicationInfo().flags & 2) != 0) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        createRNCWebViewInstance.setDownloadListener(new C5406b(createRNCWebViewInstance, themedReactContext));
        return c5423b;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(final C5423b c5423b) {
        super.onDropViewInstance((RNCWebViewManager) c5423b);
        if (c5423b.getWebView() == null) {
            return;
        }
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.e
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.this.lambda$onDropViewInstance$45(c5423b, c5410f);
            }
        });
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C5423b c5423b, final String str, final ReadableArray readableArray) {
        c5423b.m25171d(new C5423b.InterfaceC5425b() { // from class: com.reactnativecommunity.webview.a0
            @Override // com.reactnativecommunity.webview.C5423b.InterfaceC5425b
            /* renamed from: a */
            public final void mo25165a(RNCWebViewManager.C5410f c5410f) {
                RNCWebViewManager.lambda$receiveCommand$44(str, readableArray, c5410f);
            }
        });
        super.receiveCommand((RNCWebViewManager) c5423b, str, readableArray);
    }

    public RNCWebViewManager(InterfaceC5439f1 interfaceC5439f1) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mAllowsProtectedMedia = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mDownloadingMessage = null;
        this.mLackPermissionToDownloadMessage = null;
        this.assetLoaderHandlerTypes = new HashSet(Arrays.asList("assets", "internal", "resources"));
        this.mWebViewConfig = interfaceC5439f1;
    }

    /* renamed from: com.reactnativecommunity.webview.RNCWebViewManager$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5414g extends WebViewClient {

        /* renamed from: b */
        protected ReadableArray f15355b;

        /* renamed from: f */
        protected C13356c f15359f;

        /* renamed from: a */
        protected boolean f15354a = false;

        /* renamed from: c */
        protected C5410f.C5412b f15356c = null;

        /* renamed from: d */
        protected String f15357d = null;

        /* renamed from: e */
        protected C5420a f15358e = null;

        protected C5414g() {
        }

        /* renamed from: a */
        protected WritableMap m25189a(WebView webView, String str) {
            boolean z;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(TouchesHelper.TARGET_KEY, C5423b.m25172c(webView));
            createMap.putString("url", str);
            if (!this.f15354a && webView.getProgress() != 100) {
                z = true;
            } else {
                z = false;
            }
            createMap.putBoolean("loading", z);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        /* renamed from: b */
        protected void m25188b(WebView webView, String str) {
            ((C5410f) webView).m25197g(webView, new C8902c(C5423b.m25172c(webView), m25189a(webView, str)));
        }

        /* renamed from: c */
        public void m25187c(C5420a c5420a) {
            this.f15358e = c5420a;
        }

        /* renamed from: d */
        public void m25186d(String str) {
            this.f15357d = str;
        }

        /* renamed from: e */
        public void m25185e(C5410f.C5412b c5412b) {
            this.f15356c = c5412b;
        }

        /* renamed from: f */
        public void m25184f(ReadableArray readableArray) {
            this.f15355b = readableArray;
        }

        /* renamed from: g */
        public void m25183g(C13356c c13356c) {
            this.f15359f = c13356c;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.f15354a) {
                ((C5410f) webView).m25202b();
                m25188b(webView, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.f15354a = false;
            C5410f c5410f = (C5410f) webView;
            c5410f.m25201c();
            c5410f.m25197g(webView, new C8906e(C5423b.m25172c(webView), m25189a(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = this.f15357d;
            if (str3 != null && str2.equals(str3) && i == -1 && str.equals("net::ERR_FAILED")) {
                m25186d(null);
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            this.f15354a = true;
            m25188b(webView, str2);
            WritableMap m25189a = m25189a(webView, str2);
            m25189a.putDouble("code", i);
            m25189a.putString("description", str);
            ((C5410f) webView).m25197g(webView, new C8900b(C5423b.m25172c(webView), m25189a));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            C5420a c5420a = this.f15358e;
            if (c5420a != null) {
                httpAuthHandler.proceed(c5420a.f15375a, c5420a.f15376b);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap m25189a = m25189a(webView, webResourceRequest.getUrl().toString());
                m25189a.putInt("statusCode", webResourceResponse.getStatusCode());
                m25189a.putString("description", webResourceResponse.getReasonPhrase());
                ((C5410f) webView).m25197g(webView, new C8898a(C5423b.m25172c(webView), m25189a));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            String url = webView.getUrl();
            String url2 = sslError.getUrl();
            sslErrorHandler.cancel();
            if (!url.equalsIgnoreCase(url2)) {
                Log.w(RNCWebViewManager.TAG, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
                return;
            }
            int primaryError = sslError.getPrimaryError();
            if (primaryError != 0) {
                if (primaryError != 1) {
                    if (primaryError != 2) {
                        if (primaryError != 3) {
                            if (primaryError != 4) {
                                if (primaryError != 5) {
                                    str = "Unknown SSL Error";
                                } else {
                                    str = "A generic error occurred";
                                }
                            } else {
                                str = "The date of the certificate is invalid";
                            }
                        } else {
                            str = "The certificate authority is not trusted";
                        }
                    } else {
                        str = "Hostname mismatch";
                    }
                } else {
                    str = "The certificate has expired";
                }
            } else {
                str = "The certificate is not yet valid";
            }
            onReceivedError(webView, primaryError, "SSL error: " + str, url2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            boolean didCrash;
            boolean didCrash2;
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            didCrash = renderProcessGoneDetail.didCrash();
            if (didCrash) {
                Log.e(RNCWebViewManager.TAG, "The WebView rendering process crashed.");
            } else {
                Log.w(RNCWebViewManager.TAG, "The WebView rendering process was killed by the system.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap m25189a = m25189a(webView, webView.getUrl());
            didCrash2 = renderProcessGoneDetail.didCrash();
            m25189a.putBoolean("didCrash", didCrash2);
            ((C5410f) webView).m25197g(webView, new C8910g(C5423b.m25172c(webView), m25189a));
            return true;
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            C13356c c13356c = this.f15359f;
            if (c13356c == null) {
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
            return c13356c.m2714a(webResourceRequest.getUrl());
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C5410f c5410f = (C5410f) webView;
            if (!(((ReactContext) webView.getContext()).getJavaScriptContextHolder().get() == 0) && c5410f.f15339r != null) {
                C1136d<Integer, AtomicReference<RNCWebViewModule.C5418d.EnumC5419a>> m25177b = RNCWebViewModule.shouldOverrideUrlLoadingLock.m25177b();
                int intValue = m25177b.f3508a.intValue();
                AtomicReference<RNCWebViewModule.C5418d.EnumC5419a> atomicReference = m25177b.f3509b;
                WritableMap m25189a = m25189a(webView, str);
                m25189a.putInt("lockIdentifier", intValue);
                c5410f.m25192l("onShouldStartLoadWithRequest", m25189a);
                try {
                    synchronized (atomicReference) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        while (atomicReference.get() == RNCWebViewModule.C5418d.EnumC5419a.UNDECIDED) {
                            if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                                C13677a.m1870H(RNCWebViewManager.TAG, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                                RNCWebViewModule.shouldOverrideUrlLoadingLock.m25176c(Integer.valueOf(intValue));
                                return false;
                            }
                            atomicReference.wait(250L);
                        }
                        boolean z = atomicReference.get() == RNCWebViewModule.C5418d.EnumC5419a.SHOULD_OVERRIDE;
                        RNCWebViewModule.shouldOverrideUrlLoadingLock.m25176c(Integer.valueOf(intValue));
                        return z;
                    }
                } catch (InterruptedException e) {
                    C13677a.m1853k(RNCWebViewManager.TAG, "shouldOverrideUrlLoading was interrupted while waiting for result.", e);
                    RNCWebViewModule.shouldOverrideUrlLoadingLock.m25176c(Integer.valueOf(intValue));
                    return false;
                }
            }
            C13677a.m1870H(RNCWebViewManager.TAG, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.f15356c.m25190b(true);
            ((C5410f) webView).m25197g(webView, new C8912h(C5423b.m25172c(webView), m25189a(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }
}