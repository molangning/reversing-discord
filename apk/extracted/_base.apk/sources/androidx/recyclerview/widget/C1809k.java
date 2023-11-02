package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;

/* renamed from: androidx.recyclerview.widget.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1809k extends AbstractC1813n {

    /* renamed from: d */
    private AbstractC1806j f4965d;

    /* renamed from: e */
    private AbstractC1806j f4966e;

    /* renamed from: androidx.recyclerview.widget.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1810a extends C1802g {
        C1810a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C1802g
        protected float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1802g
        public int calculateTimeForScrolling(int i) {
            return Math.min(100, super.calculateTimeForScrolling(i));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.C1802g, androidx.recyclerview.widget.RecyclerView.SmoothScroller
        public void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
            C1809k c1809k = C1809k.this;
            int[] mo35338c = c1809k.mo35338c(c1809k.f4968a.getLayoutManager(), view);
            int i = mo35338c[0];
            int i2 = mo35338c[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
            if (calculateTimeForDeceleration > 0) {
                action.m35614d(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    /* renamed from: k */
    private int m35350k(View view, AbstractC1806j abstractC1806j) {
        return (abstractC1806j.mo35361g(view) + (abstractC1806j.mo35363e(view) / 2)) - (abstractC1806j.mo35355m() + (abstractC1806j.mo35354n() / 2));
    }

    /* renamed from: l */
    private View m35349l(RecyclerView.LayoutManager layoutManager, AbstractC1806j abstractC1806j) {
        int m35736U = layoutManager.m35736U();
        View view = null;
        if (m35736U == 0) {
            return null;
        }
        int mo35355m = abstractC1806j.mo35355m() + (abstractC1806j.mo35354n() / 2);
        int i = ViewDefaults.NUMBER_OF_LINES;
        for (int i2 = 0; i2 < m35736U; i2++) {
            View m35739T = layoutManager.m35739T(i2);
            int abs = Math.abs((abstractC1806j.mo35361g(m35739T) + (abstractC1806j.mo35363e(m35739T) / 2)) - mo35355m);
            if (abs < i) {
                view = m35739T;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: m */
    private AbstractC1806j m35348m(RecyclerView.LayoutManager layoutManager) {
        AbstractC1806j abstractC1806j = this.f4966e;
        if (abstractC1806j == null || abstractC1806j.f4962a != layoutManager) {
            this.f4966e = AbstractC1806j.m35369a(layoutManager);
        }
        return this.f4966e;
    }

    /* renamed from: n */
    private AbstractC1806j m35347n(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo28485w()) {
            return m35346o(layoutManager);
        }
        if (layoutManager.mo28487v()) {
            return m35348m(layoutManager);
        }
        return null;
    }

    /* renamed from: o */
    private AbstractC1806j m35346o(RecyclerView.LayoutManager layoutManager) {
        AbstractC1806j abstractC1806j = this.f4965d;
        if (abstractC1806j == null || abstractC1806j.f4962a != layoutManager) {
            this.f4965d = AbstractC1806j.m35367c(layoutManager);
        }
        return this.f4965d;
    }

    /* renamed from: p */
    private boolean m35345p(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        return layoutManager.mo28487v() ? i > 0 : i2 > 0;
    }

    /* renamed from: q */
    private boolean m35344q(RecyclerView.LayoutManager layoutManager) {
        PointF mo28517a;
        int m35715j0 = layoutManager.m35715j0();
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.InterfaceC1763a) || (mo28517a = ((RecyclerView.SmoothScroller.InterfaceC1763a) layoutManager).mo28517a(m35715j0 - 1)) == null) {
            return false;
        }
        if (mo28517a.x >= 0.0f && mo28517a.y >= 0.0f) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC1813n
    /* renamed from: c */
    public int[] mo35338c(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.mo28487v()) {
            iArr[0] = m35350k(view, m35348m(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.mo28485w()) {
            iArr[1] = m35350k(view, m35346o(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1813n
    /* renamed from: d */
    protected RecyclerView.SmoothScroller mo35337d(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.InterfaceC1763a)) {
            return null;
        }
        return new C1810a(this.f4968a.getContext());
    }

    @Override // androidx.recyclerview.widget.AbstractC1813n
    /* renamed from: f */
    public View mo34896f(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.mo28485w()) {
            return m35349l(layoutManager, m35346o(layoutManager));
        }
        if (layoutManager.mo28487v()) {
            return m35349l(layoutManager, m35348m(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC1813n
    /* renamed from: g */
    public int mo35335g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        AbstractC1806j m35347n;
        int i3;
        int m35715j0 = layoutManager.m35715j0();
        if (m35715j0 == 0 || (m35347n = m35347n(layoutManager)) == null) {
            return -1;
        }
        int m35736U = layoutManager.m35736U();
        View view = null;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < m35736U; i6++) {
            View m35739T = layoutManager.m35739T(i6);
            if (m35739T != null) {
                int m35350k = m35350k(m35739T, m35347n);
                if (m35350k <= 0 && m35350k > i5) {
                    view2 = m35739T;
                    i5 = m35350k;
                }
                if (m35350k >= 0 && m35350k < i4) {
                    view = m35739T;
                    i4 = m35350k;
                }
            }
        }
        boolean m35345p = m35345p(layoutManager, i, i2);
        if (m35345p && view != null) {
            return layoutManager.m35705o0(view);
        }
        if (!m35345p && view2 != null) {
            return layoutManager.m35705o0(view2);
        }
        if (m35345p) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m35705o0 = layoutManager.m35705o0(view);
        if (m35344q(layoutManager) == m35345p) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        int i7 = m35705o0 + i3;
        if (i7 < 0 || i7 >= m35715j0) {
            return -1;
        }
        return i7;
    }
}
