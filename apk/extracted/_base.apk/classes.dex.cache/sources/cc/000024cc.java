package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactPackageTurboModuleManagerDelegate;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p077e5.InterfaceC6107a;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\nB\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\b\u001a\u0004\u0018\u00010\tH\u0095 ¨\u0006\u000b"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", "", "Lcom/facebook/react/ReactPackage;", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/util/List;)V", "initHybrid", "Lcom/facebook/jni/HybridData;", "Builder", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DefaultTurboModuleManagerDelegate extends ReactPackageTurboModuleManagerDelegate {

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0014¨\u0006\n"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate$Builder;", "Lcom/facebook/react/ReactPackageTurboModuleManagerDelegate$Builder;", "()V", "build", "Lcom/facebook/react/defaults/DefaultTurboModuleManagerDelegate;", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "packages", "", "Lcom/facebook/react/ReactPackage;", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Builder extends ReactPackageTurboModuleManagerDelegate.Builder {
        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        public /* bridge */ /* synthetic */ ReactPackageTurboModuleManagerDelegate build(ReactApplicationContext reactApplicationContext, List list) {
            return build(reactApplicationContext, (List<? extends ReactPackage>) list);
        }

        @Override // com.facebook.react.ReactPackageTurboModuleManagerDelegate.Builder
        public DefaultTurboModuleManagerDelegate build(ReactApplicationContext context, List<? extends ReactPackage> packages) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(packages, "packages");
            return new DefaultTurboModuleManagerDelegate(context, packages, null);
        }
    }

    private DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List<? extends ReactPackage> list) {
        super(reactApplicationContext, list);
    }

    public /* synthetic */ DefaultTurboModuleManagerDelegate(ReactApplicationContext reactApplicationContext, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactApplicationContext, list);
    }

    @Override // com.facebook.react.turbomodule.core.TurboModuleManagerDelegate
    @InterfaceC6107a
    protected native HybridData initHybrid();
}