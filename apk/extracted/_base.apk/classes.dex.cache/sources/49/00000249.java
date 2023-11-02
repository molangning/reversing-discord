package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.C0357a;
import androidx.appcompat.widget.C0579u0;
import p052d.C5706a;

/* renamed from: androidx.appcompat.widget.f1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0514f1 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: s */
    private static final Interpolator f1804s = new DecelerateInterpolator();

    /* renamed from: j */
    Runnable f1805j;

    /* renamed from: k */
    private View$OnClickListenerC0517c f1806k;

    /* renamed from: l */
    C0579u0 f1807l;

    /* renamed from: m */
    private Spinner f1808m;

    /* renamed from: n */
    private boolean f1809n;

    /* renamed from: o */
    int f1810o;

    /* renamed from: p */
    int f1811p;

    /* renamed from: q */
    private int f1812q;

    /* renamed from: r */
    private int f1813r;

    /* renamed from: androidx.appcompat.widget.f1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0515a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ View f1814j;

        RunnableC0515a(View view) {
            C0514f1.this = r1;
            this.f1814j = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0514f1.this.smoothScrollTo(this.f1814j.getLeft() - ((C0514f1.this.getWidth() - this.f1814j.getWidth()) / 2), 0);
            C0514f1.this.f1805j = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.f1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0516b extends BaseAdapter {
        C0516b() {
            C0514f1.this = r1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return C0514f1.this.f1807l.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((C0518d) C0514f1.this.f1807l.getChildAt(i)).m39888b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0514f1.this.m39893c((ActionBar.AbstractC0276c) getItem(i), true);
            }
            ((C0518d) view).m39889a((ActionBar.AbstractC0276c) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.f1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnClickListenerC0517c implements View.OnClickListener {
        View$OnClickListenerC0517c() {
            C0514f1.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z;
            ((C0518d) view).m39888b().m40775e();
            int childCount = C0514f1.this.f1807l.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0514f1.this.f1807l.getChildAt(i);
                if (childAt == view) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.f1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0518d extends LinearLayout {

        /* renamed from: j */
        private final int[] f1818j;

        /* renamed from: k */
        private ActionBar.AbstractC0276c f1819k;

        /* renamed from: l */
        private TextView f1820l;

        /* renamed from: m */
        private ImageView f1821m;

        /* renamed from: n */
        private View f1822n;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C0518d(android.content.Context r6, androidx.appcompat.app.ActionBar.AbstractC0276c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.C0514f1.this = r5
                int r5 = p052d.C5706a.f16050d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1818j = r1
                r4.f1819k = r7
                androidx.appcompat.widget.n1 r5 = androidx.appcompat.widget.C0544n1.m39780v(r6, r0, r1, r5, r3)
                boolean r6 = r5.m39783s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.m39795g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.m39779w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.m39887c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0514f1.C0518d.<init>(androidx.appcompat.widget.f1, android.content.Context, androidx.appcompat.app.ActionBar$c, boolean):void");
        }

        /* renamed from: a */
        public void m39889a(ActionBar.AbstractC0276c abstractC0276c) {
            this.f1819k = abstractC0276c;
            m39887c();
        }

        /* renamed from: b */
        public ActionBar.AbstractC0276c m39888b() {
            return this.f1819k;
        }

        /* renamed from: c */
        public void m39887c() {
            ActionBar.AbstractC0276c abstractC0276c = this.f1819k;
            View m40778b = abstractC0276c.m40778b();
            CharSequence charSequence = null;
            if (m40778b != null) {
                ViewParent parent = m40778b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(m40778b);
                    }
                    addView(m40778b);
                }
                this.f1822n = m40778b;
                TextView textView = this.f1820l;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1821m;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1821m.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1822n;
            if (view != null) {
                removeView(view);
                this.f1822n = null;
            }
            Drawable m40777c = abstractC0276c.m40777c();
            CharSequence m40776d = abstractC0276c.m40776d();
            if (m40777c != null) {
                if (this.f1821m == null) {
                    C0539m c0539m = new C0539m(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c0539m.setLayoutParams(layoutParams);
                    addView(c0539m, 0);
                    this.f1821m = c0539m;
                }
                this.f1821m.setImageDrawable(m40777c);
                this.f1821m.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1821m;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1821m.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(m40776d);
            if (z) {
                if (this.f1820l == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C5706a.f16051e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1820l = appCompatTextView;
                }
                this.f1820l.setText(m40776d);
                this.f1820l.setVisibility(0);
            } else {
                TextView textView2 = this.f1820l;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1820l.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1821m;
            if (imageView3 != null) {
                imageView3.setContentDescription(abstractC0276c.m40779a());
            }
            if (!z) {
                charSequence = abstractC0276c.m40779a();
            }
            C0570s1.m39702a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0514f1.this.f1810o > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0514f1.this.f1810o;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* renamed from: b */
    private Spinner m39894b() {
        C0594w c0594w = new C0594w(getContext(), null, C5706a.f16054h);
        c0594w.setLayoutParams(new C0579u0.C0580a(-2, -1));
        c0594w.setOnItemSelectedListener(this);
        return c0594w;
    }

    /* renamed from: d */
    private boolean m39892d() {
        Spinner spinner = this.f1808m;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: e */
    private void m39891e() {
        if (m39892d()) {
            return;
        }
        if (this.f1808m == null) {
            this.f1808m = m39894b();
        }
        removeView(this.f1807l);
        addView(this.f1808m, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1808m.getAdapter() == null) {
            this.f1808m.setAdapter((SpinnerAdapter) new C0516b());
        }
        Runnable runnable = this.f1805j;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1805j = null;
        }
        this.f1808m.setSelection(this.f1813r);
    }

    /* renamed from: f */
    private boolean m39890f() {
        if (!m39892d()) {
            return false;
        }
        removeView(this.f1808m);
        addView(this.f1807l, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1808m.getSelectedItemPosition());
        return false;
    }

    /* renamed from: a */
    public void m39895a(int i) {
        View childAt = this.f1807l.getChildAt(i);
        Runnable runnable = this.f1805j;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        RunnableC0515a runnableC0515a = new RunnableC0515a(childAt);
        this.f1805j = runnableC0515a;
        post(runnableC0515a);
    }

    /* renamed from: c */
    C0518d m39893c(ActionBar.AbstractC0276c abstractC0276c, boolean z) {
        C0518d c0518d = new C0518d(getContext(), abstractC0276c, z);
        if (z) {
            c0518d.setBackgroundDrawable(null);
            c0518d.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1812q));
        } else {
            c0518d.setFocusable(true);
            if (this.f1806k == null) {
                this.f1806k = new View$OnClickListenerC0517c();
            }
            c0518d.setOnClickListener(this.f1806k);
        }
        return c0518d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1805j;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0357a m40493b = C0357a.m40493b(getContext());
        setContentHeight(m40493b.m40489f());
        this.f1811p = m40493b.m40490e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1805j;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0518d) view).m39888b().m40775e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int mode = View.MeasureSpec.getMode(i);
        boolean z2 = true;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        int childCount = this.f1807l.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f1810o = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f1810o = View.MeasureSpec.getSize(i) / 2;
            }
            this.f1810o = Math.min(this.f1810o, this.f1811p);
        } else {
            this.f1810o = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1812q, 1073741824);
        if (z || !this.f1809n) {
            z2 = false;
        }
        if (z2) {
            this.f1807l.measure(0, makeMeasureSpec);
            if (this.f1807l.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                m39891e();
            } else {
                m39890f();
            }
        } else {
            m39890f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1813r);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1809n = z;
    }

    public void setContentHeight(int i) {
        this.f1812q = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        boolean z;
        this.f1813r = i;
        int childCount = this.f1807l.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f1807l.getChildAt(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                m39895a(i);
            }
        }
        Spinner spinner = this.f1808m;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }
}