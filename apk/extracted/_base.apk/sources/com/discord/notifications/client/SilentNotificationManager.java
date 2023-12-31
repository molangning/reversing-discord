package com.discord.notifications.client;

import android.content.Context;
import android.content.SharedPreferences;
import com.discord.notifications.api.NotificationData;
import com.discord.primitives.ChannelId;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u001d\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J%\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J%\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0011J\u001d\u0010#\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0019\u0010&\u001a\u00020'*\u00020\u000bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m14357d2 = {"Lcom/discord/notifications/client/SilentNotificationManager;", "", "reactContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sharedPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getNumAccumulatedMessagesForChannel", "", "channelId", "Lcom/discord/primitives/ChannelId;", "getNumAccumulatedMessagesForChannel-R7gqayM", "(J)I", "handleAcks", "", "notificationData", "Lcom/discord/notifications/api/NotificationData;", "lastMessagedReceivedAgoInMins", "", "lastMessagedReceivedAgoInMins-R7gqayM", "(J)J", "onDisplayNotification", "onSilentNotification", "setLastMessageReceivedForChannel", "timestamp", "setLastMessageReceivedForChannel-LJLSWy8", "(JJ)V", "setMessageReceivedForChannel", "setNumAccumulatedMessagesForChannel", "number", "setNumAccumulatedMessagesForChannel-LJLSWy8", "(JI)V", "shouldDisplayNotification", "", "updateLastMessageReceivedForChannel", "updateLastMessageReceivedForChannel-R7gqayM", "(J)V", "toMessageCountKey", "", "toMessageCountKey-R7gqayM", "(J)Ljava/lang/String;", "Companion", "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class SilentNotificationManager {
    public static final Companion Companion = new Companion(null);
    public static final int IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS = 15;
    public static final int MAX_MESSAGES_BEFORE_THROTTLE = 3;
    public static final String SILENT_NOTIFICATION_CACHE_STORE_NAME = "silent_notifications";
    private static SilentNotificationManager instance;
    private final SharedPreferences sharedPrefs;

    @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, m14357d2 = {"Lcom/discord/notifications/client/SilentNotificationManager$Companion;", "", "()V", "IDLE_TIME_TO_RECEIVE_PUSH_FROM_GDM_OR_SMALL_GUILD_MINS", "", "MAX_MESSAGES_BEFORE_THROTTLE", "SILENT_NOTIFICATION_CACHE_STORE_NAME", "", "instance", "Lcom/discord/notifications/client/SilentNotificationManager;", "get", "context", "Landroid/content/Context;", "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SilentNotificationManager get(Context context) {
            C9612q.m13917h(context, "context");
            SilentNotificationManager silentNotificationManager = SilentNotificationManager.instance;
            if (silentNotificationManager == null) {
                SilentNotificationManager silentNotificationManager2 = new SilentNotificationManager(context);
                SilentNotificationManager.instance = silentNotificationManager2;
                return silentNotificationManager2;
            }
            return silentNotificationManager;
        }
    }

    public SilentNotificationManager(Context reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        this.sharedPrefs = reactContext.getSharedPreferences(SILENT_NOTIFICATION_CACHE_STORE_NAME, 0);
    }

    /* renamed from: getNumAccumulatedMessagesForChannel-R7gqayM  reason: not valid java name */
    private final int m42027getNumAccumulatedMessagesForChannelR7gqayM(long j) {
        return this.sharedPrefs.getInt(m42031toMessageCountKeyR7gqayM(j), 0);
    }

    /* renamed from: lastMessagedReceivedAgoInMins-R7gqayM  reason: not valid java name */
    private final long m42028lastMessagedReceivedAgoInMinsR7gqayM(long j) {
        long j2 = this.sharedPrefs.getLong(ChannelId.m42054toStringimpl(j), 0L);
        return TimeUnit.MILLISECONDS.toMinutes(System.currentTimeMillis() - j2);
    }

    /* renamed from: setLastMessageReceivedForChannel-LJLSWy8  reason: not valid java name */
    private final void m42029setLastMessageReceivedForChannelLJLSWy8(long j, long j2) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        editor.putLong(ChannelId.m42054toStringimpl(j), j2);
        editor.apply();
    }

    private final void setMessageReceivedForChannel(NotificationData notificationData) {
        ChannelId m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ();
        if (m42013getChannelIdqMVnFVQ != null) {
            long m42056unboximpl = m42013getChannelIdqMVnFVQ.m42056unboximpl();
            m42030setNumAccumulatedMessagesForChannelLJLSWy8(m42056unboximpl, m42027getNumAccumulatedMessagesForChannelR7gqayM(m42056unboximpl) + 1);
            m42032updateLastMessageReceivedForChannelR7gqayM(m42056unboximpl);
        }
    }

    /* renamed from: setNumAccumulatedMessagesForChannel-LJLSWy8  reason: not valid java name */
    private final void m42030setNumAccumulatedMessagesForChannelLJLSWy8(long j, int i) {
        SharedPreferences sharedPrefs = this.sharedPrefs;
        C9612q.m13918g(sharedPrefs, "sharedPrefs");
        SharedPreferences.Editor editor = sharedPrefs.edit();
        C9612q.m13918g(editor, "editor");
        editor.putInt(m42031toMessageCountKeyR7gqayM(j), i);
        editor.apply();
    }

    /* renamed from: toMessageCountKey-R7gqayM  reason: not valid java name */
    private final String m42031toMessageCountKeyR7gqayM(long j) {
        String m42054toStringimpl = ChannelId.m42054toStringimpl(j);
        return m42054toStringimpl + "_num";
    }

    /* renamed from: updateLastMessageReceivedForChannel-R7gqayM  reason: not valid java name */
    private final void m42032updateLastMessageReceivedForChannelR7gqayM(long j) {
        m42029setLastMessageReceivedForChannelLJLSWy8(j, System.currentTimeMillis());
    }

    public final void handleAcks(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "notificationData");
        for (ChannelId channelId : notificationData.getAckChannelIds()) {
            m42030setNumAccumulatedMessagesForChannelLJLSWy8(channelId.m42056unboximpl(), 0);
        }
    }

    public final void onDisplayNotification(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "notificationData");
        Integer channelType = notificationData.getChannelType();
        if (channelType != null && channelType.intValue() == 1) {
            return;
        }
        setMessageReceivedForChannel(notificationData);
    }

    public final void onSilentNotification(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "notificationData");
        setMessageReceivedForChannel(notificationData);
    }

    public final boolean shouldDisplayNotification(NotificationData notificationData) {
        Integer channelType;
        C9612q.m13917h(notificationData, "notificationData");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || ((channelType = notificationData.getChannelType()) != null && channelType.intValue() == 1)) {
            return true;
        }
        ChannelId m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ();
        if (m42013getChannelIdqMVnFVQ != null) {
            long m42056unboximpl = m42013getChannelIdqMVnFVQ.m42056unboximpl();
            if (m42027getNumAccumulatedMessagesForChannelR7gqayM(m42056unboximpl) < 3) {
                return true;
            }
            if (m42028lastMessagedReceivedAgoInMinsR7gqayM(m42056unboximpl) >= 15) {
                m42030setNumAccumulatedMessagesForChannelLJLSWy8(m42056unboximpl, 0);
                return true;
            }
        }
        return false;
    }
}
