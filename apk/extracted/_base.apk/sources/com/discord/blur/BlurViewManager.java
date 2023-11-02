package com.discord.blur;

import android.os.Build;
import android.view.ViewGroup;
import com.discord.react.utilities.InitialPropsViewGroupManager;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerDelegate;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = BlurViewManager.NAME)
@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001bB\u0005¢\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J$\u0010\r\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0017J\u001a\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0017J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0017J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m14357d2 = {"Lcom/discord/blur/BlurViewManager;", "Lcom/discord/react/utilities/InitialPropsViewGroupManager;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/DCDVisualEffectViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "initialProps", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getDelegate", "getName", "", "setBlurAmount", "", "blurView", BlurViewManager.PROP_BLUR_AMOUNT, "", "setBlurTargetViewNativeId", BlurViewManager.PROP_BLUR_TARGET_VIEW_NATIVE_ID, "setBlurTintIOSParityCompensationRgba", BlurViewManager.PROP_BLUR_TINT_IOS_PARITY_RGBA, "setBlurTintRgba", BlurViewManager.PROP_BLUR_TINT_RGBA, "Companion", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BlurViewManager extends InitialPropsViewGroupManager<ViewGroup> implements DCDVisualEffectViewManagerInterface<ViewGroup> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "DCDVisualEffectView";
    private static final String PROP_BLUR_AMOUNT = "blurAmount";
    private static final String PROP_BLUR_TARGET_VIEW_NATIVE_ID = "blurTargetViewNativeId";
    private static final String PROP_BLUR_TINT_IOS_PARITY_RGBA = "blurTintIOSParityCompensationRgba";
    private static final String PROP_BLUR_TINT_RGBA = "blurTintRgba";
    private final DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> delegate = new DCDVisualEffectViewManagerDelegate<>(this);

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/blur/BlurViewManager$Companion;", "", "()V", "NAME", "", "PROP_BLUR_AMOUNT", "PROP_BLUR_TARGET_VIEW_NATIVE_ID", "PROP_BLUR_TINT_IOS_PARITY_RGBA", "PROP_BLUR_TINT_RGBA", "isHardwareBlurEnabled", "", "isHardwareBlurEnabled$blur_release", "blur_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isHardwareBlurEnabled$blur_release() {
            return Build.VERSION.SDK_INT >= 31;
        }
    }

    @Override // com.discord.react.utilities.InitialPropsViewGroupManager
    public ViewGroup createViewInstance(ThemedReactContext reactContext, ReactStylesDiffMap reactStylesDiffMap) {
        String str;
        String str2;
        Float f;
        boolean z;
        C9612q.m13917h(reactContext, "reactContext");
        String str3 = null;
        if (reactStylesDiffMap != null) {
            str = reactStylesDiffMap.getString(PROP_BLUR_TARGET_VIEW_NATIVE_ID);
        } else {
            str = null;
        }
        if (reactStylesDiffMap != null) {
            str2 = reactStylesDiffMap.getString(PROP_BLUR_TINT_RGBA);
        } else {
            str2 = null;
        }
        if (reactStylesDiffMap != null) {
            f = Float.valueOf(reactStylesDiffMap.getFloat(PROP_BLUR_AMOUNT, -1.0f));
        } else {
            f = null;
        }
        if (reactStylesDiffMap != null) {
            str3 = reactStylesDiffMap.getString(PROP_BLUR_TINT_IOS_PARITY_RGBA);
        }
        boolean z2 = true;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f == null || C9612q.m13923b(f, -1.0f)) {
                z2 = false;
            }
            if (z2) {
                if (Companion.isHardwareBlurEnabled$blur_release()) {
                    return new BlurViewHardwareAccelerated(reactContext, str, ColorUtilsKt.rgbaToArgb(str2), ColorUtilsKt.rgbaToArgb(str3), f.floatValue());
                }
                return new BlurView(reactContext, str, ColorUtilsKt.rgbaToArgb(str2), ColorUtilsKt.rgbaToArgb(str3), f.floatValue());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public DCDVisualEffectViewManagerDelegate<ViewGroup, BlurViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    @ReactProp(name = PROP_BLUR_AMOUNT)
    public void setBlurAmount(ViewGroup blurView, float f) {
        C9612q.m13917h(blurView, "blurView");
        if (blurView instanceof BlurViewAPI) {
            ((BlurViewAPI) blurView).setBlurAmount(blurView.getId(), f);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    @ReactProp(name = PROP_BLUR_TARGET_VIEW_NATIVE_ID)
    public void setBlurTargetViewNativeId(ViewGroup blurView, String str) {
        C9612q.m13917h(blurView, "blurView");
        if (!(blurView instanceof BlurViewAPI)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (str != null) {
            ((BlurViewAPI) blurView).setBlurTargetNativeId(str);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    @ReactProp(name = PROP_BLUR_TINT_IOS_PARITY_RGBA)
    public void setBlurTintIOSParityCompensationRgba(ViewGroup viewGroup, String str) {
        if (viewGroup instanceof BlurViewAPI) {
            ((BlurViewAPI) viewGroup).setBlurTintIOSParityCompensation(ColorUtilsKt.rgbaToArgb(str));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface
    @ReactProp(name = PROP_BLUR_TINT_RGBA)
    public void setBlurTintRgba(ViewGroup blurView, String str) {
        C9612q.m13917h(blurView, "blurView");
        if (blurView instanceof BlurViewAPI) {
            ((BlurViewAPI) blurView).setBlurTint(ColorUtilsKt.rgbaToArgb(str));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
