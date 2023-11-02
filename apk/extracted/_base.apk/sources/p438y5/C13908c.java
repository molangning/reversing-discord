package p438y5;

import p417x5.InterfaceC13690a;

/* renamed from: y5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13908c<T> implements InterfaceC13907b<T>, InterfaceC13690a<T> {

    /* renamed from: b */
    private static final C13908c<Object> f35788b = new C13908c<>(null);

    /* renamed from: a */
    private final T f35789a;

    private C13908c(T t) {
        this.f35789a = t;
    }

    /* renamed from: a */
    public static <T> InterfaceC13907b<T> m1222a(T t) {
        return new C13908c(C13909d.m1219c(t, "instance cannot be null"));
    }

    @Override // javax.inject.Provider
    public T get() {
        return this.f35789a;
    }
}
