package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.AbstractC1681d0;
import androidx.lifecycle.C1683e0;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1607j extends AbstractC1681d0 {

    /* renamed from: k */
    private static final ViewModelProvider.Factory f4241k = new C1608a();

    /* renamed from: g */
    private final boolean f4245g;

    /* renamed from: d */
    private final HashMap<String, Fragment> f4242d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C1607j> f4243e = new HashMap<>();

    /* renamed from: f */
    private final HashMap<String, ViewModelStore> f4244f = new HashMap<>();

    /* renamed from: h */
    private boolean f4246h = false;

    /* renamed from: i */
    private boolean f4247i = false;

    /* renamed from: j */
    private boolean f4248j = false;

    /* renamed from: androidx.fragment.app.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1608a implements ViewModelProvider.Factory {
        C1608a() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: a */
        public /* synthetic */ AbstractC1681d0 mo16840a(Class cls, CreationExtras creationExtras) {
            return C1683e0.m36041b(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        /* renamed from: b */
        public <T extends AbstractC1681d0> T mo16839b(Class<T> cls) {
            return new C1607j(true);
        }
    }

    public C1607j(boolean z) {
        this.f4245g = z;
    }

    /* renamed from: j */
    public static C1607j m36270j(ViewModelStore viewModelStore) {
        return (C1607j) new ViewModelProvider(viewModelStore, f4241k).m36080a(C1607j.class);
    }

    @Override // androidx.lifecycle.AbstractC1681d0
    /* renamed from: d */
    public void mo35975d() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4246h = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1607j.class != obj.getClass()) {
            return false;
        }
        C1607j c1607j = (C1607j) obj;
        if (this.f4242d.equals(c1607j.f4242d) && this.f4243e.equals(c1607j.f4243e) && this.f4244f.equals(c1607j.f4244f)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m36274f(Fragment fragment) {
        if (this.f4248j) {
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (this.f4242d.containsKey(fragment.mWho)) {
        } else {
            this.f4242d.put(fragment.mWho, fragment);
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    /* renamed from: g */
    public void m36273g(Fragment fragment) {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C1607j c1607j = this.f4243e.get(fragment.mWho);
        if (c1607j != null) {
            c1607j.mo35975d();
            this.f4243e.remove(fragment.mWho);
        }
        ViewModelStore viewModelStore = this.f4244f.get(fragment.mWho);
        if (viewModelStore != null) {
            viewModelStore.m36071a();
            this.f4244f.remove(fragment.mWho);
        }
    }

    /* renamed from: h */
    public Fragment m36272h(String str) {
        return this.f4242d.get(str);
    }

    public int hashCode() {
        return (((this.f4242d.hashCode() * 31) + this.f4243e.hashCode()) * 31) + this.f4244f.hashCode();
    }

    /* renamed from: i */
    public C1607j m36271i(Fragment fragment) {
        C1607j c1607j = this.f4243e.get(fragment.mWho);
        if (c1607j == null) {
            C1607j c1607j2 = new C1607j(this.f4245g);
            this.f4243e.put(fragment.mWho, c1607j2);
            return c1607j2;
        }
        return c1607j;
    }

    /* renamed from: k */
    public Collection<Fragment> m36269k() {
        return new ArrayList(this.f4242d.values());
    }

    /* renamed from: l */
    public ViewModelStore m36268l(Fragment fragment) {
        ViewModelStore viewModelStore = this.f4244f.get(fragment.mWho);
        if (viewModelStore == null) {
            ViewModelStore viewModelStore2 = new ViewModelStore();
            this.f4244f.put(fragment.mWho, viewModelStore2);
            return viewModelStore2;
        }
        return viewModelStore;
    }

    /* renamed from: m */
    public boolean m36267m() {
        return this.f4246h;
    }

    /* renamed from: n */
    public void m36266n(Fragment fragment) {
        boolean z;
        if (this.f4248j) {
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if (this.f4242d.remove(fragment.mWho) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    /* renamed from: o */
    public void m36265o(boolean z) {
        this.f4248j = z;
    }

    /* renamed from: p */
    public boolean m36264p(Fragment fragment) {
        if (!this.f4242d.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f4245g) {
            return this.f4246h;
        }
        return !this.f4247i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<Fragment> it = this.f4242d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f4243e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f4244f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}