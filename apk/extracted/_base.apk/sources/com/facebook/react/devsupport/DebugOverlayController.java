package com.facebook.react.devsupport;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class DebugOverlayController {
    private FrameLayout mFPSDebugViewContainer;
    private final ReactContext mReactContext;
    private final WindowManager mWindowManager;

    public DebugOverlayController(ReactContext reactContext) {
        this.mReactContext = reactContext;
        this.mWindowManager = (WindowManager) reactContext.getSystemService("window");
    }

    private static boolean canHandleIntent(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    private static boolean hasPermission(Context context, String str) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            C13677a.m1853k(ReactConstants.TAG, "Error while retrieving package info", e);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean permissionCheck(Context context) {
        return Settings.canDrawOverlays(context);
    }

    public static void requestPermission(Context context) {
        if (!Settings.canDrawOverlays(context)) {
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            C13677a.m1870H(ReactConstants.TAG, "Overlay permissions needs to be granted in order for react native apps to run in dev mode");
            if (canHandleIntent(context, intent)) {
                context.startActivity(intent);
            }
        }
    }

    public void setFpsDebugViewVisible(final boolean z) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.DebugOverlayController.1
            @Override // java.lang.Runnable
            public void run() {
                if (z && DebugOverlayController.this.mFPSDebugViewContainer == null) {
                    if (!DebugOverlayController.permissionCheck(DebugOverlayController.this.mReactContext)) {
                        C13677a.m1862b(ReactConstants.TAG, "Wait for overlay permission to be set");
                        return;
                    }
                    DebugOverlayController.this.mFPSDebugViewContainer = new FpsView(DebugOverlayController.this.mReactContext);
                    DebugOverlayController.this.mWindowManager.addView(DebugOverlayController.this.mFPSDebugViewContainer, new WindowManager.LayoutParams(-1, -1, WindowOverlayCompat.TYPE_SYSTEM_OVERLAY, 24, -3));
                } else if (!z && DebugOverlayController.this.mFPSDebugViewContainer != null) {
                    DebugOverlayController.this.mFPSDebugViewContainer.removeAllViews();
                    DebugOverlayController.this.mWindowManager.removeView(DebugOverlayController.this.mFPSDebugViewContainer);
                    DebugOverlayController.this.mFPSDebugViewContainer = null;
                }
            }
        });
    }
}
