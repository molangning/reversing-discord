package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.C0946a;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.messaging.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5067b {

    /* renamed from: a */
    private static final AtomicInteger f14315a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* renamed from: com.google.firebase.messaging.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5068a {

        /* renamed from: a */
        public final NotificationCompat.Builder f14316a;

        /* renamed from: b */
        public final String f14317b;

        /* renamed from: c */
        public final int f14318c;

        C5068a(NotificationCompat.Builder builder, String str, int i) {
            this.f14316a = builder;
            this.f14317b = str;
            this.f14318c = i;
        }
    }

    /* renamed from: a */
    private static PendingIntent m26342a(Context context, C5083f0 c5083f0, String str, PackageManager packageManager) {
        Intent m26337f = m26337f(str, c5083f0, packageManager);
        if (m26337f == null) {
            return null;
        }
        m26337f.addFlags(67108864);
        m26337f.putExtras(c5083f0.m26248y());
        if (m26326q(c5083f0)) {
            m26337f.putExtra("gcm.n.analytics_data", c5083f0.m26249x());
        }
        return PendingIntent.getActivity(context, m26336g(), m26337f, m26331l(1073741824));
    }

    /* renamed from: b */
    private static PendingIntent m26341b(Context context, C5083f0 c5083f0) {
        if (!m26326q(c5083f0)) {
            return null;
        }
        return m26340c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(c5083f0.m26249x()));
    }

    /* renamed from: c */
    private static PendingIntent m26340c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, m26336g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), m26331l(1073741824));
    }

    /* renamed from: d */
    public static C5068a m26339d(Context context, C5083f0 c5083f0) {
        Bundle m26333j = m26333j(context.getPackageManager(), context.getPackageName());
        return m26338e(context, context.getPackageName(), c5083f0, m26332k(context, c5083f0.m26262k(), m26333j), context.getResources(), context.getPackageManager(), m26333j);
    }

    /* renamed from: e */
    public static C5068a m26338e(Context context, String str, C5083f0 c5083f0, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, str2);
        String m26259n = c5083f0.m26259n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(m26259n)) {
            builder.m39018E(m26259n);
        }
        String m26259n2 = c5083f0.m26259n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(m26259n2)) {
            builder.m39019D(m26259n2);
            builder.m38987e0(new NotificationCompat.C0723f().m38883x(m26259n2));
        }
        builder.m38997Z(m26330m(packageManager, resources, str, c5083f0.m26257p("gcm.n.icon"), bundle));
        Uri m26329n = m26329n(str, c5083f0, resources);
        if (m26329n != null) {
            builder.m38991c0(m26329n);
        }
        builder.m39020C(m26342a(context, c5083f0, str, packageManager));
        PendingIntent m26341b = m26341b(context, c5083f0);
        if (m26341b != null) {
            builder.m39016G(m26341b);
        }
        Integer m26335h = m26335h(context, c5083f0.m26257p("gcm.n.color"), bundle);
        if (m26335h != null) {
            builder.m38959z(m26335h.intValue());
        }
        builder.m38965t(!c5083f0.m26272a("gcm.n.sticky"));
        builder.m39009N(c5083f0.m26272a("gcm.n.local_only"));
        String m26257p = c5083f0.m26257p("gcm.n.ticker");
        if (m26257p != null) {
            builder.m38983g0(m26257p);
        }
        Integer m26260m = c5083f0.m26260m();
        if (m26260m != null) {
            builder.m39004S(m26260m.intValue());
        }
        Integer m26255r = c5083f0.m26255r();
        if (m26255r != null) {
            builder.m38975k0(m26255r.intValue());
        }
        Integer m26261l = c5083f0.m26261l();
        if (m26261l != null) {
            builder.m39007P(m26261l.intValue());
        }
        Long m26263j = c5083f0.m26263j("gcm.n.event_time");
        if (m26263j != null) {
            builder.m38999X(true);
            builder.m38973l0(m26263j.longValue());
        }
        long[] m26256q = c5083f0.m26256q();
        if (m26256q != null) {
            builder.m38977j0(m26256q);
        }
        int[] m26268e = c5083f0.m26268e();
        if (m26268e != null) {
            builder.m39010M(m26268e[0], m26268e[1], m26268e[2]);
        }
        builder.m39017F(m26334i(c5083f0));
        return new C5068a(builder, m26328o(c5083f0), 0);
    }

    /* renamed from: f */
    private static Intent m26337f(String str, C5083f0 c5083f0, PackageManager packageManager) {
        String m26257p = c5083f0.m26257p("gcm.n.click_action");
        if (!TextUtils.isEmpty(m26257p)) {
            Intent intent = new Intent(m26257p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri m26267f = c5083f0.m26267f();
        if (m26267f != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(m26267f);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    /* renamed from: g */
    private static int m26336g() {
        return f14315a.incrementAndGet();
    }

    /* renamed from: h */
    private static Integer m26335h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i != 0) {
            try {
                return Integer.valueOf(C0946a.m38401c(context, i));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* renamed from: i */
    private static int m26334i(C5083f0 c5083f0) {
        boolean m26272a = c5083f0.m26272a("gcm.n.default_sound");
        ?? r0 = m26272a;
        if (c5083f0.m26272a("gcm.n.default_vibrate_timings")) {
            r0 = (m26272a ? 1 : 0) | true;
        }
        if (c5083f0.m26272a("gcm.n.default_light_settings")) {
            return r0 | 4;
        }
        return r0;
    }

    /* renamed from: j */
    private static Bundle m26333j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    /* renamed from: k */
    public static String m26332k(Context context, String str, Bundle bundle) {
        NotificationChannel notificationChannel;
        String string;
        NotificationChannel notificationChannel2;
        NotificationChannel notificationChannel3;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                notificationChannel3 = notificationManager.getNotificationChannel(str);
                if (notificationChannel3 != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string2)) {
                notificationChannel2 = notificationManager.getNotificationChannel(string2);
                if (notificationChannel2 != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            notificationChannel = notificationManager.getNotificationChannel("fcm_fallback_notification_channel");
            if (notificationChannel == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: l */
    private static int m26331l(int i) {
        return i | 67108864;
    }

    /* renamed from: m */
    private static int m26330m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && m26327p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && m26327p(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0 || !m26327p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
            }
        }
        if (i == 0 || !m26327p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    /* renamed from: n */
    private static Uri m26329n(String str, C5083f0 c5083f0, Resources resources) {
        String m26258o = c5083f0.m26258o();
        if (TextUtils.isEmpty(m26258o)) {
            return null;
        }
        if (!"default".equals(m26258o) && resources.getIdentifier(m26258o, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + m26258o);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    /* renamed from: o */
    private static String m26328o(C5083f0 c5083f0) {
        String m26257p = c5083f0.m26257p("gcm.n.tag");
        if (!TextUtils.isEmpty(m26257p)) {
            return m26257p;
        }
        return "FCM-Notification:" + SystemClock.uptimeMillis();
    }

    @TargetApi(26)
    /* renamed from: p */
    private static boolean m26327p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }

    /* renamed from: q */
    static boolean m26326q(C5083f0 c5083f0) {
        return c5083f0.m26272a("google.c.a.e");
    }
}