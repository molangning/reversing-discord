package p280p6;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p102fb.InterfaceC6379i;
import p151i6.C7397h;
import p153i8.AbstractC7448f;
import p153i8.C7455l;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: p6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11443a extends AbstractC7448f implements InterfaceC4540f {

    /* renamed from: s */
    private static final byte[] f29750s;

    /* renamed from: e */
    private final Call.Factory f29751e;

    /* renamed from: f */
    private final InterfaceC4540f.C4547g f29752f;

    /* renamed from: g */
    private final String f29753g;

    /* renamed from: h */
    private final CacheControl f29754h;

    /* renamed from: i */
    private final InterfaceC4540f.C4547g f29755i;

    /* renamed from: j */
    private InterfaceC6379i<String> f29756j;

    /* renamed from: k */
    private C4515a f29757k;

    /* renamed from: l */
    private Response f29758l;

    /* renamed from: m */
    private InputStream f29759m;

    /* renamed from: n */
    private boolean f29760n;

    /* renamed from: o */
    private long f29761o;

    /* renamed from: p */
    private long f29762p;

    /* renamed from: q */
    private long f29763q;

    /* renamed from: r */
    private long f29764r;

    static {
        C7397h.m20760a("goog.exo.okhttp");
        f29750s = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
    }

    @Deprecated
    public C11443a(Call.Factory factory, String str, CacheControl cacheControl, InterfaceC4540f.C4547g c4547g) {
        this(factory, str, cacheControl, c4547g, null);
    }

    /* renamed from: s */
    private void m8051s() {
        Response response = this.f29758l;
        if (response != null) {
            ((ResponseBody) C9149a.m16448e(response.m8699a())).close();
            this.f29758l = null;
        }
        this.f29759m = null;
    }

    /* renamed from: t */
    private Request m8050t(C4515a c4515a) {
        long j = c4515a.f12263g;
        long j2 = c4515a.f12264h;
        HttpUrl m8895l = HttpUrl.m8895l(c4515a.f12257a.toString());
        if (m8895l != null) {
            Request.Builder m8721m = new Request.Builder().m8721m(m8895l);
            CacheControl cacheControl = this.f29754h;
            if (cacheControl != null) {
                m8721m.m8731c(cacheControl);
            }
            HashMap hashMap = new HashMap();
            InterfaceC4540f.C4547g c4547g = this.f29755i;
            if (c4547g != null) {
                hashMap.putAll(c4547g.m28633a());
            }
            hashMap.putAll(this.f29752f.m28633a());
            hashMap.putAll(c4515a.f12261e);
            for (Map.Entry entry : hashMap.entrySet()) {
                m8721m.m8729e((String) entry.getKey(), (String) entry.getValue());
            }
            if (j != 0 || j2 != -1) {
                String str = "bytes=" + j + "-";
                if (j2 != -1) {
                    str = str + ((j + j2) - 1);
                }
                m8721m.m8733a("Range", str);
            }
            String str2 = this.f29753g;
            if (str2 != null) {
                m8721m.m8733a("User-Agent", str2);
            }
            if (!c4515a.m28768d(1)) {
                m8721m.m8733a("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
            }
            byte[] bArr = c4515a.f12260d;
            RequestBody requestBody = null;
            if (bArr != null) {
                requestBody = RequestBody.create((MediaType) null, bArr);
            } else if (c4515a.f12259c == 2) {
                requestBody = RequestBody.create((MediaType) null, C9191p0.f24176f);
            }
            m8721m.m8727g(c4515a.m28770b(), requestBody);
            return m8721m.m8732b();
        }
        throw new InterfaceC4540f.C4544d("Malformed URL", c4515a, 1);
    }

    /* renamed from: u */
    private int m8049u(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29762p;
        if (j != -1) {
            long j2 = j - this.f29764r;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) C9191p0.m16243j(this.f29759m)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f29762p == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f29764r += read;
        m20654o(read);
        return read;
    }

    /* renamed from: v */
    private void m8048v() {
        byte[] bArr;
        if (this.f29763q == this.f29761o) {
            return;
        }
        while (true) {
            long j = this.f29763q;
            long j2 = this.f29761o;
            if (j != j2) {
                long j3 = j2 - j;
                int read = ((InputStream) C9191p0.m16243j(this.f29759m)).read(f29750s, 0, (int) Math.min(j3, bArr.length));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.f29763q += read;
                        m20654o(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                return;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        byte[] bArr;
        String str;
        this.f29757k = c4515a;
        long j = 0;
        this.f29764r = 0L;
        this.f29763q = 0L;
        m20652q(c4515a);
        try {
            Response execute = this.f29751e.mo8811b(m8050t(c4515a)).execute();
            this.f29758l = execute;
            ResponseBody responseBody = (ResponseBody) C9149a.m16448e(execute.m8699a());
            this.f29759m = responseBody.byteStream();
            int m8695m = execute.m8695m();
            if (!execute.m8701X()) {
                try {
                    bArr = C9191p0.m16276S0((InputStream) C9149a.m16448e(this.f29759m));
                } catch (IOException unused) {
                    bArr = C9191p0.f24176f;
                }
                Map<String, List<String>> m8925k = execute.m8710A().m8925k();
                m8051s();
                InterfaceC4540f.C4546f c4546f = new InterfaceC4540f.C4546f(m8695m, execute.m8708H(), m8925k, c4515a, bArr);
                if (m8695m == 416) {
                    c4546f.initCause(new C7455l(0));
                }
                throw c4546f;
            }
            MediaType contentType = responseBody.contentType();
            if (contentType != null) {
                str = contentType.toString();
            } else {
                str = "";
            }
            InterfaceC6379i<String> interfaceC6379i = this.f29756j;
            if (interfaceC6379i != null && !interfaceC6379i.apply(str)) {
                m8051s();
                throw new InterfaceC4540f.C4545e(str, c4515a);
            }
            if (m8695m == 200) {
                long j2 = c4515a.f12263g;
                if (j2 != 0) {
                    j = j2;
                }
            }
            this.f29761o = j;
            long j3 = c4515a.f12264h;
            long j4 = -1;
            if (j3 != -1) {
                this.f29762p = j3;
            } else {
                long contentLength = responseBody.contentLength();
                if (contentLength != -1) {
                    j4 = contentLength - this.f29761o;
                }
                this.f29762p = j4;
            }
            this.f29760n = true;
            m20651r(c4515a);
            return this.f29762p;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null && C9191p0.m16272U0(message).matches("cleartext communication.*not permitted.*")) {
                throw new InterfaceC4540f.C4542b(e, c4515a);
            }
            throw new InterfaceC4540f.C4544d("Unable to connect", e, c4515a, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f29760n) {
            this.f29760n = false;
            m20653p();
            m8051s();
        }
    }

    @Override // p153i8.AbstractC7448f, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        Response response = this.f29758l;
        return response == null ? Collections.emptyMap() : response.m8710A().m8925k();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        Response response = this.f29758l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.m8702V().m8734l().toString());
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        try {
            m8048v();
            return m8049u(bArr, i, i2);
        } catch (IOException e) {
            throw new InterfaceC4540f.C4544d(e, (C4515a) C9149a.m16448e(this.f29757k), 2);
        }
    }

    private C11443a(Call.Factory factory, String str, CacheControl cacheControl, InterfaceC4540f.C4547g c4547g, InterfaceC6379i<String> interfaceC6379i) {
        super(true);
        this.f29751e = (Call.Factory) C9149a.m16448e(factory);
        this.f29753g = str;
        this.f29754h = cacheControl;
        this.f29755i = c4547g;
        this.f29756j = interfaceC6379i;
        this.f29752f = new InterfaceC4540f.C4547g();
    }
}