package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@ReactModule(name = SafeAreaContextModule.NAME)
@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\u000e"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule;", "Lcom/th3rdwave/safeareacontext/NativeSafeAreaContextSpec;", "", "", "", "getInitialWindowMetrics", "getName", "getTypedExportedConstants", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SafeAreaContextModule extends NativeSafeAreaContextSpec {
    public static final C5662a Companion = new C5662a(null);
    public static final String NAME = "RNCSafeAreaContext";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaContextModule$a;", "", "", "NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.th3rdwave.safeareacontext.SafeAreaContextModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5662a {
        private C5662a() {
        }

        public /* synthetic */ C5662a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SafeAreaContextModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final Map<String, Object> getInitialWindowMetrics() {
        View view;
        View view2;
        Map<String, Object> m6751k;
        Window window;
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null && (window = currentActivity.getWindow()) != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup != null) {
            view2 = viewGroup.findViewById(16908290);
        } else {
            view2 = null;
        }
        if (view2 == null) {
            return null;
        }
        EdgeInsets m24775e = C5671e.m24775e(viewGroup);
        Rect m24779a = C5671e.m24779a(viewGroup, view2);
        if (m24775e == null || m24779a == null) {
            return null;
        }
        m6751k = C11889v.m6751k(C11591x.m7577a("insets", C5681o.m24752a(m24775e)), C11591x.m7577a("frame", C5681o.m24750c(m24779a)));
        return m6751k;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.th3rdwave.safeareacontext.NativeSafeAreaContextSpec
    public Map<String, Object> getTypedExportedConstants() {
        Map<String, Object> m30470of = MapBuilder.m30470of("initialWindowMetrics", getInitialWindowMetrics());
        C9612q.m13918g(m30470of, "of<String, Any>(\"initial…etInitialWindowMetrics())");
        return m30470of;
    }
}