package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.FragmentC1705v;
import androidx.lifecycle.Lifecycle;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {

    /* renamed from: r */
    private static final ProcessLifecycleOwner f4425r = new ProcessLifecycleOwner();

    /* renamed from: s */
    public static final /* synthetic */ int f4426s = 0;

    /* renamed from: n */
    private Handler f4431n;

    /* renamed from: j */
    private int f4427j = 0;

    /* renamed from: k */
    private int f4428k = 0;

    /* renamed from: l */
    private boolean f4429l = true;

    /* renamed from: m */
    private boolean f4430m = true;

    /* renamed from: o */
    private final LifecycleRegistry f4432o = new LifecycleRegistry(this);

    /* renamed from: p */
    private Runnable f4433p = new RunnableC1657a();

    /* renamed from: q */
    FragmentC1705v.InterfaceC1706a f4434q = new C1658b();

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1657a implements Runnable {
        RunnableC1657a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner.this.m36089f();
            ProcessLifecycleOwner.this.m36088g();
        }
    }

    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1658b implements FragmentC1705v.InterfaceC1706a {
        C1658b() {
        }

        @Override // androidx.lifecycle.FragmentC1705v.InterfaceC1706a
        /* renamed from: b */
        public void mo36015b() {
            ProcessLifecycleOwner.this.m36093b();
        }

        @Override // androidx.lifecycle.FragmentC1705v.InterfaceC1706a
        /* renamed from: c */
        public void mo36014c() {
        }

        @Override // androidx.lifecycle.FragmentC1705v.InterfaceC1706a
        /* renamed from: d */
        public void mo36013d() {
            ProcessLifecycleOwner.this.m36092c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1659c extends C1680d {

        /* renamed from: androidx.lifecycle.ProcessLifecycleOwner$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1660a extends C1680d {
            C1660a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                ProcessLifecycleOwner.this.m36093b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                ProcessLifecycleOwner.this.m36092c();
            }
        }

        C1659c() {
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC1705v.m36018f(activity).m36016h(ProcessLifecycleOwner.this.f4434q);
            }
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ProcessLifecycleOwner.this.m36094a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C1660a());
        }

        @Override // androidx.lifecycle.C1680d, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ProcessLifecycleOwner.this.m36091d();
        }
    }

    private ProcessLifecycleOwner() {
    }

    /* renamed from: h */
    public static LifecycleOwner m36087h() {
        return f4425r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static void m36086i(Context context) {
        f4425r.m36090e(context);
    }

    /* renamed from: a */
    void m36094a() {
        int i = this.f4428k - 1;
        this.f4428k = i;
        if (i == 0) {
            this.f4431n.postDelayed(this.f4433p, 700L);
        }
    }

    /* renamed from: b */
    void m36093b() {
        int i = this.f4428k + 1;
        this.f4428k = i;
        if (i == 1) {
            if (this.f4429l) {
                this.f4432o.m36118h(Lifecycle.EnumC1651b.ON_RESUME);
                this.f4429l = false;
                return;
            }
            this.f4431n.removeCallbacks(this.f4433p);
        }
    }

    /* renamed from: c */
    void m36092c() {
        int i = this.f4427j + 1;
        this.f4427j = i;
        if (i == 1 && this.f4430m) {
            this.f4432o.m36118h(Lifecycle.EnumC1651b.ON_START);
            this.f4430m = false;
        }
    }

    /* renamed from: d */
    void m36091d() {
        this.f4427j--;
        m36088g();
    }

    /* renamed from: e */
    void m36090e(Context context) {
        this.f4431n = new Handler();
        this.f4432o.m36118h(Lifecycle.EnumC1651b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C1659c());
    }

    /* renamed from: f */
    void m36089f() {
        if (this.f4428k == 0) {
            this.f4429l = true;
            this.f4432o.m36118h(Lifecycle.EnumC1651b.ON_PAUSE);
        }
    }

    /* renamed from: g */
    void m36088g() {
        if (this.f4427j == 0 && this.f4429l) {
            this.f4432o.m36118h(Lifecycle.EnumC1651b.ON_STOP);
            this.f4430m = true;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f4432o;
    }
}
