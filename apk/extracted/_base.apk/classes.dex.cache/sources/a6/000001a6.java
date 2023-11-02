package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.InterfaceC0407n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0378b implements InterfaceC0405m {

    /* renamed from: j */
    protected Context f1262j;

    /* renamed from: k */
    protected Context f1263k;

    /* renamed from: l */
    protected C0389g f1264l;

    /* renamed from: m */
    protected LayoutInflater f1265m;

    /* renamed from: n */
    protected LayoutInflater f1266n;

    /* renamed from: o */
    private InterfaceC0405m.InterfaceC0406a f1267o;

    /* renamed from: p */
    private int f1268p;

    /* renamed from: q */
    private int f1269q;

    /* renamed from: r */
    protected InterfaceC0407n f1270r;

    /* renamed from: s */
    private int f1271s;

    public AbstractC0378b(Context context, int i, int i2) {
        this.f1262j = context;
        this.f1265m = LayoutInflater.from(context);
        this.f1268p = i;
        this.f1269q = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: a */
    public void mo39992a(C0389g c0389g, boolean z) {
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1267o;
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
        this.f1267o = interfaceC0406a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.g] */
    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: d */
    public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
        InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1267o;
        SubMenuC0414r subMenuC0414r2 = subMenuC0414r;
        if (interfaceC0406a != null) {
            if (subMenuC0414r == null) {
                subMenuC0414r2 = this.f1264l;
            }
            return interfaceC0406a.mo39968b(subMenuC0414r2);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: e */
    public void mo39990e(boolean z) {
        C0393i c0393i;
        ViewGroup viewGroup = (ViewGroup) this.f1270r;
        if (viewGroup == null) {
            return;
        }
        C0389g c0389g = this.f1264l;
        int i = 0;
        if (c0389g != null) {
            c0389g.m40354r();
            ArrayList<C0393i> m40390E = this.f1264l.m40390E();
            int size = m40390E.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C0393i c0393i2 = m40390E.get(i3);
                if (mo39983q(i2, c0393i2)) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof InterfaceC0407n.InterfaceC0408a) {
                        c0393i = ((InterfaceC0407n.InterfaceC0408a) childAt).getItemData();
                    } else {
                        c0393i = null;
                    }
                    View mo39985n = mo39985n(c0393i2, childAt, viewGroup);
                    if (c0393i2 != c0393i) {
                        mo39985n.setPressed(false);
                        mo39985n.jumpDrawablesToCurrentState();
                    }
                    if (mo39985n != childAt) {
                        m40418i(mo39985n, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo39986l(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: g */
    public boolean mo40028g(C0389g c0389g, C0393i c0393i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: h */
    public void mo39988h(Context context, C0389g c0389g) {
        this.f1263k = context;
        this.f1266n = LayoutInflater.from(context);
        this.f1264l = c0389g;
    }

    /* renamed from: i */
    protected void m40418i(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f1270r).addView(view, i);
    }

    /* renamed from: j */
    public abstract void mo39987j(C0393i c0393i, InterfaceC0407n.InterfaceC0408a interfaceC0408a);

    /* renamed from: k */
    public InterfaceC0407n.InterfaceC0408a m40417k(ViewGroup viewGroup) {
        return (InterfaceC0407n.InterfaceC0408a) this.f1265m.inflate(this.f1269q, viewGroup, false);
    }

    /* renamed from: l */
    public boolean mo39986l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: m */
    public InterfaceC0405m.InterfaceC0406a m40416m() {
        return this.f1267o;
    }

    /* renamed from: n */
    public View mo39985n(C0393i c0393i, View view, ViewGroup viewGroup) {
        InterfaceC0407n.InterfaceC0408a m40417k;
        if (view instanceof InterfaceC0407n.InterfaceC0408a) {
            m40417k = (InterfaceC0407n.InterfaceC0408a) view;
        } else {
            m40417k = m40417k(viewGroup);
        }
        mo39987j(c0393i, m40417k);
        return (View) m40417k;
    }

    /* renamed from: o */
    public InterfaceC0407n mo39984o(ViewGroup viewGroup) {
        if (this.f1270r == null) {
            InterfaceC0407n interfaceC0407n = (InterfaceC0407n) this.f1265m.inflate(this.f1268p, viewGroup, false);
            this.f1270r = interfaceC0407n;
            interfaceC0407n.mo27070a(this.f1264l);
            mo39990e(true);
        }
        return this.f1270r;
    }

    /* renamed from: p */
    public void m40415p(int i) {
        this.f1271s = i;
    }

    /* renamed from: q */
    public abstract boolean mo39983q(int i, C0393i c0393i);
}