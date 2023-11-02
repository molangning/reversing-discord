package p010a9;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0624a;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.DesugarCollections;
import p351t9.HandlerC12609e;

/* renamed from: a9.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class FragmentC0110j0 extends Fragment implements InterfaceC0101f {

    /* renamed from: m */
    private static final WeakHashMap<Activity, WeakReference<FragmentC0110j0>> f470m = new WeakHashMap<>();

    /* renamed from: j */
    private final Map<String, LifecycleCallback> f471j = DesugarCollections.synchronizedMap(new C0624a());

    /* renamed from: k */
    private int f472k = 0;

    /* renamed from: l */
    private Bundle f473l;

    /* renamed from: f */
    public static FragmentC0110j0 m41134f(Activity activity) {
        FragmentC0110j0 fragmentC0110j0;
        WeakHashMap<Activity, WeakReference<FragmentC0110j0>> weakHashMap = f470m;
        WeakReference<FragmentC0110j0> weakReference = weakHashMap.get(activity);
        if (weakReference != null && (fragmentC0110j0 = weakReference.get()) != null) {
            return fragmentC0110j0;
        }
        try {
            FragmentC0110j0 fragmentC0110j02 = (FragmentC0110j0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (fragmentC0110j02 == null || fragmentC0110j02.isRemoving()) {
                fragmentC0110j02 = new FragmentC0110j0();
                activity.getFragmentManager().beginTransaction().add(fragmentC0110j02, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference<>(fragmentC0110j02));
            return fragmentC0110j02;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // p010a9.InterfaceC0101f
    /* renamed from: a */
    public final void mo41132a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f471j.containsKey(str)) {
            this.f471j.put(str, lifecycleCallback);
            if (this.f472k > 0) {
                new HandlerC12609e(Looper.getMainLooper()).post(new RunnableC0108i0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 59);
        sb2.append("LifecycleCallback with tag ");
        sb2.append(str);
        sb2.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // p010a9.InterfaceC0101f
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo41131b(String str, Class<T> cls) {
        return cls.cast(this.f471j.get(str));
    }

    @Override // p010a9.InterfaceC0101f
    /* renamed from: c */
    public final Activity mo41130c() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.m28234a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.mo28126e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f472k = 1;
        this.f473l = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f471j.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo28125f(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f472k = 5;
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.m28230g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f472k = 3;
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.mo28132h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f471j.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo28124i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f472k = 2;
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.mo28123j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f472k = 4;
        for (LifecycleCallback lifecycleCallback : this.f471j.values()) {
            lifecycleCallback.mo28122k();
        }
    }
}