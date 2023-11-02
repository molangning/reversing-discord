package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenContainerViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J$\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u001c\u0010\u0010\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0011\u001a\u00020\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0012\u001a\u00020\f2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u001c\u0010\u0013\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016¨\u0006\u001e"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/l;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "Lcom/swmansion/rnscreens/n;", "createViewInstance", "parent", "Landroid/view/View;", "child", "", "index", "", "addView", "removeViewAt", "removeAllViews", "getChildCount", "getChildAt", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "", "needsCustomLayoutForChildren", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenContainerViewManager extends ViewGroupManager<C5631l<?>> {
    public static final C5591a Companion = new C5591a(null);
    public static final String REACT_CLASS = "RNSScreenContainer";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenContainerViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenContainerViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5591a {
        private C5591a() {
        }

        public /* synthetic */ C5591a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
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
    public LayoutShadowNode createShadowNodeInstance(ReactApplicationContext context) {
        C9612q.m13917h(context, "context");
        return new C5600b0(context);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C5631l<C5634n> createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new C5631l<>(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(C5631l<?> parent) {
        C9612q.m13917h(parent, "parent");
        parent.mo24860s();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C5631l<?> parent, View child, int i) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(child, "child");
        if (child instanceof C5623j) {
            parent.m24910d((C5623j) child, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens".toString());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C5631l<?> parent, int i) {
        C9612q.m13917h(parent, "parent");
        return parent.m24904j(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C5631l<?> parent) {
        C9612q.m13917h(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C5631l<?> parent, int i) {
        C9612q.m13917h(parent, "parent");
        parent.mo24859u(i);
    }
}