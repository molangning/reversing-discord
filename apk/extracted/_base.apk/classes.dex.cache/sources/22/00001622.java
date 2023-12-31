package com.discord.contact_sync;

import com.discord.contact_sync.react.ContactSyncSerializerKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\"\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/contact_sync/ContactSyncManagerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getImageForContactId", "", "deviceContactId", "", "callback", "Lcom/facebook/react/bridge/Callback;", "getName", "hasContactsPermissions", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "syncContacts", "blob", "phone", "contact_sync_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContactSyncManagerModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSyncManagerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @ReactMethod
    public final void getImageForContactId(String deviceContactId, Callback callback) {
        C9612q.m13917h(deviceContactId, "deviceContactId");
        C9612q.m13917h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        ContactSyncSerializerKt.serializeGetImageForContactIdResult(reactApplicationContext, deviceContactId, callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDContactSyncManager";
    }

    @ReactMethod
    public final void hasContactsPermissions(Promise promise) {
        C9612q.m13917h(promise, "promise");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        ContactSyncSerializerKt.serializeHasContactPermissionsResult(reactApplicationContext, promise);
    }

    @ReactMethod
    public final void syncContacts(String str, String phone, Callback callback) {
        C9612q.m13917h(phone, "phone");
        C9612q.m13917h(callback, "callback");
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        ContactSyncSerializerKt.serializeSyncContactResult(reactApplicationContext, callback);
    }
}