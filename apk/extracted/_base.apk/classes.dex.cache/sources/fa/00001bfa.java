package com.discord.notifications.react;

import com.discord.cache.CacheModule;
import com.discord.notifications.client.NotificationClient;
import com.discord.notifications.fcm.MessagingService;
import com.discord.notifications.react.events.LocalNotificationEvent;
import com.discord.notifications.react.events.NotificationEvent;
import com.discord.notifications.react.events.RegisterEvent;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9652n;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0007J\b\u0010\r\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0007J\b\u0010\u0019\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u001c\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\n2\b\u0010 \u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020#H\u0007J\u0010\u0010&\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#H\u0007J\u0010\u0010(\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\b\u0010)\u001a\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, m14357d2 = {"Lcom/discord/notifications/react/PushNotificationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "addListener", "", "type", "", "appStateChanged", "appState", "clearAllNotifications", "getInitialNotification", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "getLightsEnabled", "getName", "getSoundsEnabled", "getVibrationsEnabled", "handleDirectReplySuccess", "notificationString", "markNotificationAsDirectReply", "channelId", "onRegisterNotificationToken", "registerEventListener", "removeListeners", "count", "", "setCurrentUser", "username", "userId", "setLightsEnabled", ViewProps.ENABLED, "", "setNotifyEveryTime", "notifyEveryTime", "setSoundsEnabled", "setVibrationsEnabled", "shouldNotifyEveryTime", "updateAuthState", "Companion", "notification_react_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class PushNotificationModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    private static final String EVENT_TYPE_NOTIFICATION = "notification";
    private static final String EVENT_TYPE_NOTIFICATION_LOCAL = "localNotification";
    private static final String EVENT_TYPE_REGISTER = "register";
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m14357d2 = {"Lcom/discord/notifications/react/PushNotificationModule$Companion;", "", "()V", "EVENT_TYPE_NOTIFICATION", "", "EVENT_TYPE_NOTIFICATION_LOCAL", "EVENT_TYPE_REGISTER", "notification_react_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(C11591x.m7577a(EVENT_TYPE_REGISTER, C9591f0.m13969b(RegisterEvent.class)), C11591x.m7577a(EVENT_TYPE_NOTIFICATION, C9591f0.m13969b(NotificationEvent.class)), C11591x.m7577a(EVENT_TYPE_NOTIFICATION_LOCAL, C9591f0.m13969b(LocalNotificationEvent.class)));
        MessagingService.Companion.init();
    }

    private final void updateAuthState() {
        CacheModule.Companion companion = CacheModule.Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        boolean z = false;
        if (CacheModule.getToken$default(companion.get(reactApplicationContext), false, 1, null) != null) {
            z = true;
        }
        NotificationClient companion2 = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext2, "reactApplicationContext");
        companion2.setIsAuthed(reactApplicationContext2, z);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
        if (r5 != false) goto L13;
     */
    @com.facebook.react.bridge.ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void appStateChanged(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "appState"
            kotlin.jvm.internal.C9612q.m13917h(r5, r0)
            r4.updateAuthState()
            com.discord.notifications.client.NotificationClient$Companion r0 = com.discord.notifications.client.NotificationClient.Companion
            com.discord.notifications.client.NotificationClient r0 = r0.getInstance()
            java.lang.String r1 = "active"
            boolean r5 = kotlin.jvm.internal.C9612q.m13922c(r5, r1)
            r1 = 0
            if (r5 == 0) goto L32
            int r5 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r3 = 1
            if (r5 < r2) goto L31
            com.facebook.react.bridge.ReactApplicationContext r5 = r4.reactContext
            android.app.Activity r5 = r5.getCurrentActivity()
            if (r5 == 0) goto L2e
            boolean r5 = com.discord.external_pip.C3170b.m31920a(r5)
            if (r5 != r3) goto L2e
            r5 = r3
            goto L2f
        L2e:
            r5 = r1
        L2f:
            if (r5 != 0) goto L32
        L31:
            r1 = r3
        L32:
            r0.setActive(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.react.PushNotificationModule.appStateChanged(java.lang.String):void");
    }

    @ReactMethod
    public final void clearAllNotifications() {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.clearAllNotifications(reactApplicationContext);
    }

    @ReactMethod
    public final void getInitialNotification(Promise promise) {
        WritableNativeMap writableNativeMap;
        C9612q.m13917h(promise, "promise");
        Map<String, String> pendingNotification = NotificationClient.Companion.getInstance().getPendingNotification();
        if (pendingNotification != null) {
            writableNativeMap = NativeMapExtensionsKt.toNativeMap(pendingNotification);
        } else {
            writableNativeMap = null;
        }
        promise.resolve(writableNativeMap);
    }

    @ReactMethod
    public final void getLightsEnabled(Promise promise) {
        C9612q.m13917h(promise, "promise");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(companion.isLightsEnabled(reactApplicationContext)));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PushNotificationAndroid";
    }

    @ReactMethod
    public final void getSoundsEnabled(Promise promise) {
        C9612q.m13917h(promise, "promise");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(companion.isSoundsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void getVibrationsEnabled(Promise promise) {
        C9612q.m13917h(promise, "promise");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(companion.isVibrationsEnabled(reactApplicationContext)));
    }

    @ReactMethod
    public final void handleDirectReplySuccess(String notificationString) {
        C9612q.m13917h(notificationString, "notificationString");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.onDirectReplySuccess(reactApplicationContext, notificationString);
    }

    @ReactMethod
    public final void markNotificationAsDirectReply(String channelId) {
        Long m13767o;
        C9612q.m13917h(channelId, "channelId");
        m13767o = C9652n.m13767o(channelId);
        if (m13767o != null) {
            long longValue = m13767o.longValue();
            NotificationClient companion = NotificationClient.Companion.getInstance();
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
            companion.markNotificationAsDirectReply(reactApplicationContext, longValue);
        }
    }

    @ReactMethod
    public final void onRegisterNotificationToken() {
        updateAuthState();
    }

    @ReactMethod
    public final void registerEventListener(String type) {
        C9612q.m13917h(type, "type");
        int hashCode = type.hashCode();
        if (hashCode != -690213213) {
            if (hashCode != -145165322) {
                if (hashCode == 595233003 && type.equals(EVENT_TYPE_NOTIFICATION)) {
                    NotificationClient.Companion.getInstance().setNotificationListener(new PushNotificationModule$registerEventListener$2(this));
                    return;
                }
            } else if (type.equals(EVENT_TYPE_NOTIFICATION_LOCAL)) {
                NotificationClient.Companion.getInstance().setLocalNotificationListener(new PushNotificationModule$registerEventListener$3(this));
                return;
            }
        } else if (type.equals(EVENT_TYPE_REGISTER)) {
            NotificationClient.Companion.getInstance().setTokenListener(new PushNotificationModule$registerEventListener$1(this));
            return;
        }
        throw new IllegalArgumentException("Unknown event type: " + type);
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setCurrentUser(String str, String str2) {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setCurrentUser(reactApplicationContext, str, str2);
    }

    @ReactMethod
    public final void setLightsEnabled(boolean z) {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setLightsEnabled(reactApplicationContext, z);
    }

    @ReactMethod
    public final void setNotifyEveryTime(boolean z) {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setNotifyEveryTime(reactApplicationContext, z);
    }

    @ReactMethod
    public final void setSoundsEnabled(boolean z) {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setSoundsEnabled(reactApplicationContext, z);
    }

    @ReactMethod
    public final void setVibrationsEnabled(boolean z) {
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.setVibrationsEnabled(reactApplicationContext, z);
    }

    @ReactMethod
    public final void shouldNotifyEveryTime(Promise promise) {
        C9612q.m13917h(promise, "promise");
        NotificationClient companion = NotificationClient.Companion.getInstance();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        promise.resolve(Boolean.valueOf(companion.shouldNotifyEveryTime(reactApplicationContext)));
    }
}