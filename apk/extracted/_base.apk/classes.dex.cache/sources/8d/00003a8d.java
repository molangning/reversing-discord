package p164j$.lang;

import java.util.Iterator;
import p164j$.util.DesugarCollections;
import p164j$.util.function.Consumer;

/* renamed from: j$.lang.Iterable$-CC */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class Iterable$CC<T> {
    public static void $default$forEach(Iterable iterable, Consumer consumer) {
        if (DesugarCollections.f22412a.isInstance(iterable)) {
            DesugarCollections.m17774c(iterable, consumer);
            return;
        }
        consumer.getClass();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }
}