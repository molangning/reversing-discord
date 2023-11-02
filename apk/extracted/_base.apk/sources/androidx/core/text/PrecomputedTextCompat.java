package androidx.core.text;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.C1134c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class PrecomputedTextCompat implements Spannable {

    /* renamed from: m */
    private static final Object f3458m = new Object();

    /* renamed from: j */
    private final Spannable f3459j;

    /* renamed from: k */
    private final Params f3460k;

    /* renamed from: l */
    private final PrecomputedText f3461l;

    /* renamed from: a */
    public Params m37905a() {
        return this.f3460k;
    }

    /* renamed from: b */
    public PrecomputedText m37904b() {
        Spannable spannable = this.f3459j;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f3459j.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f3459j.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f3459j.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f3459j.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.f3461l.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.f3459j.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f3459j.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f3459j.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3461l.removeSpan(obj);
                return;
            } else {
                this.f3459j.removeSpan(obj);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f3461l.setSpan(obj, i, i2, i3);
                return;
            } else {
                this.f3459j.setSpan(obj, i, i2, i3);
                return;
            }
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f3459j.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f3459j.toString();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Params {

        /* renamed from: a */
        private final TextPaint f3462a;

        /* renamed from: b */
        private final TextDirectionHeuristic f3463b;

        /* renamed from: c */
        private final int f3464c;

        /* renamed from: d */
        private final int f3465d;

        /* renamed from: e */
        final PrecomputedText.Params f3466e;

        /* renamed from: androidx.core.text.PrecomputedTextCompat$Params$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1099a {

            /* renamed from: a */
            private final TextPaint f3467a;

            /* renamed from: c */
            private int f3469c = 1;

            /* renamed from: d */
            private int f3470d = 1;

            /* renamed from: b */
            private TextDirectionHeuristic f3468b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C1099a(TextPaint textPaint) {
                this.f3467a = textPaint;
            }

            /* renamed from: a */
            public Params m37898a() {
                return new Params(this.f3467a, this.f3468b, this.f3469c, this.f3470d);
            }

            /* renamed from: b */
            public C1099a m37897b(int i) {
                this.f3469c = i;
                return this;
            }

            /* renamed from: c */
            public C1099a m37896c(int i) {
                this.f3470d = i;
                return this;
            }

            /* renamed from: d */
            public C1099a m37895d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f3468b = textDirectionHeuristic;
                return this;
            }
        }

        Params(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f3466e = build;
            } else {
                this.f3466e = null;
            }
            this.f3462a = textPaint;
            this.f3463b = textDirectionHeuristic;
            this.f3464c = i;
            this.f3465d = i2;
        }

        /* renamed from: a */
        public boolean m37903a(Params params) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            int i = Build.VERSION.SDK_INT;
            if (this.f3464c != params.m37902b() || this.f3465d != params.m37901c() || this.f3462a.getTextSize() != params.m37899e().getTextSize() || this.f3462a.getTextScaleX() != params.m37899e().getTextScaleX() || this.f3462a.getTextSkewX() != params.m37899e().getTextSkewX() || this.f3462a.getLetterSpacing() != params.m37899e().getLetterSpacing() || !TextUtils.equals(this.f3462a.getFontFeatureSettings(), params.m37899e().getFontFeatureSettings()) || this.f3462a.getFlags() != params.m37899e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                textLocales = this.f3462a.getTextLocales();
                textLocales2 = params.m37899e().getTextLocales();
                equals = textLocales.equals(textLocales2);
                if (!equals) {
                    return false;
                }
            } else if (!this.f3462a.getTextLocale().equals(params.m37899e().getTextLocale())) {
                return false;
            }
            if (this.f3462a.getTypeface() == null) {
                if (params.m37899e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f3462a.getTypeface().equals(params.m37899e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int m37902b() {
            return this.f3464c;
        }

        /* renamed from: c */
        public int m37901c() {
            return this.f3465d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic m37900d() {
            return this.f3463b;
        }

        /* renamed from: e */
        public TextPaint m37899e() {
            return this.f3462a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            if (m37903a(params) && this.f3463b == params.m37900d()) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            LocaleList textLocales;
            if (Build.VERSION.SDK_INT >= 24) {
                textLocales = this.f3462a.getTextLocales();
                return C1134c.m37834b(Float.valueOf(this.f3462a.getTextSize()), Float.valueOf(this.f3462a.getTextScaleX()), Float.valueOf(this.f3462a.getTextSkewX()), Float.valueOf(this.f3462a.getLetterSpacing()), Integer.valueOf(this.f3462a.getFlags()), textLocales, this.f3462a.getTypeface(), Boolean.valueOf(this.f3462a.isElegantTextHeight()), this.f3463b, Integer.valueOf(this.f3464c), Integer.valueOf(this.f3465d));
            }
            return C1134c.m37834b(Float.valueOf(this.f3462a.getTextSize()), Float.valueOf(this.f3462a.getTextScaleX()), Float.valueOf(this.f3462a.getTextSkewX()), Float.valueOf(this.f3462a.getLetterSpacing()), Integer.valueOf(this.f3462a.getFlags()), this.f3462a.getTextLocale(), this.f3462a.getTypeface(), Boolean.valueOf(this.f3462a.isElegantTextHeight()), this.f3463b, Integer.valueOf(this.f3464c), Integer.valueOf(this.f3465d));
        }

        public String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb2 = new StringBuilder("{");
            sb2.append("textSize=" + this.f3462a.getTextSize());
            sb2.append(", textScaleX=" + this.f3462a.getTextScaleX());
            sb2.append(", textSkewX=" + this.f3462a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            sb2.append(", letterSpacing=" + this.f3462a.getLetterSpacing());
            sb2.append(", elegantTextHeight=" + this.f3462a.isElegantTextHeight());
            if (i >= 24) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(", textLocale=");
                textLocales = this.f3462a.getTextLocales();
                sb3.append(textLocales);
                sb2.append(sb3.toString());
            } else {
                sb2.append(", textLocale=" + this.f3462a.getTextLocale());
            }
            sb2.append(", typeface=" + this.f3462a.getTypeface());
            if (i >= 26) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(", variationSettings=");
                fontVariationSettings = this.f3462a.getFontVariationSettings();
                sb4.append(fontVariationSettings);
                sb2.append(sb4.toString());
            }
            sb2.append(", textDir=" + this.f3463b);
            sb2.append(", breakStrategy=" + this.f3464c);
            sb2.append(", hyphenationFrequency=" + this.f3465d);
            sb2.append("}");
            return sb2.toString();
        }

        public Params(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f3462a = textPaint;
            textDirection = params.getTextDirection();
            this.f3463b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f3464c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f3465d = hyphenationFrequency;
            this.f3466e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
