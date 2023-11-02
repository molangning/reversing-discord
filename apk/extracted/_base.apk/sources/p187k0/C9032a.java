package p187k0;

import androidx.lifecycle.AbstractC1681d0;
import androidx.lifecycle.C1683e0;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u001a\u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\r\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\f¨\u0006\u0010"}, m14357d2 = {"Lk0/a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/d0;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/d0;", "", "Lk0/e;", "[Lk0/e;", "initializers", "<init>", "([Lk0/e;)V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: k0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9032a implements ViewModelProvider.Factory {

    /* renamed from: a */
    private final C9036e<?>[] f23693a;

    public C9032a(C9036e<?>... initializers) {
        C9612q.m13917h(initializers, "initializers");
        this.f23693a = initializers;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: a */
    public <T extends AbstractC1681d0> T mo16840a(Class<T> modelClass, CreationExtras extras) {
        C9036e<?>[] c9036eArr;
        C9612q.m13917h(modelClass, "modelClass");
        C9612q.m13917h(extras, "extras");
        T t = null;
        for (C9036e<?> c9036e : this.f23693a) {
            if (C9612q.m13922c(c9036e.m16834a(), modelClass)) {
                Object invoke = c9036e.m16833b().invoke(extras);
                if (invoke instanceof AbstractC1681d0) {
                    t = (T) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + modelClass.getName());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    /* renamed from: b */
    public /* synthetic */ AbstractC1681d0 mo16839b(Class cls) {
        return C1683e0.m36042a(this, cls);
    }
}
