package kotlinx.coroutines;

import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u00102\u001a\u00020%\u0012\u0006\u00103\u001a\u00020\f\u0012\u0006\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\u0012\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0004J\u001e\u0010\u0016\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000fH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJJ\u0010#\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00028\u00012\"\u0010\"\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00110!ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u001d\u0010,\u001a\u00020%8\u0006¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010)R\u0014\u00101\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m14357d2 = {"Lkotlinx/coroutines/a;", "T", "Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "value", "", "X0", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "W0", "", "P", "", "state", "D0", "Lpf/s;", "result", "resumeWith", "V0", "exception", "n0", "(Ljava/lang/Throwable;)V", "x0", "()Ljava/lang/String;", "R", "Lkotlinx/coroutines/n0;", ViewProps.START, "receiver", "Lkotlin/Function2;", "block", "Y0", "(Lkotlinx/coroutines/n0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/CoroutineContext;", "k", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getContext$annotations", "()V", "context", "getCoroutineContext", "coroutineContext", "a", "()Z", "isActive", "parentContext", "initParentJob", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;ZZ)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9670a<T> extends C9696e2 implements Continuation<T>, CoroutineScope {

    /* renamed from: k */
    private final CoroutineContext f25406k;

    public AbstractC9670a(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m13502o0((Job) coroutineContext.mo1458j(Job.f25404c));
        }
        this.f25406k = coroutineContext.mo1459e0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: D0 */
    protected final void mo13541D0(Object obj) {
        if (obj instanceof C9676b0) {
            C9676b0 c9676b0 = (C9676b0) obj;
            mo2069W0(c9676b0.f25415a, c9676b0.m13572a());
            return;
        }
        mo2068X0(obj);
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: P */
    public String mo13523P() {
        return C9839p0.m13120a(this) + " was cancelled";
    }

    /* renamed from: V0 */
    protected void mo12971V0(Object obj) {
        mo12972F(obj);
    }

    /* renamed from: W0 */
    protected void mo2069W0(Throwable th2, boolean z) {
    }

    /* renamed from: X0 */
    protected void mo2068X0(T t) {
    }

    /* renamed from: Y0 */
    public final <R> void m13588Y0(EnumC9828n0 enumC9828n0, R r, Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2) {
        enumC9828n0.m13162b(function2, r, this);
    }

    @Override // kotlinx.coroutines.C9696e2, kotlinx.coroutines.Job
    /* renamed from: a */
    public boolean mo2067a() {
        return super.mo2067a();
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f25406k;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f25406k;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: n0 */
    public final void mo13503n0(Throwable th2) {
        C9815k0.m13185a(this.f25406k, th2);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Object m13497u0 = m13497u0(C9703f0.m13474d(obj, null, 1, null));
        if (m13497u0 == C9705f2.f25452b) {
            return;
        }
        mo12971V0(m13497u0);
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: x0 */
    public String mo12967x0() {
        String m13382b = C9746h0.m13382b(this.f25406k);
        if (m13382b == null) {
            return super.mo12967x0();
        }
        return '\"' + m13382b + "\":" + super.mo12967x0();
    }
}