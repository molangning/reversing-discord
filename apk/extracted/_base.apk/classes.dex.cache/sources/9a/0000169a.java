package com.discord.device;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.view.Window;
import androidx.core.view.C1326r2;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react_activities.ReactRootView;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\tJ\b\u0010\u000b\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\f\u0010\u0007\u001a\u00020\b*\u00020\u0016H\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\u0016H\u0002J\f\u0010\u0018\u001a\u00020\b*\u00020\u0016H\u0003¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/device/DeviceSettingsManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "openAccessibilitySettings", "", "()Lkotlin/Unit;", "openNotificationSettings", "openPrivacySettings", "setInsetsVisible", ViewProps.VISIBLE, "", "insetType", "", "setNavigationBarVisible", "setStatusBarVisible", "setSystemGestureExclusionRects", "rects", "Lcom/facebook/react/bridge/ReadableArray;", "Landroid/content/Context;", "openApplicationDetailSettings", "openApplicationNotificationSettings", "device_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class DeviceSettingsManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceSettingsManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    private final void openApplicationDetailSettings(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", new Uri.Builder().scheme("package").opaquePart(context.getPackageName()).build());
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    private final void openApplicationNotificationSettings(Context context) {
        context.startActivity(new Intent("android.settings.APP_NOTIFICATION_SETTINGS").putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName()));
    }

    private final void setInsetsVisible(final boolean z, final int i) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.discord.device.c
            @Override // java.lang.Runnable
            public final void run() {
                DeviceSettingsManagerModule.setInsetsVisible$lambda$3(DeviceSettingsManagerModule.this, z, i);
            }
        });
    }

    public static final void setInsetsVisible$lambda$3(DeviceSettingsManagerModule this$0, boolean z, int i) {
        Window window;
        C9612q.m13917h(this$0, "this$0");
        Activity currentActivity = this$0.getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            window = currentActivity.getWindow();
        } else {
            window = null;
        }
        if (window == null) {
            return;
        }
        WindowInsetsControllerCompat m37341a = C1326r2.m37341a(window, window.getDecorView());
        C9612q.m13918g(m37341a, "getInsetsController(window, window.decorView)");
        m37341a.m37670d(2);
        if (z) {
            m37341a.m37669e(i);
        } else {
            m37341a.m37673a(i);
        }
    }

    public static final void setSystemGestureExclusionRects$lambda$2(DeviceSettingsManagerModule this$0, ReadableArray rects) {
        int m14093t;
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(rects, "$rects");
        ReactRootView.Companion companion = ReactRootView.Companion;
        ReactApplicationContext reactApplicationContext = this$0.getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        IntRange sizeRange = NativeArrayExtensionsKt.sizeRange(rects);
        m14093t = C9546k.m14093t(sizeRange, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            ReadableMap map = rects.getMap(((AbstractC11883p) it).nextInt());
            arrayList.add(new Rect(SizeUtilsKt.getDpToPx(map.getInt(ViewProps.LEFT)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.TOP)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.RIGHT)), SizeUtilsKt.getDpToPx(map.getInt(ViewProps.BOTTOM))));
        }
        companion.setSystemGestureExclusionRects(reactApplicationContext, arrayList);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DeviceSettingsManager";
    }

    @ReactMethod
    public final Unit openAccessibilitySettings() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (currentActivity != null) {
            openAccessibilitySettings(currentActivity);
            return Unit.f25302a;
        }
        return null;
    }

    @ReactMethod
    public final Unit openNotificationSettings() {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity currentActivity = getReactApplicationContext().getCurrentActivity();
            if (currentActivity == null) {
                return null;
            }
            openApplicationNotificationSettings(currentActivity);
            return Unit.f25302a;
        }
        Activity currentActivity2 = getReactApplicationContext().getCurrentActivity();
        if (currentActivity2 == null) {
            return null;
        }
        openApplicationDetailSettings(currentActivity2);
        return Unit.f25302a;
    }

    @ReactMethod
    public final void openPrivacySettings() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        openApplicationDetailSettings(reactApplicationContext);
    }

    @ReactMethod
    public final void setNavigationBarVisible(boolean z) {
        setInsetsVisible(z, WindowInsetsCompat.C1163m.m37677e());
    }

    @ReactMethod
    public final void setStatusBarVisible(boolean z) {
        setInsetsVisible(z, WindowInsetsCompat.C1163m.m37676f());
    }

    @ReactMethod
    public final void setSystemGestureExclusionRects(final ReadableArray rects) {
        C9612q.m13917h(rects, "rects");
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.discord.device.d
            @Override // java.lang.Runnable
            public final void run() {
                DeviceSettingsManagerModule.setSystemGestureExclusionRects$lambda$2(DeviceSettingsManagerModule.this, rects);
            }
        });
    }

    private final void openAccessibilitySettings(Context context) {
        Intent intent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}