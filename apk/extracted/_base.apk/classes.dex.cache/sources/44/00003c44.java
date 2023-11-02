package p164j$.util.stream;

import java.util.Iterator;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface InterfaceC8673i extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    boolean isParallel();

    Iterator iterator();

    InterfaceC8673i onClose(Runnable runnable);

    InterfaceC8673i parallel();

    InterfaceC8673i sequential();

    Spliterator spliterator();

    InterfaceC8673i unordered();
}