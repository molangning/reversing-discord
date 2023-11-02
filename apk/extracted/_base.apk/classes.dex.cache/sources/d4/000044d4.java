package net.time4j;

import p162ij.InterfaceC7670v;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10797t0<T> implements InterfaceC7670v<T> {

    /* renamed from: j */
    private final InterfaceC7670v<T> f28196j;

    /* renamed from: k */
    private final Object f28197k;

    private C10797t0(InterfaceC7670v<T> interfaceC7670v, Object obj) {
        this.f28196j = interfaceC7670v;
        this.f28197k = obj;
    }

    /* renamed from: a */
    public static <T> C10797t0 m10182a(InterfaceC7670v<T> interfaceC7670v, Object obj) {
        return new C10797t0(interfaceC7670v, obj);
    }

    @Override // p162ij.InterfaceC7670v
    public T apply(T t) {
        return this.f28196j.apply(t);
    }
}