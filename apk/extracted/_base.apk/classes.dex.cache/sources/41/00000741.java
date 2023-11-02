package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.CancellableContinuation;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m14357d2 = {"androidx/lifecycle/WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "", "a", "lifecycle-runtime-ktx_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1671xfdb59cc4 implements InterfaceC1695l {

    /* renamed from: j */
    final /* synthetic */ Lifecycle.State f4488j;

    /* renamed from: k */
    final /* synthetic */ Lifecycle f4489k;

    /* renamed from: l */
    final /* synthetic */ CancellableContinuation<Object> f4490l;

    /* renamed from: m */
    final /* synthetic */ Function0<Object> f4491m;

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner source, Lifecycle.EnumC1651b event) {
        Object m7596b;
        C9612q.m13917h(source, "source");
        C9612q.m13917h(event, "event");
        if (event == Lifecycle.EnumC1651b.m36128d(this.f4488j)) {
            this.f4489k.mo36123c(this);
            CancellableContinuation<Object> cancellableContinuation = this.f4490l;
            Function0<Object> function0 = this.f4491m;
            try {
                C11583s.C11584a c11584a = C11583s.f30090k;
                m7596b = C11583s.m7596b(function0.invoke());
            } catch (Throwable th2) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th2));
            }
            cancellableContinuation.resumeWith(m7596b);
        } else if (event == Lifecycle.EnumC1651b.ON_DESTROY) {
            this.f4489k.mo36123c(this);
            CancellableContinuation<Object> cancellableContinuation2 = this.f4490l;
            C11583s.C11584a c11584a3 = C11583s.f30090k;
            cancellableContinuation2.resumeWith(C11583s.m7596b(C11586t.m7587a(new C1692j())));
        }
    }
}