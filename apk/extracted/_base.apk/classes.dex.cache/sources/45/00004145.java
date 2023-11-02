package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9764b0;
import kotlinx.coroutines.internal.C9775h;
import p388vf.C13272c;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m14357d2 = {"Lkotlinx/coroutines/x0;", "T", "Lkotlinx/coroutines/internal/b0;", "", "c1", "()Z", "b1", "", "state", "", "F", "(Ljava/lang/Object;)V", "V0", "a1", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.x0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9912x0<T> extends C9764b0<T> {

    /* renamed from: m */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f25771m = AtomicIntegerFieldUpdater.newUpdater(C9912x0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public C9912x0(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
        this._decision = 0;
    }

    /* renamed from: b1 */
    private final boolean m12969b1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f25771m.compareAndSet(this, 0, 2));
        return true;
    }

    /* renamed from: c1 */
    private final boolean m12968c1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f25771m.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.C9764b0, kotlinx.coroutines.C9696e2
    /* renamed from: F */
    public void mo12972F(Object obj) {
        mo12971V0(obj);
    }

    @Override // kotlinx.coroutines.internal.C9764b0, kotlinx.coroutines.AbstractC9670a
    /* renamed from: V0 */
    protected void mo12971V0(Object obj) {
        Continuation m2870c;
        if (m12969b1()) {
            return;
        }
        m2870c = C13272c.m2870c(this.f25567l);
        C9775h.m13303c(m2870c, C9703f0.m13477a(obj, this.f25567l), null, 2, null);
    }

    /* renamed from: a1 */
    public final Object m12970a1() {
        Object m2869d;
        if (m12968c1()) {
            m2869d = C13277d.m2869d();
            return m2869d;
        }
        Object m13466h = C9705f2.m13466h(m13504l0());
        if (!(m13466h instanceof C9676b0)) {
            return m13466h;
        }
        throw ((C9676b0) m13466h).f25415a;
    }
}