package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.Ref$ObjectRef;
import p371uf.C12967f;
import p371uf.InterfaceC12963d;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0001H\u0002\u001a \u0010\u000b\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0002\u001a(\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000\u001a\u0013\u0010\u0012\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000f*\u00020\u0011H\u0080\u0010\"\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u0013*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m14357d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "context", "e", "addedContext", "d", "", "c", "originalContext", "appendContext", "isNewCoroutine", "a", "Lkotlin/coroutines/Continuation;", "", "oldValue", "Lkotlinx/coroutines/a3;", "g", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "f", "", "b", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "coroutineName", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9746h0 {

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9747a extends AbstractC9614s implements Function2<CoroutineContext, CoroutineContext.InterfaceC9564b, CoroutineContext> {

        /* renamed from: j */
        public static final C9747a f25544j = new C9747a();

        C9747a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            if (interfaceC9564b instanceof InterfaceC9742g0) {
                return coroutineContext.mo1459e0(((InterfaceC9742g0) interfaceC9564b).m13386S());
            }
            return coroutineContext.mo1459e0(interfaceC9564b);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "result", "Lkotlin/coroutines/CoroutineContext$b;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9748b extends AbstractC9614s implements Function2<CoroutineContext, CoroutineContext.InterfaceC9564b, CoroutineContext> {

        /* renamed from: j */
        final /* synthetic */ Ref$ObjectRef<CoroutineContext> f25545j;

        /* renamed from: k */
        final /* synthetic */ boolean f25546k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9748b(Ref$ObjectRef<CoroutineContext> ref$ObjectRef, boolean z) {
            super(2);
            this.f25545j = ref$ObjectRef;
            this.f25546k = z;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [T, kotlin.coroutines.CoroutineContext] */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final CoroutineContext invoke(CoroutineContext coroutineContext, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            if (!(interfaceC9564b instanceof InterfaceC9742g0)) {
                return coroutineContext.mo1459e0(interfaceC9564b);
            }
            CoroutineContext.InterfaceC9564b mo1458j = this.f25545j.f25329j.mo1458j(interfaceC9564b.getKey());
            if (mo1458j == null) {
                InterfaceC9742g0 interfaceC9742g0 = (InterfaceC9742g0) interfaceC9564b;
                if (this.f25546k) {
                    interfaceC9742g0 = interfaceC9742g0.m13386S();
                }
                return coroutineContext.mo1459e0(interfaceC9742g0);
            }
            Ref$ObjectRef<CoroutineContext> ref$ObjectRef = this.f25545j;
            ref$ObjectRef.f25329j = ref$ObjectRef.f25329j.mo1457j0(interfaceC9564b.getKey());
            return coroutineContext.mo1459e0(((InterfaceC9742g0) interfaceC9564b).m13385s(mo1458j));
        }
    }

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"", "result", "Lkotlin/coroutines/CoroutineContext$b;", "it", "a", "(ZLkotlin/coroutines/CoroutineContext$b;)Ljava/lang/Boolean;"}, m14356k = 3, m14355mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.h0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C9749c extends AbstractC9614s implements Function2<Boolean, CoroutineContext.InterfaceC9564b, Boolean> {

        /* renamed from: j */
        public static final C9749c f25547j = new C9749c();

        C9749c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean m13374a(boolean z, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            return Boolean.valueOf(z || (interfaceC9564b instanceof InterfaceC9742g0));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool, CoroutineContext.InterfaceC9564b interfaceC9564b) {
            return m13374a(bool.booleanValue(), interfaceC9564b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, java.lang.Object] */
    /* renamed from: a */
    private static final CoroutineContext m13383a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, boolean z) {
        boolean m13381c = m13381c(coroutineContext);
        boolean m13381c2 = m13381c(coroutineContext2);
        if (!m13381c && !m13381c2) {
            return coroutineContext.mo1459e0(coroutineContext2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f25329j = coroutineContext2;
        C12967f c12967f = C12967f.f33721j;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.mo1456t0(c12967f, new C9748b(ref$ObjectRef, z));
        if (m13381c2) {
            ref$ObjectRef.f25329j = ((CoroutineContext) ref$ObjectRef.f25329j).mo1456t0(c12967f, C9747a.f25544j);
        }
        return coroutineContext3.mo1459e0((CoroutineContext) ref$ObjectRef.f25329j);
    }

    /* renamed from: b */
    public static final String m13382b(CoroutineContext coroutineContext) {
        return null;
    }

    /* renamed from: c */
    private static final boolean m13381c(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.mo1456t0(Boolean.FALSE, C9749c.f25547j)).booleanValue();
    }

    /* renamed from: d */
    public static final CoroutineContext m13380d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        if (!m13381c(coroutineContext2)) {
            return coroutineContext.mo1459e0(coroutineContext2);
        }
        return m13383a(coroutineContext, coroutineContext2, false);
    }

    /* renamed from: e */
    public static final CoroutineContext m13379e(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext m13383a = m13383a(coroutineScope.getCoroutineContext(), coroutineContext, true);
        if (m13383a != C9677b1.m13570a() && m13383a.mo1458j(InterfaceC12963d.f33719g) == null) {
            return m13383a.mo1459e0(C9677b1.m13570a());
        }
        return m13383a;
    }

    /* renamed from: f */
    public static final C9674a3<?> m13378f(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof C9912x0) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof C9674a3) {
                return (C9674a3) coroutineStackFrame;
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final C9674a3<?> m13377g(Continuation<?> continuation, CoroutineContext coroutineContext, Object obj) {
        boolean z;
        if (!(continuation instanceof CoroutineStackFrame)) {
            return null;
        }
        if (coroutineContext.mo1458j(C9679b3.f25420j) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return null;
        }
        C9674a3<?> m13378f = m13378f((CoroutineStackFrame) continuation);
        if (m13378f != null) {
            m13378f.m13573b1(coroutineContext, obj);
        }
        return m13378f;
    }
}