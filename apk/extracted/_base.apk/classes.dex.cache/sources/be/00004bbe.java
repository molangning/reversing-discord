package p326rh;

import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p326rh.AbstractC12177d;

/* renamed from: rh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12174c extends C12207p {

    /* renamed from: m */
    private final int f31688m;

    /* renamed from: n */
    private final int f31689n;

    /* renamed from: rh.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C12176b implements AbstractC12177d.InterfaceC12178a, Iterator {

        /* renamed from: j */
        private int f31690j;

        /* renamed from: k */
        private final int f31691k;

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo5730c());
        }

        @Override // p326rh.AbstractC12177d.InterfaceC12178a
        /* renamed from: c */
        public byte mo5730c() {
            int i = this.f31690j;
            if (i < this.f31691k) {
                byte[] bArr = C12174c.this.f31760k;
                this.f31690j = i + 1;
                return bArr[i];
            }
            throw new NoSuchElementException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super Byte> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31690j < this.f31691k;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C12176b() {
            C12174c.this = r2;
            int mo5771H = r2.mo5771H();
            this.f31690j = mo5771H;
            this.f31691k = mo5771H + r2.size();
        }
    }

    public C12174c(byte[] bArr, int i, int i2) {
        super(bArr);
        if (i >= 0) {
            if (i2 >= 0) {
                if (i + i2 <= bArr.length) {
                    this.f31688m = i;
                    this.f31689n = i2;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("Offset+Length too large: ");
                sb2.append(i);
                sb2.append("+");
                sb2.append(i2);
                throw new IllegalArgumentException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(29);
            sb3.append("Length too small: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(29);
        sb4.append("Offset too small: ");
        sb4.append(i);
        throw new IllegalArgumentException(sb4.toString());
    }

    @Override // p326rh.C12207p
    /* renamed from: F */
    public byte mo5773F(int i) {
        if (i >= 0) {
            if (i < size()) {
                return this.f31760k[this.f31688m + i];
            }
            int size = size();
            StringBuilder sb2 = new StringBuilder(41);
            sb2.append("Index too large: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(size);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(28);
        sb3.append("Index too small: ");
        sb3.append(i);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // p326rh.C12207p
    /* renamed from: H */
    public int mo5771H() {
        return this.f31688m;
    }

    @Override // p326rh.C12207p, p326rh.AbstractC12177d
    /* renamed from: p */
    public void mo5748p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f31760k, mo5771H() + i, bArr, i2, i3);
    }

    @Override // p326rh.C12207p, p326rh.AbstractC12177d
    public int size() {
        return this.f31689n;
    }

    @Override // p326rh.C12207p, p326rh.AbstractC12177d, java.lang.Iterable
    /* renamed from: u */
    public AbstractC12177d.InterfaceC12178a iterator() {
        return new C12176b();
    }
}