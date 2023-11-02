package p102fb;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

/* renamed from: fb.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC6365a<T> implements Iterator<T>, p164j$.util.Iterator {

    /* renamed from: j */
    private EnumC6367b f18010j = EnumC6367b.NOT_READY;

    /* renamed from: k */
    private T f18011k;

    /* renamed from: fb.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C6366a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18012a;

        static {
            int[] iArr = new int[EnumC6367b.values().length];
            f18012a = iArr;
            try {
                iArr[EnumC6367b.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18012a[EnumC6367b.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: fb.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC6367b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    /* renamed from: d */
    private boolean m22855d() {
        this.f18010j = EnumC6367b.FAILED;
        this.f18011k = mo22819a();
        if (this.f18010j != EnumC6367b.DONE) {
            this.f18010j = EnumC6367b.READY;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    protected abstract T mo22819a();

    /* renamed from: b */
    public final T m22856b() {
        this.f18010j = EnumC6367b.DONE;
        return null;
    }

    @Override // p164j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator
    public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.f18010j != EnumC6367b.FAILED) {
            z = true;
        } else {
            z = false;
        }
        C6378h.m22829o(z);
        int i = C6366a.f18012a[this.f18010j.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return m22855d();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f18010j = EnumC6367b.NOT_READY;
            T t = this.f18011k;
            this.f18011k = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, p164j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}