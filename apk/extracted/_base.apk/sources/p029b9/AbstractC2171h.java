package p029b9;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: b9.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC2171h {

    /* renamed from: a */
    private static int f6137a = 4225;

    /* renamed from: b */
    private static final Object f6138b = new Object();

    /* renamed from: c */
    private static C2189m1 f6139c = null;

    /* renamed from: d */
    static HandlerThread f6140d = null;

    /* renamed from: e */
    private static boolean f6141e = false;

    /* renamed from: a */
    public static int m34038a() {
        return f6137a;
    }

    /* renamed from: b */
    public static AbstractC2171h m34037b(Context context) {
        Looper mainLooper;
        synchronized (f6138b) {
            if (f6139c == null) {
                Context applicationContext = context.getApplicationContext();
                if (f6141e) {
                    mainLooper = m34036c().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                f6139c = new C2189m1(applicationContext, mainLooper);
            }
        }
        return f6139c;
    }

    /* renamed from: c */
    public static HandlerThread m34036c() {
        synchronized (f6138b) {
            HandlerThread handlerThread = f6140d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f6140d = handlerThread2;
            handlerThread2.start();
            return f6140d;
        }
    }

    /* renamed from: d */
    protected abstract void mo34012d(C2176i1 c2176i1, ServiceConnection serviceConnection, String str);

    /* renamed from: e */
    public final void m34035e(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        mo34012d(new C2176i1(str, str2, i, z), serviceConnection, str3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo34011f(C2176i1 c2176i1, ServiceConnection serviceConnection, String str, Executor executor);
}
