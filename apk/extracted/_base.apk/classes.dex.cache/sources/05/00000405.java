package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.C0626b;
import androidx.core.app.NotificationCompat;
import androidx.core.content.C0958g;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.x2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0921x2 implements InterfaceC0864o {

    /* renamed from: a */
    private final Context f3234a;

    /* renamed from: b */
    private final Notification.Builder f3235b;

    /* renamed from: c */
    private final NotificationCompat.Builder f3236c;

    /* renamed from: d */
    private RemoteViews f3237d;

    /* renamed from: e */
    private RemoteViews f3238e;

    /* renamed from: f */
    private final List<Bundle> f3239f = new ArrayList();

    /* renamed from: g */
    private final Bundle f3240g = new Bundle();

    /* renamed from: h */
    private int f3241h;

    /* renamed from: i */
    private RemoteViews f3242i;

    /* renamed from: androidx.core.app.x2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0922a {
        /* renamed from: a */
        static Notification m38462a(Notification.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        static Notification.Builder m38461b(Notification.Builder builder, int i) {
            return builder.setPriority(i);
        }

        /* renamed from: c */
        static Notification.Builder m38460c(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSubText(charSequence);
        }

        /* renamed from: d */
        static Notification.Builder m38459d(Notification.Builder builder, boolean z) {
            return builder.setUsesChronometer(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.x2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0923b {
        /* renamed from: a */
        static Notification.Builder m38458a(Notification.Builder builder, boolean z) {
            return builder.setShowWhen(z);
        }
    }

    /* renamed from: androidx.core.app.x2$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0924c {
        /* renamed from: a */
        static Notification.Builder m38457a(Notification.Builder builder, Bundle bundle) {
            return builder.setExtras(bundle);
        }
    }

    /* renamed from: androidx.core.app.x2$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0925d {
        /* renamed from: a */
        static Notification.Builder m38456a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        /* renamed from: b */
        static Notification.Action.Builder m38455b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        /* renamed from: c */
        static Notification.Action.Builder m38454c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        /* renamed from: d */
        static Notification.Action m38453d(Notification.Action.Builder builder) {
            return builder.build();
        }

        /* renamed from: e */
        static Notification.Action.Builder m38452e(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        /* renamed from: f */
        static String m38451f(Notification notification) {
            return notification.getGroup();
        }

        /* renamed from: g */
        static Notification.Builder m38450g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        /* renamed from: h */
        static Notification.Builder m38449h(Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        /* renamed from: i */
        static Notification.Builder m38448i(Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        /* renamed from: j */
        static Notification.Builder m38447j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.x2$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0926e {
        /* renamed from: a */
        static Notification.Builder m38446a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        /* renamed from: b */
        static Notification.Builder m38445b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        /* renamed from: c */
        static Notification.Builder m38444c(Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        /* renamed from: d */
        static Notification.Builder m38443d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        /* renamed from: e */
        static Notification.Builder m38442e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        /* renamed from: f */
        static Notification.Builder m38441f(Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }
    }

    /* renamed from: androidx.core.app.x2$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0927f {
        /* renamed from: a */
        static Notification.Action.Builder m38440a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        /* renamed from: b */
        static Notification.Builder m38439b(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    /* renamed from: androidx.core.app.x2$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0928g {
        /* renamed from: a */
        static Notification.Action.Builder m38438a(Notification.Action.Builder builder, boolean z) {
            Notification.Action.Builder allowGeneratedReplies;
            allowGeneratedReplies = builder.setAllowGeneratedReplies(z);
            return allowGeneratedReplies;
        }

        /* renamed from: b */
        static Notification.Builder m38437b(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customBigContentView;
            customBigContentView = builder.setCustomBigContentView(remoteViews);
            return customBigContentView;
        }

        /* renamed from: c */
        static Notification.Builder m38436c(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customContentView;
            customContentView = builder.setCustomContentView(remoteViews);
            return customContentView;
        }

        /* renamed from: d */
        static Notification.Builder m38435d(Notification.Builder builder, RemoteViews remoteViews) {
            Notification.Builder customHeadsUpContentView;
            customHeadsUpContentView = builder.setCustomHeadsUpContentView(remoteViews);
            return customHeadsUpContentView;
        }

        /* renamed from: e */
        static Notification.Builder m38434e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            Notification.Builder remoteInputHistory;
            remoteInputHistory = builder.setRemoteInputHistory(charSequenceArr);
            return remoteInputHistory;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.x2$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0929h {
        /* renamed from: a */
        static Notification.Builder m38433a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        /* renamed from: b */
        static Notification.Builder m38432b(Notification.Builder builder, int i) {
            Notification.Builder badgeIconType;
            badgeIconType = builder.setBadgeIconType(i);
            return badgeIconType;
        }

        /* renamed from: c */
        static Notification.Builder m38431c(Notification.Builder builder, boolean z) {
            Notification.Builder colorized;
            colorized = builder.setColorized(z);
            return colorized;
        }

        /* renamed from: d */
        static Notification.Builder m38430d(Notification.Builder builder, int i) {
            Notification.Builder groupAlertBehavior;
            groupAlertBehavior = builder.setGroupAlertBehavior(i);
            return groupAlertBehavior;
        }

        /* renamed from: e */
        static Notification.Builder m38429e(Notification.Builder builder, CharSequence charSequence) {
            Notification.Builder settingsText;
            settingsText = builder.setSettingsText(charSequence);
            return settingsText;
        }

        /* renamed from: f */
        static Notification.Builder m38428f(Notification.Builder builder, String str) {
            Notification.Builder shortcutId;
            shortcutId = builder.setShortcutId(str);
            return shortcutId;
        }

        /* renamed from: g */
        static Notification.Builder m38427g(Notification.Builder builder, long j) {
            Notification.Builder timeoutAfter;
            timeoutAfter = builder.setTimeoutAfter(j);
            return timeoutAfter;
        }
    }

    /* renamed from: androidx.core.app.x2$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0930i {
        /* renamed from: a */
        static Notification.Builder m38426a(Notification.Builder builder, android.app.Person person) {
            Notification.Builder addPerson;
            addPerson = builder.addPerson(person);
            return addPerson;
        }

        /* renamed from: b */
        static Notification.Action.Builder m38425b(Notification.Action.Builder builder, int i) {
            Notification.Action.Builder semanticAction;
            semanticAction = builder.setSemanticAction(i);
            return semanticAction;
        }
    }

    /* renamed from: androidx.core.app.x2$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0931j {
        /* renamed from: a */
        static Notification.Builder m38424a(Notification.Builder builder, boolean z) {
            Notification.Builder allowSystemGeneratedContextualActions;
            allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z);
            return allowSystemGeneratedContextualActions;
        }

        /* renamed from: b */
        static Notification.Builder m38423b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            Notification.Builder bubbleMetadata2;
            bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
            return bubbleMetadata2;
        }

        /* renamed from: c */
        static Notification.Action.Builder m38422c(Notification.Action.Builder builder, boolean z) {
            Notification.Action.Builder contextual;
            contextual = builder.setContextual(z);
            return contextual;
        }

        /* renamed from: d */
        static Notification.Builder m38421d(Notification.Builder builder, Object obj) {
            Notification.Builder locusId;
            locusId = builder.setLocusId((LocusId) obj);
            return locusId;
        }
    }

    /* renamed from: androidx.core.app.x2$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0932k {
        /* renamed from: a */
        static Notification.Action.Builder m38420a(Notification.Action.Builder builder, boolean z) {
            Notification.Action.Builder authenticationRequired;
            authenticationRequired = builder.setAuthenticationRequired(z);
            return authenticationRequired;
        }

        /* renamed from: b */
        static Notification.Builder m38419b(Notification.Builder builder, int i) {
            Notification.Builder foregroundServiceBehavior;
            foregroundServiceBehavior = builder.setForegroundServiceBehavior(i);
            return foregroundServiceBehavior;
        }
    }

    public C0921x2(NotificationCompat.Builder builder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List<String> list;
        int i;
        this.f3236c = builder;
        Context context = builder.f3070a;
        this.f3234a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3235b = C0929h.m38433a(context, builder.f3057L);
        } else {
            this.f3235b = new Notification.Builder(builder.f3070a);
        }
        Notification notification = builder.f3066U;
        Notification.Builder lights = this.f3235b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.f3078i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(builder.f3074e).setContentText(builder.f3075f).setContentInfo(builder.f3080k).setContentIntent(builder.f3076g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.f3077h;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(builder.f3079j).setNumber(builder.f3081l).setProgress(builder.f3090u, builder.f3091v, builder.f3092w);
        C0922a.m38461b(C0922a.m38459d(C0922a.m38460c(this.f3235b, builder.f3087r), builder.f3084o), builder.f3082m);
        Iterator<NotificationCompat.Action> it = builder.f3071b.iterator();
        while (it.hasNext()) {
            m38469b(it.next());
        }
        Bundle bundle = builder.f3050E;
        if (bundle != null) {
            this.f3240g.putAll(bundle);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f3237d = builder.f3054I;
        this.f3238e = builder.f3055J;
        C0923b.m38458a(this.f3235b, builder.f3083n);
        C0925d.m38448i(this.f3235b, builder.f3046A);
        C0925d.m38450g(this.f3235b, builder.f3093x);
        C0925d.m38447j(this.f3235b, builder.f3095z);
        C0925d.m38449h(this.f3235b, builder.f3094y);
        this.f3241h = builder.f3062Q;
        C0926e.m38445b(this.f3235b, builder.f3049D);
        C0926e.m38444c(this.f3235b, builder.f3051F);
        C0926e.m38441f(this.f3235b, builder.f3052G);
        C0926e.m38443d(this.f3235b, builder.f3053H);
        C0926e.m38442e(this.f3235b, notification.sound, notification.audioAttributes);
        if (i2 < 28) {
            list = m38466e(m38464g(builder.f3072c), builder.f3069X);
        } else {
            list = builder.f3069X;
        }
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                C0926e.m38446a(this.f3235b, str);
            }
        }
        this.f3242i = builder.f3056K;
        if (builder.f3073d.size() > 0) {
            Bundle bundle2 = builder.m38974l().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i3 = 0; i3 < builder.f3073d.size(); i3++) {
                bundle4.putBundle(Integer.toString(i3), C0868o3.m38534e(builder.f3073d.get(i3)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            builder.m38974l().putBundle("android.car.EXTENSIONS", bundle2);
            this.f3240g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i4 = Build.VERSION.SDK_INT;
        Object obj = builder.f3068W;
        if (obj != null) {
            C0927f.m38439b(this.f3235b, obj);
        }
        if (i4 >= 24) {
            C0924c.m38457a(this.f3235b, builder.f3050E);
            C0928g.m38434e(this.f3235b, builder.f3089t);
            RemoteViews remoteViews = builder.f3054I;
            if (remoteViews != null) {
                C0928g.m38436c(this.f3235b, remoteViews);
            }
            RemoteViews remoteViews2 = builder.f3055J;
            if (remoteViews2 != null) {
                C0928g.m38437b(this.f3235b, remoteViews2);
            }
            RemoteViews remoteViews3 = builder.f3056K;
            if (remoteViews3 != null) {
                C0928g.m38435d(this.f3235b, remoteViews3);
            }
        }
        if (i4 >= 26) {
            C0929h.m38432b(this.f3235b, builder.f3058M);
            C0929h.m38429e(this.f3235b, builder.f3088s);
            C0929h.m38428f(this.f3235b, builder.f3059N);
            C0929h.m38427g(this.f3235b, builder.f3061P);
            C0929h.m38430d(this.f3235b, builder.f3062Q);
            if (builder.f3048C) {
                C0929h.m38431c(this.f3235b, builder.f3047B);
            }
            if (!TextUtils.isEmpty(builder.f3057L)) {
                this.f3235b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i4 >= 28) {
            Iterator<Person> it2 = builder.f3072c.iterator();
            while (it2.hasNext()) {
                C0930i.m38426a(this.f3235b, it2.next().m38739k());
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            C0931j.m38424a(this.f3235b, builder.f3064S);
            C0931j.m38423b(this.f3235b, NotificationCompat.C0725g.m38868k(builder.f3065T));
            C0958g c0958g = builder.f3060O;
            if (c0958g != null) {
                C0931j.m38421d(this.f3235b, c0958g.m38367c());
            }
        }
        if (i5 >= 31 && (i = builder.f3063R) != 0) {
            C0932k.m38419b(this.f3235b, i);
        }
        if (builder.f3067V) {
            if (this.f3236c.f3094y) {
                this.f3241h = 2;
            } else {
                this.f3241h = 1;
            }
            this.f3235b.setVibrate(null);
            this.f3235b.setSound(null);
            int i6 = notification.defaults & (-2) & (-3);
            notification.defaults = i6;
            this.f3235b.setDefaults(i6);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f3236c.f3093x)) {
                    C0925d.m38450g(this.f3235b, "silent");
                }
                C0929h.m38430d(this.f3235b, this.f3241h);
            }
        }
    }

    /* renamed from: b */
    private void m38469b(NotificationCompat.Action action) {
        Icon icon;
        Bundle bundle;
        IconCompat m39044d = action.m39044d();
        if (m39044d != null) {
            icon = m39044d.m38113y();
        } else {
            icon = null;
        }
        Notification.Action.Builder m38440a = C0927f.m38440a(icon, action.m39040h(), action.m39047a());
        if (action.m39043e() != null) {
            for (android.app.RemoteInput remoteInput : RemoteInput.m38724b(action.m39043e())) {
                C0925d.m38454c(m38440a, remoteInput);
            }
        }
        if (action.m39045c() != null) {
            bundle = new Bundle(action.m39045c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.m39046b());
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            C0928g.m38438a(m38440a, action.m39046b());
        }
        bundle.putInt("android.support.action.semanticAction", action.m39042f());
        if (i >= 28) {
            C0930i.m38425b(m38440a, action.m39042f());
        }
        if (i >= 29) {
            C0931j.m38422c(m38440a, action.m39038j());
        }
        if (i >= 31) {
            C0932k.m38420a(m38440a, action.m39039i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.m39041g());
        C0925d.m38455b(m38440a, bundle);
        C0925d.m38456a(this.f3235b, C0925d.m38453d(m38440a));
    }

    /* renamed from: e */
    private static List<String> m38466e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C0626b c0626b = new C0626b(list.size() + list2.size());
        c0626b.addAll(list);
        c0626b.addAll(list2);
        return new ArrayList(c0626b);
    }

    /* renamed from: g */
    private static List<String> m38464g(List<Person> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (Person person : list) {
            arrayList.add(person.m38740j());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m38463h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & (-2) & (-3);
    }

    @Override // androidx.core.app.InterfaceC0864o
    /* renamed from: a */
    public Notification.Builder mo38470a() {
        return this.f3235b;
    }

    /* renamed from: c */
    public Notification m38468c() {
        RemoteViews remoteViews;
        Bundle m39063k;
        RemoteViews mo38797u;
        RemoteViews mo38799s;
        NotificationCompat.AbstractC0743k abstractC0743k = this.f3236c.f3086q;
        if (abstractC0743k != null) {
            abstractC0743k.mo38816b(this);
        }
        if (abstractC0743k != null) {
            remoteViews = abstractC0743k.mo38798t(this);
        } else {
            remoteViews = null;
        }
        Notification m38467d = m38467d();
        if (remoteViews != null) {
            m38467d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f3236c.f3054I;
            if (remoteViews2 != null) {
                m38467d.contentView = remoteViews2;
            }
        }
        if (abstractC0743k != null && (mo38799s = abstractC0743k.mo38799s(this)) != null) {
            m38467d.bigContentView = mo38799s;
        }
        if (abstractC0743k != null && (mo38797u = this.f3236c.f3086q.mo38797u(this)) != null) {
            m38467d.headsUpContentView = mo38797u;
        }
        if (abstractC0743k != null && (m39063k = NotificationCompat.m39063k(m38467d)) != null) {
            abstractC0743k.mo38817a(m39063k);
        }
        return m38467d;
    }

    /* renamed from: d */
    protected Notification m38467d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            return C0922a.m38462a(this.f3235b);
        }
        if (i >= 24) {
            Notification m38462a = C0922a.m38462a(this.f3235b);
            if (this.f3241h != 0) {
                if (C0925d.m38451f(m38462a) != null && (m38462a.flags & 512) != 0 && this.f3241h == 2) {
                    m38463h(m38462a);
                }
                if (C0925d.m38451f(m38462a) != null && (m38462a.flags & 512) == 0 && this.f3241h == 1) {
                    m38463h(m38462a);
                }
            }
            return m38462a;
        }
        C0924c.m38457a(this.f3235b, this.f3240g);
        Notification m38462a2 = C0922a.m38462a(this.f3235b);
        RemoteViews remoteViews = this.f3237d;
        if (remoteViews != null) {
            m38462a2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f3238e;
        if (remoteViews2 != null) {
            m38462a2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f3242i;
        if (remoteViews3 != null) {
            m38462a2.headsUpContentView = remoteViews3;
        }
        if (this.f3241h != 0) {
            if (C0925d.m38451f(m38462a2) != null && (m38462a2.flags & 512) != 0 && this.f3241h == 2) {
                m38463h(m38462a2);
            }
            if (C0925d.m38451f(m38462a2) != null && (m38462a2.flags & 512) == 0 && this.f3241h == 1) {
                m38463h(m38462a2);
            }
        }
        return m38462a2;
    }

    /* renamed from: f */
    public Context m38465f() {
        return this.f3234a;
    }
}