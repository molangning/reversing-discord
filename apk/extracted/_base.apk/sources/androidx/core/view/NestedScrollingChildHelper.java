package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class NestedScrollingChildHelper {

    /* renamed from: a */
    private ViewParent f3533a;

    /* renamed from: b */
    private ViewParent f3534b;

    /* renamed from: c */
    private final View f3535c;

    /* renamed from: d */
    private boolean f3536d;

    /* renamed from: e */
    private int[] f3537e;

    public NestedScrollingChildHelper(View view) {
        this.f3535c = view;
    }

    /* renamed from: h */
    private boolean m37763h(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m37762i;
        int i6;
        int i7;
        int[] iArr3;
        if (!m37758m() || (m37762i = m37762i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f3535c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            int[] m37761j = m37761j();
            m37761j[0] = 0;
            m37761j[1] = 0;
            iArr3 = m37761j;
        } else {
            iArr3 = iArr2;
        }
        C1292l2.m37409d(m37762i, this.f3535c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.f3535c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: i */
    private ViewParent m37762i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f3534b;
        }
        return this.f3533a;
    }

    /* renamed from: j */
    private int[] m37761j() {
        if (this.f3537e == null) {
            this.f3537e = new int[2];
        }
        return this.f3537e;
    }

    /* renamed from: o */
    private void m37756o(int i, ViewParent viewParent) {
        if (i != 0) {
            if (i == 1) {
                this.f3534b = viewParent;
                return;
            }
            return;
        }
        this.f3533a = viewParent;
    }

    /* renamed from: a */
    public boolean m37770a(float f, float f2, boolean z) {
        ViewParent m37762i;
        if (!m37758m() || (m37762i = m37762i(0)) == null) {
            return false;
        }
        return C1292l2.m37412a(m37762i, this.f3535c, f, f2, z);
    }

    /* renamed from: b */
    public boolean m37769b(float f, float f2) {
        ViewParent m37762i;
        if (!m37758m() || (m37762i = m37762i(0)) == null) {
            return false;
        }
        return C1292l2.m37411b(m37762i, this.f3535c, f, f2);
    }

    /* renamed from: c */
    public boolean m37768c(int i, int i2, int[] iArr, int[] iArr2) {
        return m37767d(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: d */
    public boolean m37767d(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m37762i;
        int i4;
        int i5;
        if (!m37758m() || (m37762i = m37762i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f3535c.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            iArr = m37761j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        C1292l2.m37410c(m37762i, this.f3535c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.f3535c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void m37766e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m37763h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: f */
    public boolean m37765f(int i, int i2, int i3, int i4, int[] iArr) {
        return m37763h(i, i2, i3, i4, iArr, 0, null);
    }

    /* renamed from: g */
    public boolean m37764g(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m37763h(i, i2, i3, i4, iArr, i5, null);
    }

    /* renamed from: k */
    public boolean m37760k() {
        return m37759l(0);
    }

    /* renamed from: l */
    public boolean m37759l(int i) {
        return m37762i(i) != null;
    }

    /* renamed from: m */
    public boolean m37758m() {
        return this.f3536d;
    }

    /* renamed from: n */
    public void m37757n(boolean z) {
        if (this.f3536d) {
            C1365w0.m37229P0(this.f3535c);
        }
        this.f3536d = z;
    }

    /* renamed from: p */
    public boolean m37755p(int i) {
        return m37754q(i, 0);
    }

    /* renamed from: q */
    public boolean m37754q(int i, int i2) {
        if (m37759l(i2)) {
            return true;
        }
        if (m37758m()) {
            View view = this.f3535c;
            for (ViewParent parent = this.f3535c.getParent(); parent != null; parent = parent.getParent()) {
                if (C1292l2.m37407f(parent, view, this.f3535c, i, i2)) {
                    m37756o(i2, parent);
                    C1292l2.m37408e(parent, view, this.f3535c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: r */
    public void m37753r() {
        m37752s(0);
    }

    /* renamed from: s */
    public void m37752s(int i) {
        ViewParent m37762i = m37762i(i);
        if (m37762i != null) {
            C1292l2.m37406g(m37762i, this.f3535c, i);
            m37756o(i, null);
        }
    }
}
