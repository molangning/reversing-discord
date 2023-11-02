package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.InterfaceC9902u2;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "b", "countOrElement", "c", "oldState", "", "a", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/jvm/functions/Function2;", "countAll", "Lkotlinx/coroutines/u2;", "findOne", "Lkotlinx/coroutines/internal/k0;", "d", "updateState", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9776h0 {

    /* renamed from: a */
    public static final C9768d0 f25584a = new C9768d0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final Function2<Object, CoroutineContext.InterfaceC9564b, Object> f25585b = C9777a.f25588j;

    /* renamed from: c */
    private static final Function2<InterfaceC9902u2<?>, CoroutineContext.InterfaceC9564b, InterfaceC9902u2<?>> f25586c = C9778b.f25589j;

    /* renamed from: d */
    private static final Function2<C9785k0, CoroutineContext.InterfaceC9564b, C9785k0> f25587d = C9779c.f25590j;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "countOrElement", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Object;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9777a extends AbstractC9614s implements Function2<Object, CoroutineContext.InterfaceC9564b, Object> {

        /* renamed from: j */
        public static final C9777a f25588j = new C9777a();

        C9777a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Object obj, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            Integer num;
            int i;
            if (interfaceC9564b instanceof InterfaceC9902u2) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i != 0) {
                    return Integer.valueOf(i + 1);
                }
                return interfaceC9564b;
            }
            return obj;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlinx/coroutines/u2;", "found", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlinx/coroutines/u2;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/u2;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9778b extends AbstractC9614s implements Function2<InterfaceC9902u2<?>, CoroutineContext.InterfaceC9564b, InterfaceC9902u2<?>> {

        /* renamed from: j */
        public static final C9778b f25589j = new C9778b();

        C9778b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final InterfaceC9902u2<?> invoke(InterfaceC9902u2<?> interfaceC9902u2, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            if (interfaceC9902u2 != null) {
                return interfaceC9902u2;
            }
            if (interfaceC9564b instanceof InterfaceC9902u2) {
                return (InterfaceC9902u2) interfaceC9564b;
            }
            return null;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlinx/coroutines/internal/k0;", "state", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlinx/coroutines/internal/k0;Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/internal/k0;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.internal.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9779c extends AbstractC9614s implements Function2<C9785k0, CoroutineContext.InterfaceC9564b, C9785k0> {

        /* renamed from: j */
        public static final C9779c f25590j = new C9779c();

        C9779c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final C9785k0 invoke(C9785k0 c9785k0, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            if (interfaceC9564b instanceof InterfaceC9902u2) {
                InterfaceC9902u2<?> interfaceC9902u2 = (InterfaceC9902u2) interfaceC9564b;
                c9785k0.m13270a(interfaceC9902u2, interfaceC9902u2.m12987w0(c9785k0.f25594a));
            }
            return c9785k0;
        }
    }

    /* renamed from: a */
    public static final void m13301a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f25584a) {
            return;
        }
        if (obj instanceof C9785k0) {
            ((C9785k0) obj).m13269b(coroutineContext);
            return;
        }
        Object mo1456t0 = coroutineContext.mo1456t0(null, f25586c);
        if (mo1456t0 != null) {
            ((InterfaceC9902u2) mo1456t0).m12988U(coroutineContext, obj);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
    }

    /* renamed from: b */
    public static final Object m13300b(CoroutineContext coroutineContext) {
        Object mo1456t0 = coroutineContext.mo1456t0(0, f25585b);
        C9612q.m13920e(mo1456t0);
        return mo1456t0;
    }

    /* renamed from: c */
    public static final Object m13299c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = m13300b(coroutineContext);
        }
        if (obj == 0) {
            return f25584a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.mo1456t0(new C9785k0(coroutineContext, ((Number) obj).intValue()), f25587d);
        }
        return ((InterfaceC9902u2) obj).m12987w0(coroutineContext);
    }
}
