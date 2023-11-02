package p326rh;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: rh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC12177d implements Iterable<Byte> {

    /* renamed from: j */
    public static final AbstractC12177d f31693j = new C12207p(new byte[0]);

    /* renamed from: rh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public interface InterfaceC12178a extends Iterator<Byte> {
        /* renamed from: c */
        byte mo5730c();
    }

    /* renamed from: a */
    private static AbstractC12177d m6004a(Iterator<AbstractC12177d> it, int i) {
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        return m6004a(it, i2).m6003d(m6004a(it, i - i2));
    }

    /* renamed from: e */
    public static AbstractC12177d m6002e(Iterable<AbstractC12177d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            for (AbstractC12177d abstractC12177d : iterable) {
                collection.add(abstractC12177d);
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f31693j;
        }
        return m6004a(collection.iterator(), collection.size());
    }

    /* renamed from: h */
    public static AbstractC12177d m6001h(byte[] bArr) {
        return m6000i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public static AbstractC12177d m6000i(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C12207p(bArr2);
    }

    /* renamed from: k */
    public static AbstractC12177d m5999k(String str) {
        try {
            return new C12207p(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: w */
    public static C12179b m5997w() {
        return new C12179b(128);
    }

    /* renamed from: A */
    public byte[] m6007A() {
        int size = size();
        if (size == 0) {
            return C12196j.f31748a;
        }
        byte[] bArr = new byte[size];
        mo5748p(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: B */
    public abstract String mo5756B(String str);

    /* renamed from: C */
    public String m6006C() {
        try {
            return mo5756B("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 not supported?", e);
        }
    }

    /* renamed from: D */
    public void m6005D(OutputStream outputStream, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = i + i2;
                if (i3 <= size()) {
                    if (i2 > 0) {
                        mo5755E(outputStream, i, i2);
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(23);
            sb3.append("Length < 0: ");
            sb3.append(i2);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(30);
        sb4.append("Source offset < 0: ");
        sb4.append(i);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    /* renamed from: E */
    public abstract void mo5755E(OutputStream outputStream, int i, int i2);

    /* renamed from: d */
    public AbstractC12177d m6003d(AbstractC12177d abstractC12177d) {
        int size = size();
        int size2 = abstractC12177d.size();
        if (size + size2 < 2147483647L) {
            return C12215u.m5751I(this, abstractC12177d);
        }
        StringBuilder sb2 = new StringBuilder(53);
        sb2.append("ByteString would be too long: ");
        sb2.append(size);
        sb2.append("+");
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: o */
    public void m5998o(byte[] bArr, int i, int i2, int i3) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i3 >= 0) {
                    int i4 = i + i3;
                    if (i4 <= size()) {
                        int i5 = i2 + i3;
                        if (i5 <= bArr.length) {
                            if (i3 > 0) {
                                mo5748p(bArr, i, i2, i3);
                                return;
                            }
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(34);
                        sb2.append("Target end offset < 0: ");
                        sb2.append(i5);
                        throw new IndexOutOfBoundsException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Source end offset < 0: ");
                    sb3.append(i4);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(23);
                sb4.append("Length < 0: ");
                sb4.append(i3);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("Target offset < 0: ");
            sb5.append(i2);
            throw new IndexOutOfBoundsException(sb5.toString());
        }
        StringBuilder sb6 = new StringBuilder(30);
        sb6.append("Source offset < 0: ");
        sb6.append(i);
        throw new IndexOutOfBoundsException(sb6.toString());
    }

    /* renamed from: p */
    public abstract void mo5748p(byte[] bArr, int i, int i2, int i3);

    /* renamed from: r */
    public abstract int mo5747r();

    /* renamed from: s */
    public abstract boolean mo5746s();

    public abstract int size();

    /* renamed from: t */
    public abstract boolean mo5745t();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    /* renamed from: u */
    public abstract InterfaceC12178a iterator();

    /* renamed from: v */
    public abstract C12180e mo5743v();

    /* renamed from: x */
    public abstract int mo5742x(int i, int i2, int i3);

    /* renamed from: y */
    public abstract int mo5741y(int i, int i2, int i3);

    /* renamed from: z */
    public abstract int mo5740z();

    /* renamed from: rh.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12179b extends OutputStream {

        /* renamed from: o */
        private static final byte[] f31694o = new byte[0];

        /* renamed from: j */
        private final int f31695j;

        /* renamed from: k */
        private final ArrayList<AbstractC12177d> f31696k;

        /* renamed from: l */
        private int f31697l;

        /* renamed from: m */
        private byte[] f31698m;

        /* renamed from: n */
        private int f31699n;

        C12179b(int i) {
            if (i >= 0) {
                this.f31695j = i;
                this.f31696k = new ArrayList<>();
                this.f31698m = new byte[i];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        /* renamed from: a */
        private byte[] m5996a(byte[] bArr, int i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i));
            return bArr2;
        }

        /* renamed from: h */
        private void m5995h(int i) {
            this.f31696k.add(new C12207p(this.f31698m));
            int length = this.f31697l + this.f31698m.length;
            this.f31697l = length;
            this.f31698m = new byte[Math.max(this.f31695j, Math.max(i, length >>> 1))];
            this.f31699n = 0;
        }

        /* renamed from: i */
        private void m5994i() {
            int i = this.f31699n;
            byte[] bArr = this.f31698m;
            if (i < bArr.length) {
                if (i > 0) {
                    this.f31696k.add(new C12207p(m5996a(bArr, i)));
                }
            } else {
                this.f31696k.add(new C12207p(this.f31698m));
                this.f31698m = f31694o;
            }
            this.f31697l += this.f31699n;
            this.f31699n = 0;
        }

        /* renamed from: j */
        public synchronized AbstractC12177d m5993j() {
            m5994i();
            return AbstractC12177d.m6002e(this.f31696k);
        }

        public synchronized int size() {
            return this.f31697l + this.f31699n;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i) {
            if (this.f31699n == this.f31698m.length) {
                m5995h(1);
            }
            byte[] bArr = this.f31698m;
            int i2 = this.f31699n;
            this.f31699n = i2 + 1;
            bArr[i2] = (byte) i;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i, int i2) {
            byte[] bArr2 = this.f31698m;
            int length = bArr2.length;
            int i3 = this.f31699n;
            if (i2 <= length - i3) {
                System.arraycopy(bArr, i, bArr2, i3, i2);
                this.f31699n += i2;
            } else {
                int length2 = bArr2.length - i3;
                System.arraycopy(bArr, i, bArr2, i3, length2);
                int i4 = i2 - length2;
                m5995h(i4);
                System.arraycopy(bArr, i + length2, this.f31698m, 0, i4);
                this.f31699n = i4;
            }
        }
    }
}