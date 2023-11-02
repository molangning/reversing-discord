package p164j$.util;

import p164j$.util.function.Consumer;

/* renamed from: j$.util.Iterator */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public interface Iterator<E> {

    /* renamed from: j$.util.Iterator$-CC  reason: invalid class name */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
    public final /* synthetic */ class CC<E> {
        public static void $default$forEachRemaining(java.util.Iterator it, Consumer consumer) {
            consumer.getClass();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    void forEachRemaining(Consumer<? super E> consumer);

    boolean hasNext();

    E next();

    void remove();
}
