package kg;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KType;
import p140hg.C7142j;
import p159ig.C7511c;
import p164j$.util.concurrent.ConcurrentHashMap;

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u001a \u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\"*\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u000e\b\u0001\u0012\n \t*\u0004\u0018\u00010\u00000\u00000\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n\"\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\n\"\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\n\"<\u0010\u001a\u001a*\u0012&\u0012$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014j\u0002`\u0018\u0012\u0004\u0012\u00020\u000e0\u00130\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\n*0\b\u0002\u0010\u001b\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u00142\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00170\u0014¨\u0006\u001c"}, m14357d2 = {"", "T", "Ljava/lang/Class;", "jClass", "Lkg/m;", "a", "Lkotlin/reflect/KDeclarationContainer;", "b", "Lkg/a;", "kotlin.jvm.PlatformType", "Lkg/a;", "K_CLASS_CACHE", "Lkg/v;", "K_PACKAGE_CACHE", "Lkotlin/reflect/KType;", "c", "CACHE_FOR_BASE_CLASSIFIERS", "d", "CACHE_FOR_NULLABLE_BASE_CLASSIFIERS", "j$/util/concurrent/ConcurrentHashMap", "Lkotlin/Pair;", "", "Lhg/j;", "", "Lkotlin/reflect/jvm/internal/Key;", "e", "CACHE_FOR_GENERIC_CLASSIFIERS", "Key", "kotlin-reflection"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9225c {

    /* renamed from: a */
    private static final AbstractC9221a<C9296m<? extends Object>> f24271a = C9223b.m16032a(C9229d.f24279j);

    /* renamed from: b */
    private static final AbstractC9221a<C9352v> f24272b = C9223b.m16032a(C9230e.f24280j);

    /* renamed from: c */
    private static final AbstractC9221a<KType> f24273c = C9223b.m16032a(C9226a.f24276j);

    /* renamed from: d */
    private static final AbstractC9221a<KType> f24274d = C9223b.m16032a(C9228c.f24278j);

    /* renamed from: e */
    private static final AbstractC9221a<ConcurrentHashMap<Pair<List<C7142j>, Boolean>, KType>> f24275e = C9223b.m16032a(C9227b.f24277j);

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/KType;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9226a extends AbstractC9614s implements Function1<Class<?>, KType> {

        /* renamed from: j */
        public static final C9226a f24276j = new C9226a();

        C9226a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final KType invoke(Class<?> it) {
            List m14104i;
            List m14104i2;
            C9612q.m13917h(it, "it");
            C9296m m16030a = C9225c.m16030a(it);
            m14104i = C9545j.m14104i();
            m14104i2 = C9545j.m14104i();
            return C7511c.m20532b(m16030a, m14104i, false, m14104i2);
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a$\u0012\u001a\u0012\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\t\u0010\n"}, m14357d2 = {"Ljava/lang/Class;", "it", "j$/util/concurrent/ConcurrentHashMap", "Lkotlin/Pair;", "", "Lhg/j;", "", "Lkotlin/reflect/jvm/internal/Key;", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lj$/util/concurrent/ConcurrentHashMap;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9227b extends AbstractC9614s implements Function1<Class<?>, ConcurrentHashMap<Pair<? extends List<? extends C7142j>, ? extends Boolean>, KType>> {

        /* renamed from: j */
        public static final C9227b f24277j = new C9227b();

        C9227b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final ConcurrentHashMap<Pair<List<C7142j>, Boolean>, KType> invoke(Class<?> it) {
            C9612q.m13917h(it, "it");
            return new ConcurrentHashMap<>();
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Ljava/lang/Class;", "it", "Lkotlin/reflect/KType;", "a", "(Ljava/lang/Class;)Lkotlin/reflect/KType;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9228c extends AbstractC9614s implements Function1<Class<?>, KType> {

        /* renamed from: j */
        public static final C9228c f24278j = new C9228c();

        C9228c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final KType invoke(Class<?> it) {
            List m14104i;
            List m14104i2;
            C9612q.m13917h(it, "it");
            C9296m m16030a = C9225c.m16030a(it);
            m14104i = C9545j.m14104i();
            m14104i2 = C9545j.m14104i();
            return C7511c.m20532b(m16030a, m14104i, true, m14104i2);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"Ljava/lang/Class;", "it", "Lkg/m;", "", "kotlin.jvm.PlatformType", "a", "(Ljava/lang/Class;)Lkg/m;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9229d extends AbstractC9614s implements Function1<Class<?>, C9296m<? extends Object>> {

        /* renamed from: j */
        public static final C9229d f24279j = new C9229d();

        C9229d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C9296m<? extends Object> invoke(Class<?> it) {
            C9612q.m13917h(it, "it");
            return new C9296m<>(it);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Ljava/lang/Class;", "it", "Lkg/v;", "a", "(Ljava/lang/Class;)Lkg/v;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9230e extends AbstractC9614s implements Function1<Class<?>, C9352v> {

        /* renamed from: j */
        public static final C9230e f24280j = new C9230e();

        C9230e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final C9352v invoke(Class<?> it) {
            C9612q.m13917h(it, "it");
            return new C9352v(it);
        }
    }

    /* renamed from: a */
    public static final <T> C9296m<T> m16030a(Class<T> jClass) {
        C9612q.m13917h(jClass, "jClass");
        C9296m<? extends Object> mo15994a = f24271a.mo15994a(jClass);
        C9612q.m13919f(mo15994a, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<T of kotlin.reflect.jvm.internal.CachesKt.getOrCreateKotlinClass>");
        return (C9296m<T>) mo15994a;
    }

    /* renamed from: b */
    public static final <T> KDeclarationContainer m16029b(Class<T> jClass) {
        C9612q.m13917h(jClass, "jClass");
        return f24272b.mo15994a(jClass);
    }
}
