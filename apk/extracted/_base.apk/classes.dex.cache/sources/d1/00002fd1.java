package com.swmansion.rnscreens;

import android.util.Log;
import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001PB\u0007¢\u0006\u0004\bM\u0010NJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0002H\u0014J\u001a\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010!\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u000fH\u0017J\u001a\u0010#\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0004H\u0017J!\u0010%\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b(\u0010&J\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0018H\u0017J\u0018\u0010,\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0018H\u0017J\u0018\u0010.\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u0018H\u0017J!\u00100\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u000fH\u0017¢\u0006\u0004\b0\u0010&J\u0018\u00102\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0018H\u0017J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0018H\u0017J\u0018\u00106\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0018H\u0017J\u001a\u00108\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\b\u00107\u001a\u0004\u0018\u00010\u0004H\u0017J\u0016\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:\u0018\u000109H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0014J\u001c\u0010?\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010@\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010A\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001a\u0010B\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J\u001a\u0010C\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J\u001c\u0010D\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010E\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u000fH\u0016J\u001c\u0010F\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u0004H\u0016J#\u0010G\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bG\u0010&J\u001a\u0010H\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016J#\u0010I\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010>\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\bI\u0010&J\u001a\u0010J\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010>\u001a\u00020\u0018H\u0016R\u001a\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006Q"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/s;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderConfigManagerInterface;", "", "propName", "", "logNotAvailable", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "addView", "view", "onDropViewInstance", "removeAllViews", "removeViewAt", "getChildCount", "getChildAt", "", "needsCustomLayoutForChildren", "onAfterUpdateTransaction", "config", "title", "setTitle", "titleFontFamily", "setTitleFontFamily", "titleFontSize", "setTitleFontSize", "titleFontWeight", "setTitleFontWeight", "titleColor", "setTitleColor", "(Lcom/swmansion/rnscreens/s;Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "hideShadow", "setHideShadow", "hideBackButton", "setHideBackButton", "topInsetEnabled", "setTopInsetEnabled", ViewProps.COLOR, "setColor", ViewProps.HIDDEN, "setHidden", "translucent", "setTranslucent", "backButtonInCustomView", "setBackButtonInCustomView", "direction", "setDirection", "", "", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "value", "setBackTitle", "setBackTitleFontFamily", "setBackTitleFontSize", "setBackTitleVisible", "setLargeTitle", "setLargeTitleFontFamily", "setLargeTitleFontSize", "setLargeTitleFontWeight", "setLargeTitleBackgroundColor", "setLargeTitleHideShadow", "setLargeTitleColor", "setDisableBackButtonMenu", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenStackHeaderConfigViewManager extends ViewGroupManager<C5649s> implements RNSScreenStackHeaderConfigManagerInterface<C5649s> {
    public static final C5592a Companion = new C5592a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
    private final ViewManagerDelegate<C5649s> mDelegate = new RNSScreenStackHeaderConfigManagerDelegate(this);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderConfigViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderConfigViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5592a {
        private C5592a() {
        }

        public /* synthetic */ C5592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void logNotAvailable(String str) {
        Log.w("RN SCREENS", str + " prop is not available on Android");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C5649s> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m30469of("topAttached", MapBuilder.m30470of("registrationName", "onAttached"), "topDetached", MapBuilder.m30470of("registrationName", "onDetached"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5649s createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new C5649s(reactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C5649s parent) {
        C9612q.m13917h(parent, "parent");
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) parent);
        parent.m24824g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C5649s view) {
        C9612q.m13917h(view, "view");
        view.m24828c();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(C5649s parent) {
        C9612q.m13917h(parent, "parent");
        parent.m24823h();
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setBackButtonInCustomView(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitle(C5649s c5649s, String str) {
        logNotAvailable("backTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontFamily(C5649s c5649s, String str) {
        logNotAvailable("backTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleFontSize(C5649s c5649s, int i) {
        logNotAvailable("backTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setBackTitleVisible(C5649s c5649s, boolean z) {
        logNotAvailable("backTitleVisible");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(C5649s config, Integer num) {
        C9612q.m13917h(config, "config");
        config.setBackgroundColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(C5649s config, Integer num) {
        C9612q.m13917h(config, "config");
        config.setTintColor(num != null ? num.intValue() : 0);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "direction")
    public void setDirection(C5649s config, String str) {
        C9612q.m13917h(config, "config");
        config.setDirection(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setDisableBackButtonMenu(C5649s c5649s, boolean z) {
        logNotAvailable("disableBackButtonMenu");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = ViewProps.HIDDEN)
    public void setHidden(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setHidden(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideBackButton")
    public void setHideBackButton(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setHideBackButton(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "hideShadow")
    public void setHideShadow(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setHideShadow(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitle(C5649s c5649s, boolean z) {
        logNotAvailable("largeTitle");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleBackgroundColor(C5649s c5649s, Integer num) {
        logNotAvailable("largeTitleBackgroundColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleColor(C5649s c5649s, Integer num) {
        logNotAvailable("largeTitleColor");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontFamily(C5649s c5649s, String str) {
        logNotAvailable("largeTitleFontFamily");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontSize(C5649s c5649s, int i) {
        logNotAvailable("largeTitleFontSize");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleFontWeight(C5649s c5649s, String str) {
        logNotAvailable("largeTitleFontWeight");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    public void setLargeTitleHideShadow(C5649s c5649s, boolean z) {
        logNotAvailable("largeTitleHideShadow");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "title")
    public void setTitle(C5649s config, String str) {
        C9612q.m13917h(config, "config");
        config.setTitle(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(customType = "Color", name = "titleColor")
    public void setTitleColor(C5649s config, Integer num) {
        C9612q.m13917h(config, "config");
        if (num != null) {
            config.setTitleColor(num.intValue());
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontFamily")
    public void setTitleFontFamily(C5649s config, String str) {
        C9612q.m13917h(config, "config");
        config.setTitleFontFamily(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontSize")
    public void setTitleFontSize(C5649s config, int i) {
        C9612q.m13917h(config, "config");
        config.setTitleFontSize(i);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "titleFontWeight")
    public void setTitleFontWeight(C5649s config, String str) {
        C9612q.m13917h(config, "config");
        config.setTitleFontWeight(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "topInsetEnabled")
    public void setTopInsetEnabled(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setTopInsetEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface
    @ReactProp(name = "translucent")
    public void setTranslucent(C5649s config, boolean z) {
        C9612q.m13917h(config, "config");
        config.setTranslucent(z);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C5649s parent, View child, int i) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(child, "child");
        if (child instanceof C5651t) {
            parent.m24829b((C5651t) child, i);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C5649s parent, int i) {
        C9612q.m13917h(parent, "parent");
        return parent.m24827d(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C5649s parent) {
        C9612q.m13917h(parent, "parent");
        return parent.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C5649s parent, int i) {
        C9612q.m13917h(parent, "parent");
        parent.m24822i(i);
    }
}