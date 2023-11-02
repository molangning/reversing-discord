package com.discord.client_info;

import com.discord.codegen.NativeClientInfoManagerSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\n"}, m14357d2 = {"Lcom/discord/client_info/ClientInfoManagerModule;", "Lcom/discord/codegen/NativeClientInfoManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "getName", "Companion", "client_info_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ClientInfoManagerModule extends NativeClientInfoManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNClientInfoManager";

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/client_info/ClientInfoManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "client_info_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new ClientInfoManagerModule(reactContext);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientInfoManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, String> getConstants() {
        Map<String, String> m6750l;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        ClientInfoCache clientInfoCache = ClientInfoCache.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        m6750l = C11889v.m6750l(C11591x.m7577a("Identifier", clientInfo.getPackageName()), C11591x.m7577a("Version", clientInfo.getVersionName()), C11591x.m7577a("Build", clientInfo.getVersionCode()), C11591x.m7577a("Manifest", clientInfo.getOtaManifestETag()), C11591x.m7577a("OTABuild", clientInfo.getOtaVersion()), C11591x.m7577a("DeviceVendorID", clientInfoCache.getDeviceVendorId(reactApplicationContext)), C11591x.m7577a("ReleaseChannel", clientInfo.getReleaseChannel()), C11591x.m7577a("SentryDsn", "https://70545531dfe34835bf4dd0996821e8b6@o64374.ingest.sentry.io/5992375"), C11591x.m7577a("SentryStaffDsn", "https://90509cba01573ee4e14a2f5e15aee5ca@o64374.ingest.sentry.io/5992375"), C11591x.m7577a("SentryAlphaBetaDsn", "https://9a42ef460144a03b30c8b2d5321cfe11@o64374.ingest.sentry.io/5992375"));
        return m6750l;
    }

    @Override // com.discord.codegen.NativeClientInfoManagerSpec, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RTNClientInfoManager";
    }
}