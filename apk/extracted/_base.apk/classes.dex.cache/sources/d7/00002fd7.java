package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;
import com.swmansion.rnscreens.C5623j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001CB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u000eH\u0007J\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u001a\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0017J!\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0017J\u0018\u0010!\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0013H\u0017J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0013H\u0017J!\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010$\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b%\u0010\u001dJ\u0018\u0010'\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0013H\u0017J\u0018\u0010)\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0013H\u0017J\u001a\u0010+\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u0010,\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u000eH\u0016J\u001a\u0010-\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u0010.\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001c\u00100\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00101\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u00102\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001c\u00103\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u00104\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u00105\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\b\u0010*\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u00106\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u001a\u00107\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\nH\u0016J\u001a\u00108\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010*\u001a\u00020\u0013H\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020:09H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<H\u0014R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/j;", "Lcom/facebook/react/viewmanagers/RNSScreenManagerInterface;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "view", "", "activityState", "", "setActivityState", "", "presentation", "setStackPresentation", "animation", "setStackAnimation", "", "gestureEnabled", "setGestureEnabled", "setReplaceAnimation", "screenOrientation", "setScreenOrientation", "statusBarAnimation", "setStatusBarAnimation", "statusBarColor", "setStatusBarColor", "(Lcom/swmansion/rnscreens/j;Ljava/lang/Integer;)V", "statusBarStyle", "setStatusBarStyle", "statusBarTranslucent", "setStatusBarTranslucent", "statusBarHidden", "setStatusBarHidden", "navigationBarColor", "setNavigationBarColor", "navigationBarHidden", "setNavigationBarHidden", "nativeBackButtonDismissalEnabled", "setNativeBackButtonDismissalEnabled", "value", "setFullScreenSwipeEnabled", "setTransitionDuration", "setHideKeyboardOnSwipe", "setCustomAnimationOnSwipe", "Lcom/facebook/react/bridge/ReadableMap;", "setGestureResponseDistance", "setHomeIndicatorHidden", "setPreventNativeDismiss", "setSwipeDirection", "setSheetAllowedDetents", "setSheetLargestUndimmedDetent", "setSheetGrabberVisible", "setSheetCornerRadius", "setSheetExpandsWhenScrolledToEdge", "", "", "getExportedCustomDirectEventTypeConstants", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenViewManager extends ViewGroupManager<C5623j> implements RNSScreenManagerInterface<C5623j> {
    public static final C5595a Companion = new C5595a(null);
    public static final String REACT_CLASS = "RNSScreen";
    private final ViewManagerDelegate<C5623j> mDelegate = new RNSScreenManagerDelegate(this);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5595a {
        private C5595a() {
        }

        public /* synthetic */ C5595a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C5623j> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> m30464of = MapBuilder.m30464of("topDismissed", MapBuilder.m30470of("registrationName", "onDismissed"), "topWillAppear", MapBuilder.m30470of("registrationName", "onWillAppear"), "topAppear", MapBuilder.m30470of("registrationName", "onAppear"), "topWillDisappear", MapBuilder.m30470of("registrationName", "onWillDisappear"), "topDisappear", MapBuilder.m30470of("registrationName", "onDisappear"), "topHeaderBackButtonClickedEvent", MapBuilder.m30470of("registrationName", "onHeaderBackButtonClicked"), "topTransitionProgress", MapBuilder.m30470of("registrationName", "onTransitionProgress"));
        C9612q.m13918g(m30464of, "of(\n            ScreenDi…itionProgress\")\n        )");
        return m30464of;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setCustomAnimationOnSwipe(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setFullScreenSwipeEnabled(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setGestureResponseDistance(C5623j c5623j, ReadableMap readableMap) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHideKeyboardOnSwipe(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setHomeIndicatorHidden(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setPreventNativeDismiss(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetAllowedDetents(C5623j view, String str) {
        C9612q.m13917h(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetCornerRadius(C5623j c5623j, float f) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetExpandsWhenScrolledToEdge(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetGrabberVisible(C5623j c5623j, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSheetLargestUndimmedDetent(C5623j view, String str) {
        C9612q.m13917h(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setSwipeDirection(C5623j c5623j, String str) {
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setTransitionDuration(C5623j c5623j, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5623j createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new C5623j(reactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    public void setActivityState(C5623j view, float f) {
        C9612q.m13917h(view, "view");
        setActivityState(view, (int) f);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(C5623j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setGestureEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "nativeBackButtonDismissalEnabled")
    public void setNativeBackButtonDismissalEnabled(C5623j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setNativeBackButtonDismissalEnabled(z);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "navigationBarColor")
    public void setNavigationBarColor(C5623j view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setNavigationBarColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "navigationBarHidden")
    public void setNavigationBarHidden(C5623j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setNavigationBarHidden(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "replaceAnimation")
    public void setReplaceAnimation(C5623j view, String str) {
        C5623j.EnumC5625b enumC5625b;
        C9612q.m13917h(view, "view");
        if (str == null ? true : C9612q.m13922c(str, "pop")) {
            enumC5625b = C5623j.EnumC5625b.POP;
        } else if (!C9612q.m13922c(str, "push")) {
            throw new JSApplicationIllegalArgumentException("Unknown replace animation type " + str);
        } else {
            enumC5625b = C5623j.EnumC5625b.PUSH;
        }
        view.setReplaceAnimation(enumC5625b);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "screenOrientation")
    public void setScreenOrientation(C5623j view, String str) {
        C9612q.m13917h(view, "view");
        view.setScreenOrientation(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0021, code lost:
        if (r4.equals("default") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0040, code lost:
        if (r4.equals("flip") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x006a, code lost:
        if (r4.equals("simple_push") != false) goto L34;
     */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackAnimation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackAnimation(com.swmansion.rnscreens.C5623j r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            if (r4 == 0) goto L84
            int r0 = r4.hashCode()
            switch(r0) {
                case -1418955385: goto L64;
                case -427095442: goto L59;
                case -349395819: goto L4e;
                case 3135100: goto L43;
                case 3145837: goto L3a;
                case 3387192: goto L2f;
                case 182437661: goto L24;
                case 1544803905: goto L1b;
                case 1601504978: goto Lf;
                default: goto Le;
            }
        Le:
            goto L6d
        Lf:
            java.lang.String r0 = "slide_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.SLIDE_FROM_BOTTOM
            goto L86
        L1b:
            java.lang.String r0 = "default"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            goto L84
        L24:
            java.lang.String r0 = "fade_from_bottom"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.FADE_FROM_BOTTOM
            goto L86
        L2f:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.NONE
            goto L86
        L3a:
            java.lang.String r0 = "flip"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            goto L84
        L43:
            java.lang.String r0 = "fade"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.FADE
            goto L86
        L4e:
            java.lang.String r0 = "slide_from_right"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.SLIDE_FROM_RIGHT
            goto L86
        L59:
            java.lang.String r0 = "slide_from_left"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.SLIDE_FROM_LEFT
            goto L86
        L64:
            java.lang.String r0 = "simple_push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L6d
            goto L84
        L6d:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown animation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        L84:
            com.swmansion.rnscreens.j$c r4 = com.swmansion.rnscreens.C5623j.EnumC5626c.DEFAULT
        L86:
            r3.setStackAnimation(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackAnimation(com.swmansion.rnscreens.j, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0015, code lost:
        if (r4.equals("formSheet") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x001e, code lost:
        if (r4.equals("fullScreenModal") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0027, code lost:
        if (r4.equals("containedTransparentModal") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0030, code lost:
        if (r4.equals("containedModal") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0039, code lost:
        if (r4.equals("modal") != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x003b, code lost:
        r4 = com.swmansion.rnscreens.C5623j.EnumC5627d.MODAL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004f, code lost:
        if (r4.equals("transparentModal") != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0051, code lost:
        r4 = com.swmansion.rnscreens.C5623j.EnumC5627d.TRANSPARENT_MODAL;
     */
    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "stackPresentation")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStackPresentation(com.swmansion.rnscreens.C5623j r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            if (r4 == 0) goto L57
            int r0 = r4.hashCode()
            switch(r0) {
                case -76271493: goto L49;
                case 3452698: goto L3e;
                case 104069805: goto L33;
                case 438078970: goto L2a;
                case 955284238: goto L21;
                case 1171936146: goto L18;
                case 1798290171: goto Lf;
                default: goto Le;
            }
        Le:
            goto L57
        Lf:
            java.lang.String r0 = "formSheet"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            goto L3b
        L18:
            java.lang.String r0 = "fullScreenModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            goto L3b
        L21:
            java.lang.String r0 = "containedTransparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            goto L51
        L2a:
            java.lang.String r0 = "containedModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            goto L3b
        L33:
            java.lang.String r0 = "modal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
        L3b:
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C5623j.EnumC5627d.MODAL
            goto L53
        L3e:
            java.lang.String r0 = "push"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C5623j.EnumC5627d.PUSH
            goto L53
        L49:
            java.lang.String r0 = "transparentModal"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L57
        L51:
            com.swmansion.rnscreens.j$d r4 = com.swmansion.rnscreens.C5623j.EnumC5627d.TRANSPARENT_MODAL
        L53:
            r3.setStackPresentation(r4)
            return
        L57:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r3 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown presentation type "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.ScreenViewManager.setStackPresentation(com.swmansion.rnscreens.j, java.lang.String):void");
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarAnimation")
    public void setStatusBarAnimation(C5623j view, String str) {
        C9612q.m13917h(view, "view");
        view.setStatusBarAnimated(Boolean.valueOf((str == null || C9612q.m13922c(ViewProps.NONE, str)) ? false : true));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(customType = "Color", name = "statusBarColor")
    public void setStatusBarColor(C5623j view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setStatusBarColor(num);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarHidden")
    public void setStatusBarHidden(C5623j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setStatusBarHidden(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarStyle")
    public void setStatusBarStyle(C5623j view, String str) {
        C9612q.m13917h(view, "view");
        view.setStatusBarStyle(str);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(C5623j view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setStatusBarTranslucent(Boolean.valueOf(z));
    }

    @ReactProp(name = "activityState")
    public final void setActivityState(C5623j view, int i) {
        C9612q.m13917h(view, "view");
        if (i == -1) {
            return;
        }
        if (i == 0) {
            view.setActivityState(C5623j.EnumC5624a.INACTIVE);
        } else if (i == 1) {
            view.setActivityState(C5623j.EnumC5624a.TRANSITIONING_OR_BELOW_TOP);
        } else if (i != 2) {
        } else {
            view.setActivityState(C5623j.EnumC5624a.ON_TOP);
        }
    }
}