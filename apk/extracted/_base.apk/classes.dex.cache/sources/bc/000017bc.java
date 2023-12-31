package com.discord.friend_finder;

import com.discord.friend_finder.react.FriendFinderSerializerKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u0011"}, m14357d2 = {"Lcom/discord/friend_finder/FriendFinderManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "fetchContacts", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getImageForContactId", "deviceContactId", "", "getName", "hasContactsPermissions", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "isComposeSupported", "friend_finder_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FriendFinderManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FriendFinderManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @ReactMethod
    public final void fetchContacts(Callback callback) {
        C9612q.m13917h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeFetchContactsResult(reactApplicationContext, callback);
    }

    @ReactMethod
    public final void getImageForContactId(String deviceContactId, Callback callback) {
        C9612q.m13917h(deviceContactId, "deviceContactId");
        C9612q.m13917h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeGetImageForContactIdResult(reactApplicationContext, deviceContactId, callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDFriendFinderManager";
    }

    @ReactMethod
    public final void hasContactsPermissions(Promise promise) {
        C9612q.m13917h(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        FriendFinderSerializerKt.serializeHasContactPermissionsResult(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void isComposeSupported(Callback callback) {
        C9612q.m13917h(callback, "callback");
        callback.invoke(Boolean.FALSE);
    }
}