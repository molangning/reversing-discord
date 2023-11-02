package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlinx.coroutines.C9815k0;
import pf.C11560f;

/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(m14358d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, m14357d2 = {"E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/l0;", "undeliveredElementException", "c", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlinx/coroutines/internal/l0;)Lkotlinx/coroutines/internal/l0;", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", "", "a", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)Lkotlin/jvm/functions/Function1;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9806x {

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m14357d2 = {"<anonymous>", "", "E", "<anonymous parameter 0>", "", "invoke"}, m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: kotlinx.coroutines.internal.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C9807a extends AbstractC9614s implements Function1<Throwable, Unit> {

        /* renamed from: j */
        final /* synthetic */ Function1<E, Unit> f25633j;

        /* renamed from: k */
        final /* synthetic */ E f25634k;

        /* renamed from: l */
        final /* synthetic */ CoroutineContext f25635l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9807a(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
            super(1);
            this.f25633j = function1;
            this.f25634k = e;
            this.f25635l = coroutineContext;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            invoke2(th2);
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th2) {
            C9806x.m13200b(this.f25633j, this.f25634k, this.f25635l);
        }
    }

    /* renamed from: a */
    public static final <E> Function1<Throwable, Unit> m13201a(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
        return new C9807a(function1, e, coroutineContext);
    }

    /* renamed from: b */
    public static final <E> void m13200b(Function1<? super E, Unit> function1, E e, CoroutineContext coroutineContext) {
        C9787l0 m13199c = m13199c(function1, e, null);
        if (m13199c != null) {
            C9815k0.m13185a(coroutineContext, m13199c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static final <E> C9787l0 m13199c(Function1<? super E, Unit> function1, E e, C9787l0 c9787l0) {
        try {
            function1.invoke(e);
        } catch (Throwable th2) {
            if (c9787l0 != null && c9787l0.getCause() != th2) {
                C11560f.m7637a(c9787l0, th2);
            } else {
                return new C9787l0("Exception in undelivered element handler for " + e, th2);
            }
        }
        return c9787l0;
    }

    /* renamed from: d */
    public static /* synthetic */ C9787l0 m13198d(Function1 function1, Object obj, C9787l0 c9787l0, int i, Object obj2) {
        if ((i & 2) != 0) {
            c9787l0 = null;
        }
        return m13199c(function1, obj, c9787l0);
    }
}
