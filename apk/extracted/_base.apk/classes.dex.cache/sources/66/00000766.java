package androidx.lifecycle.viewmodel;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002\u0005\tB\t\b\u0000¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\u000b\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, m14357d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras;", "", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "key", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;)Ljava/lang/Object;", "", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "map", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class CreationExtras {

    /* renamed from: a */
    private final Map<InterfaceC1709b<?>, Object> f4515a = new LinkedHashMap();

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m14357d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$a;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "T", "Landroidx/lifecycle/viewmodel/CreationExtras$b;", "key", "a", "(Landroidx/lifecycle/viewmodel/CreationExtras$b;)Ljava/lang/Object;", "<init>", "()V", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.viewmodel.CreationExtras$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1708a extends CreationExtras {

        /* renamed from: b */
        public static final C1708a f4516b = new C1708a();

        private C1708a() {
        }

        @Override // androidx.lifecycle.viewmodel.CreationExtras
        /* renamed from: a */
        public <T> T mo16836a(InterfaceC1709b<T> key) {
            C9612q.m13917h(key, "key");
            return null;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, m14357d2 = {"Landroidx/lifecycle/viewmodel/CreationExtras$b;", "T", "", "lifecycle-viewmodel_release"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: androidx.lifecycle.viewmodel.CreationExtras$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1709b<T> {
    }

    /* renamed from: a */
    public abstract <T> T mo16836a(InterfaceC1709b<T> interfaceC1709b);

    /* renamed from: b */
    public final Map<InterfaceC1709b<?>, Object> m36012b() {
        return this.f4515a;
    }
}