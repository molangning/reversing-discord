package p122gk;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0001¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J \u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J \u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, m14357d2 = {"Lgk/i;", "Lokio/Source;", "", "h", "i", "Lokio/Buffer;", "buffer", "", "offset", "byteCount", "j", "", ZeroconfModule.KEY_SERVICE_NAME, "", "expected", "actual", "a", "sink", "read", "Lokio/Timeout;", "timeout", "close", "", "B", "section", "Lgk/t;", "k", "Lgk/t;", "source", "Ljava/util/zip/Inflater;", "l", "Ljava/util/zip/Inflater;", "inflater", "Lgk/k;", "m", "Lgk/k;", "inflaterSource", "Ljava/util/zip/CRC32;", "n", "Ljava/util/zip/CRC32;", "crc", "<init>", "(Lokio/Source;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6835i implements Source {

    /* renamed from: j */
    private byte f19041j;

    /* renamed from: k */
    private final C6849t f19042k;

    /* renamed from: l */
    private final Inflater f19043l;

    /* renamed from: m */
    private final C6838k f19044m;

    /* renamed from: n */
    private final CRC32 f19045n;

    public C6835i(Source source) {
        C9612q.m13917h(source, "source");
        C6849t c6849t = new C6849t(source);
        this.f19042k = c6849t;
        Inflater inflater = new Inflater(true);
        this.f19043l = inflater;
        this.f19044m = new C6838k((BufferedSource) c6849t, inflater);
        this.f19045n = new CRC32();
    }

    /* renamed from: a */
    private final void m21841a(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        C9612q.m13918g(format, "java.lang.String.format(this, *args)");
        throw new IOException(format);
    }

    /* renamed from: h */
    private final void m21840h() {
        boolean z;
        boolean z2;
        boolean z3;
        this.f19042k.mo8594a0(10L);
        byte m8645D = this.f19042k.f19071j.m8645D(3L);
        boolean z4 = true;
        if (((m8645D >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21838j(this.f19042k.f19071j, 0L, 10L);
        }
        m21841a("ID1ID2", 8075, this.f19042k.readShort());
        this.f19042k.skip(8L);
        if (((m8645D >> 2) & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.f19042k.mo8594a0(2L);
            if (z) {
                m21838j(this.f19042k.f19071j, 0L, 2L);
            }
            long m8623b0 = this.f19042k.f19071j.m8623b0();
            this.f19042k.mo8594a0(m8623b0);
            if (z) {
                m21838j(this.f19042k.f19071j, 0L, m8623b0);
            }
            this.f19042k.skip(m8623b0);
        }
        if (((m8645D >> 3) & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            long m21795a = this.f19042k.m21795a((byte) 0);
            if (m21795a != -1) {
                if (z) {
                    m21838j(this.f19042k.f19071j, 0L, m21795a + 1);
                }
                this.f19042k.skip(m21795a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((m8645D >> 4) & 1) != 1) {
            z4 = false;
        }
        if (z4) {
            long m21795a2 = this.f19042k.m21795a((byte) 0);
            if (m21795a2 != -1) {
                if (z) {
                    m21838j(this.f19042k.f19071j, 0L, m21795a2 + 1);
                }
                this.f19042k.skip(m21795a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m21841a("FHCRC", this.f19042k.m21790o(), (short) this.f19045n.getValue());
            this.f19045n.reset();
        }
    }

    /* renamed from: i */
    private final void m21839i() {
        m21841a("CRC", this.f19042k.m21791m(), (int) this.f19045n.getValue());
        m21841a("ISIZE", this.f19042k.m21791m(), (int) this.f19043l.getBytesWritten());
    }

    /* renamed from: j */
    private final void m21838j(Buffer buffer, long j, long j2) {
        int i;
        C6851u c6851u = buffer.f29470j;
        C9612q.m13920e(c6851u);
        while (true) {
            int i2 = c6851u.f19078c;
            int i3 = c6851u.f19077b;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            c6851u = c6851u.f19081f;
            C9612q.m13920e(c6851u);
        }
        while (j2 > 0) {
            int min = (int) Math.min(c6851u.f19078c - i, j2);
            this.f19045n.update(c6851u.f19076a, (int) (c6851u.f19077b + j), min);
            j2 -= min;
            c6851u = c6851u.f19081f;
            C9612q.m13920e(c6851u);
            j = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19044m.close();
    }

    @Override // okio.Source
    public long read(Buffer sink, long j) {
        boolean z;
        C9612q.m13917h(sink, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return 0L;
            }
            if (this.f19041j == 0) {
                m21840h();
                this.f19041j = (byte) 1;
            }
            if (this.f19041j == 1) {
                long size = sink.size();
                long read = this.f19044m.read(sink, j);
                if (read != -1) {
                    m21838j(sink, size, read);
                    return read;
                }
                this.f19041j = (byte) 2;
            }
            if (this.f19041j == 2) {
                m21839i();
                this.f19041j = (byte) 3;
                if (!this.f19042k.mo8589g0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f19042k.timeout();
    }
}