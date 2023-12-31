package com.discord.flipper;

import android.content.Context;
import android.view.View;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.util.JSStackTrace;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004H\u0002J\u001a\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u0004H\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/flipper/FlipperUtils;", "", "()V", "getFlipperClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "getFlipperInitMethod", "Ljava/lang/reflect/Method;", JSStackTrace.METHOD_NAME_KEY, "", "getFlipperModule", "getFlipperPackage", "Lcom/facebook/react/ReactPackage;", "init", "", "context", "Landroid/content/Context;", "flipper_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FlipperUtils {
    public static final FlipperUtils INSTANCE = new FlipperUtils();

    private FlipperUtils() {
    }

    private final Class<?> getFlipperClass() {
        return Class.forName("com.discord.flipper.ReactNativeFlipper");
    }

    private final Method getFlipperInitMethod(String str) {
        return getFlipperClass().getMethod(str, Context.class);
    }

    static /* synthetic */ Method getFlipperInitMethod$default(FlipperUtils flipperUtils, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "initializeFlipper";
        }
        return flipperUtils.getFlipperInitMethod(str);
    }

    public final Class<?> getFlipperModule() {
        return Class.forName("com.discord.flipper.FlipperModule");
    }

    public final ReactPackage getFlipperPackage() {
        return new ReactPackage() { // from class: com.discord.flipper.FlipperUtils$getFlipperPackage$1
            @Override // com.facebook.react.ReactPackage
            public List<ReactContextBaseJavaModule> createNativeModules(ReactApplicationContext reactContext) {
                List<ReactContextBaseJavaModule> m14104i;
                C9612q.m13917h(reactContext, "reactContext");
                m14104i = C9545j.m14104i();
                return m14104i;
            }

            @Override // com.facebook.react.ReactPackage
            public List<ViewManager<View, ReactShadowNode<?>>> createViewManagers(ReactApplicationContext reactContext) {
                C9612q.m13917h(reactContext, "reactContext");
                return new ArrayList();
            }
        };
    }

    public final void init(Context context) {
        C9612q.m13917h(context, "context");
    }
}