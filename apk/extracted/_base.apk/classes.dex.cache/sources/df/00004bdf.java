package p326rh;

import java.io.OutputStream;
import java.util.NoSuchElementException;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p326rh.AbstractC12177d;

/* renamed from: rh.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12207p extends AbstractC12177d {

    /* renamed from: k */
    protected final byte[] f31760k;

    /* renamed from: l */
    private int f31761l = 0;

    /* renamed from: rh.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C12209b implements AbstractC12177d.InterfaceC12178a, Iterator {

        /* renamed from: j */
        private int f31762j;

        /* renamed from: k */
        private final int f31763k;

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo5730c());
        }

        @Override // p326rh.AbstractC12177d.InterfaceC12178a
        /* renamed from: c */
        public byte mo5730c() {
            try {
                byte[] bArr = C12207p.this.f31760k;
                int i = this.f31762j;
                this.f31762j = i + 1;
                return bArr[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new NoSuchElementException(e.getMessage());
            }
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
            return this.f31762j < this.f31763k;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C12209b() {
            C12207p.this = r2;
            this.f31762j = 0;
            this.f31763k = r2.size();
        }
    }

    public C12207p(byte[] bArr) {
        this.f31760k = bArr;
    }

    /* renamed from: I */
    static int m5770I(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: B */
    public String mo5756B(String str) {
        return new String(this.f31760k, mo5771H(), size(), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p326rh.AbstractC12177d
    /* renamed from: E */
    public void mo5755E(OutputStream outputStream, int i, int i2) {
        outputStream.write(this.f31760k, mo5771H() + i, i2);
    }

    /* renamed from: F */
    public byte mo5773F(int i) {
        return this.f31760k[i];
    }

    /* renamed from: G */
    public boolean m5772G(C12207p c12207p, int i, int i2) {
        if (i2 <= c12207p.size()) {
            if (i + i2 <= c12207p.size()) {
                byte[] bArr = this.f31760k;
                byte[] bArr2 = c12207p.f31760k;
                int mo5771H = mo5771H() + i2;
                int mo5771H2 = mo5771H();
                int mo5771H3 = c12207p.mo5771H() + i;
                while (mo5771H2 < mo5771H) {
                    if (bArr[mo5771H2] != bArr2[mo5771H3]) {
                        return false;
                    }
                    mo5771H2++;
                    mo5771H3++;
                }
                return true;
            }
            int size = c12207p.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            sb2.append(", ");
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        }
        int size2 = size();
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Length too large: ");
        sb3.append(i2);
        sb3.append(size2);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: H */
    public int mo5771H() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12177d) || size() != ((AbstractC12177d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C12207p) {
            return m5772G((C12207p) obj, 0, size());
        }
        if (obj instanceof C12215u) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
        sb2.append("Has a new type of ByteString been created? Found ");
        sb2.append(valueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int hashCode() {
        int i = this.f31761l;
        if (i == 0) {
            int size = size();
            i = mo5742x(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f31761l = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: p */
    public void mo5748p(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f31760k, i, bArr, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: r */
    public int mo5747r() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: s */
    public boolean mo5746s() {
        return true;
    }

    @Override // p326rh.AbstractC12177d
    public int size() {
        return this.f31760k.length;
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: t */
    public boolean mo5745t() {
        int mo5771H = mo5771H();
        return C12233y.m5685f(this.f31760k, mo5771H, size() + mo5771H);
    }

    @Override // p326rh.AbstractC12177d, java.lang.Iterable
    /* renamed from: u */
    public AbstractC12177d.InterfaceC12178a iterator() {
        return new C12209b();
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: v */
    public C12180e mo5743v() {
        return C12180e.m5965h(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: x */
    public int mo5742x(int i, int i2, int i3) {
        return m5770I(i, this.f31760k, mo5771H() + i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: y */
    public int mo5741y(int i, int i2, int i3) {
        int mo5771H = mo5771H() + i2;
        return C12233y.m5684g(i, this.f31760k, mo5771H, i3 + mo5771H);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p326rh.AbstractC12177d
    /* renamed from: z */
    public int mo5740z() {
        return this.f31761l;
    }
}