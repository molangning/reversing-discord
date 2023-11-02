package com.discord.contact_sync.react;

import com.discord.contact_sync.ContactSyncBlobEntry;
import com.discord.contact_sync.ContactSyncBlobEntry$$serializer;
import com.discord.contact_sync.ContactSyncPayloadEntry;
import com.discord.contact_sync.ContactSyncPayloadEntry$$serializer;
import com.discord.contact_sync.ContactSyncProvider;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.permissions.NativePermissionStatus;
import com.discord.react.utilities.PromiseWrapper;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.Json;
import p045cj.C2560a2;
import p045cj.C2581f;
import p045cj.C2634r0;

@Metadata(m14358d1 = {"\u0000(\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u001c\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001b\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\u0010\f\u001a\u0014\u0010\r\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\u000e"}, m14357d2 = {"mapResultToContactSyncPermission", "", "", "serializeGetImageForContactIdResult", "", "Lcom/facebook/react/bridge/ReactContext;", "deviceContactId", "callback", "Lcom/facebook/react/bridge/Callback;", "serializeHasContactPermissionsResult", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/bridge/Promise;)Lkotlin/Unit;", "serializeSyncContactResult", "contact_sync_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ContactSyncSerializerKt {
    public static final int mapResultToContactSyncPermission(String str) {
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

    public static final void serializeGetImageForContactIdResult(ReactContext reactContext, String deviceContactId, Callback callback) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(deviceContactId, "deviceContactId");
        C9612q.m13917h(callback, "callback");
        try {
            callback.invoke(null, ContactSyncProvider.INSTANCE.getImageForContactId(reactContext, deviceContactId));
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name())), null);
        }
    }

    public static final Unit serializeHasContactPermissionsResult(ReactContext reactContext, Promise promise) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(promise, "promise");
        NativePermissionManagerModule nativePermissionManagerModule = (NativePermissionManagerModule) reactContext.getNativeModule(NativePermissionManagerModule.class);
        if (nativePermissionManagerModule != null) {
            nativePermissionManagerModule.hasContactAuthorization(new PromiseWrapper(promise, ContactSyncSerializerKt$serializeHasContactPermissionsResult$1.INSTANCE, null, 4, null));
            return Unit.f25302a;
        }
        return null;
    }

    public static final void serializeSyncContactResult(ReactContext reactContext, Callback callback) {
        int m14093t;
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(callback, "callback");
        try {
            Map<String, ContactSyncBlobEntry> contactsMap = ContactSyncProvider.INSTANCE.getContactsMap(reactContext);
            Object[] objArr = new Object[3];
            objArr[0] = null;
            Json.C9954a c9954a = Json.f25830d;
            c9954a.mo265a();
            objArr[1] = c9954a.mo231c(new C2634r0(C2560a2.f7013a, ContactSyncBlobEntry$$serializer.INSTANCE), contactsMap);
            Collection<ContactSyncBlobEntry> values = contactsMap.values();
            m14093t = C9546k.m14093t(values, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (ContactSyncBlobEntry contactSyncBlobEntry : values) {
                arrayList.add(new ContactSyncPayloadEntry(contactSyncBlobEntry.getPhone()));
            }
            c9954a.mo265a();
            objArr[2] = c9954a.mo231c(new C2581f(ContactSyncPayloadEntry$$serializer.INSTANCE), arrayList);
            callback.invoke(objArr);
        } catch (SecurityException unused) {
            callback.invoke(Integer.valueOf(mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name())), null, null);
        }
    }
}