package p164j$.util;

import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8437K;

/* renamed from: j$.util.G */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8359G extends InterfaceC8365M {
    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    boolean mo17305a(Consumer consumer);

    /* renamed from: c */
    void mo17458c(InterfaceC8437K interfaceC8437K);

    @Override // p164j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    /* renamed from: k */
    boolean mo17457k(InterfaceC8437K interfaceC8437K);

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    InterfaceC8359G trySplit();
}
