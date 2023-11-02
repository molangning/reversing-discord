package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import p388vf.C13277d;
import p409wi.EnumC13603e;
import p430xi.AbstractC13808d;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BR\u0012(\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R9\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n8\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/coroutines/flow/c;", "T", "Lxi/d;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "", "d", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "toString", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "m", "Lkotlin/jvm/functions/Function2;", "block", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "<init>", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;ILwi/e;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9710c<T> extends AbstractC13808d<T> {

    /* renamed from: m */
    private final Function2<ProducerScope<? super T>, Continuation<? super Unit>, Object> f25467m;

    /* JADX WARN: Multi-variable type inference failed */
    public C9710c(Function2<? super ProducerScope<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        super(coroutineContext, i, enumC13603e);
        this.f25467m = function2;
    }

    /* renamed from: i */
    static /* synthetic */ Object m13465i(C9710c c9710c, ProducerScope producerScope, Continuation continuation) {
        Object m2869d;
        Object invoke = c9710c.f25467m.invoke(producerScope, continuation);
        m2869d = C13277d.m2869d();
        return invoke == m2869d ? invoke : Unit.f25302a;
    }

    @Override // p430xi.AbstractC13808d
    /* renamed from: d */
    public Object mo1465d(ProducerScope<? super T> producerScope, Continuation<? super Unit> continuation) {
        return m13465i(this, producerScope, continuation);
    }

    @Override // p430xi.AbstractC13808d
    public String toString() {
        return "block[" + this.f25467m + "] -> " + super.toString();
    }
}