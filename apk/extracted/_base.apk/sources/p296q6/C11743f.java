package p296q6;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p153i8.InterfaceC7451h;
import p195k8.C9191p0;

/* renamed from: q6.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11743f implements InterfaceC11747j {

    /* renamed from: b */
    private final InterfaceC7451h f30619b;

    /* renamed from: c */
    private final long f30620c;

    /* renamed from: d */
    private long f30621d;

    /* renamed from: f */
    private int f30623f;

    /* renamed from: g */
    private int f30624g;

    /* renamed from: e */
    private byte[] f30622e = new byte[65536];

    /* renamed from: a */
    private final byte[] f30618a = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];

    public C11743f(InterfaceC7451h interfaceC7451h, long j, long j2) {
        this.f30619b = interfaceC7451h;
        this.f30621d = j;
        this.f30620c = j2;
    }

    /* renamed from: o */
    private void m7015o(int i) {
        if (i != -1) {
            this.f30621d += i;
        }
    }

    /* renamed from: p */
    private void m7014p(int i) {
        int i2 = this.f30623f + i;
        byte[] bArr = this.f30622e;
        if (i2 > bArr.length) {
            this.f30622e = Arrays.copyOf(this.f30622e, C9191p0.m16227r(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: q */
    private int m7013q(byte[] bArr, int i, int i2) {
        int i3 = this.f30624g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f30622e, 0, bArr, i, min);
        m7009u(min);
        return min;
    }

    /* renamed from: r */
    private int m7012r(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.f30619b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    /* renamed from: s */
    private int m7011s(int i) {
        int min = Math.min(this.f30624g, i);
        m7009u(min);
        return min;
    }

    /* renamed from: u */
    private void m7009u(int i) {
        byte[] bArr;
        int i2 = this.f30624g - i;
        this.f30624g = i2;
        this.f30623f = 0;
        byte[] bArr2 = this.f30622e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f30622e = bArr;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: a */
    public int mo6971a(int i) {
        int m7011s = m7011s(i);
        if (m7011s == 0) {
            byte[] bArr = this.f30618a;
            m7011s = m7012r(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m7015o(m7011s);
        return m7011s;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: c */
    public boolean mo6970c(byte[] bArr, int i, int i2, boolean z) {
        if (!mo6964l(i2, z)) {
            return false;
        }
        System.arraycopy(this.f30622e, this.f30623f - i2, bArr, i, i2);
        return true;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: e */
    public void mo6969e() {
        this.f30623f = 0;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: g */
    public boolean mo6968g(byte[] bArr, int i, int i2, boolean z) {
        int m7013q = m7013q(bArr, i, i2);
        while (m7013q < i2 && m7013q != -1) {
            m7013q = m7012r(bArr, i, i2, m7013q, z);
        }
        m7015o(m7013q);
        if (m7013q != -1) {
            return true;
        }
        return false;
    }

    @Override // p296q6.InterfaceC11747j
    public long getLength() {
        return this.f30620c;
    }

    @Override // p296q6.InterfaceC11747j
    public long getPosition() {
        return this.f30621d;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: h */
    public long mo3742h() {
        return this.f30621d + this.f30623f;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: i */
    public void mo6967i(int i) {
        mo6964l(i, false);
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: j */
    public int mo6966j(byte[] bArr, int i, int i2) {
        int min;
        m7014p(i2);
        int i3 = this.f30624g;
        int i4 = this.f30623f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = m7012r(this.f30622e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f30624g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.f30622e, this.f30623f, bArr, i, min);
        this.f30623f += min;
        return min;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: k */
    public void mo6965k(int i) {
        m7010t(i, false);
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: l */
    public boolean mo6964l(int i, boolean z) {
        m7014p(i);
        int i2 = this.f30624g - this.f30623f;
        while (i2 < i) {
            i2 = m7012r(this.f30622e, this.f30623f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f30624g = this.f30623f + i2;
        }
        this.f30623f += i;
        return true;
    }

    @Override // p296q6.InterfaceC11747j
    /* renamed from: n */
    public void mo6963n(byte[] bArr, int i, int i2) {
        mo6970c(bArr, i, i2, false);
    }

    @Override // p296q6.InterfaceC11747j, p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        int m7013q = m7013q(bArr, i, i2);
        if (m7013q == 0) {
            m7013q = m7012r(bArr, i, i2, 0, true);
        }
        m7015o(m7013q);
        return m7013q;
    }

    @Override // p296q6.InterfaceC11747j
    public void readFully(byte[] bArr, int i, int i2) {
        mo6968g(bArr, i, i2, false);
    }

    /* renamed from: t */
    public boolean m7010t(int i, boolean z) {
        int m7011s = m7011s(i);
        while (m7011s < i && m7011s != -1) {
            m7011s = m7012r(this.f30618a, -m7011s, Math.min(i, this.f30618a.length + m7011s), m7011s, z);
        }
        m7015o(m7011s);
        if (m7011s != -1) {
            return true;
        }
        return false;
    }
}
