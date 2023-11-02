package p277p3;

import android.os.Looper;

/* renamed from: p3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11375a {

    /* renamed from: a */
    private static AbstractC11375a f29615a;

    /* renamed from: p3.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC11376a {
        void release();
    }

    /* renamed from: b */
    public static synchronized AbstractC11375a m8206b() {
        AbstractC11375a abstractC11375a;
        synchronized (AbstractC11375a.class) {
            if (f29615a == null) {
                f29615a = new C11377b();
            }
            abstractC11375a = f29615a;
        }
        return abstractC11375a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m8205c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: a */
    public abstract void mo8204a(InterfaceC11376a interfaceC11376a);

    /* renamed from: d */
    public abstract void mo8203d(InterfaceC11376a interfaceC11376a);
}
