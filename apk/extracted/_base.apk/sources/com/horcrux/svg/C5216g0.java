package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.text.ReactFontManager;
import java.text.Bidi;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* renamed from: com.horcrux.svg.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5216g0 extends C5244t0 {

    /* renamed from: A */
    private final ArrayList<Matrix> f14633A;

    /* renamed from: B */
    private final AssetManager f14634B;

    /* renamed from: w */
    private Path f14635w;

    /* renamed from: x */
    String f14636x;

    /* renamed from: y */
    private C5220h0 f14637y;

    /* renamed from: z */
    private final ArrayList<String> f14638z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.g0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C5217a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14639a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14640b;

        /* renamed from: c */
        static final /* synthetic */ int[] f14641c;

        static {
            int[] iArr = new int[EnumC5222i0.values().length];
            f14641c = iArr;
            try {
                iArr[EnumC5222i0.baseline.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14641c[EnumC5222i0.textBottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14641c[EnumC5222i0.afterEdge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14641c[EnumC5222i0.textAfterEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f14641c[EnumC5222i0.alphabetic.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14641c[EnumC5222i0.ideographic.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14641c[EnumC5222i0.middle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14641c[EnumC5222i0.central.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14641c[EnumC5222i0.mathematical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14641c[EnumC5222i0.hanging.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14641c[EnumC5222i0.textTop.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f14641c[EnumC5222i0.beforeEdge.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f14641c[EnumC5222i0.textBeforeEdge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f14641c[EnumC5222i0.bottom.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f14641c[EnumC5222i0.center.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f14641c[EnumC5222i0.top.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            int[] iArr2 = new int[EnumC5235o0.values().length];
            f14640b = iArr2;
            try {
                iArr2[EnumC5235o0.spacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f14640b[EnumC5235o0.spacingAndGlyphs.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr3 = new int[EnumC5231m0.values().length];
            f14639a = iArr3;
            try {
                iArr3[EnumC5231m0.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f14639a[EnumC5231m0.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f14639a[EnumC5231m0.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public C5216g0(ReactContext reactContext) {
        super(reactContext);
        this.f14638z = new ArrayList<>();
        this.f14633A = new ArrayList<>();
        this.f14634B = this.mContext.getResources().getAssets();
    }

    /* renamed from: N */
    private void m25899N(Paint paint, C5218h c5218h) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        double d = c5218h.f14656n;
        paint.setLetterSpacing((float) (d / (c5218h.f14643a * this.mScale)));
        if (d == 0.0d && c5218h.f14651i == EnumC5226k0.normal) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'hlig', 'cala', " + c5218h.f14649g);
        } else {
            paint.setFontFeatureSettings("'rlig', 'liga', 'clig', 'calt', 'locl', 'ccmp', 'mark', 'mkmk','kern', 'liga' 0, 'clig' 0, 'dlig' 0, 'hlig' 0, 'cala' 0, " + c5218h.f14649g);
        }
        if (i >= 26) {
            paint.setFontVariationSettings("'wght' " + c5218h.f14648f + c5218h.f14650h);
        }
    }

    /* renamed from: O */
    private void m25898O(Paint paint, C5218h c5218h) {
        boolean z;
        boolean z2;
        int i = 0;
        if (c5218h.f14647e != EnumC5228l0.Bold && c5218h.f14648f < 550) {
            z = false;
        } else {
            z = true;
        }
        if (c5218h.f14645c == EnumC5224j0.italic) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            i = 3;
        } else if (z) {
            i = 1;
        } else if (z2) {
            i = 2;
        }
        int i2 = c5218h.f14648f;
        String str = c5218h.f14644b;
        Typeface typeface = null;
        if (str != null && str.length() > 0) {
            String str2 = "fonts/" + str + ".otf";
            String str3 = "fonts/" + str + ".ttf";
            if (Build.VERSION.SDK_INT >= 26) {
                Typeface.Builder builder = new Typeface.Builder(this.f14634B, str2);
                builder.setFontVariationSettings("'wght' " + i2 + c5218h.f14650h);
                builder.setWeight(i2);
                builder.setItalic(z2);
                typeface = builder.build();
                if (typeface == null) {
                    Typeface.Builder builder2 = new Typeface.Builder(this.f14634B, str3);
                    builder2.setFontVariationSettings("'wght' " + i2 + c5218h.f14650h);
                    builder2.setWeight(i2);
                    builder2.setItalic(z2);
                    typeface = builder2.build();
                }
            } else {
                try {
                    try {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f14634B, str2), i);
                    } catch (Exception unused) {
                        typeface = Typeface.create(Typeface.createFromAsset(this.f14634B, str3), i);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (typeface == null) {
            try {
                typeface = ReactFontManager.getInstance().getTypeface(str, i, this.f14634B);
            } catch (Exception unused3) {
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            typeface = Typeface.create(typeface, i2, z2);
        }
        paint.setLinearText(true);
        paint.setSubpixelText(true);
        paint.setTypeface(typeface);
        paint.setTextSize((float) (c5218h.f14643a * this.mScale));
        paint.setLetterSpacing(0.0f);
    }

    /* renamed from: P */
    private void m25897P(Canvas canvas, Paint paint) {
        Layout.Alignment alignment;
        C5223j m25834f = m25834f();
        mo25709h();
        C5218h m25857b = m25834f.m25857b();
        TextPaint textPaint = new TextPaint(paint);
        m25898O(textPaint, m25857b);
        m25899N(textPaint, m25857b);
        double m25856c = m25834f.m25856c();
        int i = C5217a.f14639a[m25857b.f14652j.ordinal()];
        if (i != 2) {
            if (i != 3) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        StaticLayout m25894S = m25894S(textPaint, alignment, true, new SpannableString(this.f14636x), (int) C5250x.m25663a(this.f14844l, canvas.getWidth(), 0.0d, this.mScale, m25856c));
        int lineAscent = m25894S.getLineAscent(0);
        mo25833g();
        canvas.save();
        canvas.translate((float) m25834f.m25847l(0.0d), (float) (m25834f.m25846m() + lineAscent));
        m25894S.draw(canvas);
        canvas.restore();
    }

    /* renamed from: Q */
    private double m25896Q(SVGLength sVGLength, double d, double d2) {
        return C5250x.m25663a(sVGLength, d, 0.0d, this.mScale, d2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023c  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.Path m25895R(java.lang.String r69, android.graphics.Paint r70, android.graphics.Canvas r71) {
        /*
            Method dump skipped, instructions count: 1380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.C5216g0.m25895R(java.lang.String, android.graphics.Paint, android.graphics.Canvas):android.graphics.Path");
    }

    /* renamed from: S */
    private StaticLayout m25894S(TextPaint textPaint, Layout.Alignment alignment, boolean z, SpannableString spannableString, int i) {
        return StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, i).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(1).setHyphenationFrequency(1).build();
    }

    /* renamed from: T */
    private double m25893T(EnumC5231m0 enumC5231m0, double d) {
        int i = C5217a.f14639a[enumC5231m0.ordinal()];
        if (i != 2) {
            if (i != 3) {
                return 0.0d;
            }
            return -d;
        }
        return (-d) / 2.0d;
    }

    /* renamed from: V */
    private void m25891V() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getClass() == C5220h0.class) {
                this.f14637y = (C5220h0) parent;
                return;
            } else if (!(parent instanceof C5244t0)) {
                return;
            }
        }
    }

    /* renamed from: W */
    public static String m25890W(String str) {
        if (str != null && str.length() != 0) {
            Bidi bidi = new Bidi(str, -2);
            if (bidi.isLeftToRight()) {
                return str;
            }
            int runCount = bidi.getRunCount();
            byte[] bArr = new byte[runCount];
            Integer[] numArr = new Integer[runCount];
            for (int i = 0; i < runCount; i++) {
                bArr[i] = (byte) bidi.getRunLevel(i);
                numArr[i] = Integer.valueOf(i);
            }
            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
            StringBuilder sb2 = new StringBuilder();
            for (int i2 = 0; i2 < runCount; i2++) {
                int intValue = numArr[i2].intValue();
                int runStart = bidi.getRunStart(intValue);
                int runLimit = bidi.getRunLimit(intValue);
                if ((bArr[intValue] & 1) != 0) {
                    while (true) {
                        runLimit--;
                        if (runLimit >= runStart) {
                            sb2.append(str.charAt(runLimit));
                        }
                    }
                } else {
                    sb2.append((CharSequence) str, runStart, runLimit);
                }
            }
            return sb2.toString();
        }
        return str;
    }

    /* renamed from: U */
    public void m25892U(String str) {
        this.f14636x = str;
        invalidate();
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.VirtualView
    void clearCache() {
        this.f14635w = null;
        super.clearCache();
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    void draw(Canvas canvas, Paint paint, float f) {
        if (this.f14636x != null) {
            SVGLength sVGLength = this.f14844l;
            if (sVGLength != null && sVGLength.f14534a != 0.0d) {
                if (setupFillPaint(paint, this.fillOpacity * f)) {
                    m25897P(canvas, paint);
                }
                if (setupStrokePaint(paint, f * this.strokeOpacity)) {
                    m25897P(canvas, paint);
                    return;
                }
                return;
            }
            int size = this.f14638z.size();
            if (size > 0) {
                m25898O(paint, m25834f().m25857b());
                for (int i = 0; i < size; i++) {
                    canvas.save();
                    canvas.concat(this.f14633A.get(i));
                    canvas.drawText(this.f14638z.get(i), 0.0f, 0.0f, paint);
                    canvas.restore();
                }
            }
            m25836c(canvas, paint, f);
            return;
        }
        clip(canvas, paint);
        mo25837b(canvas, paint, f);
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    Path getPath(Canvas canvas, Paint paint) {
        Path path = this.f14635w;
        if (path != null) {
            return path;
        }
        if (this.f14636x == null) {
            Path m25706n = m25706n(canvas, paint);
            this.f14635w = m25706n;
            return m25706n;
        }
        m25891V();
        mo25709h();
        this.f14635w = m25895R(m25890W(this.f14636x), paint, canvas);
        mo25833g();
        return this.f14635w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.C5227l, com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public int hitTest(float[] fArr) {
        Region region;
        if (this.f14636x == null) {
            return super.hitTest(fArr);
        }
        if (((VirtualView) this).mPath != null && this.mInvertible && this.mTransformInvertible) {
            float[] fArr2 = new float[2];
            this.mInvMatrix.mapPoints(fArr2, fArr);
            this.mInvTransform.mapPoints(fArr2);
            int round = Math.round(fArr2[0]);
            int round2 = Math.round(fArr2[1]);
            initBounds();
            Region region2 = this.mRegion;
            if ((region2 != null && region2.contains(round, round2)) || ((region = this.mStrokeRegion) != null && region.contains(round, round2))) {
                if (getClipPath() != null && !this.mClipRegion.contains(round, round2)) {
                    return -1;
                }
                return getId();
            }
        }
        return -1;
    }

    @Override // com.horcrux.svg.C5244t0, com.horcrux.svg.VirtualView, android.view.View
    public void invalidate() {
        this.f14635w = null;
        super.invalidate();
    }

    @Override // com.horcrux.svg.C5244t0
    /* renamed from: o */
    double mo25705o(Paint paint) {
        if (!Double.isNaN(this.f14854v)) {
            return this.f14854v;
        }
        String str = this.f14636x;
        double d = 0.0d;
        if (str == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof C5244t0) {
                    d += ((C5244t0) childAt).mo25705o(paint);
                }
            }
            this.f14854v = d;
            return d;
        } else if (str.length() == 0) {
            this.f14854v = 0.0d;
            return 0.0d;
        } else {
            C5218h m25857b = m25834f().m25857b();
            m25898O(paint, m25857b);
            m25899N(paint, m25857b);
            double measureText = paint.measureText(str);
            this.f14854v = measureText;
            return measureText;
        }
    }
}
