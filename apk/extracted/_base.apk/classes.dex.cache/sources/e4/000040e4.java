package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import pf.C11560f;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¨\u0006\t"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "originalException", "thrownException", "b", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9815k0 {
    /* renamed from: a */
    public static final void m13185a(CoroutineContext coroutineContext, Throwable th2) {
        try {
            InterfaceC9753i0 interfaceC9753i0 = (InterfaceC9753i0) coroutineContext.mo1458j(InterfaceC9753i0.f25553b);
            if (interfaceC9753i0 != null) {
                interfaceC9753i0.mo2770b0(coroutineContext, th2);
            } else {
                C9811j0.m13189a(coroutineContext, th2);
            }
        } catch (Throwable th3) {
            C9811j0.m13189a(coroutineContext, m13184b(th2, th3));
        }
    }

    /* renamed from: b */
    public static final Throwable m13184b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        C11560f.m7637a(runtimeException, th2);
        return runtimeException;
    }
}