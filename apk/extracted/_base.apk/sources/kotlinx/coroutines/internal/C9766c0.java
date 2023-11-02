package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.AbstractC9567a;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, m14357d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9766c0 {

    /* renamed from: a */
    private static final String f25570a;

    /* renamed from: b */
    private static final String f25571b;

    static {
        Object m7596b;
        Object m7596b2;
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            m7596b = C11583s.m7596b(AbstractC9567a.class.getCanonicalName());
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        if (C11583s.m7593e(m7596b) != null) {
            m7596b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f25570a = (String) m7596b;
        try {
            m7596b2 = C11583s.m7596b(C9766c0.class.getCanonicalName());
        } catch (Throwable th3) {
            C11583s.C11584a c11584a3 = C11583s.f30090k;
            m7596b2 = C11583s.m7596b(C11586t.m7587a(th3));
        }
        if (C11583s.m7593e(m7596b2) != null) {
            m7596b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f25571b = (String) m7596b2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m13332a(E e) {
        return e;
    }
}
