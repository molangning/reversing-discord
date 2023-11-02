package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/d0;", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/s1;", "", "dispose", "", "toString", "Lkotlinx/coroutines/e2;", "m", "Lkotlinx/coroutines/e2;", "X", "()Lkotlinx/coroutines/e2;", "Y", "(Lkotlinx/coroutines/e2;)V", "job", "", "a", "()Z", "isActive", "Lkotlinx/coroutines/j2;", "d", "()Lkotlinx/coroutines/j2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC9689d2 extends AbstractC9687d0 implements InterfaceC9688d1, InterfaceC9852s1 {

    /* renamed from: m */
    public C9696e2 f25427m;

    /* renamed from: X */
    public final C9696e2 m13557X() {
        C9696e2 c9696e2 = this.f25427m;
        if (c9696e2 != null) {
            return c9696e2;
        }
        C9612q.m13900y("job");
        return null;
    }

    /* renamed from: Y */
    public final void m13556Y(C9696e2 c9696e2) {
        this.f25427m = c9696e2;
    }

    @Override // kotlinx.coroutines.InterfaceC9852s1
    /* renamed from: a */
    public boolean mo13099a() {
        return true;
    }

    @Override // kotlinx.coroutines.InterfaceC9852s1
    /* renamed from: d */
    public C9813j2 mo13098d() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC9688d1
    public void dispose() {
        m13557X().m13535I0(this);
    }

    @Override // kotlinx.coroutines.internal.C9791p
    public String toString() {
        return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this) + "[job@" + C9839p0.m13119b(m13557X()) + ']';
    }
}