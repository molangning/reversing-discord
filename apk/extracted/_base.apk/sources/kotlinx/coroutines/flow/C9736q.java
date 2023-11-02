package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9768d0;
import p409wi.EnumC13603e;
import p430xi.C13823m;

@Metadata(m14358d1 = {"\u00000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a6\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000\"\u001a\u0010\u0012\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011\"\u001a\u0010\u0015\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u0012\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, m14357d2 = {"T", "value", "Lkotlinx/coroutines/flow/MutableStateFlow;", "a", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/o;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "d", "Lkotlinx/coroutines/internal/d0;", "Lkotlinx/coroutines/internal/d0;", "getNONE$annotations", "()V", "NONE", "b", "getPENDING$annotations", "PENDING", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9736q {

    /* renamed from: a */
    private static final C9768d0 f25529a = new C9768d0("NONE");

    /* renamed from: b */
    private static final C9768d0 f25530b = new C9768d0("PENDING");

    /* renamed from: a */
    public static final <T> MutableStateFlow<T> m13396a(T t) {
        if (t == null) {
            t = (T) C13823m.f35602a;
        }
        return new C9734p(t);
    }

    /* renamed from: d */
    public static final <T> Flow<T> m13393d(InterfaceC9733o<? extends T> interfaceC9733o, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e) {
        boolean z = false;
        if (i >= 0 && i < 2) {
            z = true;
        }
        if ((z || i == -2) && enumC13603e == EnumC13603e.DROP_OLDEST) {
            return interfaceC9733o;
        }
        return C9731m.m13404d(interfaceC9733o, coroutineContext, i, enumC13603e);
    }
}
