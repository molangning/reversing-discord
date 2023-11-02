package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final /* synthetic */ class C1696m {
    /* renamed from: a */
    public static /* synthetic */ boolean m36034a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
