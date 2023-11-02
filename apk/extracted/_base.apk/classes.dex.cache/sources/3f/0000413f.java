package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0007J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000bj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002`\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0011"}, m14357d2 = {"Lkotlinx/coroutines/v2;", "", "Lkotlinx/coroutines/h1;", "a", "()Lkotlinx/coroutines/h1;", "", "c", "()V", "eventLoop", "d", "(Lkotlinx/coroutines/h1;)V", "Ljava/lang/ThreadLocal;", "Lkotlinx/coroutines/internal/CommonThreadLocal;", "b", "Ljava/lang/ThreadLocal;", "ref", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.v2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9906v2 {

    /* renamed from: a */
    public static final C9906v2 f25766a = new C9906v2();

    /* renamed from: b */
    private static final ThreadLocal<AbstractC9750h1> f25767b = new ThreadLocal<>();

    private C9906v2() {
    }

    /* renamed from: a */
    public final AbstractC9750h1 m12981a() {
        return f25767b.get();
    }

    /* renamed from: b */
    public final AbstractC9750h1 m12980b() {
        ThreadLocal<AbstractC9750h1> threadLocal = f25767b;
        AbstractC9750h1 abstractC9750h1 = threadLocal.get();
        if (abstractC9750h1 == null) {
            AbstractC9750h1 m13183a = C9816k1.m13183a();
            threadLocal.set(m13183a);
            return m13183a;
        }
        return abstractC9750h1;
    }

    /* renamed from: c */
    public final void m12979c() {
        f25767b.set(null);
    }

    /* renamed from: d */
    public final void m12978d(AbstractC9750h1 abstractC9750h1) {
        f25767b.set(abstractC9750h1);
    }
}