package com.shopify.reactnative.flash_list;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10442b;
import p068dg.C5838c;

@ReactModule(name = AutoLayoutViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0018\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0012H\u0007J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u0002H\u0007J\u0018\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0012H\u0007¨\u0006$"}, m14357d2 = {"Lcom/shopify/reactnative/flash_list/AutoLayoutViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "", "dp", "density", "", "convertToPixelLayout", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lcom/facebook/react/views/view/ReactViewGroup;", "createViewInstance", "", "", "getExportedCustomDirectEventTypeConstants", "Lme/b;", "view", "", "isHorizontal", "", "setHorizontal", "disableAutoLayout", "setDisableAutoLayout", "scrollOffset", "setScrollOffset", "windowSize", "setWindowSize", "renderOffset", "setRenderAheadOffset", "enableInstrumentation", "setEnableInstrumentation", "<init>", "()V", "Companion", "a", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AutoLayoutViewManager extends ReactViewManager {
    public static final C5522a Companion = new C5522a(null);
    public static final String REACT_CLASS = "AutoLayoutView";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/shopify/reactnative/flash_list/AutoLayoutViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.shopify.reactnative.flash_list.AutoLayoutViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5522a {
        private C5522a() {
        }

        public /* synthetic */ C5522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final int convertToPixelLayout(double d, double d2) {
        int m24389a;
        m24389a = C5838c.m24389a(d * d2);
        return m24389a;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> build = MapBuilder.builder().put("onBlankAreaEvent", MapBuilder.m30470of("registrationName", "onBlankAreaEvent")).build();
        C9612q.m13918g(build, "builder<String, Any>().p…Event\")\n        ).build()");
        return build;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "disableAutoLayout")
    public final void setDisableAutoLayout(C10442b view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setDisableAutoLayout(z);
    }

    @ReactProp(name = "enableInstrumentation")
    public final void setEnableInstrumentation(C10442b view, boolean z) {
        C9612q.m13917h(view, "view");
        view.setEnableInstrumentation(z);
    }

    @ReactProp(name = "horizontal")
    public final void setHorizontal(C10442b view, boolean z) {
        C9612q.m13917h(view, "view");
        view.getAlShadow().m11539h(z);
    }

    @ReactProp(name = "renderAheadOffset")
    public final void setRenderAheadOffset(C10442b view, double d) {
        C9612q.m13917h(view, "view");
        view.getAlShadow().m11536k(convertToPixelLayout(d, view.getPixelDensity()));
    }

    @ReactProp(name = "scrollOffset")
    public final void setScrollOffset(C10442b view, double d) {
        C9612q.m13917h(view, "view");
        view.getAlShadow().m11535l(convertToPixelLayout(d, view.getPixelDensity()));
    }

    @ReactProp(name = "windowSize")
    public final void setWindowSize(C10442b view, double d) {
        C9612q.m13917h(view, "view");
        view.getAlShadow().m11534m(convertToPixelLayout(d, view.getPixelDensity()));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        C10442b c10442b = new C10442b(context);
        c10442b.setPixelDensity(context.getResources().getDisplayMetrics().density);
        return c10442b;
    }
}