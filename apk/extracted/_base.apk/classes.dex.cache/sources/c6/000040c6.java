package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.InterfaceC9902u2;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, m14357d2 = {"Lkotlinx/coroutines/internal/k0;", "", "Lkotlinx/coroutines/u2;", "element", "value", "", "a", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "Lkotlin/coroutines/CoroutineContext;", "", "[Ljava/lang/Object;", "values", "c", "[Lkotlinx/coroutines/u2;", "elements", "", "d", "I", "i", "n", "<init>", "(Lkotlin/coroutines/CoroutineContext;I)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9785k0 {

    /* renamed from: a */
    public final CoroutineContext f25594a;

    /* renamed from: b */
    private final Object[] f25595b;

    /* renamed from: c */
    private final InterfaceC9902u2<Object>[] f25596c;

    /* renamed from: d */
    private int f25597d;

    public C9785k0(CoroutineContext coroutineContext, int i) {
        this.f25594a = coroutineContext;
        this.f25595b = new Object[i];
        this.f25596c = new InterfaceC9902u2[i];
    }

    /* renamed from: a */
    public final void m13270a(InterfaceC9902u2<?> interfaceC9902u2, Object obj) {
        Object[] objArr = this.f25595b;
        int i = this.f25597d;
        objArr[i] = obj;
        InterfaceC9902u2<Object>[] interfaceC9902u2Arr = this.f25596c;
        this.f25597d = i + 1;
        interfaceC9902u2Arr[i] = interfaceC9902u2;
    }

    /* renamed from: b */
    public final void m13269b(CoroutineContext coroutineContext) {
        int length = this.f25596c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC9902u2<Object> interfaceC9902u2 = this.f25596c[length];
            C9612q.m13920e(interfaceC9902u2);
            interfaceC9902u2.m12988U(coroutineContext, this.f25595b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}