package p061d8;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.List;
import p102fb.C6374d;
import p195k8.C9191p0;
import p195k8.C9197r;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13127b;
import p383v7.C13135h;
import p383v7.InterfaceC13133f;

/* renamed from: d8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5781a extends AbstractC13131d {

    /* renamed from: o */
    private final C9208y f16601o;

    /* renamed from: p */
    private final boolean f16602p;

    /* renamed from: q */
    private final int f16603q;

    /* renamed from: r */
    private final int f16604r;

    /* renamed from: s */
    private final String f16605s;

    /* renamed from: t */
    private final float f16606t;

    /* renamed from: u */
    private final int f16607u;

    public C5781a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f16601o = new C9208y();
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f16603q = bArr[24];
            this.f16604r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f16605s = "Serif".equals(C9191p0.m16303F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.f16607u = i;
            boolean z = (bArr[0] & 32) != 0;
            this.f16602p = z;
            if (z) {
                this.f16606t = C9191p0.m16229q(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
                return;
            } else {
                this.f16606t = 0.85f;
                return;
            }
        }
        this.f16603q = 0;
        this.f16604r = -1;
        this.f16605s = "sans-serif";
        this.f16602p = false;
        this.f16606t = 0.85f;
        this.f16607u = -1;
    }

    /* renamed from: B */
    private void m24516B(C9208y c9208y, SpannableStringBuilder spannableStringBuilder) {
        boolean z;
        if (c9208y.m16097a() >= 12) {
            z = true;
        } else {
            z = false;
        }
        m24515C(z);
        int m16105J = c9208y.m16105J();
        int m16105J2 = c9208y.m16105J();
        c9208y.m16098Q(2);
        int m16111D = c9208y.m16111D();
        c9208y.m16098Q(1);
        int m16084n = c9208y.m16084n();
        if (m16105J2 > spannableStringBuilder.length()) {
            C9197r.m16178h("Tx3gDecoder", "Truncating styl end (" + m16105J2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            m16105J2 = spannableStringBuilder.length();
        }
        if (m16105J >= m16105J2) {
            C9197r.m16178h("Tx3gDecoder", "Ignoring styl with start (" + m16105J + ") >= end (" + m16105J2 + ").");
            return;
        }
        int i = m16105J2;
        m24513E(spannableStringBuilder, m16111D, this.f16603q, m16105J, i, 0);
        m24514D(spannableStringBuilder, m16084n, this.f16604r, m16105J, i, 0);
    }

    /* renamed from: C */
    private static void m24515C(boolean z) {
        if (!z) {
            throw new C13135h("Unexpected subtitle format.");
        }
    }

    /* renamed from: D */
    private static void m24514D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* renamed from: E */
    private static void m24513E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z3 = true;
            if ((i & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            if ((i & 4) == 0) {
                z3 = false;
            }
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (!z3 && !z && !z2) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* renamed from: F */
    private static void m24512F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* renamed from: G */
    private static String m24511G(C9208y c9208y) {
        boolean z;
        char m16091g;
        if (c9208y.m16097a() >= 2) {
            z = true;
        } else {
            z = false;
        }
        m24515C(z);
        int m16105J = c9208y.m16105J();
        if (m16105J == 0) {
            return "";
        }
        if (c9208y.m16097a() >= 2 && ((m16091g = c9208y.m16091g()) == 65279 || m16091g == 65534)) {
            return c9208y.m16113B(m16105J, C6374d.f18026f);
        }
        return c9208y.m16113B(m16105J, C6374d.f18023c);
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        this.f16601o.m16101N(bArr, i);
        String m24511G = m24511G(this.f16601o);
        if (m24511G.isEmpty()) {
            return C5782b.f16608k;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(m24511G);
        m24513E(spannableStringBuilder, this.f16603q, 0, 0, spannableStringBuilder.length(), 16711680);
        m24514D(spannableStringBuilder, this.f16604r, -1, 0, spannableStringBuilder.length(), 16711680);
        m24512F(spannableStringBuilder, this.f16605s, 0, spannableStringBuilder.length());
        float f = this.f16606t;
        while (this.f16601o.m16097a() >= 8) {
            int m16093e = this.f16601o.m16093e();
            int m16084n = this.f16601o.m16084n();
            int m16084n2 = this.f16601o.m16084n();
            boolean z2 = true;
            if (m16084n2 == 1937013100) {
                if (this.f16601o.m16097a() < 2) {
                    z2 = false;
                }
                m24515C(z2);
                int m16105J = this.f16601o.m16105J();
                for (int i2 = 0; i2 < m16105J; i2++) {
                    m24516B(this.f16601o, spannableStringBuilder);
                }
            } else if (m16084n2 == 1952608120 && this.f16602p) {
                if (this.f16601o.m16097a() < 2) {
                    z2 = false;
                }
                m24515C(z2);
                f = C9191p0.m16229q(this.f16601o.m16105J() / this.f16607u, 0.0f, 0.95f);
            }
            this.f16601o.m16099P(m16093e + m16084n);
        }
        return new C5782b(new C13127b.C13129b().m3142n(spannableStringBuilder).m3148h(f, 0).m3147i(0).m3155a());
    }
}
