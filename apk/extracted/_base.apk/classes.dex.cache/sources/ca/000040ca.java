package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/internal/n;", "Lkotlinx/coroutines/internal/p;", "", "X", "", "W", "()Z", "isEmpty", "Q", "isRemoved", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9789n extends C9791p {
    @Override // kotlinx.coroutines.internal.C9791p
    /* renamed from: Q */
    public boolean mo13246Q() {
        return false;
    }

    @Override // kotlinx.coroutines.internal.C9791p
    /* renamed from: R */
    public /* bridge */ /* synthetic */ boolean mo2042R() {
        return ((Boolean) m13264X()).booleanValue();
    }

    /* renamed from: W */
    public final boolean m13265W() {
        return m13251L() == this;
    }

    /* renamed from: X */
    public final Void m13264X() {
        throw new IllegalStateException("head cannot be removed".toString());
    }
}