package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.C0377a;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1304n2;
import androidx.core.view.C1316p2;
import androidx.core.view.C1365w0;
import p052d.C5706a;
import p052d.C5710e;
import p052d.C5711f;
import p052d.C5713h;
import p052d.C5715j;
import p071e.C6029a;

/* renamed from: androidx.appcompat.widget.q1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0556q1 implements InterfaceC0534k0 {

    /* renamed from: a */
    Toolbar f1920a;

    /* renamed from: b */
    private int f1921b;

    /* renamed from: c */
    private View f1922c;

    /* renamed from: d */
    private View f1923d;

    /* renamed from: e */
    private Drawable f1924e;

    /* renamed from: f */
    private Drawable f1925f;

    /* renamed from: g */
    private Drawable f1926g;

    /* renamed from: h */
    private boolean f1927h;

    /* renamed from: i */
    CharSequence f1928i;

    /* renamed from: j */
    private CharSequence f1929j;

    /* renamed from: k */
    private CharSequence f1930k;

    /* renamed from: l */
    Window.Callback f1931l;

    /* renamed from: m */
    boolean f1932m;

    /* renamed from: n */
    private C0483c f1933n;

    /* renamed from: o */
    private int f1934o;

    /* renamed from: p */
    private int f1935p;

    /* renamed from: q */
    private Drawable f1936q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.q1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC0557a implements View.OnClickListener {

        /* renamed from: j */
        final C0377a f1937j;

        View$OnClickListenerC0557a() {
            C0556q1.this = r9;
            this.f1937j = new C0377a(r9.f1920a.getContext(), 0, 16908332, 0, 0, r9.f1928i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0556q1 c0556q1 = C0556q1.this;
            Window.Callback callback = c0556q1.f1931l;
            if (callback != null && c0556q1.f1932m) {
                callback.onMenuItemSelected(0, this.f1937j);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0558b extends C1316p2 {

        /* renamed from: a */
        private boolean f1939a = false;

        /* renamed from: b */
        final /* synthetic */ int f1940b;

        C0558b(int i) {
            C0556q1.this = r1;
            this.f1940b = i;
        }

        @Override // androidx.core.view.C1316p2, androidx.core.view.InterfaceC1311o2
        /* renamed from: a */
        public void mo37350a(View view) {
            this.f1939a = true;
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            if (!this.f1939a) {
                C0556q1.this.f1920a.setVisibility(this.f1940b);
            }
        }

        @Override // androidx.core.view.C1316p2, androidx.core.view.InterfaceC1311o2
        /* renamed from: c */
        public void mo37349c(View view) {
            C0556q1.this.f1920a.setVisibility(0);
        }
    }

    public C0556q1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C5713h.f16205a, C5710e.f16129n);
    }

    /* renamed from: E */
    private void m39758E(CharSequence charSequence) {
        this.f1928i = charSequence;
        if ((this.f1921b & 8) != 0) {
            this.f1920a.setTitle(charSequence);
            if (this.f1927h) {
                C1365w0.m37179t0(this.f1920a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: F */
    private void m39757F() {
        if ((this.f1921b & 4) != 0) {
            if (TextUtils.isEmpty(this.f1930k)) {
                this.f1920a.setNavigationContentDescription(this.f1935p);
            } else {
                this.f1920a.setNavigationContentDescription(this.f1930k);
            }
        }
    }

    /* renamed from: G */
    private void m39756G() {
        if ((this.f1921b & 4) != 0) {
            Toolbar toolbar = this.f1920a;
            Drawable drawable = this.f1926g;
            if (drawable == null) {
                drawable = this.f1936q;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1920a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: H */
    private void m39755H() {
        Drawable drawable;
        int i = this.f1921b;
        if ((i & 2) != 0) {
            if ((i & 1) != 0) {
                drawable = this.f1925f;
                if (drawable == null) {
                    drawable = this.f1924e;
                }
            } else {
                drawable = this.f1924e;
            }
        } else {
            drawable = null;
        }
        this.f1920a.setLogo(drawable);
    }

    /* renamed from: x */
    private int m39731x() {
        if (this.f1920a.getNavigationIcon() != null) {
            this.f1936q = this.f1920a.getNavigationIcon();
            return 15;
        }
        return 11;
    }

    /* renamed from: A */
    public void m39762A(Drawable drawable) {
        this.f1925f = drawable;
        m39755H();
    }

    /* renamed from: B */
    public void m39761B(int i) {
        m39760C(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: C */
    public void m39760C(CharSequence charSequence) {
        this.f1930k = charSequence;
        m39757F();
    }

    /* renamed from: D */
    public void m39759D(CharSequence charSequence) {
        this.f1929j = charSequence;
        if ((this.f1921b & 8) != 0) {
            this.f1920a.setSubtitle(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: a */
    public boolean mo39754a() {
        return this.f1920a.m40058d();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: b */
    public boolean mo39753b() {
        return this.f1920a.m40039w();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: c */
    public boolean mo39752c() {
        return this.f1920a.m40063Q();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void collapseActionView() {
        this.f1920a.m40057e();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: d */
    public void mo39751d(Menu menu, InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        if (this.f1933n == null) {
            C0483c c0483c = new C0483c(this.f1920a.getContext());
            this.f1933n = c0483c;
            c0483c.m40415p(C5711f.f16166h);
        }
        this.f1933n.mo40296c(interfaceC0406a);
        this.f1920a.m40069K((C0389g) menu, this.f1933n);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: e */
    public boolean mo39750e() {
        return this.f1920a.m40078B();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: f */
    public void mo39749f() {
        this.f1932m = true;
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: g */
    public boolean mo39748g() {
        return this.f1920a.m40079A();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public Context getContext() {
        return this.f1920a.getContext();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public CharSequence getTitle() {
        return this.f1920a.getTitle();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: h */
    public boolean mo39747h() {
        return this.f1920a.m40040v();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: i */
    public void mo39746i(int i) {
        View view;
        int i2 = this.f1921b ^ i;
        this.f1921b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m39757F();
                }
                m39756G();
            }
            if ((i2 & 3) != 0) {
                m39755H();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1920a.setTitle(this.f1928i);
                    this.f1920a.setSubtitle(this.f1929j);
                } else {
                    this.f1920a.setTitle((CharSequence) null);
                    this.f1920a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1923d) != null) {
                if ((i & 16) != 0) {
                    this.f1920a.addView(view);
                } else {
                    this.f1920a.removeView(view);
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: j */
    public Menu mo39745j() {
        return this.f1920a.getMenu();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: k */
    public int mo39744k() {
        return this.f1934o;
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: l */
    public C1304n2 mo39743l(int i, long j) {
        float f;
        C1304n2 m37210e = C1365w0.m37210e(this.f1920a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return m37210e.m37370b(f).m37366f(j).m37364h(new C0558b(i));
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: m */
    public ViewGroup mo39742m() {
        return this.f1920a;
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: n */
    public void mo39741n(boolean z) {
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: o */
    public void mo39740o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: p */
    public void mo39739p(boolean z) {
        this.f1920a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: q */
    public void mo39738q() {
        this.f1920a.m40056f();
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: r */
    public void mo39737r(C0514f1 c0514f1) {
        View view = this.f1922c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1920a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1922c);
            }
        }
        this.f1922c = c0514f1;
        if (c0514f1 != null && this.f1934o == 2) {
            this.f1920a.addView(c0514f1, 0);
            Toolbar.C0466g c0466g = (Toolbar.C0466g) this.f1922c.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0466g).width = -2;
            ((ViewGroup.MarginLayoutParams) c0466g).height = -2;
            c0466g.f822a = 8388691;
            c0514f1.setAllowCollapse(true);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: s */
    public void mo39736s(int i) {
        m39762A(i != 0 ? C6029a.m23853b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setIcon(int i) {
        setIcon(i != 0 ? C6029a.m23853b(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setTitle(CharSequence charSequence) {
        this.f1927h = true;
        m39758E(charSequence);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setVisibility(int i) {
        this.f1920a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setWindowCallback(Window.Callback callback) {
        this.f1931l = callback;
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1927h) {
            m39758E(charSequence);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: t */
    public void mo39735t(InterfaceC0405m.InterfaceC0406a interfaceC0406a, C0389g.InterfaceC0390a interfaceC0390a) {
        this.f1920a.m40068L(interfaceC0406a, interfaceC0390a);
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: u */
    public int mo39734u() {
        return this.f1921b;
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: v */
    public void mo39733v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    /* renamed from: w */
    public void mo39732w(Drawable drawable) {
        this.f1926g = drawable;
        m39756G();
    }

    /* renamed from: y */
    public void m39730y(View view) {
        View view2 = this.f1923d;
        if (view2 != null && (this.f1921b & 16) != 0) {
            this.f1920a.removeView(view2);
        }
        this.f1923d = view;
        if (view != null && (this.f1921b & 16) != 0) {
            this.f1920a.addView(view);
        }
    }

    /* renamed from: z */
    public void m39729z(int i) {
        if (i == this.f1935p) {
            return;
        }
        this.f1935p = i;
        if (TextUtils.isEmpty(this.f1920a.getNavigationContentDescription())) {
            m39761B(this.f1935p);
        }
    }

    public C0556q1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f1934o = 0;
        this.f1935p = 0;
        this.f1920a = toolbar;
        this.f1928i = toolbar.getTitle();
        this.f1929j = toolbar.getSubtitle();
        this.f1927h = this.f1928i != null;
        this.f1926g = toolbar.getNavigationIcon();
        C0544n1 m39780v = C0544n1.m39780v(toolbar.getContext(), null, C5715j.f16345a, C5706a.f16049c, 0);
        this.f1936q = m39780v.m39795g(C5715j.f16400l);
        if (z) {
            CharSequence m39786p = m39780v.m39786p(C5715j.f16430r);
            if (!TextUtils.isEmpty(m39786p)) {
                setTitle(m39786p);
            }
            CharSequence m39786p2 = m39780v.m39786p(C5715j.f16420p);
            if (!TextUtils.isEmpty(m39786p2)) {
                m39759D(m39786p2);
            }
            Drawable m39795g = m39780v.m39795g(C5715j.f16410n);
            if (m39795g != null) {
                m39762A(m39795g);
            }
            Drawable m39795g2 = m39780v.m39795g(C5715j.f16405m);
            if (m39795g2 != null) {
                setIcon(m39795g2);
            }
            if (this.f1926g == null && (drawable = this.f1936q) != null) {
                mo39732w(drawable);
            }
            mo39746i(m39780v.m39791k(C5715j.f16380h, 0));
            int m39788n = m39780v.m39788n(C5715j.f16375g, 0);
            if (m39788n != 0) {
                m39730y(LayoutInflater.from(this.f1920a.getContext()).inflate(m39788n, (ViewGroup) this.f1920a, false));
                mo39746i(this.f1921b | 16);
            }
            int m39789m = m39780v.m39789m(C5715j.f16390j, 0);
            if (m39789m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1920a.getLayoutParams();
                layoutParams.height = m39789m;
                this.f1920a.setLayoutParams(layoutParams);
            }
            int m39797e = m39780v.m39797e(C5715j.f16370f, -1);
            int m39797e2 = m39780v.m39797e(C5715j.f16365e, -1);
            if (m39797e >= 0 || m39797e2 >= 0) {
                this.f1920a.m40070J(Math.max(m39797e, 0), Math.max(m39797e2, 0));
            }
            int m39788n2 = m39780v.m39788n(C5715j.f16435s, 0);
            if (m39788n2 != 0) {
                Toolbar toolbar2 = this.f1920a;
                toolbar2.m40066N(toolbar2.getContext(), m39788n2);
            }
            int m39788n3 = m39780v.m39788n(C5715j.f16425q, 0);
            if (m39788n3 != 0) {
                Toolbar toolbar3 = this.f1920a;
                toolbar3.m40067M(toolbar3.getContext(), m39788n3);
            }
            int m39788n4 = m39780v.m39788n(C5715j.f16415o, 0);
            if (m39788n4 != 0) {
                this.f1920a.setPopupTheme(m39788n4);
            }
        } else {
            this.f1921b = m39731x();
        }
        m39780v.m39779w();
        m39729z(i);
        this.f1930k = this.f1920a.getNavigationContentDescription();
        this.f1920a.setNavigationOnClickListener(new View$OnClickListenerC0557a());
    }

    @Override // androidx.appcompat.widget.InterfaceC0534k0
    public void setIcon(Drawable drawable) {
        this.f1924e = drawable;
        m39755H();
    }
}