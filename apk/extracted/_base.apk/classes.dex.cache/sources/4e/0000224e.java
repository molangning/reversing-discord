package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import p149i4.C7381a;

/* renamed from: com.facebook.hermes.reactexecutor.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3697a implements JavaScriptExecutorFactory {

    /* renamed from: a */
    private boolean f10264a;

    /* renamed from: b */
    private String f10265b;

    public C3697a() {
        this(null);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public JavaScriptExecutor create() {
        return new HermesExecutor(null, this.f10264a, this.f10265b);
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void startSamplingProfiler() {
        HermesSamplingProfiler.enable();
    }

    @Override // com.facebook.react.bridge.JavaScriptExecutorFactory
    public void stopSamplingProfiler(String str) {
        HermesSamplingProfiler.dumpSampledTraceToFile(str);
        HermesSamplingProfiler.disable();
    }

    public String toString() {
        return "JSIExecutor+HermesRuntime";
    }

    public C3697a(C7381a c7381a) {
        this.f10264a = true;
        this.f10265b = "";
    }
}