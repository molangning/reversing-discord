package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlinx.coroutines.internal.C9773g;
import kotlinx.coroutines.internal.C9775h;
import p388vf.C13272c;
import p388vf.C13277d;

@Metadata(m14358d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m14357d2 = {"", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d3 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9690d3 {
    /* renamed from: a */
    public static final Object m13555a(Continuation<? super Unit> continuation) {
        Continuation m2870c;
        C9773g c9773g;
        Object obj;
        Object m2869d;
        Object m2869d2;
        CoroutineContext context = continuation.getContext();
        C9673a2.m13576h(context);
        m2870c = C13272c.m2870c(continuation);
        if (m2870c instanceof C9773g) {
            c9773g = (C9773g) m2870c;
        } else {
            c9773g = null;
        }
        if (c9773g == null) {
            obj = Unit.f25302a;
        } else {
            if (c9773g.f25578m.mo2768D0(context)) {
                c9773g.m13316m(context, Unit.f25302a);
            } else {
                C9684c3 c9684c3 = new C9684c3();
                CoroutineContext mo1459e0 = context.mo1459e0(c9684c3);
                Unit unit = Unit.f25302a;
                c9773g.m13316m(mo1459e0, unit);
                if (c9684c3.f25425k) {
                    if (C9775h.m13302d(c9773g)) {
                        obj = C13277d.m2869d();
                    } else {
                        obj = unit;
                    }
                }
            }
            obj = C13277d.m2869d();
        }
        m2869d = C13277d.m2869d();
        if (obj == m2869d) {
            C9573g.m13976c(continuation);
        }
        m2869d2 = C13277d.m2869d();
        if (obj == m2869d2) {
            return obj;
        }
        return Unit.f25302a;
    }
}
