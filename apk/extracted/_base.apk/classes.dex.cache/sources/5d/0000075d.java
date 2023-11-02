package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m14357d2 = {"Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/i;", "a", "(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/i;", "lifecycleScope", "lifecycle-runtime-ktx_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1699p {
    /* renamed from: a */
    public static final AbstractC1690i m36032a(LifecycleOwner lifecycleOwner) {
        C9612q.m13917h(lifecycleOwner, "<this>");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C9612q.m13918g(lifecycle, "lifecycle");
        return C1697n.m36033a(lifecycle);
    }
}