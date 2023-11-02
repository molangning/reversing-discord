package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import androidx.core.util.C1138f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class NotificationChannelCompat {

    /* renamed from: a */
    final String f3005a;

    /* renamed from: b */
    CharSequence f3006b;

    /* renamed from: c */
    int f3007c;

    /* renamed from: d */
    String f3008d;

    /* renamed from: e */
    String f3009e;

    /* renamed from: f */
    boolean f3010f;

    /* renamed from: g */
    Uri f3011g;

    /* renamed from: h */
    AudioAttributes f3012h;

    /* renamed from: i */
    boolean f3013i;

    /* renamed from: j */
    int f3014j;

    /* renamed from: k */
    boolean f3015k;

    /* renamed from: l */
    long[] f3016l;

    /* renamed from: m */
    String f3017m;

    /* renamed from: n */
    String f3018n;

    /* renamed from: o */
    private boolean f3019o;

    /* renamed from: p */
    private int f3020p;

    /* renamed from: q */
    private boolean f3021q;

    /* renamed from: r */
    private boolean f3022r;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class Builder {

        /* renamed from: a */
        private final NotificationChannelCompat f3023a;

        public Builder(String str, int i) {
            this.f3023a = new NotificationChannelCompat(str, i);
        }

        /* renamed from: a */
        public NotificationChannelCompat m39113a() {
            return this.f3023a;
        }

        /* renamed from: b */
        public Builder m39112b(String str) {
            this.f3023a.f3008d = str;
            return this;
        }

        /* renamed from: c */
        public Builder m39111c(String str) {
            this.f3023a.f3009e = str;
            return this;
        }

        /* renamed from: d */
        public Builder m39110d(int i) {
            this.f3023a.f3014j = i;
            return this;
        }

        /* renamed from: e */
        public Builder m39109e(boolean z) {
            this.f3023a.f3013i = z;
            return this;
        }

        /* renamed from: f */
        public Builder m39108f(CharSequence charSequence) {
            this.f3023a.f3006b = charSequence;
            return this;
        }

        /* renamed from: g */
        public Builder m39107g(boolean z) {
            this.f3023a.f3010f = z;
            return this;
        }

        /* renamed from: h */
        public Builder m39106h(Uri uri, AudioAttributes audioAttributes) {
            NotificationChannelCompat notificationChannelCompat = this.f3023a;
            notificationChannelCompat.f3011g = uri;
            notificationChannelCompat.f3012h = audioAttributes;
            return this;
        }

        /* renamed from: i */
        public Builder m39105i(boolean z) {
            this.f3023a.f3015k = z;
            return this;
        }

        /* renamed from: j */
        public Builder m39104j(long[] jArr) {
            boolean z;
            NotificationChannelCompat notificationChannelCompat = this.f3023a;
            if (jArr != null && jArr.length > 0) {
                z = true;
            } else {
                z = false;
            }
            notificationChannelCompat.f3015k = z;
            notificationChannelCompat.f3016l = jArr;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationChannelCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0696a {
        /* renamed from: a */
        static boolean m39103a(NotificationChannel notificationChannel) {
            boolean canBypassDnd;
            canBypassDnd = notificationChannel.canBypassDnd();
            return canBypassDnd;
        }

        /* renamed from: b */
        static boolean m39102b(NotificationChannel notificationChannel) {
            boolean canShowBadge;
            canShowBadge = notificationChannel.canShowBadge();
            return canShowBadge;
        }

        /* renamed from: c */
        static NotificationChannel m39101c(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        /* renamed from: d */
        static void m39100d(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        /* renamed from: e */
        static void m39099e(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        /* renamed from: f */
        static AudioAttributes m39098f(NotificationChannel notificationChannel) {
            AudioAttributes audioAttributes;
            audioAttributes = notificationChannel.getAudioAttributes();
            return audioAttributes;
        }

        /* renamed from: g */
        static String m39097g(NotificationChannel notificationChannel) {
            String description;
            description = notificationChannel.getDescription();
            return description;
        }

        /* renamed from: h */
        static String m39096h(NotificationChannel notificationChannel) {
            String group;
            group = notificationChannel.getGroup();
            return group;
        }

        /* renamed from: i */
        static String m39095i(NotificationChannel notificationChannel) {
            String id2;
            id2 = notificationChannel.getId();
            return id2;
        }

        /* renamed from: j */
        static int m39094j(NotificationChannel notificationChannel) {
            int importance;
            importance = notificationChannel.getImportance();
            return importance;
        }

        /* renamed from: k */
        static int m39093k(NotificationChannel notificationChannel) {
            int lightColor;
            lightColor = notificationChannel.getLightColor();
            return lightColor;
        }

        /* renamed from: l */
        static int m39092l(NotificationChannel notificationChannel) {
            int lockscreenVisibility;
            lockscreenVisibility = notificationChannel.getLockscreenVisibility();
            return lockscreenVisibility;
        }

        /* renamed from: m */
        static CharSequence m39091m(NotificationChannel notificationChannel) {
            CharSequence name;
            name = notificationChannel.getName();
            return name;
        }

        /* renamed from: n */
        static Uri m39090n(NotificationChannel notificationChannel) {
            Uri sound;
            sound = notificationChannel.getSound();
            return sound;
        }

        /* renamed from: o */
        static long[] m39089o(NotificationChannel notificationChannel) {
            long[] vibrationPattern;
            vibrationPattern = notificationChannel.getVibrationPattern();
            return vibrationPattern;
        }

        /* renamed from: p */
        static void m39088p(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        /* renamed from: q */
        static void m39087q(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        /* renamed from: r */
        static void m39086r(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        /* renamed from: s */
        static void m39085s(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        /* renamed from: t */
        static void m39084t(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        /* renamed from: u */
        static void m39083u(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }

        /* renamed from: v */
        static boolean m39082v(NotificationChannel notificationChannel) {
            boolean shouldShowLights;
            shouldShowLights = notificationChannel.shouldShowLights();
            return shouldShowLights;
        }

        /* renamed from: w */
        static boolean m39081w(NotificationChannel notificationChannel) {
            boolean shouldVibrate;
            shouldVibrate = notificationChannel.shouldVibrate();
            return shouldVibrate;
        }
    }

    /* renamed from: androidx.core.app.NotificationChannelCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0697b {
        /* renamed from: a */
        static boolean m39080a(NotificationChannel notificationChannel) {
            boolean canBubble;
            canBubble = notificationChannel.canBubble();
            return canBubble;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationChannelCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0698c {
        /* renamed from: a */
        static String m39079a(NotificationChannel notificationChannel) {
            String conversationId;
            conversationId = notificationChannel.getConversationId();
            return conversationId;
        }

        /* renamed from: b */
        static String m39078b(NotificationChannel notificationChannel) {
            String parentChannelId;
            parentChannelId = notificationChannel.getParentChannelId();
            return parentChannelId;
        }

        /* renamed from: c */
        static boolean m39077c(NotificationChannel notificationChannel) {
            boolean isImportantConversation;
            isImportantConversation = notificationChannel.isImportantConversation();
            return isImportantConversation;
        }

        /* renamed from: d */
        static void m39076d(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    NotificationChannelCompat(String str, int i) {
        this.f3010f = true;
        this.f3011g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f3014j = 0;
        this.f3005a = (String) C1138f.m37824f(str);
        this.f3007c = i;
        this.f3012h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    /* renamed from: a */
    public boolean m39120a() {
        return this.f3010f;
    }

    /* renamed from: b */
    public String m39119b() {
        return this.f3005a;
    }

    /* renamed from: c */
    public int m39118c() {
        return this.f3007c;
    }

    /* renamed from: d */
    public CharSequence m39117d() {
        return this.f3006b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public NotificationChannel m39116e() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannel m39101c = C0696a.m39101c(this.f3005a, this.f3006b, this.f3007c);
        C0696a.m39088p(m39101c, this.f3008d);
        C0696a.m39087q(m39101c, this.f3009e);
        C0696a.m39085s(m39101c, this.f3010f);
        C0696a.m39084t(m39101c, this.f3011g, this.f3012h);
        C0696a.m39100d(m39101c, this.f3013i);
        C0696a.m39086r(m39101c, this.f3014j);
        C0696a.m39083u(m39101c, this.f3016l);
        C0696a.m39099e(m39101c, this.f3015k);
        if (i >= 30 && (str = this.f3017m) != null && (str2 = this.f3018n) != null) {
            C0698c.m39076d(m39101c, str, str2);
        }
        return m39101c;
    }

    /* renamed from: f */
    public boolean m39115f() {
        return this.f3013i;
    }

    /* renamed from: g */
    public boolean m39114g() {
        return this.f3015k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationChannelCompat(NotificationChannel notificationChannel) {
        this(C0696a.m39095i(notificationChannel), C0696a.m39094j(notificationChannel));
        this.f3006b = C0696a.m39091m(notificationChannel);
        this.f3008d = C0696a.m39097g(notificationChannel);
        this.f3009e = C0696a.m39096h(notificationChannel);
        this.f3010f = C0696a.m39102b(notificationChannel);
        this.f3011g = C0696a.m39090n(notificationChannel);
        this.f3012h = C0696a.m39098f(notificationChannel);
        this.f3013i = C0696a.m39082v(notificationChannel);
        this.f3014j = C0696a.m39093k(notificationChannel);
        this.f3015k = C0696a.m39081w(notificationChannel);
        this.f3016l = C0696a.m39089o(notificationChannel);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3017m = C0698c.m39078b(notificationChannel);
            this.f3018n = C0698c.m39079a(notificationChannel);
        }
        this.f3019o = C0696a.m39103a(notificationChannel);
        this.f3020p = C0696a.m39092l(notificationChannel);
        if (i >= 29) {
            this.f3021q = C0697b.m39080a(notificationChannel);
        }
        if (i >= 30) {
            this.f3022r = C0698c.m39077c(notificationChannel);
        }
    }
}
