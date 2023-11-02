package com.discord.notifications.react;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.notifications.client.NotificationClient;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J(\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0006H\u0007¨\u0006\u0015"}, m14357d2 = {"Lcom/discord/notifications/react/PushNotificationCategoryModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "registerNotificationCategories", "", "localizedCategoryNames", "Lcom/facebook/react/bridge/ReadableMap;", "registerNotificationCategoriesAndGroups", "localizedGroupNames", "registerNotificationReplyCategories", "title", "buttonTitle", "inputPlaceholder", "callback", "Lcom/facebook/react/bridge/Callback;", "setIncomingRingtone", ZeroconfModule.KEY_SERVICE_NAME, "notification_react_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class PushNotificationCategoryModule extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationCategoryModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DCDNotificationCategoryUtils";
    }

    @ReactMethod
    public final void registerNotificationCategories(ReadableMap localizedCategoryNames) {
        Map<String, String> m6754h;
        C9612q.m13917h(localizedCategoryNames, "localizedCategoryNames");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        Map<String, String> stringMap = NativeMapExtensionsKt.toStringMap(localizedCategoryNames);
        m6754h = C11889v.m6754h();
        companion.initNotificationCategories(reactApplicationContext, stringMap, m6754h);
    }

    @ReactMethod
    public final void registerNotificationCategoriesAndGroups(ReadableMap localizedCategoryNames, ReadableMap localizedGroupNames) {
        C9612q.m13917h(localizedCategoryNames, "localizedCategoryNames");
        C9612q.m13917h(localizedGroupNames, "localizedGroupNames");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.initNotificationCategories(reactApplicationContext, NativeMapExtensionsKt.toStringMap(localizedCategoryNames), NativeMapExtensionsKt.toStringMap(localizedGroupNames));
    }

    @ReactMethod
    public final void registerNotificationReplyCategories(String title, String buttonTitle, String inputPlaceholder, Callback callback) {
        C9612q.m13917h(title, "title");
        C9612q.m13917h(buttonTitle, "buttonTitle");
        C9612q.m13917h(inputPlaceholder, "inputPlaceholder");
        C9612q.m13917h(callback, "callback");
    }

    @ReactMethod
    public final void setIncomingRingtone(String name) {
        C9612q.m13917h(name, "name");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setIncomingRingtone(reactApplicationContext, name);
    }
}