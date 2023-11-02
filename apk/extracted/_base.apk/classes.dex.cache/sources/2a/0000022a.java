package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.C0357a;
import androidx.appcompat.view.menu.AbstractC0378b;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.C0402l;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.view.menu.InterfaceC0410p;
import androidx.appcompat.view.menu.SubMenuC0414r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.AbstractC1228b;
import java.util.ArrayList;
import p052d.C5706a;
import p052d.C5712g;

/* renamed from: androidx.appcompat.widget.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0483c extends AbstractC0378b implements AbstractC1228b.InterfaceC1229a {

    /* renamed from: A */
    private int f1731A;

    /* renamed from: B */
    private boolean f1732B;

    /* renamed from: C */
    private boolean f1733C;

    /* renamed from: D */
    private boolean f1734D;

    /* renamed from: E */
    private boolean f1735E;

    /* renamed from: F */
    private int f1736F;

    /* renamed from: G */
    private final SparseBooleanArray f1737G;

    /* renamed from: H */
    C0489e f1738H;

    /* renamed from: I */
    C0484a f1739I;

    /* renamed from: J */
    RunnableC0486c f1740J;

    /* renamed from: K */
    private C0485b f1741K;

    /* renamed from: L */
    final C0490f f1742L;

    /* renamed from: M */
    int f1743M;

    /* renamed from: t */
    C0487d f1744t;

    /* renamed from: u */
    private Drawable f1745u;

    /* renamed from: v */
    private boolean f1746v;

    /* renamed from: w */
    private boolean f1747w;

    /* renamed from: x */
    private boolean f1748x;

    /* renamed from: y */
    private int f1749y;

    /* renamed from: z */
    private int f1750z;

    /* renamed from: androidx.appcompat.widget.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0484a extends C0402l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0484a(Context context, SubMenuC0414r subMenuC0414r, View view) {
            super(context, subMenuC0414r, view, false, C5706a.f16058l);
            C0483c.this = r7;
            if (!((C0393i) subMenuC0414r.getItem()).m40333l()) {
                View view2 = r7.f1744t;
                m40306f(view2 == null ? (View) ((AbstractC0378b) r7).f1270r : view2);
            }
            m40302j(r7.f1742L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0402l
        /* renamed from: e */
        public void mo39970e() {
            C0483c c0483c = C0483c.this;
            c0483c.f1739I = null;
            c0483c.f1743M = 0;
            super.mo39970e();
        }
    }

    /* renamed from: androidx.appcompat.widget.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C0485b extends ActionMenuItemView.AbstractC0376b {
        C0485b() {
            C0483c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC0376b
        /* renamed from: a */
        public InterfaceC0410p mo39973a() {
            C0484a c0484a = C0483c.this.f1739I;
            if (c0484a != null) {
                return c0484a.m40308c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0486c implements Runnable {

        /* renamed from: j */
        private C0489e f1753j;

        public RunnableC0486c(C0489e c0489e) {
            C0483c.this = r1;
            this.f1753j = c0489e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC0378b) C0483c.this).f1264l != null) {
                ((AbstractC0378b) C0483c.this).f1264l.m40366d();
            }
            View view = (View) ((AbstractC0378b) C0483c.this).f1270r;
            if (view != null && view.getWindowToken() != null && this.f1753j.m40299m()) {
                C0483c.this.f1738H = this.f1753j;
            }
            C0483c.this.f1740J = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0487d extends C0539m implements ActionMenuView.InterfaceC0423a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.widget.c$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0488a extends AbstractView$OnTouchListenerC0574t0 {

            /* renamed from: s */
            final /* synthetic */ C0483c f1756s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0488a(View view, C0483c c0483c) {
                super(view);
                C0487d.this = r1;
                this.f1756s = c0483c;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
            /* renamed from: b */
            public InterfaceC0410p mo39611b() {
                C0489e c0489e = C0483c.this.f1738H;
                if (c0489e == null) {
                    return null;
                }
                return c0489e.m40308c();
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
            /* renamed from: c */
            public boolean mo39610c() {
                C0483c.this.m39993K();
                return true;
            }

            @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
            /* renamed from: d */
            public boolean mo39694d() {
                C0483c c0483c = C0483c.this;
                if (c0483c.f1740J != null) {
                    return false;
                }
                c0483c.m40002B();
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0487d(Context context) {
            super(context, null, C5706a.f16057k);
            C0483c.this = r3;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0570s1.m39702a(this, getContentDescription());
            setOnTouchListener(new C0488a(this, r3));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0423a
        /* renamed from: a */
        public boolean mo39972a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0423a
        /* renamed from: b */
        public boolean mo39971b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            C0483c.this.m39993K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C1013a.m38086l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0489e extends C0402l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0489e(Context context, C0389g c0389g, View view, boolean z) {
            super(context, c0389g, view, z, C5706a.f16058l);
            C0483c.this = r7;
            m40304h(8388613);
            m40302j(r7.f1742L);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.C0402l
        /* renamed from: e */
        public void mo39970e() {
            if (((AbstractC0378b) C0483c.this).f1264l != null) {
                ((AbstractC0378b) C0483c.this).f1264l.close();
            }
            C0483c.this.f1738H = null;
            super.mo39970e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0490f implements InterfaceC0405m.InterfaceC0406a {
        C0490f() {
            C0483c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: a */
        public void mo39969a(C0389g c0389g, boolean z) {
            if (c0389g instanceof SubMenuC0414r) {
                c0389g.mo40286D().m40364e(false);
            }
            InterfaceC0405m.InterfaceC0406a m40416m = C0483c.this.m40416m();
            if (m40416m != null) {
                m40416m.mo39969a(c0389g, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: b */
        public boolean mo39968b(C0389g c0389g) {
            if (c0389g == ((AbstractC0378b) C0483c.this).f1264l) {
                return false;
            }
            C0483c.this.f1743M = ((SubMenuC0414r) c0389g).getItem().getItemId();
            InterfaceC0405m.InterfaceC0406a m40416m = C0483c.this.m40416m();
            if (m40416m == null) {
                return false;
            }
            return m40416m.mo39968b(c0389g);
        }
    }

    public C0483c(Context context) {
        super(context, C5712g.f16187c, C5712g.f16186b);
        this.f1737G = new SparseBooleanArray();
        this.f1742L = new C0490f();
    }

    /* renamed from: z */
    private View m39974z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f1270r;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC0407n.InterfaceC0408a) && ((InterfaceC0407n.InterfaceC0408a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: A */
    public Drawable m40003A() {
        C0487d c0487d = this.f1744t;
        if (c0487d != null) {
            return c0487d.getDrawable();
        }
        if (this.f1746v) {
            return this.f1745u;
        }
        return null;
    }

    /* renamed from: B */
    public boolean m40002B() {
        InterfaceC0407n interfaceC0407n;
        RunnableC0486c runnableC0486c = this.f1740J;
        if (runnableC0486c != null && (interfaceC0407n = this.f1270r) != null) {
            ((View) interfaceC0407n).removeCallbacks(runnableC0486c);
            this.f1740J = null;
            return true;
        }
        C0489e c0489e = this.f1738H;
        if (c0489e != null) {
            c0489e.m40309b();
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public boolean m40001C() {
        C0484a c0484a = this.f1739I;
        if (c0484a != null) {
            c0484a.m40309b();
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public boolean m40000D() {
        return this.f1740J != null || m39999E();
    }

    /* renamed from: E */
    public boolean m39999E() {
        C0489e c0489e = this.f1738H;
        return c0489e != null && c0489e.m40307d();
    }

    /* renamed from: F */
    public void m39998F(Configuration configuration) {
        if (!this.f1732B) {
            this.f1731A = C0357a.m40493b(this.f1263k).m40491d();
        }
        C0389g c0389g = this.f1264l;
        if (c0389g != null) {
            c0389g.m40387K(true);
        }
    }

    /* renamed from: G */
    public void m39997G(boolean z) {
        this.f1735E = z;
    }

    /* renamed from: H */
    public void m39996H(ActionMenuView actionMenuView) {
        this.f1270r = actionMenuView;
        actionMenuView.mo27070a(this.f1264l);
    }

    /* renamed from: I */
    public void m39995I(Drawable drawable) {
        C0487d c0487d = this.f1744t;
        if (c0487d != null) {
            c0487d.setImageDrawable(drawable);
            return;
        }
        this.f1746v = true;
        this.f1745u = drawable;
    }

    /* renamed from: J */
    public void m39994J(boolean z) {
        this.f1747w = z;
        this.f1748x = true;
    }

    /* renamed from: K */
    public boolean m39993K() {
        C0389g c0389g;
        if (this.f1747w && !m39999E() && (c0389g = this.f1264l) != null && this.f1270r != null && this.f1740J == null && !c0389g.m40347z().isEmpty()) {
            RunnableC0486c runnableC0486c = new RunnableC0486c(new C0489e(this.f1263k, this.f1264l, this.f1744t, true));
            this.f1740J = runnableC0486c;
            ((View) this.f1270r).post(runnableC0486c);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b, androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: a */
    public void mo39992a(C0389g c0389g, boolean z) {
        m39975y();
        super.mo39992a(c0389g, z);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b, androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: d */
    public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
        boolean z = false;
        if (!subMenuC0414r.hasVisibleItems()) {
            return false;
        }
        SubMenuC0414r subMenuC0414r2 = subMenuC0414r;
        while (subMenuC0414r2.m40281e0() != this.f1264l) {
            subMenuC0414r2 = (SubMenuC0414r) subMenuC0414r2.m40281e0();
        }
        View m39974z = m39974z(subMenuC0414r2.getItem());
        if (m39974z == null) {
            return false;
        }
        this.f1743M = subMenuC0414r.getItem().getItemId();
        int size = subMenuC0414r.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC0414r.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C0484a c0484a = new C0484a(this.f1263k, subMenuC0414r, m39974z);
        this.f1739I = c0484a;
        c0484a.m40305g(z);
        this.f1739I.m40301k();
        super.mo39991d(subMenuC0414r);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b, androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: e */
    public void mo39990e(boolean z) {
        ArrayList<C0393i> arrayList;
        super.mo39990e(z);
        ((View) this.f1270r).requestLayout();
        C0389g c0389g = this.f1264l;
        boolean z2 = false;
        if (c0389g != null) {
            ArrayList<C0393i> m40353s = c0389g.m40353s();
            int size = m40353s.size();
            for (int i = 0; i < size; i++) {
                AbstractC1228b mo2720a = m40353s.get(i).mo2720a();
                if (mo2720a != null) {
                    mo2720a.m37483i(this);
                }
            }
        }
        C0389g c0389g2 = this.f1264l;
        if (c0389g2 != null) {
            arrayList = c0389g2.m40347z();
        } else {
            arrayList = null;
        }
        if (this.f1747w && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f1744t == null) {
                this.f1744t = new C0487d(this.f1262j);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1744t.getParent();
            if (viewGroup != this.f1270r) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1744t);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f1270r;
                actionMenuView.addView(this.f1744t, actionMenuView.m40245D());
            }
        } else {
            C0487d c0487d = this.f1744t;
            if (c0487d != null) {
                ViewParent parent = c0487d.getParent();
                InterfaceC0407n interfaceC0407n = this.f1270r;
                if (parent == interfaceC0407n) {
                    ((ViewGroup) interfaceC0407n).removeView(this.f1744t);
                }
            }
        }
        ((ActionMenuView) this.f1270r).setOverflowReserved(this.f1747w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: f */
    public boolean mo39989f() {
        ArrayList<C0393i> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        C0483c c0483c = this;
        C0389g c0389g = c0483c.f1264l;
        View view = null;
        ?? r3 = 0;
        if (c0389g != null) {
            arrayList = c0389g.m40390E();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = c0483c.f1731A;
        int i6 = c0483c.f1750z;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) c0483c.f1270r;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C0393i c0393i = arrayList.get(i9);
            if (c0393i.m40330o()) {
                i7++;
            } else if (c0393i.m40331n()) {
                i8++;
            } else {
                z4 = true;
            }
            if (c0483c.f1735E && c0393i.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (c0483c.f1747w && (z4 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = c0483c.f1737G;
        sparseBooleanArray.clear();
        if (c0483c.f1733C) {
            int i11 = c0483c.f1736F;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C0393i c0393i2 = arrayList.get(i12);
            if (c0393i2.m40330o()) {
                View mo39985n = c0483c.mo39985n(c0393i2, view, viewGroup);
                if (c0483c.f1733C) {
                    i3 -= ActionMenuView.m40239J(mo39985n, i2, i3, makeMeasureSpec, r3);
                } else {
                    mo39985n.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo39985n.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = c0393i2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c0393i2.m40324u(true);
                z = r3;
                i4 = i;
            } else if (c0393i2.m40331n()) {
                int groupId2 = c0393i2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z5) && i6 > 0 && (!c0483c.f1733C || i3 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2;
                i4 = i;
                if (z2) {
                    View mo39985n2 = c0483c.mo39985n(c0393i2, null, viewGroup);
                    if (c0483c.f1733C) {
                        int m40239J = ActionMenuView.m40239J(mo39985n2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m40239J;
                        if (m40239J == 0) {
                            z6 = false;
                        }
                    } else {
                        mo39985n2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = mo39985n2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!c0483c.f1733C ? i6 + i13 > 0 : i6 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z7 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        C0393i c0393i3 = arrayList.get(i14);
                        if (c0393i3.getGroupId() == groupId2) {
                            if (c0393i3.m40333l()) {
                                i10++;
                            }
                            c0393i3.m40324u(false);
                        }
                    }
                }
                if (z2) {
                    i10--;
                }
                c0393i2.m40324u(z2);
                z = false;
            } else {
                z = r3;
                i4 = i;
                c0393i2.m40324u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            c0483c = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b, androidx.appcompat.view.menu.InterfaceC0405m
    /* renamed from: h */
    public void mo39988h(Context context, C0389g c0389g) {
        super.mo39988h(context, c0389g);
        Resources resources = context.getResources();
        C0357a m40493b = C0357a.m40493b(context);
        if (!this.f1748x) {
            this.f1747w = m40493b.m40487h();
        }
        if (!this.f1734D) {
            this.f1749y = m40493b.m40492c();
        }
        if (!this.f1732B) {
            this.f1731A = m40493b.m40491d();
        }
        int i = this.f1749y;
        if (this.f1747w) {
            if (this.f1744t == null) {
                C0487d c0487d = new C0487d(this.f1262j);
                this.f1744t = c0487d;
                if (this.f1746v) {
                    c0487d.setImageDrawable(this.f1745u);
                    this.f1745u = null;
                    this.f1746v = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1744t.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f1744t.getMeasuredWidth();
        } else {
            this.f1744t = null;
        }
        this.f1750z = i;
        this.f1736F = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b
    /* renamed from: j */
    public void mo39987j(C0393i c0393i, InterfaceC0407n.InterfaceC0408a interfaceC0408a) {
        interfaceC0408a.mo27073c(c0393i, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC0408a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f1270r);
        if (this.f1741K == null) {
            this.f1741K = new C0485b();
        }
        actionMenuItemView.setPopupCallback(this.f1741K);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b
    /* renamed from: l */
    public boolean mo39986l(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f1744t) {
            return false;
        }
        return super.mo39986l(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b
    /* renamed from: n */
    public View mo39985n(C0393i c0393i, View view, ViewGroup viewGroup) {
        int i;
        View actionView = c0393i.getActionView();
        if (actionView == null || c0393i.m40335j()) {
            actionView = super.mo39985n(c0393i, view, viewGroup);
        }
        if (c0393i.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.mo39679m(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b
    /* renamed from: o */
    public InterfaceC0407n mo39984o(ViewGroup viewGroup) {
        InterfaceC0407n interfaceC0407n = this.f1270r;
        InterfaceC0407n mo39984o = super.mo39984o(viewGroup);
        if (interfaceC0407n != mo39984o) {
            ((ActionMenuView) mo39984o).setPresenter(this);
        }
        return mo39984o;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0378b
    /* renamed from: q */
    public boolean mo39983q(int i, C0393i c0393i) {
        return c0393i.m40333l();
    }

    /* renamed from: y */
    public boolean m39975y() {
        return m40002B() | m40001C();
    }
}