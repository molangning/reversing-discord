package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.InterfaceC0407n;
import java.util.ArrayList;
import p052d.C5712g;

/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0386e implements InterfaceC0405m, AdapterView.OnItemClickListener {

    /* renamed from: j */
    Context f1312j;

    /* renamed from: k */
    LayoutInflater f1313k;

    /* renamed from: l */
    C0389g f1314l;

    /* renamed from: m */
    ExpandedMenuView f1315m;

    /* renamed from: n */
    int f1316n;

    /* renamed from: o */
    int f1317o;

    /* renamed from: p */
    int f1318p;

    /* renamed from: q */
    private InterfaceC0405m.InterfaceC0406a f1319q;

    /* renamed from: r */
    C0387a f1320r;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0387a extends BaseAdapter {

        /* renamed from: j */
        private int f1321j = -1;

        public C0387a() {
            C0386e.this = r1;
            m40399a();
        }

        /* renamed from: a */
        void m40399a() {
            C0393i m40351v = C0386e.this.f1314l.m40351v();
            if (m40351v != null) {
                ArrayList<C0393i> m40347z = C0386e.this.f1314l.m40347z();
                int size = m40347z.size();
                for (int i = 0; i < size; i++) {
                    if (m40347z.get(i) == m40351v) {
                        this.f1321j = i;
                        return;
                    }
                }
            }
            this.f1321j = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public C0393i getItem(int i) {
            ArrayList<C0393i> m40347z = C0386e.this.f1314l.m40347z();
            int i2 = i + C0386e.this.f1316n;
            int i3 = this.f1321j;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return m40347z.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0386e.this.f1314l.m40347z().size() - C0386e.this.f1316n;
            if (this.f1321j < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0386e c0386e = C0386e.this;
                view = c0386e.f1313k.inflate(c0386e.f1318p, viewGroup, false);
            }
            ((InterfaceC0407n.InterfaceC0408a) view).mo27073c(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m40399a();
            super.notifyDataSetChanged();
        }
    }

    public C0386e(Context context, int i) {
        this(i, 0);
        this.f1312j = context;
        this.f1313k = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: a */
    public void mo39992a(C0389g c0389g, boolean z) {
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1319q;
        if (interfaceC0406a != null) {
            interfaceC0406a.mo39969a(c0389g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: b */
    public boolean mo40029b(C0389g c0389g, C0393i c0393i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: c */
    public void mo40296c(InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
        this.f1319q = interfaceC0406a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: d */
    public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
        if (!subMenuC0414r.hasVisibleItems()) {
            return false;
        }
        new DialogInterface$OnKeyListenerC0392h(subMenuC0414r).m40345d(null);
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1319q;
        if (interfaceC0406a != null) {
            interfaceC0406a.mo39968b(subMenuC0414r);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: e */
    public void mo39990e(boolean z) {
        C0387a c0387a = this.f1320r;
        if (c0387a != null) {
            c0387a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: f */
    public boolean mo39989f() {
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
        if (this.f1317o != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1317o);
            this.f1312j = contextThemeWrapper;
            this.f1313k = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1312j != null) {
            this.f1312j = context;
            if (this.f1313k == null) {
                this.f1313k = LayoutInflater.from(context);
            }
        }
        this.f1314l = c0389g;
        C0387a c0387a = this.f1320r;
        if (c0387a != null) {
            c0387a.notifyDataSetChanged();
        }
    }

    /* renamed from: i */
    public ListAdapter m40401i() {
        if (this.f1320r == null) {
            this.f1320r = new C0387a();
        }
        return this.f1320r;
    }

    /* renamed from: j */
    public InterfaceC0407n m40400j(ViewGroup viewGroup) {
        if (this.f1315m == null) {
            this.f1315m = (ExpandedMenuView) this.f1313k.inflate(C5712g.f16191g, viewGroup, false);
            if (this.f1320r == null) {
                this.f1320r = new C0387a();
            }
            this.f1315m.setAdapter((ListAdapter) this.f1320r);
            this.f1315m.setOnItemClickListener(this);
        }
        return this.f1315m;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1314l.m40385M(this.f1320r.getItem(i), this, 0);
    }

    public C0386e(int i, int i2) {
        this.f1318p = i;
        this.f1317o = i2;
    }
}