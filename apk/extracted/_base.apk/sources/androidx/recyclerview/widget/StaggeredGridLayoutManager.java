package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.InterfaceC1763a {

    /* renamed from: C */
    C1782f[] f4823C;

    /* renamed from: D */
    AbstractC1806j f4824D;

    /* renamed from: E */
    AbstractC1806j f4825E;

    /* renamed from: F */
    private int f4826F;

    /* renamed from: G */
    private int f4827G;

    /* renamed from: H */
    private final C1801f f4828H;

    /* renamed from: K */
    private BitSet f4831K;

    /* renamed from: P */
    private boolean f4836P;

    /* renamed from: Q */
    private boolean f4837Q;

    /* renamed from: R */
    private C1780e f4838R;

    /* renamed from: S */
    private int f4839S;

    /* renamed from: X */
    private int[] f4844X;

    /* renamed from: B */
    private int f4822B = -1;

    /* renamed from: I */
    boolean f4829I = false;

    /* renamed from: J */
    boolean f4830J = false;

    /* renamed from: L */
    int f4832L = -1;

    /* renamed from: M */
    int f4833M = Integer.MIN_VALUE;

    /* renamed from: N */
    C1777d f4834N = new C1777d();

    /* renamed from: O */
    private int f4835O = 2;

    /* renamed from: T */
    private final Rect f4840T = new Rect();

    /* renamed from: U */
    private final C1775b f4841U = new C1775b();

    /* renamed from: V */
    private boolean f4842V = false;

    /* renamed from: W */
    private boolean f4843W = true;

    /* renamed from: Y */
    private final Runnable f4845Y = new RunnableC1774a();

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1774a implements Runnable {
        RunnableC1774a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m35530b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1775b {

        /* renamed from: a */
        int f4847a;

        /* renamed from: b */
        int f4848b;

        /* renamed from: c */
        boolean f4849c;

        /* renamed from: d */
        boolean f4850d;

        /* renamed from: e */
        boolean f4851e;

        /* renamed from: f */
        int[] f4852f;

        C1775b() {
            m35500c();
        }

        /* renamed from: a */
        void m35502a() {
            int mo35355m;
            if (this.f4849c) {
                mo35355m = StaggeredGridLayoutManager.this.f4824D.mo35359i();
            } else {
                mo35355m = StaggeredGridLayoutManager.this.f4824D.mo35355m();
            }
            this.f4848b = mo35355m;
        }

        /* renamed from: b */
        void m35501b(int i) {
            if (this.f4849c) {
                this.f4848b = StaggeredGridLayoutManager.this.f4824D.mo35359i() - i;
            } else {
                this.f4848b = StaggeredGridLayoutManager.this.f4824D.mo35355m() + i;
            }
        }

        /* renamed from: c */
        void m35500c() {
            this.f4847a = -1;
            this.f4848b = Integer.MIN_VALUE;
            this.f4849c = false;
            this.f4850d = false;
            this.f4851e = false;
            int[] iArr = this.f4852f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* renamed from: d */
        void m35499d(C1782f[] c1782fArr) {
            int length = c1782fArr.length;
            int[] iArr = this.f4852f;
            if (iArr == null || iArr.length < length) {
                this.f4852f = new int[StaggeredGridLayoutManager.this.f4823C.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4852f[i] = c1782fArr[i].m35460p(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1776c extends RecyclerView.C1772i {

        /* renamed from: n */
        C1782f f4854n;

        /* renamed from: o */
        boolean f4855o;

        public C1776c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: h */
        public boolean m35498h() {
            return this.f4855o;
        }

        public C1776c(int i, int i2) {
            super(i, i2);
        }

        public C1776c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1776c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1780e implements Parcelable {
        public static final Parcelable.Creator<C1780e> CREATOR = new C1781a();

        /* renamed from: j */
        int f4862j;

        /* renamed from: k */
        int f4863k;

        /* renamed from: l */
        int f4864l;

        /* renamed from: m */
        int[] f4865m;

        /* renamed from: n */
        int f4866n;

        /* renamed from: o */
        int[] f4867o;

        /* renamed from: p */
        List<C1777d.C1778a> f4868p;

        /* renamed from: q */
        boolean f4869q;

        /* renamed from: r */
        boolean f4870r;

        /* renamed from: s */
        boolean f4871s;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1781a implements Parcelable.Creator<C1780e> {
            C1781a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1780e createFromParcel(Parcel parcel) {
                return new C1780e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1780e[] newArray(int i) {
                return new C1780e[i];
            }
        }

        public C1780e() {
        }

        /* renamed from: a */
        void m35479a() {
            this.f4865m = null;
            this.f4864l = 0;
            this.f4862j = -1;
            this.f4863k = -1;
        }

        /* renamed from: b */
        void m35478b() {
            this.f4865m = null;
            this.f4864l = 0;
            this.f4866n = 0;
            this.f4867o = null;
            this.f4868p = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4862j);
            parcel.writeInt(this.f4863k);
            parcel.writeInt(this.f4864l);
            if (this.f4864l > 0) {
                parcel.writeIntArray(this.f4865m);
            }
            parcel.writeInt(this.f4866n);
            if (this.f4866n > 0) {
                parcel.writeIntArray(this.f4867o);
            }
            parcel.writeInt(this.f4869q ? 1 : 0);
            parcel.writeInt(this.f4870r ? 1 : 0);
            parcel.writeInt(this.f4871s ? 1 : 0);
            parcel.writeList(this.f4868p);
        }

        C1780e(Parcel parcel) {
            this.f4862j = parcel.readInt();
            this.f4863k = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4864l = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4865m = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4866n = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4867o = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4869q = parcel.readInt() == 1;
            this.f4870r = parcel.readInt() == 1;
            this.f4871s = parcel.readInt() == 1;
            this.f4868p = parcel.readArrayList(C1777d.C1778a.class.getClassLoader());
        }

        public C1780e(C1780e c1780e) {
            this.f4864l = c1780e.f4864l;
            this.f4862j = c1780e.f4862j;
            this.f4863k = c1780e.f4863k;
            this.f4865m = c1780e.f4865m;
            this.f4866n = c1780e.f4866n;
            this.f4867o = c1780e.f4867o;
            this.f4869q = c1780e.f4869q;
            this.f4870r = c1780e.f4870r;
            this.f4871s = c1780e.f4871s;
            this.f4868p = c1780e.f4868p;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1782f {

        /* renamed from: a */
        ArrayList<View> f4872a = new ArrayList<>();

        /* renamed from: b */
        int f4873b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4874c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4875d = 0;

        /* renamed from: e */
        final int f4876e;

        C1782f(int i) {
            this.f4876e = i;
        }

        /* renamed from: a */
        void m35475a(View view) {
            C1776c m35462n = m35462n(view);
            m35462n.f4854n = this;
            this.f4872a.add(view);
            this.f4874c = Integer.MIN_VALUE;
            if (this.f4872a.size() == 1) {
                this.f4873b = Integer.MIN_VALUE;
            }
            if (m35462n.m35577d() || m35462n.m35578b()) {
                this.f4875d += StaggeredGridLayoutManager.this.f4824D.mo35363e(view);
            }
        }

        /* renamed from: b */
        void m35474b(boolean z, int i) {
            int m35460p;
            if (z) {
                m35460p = m35464l(Integer.MIN_VALUE);
            } else {
                m35460p = m35460p(Integer.MIN_VALUE);
            }
            m35471e();
            if (m35460p == Integer.MIN_VALUE) {
                return;
            }
            if (!z || m35460p >= StaggeredGridLayoutManager.this.f4824D.mo35359i()) {
                if (!z && m35460p > StaggeredGridLayoutManager.this.f4824D.mo35355m()) {
                    return;
                }
                if (i != Integer.MIN_VALUE) {
                    m35460p += i;
                }
                this.f4874c = m35460p;
                this.f4873b = m35460p;
            }
        }

        /* renamed from: c */
        void m35473c() {
            C1777d.C1778a m35492f;
            ArrayList<View> arrayList = this.f4872a;
            View view = arrayList.get(arrayList.size() - 1);
            C1776c m35462n = m35462n(view);
            this.f4874c = StaggeredGridLayoutManager.this.f4824D.mo35364d(view);
            if (m35462n.f4855o && (m35492f = StaggeredGridLayoutManager.this.f4834N.m35492f(m35462n.m35579a())) != null && m35492f.f4859k == 1) {
                this.f4874c += m35492f.m35482a(this.f4876e);
            }
        }

        /* renamed from: d */
        void m35472d() {
            C1777d.C1778a m35492f;
            View view = this.f4872a.get(0);
            C1776c m35462n = m35462n(view);
            this.f4873b = StaggeredGridLayoutManager.this.f4824D.mo35361g(view);
            if (m35462n.f4855o && (m35492f = StaggeredGridLayoutManager.this.f4834N.m35492f(m35462n.m35579a())) != null && m35492f.f4859k == -1) {
                this.f4873b -= m35492f.m35482a(this.f4876e);
            }
        }

        /* renamed from: e */
        void m35471e() {
            this.f4872a.clear();
            m35459q();
            this.f4875d = 0;
        }

        /* renamed from: f */
        public int m35470f() {
            if (StaggeredGridLayoutManager.this.f4829I) {
                return m35467i(this.f4872a.size() - 1, -1, true);
            }
            return m35467i(0, this.f4872a.size(), true);
        }

        /* renamed from: g */
        public int m35469g() {
            if (StaggeredGridLayoutManager.this.f4829I) {
                return m35467i(0, this.f4872a.size(), true);
            }
            return m35467i(this.f4872a.size() - 1, -1, true);
        }

        /* renamed from: h */
        int m35468h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int i3;
            boolean z4;
            int mo35355m = StaggeredGridLayoutManager.this.f4824D.mo35355m();
            int mo35359i = StaggeredGridLayoutManager.this.f4824D.mo35359i();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f4872a.get(i);
                int mo35361g = StaggeredGridLayoutManager.this.f4824D.mo35361g(view);
                int mo35364d = StaggeredGridLayoutManager.this.f4824D.mo35364d(view);
                boolean z5 = false;
                if (!z3 ? mo35361g < mo35359i : mo35361g <= mo35359i) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z3 ? mo35364d > mo35355m : mo35364d >= mo35355m) {
                    z5 = true;
                }
                if (z4 && z5) {
                    if (z && z2) {
                        if (mo35361g >= mo35355m && mo35364d <= mo35359i) {
                            return StaggeredGridLayoutManager.this.m35705o0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.m35705o0(view);
                    } else {
                        if (mo35361g < mo35355m || mo35364d > mo35359i) {
                            return StaggeredGridLayoutManager.this.m35705o0(view);
                        }
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: i */
        int m35467i(int i, int i2, boolean z) {
            return m35468h(i, i2, false, false, z);
        }

        /* renamed from: j */
        public int m35466j() {
            return this.f4875d;
        }

        /* renamed from: k */
        int m35465k() {
            int i = this.f4874c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m35473c();
            return this.f4874c;
        }

        /* renamed from: l */
        int m35464l(int i) {
            int i2 = this.f4874c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4872a.size() == 0) {
                return i;
            }
            m35473c();
            return this.f4874c;
        }

        /* renamed from: m */
        public View m35463m(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.f4872a.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.f4872a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4829I && staggeredGridLayoutManager.m35705o0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4829I && staggeredGridLayoutManager2.m35705o0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.f4872a.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.f4872a.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4829I && staggeredGridLayoutManager3.m35705o0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4829I && staggeredGridLayoutManager4.m35705o0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: n */
        C1776c m35462n(View view) {
            return (C1776c) view.getLayoutParams();
        }

        /* renamed from: o */
        int m35461o() {
            int i = this.f4873b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            m35472d();
            return this.f4873b;
        }

        /* renamed from: p */
        int m35460p(int i) {
            int i2 = this.f4873b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4872a.size() == 0) {
                return i;
            }
            m35472d();
            return this.f4873b;
        }

        /* renamed from: q */
        void m35459q() {
            this.f4873b = Integer.MIN_VALUE;
            this.f4874c = Integer.MIN_VALUE;
        }

        /* renamed from: r */
        void m35458r(int i) {
            int i2 = this.f4873b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4873b = i2 + i;
            }
            int i3 = this.f4874c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4874c = i3 + i;
            }
        }

        /* renamed from: s */
        void m35457s() {
            int size = this.f4872a.size();
            View remove = this.f4872a.remove(size - 1);
            C1776c m35462n = m35462n(remove);
            m35462n.f4854n = null;
            if (m35462n.m35577d() || m35462n.m35578b()) {
                this.f4875d -= StaggeredGridLayoutManager.this.f4824D.mo35363e(remove);
            }
            if (size == 1) {
                this.f4873b = Integer.MIN_VALUE;
            }
            this.f4874c = Integer.MIN_VALUE;
        }

        /* renamed from: t */
        void m35456t() {
            View remove = this.f4872a.remove(0);
            C1776c m35462n = m35462n(remove);
            m35462n.f4854n = null;
            if (this.f4872a.size() == 0) {
                this.f4874c = Integer.MIN_VALUE;
            }
            if (m35462n.m35577d() || m35462n.m35578b()) {
                this.f4875d -= StaggeredGridLayoutManager.this.f4824D.mo35363e(remove);
            }
            this.f4873b = Integer.MIN_VALUE;
        }

        /* renamed from: u */
        void m35455u(View view) {
            C1776c m35462n = m35462n(view);
            m35462n.f4854n = this;
            this.f4872a.add(0, view);
            this.f4873b = Integer.MIN_VALUE;
            if (this.f4872a.size() == 1) {
                this.f4874c = Integer.MIN_VALUE;
            }
            if (m35462n.m35577d() || m35462n.m35578b()) {
                this.f4875d += StaggeredGridLayoutManager.this.f4824D.mo35363e(view);
            }
        }

        /* renamed from: v */
        void m35454v(int i) {
            this.f4873b = i;
            this.f4874c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.LayoutManager.C1760d m35702p0 = RecyclerView.LayoutManager.m35702p0(context, attributeSet, i, i2);
        m35551Q2(m35702p0.f4755a);
        m35547S2(m35702p0.f4756b);
        m35549R2(m35702p0.f4757c);
        this.f4828H = new C1801f();
        m35522j2();
    }

    /* renamed from: D2 */
    private void m35568D2(View view, int i, int i2, boolean z) {
        boolean m35746O1;
        m35690u(view, this.f4840T);
        C1776c c1776c = (C1776c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c1776c).leftMargin;
        Rect rect = this.f4840T;
        int m35531a3 = m35531a3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) c1776c).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c1776c).topMargin;
        Rect rect2 = this.f4840T;
        int m35531a32 = m35531a3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) c1776c).bottomMargin + rect2.bottom);
        if (z) {
            m35746O1 = m35743Q1(view, m35531a3, m35531a32, c1776c);
        } else {
            m35746O1 = m35746O1(view, m35531a3, m35531a32, c1776c);
        }
        if (m35746O1) {
            view.measure(m35531a3, m35531a32);
        }
    }

    /* renamed from: E2 */
    private void m35567E2(View view, C1776c c1776c, boolean z) {
        if (c1776c.f4855o) {
            if (this.f4826F == 1) {
                m35568D2(view, this.f4839S, RecyclerView.LayoutManager.m35734V(m35719h0(), m35717i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c1776c).height, true), z);
            } else {
                m35568D2(view, RecyclerView.LayoutManager.m35734V(m35687v0(), m35685w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c1776c).width, true), this.f4839S, z);
            }
        } else if (this.f4826F == 1) {
            m35568D2(view, RecyclerView.LayoutManager.m35734V(this.f4827G, m35685w0(), 0, ((ViewGroup.MarginLayoutParams) c1776c).width, false), RecyclerView.LayoutManager.m35734V(m35719h0(), m35717i0(), getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) c1776c).height, true), z);
        } else {
            m35568D2(view, RecyclerView.LayoutManager.m35734V(m35687v0(), m35685w0(), getPaddingLeft() + getPaddingRight(), ((ViewGroup.MarginLayoutParams) c1776c).width, true), RecyclerView.LayoutManager.m35734V(this.f4827G, m35717i0(), 0, ((ViewGroup.MarginLayoutParams) c1776c).height, false), z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (m35530b2() != false) goto L83;
     */
    /* renamed from: F2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35566F2(androidx.recyclerview.widget.RecyclerView.Recycler r9, androidx.recyclerview.widget.RecyclerView.State r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35566F2(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    /* renamed from: G2 */
    private boolean m35565G2(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4826F == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f4830J) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f4830J) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == m35569C2()) {
            return true;
        }
        return false;
    }

    /* renamed from: I2 */
    private void m35563I2(View view) {
        for (int i = this.f4822B - 1; i >= 0; i--) {
            this.f4823C[i].m35455u(view);
        }
    }

    /* renamed from: J2 */
    private void m35562J2(RecyclerView.Recycler recycler, C1801f c1801f) {
        int min;
        int min2;
        if (c1801f.f4952a && !c1801f.f4960i) {
            if (c1801f.f4953b == 0) {
                if (c1801f.f4956e == -1) {
                    m35560K2(recycler, c1801f.f4958g);
                } else {
                    m35557L2(recycler, c1801f.f4957f);
                }
            } else if (c1801f.f4956e == -1) {
                int i = c1801f.f4957f;
                int m35508v2 = i - m35508v2(i);
                if (m35508v2 < 0) {
                    min2 = c1801f.f4958g;
                } else {
                    min2 = c1801f.f4958g - Math.min(m35508v2, c1801f.f4953b);
                }
                m35560K2(recycler, min2);
            } else {
                int m35507w2 = m35507w2(c1801f.f4958g) - c1801f.f4958g;
                if (m35507w2 < 0) {
                    min = c1801f.f4957f;
                } else {
                    min = Math.min(m35507w2, c1801f.f4953b) + c1801f.f4957f;
                }
                m35557L2(recycler, min);
            }
        }
    }

    /* renamed from: K2 */
    private void m35560K2(RecyclerView.Recycler recycler, int i) {
        for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
            View m35739T = m35739T(m35736U);
            if (this.f4824D.mo35361g(m35739T) >= i && this.f4824D.mo35352q(m35739T) >= i) {
                C1776c c1776c = (C1776c) m35739T.getLayoutParams();
                if (c1776c.f4855o) {
                    for (int i2 = 0; i2 < this.f4822B; i2++) {
                        if (this.f4823C[i2].f4872a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4822B; i3++) {
                        this.f4823C[i3].m35457s();
                    }
                } else if (c1776c.f4854n.f4872a.size() == 1) {
                    return;
                } else {
                    c1776c.f4854n.m35457s();
                }
                m35686v1(m35739T, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: L2 */
    private void m35557L2(RecyclerView.Recycler recycler, int i) {
        while (m35736U() > 0) {
            View m35739T = m35739T(0);
            if (this.f4824D.mo35364d(m35739T) <= i && this.f4824D.mo35353p(m35739T) <= i) {
                C1776c c1776c = (C1776c) m35739T.getLayoutParams();
                if (c1776c.f4855o) {
                    for (int i2 = 0; i2 < this.f4822B; i2++) {
                        if (this.f4823C[i2].f4872a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f4822B; i3++) {
                        this.f4823C[i3].m35456t();
                    }
                } else if (c1776c.f4854n.f4872a.size() == 1) {
                    return;
                } else {
                    c1776c.f4854n.m35456t();
                }
                m35686v1(m35739T, recycler);
            } else {
                return;
            }
        }
    }

    /* renamed from: M2 */
    private void m35556M2() {
        if (this.f4825E.mo35357k() == 1073741824) {
            return;
        }
        int m35736U = m35736U();
        float f = 0.0f;
        for (int i = 0; i < m35736U; i++) {
            View m35739T = m35739T(i);
            float mo35363e = this.f4825E.mo35363e(m35739T);
            if (mo35363e >= f) {
                if (((C1776c) m35739T.getLayoutParams()).m35498h()) {
                    mo35363e = (mo35363e * 1.0f) / this.f4822B;
                }
                f = Math.max(f, mo35363e);
            }
        }
        int i2 = this.f4827G;
        int round = Math.round(f * this.f4822B);
        if (this.f4825E.mo35357k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4825E.mo35354n());
        }
        m35536Y2(round);
        if (this.f4827G == i2) {
            return;
        }
        for (int i3 = 0; i3 < m35736U; i3++) {
            View m35739T2 = m35739T(i3);
            C1776c c1776c = (C1776c) m35739T2.getLayoutParams();
            if (!c1776c.f4855o) {
                if (m35569C2() && this.f4826F == 1) {
                    int i4 = this.f4822B;
                    int i5 = c1776c.f4854n.f4876e;
                    m35739T2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.f4827G) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = c1776c.f4854n.f4876e;
                    int i7 = this.f4827G * i6;
                    int i8 = i6 * i2;
                    if (this.f4826F == 1) {
                        m35739T2.offsetLeftAndRight(i7 - i8);
                    } else {
                        m35739T2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    /* renamed from: N2 */
    private void m35555N2() {
        if (this.f4826F != 1 && m35569C2()) {
            this.f4830J = !this.f4829I;
        } else {
            this.f4830J = this.f4829I;
        }
    }

    /* renamed from: P2 */
    private void m35553P2(int i) {
        boolean z;
        C1801f c1801f = this.f4828H;
        c1801f.f4956e = i;
        boolean z2 = this.f4830J;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        c1801f.f4955d = i2;
    }

    /* renamed from: T2 */
    private void m35546T2(int i, int i2) {
        for (int i3 = 0; i3 < this.f4822B; i3++) {
            if (!this.f4823C[i3].f4872a.isEmpty()) {
                m35534Z2(this.f4823C[i3], i, i2);
            }
        }
    }

    /* renamed from: U2 */
    private boolean m35544U2(RecyclerView.State state, C1775b c1775b) {
        int m35520l2;
        if (this.f4836P) {
            m35520l2 = m35515p2(state.m35611b());
        } else {
            m35520l2 = m35520l2(state.m35611b());
        }
        c1775b.f4847a = m35520l2;
        c1775b.f4848b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: V1 */
    private void m35543V1(View view) {
        for (int i = this.f4822B - 1; i >= 0; i--) {
            this.f4823C[i].m35475a(view);
        }
    }

    /* renamed from: W1 */
    private void m35541W1(C1775b c1775b) {
        int mo35355m;
        C1780e c1780e = this.f4838R;
        int i = c1780e.f4864l;
        if (i > 0) {
            if (i == this.f4822B) {
                for (int i2 = 0; i2 < this.f4822B; i2++) {
                    this.f4823C[i2].m35471e();
                    C1780e c1780e2 = this.f4838R;
                    int i3 = c1780e2.f4865m[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (c1780e2.f4870r) {
                            mo35355m = this.f4824D.mo35359i();
                        } else {
                            mo35355m = this.f4824D.mo35355m();
                        }
                        i3 += mo35355m;
                    }
                    this.f4823C[i2].m35454v(i3);
                }
            } else {
                c1780e.m35478b();
                C1780e c1780e3 = this.f4838R;
                c1780e3.f4862j = c1780e3.f4863k;
            }
        }
        C1780e c1780e4 = this.f4838R;
        this.f4837Q = c1780e4.f4871s;
        m35549R2(c1780e4.f4869q);
        m35555N2();
        C1780e c1780e5 = this.f4838R;
        int i4 = c1780e5.f4862j;
        if (i4 != -1) {
            this.f4832L = i4;
            c1775b.f4849c = c1780e5.f4870r;
        } else {
            c1775b.f4849c = this.f4830J;
        }
        if (c1780e5.f4866n > 1) {
            C1777d c1777d = this.f4834N;
            c1777d.f4856a = c1780e5.f4867o;
            c1777d.f4857b = c1780e5.f4868p;
        }
    }

    /* renamed from: X2 */
    private void m35538X2(int i, RecyclerView.State state) {
        int i2;
        int i3;
        int m35610c;
        boolean z;
        C1801f c1801f = this.f4828H;
        boolean z2 = false;
        c1801f.f4953b = 0;
        c1801f.f4954c = i;
        if (m35764F0() && (m35610c = state.m35610c()) != -1) {
            boolean z3 = this.f4830J;
            if (m35610c < i) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                i2 = this.f4824D.mo35354n();
                i3 = 0;
            } else {
                i3 = this.f4824D.mo35354n();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        if (m35731X()) {
            this.f4828H.f4957f = this.f4824D.mo35355m() - i3;
            this.f4828H.f4958g = this.f4824D.mo35359i() + i2;
        } else {
            this.f4828H.f4958g = this.f4824D.mo35360h() + i2;
            this.f4828H.f4957f = -i3;
        }
        C1801f c1801f2 = this.f4828H;
        c1801f2.f4959h = false;
        c1801f2.f4952a = true;
        if (this.f4824D.mo35357k() == 0 && this.f4824D.mo35360h() == 0) {
            z2 = true;
        }
        c1801f2.f4960i = z2;
    }

    /* renamed from: Z1 */
    private void m35535Z1(View view, C1776c c1776c, C1801f c1801f) {
        if (c1801f.f4956e == 1) {
            if (c1776c.f4855o) {
                m35543V1(view);
            } else {
                c1776c.f4854n.m35475a(view);
            }
        } else if (c1776c.f4855o) {
            m35563I2(view);
        } else {
            c1776c.f4854n.m35455u(view);
        }
    }

    /* renamed from: Z2 */
    private void m35534Z2(C1782f c1782f, int i, int i2) {
        int m35466j = c1782f.m35466j();
        if (i == -1) {
            if (c1782f.m35461o() + m35466j <= i2) {
                this.f4831K.set(c1782f.f4876e, false);
            }
        } else if (c1782f.m35465k() - m35466j >= i2) {
            this.f4831K.set(c1782f.f4876e, false);
        }
    }

    /* renamed from: a2 */
    private int m35532a2(int i) {
        boolean z;
        if (m35736U() == 0) {
            if (!this.f4830J) {
                return -1;
            }
            return 1;
        }
        if (i < m35511s2()) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.f4830J) {
            return -1;
        }
        return 1;
    }

    /* renamed from: a3 */
    private int m35531a3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return i;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
    }

    /* renamed from: c2 */
    private boolean m35529c2(C1782f c1782f) {
        if (this.f4830J) {
            if (c1782f.m35465k() < this.f4824D.mo35359i()) {
                ArrayList<View> arrayList = c1782f.f4872a;
                return !c1782f.m35462n(arrayList.get(arrayList.size() - 1)).f4855o;
            }
        } else if (c1782f.m35461o() > this.f4824D.mo35355m()) {
            return !c1782f.m35462n(c1782f.f4872a.get(0)).f4855o;
        }
        return false;
    }

    /* renamed from: d2 */
    private int m35528d2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        return C1811l.m35343a(state, this.f4824D, m35517n2(!this.f4843W), m35518m2(!this.f4843W), this, this.f4843W);
    }

    /* renamed from: e2 */
    private int m35527e2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        return C1811l.m35342b(state, this.f4824D, m35517n2(!this.f4843W), m35518m2(!this.f4843W), this, this.f4843W, this.f4830J);
    }

    /* renamed from: f2 */
    private int m35526f2(RecyclerView.State state) {
        if (m35736U() == 0) {
            return 0;
        }
        return C1811l.m35341c(state, this.f4824D, m35517n2(!this.f4843W), m35518m2(!this.f4843W), this, this.f4843W);
    }

    /* renamed from: g2 */
    private int m35525g2(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.f4826F == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        } else if (this.f4826F == 0) {
                            return 1;
                        } else {
                            return Integer.MIN_VALUE;
                        }
                    } else if (this.f4826F == 1) {
                        return -1;
                    } else {
                        return Integer.MIN_VALUE;
                    }
                } else if (this.f4826F == 0) {
                    return -1;
                } else {
                    return Integer.MIN_VALUE;
                }
            } else if (this.f4826F != 1 && m35569C2()) {
                return -1;
            } else {
                return 1;
            }
        } else if (this.f4826F == 1 || !m35569C2()) {
            return -1;
        } else {
            return 1;
        }
    }

    /* renamed from: h2 */
    private C1777d.C1778a m35524h2(int i) {
        C1777d.C1778a c1778a = new C1777d.C1778a();
        c1778a.f4860l = new int[this.f4822B];
        for (int i2 = 0; i2 < this.f4822B; i2++) {
            c1778a.f4860l[i2] = i - this.f4823C[i2].m35464l(i);
        }
        return c1778a;
    }

    /* renamed from: i2 */
    private C1777d.C1778a m35523i2(int i) {
        C1777d.C1778a c1778a = new C1777d.C1778a();
        c1778a.f4860l = new int[this.f4822B];
        for (int i2 = 0; i2 < this.f4822B; i2++) {
            c1778a.f4860l[i2] = this.f4823C[i2].m35460p(i) - i;
        }
        return c1778a;
    }

    /* renamed from: j2 */
    private void m35522j2() {
        this.f4824D = AbstractC1806j.m35368b(this, this.f4826F);
        this.f4825E = AbstractC1806j.m35368b(this, 1 - this.f4826F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: k2 */
    private int m35521k2(RecyclerView.Recycler recycler, C1801f c1801f, RecyclerView.State state) {
        int i;
        int mo35355m;
        int m35509u2;
        boolean z;
        C1782f c1782f;
        int m35460p;
        int mo35363e;
        int i2;
        int mo35355m2;
        int i3;
        int mo35363e2;
        boolean z2;
        int mo35359i;
        boolean m35537Y1;
        int m35464l;
        ?? r9 = 0;
        this.f4831K.set(0, this.f4822B, true);
        if (this.f4828H.f4960i) {
            if (c1801f.f4956e == 1) {
                i = ViewDefaults.NUMBER_OF_LINES;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (c1801f.f4956e == 1) {
            i = c1801f.f4958g + c1801f.f4953b;
        } else {
            i = c1801f.f4957f - c1801f.f4953b;
        }
        int i4 = i;
        m35546T2(c1801f.f4956e, i4);
        if (this.f4830J) {
            mo35355m = this.f4824D.mo35359i();
        } else {
            mo35355m = this.f4824D.mo35355m();
        }
        int i5 = mo35355m;
        boolean z3 = false;
        while (c1801f.m35383a(state) && (this.f4828H.f4960i || !this.f4831K.isEmpty())) {
            View m35382b = c1801f.m35382b(recycler);
            C1776c c1776c = (C1776c) m35382b.getLayoutParams();
            int m35579a = c1776c.m35579a();
            int m35491g = this.f4834N.m35491g(m35579a);
            if (m35491g == -1) {
                z = true;
            } else {
                z = r9;
            }
            if (z) {
                if (c1776c.f4855o) {
                    c1782f = this.f4823C[r9];
                } else {
                    c1782f = m35505y2(c1801f);
                }
                this.f4834N.m35484n(m35579a, c1782f);
            } else {
                c1782f = this.f4823C[m35491g];
            }
            C1782f c1782f2 = c1782f;
            c1776c.f4854n = c1782f2;
            if (c1801f.f4956e == 1) {
                m35706o(m35382b);
            } else {
                m35703p(m35382b, r9);
            }
            m35567E2(m35382b, c1776c, r9);
            if (c1801f.f4956e == 1) {
                if (c1776c.f4855o) {
                    m35464l = m35509u2(i5);
                } else {
                    m35464l = c1782f2.m35464l(i5);
                }
                int mo35363e3 = this.f4824D.mo35363e(m35382b) + m35464l;
                if (z && c1776c.f4855o) {
                    C1777d.C1778a m35524h2 = m35524h2(m35464l);
                    m35524h2.f4859k = -1;
                    m35524h2.f4858j = m35579a;
                    this.f4834N.m35497a(m35524h2);
                }
                i2 = mo35363e3;
                mo35363e = m35464l;
            } else {
                if (c1776c.f4855o) {
                    m35460p = m35506x2(i5);
                } else {
                    m35460p = c1782f2.m35460p(i5);
                }
                mo35363e = m35460p - this.f4824D.mo35363e(m35382b);
                if (z && c1776c.f4855o) {
                    C1777d.C1778a m35523i2 = m35523i2(m35460p);
                    m35523i2.f4859k = 1;
                    m35523i2.f4858j = m35579a;
                    this.f4834N.m35497a(m35523i2);
                }
                i2 = m35460p;
            }
            if (c1776c.f4855o && c1801f.f4955d == -1) {
                if (z) {
                    this.f4842V = true;
                } else {
                    if (c1801f.f4956e == 1) {
                        m35537Y1 = m35539X1();
                    } else {
                        m35537Y1 = m35537Y1();
                    }
                    if (!m35537Y1) {
                        C1777d.C1778a m35492f = this.f4834N.m35492f(m35579a);
                        if (m35492f != null) {
                            m35492f.f4861m = true;
                        }
                        this.f4842V = true;
                    }
                }
            }
            m35535Z1(m35382b, c1776c, c1801f);
            if (m35569C2() && this.f4826F == 1) {
                if (c1776c.f4855o) {
                    mo35359i = this.f4825E.mo35359i();
                } else {
                    mo35359i = this.f4825E.mo35359i() - (((this.f4822B - 1) - c1782f2.f4876e) * this.f4827G);
                }
                mo35363e2 = mo35359i;
                i3 = mo35359i - this.f4825E.mo35363e(m35382b);
            } else {
                if (c1776c.f4855o) {
                    mo35355m2 = this.f4825E.mo35355m();
                } else {
                    mo35355m2 = (c1782f2.f4876e * this.f4827G) + this.f4825E.mo35355m();
                }
                i3 = mo35355m2;
                mo35363e2 = this.f4825E.mo35363e(m35382b) + mo35355m2;
            }
            if (this.f4826F == 1) {
                m35761H0(m35382b, i3, mo35363e, mo35363e2, i2);
            } else {
                m35761H0(m35382b, mo35363e, i3, i2, mo35363e2);
            }
            if (c1776c.f4855o) {
                m35546T2(this.f4828H.f4956e, i4);
            } else {
                m35534Z2(c1782f2, this.f4828H.f4956e, i4);
            }
            m35562J2(recycler, this.f4828H);
            if (this.f4828H.f4959h && m35382b.hasFocusable()) {
                if (c1776c.f4855o) {
                    this.f4831K.clear();
                } else {
                    z2 = false;
                    this.f4831K.set(c1782f2.f4876e, false);
                    r9 = z2;
                    z3 = true;
                }
            }
            z2 = false;
            r9 = z2;
            z3 = true;
        }
        int i6 = r9;
        if (!z3) {
            m35562J2(recycler, this.f4828H);
        }
        if (this.f4828H.f4956e == -1) {
            m35509u2 = this.f4824D.mo35355m() - m35506x2(this.f4824D.mo35355m());
        } else {
            m35509u2 = m35509u2(this.f4824D.mo35359i()) - this.f4824D.mo35359i();
        }
        if (m35509u2 > 0) {
            return Math.min(c1801f.f4953b, m35509u2);
        }
        return i6;
    }

    /* renamed from: l2 */
    private int m35520l2(int i) {
        int m35736U = m35736U();
        for (int i2 = 0; i2 < m35736U; i2++) {
            int m35705o0 = m35705o0(m35739T(i2));
            if (m35705o0 >= 0 && m35705o0 < i) {
                return m35705o0;
            }
        }
        return 0;
    }

    /* renamed from: p2 */
    private int m35515p2(int i) {
        for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
            int m35705o0 = m35705o0(m35739T(m35736U));
            if (m35705o0 >= 0 && m35705o0 < i) {
                return m35705o0;
            }
        }
        return 0;
    }

    /* renamed from: q2 */
    private void m35514q2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo35359i;
        int m35509u2 = m35509u2(Integer.MIN_VALUE);
        if (m35509u2 != Integer.MIN_VALUE && (mo35359i = this.f4824D.mo35359i() - m35509u2) > 0) {
            int i = mo35359i - (-m35554O2(-mo35359i, recycler, state));
            if (z && i > 0) {
                this.f4824D.mo35351r(i);
            }
        }
    }

    /* renamed from: r2 */
    private void m35512r2(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z) {
        int mo35355m;
        int m35506x2 = m35506x2(ViewDefaults.NUMBER_OF_LINES);
        if (m35506x2 != Integer.MAX_VALUE && (mo35355m = m35506x2 - this.f4824D.mo35355m()) > 0) {
            int m35554O2 = mo35355m - m35554O2(mo35355m, recycler, state);
            if (z && m35554O2 > 0) {
                this.f4824D.mo35351r(-m35554O2);
            }
        }
    }

    /* renamed from: u2 */
    private int m35509u2(int i) {
        int m35464l = this.f4823C[0].m35464l(i);
        for (int i2 = 1; i2 < this.f4822B; i2++) {
            int m35464l2 = this.f4823C[i2].m35464l(i);
            if (m35464l2 > m35464l) {
                m35464l = m35464l2;
            }
        }
        return m35464l;
    }

    /* renamed from: v2 */
    private int m35508v2(int i) {
        int m35460p = this.f4823C[0].m35460p(i);
        for (int i2 = 1; i2 < this.f4822B; i2++) {
            int m35460p2 = this.f4823C[i2].m35460p(i);
            if (m35460p2 > m35460p) {
                m35460p = m35460p2;
            }
        }
        return m35460p;
    }

    /* renamed from: w2 */
    private int m35507w2(int i) {
        int m35464l = this.f4823C[0].m35464l(i);
        for (int i2 = 1; i2 < this.f4822B; i2++) {
            int m35464l2 = this.f4823C[i2].m35464l(i);
            if (m35464l2 < m35464l) {
                m35464l = m35464l2;
            }
        }
        return m35464l;
    }

    /* renamed from: x2 */
    private int m35506x2(int i) {
        int m35460p = this.f4823C[0].m35460p(i);
        for (int i2 = 1; i2 < this.f4822B; i2++) {
            int m35460p2 = this.f4823C[i2].m35460p(i);
            if (m35460p2 < m35460p) {
                m35460p = m35460p2;
            }
        }
        return m35460p;
    }

    /* renamed from: y2 */
    private C1782f m35505y2(C1801f c1801f) {
        int i;
        int i2;
        int i3;
        if (m35565G2(c1801f.f4956e)) {
            i2 = this.f4822B - 1;
            i = -1;
            i3 = -1;
        } else {
            i = this.f4822B;
            i2 = 0;
            i3 = 1;
        }
        C1782f c1782f = null;
        if (c1801f.f4956e == 1) {
            int mo35355m = this.f4824D.mo35355m();
            int i4 = ViewDefaults.NUMBER_OF_LINES;
            while (i2 != i) {
                C1782f c1782f2 = this.f4823C[i2];
                int m35464l = c1782f2.m35464l(mo35355m);
                if (m35464l < i4) {
                    c1782f = c1782f2;
                    i4 = m35464l;
                }
                i2 += i3;
            }
            return c1782f;
        }
        int mo35359i = this.f4824D.mo35359i();
        int i5 = Integer.MIN_VALUE;
        while (i2 != i) {
            C1782f c1782f3 = this.f4823C[i2];
            int m35460p = c1782f3.m35460p(mo35359i);
            if (m35460p > i5) {
                c1782f = c1782f3;
                i5 = m35460p;
            }
            i2 += i3;
        }
        return c1782f;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* renamed from: z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m35503z2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4830J
            if (r0 == 0) goto L9
            int r0 = r6.m35510t2()
            goto Ld
        L9:
            int r0 = r6.m35511s2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f4834N
            r4.m35490h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4834N
            r9.m35487k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f4834N
            r7.m35488j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4834N
            r9.m35487k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4834N
            r9.m35488j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f4830J
            if (r7 == 0) goto L4d
            int r7 = r6.m35511s2()
            goto L51
        L4d:
            int r7 = r6.m35510t2()
        L51:
            if (r3 > r7) goto L56
            r6.m35769C1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35503z2(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: A2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    android.view.View m35571A2() {
        /*
            r12 = this;
            int r0 = r12.m35736U()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4822B
            r2.<init>(r3)
            int r3 = r12.f4822B
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4826F
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.m35569C2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.f4830J
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.m35739T(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1776c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4854n
            int r9 = r9.f4876e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4854n
            boolean r9 = r12.m35529c2(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4854n
            int r9 = r9.f4876e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4855o
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.m35739T(r9)
            boolean r10 = r12.f4830J
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.j r10 = r12.f4824D
            int r10 = r10.mo35364d(r7)
            androidx.recyclerview.widget.j r11 = r12.f4824D
            int r11 = r11.mo35364d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.j r10 = r12.f4824D
            int r10 = r10.mo35361g(r7)
            androidx.recyclerview.widget.j r11 = r12.f4824D
            int r11 = r11.mo35361g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C1776c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4854n
            int r8 = r8.f4876e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4854n
            int r9 = r9.f4876e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m35571A2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: B */
    public int mo28561B(RecyclerView.State state) {
        return m35528d2(state);
    }

    /* renamed from: B2 */
    public void m35570B2() {
        this.f4834N.m35496b();
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: C */
    public int mo28559C(RecyclerView.State state) {
        return m35527e2(state);
    }

    /* renamed from: C2 */
    boolean m35569C2() {
        return m35713k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: D */
    public int mo28557D(RecyclerView.State state) {
        return m35526f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: E */
    public int mo28555E(RecyclerView.State state) {
        return m35528d2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F */
    public int mo28552F(RecyclerView.State state) {
        return m35527e2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: F1 */
    public int mo28551F1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m35554O2(i, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G */
    public int mo28549G(RecyclerView.State state) {
        return m35526f2(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: G1 */
    public void mo28548G1(int i) {
        C1780e c1780e = this.f4838R;
        if (c1780e != null && c1780e.f4862j != i) {
            c1780e.m35479a();
        }
        this.f4832L = i;
        this.f4833M = Integer.MIN_VALUE;
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: H1 */
    public int mo28546H1(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return m35554O2(i, recycler, state);
    }

    /* renamed from: H2 */
    void m35564H2(int i, RecyclerView.State state) {
        int m35511s2;
        int i2;
        if (i > 0) {
            m35511s2 = m35510t2();
            i2 = 1;
        } else {
            m35511s2 = m35511s2();
            i2 = -1;
        }
        this.f4828H.f4952a = true;
        m35538X2(m35511s2, state);
        m35553P2(i2);
        C1801f c1801f = this.f4828H;
        c1801f.f4954c = m35511s2 + c1801f.f4955d;
        c1801f.f4953b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: K0 */
    public void mo35561K0(int i) {
        super.mo35561K0(i);
        for (int i2 = 0; i2 < this.f4822B; i2++) {
            this.f4823C[i2].m35458r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L0 */
    public void mo35559L0(int i) {
        super.mo35559L0(i);
        for (int i2 = 0; i2 < this.f4822B; i2++) {
            this.f4823C[i2].m35458r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: L1 */
    public void mo35558L1(Rect rect, int i, int i2) {
        int m35681y;
        int m35681y2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f4826F == 1) {
            m35681y2 = RecyclerView.LayoutManager.m35681y(i2, rect.height() + paddingTop, m35710m0());
            m35681y = RecyclerView.LayoutManager.m35681y(i, (this.f4827G * this.f4822B) + paddingLeft, m35708n0());
        } else {
            m35681y = RecyclerView.LayoutManager.m35681y(i, rect.width() + paddingLeft, m35708n0());
            m35681y2 = RecyclerView.LayoutManager.m35681y(i2, (this.f4827G * this.f4822B) + paddingTop, m35710m0());
        }
        m35753K1(m35681y, m35681y2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: M0 */
    public void mo28540M0(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f4834N.m35496b();
        for (int i = 0; i < this.f4822B; i++) {
            this.f4823C[i].m35471e();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: O */
    public RecyclerView.C1772i mo28537O() {
        if (this.f4826F == 0) {
            return new C1776c(-2, -1);
        }
        return new C1776c(-1, -2);
    }

    /* renamed from: O2 */
    int m35554O2(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (m35736U() == 0 || i == 0) {
            return 0;
        }
        m35564H2(i, state);
        int m35521k2 = m35521k2(recycler, this.f4828H, state);
        if (this.f4828H.f4953b >= m35521k2) {
            if (i < 0) {
                i = -m35521k2;
            } else {
                i = m35521k2;
            }
        }
        this.f4824D.mo35351r(-i);
        this.f4836P = this.f4830J;
        C1801f c1801f = this.f4828H;
        c1801f.f4953b = 0;
        m35562J2(recycler, c1801f);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: P */
    public RecyclerView.C1772i mo28533P(Context context, AttributeSet attributeSet) {
        return new C1776c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q */
    public RecyclerView.C1772i mo35552Q(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1776c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1776c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Q0 */
    public void mo28531Q0(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        super.mo28531Q0(recyclerView, recycler);
        m35682x1(this.f4845Y);
        for (int i = 0; i < this.f4822B; i++) {
            this.f4823C[i].m35471e();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: Q2 */
    public void m35551Q2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo35513r(null);
        if (i == this.f4826F) {
            return;
        }
        this.f4826F = i;
        AbstractC1806j abstractC1806j = this.f4824D;
        this.f4824D = this.f4825E;
        this.f4825E = abstractC1806j;
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R0 */
    public View mo35550R0(View view, int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
        View m35751M;
        int m35511s2;
        boolean z;
        boolean z2;
        int m35469g;
        int m35469g2;
        int m35469g3;
        View m35463m;
        if (m35736U() == 0 || (m35751M = m35751M(view)) == null) {
            return null;
        }
        m35555N2();
        int m35525g2 = m35525g2(i);
        if (m35525g2 == Integer.MIN_VALUE) {
            return null;
        }
        C1776c c1776c = (C1776c) m35751M.getLayoutParams();
        boolean z3 = c1776c.f4855o;
        C1782f c1782f = c1776c.f4854n;
        if (m35525g2 == 1) {
            m35511s2 = m35510t2();
        } else {
            m35511s2 = m35511s2();
        }
        m35538X2(m35511s2, state);
        m35553P2(m35525g2);
        C1801f c1801f = this.f4828H;
        c1801f.f4954c = c1801f.f4955d + m35511s2;
        c1801f.f4953b = (int) (this.f4824D.mo35354n() * 0.33333334f);
        C1801f c1801f2 = this.f4828H;
        c1801f2.f4959h = true;
        c1801f2.f4952a = false;
        m35521k2(recycler, c1801f2, state);
        this.f4836P = this.f4830J;
        if (!z3 && (m35463m = c1782f.m35463m(m35511s2, m35525g2)) != null && m35463m != m35751M) {
            return m35463m;
        }
        if (m35565G2(m35525g2)) {
            for (int i2 = this.f4822B - 1; i2 >= 0; i2--) {
                View m35463m2 = this.f4823C[i2].m35463m(m35511s2, m35525g2);
                if (m35463m2 != null && m35463m2 != m35751M) {
                    return m35463m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f4822B; i3++) {
                View m35463m3 = this.f4823C[i3].m35463m(m35511s2, m35525g2);
                if (m35463m3 != null && m35463m3 != m35751M) {
                    return m35463m3;
                }
            }
        }
        boolean z4 = !this.f4829I;
        if (m35525g2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z4 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z3) {
            if (z2) {
                m35469g3 = c1782f.m35470f();
            } else {
                m35469g3 = c1782f.m35469g();
            }
            View mo35749N = mo35749N(m35469g3);
            if (mo35749N != null && mo35749N != m35751M) {
                return mo35749N;
            }
        }
        if (m35565G2(m35525g2)) {
            for (int i4 = this.f4822B - 1; i4 >= 0; i4--) {
                if (i4 != c1782f.f4876e) {
                    if (z2) {
                        m35469g2 = this.f4823C[i4].m35470f();
                    } else {
                        m35469g2 = this.f4823C[i4].m35469g();
                    }
                    View mo35749N2 = mo35749N(m35469g2);
                    if (mo35749N2 != null && mo35749N2 != m35751M) {
                        return mo35749N2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f4822B; i5++) {
                if (z2) {
                    m35469g = this.f4823C[i5].m35470f();
                } else {
                    m35469g = this.f4823C[i5].m35469g();
                }
                View mo35749N3 = mo35749N(m35469g);
                if (mo35749N3 != null && mo35749N3 != m35751M) {
                    return mo35749N3;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: R1 */
    public void mo27232R1(RecyclerView recyclerView, RecyclerView.State state, int i) {
        C1802g c1802g = new C1802g(recyclerView.getContext());
        c1802g.setTargetPosition(i);
        m35740S1(c1802g);
    }

    /* renamed from: R2 */
    public void m35549R2(boolean z) {
        mo35513r(null);
        C1780e c1780e = this.f4838R;
        if (c1780e != null && c1780e.f4869q != z) {
            c1780e.f4869q = z;
        }
        this.f4829I = z;
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: S0 */
    public void mo35548S0(AccessibilityEvent accessibilityEvent) {
        super.mo35548S0(accessibilityEvent);
        if (m35736U() > 0) {
            View m35517n2 = m35517n2(false);
            View m35518m2 = m35518m2(false);
            if (m35517n2 != null && m35518m2 != null) {
                int m35705o0 = m35705o0(m35517n2);
                int m35705o02 = m35705o0(m35518m2);
                if (m35705o0 < m35705o02) {
                    accessibilityEvent.setFromIndex(m35705o0);
                    accessibilityEvent.setToIndex(m35705o02);
                    return;
                }
                accessibilityEvent.setFromIndex(m35705o02);
                accessibilityEvent.setToIndex(m35705o0);
            }
        }
    }

    /* renamed from: S2 */
    public void m35547S2(int i) {
        mo35513r(null);
        if (i != this.f4822B) {
            m35570B2();
            this.f4822B = i;
            this.f4831K = new BitSet(this.f4822B);
            this.f4823C = new C1782f[this.f4822B];
            for (int i2 = 0; i2 < this.f4822B; i2++) {
                this.f4823C[i2] = new C1782f(i2);
            }
            m35769C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: U1 */
    public boolean mo35545U1() {
        return this.f4838R == null;
    }

    /* renamed from: V2 */
    boolean m35542V2(RecyclerView.State state, C1775b c1775b) {
        int i;
        int m35511s2;
        int mo35355m;
        boolean z = false;
        if (!state.m35608e() && (i = this.f4832L) != -1) {
            if (i >= 0 && i < state.m35611b()) {
                C1780e c1780e = this.f4838R;
                if (c1780e != null && c1780e.f4862j != -1 && c1780e.f4864l >= 1) {
                    c1775b.f4848b = Integer.MIN_VALUE;
                    c1775b.f4847a = this.f4832L;
                } else {
                    View mo35749N = mo35749N(this.f4832L);
                    if (mo35749N != null) {
                        if (this.f4830J) {
                            m35511s2 = m35510t2();
                        } else {
                            m35511s2 = m35511s2();
                        }
                        c1775b.f4847a = m35511s2;
                        if (this.f4833M != Integer.MIN_VALUE) {
                            if (c1775b.f4849c) {
                                c1775b.f4848b = (this.f4824D.mo35359i() - this.f4833M) - this.f4824D.mo35364d(mo35749N);
                            } else {
                                c1775b.f4848b = (this.f4824D.mo35355m() + this.f4833M) - this.f4824D.mo35361g(mo35749N);
                            }
                            return true;
                        } else if (this.f4824D.mo35363e(mo35749N) > this.f4824D.mo35354n()) {
                            if (c1775b.f4849c) {
                                mo35355m = this.f4824D.mo35359i();
                            } else {
                                mo35355m = this.f4824D.mo35355m();
                            }
                            c1775b.f4848b = mo35355m;
                            return true;
                        } else {
                            int mo35361g = this.f4824D.mo35361g(mo35749N) - this.f4824D.mo35355m();
                            if (mo35361g < 0) {
                                c1775b.f4848b = -mo35361g;
                                return true;
                            }
                            int mo35359i = this.f4824D.mo35359i() - this.f4824D.mo35364d(mo35749N);
                            if (mo35359i < 0) {
                                c1775b.f4848b = mo35359i;
                                return true;
                            }
                            c1775b.f4848b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i2 = this.f4832L;
                        c1775b.f4847a = i2;
                        int i3 = this.f4833M;
                        if (i3 == Integer.MIN_VALUE) {
                            if (m35532a2(i2) == 1) {
                                z = true;
                            }
                            c1775b.f4849c = z;
                            c1775b.m35502a();
                        } else {
                            c1775b.m35501b(i3);
                        }
                        c1775b.f4850d = true;
                    }
                }
                return true;
            }
            this.f4832L = -1;
            this.f4833M = Integer.MIN_VALUE;
        }
        return false;
    }

    /* renamed from: W2 */
    void m35540W2(RecyclerView.State state, C1775b c1775b) {
        if (m35542V2(state, c1775b) || m35544U2(state, c1775b)) {
            return;
        }
        c1775b.m35502a();
        c1775b.f4847a = 0;
    }

    /* renamed from: X1 */
    boolean m35539X1() {
        int m35464l = this.f4823C[0].m35464l(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4822B; i++) {
            if (this.f4823C[i].m35464l(Integer.MIN_VALUE) != m35464l) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y1 */
    boolean m35537Y1() {
        int m35460p = this.f4823C[0].m35460p(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4822B; i++) {
            if (this.f4823C[i].m35460p(Integer.MIN_VALUE) != m35460p) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Y2 */
    void m35536Y2(int i) {
        this.f4827G = i / this.f4822B;
        this.f4839S = View.MeasureSpec.makeMeasureSpec(i, this.f4825E.mo35357k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: Z0 */
    public void mo28519Z0(RecyclerView recyclerView, int i, int i2) {
        m35503z2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.InterfaceC1763a
    /* renamed from: a */
    public PointF mo28517a(int i) {
        int m35532a2 = m35532a2(i);
        PointF pointF = new PointF();
        if (m35532a2 == 0) {
            return null;
        }
        if (this.f4826F == 0) {
            pointF.x = m35532a2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m35532a2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: a1 */
    public void mo35533a1(RecyclerView recyclerView) {
        this.f4834N.m35496b();
        m35769C1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: b1 */
    public void mo28515b1(RecyclerView recyclerView, int i, int i2, int i3) {
        m35503z2(i, i2, 8);
    }

    /* renamed from: b2 */
    boolean m35530b2() {
        int m35511s2;
        int m35510t2;
        int i;
        if (m35736U() == 0 || this.f4835O == 0 || !m35680y0()) {
            return false;
        }
        if (this.f4830J) {
            m35511s2 = m35510t2();
            m35510t2 = m35511s2();
        } else {
            m35511s2 = m35511s2();
            m35510t2 = m35510t2();
        }
        if (m35511s2 == 0 && m35571A2() != null) {
            this.f4834N.m35496b();
            m35767D1();
            m35769C1();
            return true;
        } else if (!this.f4842V) {
            return false;
        } else {
            if (this.f4830J) {
                i = -1;
            } else {
                i = 1;
            }
            int i2 = m35510t2 + 1;
            C1777d.C1778a m35493e = this.f4834N.m35493e(m35511s2, i2, i, true);
            if (m35493e == null) {
                this.f4842V = false;
                this.f4834N.m35494d(i2);
                return false;
            }
            C1777d.C1778a m35493e2 = this.f4834N.m35493e(m35511s2, m35493e.f4858j, i * (-1), true);
            if (m35493e2 == null) {
                this.f4834N.m35494d(m35493e.f4858j);
            } else {
                this.f4834N.m35494d(m35493e2.f4858j + 1);
            }
            m35767D1();
            m35769C1();
            return true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: c1 */
    public void mo28513c1(RecyclerView recyclerView, int i, int i2) {
        m35503z2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e1 */
    public void mo28509e1(RecyclerView recyclerView, int i, int i2, Object obj) {
        m35503z2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f1 */
    public void mo28507f1(RecyclerView.Recycler recycler, RecyclerView.State state) {
        m35566F2(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: g1 */
    public void mo28505g1(RecyclerView.State state) {
        super.mo28505g1(state);
        this.f4832L = -1;
        this.f4833M = Integer.MIN_VALUE;
        this.f4838R = null;
        this.f4841U.m35500c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k1 */
    public void mo28500k1(Parcelable parcelable) {
        if (parcelable instanceof C1780e) {
            C1780e c1780e = (C1780e) parcelable;
            this.f4838R = c1780e;
            if (this.f4832L != -1) {
                c1780e.m35479a();
                this.f4838R.m35478b();
            }
            m35769C1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l1 */
    public Parcelable mo28498l1() {
        int m35511s2;
        int m35460p;
        int mo35355m;
        int[] iArr;
        if (this.f4838R != null) {
            return new C1780e(this.f4838R);
        }
        C1780e c1780e = new C1780e();
        c1780e.f4869q = this.f4829I;
        c1780e.f4870r = this.f4836P;
        c1780e.f4871s = this.f4837Q;
        C1777d c1777d = this.f4834N;
        if (c1777d != null && (iArr = c1777d.f4856a) != null) {
            c1780e.f4867o = iArr;
            c1780e.f4866n = iArr.length;
            c1780e.f4868p = c1777d.f4857b;
        } else {
            c1780e.f4866n = 0;
        }
        if (m35736U() > 0) {
            if (this.f4836P) {
                m35511s2 = m35510t2();
            } else {
                m35511s2 = m35511s2();
            }
            c1780e.f4862j = m35511s2;
            c1780e.f4863k = m35516o2();
            int i = this.f4822B;
            c1780e.f4864l = i;
            c1780e.f4865m = new int[i];
            for (int i2 = 0; i2 < this.f4822B; i2++) {
                if (this.f4836P) {
                    m35460p = this.f4823C[i2].m35464l(Integer.MIN_VALUE);
                    if (m35460p != Integer.MIN_VALUE) {
                        mo35355m = this.f4824D.mo35359i();
                        m35460p -= mo35355m;
                        c1780e.f4865m[i2] = m35460p;
                    } else {
                        c1780e.f4865m[i2] = m35460p;
                    }
                } else {
                    m35460p = this.f4823C[i2].m35460p(Integer.MIN_VALUE);
                    if (m35460p != Integer.MIN_VALUE) {
                        mo35355m = this.f4824D.mo35355m();
                        m35460p -= mo35355m;
                        c1780e.f4865m[i2] = m35460p;
                    } else {
                        c1780e.f4865m[i2] = m35460p;
                    }
                }
            }
        } else {
            c1780e.f4862j = -1;
            c1780e.f4863k = -1;
            c1780e.f4864l = 0;
        }
        return c1780e;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m1 */
    public void mo35519m1(int i) {
        if (i == 0) {
            m35530b2();
        }
    }

    /* renamed from: m2 */
    View m35518m2(boolean z) {
        int mo35355m = this.f4824D.mo35355m();
        int mo35359i = this.f4824D.mo35359i();
        View view = null;
        for (int m35736U = m35736U() - 1; m35736U >= 0; m35736U--) {
            View m35739T = m35739T(m35736U);
            int mo35361g = this.f4824D.mo35361g(m35739T);
            int mo35364d = this.f4824D.mo35364d(m35739T);
            if (mo35364d > mo35355m && mo35361g < mo35359i) {
                if (mo35364d > mo35359i && z) {
                    if (view == null) {
                        view = m35739T;
                    }
                } else {
                    return m35739T;
                }
            }
        }
        return view;
    }

    /* renamed from: n2 */
    View m35517n2(boolean z) {
        int mo35355m = this.f4824D.mo35355m();
        int mo35359i = this.f4824D.mo35359i();
        int m35736U = m35736U();
        View view = null;
        for (int i = 0; i < m35736U; i++) {
            View m35739T = m35739T(i);
            int mo35361g = this.f4824D.mo35361g(m35739T);
            if (this.f4824D.mo35364d(m35739T) > mo35355m && mo35361g < mo35359i) {
                if (mo35361g < mo35355m && z) {
                    if (view == null) {
                        view = m35739T;
                    }
                } else {
                    return m35739T;
                }
            }
        }
        return view;
    }

    /* renamed from: o2 */
    int m35516o2() {
        View m35517n2;
        if (this.f4830J) {
            m35517n2 = m35518m2(true);
        } else {
            m35517n2 = m35517n2(true);
        }
        if (m35517n2 == null) {
            return -1;
        }
        return m35705o0(m35517n2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: r */
    public void mo35513r(String str) {
        if (this.f4838R == null) {
            super.mo35513r(str);
        }
    }

    /* renamed from: s2 */
    int m35511s2() {
        if (m35736U() == 0) {
            return 0;
        }
        return m35705o0(m35739T(0));
    }

    /* renamed from: t2 */
    int m35510t2() {
        int m35736U = m35736U();
        if (m35736U == 0) {
            return 0;
        }
        return m35705o0(m35739T(m35736U - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: v */
    public boolean mo28487v() {
        return this.f4826F == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: w */
    public boolean mo28485w() {
        return this.f4826F == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: x */
    public boolean mo28483x(RecyclerView.C1772i c1772i) {
        return c1772i instanceof C1776c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z */
    public void mo35504z(int i, int i2, RecyclerView.State state, RecyclerView.LayoutManager.InterfaceC1759c interfaceC1759c) {
        int m35464l;
        int i3;
        if (this.f4826F != 0) {
            i = i2;
        }
        if (m35736U() != 0 && i != 0) {
            m35564H2(i, state);
            int[] iArr = this.f4844X;
            if (iArr == null || iArr.length < this.f4822B) {
                this.f4844X = new int[this.f4822B];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f4822B; i5++) {
                C1801f c1801f = this.f4828H;
                if (c1801f.f4955d == -1) {
                    m35464l = c1801f.f4957f;
                    i3 = this.f4823C[i5].m35460p(m35464l);
                } else {
                    m35464l = this.f4823C[i5].m35464l(c1801f.f4958g);
                    i3 = this.f4828H.f4958g;
                }
                int i6 = m35464l - i3;
                if (i6 >= 0) {
                    this.f4844X[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.f4844X, 0, i4);
            for (int i7 = 0; i7 < i4 && this.f4828H.m35383a(state); i7++) {
                interfaceC1759c.mo35677a(this.f4828H.f4954c, this.f4844X[i7]);
                C1801f c1801f2 = this.f4828H;
                c1801f2.f4954c += c1801f2.f4955d;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: z0 */
    public boolean mo28480z0() {
        return this.f4835O != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1777d {

        /* renamed from: a */
        int[] f4856a;

        /* renamed from: b */
        List<C1778a> f4857b;

        C1777d() {
        }

        /* renamed from: i */
        private int m35489i(int i) {
            if (this.f4857b == null) {
                return -1;
            }
            C1778a m35492f = m35492f(i);
            if (m35492f != null) {
                this.f4857b.remove(m35492f);
            }
            int size = this.f4857b.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    if (this.f4857b.get(i2).f4858j >= i) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f4857b.remove(i2);
            return this.f4857b.get(i2).f4858j;
        }

        /* renamed from: l */
        private void m35486l(int i, int i2) {
            List<C1778a> list = this.f4857b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1778a c1778a = this.f4857b.get(size);
                int i3 = c1778a.f4858j;
                if (i3 >= i) {
                    c1778a.f4858j = i3 + i2;
                }
            }
        }

        /* renamed from: m */
        private void m35485m(int i, int i2) {
            List<C1778a> list = this.f4857b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                C1778a c1778a = this.f4857b.get(size);
                int i4 = c1778a.f4858j;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f4857b.remove(size);
                    } else {
                        c1778a.f4858j = i4 - i2;
                    }
                }
            }
        }

        /* renamed from: a */
        public void m35497a(C1778a c1778a) {
            if (this.f4857b == null) {
                this.f4857b = new ArrayList();
            }
            int size = this.f4857b.size();
            for (int i = 0; i < size; i++) {
                C1778a c1778a2 = this.f4857b.get(i);
                if (c1778a2.f4858j == c1778a.f4858j) {
                    this.f4857b.remove(i);
                }
                if (c1778a2.f4858j >= c1778a.f4858j) {
                    this.f4857b.add(i, c1778a);
                    return;
                }
            }
            this.f4857b.add(c1778a);
        }

        /* renamed from: b */
        void m35496b() {
            int[] iArr = this.f4856a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4857b = null;
        }

        /* renamed from: c */
        void m35495c(int i) {
            int[] iArr = this.f4856a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f4856a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[m35483o(i)];
                this.f4856a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4856a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        int m35494d(int i) {
            List<C1778a> list = this.f4857b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4857b.get(size).f4858j >= i) {
                        this.f4857b.remove(size);
                    }
                }
            }
            return m35490h(i);
        }

        /* renamed from: e */
        public C1778a m35493e(int i, int i2, int i3, boolean z) {
            List<C1778a> list = this.f4857b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C1778a c1778a = this.f4857b.get(i4);
                int i5 = c1778a.f4858j;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || c1778a.f4859k == i3 || (z && c1778a.f4861m))) {
                    return c1778a;
                }
            }
            return null;
        }

        /* renamed from: f */
        public C1778a m35492f(int i) {
            List<C1778a> list = this.f4857b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C1778a c1778a = this.f4857b.get(size);
                if (c1778a.f4858j == i) {
                    return c1778a;
                }
            }
            return null;
        }

        /* renamed from: g */
        int m35491g(int i) {
            int[] iArr = this.f4856a;
            if (iArr != null && i < iArr.length) {
                return iArr[i];
            }
            return -1;
        }

        /* renamed from: h */
        int m35490h(int i) {
            int[] iArr = this.f4856a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int m35489i = m35489i(i);
            if (m35489i == -1) {
                int[] iArr2 = this.f4856a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4856a.length;
            }
            int min = Math.min(m35489i + 1, this.f4856a.length);
            Arrays.fill(this.f4856a, i, min, -1);
            return min;
        }

        /* renamed from: j */
        void m35488j(int i, int i2) {
            int[] iArr = this.f4856a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m35495c(i3);
                int[] iArr2 = this.f4856a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4856a, i, i3, -1);
                m35486l(i, i2);
            }
        }

        /* renamed from: k */
        void m35487k(int i, int i2) {
            int[] iArr = this.f4856a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                m35495c(i3);
                int[] iArr2 = this.f4856a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4856a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m35485m(i, i2);
            }
        }

        /* renamed from: n */
        void m35484n(int i, C1782f c1782f) {
            m35495c(i);
            this.f4856a[i] = c1782f.f4876e;
        }

        /* renamed from: o */
        int m35483o(int i) {
            int length = this.f4856a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C1778a implements Parcelable {
            public static final Parcelable.Creator<C1778a> CREATOR = new C1779a();

            /* renamed from: j */
            int f4858j;

            /* renamed from: k */
            int f4859k;

            /* renamed from: l */
            int[] f4860l;

            /* renamed from: m */
            boolean f4861m;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
            class C1779a implements Parcelable.Creator<C1778a> {
                C1779a() {
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public C1778a createFromParcel(Parcel parcel) {
                    return new C1778a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public C1778a[] newArray(int i) {
                    return new C1778a[i];
                }
            }

            C1778a(Parcel parcel) {
                this.f4858j = parcel.readInt();
                this.f4859k = parcel.readInt();
                this.f4861m = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4860l = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* renamed from: a */
            int m35482a(int i) {
                int[] iArr = this.f4860l;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4858j + ", mGapDir=" + this.f4859k + ", mHasUnwantedGapAfter=" + this.f4861m + ", mGapPerSpan=" + Arrays.toString(this.f4860l) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4858j);
                parcel.writeInt(this.f4859k);
                parcel.writeInt(this.f4861m ? 1 : 0);
                int[] iArr = this.f4860l;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4860l);
                    return;
                }
                parcel.writeInt(0);
            }

            C1778a() {
            }
        }
    }
}
