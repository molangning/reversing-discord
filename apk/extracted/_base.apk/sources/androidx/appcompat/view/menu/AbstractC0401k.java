package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0401k implements InterfaceC0410p, InterfaceC0405m, AdapterView.OnItemClickListener {

    /* renamed from: j */
    private Rect f1403j;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static int m40314l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public static boolean m40312v(C0389g c0389g) {
        int size = c0389g.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = c0389g.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public static C0388f m40311w(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0388f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0388f) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: b */
    public boolean mo40029b(C0389g c0389g, C0393i c0393i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: g */
    public boolean mo40028g(C0389g c0389g, C0393i c0393i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: h */
    public void mo39988h(Context context, C0389g c0389g) {
    }

    /* renamed from: i */
    public abstract void mo40295i(C0389g c0389g);

    /* renamed from: j */
    protected boolean mo40316j() {
        return true;
    }

    /* renamed from: k */
    public Rect m40315k() {
        return this.f1403j;
    }

    /* renamed from: m */
    public abstract void mo40294m(View view);

    /* renamed from: o */
    public void m40313o(Rect rect) {
        this.f1403j = rect;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C0389g c0389g = m40311w(listAdapter).f1323j;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (mo40316j()) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        c0389g.m40385M(menuItem, this, i2);
    }

    /* renamed from: p */
    public abstract void mo40293p(boolean z);

    /* renamed from: q */
    public abstract void mo40292q(int i);

    /* renamed from: r */
    public abstract void mo40291r(int i);

    /* renamed from: s */
    public abstract void mo40290s(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: t */
    public abstract void mo40289t(boolean z);

    /* renamed from: u */
    public abstract void mo40288u(int i);
}
