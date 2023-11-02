package kotlinx.coroutines.flow;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.internal.C9768d0;
import p388vf.C13272c;
import p388vf.C13277d;
import p430xi.AbstractC13807c;
import p430xi.C13806b;
import pf.C11583s;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/flow/r;", "Lxi/c;", "Lkotlinx/coroutines/flow/p;", "flow", "", "c", "(Lkotlinx/coroutines/flow/p;)Z", "", "Lkotlin/coroutines/Continuation;", "", "e", "(Lkotlinx/coroutines/flow/p;)[Lkotlin/coroutines/Continuation;", "f", "()V", "g", "()Z", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.flow.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9737r extends AbstractC13807c<C9734p<?>> {

    /* renamed from: a */
    static final /* synthetic */ AtomicReferenceFieldUpdater f25531a = AtomicReferenceFieldUpdater.newUpdater(C9737r.class, Object.class, "_state");
    volatile /* synthetic */ Object _state = null;

    @Override // p430xi.AbstractC13807c
    /* renamed from: c */
    public boolean mo1476a(C9734p<?> c9734p) {
        C9768d0 c9768d0;
        if (this._state != null) {
            return false;
        }
        c9768d0 = C9736q.f25529a;
        this._state = c9768d0;
        return true;
    }

    /* renamed from: d */
    public final Object m13391d(Continuation<? super Unit> continuation) {
        Continuation m2870c;
        C9768d0 c9768d0;
        Object m2869d;
        Object m2869d2;
        m2870c = C13272c.m2870c(continuation);
        C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25531a;
        c9768d0 = C9736q.f25529a;
        if (!C0647b.m39437a(atomicReferenceFieldUpdater, this, c9768d0, c9838p)) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            c9838p.resumeWith(C11583s.m7596b(Unit.f25302a));
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        m2869d2 = C13277d.m2869d();
        if (m13122y == m2869d2) {
            return m13122y;
        }
        return Unit.f25302a;
    }

    @Override // p430xi.AbstractC13807c
    /* renamed from: e */
    public Continuation<Unit>[] mo1475b(C9734p<?> c9734p) {
        this._state = null;
        return C13806b.f35578a;
    }

    /* renamed from: f */
    public final void m13389f() {
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        C9768d0 c9768d03;
        C9768d0 c9768d04;
        while (true) {
            Object obj = this._state;
            if (obj == null) {
                return;
            }
            c9768d0 = C9736q.f25530b;
            if (obj == c9768d0) {
                return;
            }
            c9768d02 = C9736q.f25529a;
            if (obj == c9768d02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25531a;
                c9768d03 = C9736q.f25530b;
                if (C0647b.m39437a(atomicReferenceFieldUpdater, this, obj, c9768d03)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f25531a;
                c9768d04 = C9736q.f25529a;
                if (C0647b.m39437a(atomicReferenceFieldUpdater2, this, obj, c9768d04)) {
                    C11583s.C11584a c11584a = C11583s.f30090k;
                    ((C9838p) obj).resumeWith(C11583s.m7596b(Unit.f25302a));
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean m13388g() {
        C9768d0 c9768d0;
        C9768d0 c9768d02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25531a;
        c9768d0 = C9736q.f25529a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c9768d0);
        C9612q.m13920e(andSet);
        c9768d02 = C9736q.f25530b;
        if (andSet == c9768d02) {
            return true;
        }
        return false;
    }
}