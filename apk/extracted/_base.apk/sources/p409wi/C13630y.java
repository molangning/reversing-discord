package p409wi;

import kotlin.Metadata;
import kotlin.Unit;
import kotlinx.coroutines.C9839p0;
import kotlinx.coroutines.C9842q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9791p;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001a\u0010\u0012\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lwi/y;", "E", "Lwi/w;", "Lkotlinx/coroutines/internal/p$c;", "otherOp", "Lkotlinx/coroutines/internal/d0;", "Z", "", "W", "Lwi/l;", "closed", "Y", "", "toString", "m", "Ljava/lang/Object;", "X", "()Ljava/lang/Object;", "pollResult", "Lkotlinx/coroutines/CancellableContinuation;", "n", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "<init>", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13630y<E> extends AbstractC13627w {

    /* renamed from: m */
    private final E f35023m;

    /* renamed from: n */
    public final CancellableContinuation<Unit> f35024n;

    /* JADX WARN: Multi-variable type inference failed */
    public C13630y(E e, CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f35023m = e;
        this.f35024n = cancellableContinuation;
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: W */
    public void mo2046W() {
        this.f35024n.mo13156B(C9842q.f25662a);
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: X */
    public E mo2045X() {
        return this.f35023m;
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: Y */
    public void mo2044Y(C13614l<?> c13614l) {
        CancellableContinuation<Unit> cancellableContinuation = this.f35024n;
        C11583s.C11584a c11584a = C11583s.f30090k;
        cancellableContinuation.resumeWith(C11583s.m7596b(C11586t.m7587a(c13614l.m2083e0())));
    }

    @Override // p409wi.AbstractC13627w
    /* renamed from: Z */
    public C9768d0 mo2043Z(C9791p.C9794c c9794c) {
        C9791p.AbstractC9792a abstractC9792a;
        CancellableContinuation<Unit> cancellableContinuation = this.f35024n;
        Unit unit = Unit.f25302a;
        if (c9794c != null) {
            abstractC9792a = c9794c.f25612c;
        } else {
            abstractC9792a = null;
        }
        if (cancellableContinuation.mo13136k(unit, abstractC9792a) == null) {
            return null;
        }
        if (c9794c != null) {
            c9794c.m13238d();
        }
        return C9842q.f25662a;
    }

    @Override // kotlinx.coroutines.internal.C9791p
    public String toString() {
        return C9839p0.m13120a(this) + '@' + C9839p0.m13119b(this) + '(' + mo2045X() + ')';
    }
}
