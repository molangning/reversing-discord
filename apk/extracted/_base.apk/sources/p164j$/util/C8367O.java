package p164j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p164j$.util.concurrent.C8406u;
import p164j$.util.function.Consumer;

/* renamed from: j$.util.O */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8367O implements Iterator, Consumer {

    /* renamed from: a */
    boolean f22425a = false;

    /* renamed from: b */
    Object f22426b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f22427c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8367O(Spliterator spliterator) {
        this.f22427c = spliterator;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        this.f22425a = true;
        this.f22426b = obj;
    }

    @Override // p164j$.util.function.Consumer
    /* renamed from: e */
    public final Consumer mo17303e(Consumer consumer) {
        consumer.getClass();
        return new C8406u(3, this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f22425a) {
            this.f22427c.mo17305a(this);
        }
        return this.f22425a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f22425a || hasNext()) {
            this.f22425a = false;
            return this.f22426b;
        }
        throw new NoSuchElementException();
    }
}
