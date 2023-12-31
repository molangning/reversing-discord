package com.discord.safearea;

import androidx.core.graphics.Insets;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.safearea.extensions.ImmersiveMode;
import com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.SafeAreaViewManagerDelegate;
import com.facebook.react.viewmanagers.SafeAreaViewManagerInterface;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf.C11591x;

@ReactModule(name = SafeAreaProviderManager.NAME)
@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002\u001f B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0014J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J$\u0010\u0018\u001a\u001e\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00000\u00000\bH\u0014J\u0014\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0016J*\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00000\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m14357d2 = {"Lcom/discord/safearea/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "Lcom/facebook/react/viewmanagers/SafeAreaViewManagerInterface;", "()V", "changeData", "Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData;", "delegate", "Lcom/facebook/react/viewmanagers/SafeAreaViewManagerDelegate;", "kotlin.jvm.PlatformType", "dimensions", "Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;", "imeInsets", "Landroidx/core/graphics/Insets;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "safeAreaEdgeInsets", "Lcom/discord/safearea/SafeAreaEdgeInsets;", "addEventEmitters", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "view", "createViewInstance", "getDelegate", "getExportedCustomDirectEventTypeConstants", "", "", "", "getName", "handleInsetsChanged", "Companion", "SafeAreaProviderDimensions", "safe_area_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> implements SafeAreaViewManagerInterface<SafeAreaProvider> {
    public static final Companion Companion = new Companion(null);
    private static final OnSafeAreaInsetsDidChangeData DEFAULT_CHANGE_DATA;
    private static final float DEFAULT_IME_INSETS_BOTTOM = 0.0f;
    private static final SafeAreaEdgeInsets DEFAULT_SAFE_AREA_INSETS;
    public static final String NAME = "DCDSafeArea";
    private SafeAreaProviderDimensions dimensions;
    private Insets imeInsets;
    private final SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> delegate = new SafeAreaViewManagerDelegate<>(this);
    private final ReactEvents reactEvents = new ReactEvents(C11591x.m7577a("onSafeAreaInsetsDidChange", C9591f0.m13969b(OnSafeAreaInsetsDidChangeData.class)));
    private OnSafeAreaInsetsDidChangeData changeData = DEFAULT_CHANGE_DATA;
    private SafeAreaEdgeInsets safeAreaEdgeInsets = DEFAULT_SAFE_AREA_INSETS;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/safearea/SafeAreaProviderManager$Companion;", "", "()V", "DEFAULT_CHANGE_DATA", "Lcom/discord/safearea/react/events/OnSafeAreaInsetsDidChangeData;", "DEFAULT_IME_INSETS_BOTTOM", "", "DEFAULT_SAFE_AREA_INSETS", "Lcom/discord/safearea/SafeAreaEdgeInsets;", "NAME", "", "safe_area_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/safearea/SafeAreaProviderManager$SafeAreaProviderDimensions;", "", "safeAreaProvider", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;)V", "height", "", "width", "(II)V", "getHeight", "()I", "getWidth", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "safe_area_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class SafeAreaProviderDimensions {
        private final int height;
        private final int width;

        public SafeAreaProviderDimensions(int i, int i2) {
            this.height = i;
            this.width = i2;
        }

        public static /* synthetic */ SafeAreaProviderDimensions copy$default(SafeAreaProviderDimensions safeAreaProviderDimensions, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = safeAreaProviderDimensions.height;
            }
            if ((i3 & 2) != 0) {
                i2 = safeAreaProviderDimensions.width;
            }
            return safeAreaProviderDimensions.copy(i, i2);
        }

        public final int component1() {
            return this.height;
        }

        public final int component2() {
            return this.width;
        }

        public final SafeAreaProviderDimensions copy(int i, int i2) {
            return new SafeAreaProviderDimensions(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SafeAreaProviderDimensions) {
                SafeAreaProviderDimensions safeAreaProviderDimensions = (SafeAreaProviderDimensions) obj;
                return this.height == safeAreaProviderDimensions.height && this.width == safeAreaProviderDimensions.width;
            }
            return false;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (this.height * 31) + this.width;
        }

        public String toString() {
            int i = this.height;
            int i2 = this.width;
            return "SafeAreaProviderDimensions(height=" + i + ", width=" + i2 + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public SafeAreaProviderDimensions(SafeAreaProvider safeAreaProvider) {
            this(safeAreaProvider.getRootView().getHeight(), safeAreaProvider.getRootView().getWidth());
            C9612q.m13917h(safeAreaProvider, "safeAreaProvider");
        }
    }

    static {
        SafeAreaEdgeInsets safeAreaEdgeInsets = new SafeAreaEdgeInsets(DEFAULT_IME_INSETS_BOTTOM, DEFAULT_IME_INSETS_BOTTOM, DEFAULT_IME_INSETS_BOTTOM, DEFAULT_IME_INSETS_BOTTOM, 15, null);
        DEFAULT_SAFE_AREA_INSETS = safeAreaEdgeInsets;
        DEFAULT_CHANGE_DATA = new OnSafeAreaInsetsDidChangeData(safeAreaEdgeInsets.getTopDp(), safeAreaEdgeInsets.getBottomDp(), safeAreaEdgeInsets.getLeftDp(), safeAreaEdgeInsets.getRightDp(), DEFAULT_IME_INSETS_BOTTOM);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleInsetsChanged(ThemedReactContext themedReactContext, SafeAreaEdgeInsets safeAreaEdgeInsets, Insets insets, SafeAreaProvider safeAreaProvider) {
        float f;
        float topDp = safeAreaEdgeInsets.getTopDp();
        float bottomDp = safeAreaEdgeInsets.getBottomDp();
        float leftDp = safeAreaEdgeInsets.getLeftDp();
        float rightDp = safeAreaEdgeInsets.getRightDp();
        if (insets != null) {
            f = SizeUtilsKt.getPxToDp(insets.f3343d);
        } else {
            f = DEFAULT_IME_INSETS_BOTTOM;
        }
        OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(topDp, bottomDp, leftDp, rightDp, f);
        SafeAreaProviderDimensions safeAreaProviderDimensions = new SafeAreaProviderDimensions(safeAreaProvider);
        if (!C9612q.m13922c(this.dimensions, safeAreaProviderDimensions)) {
            this.changeData = DEFAULT_CHANGE_DATA;
            this.dimensions = safeAreaProviderDimensions;
        }
        OnSafeAreaInsetsDidChangeData onSafeAreaInsetsDidChangeData2 = new OnSafeAreaInsetsDidChangeData(Math.max(onSafeAreaInsetsDidChangeData.getTop(), this.changeData.getTop()), Math.max(onSafeAreaInsetsDidChangeData.getBottom(), this.changeData.getBottom()), Math.max(onSafeAreaInsetsDidChangeData.getLeft(), this.changeData.getLeft()), Math.max(onSafeAreaInsetsDidChangeData.getRight(), this.changeData.getRight()), onSafeAreaInsetsDidChangeData.getImeInsetsBottom());
        this.changeData = onSafeAreaInsetsDidChangeData2;
        this.reactEvents.emitEvent(themedReactContext, safeAreaProvider, onSafeAreaInsetsDidChangeData2);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return this.reactEvents.exportEventConstants();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, SafeAreaProvider view) {
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(view, "view");
        view.setOnInsetsChangeHandler(new SafeAreaProviderManager$addEventEmitters$1(this, reactContext, view));
        ImmersiveMode.INSTANCE.addRootViewInsetUpdateCallback$safe_area_release(new SafeAreaProviderManager$addEventEmitters$2(this, reactContext, view));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaProvider createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        return new SafeAreaProvider(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> getDelegate() {
        return this.delegate;
    }
}
