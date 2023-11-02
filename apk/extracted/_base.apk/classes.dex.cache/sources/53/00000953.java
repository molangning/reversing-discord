package p026b6;

/* renamed from: b6.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2131b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m34145a(int i, TInput tinput, InterfaceC2130a<TInput, TResult, TException> interfaceC2130a, InterfaceC2132c<TInput, TResult> interfaceC2132c) {
        TResult apply;
        if (i < 1) {
            return interfaceC2130a.apply(tinput);
        }
        do {
            apply = interfaceC2130a.apply(tinput);
            tinput = interfaceC2132c.mo29953a(tinput, apply);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return apply;
    }
}