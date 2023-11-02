package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.C0995a;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.text.C1100a;
import bb.C2232g;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.android.material.internal.C4904k;
import com.google.android.material.internal.C4908m;
import com.google.android.material.internal.C4911o;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p071e.C6029a;
import p155ia.C7489k;
import p176ja.C8885h;
import p197ka.C9212a;
import p320ra.C12119a;
import p443ya.C13957c;
import p443ya.C13958d;
import pa.C11487a;
import za.C14143b;

/* renamed from: com.google.android.material.chip.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4805a extends C2232g implements Drawable.Callback, C4904k.InterfaceC4906b {

    /* renamed from: S0 */
    private static final int[] f13333S0 = {16842910};

    /* renamed from: T0 */
    private static final ShapeDrawable f13334T0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0 */
    private int f13335A0;

    /* renamed from: B0 */
    private int f13336B0;

    /* renamed from: C0 */
    private int f13337C0;

    /* renamed from: D0 */
    private boolean f13338D0;

    /* renamed from: E0 */
    private int f13339E0;

    /* renamed from: F0 */
    private int f13340F0;

    /* renamed from: G0 */
    private ColorFilter f13341G0;

    /* renamed from: H0 */
    private PorterDuffColorFilter f13342H0;

    /* renamed from: I */
    private ColorStateList f13343I;

    /* renamed from: I0 */
    private ColorStateList f13344I0;

    /* renamed from: J */
    private ColorStateList f13345J;

    /* renamed from: J0 */
    private PorterDuff.Mode f13346J0;

    /* renamed from: K */
    private float f13347K;

    /* renamed from: K0 */
    private int[] f13348K0;

    /* renamed from: L */
    private float f13349L;

    /* renamed from: L0 */
    private boolean f13350L0;

    /* renamed from: M */
    private ColorStateList f13351M;

    /* renamed from: M0 */
    private ColorStateList f13352M0;

    /* renamed from: N */
    private float f13353N;

    /* renamed from: N0 */
    private WeakReference<InterfaceC4806a> f13354N0;

    /* renamed from: O */
    private ColorStateList f13355O;

    /* renamed from: O0 */
    private TextUtils.TruncateAt f13356O0;

    /* renamed from: P */
    private CharSequence f13357P;

    /* renamed from: P0 */
    private boolean f13358P0;

    /* renamed from: Q */
    private boolean f13359Q;

    /* renamed from: Q0 */
    private int f13360Q0;

    /* renamed from: R */
    private Drawable f13361R;

    /* renamed from: R0 */
    private boolean f13362R0;

    /* renamed from: S */
    private ColorStateList f13363S;

    /* renamed from: T */
    private float f13364T;

    /* renamed from: U */
    private boolean f13365U;

    /* renamed from: V */
    private boolean f13366V;

    /* renamed from: W */
    private Drawable f13367W;

    /* renamed from: X */
    private Drawable f13368X;

    /* renamed from: Y */
    private ColorStateList f13369Y;

    /* renamed from: Z */
    private float f13370Z;

    /* renamed from: a0 */
    private CharSequence f13371a0;

    /* renamed from: b0 */
    private boolean f13372b0;

    /* renamed from: c0 */
    private boolean f13373c0;

    /* renamed from: d0 */
    private Drawable f13374d0;

    /* renamed from: e0 */
    private ColorStateList f13375e0;

    /* renamed from: f0 */
    private C8885h f13376f0;

    /* renamed from: g0 */
    private C8885h f13377g0;

    /* renamed from: h0 */
    private float f13378h0;

    /* renamed from: i0 */
    private float f13379i0;

    /* renamed from: j0 */
    private float f13380j0;

    /* renamed from: k0 */
    private float f13381k0;

    /* renamed from: l0 */
    private float f13382l0;

    /* renamed from: m0 */
    private float f13383m0;

    /* renamed from: n0 */
    private float f13384n0;

    /* renamed from: o0 */
    private float f13385o0;

    /* renamed from: p0 */
    private final Context f13386p0;

    /* renamed from: q0 */
    private final Paint f13387q0;

    /* renamed from: r0 */
    private final Paint f13388r0;

    /* renamed from: s0 */
    private final Paint.FontMetrics f13389s0;

    /* renamed from: t0 */
    private final RectF f13390t0;

    /* renamed from: u0 */
    private final PointF f13391u0;

    /* renamed from: v0 */
    private final Path f13392v0;

    /* renamed from: w0 */
    private final C4904k f13393w0;

    /* renamed from: x0 */
    private int f13394x0;

    /* renamed from: y0 */
    private int f13395y0;

    /* renamed from: z0 */
    private int f13396z0;

    /* renamed from: com.google.android.material.chip.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4806a {
        /* renamed from: a */
        void mo27358a();
    }

    private C4805a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f13349L = -1.0f;
        this.f13387q0 = new Paint(1);
        this.f13389s0 = new Paint.FontMetrics();
        this.f13390t0 = new RectF();
        this.f13391u0 = new PointF();
        this.f13392v0 = new Path();
        this.f13340F0 = 255;
        this.f13346J0 = PorterDuff.Mode.SRC_IN;
        this.f13354N0 = new WeakReference<>(null);
        m33929O(context);
        this.f13386p0 = context;
        C4904k c4904k = new C4904k(this);
        this.f13393w0 = c4904k;
        this.f13357P = "";
        c4904k.m26959e().density = context.getResources().getDisplayMetrics().density;
        this.f13388r0 = null;
        int[] iArr = f13333S0;
        setState(iArr);
        m27398m2(iArr);
        this.f13358P0 = true;
        if (C14143b.f36375a) {
            f13334T0.setTint(-1);
        }
    }

    /* renamed from: A0 */
    private void m27496A0(Canvas canvas, Rect rect) {
        if (this.f13353N > 0.0f && !this.f13362R0) {
            this.f13387q0.setColor(this.f13335A0);
            this.f13387q0.setStyle(Paint.Style.STROKE);
            if (!this.f13362R0) {
                this.f13387q0.setColorFilter(m27399m1());
            }
            RectF rectF = this.f13390t0;
            float f = this.f13353N;
            rectF.set(rect.left + (f / 2.0f), rect.top + (f / 2.0f), rect.right - (f / 2.0f), rect.bottom - (f / 2.0f));
            float f2 = this.f13349L - (this.f13353N / 2.0f);
            canvas.drawRoundRect(this.f13390t0, f2, f2, this.f13387q0);
        }
    }

    /* renamed from: B0 */
    private void m27493B0(Canvas canvas, Rect rect) {
        if (!this.f13362R0) {
            this.f13387q0.setColor(this.f13394x0);
            this.f13387q0.setStyle(Paint.Style.FILL);
            this.f13390t0.set(rect);
            canvas.drawRoundRect(this.f13390t0, m27469J0(), m27469J0(), this.f13387q0);
        }
    }

    /* renamed from: C0 */
    private void m27490C0(Canvas canvas, Rect rect) {
        if (m27449P2()) {
            m27391p0(rect, this.f13390t0);
            RectF rectF = this.f13390t0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f13367W.setBounds(0, 0, (int) this.f13390t0.width(), (int) this.f13390t0.height());
            if (C14143b.f36375a) {
                this.f13368X.setBounds(this.f13367W.getBounds());
                this.f13368X.jumpToCurrentState();
                this.f13368X.draw(canvas);
            } else {
                this.f13367W.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: D0 */
    private void m27487D0(Canvas canvas, Rect rect) {
        this.f13387q0.setColor(this.f13336B0);
        this.f13387q0.setStyle(Paint.Style.FILL);
        this.f13390t0.set(rect);
        if (!this.f13362R0) {
            canvas.drawRoundRect(this.f13390t0, m27469J0(), m27469J0(), this.f13387q0);
            return;
        }
        m33904h(new RectF(rect), this.f13392v0);
        super.m33892p(canvas, this.f13387q0, this.f13392v0, m33888u());
    }

    /* renamed from: E0 */
    private void m27484E0(Canvas canvas, Rect rect) {
        Paint paint = this.f13388r0;
        if (paint != null) {
            paint.setColor(C0995a.m38177k(-16777216, 127));
            canvas.drawRect(rect, this.f13388r0);
            if (m27452O2() || m27455N2()) {
                m27400m0(rect, this.f13390t0);
                canvas.drawRect(this.f13390t0, this.f13388r0);
            }
            if (this.f13357P != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f13388r0);
            }
            if (m27449P2()) {
                m27391p0(rect, this.f13390t0);
                canvas.drawRect(this.f13390t0, this.f13388r0);
            }
            this.f13388r0.setColor(C0995a.m38177k(-65536, 127));
            m27394o0(rect, this.f13390t0);
            canvas.drawRect(this.f13390t0, this.f13388r0);
            this.f13388r0.setColor(C0995a.m38177k(-16711936, 127));
            m27388q0(rect, this.f13390t0);
            canvas.drawRect(this.f13390t0, this.f13388r0);
        }
    }

    /* renamed from: F0 */
    private void m27481F0(Canvas canvas, Rect rect) {
        boolean z;
        if (this.f13357P != null) {
            Paint.Align m27376u0 = m27376u0(rect, this.f13391u0);
            m27382s0(rect, this.f13390t0);
            if (this.f13393w0.m26960d() != null) {
                this.f13393w0.m26959e().drawableState = getState();
                this.f13393w0.m26954j(this.f13386p0);
            }
            this.f13393w0.m26959e().setTextAlign(m27376u0);
            int i = 0;
            if (Math.round(this.f13393w0.m26958f(m27409i1().toString())) > Math.round(this.f13390t0.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.f13390t0);
            }
            CharSequence charSequence = this.f13357P;
            if (z && this.f13356O0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f13393w0.m26959e(), this.f13390t0.width(), this.f13356O0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f13391u0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f13393w0.m26959e());
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: N2 */
    private boolean m27455N2() {
        return this.f13373c0 && this.f13374d0 != null && this.f13338D0;
    }

    /* renamed from: O2 */
    private boolean m27452O2() {
        return this.f13359Q && this.f13361R != null;
    }

    /* renamed from: P2 */
    private boolean m27449P2() {
        return this.f13366V && this.f13367W != null;
    }

    /* renamed from: Q2 */
    private void m27446Q2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* renamed from: R2 */
    private void m27443R2() {
        this.f13352M0 = this.f13350L0 ? C14143b.m590a(this.f13355O) : null;
    }

    @TargetApi(21)
    /* renamed from: S2 */
    private void m27440S2() {
        this.f13368X = new RippleDrawable(C14143b.m590a(m27413g1()), this.f13367W, f13334T0);
    }

    /* renamed from: a1 */
    private float m27425a1() {
        Drawable drawable;
        if (this.f13338D0) {
            drawable = this.f13374d0;
        } else {
            drawable = this.f13361R;
        }
        float f = this.f13364T;
        if (f <= 0.0f && drawable != null) {
            f = (float) Math.ceil(C4911o.m26936b(this.f13386p0, 24));
            if (drawable.getIntrinsicHeight() <= f) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f;
    }

    /* renamed from: b1 */
    private float m27423b1() {
        Drawable drawable;
        if (this.f13338D0) {
            drawable = this.f13374d0;
        } else {
            drawable = this.f13361R;
        }
        float f = this.f13364T;
        if (f <= 0.0f && drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return f;
    }

    /* renamed from: c2 */
    private void m27420c2(ColorStateList colorStateList) {
        if (this.f13343I != colorStateList) {
            this.f13343I = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l0 */
    private void m27403l0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        C1013a.m38085m(drawable, C1013a.m38092f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f13367W) {
            if (drawable.isStateful()) {
                drawable.setState(m27431X0());
            }
            C1013a.m38083o(drawable, this.f13369Y);
            return;
        }
        Drawable drawable2 = this.f13361R;
        if (drawable == drawable2 && this.f13365U) {
            C1013a.m38083o(drawable2, this.f13363S);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* renamed from: m0 */
    private void m27400m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27452O2() || m27455N2()) {
            float f = this.f13378h0 + this.f13379i0;
            float m27423b1 = m27423b1();
            if (C1013a.m38092f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + m27423b1;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - m27423b1;
            }
            float m27425a1 = m27425a1();
            float exactCenterY = rect.exactCenterY() - (m27425a1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + m27425a1;
        }
    }

    /* renamed from: m1 */
    private ColorFilter m27399m1() {
        ColorFilter colorFilter = this.f13341G0;
        return colorFilter != null ? colorFilter : this.f13342H0;
    }

    /* renamed from: o0 */
    private void m27394o0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (m27449P2()) {
            float f = this.f13385o0 + this.f13384n0 + this.f13370Z + this.f13383m0 + this.f13382l0;
            if (C1013a.m38092f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    /* renamed from: o1 */
    private static boolean m27393o1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p0 */
    private void m27391p0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27449P2()) {
            float f = this.f13385o0 + this.f13384n0;
            if (C1013a.m38092f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.f13370Z;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.f13370Z;
            }
            float exactCenterY = rect.exactCenterY();
            float f4 = this.f13370Z;
            float f5 = exactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    /* renamed from: q0 */
    private void m27388q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m27449P2()) {
            float f = this.f13385o0 + this.f13384n0 + this.f13370Z + this.f13383m0 + this.f13382l0;
            if (C1013a.m38092f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: s0 */
    private void m27382s0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f13357P != null) {
            float m27397n0 = this.f13378h0 + m27397n0() + this.f13381k0;
            float m27385r0 = this.f13385o0 + m27385r0() + this.f13382l0;
            if (C1013a.m38092f(this) == 0) {
                rectF.left = rect.left + m27397n0;
                rectF.right = rect.right - m27385r0;
            } else {
                rectF.left = rect.left + m27385r0;
                rectF.right = rect.right - m27397n0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    /* renamed from: s1 */
    private static boolean m27381s1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* renamed from: t0 */
    private float m27379t0() {
        this.f13393w0.m26959e().getFontMetrics(this.f13389s0);
        Paint.FontMetrics fontMetrics = this.f13389s0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    /* renamed from: t1 */
    private static boolean m27378t1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* renamed from: u1 */
    private static boolean m27375u1(C13958d c13958d) {
        if (c13958d != null && c13958d.m1073i() != null && c13958d.m1073i().isStateful()) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    private boolean m27373v0() {
        return this.f13373c0 && this.f13374d0 != null && this.f13372b0;
    }

    /* renamed from: v1 */
    private void m27372v1(AttributeSet attributeSet, int i, int i2) {
        TypedArray m26945h = C4908m.m26945h(this.f13386p0, attributeSet, C7489k.f20603o0, i, i2, new int[0]);
        this.f13362R0 = m26945h.hasValue(C7489k.f20484Z0);
        m27420c2(C13957c.m1089a(this.f13386p0, m26945h, C7489k.f20383M0));
        m27477G1(C13957c.m1089a(this.f13386p0, m26945h, C7489k.f20691z0));
        m27436U1(m26945h.getDimension(C7489k.f20343H0, 0.0f));
        int i3 = C7489k.f20287A0;
        if (m26945h.hasValue(i3)) {
            m27471I1(m26945h.getDimension(i3, 0.0f));
        }
        m27428Y1(C13957c.m1089a(this.f13386p0, m26945h, C7489k.f20367K0));
        m27424a2(m26945h.getDimension(C7489k.f20375L0, 0.0f));
        m27359z2(C13957c.m1089a(this.f13386p0, m26945h, C7489k.f20477Y0));
        m27482E2(m26945h.getText(C7489k.f20643t0));
        C13958d m1084f = C13957c.m1084f(this.f13386p0, m26945h, C7489k.f20611p0);
        m1084f.m1070l(m26945h.getDimension(C7489k.f20619q0, m1084f.m1072j()));
        m27479F2(m1084f);
        int i4 = m26945h.getInt(C7489k.f20627r0, 0);
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    m27383r2(TextUtils.TruncateAt.END);
                }
            } else {
                m27383r2(TextUtils.TruncateAt.MIDDLE);
            }
        } else {
            m27383r2(TextUtils.TruncateAt.START);
        }
        m27438T1(m26945h.getBoolean(C7489k.f20335G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            m27438T1(m26945h.getBoolean(C7489k.f20311D0, false));
        }
        m27459M1(C13957c.m1086d(this.f13386p0, m26945h, C7489k.f20303C0));
        int i5 = C7489k.f20327F0;
        if (m26945h.hasValue(i5)) {
            m27447Q1(C13957c.m1089a(this.f13386p0, m26945h, i5));
        }
        m27453O1(m26945h.getDimension(C7489k.f20319E0, -1.0f));
        m27389p2(m26945h.getBoolean(C7489k.f20439T0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            m27389p2(m26945h.getBoolean(C7489k.f20399O0, false));
        }
        m27418d2(C13957c.m1086d(this.f13386p0, m26945h, C7489k.f20391N0));
        m27395n2(C13957c.m1089a(this.f13386p0, m26945h, C7489k.f20431S0));
        m27408i2(m26945h.getDimension(C7489k.f20415Q0, 0.0f));
        m27363y1(m26945h.getBoolean(C7489k.f20651u0, false));
        m27480F1(m26945h.getBoolean(C7489k.f20683y0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            m27480F1(m26945h.getBoolean(C7489k.f20667w0, false));
        }
        m27495A1(C13957c.m1086d(this.f13386p0, m26945h, C7489k.f20659v0));
        int i6 = C7489k.f20675x0;
        if (m26945h.hasValue(i6)) {
            m27489C1(C13957c.m1089a(this.f13386p0, m26945h, i6));
        }
        m27488C2(C8885h.m17098b(this.f13386p0, m26945h, C7489k.f20492a1));
        m27380s2(C8885h.m17098b(this.f13386p0, m26945h, C7489k.f20455V0));
        m27432W1(m26945h.getDimension(C7489k.f20359J0, 0.0f));
        m27368w2(m26945h.getDimension(C7489k.f20470X0, 0.0f));
        m27374u2(m26945h.getDimension(C7489k.f20463W0, 0.0f));
        m27467J2(m26945h.getDimension(C7489k.f20508c1, 0.0f));
        m27473H2(m26945h.getDimension(C7489k.f20500b1, 0.0f));
        m27404k2(m26945h.getDimension(C7489k.f20423R0, 0.0f));
        m27414f2(m26945h.getDimension(C7489k.f20407P0, 0.0f));
        m27465K1(m26945h.getDimension(C7489k.f20295B0, 0.0f));
        m27362y2(m26945h.getDimensionPixelSize(C7489k.f20635s0, ViewDefaults.NUMBER_OF_LINES));
        m26945h.recycle();
    }

    /* renamed from: w0 */
    public static C4805a m27370w0(Context context, AttributeSet attributeSet, int i, int i2) {
        C4805a c4805a = new C4805a(context, attributeSet, i, i2);
        c4805a.m27372v1(attributeSet, i, i2);
        return c4805a;
    }

    /* renamed from: x0 */
    private void m27367x0(Canvas canvas, Rect rect) {
        if (m27455N2()) {
            m27400m0(rect, this.f13390t0);
            RectF rectF = this.f13390t0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f13374d0.setBounds(0, 0, (int) this.f13390t0.width(), (int) this.f13390t0.height());
            this.f13374d0.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: x1 */
    private boolean m27366x1(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f13343I;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, this.f13394x0);
        } else {
            i = 0;
        }
        int m33896l = m33896l(i);
        boolean z5 = true;
        if (this.f13394x0 != m33896l) {
            this.f13394x0 = m33896l;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f13345J;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(iArr, this.f13395y0);
        } else {
            i2 = 0;
        }
        int m33896l2 = m33896l(i2);
        if (this.f13395y0 != m33896l2) {
            this.f13395y0 = m33896l2;
            onStateChange = true;
        }
        int m8013g = C11487a.m8013g(m33896l, m33896l2);
        if (this.f13396z0 != m8013g) {
            z = true;
        } else {
            z = false;
        }
        if (m33885x() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z | z2) {
            this.f13396z0 = m8013g;
            m33919Y(ColorStateList.valueOf(m8013g));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f13351M;
        if (colorStateList3 != null) {
            i3 = colorStateList3.getColorForState(iArr, this.f13335A0);
        } else {
            i3 = 0;
        }
        if (this.f13335A0 != i3) {
            this.f13335A0 = i3;
            onStateChange = true;
        }
        if (this.f13352M0 != null && C14143b.m589b(iArr)) {
            i4 = this.f13352M0.getColorForState(iArr, this.f13336B0);
        } else {
            i4 = 0;
        }
        if (this.f13336B0 != i4) {
            this.f13336B0 = i4;
            if (this.f13350L0) {
                onStateChange = true;
            }
        }
        if (this.f13393w0.m26960d() != null && this.f13393w0.m26960d().m1073i() != null) {
            i5 = this.f13393w0.m26960d().m1073i().getColorForState(iArr, this.f13337C0);
        } else {
            i5 = 0;
        }
        if (this.f13337C0 != i5) {
            this.f13337C0 = i5;
            onStateChange = true;
        }
        if (m27393o1(getState(), 16842912) && this.f13372b0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f13338D0 != z3 && this.f13374d0 != null) {
            float m27397n0 = m27397n0();
            this.f13338D0 = z3;
            if (m27397n0 != m27397n0()) {
                onStateChange = true;
                z4 = true;
            } else {
                z4 = false;
                onStateChange = true;
            }
        } else {
            z4 = false;
        }
        ColorStateList colorStateList4 = this.f13344I0;
        if (colorStateList4 != null) {
            i6 = colorStateList4.getColorForState(iArr, this.f13339E0);
        } else {
            i6 = 0;
        }
        if (this.f13339E0 != i6) {
            this.f13339E0 = i6;
            this.f13342H0 = C12119a.m6132a(this, this.f13344I0, this.f13346J0);
        } else {
            z5 = onStateChange;
        }
        if (m27378t1(this.f13361R)) {
            z5 |= this.f13361R.setState(iArr);
        }
        if (m27378t1(this.f13374d0)) {
            z5 |= this.f13374d0.setState(iArr);
        }
        if (m27378t1(this.f13367W)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z5 |= this.f13367W.setState(iArr3);
        }
        if (C14143b.f36375a && m27378t1(this.f13368X)) {
            z5 |= this.f13368X.setState(iArr2);
        }
        if (z5) {
            invalidateSelf();
        }
        if (z4) {
            m27369w1();
        }
        return z5;
    }

    /* renamed from: y0 */
    private void m27364y0(Canvas canvas, Rect rect) {
        if (!this.f13362R0) {
            this.f13387q0.setColor(this.f13395y0);
            this.f13387q0.setStyle(Paint.Style.FILL);
            this.f13387q0.setColorFilter(m27399m1());
            this.f13390t0.set(rect);
            canvas.drawRoundRect(this.f13390t0, m27469J0(), m27469J0(), this.f13387q0);
        }
    }

    /* renamed from: z0 */
    private void m27361z0(Canvas canvas, Rect rect) {
        if (m27452O2()) {
            m27400m0(rect, this.f13390t0);
            RectF rectF = this.f13390t0;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.f13361R.setBounds(0, 0, (int) this.f13390t0.width(), (int) this.f13390t0.height());
            this.f13361R.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    /* renamed from: A1 */
    public void m27495A1(Drawable drawable) {
        if (this.f13374d0 != drawable) {
            float m27397n0 = m27397n0();
            this.f13374d0 = drawable;
            float m27397n02 = m27397n0();
            m27446Q2(this.f13374d0);
            m27403l0(this.f13374d0);
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    /* renamed from: A2 */
    public void m27494A2(int i) {
        m27359z2(C6029a.m23854a(this.f13386p0, i));
    }

    /* renamed from: B1 */
    public void m27492B1(int i) {
        m27495A1(C6029a.m23853b(this.f13386p0, i));
    }

    /* renamed from: B2 */
    public void m27491B2(boolean z) {
        this.f13358P0 = z;
    }

    /* renamed from: C1 */
    public void m27489C1(ColorStateList colorStateList) {
        if (this.f13375e0 != colorStateList) {
            this.f13375e0 = colorStateList;
            if (m27373v0()) {
                C1013a.m38083o(this.f13374d0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: C2 */
    public void m27488C2(C8885h c8885h) {
        this.f13376f0 = c8885h;
    }

    /* renamed from: D1 */
    public void m27486D1(int i) {
        m27489C1(C6029a.m23854a(this.f13386p0, i));
    }

    /* renamed from: D2 */
    public void m27485D2(int i) {
        m27488C2(C8885h.m17097c(this.f13386p0, i));
    }

    /* renamed from: E1 */
    public void m27483E1(int i) {
        m27480F1(this.f13386p0.getResources().getBoolean(i));
    }

    /* renamed from: E2 */
    public void m27482E2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.f13357P, charSequence)) {
            this.f13357P = charSequence;
            this.f13393w0.m26955i(true);
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: F1 */
    public void m27480F1(boolean z) {
        boolean z2;
        if (this.f13373c0 != z) {
            boolean m27455N2 = m27455N2();
            this.f13373c0 = z;
            boolean m27455N22 = m27455N2();
            if (m27455N2 != m27455N22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m27455N22) {
                    m27403l0(this.f13374d0);
                } else {
                    m27446Q2(this.f13374d0);
                }
                invalidateSelf();
                m27369w1();
            }
        }
    }

    /* renamed from: F2 */
    public void m27479F2(C13958d c13958d) {
        this.f13393w0.m26956h(c13958d, this.f13386p0);
    }

    /* renamed from: G0 */
    public Drawable m27478G0() {
        return this.f13374d0;
    }

    /* renamed from: G1 */
    public void m27477G1(ColorStateList colorStateList) {
        if (this.f13345J != colorStateList) {
            this.f13345J = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: G2 */
    public void m27476G2(int i) {
        m27479F2(new C13958d(this.f13386p0, i));
    }

    /* renamed from: H0 */
    public ColorStateList m27475H0() {
        return this.f13375e0;
    }

    /* renamed from: H1 */
    public void m27474H1(int i) {
        m27477G1(C6029a.m23854a(this.f13386p0, i));
    }

    /* renamed from: H2 */
    public void m27473H2(float f) {
        if (this.f13382l0 != f) {
            this.f13382l0 = f;
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: I0 */
    public ColorStateList m27472I0() {
        return this.f13345J;
    }

    @Deprecated
    /* renamed from: I1 */
    public void m27471I1(float f) {
        if (this.f13349L != f) {
            this.f13349L = f;
            setShapeAppearanceModel(m33939E().m33852w(f));
        }
    }

    /* renamed from: I2 */
    public void m27470I2(int i) {
        m27473H2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: J0 */
    public float m27469J0() {
        return this.f13362R0 ? m33936H() : this.f13349L;
    }

    @Deprecated
    /* renamed from: J1 */
    public void m27468J1(int i) {
        m27471I1(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: J2 */
    public void m27467J2(float f) {
        if (this.f13381k0 != f) {
            this.f13381k0 = f;
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: K0 */
    public float m27466K0() {
        return this.f13385o0;
    }

    /* renamed from: K1 */
    public void m27465K1(float f) {
        if (this.f13385o0 != f) {
            this.f13385o0 = f;
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: K2 */
    public void m27464K2(int i) {
        m27467J2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: L0 */
    public Drawable m27463L0() {
        Drawable drawable = this.f13361R;
        if (drawable != null) {
            return C1013a.m38081q(drawable);
        }
        return null;
    }

    /* renamed from: L1 */
    public void m27462L1(int i) {
        m27465K1(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: L2 */
    public void m27461L2(boolean z) {
        if (this.f13350L0 != z) {
            this.f13350L0 = z;
            m27443R2();
            onStateChange(getState());
        }
    }

    /* renamed from: M0 */
    public float m27460M0() {
        return this.f13364T;
    }

    /* renamed from: M1 */
    public void m27459M1(Drawable drawable) {
        Drawable drawable2;
        Drawable m27463L0 = m27463L0();
        if (m27463L0 != drawable) {
            float m27397n0 = m27397n0();
            if (drawable != null) {
                drawable2 = C1013a.m38080r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f13361R = drawable2;
            float m27397n02 = m27397n0();
            m27446Q2(m27463L0);
            if (m27452O2()) {
                m27403l0(this.f13361R);
            }
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    /* renamed from: M2 */
    public boolean m27458M2() {
        return this.f13358P0;
    }

    /* renamed from: N0 */
    public ColorStateList m27457N0() {
        return this.f13363S;
    }

    /* renamed from: N1 */
    public void m27456N1(int i) {
        m27459M1(C6029a.m23853b(this.f13386p0, i));
    }

    /* renamed from: O0 */
    public float m27454O0() {
        return this.f13347K;
    }

    /* renamed from: O1 */
    public void m27453O1(float f) {
        if (this.f13364T != f) {
            float m27397n0 = m27397n0();
            this.f13364T = f;
            float m27397n02 = m27397n0();
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    /* renamed from: P0 */
    public float m27451P0() {
        return this.f13378h0;
    }

    /* renamed from: P1 */
    public void m27450P1(int i) {
        m27453O1(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: Q0 */
    public ColorStateList m27448Q0() {
        return this.f13351M;
    }

    /* renamed from: Q1 */
    public void m27447Q1(ColorStateList colorStateList) {
        this.f13365U = true;
        if (this.f13363S != colorStateList) {
            this.f13363S = colorStateList;
            if (m27452O2()) {
                C1013a.m38083o(this.f13361R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: R0 */
    public float m27445R0() {
        return this.f13353N;
    }

    /* renamed from: R1 */
    public void m27444R1(int i) {
        m27447Q1(C6029a.m23854a(this.f13386p0, i));
    }

    /* renamed from: S0 */
    public Drawable m27442S0() {
        Drawable drawable = this.f13367W;
        if (drawable != null) {
            return C1013a.m38081q(drawable);
        }
        return null;
    }

    /* renamed from: S1 */
    public void m27441S1(int i) {
        m27438T1(this.f13386p0.getResources().getBoolean(i));
    }

    /* renamed from: T0 */
    public CharSequence m27439T0() {
        return this.f13371a0;
    }

    /* renamed from: T1 */
    public void m27438T1(boolean z) {
        boolean z2;
        if (this.f13359Q != z) {
            boolean m27452O2 = m27452O2();
            this.f13359Q = z;
            boolean m27452O22 = m27452O2();
            if (m27452O2 != m27452O22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m27452O22) {
                    m27403l0(this.f13361R);
                } else {
                    m27446Q2(this.f13361R);
                }
                invalidateSelf();
                m27369w1();
            }
        }
    }

    /* renamed from: U0 */
    public float m27437U0() {
        return this.f13384n0;
    }

    /* renamed from: U1 */
    public void m27436U1(float f) {
        if (this.f13347K != f) {
            this.f13347K = f;
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: V0 */
    public float m27435V0() {
        return this.f13370Z;
    }

    /* renamed from: V1 */
    public void m27434V1(int i) {
        m27436U1(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: W0 */
    public float m27433W0() {
        return this.f13383m0;
    }

    /* renamed from: W1 */
    public void m27432W1(float f) {
        if (this.f13378h0 != f) {
            this.f13378h0 = f;
            invalidateSelf();
            m27369w1();
        }
    }

    /* renamed from: X0 */
    public int[] m27431X0() {
        return this.f13348K0;
    }

    /* renamed from: X1 */
    public void m27430X1(int i) {
        m27432W1(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: Y0 */
    public ColorStateList m27429Y0() {
        return this.f13369Y;
    }

    /* renamed from: Y1 */
    public void m27428Y1(ColorStateList colorStateList) {
        if (this.f13351M != colorStateList) {
            this.f13351M = colorStateList;
            if (this.f13362R0) {
                m33905g0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: Z0 */
    public void m27427Z0(RectF rectF) {
        m27388q0(getBounds(), rectF);
    }

    /* renamed from: Z1 */
    public void m27426Z1(int i) {
        m27428Y1(C6029a.m23854a(this.f13386p0, i));
    }

    @Override // com.google.android.material.internal.C4904k.InterfaceC4906b
    /* renamed from: a */
    public void mo26953a() {
        m27369w1();
        invalidateSelf();
    }

    /* renamed from: a2 */
    public void m27424a2(float f) {
        if (this.f13353N != f) {
            this.f13353N = f;
            this.f13387q0.setStrokeWidth(f);
            if (this.f13362R0) {
                super.m33903h0(f);
            }
            invalidateSelf();
        }
    }

    /* renamed from: b2 */
    public void m27422b2(int i) {
        m27424a2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: c1 */
    public TextUtils.TruncateAt m27421c1() {
        return this.f13356O0;
    }

    /* renamed from: d1 */
    public C8885h m27419d1() {
        return this.f13377g0;
    }

    /* renamed from: d2 */
    public void m27418d2(Drawable drawable) {
        Drawable drawable2;
        Drawable m27442S0 = m27442S0();
        if (m27442S0 != drawable) {
            float m27385r0 = m27385r0();
            if (drawable != null) {
                drawable2 = C1013a.m38080r(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.f13367W = drawable2;
            if (C14143b.f36375a) {
                m27440S2();
            }
            float m27385r02 = m27385r0();
            m27446Q2(m27442S0);
            if (m27449P2()) {
                m27403l0(this.f13367W);
            }
            invalidateSelf();
            if (m27385r0 != m27385r02) {
                m27369w1();
            }
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i2 = this.f13340F0;
            if (i2 < 255) {
                i = C9212a.m16058a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i2);
            } else {
                i = 0;
            }
            m27493B0(canvas, bounds);
            m27364y0(canvas, bounds);
            if (this.f13362R0) {
                super.draw(canvas);
            }
            m27496A0(canvas, bounds);
            m27487D0(canvas, bounds);
            m27361z0(canvas, bounds);
            m27367x0(canvas, bounds);
            if (this.f13358P0) {
                m27481F0(canvas, bounds);
            }
            m27490C0(canvas, bounds);
            m27484E0(canvas, bounds);
            if (this.f13340F0 < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    /* renamed from: e1 */
    public float m27417e1() {
        return this.f13380j0;
    }

    /* renamed from: e2 */
    public void m27416e2(CharSequence charSequence) {
        if (this.f13371a0 != charSequence) {
            this.f13371a0 = C1100a.m37892c().m37887h(charSequence);
            invalidateSelf();
        }
    }

    /* renamed from: f1 */
    public float m27415f1() {
        return this.f13379i0;
    }

    /* renamed from: f2 */
    public void m27414f2(float f) {
        if (this.f13384n0 != f) {
            this.f13384n0 = f;
            invalidateSelf();
            if (m27449P2()) {
                m27369w1();
            }
        }
    }

    /* renamed from: g1 */
    public ColorStateList m27413g1() {
        return this.f13355O;
    }

    /* renamed from: g2 */
    public void m27412g2(int i) {
        m27414f2(this.f13386p0.getResources().getDimension(i));
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f13340F0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f13341G0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f13347K;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f13378h0 + m27397n0() + this.f13381k0 + this.f13393w0.m26958f(m27409i1().toString()) + this.f13382l0 + m27385r0() + this.f13385o0), this.f13360Q0);
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f13362R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f13349L);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f13349L);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    /* renamed from: h1 */
    public C8885h m27411h1() {
        return this.f13376f0;
    }

    /* renamed from: h2 */
    public void m27410h2(int i) {
        m27418d2(C6029a.m23853b(this.f13386p0, i));
    }

    /* renamed from: i1 */
    public CharSequence m27409i1() {
        return this.f13357P;
    }

    /* renamed from: i2 */
    public void m27408i2(float f) {
        if (this.f13370Z != f) {
            this.f13370Z = f;
            invalidateSelf();
            if (m27449P2()) {
                m27369w1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!m27381s1(this.f13343I) && !m27381s1(this.f13345J) && !m27381s1(this.f13351M) && ((!this.f13350L0 || !m27381s1(this.f13352M0)) && !m27375u1(this.f13393w0.m26960d()) && !m27373v0() && !m27378t1(this.f13361R) && !m27378t1(this.f13374d0) && !m27381s1(this.f13344I0))) {
            return false;
        }
        return true;
    }

    /* renamed from: j1 */
    public C13958d m27407j1() {
        return this.f13393w0.m26960d();
    }

    /* renamed from: j2 */
    public void m27406j2(int i) {
        m27408i2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: k1 */
    public float m27405k1() {
        return this.f13382l0;
    }

    /* renamed from: k2 */
    public void m27404k2(float f) {
        if (this.f13383m0 != f) {
            this.f13383m0 = f;
            invalidateSelf();
            if (m27449P2()) {
                m27369w1();
            }
        }
    }

    /* renamed from: l1 */
    public float m27402l1() {
        return this.f13381k0;
    }

    /* renamed from: l2 */
    public void m27401l2(int i) {
        m27404k2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: m2 */
    public boolean m27398m2(int[] iArr) {
        if (!Arrays.equals(this.f13348K0, iArr)) {
            this.f13348K0 = iArr;
            if (m27449P2()) {
                return m27366x1(getState(), iArr);
            }
            return false;
        }
        return false;
    }

    /* renamed from: n0 */
    public float m27397n0() {
        if (!m27452O2() && !m27455N2()) {
            return 0.0f;
        }
        return this.f13379i0 + m27423b1() + this.f13380j0;
    }

    /* renamed from: n1 */
    public boolean m27396n1() {
        return this.f13350L0;
    }

    /* renamed from: n2 */
    public void m27395n2(ColorStateList colorStateList) {
        if (this.f13369Y != colorStateList) {
            this.f13369Y = colorStateList;
            if (m27449P2()) {
                C1013a.m38083o(this.f13367W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* renamed from: o2 */
    public void m27392o2(int i) {
        m27395n2(C6029a.m23854a(this.f13386p0, i));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m27452O2()) {
            onLayoutDirectionChanged |= C1013a.m38085m(this.f13361R, i);
        }
        if (m27455N2()) {
            onLayoutDirectionChanged |= C1013a.m38085m(this.f13374d0, i);
        }
        if (m27449P2()) {
            onLayoutDirectionChanged |= C1013a.m38085m(this.f13367W, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (m27452O2()) {
            onLevelChange |= this.f13361R.setLevel(i);
        }
        if (m27455N2()) {
            onLevelChange |= this.f13374d0.setLevel(i);
        }
        if (m27449P2()) {
            onLevelChange |= this.f13367W.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f13362R0) {
            super.onStateChange(iArr);
        }
        return m27366x1(iArr, m27431X0());
    }

    /* renamed from: p1 */
    public boolean m27390p1() {
        return this.f13372b0;
    }

    /* renamed from: p2 */
    public void m27389p2(boolean z) {
        boolean z2;
        if (this.f13366V != z) {
            boolean m27449P2 = m27449P2();
            this.f13366V = z;
            boolean m27449P22 = m27449P2();
            if (m27449P2 != m27449P22) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (m27449P22) {
                    m27403l0(this.f13367W);
                } else {
                    m27446Q2(this.f13367W);
                }
                invalidateSelf();
                m27369w1();
            }
        }
    }

    /* renamed from: q1 */
    public boolean m27387q1() {
        return m27378t1(this.f13367W);
    }

    /* renamed from: q2 */
    public void m27386q2(InterfaceC4806a interfaceC4806a) {
        this.f13354N0 = new WeakReference<>(interfaceC4806a);
    }

    /* renamed from: r0 */
    public float m27385r0() {
        if (m27449P2()) {
            return this.f13383m0 + this.f13370Z + this.f13384n0;
        }
        return 0.0f;
    }

    /* renamed from: r1 */
    public boolean m27384r1() {
        return this.f13366V;
    }

    /* renamed from: r2 */
    public void m27383r2(TextUtils.TruncateAt truncateAt) {
        this.f13356O0 = truncateAt;
    }

    /* renamed from: s2 */
    public void m27380s2(C8885h c8885h) {
        this.f13377g0 = c8885h;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f13340F0 != i) {
            this.f13340F0 = i;
            invalidateSelf();
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f13341G0 != colorFilter) {
            this.f13341G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f13344I0 != colorStateList) {
            this.f13344I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // bb.C2232g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f13346J0 != mode) {
            this.f13346J0 = mode;
            this.f13342H0 = C12119a.m6132a(this, this.f13344I0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m27452O2()) {
            visible |= this.f13361R.setVisible(z, z2);
        }
        if (m27455N2()) {
            visible |= this.f13374d0.setVisible(z, z2);
        }
        if (m27449P2()) {
            visible |= this.f13367W.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* renamed from: t2 */
    public void m27377t2(int i) {
        m27380s2(C8885h.m17097c(this.f13386p0, i));
    }

    /* renamed from: u0 */
    Paint.Align m27376u0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f13357P != null) {
            float m27397n0 = this.f13378h0 + m27397n0() + this.f13381k0;
            if (C1013a.m38092f(this) == 0) {
                pointF.x = rect.left + m27397n0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - m27397n0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m27379t0();
        }
        return align;
    }

    /* renamed from: u2 */
    public void m27374u2(float f) {
        if (this.f13380j0 != f) {
            float m27397n0 = m27397n0();
            this.f13380j0 = f;
            float m27397n02 = m27397n0();
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: v2 */
    public void m27371v2(int i) {
        m27374u2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: w1 */
    protected void m27369w1() {
        InterfaceC4806a interfaceC4806a = this.f13354N0.get();
        if (interfaceC4806a != null) {
            interfaceC4806a.mo27358a();
        }
    }

    /* renamed from: w2 */
    public void m27368w2(float f) {
        if (this.f13379i0 != f) {
            float m27397n0 = m27397n0();
            this.f13379i0 = f;
            float m27397n02 = m27397n0();
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    /* renamed from: x2 */
    public void m27365x2(int i) {
        m27368w2(this.f13386p0.getResources().getDimension(i));
    }

    /* renamed from: y1 */
    public void m27363y1(boolean z) {
        if (this.f13372b0 != z) {
            this.f13372b0 = z;
            float m27397n0 = m27397n0();
            if (!z && this.f13338D0) {
                this.f13338D0 = false;
            }
            float m27397n02 = m27397n0();
            invalidateSelf();
            if (m27397n0 != m27397n02) {
                m27369w1();
            }
        }
    }

    /* renamed from: y2 */
    public void m27362y2(int i) {
        this.f13360Q0 = i;
    }

    /* renamed from: z1 */
    public void m27360z1(int i) {
        m27363y1(this.f13386p0.getResources().getBoolean(i));
    }

    /* renamed from: z2 */
    public void m27359z2(ColorStateList colorStateList) {
        if (this.f13355O != colorStateList) {
            this.f13355O = colorStateList;
            m27443R2();
            onStateChange(getState());
        }
    }
}