package kotlinx.coroutines;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.sequences.Sequence;
import pf.C11560f;
import pf.C11583s;
import pf.C11586t;
import si.C12545m;
import si.C12552o;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\n"}, m14357d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "exception", "", "a", "", "Lkotlinx/coroutines/i0;", "Ljava/util/List;", "handlers", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.j0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9811j0 {

    /* renamed from: a */
    private static final List<InterfaceC9753i0> f25637a;

    static {
        Sequence m4881c;
        List<InterfaceC9753i0> m4867E;
        m4881c = C12545m.m4881c(ServiceLoader.load(InterfaceC9753i0.class, InterfaceC9753i0.class.getClassLoader()).iterator());
        m4867E = C12552o.m4867E(m4881c);
        f25637a = m4867E;
    }

    /* renamed from: a */
    public static final void m13189a(CoroutineContext coroutineContext, Throwable th2) {
        for (InterfaceC9753i0 interfaceC9753i0 : f25637a) {
            try {
                interfaceC9753i0.mo2770b0(coroutineContext, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, C9815k0.m13184b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            C11560f.m7637a(th2, new C9908w0(coroutineContext));
            C11583s.m7596b(Unit.f25302a);
        } catch (Throwable th4) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            C11583s.m7596b(C11586t.m7587a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}