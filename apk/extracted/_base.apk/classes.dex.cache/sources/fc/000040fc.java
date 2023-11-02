package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.C9773g;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0010\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\u0000\"\u0018\u0010\u0006\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0018\u0010\b\u001a\u00020\u0001*\u00020\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, m14357d2 = {"Lkotlin/coroutines/Continuation;", "", "c", "", "b", "(Ljava/lang/Object;)Ljava/lang/String;", "hexAddress", "a", "classSimpleName", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9839p0 {
    /* renamed from: a */
    public static final String m13120a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* renamed from: b */
    public static final String m13119b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* renamed from: c */
    public static final String m13118c(Continuation<?> continuation) {
        String m7596b;
        if (continuation instanceof C9773g) {
            return continuation.toString();
        }
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(continuation + '@' + m13119b(continuation));
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7593e(m7596b) != null) {
            m7596b = continuation.getClass().getName() + '@' + m13119b(continuation);
        }
        return (String) m7596b;
    }
}