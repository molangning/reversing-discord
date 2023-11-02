package p085ef;

import bf.InterfaceC2276b;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ef.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC6214b implements InterfaceC2276b {
    DISPOSED;

    /* renamed from: a */
    public static boolean m23235a(AtomicReference<InterfaceC2276b> atomicReference) {
        InterfaceC2276b andSet;
        InterfaceC2276b interfaceC2276b = atomicReference.get();
        EnumC6214b enumC6214b = DISPOSED;
        if (interfaceC2276b != enumC6214b && (andSet = atomicReference.getAndSet(enumC6214b)) != enumC6214b) {
            if (andSet != null) {
                andSet.dispose();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m23234c(InterfaceC2276b interfaceC2276b) {
        return interfaceC2276b == DISPOSED;
    }

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public boolean mo16034b() {
        return true;
    }

    @Override // bf.InterfaceC2276b
    public void dispose() {
    }
}
