package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0001\u001a\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001\u001a\u0014\u0010\u0007\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0001¨\u0006\b"}, m14357d2 = {"T", "Lkotlin/coroutines/Continuation;", "completion", "a", "frame", "", "b", "c", "kotlin-stdlib"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: kotlin.coroutines.jvm.internal.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9573g {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static final <T> Continuation<T> m13978a(Continuation<? super T> completion) {
        C9612q.m13917h(completion, "completion");
        return completion;
    }

    /* renamed from: b */
    public static final void m13977b(Continuation<?> frame) {
        C9612q.m13917h(frame, "frame");
    }

    /* renamed from: c */
    public static final void m13976c(Continuation<?> frame) {
        C9612q.m13917h(frame, "frame");
    }
}