package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0980h;
import androidx.core.view.C1365w0;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p052d.C5715j;
import p452z.C14046d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AppCompatTextHelper {

    /* renamed from: a */
    private final TextView f1541a;

    /* renamed from: b */
    private C0538l1 f1542b;

    /* renamed from: c */
    private C0538l1 f1543c;

    /* renamed from: d */
    private C0538l1 f1544d;

    /* renamed from: e */
    private C0538l1 f1545e;

    /* renamed from: f */
    private C0538l1 f1546f;

    /* renamed from: g */
    private C0538l1 f1547g;

    /* renamed from: h */
    private C0538l1 f1548h;

    /* renamed from: i */
    private final C0507f0 f1549i;

    /* renamed from: j */
    private int f1550j = 0;

    /* renamed from: k */
    private int f1551k = -1;

    /* renamed from: l */
    private Typeface f1552l;

    /* renamed from: m */
    private boolean f1553m;

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0429a extends C0980h.AbstractC0985e {

        /* renamed from: a */
        final /* synthetic */ int f1554a;

        /* renamed from: b */
        final /* synthetic */ int f1555b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1556c;

        C0429a(int i, int i2, WeakReference weakReference) {
            AppCompatTextHelper.this = r1;
            this.f1554a = i;
            this.f1555b = i2;
            this.f1556c = weakReference;
        }

        @Override // androidx.core.content.res.C0980h.AbstractC0985e
        /* renamed from: h */
        public void mo1065h(int i) {
        }

        @Override // androidx.core.content.res.C0980h.AbstractC0985e
        /* renamed from: i */
        public void mo1064i(Typeface typeface) {
            int i;
            boolean z;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1554a) != -1) {
                if ((this.f1555b & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                typeface = C0435g.m40149a(typeface, i, z);
            }
            AppCompatTextHelper.this.m40172n(this.f1556c, typeface);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0430b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ TextView f1558j;

        /* renamed from: k */
        final /* synthetic */ Typeface f1559k;

        /* renamed from: l */
        final /* synthetic */ int f1560l;

        RunnableC0430b(TextView textView, Typeface typeface, int i) {
            AppCompatTextHelper.this = r1;
            this.f1558j = textView;
            this.f1559k = typeface;
            this.f1560l = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1558j.setTypeface(this.f1559k, this.f1560l);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0431c {
        /* renamed from: a */
        static Drawable[] m40159a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static void m40158b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: c */
        static void m40157c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0432d {
        /* renamed from: a */
        static Locale m40156a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0433e {
        /* renamed from: a */
        static LocaleList m40155a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }

        /* renamed from: b */
        static void m40154b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0434f {
        /* renamed from: a */
        static int m40153a(TextView textView) {
            int autoSizeStepGranularity;
            autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
            return autoSizeStepGranularity;
        }

        /* renamed from: b */
        static void m40152b(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: c */
        static void m40151c(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: d */
        static boolean m40150d(TextView textView, String str) {
            boolean fontVariationSettings;
            fontVariationSettings = textView.setFontVariationSettings(str);
            return fontVariationSettings;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatTextHelper$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0435g {
        /* renamed from: a */
        static Typeface m40149a(Typeface typeface, int i, boolean z) {
            Typeface create;
            create = Typeface.create(typeface, i, z);
            return create;
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f1541a = textView;
        this.f1549i = new C0507f0(textView);
    }

    /* renamed from: B */
    private void m40187B(int i, float f) {
        this.f1549i.m39908t(i, f);
    }

    /* renamed from: C */
    private void m40186C(Context context, C0544n1 c0544n1) {
        String m39787o;
        boolean z;
        boolean z2;
        this.f1550j = c0544n1.m39791k(C5715j.f16328V2, this.f1550j);
        int i = Build.VERSION.SDK_INT;
        boolean z3 = false;
        if (i >= 28) {
            int m39791k = c0544n1.m39791k(C5715j.f16340Y2, -1);
            this.f1551k = m39791k;
            if (m39791k != -1) {
                this.f1550j = (this.f1550j & 2) | 0;
            }
        }
        int i2 = C5715j.f16336X2;
        if (!c0544n1.m39783s(i2) && !c0544n1.m39783s(C5715j.f16344Z2)) {
            int i3 = C5715j.f16324U2;
            if (c0544n1.m39783s(i3)) {
                this.f1553m = false;
                int m39791k2 = c0544n1.m39791k(i3, 1);
                if (m39791k2 != 1) {
                    if (m39791k2 != 2) {
                        if (m39791k2 == 3) {
                            this.f1552l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f1552l = Typeface.SERIF;
                    return;
                }
                this.f1552l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f1552l = null;
        int i4 = C5715j.f16344Z2;
        if (c0544n1.m39783s(i4)) {
            i2 = i4;
        }
        int i5 = this.f1551k;
        int i6 = this.f1550j;
        if (!context.isRestricted()) {
            try {
                Typeface m39792j = c0544n1.m39792j(i2, this.f1550j, new C0429a(i5, i6, new WeakReference(this.f1541a)));
                if (m39792j != null) {
                    if (i >= 28 && this.f1551k != -1) {
                        Typeface create = Typeface.create(m39792j, 0);
                        int i7 = this.f1551k;
                        if ((this.f1550j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f1552l = C0435g.m40149a(create, i7, z2);
                    } else {
                        this.f1552l = m39792j;
                    }
                }
                if (this.f1552l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.f1553m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1552l == null && (m39787o = c0544n1.m39787o(i2)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f1551k != -1) {
                Typeface create2 = Typeface.create(m39787o, 0);
                int i8 = this.f1551k;
                if ((this.f1550j & 2) != 0) {
                    z3 = true;
                }
                this.f1552l = C0435g.m40149a(create2, i8, z3);
                return;
            }
            this.f1552l = Typeface.create(m39787o, this.f1550j);
        }
    }

    /* renamed from: a */
    private void m40185a(Drawable drawable, C0538l1 c0538l1) {
        if (drawable == null || c0538l1 == null) {
            return;
        }
        C0529j.m39832i(drawable, c0538l1, this.f1541a.getDrawableState());
    }

    /* renamed from: d */
    private static C0538l1 m40182d(Context context, C0529j c0529j, int i) {
        ColorStateList m39835f = c0529j.m39835f(context, i);
        if (m39835f != null) {
            C0538l1 c0538l1 = new C0538l1();
            c0538l1.f1891d = true;
            c0538l1.f1888a = m39835f;
            return c0538l1;
        }
        return null;
    }

    /* renamed from: y */
    private void m40161y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] m40159a = C0431c.m40159a(this.f1541a);
                Drawable drawable7 = m40159a[0];
                if (drawable7 == null && m40159a[2] == null) {
                    Drawable[] compoundDrawables = this.f1541a.getCompoundDrawables();
                    TextView textView = this.f1541a;
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                    return;
                }
                TextView textView2 = this.f1541a;
                if (drawable2 == null) {
                    drawable2 = m40159a[1];
                }
                Drawable drawable8 = m40159a[2];
                if (drawable4 == null) {
                    drawable4 = m40159a[3];
                }
                C0431c.m40158b(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            return;
        }
        Drawable[] m40159a2 = C0431c.m40159a(this.f1541a);
        TextView textView3 = this.f1541a;
        if (drawable5 == null) {
            drawable5 = m40159a2[0];
        }
        if (drawable2 == null) {
            drawable2 = m40159a2[1];
        }
        if (drawable6 == null) {
            drawable6 = m40159a2[2];
        }
        if (drawable4 == null) {
            drawable4 = m40159a2[3];
        }
        C0431c.m40158b(textView3, drawable5, drawable2, drawable6, drawable4);
    }

    /* renamed from: z */
    private void m40160z() {
        C0538l1 c0538l1 = this.f1548h;
        this.f1542b = c0538l1;
        this.f1543c = c0538l1;
        this.f1544d = c0538l1;
        this.f1545e = c0538l1;
        this.f1546f = c0538l1;
        this.f1547g = c0538l1;
    }

    /* renamed from: A */
    public void m40188A(int i, float f) {
        if (!C0616y1.f2091b && !m40174l()) {
            m40187B(i, f);
        }
    }

    /* renamed from: b */
    public void m40184b() {
        if (this.f1542b != null || this.f1543c != null || this.f1544d != null || this.f1545e != null) {
            Drawable[] compoundDrawables = this.f1541a.getCompoundDrawables();
            m40185a(compoundDrawables[0], this.f1542b);
            m40185a(compoundDrawables[1], this.f1543c);
            m40185a(compoundDrawables[2], this.f1544d);
            m40185a(compoundDrawables[3], this.f1545e);
        }
        if (this.f1546f != null || this.f1547g != null) {
            Drawable[] m40159a = C0431c.m40159a(this.f1541a);
            m40185a(m40159a[0], this.f1546f);
            m40185a(m40159a[2], this.f1547g);
        }
    }

    /* renamed from: c */
    public void m40183c() {
        this.f1549i.m39927a();
    }

    /* renamed from: e */
    public int m40181e() {
        return this.f1549i.m39922f();
    }

    /* renamed from: f */
    public int m40180f() {
        return this.f1549i.m39921g();
    }

    /* renamed from: g */
    public int m40179g() {
        return this.f1549i.m39920h();
    }

    /* renamed from: h */
    public int[] m40178h() {
        return this.f1549i.m39919i();
    }

    /* renamed from: i */
    public int m40177i() {
        return this.f1549i.m39918j();
    }

    /* renamed from: j */
    public ColorStateList m40176j() {
        C0538l1 c0538l1 = this.f1548h;
        if (c0538l1 != null) {
            return c0538l1.f1888a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m40175k() {
        C0538l1 c0538l1 = this.f1548h;
        if (c0538l1 != null) {
            return c0538l1.f1889b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m40174l() {
        return this.f1549i.m39914n();
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"NewApi"})
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m40173m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextHelper.m40173m(android.util.AttributeSet, int):void");
    }

    /* renamed from: n */
    void m40172n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1553m) {
            this.f1552l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C1365w0.m37225T(textView)) {
                    textView.post(new RunnableC0430b(textView, typeface, this.f1550j));
                } else {
                    textView.setTypeface(typeface, this.f1550j);
                }
            }
        }
    }

    /* renamed from: o */
    public void m40171o(boolean z, int i, int i2, int i3, int i4) {
        if (!C0616y1.f2091b) {
            m40183c();
        }
    }

    /* renamed from: p */
    public void m40170p() {
        m40184b();
    }

    /* renamed from: q */
    public void m40169q(Context context, int i) {
        String m39787o;
        C0544n1 m39782t = C0544n1.m39782t(context, i, C5715j.f16316S2);
        int i2 = C5715j.f16354b3;
        if (m39782t.m39783s(i2)) {
            m40167s(m39782t.m39801a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        int i4 = C5715j.f16320T2;
        if (m39782t.m39783s(i4) && m39782t.m39796f(i4, -1) == 0) {
            this.f1541a.setTextSize(0, 0.0f);
        }
        m40186C(context, m39782t);
        if (i3 >= 26) {
            int i5 = C5715j.f16349a3;
            if (m39782t.m39783s(i5) && (m39787o = m39782t.m39787o(i5)) != null) {
                C0434f.m40150d(this.f1541a, m39787o);
            }
        }
        m39782t.m39779w();
        Typeface typeface = this.f1552l;
        if (typeface != null) {
            this.f1541a.setTypeface(typeface, this.f1550j);
        }
    }

    /* renamed from: r */
    public void m40168r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            C14046d.m822f(editorInfo, textView.getText());
        }
    }

    /* renamed from: s */
    public void m40167s(boolean z) {
        this.f1541a.setAllCaps(z);
    }

    /* renamed from: t */
    public void m40166t(int i, int i2, int i3, int i4) {
        this.f1549i.m39912p(i, i2, i3, i4);
    }

    /* renamed from: u */
    public void m40165u(int[] iArr, int i) {
        this.f1549i.m39911q(iArr, i);
    }

    /* renamed from: v */
    public void m40164v(int i) {
        this.f1549i.m39910r(i);
    }

    /* renamed from: w */
    public void m40163w(ColorStateList colorStateList) {
        boolean z;
        if (this.f1548h == null) {
            this.f1548h = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1548h;
        c0538l1.f1888a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c0538l1.f1891d = z;
        m40160z();
    }

    /* renamed from: x */
    public void m40162x(PorterDuff.Mode mode) {
        boolean z;
        if (this.f1548h == null) {
            this.f1548h = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1548h;
        c0538l1.f1889b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c0538l1.f1890c = z;
        m40160z();
    }
}