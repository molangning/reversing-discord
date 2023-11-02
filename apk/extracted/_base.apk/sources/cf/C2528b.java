package cf;

import p233mf.C10449c;

/* renamed from: cf.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2528b {
    /* renamed from: a */
    public static RuntimeException m33062a(Throwable th2) {
        throw C10449c.m11523c(th2);
    }

    /* renamed from: b */
    public static void m33061b(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th2);
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }
}
