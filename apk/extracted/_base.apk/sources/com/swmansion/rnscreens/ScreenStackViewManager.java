package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@ReactModule(name = ScreenStackViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001(B\u0007¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0014J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001eH\u0014J\u0014\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020!0 H\u0016R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006)"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/p;", "Lcom/facebook/react/viewmanagers/RNSScreenStackManagerInterface;", "Lcom/swmansion/rnscreens/j;", "screen", "", "prepareOutTransition", "Landroid/view/ViewGroup;", "parent", "startTransitionRecursive", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "Landroid/view/View;", "child", "", "index", "addView", "removeViewAt", "getChildCount", "getChildAt", "Lcom/facebook/react/bridge/ReactApplicationContext;", "context", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "createShadowNodeInstance", "", "needsCustomLayoutForChildren", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "", "", "getExportedCustomDirectEventTypeConstants", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenStackViewManager extends ViewGroupManager<C5640p> implements RNSScreenStackManagerInterface<C5640p> {
    public static final C5594a Companion = new C5594a(null);
    public static final String REACT_CLASS = "RNSScreenStack";
    private final ViewManagerDelegate<C5640p> mDelegate = new RNSScreenStackManagerDelegate(this);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenStackViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5594a {
        private C5594a() {
        }

        public /* synthetic */ C5594a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void prepareOutTransition(C5623j c5623j) {
        startTransitionRecursive(c5623j);
    }

    private final void startTransitionRecursive(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = viewGroup.getChildAt(i);
                if (child != null) {
                    C9612q.m13918g(child, "child");
                    viewGroup.startViewTransition(child);
                }
                if (child instanceof C5649s) {
                    startTransitionRecursive(((C5649s) child).getToolbar());
                }
                if (child instanceof ViewGroup) {
                    startTransitionRecursive((ViewGroup) child);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C5640p> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map m6750l;
        Map<String, Object> m6750l2;
        m6750l = C11889v.m6750l(C11591x.m7577a("registrationName", "onFinishTransitioning"));
        m6750l2 = C11889v.m6750l(C11591x.m7577a("topFinishTransitioning", m6750l));
        return m6750l2;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C5640p createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new C5640p(reactContext);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(C5640p parent, View child, int i) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(child, "child");
        if (child instanceof C5623j) {
            parent.m24910d((C5623j) child, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen".toString());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(C5640p parent, int i) {
        C9612q.m13917h(parent, "parent");
        return parent.m24904j(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(C5640p parent) {
        C9612q.m13917h(parent, "parent");
        return parent.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(C5640p parent, int i) {
        C9612q.m13917h(parent, "parent");
        prepareOutTransition(parent.m24904j(i));
        parent.mo24859u(i);
    }
}
