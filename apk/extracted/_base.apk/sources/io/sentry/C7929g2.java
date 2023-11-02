package io.sentry;

/* renamed from: io.sentry.g2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7929g2<T> {

    /* renamed from: a */
    private final Class<T> f21610a;

    private C7929g2(Class<T> cls) {
        this.f21610a = cls;
    }

    /* renamed from: a */
    public static <T> C7929g2<T> m19183a(Class<T> cls) {
        return new C7929g2<>(cls);
    }

    /* renamed from: b */
    public T m19182b() {
        return this.f21610a.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}
