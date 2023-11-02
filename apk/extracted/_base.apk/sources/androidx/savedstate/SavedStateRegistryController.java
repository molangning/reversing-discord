package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p237n0.InterfaceC10480c;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0017"}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Ln0/c;", "a", "Ln0/c;", "owner", "Landroidx/savedstate/SavedStateRegistry;", "b", "Landroidx/savedstate/SavedStateRegistry;", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "", "Z", "attached", "<init>", "(Ln0/c;)V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: d */
    public static final C1823a f4990d = new C1823a(null);

    /* renamed from: a */
    private final InterfaceC10480c f4991a;

    /* renamed from: b */
    private final SavedStateRegistry f4992b;

    /* renamed from: c */
    private boolean f4993c;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistryController$a;", "", "Ln0/c;", "owner", "Landroidx/savedstate/SavedStateRegistryController;", "a", "<init>", "()V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.SavedStateRegistryController$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1823a {
        private C1823a() {
        }

        public /* synthetic */ C1823a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SavedStateRegistryController m35302a(InterfaceC10480c owner) {
            C9612q.m13917h(owner, "owner");
            return new SavedStateRegistryController(owner, null);
        }
    }

    private SavedStateRegistryController(InterfaceC10480c interfaceC10480c) {
        this.f4991a = interfaceC10480c;
        this.f4992b = new SavedStateRegistry();
    }

    public /* synthetic */ SavedStateRegistryController(InterfaceC10480c interfaceC10480c, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC10480c);
    }

    /* renamed from: a */
    public static final SavedStateRegistryController m35307a(InterfaceC10480c interfaceC10480c) {
        return f4990d.m35302a(interfaceC10480c);
    }

    /* renamed from: b */
    public final SavedStateRegistry m35306b() {
        return this.f4992b;
    }

    /* renamed from: c */
    public final void m35305c() {
        boolean z;
        Lifecycle lifecycle = this.f4991a.getLifecycle();
        C9612q.m13918g(lifecycle, "owner.lifecycle");
        if (lifecycle.mo36124b() == Lifecycle.State.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lifecycle.mo36125a(new Recreator(this.f4991a));
            this.f4992b.m35314e(lifecycle);
            this.f4993c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    /* renamed from: d */
    public final void m35304d(Bundle bundle) {
        if (!this.f4993c) {
            m35305c();
        }
        Lifecycle lifecycle = this.f4991a.getLifecycle();
        C9612q.m13918g(lifecycle, "owner.lifecycle");
        if (!lifecycle.mo36124b().m36132a(Lifecycle.State.STARTED)) {
            this.f4992b.m35313f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.mo36124b()).toString());
    }

    /* renamed from: e */
    public final void m35303e(Bundle outBundle) {
        C9612q.m13917h(outBundle, "outBundle");
        this.f4992b.m35312g(outBundle);
    }
}
