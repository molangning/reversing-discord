package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import p187k0.C9033b;
import p237n0.InterfaceC10480c;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u001a\f\u0010\u000f\u001a\u00020\f*\u00020\u000eH\u0007\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011\"\u0018\u0010\u0018\u001a\u00020\u0015*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001c\u001a\u00020\u0019*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, m14357d2 = {"Ln0/c;", "Landroidx/lifecycle/g0;", "T", "", "c", "(Ln0/c;)V", "savedStateRegistryOwner", "viewModelStoreOwner", "", "key", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/x;", "b", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "SAVED_STATE_REGISTRY_OWNER_KEY", "VIEW_MODEL_STORE_OWNER_KEY", "DEFAULT_ARGS_KEY", "Landroidx/lifecycle/a0;", "e", "(Landroidx/lifecycle/g0;)Landroidx/lifecycle/a0;", "savedStateHandlesVM", "Landroidx/lifecycle/z;", "d", "(Ln0/c;)Landroidx/lifecycle/z;", "savedStateHandlesProvider", "lifecycle-viewmodel-savedstate_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1713y {

    /* renamed from: a */
    public static final CreationExtras.InterfaceC1709b<InterfaceC10480c> f4525a = new C1715b();

    /* renamed from: b */
    public static final CreationExtras.InterfaceC1709b<InterfaceC1687g0> f4526b = new C1716c();

    /* renamed from: c */
    public static final CreationExtras.InterfaceC1709b<Bundle> f4527c = new C1714a();

    @Metadata(m14358d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m14357d2 = {"androidx/lifecycle/y$a", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1714a implements CreationExtras.InterfaceC1709b<Bundle> {
        C1714a() {
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m14357d2 = {"androidx/lifecycle/y$b", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Ln0/c;", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1715b implements CreationExtras.InterfaceC1709b<InterfaceC10480c> {
        C1715b() {
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m14357d2 = {"androidx/lifecycle/y$c", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "Landroidx/lifecycle/g0;", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.y$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1716c implements CreationExtras.InterfaceC1709b<InterfaceC1687g0> {
        C1716c() {
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroidx/lifecycle/a0;", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/a0;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.y$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1717d extends AbstractC9614s implements Function1<CreationExtras, C1673a0> {

        /* renamed from: j */
        public static final C1717d f4528j = new C1717d();

        C1717d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C1673a0 invoke(CreationExtras initializer) {
            C9612q.m13917h(initializer, "$this$initializer");
            return new C1673a0();
        }
    }

    /* renamed from: a */
    public static final C1711x m36003a(CreationExtras creationExtras) {
        C9612q.m13917h(creationExtras, "<this>");
        InterfaceC10480c interfaceC10480c = (InterfaceC10480c) creationExtras.mo16836a(f4525a);
        if (interfaceC10480c != null) {
            InterfaceC1687g0 interfaceC1687g0 = (InterfaceC1687g0) creationExtras.mo16836a(f4526b);
            if (interfaceC1687g0 != null) {
                Bundle bundle = (Bundle) creationExtras.mo16836a(f4527c);
                String str = (String) creationExtras.mo16836a(ViewModelProvider.C1667b.f4485c);
                if (str != null) {
                    return m36002b(interfaceC10480c, interfaceC1687g0, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* renamed from: b */
    private static final C1711x m36002b(InterfaceC10480c interfaceC10480c, InterfaceC1687g0 interfaceC1687g0, String str, Bundle bundle) {
        C1718z m36000d = m36000d(interfaceC10480c);
        C1673a0 m35999e = m35999e(interfaceC1687g0);
        C1711x c1711x = m35999e.m36067f().get(str);
        if (c1711x == null) {
            C1711x m36005a = C1711x.f4518f.m36005a(m36000d.m35997b(str), bundle);
            m35999e.m36067f().put(str, m36005a);
            return m36005a;
        }
        return c1711x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <T extends InterfaceC10480c & InterfaceC1687g0> void m36001c(T t) {
        boolean z;
        C9612q.m13917h(t, "<this>");
        Lifecycle.State mo36124b = t.getLifecycle().mo36124b();
        C9612q.m13918g(mo36124b, "lifecycle.currentState");
        if (mo36124b != Lifecycle.State.INITIALIZED && mo36124b != Lifecycle.State.CREATED) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (t.getSavedStateRegistry().m35316c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
                C1718z c1718z = new C1718z(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().m35311h("androidx.lifecycle.internal.SavedStateHandlesProvider", c1718z);
                t.getLifecycle().mo36125a(new SavedStateHandleAttacher(c1718z));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: d */
    public static final C1718z m36000d(InterfaceC10480c interfaceC10480c) {
        C1718z c1718z;
        C9612q.m13917h(interfaceC10480c, "<this>");
        SavedStateRegistry.InterfaceC1822c m35316c = interfaceC10480c.getSavedStateRegistry().m35316c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        if (m35316c instanceof C1718z) {
            c1718z = (C1718z) m35316c;
        } else {
            c1718z = null;
        }
        if (c1718z != null) {
            return c1718z;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    /* renamed from: e */
    public static final C1673a0 m35999e(InterfaceC1687g0 interfaceC1687g0) {
        C9612q.m13917h(interfaceC1687g0, "<this>");
        C9033b c9033b = new C9033b();
        c9033b.m16838a(C9591f0.m13969b(C1673a0.class), C1717d.f4528j);
        return (C1673a0) new ViewModelProvider(interfaceC1687g0, c9033b.m16837b()).m36079b("androidx.lifecycle.internal.SavedStateHandlesVM", C1673a0.class);
    }
}