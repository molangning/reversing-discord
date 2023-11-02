package com.discord.app_icon;

import com.discord.codegen.NativeAppIconManagerSpec;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/app_icon/AppIconManagerModule;", "Lcom/discord/codegen/NativeAppIconManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getAvailableIcons", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getCurrentIcon", "setIcon", "id", "", "Companion", "app_icon_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AppIconManagerModule extends NativeAppIconManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNAppIconManager";

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/discord/app_icon/AppIconManagerModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "app_icon_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext context) {
            C9612q.m13917h(context, "context");
            return new AppIconManagerModule(context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIconManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeAppIconManagerSpec
    public void getAvailableIcons(Promise promise) {
        C9612q.m13917h(promise, "promise");
        AppIcon[] availableIcons = AppIconUtil.INSTANCE.getAvailableIcons();
        ArrayList arrayList = new ArrayList(availableIcons.length);
        int length = availableIcons.length;
        for (int i = 0; i < length; i++) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("id", availableIcons[i].getId())));
        }
        promise.resolve(NativeArrayExtensionsKt.toNativeArray(arrayList));
    }

    @Override // com.discord.codegen.NativeAppIconManagerSpec
    public void getCurrentIcon(Promise promise) {
        C9612q.m13917h(promise, "promise");
        AppIconUtil appIconUtil = AppIconUtil.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        promise.resolve(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("id", appIconUtil.getCurrentAppIcon(reactApplicationContext).getId())));
    }

    @Override // com.discord.codegen.NativeAppIconManagerSpec
    public void setIcon(String id2, Promise promise) {
        C9612q.m13917h(id2, "id");
        C9612q.m13917h(promise, "promise");
        try {
            AppIconUtil appIconUtil = AppIconUtil.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            appIconUtil.setAppIcon(reactApplicationContext, id2);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(e);
        }
    }
}
