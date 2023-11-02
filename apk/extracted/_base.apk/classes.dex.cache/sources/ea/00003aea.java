package p164j$.util;

import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.J */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8362J extends InterfaceC8365M {
    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    boolean mo17305a(Consumer consumer);

    /* renamed from: b */
    void mo17438b(InterfaceC8468f0 interfaceC8468f0);

    /* renamed from: f */
    boolean mo17437f(InterfaceC8468f0 interfaceC8468f0);

    @Override // p164j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    InterfaceC8362J trySplit();
}