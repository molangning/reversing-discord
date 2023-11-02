package com.discord.notifications.renderer.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.p017pm.ShortcutInfoCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.discord.crash_reporting.CrashReporting;
import com.discord.icons.IconUrlUtils;
import com.discord.misc.utilities.intent.PendingIntentUtils;
import com.discord.notifications.actions.intents.ContentAction;
import com.discord.notifications.actions.intents.DeleteAction;
import com.discord.notifications.actions.intents.DirectReplyAction;
import com.discord.notifications.actions.intents.DismissCallAction;
import com.discord.notifications.actions.intents.MarkAsReadAction;
import com.discord.notifications.actions.intents.MuteAction;
import com.discord.notifications.actions.intents.NotificationAction;
import com.discord.notifications.api.KvMessageEntry;
import com.discord.notifications.api.NotificationData;
import com.discord.notifications.api.NotificationMessage;
import com.discord.notifications.api.Sticker;
import com.discord.notifications.renderer.C3351R;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.primitives.MessageId;
import com.discord.primitives.UserId;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.shortcuts.ShortcutData;
import com.discord.shortcuts.ShortcutUtilsKt;
import com.discord.theme.utils.ColorUtilsKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.json.C9963f;
import kotlinx.serialization.json.C9964g;
import kotlinx.serialization.json.C9983s;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u001a/\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0002\u001a\n\u0010\u0012\u001a\u00020\u0013*\u00020\u0014\u001a(\u0010\u0015\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a0\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00102\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u001a\u001c\u0010\u0019\u001a\u0004\u0018\u00010\t*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010\u001a(\u0010\u001a\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a\u000e\u0010\u001b\u001a\u0004\u0018\u00010\t*\u00020\u0014H\u0000\u001a\u0014\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u0017*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010\u001e\u001a\u00020\u0006*\u00020\u0014H\u0000\u001a\u0014\u0010\u001f\u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0014\u0010 \u001a\u00020\u0006*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0016\u0010!\u001a\u0004\u0018\u00010\"*\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0006\u001a\u0016\u0010$\u001a\u0004\u0018\u00010\u0017*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\f\u0010%\u001a\u00020\u0006*\u00020\u0014H\u0000\u001a\f\u0010&\u001a\u00020'*\u00020\u0014H\u0000\u001a\u0016\u0010(\u001a\u00020)*\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0000\u001a\u0018\u0010,\u001a\u0004\u0018\u00010)*\u00020\u00142\b\u0010*\u001a\u0004\u0018\u00010+H\u0000\u001a<\u0010-\u001a\u00020.*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010/\u001a\u0004\u0018\u00010+H\u0000\u001a\f\u00100\u001a\u000201*\u00020\u0014H\u0000\u001a\u0016\u00102\u001a\u0004\u0018\u000103*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\n\u00104\u001a\u00020\u0006*\u00020\u0014\u001a\u001c\u00105\u001a\u0004\u0018\u00010\u0017*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00106\u001a\u000201\u001a\u0012\u00107\u001a\u00020\t*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u00108\u001a\u00020\u0010*\u00020\u0014H\u0000\u001a\f\u00109\u001a\u00020\u0010*\u00020\u0014H\u0000\u001a\u001e\u0010:\u001a\u0004\u0018\u00010\t*\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a\f\u0010;\u001a\u00020\u0010*\u00020\u0014H\u0000\u001a\f\u0010<\u001a\u00020=*\u00020+H\u0002\u001a\u0012\u0010>\u001a\u00020\u0013*\u00020\u00142\u0006\u0010?\u001a\u00020\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, m14357d2 = {"getPendingIntent", "Landroid/app/PendingIntent;", "context", "Landroid/content/Context;", "notificationDataMap", "", "", "tag", "getSystemMessageUserJoin", "", "userId", "Lcom/discord/primitives/UserId;", "userName", "getSystemMessageUserJoin-_NT-lnE", "renderLogAwareNotificationMessageContent", "forLogs", "", "messageContent", "getAuthor", "Lkotlinx/serialization/json/JsonObject;", "Lcom/discord/notifications/api/NotificationData;", "getButtonPendingIntent", "getCallAction", "Landroidx/core/app/NotificationCompat$Action;", "isAcceptAction", "getContent", "getContentPendingIntent", "getConversationTitle", "getDeletePendingIntent", "getDirectReplyAction", "getGroupKey", "getIconUrl", "getIconUrlForAvatar", "getKvMessage", "Lcom/discord/notifications/api/KvMessageEntry;", "rawMessage", "getMarkAsReadAction", "getNotificationCategory", "getSendTime", "", "getSender", "Landroidx/core/app/Person;", "icon", "Landroid/graphics/Bitmap;", "getSenderForMessageNotification", "getShortcutInfo", "Landroidx/core/content/pm/ShortcutInfoCompat;", "avatar", "getSmallIcon", "", "getSound", "Landroid/net/Uri;", "getTag", "getTimedMuteAction", "numMessages", "getTitle", "isConversation", "isGroupConversation", "renderMessageContent", "shouldUseBigText", "toIconCompat", "Landroidx/core/graphics/drawable/IconCompat;", "toNotificationMessage", "author", "notification_renderer_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationDataUtilsKt {
    public static final JsonObject getAuthor(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        String userAvatar = notificationData.getUserAvatar();
        UserId m42018getUserIdwUX8bhU = notificationData.m42018getUserIdwUX8bhU();
        C9612q.m13920e(m42018getUserIdwUX8bhU);
        long m42120unboximpl = m42018getUserIdwUX8bhU.m42120unboximpl();
        String userUsername = notificationData.getUserUsername();
        C9612q.m13920e(userUsername);
        C9983s c9983s = new C9983s();
        if (userAvatar != null) {
            C9963f.m12740c(c9983s, "avatar", userAvatar);
        }
        C9963f.m12740c(c9983s, "id", UserId.m42118toStringimpl(m42120unboximpl));
        C9963f.m12740c(c9983s, "username", userUsername);
        C9963f.m12740c(c9983s, "globalName", notificationData.getUserGlobalName());
        C9963f.m12742a(c9983s, "incomplete", Boolean.TRUE);
        return c9983s.m12693a();
    }

    public static final PendingIntent getButtonPendingIntent(NotificationData notificationData, Context context, Map<String, String> notificationDataMap) {
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(notificationDataMap, "notificationDataMap");
        String tag = getTag(notificationData);
        return getPendingIntent(context, notificationDataMap, tag + "button");
    }

    public static final NotificationCompat.Action getCallAction(NotificationData notificationData, Context context, boolean z, Map<String, String> notificationDataMap) {
        ChannelId m42013getChannelIdqMVnFVQ;
        PendingIntent pendingIntent$default;
        Pair m7577a;
        int i;
        Map m6740v;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(notificationDataMap, "notificationDataMap");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_CALL_RING) || (m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        long m42056unboximpl = m42013getChannelIdqMVnFVQ.m42056unboximpl();
        if (z) {
            m6740v = C11889v.m6740v(notificationDataMap);
            m6740v.put("type", NotificationData.TYPE_CALL_CONNECT);
            Unit unit = Unit.f25302a;
            pendingIntent$default = getButtonPendingIntent(notificationData, context, m6740v);
        } else {
            pendingIntent$default = NotificationAction.DefaultImpls.toPendingIntent$default(new DismissCallAction(getTag(notificationData), m42056unboximpl, null), context, 0, false, 6, null);
        }
        if (z) {
            m7577a = C11591x.m7577a(I18nUtilsKt.i18nFormat$default(context, I18nMessage.JOIN_CALL, null, 2, null), Integer.valueOf(ColorUtilsKt.getColorCompat(context, C3351R.color.green_360)));
        } else {
            m7577a = C11591x.m7577a(I18nUtilsKt.i18nFormat$default(context, I18nMessage.DECLINE, null, 2, null), Integer.valueOf(ColorUtilsKt.getColorCompat(context, C3351R.color.red_400)));
        }
        int intValue = ((Number) m7577a.m14350b()).intValue();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StyleSpan styleSpan = new StyleSpan(1);
        int length = spannableStringBuilder.length();
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(intValue);
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) m7577a.m14351a());
        spannableStringBuilder.setSpan(foregroundColorSpan, length2, spannableStringBuilder.length(), 17);
        spannableStringBuilder.setSpan(styleSpan, length, spannableStringBuilder.length(), 17);
        if (z) {
            i = C3351R.C3352drawable.ic_call_24dp;
        } else {
            i = C3351R.C3352drawable.ic_call_disconnect_24dp;
        }
        return new NotificationCompat.Action.C0699a(i, spannableStringBuilder, pendingIntent$default).m39036b();
    }

    public static final CharSequence getContent(NotificationData notificationData, Context context, boolean z) {
        String subtitle;
        Integer activityType;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        String type = notificationData.getType();
        boolean z2 = false;
        switch (type.hashCode()) {
            case -1502317553:
                return (type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) && (subtitle = notificationData.getSubtitle()) != null) ? subtitle : "";
            case -1489275252:
                if (type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE)) {
                    Integer guildScheduledEventEntityType = notificationData.getGuildScheduledEventEntityType();
                    if ((guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 2) || (guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 1)) {
                        z2 = true;
                    }
                    if (z2) {
                        return I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_BODY, new NotificationDataUtilsKt$getContent$8(notificationData));
                    }
                    return (guildScheduledEventEntityType != null && guildScheduledEventEntityType.intValue() == 3) ? I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_EXTERNAL_START_BODY, new NotificationDataUtilsKt$getContent$9(notificationData)) : "";
                }
                return "";
            case -1327124998:
                if (type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
                    Integer relationshipType = notificationData.getRelationshipType();
                    if (relationshipType != null && relationshipType.intValue() == 1) {
                        return I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_ACCEPTED_FRIEND_REQUEST, null, 2, null);
                    }
                    return (relationshipType != null && relationshipType.intValue() == 3) ? I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_PENDING_FRIEND_REQUEST, null, 2, null) : "";
                }
                return "";
            case -1263316859:
                return !type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.STAGE_START_PUSH_NOTIFICATION_BODY, new NotificationDataUtilsKt$getContent$6(notificationData));
            case -1237752112:
                return !type.equals(NotificationData.TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_BODY, new NotificationDataUtilsKt$getContent$5(notificationData));
            case -437641071:
                return !type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_BODY_MOBILE, new NotificationDataUtilsKt$getContent$7(notificationData));
            case 974015250:
                return (type.equals(NotificationData.TYPE_ACTIVITY_START) && (activityType = notificationData.getActivityType()) != null && activityType.intValue() == 0) ? I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_BODY_START_GAME, new NotificationDataUtilsKt$getContent$3(notificationData)) : "";
            case 998188116:
                if (type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    Integer channelType = notificationData.getChannelType();
                    if ((((((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) || (channelType != null && channelType.intValue() == 5)) || (channelType != null && channelType.intValue() == 10)) || (channelType != null && channelType.intValue() == 11)) || (channelType != null && channelType.intValue() == 12)) {
                        Integer messageType = notificationData.getMessageType();
                        if (messageType != null && messageType.intValue() == 7) {
                            return m42033getSystemMessageUserJoin_NTlnE(context, notificationData.m42018getUserIdwUX8bhU(), notificationData.getUserUsername());
                        }
                        Integer messageActivityType = notificationData.getMessageActivityType();
                        if (messageActivityType != null && messageActivityType.intValue() == 1) {
                            return I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_MESSAGE_CREATE_GUILD_ACTIVITY_JOIN, new NotificationDataUtilsKt$getContent$1(notificationData));
                        }
                        return renderMessageContent(notificationData, context, z);
                    }
                    if ((channelType != null && channelType.intValue() == 3) || (channelType != null && channelType.intValue() == 1)) {
                        z2 = true;
                    }
                    if (z2) {
                        Integer messageActivityType2 = notificationData.getMessageActivityType();
                        if (messageActivityType2 != null && messageActivityType2.intValue() == 1) {
                            return I18nUtilsKt.i18nFormat(context, I18nMessage.NOTIFICATION_MESSAGE_CREATE_DM_ACTIVITY_JOIN, new NotificationDataUtilsKt$getContent$2(notificationData));
                        }
                        return renderMessageContent(notificationData, context, z);
                    }
                    return "";
                }
                return "";
            case 1770025841:
                return !type.equals(NotificationData.TYPE_CALL_RING) ? "" : I18nUtilsKt.i18nFormat(context, I18nMessage.OVERLAY_FRIEND_CALLING, new NotificationDataUtilsKt$getContent$4(notificationData));
            default:
                return "";
        }
    }

    public static final PendingIntent getContentPendingIntent(NotificationData notificationData, Context context, Map<String, String> notificationDataMap) {
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(notificationDataMap, "notificationDataMap");
        String tag = getTag(notificationData);
        return getPendingIntent(context, notificationDataMap, tag + "content");
    }

    public static final CharSequence getConversationTitle(NotificationData notificationData) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String userUsername;
        C9612q.m13917h(notificationData, "<this>");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
            return null;
        }
        Integer channelType = notificationData.getChannelType();
        boolean z5 = false;
        if ((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (channelType != null && channelType.intValue() == 5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || (channelType != null && channelType.intValue() == 10)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || (channelType != null && channelType.intValue() == 11)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || (channelType != null && channelType.intValue() == 12)) {
            z5 = true;
        }
        if (z5) {
            userUsername = notificationData.getGuildName() + " #" + notificationData.getChannelName();
        } else if (channelType == null || channelType.intValue() != 3) {
            return null;
        } else {
            String channelName = notificationData.getChannelName();
            if (channelName == null) {
                userUsername = notificationData.getUserUsername();
            } else {
                return channelName;
            }
        }
        return userUsername;
    }

    public static final PendingIntent getDeletePendingIntent(NotificationData notificationData, Context context) {
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        return NotificationAction.DefaultImpls.toPendingIntent$default(new DeleteAction(getTag(notificationData)), context, 0, false, 6, null);
    }

    public static final NotificationCompat.Action getDirectReplyAction(NotificationData notificationData, Context context) {
        ChannelId m42013getChannelIdqMVnFVQ;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || !notificationData.getCanReply() || (m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        return new NotificationCompat.Action.C0699a(C3351R.C3352drawable.ic_send_white_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_REPLY, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new DirectReplyAction(getTag(notificationData), m42013getChannelIdqMVnFVQ.m42056unboximpl(), notificationData.getChannelName(), notificationData.getChannelType(), notificationData.getGuildName(), null), context, PendingIntentUtils.mutablePendingIntentFlag$default(PendingIntentUtils.INSTANCE, 0, 1, null), false, 4, null)).m39037a(DirectReplyAction.Companion.toRemoteInput(I18nUtilsKt.i18nFormat$default(context, I18nMessage.SEND_MESSAGE, null, 2, null).toString())).m39033e(true).m39030h(1).m39029i(false).m39036b();
    }

    public static final String getGroupKey(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        String type = notificationData.getType();
        return "GROUP_" + type;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0092 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getIconUrl(com.discord.notifications.api.NotificationData r12, android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getIconUrl(com.discord.notifications.api.NotificationData, android.content.Context):java.lang.String");
    }

    public static final String getIconUrlForAvatar(NotificationData notificationData, Context context) {
        boolean z;
        String m41945getForUser_fRzTXg;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        IconUrlUtils iconUrlUtils = IconUrlUtils.INSTANCE;
        String m41939getForGuildMember2tNb6hE$default = IconUrlUtils.m41939getForGuildMember2tNb6hE$default(iconUrlUtils, notificationData.getUserGuildAvatar(), notificationData.m42014getGuildIdqOKuAAo(), notificationData.m42018getUserIdwUX8bhU(), null, false, 24, null);
        if (m41939getForGuildMember2tNb6hE$default.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m41945getForUser_fRzTXg = iconUrlUtils.m41945getForUser_fRzTXg(context, notificationData.m42018getUserIdwUX8bhU(), notificationData.getUserAvatar(), (r16 & 8) != 0 ? null : notificationData.getUserDiscriminator(), (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? null : null);
            return m41945getForUser_fRzTXg;
        }
        return m41939getForGuildMember2tNb6hE$default;
    }

    public static final KvMessageEntry getKvMessage(NotificationData notificationData, String str) {
        List m14104i;
        List m14109d;
        List m14104i2;
        List m14109d2;
        List m14036n0;
        C9612q.m13917h(notificationData, "<this>");
        String m42015getMessageIdN_6c4I0 = notificationData.m42015getMessageIdN_6c4I0();
        ChannelId m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ();
        if (m42015getMessageIdN_6c4I0 != null && m42013getChannelIdqMVnFVQ != null && C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE)) {
            NotificationMessage message = notificationData.getMessage();
            if (str != null && message != null) {
                JsonElement m12778g = Json.f25830d.m12778g(str);
                m14104i2 = C9545j.m14104i();
                JsonObject author = message.getAuthor();
                C9612q.m13920e(author);
                m14109d2 = C9544i.m14109d(author);
                m14036n0 = C9553r.m14036n0(m14109d2, message.getMentions());
                return new KvMessageEntry(m14104i2, m14036n0, C9964g.m12727m(m12778g), m42015getMessageIdN_6c4I0, m42013getChannelIdqMVnFVQ.m42056unboximpl(), null);
            }
            try {
                JsonObject author2 = getAuthor(notificationData);
                JsonObject notificationMessage = toNotificationMessage(notificationData, author2);
                m14104i = C9545j.m14104i();
                m14109d = C9544i.m14109d(author2);
                return new KvMessageEntry(m14104i, m14109d, notificationMessage, m42015getMessageIdN_6c4I0, m42013getChannelIdqMVnFVQ.m42056unboximpl(), null);
            } catch (Exception e) {
                CrashReporting.INSTANCE.captureException(e);
            }
        }
        return null;
    }

    public static final NotificationCompat.Action getMarkAsReadAction(NotificationData notificationData, Context context) {
        ChannelId m42013getChannelIdqMVnFVQ;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || (m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        long m42056unboximpl = m42013getChannelIdqMVnFVQ.m42056unboximpl();
        String m42015getMessageIdN_6c4I0 = notificationData.m42015getMessageIdN_6c4I0();
        if (m42015getMessageIdN_6c4I0 == null) {
            return null;
        }
        return new NotificationCompat.Action.C0699a(C3351R.C3352drawable.ic_check_grey_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.MARK_AS_READ, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new MarkAsReadAction(getTag(notificationData), m42056unboximpl, m42015getMessageIdN_6c4I0, null), context, 0, false, 6, null)).m39030h(2).m39029i(false).m39036b();
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0062 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getNotificationCategory(com.discord.notifications.api.NotificationData r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r1, r0)
            java.lang.String r1 = r1.getType()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1502317553: goto L56;
                case -1489275252: goto L4d;
                case -1327124998: goto L44;
                case -1263316859: goto L3b;
                case -1237752112: goto L2f;
                case -437641071: goto L26;
                case 974015250: goto L1d;
                case 1770025841: goto L11;
                default: goto L10;
            }
        L10:
            goto L62
        L11:
            java.lang.String r0 = "CALL_RING"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1a
            goto L62
        L1a:
            java.lang.String r1 = "call"
            goto L64
        L1d:
            java.lang.String r0 = "ACTIVITY_START"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L26:
            java.lang.String r0 = "FORUM_THREAD_CREATED"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L2f:
            java.lang.String r0 = "APPLICATION_LIBRARY_INSTALL_COMPLETE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L38
            goto L62
        L38:
            java.lang.String r1 = "progress"
            goto L64
        L3b:
            java.lang.String r0 = "STAGE_INSTANCE_CREATE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L44:
            java.lang.String r0 = "RELATIONSHIP_ADD"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L4d:
            java.lang.String r0 = "GUILD_SCHEDULED_EVENT_UPDATE"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L56:
            java.lang.String r0 = "GENERIC_PUSH_NOTIFICATION_SENT"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L5f
            goto L62
        L5f:
            java.lang.String r1 = "social"
            goto L64
        L62:
            java.lang.String r1 = "msg"
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getNotificationCategory(com.discord.notifications.api.NotificationData):java.lang.String");
    }

    private static final PendingIntent getPendingIntent(Context context, Map<String, String> map, String str) {
        return NotificationAction.DefaultImpls.toPendingIntent$default(new ContentAction(str, map), context, 0, true, 2, null);
    }

    public static final long getSendTime(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        return System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002a, code lost:
        if (r2.intValue() == 1) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.core.app.Person getSender(com.discord.notifications.api.NotificationData r2, android.graphics.Bitmap r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            androidx.core.app.Person$c r0 = new androidx.core.app.Person$c
            r0.<init>()
            java.lang.String r1 = r2.getUserUsername()
            androidx.core.app.Person$c r0 = r0.m38727f(r1)
            com.discord.primitives.UserId r1 = r2.m42018getUserIdwUX8bhU()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            androidx.core.app.Person$c r0 = r0.m38728e(r1)
            java.lang.Integer r2 = r2.getRelationshipType()
            if (r2 != 0) goto L25
            goto L2d
        L25:
            int r2 = r2.intValue()
            r1 = 1
            if (r2 != r1) goto L2d
            goto L2e
        L2d:
            r1 = 0
        L2e:
            androidx.core.app.Person$c r2 = r0.m38729d(r1)
            if (r3 == 0) goto L39
            androidx.core.graphics.drawable.IconCompat r3 = toIconCompat(r3)
            goto L3a
        L39:
            r3 = 0
        L3a:
            androidx.core.app.Person$c r2 = r2.m38730c(r3)
            androidx.core.app.Person r2 = r2.m38732a()
            java.lang.String r3 = "Builder()\n        .setNa…ompat())\n        .build()"
            kotlin.jvm.internal.C9612q.m13918g(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getSender(com.discord.notifications.api.NotificationData, android.graphics.Bitmap):androidx.core.app.Person");
    }

    public static final Person getSenderForMessageNotification(NotificationData notificationData, Bitmap bitmap) {
        C9612q.m13917h(notificationData, "<this>");
        if (notificationData.isFromCurrentUser()) {
            return null;
        }
        return getSender(notificationData, bitmap);
    }

    public static final ShortcutInfoCompat getShortcutInfo(NotificationData notificationData, Context context, Map<String, String> notificationDataMap, Bitmap bitmap, Bitmap bitmap2) {
        List m14109d;
        ShortcutInfoCompat createShortcut;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(notificationDataMap, "notificationDataMap");
        String valueOf = String.valueOf(notificationData.m42013getChannelIdqMVnFVQ());
        CharSequence title = getTitle(notificationData, context);
        CharSequence title2 = getTitle(notificationData, context);
        Intent createShortcutIntent = ShortcutData.Companion.createShortcutIntent(context, "android.intent.action.VIEW", NotificationAction.Companion.getActivityClass(), getTag(notificationData), notificationDataMap);
        m14109d = C9544i.m14109d(getSender(notificationData, bitmap2));
        createShortcut = ShortcutUtilsKt.createShortcut(context, valueOf, title, title2, bitmap, m14109d, createShortcutIntent, (r17 & 64) != 0 ? 0 : 0);
        return createShortcut;
    }

    public static final int getSmallIcon(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        String type = notificationData.getType();
        int hashCode = type.hashCode();
        if (hashCode != -1327124998) {
            if (hashCode != 998188116) {
                if (hashCode == 1770025841 && type.equals(NotificationData.TYPE_CALL_RING)) {
                    return C3351R.C3352drawable.ic_notification_call_24dp;
                }
            } else if (type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                return C3351R.C3352drawable.ic_notification_message_24dp;
            }
        } else if (type.equals(NotificationData.TYPE_RELATIONSHIP_ADD)) {
            return C3351R.C3352drawable.ic_notification_friends_24dp;
        }
        return C3351R.C3352drawable.ic_notification_24dp;
    }

    public static final Uri getSound(NotificationData notificationData, Context context) {
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_CALL_RING)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("android.resource://");
            String packageName = context.getPackageName();
            int i = C3351R.raw.call_ringing;
            sb2.append(packageName + "/" + i);
            return Uri.parse(sb2.toString());
        }
        return null;
    }

    /* renamed from: getSystemMessageUserJoin-_NT-lnE */
    private static final CharSequence m42033getSystemMessageUserJoin_NTlnE(Context context, UserId userId, String str) {
        List m14101l;
        long j;
        m14101l = C9545j.m14101l(I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_001, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_002, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_003, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_004, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_005, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_006, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_007, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_008, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_009, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_010, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_011, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_012, I18nMessage.SYSTEM_MESSAGE_GUILD_MEMBER_JOIN_013);
        if (userId != null) {
            j = userId.m42120unboximpl();
        } else {
            j = 0;
        }
        return I18nUtilsKt.i18nFormat(context, (I18nMessage) m14101l.get((int) (j % m14101l.size())), new NotificationDataUtilsKt$getSystemMessageUserJoin$1$1(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0018, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_CALL_RING) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0022, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_MESSAGE_CREATE) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0054, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_FORUM_THREAD_CREATED) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007d, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_STAGE_INSTANCE_CREATE) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00a6, code lost:
        if (r0.equals(com.discord.notifications.api.NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE) != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a8, code lost:
        r0 = r3.getType();
        r3 = r3.m42013getChannelIdqMVnFVQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
        return r0 + r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getTag(com.discord.notifications.api.NotificationData r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9612q.m13917h(r3, r0)
            java.lang.String r0 = r3.getType()
            int r1 = r0.hashCode()
            switch(r1) {
                case -1502317553: goto Lc0;
                case -1489275252: goto La0;
                case -1327124998: goto L80;
                case -1263316859: goto L77;
                case -1237752112: goto L57;
                case -437641071: goto L4e;
                case 974015250: goto L26;
                case 998188116: goto L1c;
                case 1770025841: goto L12;
                default: goto L10;
            }
        L10:
            goto Le0
        L12:
            java.lang.String r1 = "CALL_RING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            goto La8
        L1c:
            java.lang.String r1 = "MESSAGE_CREATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            goto La8
        L26:
            java.lang.String r1 = "ACTIVITY_START"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            java.lang.String r0 = r3.getType()
            java.lang.Integer r1 = r3.getActivityType()
            java.lang.String r3 = r3.getActivityName()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            goto Ldf
        L4e:
            java.lang.String r1 = "FORUM_THREAD_CREATED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            goto La8
        L57:
            java.lang.String r1 = "APPLICATION_LIBRARY_INSTALL_COMPLETE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            java.lang.String r0 = r3.getType()
            com.discord.primitives.ApplicationId r3 = r3.m42012getApplicationIdUtIrSio()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto Ldf
        L77:
            java.lang.String r1 = "STAGE_INSTANCE_CREATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            goto La8
        L80:
            java.lang.String r1 = "RELATIONSHIP_ADD"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            java.lang.String r0 = r3.getType()
            com.discord.primitives.UserId r3 = r3.m42018getUserIdwUX8bhU()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto Ldf
        La0:
            java.lang.String r1 = "GUILD_SCHEDULED_EVENT_UPDATE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
        La8:
            java.lang.String r0 = r3.getType()
            com.discord.primitives.ChannelId r3 = r3.m42013getChannelIdqMVnFVQ()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            goto Ldf
        Lc0:
            java.lang.String r1 = "GENERIC_PUSH_NOTIFICATION_SENT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le0
            java.lang.String r0 = r3.getType()
            java.lang.String r3 = r3.getDeeplink()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
        Ldf:
            return r3
        Le0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.getType()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown notification type: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.notifications.renderer.utils.NotificationDataUtilsKt.getTag(com.discord.notifications.api.NotificationData):java.lang.String");
    }

    public static final NotificationCompat.Action getTimedMuteAction(NotificationData notificationData, Context context, int i) {
        ChannelId m42013getChannelIdqMVnFVQ;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        if (!C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) || i < 2 || (m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ()) == null) {
            return null;
        }
        return new NotificationCompat.Action.C0699a(C3351R.C3352drawable.ic_notifications_off_24dp, I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_MUTE_1_HOUR, null, 2, null), NotificationAction.DefaultImpls.toPendingIntent$default(new MuteAction(getTag(notificationData), notificationData.m42014getGuildIdqOKuAAo(), m42013getChannelIdqMVnFVQ.m42056unboximpl(), null), context, 0, false, 6, null)).m39036b();
    }

    public static final CharSequence getTitle(NotificationData notificationData, Context context) {
        String title;
        Integer guildScheduledEventEntityType;
        Integer activityType;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        String type = notificationData.getType();
        switch (type.hashCode()) {
            case -1502317553:
                if (!type.equals(NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) || (title = notificationData.getTitle()) == null) {
                    return "";
                }
                break;
            case -1489275252:
                if (!type.equals(NotificationData.TYPE_GUILD_SCHEDULED_EVENT_UPDATE) || (guildScheduledEventEntityType = notificationData.getGuildScheduledEventEntityType()) == null || guildScheduledEventEntityType.intValue() != 1) {
                    return "";
                }
                return I18nUtilsKt.i18nFormat(context, I18nMessage.GUILD_SCHEDULED_EVENT_STAGE_START_TITLE, new NotificationDataUtilsKt$getTitle$3(notificationData));
            case -1327124998:
                if (!type.equals(NotificationData.TYPE_RELATIONSHIP_ADD) || (title = notificationData.getUserUsername()) == null) {
                    return "";
                }
                break;
            case -1263316859:
                if (!type.equals(NotificationData.TYPE_STAGE_INSTANCE_CREATE)) {
                    return "";
                }
                return I18nUtilsKt.i18nFormat(context, I18nMessage.STAGE_START_PUSH_NOTIFICATION_TITLE, new NotificationDataUtilsKt$getTitle$1(notificationData));
            case -1237752112:
                if (!type.equals(NotificationData.TYPE_APPLICATION_LIBRARY_INSTALL_COMPLETE)) {
                    return "";
                }
                return I18nUtilsKt.i18nFormat$default(context, I18nMessage.GAME_LIBRARY_NOTIFICATION_GAME_INSTALLED_TITLE, null, 2, null);
            case -437641071:
                if (!type.equals(NotificationData.TYPE_FORUM_THREAD_CREATED)) {
                    return "";
                }
                return I18nUtilsKt.i18nFormat(context, I18nMessage.FORUM_CHANNEL_THREAD_CREATED_PUSH_TITLE_MOBILE, new NotificationDataUtilsKt$getTitle$2(notificationData));
            case 974015250:
                if (!type.equals(NotificationData.TYPE_ACTIVITY_START) || (activityType = notificationData.getActivityType()) == null || activityType.intValue() != 0) {
                    return "";
                }
                return I18nUtilsKt.i18nFormat$default(context, I18nMessage.NOTIFICATION_TITLE_START_GAME, null, 2, null);
            case 998188116:
                if (!type.equals(NotificationData.TYPE_MESSAGE_CREATE)) {
                    return "";
                }
                Integer channelType = notificationData.getChannelType();
                boolean z5 = false;
                if ((channelType != null && channelType.intValue() == 0) || (channelType != null && channelType.intValue() == 2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (channelType != null && channelType.intValue() == 5)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || (channelType != null && channelType.intValue() == 10)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || (channelType != null && channelType.intValue() == 11)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4 || (channelType != null && channelType.intValue() == 12)) {
                    z5 = true;
                }
                if (z5) {
                    title = notificationData.getGuildName() + " #" + notificationData.getChannelName();
                    break;
                } else if (channelType != null && channelType.intValue() == 1) {
                    title = notificationData.getUserUsername();
                    if (title == null) {
                        return "";
                    }
                } else if (channelType == null || channelType.intValue() != 3) {
                    return "";
                } else {
                    String channelName = notificationData.getChannelName();
                    if (channelName == null) {
                        title = notificationData.getUserUsername();
                        if (title == null) {
                            return "";
                        }
                    } else {
                        return channelName;
                    }
                }
                break;
            case 1770025841:
                if (!type.equals(NotificationData.TYPE_CALL_RING)) {
                    return "";
                }
                Integer channelType2 = notificationData.getChannelType();
                if (channelType2 != null && channelType2.intValue() == 1) {
                    return I18nUtilsKt.i18nFormat$default(context, I18nMessage.INCOMING_CALL, null, 2, null);
                }
                title = notificationData.getChannelName();
                if (title == null) {
                    return "";
                }
                break;
            default:
                return "";
        }
        return title;
    }

    public static final boolean isConversation(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        return C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE);
    }

    public static final boolean isGroupConversation(NotificationData notificationData) {
        Integer channelType;
        C9612q.m13917h(notificationData, "<this>");
        if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_MESSAGE_CREATE) && ((channelType = notificationData.getChannelType()) == null || channelType.intValue() != 1)) {
            return true;
        }
        return false;
    }

    private static final CharSequence renderLogAwareNotificationMessageContent(boolean z, String str) {
        boolean z2;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return str;
        }
        if (z) {
            return "<Message>";
        }
        return RenderNotificationMessageContentKt.renderNotificationMessageContent(str);
    }

    public static final CharSequence renderMessageContent(NotificationData notificationData, Context context, boolean z) {
        Sticker sticker;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(context, "context");
        NotificationMessage message = notificationData.getMessage();
        if (message != null) {
            sticker = message.getSticker();
        } else {
            sticker = null;
        }
        if (sticker != null) {
            return I18nUtilsKt.i18nFormat(context, I18nMessage.STICKER_NOTIFICATION_BODY, new NotificationDataUtilsKt$renderMessageContent$1(sticker));
        }
        if (MessageFlagKt.hasMessageFlag(notificationData.getMessageFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
            return I18nUtilsKt.i18nFormat$default(context, I18nMessage.VOICE_MESSAGES_SENT_NOTIFICATION, null, 2, null);
        }
        return renderLogAwareNotificationMessageContent(z, notificationData.getMessageContent());
    }

    public static final boolean shouldUseBigText(NotificationData notificationData) {
        C9612q.m13917h(notificationData, "<this>");
        if (C9612q.m13922c(notificationData.getType(), NotificationData.TYPE_GENERIC_PUSH_NOTIFICATION_SENT) && C9612q.m13922c(notificationData.getExpandSubtitle(), Boolean.TRUE)) {
            return true;
        }
        return false;
    }

    private static final IconCompat toIconCompat(Bitmap bitmap) {
        IconCompat m38129i = IconCompat.m38129i(bitmap);
        C9612q.m13918g(m38129i, "createWithBitmap(this)");
        return m38129i;
    }

    public static final JsonObject toNotificationMessage(NotificationData notificationData, JsonObject author) {
        long j;
        C9612q.m13917h(notificationData, "<this>");
        C9612q.m13917h(author, "author");
        String messageContent = notificationData.getMessageContent();
        C9612q.m13920e(messageContent);
        Long messageFlags = notificationData.getMessageFlags();
        if (messageFlags != null) {
            j = messageFlags.longValue();
        } else {
            j = 0;
        }
        Integer messageType = notificationData.getMessageType();
        C9612q.m13920e(messageType);
        int intValue = messageType.intValue();
        String m42015getMessageIdN_6c4I0 = notificationData.m42015getMessageIdN_6c4I0();
        C9612q.m13920e(m42015getMessageIdN_6c4I0);
        ChannelId m42013getChannelIdqMVnFVQ = notificationData.m42013getChannelIdqMVnFVQ();
        C9612q.m13920e(m42013getChannelIdqMVnFVQ);
        long m42056unboximpl = m42013getChannelIdqMVnFVQ.m42056unboximpl();
        GuildId m42014getGuildIdqOKuAAo = notificationData.m42014getGuildIdqOKuAAo();
        String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSS", Locale.getDefault()).format(new Date());
        C9983s c9983s = new C9983s();
        C9963f.m12740c(c9983s, "content", messageContent);
        C9963f.m12741b(c9983s, "flags", Long.valueOf(j));
        C9963f.m12741b(c9983s, "type", Integer.valueOf(intValue));
        C9963f.m12740c(c9983s, "id", MessageId.m42079toStringimpl(m42015getMessageIdN_6c4I0));
        C9963f.m12740c(c9983s, "channel_id", ChannelId.m42054toStringimpl(m42056unboximpl));
        C9963f.m12740c(c9983s, "timestamp", format);
        c9983s.m12692b("author", author);
        if (m42014getGuildIdqOKuAAo != null) {
            C9963f.m12740c(c9983s, "guild_id", GuildId.m42067toStringimpl(m42014getGuildIdqOKuAAo.m42069unboximpl()));
        }
        return c9983s.m12693a();
    }
}