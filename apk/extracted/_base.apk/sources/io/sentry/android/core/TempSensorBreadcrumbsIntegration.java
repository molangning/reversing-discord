package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import io.sentry.C7687a1;
import io.sentry.C7831b0;
import io.sentry.C7901e;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TempSensorBreadcrumbsIntegration implements Integration, Closeable, SensorEventListener {

    /* renamed from: j */
    private final Context f21115j;

    /* renamed from: k */
    private InterfaceC8025n0 f21116k;

    /* renamed from: l */
    private SentryAndroidOptions f21117l;

    /* renamed from: m */
    SensorManager f21118m;

    public TempSensorBreadcrumbsIntegration(Context context) {
        this.f21115j = (Context) C8229o.m18169c(context, "Context is required");
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        SentryAndroidOptions sentryAndroidOptions;
        this.f21116k = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        if (c8132r4 instanceof SentryAndroidOptions) {
            sentryAndroidOptions = (SentryAndroidOptions) c8132r4;
        } else {
            sentryAndroidOptions = null;
        }
        SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f21117l = sentryAndroidOptions2;
        InterfaceC8040o0 logger = sentryAndroidOptions2.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f21117l.isEnableSystemEventBreadcrumbs()));
        if (this.f21117l.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f21115j.getSystemService("sensor");
                this.f21118m = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f21118m.registerListener(this, defaultSensor, 3);
                        c8132r4.getLogger().mo18135c(enumC8021m4, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                        m19953i();
                    } else {
                        this.f21117l.getLogger().mo18135c(EnumC8021m4.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f21117l.getLogger().mo18135c(EnumC8021m4.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th2) {
                c8132r4.getLogger().mo18137a(EnumC8021m4.ERROR, th2, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SensorManager sensorManager = this.f21118m;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f21118m = null;
            SentryAndroidOptions sentryAndroidOptions = this.f21117l;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo18135c(EnumC8021m4.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m19953i() {
        C7687a1.m20046a(this);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr != null && fArr.length != 0 && fArr[0] != 0.0f && this.f21116k != null) {
            C7901e c7901e = new C7901e();
            c7901e.m19325p("system");
            c7901e.m19329l("device.event");
            c7901e.m19328m("action", "TYPE_AMBIENT_TEMPERATURE");
            c7901e.m19328m("accuracy", Integer.valueOf(sensorEvent.accuracy));
            c7901e.m19328m("timestamp", Long.valueOf(sensorEvent.timestamp));
            c7901e.m19327n(EnumC8021m4.INFO);
            c7901e.m19328m("degree", Float.valueOf(sensorEvent.values[0]));
            C7831b0 c7831b0 = new C7831b0();
            c7831b0.m19592j("android:sensorEvent", sensorEvent);
            this.f21116k.mo18266f(c7901e, c7831b0);
        }
    }
}
