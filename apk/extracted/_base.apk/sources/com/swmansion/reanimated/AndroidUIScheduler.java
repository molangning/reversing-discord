package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.concurrent.atomic.AtomicBoolean;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AndroidUIScheduler {
    private final ReactApplicationContext mContext;
    private final AtomicBoolean mActive = new AtomicBoolean(true);
    private final Runnable mUIThreadRunnable = new Runnable() { // from class: com.swmansion.reanimated.AndroidUIScheduler.1
        @Override // java.lang.Runnable
        public void run() {
            if (AndroidUIScheduler.this.mActive.get()) {
                AndroidUIScheduler.this.triggerUI();
            }
        }
    };
    @InterfaceC6107a
    private final HybridData mHybridData = initHybrid();

    public AndroidUIScheduler(ReactApplicationContext reactApplicationContext) {
        this.mContext = reactApplicationContext;
    }

    private native HybridData initHybrid();

    @InterfaceC6107a
    private void scheduleTriggerOnUI() {
        UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mContext.getExceptionHandler()) { // from class: com.swmansion.reanimated.AndroidUIScheduler.2
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                AndroidUIScheduler.this.mUIThreadRunnable.run();
            }
        });
    }

    public void deactivate() {
        this.mActive.set(false);
    }

    public native void triggerUI();
}
