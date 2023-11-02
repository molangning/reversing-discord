package p122gk;

import hk.C7359b;
import hk.C7363e;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.ByteString;

@Metadata(m14358d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110(\u0012\u0006\u00103\u001a\u00020.¢\u0006\u0004\b4\u00105J\b\u0010\u0002\u001a\u00020\u0001H\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0001H\u0016J\u0017\u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0010¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J'\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010 \u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J(\u0010!\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u000f\u0010\"\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u001f2\b\u0010\u001d\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010&\u001a\u00020\nH\u0016J\b\u0010'\u001a\u00020\u0003H\u0016R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00103\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00066"}, m14357d2 = {"Lgk/w;", "Lokio/ByteString;", "I", "", "a", "l", "B", "algorithm", "d", "(Ljava/lang/String;)Lokio/ByteString;", "", "pos", "", "n", "(I)B", "i", "()I", "", "C", "Ljava/io/OutputStream;", "out", "", "E", "Lokio/Buffer;", "buffer", "offset", "byteCount", "F", "(Lokio/Buffer;II)V", "other", "otherOffset", "", "q", "r", "m", "()[B", "", "equals", "hashCode", "toString", "", "o", "[[B", "H", "()[[B", "segments", "", "p", "[I", "G", "()[I", "directory", "<init>", "([[B[I)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6854w extends ByteString {

    /* renamed from: o */
    private final transient byte[][] f19088o;

    /* renamed from: p */
    private final transient int[] f19089p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6854w(byte[][] segments, int[] directory) {
        super(ByteString.f29481m.m8566g());
        C9612q.m13917h(segments, "segments");
        C9612q.m13917h(directory, "directory");
        this.f19088o = segments;
        this.f19089p = directory;
    }

    /* renamed from: I */
    private final ByteString m21777I() {
        return new ByteString(mo8576C());
    }

    @Override // okio.ByteString
    /* renamed from: B */
    public ByteString mo8577B() {
        return m21777I().mo8577B();
    }

    @Override // okio.ByteString
    /* renamed from: C */
    public byte[] mo8576C() {
        byte[] bArr = new byte[m8551z()];
        int length = m21778H().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = m21779G()[length + i];
            int i5 = m21779G()[i];
            int i6 = i5 - i2;
            C9536e.m14273e(m21778H()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // okio.ByteString
    /* renamed from: E */
    public void mo8574E(OutputStream out) {
        C9612q.m13917h(out, "out");
        int length = m21778H().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = m21779G()[length + i];
            int i4 = m21779G()[i];
            out.write(m21778H()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
    }

    @Override // okio.ByteString
    /* renamed from: F */
    public void mo8573F(Buffer buffer, int i, int i2) {
        int i3;
        C9612q.m13917h(buffer, "buffer");
        int i4 = i + i2;
        int m20834b = C7363e.m20834b(this, i);
        while (i < i4) {
            if (m20834b == 0) {
                i3 = 0;
            } else {
                i3 = m21779G()[m20834b - 1];
            }
            int i5 = m21779G()[m21778H().length + m20834b];
            int min = Math.min(i4, (m21779G()[m20834b] - i3) + i3) - i;
            int i6 = i5 + (i - i3);
            C6851u c6851u = new C6851u(m21778H()[m20834b], i6, i6 + min, true, false);
            C6851u c6851u2 = buffer.f29470j;
            if (c6851u2 == null) {
                c6851u.f19082g = c6851u;
                c6851u.f19081f = c6851u;
                buffer.f29470j = c6851u;
            } else {
                C9612q.m13920e(c6851u2);
                C6851u c6851u3 = c6851u2.f19082g;
                C9612q.m13920e(c6851u3);
                c6851u3.m21787c(c6851u);
            }
            i += min;
            m20834b++;
        }
        buffer.m8615t0(buffer.size() + i2);
    }

    /* renamed from: G */
    public final int[] m21779G() {
        return this.f19089p;
    }

    /* renamed from: H */
    public final byte[][] m21778H() {
        return this.f19088o;
    }

    @Override // okio.ByteString
    /* renamed from: a */
    public String mo8572a() {
        return m21777I().mo8572a();
    }

    @Override // okio.ByteString
    /* renamed from: d */
    public ByteString mo8569d(String algorithm) {
        C9612q.m13917h(algorithm, "algorithm");
        return C7359b.m20841e(this, algorithm);
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.m8551z() == m8551z() && mo8557q(0, byteString, 0, m8551z())) {
                return true;
            }
        }
        return false;
    }

    @Override // okio.ByteString
    public int hashCode() {
        int m8565h = m8565h();
        if (m8565h == 0) {
            int length = m21778H().length;
            int i = 0;
            int i2 = 1;
            int i3 = 0;
            while (i < length) {
                int i4 = m21779G()[length + i];
                int i5 = m21779G()[i];
                byte[] bArr = m21778H()[i];
                int i6 = (i5 - i3) + i4;
                while (i4 < i6) {
                    i2 = (i2 * 31) + bArr[i4];
                    i4++;
                }
                i++;
                i3 = i5;
            }
            m8555s(i2);
            return i2;
        }
        return m8565h;
    }

    @Override // okio.ByteString
    /* renamed from: i */
    public int mo8564i() {
        return m21779G()[m21778H().length - 1];
    }

    @Override // okio.ByteString
    /* renamed from: l */
    public String mo8562l() {
        return m21777I().mo8562l();
    }

    @Override // okio.ByteString
    /* renamed from: m */
    public byte[] mo8561m() {
        return mo8576C();
    }

    @Override // okio.ByteString
    /* renamed from: n */
    public byte mo8560n(int i) {
        int i2;
        C6829c.m21850b(m21779G()[m21778H().length - 1], i, 1L);
        int m20834b = C7363e.m20834b(this, i);
        if (m20834b == 0) {
            i2 = 0;
        } else {
            i2 = m21779G()[m20834b - 1];
        }
        return m21778H()[m20834b][(i - i2) + m21779G()[m21778H().length + m20834b]];
    }

    @Override // okio.ByteString
    /* renamed from: q */
    public boolean mo8557q(int i, ByteString other, int i2, int i3) {
        int i4;
        C9612q.m13917h(other, "other");
        if (i < 0 || i > m8551z() - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m20834b = C7363e.m20834b(this, i);
        while (i < i5) {
            if (m20834b == 0) {
                i4 = 0;
            } else {
                i4 = m21779G()[m20834b - 1];
            }
            int i6 = m21779G()[m21778H().length + m20834b];
            int min = Math.min(i5, (m21779G()[m20834b] - i4) + i4) - i;
            if (!other.mo8556r(i2, m21778H()[m20834b], i6 + (i - i4), min)) {
                return false;
            }
            i2 += min;
            i += min;
            m20834b++;
        }
        return true;
    }

    @Override // okio.ByteString
    /* renamed from: r */
    public boolean mo8556r(int i, byte[] other, int i2, int i3) {
        int i4;
        C9612q.m13917h(other, "other");
        if (i < 0 || i > m8551z() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int m20834b = C7363e.m20834b(this, i);
        while (i < i5) {
            if (m20834b == 0) {
                i4 = 0;
            } else {
                i4 = m21779G()[m20834b - 1];
            }
            int i6 = m21779G()[m21778H().length + m20834b];
            int min = Math.min(i5, (m21779G()[m20834b] - i4) + i4) - i;
            if (!C6829c.m21851a(m21778H()[m20834b], i6 + (i - i4), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            m20834b++;
        }
        return true;
    }

    @Override // okio.ByteString
    public String toString() {
        return m21777I().toString();
    }
}