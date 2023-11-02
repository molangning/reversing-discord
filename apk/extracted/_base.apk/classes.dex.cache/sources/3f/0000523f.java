package p431xj;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.text.C9653o;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okio.Buffer;
import okio.ByteString;
import p031bk.C2370k;
import p328rj.C12289f;
import sj.C12562c;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\"\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001a\"\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001d"}, m14357d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lrj/f;", "a", "Lokio/Buffer;", "", "result", "", "c", "", "g", "", "prefix", "h", "d", "e", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "f", "Lokhttp3/Response;", "b", "Lokio/ByteString;", "Lokio/ByteString;", "QUOTED_STRING_DELIMITERS", "TOKEN_DELIMITERS", "okhttp"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: xj.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C13838e {

    /* renamed from: a */
    private static final ByteString f35628a;

    /* renamed from: b */
    private static final ByteString f35629b;

    static {
        ByteString.C11214a c11214a = ByteString.f29482n;
        f35628a = c11214a.m8547d("\"\\");
        f35629b = c11214a.m8547d("\t ,=");
    }

    /* renamed from: a */
    public static final List<C12289f> m1436a(Headers parseChallenges, String headerName) {
        boolean m13754t;
        C9612q.m13917h(parseChallenges, "$this$parseChallenges");
        C9612q.m13917h(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i = 0; i < size; i++) {
            m13754t = C9653o.m13754t(headerName, parseChallenges.m8928e(i), true);
            if (m13754t) {
                try {
                    m1434c(new Buffer().mo8608K(parseChallenges.m8924o(i)), arrayList);
                } catch (EOFException e) {
                    C2370k.f6491c.m33588g().m33600k("Unable to parse challenge", 5, e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m1435b(Response promisesBody) {
        boolean m13754t;
        C9612q.m13917h(promisesBody, "$this$promisesBody");
        if (C9612q.m13922c(promisesBody.m8702V().m8738h(), "HEAD")) {
            return false;
        }
        int m8695m = promisesBody.m8695m();
        if (((m8695m >= 100 && m8695m < 200) || m8695m == 204 || m8695m == 304) && C12562c.m4792s(promisesBody) == -1) {
            m13754t = C9653o.m13754t("chunked", Response.m8690v(promisesBody, "Transfer-Encoding", null, 2, null), true);
            if (!m13754t) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0085, code lost:
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m1434c(okio.Buffer r7, java.util.List<p328rj.C12289f> r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m1430g(r7)
            java.lang.String r1 = m1432e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m1430g(r7)
            java.lang.String r3 = m1432e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.mo8589g0()
            if (r7 != 0) goto L1f
            return
        L1f:
            rj.f r7 = new rj.f
            java.util.Map r0 = p304qf.C11886s.m6771h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = sj.C12562c.m4827I(r7, r4)
            boolean r6 = m1430g(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.mo8589g0()
            if (r2 == 0) goto L68
        L41:
            rj.f r2 = new rj.f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.C9642f.m13785z(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.C9612q.m13918g(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = sj.C12562c.m4827I(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = m1432e(r7)
            boolean r5 = m1430g(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = sj.C12562c.m4827I(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            rj.f r4 = new rj.f
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = m1430g(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = m1429h(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = m1433d(r7)
            goto Lad
        La9:
            java.lang.String r6 = m1432e(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = m1430g(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.mo8589g0()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p431xj.C13838e.m1434c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    private static final String m1433d(Buffer buffer) {
        boolean z;
        byte b = (byte) 34;
        if (buffer.readByte() == b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Buffer buffer2 = new Buffer();
            while (true) {
                long mo8599B = buffer.mo8599B(f35628a);
                if (mo8599B == -1) {
                    return null;
                }
                if (buffer.m8645D(mo8599B) == b) {
                    buffer2.mo46L(buffer, mo8599B);
                    buffer.readByte();
                    return buffer2.mo8584p0();
                } else if (buffer.size() == mo8599B + 1) {
                    return null;
                } else {
                    buffer2.mo46L(buffer, mo8599B);
                    buffer.readByte();
                    buffer2.mo46L(buffer, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: e */
    private static final String m1432e(Buffer buffer) {
        long mo8599B = buffer.mo8599B(f35629b);
        if (mo8599B == -1) {
            mo8599B = buffer.size();
        }
        if (mo8599B != 0) {
            return buffer.m8620j0(mo8599B);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m1431f(CookieJar receiveHeaders, HttpUrl url, Headers headers) {
        C9612q.m13917h(receiveHeaders, "$this$receiveHeaders");
        C9612q.m13917h(url, "url");
        C9612q.m13917h(headers, "headers");
        if (receiveHeaders == CookieJar.f29286a) {
            return;
        }
        List<Cookie> m8948e = Cookie.f29267n.m8948e(url, headers);
        if (m8948e.isEmpty()) {
            return;
        }
        receiveHeaders.saveFromResponse(url, m8948e);
    }

    /* renamed from: g */
    private static final boolean m1430g(Buffer buffer) {
        boolean z = false;
        while (!buffer.mo8589g0()) {
            byte m8645D = buffer.m8645D(0L);
            if (m8645D != 9 && m8645D != 32) {
                if (m8645D != 44) {
                    break;
                }
                buffer.readByte();
                z = true;
            } else {
                buffer.readByte();
            }
        }
        return z;
    }

    /* renamed from: h */
    private static final boolean m1429h(Buffer buffer, byte b) {
        return !buffer.mo8589g0() && buffer.m8645D(0L) == b;
    }
}