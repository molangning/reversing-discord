package com.discord.animatable_underlay;

import com.discord.animatable_underlay.AnimatableUnderlay;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerDelegate;
import com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface;
import com.facebook.react.views.view.ReactClippingViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = AnimatableUnderlayViewManager.NAME)
@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001&B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0017J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0016H\u0017J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0016H\u0017J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0016H\u0017J\u0018\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u0016H\u0017J\u0018\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0016H\u0017J\u0018\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0016H\u0017J\u001a\u0010#\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\rH\u0017J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\rH\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlayViewManager;", "Lcom/facebook/react/views/view/ReactClippingViewManager;", "Lcom/discord/animatable_underlay/AnimatableUnderlay;", "Lcom/facebook/react/viewmanagers/AnimatableUnderlayViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/AnimatableUnderlayViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setAnimatedBackgroundColorRgba", "", "view", ViewProps.BACKGROUND_COLOR, "setAnimatedBorderColorRgba", ViewProps.BORDER_COLOR, "setAnimatedBorderWidth", ViewProps.BORDER_WIDTH, "", "setAnimatedBottomLeftRadius", "bottomLeftRadius", "setAnimatedBottomRightRadius", "bottomRightRadius", "setAnimatedHeight", "height", "setAnimatedTopLeftRadius", "topLeftRadius", "setAnimatedTopRightRadius", "topRightRadius", "setAnimatedWidth", "width", "setClipDirectionX", "value", "setClipDirectionY", "Companion", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AnimatableUnderlayViewManager extends ReactClippingViewManager<AnimatableUnderlay> implements AnimatableUnderlayViewManagerInterface<AnimatableUnderlay> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "AnimatableUnderlayView";
    private final AnimatableUnderlayViewManagerDelegate<AnimatableUnderlay, AnimatableUnderlayViewManager> delegate = new AnimatableUnderlayViewManagerDelegate<>(this);

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/animatable_underlay/AnimatableUnderlayViewManager$Companion;", "", "()V", "NAME", "", "animatable_underlay_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AnimatableUnderlay createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new AnimatableUnderlay(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public AnimatableUnderlayViewManagerDelegate<AnimatableUnderlay, AnimatableUnderlayViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedBackgroundColorRgba")
    public void setAnimatedBackgroundColorRgba(AnimatableUnderlay view, String str) {
        C9612q.m13917h(view, "view");
        if (str != null) {
            view.setShapeBackgroundColor(ColorUtilsKt.rgbaToArgb(str));
            view.invalidate();
        }
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedBorderColorRgba")
    public void setAnimatedBorderColorRgba(AnimatableUnderlay view, String str) {
        C9612q.m13917h(view, "view");
        if (str != null) {
            view.getShapeBorderConfig$animatable_underlay_release().setBorderColor(ColorUtilsKt.rgbaToArgb(str));
            view.invalidate();
        }
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedBorderWidth")
    public void setAnimatedBorderWidth(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderWidth(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedBottomLeftRadius")
    public void setAnimatedBottomLeftRadius(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderBottomLeftRadius(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedBottomRightRadius")
    public void setAnimatedBottomRightRadius(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderBottomRightRadius(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedHeight")
    public void setAnimatedHeight(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.setShapeHeight(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedTopLeftRadius")
    public void setAnimatedTopLeftRadius(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderTopLeftRadius(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedTopRightRadius")
    public void setAnimatedTopRightRadius(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.getShapeBorderConfig$animatable_underlay_release().setBorderTopRightRadius(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "animatedWidth")
    public void setAnimatedWidth(AnimatableUnderlay view, float f) {
        C9612q.m13917h(view, "view");
        view.setShapeWidth(SizeUtilsKt.getDpToPx(f));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "clipDirectionX")
    public void setClipDirectionX(AnimatableUnderlay view, String str) {
        C9612q.m13917h(view, "view");
        view.setClipDirectionX(AnimatableUnderlay.ClipDirectionX.Companion.parse(str));
        view.invalidate();
    }

    @Override // com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface
    @ReactProp(name = "clipDirectionY")
    public void setClipDirectionY(AnimatableUnderlay view, String str) {
        C9612q.m13917h(view, "view");
        view.setClipDirectionY(AnimatableUnderlay.ClipDirectionY.Companion.parse(str));
        view.invalidate();
    }
}
