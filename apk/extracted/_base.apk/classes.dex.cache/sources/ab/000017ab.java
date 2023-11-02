package com.discord.foreground_service.service;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.discord.foreground_service.C3187R;
import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.discord.foreground_service.utils.ForegroundServiceUtilsKt;
import com.discord.notifications.actions.intents.GenericAction;
import com.discord.notifications.actions.intents.NotificationAction;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\n\u0010\u0013\u001a\u00020\u0014*\u00020\u000bJ \u0010\u0015\u001a\u00020\u0014*\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/foreground_service/service/ServiceNotification;", "", "()V", "FOREGROUND_NOTIFICATION_CHANNEL", "", "FOREGROUND_NOTIFICATION_ID", "", "FOREGROUND_NOTIFICATION_LIMIT", ServiceNotification.FOREGROUND_NOTIFICATION_TAG, "notificationManagerCompat", "Landroidx/core/app/NotificationManagerCompat;", "Landroid/content/Context;", "getNotificationManagerCompat", "(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;", "buildNotification", "Landroid/app/Notification;", "context", "serviceNotificationConfiguration", "Lcom/discord/foreground_service/service/ServiceNotificationConfiguration;", "clearNotifications", "", "startForegroundCompat", "Landroid/app/Service;", "serviceNotificationConfigurations", "", "foreground_service_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class ServiceNotification {
    private static final String FOREGROUND_NOTIFICATION_CHANNEL = "mediaConnections";
    private static final int FOREGROUND_NOTIFICATION_ID = 8761;
    private static final int FOREGROUND_NOTIFICATION_LIMIT = 5;
    private static final String FOREGROUND_NOTIFICATION_TAG = "FOREGROUND_NOTIFICATION_TAG";
    public static final ServiceNotification INSTANCE = new ServiceNotification();

    private ServiceNotification() {
    }

    private final Notification buildNotification(Context context, ServiceNotificationConfiguration serviceNotificationConfiguration) {
        PendingIntent pendingIntent;
        NotificationCompat.Builder m39019D = new NotificationCompat.Builder(context, FOREGROUND_NOTIFICATION_CHANNEL).m39018E(serviceNotificationConfiguration.getTitle()).m39019D(serviceNotificationConfiguration.getContent());
        ServiceNotificationConfiguration.Action contentAction = serviceNotificationConfiguration.getContentAction();
        if (contentAction != null) {
            pendingIntent = NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(contentAction.getTag(), contentAction.getTaskName(), contentAction.getData()), context, 0, true, 2, null);
        } else {
            pendingIntent = null;
        }
        NotificationCompat.Builder m38998Y = m39019D.m39020C(pendingIntent).m38997Z(C3187R.C3188drawable.ic_notification_24dp).m39006Q(true).m38998Y(true);
        for (ServiceNotificationConfiguration.Action action : serviceNotificationConfiguration.getAuxiliaryActions()) {
            m38998Y.m38996a(0, action.getTitle(), NotificationAction.DefaultImpls.toPendingIntent$default(new GenericAction(action.getTag(), action.getTaskName(), action.getData()), context, 0, false, 2, null));
        }
        Notification m38984g = m38998Y.m38984g();
        C9612q.m13918g(m38984g, "Builder(context, FOREGRO…   }\n            .build()");
        return m38984g;
    }

    private final NotificationManagerCompat getNotificationManagerCompat(Context context) {
        NotificationManagerCompat m38785g = NotificationManagerCompat.m38785g(context);
        C9612q.m13918g(m38785g, "from(this)");
        return m38785g;
    }

    public final void clearNotifications(Context context) {
        C9612q.m13917h(context, "<this>");
        Iterator<Integer> it = new IntRange(0, 5).iterator();
        while (it.hasNext()) {
            INSTANCE.getNotificationManagerCompat(context).m38790b(FOREGROUND_NOTIFICATION_TAG, ((AbstractC11883p) it).nextInt());
        }
    }

    public final void startForegroundCompat(Service service, Context context, List<ServiceNotificationConfiguration> serviceNotificationConfigurations) {
        List m14028v0;
        Object m14056T;
        List m14062N;
        Object m14053W;
        C9612q.m13917h(service, "<this>");
        C9612q.m13917h(context, "context");
        C9612q.m13917h(serviceNotificationConfigurations, "serviceNotificationConfigurations");
        m14028v0 = C9553r.m14028v0(serviceNotificationConfigurations, new Comparator() { // from class: com.discord.foreground_service.service.ServiceNotification$startForegroundCompat$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m5209d;
                m5209d = C12466c.m5209d(((ServiceNotificationConfiguration) t).getPriority(), ((ServiceNotificationConfiguration) t2).getPriority());
                return m5209d;
            }
        });
        m14056T = C9553r.m14056T(m14028v0);
        m14062N = C9553r.m14062N(m14028v0, 1);
        ForegroundServiceUtilsKt.startForegroundCompat(service, FOREGROUND_NOTIFICATION_ID, buildNotification(context, (ServiceNotificationConfiguration) m14056T));
        Iterator<Integer> it = new IntRange(0, 5).iterator();
        while (it.hasNext()) {
            int nextInt = ((AbstractC11883p) it).nextInt();
            m14053W = C9553r.m14053W(m14062N, nextInt);
            ServiceNotificationConfiguration serviceNotificationConfiguration = (ServiceNotificationConfiguration) m14053W;
            if (serviceNotificationConfiguration != null) {
                ServiceNotification serviceNotification = INSTANCE;
                serviceNotification.getNotificationManagerCompat(service).m38777o(FOREGROUND_NOTIFICATION_TAG, nextInt, serviceNotification.buildNotification(context, serviceNotificationConfiguration));
            } else {
                INSTANCE.getNotificationManagerCompat(service).m38790b(FOREGROUND_NOTIFICATION_TAG, nextInt);
            }
        }
    }
}