package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1365w0;
import p052d.C5715j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AppCompatBackgroundHelper {

    /* renamed from: a */
    private final View f1523a;

    /* renamed from: d */
    private C0538l1 f1526d;

    /* renamed from: e */
    private C0538l1 f1527e;

    /* renamed from: f */
    private C0538l1 f1528f;

    /* renamed from: c */
    private int f1525c = -1;

    /* renamed from: b */
    private final C0529j f1524b = C0529j.m39839b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppCompatBackgroundHelper(View view) {
        this.f1523a = view;
    }

    /* renamed from: a */
    private boolean m40228a(Drawable drawable) {
        if (this.f1528f == null) {
            this.f1528f = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1528f;
        c0538l1.m39805a();
        ColorStateList m37182s = C1365w0.m37182s(this.f1523a);
        if (m37182s != null) {
            c0538l1.f1891d = true;
            c0538l1.f1888a = m37182s;
        }
        PorterDuff.Mode m37180t = C1365w0.m37180t(this.f1523a);
        if (m37180t != null) {
            c0538l1.f1890c = true;
            c0538l1.f1889b = m37180t;
        }
        if (!c0538l1.f1891d && !c0538l1.f1890c) {
            return false;
        }
        C0529j.m39832i(drawable, c0538l1, this.f1523a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m40218k() {
        return this.f1526d != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m40227b() {
        Drawable background = this.f1523a.getBackground();
        if (background != null) {
            if (m40218k() && m40228a(background)) {
                return;
            }
            C0538l1 c0538l1 = this.f1527e;
            if (c0538l1 != null) {
                C0529j.m39832i(background, c0538l1, this.f1523a.getDrawableState());
                return;
            }
            C0538l1 c0538l12 = this.f1526d;
            if (c0538l12 != null) {
                C0529j.m39832i(background, c0538l12, this.f1523a.getDrawableState());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList m40226c() {
        C0538l1 c0538l1 = this.f1527e;
        if (c0538l1 != null) {
            return c0538l1.f1888a;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode m40225d() {
        C0538l1 c0538l1 = this.f1527e;
        if (c0538l1 != null) {
            return c0538l1.f1889b;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m40224e(AttributeSet attributeSet, int i) {
        Context context = this.f1523a.getContext();
        int[] iArr = C5715j.f16277K3;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        View view = this.f1523a;
        C1365w0.m37189o0(view, view.getContext(), iArr, attributeSet, m39780v.m39784r(), i, 0);
        try {
            int i2 = C5715j.f16282L3;
            if (m39780v.m39783s(i2)) {
                this.f1525c = m39780v.m39788n(i2, -1);
                ColorStateList m39835f = this.f1524b.m39835f(this.f1523a.getContext(), this.f1525c);
                if (m39835f != null) {
                    m40221h(m39835f);
                }
            }
            int i3 = C5715j.f16287M3;
            if (m39780v.m39783s(i3)) {
                C1365w0.m37175v0(this.f1523a, m39780v.m39799c(i3));
            }
            int i4 = C5715j.f16292N3;
            if (m39780v.m39783s(i4)) {
                C1365w0.m37173w0(this.f1523a, C0550p0.m39766e(m39780v.m39791k(i4, -1), null));
            }
        } finally {
            m39780v.m39779w();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m40223f(Drawable drawable) {
        this.f1525c = -1;
        m40221h(null);
        m40227b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m40222g(int i) {
        ColorStateList colorStateList;
        this.f1525c = i;
        C0529j c0529j = this.f1524b;
        if (c0529j != null) {
            colorStateList = c0529j.m39835f(this.f1523a.getContext(), i);
        } else {
            colorStateList = null;
        }
        m40221h(colorStateList);
        m40227b();
    }

    /* renamed from: h */
    void m40221h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1526d == null) {
                this.f1526d = new C0538l1();
            }
            C0538l1 c0538l1 = this.f1526d;
            c0538l1.f1888a = colorStateList;
            c0538l1.f1891d = true;
        } else {
            this.f1526d = null;
        }
        m40227b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m40220i(ColorStateList colorStateList) {
        if (this.f1527e == null) {
            this.f1527e = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1527e;
        c0538l1.f1888a = colorStateList;
        c0538l1.f1891d = true;
        m40227b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m40219j(PorterDuff.Mode mode) {
        if (this.f1527e == null) {
            this.f1527e = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1527e;
        c0538l1.f1889b = mode;
        c0538l1.f1890c = true;
        m40227b();
    }
}
