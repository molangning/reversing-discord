package com.shopify.reactnative.flash_list;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10445d;

@ReactModule(name = AutoLayoutViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\u0012"}, m14357d2 = {"Lcom/shopify/reactnative/flash_list/CellContainerManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lcom/facebook/react/views/view/ReactViewGroup;", "createViewInstance", "Lme/d;", "view", "", "index", "", "setIndex", "<init>", "()V", "Companion", "a", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CellContainerManager extends ReactViewManager {
    public static final C5523a Companion = new C5523a(null);
    public static final String REACT_CLASS = "CellContainer";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/shopify/reactnative/flash_list/CellContainerManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.shopify.reactnative.flash_list.CellContainerManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5523a {
        private C5523a() {
        }

        public /* synthetic */ C5523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "index")
    public final void setIndex(C10445d view, int i) {
        C9612q.m13917h(view, "view");
        view.setIndex(i);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new C10445d(context);
    }
}