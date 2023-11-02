package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p018os.C1071r;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class GapWorker implements Runnable {

    /* renamed from: n */
    static final ThreadLocal<GapWorker> f4615n = new ThreadLocal<>();

    /* renamed from: o */
    static Comparator<C1740b> f4616o = new C1739a();

    /* renamed from: k */
    long f4618k;

    /* renamed from: l */
    long f4619l;

    /* renamed from: j */
    ArrayList<RecyclerView> f4617j = new ArrayList<>();

    /* renamed from: m */
    private ArrayList<C1740b> f4620m = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class LayoutPrefetchRegistryImpl implements RecyclerView.LayoutManager.InterfaceC1759c {

        /* renamed from: a */
        int f4621a;

        /* renamed from: b */
        int f4622b;

        /* renamed from: c */
        int[] f4623c;

        /* renamed from: d */
        int f4624d;

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager.InterfaceC1759c
        /* renamed from: a */
        public void mo35677a(int i, int i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    int i3 = this.f4624d * 2;
                    int[] iArr = this.f4623c;
                    if (iArr == null) {
                        int[] iArr2 = new int[4];
                        this.f4623c = iArr2;
                        Arrays.fill(iArr2, -1);
                    } else if (i3 >= iArr.length) {
                        int[] iArr3 = new int[i3 * 2];
                        this.f4623c = iArr3;
                        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    }
                    int[] iArr4 = this.f4623c;
                    iArr4[i3] = i;
                    iArr4[i3 + 1] = i2;
                    this.f4624d++;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        /* renamed from: b */
        public void m35896b() {
            int[] iArr = this.f4623c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4624d = 0;
        }

        /* renamed from: c */
        void m35895c(RecyclerView recyclerView, boolean z) {
            this.f4624d = 0;
            int[] iArr = this.f4623c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && layoutManager != null && layoutManager.m35771B0()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.m35946p()) {
                        layoutManager.mo35774A(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    layoutManager.mo35504z(this.f4621a, this.f4622b, recyclerView.mState, this);
                }
                int i = this.f4624d;
                if (i > layoutManager.f4748v) {
                    layoutManager.f4748v = i;
                    layoutManager.f4749w = z;
                    recyclerView.mRecycler.m35653K();
                }
            }
        }

        /* renamed from: d */
        public boolean m35894d(int i) {
            if (this.f4623c != null) {
                int i2 = this.f4624d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4623c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: e */
        void m35893e(int i, int i2) {
            this.f4621a = i;
            this.f4622b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GapWorker$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1739a implements Comparator<C1740b> {
        C1739a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C1740b c1740b, C1740b c1740b2) {
            boolean z;
            boolean z2;
            RecyclerView recyclerView = c1740b.f4628d;
            if (recyclerView == null) {
                z = true;
            } else {
                z = false;
            }
            if (c1740b2.f4628d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean z3 = c1740b.f4625a;
            if (z3 != c1740b2.f4625a) {
                if (!z3) {
                    return 1;
                }
                return -1;
            }
            int i = c1740b2.f4626b - c1740b.f4626b;
            if (i != 0) {
                return i;
            }
            int i2 = c1740b.f4627c - c1740b2.f4627c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GapWorker$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1740b {

        /* renamed from: a */
        public boolean f4625a;

        /* renamed from: b */
        public int f4626b;

        /* renamed from: c */
        public int f4627c;

        /* renamed from: d */
        public RecyclerView f4628d;

        /* renamed from: e */
        public int f4629e;

        C1740b() {
        }

        /* renamed from: a */
        public void m35891a() {
            this.f4625a = false;
            this.f4626b = 0;
            this.f4627c = 0;
            this.f4628d = null;
            this.f4629e = 0;
        }
    }

    /* renamed from: b */
    private void m35905b() {
        C1740b c1740b;
        boolean z;
        int size = this.f4617j.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f4617j.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.m35895c(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f4624d;
            }
        }
        this.f4620m.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f4617j.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(layoutPrefetchRegistryImpl.f4621a) + Math.abs(layoutPrefetchRegistryImpl.f4622b);
                for (int i5 = 0; i5 < layoutPrefetchRegistryImpl.f4624d * 2; i5 += 2) {
                    if (i3 >= this.f4620m.size()) {
                        c1740b = new C1740b();
                        this.f4620m.add(c1740b);
                    } else {
                        c1740b = this.f4620m.get(i3);
                    }
                    int[] iArr = layoutPrefetchRegistryImpl.f4623c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1740b.f4625a = z;
                    c1740b.f4626b = abs;
                    c1740b.f4627c = i6;
                    c1740b.f4628d = recyclerView2;
                    c1740b.f4629e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f4620m, f4616o);
    }

    /* renamed from: c */
    private void m35904c(C1740b c1740b, long j) {
        long j2;
        if (c1740b.f4625a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        RecyclerView.ViewHolder m35898i = m35898i(c1740b.f4628d, c1740b.f4629e, j2);
        if (m35898i != null && m35898i.mNestedRecyclerView != null && m35898i.isBound() && !m35898i.isInvalid()) {
            m35899h(m35898i.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: d */
    private void m35903d(long j) {
        for (int i = 0; i < this.f4620m.size(); i++) {
            C1740b c1740b = this.f4620m.get(i);
            if (c1740b.f4628d != null) {
                m35904c(c1740b, j);
                c1740b.m35891a();
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    static boolean m35902e(RecyclerView recyclerView, int i) {
        int m35925j = recyclerView.mChildHelper.m35925j();
        for (int i2 = 0; i2 < m35925j; i2++) {
            RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.m35926i(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private void m35899h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.m35925j() != 0) {
            recyclerView.removeAndRecycleViews();
        }
        LayoutPrefetchRegistryImpl layoutPrefetchRegistryImpl = recyclerView.mPrefetchRegistry;
        layoutPrefetchRegistryImpl.m35895c(recyclerView, true);
        if (layoutPrefetchRegistryImpl.f4624d != 0) {
            try {
                C1071r.m37959a("RV Nested Prefetch");
                recyclerView.mState.m35607f(recyclerView.mAdapter);
                for (int i = 0; i < layoutPrefetchRegistryImpl.f4624d * 2; i += 2) {
                    m35898i(recyclerView, layoutPrefetchRegistryImpl.f4623c[i], j);
                }
            } finally {
                C1071r.m37958b();
            }
        }
    }

    /* renamed from: i */
    private RecyclerView.ViewHolder m35898i(RecyclerView recyclerView, int i, long j) {
        if (m35902e(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder m35655I = recycler.m35655I(i, false, j);
            if (m35655I != null) {
                if (m35655I.isBound() && !m35655I.isInvalid()) {
                    recycler.m35662B(m35655I.itemView);
                } else {
                    recycler.m35650a(m35655I, false);
                }
            }
            return m35655I;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    public void m35906a(RecyclerView recyclerView) {
        this.f4617j.add(recyclerView);
    }

    /* renamed from: f */
    public void m35901f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4618k == 0) {
            this.f4618k = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.m35893e(i, i2);
    }

    /* renamed from: g */
    void m35900g(long j) {
        m35905b();
        m35903d(j);
    }

    /* renamed from: j */
    public void m35897j(RecyclerView recyclerView) {
        this.f4617j.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C1071r.m37959a("RV Prefetch");
            if (!this.f4617j.isEmpty()) {
                int size = this.f4617j.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f4617j.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    m35900g(TimeUnit.MILLISECONDS.toNanos(j) + this.f4619l);
                }
            }
        } finally {
            this.f4618k = 0L;
            C1071r.m37958b();
        }
    }
}