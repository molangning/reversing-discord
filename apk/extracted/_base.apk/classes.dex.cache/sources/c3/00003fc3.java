package kotlin.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J \u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m14357d2 = {"Lkotlin/coroutines/Continuation;", "T", "", "Lpf/s;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface Continuation<T> {
    CoroutineContext getContext();

    void resumeWith(Object obj);
}