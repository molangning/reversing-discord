package com.facebook.react;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.jstasks.HeadlessJsTaskConfig;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class HeadlessJsTaskService extends Service implements HeadlessJsTaskEventListener {
    private static PowerManager.WakeLock sWakeLock;
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    @SuppressLint({"WakelockTimeout"})
    public static void acquireWakeLockNow(Context context) {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) C5743a.m24583c((PowerManager) context.getSystemService("power"))).newWakeLock(1, HeadlessJsTaskService.class.getCanonicalName());
            sWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    public void invokeStartTask(ReactContext reactContext, final HeadlessJsTaskConfig headlessJsTaskConfig) {
        final HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(reactContext);
        headlessJsTaskContext.addTaskEventListener(this);
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.HeadlessJsTaskService.2
            @Override // java.lang.Runnable
            public void run() {
                HeadlessJsTaskService.this.mActiveTasks.add(Integer.valueOf(headlessJsTaskContext.startTask(headlessJsTaskConfig)));
            }
        });
    }

    protected ReactNativeHost getReactNativeHost() {
        return ((ReactApplication) getApplication()).getReactNativeHost();
    }

    protected HeadlessJsTaskConfig getTaskConfig(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onDestroy() {
        ReactContext currentReactContext;
        super.onDestroy();
        if (getReactNativeHost().hasInstance() && (currentReactContext = getReactNativeHost().getReactInstanceManager().getCurrentReactContext()) != null) {
            HeadlessJsTaskContext.getInstance(currentReactContext).removeTaskEventListener(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int i) {
        this.mActiveTasks.remove(Integer.valueOf(i));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int i) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        HeadlessJsTaskConfig taskConfig = getTaskConfig(intent);
        if (taskConfig != null) {
            startTask(taskConfig);
            return 3;
        }
        return 2;
    }

    protected void startTask(final HeadlessJsTaskConfig headlessJsTaskConfig) {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        final ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
        ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
        if (currentReactContext == null) {
            reactInstanceManager.addReactInstanceEventListener(new ReactInstanceEventListener() { // from class: com.facebook.react.HeadlessJsTaskService.1
                @Override // com.facebook.react.ReactInstanceEventListener
                public void onReactContextInitialized(ReactContext reactContext) {
                    HeadlessJsTaskService.this.invokeStartTask(reactContext, headlessJsTaskConfig);
                    reactInstanceManager.removeReactInstanceEventListener(this);
                }
            });
            reactInstanceManager.createReactContextInBackground();
            return;
        }
        invokeStartTask(currentReactContext, headlessJsTaskConfig);
    }
}