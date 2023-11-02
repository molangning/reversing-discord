package com.th3rdwave.safeareacontext;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerDelegate;
import com.facebook.react.viewmanagers.RNCSafeAreaProviderManagerInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@ReactModule(name = SafeAreaProviderManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0006\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u00000\u0004H\u0014J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\f0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014R0\u0010\u0012\u001a\u001e\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00000\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaProviderManagerInterface;", "Lcom/facebook/react/viewmanagers/RNCSafeAreaProviderManagerDelegate;", "kotlin.jvm.PlatformType", "getDelegate", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "", "getExportedCustomDirectEventTypeConstants", "reactContext", "view", "", "addEventEmitters", "mDelegate", "Lcom/facebook/react/viewmanagers/RNCSafeAreaProviderManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SafeAreaProviderManager extends ViewGroupManager<SafeAreaProvider> implements RNCSafeAreaProviderManagerInterface<SafeAreaProvider> {
    public static final C5663a Companion = new C5663a(null);
    public static final String REACT_CLASS = "RNCSafeAreaProvider";
    private final RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> mDelegate = new RNCSafeAreaProviderManagerDelegate<>(this);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProviderManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5663a {
        private C5663a() {
        }

        public /* synthetic */ C5663a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaProviderManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5664b extends C9609n implements Function3<SafeAreaProvider, EdgeInsets, Rect, Unit> {

        /* renamed from: j */
        public static final C5664b f15833j = new C5664b();

        C5664b() {
            super(3, C5670d.class, "handleOnInsetsChange", "handleOnInsetsChange(Lcom/th3rdwave/safeareacontext/SafeAreaProvider;Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", 1);
        }

        /* renamed from: e */
        public final void m24784e(SafeAreaProvider p0, EdgeInsets p1, Rect p2) {
            C9612q.m13917h(p0, "p0");
            C9612q.m13917h(p1, "p1");
            C9612q.m13917h(p2, "p2");
            C5670d.m24780b(p0, p1, p2);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
            m24784e(safeAreaProvider, edgeInsets, rect);
            return Unit.f25302a;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        Map m6750l;
        Map<String, Map<String, String>> m6750l2;
        m6750l = C11889v.m6750l(C11591x.m7577a("registrationName", "onInsetsChange"));
        m6750l2 = C11889v.m6750l(C11591x.m7577a("topInsetsChange", m6750l));
        return m6750l2;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext reactContext, SafeAreaProvider view) {
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(view, "view");
        super.addEventEmitters(reactContext, (ThemedReactContext) view);
        view.setOnInsetsChangeHandler(C5664b.f15833j);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public SafeAreaProvider createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new SafeAreaProvider(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public RNCSafeAreaProviderManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> getDelegate() {
        return this.mDelegate;
    }
}
