package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.widget.C0579u0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActionMenuView extends C0579u0 implements C0389g.InterfaceC0391b, InterfaceC0407n {

    /* renamed from: A */
    private int f1503A;

    /* renamed from: B */
    private boolean f1504B;

    /* renamed from: C */
    private C0483c f1505C;

    /* renamed from: D */
    private InterfaceC0405m.InterfaceC0406a f1506D;

    /* renamed from: E */
    C0389g.InterfaceC0390a f1507E;

    /* renamed from: F */
    private boolean f1508F;

    /* renamed from: G */
    private int f1509G;

    /* renamed from: H */
    private int f1510H;

    /* renamed from: I */
    private int f1511I;

    /* renamed from: J */
    InterfaceC0427e f1512J;

    /* renamed from: y */
    private C0389g f1513y;

    /* renamed from: z */
    private Context f1514z;

    /* renamed from: androidx.appcompat.widget.ActionMenuView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0423a {
        /* renamed from: a */
        boolean mo39972a();

        /* renamed from: b */
        boolean mo39971b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0424b implements InterfaceC0405m.InterfaceC0406a {
        C0424b() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: a */
        public void mo39969a(C0389g c0389g, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: b */
        public boolean mo39968b(C0389g c0389g) {
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0425c extends C0579u0.C0580a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f1515a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f1516b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f1517c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f1518d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f1519e;

        /* renamed from: f */
        boolean f1520f;

        public C0425c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0425c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0425c(C0425c c0425c) {
            super(c0425c);
            this.f1515a = c0425c.f1515a;
        }

        public C0425c(int i, int i2) {
            super(i, i2);
            this.f1515a = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ActionMenuView$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0426d implements C0389g.InterfaceC0390a {
        C0426d() {
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: a */
        public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
            InterfaceC0427e interfaceC0427e = ActionMenuView.this.f1512J;
            if (interfaceC0427e != null && interfaceC0427e.onMenuItemClick(menuItem)) {
                return true;
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
        /* renamed from: b */
        public void mo40034b(C0389g c0389g) {
            C0389g.InterfaceC0390a interfaceC0390a = ActionMenuView.this.f1507E;
            if (interfaceC0390a != null) {
                interfaceC0390a.mo40034b(c0389g);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuView$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0427e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public static int m40239J(View view, int i, int i2, int i3, int i4) {
        ActionMenuItemView actionMenuItemView;
        boolean z;
        int i5;
        C0425c c0425c = (C0425c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z2 = true;
        if (actionMenuItemView != null && actionMenuItemView.m40431e()) {
            z = true;
        } else {
            z = false;
        }
        if (i2 > 0) {
            i5 = 2;
            if (!z || i2 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i6 = measuredWidth / i;
                if (measuredWidth % i != 0) {
                    i6++;
                }
                if (!z || i6 >= 2) {
                    i5 = i6;
                }
                if (!c0425c.f1515a || !z) {
                    z2 = false;
                }
                c0425c.f1518d = z2;
                c0425c.f1516b = i5;
                view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
                return i5;
            }
        }
        i5 = 0;
        if (!c0425c.f1515a) {
        }
        z2 = false;
        c0425c.f1518d = z2;
        c0425c.f1516b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* renamed from: K */
    private void m40238K(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        int i8;
        boolean z5;
        int i9;
        ?? r14;
        boolean z6;
        int i10;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
        int i11 = size - paddingLeft;
        int i12 = this.f1510H;
        int i13 = i11 / i12;
        int i14 = i11 % i12;
        if (i13 == 0) {
            setMeasuredDimension(i11, 0);
            return;
        }
        int i15 = i12 + (i14 / i13);
        int childCount = getChildCount();
        int i16 = 0;
        int i17 = 0;
        boolean z7 = false;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        long j = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i21 = size2;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i22 = i18 + 1;
                if (z8) {
                    int i23 = this.f1511I;
                    i9 = i22;
                    r14 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i9 = i22;
                    r14 = 0;
                }
                C0425c c0425c = (C0425c) childAt.getLayoutParams();
                c0425c.f1520f = r14;
                c0425c.f1517c = r14;
                c0425c.f1516b = r14;
                c0425c.f1518d = r14;
                ((LinearLayout.LayoutParams) c0425c).leftMargin = r14;
                ((LinearLayout.LayoutParams) c0425c).rightMargin = r14;
                if (z8 && ((ActionMenuItemView) childAt).m40431e()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                c0425c.f1519e = z6;
                if (c0425c.f1515a) {
                    i10 = 1;
                } else {
                    i10 = i13;
                }
                int m40239J = m40239J(childAt, i15, i10, childMeasureSpec, paddingTop);
                i19 = Math.max(i19, m40239J);
                if (c0425c.f1518d) {
                    i20++;
                }
                if (c0425c.f1515a) {
                    z7 = true;
                }
                i13 -= m40239J;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (m40239J == 1) {
                    j |= 1 << i17;
                    i16 = i16;
                }
                i18 = i9;
            }
            i17++;
            size2 = i21;
        }
        int i24 = size2;
        if (z7 && i18 == 2) {
            z = true;
        } else {
            z = false;
        }
        boolean z9 = false;
        while (i20 > 0 && i13 > 0) {
            int i25 = Integer.MAX_VALUE;
            int i26 = 0;
            int i27 = 0;
            long j2 = 0;
            while (i27 < childCount) {
                boolean z10 = z9;
                C0425c c0425c2 = (C0425c) getChildAt(i27).getLayoutParams();
                int i28 = i16;
                if (c0425c2.f1518d) {
                    int i29 = c0425c2.f1516b;
                    if (i29 < i25) {
                        j2 = 1 << i27;
                        i25 = i29;
                        i26 = 1;
                    } else if (i29 == i25) {
                        i26++;
                        j2 |= 1 << i27;
                    }
                }
                i27++;
                i16 = i28;
                z9 = z10;
            }
            z2 = z9;
            i5 = i16;
            j |= j2;
            if (i26 > i13) {
                i3 = mode;
                i4 = i11;
                break;
            }
            int i30 = i25 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                C0425c c0425c3 = (C0425c) childAt2.getLayoutParams();
                int i32 = i11;
                int i33 = mode;
                long j3 = 1 << i31;
                if ((j2 & j3) == 0) {
                    if (c0425c3.f1516b == i30) {
                        j |= j3;
                    }
                    z5 = z;
                } else {
                    if (z && c0425c3.f1519e && i13 == 1) {
                        int i34 = this.f1511I;
                        z5 = z;
                        childAt2.setPadding(i34 + i15, 0, i34, 0);
                    } else {
                        z5 = z;
                    }
                    c0425c3.f1516b++;
                    c0425c3.f1520f = true;
                    i13--;
                }
                i31++;
                mode = i33;
                i11 = i32;
                z = z5;
            }
            i16 = i5;
            z9 = true;
        }
        i3 = mode;
        i4 = i11;
        z2 = z9;
        i5 = i16;
        if (!z7 && i18 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i13 > 0 && j != 0 && (i13 < i18 - 1 || z3 || i19 > 1)) {
            float bitCount = Long.bitCount(j);
            if (!z3) {
                i6 = 0;
                if ((j & 1) != 0 && !((C0425c) getChildAt(0).getLayoutParams()).f1519e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount - 1;
                if ((j & (1 << i35)) != 0 && !((C0425c) getChildAt(i35).getLayoutParams()).f1519e) {
                    bitCount -= 0.5f;
                }
            } else {
                i6 = 0;
            }
            if (bitCount > 0.0f) {
                i8 = (int) ((i13 * i15) / bitCount);
            } else {
                i8 = i6;
            }
            z4 = z2;
            for (int i36 = i6; i36 < childCount; i36++) {
                if ((j & (1 << i36)) != 0) {
                    View childAt3 = getChildAt(i36);
                    C0425c c0425c4 = (C0425c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0425c4.f1517c = i8;
                        c0425c4.f1520f = true;
                        if (i36 == 0 && !c0425c4.f1519e) {
                            ((LinearLayout.LayoutParams) c0425c4).leftMargin = (-i8) / 2;
                        }
                        z4 = true;
                    } else if (c0425c4.f1515a) {
                        c0425c4.f1517c = i8;
                        c0425c4.f1520f = true;
                        ((LinearLayout.LayoutParams) c0425c4).rightMargin = (-i8) / 2;
                        z4 = true;
                    } else {
                        if (i36 != 0) {
                            ((LinearLayout.LayoutParams) c0425c4).leftMargin = i8 / 2;
                        }
                        if (i36 != childCount - 1) {
                            ((LinearLayout.LayoutParams) c0425c4).rightMargin = i8 / 2;
                        }
                    }
                }
            }
        } else {
            i6 = 0;
            z4 = z2;
        }
        if (z4) {
            for (int i37 = i6; i37 < childCount; i37++) {
                View childAt4 = getChildAt(i37);
                C0425c c0425c5 = (C0425c) childAt4.getLayoutParams();
                if (c0425c5.f1520f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0425c5.f1516b * i15) + c0425c5.f1517c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (i3 != 1073741824) {
            i7 = i5;
        } else {
            i7 = i24;
        }
        setMeasuredDimension(i4, i7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0
    /* renamed from: A */
    public C0425c mo39681k() {
        C0425c c0425c = new C0425c(-2, -2);
        ((LinearLayout.LayoutParams) c0425c).gravity = 16;
        return c0425c;
    }

    @Override // androidx.appcompat.widget.C0579u0
    /* renamed from: B */
    public C0425c mo39680l(AttributeSet attributeSet) {
        return new C0425c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0
    /* renamed from: C */
    public C0425c mo39679m(ViewGroup.LayoutParams layoutParams) {
        C0425c c0425c;
        if (layoutParams != null) {
            if (layoutParams instanceof C0425c) {
                c0425c = new C0425c((C0425c) layoutParams);
            } else {
                c0425c = new C0425c(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c0425c).gravity <= 0) {
                ((LinearLayout.LayoutParams) c0425c).gravity = 16;
            }
            return c0425c;
        }
        return mo39681k();
    }

    /* renamed from: D */
    public C0425c m40245D() {
        C0425c mo39681k = mo39681k();
        mo39681k.f1515a = true;
        return mo39681k;
    }

    /* renamed from: E */
    protected boolean m40244E(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0423a)) {
            z = false | ((InterfaceC0423a) childAt).mo39972a();
        }
        if (i > 0 && (childAt2 instanceof InterfaceC0423a)) {
            return z | ((InterfaceC0423a) childAt2).mo39971b();
        }
        return z;
    }

    /* renamed from: F */
    public boolean m40243F() {
        C0483c c0483c = this.f1505C;
        return c0483c != null && c0483c.m40002B();
    }

    /* renamed from: G */
    public boolean m40242G() {
        C0483c c0483c = this.f1505C;
        return c0483c != null && c0483c.m40000D();
    }

    /* renamed from: H */
    public boolean m40241H() {
        C0483c c0483c = this.f1505C;
        return c0483c != null && c0483c.m39999E();
    }

    /* renamed from: I */
    public boolean m40240I() {
        return this.f1504B;
    }

    /* renamed from: L */
    public C0389g m40237L() {
        return this.f1513y;
    }

    /* renamed from: M */
    public void m40236M(InterfaceC0405m.InterfaceC0406a interfaceC0406a, C0389g.InterfaceC0390a interfaceC0390a) {
        this.f1506D = interfaceC0406a;
        this.f1507E = interfaceC0390a;
    }

    /* renamed from: N */
    public boolean m40235N() {
        C0483c c0483c = this.f1505C;
        return c0483c != null && c0483c.m39993K();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n
    /* renamed from: a */
    public void mo27070a(C0389g c0389g) {
        this.f1513y = c0389g;
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0391b
    /* renamed from: b */
    public boolean mo40234b(C0393i c0393i) {
        return this.f1513y.m40386L(c0393i, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0425c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f1513y == null) {
            Context context = getContext();
            C0389g c0389g = new C0389g(context);
            this.f1513y = c0389g;
            c0389g.mo40282R(new C0426d());
            C0483c c0483c = new C0483c(context);
            this.f1505C = c0483c;
            c0483c.m39994J(true);
            C0483c c0483c2 = this.f1505C;
            InterfaceC0405m.InterfaceC0406a interfaceC0406a = this.f1506D;
            if (interfaceC0406a == null) {
                interfaceC0406a = new C0424b();
            }
            c0483c2.mo40296c(interfaceC0406a);
            this.f1513y.m40368c(this.f1505C, this.f1514z);
            this.f1505C.m39996H(this);
        }
        return this.f1513y;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f1505C.m40003A();
    }

    public int getPopupTheme() {
        return this.f1503A;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0483c c0483c = this.f1505C;
        if (c0483c != null) {
            c0483c.mo39990e(false);
            if (this.f1505C.m39999E()) {
                this.f1505C.m40002B();
                this.f1505C.m39993K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m40233z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        if (!this.f1508F) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean m39572b = C0616y1.m39572b(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                C0425c c0425c = (C0425c) childAt.getLayoutParams();
                if (c0425c.f1515a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m40244E(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (m39572b) {
                        i6 = getPaddingLeft() + ((LinearLayout.LayoutParams) c0425c).leftMargin;
                        width = i6 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0425c).rightMargin;
                        i6 = width - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i6, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0425c).leftMargin) + ((LinearLayout.LayoutParams) c0425c).rightMargin;
                    m40244E(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        if (i15 > 0) {
            i5 = paddingRight / i15;
        } else {
            i5 = 0;
        }
        int max = Math.max(0, i5);
        if (m39572b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                C0425c c0425c2 = (C0425c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0425c2.f1515a) {
                    int i17 = width2 - ((LinearLayout.LayoutParams) c0425c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0425c2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            C0425c c0425c3 = (C0425c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0425c3.f1515a) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) c0425c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + ((LinearLayout.LayoutParams) c0425c3).rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0579u0, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        C0389g c0389g;
        boolean z2 = this.f1508F;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f1508F = z;
        if (z2 != z) {
            this.f1509G = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1508F && (c0389g = this.f1513y) != null && size != this.f1509G) {
            this.f1509G = size;
            c0389g.m40387K(true);
        }
        int childCount = getChildCount();
        if (this.f1508F && childCount > 0) {
            m40238K(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            C0425c c0425c = (C0425c) getChildAt(i3).getLayoutParams();
            ((LinearLayout.LayoutParams) c0425c).rightMargin = 0;
            ((LinearLayout.LayoutParams) c0425c).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f1505C.m39997G(z);
    }

    public void setOnMenuItemClickListener(InterfaceC0427e interfaceC0427e) {
        this.f1512J = interfaceC0427e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f1505C.m39995I(drawable);
    }

    public void setOverflowReserved(boolean z) {
        this.f1504B = z;
    }

    public void setPopupTheme(int i) {
        if (this.f1503A != i) {
            this.f1503A = i;
            if (i == 0) {
                this.f1514z = getContext();
            } else {
                this.f1514z = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C0483c c0483c) {
        this.f1505C = c0483c;
        c0483c.m39996H(this);
    }

    /* renamed from: z */
    public void m40233z() {
        C0483c c0483c = this.f1505C;
        if (c0483c != null) {
            c0483c.m39975y();
        }
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f1510H = (int) (56.0f * f);
        this.f1511I = (int) (f * 4.0f);
        this.f1514z = context;
        this.f1503A = 0;
    }
}
