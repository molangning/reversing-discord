package p409wi;

import kotlin.Metadata;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9791p;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0010\u001a\u00020\b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001d¨\u0006#"}, m14357d2 = {"Lwi/l;", "E", "Lwi/w;", "Lwi/u;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "value", "z", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/p$c;)Lkotlinx/coroutines/internal/d0;", "j", "(Ljava/lang/Object;)V", "closed", "Y", "", "toString", "", "m", "Ljava/lang/Throwable;", "closeCause", "e0", "()Ljava/lang/Throwable;", "sendException", "d0", "receiveException", "b0", "()Lwi/l;", "offerResult", "c0", "pollResult", "<init>", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13614l<E> extends AbstractC13627w implements InterfaceC13625u<E> {

    /* renamed from: m */
    public final Throwable f35015m;

    public C13614l(Throwable th2) {
        this.f35015m = th2;
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: W */
    public void mo2046W() {
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: Y */
    public void mo2044Y(C13614l<?> c13614l) {
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: Z */
    public C9768d0 mo2043Z(C9791p.C9794c c9794c) {
        C9768d0 c9768d0 = C9842q.f25662a;
        if (c9794c != null) {
            c9794c.m13238d();
        }
        return c9768d0;
    }

    @Override // p409wi.InterfaceC13625u
    /* renamed from: b0 */
    public C13614l<E> mo2059b() {
        return this;
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: c0 */
    public C13614l<E> mo2045X() {
        return this;
    }

    /* renamed from: d0 */
    public final Throwable m2084d0() {
        Throwable th2 = this.f35015m;
        return th2 == null ? new C13615m("Channel was closed") : th2;
    }

    /* renamed from: e0 */
    public final Throwable m2083e0() {
        Throwable th2 = this.f35015m;
        return th2 == null ? new C13616n("Channel was closed") : th2;
    }

    @Override // p409wi.InterfaceC13625u
    /* renamed from: j */
    public void mo2058j(E e) {
    }

    @Override // kotlinx.coroutines.internal.C9791p
    public String toString() {
        return "Closed@" + C9839p0.m13119b(this) + '[' + this.f35015m + ']';
    }

    @Override // p409wi.InterfaceC13625u
    /* renamed from: z */
    public C9768d0 mo2057z(E e, C9791p.C9794c c9794c) {
        C9768d0 c9768d0 = C9842q.f25662a;
        if (c9794c != null) {
            c9794c.m13238d();
        }
        return c9768d0;
    }
}
