package com.discord.blur;

import com.discord.blur.BlurViewAPI;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = BlurViewTargetManager.NAME)
@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/blur/BlurViewTargetManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Lcom/facebook/react/views/view/ReactViewGroup;", "()V", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getName", "", "onDropViewInstance", "", "blurViewTarget", "setNativeId", "nativeId", "Companion", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BlurViewTargetManager extends InitialPropsViewGroupManager<ReactViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectViewTarget";
    private static final String PROP_NATIVE_ID = "nativeID";

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/blur/BlurViewTargetManager$Companion;", "", "()V", "NAME", "", "PROP_NATIVE_ID", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    public ReactViewGroup createViewInstance(ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap) {
        C9612q.m13917h(reactContext, "reactContext");
        String string = reactStylesDiffMap != null ? reactStylesDiffMap.getString("nativeID") : null;
        if (string != null) {
            if (BlurViewManager.Companion.isHardwareBlurEnabled$blur_release()) {
                return new BlurViewTargetHardwareAccelerated(reactContext, string);
            }
            return new BlurViewTarget(reactContext, string);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactViewGroup blurViewTarget) {
        C9612q.m13917h(blurViewTarget, "blurViewTarget");
        super.onDropViewInstance((BlurViewTargetManager) blurViewTarget);
        if (!(blurViewTarget instanceof BlurViewAPI.Target)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setNativeId(ReactViewGroup blurViewTarget, String str) {
        C9612q.m13917h(blurViewTarget, "blurViewTarget");
        super.setNativeId((BlurViewTargetManager) blurViewTarget, str);
        if (!(blurViewTarget instanceof BlurViewAPI.Target)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (str != null) {
            ((BlurViewAPI.Target) blurViewTarget).setBlurTargetNativeId(str);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}