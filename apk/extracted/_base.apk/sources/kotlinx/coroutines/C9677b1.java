package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9803u;
import kotlinx.coroutines.scheduling.C9860c;
import kotlinx.coroutines.scheduling.ExecutorC9859b;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0003\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00118FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\b\u001a\u0004\b\n\u0010\u0012¨\u0006\u0016"}, m14357d2 = {"Lkotlinx/coroutines/b1;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "b", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault$annotations", "()V", "Default", "c", "getUnconfined", "getUnconfined$annotations", "Unconfined", "d", "getIO$annotations", "IO", "Lkotlinx/coroutines/i2;", "()Lkotlinx/coroutines/i2;", "getMain$annotations", "Main", "<init>", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9677b1 {

    /* renamed from: a */
    public static final C9677b1 f25416a = new C9677b1();

    /* renamed from: b */
    private static final CoroutineDispatcher f25417b = C9860c.f25701r;

    /* renamed from: c */
    private static final CoroutineDispatcher f25418c = C9922z2.f25776l;

    /* renamed from: d */
    private static final CoroutineDispatcher f25419d = ExecutorC9859b.f25699m;

    private C9677b1() {
    }

    /* renamed from: a */
    public static final CoroutineDispatcher m13570a() {
        return f25417b;
    }

    /* renamed from: b */
    public static final CoroutineDispatcher m13569b() {
        return f25419d;
    }

    /* renamed from: c */
    public static final AbstractC9760i2 m13568c() {
        return C9803u.f25629c;
    }
}
