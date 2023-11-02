package androidx.lifecycle;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, m14357d2 = {"Landroidx/lifecycle/g0;", "owner", "Landroidx/lifecycle/viewmodel/CreationExtras;", "a", "lifecycle-viewmodel_release"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: androidx.lifecycle.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1685f0 {
    /* renamed from: a */
    public static final CreationExtras m36039a(InterfaceC1687g0 owner) {
        C9612q.m13917h(owner, "owner");
        if (owner instanceof InterfaceC1688h) {
            CreationExtras defaultViewModelCreationExtras = ((InterfaceC1688h) owner).getDefaultViewModelCreationExtras();
            C9612q.m13918g(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
            return defaultViewModelCreationExtras;
        }
        return CreationExtras.C1708a.f4516b;
    }
}