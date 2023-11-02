package androidx.lifecycle;

import androidx.lifecycle.C1674b;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1695l {

    /* renamed from: j */
    private final Object f4437j;

    /* renamed from: k */
    private final C1674b.C1675a f4438k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4437j = obj;
        this.f4438k = C1674b.f4493c.m36064c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1695l
    /* renamed from: a */
    public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        this.f4438k.m36061a(lifecycleOwner, enumC1651b, this.f4437j);
    }
}
