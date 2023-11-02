package p371uf;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0019"}, m14357d2 = {"Luf/f;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lkotlin/coroutines/CoroutineContext$b;", "E", "Lkotlin/coroutines/CoroutineContext$c;", "key", "j", "(Lkotlin/coroutines/CoroutineContext$c;)Lkotlin/coroutines/CoroutineContext$b;", "R", "initial", "Lkotlin/Function2;", "operation", "t0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "e0", "j0", "", "hashCode", "", "toString", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: uf.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12967f implements CoroutineContext, Serializable {

    /* renamed from: j */
    public static final C12967f f33721j = new C12967f();

    private C12967f() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: e0 */
    public CoroutineContext mo1459e0(CoroutineContext context) {
        C9612q.m13917h(context, "context");
        return context;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j */
    public <E extends CoroutineContext.InterfaceC9564b> E mo1458j(CoroutineContext.InterfaceC9566c<E> key) {
        C9612q.m13917h(key, "key");
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: j0 */
    public CoroutineContext mo1457j0(CoroutineContext.InterfaceC9566c<?> key) {
        C9612q.m13917h(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    /* renamed from: t0 */
    public <R> R mo1456t0(R r, Function2<? super R, ? super CoroutineContext.InterfaceC9564b, ? extends R> operation) {
        C9612q.m13917h(operation, "operation");
        return r;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
