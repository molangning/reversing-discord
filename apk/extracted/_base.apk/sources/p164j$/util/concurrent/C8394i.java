package p164j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8394i extends AbstractC8387b implements Iterator, Enumeration, p164j$.util.Iterator {

    /* renamed from: k */
    public final /* synthetic */ int f22491k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8394i(C8398m[] c8398mArr, int i, int i2, ConcurrentHashMap concurrentHashMap, int i3) {
        super(c8398mArr, i, i2, concurrentHashMap);
        this.f22491k = i3;
    }

    @Override // p164j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f22491k) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        switch (this.f22491k) {
            case 0:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
            default:
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
                return;
        }
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Object next() {
        switch (this.f22491k) {
            case 0:
                C8398m c8398m = this.f22506b;
                if (c8398m != null) {
                    this.f22486j = c8398m;
                    m17738e();
                    return c8398m.f22498b;
                }
                throw new NoSuchElementException();
            default:
                C8398m c8398m2 = this.f22506b;
                if (c8398m2 != null) {
                    Object obj = c8398m2.f22499c;
                    this.f22486j = c8398m2;
                    m17738e();
                    return obj;
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f22491k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
