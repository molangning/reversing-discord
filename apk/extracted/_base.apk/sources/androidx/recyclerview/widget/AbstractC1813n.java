package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1813n extends RecyclerView.OnFlingListener {

    /* renamed from: a */
    RecyclerView f4968a;

    /* renamed from: b */
    private Scroller f4969b;

    /* renamed from: c */
    private final RecyclerView.OnScrollListener f4970c = new C1814a();

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1814a extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        boolean f4971a = false;

        C1814a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f4971a) {
                this.f4971a = false;
                AbstractC1813n.this.m35332j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f4971a = true;
        }
    }

    /* renamed from: e */
    private void m35336e() {
        this.f4968a.removeOnScrollListener(this.f4970c);
        this.f4968a.setOnFlingListener(null);
    }

    /* renamed from: h */
    private void m35334h() {
        if (this.f4968a.getOnFlingListener() == null) {
            this.f4968a.addOnScrollListener(this.f4970c);
            this.f4968a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: i */
    private boolean m35333i(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        RecyclerView.SmoothScroller mo35337d;
        int mo35335g;
        if (!(layoutManager instanceof RecyclerView.SmoothScroller.InterfaceC1763a) || (mo35337d = mo35337d(layoutManager)) == null || (mo35335g = mo35335g(layoutManager, i, i2)) == -1) {
            return false;
        }
        mo35337d.setTargetPosition(mo35335g);
        layoutManager.m35740S1(mo35337d);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnFlingListener
    /* renamed from: a */
    public boolean mo35340a(int i, int i2) {
        RecyclerView.LayoutManager layoutManager = this.f4968a.getLayoutManager();
        if (layoutManager == null || this.f4968a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4968a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !m35333i(layoutManager, i, i2)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m35339b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4968a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m35336e();
        }
        this.f4968a = recyclerView;
        if (recyclerView != null) {
            m35334h();
            this.f4969b = new Scroller(this.f4968a.getContext(), new DecelerateInterpolator());
            m35332j();
        }
    }

    /* renamed from: c */
    public abstract int[] mo35338c(RecyclerView.LayoutManager layoutManager, View view);

    /* renamed from: d */
    protected abstract RecyclerView.SmoothScroller mo35337d(RecyclerView.LayoutManager layoutManager);

    /* renamed from: f */
    public abstract View mo34896f(RecyclerView.LayoutManager layoutManager);

    /* renamed from: g */
    public abstract int mo35335g(RecyclerView.LayoutManager layoutManager, int i, int i2);

    /* renamed from: j */
    void m35332j() {
        RecyclerView.LayoutManager layoutManager;
        View mo34896f;
        RecyclerView recyclerView = this.f4968a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (mo34896f = mo34896f(layoutManager)) == null) {
            return;
        }
        int[] mo35338c = mo35338c(layoutManager, mo34896f);
        int i = mo35338c[0];
        if (i != 0 || mo35338c[1] != 0) {
            this.f4968a.smoothScrollBy(i, mo35338c[1]);
        }
    }
}
