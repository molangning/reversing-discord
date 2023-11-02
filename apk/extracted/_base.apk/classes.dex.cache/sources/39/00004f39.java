package p380v4;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.C3874a;
import com.facebook.imageutils.C3876b;
import com.facebook.imageutils.C3877c;
import com.facebook.imageutils.C3882f;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p170j4.C8792b;
import p170j4.C8793c;
import p170j4.C8795d;
import p394w2.C13379j;
import p455z2.C14081i;
import p455z2.InterfaceC14078g;

/* renamed from: v4.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13065e implements Closeable {

    /* renamed from: v */
    private static boolean f33850v;

    /* renamed from: j */
    private final CloseableReference<InterfaceC14078g> f33851j;

    /* renamed from: k */
    private final Supplier<FileInputStream> f33852k;

    /* renamed from: l */
    private C8793c f33853l;

    /* renamed from: m */
    private int f33854m;

    /* renamed from: n */
    private int f33855n;

    /* renamed from: o */
    private int f33856o;

    /* renamed from: p */
    private int f33857p;

    /* renamed from: q */
    private int f33858q;

    /* renamed from: r */
    private int f33859r;

    /* renamed from: s */
    private BytesRange f33860s;

    /* renamed from: t */
    private ColorSpace f33861t;

    /* renamed from: u */
    private boolean f33862u;

    public C13065e(CloseableReference<InterfaceC14078g> closeableReference) {
        this.f33853l = C8793c.f23093c;
        this.f33854m = -1;
        this.f33855n = 0;
        this.f33856o = -1;
        this.f33857p = -1;
        this.f33858q = 1;
        this.f33859r = -1;
        C13379j.m2682b(Boolean.valueOf(CloseableReference.m31727Q(closeableReference)));
        this.f33851j = closeableReference.clone();
        this.f33852k = null;
    }

    /* renamed from: A0 */
    private C3876b m3357A0() {
        InputStream inputStream;
        try {
            inputStream = m3354D();
            try {
                C3876b m30555b = C3874a.m30555b(inputStream);
                this.f33861t = m30555b.m30551a();
                Pair<Integer, Integer> m30550b = m30555b.m30550b();
                if (m30550b != null) {
                    this.f33856o = ((Integer) m30550b.first).intValue();
                    this.f33857p = ((Integer) m30550b.second).intValue();
                }
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return m30555b;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    /* renamed from: B0 */
    private Pair<Integer, Integer> m3356B0() {
        Pair<Integer, Integer> m30532g = C3882f.m30532g(m3354D());
        if (m30532g != null) {
            this.f33856o = ((Integer) m30532g.first).intValue();
            this.f33857p = ((Integer) m30532g.second).intValue();
        }
        return m30532g;
    }

    /* renamed from: V */
    private void m3341V() {
        Pair<Integer, Integer> m30550b;
        C8793c m17228c = C8795d.m17228c(m3354D());
        this.f33853l = m17228c;
        if (C8792b.m17234b(m17228c)) {
            m30550b = m3356B0();
        } else {
            m30550b = m3357A0().m30550b();
        }
        if (m17228c == C8792b.f23081a && this.f33854m == -1) {
            if (m30550b != null) {
                int m30548b = C3877c.m30548b(m3354D());
                this.f33855n = m30548b;
                this.f33854m = C3877c.m30549a(m30548b);
            }
        } else if (m17228c == C8792b.f23091k && this.f33854m == -1) {
            int m30558a = HeifExifUtil.m30558a(m3354D());
            this.f33855n = m30558a;
            this.f33854m = C3877c.m30549a(m30558a);
        } else if (this.f33854m == -1) {
            this.f33854m = 0;
        }
    }

    /* renamed from: b0 */
    public static boolean m3338b0(C13065e c13065e) {
        return c13065e.f33854m >= 0 && c13065e.f33856o >= 0 && c13065e.f33857p >= 0;
    }

    /* renamed from: h */
    public static C13065e m3336h(C13065e c13065e) {
        if (c13065e != null) {
            return c13065e.m3339a();
        }
        return null;
    }

    /* renamed from: i */
    public static void m3335i(C13065e c13065e) {
        if (c13065e != null) {
            c13065e.close();
        }
    }

    /* renamed from: j0 */
    public static boolean m3333j0(C13065e c13065e) {
        return c13065e != null && c13065e.m3337e0();
    }

    /* renamed from: w0 */
    private void m3325w0() {
        if (this.f33856o < 0 || this.f33857p < 0) {
            m3327t0();
        }
    }

    /* renamed from: A */
    public C8793c m3358A() {
        m3325w0();
        return this.f33853l;
    }

    /* renamed from: C0 */
    public void m3355C0(BytesRange bytesRange) {
        this.f33860s = bytesRange;
    }

    /* renamed from: D */
    public InputStream m3354D() {
        Supplier<FileInputStream> supplier = this.f33852k;
        if (supplier != null) {
            return supplier.get();
        }
        CloseableReference m31717s = CloseableReference.m31717s(this.f33851j);
        if (m31717s != null) {
            try {
                return new C14081i((InterfaceC14078g) m31717s.m31730D());
            } finally {
                CloseableReference.m31715v(m31717s);
            }
        }
        return null;
    }

    /* renamed from: D0 */
    public void m3353D0(int i) {
        this.f33855n = i;
    }

    /* renamed from: E0 */
    public void m3352E0(int i) {
        this.f33857p = i;
    }

    /* renamed from: F0 */
    public void m3351F0(C8793c c8793c) {
        this.f33853l = c8793c;
    }

    /* renamed from: G0 */
    public void m3350G0(int i) {
        this.f33854m = i;
    }

    /* renamed from: H */
    public InputStream m3349H() {
        return (InputStream) C13379j.m2677g(m3354D());
    }

    /* renamed from: H0 */
    public void m3348H0(int i) {
        this.f33858q = i;
    }

    /* renamed from: I */
    public int m3347I() {
        m3325w0();
        return this.f33854m;
    }

    /* renamed from: I0 */
    public void m3346I0(int i) {
        this.f33856o = i;
    }

    /* renamed from: Q */
    public int m3345Q() {
        return this.f33858q;
    }

    /* renamed from: R */
    public int m3344R() {
        CloseableReference<InterfaceC14078g> closeableReference = this.f33851j;
        if (closeableReference != null && closeableReference.m31730D() != null) {
            return this.f33851j.m31730D().size();
        }
        return this.f33859r;
    }

    /* renamed from: S */
    public int m3343S() {
        m3325w0();
        return this.f33856o;
    }

    /* renamed from: U */
    protected boolean m3342U() {
        return this.f33862u;
    }

    /* renamed from: Y */
    public boolean m3340Y(int i) {
        C8793c c8793c = this.f33853l;
        if ((c8793c != C8792b.f23081a && c8793c != C8792b.f23092l) || this.f33852k != null) {
            return true;
        }
        C13379j.m2677g(this.f33851j);
        InterfaceC14078g m31730D = this.f33851j.m31730D();
        if (m31730D.mo723k(i - 2) == -1 && m31730D.mo723k(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C13065e m3339a() {
        C13065e c13065e;
        Supplier<FileInputStream> supplier = this.f33852k;
        if (supplier != null) {
            c13065e = new C13065e(supplier, this.f33859r);
        } else {
            CloseableReference m31717s = CloseableReference.m31717s(this.f33851j);
            if (m31717s == null) {
                c13065e = null;
            } else {
                try {
                    c13065e = new C13065e(m31717s);
                } finally {
                    CloseableReference.m31715v(m31717s);
                }
            }
        }
        if (c13065e != null) {
            c13065e.m3334j(this);
        }
        return c13065e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.m31715v(this.f33851j);
    }

    /* renamed from: e0 */
    public synchronized boolean m3337e0() {
        boolean z;
        if (!CloseableReference.m31727Q(this.f33851j)) {
            if (this.f33852k == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    /* renamed from: j */
    public void m3334j(C13065e c13065e) {
        this.f33853l = c13065e.m3358A();
        this.f33856o = c13065e.m3343S();
        this.f33857p = c13065e.m3326v();
        this.f33854m = c13065e.m3347I();
        this.f33855n = c13065e.m3329s();
        this.f33858q = c13065e.m3345Q();
        this.f33859r = c13065e.m3344R();
        this.f33860s = c13065e.m3331o();
        this.f33861t = c13065e.m3330q();
        this.f33862u = c13065e.m3342U();
    }

    /* renamed from: m */
    public CloseableReference<InterfaceC14078g> m3332m() {
        return CloseableReference.m31717s(this.f33851j);
    }

    /* renamed from: o */
    public BytesRange m3331o() {
        return this.f33860s;
    }

    /* renamed from: q */
    public ColorSpace m3330q() {
        m3325w0();
        return this.f33861t;
    }

    /* renamed from: s */
    public int m3329s() {
        m3325w0();
        return this.f33855n;
    }

    /* renamed from: t */
    public String m3328t(int i) {
        CloseableReference<InterfaceC14078g> m3332m = m3332m();
        if (m3332m == null) {
            return "";
        }
        int min = Math.min(m3344R(), i);
        byte[] bArr = new byte[min];
        try {
            InterfaceC14078g m31730D = m3332m.m31730D();
            if (m31730D == null) {
                return "";
            }
            m31730D.mo725e(0, bArr, 0, min);
            m3332m.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb2.toString();
        } finally {
            m3332m.close();
        }
    }

    /* renamed from: t0 */
    public void m3327t0() {
        if (!f33850v) {
            m3341V();
        } else if (this.f33862u) {
        } else {
            m3341V();
            this.f33862u = true;
        }
    }

    /* renamed from: v */
    public int m3326v() {
        m3325w0();
        return this.f33857p;
    }

    public C13065e(Supplier<FileInputStream> supplier) {
        this.f33853l = C8793c.f23093c;
        this.f33854m = -1;
        this.f33855n = 0;
        this.f33856o = -1;
        this.f33857p = -1;
        this.f33858q = 1;
        this.f33859r = -1;
        C13379j.m2677g(supplier);
        this.f33851j = null;
        this.f33852k = supplier;
    }

    public C13065e(Supplier<FileInputStream> supplier, int i) {
        this(supplier);
        this.f33859r = i;
    }
}