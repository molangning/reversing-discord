package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.discord.nearby.NearbyManager;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.gms.tasks.C4713b;
import com.google.firebase.installations.C5048c;
import ec.C6196a;
import ec.C6201b;
import java.util.concurrent.ExecutionException;
import lb.C10106d;
import p232mb.InterfaceC10433a;
import p347t5.AbstractC12589c;
import p347t5.C12588b;
import p347t5.InterfaceC12591e;
import p347t5.InterfaceC12593g;

/* renamed from: com.google.firebase.messaging.d0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5077d0 {
    /* renamed from: A */
    public static boolean m26308A(Intent intent) {
        if (intent != null && !m26289r(intent)) {
            return m26307B(intent.getExtras());
        }
        return false;
    }

    /* renamed from: B */
    public static boolean m26307B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return NearbyManager.PERMISSION_DENIED.equals(bundle.getString("google.c.a.e"));
    }

    /* renamed from: a */
    static boolean m26306a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            C10106d.m12295k();
            Context m12296j = C10106d.m12295k().m12296j();
            SharedPreferences sharedPreferences = m12296j.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = m12296j.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(m12296j.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* renamed from: b */
    static C6196a m26305b(C6196a.EnumC6198b enumC6198b, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C6196a.C6197a m23294h = C6196a.m23302p().m23289m(m26291p(extras)).m23297e(enumC6198b).m23296f(m26301f(extras)).m23293i(m26294m()).m23291k(C6196a.EnumC6200d.ANDROID).m23294h(m26296k(extras));
        String m26299h = m26299h(extras);
        if (m26299h != null) {
            m23294h.m23295g(m26299h);
        }
        String m26292o = m26292o(extras);
        if (m26292o != null) {
            m23294h.m23290l(m26292o);
        }
        String m26304c = m26304c(extras);
        if (m26304c != null) {
            m23294h.m23299c(m26304c);
        }
        String m26298i = m26298i(extras);
        if (m26298i != null) {
            m23294h.m23300b(m26298i);
        }
        String m26302e = m26302e(extras);
        if (m26302e != null) {
            m23294h.m23298d(m26302e);
        }
        long m26293n = m26293n(extras);
        if (m26293n > 0) {
            m23294h.m23292j(m26293n);
        }
        return m23294h.m23301a();
    }

    /* renamed from: c */
    static String m26304c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    /* renamed from: d */
    static String m26303d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    /* renamed from: e */
    static String m26302e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    /* renamed from: f */
    static String m26301f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) C4713b.m28008a(C5048c.m26421n(C10106d.m12295k()).getId());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: g */
    static String m26300g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    /* renamed from: h */
    static String m26299h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        if (string == null) {
            return bundle.getString("message_id");
        }
        return string;
    }

    /* renamed from: i */
    static String m26298i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    /* renamed from: j */
    static String m26297j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    /* renamed from: k */
    static C6196a.EnumC6199c m26296k(Bundle bundle) {
        if (bundle != null && C5083f0.m26253t(bundle)) {
            return C6196a.EnumC6199c.DISPLAY_NOTIFICATION;
        }
        return C6196a.EnumC6199c.DATA_MESSAGE;
    }

    /* renamed from: l */
    static String m26295l(Bundle bundle) {
        return (bundle == null || !C5083f0.m26253t(bundle)) ? "data" : ViewProps.DISPLAY;
    }

    /* renamed from: m */
    static String m26294m() {
        return C10106d.m12295k().m12296j().getPackageName();
    }

    /* renamed from: n */
    static long m26293n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "error parsing project number", e);
            }
        }
        C10106d m12295k = C10106d.m12295k();
        String m12269d = m12295k.m12293m().m12269d();
        if (m12269d != null) {
            try {
                return Long.parseLong(m12269d);
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e2);
            }
        }
        String m12270c = m12295k.m12293m().m12270c();
        if (!m12270c.startsWith("1:")) {
            try {
                return Long.parseLong(m12270c);
            } catch (NumberFormatException e3) {
                Log.w("FirebaseMessaging", "error parsing app ID", e3);
            }
        } else {
            String[] split = m12270c.split(":");
            if (split.length < 2) {
                return 0L;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return 0L;
            }
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e4) {
                Log.w("FirebaseMessaging", "error parsing app ID", e4);
            }
        }
        return 0L;
    }

    /* renamed from: o */
    static String m26292o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    /* renamed from: p */
    static int m26291p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof String) {
            try {
                return Integer.parseInt((String) obj);
            } catch (NumberFormatException unused) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: q */
    static String m26290q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    /* renamed from: r */
    private static boolean m26289r(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    /* renamed from: s */
    public static void m26288s(Intent intent) {
        m26283x("_nd", intent.getExtras());
    }

    /* renamed from: t */
    public static void m26287t(Intent intent) {
        m26283x("_nf", intent.getExtras());
    }

    /* renamed from: u */
    public static void m26286u(Bundle bundle) {
        m26282y(bundle);
        m26283x("_no", bundle);
    }

    /* renamed from: v */
    public static void m26285v(Intent intent) {
        if (m26308A(intent)) {
            m26283x("_nr", intent.getExtras());
        }
        if (m26281z(intent)) {
            m26284w(C6196a.EnumC6198b.MESSAGE_DELIVERED, intent, FirebaseMessaging.m26367q());
        }
    }

    /* renamed from: w */
    private static void m26284w(C6196a.EnumC6198b enumC6198b, Intent intent, InterfaceC12593g interfaceC12593g) {
        if (interfaceC12593g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C6196a m26305b = m26305b(enumC6198b, intent);
        if (m26305b == null) {
            return;
        }
        try {
            interfaceC12593g.mo3252a("FCM_CLIENT_EVENT_LOGGING", C6201b.class, C12588b.m4754b("src/main/proto"), new InterfaceC12591e() { // from class: com.google.firebase.messaging.c0
                @Override // p347t5.InterfaceC12591e
                public final Object apply(Object obj) {
                    return ((C6201b) obj).m23286c();
                }
            }).mo3250a(AbstractC12589c.m4750d(C6201b.m23287b().m23284b(m26305b).m23285a()));
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e);
        }
    }

    /* renamed from: x */
    static void m26283x(String str, Bundle bundle) {
        try {
            C10106d.m12295k();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String m26303d = m26303d(bundle);
            if (m26303d != null) {
                bundle2.putString("_nmid", m26303d);
            }
            String m26302e = m26302e(bundle);
            if (m26302e != null) {
                bundle2.putString("_nmn", m26302e);
            }
            String m26298i = m26298i(bundle);
            if (!TextUtils.isEmpty(m26298i)) {
                bundle2.putString("label", m26298i);
            }
            String m26300g = m26300g(bundle);
            if (!TextUtils.isEmpty(m26300g)) {
                bundle2.putString("message_channel", m26300g);
            }
            String m26292o = m26292o(bundle);
            if (m26292o != null) {
                bundle2.putString("_nt", m26292o);
            }
            String m26297j = m26297j(bundle);
            if (m26297j != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(m26297j));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String m26290q = m26290q(bundle);
            if (m26290q != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(m26290q));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String m26295l = m26295l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", m26295l);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC10433a interfaceC10433a = (InterfaceC10433a) C10106d.m12295k().m12297i(InterfaceC10433a.class);
            if (interfaceC10433a != null) {
                interfaceC10433a.m11573a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* renamed from: y */
    private static void m26282y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (NearbyManager.PERMISSION_DENIED.equals(bundle.getString("google.c.a.tc"))) {
            InterfaceC10433a interfaceC10433a = (InterfaceC10433a) C10106d.m12295k().m12297i(InterfaceC10433a.class);
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if (interfaceC10433a != null) {
                String string = bundle.getString("google.c.a.c_id");
                interfaceC10433a.m11572b("fcm", "_ln", string);
                Bundle bundle2 = new Bundle();
                bundle2.putString("source", "Firebase");
                bundle2.putString("medium", "notification");
                bundle2.putString("campaign", string);
                interfaceC10433a.m11573a("fcm", "_cmp", bundle2);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
        } else if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    /* renamed from: z */
    public static boolean m26281z(Intent intent) {
        if (intent != null && !m26289r(intent)) {
            return m26306a();
        }
        return false;
    }
}