package p371uf;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\n"}, m14357d2 = {"Luf/d;", "Lkotlin/coroutines/CoroutineContext$b;", "T", "Lkotlin/coroutines/Continuation;", "continuation", "q", "", "m", "g", "b", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC12963d extends CoroutineContext.InterfaceC9564b {

    /* renamed from: g */
    public static final C12965b f33719g = C12965b.f33720j;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: uf.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12964a {
        /* renamed from: a */
        public static <E extends CoroutineContext.InterfaceC9564b> E m3573a(InterfaceC12963d interfaceC12963d, CoroutineContext.InterfaceC9566c<E> key) {
            C9612q.m13917h(key, "key");
            if (key instanceof AbstractC12960b) {
                AbstractC12960b abstractC12960b = (AbstractC12960b) key;
                if (!abstractC12960b.m3581a(interfaceC12963d.getKey())) {
                    return null;
                }
                E e = (E) abstractC12960b.m3580b(interfaceC12963d);
                if (!(e instanceof CoroutineContext.InterfaceC9564b)) {
                    return null;
                }
                return e;
            } else if (InterfaceC12963d.f33719g != key) {
                return null;
            } else {
                C9612q.m13919f(interfaceC12963d, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return interfaceC12963d;
            }
        }

        /* renamed from: b */
        public static CoroutineContext m3572b(InterfaceC12963d interfaceC12963d, CoroutineContext.InterfaceC9566c<?> key) {
            C9612q.m13917h(key, "key");
            if (key instanceof AbstractC12960b) {
                AbstractC12960b abstractC12960b = (AbstractC12960b) key;
                if (abstractC12960b.m3581a(interfaceC12963d.getKey()) && abstractC12960b.m3580b(interfaceC12963d) != null) {
                    return C12967f.f33721j;
                }
                return interfaceC12963d;
            } else if (InterfaceC12963d.f33719g == key) {
                return C12967f.f33721j;
            } else {
                return interfaceC12963d;
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Luf/d$b;", "Lkotlin/coroutines/CoroutineContext$c;", "Luf/d;", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: uf.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12965b implements CoroutineContext.InterfaceC9566c<InterfaceC12963d> {

        /* renamed from: j */
        static final /* synthetic */ C12965b f33720j = new C12965b();

        private C12965b() {
        }
    }

    /* renamed from: m */
    void mo3575m(Continuation<?> continuation);

    /* renamed from: q */
    <T> Continuation<T> mo3574q(Continuation<? super T> continuation);
}