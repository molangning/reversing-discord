package com.discord.user_search_worker;

import com.discord.reactevents.ReactEvents;
import com.discord.user_search_worker.react_events.ReturnResultsEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\nH\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchWorkerManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "worker", "Lcom/discord/user_search_worker/UserSearchWorker;", "addListener", "", "type", "", "getName", "onmessage", "dataJSON", "removeListeners", "count", "", "terminate", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchWorkerManagerModule extends ReactContextBaseJavaModule {
    private final ReactEvents reactEvents;
    private UserSearchWorker worker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSearchWorkerManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactEvents = new ReactEvents(C11591x.m7577a("ReturnResults", C9591f0.m13969b(ReturnResultsEvent.class)));
        this.worker = new UserSearchWorker(new UserSearchWorkerManagerModule$worker$1(this, reactContext));
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "UserSearchWorkerManager";
    }

    @ReactMethod
    public final void onmessage(String dataJSON) {
        C9612q.m13917h(dataJSON, "dataJSON");
        this.worker.onMessage(dataJSON);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void terminate() {
        this.worker.terminate();
    }
}
