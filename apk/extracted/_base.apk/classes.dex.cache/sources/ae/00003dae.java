package p187k0;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Lk0/c;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "key", "t", "", "c", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;Ljava/lang/Object;)V", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;)Ljava/lang/Object;", "initialExtras", "<init>", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: k0.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C9034c extends CreationExtras {
    public C9034c() {
        this(null, 1, null);
    }

    public C9034c(CreationExtras initialExtras) {
        C9612q.m13917h(initialExtras, "initialExtras");
        m36012b().putAll(initialExtras.m36012b());
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    /* renamed from: a */
    public <T> T mo16836a(CreationExtras.InterfaceC1709b<T> key) {
        C9612q.m13917h(key, "key");
        return (T) m36012b().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final <T> void m16835c(CreationExtras.InterfaceC1709b<T> key, T t) {
        C9612q.m13917h(key, "key");
        m36012b().put(key, t);
    }

    public /* synthetic */ C9034c(CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreationExtras.C1708a.f4516b : creationExtras);
    }
}