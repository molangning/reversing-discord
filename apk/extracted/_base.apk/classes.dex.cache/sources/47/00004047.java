package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C9773g;
import kotlinx.coroutines.internal.C9788m;
import kotlinx.coroutines.internal.RunnableC9786l;
import p371uf.AbstractC12959a;
import p371uf.AbstractC12960b;
import p371uf.InterfaceC12963d;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0017J\u001c\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH&J\u001c\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\u0012\u0010\u0014\u001a\u00020\r2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u001b"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Luf/a;", "Luf/d;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "D0", "", "parallelism", "E0", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "B0", "C0", "T", "Lkotlin/coroutines/Continuation;", "continuation", "q", "m", "", "toString", "<init>", "()V", "k", "a", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class CoroutineDispatcher extends AbstractC12959a implements InterfaceC12963d {

    /* renamed from: k */
    public static final C9666a f25402k = new C9666a(null);

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$a;", "Luf/b;", "Luf/d;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.CoroutineDispatcher$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9666a extends AbstractC12960b<InterfaceC12963d, CoroutineDispatcher> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "it", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlinx/coroutines/CoroutineDispatcher;"}, m14356k = 3, m14355mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.CoroutineDispatcher$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
        public static final class C9667a extends AbstractC9614s implements Function1<CoroutineContext.InterfaceC9564b, CoroutineDispatcher> {

            /* renamed from: j */
            public static final C9667a f25403j = new C9667a();

            C9667a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final CoroutineDispatcher invoke(CoroutineContext.InterfaceC9564b interfaceC9564b) {
                if (interfaceC9564b instanceof CoroutineDispatcher) {
                    return (CoroutineDispatcher) interfaceC9564b;
                }
                return null;
            }
        }

        private C9666a() {
            super(InterfaceC12963d.f33719g, C9667a.f25403j);
        }

        public /* synthetic */ C9666a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CoroutineDispatcher() {
        super(InterfaceC12963d.f33719g);
    }

    /* renamed from: B0 */
    public abstract void mo2769B0(CoroutineContext coroutineContext, Runnable runnable);

    /* renamed from: C0 */
    public void mo13051C0(CoroutineContext coroutineContext, Runnable runnable) {
        mo2769B0(coroutineContext, runnable);
    }

    /* renamed from: D0 */
    public boolean mo2768D0(CoroutineContext coroutineContext) {
        return true;
    }

    /* renamed from: E0 */
    public CoroutineDispatcher m13596E0(int i) {
        C9788m.m13266a(i);
        return new RunnableC9786l(this, i);
    }

    @Override // p371uf.AbstractC12959a, kotlin.coroutines.CoroutineContext.InterfaceC9564b, kotlin.coroutines.CoroutineContext
    /* renamed from: j */
    public <E extends CoroutineContext.InterfaceC9564b> E mo1458j(CoroutineContext.InterfaceC9566c<E> interfaceC9566c) {
        return (E) InterfaceC12963d.C12964a.m3573a(this, interfaceC9566c);
    }

    @Override // p371uf.AbstractC12959a, kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo1457j0(CoroutineContext.InterfaceC9566c<?> interfaceC9566c) {
        return InterfaceC12963d.C12964a.m3572b(this, interfaceC9566c);
    }

    @Override // p371uf.InterfaceC12963d
    /* renamed from: m */
    public final void mo3575m(Continuation<?> continuation) {
        ((C9773g) continuation).m13312t();
    }

    @Override // p371uf.InterfaceC12963d
    /* renamed from: q */
    public final <T> Continuation<T> mo3574q(Continuation<? super T> continuation) {
        return new C9773g(this, continuation);
    }

    public String toString() {
        return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this);
    }
}