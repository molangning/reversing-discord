package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C9773g;
import kotlinx.coroutines.internal.C9791p;

@Metadata(m14358d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a\u0018\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\f\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, m14357d2 = {"T", "Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/p;", "b", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/internal/p;", "node", "", "c", "Lkotlinx/coroutines/d1;", "handle", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9846r {
    /* renamed from: a */
    public static final void m13106a(CancellableContinuation<?> cancellableContinuation, InterfaceC9688d1 interfaceC9688d1) {
        cancellableContinuation.mo13135l(new C9695e1(interfaceC9688d1));
    }

    /* renamed from: b */
    public static final <T> C9838p<T> m13105b(Continuation<? super T> continuation) {
        if (!(continuation instanceof C9773g)) {
            return new C9838p<>(continuation, 1);
        }
        C9838p<T> m13317j = ((C9773g) continuation).m13317j();
        if (m13317j != null) {
            if (!m13317j.m13147K()) {
                m13317j = null;
            }
            if (m13317j != null) {
                return m13317j;
            }
        }
        return new C9838p<>(continuation, 2);
    }

    /* renamed from: c */
    public static final void m13104c(CancellableContinuation<?> cancellableContinuation, C9791p c9791p) {
        cancellableContinuation.mo13135l(new C9833n2(c9791p));
    }
}