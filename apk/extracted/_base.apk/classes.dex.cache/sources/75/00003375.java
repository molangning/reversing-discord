package fk;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\bB/\u0012\u0006\u0010,\u001a\u00020\n\u0012\u0006\u00102\u001a\u00020-\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u00108\u001a\u00020\n\u0012\u0006\u0010:\u001a\u00020\n¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\u0006\u0010\b\u001a\u00020\u0002J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\u0016\u0010\u0017\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000bR\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u000bR\u0017\u00102\u001a\u00020-8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00108\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010\u000bR\u0014\u0010:\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010\u000b¨\u0006="}, m14357d2 = {"Lfk/g;", "Ljava/io/Closeable;", "", "i", "h", "m", "o", "j", "a", "close", "", "Z", "closed", "", "k", "I", "opcode", "", "l", "J", "frameLength", "isFinalFrame", "n", "isControlFrame", "readingCompressedMessage", "Lokio/Buffer;", "p", "Lokio/Buffer;", "controlFrameBuffer", "q", "messageFrameBuffer", "Lfk/c;", "r", "Lfk/c;", "messageInflater", "", "s", "[B", "maskKey", "Lokio/Buffer$a;", "t", "Lokio/Buffer$a;", "maskCursor", "u", "isClient", "Lokio/BufferedSource;", "v", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "source", "Lfk/g$a;", "w", "Lfk/g$a;", "frameCallback", "x", "perMessageDeflate", "y", "noContextTakeover", "<init>", "(ZLokio/BufferedSource;Lfk/g$a;ZZ)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: fk.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6501g implements Closeable {

    /* renamed from: j */
    private boolean f18282j;

    /* renamed from: k */
    private int f18283k;

    /* renamed from: l */
    private long f18284l;

    /* renamed from: m */
    private boolean f18285m;

    /* renamed from: n */
    private boolean f18286n;

    /* renamed from: o */
    private boolean f18287o;

    /* renamed from: p */
    private final Buffer f18288p;

    /* renamed from: q */
    private final Buffer f18289q;

    /* renamed from: r */
    private C6488c f18290r;

    /* renamed from: s */
    private final byte[] f18291s;

    /* renamed from: t */
    private final Buffer.C11211a f18292t;

    /* renamed from: u */
    private final boolean f18293u;

    /* renamed from: v */
    private final BufferedSource f18294v;

    /* renamed from: w */
    private final InterfaceC6502a f18295w;

    /* renamed from: x */
    private final boolean f18296x;

    /* renamed from: y */
    private final boolean f18297y;

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0002H&¨\u0006\u0010"}, m14357d2 = {"Lfk/g$a;", "", "", "text", "", "d", "Lokio/ByteString;", "bytes", "c", "payload", "e", "f", "", "code", "reason", "h", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: fk.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface InterfaceC6502a {
        /* renamed from: c */
        void mo22566c(ByteString byteString);

        /* renamed from: d */
        void mo22565d(String str);

        /* renamed from: e */
        void mo22564e(ByteString byteString);

        /* renamed from: f */
        void mo22563f(ByteString byteString);

        /* renamed from: h */
        void mo22562h(int i, String str);
    }

    public C6501g(boolean z, BufferedSource source, InterfaceC6502a frameCallback, boolean z2, boolean z3) {
        byte[] bArr;
        C9612q.m13917h(source, "source");
        C9612q.m13917h(frameCallback, "frameCallback");
        this.f18293u = z;
        this.f18294v = source;
        this.f18295w = frameCallback;
        this.f18296x = z2;
        this.f18297y = z3;
        this.f18288p = new Buffer();
        this.f18289q = new Buffer();
        if (z) {
            bArr = null;
        } else {
            bArr = new byte[4];
        }
        this.f18291s = bArr;
        this.f18292t = z ? null : new Buffer.C11211a();
    }

    /* renamed from: h */
    private final void m22571h() {
        short s;
        String str;
        long j = this.f18284l;
        if (j > 0) {
            this.f18294v.mo8580z(this.f18288p, j);
            if (!this.f18293u) {
                Buffer buffer = this.f18288p;
                Buffer.C11211a c11211a = this.f18292t;
                C9612q.m13920e(c11211a);
                buffer.m8626U(c11211a);
                this.f18292t.m8610i(0L);
                C6500f c6500f = C6500f.f18281a;
                Buffer.C11211a c11211a2 = this.f18292t;
                byte[] bArr = this.f18291s;
                C9612q.m13920e(bArr);
                c6500f.m22574b(c11211a2, bArr);
                this.f18292t.close();
            }
        }
        switch (this.f18283k) {
            case 8:
                long size = this.f18288p.size();
                if (size != 1) {
                    if (size != 0) {
                        s = this.f18288p.readShort();
                        str = this.f18288p.mo8584p0();
                        String m22575a = C6500f.f18281a.m22575a(s);
                        if (m22575a != null) {
                            throw new ProtocolException(m22575a);
                        }
                    } else {
                        s = 1005;
                        str = "";
                    }
                    this.f18295w.mo22562h(s, str);
                    this.f18282j = true;
                    return;
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                this.f18295w.mo22564e(this.f18288p.mo8586o0());
                return;
            case 10:
                this.f18295w.mo22563f(this.f18288p.mo8586o0());
                return;
            default:
                throw new ProtocolException("Unknown control opcode: " + C12562c.m4822N(this.f18283k));
        }
    }

    /* renamed from: i */
    private final void m22570i() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        String str;
        if (!this.f18282j) {
            long mo8539h = this.f18294v.timeout().mo8539h();
            this.f18294v.timeout().mo8542b();
            try {
                int m4809b = C12562c.m4809b(this.f18294v.readByte(), 255);
                this.f18294v.timeout().mo8536g(mo8539h, TimeUnit.NANOSECONDS);
                int i = m4809b & 15;
                this.f18283k = i;
                boolean z7 = false;
                if ((m4809b & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f18285m = z;
                if ((m4809b & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f18286n = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((m4809b & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i != 1 && i != 2) {
                    if (z3) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                } else {
                    if (z3) {
                        if (this.f18296x) {
                            z4 = true;
                        } else {
                            throw new ProtocolException("Unexpected rsv1 flag");
                        }
                    } else {
                        z4 = false;
                    }
                    this.f18287o = z4;
                }
                if ((m4809b & 32) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    if ((m4809b & 16) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        int m4809b2 = C12562c.m4809b(this.f18294v.readByte(), 255);
                        if ((m4809b2 & 128) != 0) {
                            z7 = true;
                        }
                        if (z7 == this.f18293u) {
                            if (this.f18293u) {
                                str = "Server-sent frames must not be masked.";
                            } else {
                                str = "Client-sent frames must be masked.";
                            }
                            throw new ProtocolException(str);
                        }
                        long j = m4809b2 & 127;
                        this.f18284l = j;
                        if (j == 126) {
                            this.f18284l = C12562c.m4808c(this.f18294v.readShort(), 65535);
                        } else if (j == 127) {
                            long readLong = this.f18294v.readLong();
                            this.f18284l = readLong;
                            if (readLong < 0) {
                                throw new ProtocolException("Frame length 0x" + C12562c.m4821O(this.f18284l) + " > 0x7FFFFFFFFFFFFFFF");
                            }
                        }
                        if (this.f18286n && this.f18284l > 125) {
                            throw new ProtocolException("Control frame must be less than 125B.");
                        }
                        if (z7) {
                            BufferedSource bufferedSource = this.f18294v;
                            byte[] bArr = this.f18291s;
                            C9612q.m13920e(bArr);
                            bufferedSource.readFully(bArr);
                            return;
                        }
                        return;
                    }
                    throw new ProtocolException("Unexpected rsv3 flag");
                }
                throw new ProtocolException("Unexpected rsv2 flag");
            } catch (Throwable th2) {
                this.f18294v.timeout().mo8536g(mo8539h, TimeUnit.NANOSECONDS);
                throw th2;
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: j */
    private final void m22569j() {
        while (!this.f18282j) {
            long j = this.f18284l;
            if (j > 0) {
                this.f18294v.mo8580z(this.f18289q, j);
                if (!this.f18293u) {
                    Buffer buffer = this.f18289q;
                    Buffer.C11211a c11211a = this.f18292t;
                    C9612q.m13920e(c11211a);
                    buffer.m8626U(c11211a);
                    this.f18292t.m8610i(this.f18289q.size() - this.f18284l);
                    C6500f c6500f = C6500f.f18281a;
                    Buffer.C11211a c11211a2 = this.f18292t;
                    byte[] bArr = this.f18291s;
                    C9612q.m13920e(bArr);
                    c6500f.m22574b(c11211a2, bArr);
                    this.f18292t.close();
                }
            }
            if (this.f18285m) {
                return;
            }
            m22567o();
            if (this.f18283k != 0) {
                throw new ProtocolException("Expected continuation opcode. Got: " + C12562c.m4822N(this.f18283k));
            }
        }
        throw new IOException("closed");
    }

    /* renamed from: m */
    private final void m22568m() {
        int i = this.f18283k;
        if (i != 1 && i != 2) {
            throw new ProtocolException("Unknown opcode: " + C12562c.m4822N(i));
        }
        m22569j();
        if (this.f18287o) {
            C6488c c6488c = this.f18290r;
            if (c6488c == null) {
                c6488c = new C6488c(this.f18297y);
                this.f18290r = c6488c;
            }
            c6488c.m22603a(this.f18289q);
        }
        if (i == 1) {
            this.f18295w.mo22565d(this.f18289q.mo8584p0());
        } else {
            this.f18295w.mo22566c(this.f18289q.mo8586o0());
        }
    }

    /* renamed from: o */
    private final void m22567o() {
        while (!this.f18282j) {
            m22570i();
            if (this.f18286n) {
                m22571h();
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void m22572a() {
        m22570i();
        if (this.f18286n) {
            m22571h();
        } else {
            m22568m();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C6488c c6488c = this.f18290r;
        if (c6488c != null) {
            c6488c.close();
        }
    }
}