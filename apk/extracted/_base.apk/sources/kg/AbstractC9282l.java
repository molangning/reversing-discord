package kg;

import ag.C0156a;
import bh.InterfaceC2298a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kg.C9271j0;
import kotlin.Metadata;
import kotlin.collections.C9538f;
import kotlin.collections.C9546k;
import kotlin.collections.C9549n;
import kotlin.collections.C9553r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KCallable;
import kotlin.reflect.KType;
import kotlin.reflect.KVisibility;
import p140hg.InterfaceC7135f;
import p140hg.InterfaceC7141i;
import p142hi.AbstractC7264g0;
import p159ig.C7509a;
import p181jg.C8938b;
import p181jg.C8939c;
import p218lg.InterfaceC10153e;
import p305qg.AbstractC11988u;
import p305qg.EnumC11915e0;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11971r0;
import p305qg.InterfaceC11997x0;
import p305qg.InterfaceC11998y;
import p340sf.C12466c;

@Metadata(m14358d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\bM\u0010NJ%\u0010\b\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J'\u0010\u0010\u001a\u00028\u00002\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000f\"\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0012\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\tJ3\u0010\u0015\u001a\u00028\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0019 \u001a*\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR.\u0010 \u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u001a*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001e0\u001e0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\"\u0010#\u001a\u0010\u0012\f\u0012\n \u001a*\u0004\u0018\u00010!0!0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001cR.\u0010&\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020$ \u001a*\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0018\u0010*\u001a\u0006\u0012\u0002\b\u00030'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010<\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00106R\u0016\u0010C\u001a\u0004\u0018\u00010@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010D\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u00103R\u0014\u0010E\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u00103R\u0014\u0010F\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010H\u001a\u0002018DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bG\u00103R\u0014\u0010L\u001a\u00020I8&X¦\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010K¨\u0006O"}, m14357d2 = {"Lkg/l;", "R", "Lkotlin/reflect/KCallable;", "Lkg/g0;", "", "Lhg/f;", "", "args", "p", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/reflect/KType;", "type", "r", "Ljava/lang/reflect/Type;", "s", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "callBy", "Lkotlin/coroutines/Continuation;", "continuationArgument", "q", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkg/j0$a;", "", "", "kotlin.jvm.PlatformType", "j", "Lkg/j0$a;", "_annotations", "Ljava/util/ArrayList;", "k", "_parameters", "Lkg/e0;", "l", "_returnType", "Lkg/f0;", "m", "_typeParameters", "Llg/e;", "u", "()Llg/e;", "caller", "w", "defaultCaller", "Lkg/p;", "v", "()Lkg/p;", "container", "", "z", "()Z", "isBound", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lhg/i;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "y", "isAnnotationConstructor", "Lqg/b;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC9282l<R> implements KCallable<R>, InterfaceC9256g0 {

    /* renamed from: j */
    private final C9271j0.C9272a<List<Annotation>> f24353j;

    /* renamed from: k */
    private final C9271j0.C9272a<ArrayList<InterfaceC7135f>> f24354k;

    /* renamed from: l */
    private final C9271j0.C9272a<C9245e0> f24355l;

    /* renamed from: m */
    private final C9271j0.C9272a<List<C9252f0>> f24356m;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kg.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9283a extends AbstractC9614s implements Function0<List<? extends Annotation>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9282l<R> f24357j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9283a(AbstractC9282l<? extends R> abstractC9282l) {
            super(0);
            this.f24357j = abstractC9282l;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return C9336p0.m15855e(this.f24357j.mo15826x());
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"R", "Ljava/util/ArrayList;", "Lhg/f;", "kotlin.jvm.PlatformType", "a", "()Ljava/util/ArrayList;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9284b extends AbstractC9614s implements Function0<ArrayList<InterfaceC7135f>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9282l<R> f24358j;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"R", "Lqg/r0;", "a", "()Lqg/r0;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.l$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9285a extends AbstractC9614s implements Function0<InterfaceC11971r0> {

            /* renamed from: j */
            final /* synthetic */ InterfaceC11997x0 f24359j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9285a(InterfaceC11997x0 interfaceC11997x0) {
                super(0);
                this.f24359j = interfaceC11997x0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11971r0 invoke() {
                return this.f24359j;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"R", "Lqg/r0;", "a", "()Lqg/r0;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.l$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9286b extends AbstractC9614s implements Function0<InterfaceC11971r0> {

            /* renamed from: j */
            final /* synthetic */ InterfaceC11997x0 f24360j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9286b(InterfaceC11997x0 interfaceC11997x0) {
                super(0);
                this.f24360j = interfaceC11997x0;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11971r0 invoke() {
                return this.f24360j;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"R", "Lqg/r0;", "a", "()Lqg/r0;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.l$b$c */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9287c extends AbstractC9614s implements Function0<InterfaceC11971r0> {

            /* renamed from: j */
            final /* synthetic */ InterfaceC11902b f24361j;

            /* renamed from: k */
            final /* synthetic */ int f24362k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9287c(InterfaceC11902b interfaceC11902b, int i) {
                super(0);
                this.f24361j = interfaceC11902b;
                this.f24362k = i;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final InterfaceC11971r0 invoke() {
                InterfaceC11936j1 interfaceC11936j1 = this.f24361j.mo4301i().get(this.f24362k);
                C9612q.m13918g(interfaceC11936j1, "descriptor.valueParameters[i]");
                return interfaceC11936j1;
            }
        }

        @Metadata(m14358d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m14357d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.l$b$d */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9288d<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int m5209d;
                m5209d = C12466c.m5209d(((InterfaceC7135f) t).getName(), ((InterfaceC7135f) t2).getName());
                return m5209d;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9284b(AbstractC9282l<? extends R> abstractC9282l) {
            super(0);
            this.f24358j = abstractC9282l;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ArrayList<InterfaceC7135f> invoke() {
            int i;
            InterfaceC11902b mo15826x = this.f24358j.mo15826x();
            ArrayList<InterfaceC7135f> arrayList = new ArrayList<>();
            int i2 = 0;
            if (!this.f24358j.mo15825z()) {
                InterfaceC11997x0 m15851i = C9336p0.m15851i(mo15826x);
                if (m15851i != null) {
                    arrayList.add(new C9361w(this.f24358j, 0, InterfaceC7135f.EnumC7136a.INSTANCE, new C9285a(m15851i)));
                    i = 1;
                } else {
                    i = 0;
                }
                InterfaceC11997x0 mo4329M = mo15826x.mo4329M();
                if (mo4329M != null) {
                    arrayList.add(new C9361w(this.f24358j, i, InterfaceC7135f.EnumC7136a.EXTENSION_RECEIVER, new C9286b(mo4329M)));
                    i++;
                }
            } else {
                i = 0;
            }
            int size = mo15826x.mo4301i().size();
            while (i2 < size) {
                arrayList.add(new C9361w(this.f24358j, i, InterfaceC7135f.EnumC7136a.VALUE, new C9287c(mo15826x, i2)));
                i2++;
                i++;
            }
            if (this.f24358j.m15944y() && (mo15826x instanceof InterfaceC2298a) && arrayList.size() > 1) {
                C9549n.m14089x(arrayList, new C9288d());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"R", "Lkg/e0;", "kotlin.jvm.PlatformType", "a", "()Lkg/e0;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.l$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9289c extends AbstractC9614s implements Function0<C9245e0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9282l<R> f24363j;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"R", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kg.l$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C9290a extends AbstractC9614s implements Function0<Type> {

            /* renamed from: j */
            final /* synthetic */ AbstractC9282l<R> f24364j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C9290a(AbstractC9282l<? extends R> abstractC9282l) {
                super(0);
                this.f24364j = abstractC9282l;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final Type invoke() {
                Type m15945s = this.f24364j.m15945s();
                return m15945s == null ? this.f24364j.mo15829u().getReturnType() : m15945s;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9289c(AbstractC9282l<? extends R> abstractC9282l) {
            super(0);
            this.f24363j = abstractC9282l;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final C9245e0 invoke() {
            AbstractC7264g0 returnType = this.f24363j.mo15826x().getReturnType();
            C9612q.m13920e(returnType);
            return new C9245e0(returnType, new C9290a(this.f24363j));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"R", "", "Lkg/f0;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kg.l$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C9291d extends AbstractC9614s implements Function0<List<? extends C9252f0>> {

        /* renamed from: j */
        final /* synthetic */ AbstractC9282l<R> f24365j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9291d(AbstractC9282l<? extends R> abstractC9282l) {
            super(0);
            this.f24365j = abstractC9282l;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends C9252f0> invoke() {
            int m14093t;
            List<InterfaceC11920f1> typeParameters = this.f24365j.mo15826x().getTypeParameters();
            C9612q.m13918g(typeParameters, "descriptor.typeParameters");
            AbstractC9282l<R> abstractC9282l = this.f24365j;
            m14093t = C9546k.m14093t(typeParameters, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (InterfaceC11920f1 descriptor : typeParameters) {
                C9612q.m13918g(descriptor, "descriptor");
                arrayList.add(new C9252f0(abstractC9282l, descriptor));
            }
            return arrayList;
        }
    }

    public AbstractC9282l() {
        C9271j0.C9272a<List<Annotation>> m15968d = C9271j0.m15968d(new C9283a(this));
        C9612q.m13918g(m15968d, "lazySoft { descriptor.computeAnnotations() }");
        this.f24353j = m15968d;
        C9271j0.C9272a<ArrayList<InterfaceC7135f>> m15968d2 = C9271j0.m15968d(new C9284b(this));
        C9612q.m13918g(m15968d2, "lazySoft {\n        val d…ze()\n        result\n    }");
        this.f24354k = m15968d2;
        C9271j0.C9272a<C9245e0> m15968d3 = C9271j0.m15968d(new C9289c(this));
        C9612q.m13918g(m15968d3, "lazySoft {\n        KType…eturnType\n        }\n    }");
        this.f24355l = m15968d3;
        C9271j0.C9272a<List<C9252f0>> m15968d4 = C9271j0.m15968d(new C9291d(this));
        C9612q.m13918g(m15968d4, "lazySoft {\n        descr…this, descriptor) }\n    }");
        this.f24356m = m15968d4;
    }

    /* renamed from: p */
    private final R m15948p(Map<InterfaceC7135f, ? extends Object> map) {
        int m14093t;
        Object m15946r;
        List<InterfaceC7135f> parameters = getParameters();
        m14093t = C9546k.m14093t(parameters, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (InterfaceC7135f interfaceC7135f : parameters) {
            if (map.containsKey(interfaceC7135f)) {
                m15946r = map.get(interfaceC7135f);
                if (m15946r == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + interfaceC7135f + ')');
                }
            } else if (interfaceC7135f.mo15783n()) {
                m15946r = null;
            } else if (interfaceC7135f.mo15787a()) {
                m15946r = m15946r(interfaceC7135f.getType());
            } else {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + interfaceC7135f);
            }
            arrayList.add(m15946r);
        }
        InterfaceC10153e<?> mo15827w = mo15827w();
        if (mo15827w != null) {
            try {
                return (R) mo15827w.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e) {
                throw new C7509a(e);
            }
        }
        throw new C9258h0("This callable does not support a default call: " + mo15826x());
    }

    /* renamed from: r */
    private final Object m15946r(KType kType) {
        Class m41055b = C0156a.m41055b(C8938b.m17024b(kType));
        if (m41055b.isArray()) {
            Object newInstance = Array.newInstance(m41055b.getComponentType(), 0);
            C9612q.m13918g(newInstance, "type.jvmErasure.java.run…\"\n            )\n        }");
            return newInstance;
        }
        throw new C9258h0("Cannot instantiate the default empty array of type " + m41055b.getSimpleName() + ", because it is not an array type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public final Type m15945s() {
        InterfaceC11998y interfaceC11998y;
        Object m14042h0;
        ParameterizedType parameterizedType;
        Type type;
        Object m14212h0;
        WildcardType wildcardType;
        Type[] lowerBounds;
        Object m14249D;
        InterfaceC11902b mo15826x = mo15826x();
        if (mo15826x instanceof InterfaceC11998y) {
            interfaceC11998y = (InterfaceC11998y) mo15826x;
        } else {
            interfaceC11998y = null;
        }
        boolean z = false;
        if (interfaceC11998y != null && interfaceC11998y.isSuspend()) {
            z = true;
        }
        if (!z) {
            return null;
        }
        m14042h0 = C9553r.m14042h0(mo15829u().mo12139a());
        if (m14042h0 instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) m14042h0;
        } else {
            parameterizedType = null;
        }
        if (parameterizedType != null) {
            type = parameterizedType.getRawType();
        } else {
            type = null;
        }
        if (!C9612q.m13922c(type, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        C9612q.m13918g(actualTypeArguments, "continuationType.actualTypeArguments");
        m14212h0 = C9538f.m14212h0(actualTypeArguments);
        if (m14212h0 instanceof WildcardType) {
            wildcardType = (WildcardType) m14212h0;
        } else {
            wildcardType = null;
        }
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        m14249D = C9538f.m14249D(lowerBounds);
        return (Type) m14249D;
    }

    @Override // kotlin.reflect.KCallable
    public R call(Object... args) {
        C9612q.m13917h(args, "args");
        try {
            return (R) mo15829u().call(args);
        } catch (IllegalAccessException e) {
            throw new C7509a(e);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(Map<InterfaceC7135f, ? extends Object> args) {
        C9612q.m13917h(args, "args");
        if (m15944y()) {
            return m15948p(args);
        }
        return m15947q(args, null);
    }

    @Override // p140hg.InterfaceC7129b
    public List<Annotation> getAnnotations() {
        List<Annotation> invoke = this.f24353j.invoke();
        C9612q.m13918g(invoke, "_annotations()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<InterfaceC7135f> getParameters() {
        ArrayList<InterfaceC7135f> invoke = this.f24354k.invoke();
        C9612q.m13918g(invoke, "_parameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KType getReturnType() {
        C9245e0 invoke = this.f24355l.invoke();
        C9612q.m13918g(invoke, "_returnType()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public List<InterfaceC7141i> getTypeParameters() {
        List<C9252f0> invoke = this.f24356m.invoke();
        C9612q.m13918g(invoke, "_typeParameters()");
        return invoke;
    }

    @Override // kotlin.reflect.KCallable
    public KVisibility getVisibility() {
        AbstractC11988u visibility = mo15826x().getVisibility();
        C9612q.m13918g(visibility, "descriptor.visibility");
        return C9336p0.m15843q(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return mo15826x().mo4167r() == EnumC11915e0.ABSTRACT;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return mo15826x().mo4167r() == EnumC11915e0.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return mo15826x().mo4167r() == EnumC11915e0.OPEN;
    }

    /* renamed from: q */
    public final R m15947q(Map<InterfaceC7135f, ? extends Object> args, Continuation<?> continuation) {
        C9612q.m13917h(args, "args");
        List<InterfaceC7135f> parameters = getParameters();
        ArrayList arrayList = new ArrayList(parameters.size());
        ArrayList arrayList2 = new ArrayList(1);
        Iterator<InterfaceC7135f> it = parameters.iterator();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            Object obj = null;
            if (it.hasNext()) {
                InterfaceC7135f next = it.next();
                if (i != 0 && i % 32 == 0) {
                    arrayList2.add(Integer.valueOf(i2));
                    i2 = 0;
                }
                if (args.containsKey(next)) {
                    arrayList.add(args.get(next));
                } else if (next.mo15783n()) {
                    if (!C9336p0.m15849k(next.getType())) {
                        obj = C9336p0.m15853g(C8939c.m17018f(next.getType()));
                    }
                    arrayList.add(obj);
                    i2 = (1 << (i % 32)) | i2;
                    z = true;
                } else if (next.mo15787a()) {
                    arrayList.add(m15946r(next.getType()));
                } else {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + next);
                }
                if (next.mo15785g() == InterfaceC7135f.EnumC7136a.VALUE) {
                    i++;
                }
            } else {
                if (continuation != null) {
                    arrayList.add(continuation);
                }
                if (!z) {
                    Object[] array = arrayList.toArray(new Object[0]);
                    return call(Arrays.copyOf(array, array.length));
                }
                arrayList2.add(Integer.valueOf(i2));
                InterfaceC10153e<?> mo15827w = mo15827w();
                if (mo15827w != null) {
                    arrayList.addAll(arrayList2);
                    arrayList.add(null);
                    try {
                        return (R) mo15827w.call(arrayList.toArray(new Object[0]));
                    } catch (IllegalAccessException e) {
                        throw new C7509a(e);
                    }
                }
                throw new C9258h0("This callable does not support a default call: " + mo15826x());
            }
        }
    }

    /* renamed from: u */
    public abstract InterfaceC10153e<?> mo15829u();

    /* renamed from: v */
    public abstract AbstractC9327p mo15828v();

    /* renamed from: w */
    public abstract InterfaceC10153e<?> mo15827w();

    /* renamed from: x */
    public abstract InterfaceC11902b mo15826x();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: y */
    public final boolean m15944y() {
        return C9612q.m13922c(getName(), "<init>") && mo15828v().mo13896e().isAnnotation();
    }

    /* renamed from: z */
    public abstract boolean mo15825z();
}
