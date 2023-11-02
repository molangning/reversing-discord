package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.LayoutInflater$Factory2C0300f;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.widget.C0556q1;
import androidx.appcompat.widget.InterfaceC0534k0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.C1138f;
import androidx.core.view.C1365w0;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0348x extends ActionBar {

    /* renamed from: a */
    final InterfaceC0534k0 f1112a;

    /* renamed from: b */
    final Window.Callback f1113b;

    /* renamed from: c */
    final LayoutInflater$Factory2C0300f.InterfaceC0308g f1114c;

    /* renamed from: d */
    boolean f1115d;

    /* renamed from: e */
    private boolean f1116e;

    /* renamed from: f */
    private boolean f1117f;

    /* renamed from: g */
    private ArrayList<ActionBar.InterfaceC0275b> f1118g = new ArrayList<>();

    /* renamed from: h */
    private final Runnable f1119h = new RunnableC0349a();

    /* renamed from: i */
    private final Toolbar.InterfaceC0467h f1120i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.x$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0349a implements Runnable {
        RunnableC0349a() {
            C0348x.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0348x.this.m40527A();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.x$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0350b implements Toolbar.InterfaceC0467h {
        C0350b() {
            C0348x.this = r1;
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC0467h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0348x.this.f1113b.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.x$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0351c implements InterfaceC0405m.InterfaceC0406a {

        /* renamed from: j */
        private boolean f1123j;

        C0351c() {
            C0348x.this = r1;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: a */
        public void mo39969a(C0389g c0389g, boolean z) {
            if (this.f1123j) {
                return;
            }
            this.f1123j = true;
            C0348x.this.f1112a.mo39738q();
            C0348x.this.f1113b.onPanelClosed(108, c0389g);
            this.f1123j = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: b */
        public boolean mo39968b(C0389g c0389g) {
            C0348x.this.f1113b.onMenuOpened(108, c0389g);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.x$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0352d implements C0389g.InterfaceC0390a {
        C0352d() {
            C0348x.this = r1;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: a */
        public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: b */
        public void mo40034b(C0389g c0389g) {
            if (C0348x.this.f1112a.mo39750e()) {
                C0348x.this.f1113b.onPanelClosed(108, c0389g);
            } else if (C0348x.this.f1113b.onPreparePanel(0, null, c0389g)) {
                C0348x.this.f1113b.onMenuOpened(108, c0389g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.x$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0353e implements LayoutInflater$Factory2C0300f.InterfaceC0308g {
        C0353e() {
            C0348x.this = r1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.InterfaceC0308g
        /* renamed from: a */
        public boolean mo40506a(int i) {
            if (i == 0) {
                C0348x c0348x = C0348x.this;
                if (!c0348x.f1115d) {
                    c0348x.f1112a.mo39749f();
                    C0348x.this.f1115d = true;
                    return false;
                }
                return false;
            }
            return false;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.InterfaceC0308g
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0348x.this.f1112a.getContext());
            }
            return null;
        }
    }

    public C0348x(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        C0350b c0350b = new C0350b();
        this.f1120i = c0350b;
        C1138f.m37824f(toolbar);
        C0556q1 c0556q1 = new C0556q1(toolbar, false);
        this.f1112a = c0556q1;
        this.f1113b = (Window.Callback) C1138f.m37824f(callback);
        c0556q1.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(c0350b);
        c0556q1.setWindowTitle(charSequence);
        this.f1114c = new C0353e();
    }

    /* renamed from: z */
    private Menu m40507z() {
        if (!this.f1116e) {
            this.f1112a.mo39735t(new C0351c(), new C0352d());
            this.f1116e = true;
        }
        return this.f1112a.mo39745j();
    }

    /* renamed from: A */
    void m40527A() {
        C0389g c0389g;
        Menu m40507z = m40507z();
        if (m40507z instanceof C0389g) {
            c0389g = (C0389g) m40507z;
        } else {
            c0389g = null;
        }
        if (c0389g != null) {
            c0389g.m40365d0();
        }
        try {
            m40507z.clear();
            if (!this.f1113b.onCreatePanelMenu(0, m40507z) || !this.f1113b.onPreparePanel(0, null, m40507z)) {
                m40507z.clear();
            }
        } finally {
            if (c0389g != null) {
                c0389g.m40367c0();
            }
        }
    }

    /* renamed from: B */
    public void m40526B(int i, int i2) {
        this.f1112a.mo39746i((i & i2) | ((~i2) & this.f1112a.mo39734u()));
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: g */
    public boolean mo40525g() {
        return this.f1112a.mo39753b();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: h */
    public boolean mo40524h() {
        if (this.f1112a.mo39747h()) {
            this.f1112a.collapseActionView();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: i */
    public void mo40523i(boolean z) {
        if (z == this.f1117f) {
            return;
        }
        this.f1117f = z;
        int size = this.f1118g.size();
        for (int i = 0; i < size; i++) {
            this.f1118g.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: j */
    public int mo40522j() {
        return this.f1112a.mo39734u();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: k */
    public Context mo40521k() {
        return this.f1112a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: l */
    public boolean mo40520l() {
        this.f1112a.mo39742m().removeCallbacks(this.f1119h);
        C1365w0.m37201i0(this.f1112a.mo39742m(), this.f1119h);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: m */
    public void mo40519m(Configuration configuration) {
        super.mo40519m(configuration);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: n */
    public void mo40518n() {
        this.f1112a.mo39742m().removeCallbacks(this.f1119h);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: o */
    public boolean mo40517o(int i, KeyEvent keyEvent) {
        int i2;
        Menu m40507z = m40507z();
        if (m40507z == null) {
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
        m40507z.setQwertyMode(z);
        return m40507z.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: p */
    public boolean mo40516p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo40515q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: q */
    public boolean mo40515q() {
        return this.f1112a.mo39752c();
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: r */
    public void mo40514r(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: s */
    public void mo40513s(boolean z) {
        m40526B(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: t */
    public void mo40512t(boolean z) {
        m40526B(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: u */
    public void mo40511u(Drawable drawable) {
        this.f1112a.mo39732w(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: v */
    public void mo40510v(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: w */
    public void mo40509w(CharSequence charSequence) {
        this.f1112a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    /* renamed from: x */
    public void mo40508x(CharSequence charSequence) {
        this.f1112a.setWindowTitle(charSequence);
    }
}