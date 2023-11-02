package p409wi;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.C9768d0;
import kotlinx.coroutines.internal.C9787l0;
import kotlinx.coroutines.internal.C9806x;
import p409wi.AbstractC13598c;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f\u0018\u00010\u0019j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m14357d2 = {"Lwi/p;", "E", "Lwi/a;", "element", "", "y", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/k;", "Lwi/w;", "list", "Lwi/l;", "closed", "", "R", "(Ljava/lang/Object;Lwi/l;)V", "", "M", "()Z", "isBufferAlwaysEmpty", "N", "isBufferEmpty", "t", "isBufferAlwaysFull", "u", "isBufferFull", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: wi.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13618p<E> extends AbstractC13588a<E> {
    public C13618p(Function1<? super E, Unit> function1) {
        super(function1);
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: M */
    protected final boolean mo2056M() {
        return true;
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: N */
    protected final boolean mo2055N() {
        return true;
    }

    @Override // p409wi.AbstractC13588a
    /* renamed from: R */
    protected void mo2076R(Object obj, C13614l<?> c13614l) {
        C9787l0 c9787l0 = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                AbstractC13627w abstractC13627w = (AbstractC13627w) obj;
                if (abstractC13627w instanceof AbstractC13598c.C13599a) {
                    Function1<E, Unit> function1 = this.f34993j;
                    if (function1 != null) {
                        c9787l0 = C9806x.m13199c(function1, ((AbstractC13598c.C13599a) abstractC13627w).f34995m, null);
                    }
                } else {
                    abstractC13627w.mo2044Y(c13614l);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                C9787l0 c9787l02 = null;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    AbstractC13627w abstractC13627w2 = (AbstractC13627w) arrayList.get(size);
                    if (abstractC13627w2 instanceof AbstractC13598c.C13599a) {
                        Function1<E, Unit> function12 = this.f34993j;
                        if (function12 != null) {
                            c9787l02 = C9806x.m13199c(function12, ((AbstractC13598c.C13599a) abstractC13627w2).f34995m, c9787l02);
                        } else {
                            c9787l02 = null;
                        }
                    } else {
                        abstractC13627w2.mo2044Y(c13614l);
                    }
                }
                c9787l0 = c9787l02;
            }
        }
        if (c9787l0 == null) {
            return;
        }
        throw c9787l0;
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: t */
    protected final boolean mo2054t() {
        return false;
    }

    @Override // p409wi.AbstractC13598c
    /* renamed from: u */
    protected final boolean mo2053u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p409wi.AbstractC13598c
    /* renamed from: y */
    public Object mo2075y(E e) {
        InterfaceC13625u<?> m2132A;
        do {
            Object mo2075y = super.mo2075y(e);
            C9768d0 c9768d0 = C13597b.f34987b;
            if (mo2075y == c9768d0) {
                return c9768d0;
            }
            if (mo2075y == C13597b.f34988c) {
                m2132A = m2132A(e);
                if (m2132A == null) {
                    return c9768d0;
                }
            } else if (mo2075y instanceof C13614l) {
                return mo2075y;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + mo2075y).toString());
            }
        } while (!(m2132A instanceof C13614l));
        return m2132A;
    }
}
