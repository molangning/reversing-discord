package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p371uf.C12961c;
import p371uf.C12967f;
import p371uf.InterfaceC12963d;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$b;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "j", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "R", "initial", "Lkotlin/Function2;", "operation", "t0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "e0", "j0", "b", "c", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface CoroutineContext {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: kotlin.coroutines.CoroutineContext$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9562a {

        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m14356k = 3, m14355mv = {1, 8, 0})
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C9563a extends AbstractC9614s implements Function2<CoroutineContext, InterfaceC9564b, CoroutineContext> {

            /* renamed from: j */
            public static final C9563a f25318j = new C9563a();

            C9563a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final CoroutineContext invoke(CoroutineContext acc, InterfaceC9564b element) {
                C12961c c12961c;
                C9612q.m13917h(acc, "acc");
                C9612q.m13917h(element, "element");
                CoroutineContext mo1457j0 = acc.mo1457j0(element.getKey());
                C12967f c12967f = C12967f.f33721j;
                if (mo1457j0 != c12967f) {
                    InterfaceC12963d.C12965b c12965b = InterfaceC12963d.f33719g;
                    InterfaceC12963d interfaceC12963d = (InterfaceC12963d) mo1457j0.mo1458j(c12965b);
                    if (interfaceC12963d == null) {
                        c12961c = new C12961c(mo1457j0, element);
                    } else {
                        CoroutineContext mo1457j02 = mo1457j0.mo1457j0(c12965b);
                        if (mo1457j02 == c12967f) {
                            return new C12961c(element, interfaceC12963d);
                        }
                        c12961c = new C12961c(new C12961c(mo1457j02, element), interfaceC12963d);
                    }
                    return c12961c;
                }
                return element;
            }
        }

        /* renamed from: a */
        public static CoroutineContext m13997a(CoroutineContext coroutineContext, CoroutineContext context) {
            C9612q.m13917h(context, "context");
            if (context != C12967f.f33721j) {
                return (CoroutineContext) context.mo1456t0(coroutineContext, C9563a.f25318j);
            }
            return coroutineContext;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "j", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "getKey", "()Lkotlin/coroutines/CoroutineContext$c;", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.CoroutineContext$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9564b extends CoroutineContext {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* renamed from: kotlin.coroutines.CoroutineContext$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C9565a {
            /* renamed from: a */
            public static <R> R m13995a(InterfaceC9564b interfaceC9564b, R r, Function2<? super R, ? super InterfaceC9564b, ? extends R> operation) {
                C9612q.m13917h(operation, "operation");
                return operation.invoke(r, interfaceC9564b);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: b */
            public static <E extends InterfaceC9564b> E m13994b(InterfaceC9564b interfaceC9564b, InterfaceC9566c<E> key) {
                C9612q.m13917h(key, "key");
                if (C9612q.m13922c(interfaceC9564b.getKey(), key)) {
                    C9612q.m13919f(interfaceC9564b, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return interfaceC9564b;
                }
                return null;
            }

            /* renamed from: c */
            public static CoroutineContext m13993c(InterfaceC9564b interfaceC9564b, InterfaceC9566c<?> key) {
                C9612q.m13917h(key, "key");
                if (C9612q.m13922c(interfaceC9564b.getKey(), key)) {
                    return C12967f.f33721j;
                }
                return interfaceC9564b;
            }

            /* renamed from: d */
            public static CoroutineContext m13992d(InterfaceC9564b interfaceC9564b, CoroutineContext context) {
                C9612q.m13917h(context, "context");
                return C9562a.m13997a(interfaceC9564b, context);
            }
        }

        InterfaceC9566c<?> getKey();

        @Override // kotlin.coroutines.CoroutineContext
        /* renamed from: j */
        <E extends InterfaceC9564b> E mo1458j(InterfaceC9566c<E> interfaceC9566c);
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext$c;", "Lkotlin/coroutines/CoroutineContext$b;", "E", "", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.coroutines.CoroutineContext$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC9566c<E extends InterfaceC9564b> {
    }

    /* renamed from: e0 */
    CoroutineContext mo1459e0(CoroutineContext coroutineContext);

    /* renamed from: j */
    <E extends InterfaceC9564b> E mo1458j(InterfaceC9566c<E> interfaceC9566c);

    /* renamed from: j0 */
    CoroutineContext mo1457j0(InterfaceC9566c<?> interfaceC9566c);

    /* renamed from: t0 */
    <R> R mo1456t0(R r, Function2<? super R, ? super InterfaceC9564b, ? extends R> function2);
}