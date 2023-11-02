package gi;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: gi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC6817k {

    /* renamed from: a */
    public static final C6818a f19028a = C6818a.f19029a;

    /* renamed from: gi.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C6818a {

        /* renamed from: a */
        static final /* synthetic */ C6818a f19029a = new C6818a();

        private C6818a() {
        }

        /* renamed from: a */
        public final C6793d m21874a(Runnable runnable, Function1<? super InterruptedException, Unit> function1) {
            if (runnable != null && function1 != null) {
                return new C6792c(runnable, function1);
            }
            return new C6793d(null, 1, null);
        }
    }

    void lock();

    void unlock();
}