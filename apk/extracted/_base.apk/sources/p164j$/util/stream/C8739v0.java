package p164j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p164j$.util.Spliterator;

/* renamed from: j$.util.stream.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8739v0 extends AbstractC8648d {

    /* renamed from: j */
    private final C8734u0 f22965j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8739v0(C8734u0 c8734u0, AbstractC8744w0 abstractC8744w0, Spliterator spliterator) {
        super(abstractC8744w0, spliterator);
        this.f22965j = c8734u0;
    }

    C8739v0(C8739v0 c8739v0, Spliterator spliterator) {
        super(c8739v0, spliterator);
        this.f22965j = c8739v0.f22965j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: a */
    public final Object mo17384a() {
        boolean z;
        Boolean valueOf;
        AbstractC8744w0 abstractC8744w0 = this.f22852a;
        AbstractC8724s0 abstractC8724s0 = (AbstractC8724s0) this.f22965j.f22958b.get();
        abstractC8744w0.mo17321w1(this.f22853b, abstractC8724s0);
        boolean z2 = abstractC8724s0.f22942b;
        z = this.f22965j.f22957a.f22948b;
        if (z2 == z && (valueOf = Boolean.valueOf(z2)) != null) {
            AtomicReference atomicReference = this.f22837h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: d */
    public final AbstractC8658f mo17383d(Spliterator spliterator) {
        return new C8739v0(this, spliterator);
    }

    @Override // p164j$.util.stream.AbstractC8648d
    /* renamed from: i */
    protected final Object mo17382i() {
        boolean z;
        z = this.f22965j.f22957a.f22948b;
        return Boolean.valueOf(!z);
    }
}
