package p233mf;

import java.util.concurrent.atomic.AtomicInteger;
import lk.InterfaceC10220b;
import nf.C10859a;

/* renamed from: mf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10451d {
    /* renamed from: a */
    public static void m11522a(InterfaceC10220b<?> interfaceC10220b, AtomicInteger atomicInteger, C10447a c10447a) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable m11529b = c10447a.m11529b();
            if (m11529b != null) {
                interfaceC10220b.onError(m11529b);
            } else {
                interfaceC10220b.mo12122d();
            }
        }
    }

    /* renamed from: b */
    public static void m11521b(InterfaceC10220b<?> interfaceC10220b, Throwable th2, AtomicInteger atomicInteger, C10447a c10447a) {
        if (c10447a.m11530a(th2)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC10220b.onError(c10447a.m11529b());
                return;
            }
            return;
        }
        C10859a.m9887j(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static <T> void m11520c(InterfaceC10220b<? super T> interfaceC10220b, T t, AtomicInteger atomicInteger, C10447a c10447a) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC10220b.mo12121f(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable m11529b = c10447a.m11529b();
                if (m11529b != null) {
                    interfaceC10220b.onError(m11529b);
                } else {
                    interfaceC10220b.mo12122d();
                }
            }
        }
    }
}
