package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p000a.InterfaceC0000a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class NotificationManagerCompat {

    /* renamed from: d */
    private static String f3143d;

    /* renamed from: g */
    private static ServiceConnectionC0751f f3146g;

    /* renamed from: a */
    private final Context f3147a;

    /* renamed from: b */
    private final NotificationManager f3148b;

    /* renamed from: c */
    private static final Object f3142c = new Object();

    /* renamed from: e */
    private static Set<String> f3144e = new HashSet();

    /* renamed from: f */
    private static final Object f3145f = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0746a {
        /* renamed from: a */
        static boolean m38774a(NotificationManager notificationManager) {
            boolean areNotificationsEnabled;
            areNotificationsEnabled = notificationManager.areNotificationsEnabled();
            return areNotificationsEnabled;
        }

        /* renamed from: b */
        static int m38773b(NotificationManager notificationManager) {
            int importance;
            importance = notificationManager.getImportance();
            return importance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0747b {
        /* renamed from: a */
        static void m38772a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        /* renamed from: b */
        static void m38771b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        /* renamed from: c */
        static void m38770c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        /* renamed from: d */
        static void m38769d(NotificationManager notificationManager, List<NotificationChannel> list) {
            notificationManager.createNotificationChannels(list);
        }

        /* renamed from: e */
        static void m38768e(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        /* renamed from: f */
        static void m38767f(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        /* renamed from: g */
        static String m38766g(NotificationChannel notificationChannel) {
            String id2;
            id2 = notificationChannel.getId();
            return id2;
        }

        /* renamed from: h */
        static String m38765h(NotificationChannelGroup notificationChannelGroup) {
            String id2;
            id2 = notificationChannelGroup.getId();
            return id2;
        }

        /* renamed from: i */
        static NotificationChannel m38764i(NotificationManager notificationManager, String str) {
            NotificationChannel notificationChannel;
            notificationChannel = notificationManager.getNotificationChannel(str);
            return notificationChannel;
        }

        /* renamed from: j */
        static List<NotificationChannelGroup> m38763j(NotificationManager notificationManager) {
            List<NotificationChannelGroup> notificationChannelGroups;
            notificationChannelGroups = notificationManager.getNotificationChannelGroups();
            return notificationChannelGroups;
        }

        /* renamed from: k */
        static List<NotificationChannel> m38762k(NotificationManager notificationManager) {
            List<NotificationChannel> notificationChannels;
            notificationChannels = notificationManager.getNotificationChannels();
            return notificationChannels;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0748c {
        /* renamed from: a */
        static NotificationChannelGroup m38761a(NotificationManager notificationManager, String str) {
            NotificationChannelGroup notificationChannelGroup;
            notificationChannelGroup = notificationManager.getNotificationChannelGroup(str);
            return notificationChannelGroup;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0749d implements InterfaceC0753g {

        /* renamed from: a */
        final String f3149a;

        /* renamed from: b */
        final int f3150b;

        /* renamed from: c */
        final String f3151c;

        /* renamed from: d */
        final Notification f3152d;

        C0749d(String str, int i, String str2, Notification notification) {
            this.f3149a = str;
            this.f3150b = i;
            this.f3151c = str2;
            this.f3152d = notification;
        }

        @Override // androidx.core.app.NotificationManagerCompat.InterfaceC0753g
        /* renamed from: a */
        public void mo38750a(InterfaceC0000a interfaceC0000a) {
            interfaceC0000a.mo41410a0(this.f3149a, this.f3150b, this.f3151c, this.f3152d);
        }

        public String toString() {
            return "NotifyTask[packageName:" + this.f3149a + ", id:" + this.f3150b + ", tag:" + this.f3151c + "]";
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0750e {

        /* renamed from: a */
        final ComponentName f3153a;

        /* renamed from: b */
        final IBinder f3154b;

        C0750e(ComponentName componentName, IBinder iBinder) {
            this.f3153a = componentName;
            this.f3154b = iBinder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ServiceConnectionC0751f implements Handler.Callback, ServiceConnection {

        /* renamed from: j */
        private final Context f3155j;

        /* renamed from: k */
        private final HandlerThread f3156k;

        /* renamed from: l */
        private final Handler f3157l;

        /* renamed from: m */
        private final Map<ComponentName, C0752a> f3158m = new HashMap();

        /* renamed from: n */
        private Set<String> f3159n = new HashSet();

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.core.app.NotificationManagerCompat$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0752a {

            /* renamed from: a */
            final ComponentName f3160a;

            /* renamed from: c */
            InterfaceC0000a f3162c;

            /* renamed from: b */
            boolean f3161b = false;

            /* renamed from: d */
            ArrayDeque<InterfaceC0753g> f3163d = new ArrayDeque<>();

            /* renamed from: e */
            int f3164e = 0;

            C0752a(ComponentName componentName) {
                this.f3160a = componentName;
            }
        }

        ServiceConnectionC0751f(Context context) {
            this.f3155j = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f3156k = handlerThread;
            handlerThread.start();
            this.f3157l = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        private boolean m38760a(C0752a c0752a) {
            if (c0752a.f3161b) {
                return true;
            }
            boolean bindService = this.f3155j.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(c0752a.f3160a), this, 33);
            c0752a.f3161b = bindService;
            if (bindService) {
                c0752a.f3164e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + c0752a.f3160a);
                this.f3155j.unbindService(this);
            }
            return c0752a.f3161b;
        }

        /* renamed from: b */
        private void m38759b(C0752a c0752a) {
            if (c0752a.f3161b) {
                this.f3155j.unbindService(this);
                c0752a.f3161b = false;
            }
            c0752a.f3162c = null;
        }

        /* renamed from: c */
        private void m38758c(InterfaceC0753g interfaceC0753g) {
            m38751j();
            for (C0752a c0752a : this.f3158m.values()) {
                c0752a.f3163d.add(interfaceC0753g);
                m38754g(c0752a);
            }
        }

        /* renamed from: d */
        private void m38757d(ComponentName componentName) {
            C0752a c0752a = this.f3158m.get(componentName);
            if (c0752a != null) {
                m38754g(c0752a);
            }
        }

        /* renamed from: e */
        private void m38756e(ComponentName componentName, IBinder iBinder) {
            C0752a c0752a = this.f3158m.get(componentName);
            if (c0752a != null) {
                c0752a.f3162c = InterfaceC0000a.AbstractBinderC0001a.m41411b(iBinder);
                c0752a.f3164e = 0;
                m38754g(c0752a);
            }
        }

        /* renamed from: f */
        private void m38755f(ComponentName componentName) {
            C0752a c0752a = this.f3158m.get(componentName);
            if (c0752a != null) {
                m38759b(c0752a);
            }
        }

        /* renamed from: g */
        private void m38754g(C0752a c0752a) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + c0752a.f3160a + ", " + c0752a.f3163d.size() + " queued tasks");
            }
            if (c0752a.f3163d.isEmpty()) {
                return;
            }
            if (m38760a(c0752a) && c0752a.f3162c != null) {
                while (true) {
                    InterfaceC0753g peek = c0752a.f3163d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.mo38750a(c0752a.f3162c);
                        c0752a.f3163d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + c0752a.f3160a);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + c0752a.f3160a, e);
                    }
                }
                if (!c0752a.f3163d.isEmpty()) {
                    m38752i(c0752a);
                    return;
                }
                return;
            }
            m38752i(c0752a);
        }

        /* renamed from: i */
        private void m38752i(C0752a c0752a) {
            if (this.f3157l.hasMessages(3, c0752a.f3160a)) {
                return;
            }
            int i = c0752a.f3164e + 1;
            c0752a.f3164e = i;
            if (i > 6) {
                Log.w("NotifManCompat", "Giving up on delivering " + c0752a.f3163d.size() + " tasks to " + c0752a.f3160a + " after " + c0752a.f3164e + " retries");
                c0752a.f3163d.clear();
                return;
            }
            int i2 = (1 << (i - 1)) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i2 + " ms");
            }
            this.f3157l.sendMessageDelayed(this.f3157l.obtainMessage(3, c0752a.f3160a), i2);
        }

        /* renamed from: j */
        private void m38751j() {
            Set<String> m38784h = NotificationManagerCompat.m38784h(this.f3155j);
            if (m38784h.equals(this.f3159n)) {
                return;
            }
            this.f3159n = m38784h;
            List<ResolveInfo> queryIntentServices = this.f3155j.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (m38784h.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.f3158m.containsKey(componentName2)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                    }
                    this.f3158m.put(componentName2, new C0752a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, C0752a>> it = this.f3158m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, C0752a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + next.getKey());
                    }
                    m38759b(next.getValue());
                    it.remove();
                }
            }
        }

        /* renamed from: h */
        public void m38753h(InterfaceC0753g interfaceC0753g) {
            this.f3157l.obtainMessage(0, interfaceC0753g).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return false;
                        }
                        m38757d((ComponentName) message.obj);
                        return true;
                    }
                    m38755f((ComponentName) message.obj);
                    return true;
                }
                C0750e c0750e = (C0750e) message.obj;
                m38756e(c0750e.f3153a, c0750e.f3154b);
                return true;
            }
            m38758c((InterfaceC0753g) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f3157l.obtainMessage(1, new C0750e(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f3157l.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.NotificationManagerCompat$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0753g {
        /* renamed from: a */
        void mo38750a(InterfaceC0000a interfaceC0000a);
    }

    private NotificationManagerCompat(Context context) {
        this.f3147a = context;
        this.f3148b = (NotificationManager) context.getSystemService("notification");
    }

    /* renamed from: g */
    public static NotificationManagerCompat m38785g(Context context) {
        return new NotificationManagerCompat(context);
    }

    /* renamed from: h */
    public static Set<String> m38784h(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f3142c) {
            if (string != null) {
                if (!string.equals(f3143d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String str : split) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                        if (unflattenFromString != null) {
                            hashSet.add(unflattenFromString.getPackageName());
                        }
                    }
                    f3144e = hashSet;
                    f3143d = string;
                }
            }
            set = f3144e;
        }
        return set;
    }

    /* renamed from: p */
    private void m38776p(InterfaceC0753g interfaceC0753g) {
        synchronized (f3145f) {
            if (f3146g == null) {
                f3146g = new ServiceConnectionC0751f(this.f3147a.getApplicationContext());
            }
            f3146g.m38753h(interfaceC0753g);
        }
    }

    /* renamed from: q */
    private static boolean m38775q(Notification notification) {
        Bundle m39063k = NotificationCompat.m39063k(notification);
        if (m39063k != null && m39063k.getBoolean("android.support.useSideChannel")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m38791a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0746a.m38774a(this.f3148b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f3147a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f3147a.getApplicationInfo();
        String packageName = this.f3147a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public void m38790b(String str, int i) {
        this.f3148b.cancel(str, i);
    }

    /* renamed from: c */
    public void m38789c() {
        this.f3148b.cancelAll();
    }

    /* renamed from: d */
    public void m38788d(List<C0895t0> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C0895t0 c0895t0 : list) {
                arrayList.add(c0895t0.m38504c());
            }
            C0747b.m38770c(this.f3148b, arrayList);
        }
    }

    /* renamed from: e */
    public void m38787e(List<NotificationChannelCompat> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (NotificationChannelCompat notificationChannelCompat : list) {
                arrayList.add(notificationChannelCompat.m39116e());
            }
            C0747b.m38769d(this.f3148b, arrayList);
        }
    }

    /* renamed from: f */
    public void m38786f(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0747b.m38768e(this.f3148b, str);
        }
    }

    /* renamed from: i */
    public NotificationChannel m38783i(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0747b.m38764i(this.f3148b, str);
        }
        return null;
    }

    /* renamed from: j */
    public NotificationChannelCompat m38782j(String str) {
        NotificationChannel m38783i;
        if (Build.VERSION.SDK_INT >= 26 && (m38783i = m38783i(str)) != null) {
            return new NotificationChannelCompat(m38783i);
        }
        return null;
    }

    /* renamed from: k */
    public NotificationChannelGroup m38781k(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return C0748c.m38761a(this.f3148b, str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : m38780l()) {
                if (C0747b.m38765h(notificationChannelGroup).equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    /* renamed from: l */
    public List<NotificationChannelGroup> m38780l() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0747b.m38763j(this.f3148b);
        }
        return Collections.emptyList();
    }

    /* renamed from: m */
    public List<NotificationChannel> m38779m() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C0747b.m38762k(this.f3148b);
        }
        return Collections.emptyList();
    }

    /* renamed from: n */
    public List<NotificationChannelCompat> m38778n() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> m38779m = m38779m();
            if (!m38779m.isEmpty()) {
                ArrayList arrayList = new ArrayList(m38779m.size());
                for (NotificationChannel notificationChannel : m38779m) {
                    arrayList.add(new NotificationChannelCompat(notificationChannel));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    /* renamed from: o */
    public void m38777o(String str, int i, Notification notification) {
        if (m38775q(notification)) {
            m38776p(new C0749d(this.f3147a.getPackageName(), i, str, notification));
            this.f3148b.cancel(str, i);
            return;
        }
        this.f3148b.notify(str, i, notification);
    }
}
