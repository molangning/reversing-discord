package com.discord.notifications.renderer.utils;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.discord.notifications.renderer.C3351R;
import com.discord.notifications.renderer.NotificationBehaviors;
import com.discord.theme.utils.ColorUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000L\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0001*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0014\u001a\u00020\u0015*\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u001c\u0010\u0018\u001a\u00020\u0019*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0015H\u0000\u001a(\u0010\u001b\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0018\u0010\f\u001a\u00020\r*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, m14357d2 = {"NOTIFICATION_LIGHT_PERIOD", "", "messagingStyle", "Landroidx/core/app/NotificationCompat$MessagingStyle;", "Landroid/app/Notification;", "getMessagingStyle", "(Landroid/app/Notification;)Landroidx/core/app/NotificationCompat$MessagingStyle;", "notificationManager", "Landroid/app/NotificationManager;", "Landroid/content/Context;", "getNotificationManager", "(Landroid/content/Context;)Landroid/app/NotificationManager;", "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "getActiveNotification", "tag", "", "getActiveNotificationMessageCount", "getNotificationBuilderOrCreate", "Landroidx/core/app/NotificationCompat$Builder;", "notificationChannelId", "notificationExisting", "notify", "", "notificationBuilder", "setLegacyNotificationBehaviors", "context", "behaviors", "Lcom/discord/notifications/renderer/NotificationBehaviors;", "sound", "Landroid/net/Uri;", "notification_renderer_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NotificationManagerUtilsKt {
    private static final int NOTIFICATION_LIGHT_PERIOD = 1500;

    public static final Notification getActiveNotification(Context context, String tag) {
        Object m7596b;
        StatusBarNotification statusBarNotification;
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(tag, "tag");
        NotificationManager notificationManager = getNotificationManager(context);
        if (notificationManager == null) {
            return null;
        }
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(notificationManager.getActiveNotifications());
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7591g(m7596b)) {
            m7596b = null;
        }
        StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) m7596b;
        if (statusBarNotificationArr == null) {
            return null;
        }
        int length = statusBarNotificationArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                statusBarNotification = statusBarNotificationArr[i];
                if (C9612q.m13922c(statusBarNotification.getTag(), tag)) {
                    break;
                }
                i++;
            } else {
                statusBarNotification = null;
                break;
            }
        }
        if (statusBarNotification == null) {
            return null;
        }
        return statusBarNotification.getNotification();
    }

    public static final int getActiveNotificationMessageCount(Context context, String tag) {
        NotificationCompat.MessagingStyle messagingStyle;
        List<NotificationCompat.MessagingStyle.C0712e> m38951B;
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(tag, "tag");
        Notification activeNotification = getActiveNotification(context, tag);
        if (activeNotification != null && (messagingStyle = getMessagingStyle(activeNotification)) != null && (m38951B = messagingStyle.m38951B()) != null) {
            return m38951B.size();
        }
        return 0;
    }

    public static final NotificationCompat.MessagingStyle getMessagingStyle(Notification notification) {
        C9612q.m13917h(notification, "<this>");
        return NotificationCompat.MessagingStyle.m38942z(notification);
    }

    public static final NotificationCompat.Builder getNotificationBuilderOrCreate(Context context, String notificationChannelId, Notification notification) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(notificationChannelId, "notificationChannelId");
        if (notification != null) {
            return new NotificationCompat.Builder(context, notification);
        }
        return new NotificationCompat.Builder(context, notificationChannelId);
    }

    public static final NotificationManager getNotificationManager(Context context) {
        C9612q.m13917h(context, "<this>");
        return (NotificationManager) context.getSystemService("notification");
    }

    public static final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        C9612q.m13917h(context, "<this>");
        NotificationManagerCompat m38785g = NotificationManagerCompat.m38785g(context);
        C9612q.m13918g(m38785g, "from(this)");
        return m38785g;
    }

    public static final void notify(NotificationManagerCompat notificationManagerCompat, String tag, NotificationCompat.Builder notificationBuilder) {
        C9612q.m13917h(notificationManagerCompat, "<this>");
        C9612q.m13917h(tag, "tag");
        C9612q.m13917h(notificationBuilder, "notificationBuilder");
        notificationManagerCompat.m38777o(tag, 0, notificationBuilder.m38984g());
    }

    public static final NotificationCompat.Builder setLegacyNotificationBehaviors(NotificationCompat.Builder builder, Context context, NotificationBehaviors notificationBehaviors, Uri uri) {
        C9612q.m13917h(builder, "<this>");
        C9612q.m13917h(context, "context");
        if (notificationBehaviors == null) {
            return builder;
        }
        boolean soundsEnabled = notificationBehaviors.getSoundsEnabled();
        int i = soundsEnabled;
        if (notificationBehaviors.getVibrationsEnabled()) {
            i = (soundsEnabled ? 1 : 0) | 2;
        }
        if (notificationBehaviors.getLightsEnabled()) {
            builder.m39010M(ColorUtilsKt.getColorCompat(context, C3351R.color.brand_500), NOTIFICATION_LIGHT_PERIOD, NOTIFICATION_LIGHT_PERIOD);
        }
        if (notificationBehaviors.getSoundsEnabled() && uri != null) {
            NotificationCompat.Builder m39017F = builder.m38991c0(uri).m39017F(i & (-2));
            C9612q.m13918g(m39017F, "{\n        // remove the …EFAULT_SOUND.inv())\n    }");
            return m39017F;
        }
        NotificationCompat.Builder m39017F2 = builder.m39017F(i);
        C9612q.m13918g(m39017F2, "{\n        setDefaults(defaults)\n    }");
        return m39017F2;
    }
}