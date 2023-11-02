package com.discord.hosts;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/hosts/HostsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "setHosts", "", "api", "cdn", "hosts_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class HostsModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostsModule(ReactApplicationContext context) {
        super(context);
        C9612q.m13917h(context, "context");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Hosts";
    }

    @ReactMethod
    public final void setHosts(String api, String cdn) {
        C9612q.m13917h(api, "api");
        C9612q.m13917h(cdn, "cdn");
        Hosts hosts = Hosts.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        hosts.init(reactApplicationContext, api, cdn);
    }
}