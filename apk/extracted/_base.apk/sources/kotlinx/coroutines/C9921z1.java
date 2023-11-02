package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0003R\u001a\u0010\t\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00038PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, m14357d2 = {"Lkotlinx/coroutines/z1;", "Lkotlinx/coroutines/e2;", "Lkotlinx/coroutines/z;", "", "V0", "k", "Z", "g0", "()Z", "handlesException", "h0", "onCancelComplete", "Lkotlinx/coroutines/Job;", "parent", "<init>", "(Lkotlinx/coroutines/Job;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9921z1 extends C9696e2 implements InterfaceC9919z {

    /* renamed from: k */
    private final boolean f25775k;

    public C9921z1(Job job) {
        super(true);
        m13502o0(job);
        this.f25775k = m12950V0();
    }

    /* renamed from: V0 */
    private final boolean m12950V0() {
        C9903v c9903v;
        C9696e2 m13557X;
        C9903v c9903v2;
        InterfaceC9898u m13505k0 = m13505k0();
        if (m13505k0 instanceof C9903v) {
            c9903v = (C9903v) m13505k0;
        } else {
            c9903v = null;
        }
        if (c9903v != null && (m13557X = c9903v.m13557X()) != null) {
            while (!m13557X.mo12949g0()) {
                InterfaceC9898u m13505k02 = m13557X.m13505k0();
                if (m13505k02 instanceof C9903v) {
                    c9903v2 = (C9903v) m13505k02;
                } else {
                    c9903v2 = null;
                }
                if (c9903v2 != null) {
                    m13557X = c9903v2.m13557X();
                    if (m13557X == null) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: g0 */
    public boolean mo12949g0() {
        return this.f25775k;
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: h0 */
    public boolean mo12948h0() {
        return true;
    }
}
