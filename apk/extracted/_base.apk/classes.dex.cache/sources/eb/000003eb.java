package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import androidx.core.util.C1138f;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.core.app.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0895t0 {

    /* renamed from: a */
    final String f3229a;

    /* renamed from: b */
    CharSequence f3230b;

    /* renamed from: c */
    String f3231c;

    /* renamed from: d */
    private List<NotificationChannelCompat> f3232d = Collections.emptyList();

    /* renamed from: androidx.core.app.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0896a {
        /* renamed from: a */
        static NotificationChannelGroup m38503a(String str, CharSequence charSequence) {
            return new NotificationChannelGroup(str, charSequence);
        }

        /* renamed from: b */
        static List<NotificationChannel> m38502b(NotificationChannelGroup notificationChannelGroup) {
            List<NotificationChannel> channels;
            channels = notificationChannelGroup.getChannels();
            return channels;
        }

        /* renamed from: c */
        static String m38501c(NotificationChannel notificationChannel) {
            String group;
            group = notificationChannel.getGroup();
            return group;
        }

        /* renamed from: d */
        static String m38500d(NotificationChannelGroup notificationChannelGroup) {
            String id2;
            id2 = notificationChannelGroup.getId();
            return id2;
        }

        /* renamed from: e */
        static CharSequence m38499e(NotificationChannelGroup notificationChannelGroup) {
            CharSequence name;
            name = notificationChannelGroup.getName();
            return name;
        }
    }

    /* renamed from: androidx.core.app.t0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0897b {
        /* renamed from: a */
        static String m38498a(NotificationChannelGroup notificationChannelGroup) {
            String description;
            description = notificationChannelGroup.getDescription();
            return description;
        }

        /* renamed from: b */
        static boolean m38497b(NotificationChannelGroup notificationChannelGroup) {
            boolean isBlocked;
            isBlocked = notificationChannelGroup.isBlocked();
            return isBlocked;
        }

        /* renamed from: c */
        static void m38496c(NotificationChannelGroup notificationChannelGroup, String str) {
            notificationChannelGroup.setDescription(str);
        }
    }

    /* renamed from: androidx.core.app.t0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0898c {

        /* renamed from: a */
        final C0895t0 f3233a;

        public C0898c(String str) {
            this.f3233a = new C0895t0(str);
        }

        /* renamed from: a */
        public C0895t0 m38495a() {
            return this.f3233a;
        }

        /* renamed from: b */
        public C0898c m38494b(String str) {
            this.f3233a.f3231c = str;
            return this;
        }

        /* renamed from: c */
        public C0898c m38493c(CharSequence charSequence) {
            this.f3233a.f3230b = charSequence;
            return this;
        }
    }

    C0895t0(String str) {
        this.f3229a = (String) C1138f.m37824f(str);
    }

    /* renamed from: a */
    public String m38506a() {
        return this.f3229a;
    }

    /* renamed from: b */
    public CharSequence m38505b() {
        return this.f3230b;
    }

    /* renamed from: c */
    public NotificationChannelGroup m38504c() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup m38503a = C0896a.m38503a(this.f3229a, this.f3230b);
        if (i >= 28) {
            C0897b.m38496c(m38503a, this.f3231c);
        }
        return m38503a;
    }
}