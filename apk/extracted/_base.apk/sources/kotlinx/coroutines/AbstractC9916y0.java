package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.C9773g;
import kotlinx.coroutines.internal.C9776h0;
import kotlinx.coroutines.scheduling.AbstractRunnableC9865h;
import kotlinx.coroutines.scheduling.InterfaceC9866i;
import pf.C11560f;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H ¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\nJ\u001a\u0010\u0015\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bR\u0016\u0010\u0019\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a8 X \u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, m14357d2 = {"Lkotlinx/coroutines/y0;", "T", "Lkotlinx/coroutines/scheduling/h;", "Lkotlinx/coroutines/SchedulerTask;", "", "g", "()Ljava/lang/Object;", "takenState", "", "cause", "", "b", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "d", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "exception", "finallyException", "f", "", "l", "I", "resumeMode", "Lkotlin/coroutines/Continuation;", "c", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9916y0<T> extends AbstractRunnableC9865h {

    /* renamed from: l */
    public int f25774l;

    public AbstractC9916y0(int i) {
        this.f25774l = i;
    }

    /* renamed from: b */
    public void mo12964b(Object obj, Throwable th2) {
    }

    /* renamed from: c */
    public abstract Continuation<T> mo12963c();

    /* renamed from: d */
    public Throwable mo12962d(Object obj) {
        C9676b0 c9676b0 = obj instanceof C9676b0 ? (C9676b0) obj : null;
        if (c9676b0 != null) {
            return c9676b0.f25415a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public <T> T mo12961e(Object obj) {
        return obj;
    }

    /* renamed from: f */
    public final void m12960f(Throwable th2, Throwable th3) {
        if (th2 == null && th3 == null) {
            return;
        }
        if (th2 != null && th3 != null) {
            C11560f.m7637a(th2, th3);
        }
        if (th2 == null) {
            th2 = th3;
        }
        C9612q.m13920e(th2);
        C9815k0.m13185a(mo12963c().getContext(), new C9835o0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2));
    }

    /* renamed from: g */
    public abstract Object mo12959g();

    @Override // java.lang.Runnable
    public final void run() {
        Object m7596b;
        C9674a3<?> c9674a3;
        Job job;
        Object m7596b2;
        InterfaceC9866i interfaceC9866i = this.f25709k;
        try {
            C9773g c9773g = (C9773g) mo12963c();
            Continuation<T> continuation = c9773g.f25579n;
            Object obj = c9773g.f25581p;
            CoroutineContext context = continuation.getContext();
            Object m13299c = C9776h0.m13299c(context, obj);
            if (m13299c != C9776h0.f25584a) {
                c9674a3 = C9746h0.m13377g(continuation, context, m13299c);
            } else {
                c9674a3 = null;
            }
            CoroutineContext context2 = continuation.getContext();
            Object mo12959g = mo12959g();
            Throwable mo12962d = mo12962d(mo12959g);
            if (mo12962d == null && C9920z0.m12954b(this.f25774l)) {
                job = (Job) context2.mo1458j(Job.f25404c);
            } else {
                job = null;
            }
            if (job != null && !job.mo2067a()) {
                CancellationException mo13542D = job.mo13542D();
                mo12964b(mo12959g, mo13542D);
                C11583s.C11584a c11584a = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(mo13542D)));
            } else if (mo12962d != null) {
                C11583s.C11584a c11584a2 = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(C11586t.m7587a(mo12962d)));
            } else {
                C11583s.C11584a c11584a3 = C11583s.f30090k;
                continuation.resumeWith(C11583s.m7596b(mo12961e(mo12959g)));
            }
            Unit unit = Unit.f25302a;
            if (c9674a3 == null || c9674a3.m13574a1()) {
                C9776h0.m13301a(context, m13299c);
            }
            try {
                interfaceC9866i.mo13053a();
                m7596b2 = C11583s.m7596b(Unit.f25302a);
            } catch (Throwable th2) {
                C11583s.C11584a c11584a4 = C11583s.f30090k;
                m7596b2 = C11583s.m7596b(C11586t.m7587a(th2));
            }
            m12960f(null, C11583s.m7593e(m7596b2));
        } catch (Throwable th3) {
            try {
                C11583s.C11584a c11584a5 = C11583s.f30090k;
                interfaceC9866i.mo13053a();
                m7596b = C11583s.m7596b(Unit.f25302a);
            } catch (Throwable th4) {
                C11583s.C11584a c11584a6 = C11583s.f30090k;
                m7596b = C11583s.m7596b(C11586t.m7587a(th4));
            }
            m12960f(th3, C11583s.m7593e(m7596b));
        }
    }
}
