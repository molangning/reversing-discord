package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.widget.C0474a1;
import androidx.core.view.C1365w0;
import p052d.C5709d;
import p052d.C5712g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class View$OnKeyListenerC0411q extends AbstractC0401k implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: E */
    private static final int f1418E = C5712g.f16197m;

    /* renamed from: A */
    private boolean f1419A;

    /* renamed from: B */
    private int f1420B;

    /* renamed from: D */
    private boolean f1422D;

    /* renamed from: k */
    private final Context f1423k;

    /* renamed from: l */
    private final C0389g f1424l;

    /* renamed from: m */
    private final C0388f f1425m;

    /* renamed from: n */
    private final boolean f1426n;

    /* renamed from: o */
    private final int f1427o;

    /* renamed from: p */
    private final int f1428p;

    /* renamed from: q */
    private final int f1429q;

    /* renamed from: r */
    final C0474a1 f1430r;

    /* renamed from: u */
    private PopupWindow.OnDismissListener f1433u;

    /* renamed from: v */
    private View f1434v;

    /* renamed from: w */
    View f1435w;

    /* renamed from: x */
    private InterfaceC0405m.InterfaceC0406a f1436x;

    /* renamed from: y */
    ViewTreeObserver f1437y;

    /* renamed from: z */
    private boolean f1438z;

    /* renamed from: s */
    final ViewTreeObserver.OnGlobalLayoutListener f1431s = new ViewTreeObserver$OnGlobalLayoutListenerC0412a();

    /* renamed from: t */
    private final View.OnAttachStateChangeListener f1432t = new View$OnAttachStateChangeListenerC0413b();

    /* renamed from: C */
    private int f1421C = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC0412a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0412a() {
            View$OnKeyListenerC0411q.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC0411q.this.isShowing() && !View$OnKeyListenerC0411q.this.f1430r.m39627z()) {
                View view = View$OnKeyListenerC0411q.this.f1435w;
                if (view != null && view.isShown()) {
                    View$OnKeyListenerC0411q.this.f1430r.show();
                } else {
                    View$OnKeyListenerC0411q.this.dismiss();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnAttachStateChangeListenerC0413b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0413b() {
            View$OnKeyListenerC0411q.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0411q.this.f1437y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0411q.this.f1437y = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0411q view$OnKeyListenerC0411q = View$OnKeyListenerC0411q.this;
                view$OnKeyListenerC0411q.f1437y.removeGlobalOnLayoutListener(view$OnKeyListenerC0411q.f1431s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public View$OnKeyListenerC0411q(Context context, C0389g c0389g, View view, int i, int i2, boolean z) {
        this.f1423k = context;
        this.f1424l = c0389g;
        this.f1426n = z;
        this.f1425m = new C0388f(c0389g, LayoutInflater.from(context), z, f1418E);
        this.f1428p = i;
        this.f1429q = i2;
        Resources resources = context.getResources();
        this.f1427o = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5709d.f16085d));
        this.f1434v = view;
        this.f1430r = new C0474a1(context, null, i, i2);
        c0389g.m40368c(this, context);
    }

    /* renamed from: x */
    private boolean m40287x() {
        View view;
        boolean z;
        if (isShowing()) {
            return true;
        }
        if (this.f1438z || (view = this.f1434v) == null) {
            return false;
        }
        this.f1435w = view;
        this.f1430r.m39652I(this);
        this.f1430r.m39651J(this);
        this.f1430r.m39653H(true);
        View view2 = this.f1435w;
        if (this.f1437y == null) {
            z = true;
        } else {
            z = false;
        }
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f1437y = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f1431s);
        }
        view2.addOnAttachStateChangeListener(this.f1432t);
        this.f1430r.m39659B(view2);
        this.f1430r.m39656E(this.f1421C);
        if (!this.f1419A) {
            this.f1420B = AbstractC0401k.m40314l(this.f1425m, null, this.f1423k, this.f1427o);
            this.f1419A = true;
        }
        this.f1430r.m39657D(this.f1420B);
        this.f1430r.m39654G(2);
        this.f1430r.m39655F(m40315k());
        this.f1430r.show();
        ListView mo39639n = this.f1430r.mo39639n();
        mo39639n.setOnKeyListener(this);
        if (this.f1422D && this.f1424l.m40349x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f1423k).inflate(C5712g.f16196l, (ViewGroup) mo39639n, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            if (textView != null) {
                textView.setText(this.f1424l.m40349x());
            }
            frameLayout.setEnabled(false);
            mo39639n.addHeaderView(frameLayout, null, false);
        }
        this.f1430r.mo39587l(this.f1425m);
        this.f1430r.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: a */
    public void mo39992a(C0389g c0389g, boolean z) {
        if (c0389g != this.f1424l) {
            return;
        }
        dismiss();
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1436x;
        if (interfaceC0406a != null) {
            interfaceC0406a.mo39969a(c0389g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: c */
    public void mo40296c(InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        this.f1436x = interfaceC0406a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: d */
    public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
        if (subMenuC0414r.hasVisibleItems()) {
            C0402l c0402l = new C0402l(this.f1423k, subMenuC0414r, this.f1435w, this.f1426n, this.f1428p, this.f1429q);
            c0402l.m40302j(this.f1436x);
            c0402l.m40305g(AbstractC0401k.m40312v(subMenuC0414r));
            c0402l.m40303i(this.f1433u);
            this.f1433u = null;
            this.f1424l.m40364e(false);
            int m39645a = this.f1430r.m39645a();
            int m39640k = this.f1430r.m39640k();
            if ((Gravity.getAbsoluteGravity(this.f1421C, C1365w0.m37258B(this.f1434v)) & 7) == 5) {
                m39645a += this.f1434v.getWidth();
            }
            if (c0402l.m40298n(m39645a, m39640k)) {
                InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1436x;
                if (interfaceC0406a != null) {
                    interfaceC0406a.mo39968b(subMenuC0414r);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void dismiss() {
        if (isShowing()) {
            this.f1430r.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: e */
    public void mo39990e(boolean z) {
        this.f1419A = false;
        C0388f c0388f = this.f1425m;
        if (c0388f != null) {
            c0388f.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: f */
    public boolean mo39989f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: i */
    public void mo40295i(C0389g c0389g) {
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public boolean isShowing() {
        return !this.f1438z && this.f1430r.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: m */
    public void mo40294m(View view) {
        this.f1434v = view;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    /* renamed from: n */
    public ListView mo39639n() {
        return this.f1430r.mo39639n();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f1438z = true;
        this.f1424l.close();
        ViewTreeObserver viewTreeObserver = this.f1437y;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1437y = this.f1435w.getViewTreeObserver();
            }
            this.f1437y.removeGlobalOnLayoutListener(this.f1431s);
            this.f1437y = null;
        }
        this.f1435w.removeOnAttachStateChangeListener(this.f1432t);
        PopupWindow.OnDismissListener onDismissListener = this.f1433u;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: p */
    public void mo40293p(boolean z) {
        this.f1425m.m40394d(z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: q */
    public void mo40292q(int i) {
        this.f1421C = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: r */
    public void mo40291r(int i) {
        this.f1430r.m39643d(i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: s */
    public void mo40290s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1433u = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void show() {
        if (m40287x()) {
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: t */
    public void mo40289t(boolean z) {
        this.f1422D = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: u */
    public void mo40288u(int i) {
        this.f1430r.m39641h(i);
    }
}