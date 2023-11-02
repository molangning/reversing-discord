package com.discord.push_notification_monitor;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.app.NotificationManagerCompat;
import com.discord.codegen.NativePushNotificationMonitorManagerSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.Json;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitorModule;", "Lcom/discord/codegen/NativePushNotificationMonitorManagerSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "areNotificationsEnabled", "", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "clearLogs", "getPushNotificationLogs", "userId", "", "Companion", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PushNotificationMonitorModule extends NativePushNotificationMonitorManagerSpec {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "RTNNativePushNotificationMonitor";
    private final ReactApplicationContext reactContext;

    @Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitorModule$Companion;", "", "()V", "NAME", "", "create", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getPushNotificationLogStorage", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NativeModule create(ReactApplicationContext reactContext) {
            C9612q.m13917h(reactContext, "reactContext");
            return new PushNotificationMonitorModule(reactContext);
        }

        public final SharedPreferences getPushNotificationLogStorage(Context context) {
            C9612q.m13917h(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("push_notification_monitor", 0);
            C9612q.m13918g(sharedPreferences, "context.getSharedPrefere…r\", Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationMonitorModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    @Override // com.discord.codegen.NativePushNotificationMonitorManagerSpec
    public void areNotificationsEnabled(Promise promise) {
        C9612q.m13917h(promise, "promise");
        promise.resolve(Boolean.valueOf(NotificationManagerCompat.m38785g(this.reactContext).m38791a()));
    }

    @Override // com.discord.codegen.NativePushNotificationMonitorManagerSpec
    public void clearLogs() {
        PushNotificationMonitor.INSTANCE.clearPushLog(this.reactContext);
    }

    @Override // com.discord.codegen.NativePushNotificationMonitorManagerSpec
    public void getPushNotificationLogs(String userId, Promise promise) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(promise, "promise");
        Json.C9954a c9954a = Json.f25830d;
        PushNotificationLog pushLog = PushNotificationMonitor.INSTANCE.getPushLog(this.reactContext, userId);
        c9954a.mo265a();
        promise.resolve(c9954a.mo231c(PushNotificationLog.Companion.serializer(), pushLog));
    }
}
