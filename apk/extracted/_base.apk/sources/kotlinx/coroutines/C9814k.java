package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import p371uf.C12967f;
import p371uf.InterfaceC12963d;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aQ\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m14357d2 = {"T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "block", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9814k {
    /* renamed from: a */
    public static final <T> T m13187a(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        AbstractC9750h1 abstractC9750h1;
        AbstractC9750h1 m12981a;
        CoroutineContext m13379e;
        Thread currentThread = Thread.currentThread();
        InterfaceC12963d interfaceC12963d = (InterfaceC12963d) coroutineContext.mo1458j(InterfaceC12963d.f33719g);
        if (interfaceC12963d == null) {
            m12981a = C9906v2.f25766a.m12980b();
            m13379e = C9746h0.m13379e(C9844q1.f25665j, coroutineContext.mo1459e0(m12981a));
        } else {
            AbstractC9750h1 abstractC9750h12 = null;
            if (interfaceC12963d instanceof AbstractC9750h1) {
                abstractC9750h1 = (AbstractC9750h1) interfaceC12963d;
            } else {
                abstractC9750h1 = null;
            }
            if (abstractC9750h1 != null) {
                if (abstractC9750h1.m13364Q0()) {
                    abstractC9750h12 = abstractC9750h1;
                }
                if (abstractC9750h12 != null) {
                    m12981a = abstractC9750h12;
                    m13379e = C9746h0.m13379e(C9844q1.f25665j, coroutineContext);
                }
            }
            m12981a = C9906v2.f25766a.m12981a();
            m13379e = C9746h0.m13379e(C9844q1.f25665j, coroutineContext);
        }
        C9745h c9745h = new C9745h(m13379e, currentThread, m12981a);
        c9745h.m13588Y0(EnumC9828n0.DEFAULT, c9745h, function2);
        return (T) c9745h.m13384Z0();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m13186b(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12967f.f33721j;
        }
        return C9810j.m13192e(coroutineContext, function2);
    }
}
