package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1806j;
import androidx.recyclerview.widget.C1802g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.C4585d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FlexboxLayoutManager extends RecyclerView.LayoutManager implements InterfaceC4582a, RecyclerView.SmoothScroller.InterfaceC1763a {

    /* renamed from: b0 */
    private static final Rect f12461b0 = new Rect();

    /* renamed from: B */
    private int f12462B;

    /* renamed from: C */
    private int f12463C;

    /* renamed from: D */
    private int f12464D;

    /* renamed from: E */
    private int f12465E;

    /* renamed from: F */
    private int f12466F;

    /* renamed from: G */
    private boolean f12467G;

    /* renamed from: H */
    private boolean f12468H;

    /* renamed from: I */
    private List<C4584c> f12469I;

    /* renamed from: J */
    private final C4585d f12470J;

    /* renamed from: K */
    private RecyclerView.Recycler f12471K;

    /* renamed from: L */
    private RecyclerView.State f12472L;

    /* renamed from: M */
    private C4579d f12473M;

    /* renamed from: N */
    private C4576b f12474N;

    /* renamed from: O */
    private AbstractC1806j f12475O;

    /* renamed from: P */
    private AbstractC1806j f12476P;

    /* renamed from: Q */
    private C4580e f12477Q;

    /* renamed from: R */
    private int f12478R;

    /* renamed from: S */
    private int f12479S;

    /* renamed from: T */
    private int f12480T;

    /* renamed from: U */
    private int f12481U;

    /* renamed from: V */
    private boolean f12482V;

    /* renamed from: W */
    private SparseArray<View> f12483W;

    /* renamed from: X */
    private final Context f12484X;

    /* renamed from: Y */
    private View f12485Y;

    /* renamed from: Z */
    private int f12486Z;

    /* renamed from: a0 */
    private C4585d.C4587b f12487a0;

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4576b {

        /* renamed from: a */
        private int f12488a;

        /* renamed from: b */
        private int f12489b;

        /* renamed from: c */
        private int f12490c;

        /* renamed from: d */
        private int f12491d;

        /* renamed from: e */
        private boolean f12492e;

        /* renamed from: f */
        private boolean f12493f;

        /* renamed from: g */
        private boolean f12494g;

        private C4576b() {
            FlexboxLayoutManager.this = r1;
            this.f12491d = 0;
        }

        /* renamed from: l */
        static /* synthetic */ int m28467l(C4576b c4576b, int i) {
            int i2 = c4576b.f12491d + i;
            c4576b.f12491d = i2;
            return i2;
        }

        /* renamed from: r */
        public void m28461r() {
            int mo35355m;
            int m35687v0;
            if (!FlexboxLayoutManager.this.mo28407l() && FlexboxLayoutManager.this.f12467G) {
                if (this.f12492e) {
                    m35687v0 = FlexboxLayoutManager.this.f12475O.mo35359i();
                } else {
                    m35687v0 = FlexboxLayoutManager.this.m35687v0() - FlexboxLayoutManager.this.f12475O.mo35355m();
                }
                this.f12490c = m35687v0;
                return;
            }
            if (this.f12492e) {
                mo35355m = FlexboxLayoutManager.this.f12475O.mo35359i();
            } else {
                mo35355m = FlexboxLayoutManager.this.f12475O.mo35355m();
            }
            this.f12490c = mo35355m;
        }

        /* renamed from: s */
        public void m28460s(View view) {
            AbstractC1806j abstractC1806j;
            if (FlexboxLayoutManager.this.f12463C == 0) {
                abstractC1806j = FlexboxLayoutManager.this.f12476P;
            } else {
                abstractC1806j = FlexboxLayoutManager.this.f12475O;
            }
            if (!FlexboxLayoutManager.this.mo28407l() && FlexboxLayoutManager.this.f12467G) {
                if (this.f12492e) {
                    this.f12490c = abstractC1806j.mo35361g(view) + abstractC1806j.m35366o();
                } else {
                    this.f12490c = abstractC1806j.mo35364d(view);
                }
            } else if (this.f12492e) {
                this.f12490c = abstractC1806j.mo35364d(view) + abstractC1806j.m35366o();
            } else {
                this.f12490c = abstractC1806j.mo35361g(view);
            }
            this.f12488a = FlexboxLayoutManager.this.m35705o0(view);
            int i = 0;
            this.f12494g = false;
            int[] iArr = FlexboxLayoutManager.this.f12470J.f12537c;
            int i2 = this.f12488a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            this.f12489b = i;
            if (FlexboxLayoutManager.this.f12469I.size() > this.f12489b) {
                this.f12488a = ((C4584c) FlexboxLayoutManager.this.f12469I.get(this.f12489b)).f12531o;
            }
        }

        /* renamed from: t */
        public void m28459t() {
            this.f12488a = -1;
            this.f12489b = -1;
            this.f12490c = Integer.MIN_VALUE;
            boolean z = false;
            this.f12493f = false;
            this.f12494g = false;
            if (FlexboxLayoutManager.this.mo28407l()) {
                if (FlexboxLayoutManager.this.f12463C == 0) {
                    if (FlexboxLayoutManager.this.f12462B == 1) {
                        z = true;
                    }
                    this.f12492e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.f12463C == 2) {
                    z = true;
                }
                this.f12492e = z;
            } else if (FlexboxLayoutManager.this.f12463C == 0) {
                if (FlexboxLayoutManager.this.f12462B == 3) {
                    z = true;
                }
                this.f12492e = z;
            } else {
                if (FlexboxLayoutManager.this.f12463C == 2) {
                    z = true;
                }
                this.f12492e = z;
            }
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f12488a + ", mFlexLinePosition=" + this.f12489b + ", mCoordinate=" + this.f12490c + ", mPerpendicularCoordinate=" + this.f12491d + ", mLayoutFromEnd=" + this.f12492e + ", mValid=" + this.f12493f + ", mAssignedFromSavedState=" + this.f12494g + '}';
        }
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4579d {

        /* renamed from: a */
        private int f12505a;

        /* renamed from: b */
        private boolean f12506b;

        /* renamed from: c */
        private int f12507c;

        /* renamed from: d */
        private int f12508d;

        /* renamed from: e */
        private int f12509e;

        /* renamed from: f */
        private int f12510f;

        /* renamed from: g */
        private int f12511g;

        /* renamed from: h */
        private int f12512h;

        /* renamed from: i */
        private int f12513i;

        /* renamed from: j */
        private boolean f12514j;

        private C4579d() {
            this.f12512h = 1;
            this.f12513i = 1;
        }

        /* renamed from: D */
        public boolean m28453D(RecyclerView.State state, List<C4584c> list) {
            int i;
            int i2 = this.f12508d;
            if (i2 >= 0 && i2 < state.m35611b() && (i = this.f12507c) >= 0 && i < list.size()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        static /* synthetic */ int m28450c(C4579d c4579d, int i) {
            int i2 = c4579d.f12509e + i;
            c4579d.f12509e = i2;
            return i2;
        }

        /* renamed from: d */
        static /* synthetic */ int m28449d(C4579d c4579d, int i) {
            int i2 = c4579d.f12509e - i;
            c4579d.f12509e = i2;
            return i2;
        }

        /* renamed from: i */
        static /* synthetic */ int m28444i(C4579d c4579d, int i) {
            int i2 = c4579d.f12505a - i;
            c4579d.f12505a = i2;
            return i2;
        }

        /* renamed from: l */
        static /* synthetic */ int m28441l(C4579d c4579d) {
            int i = c4579d.f12507c;
            c4579d.f12507c = i + 1;
            return i;
        }

        /* renamed from: m */
        static /* synthetic */ int m28440m(C4579d c4579d) {
            int i = c4579d.f12507c;
            c4579d.f12507c = i - 1;
            return i;
        }

        /* renamed from: n */
        static /* synthetic */ int m28439n(C4579d c4579d, int i) {
            int i2 = c4579d.f12507c + i;
            c4579d.f12507c = i2;
            return i2;
        }

        /* renamed from: q */
        static /* synthetic */ int m28436q(C4579d c4579d, int i) {
            int i2 = c4579d.f12510f + i;
            c4579d.f12510f = i2;
            return i2;
        }

        /* renamed from: u */
        static /* synthetic */ int m28432u(C4579d c4579d, int i) {
            int i2 = c4579d.f12508d + i;
            c4579d.f12508d = i2;
            return i2;
        }

        /* renamed from: v */
        static /* synthetic */ int m28431v(C4579d c4579d, int i) {
            int i2 = c4579d.f12508d - i;
            c4579d.f12508d = i2;
            return i2;
        }

        public String toString() {
            return "LayoutState{mAvailable=" + this.f12505a + ", mFlexLinePosition=" + this.f12507c + ", mPosition=" + this.f12508d + ", mOffset=" + this.f12509e + ", mScrollingOffset=" + this.f12510f + ", mLastScrollDelta=" + this.f12511g + ", mItemDirection=" + this.f12512h + ", mLayoutDirection=" + this.f12513i + '}';
        }
    }

    public FlexboxLayoutManager(Context context) {
        this(context, 0, 1);
    }

    /* renamed from: A2 */
    private int m28562A2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z;
        if (m35736U() == 0 || i == 0) {
            return 0;
        }
        m28501j2();
        int i2 = 1;
        this.f12473M.f12514j = true;
        if (!mo28407l() && this.f12467G) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i <= 0 : i >= 0) {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m28526U2(i2, abs);
        int m28499k2 = this.f12473M.f12510f + m28499k2(recycler, state, this.f12473M);
        if (m28499k2 < 0) {
            return 0;
        }
        if (z) {
            if (abs > m28499k2) {
                i = (-i2) * m28499k2;
            }
        } else if (abs > m28499k2) {
            i = i2 * m28499k2;
        }
        this.f12475O.mo35351r(-i);
        this.f12473M.f12511g = i;
        return i;
    }

    /* renamed from: B2 */
    private int m28560B2(int i) {
        int height;
        int m35719h0;
        int i2;
        boolean z = false;
        if (m35736U() == 0 || i == 0) {
            return 0;
        }
        m28501j2();
        boolean mo28407l = mo28407l();
        View view = this.f12485Y;
        if (mo28407l) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        if (mo28407l) {
            m35719h0 = m35687v0();
        } else {
            m35719h0 = m35719h0();
        }
        if (m35713k0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((m35719h0 + this.f12474N.f12491d) - height, abs);
            } else if (this.f12474N.f12491d + i > 0) {
                i2 = this.f12474N.f12491d;
            } else {
                return i;
            }
        } else if (i > 0) {
            return Math.min((m35719h0 - this.f12474N.f12491d) - height, i);
        } else {
            if (this.f12474N.f12491d + i < 0) {
                i2 = this.f12474N.f12491d;
            } else {
                return i;
            }
        }
        return -i2;
    }

    /* renamed from: C2 */
    private boolean m28558C2(View view, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int m35687v0 = m35687v0() - getPaddingRight();
        int m35719h0 = m35719h0() - getPaddingBottom();
        int m28482x2 = m28482x2(view);
        int m28479z2 = m28479z2(view);
        int m28481y2 = m28481y2(view);
        int m28486v2 = m28486v2(view);
        if (paddingLeft <= m28482x2 && m35687v0 >= m28481y2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (m28482x2 < m35687v0 && m28481y2 < paddingLeft) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (paddingTop <= m28479z2 && m35719h0 >= m28486v2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (m28479z2 < m35719h0 && m28486v2 < paddingTop) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z) {
            if (z2 && z4) {
                return true;
            }
            return false;
        } else if (z3 && z5) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: D2 */
    private int m28556D2(C4584c c4584c, C4579d c4579d) {
        if (mo28407l()) {
            return m28553E2(c4584c, c4579d);
        }
        return m28550F2(c4584c, c4579d);
    }

    /* renamed from: E0 */
    private static boolean m28554E0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        } else if (size < i) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00ce  */
    /* renamed from: E2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m28553E2(com.google.android.flexbox.C4584c r22, com.google.android.flexbox.FlexboxLayoutManager.C4579d r23) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m28553E2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00d4  */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m28550F2(com.google.android.flexbox.C4584c r26, com.google.android.flexbox.FlexboxLayoutManager.C4579d r27) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m28550F2(com.google.android.flexbox.c, com.google.android.flexbox.FlexboxLayoutManager$d):int");
    }

    /* renamed from: G2 */
    private void m28547G2(RecyclerView.Recycler recycler, C4579d c4579d) {
        if (!c4579d.f12514j) {
            return;
        }
        if (c4579d.f12513i == -1) {
            m28544I2(recycler, c4579d);
        } else {
            m28543J2(recycler, c4579d);
        }
    }

    /* renamed from: H2 */
    private void m28545H2(RecyclerView.Recycler recycler, int i, int i2) {
        while (i2 >= i) {
            m35684w1(i2, recycler);
            i2--;
        }
    }

    /* renamed from: I2 */
    private void m28544I2(RecyclerView.Recycler recycler, C4579d c4579d) {
        int m35736U;
        int i;
        View m35739T;
        int i2;
        if (c4579d.f12510f < 0 || (m35736U = m35736U()) == 0 || (m35739T = m35739T(m35736U - 1)) == null || (i2 = this.f12470J.f12537c[m35705o0(m35739T)]) == -1) {
            return;
        }
        C4584c c4584c = this.f12469I.get(i2);
        int i3 = i;
        while (true) {
            if (i3 < 0) {
                break;
            }
            View m35739T2 = m35739T(i3);
            if (m35739T2 != null) {
                if (!m28512c2(m35739T2, c4579d.f12510f)) {
                    break;
                } else if (c4584c.f12531o != m35705o0(m35739T2)) {
                    continue;
                } else if (i2 <= 0) {
                    m35736U = i3;
                    break;
                } else {
                    i2 += c4579d.f12513i;
                    c4584c = this.f12469I.get(i2);
                    m35736U = i3;
                }
            }
            i3--;
        }
        m28545H2(recycler, m35736U, i);
    }

    /* renamed from: J2 */
    private void m28543J2(RecyclerView.Recycler recycler, C4579d c4579d) {
        int m35736U;
        View m35739T;
        if (c4579d.f12510f < 0 || (m35736U = m35736U()) == 0 || (m35739T = m35739T(0)) == null) {
            return;
        }
        int i = this.f12470J.f12537c[m35705o0(m35739T)];
        int i2 = -1;
        if (i == -1) {
            return;
        }
        C4584c c4584c = this.f12469I.get(i);
        int i3 = 0;
        while (true) {
            if (i3 >= m35736U) {
                break;
            }
            View m35739T2 = m35739T(i3);
            if (m35739T2 != null) {
                if (!m28510d2(m35739T2, c4579d.f12510f)) {
                    break;
                } else if (c4584c.f12532p != m35705o0(m35739T2)) {
                    continue;
                } else if (i >= this.f12469I.size() - 1) {
                    i2 = i3;
                    break;
                } else {
                    i += c4579d.f12513i;
                    c4584c = this.f12469I.get(i);
                    i2 = i3;
                }
            }
            i3++;
        }
        m28545H2(recycler, 0, i2);
    }

    /* renamed from: K2 */
    private void m28542K2() {
        int m35685w0;
        boolean z;
        if (mo28407l()) {
            m35685w0 = m35717i0();
        } else {
            m35685w0 = m35685w0();
        }
        C4579d c4579d = this.f12473M;
        if (m35685w0 != 0 && m35685w0 != Integer.MIN_VALUE) {
            z = false;
        } else {
            z = true;
        }
        c4579d.f12506b = z;
    }

    /* renamed from: L2 */
    private void m28541L2() {
        boolean z;
        boolean z2;
        boolean z3;
        int m35713k0 = m35713k0();
        int i = this.f12462B;
        boolean z4 = false;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        this.f12467G = false;
                        this.f12468H = false;
                        return;
                    }
                    if (m35713k0 == 1) {
                        z4 = true;
                    }
                    this.f12467G = z4;
                    if (this.f12463C == 2) {
                        this.f12467G = !z4;
                    }
                    this.f12468H = true;
                    return;
                }
                if (m35713k0 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f12467G = z3;
                if (this.f12463C == 2) {
                    this.f12467G = !z3;
                }
                this.f12468H = false;
                return;
            }
            if (m35713k0 != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f12467G = z2;
            if (this.f12463C == 2) {
                z4 = true;
            }
            this.f12468H = z4;
            return;
        }
        if (m35713k0 == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f12467G = z;
        if (this.f12463C == 2) {
            z4 = true;
        }
        this.f12468H = z4;
    }

    /* renamed from: O1 */
    private boolean m28535O1(View view, int i, int i2, RecyclerView.C1772i c1772i) {
        if (!view.isLayoutRequested() && m35768D0() && m28554E0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) c1772i).width) && m28554E0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) c1772i).height)) {
            return false;
        }
        return true;
    }

    /* renamed from: P2 */
    private boolean m28532P2(RecyclerView.State state, C4576b c4576b) {
        View m28497l2;
        int mo35355m;
        boolean z = false;
        if (m35736U() == 0) {
            return false;
        }
        if (c4576b.f12492e) {
            m28497l2 = m28494o2(state.m35611b());
        } else {
            m28497l2 = m28497l2(state.m35611b());
        }
        if (m28497l2 == null) {
            return false;
        }
        c4576b.m28460s(m28497l2);
        if (!state.m35608e() && mo35545U1()) {
            if (this.f12475O.mo35361g(m28497l2) >= this.f12475O.mo35359i() || this.f12475O.mo35364d(m28497l2) < this.f12475O.mo35355m()) {
                z = true;
            }
            if (z) {
                if (c4576b.f12492e) {
                    mo35355m = this.f12475O.mo35359i();
                } else {
                    mo35355m = this.f12475O.mo35355m();
                }
                c4576b.f12490c = mo35355m;
            }
        }
        return true;
    }

    /* renamed from: Q2 */
    private boolean m28530Q2(RecyclerView.State state, C4576b c4576b, C4580e c4580e) {
        int i;
        View m35739T;
        int mo35361g;
        boolean z = false;
        if (!state.m35608e() && (i = this.f12478R) != -1) {
            if (i >= 0 && i < state.m35611b()) {
                c4576b.f12488a = this.f12478R;
                c4576b.f12489b = this.f12470J.f12537c[c4576b.f12488a];
                C4580e c4580e2 = this.f12477Q;
                if (c4580e2 != null && c4580e2.m28420k(state.m35611b())) {
                    c4576b.f12490c = this.f12475O.mo35355m() + c4580e.f12516k;
                    c4576b.f12494g = true;
                    c4576b.f12489b = -1;
                    return true;
                } else if (this.f12479S == Integer.MIN_VALUE) {
                    View mo35749N = mo35749N(this.f12478R);
                    if (mo35749N != null) {
                        if (this.f12475O.mo35363e(mo35749N) > this.f12475O.mo35354n()) {
                            c4576b.m28461r();
                            return true;
                        } else if (this.f12475O.mo35361g(mo35749N) - this.f12475O.mo35355m() < 0) {
                            c4576b.f12490c = this.f12475O.mo35355m();
                            c4576b.f12492e = false;
                            return true;
                        } else if (this.f12475O.mo35359i() - this.f12475O.mo35364d(mo35749N) < 0) {
                            c4576b.f12490c = this.f12475O.mo35359i();
                            c4576b.f12492e = true;
                            return true;
                        } else {
                            if (c4576b.f12492e) {
                                mo35361g = this.f12475O.mo35364d(mo35749N) + this.f12475O.m35366o();
                            } else {
                                mo35361g = this.f12475O.mo35361g(mo35749N);
                            }
                            c4576b.f12490c = mo35361g;
                        }
                    } else {
                        if (m35736U() > 0 && (m35739T = m35739T(0)) != null) {
                            if (this.f12478R < m35705o0(m35739T)) {
                                z = true;
                            }
                            c4576b.f12492e = z;
                        }
                        c4576b.m28461r();
                    }
                    return true;
                } else {
                    if (!mo28407l() && this.f12467G) {
                        c4576b.f12490c = this.f12479S - this.f12475O.mo35358j();
                    } else {
                        c4576b.f12490c = this.f12475O.mo35355m() + this.f12479S;
                    }
                    return true;
                }
            }
            this.f12478R = -1;
            this.f12479S = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: R2 */
    private void m28529R2(RecyclerView.State state, C4576b c4576b) {
        if (m28530Q2(state, c4576b, this.f12477Q) || m28532P2(state, c4576b)) {
            return;
        }
        c4576b.m28461r();
        c4576b.f12488a = 0;
        c4576b.f12489b = 0;
    }

    /* renamed from: S2 */
    private void m28528S2(int i) {
        if (i >= m28492q2()) {
            return;
        }
        int m35736U = m35736U();
        this.f12470J.m28342t(m35736U);
        this.f12470J.m28341u(m35736U);
        this.f12470J.m28343s(m35736U);
        if (i >= this.f12470J.f12537c.length) {
            return;
        }
        this.f12486Z = i;
        View m28484w2 = m28484w2();
        if (m28484w2 == null) {
            return;
        }
        this.f12478R = m35705o0(m28484w2);
        if (!mo28407l() && this.f12467G) {
            this.f12479S = this.f12475O.mo35364d(m28484w2) + this.f12475O.mo35358j();
        } else {
            this.f12479S = this.f12475O.mo35361g(m28484w2) - this.f12475O.mo35355m();
        }
    }

    /* renamed from: T2 */
    private void m28527T2(int i) {
        int i2;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35687v0(), m35685w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35719h0(), m35717i0());
        int m35687v0 = m35687v0();
        int m35719h0 = m35719h0();
        boolean z = true;
        if (mo28407l()) {
            int i4 = this.f12480T;
            if (i4 == Integer.MIN_VALUE || i4 == m35687v0) {
                z = false;
            }
            if (this.f12473M.f12506b) {
                i2 = this.f12484X.getResources().getDisplayMetrics().heightPixels;
            } else {
                i2 = this.f12473M.f12505a;
            }
        } else {
            int i5 = this.f12481U;
            if (i5 == Integer.MIN_VALUE || i5 == m35719h0) {
                z = false;
            }
            if (this.f12473M.f12506b) {
                i2 = this.f12484X.getResources().getDisplayMetrics().widthPixels;
            } else {
                i2 = this.f12473M.f12505a;
            }
        }
        int i6 = i2;
        this.f12480T = m35687v0;
        this.f12481U = m35719h0;
        int i7 = this.f12486Z;
        if (i7 == -1 && (this.f12478R != -1 || z)) {
            if (this.f12474N.f12492e) {
                return;
            }
            this.f12469I.clear();
            this.f12487a0.m28335a();
            if (mo28407l()) {
                this.f12470J.m28357e(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i6, this.f12474N.f12488a, this.f12469I);
            } else {
                this.f12470J.m28354h(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i6, this.f12474N.f12488a, this.f12469I);
            }
            this.f12469I = this.f12487a0.f12540a;
            this.f12470J.m28346p(makeMeasureSpec, makeMeasureSpec2);
            this.f12470J.m28364X();
            C4576b c4576b = this.f12474N;
            c4576b.f12489b = this.f12470J.f12537c[c4576b.f12488a];
            this.f12473M.f12507c = this.f12474N.f12489b;
            return;
        }
        if (i7 != -1) {
            i3 = Math.min(i7, this.f12474N.f12488a);
        } else {
            i3 = this.f12474N.f12488a;
        }
        int i8 = i3;
        this.f12487a0.m28335a();
        if (mo28407l()) {
            if (this.f12469I.size() > 0) {
                this.f12470J.m28352j(this.f12469I, i8);
                this.f12470J.m28360b(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i6, i8, this.f12474N.f12488a, this.f12469I);
            } else {
                this.f12470J.m28343s(i);
                this.f12470J.m28358d(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f12469I);
            }
        } else if (this.f12469I.size() > 0) {
            this.f12470J.m28352j(this.f12469I, i8);
            this.f12470J.m28360b(this.f12487a0, makeMeasureSpec2, makeMeasureSpec, i6, i8, this.f12474N.f12488a, this.f12469I);
        } else {
            this.f12470J.m28343s(i);
            this.f12470J.m28355g(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i6, 0, this.f12469I);
        }
        this.f12469I = this.f12487a0.f12540a;
        this.f12470J.m28345q(makeMeasureSpec, makeMeasureSpec2, i8);
        this.f12470J.m28363Y(i8);
    }

    /* renamed from: U2 */
    private void m28526U2(int i, int i2) {
        boolean z;
        int i3;
        this.f12473M.f12513i = i;
        boolean mo28407l = mo28407l();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(m35687v0(), m35685w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(m35719h0(), m35717i0());
        if (!mo28407l && this.f12467G) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            View m35739T = m35739T(m35736U() - 1);
            if (m35739T == null) {
                return;
            }
            this.f12473M.f12509e = this.f12475O.mo35364d(m35739T);
            int m35705o0 = m35705o0(m35739T);
            View m28493p2 = m28493p2(m35739T, this.f12469I.get(this.f12470J.f12537c[m35705o0]));
            this.f12473M.f12512h = 1;
            C4579d c4579d = this.f12473M;
            c4579d.f12508d = m35705o0 + c4579d.f12512h;
            if (this.f12470J.f12537c.length <= this.f12473M.f12508d) {
                this.f12473M.f12507c = -1;
            } else {
                C4579d c4579d2 = this.f12473M;
                c4579d2.f12507c = this.f12470J.f12537c[c4579d2.f12508d];
            }
            if (z) {
                this.f12473M.f12509e = this.f12475O.mo35361g(m28493p2);
                this.f12473M.f12510f = (-this.f12475O.mo35361g(m28493p2)) + this.f12475O.mo35355m();
                C4579d c4579d3 = this.f12473M;
                c4579d3.f12510f = Math.max(c4579d3.f12510f, 0);
            } else {
                this.f12473M.f12509e = this.f12475O.mo35364d(m28493p2);
                this.f12473M.f12510f = this.f12475O.mo35364d(m28493p2) - this.f12475O.mo35359i();
            }
            if ((this.f12473M.f12507c == -1 || this.f12473M.f12507c > this.f12469I.size() - 1) && this.f12473M.f12508d <= getFlexItemCount()) {
                int i4 = i2 - this.f12473M.f12510f;
                this.f12487a0.m28335a();
                if (i4 > 0) {
                    if (mo28407l) {
                        this.f12470J.m28358d(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i4, this.f12473M.f12508d, this.f12469I);
                    } else {
                        this.f12470J.m28355g(this.f12487a0, makeMeasureSpec, makeMeasureSpec2, i4, this.f12473M.f12508d, this.f12469I);
                    }
                    this.f12470J.m28345q(makeMeasureSpec, makeMeasureSpec2, this.f12473M.f12508d);
                    this.f12470J.m28363Y(this.f12473M.f12508d);
                }
            }
        } else {
            View m35739T2 = m35739T(0);
            if (m35739T2 == null) {
                return;
            }
            this.f12473M.f12509e = this.f12475O.mo35361g(m35739T2);
            int m35705o02 = m35705o0(m35739T2);
            View m28496m2 = m28496m2(m35739T2, this.f12469I.get(this.f12470J.f12537c[m35705o02]));
            this.f12473M.f12512h = 1;
            int i5 = this.f12470J.f12537c[m35705o02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                this.f12473M.f12508d = m35705o02 - this.f12469I.get(i5 - 1).m28390b();
            } else {
                this.f12473M.f12508d = -1;
            }
            C4579d c4579d4 = this.f12473M;
            if (i5 > 0) {
                i3 = i5 - 1;
            } else {
                i3 = 0;
            }
            c4579d4.f12507c = i3;
            if (z) {
                this.f12473M.f12509e = this.f12475O.mo35364d(m28496m2);
                this.f12473M.f12510f = this.f12475O.mo35364d(m28496m2) - this.f12475O.mo35359i();
                C4579d c4579d5 = this.f12473M;
                c4579d5.f12510f = Math.max(c4579d5.f12510f, 0);
            } else {
                this.f12473M.f12509e = this.f12475O.mo35361g(m28496m2);
                this.f12473M.f12510f = (-this.f12475O.mo35361g(m28496m2)) + this.f12475O.mo35355m();
            }
        }
        C4579d c4579d6 = this.f12473M;
        c4579d6.f12505a = i2 - c4579d6.f12510f;
    }

    /* renamed from: V2 */
    private void m28524V2(C4576b c4576b, boolean z, boolean z2) {
        if (z2) {
            m28542K2();
        } else {
            this.f12473M.f12506b = false;
        }
        if (!mo28407l() && this.f12467G) {
            this.f12473M.f12505a = c4576b.f12490c - getPaddingRight();
        } else {
            this.f12473M.f12505a = this.f12475O.mo35359i() - c4576b.f12490c;
        }
        this.f12473M.f12508d = c4576b.f12488a;
        this.f12473M.f12512h = 1;
        this.f12473M.f12513i = 1;
        this.f12473M.f12509e = c4576b.f12490c;
        this.f12473M.f12510f = Integer.MIN_VALUE;
        this.f12473M.f12507c = c4576b.f12489b;
        if (z && this.f12469I.size() > 1 && c4576b.f12489b >= 0 && c4576b.f12489b < this.f12469I.size() - 1) {
            C4579d.m28441l(this.f12473M);
            C4579d.m28432u(this.f12473M, this.f12469I.get(c4576b.f12489b).m28390b());
        }
    }

    /* renamed from: W2 */
    private void m28522W2(C4576b c4576b, boolean z, boolean z2) {
        if (z2) {
            m28542K2();
        } else {
            this.f12473M.f12506b = false;
        }
        if (!mo28407l() && this.f12467G) {
            this.f12473M.f12505a = (this.f12485Y.getWidth() - c4576b.f12490c) - this.f12475O.mo35355m();
        } else {
            this.f12473M.f12505a = c4576b.f12490c - this.f12475O.mo35355m();
        }
        this.f12473M.f12508d = c4576b.f12488a;
        this.f12473M.f12512h = 1;
        this.f12473M.f12513i = -1;
        this.f12473M.f12509e = c4576b.f12490c;
        this.f12473M.f12510f = Integer.MIN_VALUE;
        this.f12473M.f12507c = c4576b.f12489b;
        if (z && c4576b.f12489b > 0 && this.f12469I.size() > c4576b.f12489b) {
            C4579d.m28440m(this.f12473M);
            C4579d.m28431v(this.f12473M, this.f12469I.get(c4576b.f12489b).m28390b());
        }
    }

    /* renamed from: c2 */
    private boolean m28512c2(View view, int i) {
        if (!mo28407l() && this.f12467G) {
            if (this.f12475O.mo35364d(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f12475O.mo35361g(view) >= this.f12475O.mo35360h() - i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d2 */
    private boolean m28510d2(View view, int i) {
        if (!mo28407l() && this.f12467G) {
            if (this.f12475O.mo35360h() - this.f12475O.mo35361g(view) <= i) {
                return true;
            }
            return false;
        } else if (this.f12475O.mo35364d(view) <= i) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e2 */
    private void m28508e2() {
        this.f12469I.clear();
        this.f12474N.m28459t();
        this.f12474N.f12491d = 0;
    }

    /* renamed from: f2 */
    private int m28506f2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        int m35611b = state.m35611b();
        m28501j2();
        View m28497l2 = m28497l2(m35611b);
        View m28494o2 = m28494o2(m35611b);
        if (state.m35611b() == 0 || m28497l2 == null || m28494o2 == null) {
            return 0;
        }
        return Math.min(this.f12475O.mo35354n(), this.f12475O.mo35364d(m28494o2) - this.f12475O.mo35361g(m28497l2));
    }

    /* renamed from: g2 */
    private int m28504g2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        int m35611b = state.m35611b();
        View m28497l2 = m28497l2(m35611b);
        View m28494o2 = m28494o2(m35611b);
        if (state.m35611b() != 0 && m28497l2 != null && m28494o2 != null) {
            int m35705o0 = m35705o0(m28497l2);
            int m35705o02 = m35705o0(m28494o2);
            int abs = Math.abs(this.f12475O.mo35364d(m28494o2) - this.f12475O.mo35361g(m28497l2));
            int[] iArr = this.f12470J.f12537c;
            int i = iArr[m35705o0];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[m35705o02] - i) + 1))) + (this.f12475O.mo35355m() - this.f12475O.mo35361g(m28497l2)));
            }
        }
        return 0;
    }

    /* renamed from: h2 */
    private int m28503h2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        int m35611b = state.m35611b();
        View m28497l2 = m28497l2(m35611b);
        View m28494o2 = m28494o2(m35611b);
        if (state.m35611b() == 0 || m28497l2 == null || m28494o2 == null) {
            return 0;
        }
        int m28495n2 = m28495n2();
        return (int) ((Math.abs(this.f12475O.mo35364d(m28494o2) - this.f12475O.mo35361g(m28497l2)) / ((m28492q2() - m28495n2) + 1)) * state.m35611b());
    }

    /* renamed from: i2 */
    private void m28502i2() {
        if (this.f12473M == null) {
            this.f12473M = new C4579d();
        }
    }

    /* renamed from: j2 */
    private void m28501j2() {
        if (this.f12475O != null) {
            return;
        }
        if (mo28407l()) {
            if (this.f12463C == 0) {
                this.f12475O = AbstractC1806j.m35369a(this);
                this.f12476P = AbstractC1806j.m35367c(this);
                return;
            }
            this.f12475O = AbstractC1806j.m35367c(this);
            this.f12476P = AbstractC1806j.m35369a(this);
        } else if (this.f12463C == 0) {
            this.f12475O = AbstractC1806j.m35367c(this);
            this.f12476P = AbstractC1806j.m35369a(this);
        } else {
            this.f12475O = AbstractC1806j.m35369a(this);
            this.f12476P = AbstractC1806j.m35367c(this);
        }
    }

    /* renamed from: k2 */
    private int m28499k2(RecyclerView.Recycler recycler, RecyclerView.State state, C4579d c4579d) {
        if (c4579d.f12510f != Integer.MIN_VALUE) {
            if (c4579d.f12505a < 0) {
                C4579d.m28436q(c4579d, c4579d.f12505a);
            }
            m28547G2(recycler, c4579d);
        }
        int i = c4579d.f12505a;
        int i2 = c4579d.f12505a;
        boolean mo28407l = mo28407l();
        int i3 = 0;
        while (true) {
            if ((i2 > 0 || this.f12473M.f12506b) && c4579d.m28453D(state, this.f12469I)) {
                C4584c c4584c = this.f12469I.get(c4579d.f12507c);
                c4579d.f12508d = c4584c.f12531o;
                i3 += m28556D2(c4584c, c4579d);
                if (!mo28407l && this.f12467G) {
                    C4579d.m28449d(c4579d, c4584c.m28391a() * c4579d.f12513i);
                } else {
                    C4579d.m28450c(c4579d, c4584c.m28391a() * c4579d.f12513i);
                }
                i2 -= c4584c.m28391a();
            }
        }
        C4579d.m28444i(c4579d, i3);
        if (c4579d.f12510f != Integer.MIN_VALUE) {
            C4579d.m28436q(c4579d, i3);
            if (c4579d.f12505a < 0) {
                C4579d.m28436q(c4579d, c4579d.f12505a);
            }
            m28547G2(recycler, c4579d);
        }
        return i - c4579d.f12505a;
    }

    /* renamed from: l2 */
    private View m28497l2(int i) {
        View m28490s2 = m28490s2(0, m35736U(), i);
        if (m28490s2 == null) {
            return null;
        }
        int i2 = this.f12470J.f12537c[m35705o0(m28490s2)];
        if (i2 == -1) {
            return null;
        }
        return m28496m2(m28490s2, this.f12469I.get(i2));
    }

    /* renamed from: m2 */
    private View m28496m2(View view, C4584c c4584c) {
        boolean mo28407l = mo28407l();
        int i = c4584c.f12524h;
        for (int i2 = 1; i2 < i; i2++) {
            View m35739T = m35739T(i2);
            if (m35739T != null && m35739T.getVisibility() != 8) {
                if (this.f12467G && !mo28407l) {
                    if (this.f12475O.mo35364d(view) >= this.f12475O.mo35364d(m35739T)) {
                    }
                    view = m35739T;
                } else {
                    if (this.f12475O.mo35361g(view) <= this.f12475O.mo35361g(m35739T)) {
                    }
                    view = m35739T;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    private View m28494o2(int i) {
        View m28490s2 = m28490s2(m35736U() - 1, -1, i);
        if (m28490s2 == null) {
            return null;
        }
        return m28493p2(m28490s2, this.f12469I.get(this.f12470J.f12537c[m35705o0(m28490s2)]));
    }

    /* renamed from: p2 */
    private View m28493p2(View view, C4584c c4584c) {
        boolean mo28407l = mo28407l();
        int m35736U = (m35736U() - c4584c.f12524h) - 1;
        for (int m35736U2 = m35736U() - 2; m35736U2 > m35736U; m35736U2--) {
            View m35739T = m35739T(m35736U2);
            if (m35739T != null && m35739T.getVisibility() != 8) {
                if (this.f12467G && !mo28407l) {
                    if (this.f12475O.mo35361g(view) <= this.f12475O.mo35361g(m35739T)) {
                    }
                    view = m35739T;
                } else {
                    if (this.f12475O.mo35364d(view) >= this.f12475O.mo35364d(m35739T)) {
                    }
                    view = m35739T;
                }
            }
        }
        return view;
    }

    /* renamed from: r2 */
    private View m28491r2(int i, int i2, boolean z) {
        int i3;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View m35739T = m35739T(i);
            if (m28558C2(m35739T, z)) {
                return m35739T;
            }
            i += i3;
        }
        return null;
    }

    /* renamed from: s2 */
    private View m28490s2(int i, int i2, int i3) {
        int i4;
        int m35705o0;
        m28501j2();
        m28502i2();
        int mo35355m = this.f12475O.mo35355m();
        int mo35359i = this.f12475O.mo35359i();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
        View view = null;
        View view2 = null;
        while (i != i2) {
            View m35739T = m35739T(i);
            if (m35739T != null && (m35705o0 = m35705o0(m35739T)) >= 0 && m35705o0 < i3) {
                if (((RecyclerView.C1772i) m35739T.getLayoutParams()).m35577d()) {
                    if (view2 == null) {
                        view2 = m35739T;
                    }
                } else if (this.f12475O.mo35361g(m35739T) >= mo35355m && this.f12475O.mo35364d(m35739T) <= mo35359i) {
                    return m35739T;
                } else {
                    if (view == null) {
                        view = m35739T;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* renamed from: t2 */
    private int m28489t2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        boolean z2;
        int i2;
        int mo35359i;
        if (!mo28407l() && this.f12467G) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            int mo35355m = i - this.f12475O.mo35355m();
            if (mo35355m <= 0) {
                return 0;
            }
            i2 = m28562A2(mo35355m, recycler, state);
        } else {
            int mo35359i2 = this.f12475O.mo35359i() - i;
            if (mo35359i2 <= 0) {
                return 0;
            }
            i2 = -m28562A2(-mo35359i2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (mo35359i = this.f12475O.mo35359i() - i3) > 0) {
            this.f12475O.mo35351r(mo35359i);
            return mo35359i + i2;
        }
        return i2;
    }

    /* renamed from: u2 */
    private int m28488u2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int i2;
        int mo35355m;
        if (!mo28407l() && this.f12467G) {
            int mo35359i = this.f12475O.mo35359i() - i;
            if (mo35359i <= 0) {
                return 0;
            }
            i2 = m28562A2(-mo35359i, recycler, state);
        } else {
            int mo35355m2 = i - this.f12475O.mo35355m();
            if (mo35355m2 <= 0) {
                return 0;
            }
            i2 = -m28562A2(mo35355m2, recycler, state);
        }
        int i3 = i + i2;
        if (z && (mo35355m = i3 - this.f12475O.mo35355m()) > 0) {
            this.f12475O.mo35351r(-mo35355m);
            return i2 - mo35355m;
        }
        return i2;
    }

    /* renamed from: v2 */
    private int m28486v2(View view) {
        return m35727Z(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).bottomMargin;
    }

    /* renamed from: w2 */
    private View m28484w2() {
        return m35739T(0);
    }

    /* renamed from: x2 */
    private int m28482x2(View view) {
        return m35725b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).leftMargin;
    }

    /* renamed from: y2 */
    private int m28481y2(View view) {
        return m35722e0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).rightMargin;
    }

    /* renamed from: z2 */
    private int m28479z2(View view) {
        return m35721f0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.C1772i) view.getLayoutParams())).topMargin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo28561B(RecyclerView.State state) {
        return m28506f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo28559C(RecyclerView.State state) {
        return m28504g2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo28557D(RecyclerView.State state) {
        return m28503h2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo28555E(RecyclerView.State state) {
        return m28506f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo28552F(RecyclerView.State state) {
        return m28504g2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo28551F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (mo28407l() && this.f12463C != 0) {
            int m28560B2 = m28560B2(i);
            C4576b.m28467l(this.f12474N, m28560B2);
            this.f12476P.mo35351r(-m28560B2);
            return m28560B2;
        }
        int m28562A2 = m28562A2(i, recycler, state);
        this.f12483W.clear();
        return m28562A2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo28549G(RecyclerView.State state) {
        return m28503h2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo28548G1(int i) {
        this.f12478R = i;
        this.f12479S = Integer.MIN_VALUE;
        C4580e c4580e = this.f12477Q;
        if (c4580e != null) {
            c4580e.m28419r();
        }
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo28546H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!mo28407l() && (this.f12463C != 0 || mo28407l())) {
            int m28560B2 = m28560B2(i);
            C4576b.m28467l(this.f12474N, m28560B2);
            this.f12476P.mo35351r(-m28560B2);
            return m28560B2;
        }
        int m28562A2 = m28562A2(i, recycler, state);
        this.f12483W.clear();
        return m28562A2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M0 */
    public void mo28540M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        m35694s1();
    }

    /* renamed from: M2 */
    public void m28539M2(int i) {
        int i2 = this.f12465E;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                m35694s1();
                m28508e2();
            }
            this.f12465E = i;
            m35769C1();
        }
    }

    /* renamed from: N2 */
    public void m28538N2(int i) {
        if (this.f12462B != i) {
            m35694s1();
            this.f12462B = i;
            this.f12475O = null;
            this.f12476P = null;
            m28508e2();
            m35769C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C1772i mo28537O() {
        return new C4577c(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O0 */
    public void mo28536O0(RecyclerView recyclerView) {
        super.mo28536O0(recyclerView);
        this.f12485Y = (View) recyclerView.getParent();
    }

    /* renamed from: O2 */
    public void m28534O2(int i) {
        if (i != 2) {
            int i2 = this.f12463C;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    m35694s1();
                    m28508e2();
                }
                this.f12463C = i;
                this.f12475O = null;
                this.f12476P = null;
                m35769C1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C1772i mo28533P(Context context, AttributeSet attributeSet) {
        return new C4577c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo28531Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo28531Q0(recyclerView, recycler);
        if (this.f12482V) {
            m35691t1(recycler);
            recycler.m35648c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo27232R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C1802g c1802g = new C1802g(recyclerView.getContext());
        c1802g.setTargetPosition(i);
        m35740S1(c1802g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo28519Z0(RecyclerView recyclerView, int i, int i2) {
        super.mo28519Z0(recyclerView, i, i2);
        m28528S2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.InterfaceC1763a
    /* renamed from: a */
    public PointF mo28517a(int i) {
        View m35739T;
        int i2;
        if (m35736U() == 0 || (m35739T = m35739T(0)) == null) {
            return null;
        }
        if (i < m35705o0(m35739T)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        if (mo28407l()) {
            return new PointF(0.0f, i2);
        }
        return new PointF(i2, 0.0f);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: b */
    public void mo28416b(View view, int i, int i2, C4584c c4584c) {
        m35690u(view, f12461b0);
        if (mo28407l()) {
            int m35712l0 = m35712l0(view) + m35700q0(view);
            c4584c.f12521e += m35712l0;
            c4584c.f12522f += m35712l0;
            return;
        }
        int m35692t0 = m35692t0(view) + m35741S(view);
        c4584c.f12521e += m35692t0;
        c4584c.f12522f += m35692t0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo28515b1(RecyclerView recyclerView, int i, int i2, int i3) {
        super.mo28515b1(recyclerView, i, i2, i3);
        m28528S2(Math.min(i, i2));
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: c */
    public int mo28415c(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m35734V(m35687v0(), m35685w0(), i2, i3, mo28487v());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo28513c1(RecyclerView recyclerView, int i, int i2) {
        super.mo28513c1(recyclerView, i, i2);
        m28528S2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: d1 */
    public void mo28511d1(RecyclerView recyclerView, int i, int i2) {
        super.mo28511d1(recyclerView, i, i2);
        m28528S2(i);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: e */
    public View mo28414e(int i) {
        View view = this.f12483W.get(i);
        if (view != null) {
            return view;
        }
        return this.f12471K.m35636o(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo28509e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo28509e1(recyclerView, i, i2, obj);
        m28528S2(i);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: f */
    public int mo28413f(int i, int i2, int i3) {
        return RecyclerView.LayoutManager.m35734V(m35719h0(), m35717i0(), i2, i3, mo28485w());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo28507f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        this.f12471K = recycler;
        this.f12472L = state;
        int m35611b = state.m35611b();
        if (m35611b == 0 && state.m35608e()) {
            return;
        }
        m28541L2();
        m28501j2();
        m28502i2();
        this.f12470J.m28342t(m35611b);
        this.f12470J.m28341u(m35611b);
        this.f12470J.m28343s(m35611b);
        this.f12473M.f12514j = false;
        C4580e c4580e = this.f12477Q;
        if (c4580e != null && c4580e.m28420k(m35611b)) {
            this.f12478R = this.f12477Q.f12515j;
        }
        if (!this.f12474N.f12493f || this.f12478R != -1 || this.f12477Q != null) {
            this.f12474N.m28459t();
            m28529R2(state, this.f12474N);
            this.f12474N.f12493f = true;
        }
        m35762H(recycler);
        if (this.f12474N.f12492e) {
            m28522W2(this.f12474N, false, true);
        } else {
            m28524V2(this.f12474N, false, true);
        }
        m28527T2(m35611b);
        m28499k2(recycler, state, this.f12473M);
        if (this.f12474N.f12492e) {
            i2 = this.f12473M.f12509e;
            m28524V2(this.f12474N, true, false);
            m28499k2(recycler, state, this.f12473M);
            i = this.f12473M.f12509e;
        } else {
            i = this.f12473M.f12509e;
            m28522W2(this.f12474N, true, false);
            m28499k2(recycler, state, this.f12473M);
            i2 = this.f12473M.f12509e;
        }
        if (m35736U() > 0) {
            if (this.f12474N.f12492e) {
                m28488u2(i2 + m28489t2(i, recycler, state, true), recycler, state, false);
            } else {
                m28489t2(i + m28488u2(i2, recycler, state, true), recycler, state, false);
            }
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: g */
    public int mo28412g(View view) {
        int m35712l0;
        int m35700q0;
        if (mo28407l()) {
            m35712l0 = m35692t0(view);
            m35700q0 = m35741S(view);
        } else {
            m35712l0 = m35712l0(view);
            m35700q0 = m35700q0(view);
        }
        return m35712l0 + m35700q0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo28505g1(RecyclerView.State state) {
        super.mo28505g1(state);
        this.f12477Q = null;
        this.f12478R = -1;
        this.f12479S = Integer.MIN_VALUE;
        this.f12486Z = -1;
        this.f12474N.m28459t();
        this.f12483W.clear();
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getAlignItems() {
        return this.f12465E;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexDirection() {
        return this.f12462B;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexItemCount() {
        return this.f12472L.m35611b();
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public List<C4584c> getFlexLinesInternal() {
        return this.f12469I;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getFlexWrap() {
        return this.f12463C;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getLargestMainSize() {
        if (this.f12469I.size() == 0) {
            return 0;
        }
        int size = this.f12469I.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.f12469I.get(i2).f12521e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getMaxLine() {
        return this.f12466F;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public int getSumOfCrossSize() {
        int size = this.f12469I.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f12469I.get(i2).f12523g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: h */
    public void mo28411h(C4584c c4584c) {
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: i */
    public View mo28410i(int i) {
        return mo28414e(i);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: j */
    public void mo28409j(int i, View view) {
        this.f12483W.put(i, view);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: k */
    public int mo28408k(View view, int i, int i2) {
        int m35692t0;
        int m35741S;
        if (mo28407l()) {
            m35692t0 = m35712l0(view);
            m35741S = m35700q0(view);
        } else {
            m35692t0 = m35692t0(view);
            m35741S = m35741S(view);
        }
        return m35692t0 + m35741S;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo28500k1(Parcelable parcelable) {
        if (parcelable instanceof C4580e) {
            this.f12477Q = (C4580e) parcelable;
            m35769C1();
        }
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    /* renamed from: l */
    public boolean mo28407l() {
        int i = this.f12462B;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo28498l1() {
        if (this.f12477Q != null) {
            return new C4580e(this.f12477Q);
        }
        C4580e c4580e = new C4580e();
        if (m35736U() > 0) {
            View m28484w2 = m28484w2();
            c4580e.f12515j = m35705o0(m28484w2);
            c4580e.f12516k = this.f12475O.mo35361g(m28484w2) - this.f12475O.mo35355m();
        } else {
            c4580e.m28419r();
        }
        return c4580e;
    }

    /* renamed from: n2 */
    public int m28495n2() {
        View m28491r2 = m28491r2(0, m35736U(), false);
        if (m28491r2 == null) {
            return -1;
        }
        return m35705o0(m28491r2);
    }

    /* renamed from: q2 */
    public int m28492q2() {
        View m28491r2 = m28491r2(m35736U() - 1, -1, false);
        if (m28491r2 == null) {
            return -1;
        }
        return m35705o0(m28491r2);
    }

    @Override // com.google.android.flexbox.InterfaceC4582a
    public void setFlexLines(List<C4584c> list) {
        this.f12469I = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo28487v() {
        int i;
        if (this.f12463C == 0) {
            return mo28407l();
        }
        if (mo28407l()) {
            int m35687v0 = m35687v0();
            View view = this.f12485Y;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (m35687v0 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo28485w() {
        int i;
        if (this.f12463C == 0) {
            return !mo28407l();
        }
        if (mo28407l()) {
            return true;
        }
        int m35719h0 = m35719h0();
        View view = this.f12485Y;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (m35719h0 > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo28483x(RecyclerView.C1772i c1772i) {
        return c1772i instanceof C4577c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo28480z0() {
        return true;
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4580e implements Parcelable {
        public static final Parcelable.Creator<C4580e> CREATOR = new C4581a();

        /* renamed from: j */
        private int f12515j;

        /* renamed from: k */
        private int f12516k;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4581a implements Parcelable.Creator<C4580e> {
            C4581a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4580e createFromParcel(Parcel parcel) {
                return new C4580e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4580e[] newArray(int i) {
                return new C4580e[i];
            }
        }

        /* renamed from: k */
        public boolean m28420k(int i) {
            int i2 = this.f12515j;
            return i2 >= 0 && i2 < i;
        }

        /* renamed from: r */
        public void m28419r() {
            this.f12515j = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "SavedState{mAnchorPosition=" + this.f12515j + ", mAnchorOffset=" + this.f12516k + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f12515j);
            parcel.writeInt(this.f12516k);
        }

        C4580e() {
        }

        private C4580e(Parcel parcel) {
            this.f12515j = parcel.readInt();
            this.f12516k = parcel.readInt();
        }

        private C4580e(C4580e c4580e) {
            this.f12515j = c4580e.f12515j;
            this.f12516k = c4580e.f12516k;
        }
    }

    public FlexboxLayoutManager(Context context, int i, int i2) {
        this.f12466F = -1;
        this.f12469I = new ArrayList();
        this.f12470J = new C4585d(this);
        this.f12474N = new C4576b();
        this.f12478R = -1;
        this.f12479S = Integer.MIN_VALUE;
        this.f12480T = Integer.MIN_VALUE;
        this.f12481U = Integer.MIN_VALUE;
        this.f12483W = new SparseArray<>();
        this.f12486Z = -1;
        this.f12487a0 = new C4585d.C4587b();
        m28538N2(i);
        m28534O2(i2);
        m28539M2(4);
        this.f12484X = context;
    }

    /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4577c extends RecyclerView.C1772i implements InterfaceC4583b {
        public static final Parcelable.Creator<C4577c> CREATOR = new C4578a();

        /* renamed from: n */
        private float f12496n;

        /* renamed from: o */
        private float f12497o;

        /* renamed from: p */
        private int f12498p;

        /* renamed from: q */
        private float f12499q;

        /* renamed from: r */
        private int f12500r;

        /* renamed from: s */
        private int f12501s;

        /* renamed from: t */
        private int f12502t;

        /* renamed from: u */
        private int f12503u;

        /* renamed from: v */
        private boolean f12504v;

        /* renamed from: com.google.android.flexbox.FlexboxLayoutManager$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4578a implements Parcelable.Creator<C4577c> {
            C4578a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4577c createFromParcel(Parcel parcel) {
                return new C4577c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C4577c[] newArray(int i) {
                return new C4577c[i];
            }
        }

        public C4577c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f12496n = 0.0f;
            this.f12497o = 1.0f;
            this.f12498p = -1;
            this.f12499q = -1.0f;
            this.f12502t = 16777215;
            this.f12503u = 16777215;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: B */
        public void mo28406B(int i) {
            this.f12500r = i;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: C */
        public int mo28405C() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: D */
        public int mo28404D() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: K */
        public int mo28403K() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: L */
        public int mo28402L() {
            return this.f12501s;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: N */
        public int mo28401N() {
            return this.f12503u;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: c */
        public int mo28400c() {
            return this.f12498p;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: f */
        public float mo28399f() {
            return this.f12497o;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: i */
        public int mo28398i() {
            return this.f12500r;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: l */
        public int mo28397l() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: m */
        public void mo28396m(int i) {
            this.f12501s = i;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: n */
        public float mo28395n() {
            return this.f12496n;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: q */
        public float mo28394q() {
            return this.f12499q;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: s */
        public boolean mo28393s() {
            return this.f12504v;
        }

        @Override // com.google.android.flexbox.InterfaceC4583b
        /* renamed from: t */
        public int mo28392t() {
            return this.f12502t;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.f12496n);
            parcel.writeFloat(this.f12497o);
            parcel.writeInt(this.f12498p);
            parcel.writeFloat(this.f12499q);
            parcel.writeInt(this.f12500r);
            parcel.writeInt(this.f12501s);
            parcel.writeInt(this.f12502t);
            parcel.writeInt(this.f12503u);
            parcel.writeByte(this.f12504v ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public C4577c(int i, int i2) {
            super(i, i2);
            this.f12496n = 0.0f;
            this.f12497o = 1.0f;
            this.f12498p = -1;
            this.f12499q = -1.0f;
            this.f12502t = 16777215;
            this.f12503u = 16777215;
        }

        protected C4577c(Parcel parcel) {
            super(-2, -2);
            this.f12496n = 0.0f;
            this.f12497o = 1.0f;
            this.f12498p = -1;
            this.f12499q = -1.0f;
            this.f12502t = 16777215;
            this.f12503u = 16777215;
            this.f12496n = parcel.readFloat();
            this.f12497o = parcel.readFloat();
            this.f12498p = parcel.readInt();
            this.f12499q = parcel.readFloat();
            this.f12500r = parcel.readInt();
            this.f12501s = parcel.readInt();
            this.f12502t = parcel.readInt();
            this.f12503u = parcel.readInt();
            this.f12504v = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f12466F = -1;
        this.f12469I = new ArrayList();
        this.f12470J = new C4585d(this);
        this.f12474N = new C4576b();
        this.f12478R = -1;
        this.f12479S = Integer.MIN_VALUE;
        this.f12480T = Integer.MIN_VALUE;
        this.f12481U = Integer.MIN_VALUE;
        this.f12483W = new SparseArray<>();
        this.f12486Z = -1;
        this.f12487a0 = new C4585d.C4587b();
        RecyclerView.LayoutManager.C1760d m35702p0 = RecyclerView.LayoutManager.m35702p0(context, attributeSet, i, i2);
        int i3 = m35702p0.f4755a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (m35702p0.f4757c) {
                    m28538N2(3);
                } else {
                    m28538N2(2);
                }
            }
        } else if (m35702p0.f4757c) {
            m28538N2(1);
        } else {
            m28538N2(0);
        }
        m28534O2(1);
        m28539M2(4);
        this.f12484X = context;
    }
}