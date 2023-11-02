package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.C1686g;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.InterfaceC1688h;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import p237n0.InterfaceC10480c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FragmentViewLifecycleOwner implements InterfaceC1688h, InterfaceC10480c, InterfaceC1687g0 {

    /* renamed from: j */
    private final Fragment f4145j;

    /* renamed from: k */
    private final ViewModelStore f4146k;

    /* renamed from: l */
    private LifecycleRegistry f4147l = null;

    /* renamed from: m */
    private SavedStateRegistryController f4148m = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore) {
        this.f4145j = fragment;
        this.f4146k = viewModelStore;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36346a(Lifecycle.EnumC1651b enumC1651b) {
        this.f4147l.m36118h(enumC1651b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36345b() {
        if (this.f4147l == null) {
            this.f4147l = new LifecycleRegistry(this);
            this.f4148m = SavedStateRegistryController.m35307a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m36344c() {
        return this.f4147l != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36343d(Bundle bundle) {
        this.f4148m.m35304d(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36342e(Bundle bundle) {
        this.f4148m.m35303e(bundle);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36341f(Lifecycle.State state) {
        this.f4147l.m36111o(state);
    }

    @Override // androidx.lifecycle.InterfaceC1688h
    public /* synthetic */ CreationExtras getDefaultViewModelCreationExtras() {
        return C1686g.m36038a(this);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        m36345b();
        return this.f4147l;
    }

    @Override // p237n0.InterfaceC10480c
    public SavedStateRegistry getSavedStateRegistry() {
        m36345b();
        return this.f4148m.m35306b();
    }

    @Override // androidx.lifecycle.InterfaceC1687g0
    public ViewModelStore getViewModelStore() {
        m36345b();
        return this.f4146k;
    }
}
