package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* renamed from: androidx.lifecycle.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FragmentC1705v extends Fragment {

    /* renamed from: j */
    private InterfaceC1706a f4514j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1706a {
        /* renamed from: b */
        void mo36015b();

        /* renamed from: c */
        void mo36014c();

        /* renamed from: d */
        void mo36013d();
    }

    /* renamed from: androidx.lifecycle.v$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1707b implements Application.ActivityLifecycleCallbacks {
        C1707b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new C1707b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            FragmentC1705v.m36023a(activity, Lifecycle.EnumC1651b.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* renamed from: a */
    static void m36023a(Activity activity, Lifecycle.EnumC1651b enumC1651b) {
        if (activity instanceof InterfaceC1700q) {
            ((InterfaceC1700q) activity).getLifecycle().m36118h(enumC1651b);
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
            if (lifecycle instanceof LifecycleRegistry) {
                ((LifecycleRegistry) lifecycle).m36118h(enumC1651b);
            }
        }
    }

    /* renamed from: b */
    private void m36022b(Lifecycle.EnumC1651b enumC1651b) {
        if (Build.VERSION.SDK_INT < 29) {
            m36023a(getActivity(), enumC1651b);
        }
    }

    /* renamed from: c */
    private void m36021c(InterfaceC1706a interfaceC1706a) {
        if (interfaceC1706a != null) {
            interfaceC1706a.mo36014c();
        }
    }

    /* renamed from: d */
    private void m36020d(InterfaceC1706a interfaceC1706a) {
        if (interfaceC1706a != null) {
            interfaceC1706a.mo36015b();
        }
    }

    /* renamed from: e */
    private void m36019e(InterfaceC1706a interfaceC1706a) {
        if (interfaceC1706a != null) {
            interfaceC1706a.mo36013d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static FragmentC1705v m36018f(Activity activity) {
        return (FragmentC1705v) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    /* renamed from: g */
    public static void m36017g(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            C1707b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC1705v(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36016h(InterfaceC1706a interfaceC1706a) {
        this.f4514j = interfaceC1706a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m36021c(this.f4514j);
        m36022b(Lifecycle.EnumC1651b.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m36022b(Lifecycle.EnumC1651b.ON_DESTROY);
        this.f4514j = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m36022b(Lifecycle.EnumC1651b.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m36020d(this.f4514j);
        m36022b(Lifecycle.EnumC1651b.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m36019e(this.f4514j);
        m36022b(Lifecycle.EnumC1651b.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m36022b(Lifecycle.EnumC1651b.ON_STOP);
    }
}
