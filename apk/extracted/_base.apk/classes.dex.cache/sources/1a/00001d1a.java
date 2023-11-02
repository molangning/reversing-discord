package com.discord.push_notification_monitor;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.Json;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m14357d2 = {"Lcom/discord/push_notification_monitor/PushNotificationMonitor;", "", "()V", "MAX_PUSH_LOG_SIZE", "", "clearPushLog", "", "context", "Landroid/content/Context;", "getPushLog", "Lcom/discord/push_notification_monitor/PushNotificationLog;", "userId", "", "logPushNotification", "loggedInUserId", "pushNotification", "Lcom/discord/push_notification_monitor/PushNotificationMeta;", "writePushLog", "pushLog", "push_notification_monitor_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class PushNotificationMonitor {
    public static final PushNotificationMonitor INSTANCE = new PushNotificationMonitor();
    private static final int MAX_PUSH_LOG_SIZE = 100;

    private PushNotificationMonitor() {
    }

    private final void writePushLog(Context context, String str, PushNotificationLog pushNotificationLog) {
        SharedPreferences.Editor editor = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(context).edit();
        C9612q.m13918g(editor, "editor");
        Json.C9954a c9954a = Json.f25830d;
        c9954a.mo265a();
        editor.putString(str, c9954a.mo231c(PushNotificationLog.Companion.serializer(), pushNotificationLog));
        editor.apply();
    }

    public final void clearPushLog(Context context) {
        C9612q.m13917h(context, "context");
        SharedPreferences pushNotificationLogStorage = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(context);
        SharedPreferences.Editor editor = pushNotificationLogStorage.edit();
        C9612q.m13918g(editor, "editor");
        for (String str : pushNotificationLogStorage.getAll().keySet()) {
            editor.remove(str);
        }
        editor.apply();
    }

    public final PushNotificationLog getPushLog(Context context, String userId) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(userId, "userId");
        SharedPreferences pushNotificationLogStorage = PushNotificationMonitorModule.Companion.getPushNotificationLogStorage(context);
        if (pushNotificationLogStorage.getString(userId, null) != null) {
            Json.C9954a c9954a = Json.f25830d;
            String str = "";
            String string = pushNotificationLogStorage.getString(userId, "");
            if (string != null) {
                str = string;
            }
            c9954a.mo265a();
            return (PushNotificationLog) c9954a.mo232b(PushNotificationLog.Companion.serializer(), str);
        }
        return new PushNotificationLog((List) null, 1, (DefaultConstructorMarker) null);
    }

    public final void logPushNotification(Context context, String loggedInUserId, PushNotificationMeta pushNotification) {
        List m14073E0;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(loggedInUserId, "loggedInUserId");
        C9612q.m13917h(pushNotification, "pushNotification");
        m14073E0 = C9553r.m14073E0(getPushLog(context, loggedInUserId).getPushNotifications());
        m14073E0.add(pushNotification);
        if (m14073E0.size() == 100) {
            m14073E0.remove(0);
        }
        writePushLog(context, loggedInUserId, new PushNotificationLog(m14073E0));
    }
}