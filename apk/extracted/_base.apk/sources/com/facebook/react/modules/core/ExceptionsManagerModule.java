package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.util.ExceptionDataHelper;
import com.facebook.react.util.JSStackTrace;
import p414x2.C13677a;

@ReactModule(name = NativeExceptionsManagerSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    private final DevSupportManager mDevSupportManager;

    public ExceptionsManagerModule(DevSupportManager devSupportManager) {
        super(null);
        this.mDevSupportManager = devSupportManager;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.hideRedboxDialog();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) {
        String str;
        ReadableArray createArray;
        boolean z;
        if (readableMap.hasKey("message")) {
            str = readableMap.getString("message");
        } else {
            str = "";
        }
        if (readableMap.hasKey("stack")) {
            createArray = readableMap.getArray("stack");
        } else {
            createArray = Arguments.createArray();
        }
        if (readableMap.hasKey("isFatal")) {
            z = readableMap.getBoolean("isFatal");
        } else {
            z = false;
        }
        String extraDataAsJson = ExceptionDataHelper.getExtraDataAsJson(readableMap);
        if (!z) {
            C13677a.m1854j(ReactConstants.TAG, JSStackTrace.format(str, createArray));
            if (extraDataAsJson != null) {
                C13677a.m1861c(ReactConstants.TAG, "extraData: %s", extraDataAsJson);
                return;
            }
            return;
        }
        throw new JavascriptException(JSStackTrace.format(str, createArray)).setExtraDataAsJson(extraDataAsJson);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d) {
        int i = (int) d;
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.updateJSError(str, readableArray, i);
        }
    }
}
