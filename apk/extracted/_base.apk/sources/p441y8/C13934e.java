package p441y8;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import p010a9.AbstractC0120r;
import p010a9.C0121s;
import p010a9.InterfaceC0101f;
import p029b9.AbstractDialogInterface$OnClickListenerC2163e0;
import p029b9.C2148b0;
import p029b9.C2198p;
import p119g9.C6583f;
import p119g9.C6587j;
import p154i9.C7476b;
import p319r9.C12117e;
import p400w8.C13431a;
import p400w8.C13432b;

/* renamed from: y8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13934e extends C13935f {

    /* renamed from: c */
    private String f35884c;

    /* renamed from: e */
    private static final Object f35882e = new Object();

    /* renamed from: f */
    private static final C13934e f35883f = new C13934e();

    /* renamed from: d */
    public static final int f35881d = C13935f.f35885a;

    /* renamed from: k */
    public static C13934e m1136k() {
        return f35883f;
    }

    @Override // p441y8.C13935f
    /* renamed from: a */
    public Intent mo1125a(Context context, int i, String str) {
        return super.mo1125a(context, i, str);
    }

    @Override // p441y8.C13935f
    /* renamed from: b */
    public PendingIntent mo1124b(Context context, int i, int i2) {
        return super.mo1124b(context, i, i2);
    }

    @Override // p441y8.C13935f
    /* renamed from: d */
    public final String mo1122d(int i) {
        return super.mo1122d(i);
    }

    @Override // p441y8.C13935f
    /* renamed from: e */
    public int mo1121e(Context context) {
        return super.mo1121e(context);
    }

    @Override // p441y8.C13935f
    /* renamed from: f */
    public int mo1120f(Context context, int i) {
        return super.mo1120f(context, i);
    }

    @Override // p441y8.C13935f
    /* renamed from: h */
    public final boolean mo1118h(int i) {
        return super.mo1118h(i);
    }

    /* renamed from: i */
    public Dialog m1138i(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m1133n(activity, i, AbstractDialogInterface$OnClickListenerC2163e0.m34050b(activity, mo1125a(activity, i, "d"), i2), onCancelListener);
    }

    /* renamed from: j */
    public PendingIntent m1137j(Context context, C13930a c13930a) {
        if (c13930a.m1147G()) {
            return c13930a.m1148A();
        }
        return mo1124b(context, c13930a.m1144r(), 0);
    }

    /* renamed from: l */
    public boolean m1135l(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m1138i = m1138i(activity, i, i2, onCancelListener);
        if (m1138i == null) {
            return false;
        }
        m1130q(activity, m1138i, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: m */
    public void m1134m(Context context, int i) {
        m1129r(context, i, null, m1123c(context, i, 0, "n"));
    }

    /* renamed from: n */
    final Dialog m1133n(Context context, int i, AbstractDialogInterface$OnClickListenerC2163e0 abstractDialogInterface$OnClickListenerC2163e0, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C2148b0.m34119d(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m34120c = C2148b0.m34120c(context, i);
        if (m34120c != null) {
            builder.setPositiveButton(m34120c, abstractDialogInterface$OnClickListenerC2163e0);
        }
        String m34116g = C2148b0.m34116g(context, i);
        if (m34116g != null) {
            builder.setTitle(m34116g);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    /* renamed from: o */
    public final Dialog m1132o(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(C2148b0.m34119d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m1130q(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: p */
    public final C0121s m1131p(Context context, AbstractC0120r abstractC0120r) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C0121s c0121s = new C0121s(abstractC0120r);
        context.registerReceiver(c0121s, intentFilter);
        c0121s.m41124a(context);
        if (!m1119g(context, "com.google.android.gms")) {
            abstractC0120r.mo28133a();
            c0121s.m41123b();
            return null;
        }
        return c0121s;
    }

    /* renamed from: q */
    final void m1130q(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C13940k.m1104d(dialog, onCancelListener).show(((FragmentActivity) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC13931b.m1142a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: r */
    final void m1129r(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            m1128s(context);
        } else if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            String m34117f = C2148b0.m34117f(context, i);
            String m34118e = C2148b0.m34118e(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) C2198p.m33985j(context.getSystemService("notification"));
            NotificationCompat.Builder m38987e0 = new NotificationCompat.Builder(context).m39009N(true).m38965t(true).m39018E(m34117f).m38987e0(new NotificationCompat.C0723f().m38883x(m34118e));
            if (C6583f.m22377c(context)) {
                C2198p.m33983l(C6587j.m22363e());
                m38987e0.m38997Z(context.getApplicationInfo().icon).m39004S(2);
                if (C6583f.m22376d(context)) {
                    m38987e0.m38996a(C13431a.f34632a, resources.getString(C13432b.f34647o), pendingIntent);
                } else {
                    m38987e0.m39020C(pendingIntent);
                }
            } else {
                m38987e0.m38997Z(17301642).m38983g0(resources.getString(C13432b.f34640h)).m38973l0(System.currentTimeMillis()).m39020C(pendingIntent).m39019D(m34118e);
            }
            if (C6587j.m22360h()) {
                C2198p.m33983l(C6587j.m22360h());
                synchronized (f35882e) {
                    str2 = this.f35884c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                    String m34121b = C2148b0.m34121b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", m34121b, 4));
                    } else {
                        name = notificationChannel.getName();
                        if (!m34121b.contentEquals(name)) {
                            notificationChannel.setName(m34121b);
                            notificationManager.createNotificationChannel(notificationChannel);
                        }
                    }
                }
                m38987e0.m38961x(str2);
            }
            Notification m38984g = m38987e0.m38984g();
            if (i != 1 && i != 2 && i != 3) {
                i2 = 39789;
            } else {
                C13937h.f35889b.set(false);
                i2 = 10436;
            }
            notificationManager.notify(i2, m38984g);
        }
    }

    /* renamed from: s */
    final void m1128s(Context context) {
        new HandlerC13941l(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: t */
    public final boolean m1127t(Activity activity, InterfaceC0101f interfaceC0101f, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m1133n = m1133n(activity, i, AbstractDialogInterface$OnClickListenerC2163e0.m34049c(interfaceC0101f, mo1125a(activity, i, "d"), 2), onCancelListener);
        if (m1133n == null) {
            return false;
        }
        m1130q(activity, m1133n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: u */
    public final boolean m1126u(Context context, C13930a c13930a, int i) {
        PendingIntent m1137j;
        if (C7476b.m20605a(context) || (m1137j = m1137j(context, c13930a)) == null) {
            return false;
        }
        m1129r(context, c13930a.m1144r(), null, C12117e.m6133a(context, 0, GoogleApiActivity.m28246a(context, m1137j, i, true), C12117e.f31428a | 134217728));
        return true;
    }
}
