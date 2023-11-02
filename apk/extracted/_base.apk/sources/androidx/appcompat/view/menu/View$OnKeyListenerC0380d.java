package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.widget.C0474a1;
import androidx.appcompat.widget.InterfaceC0618z0;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import java.util.ArrayList;
import java.util.List;
import p052d.C5709d;
import p052d.C5712g;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class View$OnKeyListenerC0380d extends AbstractC0401k implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: K */
    private static final int f1275K = C5712g.f16189e;

    /* renamed from: A */
    private boolean f1276A;

    /* renamed from: B */
    private boolean f1277B;

    /* renamed from: C */
    private int f1278C;

    /* renamed from: D */
    private int f1279D;

    /* renamed from: F */
    private boolean f1281F;

    /* renamed from: G */
    private InterfaceC0405m.InterfaceC0406a f1282G;

    /* renamed from: H */
    ViewTreeObserver f1283H;

    /* renamed from: I */
    private PopupWindow.OnDismissListener f1284I;

    /* renamed from: J */
    boolean f1285J;

    /* renamed from: k */
    private final Context f1286k;

    /* renamed from: l */
    private final int f1287l;

    /* renamed from: m */
    private final int f1288m;

    /* renamed from: n */
    private final int f1289n;

    /* renamed from: o */
    private final boolean f1290o;

    /* renamed from: p */
    final Handler f1291p;

    /* renamed from: x */
    private View f1299x;

    /* renamed from: y */
    View f1300y;

    /* renamed from: q */
    private final List<C0389g> f1292q = new ArrayList();

    /* renamed from: r */
    final List<C0385d> f1293r = new ArrayList();

    /* renamed from: s */
    final ViewTreeObserver.OnGlobalLayoutListener f1294s = new ViewTreeObserver$OnGlobalLayoutListenerC0381a();

    /* renamed from: t */
    private final View.OnAttachStateChangeListener f1295t = new View$OnAttachStateChangeListenerC0382b();

    /* renamed from: u */
    private final InterfaceC0618z0 f1296u = new C0383c();

    /* renamed from: v */
    private int f1297v = 0;

    /* renamed from: w */
    private int f1298w = 0;

    /* renamed from: E */
    private boolean f1280E = false;

    /* renamed from: z */
    private int f1301z = m40408B();

    /* renamed from: androidx.appcompat.view.menu.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class ViewTreeObserver$OnGlobalLayoutListenerC0381a implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserver$OnGlobalLayoutListenerC0381a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (View$OnKeyListenerC0380d.this.isShowing() && View$OnKeyListenerC0380d.this.f1293r.size() > 0 && !View$OnKeyListenerC0380d.this.f1293r.get(0).f1309a.m39627z()) {
                View view = View$OnKeyListenerC0380d.this.f1300y;
                if (view != null && view.isShown()) {
                    for (C0385d c0385d : View$OnKeyListenerC0380d.this.f1293r) {
                        c0385d.f1309a.show();
                    }
                    return;
                }
                View$OnKeyListenerC0380d.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class View$OnAttachStateChangeListenerC0382b implements View.OnAttachStateChangeListener {
        View$OnAttachStateChangeListenerC0382b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = View$OnKeyListenerC0380d.this.f1283H;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    View$OnKeyListenerC0380d.this.f1283H = view.getViewTreeObserver();
                }
                View$OnKeyListenerC0380d view$OnKeyListenerC0380d = View$OnKeyListenerC0380d.this;
                view$OnKeyListenerC0380d.f1283H.removeGlobalOnLayoutListener(view$OnKeyListenerC0380d.f1294s);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0383c implements InterfaceC0618z0 {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC0384a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ C0385d f1305j;

            /* renamed from: k */
            final /* synthetic */ MenuItem f1306k;

            /* renamed from: l */
            final /* synthetic */ C0389g f1307l;

            RunnableC0384a(C0385d c0385d, MenuItem menuItem, C0389g c0389g) {
                this.f1305j = c0385d;
                this.f1306k = menuItem;
                this.f1307l = c0389g;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0385d c0385d = this.f1305j;
                if (c0385d != null) {
                    View$OnKeyListenerC0380d.this.f1285J = true;
                    c0385d.f1310b.m40364e(false);
                    View$OnKeyListenerC0380d.this.f1285J = false;
                }
                if (this.f1306k.isEnabled() && this.f1306k.hasSubMenu()) {
                    this.f1307l.m40386L(this.f1306k, 4);
                }
            }
        }

        C0383c() {
        }

        @Override // androidx.appcompat.widget.InterfaceC0618z0
        /* renamed from: c */
        public void mo39569c(C0389g c0389g, MenuItem menuItem) {
            C0385d c0385d = null;
            View$OnKeyListenerC0380d.this.f1291p.removeCallbacksAndMessages(null);
            int size = View$OnKeyListenerC0380d.this.f1293r.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (c0389g == View$OnKeyListenerC0380d.this.f1293r.get(i).f1310b) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            if (i2 < View$OnKeyListenerC0380d.this.f1293r.size()) {
                c0385d = View$OnKeyListenerC0380d.this.f1293r.get(i2);
            }
            View$OnKeyListenerC0380d.this.f1291p.postAtTime(new RunnableC0384a(c0385d, menuItem, c0389g), c0389g, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.InterfaceC0618z0
        /* renamed from: m */
        public void mo39568m(C0389g c0389g, MenuItem menuItem) {
            View$OnKeyListenerC0380d.this.f1291p.removeCallbacksAndMessages(c0389g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0385d {

        /* renamed from: a */
        public final C0474a1 f1309a;

        /* renamed from: b */
        public final C0389g f1310b;

        /* renamed from: c */
        public final int f1311c;

        public C0385d(C0474a1 c0474a1, C0389g c0389g, int i) {
            this.f1309a = c0474a1;
            this.f1310b = c0389g;
            this.f1311c = i;
        }

        /* renamed from: a */
        public ListView m40402a() {
            return this.f1309a.mo39639n();
        }
    }

    public View$OnKeyListenerC0380d(Context context, View view, int i, int i2, boolean z) {
        this.f1286k = context;
        this.f1299x = view;
        this.f1288m = i;
        this.f1289n = i2;
        this.f1290o = z;
        Resources resources = context.getResources();
        this.f1287l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5709d.f16085d));
        this.f1291p = new Handler();
    }

    /* renamed from: A */
    private View m40409A(C0385d c0385d, C0389g c0389g) {
        C0388f c0388f;
        int i;
        int firstVisiblePosition;
        MenuItem m40403z = m40403z(c0385d.f1310b, c0389g);
        if (m40403z == null) {
            return null;
        }
        ListView m40402a = c0385d.m40402a();
        ListAdapter adapter = m40402a.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            c0388f = (C0388f) headerViewListAdapter.getWrappedAdapter();
        } else {
            c0388f = (C0388f) adapter;
            i = 0;
        }
        int count = c0388f.getCount();
        while (true) {
            if (i2 < count) {
                if (m40403z == c0388f.getItem(i2)) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == -1 || (firstVisiblePosition = (i2 + i) - m40402a.getFirstVisiblePosition()) < 0 || firstVisiblePosition >= m40402a.getChildCount()) {
            return null;
        }
        return m40402a.getChildAt(firstVisiblePosition);
    }

    /* renamed from: B */
    private int m40408B() {
        return C1365w0.m37258B(this.f1299x) == 1 ? 0 : 1;
    }

    /* renamed from: C */
    private int m40407C(int i) {
        List<C0385d> list = this.f1293r;
        ListView m40402a = list.get(list.size() - 1).m40402a();
        int[] iArr = new int[2];
        m40402a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f1300y.getWindowVisibleDisplayFrame(rect);
        if (this.f1301z == 1) {
            if (iArr[0] + m40402a.getWidth() + i <= rect.right) {
                return 1;
            }
            return 0;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: D */
    private void m40406D(C0389g c0389g) {
        C0385d c0385d;
        View view;
        boolean z;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f1286k);
        C0388f c0388f = new C0388f(c0389g, from, this.f1290o, f1275K);
        if (!isShowing() && this.f1280E) {
            c0388f.m40394d(true);
        } else if (isShowing()) {
            c0388f.m40394d(AbstractC0401k.m40312v(c0389g));
        }
        int m40314l = AbstractC0401k.m40314l(c0388f, null, this.f1286k, this.f1287l);
        C0474a1 m40405x = m40405x();
        m40405x.mo39587l(c0388f);
        m40405x.m39657D(m40314l);
        m40405x.m39656E(this.f1298w);
        if (this.f1293r.size() > 0) {
            List<C0385d> list = this.f1293r;
            c0385d = list.get(list.size() - 1);
            view = m40409A(c0385d, c0389g);
        } else {
            c0385d = null;
            view = null;
        }
        if (view != null) {
            m40405x.m40011S(false);
            m40405x.m40014P(null);
            int m40407C = m40407C(m40314l);
            if (m40407C == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f1301z = m40407C;
            if (Build.VERSION.SDK_INT >= 26) {
                m40405x.m39659B(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f1299x.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f1298w & 7) == 5) {
                    iArr[0] = iArr[0] + this.f1299x.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f1298w & 5) == 5) {
                if (!z) {
                    m40314l = view.getWidth();
                    i3 = i - m40314l;
                }
                i3 = i + m40314l;
            } else {
                if (z) {
                    m40314l = view.getWidth();
                    i3 = i + m40314l;
                }
                i3 = i - m40314l;
            }
            m40405x.m39643d(i3);
            m40405x.m39650K(true);
            m40405x.m39641h(i2);
        } else {
            if (this.f1276A) {
                m40405x.m39643d(this.f1278C);
            }
            if (this.f1277B) {
                m40405x.m39641h(this.f1279D);
            }
            m40405x.m39655F(m40315k());
        }
        this.f1293r.add(new C0385d(m40405x, c0389g, this.f1301z));
        m40405x.show();
        ListView mo39639n = m40405x.mo39639n();
        mo39639n.setOnKeyListener(this);
        if (c0385d == null && this.f1281F && c0389g.m40349x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C5712g.f16196l, (ViewGroup) mo39639n, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(c0389g.m40349x());
            mo39639n.addHeaderView(frameLayout, null, false);
            m40405x.show();
        }
    }

    /* renamed from: x */
    private C0474a1 m40405x() {
        C0474a1 c0474a1 = new C0474a1(this.f1286k, null, this.f1288m, this.f1289n);
        c0474a1.m40012R(this.f1296u);
        c0474a1.m39651J(this);
        c0474a1.m39652I(this);
        c0474a1.m39659B(this.f1299x);
        c0474a1.m39656E(this.f1298w);
        c0474a1.m39653H(true);
        c0474a1.m39654G(2);
        return c0474a1;
    }

    /* renamed from: y */
    private int m40404y(C0389g c0389g) {
        int size = this.f1293r.size();
        for (int i = 0; i < size; i++) {
            if (c0389g == this.f1293r.get(i).f1310b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: z */
    private MenuItem m40403z(C0389g c0389g, C0389g c0389g2) {
        int size = c0389g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0389g.getItem(i);
            if (item.hasSubMenu() && c0389g2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: a */
    public void mo39992a(C0389g c0389g, boolean z) {
        int m40404y = m40404y(c0389g);
        if (m40404y < 0) {
            return;
        }
        int i = m40404y + 1;
        if (i < this.f1293r.size()) {
            this.f1293r.get(i).f1310b.m40364e(false);
        }
        C0385d remove = this.f1293r.remove(m40404y);
        remove.f1310b.m40383O(this);
        if (this.f1285J) {
            remove.f1309a.m40013Q(null);
            remove.f1309a.m39658C(0);
        }
        remove.f1309a.dismiss();
        int size = this.f1293r.size();
        if (size > 0) {
            this.f1301z = this.f1293r.get(size - 1).f1311c;
        } else {
            this.f1301z = m40408B();
        }
        if (size == 0) {
            dismiss();
            InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1282G;
            if (interfaceC0406a != null) {
                interfaceC0406a.mo39969a(c0389g, true);
            }
            ViewTreeObserver viewTreeObserver = this.f1283H;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.f1283H.removeGlobalOnLayoutListener(this.f1294s);
                }
                this.f1283H = null;
            }
            this.f1300y.removeOnAttachStateChangeListener(this.f1295t);
            this.f1284I.onDismiss();
        } else if (z) {
            this.f1293r.get(0).f1310b.m40364e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: c */
    public void mo40296c(InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        this.f1282G = interfaceC0406a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: d */
    public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
        for (C0385d c0385d : this.f1293r) {
            if (subMenuC0414r == c0385d.f1310b) {
                c0385d.m40402a().requestFocus();
                return true;
            }
        }
        if (subMenuC0414r.hasVisibleItems()) {
            mo40295i(subMenuC0414r);
            InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1282G;
            if (interfaceC0406a != null) {
                interfaceC0406a.mo39968b(subMenuC0414r);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void dismiss() {
        int size = this.f1293r.size();
        if (size > 0) {
            C0385d[] c0385dArr = (C0385d[]) this.f1293r.toArray(new C0385d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0385d c0385d = c0385dArr[i];
                if (c0385d.f1309a.isShowing()) {
                    c0385d.f1309a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: e */
    public void mo39990e(boolean z) {
        for (C0385d c0385d : this.f1293r) {
            AbstractC0401k.m40311w(c0385d.m40402a().getAdapter()).notifyDataSetChanged();
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
        c0389g.m40368c(this, this.f1286k);
        if (isShowing()) {
            m40406D(c0389g);
        } else {
            this.f1292q.add(c0389g);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public boolean isShowing() {
        return this.f1293r.size() > 0 && this.f1293r.get(0).f1309a.isShowing();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: j */
    protected boolean mo40316j() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: m */
    public void mo40294m(View view) {
        if (this.f1299x != view) {
            this.f1299x = view;
            this.f1298w = C1336t.m37321b(this.f1297v, C1365w0.m37258B(view));
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    /* renamed from: n */
    public ListView mo39639n() {
        if (this.f1293r.isEmpty()) {
            return null;
        }
        List<C0385d> list = this.f1293r;
        return list.get(list.size() - 1).m40402a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0385d c0385d;
        int size = this.f1293r.size();
        int i = 0;
        while (true) {
            if (i < size) {
                c0385d = this.f1293r.get(i);
                if (!c0385d.f1309a.isShowing()) {
                    break;
                }
                i++;
            } else {
                c0385d = null;
                break;
            }
        }
        if (c0385d != null) {
            c0385d.f1310b.m40364e(false);
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
        this.f1280E = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: q */
    public void mo40292q(int i) {
        if (this.f1297v != i) {
            this.f1297v = i;
            this.f1298w = C1336t.m37321b(i, C1365w0.m37258B(this.f1299x));
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: r */
    public void mo40291r(int i) {
        this.f1276A = true;
        this.f1278C = i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: s */
    public void mo40290s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1284I = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void show() {
        boolean z;
        if (isShowing()) {
            return;
        }
        for (C0389g c0389g : this.f1292q) {
            m40406D(c0389g);
        }
        this.f1292q.clear();
        View view = this.f1299x;
        this.f1300y = view;
        if (view != null) {
            if (this.f1283H == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f1283H = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f1294s);
            }
            this.f1300y.addOnAttachStateChangeListener(this.f1295t);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: t */
    public void mo40289t(boolean z) {
        this.f1281F = z;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0401k
    /* renamed from: u */
    public void mo40288u(int i) {
        this.f1277B = true;
        this.f1279D = i;
    }
}
