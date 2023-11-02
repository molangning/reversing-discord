package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p165j.C8771b;
import p237n0.InterfaceC10480c;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0019\u0005\nB\t\b\u0000¢\u0006\u0004\b,\u0010-J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001fR$\u0010#\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u001c8G@BX\u0086\u000e¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&R\"\u0010+\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b(\u0010$\"\u0004\b)\u0010*¨\u0006."}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "", "key", "Landroid/os/Bundle;", "b", "Landroidx/savedstate/SavedStateRegistry$c;", "provider", "", "h", "c", "Ljava/lang/Class;", "Landroidx/savedstate/SavedStateRegistry$a;", "clazz", "i", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "e", "(Landroidx/lifecycle/Lifecycle;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "Lj/b;", "a", "Lj/b;", "components", "", "Z", "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "d", "isRestored", "()Z", "Landroidx/savedstate/Recreator$b;", "Landroidx/savedstate/Recreator$b;", "recreatorProvider", "isAllowingSavingState$savedstate_release", "setAllowingSavingState$savedstate_release", "(Z)V", "isAllowingSavingState", "<init>", "()V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SavedStateRegistry {

    /* renamed from: g */
    private static final C1821b f4983g = new C1821b(null);

    /* renamed from: b */
    private boolean f4985b;

    /* renamed from: c */
    private Bundle f4986c;

    /* renamed from: d */
    private boolean f4987d;

    /* renamed from: e */
    private Recreator.C1819b f4988e;

    /* renamed from: a */
    private final C8771b<String, InterfaceC1822c> f4984a = new C8771b<>();

    /* renamed from: f */
    private boolean f4989f = true;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistry$a;", "", "Ln0/c;", "owner", "", "a", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1820a {
        /* renamed from: a */
        void mo35309a(InterfaceC10480c interfaceC10480c);
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistry$b;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C1821b {
        private C1821b() {
        }

        public /* synthetic */ C1821b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, m14357d2 = {"Landroidx/savedstate/SavedStateRegistry$c;", "", "Landroid/os/Bundle;", "a", "savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.savedstate.SavedStateRegistry$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1822c {
        /* renamed from: a */
        Bundle mo35308a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m35315d(SavedStateRegistry this$0, LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b event) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(lifecycleOwner, "<anonymous parameter 0>");
        C9612q.m13917h(event, "event");
        if (event == Lifecycle.EnumC1651b.ON_START) {
            this$0.f4989f = true;
        } else if (event == Lifecycle.EnumC1651b.ON_STOP) {
            this$0.f4989f = false;
        }
    }

    /* renamed from: b */
    public final Bundle m35317b(String key) {
        Bundle bundle;
        C9612q.m13917h(key, "key");
        if (this.f4987d) {
            Bundle bundle2 = this.f4986c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(key);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f4986c;
            if (bundle3 != null) {
                bundle3.remove(key);
            }
            Bundle bundle4 = this.f4986c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f4986c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final InterfaceC1822c m35316c(String key) {
        C9612q.m13917h(key, "key");
        Iterator<Map.Entry<String, InterfaceC1822c>> it = this.f4984a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, InterfaceC1822c> components = it.next();
            C9612q.m13918g(components, "components");
            InterfaceC1822c value = components.getValue();
            if (C9612q.m13922c(components.getKey(), key)) {
                return value;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m35314e(Lifecycle lifecycle) {
        C9612q.m13917h(lifecycle, "lifecycle");
        if (!this.f4985b) {
            lifecycle.mo36125a(new InterfaceC1695l() { // from class: n0.b
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public final void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                    SavedStateRegistry.m35315d(SavedStateRegistry.this, lifecycleOwner, enumC1651b);
                }
            });
            this.f4985b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void m35313f(Bundle bundle) {
        Bundle bundle2;
        if (this.f4985b) {
            if (!this.f4987d) {
                if (bundle != null) {
                    bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                } else {
                    bundle2 = null;
                }
                this.f4986c = bundle2;
                this.f4987d = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    /* renamed from: g */
    public final void m35312g(Bundle outBundle) {
        C9612q.m13917h(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4986c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C8771b<String, InterfaceC1822c>.C8775d m17286e = this.f4984a.m17286e();
        C9612q.m13918g(m17286e, "this.components.iteratorWithAdditions()");
        while (m17286e.hasNext()) {
            Map.Entry next = m17286e.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC1822c) next.getValue()).mo35308a());
        }
        if (!bundle.isEmpty()) {
            outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
    }

    /* renamed from: h */
    public final void m35311h(String key, InterfaceC1822c provider) {
        boolean z;
        C9612q.m13917h(key, "key");
        C9612q.m13917h(provider, "provider");
        if (this.f4984a.mo17283k(key, provider) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    /* renamed from: i */
    public final void m35310i(Class<? extends InterfaceC1820a> clazz) {
        C9612q.m13917h(clazz, "clazz");
        if (this.f4989f) {
            Recreator.C1819b c1819b = this.f4988e;
            if (c1819b == null) {
                c1819b = new Recreator.C1819b(this);
            }
            this.f4988e = c1819b;
            try {
                clazz.getDeclaredConstructor(new Class[0]);
                Recreator.C1819b c1819b2 = this.f4988e;
                if (c1819b2 != null) {
                    String name = clazz.getName();
                    C9612q.m13918g(name, "clazz.name");
                    c1819b2.m35319b(name);
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
