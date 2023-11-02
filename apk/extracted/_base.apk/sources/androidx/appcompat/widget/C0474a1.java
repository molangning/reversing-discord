package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0388f;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.a1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0474a1 extends C0583v0 implements InterfaceC0618z0 {

    /* renamed from: T */
    private static Method f1724T;

    /* renamed from: S */
    private InterfaceC0618z0 f1725S;

    /* renamed from: androidx.appcompat.widget.a1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0475a {
        /* renamed from: a */
        static void m40010a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        /* renamed from: b */
        static void m40009b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    /* renamed from: androidx.appcompat.widget.a1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0476b {
        /* renamed from: a */
        static void m40008a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.a1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0477c extends C0560r0 {

        /* renamed from: w */
        final int f1726w;

        /* renamed from: x */
        final int f1727x;

        /* renamed from: y */
        private InterfaceC0618z0 f1728y;

        /* renamed from: z */
        private MenuItem f1729z;

        /* renamed from: androidx.appcompat.widget.a1$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        static class C0478a {
            /* renamed from: a */
            static int m40007a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public C0477c(Context context, boolean z) {
            super(context, z);
            if (1 == C0478a.m40007a(context.getResources().getConfiguration())) {
                this.f1726w = 21;
                this.f1727x = 22;
                return;
            }
            this.f1726w = 22;
            this.f1727x = 21;
        }

        @Override // androidx.appcompat.widget.C0560r0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ int mo39725d(int i, int i2, int i3, int i4, int i5) {
            return super.mo39725d(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.C0560r0
        /* renamed from: e */
        public /* bridge */ /* synthetic */ boolean mo39724e(MotionEvent motionEvent, int i) {
            return super.mo39724e(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.C0560r0, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.C0560r0, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.C0560r0, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.C0560r0, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.C0560r0, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            C0388f c0388f;
            int i;
            C0393i c0393i;
            int pointToPosition;
            int i2;
            if (this.f1728y != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    c0388f = (C0388f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c0388f = (C0388f) adapter;
                    i = 0;
                }
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < c0388f.getCount()) {
                    c0393i = c0388f.getItem(i2);
                } else {
                    c0393i = null;
                }
                MenuItem menuItem = this.f1729z;
                if (menuItem != c0393i) {
                    C0389g m40396b = c0388f.m40396b();
                    if (menuItem != null) {
                        this.f1728y.mo39568m(m40396b, menuItem);
                    }
                    this.f1729z = c0393i;
                    if (c0393i != null) {
                        this.f1728y.mo39569c(m40396b, c0393i);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            C0388f c0388f;
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1726w) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView != null && i == this.f1727x) {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    c0388f = (C0388f) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                } else {
                    c0388f = (C0388f) adapter;
                }
                c0388f.m40396b().m40364e(false);
                return true;
            } else {
                return super.onKeyDown(i, keyEvent);
            }
        }

        @Override // androidx.appcompat.widget.C0560r0, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(InterfaceC0618z0 interfaceC0618z0) {
            this.f1728y = interfaceC0618z0;
        }

        @Override // androidx.appcompat.widget.C0560r0, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1724T = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0474a1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: P */
    public void m40014P(Object obj) {
        C0475a.m40010a(this.f2015O, (Transition) obj);
    }

    /* renamed from: Q */
    public void m40013Q(Object obj) {
        C0475a.m40009b(this.f2015O, (Transition) obj);
    }

    /* renamed from: R */
    public void m40012R(InterfaceC0618z0 interfaceC0618z0) {
        this.f1725S = interfaceC0618z0;
    }

    /* renamed from: S */
    public void m40011S(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1724T;
            if (method != null) {
                try {
                    method.invoke(this.f2015O, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        C0476b.m40008a(this.f2015O, z);
    }

    @Override // androidx.appcompat.widget.InterfaceC0618z0
    /* renamed from: c */
    public void mo39569c(C0389g c0389g, MenuItem menuItem) {
        InterfaceC0618z0 interfaceC0618z0 = this.f1725S;
        if (interfaceC0618z0 != null) {
            interfaceC0618z0.mo39569c(c0389g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0618z0
    /* renamed from: m */
    public void mo39568m(C0389g c0389g, MenuItem menuItem) {
        InterfaceC0618z0 interfaceC0618z0 = this.f1725S;
        if (interfaceC0618z0 != null) {
            interfaceC0618z0.mo39568m(c0389g, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.C0583v0
    /* renamed from: q */
    C0560r0 mo39636q(Context context, boolean z) {
        C0477c c0477c = new C0477c(context, z);
        c0477c.setHoverListener(this);
        return c0477c;
    }
}
