package p326rh;

import com.facebook.react.uimanager.ViewDefaults;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;
import p326rh.AbstractC12177d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: rh.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12215u extends AbstractC12177d {

    /* renamed from: q */
    private static final int[] f31765q;

    /* renamed from: k */
    private final int f31766k;

    /* renamed from: l */
    private final AbstractC12177d f31767l;

    /* renamed from: m */
    private final AbstractC12177d f31768m;

    /* renamed from: n */
    private final int f31769n;

    /* renamed from: o */
    private final int f31770o;

    /* renamed from: p */
    private int f31771p;

    /* renamed from: rh.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static class C12217b {

        /* renamed from: a */
        private final Stack<AbstractC12177d> f31772a;

        private C12217b() {
            this.f31772a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public AbstractC12177d m5738b(AbstractC12177d abstractC12177d, AbstractC12177d abstractC12177d2) {
            m5737c(abstractC12177d);
            m5737c(abstractC12177d2);
            AbstractC12177d pop = this.f31772a.pop();
            while (!this.f31772a.isEmpty()) {
                pop = new C12215u(this.f31772a.pop(), pop);
            }
            return pop;
        }

        /* renamed from: c */
        private void m5737c(AbstractC12177d abstractC12177d) {
            if (abstractC12177d.mo5746s()) {
                m5735e(abstractC12177d);
            } else if (abstractC12177d instanceof C12215u) {
                C12215u c12215u = (C12215u) abstractC12177d;
                m5737c(c12215u.f31767l);
                m5737c(c12215u.f31768m);
            } else {
                String valueOf = String.valueOf(abstractC12177d.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 49);
                sb2.append("Has a new type of ByteString been created? Found ");
                sb2.append(valueOf);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* renamed from: d */
        private int m5736d(int i) {
            int binarySearch = Arrays.binarySearch(C12215u.f31765q, i);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        /* renamed from: e */
        private void m5735e(AbstractC12177d abstractC12177d) {
            int m5736d = m5736d(abstractC12177d.size());
            int i = C12215u.f31765q[m5736d + 1];
            if (!this.f31772a.isEmpty() && this.f31772a.peek().size() < i) {
                int i2 = C12215u.f31765q[m5736d];
                AbstractC12177d pop = this.f31772a.pop();
                while (!this.f31772a.isEmpty() && this.f31772a.peek().size() < i2) {
                    pop = new C12215u(this.f31772a.pop(), pop);
                }
                C12215u c12215u = new C12215u(pop, abstractC12177d);
                while (!this.f31772a.isEmpty()) {
                    if (this.f31772a.peek().size() >= C12215u.f31765q[m5736d(c12215u.size()) + 1]) {
                        break;
                    }
                    c12215u = new C12215u(this.f31772a.pop(), c12215u);
                }
                this.f31772a.push(c12215u);
                return;
            }
            this.f31772a.push(abstractC12177d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rh.u$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static class C12218c implements Iterator<C12207p>, p164j$.util.Iterator {

        /* renamed from: j */
        private final Stack<C12215u> f31773j;

        /* renamed from: k */
        private C12207p f31774k;

        /* renamed from: a */
        private C12207p m5734a(AbstractC12177d abstractC12177d) {
            while (abstractC12177d instanceof C12215u) {
                C12215u c12215u = (C12215u) abstractC12177d;
                this.f31773j.push(c12215u);
                abstractC12177d = c12215u.f31767l;
            }
            return (C12207p) abstractC12177d;
        }

        /* renamed from: b */
        private C12207p m5733b() {
            while (!this.f31773j.isEmpty()) {
                C12207p m5734a = m5734a(this.f31773j.pop().f31768m);
                if (!m5734a.isEmpty()) {
                    return m5734a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: d */
        public C12207p next() {
            C12207p c12207p = this.f31774k;
            if (c12207p != null) {
                this.f31774k = m5733b();
                return c12207p;
            }
            throw new NoSuchElementException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super C12207p> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f31774k != null;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C12218c(AbstractC12177d abstractC12177d) {
            this.f31773j = new Stack<>();
            this.f31774k = m5734a(abstractC12177d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rh.u$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public class C12219d implements AbstractC12177d.InterfaceC12178a, p164j$.util.Iterator {

        /* renamed from: j */
        private final C12218c f31775j;

        /* renamed from: k */
        private AbstractC12177d.InterfaceC12178a f31776k;

        /* renamed from: l */
        int f31777l;

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public Byte next() {
            return Byte.valueOf(mo5730c());
        }

        @Override // p326rh.AbstractC12177d.InterfaceC12178a
        /* renamed from: c */
        public byte mo5730c() {
            if (!this.f31776k.hasNext()) {
                this.f31776k = this.f31775j.next().iterator();
            }
            this.f31777l--;
            return this.f31776k.mo5730c();
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
            return this.f31777l > 0;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private C12219d() {
            C12218c c12218c = new C12218c(C12215u.this);
            this.f31775j = c12218c;
            this.f31776k = c12218c.next().iterator();
            this.f31777l = C12215u.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.valueOf((int) ViewDefaults.NUMBER_OF_LINES));
        f31765q = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f31765q;
            if (i4 < iArr.length) {
                iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
                i4++;
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public static AbstractC12177d m5751I(AbstractC12177d abstractC12177d, AbstractC12177d abstractC12177d2) {
        C12215u c12215u;
        if (abstractC12177d instanceof C12215u) {
            c12215u = (C12215u) abstractC12177d;
        } else {
            c12215u = null;
        }
        if (abstractC12177d2.size() != 0) {
            if (abstractC12177d.size() != 0) {
                int size = abstractC12177d.size() + abstractC12177d2.size();
                if (size < 128) {
                    return m5750J(abstractC12177d, abstractC12177d2);
                }
                if (c12215u != null && c12215u.f31768m.size() + abstractC12177d2.size() < 128) {
                    abstractC12177d2 = new C12215u(c12215u.f31767l, m5750J(c12215u.f31768m, abstractC12177d2));
                } else if (c12215u != null && c12215u.f31767l.mo5747r() > c12215u.f31768m.mo5747r() && c12215u.mo5747r() > abstractC12177d2.mo5747r()) {
                    abstractC12177d2 = new C12215u(c12215u.f31767l, new C12215u(c12215u.f31768m, abstractC12177d2));
                } else {
                    if (size >= f31765q[Math.max(abstractC12177d.mo5747r(), abstractC12177d2.mo5747r()) + 1]) {
                        return new C12215u(abstractC12177d, abstractC12177d2);
                    }
                    return new C12217b().m5738b(abstractC12177d, abstractC12177d2);
                }
            }
            return abstractC12177d2;
        }
        return abstractC12177d;
    }

    /* renamed from: J */
    private static C12207p m5750J(AbstractC12177d abstractC12177d, AbstractC12177d abstractC12177d2) {
        int size = abstractC12177d.size();
        int size2 = abstractC12177d2.size();
        byte[] bArr = new byte[size + size2];
        abstractC12177d.m5998o(bArr, 0, 0, size);
        abstractC12177d2.m5998o(bArr, 0, size, size2);
        return new C12207p(bArr);
    }

    /* renamed from: K */
    private boolean m5749K(AbstractC12177d abstractC12177d) {
        boolean m5772G;
        C12218c c12218c = new C12218c(this);
        C12207p next = c12218c.next();
        C12218c c12218c2 = new C12218c(abstractC12177d);
        C12207p next2 = c12218c2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = next.size() - i;
            int size2 = next2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                m5772G = next.m5772G(next2, i2, min);
            } else {
                m5772G = next2.m5772G(next, i, min);
            }
            if (!m5772G) {
                return false;
            }
            i3 += min;
            int i4 = this.f31766k;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = c12218c.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == size2) {
                next2 = c12218c2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: B */
    public String mo5756B(String str) {
        return new String(m6007A(), str);
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: E */
    void mo5755E(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        int i4 = this.f31769n;
        if (i3 <= i4) {
            this.f31767l.mo5755E(outputStream, i, i2);
        } else if (i >= i4) {
            this.f31768m.mo5755E(outputStream, i - i4, i2);
        } else {
            int i5 = i4 - i;
            this.f31767l.mo5755E(outputStream, i, i5);
            this.f31768m.mo5755E(outputStream, 0, i2 - i5);
        }
    }

    public boolean equals(Object obj) {
        int mo5740z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC12177d)) {
            return false;
        }
        AbstractC12177d abstractC12177d = (AbstractC12177d) obj;
        if (this.f31766k != abstractC12177d.size()) {
            return false;
        }
        if (this.f31766k == 0) {
            return true;
        }
        if (this.f31771p != 0 && (mo5740z = abstractC12177d.mo5740z()) != 0 && this.f31771p != mo5740z) {
            return false;
        }
        return m5749K(abstractC12177d);
    }

    public int hashCode() {
        int i = this.f31771p;
        if (i == 0) {
            int i2 = this.f31766k;
            i = mo5742x(i2, 0, i2);
            if (i == 0) {
                i = 1;
            }
            this.f31771p = i;
        }
        return i;
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: p */
    protected void mo5748p(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.f31769n;
        if (i4 <= i5) {
            this.f31767l.mo5748p(bArr, i, i2, i3);
        } else if (i >= i5) {
            this.f31768m.mo5748p(bArr, i - i5, i2, i3);
        } else {
            int i6 = i5 - i;
            this.f31767l.mo5748p(bArr, i, i2, i6);
            this.f31768m.mo5748p(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: r */
    protected int mo5747r() {
        return this.f31770o;
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: s */
    protected boolean mo5746s() {
        return this.f31766k >= f31765q[this.f31770o];
    }

    @Override // p326rh.AbstractC12177d
    public int size() {
        return this.f31766k;
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: t */
    public boolean mo5745t() {
        int mo5741y = this.f31767l.mo5741y(0, 0, this.f31769n);
        AbstractC12177d abstractC12177d = this.f31768m;
        if (abstractC12177d.mo5741y(mo5741y, 0, abstractC12177d.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // p326rh.AbstractC12177d, java.lang.Iterable
    /* renamed from: u */
    public AbstractC12177d.InterfaceC12178a iterator() {
        return new C12219d();
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: v */
    public C12180e mo5743v() {
        return C12180e.m5966g(new C12220e());
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: x */
    protected int mo5742x(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f31769n;
        if (i4 <= i5) {
            return this.f31767l.mo5742x(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f31768m.mo5742x(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f31768m.mo5742x(this.f31767l.mo5742x(i, i2, i6), 0, i3 - i6);
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: y */
    protected int mo5741y(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.f31769n;
        if (i4 <= i5) {
            return this.f31767l.mo5741y(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.f31768m.mo5741y(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.f31768m.mo5741y(this.f31767l.mo5741y(i, i2, i6), 0, i3 - i6);
    }

    @Override // p326rh.AbstractC12177d
    /* renamed from: z */
    protected int mo5740z() {
        return this.f31771p;
    }

    private C12215u(AbstractC12177d abstractC12177d, AbstractC12177d abstractC12177d2) {
        this.f31771p = 0;
        this.f31767l = abstractC12177d;
        this.f31768m = abstractC12177d2;
        int size = abstractC12177d.size();
        this.f31769n = size;
        this.f31766k = size + abstractC12177d2.size();
        this.f31770o = Math.max(abstractC12177d.mo5747r(), abstractC12177d2.mo5747r()) + 1;
    }

    /* renamed from: rh.u$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private class C12220e extends InputStream {

        /* renamed from: j */
        private C12218c f31779j;

        /* renamed from: k */
        private C12207p f31780k;

        /* renamed from: l */
        private int f31781l;

        /* renamed from: m */
        private int f31782m;

        /* renamed from: n */
        private int f31783n;

        /* renamed from: o */
        private int f31784o;

        public C12220e() {
            m5728h();
        }

        /* renamed from: a */
        private void m5729a() {
            if (this.f31780k != null) {
                int i = this.f31782m;
                int i2 = this.f31781l;
                if (i == i2) {
                    this.f31783n += i2;
                    this.f31782m = 0;
                    if (this.f31779j.hasNext()) {
                        C12207p next = this.f31779j.next();
                        this.f31780k = next;
                        this.f31781l = next.size();
                        return;
                    }
                    this.f31780k = null;
                    this.f31781l = 0;
                }
            }
        }

        /* renamed from: h */
        private void m5728h() {
            C12218c c12218c = new C12218c(C12215u.this);
            this.f31779j = c12218c;
            C12207p next = c12218c.next();
            this.f31780k = next;
            this.f31781l = next.size();
            this.f31782m = 0;
            this.f31783n = 0;
        }

        /* renamed from: i */
        private int m5727i(byte[] bArr, int i, int i2) {
            int i3 = i2;
            while (true) {
                if (i3 <= 0) {
                    break;
                }
                m5729a();
                if (this.f31780k == null) {
                    if (i3 == i2) {
                        return -1;
                    }
                } else {
                    int min = Math.min(this.f31781l - this.f31782m, i3);
                    if (bArr != null) {
                        this.f31780k.m5998o(bArr, this.f31782m, i, min);
                        i += min;
                    }
                    this.f31782m += min;
                    i3 -= min;
                }
            }
            return i2 - i3;
        }

        @Override // java.io.InputStream
        public int available() {
            return C12215u.this.size() - (this.f31783n + this.f31782m);
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            this.f31784o = this.f31783n + this.f31782m;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            bArr.getClass();
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                return m5727i(bArr, i, i2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            m5728h();
            m5727i(null, 0, this.f31784o);
        }

        @Override // java.io.InputStream
        public long skip(long j) {
            if (j >= 0) {
                if (j > 2147483647L) {
                    j = 2147483647L;
                }
                return m5727i(null, 0, (int) j);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() {
            m5729a();
            C12207p c12207p = this.f31780k;
            if (c12207p == null) {
                return -1;
            }
            int i = this.f31782m;
            this.f31782m = i + 1;
            return c12207p.mo5773F(i) & 255;
        }
    }
}
