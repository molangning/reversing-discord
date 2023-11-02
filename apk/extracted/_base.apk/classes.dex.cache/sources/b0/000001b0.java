package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0407n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0388f extends BaseAdapter {

    /* renamed from: j */
    C0389g f1323j;

    /* renamed from: k */
    private int f1324k = -1;

    /* renamed from: l */
    private boolean f1325l;

    /* renamed from: m */
    private final boolean f1326m;

    /* renamed from: n */
    private final LayoutInflater f1327n;

    /* renamed from: o */
    private final int f1328o;

    public C0388f(C0389g c0389g, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1326m = z;
        this.f1327n = layoutInflater;
        this.f1323j = c0389g;
        this.f1328o = i;
        m40397a();
    }

    /* renamed from: a */
    void m40397a() {
        C0393i m40351v = this.f1323j.m40351v();
        if (m40351v != null) {
            ArrayList<C0393i> m40347z = this.f1323j.m40347z();
            int size = m40347z.size();
            for (int i = 0; i < size; i++) {
                if (m40347z.get(i) == m40351v) {
                    this.f1324k = i;
                    return;
                }
            }
        }
        this.f1324k = -1;
    }

    /* renamed from: b */
    public C0389g m40396b() {
        return this.f1323j;
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public C0393i getItem(int i) {
        ArrayList<C0393i> m40390E;
        if (this.f1326m) {
            m40390E = this.f1323j.m40347z();
        } else {
            m40390E = this.f1323j.m40390E();
        }
        int i2 = this.f1324k;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return m40390E.get(i);
    }

    /* renamed from: d */
    public void m40394d(boolean z) {
        this.f1325l = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<C0393i> m40390E;
        if (this.f1326m) {
            m40390E = this.f1323j.m40347z();
        } else {
            m40390E = this.f1323j.m40390E();
        }
        if (this.f1324k < 0) {
            return m40390E.size();
        }
        return m40390E.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z;
        if (view == null) {
            view = this.f1327n.inflate(this.f1328o, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1323j.mo40285F() && groupId != i2) {
            z = true;
        } else {
            z = false;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        InterfaceC0407n.InterfaceC0408a interfaceC0408a = (InterfaceC0407n.InterfaceC0408a) view;
        if (this.f1325l) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0408a.mo27073c(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m40397a();
        super.notifyDataSetChanged();
    }
}