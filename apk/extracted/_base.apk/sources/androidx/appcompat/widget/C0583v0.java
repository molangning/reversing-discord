package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.InterfaceC0410p;
import androidx.core.view.C1365w0;
import androidx.core.widget.C1432j;
import com.facebook.react.uimanager.ViewDefaults;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.reflect.Method;
import p052d.C5706a;
import p052d.C5715j;

/* renamed from: androidx.appcompat.widget.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0583v0 implements InterfaceC0410p {

    /* renamed from: P */
    private static Method f1998P;

    /* renamed from: Q */
    private static Method f1999Q;

    /* renamed from: R */
    private static Method f2000R;

    /* renamed from: A */
    private DataSetObserver f2001A;

    /* renamed from: B */
    private View f2002B;

    /* renamed from: C */
    private Drawable f2003C;

    /* renamed from: D */
    private AdapterView.OnItemClickListener f2004D;

    /* renamed from: E */
    private AdapterView.OnItemSelectedListener f2005E;

    /* renamed from: F */
    final RunnableC0592i f2006F;

    /* renamed from: G */
    private final View$OnTouchListenerC0591h f2007G;

    /* renamed from: H */
    private final C0590g f2008H;

    /* renamed from: I */
    private final RunnableC0588e f2009I;

    /* renamed from: J */
    private Runnable f2010J;

    /* renamed from: K */
    final Handler f2011K;

    /* renamed from: L */
    private final Rect f2012L;

    /* renamed from: M */
    private Rect f2013M;

    /* renamed from: N */
    private boolean f2014N;

    /* renamed from: O */
    PopupWindow f2015O;

    /* renamed from: j */
    private Context f2016j;

    /* renamed from: k */
    private ListAdapter f2017k;

    /* renamed from: l */
    C0560r0 f2018l;

    /* renamed from: m */
    private int f2019m;

    /* renamed from: n */
    private int f2020n;

    /* renamed from: o */
    private int f2021o;

    /* renamed from: p */
    private int f2022p;

    /* renamed from: q */
    private int f2023q;

    /* renamed from: r */
    private boolean f2024r;

    /* renamed from: s */
    private boolean f2025s;

    /* renamed from: t */
    private boolean f2026t;

    /* renamed from: u */
    private int f2027u;

    /* renamed from: v */
    private boolean f2028v;

    /* renamed from: w */
    private boolean f2029w;

    /* renamed from: x */
    int f2030x;

    /* renamed from: y */
    private View f2031y;

    /* renamed from: z */
    private int f2032z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0584a implements Runnable {
        RunnableC0584a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View m39635r = C0583v0.this.m39635r();
            if (m39635r != null && m39635r.getWindowToken() != null) {
                C0583v0.this.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0585b implements AdapterView.OnItemSelectedListener {
        C0585b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C0560r0 c0560r0;
            if (i != -1 && (c0560r0 = C0583v0.this.f2018l) != null) {
                c0560r0.setListSelectionHidden(false);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0586c {
        /* renamed from: a */
        static int m39626a(PopupWindow popupWindow, View view, int i, boolean z) {
            int maxAvailableHeight;
            maxAvailableHeight = popupWindow.getMaxAvailableHeight(view, i, z);
            return maxAvailableHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.v0$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0587d {
        /* renamed from: a */
        static void m39625a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        static void m39624b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v0$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0588e implements Runnable {
        RunnableC0588e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0583v0.this.m39637p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v0$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0589f extends DataSetObserver {
        C0589f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C0583v0.this.isShowing()) {
                C0583v0.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C0583v0.this.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v0$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0590g implements AbsListView.OnScrollListener {
        C0590g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !C0583v0.this.m39628y() && C0583v0.this.f2015O.getContentView() != null) {
                C0583v0 c0583v0 = C0583v0.this;
                c0583v0.f2011K.removeCallbacks(c0583v0.f2006F);
                C0583v0.this.f2006F.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v0$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnTouchListenerC0591h implements View.OnTouchListener {
        View$OnTouchListenerC0591h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C0583v0.this.f2015O) != null && popupWindow.isShowing() && x >= 0 && x < C0583v0.this.f2015O.getWidth() && y >= 0 && y < C0583v0.this.f2015O.getHeight()) {
                C0583v0 c0583v0 = C0583v0.this;
                c0583v0.f2011K.postDelayed(c0583v0.f2006F, 250L);
                return false;
            } else if (action == 1) {
                C0583v0 c0583v02 = C0583v0.this;
                c0583v02.f2011K.removeCallbacks(c0583v02.f2006F);
                return false;
            } else {
                return false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.v0$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0592i implements Runnable {
        RunnableC0592i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0560r0 c0560r0 = C0583v0.this.f2018l;
            if (c0560r0 != null && C1365w0.m37225T(c0560r0) && C0583v0.this.f2018l.getCount() > C0583v0.this.f2018l.getChildCount()) {
                int childCount = C0583v0.this.f2018l.getChildCount();
                C0583v0 c0583v0 = C0583v0.this;
                if (childCount <= c0583v0.f2030x) {
                    c0583v0.f2015O.setInputMethodMode(2);
                    C0583v0.this.show();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1998P = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2000R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1999Q = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0583v0(Context context) {
        this(context, null, C5706a.f16036E);
    }

    /* renamed from: A */
    private void m39660A() {
        View view = this.f2031y;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f2031y);
            }
        }
    }

    /* renamed from: L */
    private void m39649L(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f1998P;
            if (method != null) {
                try {
                    method.invoke(this.f2015O, Boolean.valueOf(z));
                    return;
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    return;
                }
            }
            return;
        }
        C0587d.m39624b(this.f2015O, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    private int m39638o() {
        int i;
        int i2;
        int makeMeasureSpec;
        int i3;
        boolean z = true;
        if (this.f2018l == null) {
            Context context = this.f2016j;
            this.f2010J = new RunnableC0584a();
            C0560r0 mo39636q = mo39636q(context, !this.f2014N);
            this.f2018l = mo39636q;
            Drawable drawable = this.f2003C;
            if (drawable != null) {
                mo39636q.setSelector(drawable);
            }
            this.f2018l.setAdapter(this.f2017k);
            this.f2018l.setOnItemClickListener(this.f2004D);
            this.f2018l.setFocusable(true);
            this.f2018l.setFocusableInTouchMode(true);
            this.f2018l.setOnItemSelectedListener(new C0585b());
            this.f2018l.setOnScrollListener(this.f2008H);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2005E;
            if (onItemSelectedListener != null) {
                this.f2018l.setOnItemSelectedListener(onItemSelectedListener);
            }
            C0560r0 c0560r0 = this.f2018l;
            View view = this.f2031y;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f2032z;
                if (i4 != 0) {
                    if (i4 != 1) {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.f2032z);
                    } else {
                        linearLayout.addView(c0560r0, layoutParams);
                        linearLayout.addView(view);
                    }
                } else {
                    linearLayout.addView(view);
                    linearLayout.addView(c0560r0, layoutParams);
                }
                int i5 = this.f2020n;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                c0560r0 = linearLayout;
            } else {
                i = 0;
            }
            this.f2015O.setContentView(c0560r0);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f2015O.getContentView();
            View view2 = this.f2031y;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f2015O.getBackground();
        if (background != null) {
            background.getPadding(this.f2012L);
            Rect rect = this.f2012L;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f2024r) {
                this.f2022p = -i6;
            }
        } else {
            this.f2012L.setEmpty();
            i2 = 0;
        }
        if (this.f2015O.getInputMethodMode() != 2) {
            z = false;
        }
        int m39634s = m39634s(m39635r(), this.f2022p, z);
        if (!this.f2028v && this.f2019m != -1) {
            int i7 = this.f2020n;
            if (i7 != -2) {
                if (i7 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else {
                    int i8 = this.f2016j.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f2012L;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), 1073741824);
                }
            } else {
                int i9 = this.f2016j.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f2012L;
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), Integer.MIN_VALUE);
            }
            int mo39725d = this.f2018l.mo39725d(makeMeasureSpec, 0, -1, m39634s - i, -1);
            if (mo39725d > 0) {
                i += i2 + this.f2018l.getPaddingTop() + this.f2018l.getPaddingBottom();
            }
            return mo39725d + i;
        }
        return m39634s + i2;
    }

    /* renamed from: s */
    private int m39634s(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1999Q;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(this.f2015O, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.f2015O.getMaxAvailableHeight(view, i);
        }
        return C0586c.m39626a(this.f2015O, view, i, z);
    }

    /* renamed from: B */
    public void m39659B(View view) {
        this.f2002B = view;
    }

    /* renamed from: C */
    public void m39658C(int i) {
        this.f2015O.setAnimationStyle(i);
    }

    /* renamed from: D */
    public void m39657D(int i) {
        Drawable background = this.f2015O.getBackground();
        if (background != null) {
            background.getPadding(this.f2012L);
            Rect rect = this.f2012L;
            this.f2020n = rect.left + rect.right + i;
            return;
        }
        m39646O(i);
    }

    /* renamed from: E */
    public void m39656E(int i) {
        this.f2027u = i;
    }

    /* renamed from: F */
    public void m39655F(Rect rect) {
        this.f2013M = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: G */
    public void m39654G(int i) {
        this.f2015O.setInputMethodMode(i);
    }

    /* renamed from: H */
    public void m39653H(boolean z) {
        this.f2014N = z;
        this.f2015O.setFocusable(z);
    }

    /* renamed from: I */
    public void m39652I(PopupWindow.OnDismissListener onDismissListener) {
        this.f2015O.setOnDismissListener(onDismissListener);
    }

    /* renamed from: J */
    public void m39651J(AdapterView.OnItemClickListener onItemClickListener) {
        this.f2004D = onItemClickListener;
    }

    /* renamed from: K */
    public void m39650K(boolean z) {
        this.f2026t = true;
        this.f2025s = z;
    }

    /* renamed from: M */
    public void m39648M(int i) {
        this.f2032z = i;
    }

    /* renamed from: N */
    public void m39647N(int i) {
        C0560r0 c0560r0 = this.f2018l;
        if (isShowing() && c0560r0 != null) {
            c0560r0.setListSelectionHidden(false);
            c0560r0.setSelection(i);
            if (c0560r0.getChoiceMode() != 0) {
                c0560r0.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: O */
    public void m39646O(int i) {
        this.f2020n = i;
    }

    /* renamed from: a */
    public int m39645a() {
        return this.f2021o;
    }

    /* renamed from: b */
    public void m39644b(Drawable drawable) {
        this.f2015O.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public void m39643d(int i) {
        this.f2021o = i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void dismiss() {
        this.f2015O.dismiss();
        m39660A();
        this.f2015O.setContentView(null);
        this.f2018l = null;
        this.f2011K.removeCallbacks(this.f2006F);
    }

    /* renamed from: f */
    public Drawable m39642f() {
        return this.f2015O.getBackground();
    }

    /* renamed from: h */
    public void m39641h(int i) {
        this.f2022p = i;
        this.f2024r = true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public boolean isShowing() {
        return this.f2015O.isShowing();
    }

    /* renamed from: k */
    public int m39640k() {
        if (!this.f2024r) {
            return 0;
        }
        return this.f2022p;
    }

    /* renamed from: l */
    public void mo39587l(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f2001A;
        if (dataSetObserver == null) {
            this.f2001A = new C0589f();
        } else {
            ListAdapter listAdapter2 = this.f2017k;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f2017k = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2001A);
        }
        C0560r0 c0560r0 = this.f2018l;
        if (c0560r0 != null) {
            c0560r0.setAdapter(this.f2017k);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    /* renamed from: n */
    public ListView mo39639n() {
        return this.f2018l;
    }

    /* renamed from: p */
    public void m39637p() {
        C0560r0 c0560r0 = this.f2018l;
        if (c0560r0 != null) {
            c0560r0.setListSelectionHidden(true);
            c0560r0.requestLayout();
        }
    }

    /* renamed from: q */
    C0560r0 mo39636q(Context context, boolean z) {
        return new C0560r0(context, z);
    }

    /* renamed from: r */
    public View m39635r() {
        return this.f2002B;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0410p
    public void show() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int m39638o = m39638o();
        boolean m39628y = m39628y();
        C1432j.m36887b(this.f2015O, this.f2023q);
        boolean z2 = true;
        if (this.f2015O.isShowing()) {
            if (!C1365w0.m37225T(m39635r())) {
                return;
            }
            int i5 = this.f2020n;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = m39635r().getWidth();
            }
            int i6 = this.f2019m;
            if (i6 == -1) {
                if (!m39628y) {
                    m39638o = -1;
                }
                if (m39628y) {
                    PopupWindow popupWindow = this.f2015O;
                    if (this.f2020n == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow.setWidth(i4);
                    this.f2015O.setHeight(0);
                } else {
                    PopupWindow popupWindow2 = this.f2015O;
                    if (this.f2020n == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow2.setWidth(i3);
                    this.f2015O.setHeight(-1);
                }
            } else if (i6 != -2) {
                m39638o = i6;
            }
            PopupWindow popupWindow3 = this.f2015O;
            if (this.f2029w || this.f2028v) {
                z2 = false;
            }
            popupWindow3.setOutsideTouchable(z2);
            PopupWindow popupWindow4 = this.f2015O;
            View m39635r = m39635r();
            int i7 = this.f2021o;
            int i8 = this.f2022p;
            if (i5 < 0) {
                i = -1;
            } else {
                i = i5;
            }
            if (m39638o < 0) {
                i2 = -1;
            } else {
                i2 = m39638o;
            }
            popupWindow4.update(m39635r, i7, i8, i, i2);
            return;
        }
        int i9 = this.f2020n;
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = m39635r().getWidth();
        }
        int i10 = this.f2019m;
        if (i10 == -1) {
            m39638o = -1;
        } else if (i10 != -2) {
            m39638o = i10;
        }
        this.f2015O.setWidth(i9);
        this.f2015O.setHeight(m39638o);
        m39649L(true);
        PopupWindow popupWindow5 = this.f2015O;
        if (!this.f2029w && !this.f2028v) {
            z = true;
        } else {
            z = false;
        }
        popupWindow5.setOutsideTouchable(z);
        this.f2015O.setTouchInterceptor(this.f2007G);
        if (this.f2026t) {
            C1432j.m36888a(this.f2015O, this.f2025s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f2000R;
            if (method != null) {
                try {
                    method.invoke(this.f2015O, this.f2013M);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            C0587d.m39625a(this.f2015O, this.f2013M);
        }
        C1432j.m36886c(this.f2015O, m39635r(), this.f2021o, this.f2022p, this.f2027u);
        this.f2018l.setSelection(-1);
        if (!this.f2014N || this.f2018l.isInTouchMode()) {
            m39637p();
        }
        if (!this.f2014N) {
            this.f2011K.post(this.f2009I);
        }
    }

    /* renamed from: t */
    public Object m39633t() {
        if (!isShowing()) {
            return null;
        }
        return this.f2018l.getSelectedItem();
    }

    /* renamed from: u */
    public long m39632u() {
        if (!isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.f2018l.getSelectedItemId();
    }

    /* renamed from: v */
    public int m39631v() {
        if (!isShowing()) {
            return -1;
        }
        return this.f2018l.getSelectedItemPosition();
    }

    /* renamed from: w */
    public View m39630w() {
        if (!isShowing()) {
            return null;
        }
        return this.f2018l.getSelectedView();
    }

    /* renamed from: x */
    public int m39629x() {
        return this.f2020n;
    }

    /* renamed from: y */
    public boolean m39628y() {
        return this.f2015O.getInputMethodMode() == 2;
    }

    /* renamed from: z */
    public boolean m39627z() {
        return this.f2014N;
    }

    public C0583v0(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public C0583v0(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2019m = -2;
        this.f2020n = -2;
        this.f2023q = RNCWebViewManager.COMMAND_CLEAR_HISTORY;
        this.f2027u = 0;
        this.f2028v = false;
        this.f2029w = false;
        this.f2030x = ViewDefaults.NUMBER_OF_LINES;
        this.f2032z = 0;
        this.f2006F = new RunnableC0592i();
        this.f2007G = new View$OnTouchListenerC0591h();
        this.f2008H = new C0590g();
        this.f2009I = new RunnableC0588e();
        this.f2012L = new Rect();
        this.f2016j = context;
        this.f2011K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16402l1, i, i2);
        this.f2021o = obtainStyledAttributes.getDimensionPixelOffset(C5715j.f16407m1, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C5715j.f16412n1, 0);
        this.f2022p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2024r = true;
        }
        obtainStyledAttributes.recycle();
        C0545o c0545o = new C0545o(context, attributeSet, i, i2);
        this.f2015O = c0545o;
        c0545o.setInputMethodMode(1);
    }
}
