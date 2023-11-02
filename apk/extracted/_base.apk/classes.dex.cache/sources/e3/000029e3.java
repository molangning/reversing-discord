package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p102fb.InterfaceC6379i;
import p153i8.AbstractC7448f;
import p153i8.C7455l;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p195k8.C9191p0;
import p195k8.C9197r;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultHttpDataSource extends AbstractC7448f implements InterfaceC4540f {

    /* renamed from: v */
    private static final Pattern f12225v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    private final boolean f12226e;

    /* renamed from: f */
    private final int f12227f;

    /* renamed from: g */
    private final int f12228g;

    /* renamed from: h */
    private final String f12229h;

    /* renamed from: i */
    private final InterfaceC4540f.C4547g f12230i;

    /* renamed from: j */
    private final InterfaceC4540f.C4547g f12231j;

    /* renamed from: k */
    private InterfaceC6379i<String> f12232k;

    /* renamed from: l */
    private C4515a f12233l;

    /* renamed from: m */
    private HttpURLConnection f12234m;

    /* renamed from: n */
    private InputStream f12235n;

    /* renamed from: o */
    private byte[] f12236o;

    /* renamed from: p */
    private boolean f12237p;

    /* renamed from: q */
    private int f12238q;

    /* renamed from: r */
    private long f12239r;

    /* renamed from: s */
    private long f12240s;

    /* renamed from: t */
    private long f12241t;

    /* renamed from: u */
    private long f12242u;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Factory implements InterfaceC4540f.InterfaceC4543c {

        /* renamed from: b */
        private InterfaceC7472x f12244b;

        /* renamed from: c */
        private InterfaceC6379i<String> f12245c;

        /* renamed from: d */
        private String f12246d;

        /* renamed from: g */
        private boolean f12249g;

        /* renamed from: a */
        private final InterfaceC4540f.C4547g f12243a = new InterfaceC4540f.C4547g();

        /* renamed from: e */
        private int f12247e = 8000;

        /* renamed from: f */
        private int f12248f = 8000;

        @Override // com.google.android.exoplayer2.upstream.InterfaceC4540f.InterfaceC4543c, com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.f12246d, this.f12247e, this.f12248f, this.f12249g, this.f12243a, this.f12245c);
            InterfaceC7472x interfaceC7472x = this.f12244b;
            if (interfaceC7472x != null) {
                defaultHttpDataSource.mo6320f(interfaceC7472x);
            }
            return defaultHttpDataSource;
        }

        /* renamed from: b */
        public Factory m28772b(String str) {
            this.f12246d = str;
            return this;
        }
    }

    /* renamed from: B */
    private int m28783B(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12240s;
        if (j != -1) {
            long j2 = j - this.f12242u;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) C9191p0.m16243j(this.f12235n)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f12240s == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.f12242u += read;
        m20654o(read);
        return read;
    }

    /* renamed from: C */
    private void m28782C() {
        if (this.f12241t == this.f12239r) {
            return;
        }
        if (this.f12236o == null) {
            this.f12236o = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        }
        while (true) {
            long j = this.f12241t;
            long j2 = this.f12239r;
            if (j != j2) {
                int read = ((InputStream) C9191p0.m16243j(this.f12235n)).read(this.f12236o, 0, (int) Math.min(j2 - j, this.f12236o.length));
                if (!Thread.currentThread().isInterrupted()) {
                    if (read != -1) {
                        this.f12241t += read;
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

    /* renamed from: t */
    private void m28780t() {
        HttpURLConnection httpURLConnection = this.f12234m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C9197r.m16182d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f12234m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m28779u(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L2c
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L2e
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p195k8.C9197r.m16183c(r3, r1)
        L2c:
            r4 = -1
        L2e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Lb0
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.DefaultHttpDataSource.f12225v
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto Lb0
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.Object r6 = p195k8.C9149a.m16448e(r6)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.NumberFormatException -> L99
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L99
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.Object r1 = p195k8.C9149a.m16448e(r1)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L99
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L99
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L70
            r4 = r6
            goto Lb0
        L70:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto Lb0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L99
            r1.<init>()     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> L99
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> L99
            java.lang.String r0 = r1.toString()     // Catch: java.lang.NumberFormatException -> L99
            p195k8.C9197r.m16178h(r3, r0)     // Catch: java.lang.NumberFormatException -> L99
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L99
            r4 = r0
            goto Lb0
        L99:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            p195k8.C9197r.m16183c(r3, r10)
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.m28779u(java.net.HttpURLConnection):long");
    }

    /* renamed from: v */
    private static URL m28778v(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
            }
            return url2;
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: w */
    private static boolean m28777w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: x */
    private HttpURLConnection m28776x(C4515a c4515a) {
        HttpURLConnection m28775y;
        C4515a c4515a2 = c4515a;
        URL url = new URL(c4515a2.f12257a.toString());
        int i = c4515a2.f12259c;
        byte[] bArr = c4515a2.f12260d;
        long j = c4515a2.f12263g;
        long j2 = c4515a2.f12264h;
        int i2 = 1;
        boolean m28768d = c4515a2.m28768d(1);
        if (!this.f12226e) {
            return m28775y(url, i, bArr, j, j2, m28768d, true, c4515a2.f12261e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                byte[] bArr2 = bArr;
                int i5 = i2;
                long j3 = j2;
                long j4 = j;
                m28775y = m28775y(url, i, bArr, j, j2, m28768d, false, c4515a2.f12261e);
                int responseCode = m28775y.getResponseCode();
                String headerField = m28775y.getHeaderField("Location");
                if ((i != i5 && i != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    m28775y.disconnect();
                    url = m28778v(url, headerField);
                    bArr2 = null;
                    i = i5;
                } else {
                    m28775y.disconnect();
                    url = m28778v(url, headerField);
                }
                i3 = i4;
                i2 = i5;
                bArr = bArr2;
                j2 = j3;
                j = j4;
                c4515a2 = c4515a;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i4);
            }
        }
        return m28775y;
    }

    /* renamed from: y */
    private HttpURLConnection m28775y(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) {
        String str;
        boolean z3;
        HttpURLConnection m28784A = m28784A(url);
        m28784A.setConnectTimeout(this.f12227f);
        m28784A.setReadTimeout(this.f12228g);
        HashMap hashMap = new HashMap();
        InterfaceC4540f.C4547g c4547g = this.f12230i;
        if (c4547g != null) {
            hashMap.putAll(c4547g.m28633a());
        }
        hashMap.putAll(this.f12231j.m28633a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m28784A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str2 = "bytes=" + j + "-";
            if (j2 != -1) {
                str2 = str2 + ((j + j2) - 1);
            }
            m28784A.setRequestProperty("Range", str2);
        }
        String str3 = this.f12229h;
        if (str3 != null) {
            m28784A.setRequestProperty("User-Agent", str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY;
        }
        m28784A.setRequestProperty("Accept-Encoding", str);
        m28784A.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m28784A.setDoOutput(z3);
        m28784A.setRequestMethod(C4515a.m28769c(i));
        if (bArr != null) {
            m28784A.setFixedLengthStreamingMode(bArr.length);
            m28784A.connect();
            OutputStream outputStream = m28784A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m28784A.connect();
        }
        return m28784A;
    }

    /* renamed from: z */
    private static void m28774z(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C9191p0.f24171a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C9149a.m16448e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: A */
    HttpURLConnection m28784A(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo6322b(C4515a c4515a) {
        byte[] bArr;
        this.f12233l = c4515a;
        long j = 0;
        this.f12242u = 0L;
        this.f12241t = 0L;
        m20652q(c4515a);
        try {
            HttpURLConnection m28776x = m28776x(c4515a);
            this.f12234m = m28776x;
            try {
                this.f12238q = m28776x.getResponseCode();
                String responseMessage = m28776x.getResponseMessage();
                int i = this.f12238q;
                if (i >= 200 && i <= 299) {
                    String contentType = m28776x.getContentType();
                    InterfaceC6379i<String> interfaceC6379i = this.f12232k;
                    if (interfaceC6379i != null && !interfaceC6379i.apply(contentType)) {
                        m28780t();
                        throw new InterfaceC4540f.C4545e(contentType, c4515a);
                    }
                    if (this.f12238q == 200) {
                        long j2 = c4515a.f12263g;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f12239r = j;
                    boolean m28777w = m28777w(m28776x);
                    if (!m28777w) {
                        long j3 = c4515a.f12264h;
                        long j4 = -1;
                        if (j3 != -1) {
                            this.f12240s = j3;
                        } else {
                            long m28779u = m28779u(m28776x);
                            if (m28779u != -1) {
                                j4 = m28779u - this.f12239r;
                            }
                            this.f12240s = j4;
                        }
                    } else {
                        this.f12240s = c4515a.f12264h;
                    }
                    try {
                        this.f12235n = m28776x.getInputStream();
                        if (m28777w) {
                            this.f12235n = new GZIPInputStream(this.f12235n);
                        }
                        this.f12237p = true;
                        m20651r(c4515a);
                        return this.f12240s;
                    } catch (IOException e) {
                        m28780t();
                        throw new InterfaceC4540f.C4544d(e, c4515a, 1);
                    }
                }
                Map<String, List<String>> headerFields = m28776x.getHeaderFields();
                InputStream errorStream = m28776x.getErrorStream();
                try {
                    if (errorStream != null) {
                        bArr = C9191p0.m16276S0(errorStream);
                    } else {
                        bArr = C9191p0.f24176f;
                    }
                } catch (IOException unused) {
                    bArr = C9191p0.f24176f;
                }
                byte[] bArr2 = bArr;
                m28780t();
                InterfaceC4540f.C4546f c4546f = new InterfaceC4540f.C4546f(this.f12238q, responseMessage, headerFields, c4515a, bArr2);
                if (this.f12238q == 416) {
                    c4546f.initCause(new C7455l(0));
                }
                throw c4546f;
            } catch (IOException e2) {
                m28780t();
                throw new InterfaceC4540f.C4544d("Unable to connect", e2, c4515a, 1);
            }
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (message != null && C9191p0.m16272U0(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new InterfaceC4540f.C4542b(e3, c4515a);
            }
            throw new InterfaceC4540f.C4544d("Unable to connect", e3, c4515a, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            InputStream inputStream = this.f12235n;
            if (inputStream != null) {
                m28774z(this.f12234m, m28781s());
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new InterfaceC4540f.C4544d(e, (C4515a) C9191p0.m16243j(this.f12233l), 3);
                }
            }
        } finally {
            this.f12235n = null;
            m28780t();
            if (this.f12237p) {
                this.f12237p = false;
                m20653p();
            }
        }
    }

    @Override // p153i8.AbstractC7448f, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: d */
    public Map<String, List<String>> mo6321d() {
        HttpURLConnection httpURLConnection = this.f12234m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo6319m() {
        HttpURLConnection httpURLConnection = this.f12234m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p153i8.InterfaceC7451h
    public int read(byte[] bArr, int i, int i2) {
        try {
            m28782C();
            return m28783B(bArr, i, i2);
        } catch (IOException e) {
            throw new InterfaceC4540f.C4544d(e, (C4515a) C9191p0.m16243j(this.f12233l), 2);
        }
    }

    /* renamed from: s */
    protected final long m28781s() {
        long j = this.f12240s;
        return j == -1 ? j : j - this.f12242u;
    }

    private DefaultHttpDataSource(String str, int i, int i2, boolean z, InterfaceC4540f.C4547g c4547g, InterfaceC6379i<String> interfaceC6379i) {
        super(true);
        this.f12229h = str;
        this.f12227f = i;
        this.f12228g = i2;
        this.f12226e = z;
        this.f12230i = c4547g;
        this.f12232k = interfaceC6379i;
        this.f12231j = new InterfaceC4540f.C4547g();
    }
}