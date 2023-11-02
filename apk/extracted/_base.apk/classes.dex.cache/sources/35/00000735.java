package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SavedStateHandleController implements InterfaceC1695l {

    /* renamed from: j */
    private final String f4471j;

    /* renamed from: k */
    private boolean f4472k = false;

    /* renamed from: l */
    private final C1711x f4473l;

    public SavedStateHandleController(String str, C1711x c1711x) {
        this.f4471j = str;
        this.f4473l = c1711x;
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
            this.f4472k = false;
            lifecycleOwner.getLifecycle().mo36123c(this);
        }
    }

    /* renamed from: b */
    public void m36083b(SavedStateRegistry savedStateRegistry, Lifecycle lifecycle) {
        if (!this.f4472k) {
            this.f4472k = true;
            lifecycle.mo36125a(this);
            savedStateRegistry.m35311h(this.f4471j, this.f4473l.m36008d());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* renamed from: c */
    public C1711x m36082c() {
        return this.f4473l;
    }

    /* renamed from: d */
    public boolean m36081d() {
        return this.f4472k;
    }
}