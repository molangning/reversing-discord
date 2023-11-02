package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.C7687a1;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import io.sentry.util.C8233s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: j */
    private final Context f21109j;

    /* renamed from: k */
    C7703a f21110k;

    /* renamed from: l */
    private SentryAndroidOptions f21111l;

    /* renamed from: m */
    private final List<String> f21112m;

    /* renamed from: io.sentry.android.core.SystemEventsBreadcrumbsIntegration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C7703a extends BroadcastReceiver {

        /* renamed from: a */
        private final InterfaceC8025n0 f21113a;

        /* renamed from: b */
        private final InterfaceC8040o0 f21114b;

        C7703a(InterfaceC8025n0 interfaceC8025n0, InterfaceC8040o0 interfaceC8040o0) {
            this.f21113a = interfaceC8025n0;
            this.f21114b = interfaceC8040o0;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C7901e c7901e = new C7901e();
            c7901e.m19325p("system");
            c7901e.m19329l("device.event");
            String action = intent.getAction();
            String m18157c = C8233s.m18157c(action);
            if (m18157c != null) {
                c7901e.m19328m("action", m18157c);
            }
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            hashMap.put(str, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f21114b.mo18137a(EnumC8021m4.ERROR, th2, "%s key of the %s action threw an error.", str, action);
                    }
                }
                c7901e.m19328m("extras", hashMap);
            }
            c7901e.m19327n(EnumC8021m4.INFO);
            C7831b0 c7831b0 = new C7831b0();
            c7831b0.m19592j("android:intent", intent);
            this.f21113a.mo18266f(c7901e, c7831b0);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, m19954j());
    }

    /* renamed from: j */
    private static List<String> m19954j() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21111l = sentryAndroidOptions2;
        sentryAndroidOptions2.getLogger().mo18135c(EnumC8021m4.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f21111l.isEnableSystemEventBreadcrumbs()));
        if (this.f21111l.isEnableSystemEventBreadcrumbs()) {
            this.f21110k = new C7703a(interfaceC8025n0, this.f21111l.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            for (String str : this.f21112m) {
                intentFilter.addAction(str);
            }
            try {
                this.f21109j.registerReceiver(this.f21110k, intentFilter);
                this.f21111l.getLogger().mo18135c(EnumC8021m4.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                m19955i();
            } catch (Throwable th2) {
                this.f21111l.setEnableSystemEventBreadcrumbs(false);
                this.f21111l.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C7703a c7703a = this.f21110k;
        if (c7703a != null) {
            this.f21109j.unregisterReceiver(c7703a);
            this.f21110k = null;
            SentryAndroidOptions sentryAndroidOptions = this.f21111l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19955i() {
        C7687a1.m20046a(this);
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.f21109j = (Context) C8229o.m18169c(context, "Context is required");
        this.f21112m = (List) C8229o.m18169c(list, "Actions list is required");
    }
}