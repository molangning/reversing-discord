package p412x0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import p185jk.C9030a;

/* renamed from: x0.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public enum EnumC13662e implements InterfaceC13659b {
    VISUAL_STATE_CALLBACK("VISUAL_STATE_CALLBACK", "VISUAL_STATE_CALLBACK", 23),
    OFF_SCREEN_PRERASTER("OFF_SCREEN_PRERASTER", "OFF_SCREEN_PRERASTER", 23),
    SAFE_BROWSING_ENABLE("SAFE_BROWSING_ENABLE", "SAFE_BROWSING_ENABLE", 26),
    DISABLED_ACTION_MODE_MENU_ITEMS("DISABLED_ACTION_MODE_MENU_ITEMS", "DISABLED_ACTION_MODE_MENU_ITEMS", 24),
    START_SAFE_BROWSING("START_SAFE_BROWSING", "START_SAFE_BROWSING", 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_DEPRECATED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_WHITELIST", 27),
    SAFE_BROWSING_ALLOWLIST_DEPRECATED_TO_PREFERRED("SAFE_BROWSING_WHITELIST", "SAFE_BROWSING_ALLOWLIST", 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_DEPRECATED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_WHITELIST", 27),
    SAFE_BROWSING_ALLOWLIST_PREFERRED_TO_PREFERRED("SAFE_BROWSING_ALLOWLIST", "SAFE_BROWSING_ALLOWLIST", 27),
    SAFE_BROWSING_PRIVACY_POLICY_URL("SAFE_BROWSING_PRIVACY_POLICY_URL", "SAFE_BROWSING_PRIVACY_POLICY_URL", 27),
    SERVICE_WORKER_BASIC_USAGE("SERVICE_WORKER_BASIC_USAGE", "SERVICE_WORKER_BASIC_USAGE", 24),
    SERVICE_WORKER_CACHE_MODE("SERVICE_WORKER_CACHE_MODE", "SERVICE_WORKER_CACHE_MODE", 24),
    SERVICE_WORKER_CONTENT_ACCESS("SERVICE_WORKER_CONTENT_ACCESS", "SERVICE_WORKER_CONTENT_ACCESS", 24),
    SERVICE_WORKER_FILE_ACCESS("SERVICE_WORKER_FILE_ACCESS", "SERVICE_WORKER_FILE_ACCESS", 24),
    SERVICE_WORKER_BLOCK_NETWORK_LOADS("SERVICE_WORKER_BLOCK_NETWORK_LOADS", "SERVICE_WORKER_BLOCK_NETWORK_LOADS", 24),
    SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST("SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", "SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST", 24),
    RECEIVE_WEB_RESOURCE_ERROR("RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_WEB_RESOURCE_ERROR", 23),
    RECEIVE_HTTP_ERROR("RECEIVE_HTTP_ERROR", "RECEIVE_HTTP_ERROR", 23),
    SHOULD_OVERRIDE_WITH_REDIRECTS("SHOULD_OVERRIDE_WITH_REDIRECTS", "SHOULD_OVERRIDE_WITH_REDIRECTS", 24),
    SAFE_BROWSING_HIT("SAFE_BROWSING_HIT", "SAFE_BROWSING_HIT", 27),
    WEB_RESOURCE_REQUEST_IS_REDIRECT("WEB_RESOURCE_REQUEST_IS_REDIRECT", "WEB_RESOURCE_REQUEST_IS_REDIRECT", 24),
    WEB_RESOURCE_ERROR_GET_DESCRIPTION("WEB_RESOURCE_ERROR_GET_DESCRIPTION", "WEB_RESOURCE_ERROR_GET_DESCRIPTION", 23),
    WEB_RESOURCE_ERROR_GET_CODE("WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_CODE", 23),
    SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", "SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY", 27),
    SAFE_BROWSING_RESPONSE_PROCEED("SAFE_BROWSING_RESPONSE_PROCEED", "SAFE_BROWSING_RESPONSE_PROCEED", 27),
    SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", "SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL", 27),
    WEB_MESSAGE_PORT_POST_MESSAGE("WEB_MESSAGE_PORT_POST_MESSAGE", "WEB_MESSAGE_PORT_POST_MESSAGE", 23),
    WEB_MESSAGE_PORT_CLOSE("WEB_MESSAGE_PORT_CLOSE", "WEB_MESSAGE_PORT_CLOSE", 23),
    WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", 23),
    CREATE_WEB_MESSAGE_CHANNEL("CREATE_WEB_MESSAGE_CHANNEL", "CREATE_WEB_MESSAGE_CHANNEL", 23),
    POST_WEB_MESSAGE("POST_WEB_MESSAGE", "POST_WEB_MESSAGE", 23),
    WEB_MESSAGE_CALLBACK_ON_MESSAGE("WEB_MESSAGE_CALLBACK_ON_MESSAGE", "WEB_MESSAGE_CALLBACK_ON_MESSAGE", 23),
    GET_WEB_VIEW_CLIENT("GET_WEB_VIEW_CLIENT", "GET_WEB_VIEW_CLIENT", 26),
    GET_WEB_CHROME_CLIENT("GET_WEB_CHROME_CLIENT", "GET_WEB_CHROME_CLIENT", 26),
    GET_WEB_VIEW_RENDERER("GET_WEB_VIEW_RENDERER", "GET_WEB_VIEW_RENDERER", 29),
    WEB_VIEW_RENDERER_TERMINATE("WEB_VIEW_RENDERER_TERMINATE", "WEB_VIEW_RENDERER_TERMINATE", 29),
    TRACING_CONTROLLER_BASIC_USAGE("TRACING_CONTROLLER_BASIC_USAGE", "TRACING_CONTROLLER_BASIC_USAGE", 28),
    WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", "WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE", 29),
    PROXY_OVERRIDE("PROXY_OVERRIDE", "PROXY_OVERRIDE:3"),
    SUPPRESS_ERROR_PAGE("SUPPRESS_ERROR_PAGE", "SUPPRESS_ERROR_PAGE"),
    MULTI_PROCESS("MULTI_PROCESS", "MULTI_PROCESS_QUERY"),
    FORCE_DARK("FORCE_DARK", "FORCE_DARK"),
    FORCE_DARK_STRATEGY("FORCE_DARK_STRATEGY", "FORCE_DARK_BEHAVIOR"),
    WEB_MESSAGE_LISTENER("WEB_MESSAGE_LISTENER", "WEB_MESSAGE_LISTENER"),
    DOCUMENT_START_SCRIPT("DOCUMENT_START_SCRIPT", "DOCUMENT_START_SCRIPT:1");
    

    /* renamed from: j */
    private final String f35180j;

    /* renamed from: k */
    private final String f35181k;

    /* renamed from: l */
    private final int f35182l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C13663a {

        /* renamed from: a */
        static final Set<String> f35183a = new HashSet(Arrays.asList(C13665g.m1890d().mo1887a()));
    }

    EnumC13662e(String str, String str2) {
        this(str, str2, -1);
    }

    /* renamed from: c */
    public static UnsupportedOperationException m1899c() {
        return new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
    }

    /* renamed from: d */
    public static boolean m1898d(String str) {
        HashSet hashSet = new HashSet();
        for (EnumC13662e enumC13662e : values()) {
            hashSet.add(enumC13662e);
        }
        return m1897e(str, hashSet);
    }

    /* renamed from: e */
    public static boolean m1897e(String str, Collection<InterfaceC13659b> collection) {
        HashSet<InterfaceC13659b> hashSet = new HashSet();
        for (InterfaceC13659b interfaceC13659b : collection) {
            if (interfaceC13659b.mo1900b().equals(str)) {
                hashSet.add(interfaceC13659b);
            }
        }
        if (!hashSet.isEmpty()) {
            for (InterfaceC13659b interfaceC13659b2 : hashSet) {
                if (interfaceC13659b2.mo1901a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException("Unknown feature " + str);
    }

    @Override // p412x0.InterfaceC13659b
    /* renamed from: a */
    public boolean mo1901a() {
        return m1896f() || m1895g();
    }

    @Override // p412x0.InterfaceC13659b
    /* renamed from: b */
    public String mo1900b() {
        return this.f35180j;
    }

    /* renamed from: f */
    public boolean m1896f() {
        int i = this.f35182l;
        if (i == -1 || Build.VERSION.SDK_INT < i) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m1895g() {
        return C9030a.m16842b(C13663a.f35183a, this.f35181k);
    }

    EnumC13662e(String str, String str2, int i) {
        this.f35180j = str;
        this.f35181k = str2;
        this.f35182l = i;
    }
}
