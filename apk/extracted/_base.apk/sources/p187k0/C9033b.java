package p187k0;

import ag.C0156a;
import androidx.lifecycle.AbstractC1681d0;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J2\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006J\u0006\u0010\f\u001a\u00020\u000bR\u001e\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lk0/b;", "", "Landroidx/lifecycle/d0;", "T", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "initializer", "", "a", "Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "", "Lk0/e;", "Ljava/util/List;", "initializers", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: k0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9033b {

    /* renamed from: a */
    private final List<C9036e<?>> f23694a = new ArrayList();

    /* renamed from: a */
    public final <T extends AbstractC1681d0> void m16838a(KClass<T> clazz, Function1<? super CreationExtras, ? extends T> initializer) {
        C9612q.m13917h(clazz, "clazz");
        C9612q.m13917h(initializer, "initializer");
        this.f23694a.add(new C9036e<>(C0156a.m41055b(clazz), initializer));
    }

    /* renamed from: b */
    public final ViewModelProvider.Factory m16837b() {
        Object[] array = this.f23694a.toArray(new C9036e[0]);
        if (array != null) {
            C9036e[] c9036eArr = (C9036e[]) array;
            return new C9032a((C9036e[]) Arrays.copyOf(c9036eArr, c9036eArr.length));
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
