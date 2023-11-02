package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements ItemTouchHelper.InterfaceC1751e, RecyclerView.SmoothScroller.InterfaceC1763a {

    /* renamed from: B */
    int f4686B;

    /* renamed from: C */
    private C1754c f4687C;

    /* renamed from: D */
    AbstractC1806j f4688D;

    /* renamed from: E */
    private boolean f4689E;

    /* renamed from: F */
    private boolean f4690F;

    /* renamed from: G */
    boolean f4691G;

    /* renamed from: H */
    private boolean f4692H;

    /* renamed from: I */
    private boolean f4693I;

    /* renamed from: J */
    int f4694J;

    /* renamed from: K */
    int f4695K;

    /* renamed from: L */
    private boolean f4696L;

    /* renamed from: M */
    C1755d f4697M;

    /* renamed from: N */
    final C1752a f4698N;

    /* renamed from: O */
    private final C1753b f4699O;

    /* renamed from: P */
    private int f4700P;

    /* renamed from: Q */
    private int[] f4701Q;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1752a {

        /* renamed from: a */
        AbstractC1806j f4702a;

        /* renamed from: b */
        int f4703b;

        /* renamed from: c */
        int f4704c;

        /* renamed from: d */
        boolean f4705d;

        /* renamed from: e */
        boolean f4706e;

        C1752a() {
            m35798e();
        }

        /* renamed from: a */
        void m35802a() {
            int mo35355m;
            if (this.f4705d) {
                mo35355m = this.f4702a.mo35359i();
            } else {
                mo35355m = this.f4702a.mo35355m();
            }
            this.f4704c = mo35355m;
        }

        /* renamed from: b */
        public void m35801b(View view, int i) {
            if (this.f4705d) {
                this.f4704c = this.f4702a.mo35364d(view) + this.f4702a.m35366o();
            } else {
                this.f4704c = this.f4702a.mo35361g(view);
            }
            this.f4703b = i;
        }

        /* renamed from: c */
        public void m35800c(View view, int i) {
            int m35366o = this.f4702a.m35366o();
            if (m35366o >= 0) {
                m35801b(view, i);
                return;
            }
            this.f4703b = i;
            if (this.f4705d) {
                int mo35359i = (this.f4702a.mo35359i() - m35366o) - this.f4702a.mo35364d(view);
                this.f4704c = this.f4702a.mo35359i() - mo35359i;
                if (mo35359i > 0) {
                    int mo35363e = this.f4704c - this.f4702a.mo35363e(view);
                    int mo35355m = this.f4702a.mo35355m();
                    int min = mo35363e - (mo35355m + Math.min(this.f4702a.mo35361g(view) - mo35355m, 0));
                    if (min < 0) {
                        this.f4704c += Math.min(mo35359i, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int mo35361g = this.f4702a.mo35361g(view);
            int mo35355m2 = mo35361g - this.f4702a.mo35355m();
            this.f4704c = mo35361g;
            if (mo35355m2 > 0) {
                int mo35359i2 = (this.f4702a.mo35359i() - Math.min(0, (this.f4702a.mo35359i() - m35366o) - this.f4702a.mo35364d(view))) - (mo35361g + this.f4702a.mo35363e(view));
                if (mo35359i2 < 0) {
                    this.f4704c -= Math.min(mo35355m2, -mo35359i2);
                }
            }
        }

        /* renamed from: d */
        boolean m35799d(View view, RecyclerView.State state) {
            RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
            if (!c1772i.m35577d() && c1772i.m35579a() >= 0 && c1772i.m35579a() < state.m35611b()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        void m35798e() {
            this.f4703b = -1;
            this.f4704c = Integer.MIN_VALUE;
            this.f4705d = false;
            this.f4706e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4703b + ", mCoordinate=" + this.f4704c + ", mLayoutFromEnd=" + this.f4705d + ", mValid=" + this.f4706e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1753b {

        /* renamed from: a */
        public int f4707a;

        /* renamed from: b */
        public boolean f4708b;

        /* renamed from: c */
        public boolean f4709c;

        /* renamed from: d */
        public boolean f4710d;

        protected C1753b() {
        }

        /* renamed from: a */
        void m35797a() {
            this.f4707a = 0;
            this.f4708b = false;
            this.f4709c = false;
            this.f4710d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1754c {

        /* renamed from: b */
        int f4712b;

        /* renamed from: c */
        int f4713c;

        /* renamed from: d */
        int f4714d;

        /* renamed from: e */
        int f4715e;

        /* renamed from: f */
        int f4716f;

        /* renamed from: g */
        int f4717g;

        /* renamed from: k */
        int f4721k;

        /* renamed from: m */
        boolean f4723m;

        /* renamed from: a */
        boolean f4711a = true;

        /* renamed from: h */
        int f4718h = 0;

        /* renamed from: i */
        int f4719i = 0;

        /* renamed from: j */
        boolean f4720j = false;

        /* renamed from: l */
        List<RecyclerView.ViewHolder> f4722l = null;

        C1754c() {
        }

        /* renamed from: e */
        private View m35792e() {
            int size = this.f4722l.size();
            for (int i = 0; i < size; i++) {
                View view = this.f4722l.get(i).itemView;
                RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view.getLayoutParams();
                if (!c1772i.m35577d() && this.f4714d == c1772i.m35579a()) {
                    m35795b(view);
                    return view;
                }
            }
            return null;
        }

        /* renamed from: a */
        public void m35796a() {
            m35795b(null);
        }

        /* renamed from: b */
        public void m35795b(View view) {
            View m35791f = m35791f(view);
            if (m35791f == null) {
                this.f4714d = -1;
            } else {
                this.f4714d = ((RecyclerView.C1772i) m35791f.getLayoutParams()).m35579a();
            }
        }

        /* renamed from: c */
        public boolean m35794c(RecyclerView.State state) {
            int i = this.f4714d;
            return i >= 0 && i < state.m35611b();
        }

        /* renamed from: d */
        public View m35793d(RecyclerView.Recycler recycler) {
            if (this.f4722l != null) {
                return m35792e();
            }
            View m35636o = recycler.m35636o(this.f4714d);
            this.f4714d += this.f4715e;
            return m35636o;
        }

        /* renamed from: f */
        public View m35791f(View view) {
            int m35579a;
            int size = this.f4722l.size();
            View view2 = null;
            int i = ViewDefaults.NUMBER_OF_LINES;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f4722l.get(i2).itemView;
                RecyclerView.C1772i c1772i = (RecyclerView.C1772i) view3.getLayoutParams();
                if (view3 != view && !c1772i.m35577d() && (m35579a = (c1772i.m35579a() - this.f4714d) * this.f4715e) >= 0 && m35579a < i) {
                    view2 = view3;
                    if (m35579a == 0) {
                        break;
                    }
                    i = m35579a;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1755d implements Parcelable {
        public static final Parcelable.Creator<C1755d> CREATOR = new C1756a();

        /* renamed from: j */
        int f4724j;

        /* renamed from: k */
        int f4725k;

        /* renamed from: l */
        boolean f4726l;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1756a implements Parcelable.Creator<C1755d> {
            C1756a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1755d createFromParcel(Parcel parcel) {
                return new C1755d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1755d[] newArray(int i) {
                return new C1755d[i];
            }
        }

        public C1755d() {
        }

        /* renamed from: a */
        boolean m35790a() {
            return this.f4724j >= 0;
        }

        /* renamed from: b */
        void m35789b() {
            this.f4724j = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4724j);
            parcel.writeInt(this.f4725k);
            parcel.writeInt(this.f4726l ? 1 : 0);
        }

        C1755d(Parcel parcel) {
            this.f4724j = parcel.readInt();
            this.f4725k = parcel.readInt();
            this.f4726l = parcel.readInt() == 1;
        }

        public C1755d(C1755d c1755d) {
            this.f4724j = c1755d.f4724j;
            this.f4725k = c1755d.f4725k;
            this.f4726l = c1755d.f4726l;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: B2 */
    private void m35854B2(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2) {
        boolean z;
        if (state.m35606g() && m35736U() != 0 && !state.m35608e() && mo35545U1()) {
            List<RecyclerView.ViewHolder> m35640k = recycler.m35640k();
            int size = m35640k.size();
            int m35705o0 = m35705o0(m35739T(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                RecyclerView.ViewHolder viewHolder = m35640k.get(i5);
                if (!viewHolder.isRemoved()) {
                    boolean z2 = true;
                    if (viewHolder.getLayoutPosition() < m35705o0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.f4691G) {
                        z2 = true;
                    }
                    if (z2) {
                        i3 += this.f4688D.mo35363e(viewHolder.itemView);
                    } else {
                        i4 += this.f4688D.mo35363e(viewHolder.itemView);
                    }
                }
            }
            this.f4687C.f4722l = m35640k;
            if (i3 > 0) {
                m35835U2(m35705o0(m35808u2()), i);
                C1754c c1754c = this.f4687C;
                c1754c.f4718h = i3;
                c1754c.f4713c = 0;
                c1754c.m35796a();
                m35825d2(recycler, this.f4687C, state, false);
            }
            if (i4 > 0) {
                m35837S2(m35705o0(m35809t2()), i2);
                C1754c c1754c2 = this.f4687C;
                c1754c2.f4718h = i4;
                c1754c2.f4713c = 0;
                c1754c2.m35796a();
                m35825d2(recycler, this.f4687C, state, false);
            }
            this.f4687C.f4722l = null;
        }
    }

    /* renamed from: D2 */
    private void m35852D2(RecyclerView.Recycler recycler, C1754c c1754c) {
        if (c1754c.f4711a && !c1754c.f4723m) {
            int i = c1754c.f4717g;
            int i2 = c1754c.f4719i;
            if (c1754c.f4716f == -1) {
                m35850F2(recycler, i, i2);
            } else {
                m35849G2(recycler, i, i2);
            }
        }
    }

    /* renamed from: E2 */
    private void m35851E2(RecyclerView.Recycler recycler, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m35684w1(i3, recycler);
            }
            return;
        }
        while (i > i2) {
            m35684w1(i, recycler);
            i--;
        }
    }

    /* renamed from: F2 */
    private void m35850F2(RecyclerView.Recycler recycler, int i, int i2) {
        int m35736U = m35736U();
        if (i < 0) {
            return;
        }
        int mo35360h = (this.f4688D.mo35360h() - i) + i2;
        if (this.f4691G) {
            for (int i3 = 0; i3 < m35736U; i3++) {
                View m35739T = m35739T(i3);
                if (this.f4688D.mo35361g(m35739T) < mo35360h || this.f4688D.mo35352q(m35739T) < mo35360h) {
                    m35851E2(recycler, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = m35736U - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View m35739T2 = m35739T(i5);
            if (this.f4688D.mo35361g(m35739T2) < mo35360h || this.f4688D.mo35352q(m35739T2) < mo35360h) {
                m35851E2(recycler, i4, i5);
                return;
            }
        }
    }

    /* renamed from: G2 */
    private void m35849G2(RecyclerView.Recycler recycler, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int m35736U = m35736U();
        if (this.f4691G) {
            int i4 = m35736U - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View m35739T = m35739T(i5);
                if (this.f4688D.mo35364d(m35739T) > i3 || this.f4688D.mo35353p(m35739T) > i3) {
                    m35851E2(recycler, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < m35736U; i6++) {
            View m35739T2 = m35739T(i6);
            if (this.f4688D.mo35364d(m35739T2) > i3 || this.f4688D.mo35353p(m35739T2) > i3) {
                m35851E2(recycler, 0, i6);
                return;
            }
        }
    }

    /* renamed from: I2 */
    private void m35847I2() {
        if (this.f4686B != 1 && m35804y2()) {
            this.f4691G = !this.f4690F;
        } else {
            this.f4691G = this.f4690F;
        }
    }

    /* renamed from: O2 */
    private boolean m35841O2(RecyclerView.Recycler recycler, RecyclerView.State state, C1752a c1752a) {
        View mo35812q2;
        boolean z;
        boolean z2 = false;
        if (m35736U() == 0) {
            return false;
        }
        View m35720g0 = m35720g0();
        if (m35720g0 != null && c1752a.m35799d(m35720g0, state)) {
            c1752a.m35800c(m35720g0, m35705o0(m35720g0));
            return true;
        }
        boolean z3 = this.f4689E;
        boolean z4 = this.f4692H;
        if (z3 != z4 || (mo35812q2 = mo35812q2(recycler, state, c1752a.f4705d, z4)) == null) {
            return false;
        }
        c1752a.m35801b(mo35812q2, m35705o0(mo35812q2));
        if (!state.m35608e() && mo35545U1()) {
            int mo35361g = this.f4688D.mo35361g(mo35812q2);
            int mo35364d = this.f4688D.mo35364d(mo35812q2);
            int mo35355m = this.f4688D.mo35355m();
            int mo35359i = this.f4688D.mo35359i();
            if (mo35364d <= mo35355m && mo35361g < mo35355m) {
                z = true;
            } else {
                z = false;
            }
            if (mo35361g >= mo35359i && mo35364d > mo35359i) {
                z2 = true;
            }
            if (z || z2) {
                if (c1752a.f4705d) {
                    mo35355m = mo35359i;
                }
                c1752a.f4704c = mo35355m;
            }
        }
        return true;
    }

    /* renamed from: P2 */
    private boolean m35840P2(RecyclerView.State state, C1752a c1752a) {
        int i;
        boolean z;
        int mo35361g;
        boolean z2 = false;
        if (!state.m35608e() && (i = this.f4694J) != -1) {
            if (i >= 0 && i < state.m35611b()) {
                c1752a.f4703b = this.f4694J;
                C1755d c1755d = this.f4697M;
                if (c1755d != null && c1755d.m35790a()) {
                    boolean z3 = this.f4697M.f4726l;
                    c1752a.f4705d = z3;
                    if (z3) {
                        c1752a.f4704c = this.f4688D.mo35359i() - this.f4697M.f4725k;
                    } else {
                        c1752a.f4704c = this.f4688D.mo35355m() + this.f4697M.f4725k;
                    }
                    return true;
                } else if (this.f4695K == Integer.MIN_VALUE) {
                    View mo35749N = mo35749N(this.f4694J);
                    if (mo35749N != null) {
                        if (this.f4688D.mo35363e(mo35749N) > this.f4688D.mo35354n()) {
                            c1752a.m35802a();
                            return true;
                        } else if (this.f4688D.mo35361g(mo35749N) - this.f4688D.mo35355m() < 0) {
                            c1752a.f4704c = this.f4688D.mo35355m();
                            c1752a.f4705d = false;
                            return true;
                        } else if (this.f4688D.mo35359i() - this.f4688D.mo35364d(mo35749N) < 0) {
                            c1752a.f4704c = this.f4688D.mo35359i();
                            c1752a.f4705d = true;
                            return true;
                        } else {
                            if (c1752a.f4705d) {
                                mo35361g = this.f4688D.mo35364d(mo35749N) + this.f4688D.m35366o();
                            } else {
                                mo35361g = this.f4688D.mo35361g(mo35749N);
                            }
                            c1752a.f4704c = mo35361g;
                        }
                    } else {
                        if (m35736U() > 0) {
                            if (this.f4694J < m35705o0(m35739T(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z == this.f4691G) {
                                z2 = true;
                            }
                            c1752a.f4705d = z2;
                        }
                        c1752a.m35802a();
                    }
                    return true;
                } else {
                    boolean z4 = this.f4691G;
                    c1752a.f4705d = z4;
                    if (z4) {
                        c1752a.f4704c = this.f4688D.mo35359i() - this.f4695K;
                    } else {
                        c1752a.f4704c = this.f4688D.mo35355m() + this.f4695K;
                    }
                    return true;
                }
            }
            this.f4694J = -1;
            this.f4695K = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: Q2 */
    private void m35839Q2(RecyclerView.Recycler recycler, RecyclerView.State state, C1752a c1752a) {
        int i;
        if (m35840P2(state, c1752a) || m35841O2(recycler, state, c1752a)) {
            return;
        }
        c1752a.m35802a();
        if (this.f4692H) {
            i = state.m35611b() - 1;
        } else {
            i = 0;
        }
        c1752a.f4703b = i;
    }

    /* renamed from: R2 */
    private void m35838R2(int i, int i2, boolean z, RecyclerView.State state) {
        int i3;
        int mo35355m;
        this.f4687C.f4723m = m35848H2();
        this.f4687C.f4716f = i;
        int[] iArr = this.f4701Q;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        mo27294V1(state, iArr);
        int max = Math.max(0, this.f4701Q[0]);
        int max2 = Math.max(0, this.f4701Q[1]);
        if (i == 1) {
            z2 = true;
        }
        C1754c c1754c = this.f4687C;
        if (z2) {
            i3 = max2;
        } else {
            i3 = max;
        }
        c1754c.f4718h = i3;
        if (!z2) {
            max = max2;
        }
        c1754c.f4719i = max;
        if (z2) {
            c1754c.f4718h = i3 + this.f4688D.mo35358j();
            View m35809t2 = m35809t2();
            C1754c c1754c2 = this.f4687C;
            if (this.f4691G) {
                i4 = -1;
            }
            c1754c2.f4715e = i4;
            int m35705o0 = m35705o0(m35809t2);
            C1754c c1754c3 = this.f4687C;
            c1754c2.f4714d = m35705o0 + c1754c3.f4715e;
            c1754c3.f4712b = this.f4688D.mo35364d(m35809t2);
            mo35355m = this.f4688D.mo35364d(m35809t2) - this.f4688D.mo35359i();
        } else {
            View m35808u2 = m35808u2();
            this.f4687C.f4718h += this.f4688D.mo35355m();
            C1754c c1754c4 = this.f4687C;
            if (!this.f4691G) {
                i4 = -1;
            }
            c1754c4.f4715e = i4;
            int m35705o02 = m35705o0(m35808u2);
            C1754c c1754c5 = this.f4687C;
            c1754c4.f4714d = m35705o02 + c1754c5.f4715e;
            c1754c5.f4712b = this.f4688D.mo35361g(m35808u2);
            mo35355m = (-this.f4688D.mo35361g(m35808u2)) + this.f4688D.mo35355m();
        }
        C1754c c1754c6 = this.f4687C;
        c1754c6.f4713c = i2;
        if (z) {
            c1754c6.f4713c = i2 - mo35355m;
        }
        c1754c6.f4717g = mo35355m;
    }

    /* renamed from: S2 */
    private void m35837S2(int i, int i2) {
        int i3;
        this.f4687C.f4713c = this.f4688D.mo35359i() - i2;
        C1754c c1754c = this.f4687C;
        if (this.f4691G) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c1754c.f4715e = i3;
        c1754c.f4714d = i;
        c1754c.f4716f = 1;
        c1754c.f4712b = i2;
        c1754c.f4717g = Integer.MIN_VALUE;
    }

    /* renamed from: T2 */
    private void m35836T2(C1752a c1752a) {
        m35837S2(c1752a.f4703b, c1752a.f4704c);
    }

    /* renamed from: U2 */
    private void m35835U2(int i, int i2) {
        int i3;
        this.f4687C.f4713c = i2 - this.f4688D.mo35355m();
        C1754c c1754c = this.f4687C;
        c1754c.f4714d = i;
        if (this.f4691G) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c1754c.f4715e = i3;
        c1754c.f4716f = -1;
        c1754c.f4712b = i2;
        c1754c.f4717g = Integer.MIN_VALUE;
    }

    /* renamed from: V2 */
    private void m35834V2(C1752a c1752a) {
        m35835U2(c1752a.f4703b, c1752a.f4704c);
    }

    /* renamed from: X1 */
    private int m35832X1(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        m35827c2();
        return C1811l.m35343a(state, this.f4688D, m35821h2(!this.f4693I, true), m35822g2(!this.f4693I, true), this, this.f4693I);
    }

    /* renamed from: Y1 */
    private int m35831Y1(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        m35827c2();
        return C1811l.m35342b(state, this.f4688D, m35821h2(!this.f4693I, true), m35822g2(!this.f4693I, true), this, this.f4693I, this.f4691G);
    }

    /* renamed from: Z1 */
    private int m35830Z1(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        m35827c2();
        return C1811l.m35341c(state, this.f4688D, m35821h2(!this.f4693I, true), m35822g2(!this.f4693I, true), this, this.f4693I);
    }

    /* renamed from: f2 */
    private View m35823f2() {
        return m35816m2(0, m35736U());
    }

    /* renamed from: k2 */
    private View m35818k2() {
        return m35816m2(m35736U() - 1, -1);
    }

    /* renamed from: o2 */
    private View m35814o2() {
        if (this.f4691G) {
            return m35823f2();
        }
        return m35818k2();
    }

    /* renamed from: p2 */
    private View m35813p2() {
        if (this.f4691G) {
            return m35818k2();
        }
        return m35823f2();
    }

    /* renamed from: r2 */
    private int m35811r2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo35359i;
        int mo35359i2 = this.f4688D.mo35359i() - i;
        if (mo35359i2 > 0) {
            int i2 = -m35846J2(-mo35359i2, recycler, state);
            int i3 = i + i2;
            if (z && (mo35359i = this.f4688D.mo35359i() - i3) > 0) {
                this.f4688D.mo35351r(mo35359i);
                return mo35359i + i2;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: s2 */
    private int m35810s2(int i, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo35355m;
        int mo35355m2 = i - this.f4688D.mo35355m();
        if (mo35355m2 > 0) {
            int i2 = -m35846J2(mo35355m2, recycler, state);
            int i3 = i + i2;
            if (z && (mo35355m = i3 - this.f4688D.mo35355m()) > 0) {
                this.f4688D.mo35351r(-mo35355m);
                return i2 - mo35355m;
            }
            return i2;
        }
        return 0;
    }

    /* renamed from: t2 */
    private View m35809t2() {
        return m35739T(this.f4691G ? 0 : m35736U() - 1);
    }

    /* renamed from: u2 */
    private View m35808u2() {
        return m35739T(this.f4691G ? m35736U() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A */
    public void mo35774A(int i, RecyclerView.LayoutManager.InterfaceC1759c interfaceC1759c) {
        boolean z;
        int i2;
        C1755d c1755d = this.f4697M;
        int i3 = -1;
        if (c1755d != null && c1755d.m35790a()) {
            C1755d c1755d2 = this.f4697M;
            z = c1755d2.f4726l;
            i2 = c1755d2.f4724j;
        } else {
            m35847I2();
            z = this.f4691G;
            i2 = this.f4694J;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f4700P && i2 >= 0 && i2 < i; i4++) {
            interfaceC1759c.mo35677a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: A2 */
    void mo35855A2(RecyclerView.Recycler recycler, RecyclerView.State state, C1754c c1754c, C1753b c1753b) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int mo35362f;
        boolean z2;
        View m35793d = c1754c.m35793d(recycler);
        if (m35793d == null) {
            c1753b.f4708b = true;
            return;
        }
        RecyclerView.C1772i c1772i = (RecyclerView.C1772i) m35793d.getLayoutParams();
        if (c1754c.f4722l == null) {
            boolean z3 = this.f4691G;
            if (c1754c.f4716f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                m35706o(m35793d);
            } else {
                m35703p(m35793d, 0);
            }
        } else {
            boolean z4 = this.f4691G;
            if (c1754c.f4716f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                m35711m(m35793d);
            } else {
                m35709n(m35793d, 0);
            }
        }
        m35759I0(m35793d, 0, 0);
        c1753b.f4707a = this.f4688D.mo35363e(m35793d);
        if (this.f4686B == 1) {
            if (m35804y2()) {
                mo35362f = m35687v0() - getPaddingRight();
                i4 = mo35362f - this.f4688D.mo35362f(m35793d);
            } else {
                i4 = getPaddingLeft();
                mo35362f = this.f4688D.mo35362f(m35793d) + i4;
            }
            if (c1754c.f4716f == -1) {
                int i5 = c1754c.f4712b;
                i3 = i5;
                i2 = mo35362f;
                i = i5 - c1753b.f4707a;
            } else {
                int i6 = c1754c.f4712b;
                i = i6;
                i2 = mo35362f;
                i3 = c1753b.f4707a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int mo35362f2 = this.f4688D.mo35362f(m35793d) + paddingTop;
            if (c1754c.f4716f == -1) {
                int i7 = c1754c.f4712b;
                i2 = i7;
                i = paddingTop;
                i3 = mo35362f2;
                i4 = i7 - c1753b.f4707a;
            } else {
                int i8 = c1754c.f4712b;
                i = paddingTop;
                i2 = c1753b.f4707a + i8;
                i3 = mo35362f2;
                i4 = i8;
            }
        }
        m35761H0(m35793d, i4, i, i2, i3);
        if (c1772i.m35577d() || c1772i.m35578b()) {
            c1753b.f4709c = true;
        }
        c1753b.f4710d = m35793d.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo28561B(RecyclerView.State state) {
        return m35832X1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo28559C(RecyclerView.State state) {
        return m35831Y1(state);
    }

    /* renamed from: C2 */
    public void mo35853C2(RecyclerView.Recycler recycler, RecyclerView.State state, C1752a c1752a, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo28557D(RecyclerView.State state) {
        return m35830Z1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo28555E(RecyclerView.State state) {
        return m35832X1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo28552F(RecyclerView.State state) {
        return m35831Y1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo28551F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4686B == 1) {
            return 0;
        }
        return m35846J2(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo28549G(RecyclerView.State state) {
        return m35830Z1(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo28548G1(int i) {
        this.f4694J = i;
        this.f4695K = Integer.MIN_VALUE;
        C1755d c1755d = this.f4697M;
        if (c1755d != null) {
            c1755d.m35789b();
        }
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo28546H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (this.f4686B == 0) {
            return 0;
        }
        return m35846J2(i, recycler, state);
    }

    /* renamed from: H2 */
    boolean m35848H2() {
        if (this.f4688D.mo35357k() == 0 && this.f4688D.mo35360h() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: J2 */
    int m35846J2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i2;
        if (m35736U() == 0 || i == 0) {
            return 0;
        }
        m35827c2();
        this.f4687C.f4711a = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        m35838R2(i2, abs, true, state);
        C1754c c1754c = this.f4687C;
        int m35825d2 = c1754c.f4717g + m35825d2(recycler, c1754c, state, false);
        if (m35825d2 < 0) {
            return 0;
        }
        if (abs > m35825d2) {
            i = i2 * m35825d2;
        }
        this.f4688D.mo35351r(-i);
        this.f4687C.f4721k = i;
        return i;
    }

    /* renamed from: K2 */
    public void m35845K2(int i, int i2) {
        this.f4694J = i;
        this.f4695K = i2;
        C1755d c1755d = this.f4697M;
        if (c1755d != null) {
            c1755d.m35789b();
        }
        m35769C1();
    }

    /* renamed from: L2 */
    public void m35844L2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo35513r(null);
        if (i != this.f4686B || this.f4688D == null) {
            AbstractC1806j m35368b = AbstractC1806j.m35368b(this, i);
            this.f4688D = m35368b;
            this.f4698N.f4702a = m35368b;
            this.f4686B = i;
            m35769C1();
        }
    }

    /* renamed from: M2 */
    public void m35843M2(boolean z) {
        mo35513r(null);
        if (z == this.f4690F) {
            return;
        }
        this.f4690F = z;
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: N */
    public View mo35749N(int i) {
        int m35736U = m35736U();
        if (m35736U == 0) {
            return null;
        }
        int m35705o0 = i - m35705o0(m35739T(0));
        if (m35705o0 >= 0 && m35705o0 < m35736U) {
            View m35739T = m35739T(m35705o0);
            if (m35705o0(m35739T) == i) {
                return m35739T;
            }
        }
        return super.mo35749N(i);
    }

    /* renamed from: N2 */
    public void mo35842N2(boolean z) {
        mo35513r(null);
        if (this.f4692H == z) {
            return;
        }
        this.f4692H = z;
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C1772i mo28537O() {
        return new RecyclerView.C1772i(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P1 */
    boolean mo35744P1() {
        if (m35717i0() != 1073741824 && m35685w0() != 1073741824 && m35683x0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo28531Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo28531Q0(recyclerView, recycler);
        if (this.f4696L) {
            m35691t1(recycler);
            recycler.m35648c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    public View mo35550R0(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        int m35829a2;
        View m35814o2;
        View m35809t2;
        m35847I2();
        if (m35736U() == 0 || (m35829a2 = m35829a2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m35827c2();
        m35838R2(m35829a2, (int) (this.f4688D.mo35354n() * 0.33333334f), false, state);
        C1754c c1754c = this.f4687C;
        c1754c.f4717g = Integer.MIN_VALUE;
        c1754c.f4711a = false;
        m35825d2(recycler, c1754c, state, true);
        if (m35829a2 == -1) {
            m35814o2 = m35813p2();
        } else {
            m35814o2 = m35814o2();
        }
        if (m35829a2 == -1) {
            m35809t2 = m35808u2();
        } else {
            m35809t2 = m35809t2();
        }
        if (m35809t2.hasFocusable()) {
            if (m35814o2 == null) {
                return null;
            }
            return m35809t2;
        }
        return m35814o2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo27232R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C1802g c1802g = new C1802g(recyclerView.getContext());
        c1802g.setTargetPosition(i);
        m35740S1(c1802g);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public void mo35548S0(AccessibilityEvent accessibilityEvent) {
        super.mo35548S0(accessibilityEvent);
        if (m35736U() > 0) {
            accessibilityEvent.setFromIndex(m35820i2());
            accessibilityEvent.setToIndex(m35817l2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35545U1() {
        return this.f4697M == null && this.f4689E == this.f4692H;
    }

    /* renamed from: V1 */
    public void mo27294V1(RecyclerView.State state, int[] iArr) {
        int i;
        int m35807v2 = m35807v2(state);
        if (this.f4687C.f4716f == -1) {
            i = 0;
        } else {
            i = m35807v2;
            m35807v2 = 0;
        }
        iArr[0] = m35807v2;
        iArr[1] = i;
    }

    /* renamed from: W1 */
    void mo35833W1(RecyclerView.State state, C1754c c1754c, RecyclerView.LayoutManager.InterfaceC1759c interfaceC1759c) {
        int i = c1754c.f4714d;
        if (i >= 0 && i < state.m35611b()) {
            interfaceC1759c.mo35677a(i, Math.max(0, c1754c.f4717g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.InterfaceC1763a
    /* renamed from: a */
    public PointF mo28517a(int i) {
        if (m35736U() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < m35705o0(m35739T(0))) {
            z = true;
        }
        if (z != this.f4691G) {
            i2 = -1;
        }
        if (this.f4686B == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* renamed from: a2 */
    public int m35829a2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f4686B == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f4686B == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f4686B == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f4686B == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f4686B != 1 && m35804y2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f4686B == 1 || !m35804y2()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: b2 */
    C1754c m35828b2() {
        return new C1754c();
    }

    /* renamed from: c2 */
    public void m35827c2() {
        if (this.f4687C == null) {
            this.f4687C = m35828b2();
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.InterfaceC1751e
    /* renamed from: d */
    public void mo35826d(View view, View view2, int i, int i2) {
        boolean z;
        mo35513r("Cannot drop a view during a scroll or layout calculation");
        m35827c2();
        m35847I2();
        int m35705o0 = m35705o0(view);
        int m35705o02 = m35705o0(view2);
        if (m35705o0 < m35705o02) {
            z = true;
        } else {
            z = true;
        }
        if (this.f4691G) {
            if (z) {
                m35845K2(m35705o02, this.f4688D.mo35359i() - (this.f4688D.mo35361g(view2) + this.f4688D.mo35363e(view)));
            } else {
                m35845K2(m35705o02, this.f4688D.mo35359i() - this.f4688D.mo35364d(view2));
            }
        } else if (z) {
            m35845K2(m35705o02, this.f4688D.mo35361g(view2));
        } else {
            m35845K2(m35705o02, this.f4688D.mo35364d(view2) - this.f4688D.mo35363e(view));
        }
    }

    /* renamed from: d2 */
    int m35825d2(RecyclerView.Recycler recycler, C1754c c1754c, RecyclerView.State state, boolean z) {
        int i = c1754c.f4713c;
        int i2 = c1754c.f4717g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c1754c.f4717g = i2 + i;
            }
            m35852D2(recycler, c1754c);
        }
        int i3 = c1754c.f4713c + c1754c.f4718h;
        C1753b c1753b = this.f4699O;
        while (true) {
            if ((!c1754c.f4723m && i3 <= 0) || !c1754c.m35794c(state)) {
                break;
            }
            c1753b.m35797a();
            mo35855A2(recycler, state, c1754c, c1753b);
            if (!c1753b.f4708b) {
                c1754c.f4712b += c1753b.f4707a * c1754c.f4716f;
                if (!c1753b.f4709c || c1754c.f4722l != null || !state.m35608e()) {
                    int i4 = c1754c.f4713c;
                    int i5 = c1753b.f4707a;
                    c1754c.f4713c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = c1754c.f4717g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + c1753b.f4707a;
                    c1754c.f4717g = i7;
                    int i8 = c1754c.f4713c;
                    if (i8 < 0) {
                        c1754c.f4717g = i7 + i8;
                    }
                    m35852D2(recycler, c1754c);
                }
                if (z && c1753b.f4710d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c1754c.f4713c;
    }

    /* renamed from: e2 */
    public int m35824e2() {
        View m35815n2 = m35815n2(0, m35736U(), true, false);
        if (m35815n2 == null) {
            return -1;
        }
        return m35705o0(m35815n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo28507f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int m35811r2;
        int i6;
        View mo35749N;
        int mo35361g;
        int i7;
        int i8 = -1;
        if ((this.f4697M != null || this.f4694J != -1) && state.m35611b() == 0) {
            m35691t1(recycler);
            return;
        }
        C1755d c1755d = this.f4697M;
        if (c1755d != null && c1755d.m35790a()) {
            this.f4694J = this.f4697M.f4724j;
        }
        m35827c2();
        this.f4687C.f4711a = false;
        m35847I2();
        View m35720g0 = m35720g0();
        C1752a c1752a = this.f4698N;
        if (c1752a.f4706e && this.f4694J == -1 && this.f4697M == null) {
            if (m35720g0 != null && (this.f4688D.mo35361g(m35720g0) >= this.f4688D.mo35359i() || this.f4688D.mo35364d(m35720g0) <= this.f4688D.mo35355m())) {
                this.f4698N.m35800c(m35720g0, m35705o0(m35720g0));
            }
        } else {
            c1752a.m35798e();
            C1752a c1752a2 = this.f4698N;
            c1752a2.f4705d = this.f4691G ^ this.f4692H;
            m35839Q2(recycler, state, c1752a2);
            this.f4698N.f4706e = true;
        }
        C1754c c1754c = this.f4687C;
        if (c1754c.f4721k >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        c1754c.f4716f = i;
        int[] iArr = this.f4701Q;
        iArr[0] = 0;
        iArr[1] = 0;
        mo27294V1(state, iArr);
        int max = Math.max(0, this.f4701Q[0]) + this.f4688D.mo35355m();
        int max2 = Math.max(0, this.f4701Q[1]) + this.f4688D.mo35358j();
        if (state.m35608e() && (i6 = this.f4694J) != -1 && this.f4695K != Integer.MIN_VALUE && (mo35749N = mo35749N(i6)) != null) {
            if (this.f4691G) {
                i7 = this.f4688D.mo35359i() - this.f4688D.mo35364d(mo35749N);
                mo35361g = this.f4695K;
            } else {
                mo35361g = this.f4688D.mo35361g(mo35749N) - this.f4688D.mo35355m();
                i7 = this.f4695K;
            }
            int i9 = i7 - mo35361g;
            if (i9 > 0) {
                max += i9;
            } else {
                max2 -= i9;
            }
        }
        C1752a c1752a3 = this.f4698N;
        if (!c1752a3.f4705d ? !this.f4691G : this.f4691G) {
            i8 = 1;
        }
        mo35853C2(recycler, state, c1752a3, i8);
        m35762H(recycler);
        this.f4687C.f4723m = m35848H2();
        this.f4687C.f4720j = state.m35608e();
        this.f4687C.f4719i = 0;
        C1752a c1752a4 = this.f4698N;
        if (c1752a4.f4705d) {
            m35834V2(c1752a4);
            C1754c c1754c2 = this.f4687C;
            c1754c2.f4718h = max;
            m35825d2(recycler, c1754c2, state, false);
            C1754c c1754c3 = this.f4687C;
            i3 = c1754c3.f4712b;
            int i10 = c1754c3.f4714d;
            int i11 = c1754c3.f4713c;
            if (i11 > 0) {
                max2 += i11;
            }
            m35836T2(this.f4698N);
            C1754c c1754c4 = this.f4687C;
            c1754c4.f4718h = max2;
            c1754c4.f4714d += c1754c4.f4715e;
            m35825d2(recycler, c1754c4, state, false);
            C1754c c1754c5 = this.f4687C;
            i2 = c1754c5.f4712b;
            int i12 = c1754c5.f4713c;
            if (i12 > 0) {
                m35835U2(i10, i3);
                C1754c c1754c6 = this.f4687C;
                c1754c6.f4718h = i12;
                m35825d2(recycler, c1754c6, state, false);
                i3 = this.f4687C.f4712b;
            }
        } else {
            m35836T2(c1752a4);
            C1754c c1754c7 = this.f4687C;
            c1754c7.f4718h = max2;
            m35825d2(recycler, c1754c7, state, false);
            C1754c c1754c8 = this.f4687C;
            i2 = c1754c8.f4712b;
            int i13 = c1754c8.f4714d;
            int i14 = c1754c8.f4713c;
            if (i14 > 0) {
                max += i14;
            }
            m35834V2(this.f4698N);
            C1754c c1754c9 = this.f4687C;
            c1754c9.f4718h = max;
            c1754c9.f4714d += c1754c9.f4715e;
            m35825d2(recycler, c1754c9, state, false);
            C1754c c1754c10 = this.f4687C;
            i3 = c1754c10.f4712b;
            int i15 = c1754c10.f4713c;
            if (i15 > 0) {
                m35837S2(i13, i2);
                C1754c c1754c11 = this.f4687C;
                c1754c11.f4718h = i15;
                m35825d2(recycler, c1754c11, state, false);
                i2 = this.f4687C.f4712b;
            }
        }
        if (m35736U() > 0) {
            if (this.f4691G ^ this.f4692H) {
                int m35811r22 = m35811r2(i2, recycler, state, true);
                i4 = i3 + m35811r22;
                i5 = i2 + m35811r22;
                m35811r2 = m35810s2(i4, recycler, state, false);
            } else {
                int m35810s2 = m35810s2(i3, recycler, state, true);
                i4 = i3 + m35810s2;
                i5 = i2 + m35810s2;
                m35811r2 = m35811r2(i5, recycler, state, false);
            }
            i3 = i4 + m35811r2;
            i2 = i5 + m35811r2;
        }
        m35854B2(recycler, state, i3, i2);
        if (!state.m35608e()) {
            this.f4688D.m35365s();
        } else {
            this.f4698N.m35798e();
        }
        this.f4689E = this.f4692H;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo28505g1(RecyclerView.State state) {
        super.mo28505g1(state);
        this.f4697M = null;
        this.f4694J = -1;
        this.f4695K = Integer.MIN_VALUE;
        this.f4698N.m35798e();
    }

    /* renamed from: g2 */
    public View m35822g2(boolean z, boolean z2) {
        if (this.f4691G) {
            return m35815n2(0, m35736U(), z, z2);
        }
        return m35815n2(m35736U() - 1, -1, z, z2);
    }

    /* renamed from: h2 */
    public View m35821h2(boolean z, boolean z2) {
        if (this.f4691G) {
            return m35815n2(m35736U() - 1, -1, z, z2);
        }
        return m35815n2(0, m35736U(), z, z2);
    }

    /* renamed from: i2 */
    public int m35820i2() {
        View m35815n2 = m35815n2(0, m35736U(), false, true);
        if (m35815n2 == null) {
            return -1;
        }
        return m35705o0(m35815n2);
    }

    /* renamed from: j2 */
    public int m35819j2() {
        View m35815n2 = m35815n2(m35736U() - 1, -1, true, false);
        if (m35815n2 == null) {
            return -1;
        }
        return m35705o0(m35815n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo28500k1(Parcelable parcelable) {
        if (parcelable instanceof C1755d) {
            C1755d c1755d = (C1755d) parcelable;
            this.f4697M = c1755d;
            if (this.f4694J != -1) {
                c1755d.m35789b();
            }
            m35769C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo28498l1() {
        if (this.f4697M != null) {
            return new C1755d(this.f4697M);
        }
        C1755d c1755d = new C1755d();
        if (m35736U() > 0) {
            m35827c2();
            boolean z = this.f4689E ^ this.f4691G;
            c1755d.f4726l = z;
            if (z) {
                View m35809t2 = m35809t2();
                c1755d.f4725k = this.f4688D.mo35359i() - this.f4688D.mo35364d(m35809t2);
                c1755d.f4724j = m35705o0(m35809t2);
            } else {
                View m35808u2 = m35808u2();
                c1755d.f4724j = m35705o0(m35808u2);
                c1755d.f4725k = this.f4688D.mo35361g(m35808u2) - this.f4688D.mo35355m();
            }
        } else {
            c1755d.m35789b();
        }
        return c1755d;
    }

    /* renamed from: l2 */
    public int m35817l2() {
        View m35815n2 = m35815n2(m35736U() - 1, -1, false, true);
        if (m35815n2 == null) {
            return -1;
        }
        return m35705o0(m35815n2);
    }

    /* renamed from: m2 */
    View m35816m2(int i, int i2) {
        char c;
        int i3;
        int i4;
        m35827c2();
        if (i2 > i) {
            c = 1;
        } else if (i2 < i) {
            c = 65535;
        } else {
            c = 0;
        }
        if (c == 0) {
            return m35739T(i);
        }
        if (this.f4688D.mo35361g(m35739T(i)) < this.f4688D.mo35355m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.f4686B == 0) {
            return this.f4740n.m35331a(i, i2, i3, i4);
        }
        return this.f4741o.m35331a(i, i2, i3, i4);
    }

    /* renamed from: n2 */
    View m35815n2(int i, int i2, boolean z, boolean z2) {
        int i3;
        m35827c2();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.f4686B == 0) {
            return this.f4740n.m35331a(i, i2, i3, i4);
        }
        return this.f4741o.m35331a(i, i2, i3, i4);
    }

    /* renamed from: q2 */
    View mo35812q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        m35827c2();
        int m35736U = m35736U();
        if (z2) {
            i2 = m35736U() - 1;
            i = -1;
            i3 = -1;
        } else {
            i = m35736U;
            i2 = 0;
            i3 = 1;
        }
        int m35611b = state.m35611b();
        int mo35355m = this.f4688D.mo35355m();
        int mo35359i = this.f4688D.mo35359i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i) {
            View m35739T = m35739T(i2);
            int m35705o0 = m35705o0(m35739T);
            int mo35361g = this.f4688D.mo35361g(m35739T);
            int mo35364d = this.f4688D.mo35364d(m35739T);
            if (m35705o0 >= 0 && m35705o0 < m35611b) {
                if (((RecyclerView.C1772i) m35739T.getLayoutParams()).m35577d()) {
                    if (view3 == null) {
                        view3 = m35739T;
                    }
                } else {
                    if (mo35364d <= mo35355m && mo35361g < mo35355m) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (mo35361g >= mo35359i && mo35364d > mo35359i) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z3 && !z4) {
                        return m35739T;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = m35739T;
                        }
                        view2 = m35739T;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = m35739T;
                        }
                        view2 = m35739T;
                    }
                }
            }
            i2 += i3;
        }
        if (view == null) {
            if (view2 != null) {
                return view2;
            }
            return view3;
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r */
    public void mo35513r(String str) {
        if (this.f4697M == null) {
            super.mo35513r(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo28487v() {
        return this.f4686B == 0;
    }

    @Deprecated
    /* renamed from: v2 */
    protected int m35807v2(RecyclerView.State state) {
        if (state.m35609d()) {
            return this.f4688D.mo35354n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo28485w() {
        return this.f4686B == 1;
    }

    /* renamed from: w2 */
    public int m35806w2() {
        return this.f4686B;
    }

    /* renamed from: x2 */
    public boolean m35805x2() {
        return this.f4690F;
    }

    /* renamed from: y2 */
    public boolean m35804y2() {
        return m35713k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z */
    public void mo35504z(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.InterfaceC1759c interfaceC1759c) {
        int i3;
        if (this.f4686B != 0) {
            i = i2;
        }
        if (m35736U() != 0 && i != 0) {
            m35827c2();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            m35838R2(i3, Math.abs(i), true, state);
            mo35833W1(state, this.f4687C, interfaceC1759c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo28480z0() {
        return true;
    }

    /* renamed from: z2 */
    public boolean m35803z2() {
        return this.f4693I;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f4686B = 1;
        this.f4690F = false;
        this.f4691G = false;
        this.f4692H = false;
        this.f4693I = true;
        this.f4694J = -1;
        this.f4695K = Integer.MIN_VALUE;
        this.f4697M = null;
        this.f4698N = new C1752a();
        this.f4699O = new C1753b();
        this.f4700P = 2;
        this.f4701Q = new int[2];
        m35844L2(i);
        m35843M2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4686B = 1;
        this.f4690F = false;
        this.f4691G = false;
        this.f4692H = false;
        this.f4693I = true;
        this.f4694J = -1;
        this.f4695K = Integer.MIN_VALUE;
        this.f4697M = null;
        this.f4698N = new C1752a();
        this.f4699O = new C1753b();
        this.f4700P = 2;
        this.f4701Q = new int[2];
        RecyclerView.LayoutManager.C1760d m35702p0 = RecyclerView.LayoutManager.m35702p0(context, attributeSet, i, i2);
        m35844L2(m35702p0.f4755a);
        m35843M2(m35702p0.f4757c);
        mo35842N2(m35702p0.f4758d);
    }
}