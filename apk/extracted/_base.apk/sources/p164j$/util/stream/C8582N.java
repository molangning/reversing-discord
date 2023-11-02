package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import java.util.concurrent.atomic.AtomicReference;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.N */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8582N extends AbstractC8648d {

    /* renamed from: j */
    private final C8557H f22727j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8582N(C8557H c8557h, AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        super(abstractC8744w0, spliterator);
        this.f22727j = c8557h;
    }

    C8582N(C8582N c8582n, Spliterator spliterator) {
        super(c8582n, spliterator);
        this.f22727j = c8582n.f22727j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: a */
    public final Object mo17384a() {
        boolean z;
        AbstractC8744w0 abstractC8744w0 = this.f22852a;
        InterfaceC8551F3 interfaceC8551F3 = (InterfaceC8551F3) this.f22727j.f22684d.get();
        abstractC8744w0.mo17321w1(this.f22853b, interfaceC8551F3);
        Object obj = interfaceC8551F3.get();
        if (!this.f22727j.f22681a) {
            if (obj != null) {
                AtomicReference atomicReference = this.f22837h;
                while (!atomicReference.compareAndSet(null, obj) && atomicReference.get() == null) {
                }
            }
            return null;
        } else if (obj != null) {
            C8582N c8582n = this;
            while (true) {
                if (c8582n != null) {
                    AbstractC8658f m17472c = c8582n.m17472c();
                    if (m17472c != null && m17472c.f22855d != c8582n) {
                        z = false;
                        break;
                    }
                    c8582n = m17472c;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                AtomicReference atomicReference2 = this.f22837h;
                while (!atomicReference2.compareAndSet(null, obj) && atomicReference2.get() == null) {
                }
            } else {
                m17494h();
            }
            return obj;
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: d */
    public final AbstractC8658f mo17383d(Spliterator spliterator) {
        return new C8582N(this, spliterator);
    }

    @Override // p164j$.util.stream.AbstractC8648d
    /* renamed from: i */
    protected final Object mo17382i() {
        return this.f22727j.f22682b;
    }

    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        boolean z;
        if (this.f22727j.f22681a) {
            C8582N c8582n = (C8582N) this.f22855d;
            C8582N c8582n2 = null;
            while (true) {
                if (c8582n == c8582n2) {
                    break;
                }
                Object mo17473b = c8582n.mo17473b();
                if (mo17473b == null || !this.f22727j.f22683c.test(mo17473b)) {
                    c8582n2 = c8582n;
                    c8582n = (C8582N) this.f22856e;
                } else {
                    mo17471e(mo17473b);
                    C8582N c8582n3 = this;
                    while (true) {
                        if (c8582n3 != null) {
                            AbstractC8658f m17472c = c8582n3.m17472c();
                            if (m17472c != null && m17472c.f22855d != c8582n3) {
                                z = false;
                                break;
                            }
                            c8582n3 = m17472c;
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        AtomicReference atomicReference = this.f22837h;
                        while (!atomicReference.compareAndSet(null, mo17473b) && atomicReference.get() == null) {
                        }
                    } else {
                        m17494h();
                    }
                }
            }
        }
        super.onCompletion(countedCompleter);
    }
}
