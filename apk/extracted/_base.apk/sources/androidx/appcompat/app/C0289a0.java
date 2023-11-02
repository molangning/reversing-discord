package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.C0357a;
import androidx.appcompat.view.C0364f;
import androidx.appcompat.view.C0367g;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.C0514f1;
import androidx.appcompat.widget.InterfaceC0534k0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1304n2;
import androidx.core.view.C1316p2;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1311o2;
import androidx.core.view.InterfaceC1321q2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p052d.C5706a;
import p052d.C5711f;
import p052d.C5715j;

/* renamed from: androidx.appcompat.app.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0289a0 extends ActionBar implements ActionBarOverlayLayout.InterfaceC0421d {

    /* renamed from: E */
    private static final Interpolator f937E = new AccelerateInterpolator();

    /* renamed from: F */
    private static final Interpolator f938F = new DecelerateInterpolator();

    /* renamed from: A */
    boolean f939A;

    /* renamed from: a */
    Context f943a;

    /* renamed from: b */
    private Context f944b;

    /* renamed from: c */
    private Activity f945c;

    /* renamed from: d */
    ActionBarOverlayLayout f946d;

    /* renamed from: e */
    ActionBarContainer f947e;

    /* renamed from: f */
    InterfaceC0534k0 f948f;

    /* renamed from: g */
    ActionBarContextView f949g;

    /* renamed from: h */
    View f950h;

    /* renamed from: i */
    C0514f1 f951i;

    /* renamed from: l */
    private boolean f954l;

    /* renamed from: m */
    C0293d f955m;

    /* renamed from: n */
    ActionMode f956n;

    /* renamed from: o */
    ActionMode.Callback f957o;

    /* renamed from: p */
    private boolean f958p;

    /* renamed from: r */
    private boolean f960r;

    /* renamed from: u */
    boolean f963u;

    /* renamed from: v */
    boolean f964v;

    /* renamed from: w */
    private boolean f965w;

    /* renamed from: y */
    C0367g f967y;

    /* renamed from: z */
    private boolean f968z;

    /* renamed from: j */
    private ArrayList<Object> f952j = new ArrayList<>();

    /* renamed from: k */
    private int f953k = -1;

    /* renamed from: q */
    private ArrayList<ActionBar.InterfaceC0275b> f959q = new ArrayList<>();

    /* renamed from: s */
    private int f961s = 0;

    /* renamed from: t */
    boolean f962t = true;

    /* renamed from: x */
    private boolean f966x = true;

    /* renamed from: B */
    final InterfaceC1311o2 f940B = new C0290a();

    /* renamed from: C */
    final InterfaceC1311o2 f941C = new C0291b();

    /* renamed from: D */
    final InterfaceC1321q2 f942D = new C0292c();

    /* renamed from: androidx.appcompat.app.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0290a extends C1316p2 {
        C0290a() {
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            View view2;
            C0289a0 c0289a0 = C0289a0.this;
            if (c0289a0.f962t && (view2 = c0289a0.f950h) != null) {
                view2.setTranslationY(0.0f);
                C0289a0.this.f947e.setTranslationY(0.0f);
            }
            C0289a0.this.f947e.setVisibility(8);
            C0289a0.this.f947e.setTransitioning(false);
            C0289a0 c0289a02 = C0289a0.this;
            c0289a02.f967y = null;
            c0289a02.m40718B();
            ActionBarOverlayLayout actionBarOverlayLayout = C0289a0.this.f946d;
            if (actionBarOverlayLayout != null) {
                C1365w0.m37191n0(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0291b extends C1316p2 {
        C0291b() {
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            C0289a0 c0289a0 = C0289a0.this;
            c0289a0.f967y = null;
            c0289a0.f947e.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.a0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0292c implements InterfaceC1321q2 {
        C0292c() {
        }

        @Override // androidx.core.view.InterfaceC1321q2
        /* renamed from: a */
        public void mo37345a(View view) {
            ((View) C0289a0.this.f947e.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.a0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0293d extends ActionMode implements C0389g.InterfaceC0390a {

        /* renamed from: l */
        private final Context f972l;

        /* renamed from: m */
        private final C0389g f973m;

        /* renamed from: n */
        private ActionMode.Callback f974n;

        /* renamed from: o */
        private WeakReference<View> f975o;

        public C0293d(Context context, ActionMode.Callback callback) {
            this.f972l = context;
            this.f974n = callback;
            C0389g m40380S = new C0389g(context).m40380S(1);
            this.f973m = m40380S;
            m40380S.mo40282R(this);
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: a */
        public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
            ActionMode.Callback callback = this.f974n;
            if (callback != null) {
                return callback.mo40463c(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: b */
        public void mo40034b(C0389g c0389g) {
            if (this.f974n == null) {
                return;
            }
            mo40473k();
            C0289a0.this.f949g.m40268l();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: c */
        public void mo40479c() {
            C0289a0 c0289a0 = C0289a0.this;
            if (c0289a0.f955m != this) {
                return;
            }
            if (!C0289a0.m40719A(c0289a0.f963u, c0289a0.f964v, false)) {
                C0289a0 c0289a02 = C0289a0.this;
                c0289a02.f956n = this;
                c0289a02.f957o = this.f974n;
            } else {
                this.f974n.mo40465a(this);
            }
            this.f974n = null;
            C0289a0.this.m40702z(false);
            C0289a0.this.f949g.m40273g();
            C0289a0 c0289a03 = C0289a0.this;
            c0289a03.f946d.setHideOnContentScrollEnabled(c0289a03.f939A);
            C0289a0.this.f955m = null;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: d */
        public View mo40478d() {
            WeakReference<View> weakReference = this.f975o;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: e */
        public Menu mo40477e() {
            return this.f973m;
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: f */
        public MenuInflater mo40476f() {
            return new C0364f(this.f972l);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: g */
        public CharSequence mo40475g() {
            return C0289a0.this.f949g.getSubtitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: i */
        public CharSequence mo40474i() {
            return C0289a0.this.f949g.getTitle();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: k */
        public void mo40473k() {
            if (C0289a0.this.f955m != this) {
                return;
            }
            this.f973m.m40365d0();
            try {
                this.f974n.mo40462d(this, this.f973m);
            } finally {
                this.f973m.m40367c0();
            }
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: l */
        public boolean mo40472l() {
            return C0289a0.this.f949g.m40270j();
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: m */
        public void mo40471m(View view) {
            C0289a0.this.f949g.setCustomView(view);
            this.f975o = new WeakReference<>(view);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: n */
        public void mo40470n(int i) {
            mo40469o(C0289a0.this.f943a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: o */
        public void mo40469o(CharSequence charSequence) {
            C0289a0.this.f949g.setSubtitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: q */
        public void mo40468q(int i) {
            mo40467r(C0289a0.this.f943a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: r */
        public void mo40467r(CharSequence charSequence) {
            C0289a0.this.f949g.setTitle(charSequence);
        }

        @Override // androidx.appcompat.view.ActionMode
        /* renamed from: s */
        public void mo40466s(boolean z) {
            super.mo40466s(z);
            C0289a0.this.f949g.setTitleOptional(z);
        }

        /* renamed from: t */
        public boolean m40701t() {
            this.f973m.m40365d0();
            try {
                return this.f974n.mo40464b(this, this.f973m);
            } finally {
                this.f973m.m40367c0();
            }
        }
    }

    public C0289a0(Activity activity, boolean z) {
        this.f945c = activity;
        View decorView = activity.getWindow().getDecorView();
        m40712H(decorView);
        if (z) {
            return;
        }
        this.f950h = decorView.findViewById(16908290);
    }

    /* renamed from: A */
    static boolean m40719A(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    /* renamed from: E */
    private InterfaceC0534k0 m40715E(View view) {
        String str;
        if (view instanceof InterfaceC0534k0) {
            return (InterfaceC0534k0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't make a decor toolbar out of ");
        if (view != null) {
            str = view.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: G */
    private void m40713G() {
        if (this.f965w) {
            this.f965w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f946d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m40704P(false);
        }
    }

    /* renamed from: H */
    private void m40712H(View view) {
        boolean z;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5711f.f16175q);
        this.f946d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f948f = m40715E(view.findViewById(C5711f.f16159a));
        this.f949g = (ActionBarContextView) view.findViewById(C5711f.f16165g);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5711f.f16161c);
        this.f947e = actionBarContainer;
        InterfaceC0534k0 interfaceC0534k0 = this.f948f;
        if (interfaceC0534k0 != null && this.f949g != null && actionBarContainer != null) {
            this.f943a = interfaceC0534k0.getContext();
            if ((this.f948f.mo39734u() & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f954l = true;
            }
            C0357a m40493b = C0357a.m40493b(this.f943a);
            if (!m40493b.m40494a() && !z) {
                z2 = false;
            } else {
                z2 = true;
            }
            m40707M(z2);
            m40709K(m40493b.m40488g());
            TypedArray obtainStyledAttributes = this.f943a.obtainStyledAttributes(null, C5715j.f16345a, C5706a.f16049c, 0);
            if (obtainStyledAttributes.getBoolean(C5715j.f16395k, false)) {
                m40708L(true);
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5715j.f16385i, 0);
            if (dimensionPixelSize != 0) {
                m40710J(dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
    }

    /* renamed from: K */
    private void m40709K(boolean z) {
        boolean z2;
        boolean z3;
        this.f960r = z;
        if (!z) {
            this.f948f.mo39737r(null);
            this.f947e.setTabContainer(this.f951i);
        } else {
            this.f947e.setTabContainer(null);
            this.f948f.mo39737r(this.f951i);
        }
        boolean z4 = true;
        if (m40714F() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0514f1 c0514f1 = this.f951i;
        if (c0514f1 != null) {
            if (z2) {
                c0514f1.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f946d;
                if (actionBarOverlayLayout != null) {
                    C1365w0.m37191n0(actionBarOverlayLayout);
                }
            } else {
                c0514f1.setVisibility(8);
            }
        }
        InterfaceC0534k0 interfaceC0534k0 = this.f948f;
        if (!this.f960r && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        interfaceC0534k0.mo39739p(z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f946d;
        if (this.f960r || !z2) {
            z4 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z4);
    }

    /* renamed from: N */
    private boolean m40706N() {
        return C1365w0.m37224U(this.f947e);
    }

    /* renamed from: O */
    private void m40705O() {
        if (!this.f965w) {
            this.f965w = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f946d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m40704P(false);
        }
    }

    /* renamed from: P */
    private void m40704P(boolean z) {
        if (m40719A(this.f963u, this.f964v, this.f965w)) {
            if (!this.f966x) {
                this.f966x = true;
                m40716D(z);
            }
        } else if (this.f966x) {
            this.f966x = false;
            m40717C(z);
        }
    }

    /* renamed from: B */
    void m40718B() {
        ActionMode.Callback callback = this.f957o;
        if (callback != null) {
            callback.mo40465a(this.f956n);
            this.f956n = null;
            this.f957o = null;
        }
    }

    /* renamed from: C */
    public void m40717C(boolean z) {
        View view;
        int[] iArr;
        C0367g c0367g = this.f967y;
        if (c0367g != null) {
            c0367g.m40447a();
        }
        if (this.f961s == 0 && (this.f968z || z)) {
            this.f947e.setAlpha(1.0f);
            this.f947e.setTransitioning(true);
            C0367g c0367g2 = new C0367g();
            float f = -this.f947e.getHeight();
            if (z) {
                this.f947e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            C1304n2 m37359m = C1365w0.m37210e(this.f947e).m37359m(f);
            m37359m.m37361k(this.f942D);
            c0367g2.m40445c(m37359m);
            if (this.f962t && (view = this.f950h) != null) {
                c0367g2.m40445c(C1365w0.m37210e(view).m37359m(f));
            }
            c0367g2.m40442f(f937E);
            c0367g2.m40443e(250L);
            c0367g2.m40441g(this.f940B);
            this.f967y = c0367g2;
            c0367g2.m40440h();
            return;
        }
        this.f940B.mo37354b(null);
    }

    /* renamed from: D */
    public void m40716D(boolean z) {
        View view;
        View view2;
        int[] iArr;
        C0367g c0367g = this.f967y;
        if (c0367g != null) {
            c0367g.m40447a();
        }
        this.f947e.setVisibility(0);
        if (this.f961s == 0 && (this.f968z || z)) {
            this.f947e.setTranslationY(0.0f);
            float f = -this.f947e.getHeight();
            if (z) {
                this.f947e.getLocationInWindow(new int[]{0, 0});
                f -= iArr[1];
            }
            this.f947e.setTranslationY(f);
            C0367g c0367g2 = new C0367g();
            C1304n2 m37359m = C1365w0.m37210e(this.f947e).m37359m(0.0f);
            m37359m.m37361k(this.f942D);
            c0367g2.m40445c(m37359m);
            if (this.f962t && (view2 = this.f950h) != null) {
                view2.setTranslationY(f);
                c0367g2.m40445c(C1365w0.m37210e(this.f950h).m37359m(0.0f));
            }
            c0367g2.m40442f(f938F);
            c0367g2.m40443e(250L);
            c0367g2.m40441g(this.f941C);
            this.f967y = c0367g2;
            c0367g2.m40440h();
        } else {
            this.f947e.setAlpha(1.0f);
            this.f947e.setTranslationY(0.0f);
            if (this.f962t && (view = this.f950h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f941C.mo37354b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f946d;
        if (actionBarOverlayLayout != null) {
            C1365w0.m37191n0(actionBarOverlayLayout);
        }
    }

    /* renamed from: F */
    public int m40714F() {
        return this.f948f.mo39744k();
    }

    /* renamed from: I */
    public void m40711I(int i, int i2) {
        int mo39734u = this.f948f.mo39734u();
        if ((i2 & 4) != 0) {
            this.f954l = true;
        }
        this.f948f.mo39746i((i & i2) | ((~i2) & mo39734u));
    }

    /* renamed from: J */
    public void m40710J(float f) {
        C1365w0.m37169y0(this.f947e, f);
    }

    /* renamed from: L */
    public void m40708L(boolean z) {
        if (z && !this.f946d.m40260q()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f939A = z;
        this.f946d.setHideOnContentScrollEnabled(z);
    }

    /* renamed from: M */
    public void m40707M(boolean z) {
        this.f948f.mo39741n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: a */
    public void mo40254a() {
        if (this.f964v) {
            this.f964v = false;
            m40704P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: b */
    public void mo40253b(int i) {
        this.f961s = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: c */
    public void mo40252c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: d */
    public void mo40251d(boolean z) {
        this.f962t = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: e */
    public void mo40250e() {
        if (!this.f964v) {
            this.f964v = true;
            m40704P(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0421d
    /* renamed from: f */
    public void mo40249f() {
        C0367g c0367g = this.f967y;
        if (c0367g != null) {
            c0367g.m40447a();
            this.f967y = null;
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo40524h() {
        InterfaceC0534k0 interfaceC0534k0 = this.f948f;
        if (interfaceC0534k0 != null && interfaceC0534k0.mo39747h()) {
            this.f948f.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo40523i(boolean z) {
        if (z == this.f958p) {
            return;
        }
        this.f958p = z;
        int size = this.f959q.size();
        for (int i = 0; i < size; i++) {
            this.f959q.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo40522j() {
        return this.f948f.mo39734u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo40521k() {
        if (this.f944b == null) {
            TypedValue typedValue = new TypedValue();
            this.f943a.getTheme().resolveAttribute(C5706a.f16053g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f944b = new ContextThemeWrapper(this.f943a, i);
            } else {
                this.f944b = this.f943a;
            }
        }
        return this.f944b;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo40519m(Configuration configuration) {
        m40709K(C0357a.m40493b(this.f943a).m40488g());
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo40517o(int i, KeyEvent keyEvent) {
        Menu mo40477e;
        int i2;
        C0293d c0293d = this.f955m;
        if (c0293d == null || (mo40477e = c0293d.mo40477e()) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        mo40477e.setQwertyMode(z);
        return mo40477e.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo40514r(boolean z) {
        if (!this.f954l) {
            mo40513s(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo40513s(boolean z) {
        m40711I(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo40512t(boolean z) {
        m40711I(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo40511u(Drawable drawable) {
        this.f948f.mo39732w(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo40510v(boolean z) {
        C0367g c0367g;
        this.f968z = z;
        if (!z && (c0367g = this.f967y) != null) {
            c0367g.m40447a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo40509w(CharSequence charSequence) {
        this.f948f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo40508x(CharSequence charSequence) {
        this.f948f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: y */
    public ActionMode mo40703y(ActionMode.Callback callback) {
        C0293d c0293d = this.f955m;
        if (c0293d != null) {
            c0293d.mo40479c();
        }
        this.f946d.setHideOnContentScrollEnabled(false);
        this.f949g.m40269k();
        C0293d c0293d2 = new C0293d(this.f949g.getContext(), callback);
        if (c0293d2.m40701t()) {
            this.f955m = c0293d2;
            c0293d2.mo40473k();
            this.f949g.m40272h(c0293d2);
            m40702z(true);
            return c0293d2;
        }
        return null;
    }

    /* renamed from: z */
    public void m40702z(boolean z) {
        C1304n2 mo39743l;
        C1304n2 mo40017f;
        if (z) {
            m40705O();
        } else {
            m40713G();
        }
        if (m40706N()) {
            if (z) {
                mo40017f = this.f948f.mo39743l(4, 100L);
                mo39743l = this.f949g.mo40017f(0, 200L);
            } else {
                mo39743l = this.f948f.mo39743l(0, 200L);
                mo40017f = this.f949g.mo40017f(8, 100L);
            }
            C0367g c0367g = new C0367g();
            c0367g.m40444d(mo40017f, mo39743l);
            c0367g.m40440h();
        } else if (z) {
            this.f948f.setVisibility(4);
            this.f949g.setVisibility(0);
        } else {
            this.f948f.setVisibility(0);
            this.f949g.setVisibility(8);
        }
    }

    public C0289a0(Dialog dialog) {
        m40712H(dialog.getWindow().getDecorView());
    }
}
