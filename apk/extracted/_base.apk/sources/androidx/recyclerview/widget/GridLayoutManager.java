package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: R */
    boolean f4630R;

    /* renamed from: S */
    int f4631S;

    /* renamed from: T */
    int[] f4632T;

    /* renamed from: U */
    View[] f4633U;

    /* renamed from: V */
    final SparseIntArray f4634V;

    /* renamed from: W */
    final SparseIntArray f4635W;

    /* renamed from: X */
    AbstractC1743c f4636X;

    /* renamed from: Y */
    final Rect f4637Y;

    /* renamed from: Z */
    private boolean f4638Z;

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1741a extends AbstractC1743c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1743c
        /* renamed from: e */
        public int mo35865e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1743c
        /* renamed from: f */
        public int mo35864f(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1743c {

        /* renamed from: a */
        final SparseIntArray f4641a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4642b = new SparseIntArray();

        /* renamed from: c */
        private boolean f4643c = false;

        /* renamed from: d */
        private boolean f4644d = false;

        /* renamed from: a */
        static int m35869a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 >= 0 && i4 < sparseIntArray.size()) {
                return sparseIntArray.keyAt(i4);
            }
            return -1;
        }

        /* renamed from: b */
        int m35868b(int i, int i2) {
            if (!this.f4644d) {
                return m35866d(i, i2);
            }
            int i3 = this.f4642b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int m35866d = m35866d(i, i2);
            this.f4642b.put(i, m35866d);
            return m35866d;
        }

        /* renamed from: c */
        int m35867c(int i, int i2) {
            if (!this.f4643c) {
                return mo35865e(i, i2);
            }
            int i3 = this.f4641a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int mo35865e = mo35865e(i, i2);
            this.f4641a.put(i, mo35865e);
            return mo35865e;
        }

        /* renamed from: d */
        public int m35866d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int m35869a;
            if (this.f4644d && (m35869a = m35869a(this.f4642b, i)) != -1) {
                i3 = this.f4642b.get(m35869a);
                i4 = m35869a + 1;
                i5 = m35867c(m35869a, i2) + mo35864f(m35869a);
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                }
            } else {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            int mo35864f = mo35864f(i);
            while (i4 < i) {
                int mo35864f2 = mo35864f(i4);
                i5 += mo35864f2;
                if (i5 == i2) {
                    i3++;
                    i5 = 0;
                } else if (i5 > i2) {
                    i3++;
                    i5 = mo35864f2;
                }
                i4++;
            }
            if (i5 + mo35864f > i2) {
                return i3 + 1;
            }
            return i3;
        }

        /* renamed from: e */
        public abstract int mo35865e(int i, int i2);

        /* renamed from: f */
        public abstract int mo35864f(int i);

        /* renamed from: g */
        public void m35863g() {
            this.f4642b.clear();
        }

        /* renamed from: h */
        public void m35862h() {
            this.f4641a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f4630R = false;
        this.f4631S = -1;
        this.f4634V = new SparseIntArray();
        this.f4635W = new SparseIntArray();
        this.f4636X = new C1741a();
        this.f4637Y = new Rect();
        m35873n3(RecyclerView.LayoutManager.m35702p0(context, attributeSet, i, i2).f4756b);
    }

    /* renamed from: W2 */
    private void m35890W2(RecyclerView.Recycler recycler, RecyclerView.State state, int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (z) {
            i4 = 1;
            i3 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View view = this.f4633U[i2];
            C1742b c1742b = (C1742b) view.getLayoutParams();
            int m35877j3 = m35877j3(recycler, state, m35705o0(view));
            c1742b.f4640o = m35877j3;
            c1742b.f4639n = i5;
            i5 += m35877j3;
            i2 += i4;
        }
    }

    /* renamed from: X2 */
    private void m35889X2() {
        int m35736U = m35736U();
        for (int i = 0; i < m35736U; i++) {
            C1742b c1742b = (C1742b) m35739T(i).getLayoutParams();
            int m35579a = c1742b.m35579a();
            this.f4634V.put(m35579a, c1742b.m35870j());
            this.f4635W.put(m35579a, c1742b.m35871h());
        }
    }

    /* renamed from: Y2 */
    private void m35888Y2(int i) {
        this.f4632T = m35887Z2(this.f4632T, this.f4631S, i);
    }

    /* renamed from: Z2 */
    static int[] m35887Z2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 > 0 && i - i4 < i6) {
                i3 = i5 + 1;
                i4 -= i;
            } else {
                i3 = i5;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* renamed from: a3 */
    private void m35886a3() {
        this.f4634V.clear();
        this.f4635W.clear();
    }

    /* renamed from: b3 */
    private int m35885b3(RecyclerView.State state) {
        int max;
        if (m35736U() != 0 && state.m35611b() != 0) {
            m35827c2();
            boolean m35803z2 = m35803z2();
            View m35821h2 = m35821h2(!m35803z2, true);
            View m35822g2 = m35822g2(!m35803z2, true);
            if (m35821h2 != null && m35822g2 != null) {
                int m35868b = this.f4636X.m35868b(m35705o0(m35821h2), this.f4631S);
                int m35868b2 = this.f4636X.m35868b(m35705o0(m35822g2), this.f4631S);
                int min = Math.min(m35868b, m35868b2);
                int max2 = Math.max(m35868b, m35868b2);
                int m35868b3 = this.f4636X.m35868b(state.m35611b() - 1, this.f4631S) + 1;
                if (this.f4691G) {
                    max = Math.max(0, (m35868b3 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!m35803z2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.f4688D.mo35364d(m35822g2) - this.f4688D.mo35361g(m35821h2)) / ((this.f4636X.m35868b(m35705o0(m35822g2), this.f4631S) - this.f4636X.m35868b(m35705o0(m35821h2), this.f4631S)) + 1))) + (this.f4688D.mo35355m() - this.f4688D.mo35361g(m35821h2)));
            }
        }
        return 0;
    }

    /* renamed from: c3 */
    private int m35884c3(RecyclerView.State state) {
        if (m35736U() != 0 && state.m35611b() != 0) {
            m35827c2();
            View m35821h2 = m35821h2(!m35803z2(), true);
            View m35822g2 = m35822g2(!m35803z2(), true);
            if (m35821h2 != null && m35822g2 != null) {
                if (!m35803z2()) {
                    return this.f4636X.m35868b(state.m35611b() - 1, this.f4631S) + 1;
                }
                int mo35364d = this.f4688D.mo35364d(m35822g2) - this.f4688D.mo35361g(m35821h2);
                int m35868b = this.f4636X.m35868b(m35705o0(m35821h2), this.f4631S);
                return (int) ((mo35364d / ((this.f4636X.m35868b(m35705o0(m35822g2), this.f4631S) - m35868b) + 1)) * (this.f4636X.m35868b(state.m35611b() - 1, this.f4631S) + 1));
            }
        }
        return 0;
    }

    /* renamed from: d3 */
    private void m35883d3(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C1752a c1752a, int i) {
        boolean z;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        int m35878i3 = m35878i3(recycler, state, c1752a.f4703b);
        if (z) {
            while (m35878i3 > 0) {
                int i2 = c1752a.f4703b;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    c1752a.f4703b = i3;
                    m35878i3 = m35878i3(recycler, state, i3);
                } else {
                    return;
                }
            }
            return;
        }
        int m35611b = state.m35611b() - 1;
        int i4 = c1752a.f4703b;
        while (i4 < m35611b) {
            int i5 = i4 + 1;
            int m35878i32 = m35878i3(recycler, state, i5);
            if (m35878i32 <= m35878i3) {
                break;
            }
            i4 = i5;
            m35878i3 = m35878i32;
        }
        c1752a.f4703b = i4;
    }

    /* renamed from: e3 */
    private void m35882e3() {
        View[] viewArr = this.f4633U;
        if (viewArr == null || viewArr.length != this.f4631S) {
            this.f4633U = new View[this.f4631S];
        }
    }

    /* renamed from: h3 */
    private int m35879h3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35608e()) {
            return this.f4636X.m35868b(i, this.f4631S);
        }
        int m35645f = recycler.m35645f(i);
        if (m35645f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        return this.f4636X.m35868b(m35645f, this.f4631S);
    }

    /* renamed from: i3 */
    private int m35878i3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35608e()) {
            return this.f4636X.m35867c(i, this.f4631S);
        }
        int i2 = this.f4635W.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m35645f = recycler.m35645f(i);
        if (m35645f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        return this.f4636X.m35867c(m35645f, this.f4631S);
    }

    /* renamed from: j3 */
    private int m35877j3(RecyclerView.Recycler recycler, RecyclerView.State state, int i) {
        if (!state.m35608e()) {
            return this.f4636X.mo35864f(i);
        }
        int i2 = this.f4634V.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int m35645f = recycler.m35645f(i);
        if (m35645f == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        return this.f4636X.mo35864f(m35645f);
    }

    /* renamed from: k3 */
    private void m35876k3(float f, int i) {
        m35888Y2(Math.max(Math.round(f * this.f4631S), i));
    }

    /* renamed from: l3 */
    private void m35875l3(View view, int i, boolean z) {
        int i2;
        int i3;
        C1742b c1742b = (C1742b) view.getLayoutParams();
        Rect rect = c1742b.f4815k;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1742b).topMargin + ((ViewGroup.MarginLayoutParams) c1742b).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1742b).leftMargin + ((ViewGroup.MarginLayoutParams) c1742b).rightMargin;
        int m35881f3 = m35881f3(c1742b.f4639n, c1742b.f4640o);
        if (this.f4686B == 1) {
            i3 = RecyclerView.LayoutManager.m35734V(m35881f3, i, i5, ((ViewGroup.MarginLayoutParams) c1742b).width, false);
            i2 = RecyclerView.LayoutManager.m35734V(this.f4688D.mo35354n(), m35717i0(), i4, ((ViewGroup.MarginLayoutParams) c1742b).height, true);
        } else {
            int m35734V = RecyclerView.LayoutManager.m35734V(m35881f3, i, i4, ((ViewGroup.MarginLayoutParams) c1742b).height, false);
            int m35734V2 = RecyclerView.LayoutManager.m35734V(this.f4688D.mo35354n(), m35685w0(), i5, ((ViewGroup.MarginLayoutParams) c1742b).width, true);
            i2 = m35734V;
            i3 = m35734V2;
        }
        m35874m3(view, i3, i2, z);
    }

    /* renamed from: m3 */
    private void m35874m3(View view, int i, int i2, boolean z) {
        boolean m35746O1;
        RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
        if (z) {
            m35746O1 = m35743Q1(view, i, i2, c1772i);
        } else {
            m35746O1 = m35746O1(view, i, i2, c1772i);
        }
        if (m35746O1) {
            view.measure(i, i2);
        }
    }

    /* renamed from: o3 */
    private void m35872o3() {
        int m35719h0;
        int paddingTop;
        if (m35806w2() == 1) {
            m35719h0 = m35687v0() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            m35719h0 = m35719h0() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m35888Y2(m35719h0 - paddingTop);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
        r21.f4708b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void mo35855A2(androidx.recyclerview.widget.RecyclerView.Recycler r18, androidx.recyclerview.widget.RecyclerView.State r19, androidx.recyclerview.widget.LinearLayoutManager.C1754c r20, androidx.recyclerview.widget.LinearLayoutManager.C1753b r21) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo35855A2(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo28559C(RecyclerView.State state) {
        if (this.f4638Z) {
            return m35885b3(state);
        }
        return super.mo28559C(state);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C2 */
    public void mo35853C2(RecyclerView.Recycler recycler, RecyclerView.State state, LinearLayoutManager.C1752a c1752a, int i) {
        super.mo35853C2(recycler, state, c1752a, i);
        m35872o3();
        if (state.m35611b() > 0 && !state.m35608e()) {
            m35883d3(recycler, state, c1752a, i);
        }
        m35882e3();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo28557D(RecyclerView.State state) {
        if (this.f4638Z) {
            return m35884c3(state);
        }
        return super.mo28557D(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo28552F(RecyclerView.State state) {
        if (this.f4638Z) {
            return m35885b3(state);
        }
        return super.mo28552F(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo28551F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35872o3();
        m35882e3();
        return super.mo28551F1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo28549G(RecyclerView.State state) {
        if (this.f4638Z) {
            return m35884c3(state);
        }
        return super.mo28549G(state);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo28546H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35872o3();
        m35882e3();
        return super.mo28546H1(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L1 */
    public void mo35558L1(Rect rect, int i, int i2) {
        int m35681y;
        int m35681y2;
        if (this.f4632T == null) {
            super.mo35558L1(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4686B == 1) {
            m35681y2 = RecyclerView.LayoutManager.m35681y(i2, rect.height() + paddingTop, m35710m0());
            int[] iArr = this.f4632T;
            m35681y = RecyclerView.LayoutManager.m35681y(i, iArr[iArr.length - 1] + paddingLeft, m35708n0());
        } else {
            m35681y = RecyclerView.LayoutManager.m35681y(i, rect.width() + paddingLeft, m35708n0());
            int[] iArr2 = this.f4632T;
            m35681y2 = RecyclerView.LayoutManager.m35681y(i2, iArr2[iArr2.length - 1] + paddingTop, m35710m0());
        }
        m35753K1(m35681y, m35681y2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: N2 */
    public void mo35842N2(boolean z) {
        if (!z) {
            super.mo35842N2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C1772i mo28537O() {
        if (this.f4686B == 0) {
            return new C1742b(-2, -1);
        }
        return new C1742b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C1772i mo28533P(Context context, AttributeSet attributeSet) {
        return new C1742b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q */
    public RecyclerView.C1772i mo35552Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1742b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1742b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == r7) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == r11) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View mo35550R0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.Recycler r26, androidx.recyclerview.widget.RecyclerView.State r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo35550R0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35545U1() {
        return this.f4697M == null && !this.f4630R;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: W1 */
    void mo35833W1(RecyclerView.State state, LinearLayoutManager.C1754c c1754c, RecyclerView.LayoutManager.InterfaceC1759c interfaceC1759c) {
        int i = this.f4631S;
        for (int i2 = 0; i2 < this.f4631S && c1754c.m35794c(state) && i > 0; i2++) {
            int i3 = c1754c.f4714d;
            interfaceC1759c.mo35677a(i3, Math.max(0, c1754c.f4717g));
            i -= this.f4636X.mo35864f(i3);
            c1754c.f4714d += c1754c.f4715e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: X0 */
    public void mo35730X0(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1742b)) {
            super.m35732W0(view, accessibilityNodeInfoCompat);
            return;
        }
        C1742b c1742b = (C1742b) layoutParams;
        int m35879h3 = m35879h3(recycler, state, c1742b.m35579a());
        if (this.f4686B == 0) {
            accessibilityNodeInfoCompat.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37543b(c1742b.m35871h(), c1742b.m35870j(), m35879h3, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37543b(m35879h3, 1, c1742b.m35871h(), c1742b.m35870j(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Y */
    public int mo35729Y(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4686B == 1) {
            return this.f4631S;
        }
        if (state.m35611b() < 1) {
            return 0;
        }
        return m35879h3(recycler, state, state.m35611b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo28519Z0(RecyclerView recyclerView, int i, int i2) {
        this.f4636X.m35862h();
        this.f4636X.m35863g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a1 */
    public void mo35533a1(RecyclerView recyclerView) {
        this.f4636X.m35862h();
        this.f4636X.m35863g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo28515b1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4636X.m35862h();
        this.f4636X.m35863g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo28513c1(RecyclerView recyclerView, int i, int i2) {
        this.f4636X.m35862h();
        this.f4636X.m35863g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo28509e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4636X.m35862h();
        this.f4636X.m35863g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo28507f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (state.m35608e()) {
            m35889X2();
        }
        super.mo28507f1(recycler, state);
        m35886a3();
    }

    /* renamed from: f3 */
    int m35881f3(int i, int i2) {
        if (this.f4686B == 1 && m35804y2()) {
            int[] iArr = this.f4632T;
            int i3 = this.f4631S;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.f4632T;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo28505g1(RecyclerView.State state) {
        super.mo28505g1(state);
        this.f4630R = false;
    }

    /* renamed from: g3 */
    public int m35880g3() {
        return this.f4631S;
    }

    /* renamed from: n3 */
    public void m35873n3(int i) {
        if (i == this.f4631S) {
            return;
        }
        this.f4630R = true;
        if (i >= 1) {
            this.f4631S = i;
            this.f4636X.m35862h();
            m35769C1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: q2 */
    View mo35812q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int m35736U = m35736U();
        int i3 = 1;
        if (z2) {
            i2 = m35736U() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m35736U;
            i2 = 0;
        }
        int m35611b = state.m35611b();
        m35827c2();
        int mo35355m = this.f4688D.mo35355m();
        int mo35359i = this.f4688D.mo35359i();
        View view = null;
        View view2 = null;
        while (i2 != i) {
            View m35739T = m35739T(i2);
            int m35705o0 = m35705o0(m35739T);
            if (m35705o0 >= 0 && m35705o0 < m35611b && m35878i3(recycler, state, m35705o0) == 0) {
                if (((RecyclerView.C1772i) m35739T.getLayoutParams()).m35577d()) {
                    if (view2 == null) {
                        view2 = m35739T;
                    }
                } else if (this.f4688D.mo35361g(m35739T) < mo35359i && this.f4688D.mo35364d(m35739T) >= mo35355m) {
                    return m35739T;
                } else {
                    if (view == null) {
                        view = m35739T;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r0 */
    public int mo35698r0(RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4686B == 0) {
            return this.f4631S;
        }
        if (state.m35611b() < 1) {
            return 0;
        }
        return m35879h3(recycler, state, state.m35611b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo28483x(RecyclerView.C1772i c1772i) {
        return c1772i instanceof C1742b;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1742b extends RecyclerView.C1772i {

        /* renamed from: n */
        int f4639n;

        /* renamed from: o */
        int f4640o;

        public C1742b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4639n = -1;
            this.f4640o = 0;
        }

        /* renamed from: h */
        public int m35871h() {
            return this.f4639n;
        }

        /* renamed from: j */
        public int m35870j() {
            return this.f4640o;
        }

        public C1742b(int i, int i2) {
            super(i, i2);
            this.f4639n = -1;
            this.f4640o = 0;
        }

        public C1742b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4639n = -1;
            this.f4640o = 0;
        }

        public C1742b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4639n = -1;
            this.f4640o = 0;
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f4630R = false;
        this.f4631S = -1;
        this.f4634V = new SparseIntArray();
        this.f4635W = new SparseIntArray();
        this.f4636X = new C1741a();
        this.f4637Y = new Rect();
        m35873n3(i);
    }
}
