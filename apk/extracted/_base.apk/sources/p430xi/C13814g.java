package p430xi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p371uf.C12967f;
import p388vf.C13277d;
import p409wi.EnumC13603e;

@Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J!\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, m14357d2 = {"Lxi/g;", "T", "Lxi/f;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "Lxi/d;", "e", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "l", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "flow", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13814g<T> extends AbstractC13812f<T, T> {
    public /* synthetic */ C13814g(Flow flow, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, (i2 & 2) != 0 ? C12967f.f33721j : coroutineContext, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? EnumC13603e.SUSPEND : enumC13603e);
    }

    @Override // p430xi.AbstractC13808d
    /* renamed from: e */
    protected AbstractC13808d<T> mo1461e(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        return new C13814g(this.f35589m, coroutineContext, i, enumC13603e);
    }

    @Override // p430xi.AbstractC13812f
    /* renamed from: l */
    protected Object mo1460l(FlowCollector<? super T> flowCollector, Continuation<? super Unit> continuation) {
        Object m2869d;
        Object collect = this.f35589m.collect(flowCollector, continuation);
        m2869d = C13277d.m2869d();
        return collect == m2869d ? collect : Unit.f25302a;
    }

    public C13814g(Flow<? extends T> flow, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        super(flow, coroutineContext, i, enumC13603e);
    }
}
