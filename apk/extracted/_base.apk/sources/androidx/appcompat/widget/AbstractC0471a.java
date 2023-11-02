package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1304n2;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1311o2;
import p052d.C5706a;
import p052d.C5715j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0471a extends ViewGroup {

    /* renamed from: j */
    protected final C0472a f1713j;

    /* renamed from: k */
    protected final Context f1714k;

    /* renamed from: l */
    protected ActionMenuView f1715l;

    /* renamed from: m */
    protected C0483c f1716m;

    /* renamed from: n */
    protected int f1717n;

    /* renamed from: o */
    protected C1304n2 f1718o;

    /* renamed from: p */
    private boolean f1719p;

    /* renamed from: q */
    private boolean f1720q;

    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    protected class C0472a implements InterfaceC1311o2 {

        /* renamed from: a */
        private boolean f1721a = false;

        /* renamed from: b */
        int f1722b;

        protected C0472a() {
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: a */
        public void mo37350a(View view) {
            this.f1721a = true;
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            if (this.f1721a) {
                return;
            }
            AbstractC0471a abstractC0471a = AbstractC0471a.this;
            abstractC0471a.f1718o = null;
            AbstractC0471a.super.setVisibility(this.f1722b);
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: c */
        public void mo37349c(View view) {
            AbstractC0471a.super.setVisibility(0);
            this.f1721a = false;
        }

        /* renamed from: d */
        public C0472a m40016d(C1304n2 c1304n2, int i) {
            AbstractC0471a.this.f1718o = c1304n2;
            this.f1722b = i;
            return this;
        }
    }

    AbstractC0471a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static int m40019d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m40020c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public int m40018e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: f */
    public C1304n2 mo40017f(int i, long j) {
        C1304n2 c1304n2 = this.f1718o;
        if (c1304n2 != null) {
            c1304n2.m37369c();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C1304n2 m37370b = C1365w0.m37210e(this).m37370b(1.0f);
            m37370b.m37366f(j);
            m37370b.m37364h(this.f1713j.m40016d(m37370b, i));
            return m37370b;
        }
        C1304n2 m37370b2 = C1365w0.m37210e(this).m37370b(0.0f);
        m37370b2.m37366f(j);
        m37370b2.m37364h(this.f1713j.m40016d(m37370b2, i));
        return m37370b2;
    }

    public int getAnimatedVisibility() {
        if (this.f1718o != null) {
            return this.f1713j.f1722b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1717n;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, C5715j.f16345a, C5706a.f16049c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C5715j.f16390j, 0));
        obtainStyledAttributes.recycle();
        C0483c c0483c = this.f1716m;
        if (c0483c != null) {
            c0483c.m39998F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1720q = false;
        }
        if (!this.f1720q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1720q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1720q = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1719p = false;
        }
        if (!this.f1719p) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1719p = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1719p = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1717n = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C1304n2 c1304n2 = this.f1718o;
            if (c1304n2 != null) {
                c1304n2.m37369c();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0471a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1713j = new C0472a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C5706a.f16047a, typedValue, true) && typedValue.resourceId != 0) {
            this.f1714k = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1714k = context;
        }
    }
}
