package p187k0;

import androidx.lifecycle.AbstractC1681d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R&\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, m14357d2 = {"Lk0/e;", "Landroidx/lifecycle/d0;", "T", "", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "()Ljava/lang/Class;", "clazz", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "initializer", "<init>", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: k0.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9036e<T extends AbstractC1681d0> {

    /* renamed from: a */
    private final Class<T> f23696a;

    /* renamed from: b */
    private final Function1<CreationExtras, T> f23697b;

    /* JADX WARN: Multi-variable type inference failed */
    public C9036e(Class<T> clazz, Function1<? super CreationExtras, ? extends T> initializer) {
        C9612q.m13917h(clazz, "clazz");
        C9612q.m13917h(initializer, "initializer");
        this.f23696a = clazz;
        this.f23697b = initializer;
    }

    /* renamed from: a */
    public final Class<T> m16834a() {
        return this.f23696a;
    }

    /* renamed from: b */
    public final Function1<CreationExtras, T> m16833b() {
        return this.f23697b;
    }
}