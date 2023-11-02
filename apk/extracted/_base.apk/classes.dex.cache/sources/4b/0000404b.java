package kotlinx.coroutines;

import com.facebook.react.uimanager.ViewProps;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000  2\u00020\u0001:\u0001!J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\"\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010H&J6\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u0011\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010H'R\u0014\u0010\u0019\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, m14357d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$b;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "D", "", ViewProps.START, "cause", "", "h", "Lkotlinx/coroutines/w;", "child", "Lkotlinx/coroutines/u;", "A0", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/d1;", "Q", "onCancelling", "invokeImmediately", "A", "a", "()Z", "isActive", "i", "isCompleted", "Lkotlin/sequences/Sequence;", "t", "()Lkotlin/sequences/Sequence;", "children", "c", "b", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface Job extends CoroutineContext.InterfaceC9564b {

    /* renamed from: c */
    public static final C9669b f25404c = C9669b.f25405j;

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.Job$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9668a {
        /* renamed from: a */
        public static /* synthetic */ void m13594a(Job job, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            job.mo2104h(cancellationException);
        }

        /* renamed from: b */
        public static <R> R m13593b(Job job, R r, Function2<? super R, ? super CoroutineContext.InterfaceC9564b, ? extends R> function2) {
            return (R) CoroutineContext.InterfaceC9564b.C9565a.m13995a(job, r, function2);
        }

        /* renamed from: c */
        public static <E extends CoroutineContext.InterfaceC9564b> E m13592c(Job job, CoroutineContext.InterfaceC9566c<E> interfaceC9566c) {
            return (E) CoroutineContext.InterfaceC9564b.C9565a.m13994b(job, interfaceC9566c);
        }

        /* renamed from: d */
        public static /* synthetic */ InterfaceC9688d1 m13591d(Job job, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return job.mo13547A(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static CoroutineContext m13590e(Job job, CoroutineContext.InterfaceC9566c<?> interfaceC9566c) {
            return CoroutineContext.InterfaceC9564b.C9565a.m13993c(job, interfaceC9566c);
        }

        /* renamed from: f */
        public static CoroutineContext m13589f(Job job, CoroutineContext coroutineContext) {
            return CoroutineContext.InterfaceC9564b.C9565a.m13992d(job, coroutineContext);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m14357d2 = {"Lkotlinx/coroutines/Job$b;", "Lkotlin/coroutines/CoroutineContext$c;", "Lkotlinx/coroutines/Job;", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.Job$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9669b implements CoroutineContext.InterfaceC9566c<Job> {

        /* renamed from: j */
        static final /* synthetic */ C9669b f25405j = new C9669b();

        private C9669b() {
        }
    }

    /* renamed from: A */
    InterfaceC9688d1 mo13547A(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    /* renamed from: A0 */
    InterfaceC9898u mo13546A0(InterfaceC9907w interfaceC9907w);

    /* renamed from: D */
    CancellationException mo13542D();

    /* renamed from: Q */
    InterfaceC9688d1 mo13521Q(Function1<? super Throwable, Unit> function1);

    /* renamed from: a */
    boolean mo2067a();

    /* renamed from: h */
    void mo2104h(CancellationException cancellationException);

    /* renamed from: i */
    boolean mo13507i();

    boolean start();

    /* renamed from: t */
    Sequence<Job> mo13498t();
}