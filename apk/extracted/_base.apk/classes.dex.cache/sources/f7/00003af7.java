package p164j$.util;

import java.util.NoSuchElementException;
import p164j$.util.function.C8462c0;
import p164j$.util.function.Consumer;
import p164j$.util.function.InterfaceC8468f0;

/* renamed from: j$.util.Q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8369Q implements InterfaceC8768y, InterfaceC8468f0, Iterator {

    /* renamed from: a */
    boolean f22431a = false;

    /* renamed from: b */
    long f22432b;

    /* renamed from: c */
    final /* synthetic */ InterfaceC8362J f22433c;

    public C8369Q(InterfaceC8362J interfaceC8362J) {
        this.f22433c = interfaceC8362J;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    public final void accept(long j) {
        this.f22431a = true;
        this.f22432b = j;
    }

    @Override // p164j$.util.InterfaceC8769z
    /* renamed from: b */
    public final void forEachRemaining(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        while (hasNext()) {
            interfaceC8468f0.accept(nextLong());
        }
    }

    @Override // p164j$.util.InterfaceC8768y, p164j$.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof InterfaceC8468f0) {
            forEachRemaining((InterfaceC8468f0) consumer);
            return;
        }
        consumer.getClass();
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8369Q.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        } else {
            forEachRemaining(new C8765v(consumer));
        }
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        if (!this.f22431a) {
            this.f22433c.mo17437f(this);
        }
        return this.f22431a;
    }

    @Override // p164j$.util.function.InterfaceC8468f0
    /* renamed from: j */
    public final InterfaceC8468f0 mo17293j(InterfaceC8468f0 interfaceC8468f0) {
        interfaceC8468f0.getClass();
        return new C8462c0(this, interfaceC8468f0);
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final Long next() {
        if (AbstractC8415e0.f22538a) {
            AbstractC8415e0.m17720a(C8369Q.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        return Long.valueOf(nextLong());
    }

    @Override // p164j$.util.InterfaceC8768y
    public final long nextLong() {
        if (this.f22431a || hasNext()) {
            this.f22431a = false;
            return this.f22432b;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}