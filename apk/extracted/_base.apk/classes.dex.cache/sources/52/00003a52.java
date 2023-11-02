package io.sentry.util;

/* renamed from: io.sentry.util.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8225l<T> {

    /* renamed from: a */
    private T f22146a = null;

    /* renamed from: b */
    private final InterfaceC8226a<T> f22147b;

    /* renamed from: io.sentry.util.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC8226a<T> {
        /* renamed from: a */
        T mo18203a();
    }

    public C8225l(InterfaceC8226a<T> interfaceC8226a) {
        this.f22147b = interfaceC8226a;
    }

    /* renamed from: a */
    public synchronized T m18204a() {
        if (this.f22146a == null) {
            this.f22146a = this.f22147b.mo18203a();
        }
        return this.f22146a;
    }
}