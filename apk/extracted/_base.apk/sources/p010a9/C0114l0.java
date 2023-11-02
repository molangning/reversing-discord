package p010a9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.collection.C0624a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.DesugarCollections;
import p351t9.HandlerC12609e;

/* renamed from: a9.l0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0114l0 extends Fragment implements InterfaceC0101f {

    /* renamed from: m */
    private static final WeakHashMap<FragmentActivity, WeakReference<C0114l0>> f477m = new WeakHashMap<>();

    /* renamed from: j */
    private final Map<String, LifecycleCallback> f478j = DesugarCollections.synchronizedMap(new C0624a());

    /* renamed from: k */
    private int f479k = 0;

    /* renamed from: l */
    private Bundle f480l;

    /* renamed from: f */
    public static C0114l0 m41127f(FragmentActivity fragmentActivity) {
        C0114l0 c0114l0;
        WeakHashMap<FragmentActivity, WeakReference<C0114l0>> weakHashMap = f477m;
        WeakReference<C0114l0> weakReference = weakHashMap.get(fragmentActivity);
        if (weakReference != null && (c0114l0 = weakReference.get()) != null) {
            return c0114l0;
        }
        try {
            C0114l0 c0114l02 = (C0114l0) fragmentActivity.getSupportFragmentManager().m36414j0("SupportLifecycleFragmentImpl");
            if (c0114l02 == null || c0114l02.isRemoving()) {
                c0114l02 = new C0114l0();
                fragmentActivity.getSupportFragmentManager().m36406m().m36355e(c0114l02, "SupportLifecycleFragmentImpl").mo36330h();
            }
            weakHashMap.put(fragmentActivity, new WeakReference<>(c0114l02));
            return c0114l02;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Override // p010a9.InterfaceC0101f
    /* renamed from: a */
    public final void mo41132a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f478j.containsKey(str)) {
            this.f478j.put(str, lifecycleCallback);
            if (this.f479k > 0) {
                new HandlerC12609e(Looper.getMainLooper()).post(new RunnableC0112k0(this, lifecycleCallback, str));
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
        return cls.cast(this.f478j.get(str));
    }

    @Override // p010a9.InterfaceC0101f
    /* renamed from: c */
    public final /* synthetic */ Activity mo41130c() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.m28234a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.mo28126e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f479k = 1;
        this.f480l = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f478j.entrySet()) {
            LifecycleCallback value = entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle(entry.getKey());
            } else {
                bundle2 = null;
            }
            value.mo28125f(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f479k = 5;
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.m28230g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f479k = 3;
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.mo28132h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f478j.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo28124i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f479k = 2;
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.mo28123j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f479k = 4;
        for (LifecycleCallback lifecycleCallback : this.f478j.values()) {
            lifecycleCallback.mo28122k();
        }
    }
}
