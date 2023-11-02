package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: kotlinx.coroutines.scheduling.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9871n {
    /* renamed from: a */
    public static /* synthetic */ boolean m13050a(AtomicReferenceArray atomicReferenceArray, int i, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
