package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.core.text.C1123t;
import androidx.core.text.InterfaceC1122s;
import androidx.core.util.C1138f;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import com.google.android.material.internal.C4902j;
import p176ja.C8878a;
import p411x.C13657a;
import p443ya.C13954a;
import p443ya.C13958d;
import p443ya.C13965i;
import pa.C11487a;

/* renamed from: com.google.android.material.internal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4890b {

    /* renamed from: t0 */
    private static final boolean f13663t0 = false;

    /* renamed from: u0 */
    private static final Paint f13664u0 = null;

    /* renamed from: A */
    private Typeface f13665A;

    /* renamed from: B */
    private Typeface f13666B;

    /* renamed from: C */
    private Typeface f13667C;

    /* renamed from: D */
    private Typeface f13668D;

    /* renamed from: E */
    private C13954a f13669E;

    /* renamed from: F */
    private C13954a f13670F;

    /* renamed from: G */
    private CharSequence f13671G;

    /* renamed from: H */
    private CharSequence f13672H;

    /* renamed from: I */
    private boolean f13673I;

    /* renamed from: K */
    private boolean f13675K;

    /* renamed from: L */
    private Bitmap f13676L;

    /* renamed from: M */
    private Paint f13677M;

    /* renamed from: N */
    private float f13678N;

    /* renamed from: O */
    private float f13679O;

    /* renamed from: P */
    private float f13680P;

    /* renamed from: Q */
    private float f13681Q;

    /* renamed from: R */
    private float f13682R;

    /* renamed from: S */
    private int f13683S;

    /* renamed from: T */
    private int[] f13684T;

    /* renamed from: U */
    private boolean f13685U;

    /* renamed from: V */
    private final TextPaint f13686V;

    /* renamed from: W */
    private final TextPaint f13687W;

    /* renamed from: X */
    private TimeInterpolator f13688X;

    /* renamed from: Y */
    private TimeInterpolator f13689Y;

    /* renamed from: Z */
    private float f13690Z;

    /* renamed from: a */
    private final View f13691a;

    /* renamed from: a0 */
    private float f13692a0;

    /* renamed from: b */
    private boolean f13693b;

    /* renamed from: b0 */
    private float f13694b0;

    /* renamed from: c */
    private float f13695c;

    /* renamed from: c0 */
    private ColorStateList f13696c0;

    /* renamed from: d */
    private boolean f13697d;

    /* renamed from: d0 */
    private float f13698d0;

    /* renamed from: e */
    private float f13699e;

    /* renamed from: e0 */
    private float f13700e0;

    /* renamed from: f */
    private float f13701f;

    /* renamed from: f0 */
    private float f13702f0;

    /* renamed from: g */
    private int f13703g;

    /* renamed from: g0 */
    private ColorStateList f13704g0;

    /* renamed from: h */
    private final Rect f13705h;

    /* renamed from: h0 */
    private float f13706h0;

    /* renamed from: i */
    private final Rect f13707i;

    /* renamed from: i0 */
    private float f13708i0;

    /* renamed from: j */
    private final RectF f13709j;

    /* renamed from: j0 */
    private float f13710j0;

    /* renamed from: k0 */
    private StaticLayout f13712k0;

    /* renamed from: l0 */
    private float f13714l0;

    /* renamed from: m0 */
    private float f13716m0;

    /* renamed from: n0 */
    private float f13718n0;

    /* renamed from: o */
    private ColorStateList f13719o;

    /* renamed from: o0 */
    private CharSequence f13720o0;

    /* renamed from: p */
    private ColorStateList f13721p;

    /* renamed from: q */
    private int f13723q;

    /* renamed from: r */
    private float f13725r;

    /* renamed from: s */
    private float f13727s;

    /* renamed from: t */
    private float f13729t;

    /* renamed from: u */
    private float f13730u;

    /* renamed from: v */
    private float f13731v;

    /* renamed from: w */
    private float f13732w;

    /* renamed from: x */
    private Typeface f13733x;

    /* renamed from: y */
    private Typeface f13734y;

    /* renamed from: z */
    private Typeface f13735z;

    /* renamed from: k */
    private int f13711k = 16;

    /* renamed from: l */
    private int f13713l = 16;

    /* renamed from: m */
    private float f13715m = 15.0f;

    /* renamed from: n */
    private float f13717n = 15.0f;

    /* renamed from: J */
    private boolean f13674J = true;

    /* renamed from: p0 */
    private int f13722p0 = 1;

    /* renamed from: q0 */
    private float f13724q0 = 0.0f;

    /* renamed from: r0 */
    private float f13726r0 = 1.0f;

    /* renamed from: s0 */
    private int f13728s0 = C4902j.f13756n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.internal.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4891a implements C13954a.InterfaceC13955a {
        C4891a() {
        }

        @Override // p443ya.C13954a.InterfaceC13955a
        /* renamed from: a */
        public void mo1095a(Typeface typeface) {
            C4890b.this.m27030T(typeface);
        }
    }

    public C4890b(View view) {
        this.f13691a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f13686V = textPaint;
        this.f13687W = new TextPaint(textPaint);
        this.f13707i = new Rect();
        this.f13705h = new Rect();
        this.f13709j = new RectF();
        this.f13701f = m27015e();
        m27042H(view.getContext().getResources().getConfiguration());
    }

    /* renamed from: A */
    private void m27049A(TextPaint textPaint) {
        textPaint.setTextSize(this.f13715m);
        textPaint.setTypeface(this.f13665A);
        textPaint.setLetterSpacing(this.f13708i0);
    }

    /* renamed from: B */
    private void m27048B(float f) {
        Rect rect;
        if (this.f13697d) {
            RectF rectF = this.f13709j;
            if (f < this.f13701f) {
                rect = this.f13705h;
            } else {
                rect = this.f13707i;
            }
            rectF.set(rect);
            return;
        }
        this.f13709j.left = m27043G(this.f13705h.left, this.f13707i.left, f, this.f13688X);
        this.f13709j.top = m27043G(this.f13725r, this.f13727s, f, this.f13688X);
        this.f13709j.right = m27043G(this.f13705h.right, this.f13707i.right, f, this.f13688X);
        this.f13709j.bottom = m27043G(this.f13705h.bottom, this.f13707i.bottom, f, this.f13688X);
    }

    /* renamed from: C */
    private static boolean m27047C(float f, float f2) {
        return Math.abs(f - f2) < 1.0E-5f;
    }

    /* renamed from: D */
    private boolean m27046D() {
        return C1365w0.m37258B(this.f13691a) == 1;
    }

    /* renamed from: F */
    private boolean m27044F(CharSequence charSequence, boolean z) {
        InterfaceC1122s interfaceC1122s;
        if (z) {
            interfaceC1122s = C1123t.f3492d;
        } else {
            interfaceC1122s = C1123t.f3491c;
        }
        return interfaceC1122s.isRtl(charSequence, 0, charSequence.length());
    }

    /* renamed from: G */
    private static float m27043G(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return C8878a.m17112a(f, f2, f3);
    }

    /* renamed from: I */
    private float m27041I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: M */
    private static boolean m27037M(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    /* renamed from: Q */
    private void m27033Q(float f) {
        this.f13716m0 = f;
        C1365w0.m37203h0(this.f13691a);
    }

    /* renamed from: U */
    private boolean m27029U(Typeface typeface) {
        C13954a c13954a = this.f13670F;
        if (c13954a != null) {
            c13954a.m1097c();
        }
        if (this.f13735z != typeface) {
            this.f13735z = typeface;
            Typeface m1057b = C13965i.m1057b(this.f13691a.getContext().getResources().getConfiguration(), typeface);
            this.f13734y = m1057b;
            if (m1057b == null) {
                m1057b = this.f13735z;
            }
            this.f13733x = m1057b;
            return true;
        }
        return false;
    }

    /* renamed from: Y */
    private void m27025Y(float f) {
        this.f13718n0 = f;
        C1365w0.m37203h0(this.f13691a);
    }

    /* renamed from: a */
    private static int m27023a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* renamed from: b */
    private void m27021b(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        m27007i(1.0f, z);
        CharSequence charSequence = this.f13672H;
        if (charSequence != null && (staticLayout = this.f13712k0) != null) {
            this.f13720o0 = TextUtils.ellipsize(charSequence, this.f13686V, staticLayout.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence2 = this.f13720o0;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.f13714l0 = m27041I(this.f13686V, charSequence2);
        } else {
            this.f13714l0 = 0.0f;
        }
        int m37321b = C1336t.m37321b(this.f13713l, this.f13673I ? 1 : 0);
        int i2 = m37321b & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                this.f13727s = this.f13707i.centerY() - ((this.f13686V.descent() - this.f13686V.ascent()) / 2.0f);
            } else {
                this.f13727s = this.f13707i.bottom + this.f13686V.ascent();
            }
        } else {
            this.f13727s = this.f13707i.top;
        }
        int i3 = m37321b & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                this.f13730u = this.f13707i.left;
            } else {
                this.f13730u = this.f13707i.right - this.f13714l0;
            }
        } else {
            this.f13730u = this.f13707i.centerX() - (this.f13714l0 / 2.0f);
        }
        m27007i(0.0f, z);
        StaticLayout staticLayout2 = this.f13712k0;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.f13712k0;
        if (staticLayout3 != null && this.f13722p0 > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.f13672H;
            if (charSequence3 != null) {
                f2 = m27041I(this.f13686V, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.f13712k0;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.f13723q = i;
        int m37321b2 = C1336t.m37321b(this.f13711k, this.f13673I ? 1 : 0);
        int i4 = m37321b2 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.f13725r = this.f13705h.centerY() - (f / 2.0f);
            } else {
                this.f13725r = (this.f13705h.bottom - f) + this.f13686V.descent();
            }
        } else {
            this.f13725r = this.f13705h.top;
        }
        int i5 = m37321b2 & 8388615;
        if (i5 != 1) {
            if (i5 != 5) {
                this.f13729t = this.f13705h.left;
            } else {
                this.f13729t = this.f13705h.right - f2;
            }
        } else {
            this.f13729t = this.f13705h.centerX() - (f2 / 2.0f);
        }
        m27005j();
        m27014e0(this.f13695c);
    }

    /* renamed from: c */
    private void m27019c() {
        m27011g(this.f13695c);
    }

    /* renamed from: c0 */
    private boolean m27018c0(Typeface typeface) {
        C13954a c13954a = this.f13669E;
        if (c13954a != null) {
            c13954a.m1097c();
        }
        if (this.f13667C != typeface) {
            this.f13667C = typeface;
            Typeface m1057b = C13965i.m1057b(this.f13691a.getContext().getResources().getConfiguration(), typeface);
            this.f13666B = m1057b;
            if (m1057b == null) {
                m1057b = this.f13667C;
            }
            this.f13665A = m1057b;
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private float m27017d(float f) {
        float f2 = this.f13701f;
        if (f <= f2) {
            return C8878a.m17111b(1.0f, 0.0f, this.f13699e, f2, f);
        }
        return C8878a.m17111b(0.0f, 1.0f, f2, 1.0f, f);
    }

    /* renamed from: e */
    private float m27015e() {
        float f = this.f13699e;
        return f + ((1.0f - f) * 0.5f);
    }

    /* renamed from: e0 */
    private void m27014e0(float f) {
        boolean z;
        m27009h(f);
        if (f13663t0 && this.f13678N != 1.0f) {
            z = true;
        } else {
            z = false;
        }
        this.f13675K = z;
        if (z) {
            m26999n();
        }
        C1365w0.m37203h0(this.f13691a);
    }

    /* renamed from: f */
    private boolean m27013f(CharSequence charSequence) {
        boolean m27046D = m27046D();
        if (this.f13674J) {
            return m27044F(charSequence, m27046D);
        }
        return m27046D;
    }

    /* renamed from: g */
    private void m27011g(float f) {
        float f2;
        m27048B(f);
        if (this.f13697d) {
            if (f < this.f13701f) {
                this.f13731v = this.f13729t;
                this.f13732w = this.f13725r;
                m27014e0(0.0f);
                f2 = 0.0f;
            } else {
                this.f13731v = this.f13730u;
                this.f13732w = this.f13727s - Math.max(0, this.f13703g);
                m27014e0(1.0f);
                f2 = 1.0f;
            }
        } else {
            this.f13731v = m27043G(this.f13729t, this.f13730u, f, this.f13688X);
            this.f13732w = m27043G(this.f13725r, this.f13727s, f, this.f13688X);
            m27014e0(f);
            f2 = f;
        }
        TimeInterpolator timeInterpolator = C8878a.f23261b;
        m27033Q(1.0f - m27043G(0.0f, 1.0f, 1.0f - f, timeInterpolator));
        m27025Y(m27043G(1.0f, 0.0f, f, timeInterpolator));
        if (this.f13721p != this.f13719o) {
            this.f13686V.setColor(m27023a(m26991v(), m26993t(), f2));
        } else {
            this.f13686V.setColor(m26993t());
        }
        float f3 = this.f13706h0;
        float f4 = this.f13708i0;
        if (f3 != f4) {
            this.f13686V.setLetterSpacing(m27043G(f4, f3, f, timeInterpolator));
        } else {
            this.f13686V.setLetterSpacing(f3);
        }
        this.f13680P = m27043G(this.f13698d0, this.f13690Z, f, null);
        this.f13681Q = m27043G(this.f13700e0, this.f13692a0, f, null);
        this.f13682R = m27043G(this.f13702f0, this.f13694b0, f, null);
        int m27023a = m27023a(m26992u(this.f13704g0), m26992u(this.f13696c0), f);
        this.f13683S = m27023a;
        this.f13686V.setShadowLayer(this.f13680P, this.f13681Q, this.f13682R, m27023a);
        if (this.f13697d) {
            this.f13686V.setAlpha((int) (m27017d(f) * this.f13686V.getAlpha()));
        }
        C1365w0.m37203h0(this.f13691a);
    }

    /* renamed from: h */
    private void m27009h(float f) {
        m27007i(f, false);
    }

    /* renamed from: i */
    private void m27007i(float f, boolean z) {
        boolean z2;
        float f2;
        float f3;
        boolean z3;
        boolean z4;
        boolean z5;
        if (this.f13671G == null) {
            return;
        }
        float width = this.f13707i.width();
        float width2 = this.f13705h.width();
        boolean z6 = false;
        int i = 1;
        if (m27047C(f, 1.0f)) {
            f2 = this.f13717n;
            f3 = this.f13706h0;
            this.f13678N = 1.0f;
            Typeface typeface = this.f13668D;
            Typeface typeface2 = this.f13733x;
            if (typeface != typeface2) {
                this.f13668D = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.f13715m;
            float f5 = this.f13708i0;
            Typeface typeface3 = this.f13668D;
            Typeface typeface4 = this.f13665A;
            if (typeface3 != typeface4) {
                this.f13668D = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (m27047C(f, 0.0f)) {
                this.f13678N = 1.0f;
            } else {
                this.f13678N = m27043G(this.f13715m, this.f13717n, f, this.f13689Y) / this.f13715m;
            }
            float f6 = this.f13717n / this.f13715m;
            float f7 = width2 * f6;
            if (z || f7 <= width) {
                width = width2;
            } else {
                width = Math.min(width / f6, width2);
            }
            f2 = f4;
            f3 = f5;
            z3 = z2;
        }
        if (width > 0.0f) {
            if (this.f13679O != f2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.f13710j0 != f3) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z4 && !z5 && !this.f13685U && !z3) {
                z3 = false;
            } else {
                z3 = true;
            }
            this.f13679O = f2;
            this.f13710j0 = f3;
            this.f13685U = false;
        }
        if (this.f13672H == null || z3) {
            this.f13686V.setTextSize(this.f13679O);
            this.f13686V.setTypeface(this.f13668D);
            this.f13686V.setLetterSpacing(this.f13710j0);
            TextPaint textPaint = this.f13686V;
            if (this.f13678N != 1.0f) {
                z6 = true;
            }
            textPaint.setLinearText(z6);
            this.f13673I = m27013f(this.f13671G);
            if (m27002k0()) {
                i = this.f13722p0;
            }
            StaticLayout m27003k = m27003k(i, width, this.f13673I);
            this.f13712k0 = m27003k;
            this.f13672H = m27003k.getText();
        }
    }

    /* renamed from: j */
    private void m27005j() {
        Bitmap bitmap = this.f13676L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f13676L = null;
        }
    }

    /* renamed from: k */
    private StaticLayout m27003k(int i, float f, boolean z) {
        StaticLayout staticLayout;
        Layout.Alignment m26988y;
        try {
            if (i == 1) {
                m26988y = Layout.Alignment.ALIGN_NORMAL;
            } else {
                m26988y = m26988y();
            }
            staticLayout = C4902j.m26971b(this.f13671G, this.f13686V, (int) f).m26969d(TextUtils.TruncateAt.END).m26966g(z).m26970c(m26988y).m26967f(false).m26964i(i).m26965h(this.f13724q0, this.f13726r0).m26968e(this.f13728s0).m26972a();
        } catch (C4902j.C4903a e) {
            Log.e("CollapsingTextHelper", e.getCause().getMessage(), e);
            staticLayout = null;
        }
        return (StaticLayout) C1138f.m37824f(staticLayout);
    }

    /* renamed from: k0 */
    private boolean m27002k0() {
        return this.f13722p0 > 1 && (!this.f13673I || this.f13697d) && !this.f13675K;
    }

    /* renamed from: m */
    private void m27000m(Canvas canvas, float f, float f2) {
        int alpha = this.f13686V.getAlpha();
        canvas.translate(f, f2);
        float f3 = alpha;
        this.f13686V.setAlpha((int) (this.f13718n0 * f3));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            TextPaint textPaint = this.f13686V;
            textPaint.setShadowLayer(this.f13680P, this.f13681Q, this.f13682R, C11487a.m8019a(this.f13683S, textPaint.getAlpha()));
        }
        this.f13712k0.draw(canvas);
        this.f13686V.setAlpha((int) (this.f13716m0 * f3));
        if (i >= 31) {
            TextPaint textPaint2 = this.f13686V;
            textPaint2.setShadowLayer(this.f13680P, this.f13681Q, this.f13682R, C11487a.m8019a(this.f13683S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f13712k0.getLineBaseline(0);
        CharSequence charSequence = this.f13720o0;
        float f4 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.f13686V);
        if (i >= 31) {
            this.f13686V.setShadowLayer(this.f13680P, this.f13681Q, this.f13682R, this.f13683S);
        }
        if (!this.f13697d) {
            String trim = this.f13720o0.toString().trim();
            if (trim.endsWith("…")) {
                trim = trim.substring(0, trim.length() - 1);
            }
            String str = trim;
            this.f13686V.setAlpha(alpha);
            canvas.drawText(str, 0, Math.min(this.f13712k0.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.f13686V);
        }
    }

    /* renamed from: n */
    private void m26999n() {
        if (this.f13676L == null && !this.f13705h.isEmpty() && !TextUtils.isEmpty(this.f13672H)) {
            m27011g(0.0f);
            int width = this.f13712k0.getWidth();
            int height = this.f13712k0.getHeight();
            if (width > 0 && height > 0) {
                this.f13676L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.f13712k0.draw(new Canvas(this.f13676L));
                if (this.f13677M == null) {
                    this.f13677M = new Paint(3);
                }
            }
        }
    }

    /* renamed from: r */
    private float m26995r(int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.f13673I) {
                    return this.f13707i.right - this.f13714l0;
                }
                return this.f13707i.left;
            } else if (this.f13673I) {
                return this.f13707i.left;
            } else {
                return this.f13707i.right - this.f13714l0;
            }
        }
        return (i / 2.0f) - (this.f13714l0 / 2.0f);
    }

    /* renamed from: s */
    private float m26994s(RectF rectF, int i, int i2) {
        if (i2 != 17 && (i2 & 7) != 1) {
            if ((i2 & 8388613) != 8388613 && (i2 & 5) != 5) {
                if (this.f13673I) {
                    return this.f13707i.right;
                }
                return rectF.left + this.f13714l0;
            } else if (this.f13673I) {
                return rectF.left + this.f13714l0;
            } else {
                return this.f13707i.right;
            }
        }
        return (i / 2.0f) + (this.f13714l0 / 2.0f);
    }

    /* renamed from: u */
    private int m26992u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f13684T;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    /* renamed from: v */
    private int m26991v() {
        return m26992u(this.f13719o);
    }

    /* renamed from: y */
    private Layout.Alignment m26988y() {
        int m37321b = C1336t.m37321b(this.f13711k, this.f13673I ? 1 : 0) & 7;
        if (m37321b != 1) {
            if (m37321b != 5) {
                if (this.f13673I) {
                    return Layout.Alignment.ALIGN_OPPOSITE;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            } else if (this.f13673I) {
                return Layout.Alignment.ALIGN_NORMAL;
            } else {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    /* renamed from: z */
    private void m26987z(TextPaint textPaint) {
        textPaint.setTextSize(this.f13717n);
        textPaint.setTypeface(this.f13733x);
        textPaint.setLetterSpacing(this.f13706h0);
    }

    /* renamed from: E */
    public final boolean m27045E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f13721p;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f13719o) != null && colorStateList.isStateful())) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public void m27042H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f13735z;
            if (typeface != null) {
                this.f13734y = C13965i.m1057b(configuration, typeface);
            }
            Typeface typeface2 = this.f13667C;
            if (typeface2 != null) {
                this.f13666B = C13965i.m1057b(configuration, typeface2);
            }
            Typeface typeface3 = this.f13734y;
            if (typeface3 == null) {
                typeface3 = this.f13735z;
            }
            this.f13733x = typeface3;
            Typeface typeface4 = this.f13666B;
            if (typeface4 == null) {
                typeface4 = this.f13667C;
            }
            this.f13665A = typeface4;
            m27038L(true);
        }
    }

    /* renamed from: J */
    void m27040J() {
        boolean z;
        if (this.f13707i.width() > 0 && this.f13707i.height() > 0 && this.f13705h.width() > 0 && this.f13705h.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f13693b = z;
    }

    /* renamed from: K */
    public void m27039K() {
        m27038L(false);
    }

    /* renamed from: L */
    public void m27038L(boolean z) {
        if ((this.f13691a.getHeight() > 0 && this.f13691a.getWidth() > 0) || z) {
            m27021b(z);
            m27019c();
        }
    }

    /* renamed from: N */
    public void m27036N(int i, int i2, int i3, int i4) {
        if (!m27037M(this.f13707i, i, i2, i3, i4)) {
            this.f13707i.set(i, i2, i3, i4);
            this.f13685U = true;
            m27040J();
        }
    }

    /* renamed from: O */
    public void m27035O(Rect rect) {
        m27036N(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: P */
    public void m27034P(int i) {
        C13958d c13958d = new C13958d(this.f13691a.getContext(), i);
        if (c13958d.m1073i() != null) {
            this.f13721p = c13958d.m1073i();
        }
        if (c13958d.m1072j() != 0.0f) {
            this.f13717n = c13958d.m1072j();
        }
        ColorStateList colorStateList = c13958d.f35917c;
        if (colorStateList != null) {
            this.f13696c0 = colorStateList;
        }
        this.f13692a0 = c13958d.f35922h;
        this.f13694b0 = c13958d.f35923i;
        this.f13690Z = c13958d.f35924j;
        this.f13706h0 = c13958d.f35926l;
        C13954a c13954a = this.f13670F;
        if (c13954a != null) {
            c13954a.m1097c();
        }
        this.f13670F = new C13954a(new C4891a(), c13958d.m1077e());
        c13958d.m1074h(this.f13691a.getContext(), this.f13670F);
        m27039K();
    }

    /* renamed from: R */
    public void m27032R(ColorStateList colorStateList) {
        if (this.f13721p != colorStateList) {
            this.f13721p = colorStateList;
            m27039K();
        }
    }

    /* renamed from: S */
    public void m27031S(int i) {
        if (this.f13713l != i) {
            this.f13713l = i;
            m27039K();
        }
    }

    /* renamed from: T */
    public void m27030T(Typeface typeface) {
        if (m27029U(typeface)) {
            m27039K();
        }
    }

    /* renamed from: V */
    public void m27028V(int i, int i2, int i3, int i4) {
        if (!m27037M(this.f13705h, i, i2, i3, i4)) {
            this.f13705h.set(i, i2, i3, i4);
            this.f13685U = true;
            m27040J();
        }
    }

    /* renamed from: W */
    public void m27027W(Rect rect) {
        m27028V(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: X */
    public void m27026X(float f) {
        if (this.f13708i0 != f) {
            this.f13708i0 = f;
            m27039K();
        }
    }

    /* renamed from: Z */
    public void m27024Z(ColorStateList colorStateList) {
        if (this.f13719o != colorStateList) {
            this.f13719o = colorStateList;
            m27039K();
        }
    }

    /* renamed from: a0 */
    public void m27022a0(int i) {
        if (this.f13711k != i) {
            this.f13711k = i;
            m27039K();
        }
    }

    /* renamed from: b0 */
    public void m27020b0(float f) {
        if (this.f13715m != f) {
            this.f13715m = f;
            m27039K();
        }
    }

    /* renamed from: d0 */
    public void m27016d0(float f) {
        float m1916a = C13657a.m1916a(f, 0.0f, 1.0f);
        if (m1916a != this.f13695c) {
            this.f13695c = m1916a;
            m27019c();
        }
    }

    /* renamed from: f0 */
    public void m27012f0(TimeInterpolator timeInterpolator) {
        this.f13688X = timeInterpolator;
        m27039K();
    }

    /* renamed from: g0 */
    public final boolean m27010g0(int[] iArr) {
        this.f13684T = iArr;
        if (m27045E()) {
            m27039K();
            return true;
        }
        return false;
    }

    /* renamed from: h0 */
    public void m27008h0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f13671G, charSequence)) {
            this.f13671G = charSequence;
            this.f13672H = null;
            m27005j();
            m27039K();
        }
    }

    /* renamed from: i0 */
    public void m27006i0(TimeInterpolator timeInterpolator) {
        this.f13689Y = timeInterpolator;
        m27039K();
    }

    /* renamed from: j0 */
    public void m27004j0(Typeface typeface) {
        boolean m27029U = m27029U(typeface);
        boolean m27018c0 = m27018c0(typeface);
        if (m27029U || m27018c0) {
            m27039K();
        }
    }

    /* renamed from: l */
    public void m27001l(Canvas canvas) {
        boolean z;
        int save = canvas.save();
        if (this.f13672H != null && this.f13693b) {
            this.f13686V.setTextSize(this.f13679O);
            float f = this.f13731v;
            float f2 = this.f13732w;
            if (this.f13675K && this.f13676L != null) {
                z = true;
            } else {
                z = false;
            }
            float f3 = this.f13678N;
            if (f3 != 1.0f && !this.f13697d) {
                canvas.scale(f3, f3, f, f2);
            }
            if (z) {
                canvas.drawBitmap(this.f13676L, f, f2, this.f13677M);
                canvas.restoreToCount(save);
                return;
            }
            if (m27002k0() && (!this.f13697d || this.f13695c > this.f13701f)) {
                m27000m(canvas, this.f13731v - this.f13712k0.getLineStart(0), f2);
            } else {
                canvas.translate(f, f2);
                this.f13712k0.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    /* renamed from: o */
    public void m26998o(RectF rectF, int i, int i2) {
        this.f13673I = m27013f(this.f13671G);
        rectF.left = m26995r(i, i2);
        rectF.top = this.f13707i.top;
        rectF.right = m26994s(rectF, i, i2);
        rectF.bottom = this.f13707i.top + m26996q();
    }

    /* renamed from: p */
    public ColorStateList m26997p() {
        return this.f13721p;
    }

    /* renamed from: q */
    public float m26996q() {
        m26987z(this.f13687W);
        return -this.f13687W.ascent();
    }

    /* renamed from: t */
    public int m26993t() {
        return m26992u(this.f13721p);
    }

    /* renamed from: w */
    public float m26990w() {
        m27049A(this.f13687W);
        return -this.f13687W.ascent();
    }

    /* renamed from: x */
    public float m26989x() {
        return this.f13695c;
    }
}
