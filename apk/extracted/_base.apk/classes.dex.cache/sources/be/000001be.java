package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.core.view.C1336t;
import androidx.core.view.C1365w0;
import p052d.C5709d;

/* renamed from: androidx.appcompat.view.menu.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0402l {

    /* renamed from: a */
    private final Context f1404a;

    /* renamed from: b */
    private final C0389g f1405b;

    /* renamed from: c */
    private final boolean f1406c;

    /* renamed from: d */
    private final int f1407d;

    /* renamed from: e */
    private final int f1408e;

    /* renamed from: f */
    private View f1409f;

    /* renamed from: g */
    private int f1410g;

    /* renamed from: h */
    private boolean f1411h;

    /* renamed from: i */
    private InterfaceC0405m.InterfaceC0406a f1412i;

    /* renamed from: j */
    private AbstractC0401k f1413j;

    /* renamed from: k */
    private PopupWindow.OnDismissListener f1414k;

    /* renamed from: l */
    private final PopupWindow.OnDismissListener f1415l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.view.menu.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0403a implements PopupWindow.OnDismissListener {
        C0403a() {
            C0402l.this = r1;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            C0402l.this.mo39970e();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0404b {
        /* renamed from: a */
        static void m40297a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0402l(Context context, C0389g c0389g, View view, boolean z, int i) {
        this(context, c0389g, view, z, i, 0);
    }

    /* renamed from: a */
    private AbstractC0401k m40310a() {
        boolean z;
        AbstractC0401k view$OnKeyListenerC0411q;
        Display defaultDisplay = ((WindowManager) this.f1404a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        C0404b.m40297a(defaultDisplay, point);
        if (Math.min(point.x, point.y) >= this.f1404a.getResources().getDimensionPixelSize(C5709d.f16084c)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            view$OnKeyListenerC0411q = new View$OnKeyListenerC0380d(this.f1404a, this.f1409f, this.f1407d, this.f1408e, this.f1406c);
        } else {
            view$OnKeyListenerC0411q = new View$OnKeyListenerC0411q(this.f1404a, this.f1405b, this.f1409f, this.f1407d, this.f1408e, this.f1406c);
        }
        view$OnKeyListenerC0411q.mo40295i(this.f1405b);
        view$OnKeyListenerC0411q.mo40290s(this.f1415l);
        view$OnKeyListenerC0411q.mo40294m(this.f1409f);
        view$OnKeyListenerC0411q.mo40296c(this.f1412i);
        view$OnKeyListenerC0411q.mo40293p(this.f1411h);
        view$OnKeyListenerC0411q.mo40292q(this.f1410g);
        return view$OnKeyListenerC0411q;
    }

    /* renamed from: l */
    private void m40300l(int i, int i2, boolean z, boolean z2) {
        AbstractC0401k m40308c = m40308c();
        m40308c.mo40289t(z2);
        if (z) {
            if ((C1336t.m37321b(this.f1410g, C1365w0.m37258B(this.f1409f)) & 7) == 5) {
                i -= this.f1409f.getWidth();
            }
            m40308c.mo40291r(i);
            m40308c.mo40288u(i2);
            int i3 = (int) ((this.f1404a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m40308c.m40313o(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        m40308c.show();
    }

    /* renamed from: b */
    public void m40309b() {
        if (m40307d()) {
            this.f1413j.dismiss();
        }
    }

    /* renamed from: c */
    public AbstractC0401k m40308c() {
        if (this.f1413j == null) {
            this.f1413j = m40310a();
        }
        return this.f1413j;
    }

    /* renamed from: d */
    public boolean m40307d() {
        AbstractC0401k abstractC0401k = this.f1413j;
        return abstractC0401k != null && abstractC0401k.isShowing();
    }

    /* renamed from: e */
    public void mo39970e() {
        this.f1413j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1414k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: f */
    public void m40306f(View view) {
        this.f1409f = view;
    }

    /* renamed from: g */
    public void m40305g(boolean z) {
        this.f1411h = z;
        AbstractC0401k abstractC0401k = this.f1413j;
        if (abstractC0401k != null) {
            abstractC0401k.mo40293p(z);
        }
    }

    /* renamed from: h */
    public void m40304h(int i) {
        this.f1410g = i;
    }

    /* renamed from: i */
    public void m40303i(PopupWindow.OnDismissListener onDismissListener) {
        this.f1414k = onDismissListener;
    }

    /* renamed from: j */
    public void m40302j(InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        this.f1412i = interfaceC0406a;
        AbstractC0401k abstractC0401k = this.f1413j;
        if (abstractC0401k != null) {
            abstractC0401k.mo40296c(interfaceC0406a);
        }
    }

    /* renamed from: k */
    public void m40301k() {
        if (m40299m()) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    /* renamed from: m */
    public boolean m40299m() {
        if (m40307d()) {
            return true;
        }
        if (this.f1409f == null) {
            return false;
        }
        m40300l(0, 0, false, false);
        return true;
    }

    /* renamed from: n */
    public boolean m40298n(int i, int i2) {
        if (m40307d()) {
            return true;
        }
        if (this.f1409f == null) {
            return false;
        }
        m40300l(i, i2, true, true);
        return true;
    }

    public C0402l(Context context, C0389g c0389g, View view, boolean z, int i, int i2) {
        this.f1410g = 8388611;
        this.f1415l = new C0403a();
        this.f1404a = context;
        this.f1405b = c0389g;
        this.f1409f = view;
        this.f1406c = z;
        this.f1407d = i;
        this.f1408e = i2;
    }
}