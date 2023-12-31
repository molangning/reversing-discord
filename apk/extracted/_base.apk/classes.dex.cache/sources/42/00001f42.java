package com.discord.security_key;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\rH\u0016J\b\u0010\u0013\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0007J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0010\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m14357d2 = {"Lcom/discord/security_key/SecurityKeyManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "com/discord/security_key/SecurityKeyManagerModule$activityEventListener$1", "Lcom/discord/security_key/SecurityKeyManagerModule$activityEventListener$1;", "currentPromise", "Lcom/facebook/react/bridge/Promise;", "webauthn", "Lcom/discord/security_key/WebAuthn;", "authenticate", "", "data", "", BaseJavaModule.METHOD_TYPE_PROMISE, "getName", "initialize", "invalidate", "register", "reject", "message", "resolve", "security_key_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SecurityKeyManagerModule extends ReactContextBaseJavaModule {
    private final SecurityKeyManagerModule$activityEventListener$1 activityEventListener;
    private Promise currentPromise;
    private final WebAuthn webauthn;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.discord.security_key.SecurityKeyManagerModule$activityEventListener$1] */
    public SecurityKeyManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.webauthn = new WebAuthn(new SecurityKeyManagerModule$webauthn$1(this), new SecurityKeyManagerModule$webauthn$2(this));
        this.activityEventListener = new BaseActivityEventListener() { // from class: com.discord.security_key.SecurityKeyManagerModule$activityEventListener$1
            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                WebAuthn webAuthn;
                webAuthn = SecurityKeyManagerModule.this.webauthn;
                webAuthn.onActivityResult(i, i2, intent);
            }
        };
    }

    public final void reject(String str) {
        Promise promise = this.currentPromise;
        C9612q.m13920e(promise);
        promise.reject("failed", str);
        this.currentPromise = null;
    }

    public final void resolve(String str) {
        Promise promise = this.currentPromise;
        C9612q.m13920e(promise);
        promise.resolve(str);
        this.currentPromise = null;
    }

    @ReactMethod
    public final void authenticate(String data, Promise promise) {
        C9612q.m13917h(data, "data");
        C9612q.m13917h(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("failed", "already running");
            return;
        }
        this.currentPromise = promise;
        this.webauthn.authenticate(data, getCurrentActivity());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDSecurityKeyManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addActivityEventListener(this.activityEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    @ReactMethod
    public final void register(String data, Promise promise) {
        C9612q.m13917h(data, "data");
        C9612q.m13917h(promise, "promise");
        if (this.currentPromise != null) {
            promise.reject("failed", "already running");
            return;
        }
        this.currentPromise = promise;
        this.webauthn.register(data, getCurrentActivity());
    }
}