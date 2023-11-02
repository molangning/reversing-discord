package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(m14358d1 = {"kotlinx/coroutines/k", "kotlinx/coroutines/l"}, m14357d2 = {}, m14356k = 4, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9810j {
    /* renamed from: a */
    public static final <T> InterfaceC9851s0<T> m13196a(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return C9818l.m13182a(coroutineScope, coroutineContext, enumC9828n0, function2);
    }

    /* renamed from: c */
    public static final Job m13194c(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C9818l.m13180c(coroutineScope, coroutineContext, enumC9828n0, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ Job m13193d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, EnumC9828n0 enumC9828n0, Function2 function2, int i, Object obj) {
        return C9818l.m13179d(coroutineScope, coroutineContext, enumC9828n0, function2, i, obj);
    }

    /* renamed from: e */
    public static final <T> T m13192e(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return (T) C9814k.m13187a(coroutineContext, function2);
    }

    /* renamed from: g */
    public static final <T> Object m13190g(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return C9818l.m13178e(coroutineContext, function2, continuation);
    }
}
