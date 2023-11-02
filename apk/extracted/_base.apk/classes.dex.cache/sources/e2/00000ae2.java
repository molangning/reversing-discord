package cf;

/* renamed from: cf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2530d extends RuntimeException {
    public C2530d(String str, Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }

    public C2530d(Throwable th2) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2);
    }
}