package gi;

/* renamed from: gi.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
class C6819l<T> {

    /* renamed from: a */
    private final T f19030a;

    /* renamed from: b */
    private final Thread f19031b = Thread.currentThread();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6819l(T t) {
        this.f19030a = t;
    }

    /* renamed from: a */
    public T m21873a() {
        if (m21872b()) {
            return this.f19030a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    /* renamed from: b */
    public boolean m21872b() {
        return this.f19031b == Thread.currentThread();
    }
}
