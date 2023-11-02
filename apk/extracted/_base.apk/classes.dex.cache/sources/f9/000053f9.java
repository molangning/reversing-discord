package p470zi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import p014aj.C0213a;
import p045cj.C2614m;
import p045cj.InterfaceC2608k1;
import p045cj.InterfaceC2655x1;
import p088ej.C6258d;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u001a(\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aF\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00050\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\"\"\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\"\"\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u0012\u0004\b\u0012\u0010\u0010\"\"\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0017\u0010\u0010\"\"\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00148\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u0012\u0004\b\u001a\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m14357d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "isNullable", "Lkotlinx/serialization/KSerializer;", "a", "", "Lkotlin/reflect/KType;", "types", "Lpf/s;", "b", "(Lkotlin/reflect/KClass;Ljava/util/List;Z)Ljava/lang/Object;", "Lcj/x1;", "Lcj/x1;", "getSERIALIZERS_CACHE$annotations", "()V", "SERIALIZERS_CACHE", "getSERIALIZERS_CACHE_NULLABLE$annotations", "SERIALIZERS_CACHE_NULLABLE", "Lcj/k1;", "c", "Lcj/k1;", "getPARAMETRIZED_SERIALIZERS_CACHE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE", "d", "getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations", "PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE", "kotlinx-serialization-core"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: zi.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C14280i {

    /* renamed from: a */
    private static final InterfaceC2655x1<? extends Object> f36683a = C2614m.m32852a(C14283c.f36689j);

    /* renamed from: b */
    private static final InterfaceC2655x1<Object> f36684b = C2614m.m32852a(C14284d.f36690j);

    /* renamed from: c */
    private static final InterfaceC2608k1<? extends Object> f36685c = C2614m.m32851b(C14281a.f36687j);

    /* renamed from: d */
    private static final InterfaceC2608k1<Object> f36686d = C2614m.m32851b(C14282b.f36688j);

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m14357d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "Lkotlin/reflect/KType;", "types", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: zi.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C14281a extends AbstractC9614s implements Function2<KClass<Object>, List<? extends KType>, KSerializer<? extends Object>> {

        /* renamed from: j */
        public static final C14281a f36687j = new C14281a();

        C14281a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final KSerializer<? extends Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            C9612q.m13917h(clazz, "clazz");
            C9612q.m13917h(types, "types");
            List<KSerializer<Object>> m251h = C14285j.m251h(C6258d.m23140a(), types, true);
            C9612q.m13920e(m251h);
            return C14285j.m258a(clazz, types, m251h);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, m14357d2 = {"Lkotlin/reflect/KClass;", "", "clazz", "", "Lkotlin/reflect/KType;", "types", "Lkotlinx/serialization/KSerializer;", "a", "(Lkotlin/reflect/KClass;Ljava/util/List;)Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: zi.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C14282b extends AbstractC9614s implements Function2<KClass<Object>, List<? extends KType>, KSerializer<Object>> {

        /* renamed from: j */
        public static final C14282b f36688j = new C14282b();

        C14282b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final KSerializer<Object> invoke(KClass<Object> clazz, List<? extends KType> types) {
            KSerializer<Object> m40920u;
            C9612q.m13917h(clazz, "clazz");
            C9612q.m13917h(types, "types");
            List<KSerializer<Object>> m251h = C14285j.m251h(C6258d.m23140a(), types, true);
            C9612q.m13920e(m251h);
            KSerializer<? extends Object> m258a = C14285j.m258a(clazz, types, m251h);
            if (m258a == null || (m40920u = C0213a.m40920u(m258a)) == null) {
                return null;
            }
            return m40920u;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlin/reflect/KClass;", "it", "Lkotlinx/serialization/KSerializer;", "", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: zi.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C14283c extends AbstractC9614s implements Function1<KClass<?>, KSerializer<? extends Object>> {

        /* renamed from: j */
        public static final C14283c f36689j = new C14283c();

        C14283c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final KSerializer<? extends Object> invoke(KClass<?> it) {
            C9612q.m13917h(it, "it");
            return C14285j.m252g(it);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlin/reflect/KClass;", "it", "Lkotlinx/serialization/KSerializer;", "", "a", "(Lkotlin/reflect/KClass;)Lkotlinx/serialization/KSerializer;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: zi.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C14284d extends AbstractC9614s implements Function1<KClass<?>, KSerializer<Object>> {

        /* renamed from: j */
        public static final C14284d f36690j = new C14284d();

        C14284d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final KSerializer<Object> invoke(KClass<?> it) {
            KSerializer<Object> m40920u;
            C9612q.m13917h(it, "it");
            KSerializer m252g = C14285j.m252g(it);
            if (m252g == null || (m40920u = C0213a.m40920u(m252g)) == null) {
                return null;
            }
            return m40920u;
        }
    }

    /* renamed from: a */
    public static final KSerializer<Object> m264a(KClass<Object> clazz, boolean z) {
        C9612q.m13917h(clazz, "clazz");
        if (!z) {
            KSerializer<? extends Object> mo32770a = f36683a.mo32770a(clazz);
            if (mo32770a == null) {
                return null;
            }
            return mo32770a;
        }
        return f36684b.mo32770a(clazz);
    }

    /* renamed from: b */
    public static final Object m263b(KClass<Object> clazz, List<? extends KType> types, boolean z) {
        C9612q.m13917h(clazz, "clazz");
        C9612q.m13917h(types, "types");
        if (!z) {
            return f36685c.mo32801a(clazz, types);
        }
        return f36686d.mo32801a(clazz, types);
    }
}