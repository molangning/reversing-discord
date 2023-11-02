package p164j$.util.concurrent;

import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract /* synthetic */ class AbstractC8386a {
    /* renamed from: a */
    public static /* synthetic */ boolean m17739a(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
