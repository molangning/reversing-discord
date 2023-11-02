package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: androidx.core.app.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0802f {

    /* renamed from: a */
    protected static final Class<?> f3204a;

    /* renamed from: b */
    protected static final Field f3205b;

    /* renamed from: c */
    protected static final Field f3206c;

    /* renamed from: d */
    protected static final Method f3207d;

    /* renamed from: e */
    protected static final Method f3208e;

    /* renamed from: f */
    protected static final Method f3209f;

    /* renamed from: g */
    private static final Handler f3210g = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0803a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C0806d f3211j;

        /* renamed from: k */
        final /* synthetic */ Object f3212k;

        RunnableC0803a(C0806d c0806d, Object obj) {
            this.f3211j = c0806d;
            this.f3212k = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3211j.f3217j = this.f3212k;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0804b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Application f3213j;

        /* renamed from: k */
        final /* synthetic */ C0806d f3214k;

        RunnableC0804b(Application application, C0806d c0806d) {
            this.f3213j = application;
            this.f3214k = c0806d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3213j.unregisterActivityLifecycleCallbacks(this.f3214k);
        }
    }

    /* renamed from: androidx.core.app.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0805c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Object f3215j;

        /* renamed from: k */
        final /* synthetic */ Object f3216k;

        RunnableC0805c(Object obj, Object obj2) {
            this.f3215j = obj;
            this.f3216k = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = C0802f.f3207d;
                if (method != null) {
                    method.invoke(this.f3215j, this.f3216k, Boolean.FALSE, "AppCompat recreation");
                } else {
                    C0802f.f3208e.invoke(this.f3215j, this.f3216k, Boolean.FALSE);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.app.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0806d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: j */
        Object f3217j;

        /* renamed from: k */
        private Activity f3218k;

        /* renamed from: l */
        private final int f3219l;

        /* renamed from: m */
        private boolean f3220m = false;

        /* renamed from: n */
        private boolean f3221n = false;

        /* renamed from: o */
        private boolean f3222o = false;

        C0806d(Activity activity) {
            this.f3218k = activity;
            this.f3219l = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3218k == activity) {
                this.f3218k = null;
                this.f3221n = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f3221n && !this.f3222o && !this.f3220m && C0802f.m38615h(this.f3217j, this.f3219l, activity)) {
                this.f3222o = true;
                this.f3217j = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3218k == activity) {
                this.f3220m = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> m38622a = m38622a();
        f3204a = m38622a;
        f3205b = m38621b();
        f3206c = m38617f();
        f3207d = m38619d(m38622a);
        f3208e = m38620c(m38622a);
        f3209f = m38618e(m38622a);
    }

    /* renamed from: a */
    private static Class<?> m38622a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Field m38621b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m38620c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Method m38619d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static Method m38618e(Class<?> cls) {
        if (m38616g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: f */
    private static Field m38617f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static boolean m38616g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* renamed from: h */
    protected static boolean m38615h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f3206c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                f3210g.postAtFrontOfQueue(new RunnableC0805c(f3205b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    /* renamed from: i */
    public static boolean m38614i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (m38616g() && f3209f == null) {
            return false;
        } else {
            if (f3208e == null && f3207d == null) {
                return false;
            }
            try {
                Object obj2 = f3206c.get(activity);
                if (obj2 == null || (obj = f3205b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                C0806d c0806d = new C0806d(activity);
                application.registerActivityLifecycleCallbacks(c0806d);
                Handler handler = f3210g;
                handler.post(new RunnableC0803a(c0806d, obj2));
                if (m38616g()) {
                    Method method = f3209f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new RunnableC0804b(application, c0806d));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}