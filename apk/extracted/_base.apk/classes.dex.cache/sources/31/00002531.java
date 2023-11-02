package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "LogBox")
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = "LogBox";
    private final DevSupportManager mDevSupportManager;
    private final SurfaceDelegate mSurfaceDelegate;

    public LogBoxModule(ReactApplicationContext reactApplicationContext, DevSupportManager devSupportManager) {
        super(reactApplicationContext);
        this.mDevSupportManager = devSupportManager;
        SurfaceDelegate createSurfaceDelegate = devSupportManager.createSurfaceDelegate("LogBox");
        if (createSurfaceDelegate != null) {
            this.mSurfaceDelegate = createSurfaceDelegate;
        } else {
            this.mSurfaceDelegate = new LogBoxDialogSurfaceDelegate(devSupportManager);
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.LogBoxModule.1
            @Override // java.lang.Runnable
            public void run() {
                LogBoxModule.this.mSurfaceDelegate.createContentView("LogBox");
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.LogBoxModule.3
            @Override // java.lang.Runnable
            public void run() {
                LogBoxModule.this.mSurfaceDelegate.hide();
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.LogBoxModule.4
            @Override // java.lang.Runnable
            public void run() {
                LogBoxModule.this.mSurfaceDelegate.destroyContentView();
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        if (!this.mSurfaceDelegate.isContentViewReady()) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.LogBoxModule.2
            @Override // java.lang.Runnable
            public void run() {
                LogBoxModule.this.mSurfaceDelegate.show();
            }
        });
    }
}