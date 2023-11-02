package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Landroidx/lifecycle/SavedStateHandleAttacher;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/LifecycleOwner;", "source", "Landroidx/lifecycle/Lifecycle$b;", "event", "", "a", "Landroidx/lifecycle/z;", "j", "Landroidx/lifecycle/z;", "provider", "<init>", "(Landroidx/lifecycle/z;)V", "lifecycle-viewmodel-savedstate_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1695l {

    /* renamed from: j */
    private final C1718z f4470j;

    public SavedStateHandleAttacher(C1718z provider) {
        C9612q.m13917h(provider, "provider");
        this.f4470j = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner source, Lifecycle.EnumC1651b event) {
        boolean z;
        C9612q.m13917h(source, "source");
        C9612q.m13917h(event, "event");
        if (event == Lifecycle.EnumC1651b.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            source.getLifecycle().mo36123c(this);
            this.f4470j.m35995d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
    }
}
