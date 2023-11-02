package p410wj;

import fk.C6489d;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.Sink;
import okio.Source;
import p122gk.AbstractC6832f;
import p122gk.AbstractC6833g;
import p122gk.C6840m;
import p328rj.AbstractC12302m;
import p431xj.C13841h;
import p431xj.InterfaceC13837d;

@Metadata(m14358d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\"\u001bB'\u0012\u0006\u00103\u001a\u00020/\u0012\u0006\u00108\u001a\u000204\u0012\u0006\u0010=\u001a\u000209\u0012\u0006\u0010@\u001a\u00020>¢\u0006\u0004\bC\u0010DJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\tJ\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0004J\u0006\u0010\u001a\u001a\u00020\u0004J\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\u0004J9\u0010\"\u001a\u00028\u0000\"\n\b\u0000\u0010\u001d*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u0006\u0010$\u001a\u00020\u0004R$\u0010)\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010.\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u00102R\u001a\u00108\u001a\u0002048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u00107R\u001a\u0010=\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010?R\u0014\u0010B\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010(¨\u0006E"}, m14357d2 = {"Lwj/c;", "", "Ljava/io/IOException;", "e", "", "t", "Lokhttp3/Request;", "request", "v", "", "duplex", "Lokio/Sink;", "c", "f", "s", "expectContinue", "Lokhttp3/Response$a;", "q", "Lokhttp3/Response;", "response", "r", "Lokhttp3/ResponseBody;", "p", "Lfk/d$d;", "m", "u", "n", "b", "d", "E", "", "bytesRead", "responseDone", "requestDone", "a", "(JZZLjava/io/IOException;)Ljava/io/IOException;", "o", "<set-?>", "Z", "l", "()Z", "isDuplex", "Lwj/f;", "Lwj/f;", "h", "()Lwj/f;", "connection", "Lwj/e;", "Lwj/e;", "g", "()Lwj/e;", "call", "Lrj/m;", "Lrj/m;", "i", "()Lrj/m;", "eventListener", "Lwj/d;", "Lwj/d;", "j", "()Lwj/d;", "finder", "Lxj/d;", "Lxj/d;", "codec", "k", "isCoalescedConnection", "<init>", "(Lwj/e;Lrj/m;Lwj/d;Lxj/d;)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: wj.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13634c {

    /* renamed from: a */
    private boolean f35031a;

    /* renamed from: b */
    private final C13642f f35032b;

    /* renamed from: c */
    private final C13638e f35033c;

    /* renamed from: d */
    private final AbstractC12302m f35034d;

    /* renamed from: e */
    private final C13637d f35035e;

    /* renamed from: f */
    private final InterfaceC13837d f35036f;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001e"}, m14357d2 = {"Lwj/c$a;", "Lgk/f;", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "flush", "close", "", "k", "Z", "completed", "l", "J", "bytesReceived", "m", "closed", "n", "contentLength", "Lokio/Sink;", "delegate", "<init>", "(Lwj/c;Lokio/Sink;J)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C13635a extends AbstractC6832f {

        /* renamed from: k */
        private boolean f35037k;

        /* renamed from: l */
        private long f35038l;

        /* renamed from: m */
        private boolean f35039m;

        /* renamed from: n */
        private final long f35040n;

        /* renamed from: o */
        final /* synthetic */ C13634c f35041o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13635a(C13634c c13634c, Sink delegate, long j) {
            super(delegate);
            C9612q.m13917h(delegate, "delegate");
            this.f35041o = c13634c;
            this.f35040n = j;
        }

        /* renamed from: a */
        private final <E extends IOException> E m2015a(E e) {
            if (this.f35037k) {
                return e;
            }
            this.f35037k = true;
            return (E) this.f35041o.m2037a(this.f35038l, false, true, e);
        }

        @Override // p122gk.AbstractC6832f, okio.Sink
        /* renamed from: L */
        public void mo46L(Buffer source, long j) {
            C9612q.m13917h(source, "source");
            if (!this.f35039m) {
                long j2 = this.f35040n;
                if (j2 != -1 && this.f35038l + j > j2) {
                    throw new ProtocolException("expected " + this.f35040n + " bytes but received " + (this.f35038l + j));
                }
                try {
                    super.mo46L(source, j);
                    this.f35038l += j;
                    return;
                } catch (IOException e) {
                    throw m2015a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // p122gk.AbstractC6832f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f35039m) {
                return;
            }
            this.f35039m = true;
            long j = this.f35040n;
            if (j != -1 && this.f35038l != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                m2015a(null);
            } catch (IOException e) {
                throw m2015a(e);
            }
        }

        @Override // p122gk.AbstractC6832f, okio.Sink, java.io.Flushable
        public void flush() {
            try {
                super.flush();
            } catch (IOException e) {
                throw m2015a(e);
            }
        }
    }

    @Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J!\u0010\f\u001a\u00028\u0000\"\n\b\u0000\u0010\n*\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001f"}, m14357d2 = {"Lwj/c$b;", "Lgk/g;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "", "close", "Ljava/io/IOException;", "E", "e", "a", "(Ljava/io/IOException;)Ljava/io/IOException;", "j", "J", "bytesReceived", "", "k", "Z", "invokeStartEvent", "l", "completed", "m", "closed", "n", "contentLength", "Lokio/Source;", "delegate", "<init>", "(Lwj/c;Lokio/Source;J)V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: wj.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public final class C13636b extends AbstractC6833g {

        /* renamed from: j */
        private long f35042j;

        /* renamed from: k */
        private boolean f35043k;

        /* renamed from: l */
        private boolean f35044l;

        /* renamed from: m */
        private boolean f35045m;

        /* renamed from: n */
        private final long f35046n;

        /* renamed from: o */
        final /* synthetic */ C13634c f35047o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13636b(C13634c c13634c, Source delegate, long j) {
            super(delegate);
            C9612q.m13917h(delegate, "delegate");
            this.f35047o = c13634c;
            this.f35046n = j;
            this.f35043k = true;
            if (j == 0) {
                m2014a(null);
            }
        }

        /* renamed from: a */
        public final <E extends IOException> E m2014a(E e) {
            if (this.f35044l) {
                return e;
            }
            this.f35044l = true;
            if (e == null && this.f35043k) {
                this.f35043k = false;
                this.f35047o.m2029i().m5522w(this.f35047o.m2031g());
            }
            return (E) this.f35047o.m2037a(this.f35042j, true, false, e);
        }

        @Override // p122gk.AbstractC6833g, okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f35045m) {
                return;
            }
            this.f35045m = true;
            try {
                super.close();
                m2014a(null);
            } catch (IOException e) {
                throw m2014a(e);
            }
        }

        @Override // p122gk.AbstractC6833g, okio.Source
        public long read(Buffer sink, long j) {
            C9612q.m13917h(sink, "sink");
            if (!this.f35045m) {
                try {
                    long read = delegate().read(sink, j);
                    if (this.f35043k) {
                        this.f35043k = false;
                        this.f35047o.m2029i().m5522w(this.f35047o.m2031g());
                    }
                    if (read == -1) {
                        m2014a(null);
                        return -1L;
                    }
                    long j2 = this.f35042j + read;
                    long j3 = this.f35046n;
                    if (j3 != -1 && j2 > j3) {
                        throw new ProtocolException("expected " + this.f35046n + " bytes but received " + j2);
                    }
                    this.f35042j = j2;
                    if (j2 == j3) {
                        m2014a(null);
                    }
                    return read;
                } catch (IOException e) {
                    throw m2014a(e);
                }
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    public C13634c(C13638e call, AbstractC12302m eventListener, C13637d finder, InterfaceC13837d codec) {
        C9612q.m13917h(call, "call");
        C9612q.m13917h(eventListener, "eventListener");
        C9612q.m13917h(finder, "finder");
        C9612q.m13917h(codec, "codec");
        this.f35033c = call;
        this.f35034d = eventListener;
        this.f35035e = finder;
        this.f35036f = codec;
        this.f35032b = codec.mo120c();
    }

    /* renamed from: t */
    private final void m2018t(IOException iOException) {
        this.f35035e.m2006h(iOException);
        this.f35036f.mo120c().m1963H(this.f35033c, iOException);
    }

    /* renamed from: a */
    public final <E extends IOException> E m2037a(long j, boolean z, boolean z2, E e) {
        if (e != null) {
            m2018t(e);
        }
        if (z2) {
            if (e != null) {
                this.f35034d.m5526s(this.f35033c, e);
            } else {
                this.f35034d.m5528q(this.f35033c, j);
            }
        }
        if (z) {
            if (e != null) {
                this.f35034d.m5521x(this.f35033c, e);
            } else {
                this.f35034d.m5523v(this.f35033c, j);
            }
        }
        return (E) this.f35033c.m1981v(this, z2, z, e);
    }

    /* renamed from: b */
    public final void m2036b() {
        this.f35036f.cancel();
    }

    /* renamed from: c */
    public final Sink m2035c(Request request, boolean z) {
        C9612q.m13917h(request, "request");
        this.f35031a = z;
        RequestBody m8745a = request.m8745a();
        C9612q.m13920e(m8745a);
        long contentLength = m8745a.contentLength();
        this.f35034d.m5527r(this.f35033c);
        return new C13635a(this, this.f35036f.mo118e(request, contentLength), contentLength);
    }

    /* renamed from: d */
    public final void m2034d() {
        this.f35036f.cancel();
        this.f35033c.m1981v(this, true, true, null);
    }

    /* renamed from: e */
    public final void m2033e() {
        try {
            this.f35036f.mo122a();
        } catch (IOException e) {
            this.f35034d.m5526s(this.f35033c, e);
            m2018t(e);
            throw e;
        }
    }

    /* renamed from: f */
    public final void m2032f() {
        try {
            this.f35036f.mo115h();
        } catch (IOException e) {
            this.f35034d.m5526s(this.f35033c, e);
            m2018t(e);
            throw e;
        }
    }

    /* renamed from: g */
    public final C13638e m2031g() {
        return this.f35033c;
    }

    /* renamed from: h */
    public final C13642f m2030h() {
        return this.f35032b;
    }

    /* renamed from: i */
    public final AbstractC12302m m2029i() {
        return this.f35034d;
    }

    /* renamed from: j */
    public final C13637d m2028j() {
        return this.f35035e;
    }

    /* renamed from: k */
    public final boolean m2027k() {
        return !C9612q.m13922c(this.f35035e.m2010d().m5618l().m8899h(), this.f35032b.m1970A().m5507a().m5618l().m8899h());
    }

    /* renamed from: l */
    public final boolean m2026l() {
        return this.f35031a;
    }

    /* renamed from: m */
    public final C6489d.AbstractC6493d m2025m() {
        this.f35033c.m2004B();
        return this.f35036f.mo120c().m1941x(this);
    }

    /* renamed from: n */
    public final void m2024n() {
        this.f35036f.mo120c().m1939z();
    }

    /* renamed from: o */
    public final void m2023o() {
        this.f35033c.m1981v(this, true, false, null);
    }

    /* renamed from: p */
    public final ResponseBody m2022p(Response response) {
        C9612q.m13917h(response, "response");
        try {
            String m8690v = Response.m8690v(response, "Content-Type", null, 2, null);
            long mo119d = this.f35036f.mo119d(response);
            return new C13841h(m8690v, mo119d, C6840m.m21829d(new C13636b(this, this.f35036f.mo121b(response), mo119d)));
        } catch (IOException e) {
            this.f35034d.m5521x(this.f35033c, e);
            m2018t(e);
            throw e;
        }
    }

    /* renamed from: q */
    public final Response.C11207a m2021q(boolean z) {
        try {
            Response.C11207a mo116g = this.f35036f.mo116g(z);
            if (mo116g != null) {
                mo116g.m8678l(this);
            }
            return mo116g;
        } catch (IOException e) {
            this.f35034d.m5521x(this.f35033c, e);
            m2018t(e);
            throw e;
        }
    }

    /* renamed from: r */
    public final void m2020r(Response response) {
        C9612q.m13917h(response, "response");
        this.f35034d.m5520y(this.f35033c, response);
    }

    /* renamed from: s */
    public final void m2019s() {
        this.f35034d.m5519z(this.f35033c);
    }

    /* renamed from: u */
    public final void m2017u() {
        m2037a(-1L, true, true, null);
    }

    /* renamed from: v */
    public final void m2016v(Request request) {
        C9612q.m13917h(request, "request");
        try {
            this.f35034d.m5524u(this.f35033c);
            this.f35036f.mo117f(request);
            this.f35034d.m5525t(this.f35033c, request);
        } catch (IOException e) {
            this.f35034d.m5526s(this.f35033c, e);
            m2018t(e);
            throw e;
        }
    }
}