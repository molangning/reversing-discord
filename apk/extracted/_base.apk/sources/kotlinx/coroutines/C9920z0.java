package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.C9773g;
import kotlinx.coroutines.internal.C9776h0;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\"\u0018\u0010\u000e\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0010\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, m14357d2 = {"T", "Lkotlinx/coroutines/y0;", "", "mode", "", "a", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "d", "e", "b", "(I)Z", "isCancellableMode", "c", "isReusableMode", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.z0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9920z0 {
    /* renamed from: a */
    public static final <T> void m12955a(AbstractC9916y0<? super T> abstractC9916y0, int i) {
        boolean z;
        Continuation<? super T> mo12963c = abstractC9916y0.mo12963c();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (mo12963c instanceof C9773g) && m12954b(i) == m12954b(abstractC9916y0.f25774l)) {
            CoroutineDispatcher coroutineDispatcher = ((C9773g) mo12963c).f25578m;
            CoroutineContext context = mo12963c.getContext();
            if (coroutineDispatcher.mo2768D0(context)) {
                coroutineDispatcher.mo2769B0(context, abstractC9916y0);
                return;
            } else {
                m12951e(abstractC9916y0);
                return;
            }
        }
        m12952d(abstractC9916y0, mo12963c, z);
    }

    /* renamed from: b */
    public static final boolean m12954b(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: c */
    public static final boolean m12953c(int i) {
        return i == 2;
    }

    /* renamed from: d */
    public static final <T> void m12952d(AbstractC9916y0<? super T> abstractC9916y0, Continuation<? super T> continuation, boolean z) {
        Object mo12961e;
        C9674a3<?> c9674a3;
        boolean m13574a1;
        Object mo12959g = abstractC9916y0.mo12959g();
        Throwable mo12962d = abstractC9916y0.mo12962d(mo12959g);
        if (mo12962d != null) {
            C11583s.C11584a c11584a = C11583s.f30090k;
            mo12961e = C11586t.m7587a(mo12962d);
        } else {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            mo12961e = abstractC9916y0.mo12961e(mo12959g);
        }
        Object m7596b = C11583s.m7596b(mo12961e);
        if (z) {
            C9773g c9773g = (C9773g) continuation;
            Continuation<T> continuation2 = c9773g.f25579n;
            Object obj = c9773g.f25581p;
            CoroutineContext context = continuation2.getContext();
            Object m13299c = C9776h0.m13299c(context, obj);
            if (m13299c != C9776h0.f25584a) {
                c9674a3 = C9746h0.m13377g(continuation2, context, m13299c);
            } else {
                c9674a3 = null;
            }
            try {
                c9773g.f25579n.resumeWith(m7596b);
                Unit unit = Unit.f25302a;
                if (c9674a3 != null) {
                    if (!m13574a1) {
                        return;
                    }
                }
                return;
            } finally {
                if (c9674a3 == null || c9674a3.m13574a1()) {
                    C9776h0.m13301a(context, m13299c);
                }
            }
        }
        continuation.resumeWith(m7596b);
    }

    /* renamed from: e */
    private static final void m12951e(AbstractC9916y0<?> abstractC9916y0) {
        AbstractC9750h1 m12980b = C9906v2.f25766a.m12980b();
        if (m12980b.m13367M0()) {
            m12980b.m13370I0(abstractC9916y0);
            return;
        }
        m12980b.m13369K0(true);
        try {
            m12952d(abstractC9916y0, abstractC9916y0.mo12963c(), true);
            do {
            } while (m12980b.m13365P0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
