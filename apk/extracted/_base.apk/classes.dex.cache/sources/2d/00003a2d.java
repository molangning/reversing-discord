package io.sentry.transport;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.C8020m3;
import io.sentry.C8122q2;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: io.sentry.transport.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8188n {

    /* renamed from: e */
    private static final Charset f22116e = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Proxy f22117a;

    /* renamed from: b */
    private final C8122q2 f22118b;

    /* renamed from: c */
    private final C8132r4 f22119c;

    /* renamed from: d */
    private final C8200y f22120d;

    public C8188n(C8132r4 c8132r4, C8122q2 c8122q2, C8200y c8200y) {
        this(c8132r4, c8122q2, C8186l.m18315a(), c8200y);
    }

    /* renamed from: a */
    private void m18312a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            throw th2;
        }
        httpURLConnection.disconnect();
    }

    /* renamed from: b */
    private HttpURLConnection m18311b() {
        HttpURLConnection m18308e = m18308e();
        for (Map.Entry<String, String> entry : this.f22118b.m18465a().entrySet()) {
            m18308e.setRequestProperty(entry.getKey(), entry.getValue());
        }
        m18308e.setRequestMethod("POST");
        m18308e.setDoOutput(true);
        m18308e.setRequestProperty("Content-Encoding", "gzip");
        m18308e.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        m18308e.setRequestProperty("Accept", "application/json");
        m18308e.setRequestProperty("Connection", "close");
        m18308e.setConnectTimeout(this.f22119c.getConnectionTimeoutMillis());
        m18308e.setReadTimeout(this.f22119c.getReadTimeoutMillis());
        HostnameVerifier hostnameVerifier = this.f22119c.getHostnameVerifier();
        boolean z = m18308e instanceof HttpsURLConnection;
        if (z && hostnameVerifier != null) {
            ((HttpsURLConnection) m18308e).setHostnameVerifier(hostnameVerifier);
        }
        SSLSocketFactory sslSocketFactory = this.f22119c.getSslSocketFactory();
        if (z && sslSocketFactory != null) {
            ((HttpsURLConnection) m18308e).setSSLSocketFactory(sslSocketFactory);
        }
        m18308e.connect();
        return m18308e;
    }

    /* renamed from: c */
    private String m18310c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f22116e));
            try {
                StringBuilder sb2 = new StringBuilder();
                boolean z = true;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    if (!z) {
                        sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    }
                    sb2.append(readLine);
                    z = false;
                }
                String sb3 = sb2.toString();
                bufferedReader.close();
                if (errorStream != null) {
                    errorStream.close();
                }
                return sb3;
            } catch (Throwable th2) {
                try {
                    bufferedReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* renamed from: d */
    private boolean m18309d(int i) {
        return i == 200;
    }

    /* renamed from: f */
    private AbstractC8169a0 m18307f(HttpURLConnection httpURLConnection) {
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                m18304i(httpURLConnection, responseCode);
                if (!m18309d(responseCode)) {
                    InterfaceC8040o0 logger = this.f22119c.getLogger();
                    EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                    logger.mo18135c(enumC8021m4, "Request failed, API returned %s", Integer.valueOf(responseCode));
                    if (this.f22119c.isDebug()) {
                        this.f22119c.getLogger().mo18135c(enumC8021m4, m18310c(httpURLConnection), new Object[0]);
                    }
                    return AbstractC8169a0.m18347b(responseCode);
                }
                this.f22119c.getLogger().mo18135c(EnumC8021m4.DEBUG, "Envelope sent successfully.", new Object[0]);
                return AbstractC8169a0.m18346e();
            } catch (IOException e) {
                this.f22119c.getLogger().mo18137a(EnumC8021m4.ERROR, e, "Error reading and logging the response stream", new Object[0]);
                m18312a(httpURLConnection);
                return AbstractC8169a0.m18348a();
            }
        } finally {
            m18312a(httpURLConnection);
        }
    }

    /* renamed from: g */
    private Proxy m18306g(C8132r4.C8137e c8137e) {
        if (c8137e != null) {
            String m18441c = c8137e.m18441c();
            String m18443a = c8137e.m18443a();
            if (m18441c != null && m18443a != null) {
                try {
                    return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(m18443a, Integer.parseInt(m18441c)));
                } catch (NumberFormatException e) {
                    InterfaceC8040o0 logger = this.f22119c.getLogger();
                    EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                    logger.mo18137a(enumC8021m4, e, "Failed to parse Sentry Proxy port: " + c8137e.m18441c() + ". Proxy is ignored", new Object[0]);
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    HttpURLConnection m18308e() {
        URLConnection openConnection;
        if (this.f22117a == null) {
            openConnection = this.f22118b.m18464b().openConnection();
        } else {
            openConnection = this.f22118b.m18464b().openConnection(this.f22117a);
        }
        return (HttpURLConnection) openConnection;
    }

    /* renamed from: h */
    public AbstractC8169a0 m18305h(C8020m3 c8020m3) {
        HttpURLConnection m18311b;
        try {
            OutputStream outputStream = m18311b().getOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                this.f22119c.getSerializer().mo17983b(c8020m3, gZIPOutputStream);
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } finally {
            try {
                return m18307f(m18311b);
            } finally {
            }
        }
        return m18307f(m18311b);
    }

    /* renamed from: i */
    public void m18304i(HttpURLConnection httpURLConnection, int i) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f22120d.m18282k(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i);
    }

    C8188n(C8132r4 c8132r4, C8122q2 c8122q2, C8186l c8186l, C8200y c8200y) {
        this.f22118b = c8122q2;
        this.f22119c = c8132r4;
        this.f22120d = c8200y;
        Proxy m18306g = m18306g(c8132r4.getProxy());
        this.f22117a = m18306g;
        if (m18306g == null || c8132r4.getProxy() == null) {
            return;
        }
        String m18440d = c8132r4.getProxy().m18440d();
        String m18442b = c8132r4.getProxy().m18442b();
        if (m18440d == null || m18442b == null) {
            return;
        }
        c8186l.m18314b(new C8195u(m18440d, m18442b));
    }
}