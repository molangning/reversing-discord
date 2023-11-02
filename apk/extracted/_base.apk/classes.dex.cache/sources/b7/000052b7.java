package p443ya;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.C0980h;
import p155ia.C7489k;

/* renamed from: ya.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13958d {

    /* renamed from: a */
    public final ColorStateList f35915a;

    /* renamed from: b */
    public final ColorStateList f35916b;

    /* renamed from: c */
    public final ColorStateList f35917c;

    /* renamed from: d */
    public final String f35918d;

    /* renamed from: e */
    public final int f35919e;

    /* renamed from: f */
    public final int f35920f;

    /* renamed from: g */
    public final boolean f35921g;

    /* renamed from: h */
    public final float f35922h;

    /* renamed from: i */
    public final float f35923i;

    /* renamed from: j */
    public final float f35924j;

    /* renamed from: k */
    public final boolean f35925k;

    /* renamed from: l */
    public final float f35926l;

    /* renamed from: m */
    private ColorStateList f35927m;

    /* renamed from: n */
    private float f35928n;

    /* renamed from: o */
    private final int f35929o;

    /* renamed from: p */
    private boolean f35930p = false;

    /* renamed from: q */
    private Typeface f35931q;

    /* renamed from: ya.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C13959a extends C0980h.AbstractC0985e {

        /* renamed from: a */
        final /* synthetic */ AbstractC13962f f35932a;

        C13959a(AbstractC13962f abstractC13962f) {
            C13958d.this = r1;
            this.f35932a = abstractC13962f;
        }

        @Override // androidx.core.content.res.C0980h.AbstractC0985e
        /* renamed from: h */
        public void mo1065h(int i) {
            C13958d.this.f35930p = true;
            this.f35932a.mo1062a(i);
        }

        @Override // androidx.core.content.res.C0980h.AbstractC0985e
        /* renamed from: i */
        public void mo1064i(Typeface typeface) {
            C13958d c13958d = C13958d.this;
            c13958d.f35931q = Typeface.create(typeface, c13958d.f35919e);
            C13958d.this.f35930p = true;
            this.f35932a.mo1061b(C13958d.this.f35931q, false);
        }
    }

    /* renamed from: ya.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C13960b extends AbstractC13962f {

        /* renamed from: a */
        final /* synthetic */ Context f35934a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f35935b;

        /* renamed from: c */
        final /* synthetic */ AbstractC13962f f35936c;

        C13960b(Context context, TextPaint textPaint, AbstractC13962f abstractC13962f) {
            C13958d.this = r1;
            this.f35934a = context;
            this.f35935b = textPaint;
            this.f35936c = abstractC13962f;
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: a */
        public void mo1062a(int i) {
            this.f35936c.mo1062a(i);
        }

        @Override // p443ya.AbstractC13962f
        /* renamed from: b */
        public void mo1061b(Typeface typeface, boolean z) {
            C13958d.this.m1066p(this.f35934a, this.f35935b, typeface);
            this.f35936c.mo1061b(typeface, z);
        }
    }

    public C13958d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7489k.f20536f5);
        m1070l(obtainStyledAttributes.getDimension(C7489k.f20544g5, 0.0f));
        m1071k(C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20568j5));
        this.f35915a = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20576k5);
        this.f35916b = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20584l5);
        this.f35919e = obtainStyledAttributes.getInt(C7489k.f20560i5, 0);
        this.f35920f = obtainStyledAttributes.getInt(C7489k.f20552h5, 1);
        int m1085e = C13957c.m1085e(obtainStyledAttributes, C7489k.f20632r5, C7489k.f20624q5);
        this.f35929o = obtainStyledAttributes.getResourceId(m1085e, 0);
        this.f35918d = obtainStyledAttributes.getString(m1085e);
        this.f35921g = obtainStyledAttributes.getBoolean(C7489k.f20640s5, false);
        this.f35917c = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20592m5);
        this.f35922h = obtainStyledAttributes.getFloat(C7489k.f20600n5, 0.0f);
        this.f35923i = obtainStyledAttributes.getFloat(C7489k.f20608o5, 0.0f);
        this.f35924j = obtainStyledAttributes.getFloat(C7489k.f20616p5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, C7489k.f20362J3);
        int i2 = C7489k.f20370K3;
        this.f35925k = obtainStyledAttributes2.hasValue(i2);
        this.f35926l = obtainStyledAttributes2.getFloat(i2, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    /* renamed from: d */
    private void m1078d() {
        String str;
        if (this.f35931q == null && (str = this.f35918d) != null) {
            this.f35931q = Typeface.create(str, this.f35919e);
        }
        if (this.f35931q == null) {
            int i = this.f35920f;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f35931q = Typeface.DEFAULT;
                    } else {
                        this.f35931q = Typeface.MONOSPACE;
                    }
                } else {
                    this.f35931q = Typeface.SERIF;
                }
            } else {
                this.f35931q = Typeface.SANS_SERIF;
            }
            this.f35931q = Typeface.create(this.f35931q, this.f35919e);
        }
    }

    /* renamed from: m */
    private boolean m1069m(Context context) {
        Typeface typeface;
        if (C13961e.m1063a()) {
            return true;
        }
        int i = this.f35929o;
        if (i != 0) {
            typeface = C0980h.m38244c(context, i);
        } else {
            typeface = null;
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public Typeface m1077e() {
        m1078d();
        return this.f35931q;
    }

    /* renamed from: f */
    public Typeface m1076f(Context context) {
        if (this.f35930p) {
            return this.f35931q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface m38239h = C0980h.m38239h(context, this.f35929o);
                this.f35931q = m38239h;
                if (m38239h != null) {
                    this.f35931q = Typeface.create(m38239h, this.f35919e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f35918d, e);
            }
        }
        m1078d();
        this.f35930p = true;
        return this.f35931q;
    }

    /* renamed from: g */
    public void m1075g(Context context, TextPaint textPaint, AbstractC13962f abstractC13962f) {
        m1066p(context, textPaint, m1077e());
        m1074h(context, new C13960b(context, textPaint, abstractC13962f));
    }

    /* renamed from: h */
    public void m1074h(Context context, AbstractC13962f abstractC13962f) {
        if (m1069m(context)) {
            m1076f(context);
        } else {
            m1078d();
        }
        int i = this.f35929o;
        if (i == 0) {
            this.f35930p = true;
        }
        if (this.f35930p) {
            abstractC13962f.mo1061b(this.f35931q, true);
            return;
        }
        try {
            C0980h.m38237j(context, i, new C13959a(abstractC13962f), null);
        } catch (Resources.NotFoundException unused) {
            this.f35930p = true;
            abstractC13962f.mo1062a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f35918d, e);
            this.f35930p = true;
            abstractC13962f.mo1062a(-3);
        }
    }

    /* renamed from: i */
    public ColorStateList m1073i() {
        return this.f35927m;
    }

    /* renamed from: j */
    public float m1072j() {
        return this.f35928n;
    }

    /* renamed from: k */
    public void m1071k(ColorStateList colorStateList) {
        this.f35927m = colorStateList;
    }

    /* renamed from: l */
    public void m1070l(float f) {
        this.f35928n = f;
    }

    /* renamed from: n */
    public void m1068n(Context context, TextPaint textPaint, AbstractC13962f abstractC13962f) {
        int i;
        int i2;
        m1067o(context, textPaint, abstractC13962f);
        ColorStateList colorStateList = this.f35927m;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.f35924j;
        float f2 = this.f35922h;
        float f3 = this.f35923i;
        ColorStateList colorStateList2 = this.f35917c;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    /* renamed from: o */
    public void m1067o(Context context, TextPaint textPaint, AbstractC13962f abstractC13962f) {
        if (m1069m(context)) {
            m1066p(context, textPaint, m1076f(context));
        } else {
            m1075g(context, textPaint, abstractC13962f);
        }
    }

    /* renamed from: p */
    public void m1066p(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface m1058a = C13965i.m1058a(context, typeface);
        if (m1058a != null) {
            typeface = m1058a;
        }
        textPaint.setTypeface(typeface);
        int i = this.f35919e & (~typeface.getStyle());
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f35928n);
        if (this.f35925k) {
            textPaint.setLetterSpacing(this.f35926l);
        }
    }
}