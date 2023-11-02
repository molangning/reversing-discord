package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import kotlin.text.C9654p;
import okio.BufferedSource;
import p031bk.C2370k;
import p122gk.C6835i;
import p122gk.C6840m;
import p467zf.C14180c;
import si.C12552o;
import sj.C12562c;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u001a"}, m14357d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "", "domain", "", "f", "domainLabels", "b", "", "e", "d", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "listRead", "Ljava/util/concurrent/CountDownLatch;", "Ljava/util/concurrent/CountDownLatch;", "readCompleteLatch", "", "[B", "publicSuffixListBytes", "publicSuffixExceptionListBytes", "<init>", "()V", "h", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class PublicSuffixDatabase {

    /* renamed from: f */
    private static final List<String> f29463f;

    /* renamed from: g */
    private static final PublicSuffixDatabase f29464g;

    /* renamed from: a */
    private final AtomicBoolean f29466a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f29467b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f29468c;

    /* renamed from: d */
    private byte[] f29469d;

    /* renamed from: h */
    public static final C11210a f29465h = new C11210a(null);

    /* renamed from: e */
    private static final byte[] f29462e = {(byte) 42};

    @Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m14357d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$a;", "", "", "", "labels", "", "labelIndex", "", "b", "([B[[BI)Ljava/lang/String;", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "c", "", "EXCEPTION_MARKER", "C", "", "PREVAILING_RULE", "Ljava/util/List;", "PUBLIC_SUFFIX_RESOURCE", "Ljava/lang/String;", "WILDCARD_LABEL", "[B", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "<init>", "()V", "okhttp"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: okhttp3.internal.publicsuffix.PublicSuffixDatabase$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C11210a {
        private C11210a() {
        }

        public /* synthetic */ C11210a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final String m8651b(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int m4809b;
            int m4809b2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != ((byte) 10)) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == ((byte) 10)) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        m4809b = 46;
                        z = false;
                    } else {
                        z = z2;
                        m4809b = C12562c.m4809b(bArr2[i8][i9], 255);
                    }
                    m4809b2 = m4809b - C12562c.m4809b(bArr[i5 + i10], 255);
                    if (m4809b2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    } else if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        i9 = -1;
                        z2 = true;
                    } else {
                        z2 = z;
                    }
                }
                if (m4809b2 >= 0) {
                    if (m4809b2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                C9612q.m13918g(UTF_8, "UTF_8");
                                return new String(bArr, i5, i7, UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        /* renamed from: c */
        public final PublicSuffixDatabase m8650c() {
            return PublicSuffixDatabase.f29464g;
        }
    }

    static {
        List<String> m14109d;
        m14109d = C9544i.m14109d("*");
        f29463f = m14109d;
        f29464g = new PublicSuffixDatabase();
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e5, code lost:
        r4 = kotlin.text.C9654p.m13683y0(r8, new char[]{'.'}, false, 0, 6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x00fc, code lost:
        r1 = kotlin.text.C9654p.m13683y0(r5, new char[]{'.'}, false, 0, 6, null);
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<java.lang.String> m8657b(java.util.List<java.lang.String> r18) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m8657b(java.util.List):java.util.List");
    }

    /* renamed from: d */
    private final void m8655d() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            BufferedSource m21829d = C6840m.m21829d(new C6835i(C6840m.m21821l(resourceAsStream)));
            try {
                byte[] mo8595W = m21829d.mo8595W(m21829d.readInt());
                byte[] mo8595W2 = m21829d.mo8595W(m21829d.readInt());
                Unit unit = Unit.f25302a;
                C14180c.m514a(m21829d, null);
                synchronized (this) {
                    C9612q.m13920e(mo8595W);
                    this.f29468c = mo8595W;
                    C9612q.m13920e(mo8595W2);
                    this.f29469d = mo8595W2;
                }
                this.f29467b.countDown();
            } finally {
            }
        }
    }

    /* renamed from: e */
    private final void m8654e() {
        boolean z = false;
        while (true) {
            try {
                try {
                    m8655d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    C2370k.f6491c.m33588g().m33600k("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: f */
    private final List<String> m8653f(String str) {
        List<String> m13683y0;
        Object m14044f0;
        List<String> m14061O;
        m13683y0 = C9654p.m13683y0(str, new char[]{'.'}, false, 0, 6, null);
        m14044f0 = C9553r.m14044f0(m13683y0);
        if (C9612q.m13922c((String) m14044f0, "")) {
            m14061O = C9553r.m14061O(m13683y0, 1);
            return m14061O;
        }
        return m13683y0;
    }

    /* renamed from: c */
    public final String m8656c(String domain) {
        int size;
        int size2;
        Sequence m14066K;
        Sequence m4861o;
        String m4853w;
        C9612q.m13917h(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        C9612q.m13918g(unicodeDomain, "unicodeDomain");
        List<String> m8653f = m8653f(unicodeDomain);
        List<String> m8657b = m8657b(m8653f);
        if (m8653f.size() == m8657b.size() && m8657b.get(0).charAt(0) != '!') {
            return null;
        }
        if (m8657b.get(0).charAt(0) == '!') {
            size = m8653f.size();
            size2 = m8657b.size();
        } else {
            size = m8653f.size();
            size2 = m8657b.size() + 1;
        }
        m14066K = C9553r.m14066K(m8653f(domain));
        m4861o = C12552o.m4861o(m14066K, size - size2);
        m4853w = C12552o.m4853w(m4861o, ".", null, null, 0, null, null, 62, null);
        return m4853w;
    }
}