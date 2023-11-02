package com.discord.modules.keycommands;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.KeyCommandsViewManagerDelegate;
import com.facebook.react.viewmanagers.KeyCommandsViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\f"}, m14357d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getConstants", "", "", "", "getName", "Companion", KeyCommandsViewManagerModule.MODULE_NAME, "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class KeyCommandsViewManagerModule extends ReactContextBaseJavaModule {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String MODULE_NAME = "KeyCommandsView";

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule$Companion;", "", "()V", "MODULE_NAME", "", "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/modules/keycommands/KeyCommandsViewManagerModule$KeyCommandsView;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lcom/facebook/react/viewmanagers/KeyCommandsViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/KeyCommandsViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "app_googleRelease"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    @ReactModule(name = KeyCommandsViewManagerModule.MODULE_NAME)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class KeyCommandsView extends ViewGroupManager<ReactViewGroup> implements KeyCommandsViewManagerInterface<ReactViewGroup> {
        private final KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsView> delegate = new KeyCommandsViewManagerDelegate<>(this);

        @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
        public String getName() {
            return KeyCommandsViewManagerModule.MODULE_NAME;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.uimanager.ViewManager
        public ReactViewGroup createViewInstance(ThemedReactContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new ReactViewGroup(reactContext);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.uimanager.ViewManager
        public KeyCommandsViewManagerDelegate<ReactViewGroup, KeyCommandsView> getDelegate() {
            return this.delegate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyCommandsViewManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> m6750l;
        m6750l = C11889v.m6750l(C11591x.m7577a("keyModifierAlphaShift", 65536), C11591x.m7577a("keyModifierShift", 131072), C11591x.m7577a("keyModifierControl", 262144), C11591x.m7577a("keyModifierAlternate", 524288), C11591x.m7577a("keyModifierCommand", 1048576), C11591x.m7577a("keyModifierNumericPad", 2097152));
        return m6750l;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }
}
