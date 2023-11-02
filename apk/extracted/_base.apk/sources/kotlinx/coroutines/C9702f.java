package kotlinx.coroutines;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.coroutines.Continuation;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001\"\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m14357d2 = {"T", "", "Lkotlinx/coroutines/s0;", "deferreds", "", "a", "([Lkotlinx/coroutines/s0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9702f {
    /* renamed from: a */
    public static final <T> Object m13478a(InterfaceC9851s0<? extends T>[] interfaceC9851s0Arr, Continuation<? super List<? extends T>> continuation) {
        List m14104i;
        if (interfaceC9851s0Arr.length == 0) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return new C9691e(interfaceC9851s0Arr).m13553b(continuation);
    }
}
