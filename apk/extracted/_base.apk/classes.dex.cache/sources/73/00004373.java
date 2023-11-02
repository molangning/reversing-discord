package p233mf;

import androidx.lifecycle.C1696m;
import cf.C2523a;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mf.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10449c {

    /* renamed from: a */
    public static final Throwable f27286a = new C10450a();

    /* renamed from: mf.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C10450a extends Throwable {
        C10450a() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public Throwable fillInStackTrace() {
            return this;
        }
    }

    /* renamed from: a */
    public static <T> boolean m11525a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        Throwable c2523a;
        do {
            th3 = atomicReference.get();
            if (th3 == f27286a) {
                return false;
            }
            if (th3 == null) {
                c2523a = th2;
            } else {
                c2523a = new C2523a(th3, th2);
            }
        } while (!C1696m.m36034a(atomicReference, th3, c2523a));
        return true;
    }

    /* renamed from: b */
    public static <T> Throwable m11524b(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f27286a;
        if (th2 != th3) {
            return atomicReference.getAndSet(th3);
        }
        return th2;
    }

    /* renamed from: c */
    public static RuntimeException m11523c(Throwable th2) {
        if (!(th2 instanceof Error)) {
            if (th2 instanceof RuntimeException) {
                return (RuntimeException) th2;
            }
            return new RuntimeException(th2);
        }
        throw ((Error) th2);
    }
}