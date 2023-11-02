package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.C0259j;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.C0364f;
import androidx.appcompat.view.InterfaceC0358b;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.SubMenuC0414r;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C1336t;
import androidx.core.view.C1363w;
import androidx.core.view.C1365w0;
import androidx.core.view.MenuHostHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p020b0.AbstractC1964a;
import p052d.C5706a;
import p052d.C5715j;
import p071e.C6029a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1653A;

    /* renamed from: B */
    private int f1654B;

    /* renamed from: C */
    private C0505e1 f1655C;

    /* renamed from: D */
    private int f1656D;

    /* renamed from: E */
    private int f1657E;

    /* renamed from: F */
    private int f1658F;

    /* renamed from: G */
    private CharSequence f1659G;

    /* renamed from: H */
    private CharSequence f1660H;

    /* renamed from: I */
    private ColorStateList f1661I;

    /* renamed from: J */
    private ColorStateList f1662J;

    /* renamed from: K */
    private boolean f1663K;

    /* renamed from: L */
    private boolean f1664L;

    /* renamed from: M */
    private final ArrayList<View> f1665M;

    /* renamed from: N */
    private final ArrayList<View> f1666N;

    /* renamed from: O */
    private final int[] f1667O;

    /* renamed from: P */
    final MenuHostHelper f1668P;

    /* renamed from: Q */
    private ArrayList<MenuItem> f1669Q;

    /* renamed from: R */
    InterfaceC0467h f1670R;

    /* renamed from: S */
    private final ActionMenuView.InterfaceC0427e f1671S;

    /* renamed from: T */
    private C0556q1 f1672T;

    /* renamed from: U */
    private C0483c f1673U;

    /* renamed from: V */
    private C0465f f1674V;

    /* renamed from: W */
    private InterfaceC0405m.InterfaceC0406a f1675W;

    /* renamed from: a0 */
    C0389g.InterfaceC0390a f1676a0;

    /* renamed from: b0 */
    private boolean f1677b0;

    /* renamed from: c0 */
    private OnBackInvokedCallback f1678c0;

    /* renamed from: d0 */
    private OnBackInvokedDispatcher f1679d0;

    /* renamed from: e0 */
    private boolean f1680e0;

    /* renamed from: f0 */
    private final Runnable f1681f0;

    /* renamed from: j */
    ActionMenuView f1682j;

    /* renamed from: k */
    private TextView f1683k;

    /* renamed from: l */
    private TextView f1684l;

    /* renamed from: m */
    private ImageButton f1685m;

    /* renamed from: n */
    private ImageView f1686n;

    /* renamed from: o */
    private Drawable f1687o;

    /* renamed from: p */
    private CharSequence f1688p;

    /* renamed from: q */
    ImageButton f1689q;

    /* renamed from: r */
    View f1690r;

    /* renamed from: s */
    private Context f1691s;

    /* renamed from: t */
    private int f1692t;

    /* renamed from: u */
    private int f1693u;

    /* renamed from: v */
    private int f1694v;

    /* renamed from: w */
    int f1695w;

    /* renamed from: x */
    private int f1696x;

    /* renamed from: y */
    private int f1697y;

    /* renamed from: z */
    private int f1698z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0460a implements ActionMenuView.InterfaceC0427e {
        C0460a() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0427e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1668P.m37778j(menuItem)) {
                return true;
            }
            InterfaceC0467h interfaceC0467h = Toolbar.this.f1670R;
            if (interfaceC0467h != null) {
                return interfaceC0467h.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0461b implements Runnable {
        RunnableC0461b() {
            Toolbar.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m40063Q();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0462c implements C0389g.InterfaceC0390a {
        C0462c() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: a */
        public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
            C0389g.InterfaceC0390a interfaceC0390a = Toolbar.this.f1676a0;
            if (interfaceC0390a != null && interfaceC0390a.mo40035a(c0389g, menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: b */
        public void mo40034b(C0389g c0389g) {
            if (!Toolbar.this.f1682j.m40241H()) {
                Toolbar.this.f1668P.m37777k(c0389g);
            }
            C0389g.InterfaceC0390a interfaceC0390a = Toolbar.this.f1676a0;
            if (interfaceC0390a != null) {
                interfaceC0390a.mo40034b(c0389g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC0463d implements View.OnClickListener {
        View$OnClickListenerC0463d() {
            Toolbar.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.m40057e();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0464e {
        /* renamed from: a */
        static OnBackInvokedDispatcher m40033a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m40032b(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0259j(runnable);
        }

        /* renamed from: c */
        static void m40031c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: d */
        static void m40030d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0465f implements InterfaceC0405m {

        /* renamed from: j */
        C0389g f1703j;

        /* renamed from: k */
        C0393i f1704k;

        C0465f() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m
        /* renamed from: a */
        public void mo39992a(C0389g c0389g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m
        /* renamed from: b */
        public boolean mo40029b(C0389g c0389g, C0393i c0393i) {
            Toolbar.this.m40055g();
            ViewParent parent = Toolbar.this.f1689q.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1689q);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1689q);
            }
            Toolbar.this.f1690r = c0393i.getActionView();
            this.f1704k = c0393i;
            ViewParent parent2 = Toolbar.this.f1690r.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1690r);
                }
                C0466g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f822a = (toolbar4.f1695w & 112) | 8388611;
                generateDefaultLayoutParams.f1706b = 2;
                toolbar4.f1690r.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1690r);
            }
            Toolbar.this.m40071I();
            Toolbar.this.requestLayout();
            c0393i.m40327r(true);
            View view = Toolbar.this.f1690r;
            if (view instanceof InterfaceC0358b) {
                ((InterfaceC0358b) view).onActionViewExpanded();
            }
            Toolbar.this.m40062R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m
        /* renamed from: d */
        public boolean mo39991d(SubMenuC0414r subMenuC0414r) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m
        /* renamed from: e */
        public void mo39990e(boolean z) {
            if (this.f1704k != null) {
                C0389g c0389g = this.f1703j;
                boolean z2 = false;
                if (c0389g != null) {
                    int size = c0389g.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1703j.getItem(i) == this.f1704k) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    mo40028g(this.f1703j, this.f1704k);
                }
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
            View view = Toolbar.this.f1690r;
            if (view instanceof InterfaceC0358b) {
                ((InterfaceC0358b) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1690r);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1689q);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1690r = null;
            toolbar3.m40061a();
            this.f1704k = null;
            Toolbar.this.requestLayout();
            c0393i.m40327r(false);
            Toolbar.this.m40062R();
            return true;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m
        /* renamed from: h */
        public void mo39988h(Context context, C0389g c0389g) {
            C0393i c0393i;
            C0389g c0389g2 = this.f1703j;
            if (c0389g2 != null && (c0393i = this.f1704k) != null) {
                c0389g2.mo40280f(c0393i);
            }
            this.f1703j = c0389g;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0467h {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    /* renamed from: C */
    private int m40077C(View view, int i, int[] iArr, int i2) {
        C0466g c0466g = (C0466g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0466g).leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int m40045q = m40045q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, m40045q, max + measuredWidth, view.getMeasuredHeight() + m40045q);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) c0466g).rightMargin;
    }

    /* renamed from: D */
    private int m40076D(View view, int i, int[] iArr, int i2) {
        C0466g c0466g = (C0466g) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0466g).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int m40045q = m40045q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, m40045q, max, view.getMeasuredHeight() + m40045q);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0466g).leftMargin);
    }

    /* renamed from: E */
    private int m40075E(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: F */
    private void m40074F(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: G */
    private void m40073G() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1668P.m37780h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1669Q = currentMenuItems2;
    }

    /* renamed from: H */
    private void m40072H() {
        removeCallbacks(this.f1681f0);
        post(this.f1681f0);
    }

    /* renamed from: O */
    private boolean m40065O() {
        if (!this.f1677b0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m40064P(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: P */
    private boolean m40064P(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    private void m40060b(List<View> list, int i) {
        boolean z;
        if (C1365w0.m37258B(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int m37321b = C1336t.m37321b(i, C1365w0.m37258B(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C0466g c0466g = (C0466g) childAt.getLayoutParams();
                if (c0466g.f1706b == 0 && m40064P(childAt) && m40046p(c0466g.f822a) == m37321b) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            C0466g c0466g2 = (C0466g) childAt2.getLayoutParams();
            if (c0466g2.f1706b == 0 && m40064P(childAt2) && m40046p(c0466g2.f822a) == m37321b) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: c */
    private void m40059c(View view, boolean z) {
        C0466g c0466g;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0466g = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            c0466g = generateLayoutParams(layoutParams);
        } else {
            c0466g = (C0466g) layoutParams;
        }
        c0466g.f1706b = 1;
        if (z && this.f1690r != null) {
            view.setLayoutParams(c0466g);
            this.f1666N.add(view);
            return;
        }
        addView(view, c0466g);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0364f(getContext());
    }

    /* renamed from: h */
    private void m40054h() {
        if (this.f1655C == null) {
            this.f1655C = new C0505e1();
        }
    }

    /* renamed from: i */
    private void m40053i() {
        if (this.f1686n == null) {
            this.f1686n = new C0539m(getContext());
        }
    }

    /* renamed from: j */
    private void m40052j() {
        m40051k();
        if (this.f1682j.m40237L() == null) {
            C0389g c0389g = (C0389g) this.f1682j.getMenu();
            if (this.f1674V == null) {
                this.f1674V = new C0465f();
            }
            this.f1682j.setExpandedActionViewsExclusive(true);
            c0389g.m40368c(this.f1674V, this.f1691s);
            m40062R();
        }
    }

    /* renamed from: k */
    private void m40051k() {
        if (this.f1682j == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1682j = actionMenuView;
            actionMenuView.setPopupTheme(this.f1692t);
            this.f1682j.setOnMenuItemClickListener(this.f1671S);
            this.f1682j.m40236M(this.f1675W, new C0462c());
            C0466g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f822a = (this.f1695w & 112) | 8388613;
            this.f1682j.setLayoutParams(generateDefaultLayoutParams);
            m40059c(this.f1682j, false);
        }
    }

    /* renamed from: l */
    private void m40050l() {
        if (this.f1685m == null) {
            this.f1685m = new C0536l(getContext(), null, C5706a.f16045N);
            C0466g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f822a = (this.f1695w & 112) | 8388611;
            this.f1685m.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: p */
    private int m40046p(int i) {
        int m37258B = C1365w0.m37258B(this);
        int m37321b = C1336t.m37321b(i, m37258B) & 7;
        if (m37321b != 1 && m37321b != 3 && m37321b != 5) {
            if (m37258B != 1) {
                return 3;
            }
            return 5;
        }
        return m37321b;
    }

    /* renamed from: q */
    private int m40045q(View view, int i) {
        int i2;
        C0466g c0466g = (C0466g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int m40044r = m40044r(c0466g.f822a);
        if (m40044r != 48) {
            if (m40044r != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i4 = ((ViewGroup.MarginLayoutParams) c0466g).topMargin;
                if (i3 < i4) {
                    i3 = i4;
                } else {
                    int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
                    int i6 = ((ViewGroup.MarginLayoutParams) c0466g).bottomMargin;
                    if (i5 < i6) {
                        i3 = Math.max(0, i3 - (i6 - i5));
                    }
                }
                return paddingTop + i3;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0466g).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    /* renamed from: r */
    private int m40044r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1658F & 112;
    }

    /* renamed from: s */
    private int m40043s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1363w.m37271b(marginLayoutParams) + C1363w.m37272a(marginLayoutParams);
    }

    /* renamed from: t */
    private int m40042t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: u */
    private int m40041u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            View view = list.get(i3);
            C0466g c0466g = (C0466g) view.getLayoutParams();
            int i5 = ((ViewGroup.MarginLayoutParams) c0466g).leftMargin - i;
            int i6 = ((ViewGroup.MarginLayoutParams) c0466g).rightMargin - i2;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, i6);
            int max3 = Math.max(0, -i5);
            int max4 = Math.max(0, -i6);
            i4 += max + view.getMeasuredWidth() + max2;
            i3++;
            i2 = max4;
            i = max3;
        }
        return i4;
    }

    /* renamed from: z */
    private boolean m40036z(View view) {
        return view.getParent() == this || this.f1666N.contains(view);
    }

    /* renamed from: A */
    public boolean m40079A() {
        ActionMenuView actionMenuView = this.f1682j;
        return actionMenuView != null && actionMenuView.m40242G();
    }

    /* renamed from: B */
    public boolean m40078B() {
        ActionMenuView actionMenuView = this.f1682j;
        return actionMenuView != null && actionMenuView.m40241H();
    }

    /* renamed from: I */
    void m40071I() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C0466g) childAt.getLayoutParams()).f1706b != 2 && childAt != this.f1682j) {
                removeViewAt(childCount);
                this.f1666N.add(childAt);
            }
        }
    }

    /* renamed from: J */
    public void m40070J(int i, int i2) {
        m40054h();
        this.f1655C.m39928g(i, i2);
    }

    /* renamed from: K */
    public void m40069K(C0389g c0389g, C0483c c0483c) {
        if (c0389g == null && this.f1682j == null) {
            return;
        }
        m40051k();
        C0389g m40237L = this.f1682j.m40237L();
        if (m40237L == c0389g) {
            return;
        }
        if (m40237L != null) {
            m40237L.m40383O(this.f1673U);
            m40237L.m40383O(this.f1674V);
        }
        if (this.f1674V == null) {
            this.f1674V = new C0465f();
        }
        c0483c.m39997G(true);
        if (c0389g != null) {
            c0389g.m40368c(c0483c, this.f1691s);
            c0389g.m40368c(this.f1674V, this.f1691s);
        } else {
            c0483c.mo39988h(this.f1691s, null);
            this.f1674V.mo39988h(this.f1691s, null);
            c0483c.mo39990e(true);
            this.f1674V.mo39990e(true);
        }
        this.f1682j.setPopupTheme(this.f1692t);
        this.f1682j.setPresenter(c0483c);
        this.f1673U = c0483c;
        m40062R();
    }

    /* renamed from: L */
    public void m40068L(InterfaceC0405m.InterfaceC0406a interfaceC0406a, C0389g.InterfaceC0390a interfaceC0390a) {
        this.f1675W = interfaceC0406a;
        this.f1676a0 = interfaceC0390a;
        ActionMenuView actionMenuView = this.f1682j;
        if (actionMenuView != null) {
            actionMenuView.m40236M(interfaceC0406a, interfaceC0390a);
        }
    }

    /* renamed from: M */
    public void m40067M(Context context, int i) {
        this.f1694v = i;
        TextView textView = this.f1684l;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: N */
    public void m40066N(Context context, int i) {
        this.f1693u = i;
        TextView textView = this.f1683k;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: Q */
    public boolean m40063Q() {
        ActionMenuView actionMenuView = this.f1682j;
        return actionMenuView != null && actionMenuView.m40235N();
    }

    /* renamed from: R */
    void m40062R() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher m40033a = C0464e.m40033a(this);
            if (m40040v() && m40033a != null && C1365w0.m37225T(this) && this.f1680e0) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f1679d0 == null) {
                if (this.f1678c0 == null) {
                    this.f1678c0 = C0464e.m40032b(new Runnable() { // from class: androidx.appcompat.widget.p1
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.m40057e();
                        }
                    });
                }
                C0464e.m40031c(m40033a, this.f1678c0);
                this.f1679d0 = m40033a;
            } else if (!z && (onBackInvokedDispatcher = this.f1679d0) != null) {
                C0464e.m40030d(onBackInvokedDispatcher, this.f1678c0);
                this.f1679d0 = null;
            }
        }
    }

    /* renamed from: a */
    void m40061a() {
        for (int size = this.f1666N.size() - 1; size >= 0; size--) {
            addView(this.f1666N.get(size));
        }
        this.f1666N.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0466g);
    }

    /* renamed from: d */
    public boolean m40058d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1682j) != null && actionMenuView.m40240I();
    }

    /* renamed from: e */
    public void m40057e() {
        C0393i c0393i;
        C0465f c0465f = this.f1674V;
        if (c0465f == null) {
            c0393i = null;
        } else {
            c0393i = c0465f.f1704k;
        }
        if (c0393i != null) {
            c0393i.collapseActionView();
        }
    }

    /* renamed from: f */
    public void m40056f() {
        ActionMenuView actionMenuView = this.f1682j;
        if (actionMenuView != null) {
            actionMenuView.m40233z();
        }
    }

    /* renamed from: g */
    void m40055g() {
        if (this.f1689q == null) {
            C0536l c0536l = new C0536l(getContext(), null, C5706a.f16045N);
            this.f1689q = c0536l;
            c0536l.setImageDrawable(this.f1687o);
            this.f1689q.setContentDescription(this.f1688p);
            C0466g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f822a = (this.f1695w & 112) | 8388611;
            generateDefaultLayoutParams.f1706b = 2;
            this.f1689q.setLayoutParams(generateDefaultLayoutParams);
            this.f1689q.setOnClickListener(new View$OnClickListenerC0463d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1689q;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1689q;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0505e1 c0505e1 = this.f1655C;
        if (c0505e1 != null) {
            return c0505e1.m39934a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1657E;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C0505e1 c0505e1 = this.f1655C;
        if (c0505e1 != null) {
            return c0505e1.m39933b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0505e1 c0505e1 = this.f1655C;
        if (c0505e1 != null) {
            return c0505e1.m39932c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0505e1 c0505e1 = this.f1655C;
        if (c0505e1 != null) {
            return c0505e1.m39931d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1656D;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        C0389g m40237L;
        ActionMenuView actionMenuView = this.f1682j;
        if (actionMenuView != null && (m40237L = actionMenuView.m40237L()) != null && m40237L.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f1657E, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        if (C1365w0.m37258B(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (C1365w0.m37258B(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1656D, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1686n;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1686n;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m40052j();
        return this.f1682j.getMenu();
    }

    View getNavButtonView() {
        return this.f1685m;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1685m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1685m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C0483c getOuterActionMenuPresenter() {
        return this.f1673U;
    }

    public Drawable getOverflowIcon() {
        m40052j();
        return this.f1682j.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f1691s;
    }

    public int getPopupTheme() {
        return this.f1692t;
    }

    public CharSequence getSubtitle() {
        return this.f1660H;
    }

    final TextView getSubtitleTextView() {
        return this.f1684l;
    }

    public CharSequence getTitle() {
        return this.f1659G;
    }

    public int getTitleMarginBottom() {
        return this.f1654B;
    }

    public int getTitleMarginEnd() {
        return this.f1698z;
    }

    public int getTitleMarginStart() {
        return this.f1697y;
    }

    public int getTitleMarginTop() {
        return this.f1653A;
    }

    final TextView getTitleTextView() {
        return this.f1683k;
    }

    public InterfaceC0534k0 getWrapper() {
        if (this.f1672T == null) {
            this.f1672T = new C0556q1(this, true);
        }
        return this.f1672T;
    }

    @Override // android.view.ViewGroup
    /* renamed from: m */
    public C0466g generateDefaultLayoutParams() {
        return new C0466g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n */
    public C0466g generateLayoutParams(AttributeSet attributeSet) {
        return new C0466g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o */
    public C0466g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0466g) {
            return new C0466g((C0466g) layoutParams);
        }
        if (layoutParams instanceof ActionBar.C0274a) {
            return new C0466g((ActionBar.C0274a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C0466g((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C0466g(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m40062R();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1681f0);
        m40062R();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1664L = false;
        }
        if (!this.f1664L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1664L = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1664L = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x029f A[LOOP:0: B:227:0x029d->B:228:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02c1 A[LOOP:1: B:230:0x02bf->B:231:0x02c1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02fa A[LOOP:2: B:239:0x02f8->B:240:0x02fa, LOOP_END] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 783
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1667O;
        boolean m39572b = C0616y1.m39572b(this);
        int i10 = 0;
        int i11 = !m39572b ? 1 : 0;
        if (m40064P(this.f1685m)) {
            m40074F(this.f1685m, i, 0, i2, 0, this.f1696x);
            i3 = this.f1685m.getMeasuredWidth() + m40043s(this.f1685m);
            i4 = Math.max(0, this.f1685m.getMeasuredHeight() + m40042t(this.f1685m));
            i5 = View.combineMeasuredStates(0, this.f1685m.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (m40064P(this.f1689q)) {
            m40074F(this.f1689q, i, 0, i2, 0, this.f1696x);
            i3 = this.f1689q.getMeasuredWidth() + m40043s(this.f1689q);
            i4 = Math.max(i4, this.f1689q.getMeasuredHeight() + m40042t(this.f1689q));
            i5 = View.combineMeasuredStates(i5, this.f1689q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i3);
        iArr[m39572b ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (m40064P(this.f1682j)) {
            m40074F(this.f1682j, i, max, i2, 0, this.f1696x);
            i6 = this.f1682j.getMeasuredWidth() + m40043s(this.f1682j);
            i4 = Math.max(i4, this.f1682j.getMeasuredHeight() + m40042t(this.f1682j));
            i5 = View.combineMeasuredStates(i5, this.f1682j.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i11] = Math.max(0, currentContentInsetEnd - i6);
        if (m40064P(this.f1690r)) {
            max2 += m40075E(this.f1690r, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1690r.getMeasuredHeight() + m40042t(this.f1690r));
            i5 = View.combineMeasuredStates(i5, this.f1690r.getMeasuredState());
        }
        if (m40064P(this.f1686n)) {
            max2 += m40075E(this.f1686n, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1686n.getMeasuredHeight() + m40042t(this.f1686n));
            i5 = View.combineMeasuredStates(i5, this.f1686n.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((C0466g) childAt.getLayoutParams()).f1706b == 0 && m40064P(childAt)) {
                max2 += m40075E(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m40042t(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.f1653A + this.f1654B;
        int i14 = this.f1697y + this.f1698z;
        if (m40064P(this.f1683k)) {
            m40075E(this.f1683k, i, max2 + i14, i2, i13, iArr);
            int measuredWidth = this.f1683k.getMeasuredWidth() + m40043s(this.f1683k);
            i7 = this.f1683k.getMeasuredHeight() + m40042t(this.f1683k);
            i8 = View.combineMeasuredStates(i5, this.f1683k.getMeasuredState());
            i9 = measuredWidth;
        } else {
            i7 = 0;
            i8 = i5;
            i9 = 0;
        }
        if (m40064P(this.f1684l)) {
            i9 = Math.max(i9, m40075E(this.f1684l, i, max2 + i14, i2, i7 + i13, iArr));
            i7 += this.f1684l.getMeasuredHeight() + m40042t(this.f1684l);
            i8 = View.combineMeasuredStates(i8, this.f1684l.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = max2 + i9 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & i8);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, i8 << 16);
        if (!m40065O()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C0389g c0389g;
        MenuItem findItem;
        if (!(parcelable instanceof C0468i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0468i c0468i = (C0468i) parcelable;
        super.onRestoreInstanceState(c0468i.m34884a());
        ActionMenuView actionMenuView = this.f1682j;
        if (actionMenuView != null) {
            c0389g = actionMenuView.m40237L();
        } else {
            c0389g = null;
        }
        int i = c0468i.f1707l;
        if (i != 0 && this.f1674V != null && c0389g != null && (findItem = c0389g.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (c0468i.f1708m) {
            m40072H();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m40054h();
        C0505e1 c0505e1 = this.f1655C;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        c0505e1.m39929f(z);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0393i c0393i;
        C0468i c0468i = new C0468i(super.onSaveInstanceState());
        C0465f c0465f = this.f1674V;
        if (c0465f != null && (c0393i = c0465f.f1704k) != null) {
            c0468i.f1707l = c0393i.getItemId();
        }
        c0468i.f1708m = m40078B();
        return c0468i;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1663K = false;
        }
        if (!this.f1663K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1663K = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1663K = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f1680e0 != z) {
            this.f1680e0 = z;
            m40062R();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C6029a.m23853b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1677b0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1657E) {
            this.f1657E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1656D) {
            this.f1656D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C6029a.m23853b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C6029a.m23853b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m40050l();
        this.f1685m.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0467h interfaceC0467h) {
        this.f1670R = interfaceC0467h;
    }

    public void setOverflowIcon(Drawable drawable) {
        m40052j();
        this.f1682j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1692t != i) {
            this.f1692t = i;
            if (i == 0) {
                this.f1691s = getContext();
            } else {
                this.f1691s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1654B = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1698z = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1697y = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1653A = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: v */
    public boolean m40040v() {
        C0465f c0465f = this.f1674V;
        return (c0465f == null || c0465f.f1704k == null) ? false : true;
    }

    /* renamed from: w */
    public boolean m40039w() {
        ActionMenuView actionMenuView = this.f1682j;
        return actionMenuView != null && actionMenuView.m40243F();
    }

    /* renamed from: x */
    public void m40038x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: y */
    public void m40037y() {
        Iterator<MenuItem> it = this.f1669Q.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        m40073G();
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0466g extends ActionBar.C0274a {

        /* renamed from: b */
        int f1706b;

        public C0466g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1706b = 0;
        }

        /* renamed from: a */
        void m40027a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0466g(int i, int i2) {
            super(i, i2);
            this.f1706b = 0;
            this.f822a = 8388627;
        }

        public C0466g(C0466g c0466g) {
            super((ActionBar.C0274a) c0466g);
            this.f1706b = 0;
            this.f1706b = c0466g.f1706b;
        }

        public C0466g(ActionBar.C0274a c0274a) {
            super(c0274a);
            this.f1706b = 0;
        }

        public C0466g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1706b = 0;
            m40027a(marginLayoutParams);
        }

        public C0466g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1706b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16046O);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40055g();
        }
        ImageButton imageButton = this.f1689q;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m40055g();
            this.f1689q.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1689q;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1687o);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m40053i();
            if (!m40036z(this.f1686n)) {
                m40059c(this.f1686n, true);
            }
        } else {
            ImageView imageView = this.f1686n;
            if (imageView != null && m40036z(imageView)) {
                removeView(this.f1686n);
                this.f1666N.remove(this.f1686n);
            }
        }
        ImageView imageView2 = this.f1686n;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40053i();
        }
        ImageView imageView = this.f1686n;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m40050l();
        }
        ImageButton imageButton = this.f1685m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            C0570s1.m39702a(this.f1685m, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m40050l();
            if (!m40036z(this.f1685m)) {
                m40059c(this.f1685m, true);
            }
        } else {
            ImageButton imageButton = this.f1685m;
            if (imageButton != null && m40036z(imageButton)) {
                removeView(this.f1685m);
                this.f1666N.remove(this.f1685m);
            }
        }
        ImageButton imageButton2 = this.f1685m;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1684l == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1684l = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1684l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1694v;
                if (i != 0) {
                    this.f1684l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1662J;
                if (colorStateList != null) {
                    this.f1684l.setTextColor(colorStateList);
                }
            }
            if (!m40036z(this.f1684l)) {
                m40059c(this.f1684l, true);
            }
        } else {
            TextView textView = this.f1684l;
            if (textView != null && m40036z(textView)) {
                removeView(this.f1684l);
                this.f1666N.remove(this.f1684l);
            }
        }
        TextView textView2 = this.f1684l;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1660H = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1662J = colorStateList;
        TextView textView = this.f1684l;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1683k == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1683k = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1683k.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1693u;
                if (i != 0) {
                    this.f1683k.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1661I;
                if (colorStateList != null) {
                    this.f1683k.setTextColor(colorStateList);
                }
            }
            if (!m40036z(this.f1683k)) {
                m40059c(this.f1683k, true);
            }
        } else {
            TextView textView = this.f1683k;
            if (textView != null && m40036z(textView)) {
                removeView(this.f1683k);
                this.f1666N.remove(this.f1683k);
            }
        }
        TextView textView2 = this.f1683k;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1659G = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1661I = colorStateList;
        TextView textView = this.f1683k;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0468i extends AbstractC1964a {
        public static final Parcelable.Creator<C0468i> CREATOR = new C0469a();

        /* renamed from: l */
        int f1707l;

        /* renamed from: m */
        boolean f1708m;

        /* renamed from: androidx.appcompat.widget.Toolbar$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0469a implements Parcelable.ClassLoaderCreator<C0468i> {
            C0469a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C0468i createFromParcel(Parcel parcel) {
                return new C0468i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C0468i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0468i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C0468i[] newArray(int i) {
                return new C0468i[i];
            }
        }

        public C0468i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1707l = parcel.readInt();
            this.f1708m = parcel.readInt() != 0;
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1707l);
            parcel.writeInt(this.f1708m ? 1 : 0);
        }

        public C0468i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1658F = 8388627;
        this.f1665M = new ArrayList<>();
        this.f1666N = new ArrayList<>();
        this.f1667O = new int[2];
        this.f1668P = new MenuHostHelper(new Runnable() { // from class: androidx.appcompat.widget.o1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.m40037y();
            }
        });
        this.f1669Q = new ArrayList<>();
        this.f1671S = new C0460a();
        this.f1681f0 = new RunnableC0461b();
        Context context2 = getContext();
        int[] iArr = C5715j.f16364d3;
        C0544n1 m39780v = C0544n1.m39780v(context2, attributeSet, iArr, i, 0);
        C1365w0.m37189o0(this, context, iArr, attributeSet, m39780v.m39784r(), i, 0);
        this.f1693u = m39780v.m39788n(C5715j.f16252F3, 0);
        this.f1694v = m39780v.m39788n(C5715j.f16459w3, 0);
        this.f1658F = m39780v.m39790l(C5715j.f16369e3, this.f1658F);
        this.f1695w = m39780v.m39790l(C5715j.f16374f3, 48);
        int m39797e = m39780v.m39797e(C5715j.f16474z3, 0);
        int i2 = C5715j.f16247E3;
        m39797e = m39780v.m39783s(i2) ? m39780v.m39797e(i2, m39797e) : m39797e;
        this.f1654B = m39797e;
        this.f1653A = m39797e;
        this.f1698z = m39797e;
        this.f1697y = m39797e;
        int m39797e2 = m39780v.m39797e(C5715j.f16237C3, -1);
        if (m39797e2 >= 0) {
            this.f1697y = m39797e2;
        }
        int m39797e3 = m39780v.m39797e(C5715j.f16232B3, -1);
        if (m39797e3 >= 0) {
            this.f1698z = m39797e3;
        }
        int m39797e4 = m39780v.m39797e(C5715j.f16242D3, -1);
        if (m39797e4 >= 0) {
            this.f1653A = m39797e4;
        }
        int m39797e5 = m39780v.m39797e(C5715j.f16227A3, -1);
        if (m39797e5 >= 0) {
            this.f1654B = m39797e5;
        }
        this.f1696x = m39780v.m39796f(C5715j.f16429q3, -1);
        int m39797e6 = m39780v.m39797e(C5715j.f16409m3, Integer.MIN_VALUE);
        int m39797e7 = m39780v.m39797e(C5715j.f16389i3, Integer.MIN_VALUE);
        int m39796f = m39780v.m39796f(C5715j.f16399k3, 0);
        int m39796f2 = m39780v.m39796f(C5715j.f16404l3, 0);
        m40054h();
        this.f1655C.m39930e(m39796f, m39796f2);
        if (m39797e6 != Integer.MIN_VALUE || m39797e7 != Integer.MIN_VALUE) {
            this.f1655C.m39928g(m39797e6, m39797e7);
        }
        this.f1656D = m39780v.m39797e(C5715j.f16414n3, Integer.MIN_VALUE);
        this.f1657E = m39780v.m39797e(C5715j.f16394j3, Integer.MIN_VALUE);
        this.f1687o = m39780v.m39795g(C5715j.f16384h3);
        this.f1688p = m39780v.m39786p(C5715j.f16379g3);
        CharSequence m39786p = m39780v.m39786p(C5715j.f16469y3);
        if (!TextUtils.isEmpty(m39786p)) {
            setTitle(m39786p);
        }
        CharSequence m39786p2 = m39780v.m39786p(C5715j.f16454v3);
        if (!TextUtils.isEmpty(m39786p2)) {
            setSubtitle(m39786p2);
        }
        this.f1691s = getContext();
        setPopupTheme(m39780v.m39788n(C5715j.f16449u3, 0));
        Drawable m39795g = m39780v.m39795g(C5715j.f16444t3);
        if (m39795g != null) {
            setNavigationIcon(m39795g);
        }
        CharSequence m39786p3 = m39780v.m39786p(C5715j.f16439s3);
        if (!TextUtils.isEmpty(m39786p3)) {
            setNavigationContentDescription(m39786p3);
        }
        Drawable m39795g2 = m39780v.m39795g(C5715j.f16419o3);
        if (m39795g2 != null) {
            setLogo(m39795g2);
        }
        CharSequence m39786p4 = m39780v.m39786p(C5715j.f16424p3);
        if (!TextUtils.isEmpty(m39786p4)) {
            setLogoDescription(m39786p4);
        }
        int i3 = C5715j.f16257G3;
        if (m39780v.m39783s(i3)) {
            setTitleTextColor(m39780v.m39799c(i3));
        }
        int i4 = C5715j.f16464x3;
        if (m39780v.m39783s(i4)) {
            setSubtitleTextColor(m39780v.m39799c(i4));
        }
        int i5 = C5715j.f16434r3;
        if (m39780v.m39783s(i5)) {
            m40038x(m39780v.m39788n(i5, 0));
        }
        m39780v.m39779w();
    }
}