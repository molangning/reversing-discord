package p394w2;

/* renamed from: w2.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13386n {
    /* renamed from: a */
    public static RuntimeException m2666a(Throwable th2) {
        m2664c((Throwable) C13379j.m2677g(th2));
        throw new RuntimeException(th2);
    }

    /* renamed from: b */
    public static <X extends Throwable> void m2665b(Throwable th2, Class<X> cls) {
        if (th2 != null && cls.isInstance(th2)) {
            throw cls.cast(th2);
        }
    }

    /* renamed from: c */
    public static void m2664c(Throwable th2) {
        m2665b(th2, Error.class);
        m2665b(th2, RuntimeException.class);
    }
}