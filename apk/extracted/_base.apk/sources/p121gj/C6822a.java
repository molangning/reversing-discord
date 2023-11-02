package p121gj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10722h0;
import net.time4j.C10785p0;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.base.AbstractC10617d;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.InterfaceC10808k;
import p184jj.EnumC8979e;
import p202kj.C9479c;

/* renamed from: gj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C6822a {

    /* renamed from: a */
    private static final AtomicBoolean f19032a = new AtomicBoolean(false);

    /* renamed from: b */
    private static final AtomicBoolean f19033b = new AtomicBoolean(false);

    /* renamed from: gj.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class RunnableC6824b implements Runnable {
        private RunnableC6824b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime = System.nanoTime();
            InterfaceC10808k m10020q = C10835p.m10020q(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
            Locale locale = Locale.getDefault();
            try {
                C10582a0 m10226b = C10785p0.m10226b();
                m10020q = AbstractC10809l.m10148O().mo10125z();
                Log.i("TIME4A", "System time zone at start: [" + m10020q.mo10035a() + "]");
                Log.i("TIME4A", "System locale at start: [" + locale.toString() + "]");
                EnumC8979e enumC8979e = EnumC8979e.FULL;
                Log.i("TIME4A", C9479c.m14661B(enumC8979e, enumC8979e, locale, m10020q).m14631l(m10226b));
                Log.i("TIME4A", "Prefetch thread consumed (in ms): " + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Throwable th2) {
                Log.e("TIME4A", "Error on prefetch thread with: time zone=" + m10020q.mo10035a() + ", locale=" + locale + "!", th2);
                throw new IllegalStateException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gj.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C6825c extends BroadcastReceiver {
        private C6825c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC10809l.C10811b.m10123a();
            Log.i("TIME4A", "Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [" + AbstractC10809l.m10148O().mo10125z().mo10035a() + "]. Original tz-id reported by Android: [" + intent.getStringExtra("time-zone") + "]");
        }
    }

    /* renamed from: a */
    public static void m21860a(Context context, Runnable runnable) {
        long nanoTime = System.nanoTime();
        m21858c(context, null);
        m21857d(context.getApplicationContext());
        C10722h0 m10676t0 = C10697f0.m10713M0(2021, 3, 27).m10676t0(C10711g0.m10614J0());
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + m10676t0.m10484j0() + ")");
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - nanoTime) / 1000000));
    }

    /* renamed from: b */
    public static void m21859b(Context context, boolean z) {
        m21860a(context, z ? new RunnableC6824b() : null);
    }

    /* renamed from: c */
    public static void m21858c(Context context, InterfaceC6826b interfaceC6826b) {
        if (!f19032a.getAndSet(true)) {
            System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
            ((AndroidResourceLoader) AbstractC10617d.m11026c()).m11074j(context, interfaceC6826b);
        }
    }

    /* renamed from: d */
    public static void m21857d(Context context) {
        if (context != null && !f19033b.getAndSet(true)) {
            System.setProperty("net.time4j.allow.system.tz.override", "true");
            context.registerReceiver(new C6825c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
        }
    }
}
