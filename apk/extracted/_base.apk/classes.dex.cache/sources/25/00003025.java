package com.th3rdwave.safeareacontext;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = SafeAreaViewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001 B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0014J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017J&\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¨\u0006!"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaViewManagerInterface;", "Lcom/th3rdwave/safeareacontext/i;", "", "getName", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/views/view/ReactViewGroup;", "getDelegate", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "Lcom/th3rdwave/safeareacontext/n;", "createShadowNodeInstance", "Ljava/lang/Class;", "getShadowNodeClass", "view", "mode", "", "setMode", "Lcom/facebook/react/bridge/ReadableMap;", "propList", "setEdges", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "<init>", "()V", "Companion", "a", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SafeAreaViewManager extends ReactViewManager implements RNCSafeAreaViewManagerInterface<ViewTreeObserver$OnPreDrawListenerC5675i> {
    public static final C5665a Companion = new C5665a(null);
    public static final String REACT_CLASS = "RNCSafeAreaView";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaViewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaViewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5665a {
        private C5665a() {
        }

        public /* synthetic */ C5665a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<C5680n> getShadowNodeClass() {
        return C5680n.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x001e, code lost:
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0037, code lost:
        if (r2 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0050, code lost:
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0069, code lost:
        if (r7 == null) goto L22;
     */
    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @com.facebook.react.uimanager.annotations.ReactProp(name = "edges")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setEdges(com.th3rdwave.safeareacontext.ViewTreeObserver$OnPreDrawListenerC5675i r6, com.facebook.react.bridge.ReadableMap r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13917h(r6, r0)
            if (r7 == 0) goto L75
            java.lang.String r0 = "top"
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r1 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
            if (r0 == 0) goto L20
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r2)
            kotlin.jvm.internal.C9612q.m13918g(r0, r1)
            com.th3rdwave.safeareacontext.j r0 = com.th3rdwave.safeareacontext.EnumC5676j.valueOf(r0)
            if (r0 != 0) goto L22
        L20:
            com.th3rdwave.safeareacontext.j r0 = com.th3rdwave.safeareacontext.EnumC5676j.OFF
        L22:
            java.lang.String r2 = "right"
            java.lang.String r2 = r7.getString(r2)
            if (r2 == 0) goto L39
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toUpperCase(r3)
            kotlin.jvm.internal.C9612q.m13918g(r2, r1)
            com.th3rdwave.safeareacontext.j r2 = com.th3rdwave.safeareacontext.EnumC5676j.valueOf(r2)
            if (r2 != 0) goto L3b
        L39:
            com.th3rdwave.safeareacontext.j r2 = com.th3rdwave.safeareacontext.EnumC5676j.OFF
        L3b:
            java.lang.String r3 = "bottom"
            java.lang.String r3 = r7.getString(r3)
            if (r3 == 0) goto L52
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            kotlin.jvm.internal.C9612q.m13918g(r3, r1)
            com.th3rdwave.safeareacontext.j r3 = com.th3rdwave.safeareacontext.EnumC5676j.valueOf(r3)
            if (r3 != 0) goto L54
        L52:
            com.th3rdwave.safeareacontext.j r3 = com.th3rdwave.safeareacontext.EnumC5676j.OFF
        L54:
            java.lang.String r4 = "left"
            java.lang.String r7 = r7.getString(r4)
            if (r7 == 0) goto L6b
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r7 = r7.toUpperCase(r4)
            kotlin.jvm.internal.C9612q.m13918g(r7, r1)
            com.th3rdwave.safeareacontext.j r7 = com.th3rdwave.safeareacontext.EnumC5676j.valueOf(r7)
            if (r7 != 0) goto L6d
        L6b:
            com.th3rdwave.safeareacontext.j r7 = com.th3rdwave.safeareacontext.EnumC5676j.OFF
        L6d:
            com.th3rdwave.safeareacontext.k r1 = new com.th3rdwave.safeareacontext.k
            r1.<init>(r0, r2, r3, r7)
            r6.setEdges(r1)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.th3rdwave.safeareacontext.SafeAreaViewManager.setEdges(com.th3rdwave.safeareacontext.i, com.facebook.react.bridge.ReadableMap):void");
    }

    @Override // com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface
    @ReactProp(name = "mode")
    public void setMode(ViewTreeObserver$OnPreDrawListenerC5675i view, String str) {
        C9612q.m13917h(view, "view");
        if (C9612q.m13922c(str, ViewProps.PADDING)) {
            view.setMode(EnumC5679m.PADDING);
        } else if (C9612q.m13922c(str, ViewProps.MARGIN)) {
            view.setMode(EnumC5679m.MARGIN);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactViewGroup view, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        C9612q.m13917h(view, "view");
        ((ViewTreeObserver$OnPreDrawListenerC5675i) view).getFabricViewStateManager().setStateWrapper(stateWrapper);
        return null;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public C5680n createShadowNodeInstance() {
        return new C5680n();
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ViewTreeObserver$OnPreDrawListenerC5675i createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new ViewTreeObserver$OnPreDrawListenerC5675i(context);
    }
}