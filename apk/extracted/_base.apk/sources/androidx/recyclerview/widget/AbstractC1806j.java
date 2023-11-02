package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1806j {

    /* renamed from: a */
    protected final RecyclerView.LayoutManager f4962a;

    /* renamed from: b */
    private int f4963b;

    /* renamed from: c */
    final Rect f4964c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1807a extends AbstractC1806j {
        C1807a(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: d */
        public int mo35364d(View view) {
            return this.f4962a.m35722e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: e */
        public int mo35363e(View view) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            return this.f4962a.m35723d0(view) + ((ViewGroup.MarginLayoutParams) c1772i).leftMargin + ((ViewGroup.MarginLayoutParams) c1772i).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: f */
        public int mo35362f(View view) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            return this.f4962a.m35724c0(view) + ((ViewGroup.MarginLayoutParams) c1772i).topMargin + ((ViewGroup.MarginLayoutParams) c1772i).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: g */
        public int mo35361g(View view) {
            return this.f4962a.m35725b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: h */
        public int mo35360h() {
            return this.f4962a.m35687v0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: i */
        public int mo35359i() {
            return this.f4962a.m35687v0() - this.f4962a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: j */
        public int mo35358j() {
            return this.f4962a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: k */
        public int mo35357k() {
            return this.f4962a.m35685w0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: l */
        public int mo35356l() {
            return this.f4962a.m35717i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: m */
        public int mo35355m() {
            return this.f4962a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: n */
        public int mo35354n() {
            return (this.f4962a.m35687v0() - this.f4962a.getPaddingLeft()) - this.f4962a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: p */
        public int mo35353p(View view) {
            this.f4962a.m35689u0(view, true, this.f4964c);
            return this.f4964c.right;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: q */
        public int mo35352q(View view) {
            this.f4962a.m35689u0(view, true, this.f4964c);
            return this.f4964c.left;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: r */
        public void mo35351r(int i) {
            this.f4962a.mo35561K0(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1808b extends AbstractC1806j {
        C1808b(RecyclerView.LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: d */
        public int mo35364d(View view) {
            return this.f4962a.m35727Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: e */
        public int mo35363e(View view) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            return this.f4962a.m35724c0(view) + ((ViewGroup.MarginLayoutParams) c1772i).topMargin + ((ViewGroup.MarginLayoutParams) c1772i).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: f */
        public int mo35362f(View view) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            return this.f4962a.m35723d0(view) + ((ViewGroup.MarginLayoutParams) c1772i).leftMargin + ((ViewGroup.MarginLayoutParams) c1772i).rightMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: g */
        public int mo35361g(View view) {
            return this.f4962a.m35721f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: h */
        public int mo35360h() {
            return this.f4962a.m35719h0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: i */
        public int mo35359i() {
            return this.f4962a.m35719h0() - this.f4962a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: j */
        public int mo35358j() {
            return this.f4962a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: k */
        public int mo35357k() {
            return this.f4962a.m35717i0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: l */
        public int mo35356l() {
            return this.f4962a.m35685w0();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: m */
        public int mo35355m() {
            return this.f4962a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: n */
        public int mo35354n() {
            return (this.f4962a.m35719h0() - this.f4962a.getPaddingTop()) - this.f4962a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: p */
        public int mo35353p(View view) {
            this.f4962a.m35689u0(view, true, this.f4964c);
            return this.f4964c.bottom;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: q */
        public int mo35352q(View view) {
            this.f4962a.m35689u0(view, true, this.f4964c);
            return this.f4964c.top;
        }

        @Override // androidx.recyclerview.widget.AbstractC1806j
        /* renamed from: r */
        public void mo35351r(int i) {
            this.f4962a.mo35559L0(i);
        }
    }

    /* synthetic */ AbstractC1806j(RecyclerView.LayoutManager layoutManager, C1807a c1807a) {
        this(layoutManager);
    }

    /* renamed from: a */
    public static AbstractC1806j m35369a(RecyclerView.LayoutManager layoutManager) {
        return new C1807a(layoutManager);
    }

    /* renamed from: b */
    public static AbstractC1806j m35368b(RecyclerView.LayoutManager layoutManager, int i) {
        if (i != 0) {
            if (i == 1) {
                return m35367c(layoutManager);
            }
            throw new IllegalArgumentException("invalid orientation");
        }
        return m35369a(layoutManager);
    }

    /* renamed from: c */
    public static AbstractC1806j m35367c(RecyclerView.LayoutManager layoutManager) {
        return new C1808b(layoutManager);
    }

    /* renamed from: d */
    public abstract int mo35364d(View view);

    /* renamed from: e */
    public abstract int mo35363e(View view);

    /* renamed from: f */
    public abstract int mo35362f(View view);

    /* renamed from: g */
    public abstract int mo35361g(View view);

    /* renamed from: h */
    public abstract int mo35360h();

    /* renamed from: i */
    public abstract int mo35359i();

    /* renamed from: j */
    public abstract int mo35358j();

    /* renamed from: k */
    public abstract int mo35357k();

    /* renamed from: l */
    public abstract int mo35356l();

    /* renamed from: m */
    public abstract int mo35355m();

    /* renamed from: n */
    public abstract int mo35354n();

    /* renamed from: o */
    public int m35366o() {
        if (Integer.MIN_VALUE == this.f4963b) {
            return 0;
        }
        return mo35354n() - this.f4963b;
    }

    /* renamed from: p */
    public abstract int mo35353p(View view);

    /* renamed from: q */
    public abstract int mo35352q(View view);

    /* renamed from: r */
    public abstract void mo35351r(int i);

    /* renamed from: s */
    public void m35365s() {
        this.f4963b = mo35354n();
    }

    private AbstractC1806j(RecyclerView.LayoutManager layoutManager) {
        this.f4963b = Integer.MIN_VALUE;
        this.f4964c = new Rect();
        this.f4962a = layoutManager;
    }
}
