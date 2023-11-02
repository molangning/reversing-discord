package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.widget.C0544n1;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ExpandedMenuView extends ListView implements C0389g.InterfaceC0391b, InterfaceC0407n, AdapterView.OnItemClickListener {

    /* renamed from: l */
    private static final int[] f1222l = {16842964, 16843049};

    /* renamed from: j */
    private C0389g f1223j;

    /* renamed from: k */
    private int f1224k;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n
    /* renamed from: a */
    public void mo27070a(C0389g c0389g) {
        this.f1223j = c0389g;
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0391b
    /* renamed from: b */
    public boolean mo40234b(C0393i c0393i) {
        return this.f1223j.m40386L(c0393i, 0);
    }

    public int getWindowAnimations() {
        return this.f1224k;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mo40234b((C0393i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, f1222l, i, 0);
        if (m39780v.m39783s(0)) {
            setBackgroundDrawable(m39780v.m39795g(0));
        }
        if (m39780v.m39783s(1)) {
            setDivider(m39780v.m39795g(1));
        }
        m39780v.m39779w();
    }
}
