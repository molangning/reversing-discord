package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.module.annotations.ReactModule;
import p414x2.C13677a;

@ReactModule(name = NativeHeadlessJsTaskSupportSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d) {
        int i = (int) d;
        HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (headlessJsTaskContext.isTaskRunning(i)) {
            headlessJsTaskContext.finishTask(i);
        } else {
            C13677a.m1872F(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d, Promise promise) {
        int i = (int) d;
        HeadlessJsTaskContext headlessJsTaskContext = HeadlessJsTaskContext.getInstance(getReactApplicationContext());
        if (headlessJsTaskContext.isTaskRunning(i)) {
            promise.resolve(Boolean.valueOf(headlessJsTaskContext.retryTask(i)));
            return;
        }
        C13677a.m1872F(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i));
        promise.resolve(Boolean.FALSE);
    }
}
