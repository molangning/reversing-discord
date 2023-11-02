package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import pf.C11577n;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000f\u0010\u0014¨\u0006\u001a"}, m14357d2 = {"Landroidx/lifecycle/z;", "Landroidx/savedstate/SavedStateRegistry$c;", "Landroid/os/Bundle;", "a", "", "d", "", "key", "b", "Landroidx/savedstate/SavedStateRegistry;", "Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistry", "", "Z", "restored", "c", "Landroid/os/Bundle;", "restoredState", "Landroidx/lifecycle/a0;", "Lkotlin/Lazy;", "()Landroidx/lifecycle/a0;", "viewModel", "Landroidx/lifecycle/g0;", "viewModelStoreOwner", "<init>", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/g0;)V", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1718z implements SavedStateRegistry.InterfaceC1822c {

    /* renamed from: a */
    private final SavedStateRegistry f4529a;

    /* renamed from: b */
    private boolean f4530b;

    /* renamed from: c */
    private Bundle f4531c;

    /* renamed from: d */
    private final Lazy f4532d;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Landroidx/lifecycle/a0;", "a", "()Landroidx/lifecycle/a0;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.z$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1719a extends AbstractC9614s implements Function0<C1673a0> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC1687g0 f4533j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1719a(InterfaceC1687g0 interfaceC1687g0) {
            super(0);
            this.f4533j = interfaceC1687g0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C1673a0 invoke() {
            return C1713y.m35999e(this.f4533j);
        }
    }

    public C1718z(SavedStateRegistry savedStateRegistry, InterfaceC1687g0 viewModelStoreOwner) {
        Lazy m7601a;
        C9612q.m13917h(savedStateRegistry, "savedStateRegistry");
        C9612q.m13917h(viewModelStoreOwner, "viewModelStoreOwner");
        this.f4529a = savedStateRegistry;
        m7601a = C11577n.m7601a(new C1719a(viewModelStoreOwner));
        this.f4532d = m7601a;
    }

    /* renamed from: c */
    private final C1673a0 m35996c() {
        return (C1673a0) this.f4532d.getValue();
    }

    @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
    /* renamed from: a */
    public Bundle mo35308a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4531c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, C1711x> entry : m35996c().m36067f().entrySet()) {
            String key = entry.getKey();
            Bundle mo35308a = entry.getValue().m36008d().mo35308a();
            if (!C9612q.m13922c(mo35308a, Bundle.EMPTY)) {
                bundle.putBundle(key, mo35308a);
            }
        }
        this.f4530b = false;
        return bundle;
    }

    /* renamed from: b */
    public final Bundle m35997b(String key) {
        Bundle bundle;
        C9612q.m13917h(key, "key");
        m35995d();
        Bundle bundle2 = this.f4531c;
        if (bundle2 != null) {
            bundle = bundle2.getBundle(key);
        } else {
            bundle = null;
        }
        Bundle bundle3 = this.f4531c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f4531c;
        boolean z = false;
        if (bundle4 != null && bundle4.isEmpty()) {
            z = true;
        }
        if (z) {
            this.f4531c = null;
        }
        return bundle;
    }

    /* renamed from: d */
    public final void m35995d() {
        if (!this.f4530b) {
            this.f4531c = this.f4529a.m35317b("androidx.lifecycle.internal.SavedStateHandlesProvider");
            this.f4530b = true;
            m35996c();
        }
    }
}