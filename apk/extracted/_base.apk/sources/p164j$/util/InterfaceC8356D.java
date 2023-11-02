package p164j$.util;

import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8483n;

/* renamed from: j$.util.D */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8356D extends InterfaceC8365M {
    @Override // p164j$.util.Spliterator
    /* renamed from: a */
    boolean mo17305a(Consumer consumer);

    /* renamed from: d */
    void mo17467d(InterfaceC8483n interfaceC8483n);

    @Override // p164j$.util.Spliterator
    void forEachRemaining(Consumer consumer);

    /* renamed from: p */
    boolean mo17466p(InterfaceC8483n interfaceC8483n);

    @Override // p164j$.util.InterfaceC8365M, p164j$.util.Spliterator
    InterfaceC8356D trySplit();
}
