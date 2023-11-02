package com.discord.notifications.client;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.C0955e;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.crash_reporting.CrashReporting;
import com.discord.kvstorage.discordapp.DiscordMobileApi;
import com.discord.logging.Log;
import com.discord.misc.utilities.intent.IntentUtilsKt;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.api.DirectReplyMessage;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.notifications.renderer.NotificationRenderer;
import com.discord.notifications.renderer.utils.NotificationDataUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.push_notification_monitor.PushNotificationMeta;
import com.discord.push_notification_monitor.PushNotificationMonitor;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.discord.shortcuts.ShortcutData;
import fj.AbstractC6480a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.json.Json;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 N2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\bL\u0010MJ4\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u000f\u001a\u00020\u000b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J6\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006J\u0016\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0007J\u0016\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006J\u000e\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u0007J\u001a\u0010\u001f\u001a\u00020\u000b2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001dJ(\u0010!\u001a\u00020\u000b2 \u0010 \u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\u001dJ\u001c\u0010\"\u001a\u00020\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006J(\u0010#\u001a\u00020\u000b2 \u0010 \u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b0\u001dJ\u0016\u0010%\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\tJ\u000e\u0010&\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010(\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\tJ\u000e\u0010)\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010+\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\tJ\u000e\u0010,\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010.\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\tJ\"\u00101\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u00072\b\u00100\u001a\u0004\u0018\u00010\u0007J\u0016\u00103\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\tJ\u000e\u00104\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u00106\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0007J\u0016\u00109\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00108\u001a\u000207J$\u0010:\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u000e\u0010;\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b<\u0010>\"\u0004\b?\u0010@R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\"\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010BR&\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR2\u0010 \u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010BR2\u0010E\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010BR\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006O"}, m14357d2 = {"Lcom/discord/notifications/client/NotificationClient;", "", "Landroid/content/Context;", "context", "Lcom/discord/notifications/api/NotificationData;", "notificationData", "", "", "notificationDataMap", "", "makeOrUpdateShortcut", "", "showNotification", "updateAndComputeIfShouldRunBackgroundSync", "notification", "setNotification", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "getBehaviors", "localizedCategoryNames", "localizedGroupNames", "initNotificationCategories", ZeroconfModule.KEY_SERVICE_NAME, "setIncomingRingtone", "Landroid/content/Intent;", "intent", "handleIntent", "getPendingNotification", "token", "setToken", "Lkotlin/Function1;", "tokenListener", "setTokenListener", "notificationListener", "setNotificationListener", "setLocalNotification", "setLocalNotificationListener", "isAuthed", "setIsAuthed", "isSoundsEnabled", "soundsEnabled", "setSoundsEnabled", "isVibrationsEnabled", "vibrationsEnabled", "setVibrationsEnabled", "isLightsEnabled", "lightsEnabled", "setLightsEnabled", "username", "userId", "setCurrentUser", "notifyEveryTime", "setNotifyEveryTime", "shouldNotifyEveryTime", "data", "onDirectReplySuccess", "", "channelId", "markNotificationAsDirectReply", "onNotificationReceived", "clearAllNotifications", "isActive", "Z", "()Z", "setActive", "(Z)V", "Ljava/lang/String;", "Lkotlin/jvm/functions/Function1;", "notificationPending", "Ljava/util/Map;", "notificationLocalListener", "Lcom/discord/notifications/client/NotificationCache;", "cache", "Lcom/discord/notifications/client/NotificationCache;", "Lcom/discord/notifications/renderer/NotificationRenderer;", "renderer", "Lcom/discord/notifications/renderer/NotificationRenderer;", "<init>", "()V", "Companion", "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationClient {
    private static final long NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS = 3600000;
    private boolean isActive;
    private Function1<? super Map<String, String>, Unit> notificationListener;
    private Function1<? super Map<String, String>, Unit> notificationLocalListener;
    private Map<String, String> notificationPending;
    private String token;
    public static final Companion Companion = new Companion(null);
    private static final NotificationClient instance = new NotificationClient();
    private Function1<? super String, Unit> tokenListener = NotificationClient$tokenListener$1.INSTANCE;
    private NotificationCache cache = new NotificationCache();
    private NotificationRenderer renderer = new NotificationRenderer();

    @Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m14357d2 = {"Lcom/discord/notifications/client/NotificationClient$Companion;", "", "()V", "NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS", "", "instance", "Lcom/discord/notifications/client/NotificationClient;", "getInstance", "()Lcom/discord/notifications/client/NotificationClient;", "notification_client_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final NotificationClient getInstance() {
            return NotificationClient.instance;
        }
    }

    private final NotificationBehaviors getBehaviors(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return null;
        }
        return new NotificationBehaviors(isSoundsEnabled(context), isVibrationsEnabled(context), isLightsEnabled(context));
    }

    private final void setNotification(Map<String, String> map) {
        if (map == null) {
            this.notificationPending = null;
            return;
        }
        Function1<? super Map<String, String>, Unit> function1 = this.notificationListener;
        if (function1 != null) {
            if (function1 != null) {
                function1.invoke(map);
                return;
            }
            return;
        }
        this.notificationPending = map;
    }

    private final void showNotification(Context context, NotificationData notificationData, Map<String, String> map, boolean z) {
        String m42079toStringimpl;
        Map m6751k;
        String currentUserId;
        String type;
        boolean z2;
        String str;
        CrashReporting crashReporting = CrashReporting.INSTANCE;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11591x.m7577a("type", notificationData.getType());
        pairArr[1] = C11591x.m7577a("channelId", String.valueOf(notificationData.m42013getChannelIdqMVnFVQ()));
        String m42015getMessageIdN_6c4I0 = notificationData.m42015getMessageIdN_6c4I0();
        if (m42015getMessageIdN_6c4I0 == null) {
            m42079toStringimpl = "null";
        } else {
            m42079toStringimpl = MessageId.m42079toStringimpl(m42015getMessageIdN_6c4I0);
        }
        pairArr[2] = C11591x.m7577a("messageId", m42079toStringimpl);
        m6751k = C11889v.m6751k(pairArr);
        CrashReporting.addBreadcrumb$default(crashReporting, "Kotlin NotificationClient received Notification.", m6751k, null, 4, null);
        if (!this.cache.isAuthed(context)) {
            return;
        }
        SilentNotificationManager silentNotificationManager = SilentNotificationManager.Companion.get(context);
        if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_CHANNEL_ACK)) {
            this.renderer.handleAcks(context, notificationData);
            silentNotificationManager.handleAcks(notificationData);
        } else if (!this.isActive) {
            try {
                boolean shouldDisplayNotification = silentNotificationManager.shouldDisplayNotification(notificationData);
                UserId m42017getReceivingUserIdwUX8bhU = notificationData.m42017getReceivingUserIdwUX8bhU();
                if (m42017getReceivingUserIdwUX8bhU == null || (currentUserId = UserId.m42118toStringimpl(m42017getReceivingUserIdwUX8bhU.m42120unboximpl())) == null) {
                    currentUserId = this.cache.getCurrentUserId(context);
                }
                String str2 = null;
                if (currentUserId != null) {
                    PushNotificationMonitor pushNotificationMonitor = PushNotificationMonitor.INSTANCE;
                    type = notificationData.getType();
                    if (!shouldDisplayNotification) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    String obj = NotificationDataUtilsKt.getTitle(notificationData, context).toString();
                    CharSequence content = NotificationDataUtilsKt.getContent(notificationData, context, true);
                    if (content != null) {
                        str = content.toString();
                    } else {
                        str = null;
                    }
                    pushNotificationMonitor.logPushNotification(context, currentUserId, new PushNotificationMeta(currentTimeMillis, z2, type, obj, str));
                }
                if (shouldDisplayNotification) {
                    this.renderer.initIconUrlUtils(context);
                    this.renderer.initFresco(context);
                    this.renderer.display(context, notificationData, this.cache.getCurrentUsername(context), map, getBehaviors(context), z, shouldNotifyEveryTime(context));
                    silentNotificationManager.onDisplayNotification(notificationData);
                } else {
                    silentNotificationManager.onSilentNotification(notificationData);
                }
                if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
                    KvMessageEntry kvMessage = NotificationDataUtilsKt.getKvMessage(notificationData, map.get("message"));
                    if (kvMessage != null) {
                        String m42015getMessageIdN_6c4I02 = notificationData.m42015getMessageIdN_6c4I0();
                        ChannelId m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ();
                        if (m42015getMessageIdN_6c4I02 != null && m42013getChannelIdqMVnFVQ != null) {
                            String str3 = map.get("receiving_user_id");
                            String str4 = "@account." + ((Object) str3);
                            GuildId m42014getGuildIdqOKuAAo = notificationData.m42014getGuildIdqOKuAAo();
                            if (m42014getGuildIdqOKuAAo != null) {
                                str2 = GuildId.m42067toStringimpl(m42014getGuildIdqOKuAAo.m42069unboximpl());
                            }
                            String m42054toStringimpl = ChannelId.m42054toStringimpl(m42013getChannelIdqMVnFVQ.m42056unboximpl());
                            String m42079toStringimpl2 = MessageId.m42079toStringimpl(m42015getMessageIdN_6c4I02);
                            Json.C9954a c9954a = Json.f25830d;
                            c9954a.mo265a();
                            DiscordMobileApi.putMessage(str4, str2, m42054toStringimpl, m42079toStringimpl2, c9954a.mo231c(KvMessageEntry.Companion.serializer(), kvMessage));
                        }
                    }
                    if (updateAndComputeIfShouldRunBackgroundSync(context)) {
                        HeadlessTasks.Companion.startHeadlessTask(context, "BackgroundSync", (r18 & 4) != 0 ? 5000L : 30000L, (r18 & 8) != 0, (r18 & 16) != 0 ? new Bundle() : null, (r18 & 32) != 0 ? false : true);
                    }
                }
            } catch (Exception e) {
                Log log = Log.INSTANCE;
                String simpleName = NotificationClient.class.getSimpleName();
                C9612q.m13918g(simpleName, "javaClass.simpleName");
                log.m31912e(simpleName, "Unable to display notification", e);
            }
        }
    }

    private final boolean updateAndComputeIfShouldRunBackgroundSync(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < this.cache.getBackgroundSyncRan(context)) {
            this.cache.setBackgroundSyncRan(context);
            return true;
        } else if (currentTimeMillis > this.cache.getBackgroundSyncRan(context) + NOTIFICATION_BACKGROUND_SYNC_INTERVAL_MS) {
            this.cache.setBackgroundSyncRan(context);
            return true;
        } else {
            return false;
        }
    }

    public final void clearAllNotifications(Context context) {
        C9612q.m13917h(context, "context");
        this.renderer.clearAllNotifications(context);
    }

    public final Map<String, String> getPendingNotification() {
        Map<String, String> map = this.notificationPending;
        if (map == null) {
            return null;
        }
        this.notificationPending = null;
        return map;
    }

    public final void handleIntent(Context context, Intent intent) {
        NotificationAction notificationAction;
        ContentAction contentAction;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(intent, "intent");
        NotificationAction.Companion companion = NotificationAction.Companion;
        if (IntentUtilsKt.hasExtra(intent, C9591f0.m13969b(ContentAction.class))) {
            notificationAction = (NotificationAction) ((Parcelable) C0955e.m38374b(intent, "action_intent_arg_key", ContentAction.class));
        } else {
            notificationAction = null;
        }
        ContentAction contentAction2 = (ContentAction) notificationAction;
        ShortcutData shortcutIntentData = ShortcutData.Companion.getShortcutIntentData(intent);
        if (shortcutIntentData != null) {
            contentAction = new ContentAction(shortcutIntentData.getTag(), shortcutIntentData.getData());
        } else {
            contentAction = null;
        }
        if (contentAction2 == null) {
            contentAction2 = contentAction;
        }
        if (contentAction2 == null) {
            setNotification(null);
            return;
        }
        setNotification(contentAction2.getData());
        contentAction2.onNotificationActionComplete(context);
    }

    public final void initNotificationCategories(Context context, Map<String, String> localizedCategoryNames, Map<String, String> localizedGroupNames) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(localizedCategoryNames, "localizedCategoryNames");
        C9612q.m13917h(localizedGroupNames, "localizedGroupNames");
        this.renderer.initNotificationCategories(context, localizedCategoryNames, localizedGroupNames);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isLightsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return this.cache.isLightsEnabled(context);
    }

    public final boolean isSoundsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return this.cache.isSoundsEnabled(context);
    }

    public final boolean isVibrationsEnabled(Context context) {
        C9612q.m13917h(context, "context");
        return this.cache.isVibrationsEnabled(context);
    }

    public final void markNotificationAsDirectReply(Context context, long j) {
        C9612q.m13917h(context, "context");
        NotificationRenderer notificationRenderer = this.renderer;
        notificationRenderer.markNotificationAsDirectReply(context, NotificationData.TYPE_MESSAGE_CREATE + j, "", true);
    }

    public final void onDirectReplySuccess(Context context, String data) {
        String m42079toStringimpl;
        Map<String, String> m6751k;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(data, "data");
        NotificationData notificationData = DirectReplyMessage.Companion.toNotificationData(data);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11591x.m7577a("type", notificationData.getType());
        pairArr[1] = C11591x.m7577a("channel_id", String.valueOf(notificationData.m42013getChannelIdqMVnFVQ()));
        String m42015getMessageIdN_6c4I0 = notificationData.m42015getMessageIdN_6c4I0();
        if (m42015getMessageIdN_6c4I0 == null) {
            m42079toStringimpl = "null";
        } else {
            m42079toStringimpl = MessageId.m42079toStringimpl(m42015getMessageIdN_6c4I0);
        }
        pairArr[2] = C11591x.m7577a("message_id", m42079toStringimpl);
        m6751k = C11889v.m6751k(pairArr);
        showNotification(context, notificationData, m6751k, false);
    }

    public final void onNotificationReceived(Context context, Map<String, String> data) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(data, "data");
        showNotification(context, (NotificationData) AbstractC6480a.f18197b.m22639d(NotificationData.Companion.serializer(), data), data, true);
    }

    public final void setActive(boolean z) {
        this.isActive = z;
    }

    public final void setCurrentUser(Context context, String str, String str2) {
        C9612q.m13917h(context, "context");
        this.cache.setCurrentUsername(context, str);
        this.cache.setCurrentUserId(context, str2);
    }

    public final void setIncomingRingtone(Context context, String name) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(name, "name");
        this.renderer.setIncomingRingtone(context, name);
    }

    public final void setIsAuthed(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        this.cache.setIsAuthed(context, z);
    }

    public final void setLightsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        this.cache.setLightsEnabled(context, z);
    }

    public final void setLocalNotification(Map<String, String> notification) {
        C9612q.m13917h(notification, "notification");
    }

    public final void setLocalNotificationListener(Function1<? super Map<String, String>, Unit> notificationListener) {
        C9612q.m13917h(notificationListener, "notificationListener");
        this.notificationLocalListener = notificationListener;
    }

    public final void setNotificationListener(Function1<? super Map<String, String>, Unit> notificationListener) {
        C9612q.m13917h(notificationListener, "notificationListener");
        this.notificationListener = notificationListener;
    }

    public final void setNotifyEveryTime(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        this.cache.setNotifyEveryTime(context, z);
    }

    public final void setSoundsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        this.cache.setSoundsEnabled(context, z);
    }

    public final void setToken(String token) {
        C9612q.m13917h(token, "token");
        if (!C9612q.m13922c(this.token, token)) {
            this.token = token;
            this.tokenListener.invoke(token);
        }
    }

    public final void setTokenListener(Function1<? super String, Unit> tokenListener) {
        C9612q.m13917h(tokenListener, "tokenListener");
        this.tokenListener = tokenListener;
        String str = this.token;
        if (str != null) {
            tokenListener.invoke(str);
        }
    }

    public final void setVibrationsEnabled(Context context, boolean z) {
        C9612q.m13917h(context, "context");
        this.cache.setVibrationsEnabled(context, z);
    }

    public final boolean shouldNotifyEveryTime(Context context) {
        C9612q.m13917h(context, "context");
        return this.cache.shouldNotifyEveryTime(context);
    }
}