package kotlinx.coroutines;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.internal.C9764b0;
import kotlinx.coroutines.internal.C9776h0;
import p371uf.C12967f;
import p371uf.InterfaceC12963d;
import p388vf.C13277d;
import p450yi.C14031a;
import p450yi.C14032b;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aL\u0010\u000b\u001a\u00020\n*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\r*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aR\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlinx/coroutines/n0;", ViewProps.START, "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lkotlinx/coroutines/Job;", "c", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/n0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "T", "Lkotlinx/coroutines/s0;", "a", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/n0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/s0;", "e", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/BuildersKt")
/* renamed from: kotlinx.coroutines.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9818l {
    /* renamed from: a */
    public static final <T> InterfaceC9851s0<T> m13182a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        C9895t0 c9895t0;
        CoroutineContext m13379e = C9746h0.m13379e(coroutineScope, coroutineContext);
        if (enumC9828n0.m13161c()) {
            c9895t0 = new C9744g2(m13379e, function2);
        } else {
            c9895t0 = new C9895t0(m13379e, true);
        }
        ((AbstractC9670a) c9895t0).m13588Y0(enumC9828n0, c9895t0, function2);
        return c9895t0;
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9851s0 m13181b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12967f.f33721j;
        }
        if ((i & 2) != 0) {
            enumC9828n0 = EnumC9828n0.DEFAULT;
        }
        return C9810j.m13196a(coroutineScope, coroutineContext, enumC9828n0, function2);
    }

    /* renamed from: c */
    public static final Job m13180c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        AbstractC9670a c9849r2;
        CoroutineContext m13379e = C9746h0.m13379e(coroutineScope, coroutineContext);
        if (enumC9828n0.m13161c()) {
            c9849r2 = new C9751h2(m13379e, function2);
        } else {
            c9849r2 = new C9849r2(m13379e, true);
        }
        c9849r2.m13588Y0(enumC9828n0, c9849r2, function2);
        return c9849r2;
    }

    /* renamed from: d */
    public static /* synthetic */ Job m13179d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = C12967f.f33721j;
        }
        if ((i & 2) != 0) {
            enumC9828n0 = EnumC9828n0.DEFAULT;
        }
        return C9810j.m13194c(coroutineScope, coroutineContext, enumC9828n0, function2);
    }

    /* renamed from: e */
    public static final <T> Object m13178e(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        Object m12970a1;
        Object m2869d;
        CoroutineContext context = continuation.getContext();
        CoroutineContext m13380d = C9746h0.m13380d(context, coroutineContext);
        C9673a2.m13576h(m13380d);
        if (m13380d == context) {
            C9764b0 c9764b0 = new C9764b0(m13380d, continuation);
            m12970a1 = C14032b.m857d(c9764b0, c9764b0, function2);
        } else {
            InterfaceC12963d.C12965b c12965b = InterfaceC12963d.f33719g;
            if (C9612q.m13922c(m13380d.mo1458j(c12965b), context.mo1458j(c12965b))) {
                C9674a3 c9674a3 = new C9674a3(m13380d, continuation);
                Object m13299c = C9776h0.m13299c(m13380d, null);
                try {
                    Object m857d = C14032b.m857d(c9674a3, c9674a3, function2);
                    C9776h0.m13301a(m13380d, m13299c);
                    m12970a1 = m857d;
                } catch (Throwable th2) {
                    C9776h0.m13301a(m13380d, m13299c);
                    throw th2;
                }
            } else {
                C9912x0 c9912x0 = new C9912x0(m13380d, continuation);
                C14031a.m861e(function2, c9912x0, c9912x0, null, 4, null);
                m12970a1 = c9912x0.m12970a1();
            }
        }
        m2869d = C13277d.m2869d();
        if (m12970a1 == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m12970a1;
    }
}