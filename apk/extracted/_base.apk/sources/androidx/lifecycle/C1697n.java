package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9677b1;
import kotlinx.coroutines.C9897t2;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m14357d2 = {"Landroidx/lifecycle/Lifecycle;", "Landroidx/lifecycle/i;", "a", "(Landroidx/lifecycle/Lifecycle;)Landroidx/lifecycle/i;", "coroutineScope", "lifecycle-runtime-ktx_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1697n {
    /* renamed from: a */
    public static final AbstractC1690i m36033a(Lifecycle lifecycle) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C9612q.m13917h(lifecycle, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) lifecycle.f4381a.get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, C9897t2.m12990b(null, 1, null).mo1459e0(C9677b1.m13568c().mo2767F0()));
        } while (!C1696m.m36034a(lifecycle.f4381a, null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.m36126c();
        return lifecycleCoroutineScopeImpl;
    }
}
