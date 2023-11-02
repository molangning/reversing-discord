package p164j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.concurrent.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8390e extends AbstractC8387b implements Iterator, p164j$.util.Iterator {
    public C8390e(C8398m[] c8398mArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c8398mArr, i, i2, concurrentHashMap);
    }

    @Override // p164j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Object next() {
        C8398m c8398m = this.f22506b;
        if (c8398m != null) {
            Object obj = c8398m.f22498b;
            Object obj2 = c8398m.f22499c;
            this.f22486j = c8398m;
            m17738e();
            return new C8397l(obj, obj2, this.f22485i);
        }
        throw new NoSuchElementException();
    }
}