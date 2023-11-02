package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.C1365w0;
import androidx.core.widget.C1427g;
import p052d.C5715j;
import p071e.C6029a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class AppCompatImageHelper {

    /* renamed from: a */
    private final ImageView f1534a;

    /* renamed from: b */
    private C0538l1 f1535b;

    /* renamed from: c */
    private C0538l1 f1536c;

    /* renamed from: d */
    private C0538l1 f1537d;

    /* renamed from: e */
    private int f1538e = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f1534a = imageView;
    }

    /* renamed from: a */
    private boolean m40203a(Drawable drawable) {
        if (this.f1537d == null) {
            this.f1537d = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1537d;
        c0538l1.m39805a();
        ColorStateList m36903a = C1427g.m36903a(this.f1534a);
        if (m36903a != null) {
            c0538l1.f1891d = true;
            c0538l1.f1888a = m36903a;
        }
        PorterDuff.Mode m36902b = C1427g.m36902b(this.f1534a);
        if (m36902b != null) {
            c0538l1.f1890c = true;
            c0538l1.f1889b = m36902b;
        }
        if (!c0538l1.f1891d && !c0538l1.f1890c) {
            return false;
        }
        C0529j.m39832i(drawable, c0538l1, this.f1534a.getDrawableState());
        return true;
    }

    /* renamed from: l */
    private boolean m40192l() {
        return this.f1535b != null;
    }

    /* renamed from: b */
    public void m40202b() {
        if (this.f1534a.getDrawable() != null) {
            this.f1534a.getDrawable().setLevel(this.f1538e);
        }
    }

    /* renamed from: c */
    public void m40201c() {
        Drawable drawable = this.f1534a.getDrawable();
        if (drawable != null) {
            C0550p0.m39769b(drawable);
        }
        if (drawable != null) {
            if (m40192l() && m40203a(drawable)) {
                return;
            }
            C0538l1 c0538l1 = this.f1536c;
            if (c0538l1 != null) {
                C0529j.m39832i(drawable, c0538l1, this.f1534a.getDrawableState());
                return;
            }
            C0538l1 c0538l12 = this.f1535b;
            if (c0538l12 != null) {
                C0529j.m39832i(drawable, c0538l12, this.f1534a.getDrawableState());
            }
        }
    }

    /* renamed from: d */
    public ColorStateList m40200d() {
        C0538l1 c0538l1 = this.f1536c;
        if (c0538l1 != null) {
            return c0538l1.f1888a;
        }
        return null;
    }

    /* renamed from: e */
    public PorterDuff.Mode m40199e() {
        C0538l1 c0538l1 = this.f1536c;
        if (c0538l1 != null) {
            return c0538l1.f1889b;
        }
        return null;
    }

    /* renamed from: f */
    public boolean m40198f() {
        if (this.f1534a.getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void m40197g(AttributeSet attributeSet, int i) {
        int m39788n;
        Context context = this.f1534a.getContext();
        int[] iArr = C5715j.f16298P;
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1534a;
        C1365w0.m37189o0(imageView, imageView.getContext(), iArr, attributeSet, m39780v.m39784r(), i, 0);
        try {
            Drawable drawable = this.f1534a.getDrawable();
            if (drawable == null && (m39788n = m39780v.m39788n(C5715j.f16303Q, -1)) != -1 && (drawable = C6029a.m23853b(this.f1534a.getContext(), m39788n)) != null) {
                this.f1534a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0550p0.m39769b(drawable);
            }
            int i2 = C5715j.f16308R;
            if (m39780v.m39783s(i2)) {
                C1427g.m36901c(this.f1534a, m39780v.m39799c(i2));
            }
            int i3 = C5715j.f16313S;
            if (m39780v.m39783s(i3)) {
                C1427g.m36900d(this.f1534a, C0550p0.m39766e(m39780v.m39791k(i3, -1), null));
            }
        } finally {
            m39780v.m39779w();
        }
    }

    /* renamed from: h */
    public void m40196h(Drawable drawable) {
        this.f1538e = drawable.getLevel();
    }

    /* renamed from: i */
    public void m40195i(int i) {
        if (i != 0) {
            Drawable m23853b = C6029a.m23853b(this.f1534a.getContext(), i);
            if (m23853b != null) {
                C0550p0.m39769b(m23853b);
            }
            this.f1534a.setImageDrawable(m23853b);
        } else {
            this.f1534a.setImageDrawable(null);
        }
        m40201c();
    }

    /* renamed from: j */
    public void m40194j(ColorStateList colorStateList) {
        if (this.f1536c == null) {
            this.f1536c = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1536c;
        c0538l1.f1888a = colorStateList;
        c0538l1.f1891d = true;
        m40201c();
    }

    /* renamed from: k */
    public void m40193k(PorterDuff.Mode mode) {
        if (this.f1536c == null) {
            this.f1536c = new C0538l1();
        }
        C0538l1 c0538l1 = this.f1536c;
        c0538l1.f1889b = mode;
        c0538l1.f1890c = true;
        m40201c();
    }
}