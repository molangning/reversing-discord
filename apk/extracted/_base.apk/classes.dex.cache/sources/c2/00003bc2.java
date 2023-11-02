package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.F0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8548F0 {
    /* renamed from: a */
    InterfaceC8548F0 mo17392a(int i);

    long count();

    /* renamed from: f */
    void mo17391f(Object[] objArr, int i);

    void forEach(Consumer consumer);

    /* renamed from: k */
    int mo17390k();

    /* renamed from: p */
    Object[] mo17389p(IntFunction intFunction);

    /* renamed from: r */
    InterfaceC8548F0 mo17388r(long j, long j2, IntFunction intFunction);

    Spliterator spliterator();
}