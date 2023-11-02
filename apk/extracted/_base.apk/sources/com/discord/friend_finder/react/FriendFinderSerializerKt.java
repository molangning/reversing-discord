package com.discord.friend_finder.react;

import com.discord.friend_finder.ContactsDataEntry;
import com.discord.friend_finder.ContactsDataEntry$$serializer;
import com.discord.friend_finder.FriendFinderProvider;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.permissions.NativePermissionStatus;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;
import p045cj.C2560a2;
import p045cj.C2634r0;

@Metadata(m14358d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001b\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m14357d2 = {"mapResultToContactsPermission", "", "", "serializeFetchContactsResult", "", "Lcom/facebook/react/bridge/ReactContext;", "callback", "Lcom/facebook/react/bridge/Callback;", "serializeGetImageForContactIdResult", "deviceContactId", "serializeHasContactPermissionsResult", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Promise;)Lkotlin/Unit;", "friend_finder_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FriendFinderSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int mapResultToContactsPermission(String str) {
        String name = NativePermissionStatus.AUTHORIZED.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C9612q.m13922c(str, lowerCase)) {
            return 1;
        }
        String lowerCase2 = NativePermissionStatus.DENIED.name().toLowerCase(locale);
        C9612q.m13918g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C9612q.m13922c(str, lowerCase2);
        return 0;
    }

    public static final void serializeFetchContactsResult(ReactContext reactContext, Callback callback) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(callback, "callback");
        try {
            Map<String, ContactsDataEntry> fetchContacts = FriendFinderProvider.INSTANCE.fetchContacts(reactContext);
            Json.C9954a c9954a = Json.f25830d;
            c9954a.mo265a();
            callback.invoke(null, c9954a.mo231c(new C2634r0(C2560a2.f7013a, ContactsDataEntry$$serializer.INSTANCE), fetchContacts));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactsPermission(NativePermissionStatus.DENIED.name())), null, null);
        }
    }

    public static final void serializeGetImageForContactIdResult(ReactContext reactContext, String deviceContactId, Callback callback) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(deviceContactId, "deviceContactId");
        C9612q.m13917h(callback, "callback");
        try {
            callback.invoke(null, FriendFinderProvider.INSTANCE.getImageForContactId(reactContext, deviceContactId));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactsPermission(NativePermissionStatus.DENIED.name())), null);
        }
    }

    public static final Unit serializeHasContactPermissionsResult(ReactContext reactContext, Promise promise) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(promise, "promise");
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) reactContext.getNativeModule(NativePermissionManagerModule.class);
        if (nativePermissionManagerModule != null) {
            nativePermissionManagerModule.hasContactAuthorization(new PromiseWrapper(promise, FriendFinderSerializerKt$serializeHasContactPermissionsResult$1.INSTANCE, null, 4, null));
            return Unit.f25302a;
        }
        return null;
    }
}
