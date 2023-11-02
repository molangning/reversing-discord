package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;
import bb.C2232g;
import bb.C2239k;
import com.google.android.material.internal.C4911o;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p020b0.AbstractC1964a;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7487i;
import p155ia.C7488j;
import p155ia.C7489k;
import p411x.C13657a;
import p443ya.C13957c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.AbstractC0682c<V> {

    /* renamed from: d0 */
    private static final int f13130d0 = C7488j.f20268e;

    /* renamed from: A */
    private ValueAnimator f13131A;

    /* renamed from: B */
    int f13132B;

    /* renamed from: C */
    int f13133C;

    /* renamed from: D */
    int f13134D;

    /* renamed from: E */
    float f13135E;

    /* renamed from: F */
    int f13136F;

    /* renamed from: G */
    float f13137G;

    /* renamed from: H */
    boolean f13138H;

    /* renamed from: I */
    private boolean f13139I;

    /* renamed from: J */
    private boolean f13140J;

    /* renamed from: K */
    int f13141K;

    /* renamed from: L */
    int f13142L;

    /* renamed from: M */
    ViewDragHelper f13143M;

    /* renamed from: N */
    private boolean f13144N;

    /* renamed from: O */
    private int f13145O;

    /* renamed from: P */
    private boolean f13146P;

    /* renamed from: Q */
    private int f13147Q;

    /* renamed from: R */
    int f13148R;

    /* renamed from: S */
    int f13149S;

    /* renamed from: T */
    WeakReference<V> f13150T;

    /* renamed from: U */
    WeakReference<View> f13151U;

    /* renamed from: V */
    private final ArrayList<AbstractC4777f> f13152V;

    /* renamed from: W */
    private VelocityTracker f13153W;

    /* renamed from: X */
    int f13154X;

    /* renamed from: Y */
    private int f13155Y;

    /* renamed from: Z */
    boolean f13156Z;

    /* renamed from: a */
    private int f13157a;

    /* renamed from: a0 */
    private Map<View, Integer> f13158a0;

    /* renamed from: b */
    private boolean f13159b;

    /* renamed from: b0 */
    private int f13160b0;

    /* renamed from: c */
    private boolean f13161c;

    /* renamed from: c0 */
    private final ViewDragHelper.AbstractC1452c f13162c0;

    /* renamed from: d */
    private float f13163d;

    /* renamed from: e */
    private int f13164e;

    /* renamed from: f */
    private boolean f13165f;

    /* renamed from: g */
    private int f13166g;

    /* renamed from: h */
    private int f13167h;

    /* renamed from: i */
    private C2232g f13168i;

    /* renamed from: j */
    private ColorStateList f13169j;

    /* renamed from: k */
    private int f13170k;

    /* renamed from: l */
    private int f13171l;

    /* renamed from: m */
    private int f13172m;

    /* renamed from: n */
    private boolean f13173n;

    /* renamed from: o */
    private boolean f13174o;

    /* renamed from: p */
    private boolean f13175p;

    /* renamed from: q */
    private boolean f13176q;

    /* renamed from: r */
    private boolean f13177r;

    /* renamed from: s */
    private boolean f13178s;

    /* renamed from: t */
    private boolean f13179t;

    /* renamed from: u */
    private boolean f13180u;

    /* renamed from: v */
    private int f13181v;

    /* renamed from: w */
    private int f13182w;

    /* renamed from: x */
    private C2239k f13183x;

    /* renamed from: y */
    private boolean f13184y;

    /* renamed from: z */
    private final BottomSheetBehavior<V>.C4780h f13185z;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4772a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ View f13186j;

        /* renamed from: k */
        final /* synthetic */ int f13187k;

        RunnableC4772a(View view, int i) {
            BottomSheetBehavior.this = r1;
            this.f13186j = view;
            this.f13187k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.m27744J0(this.f13186j, this.f13187k, false);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4773b implements ValueAnimator.AnimatorUpdateListener {
        C4773b() {
            BottomSheetBehavior.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f13168i != null) {
                BottomSheetBehavior.this.f13168i.m33918Z(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4774c implements C4911o.InterfaceC4915d {

        /* renamed from: a */
        final /* synthetic */ boolean f13190a;

        C4774c(boolean z) {
            BottomSheetBehavior.this = r1;
            this.f13190a = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00c3  */
        @Override // com.google.android.material.internal.C4911o.InterfaceC4915d
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.core.view.WindowInsetsCompat mo26929a(android.view.View r11, androidx.core.view.WindowInsetsCompat r12, com.google.android.material.internal.C4911o.C4916e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.WindowInsetsCompat.C1163m.m37675g()
                androidx.core.graphics.Insets r0 = r12.m37741f(r0)
                int r1 = androidx.core.view.WindowInsetsCompat.C1163m.m37678d()
                androidx.core.graphics.Insets r1 = r12.m37741f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f3341b
                com.google.android.material.bottomsheet.BottomSheetBehavior.m27737N(r2, r3)
                boolean r2 = com.google.android.material.internal.C4911o.m26933e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27735O(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.m37735l()
                com.google.android.material.bottomsheet.BottomSheetBehavior.m27733Q(r3, r6)
                int r3 = r13.f13786d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27734P(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27732R(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f13785c
                goto L50
            L4e:
                int r4 = r13.f13783a
            L50:
                int r6 = r0.f3340a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27731S(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f13783a
                goto L62
            L60:
                int r13 = r13.f13785c
            L62:
                int r2 = r0.f3342c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27730T(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f3340a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27729U(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f3342c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27753F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f3341b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f13190a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f3343d
                com.google.android.material.bottomsheet.BottomSheetBehavior.m27751G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.m27735O(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f13190a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.m27749H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C4774c.mo26929a(android.view.View, androidx.core.view.WindowInsetsCompat, com.google.android.material.internal.o$e):androidx.core.view.WindowInsetsCompat");
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4775d extends ViewDragHelper.AbstractC1452c {

        /* renamed from: a */
        private long f13192a;

        C4775d() {
            BottomSheetBehavior.this = r1;
        }

        /* renamed from: n */
        private boolean m27683n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f13149S + bottomSheetBehavior.m27718f0()) / 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: a */
        public int mo27690a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: b */
        public int mo27689b(View view, int i, int i2) {
            int i3;
            int m27718f0 = BottomSheetBehavior.this.m27718f0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f13138H) {
                i3 = bottomSheetBehavior.f13149S;
            } else {
                i3 = bottomSheetBehavior.f13136F;
            }
            return C13657a.m1915b(i, m27718f0, i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: e */
        public int mo27688e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.f13138H) {
                return bottomSheetBehavior.f13149S;
            }
            return bottomSheetBehavior.f13136F;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: j */
        public void mo27687j(int i) {
            if (i == 1 && BottomSheetBehavior.this.f13140J) {
                BottomSheetBehavior.this.m27757C0(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: k */
        public void mo27686k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.m27721c0(i2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:108:0x00c9, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.m27748H0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:113:0x00eb, code lost:
            if (java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f13133C) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f13136F)) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:121:0x0107, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.m27748H0() != false) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:126:0x0121, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.m27748H0() == false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x0034, code lost:
            if (com.google.android.material.bottomsheet.BottomSheetBehavior.this.m27754E0(r0, (r9 * 100.0f) / r10.f13149S) != false) goto L5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x003b, code lost:
            if (r9 > com.google.android.material.bottomsheet.BottomSheetBehavior.this.f13134D) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x008b, code lost:
            if (java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.m27718f0()) < java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.f13134D)) goto L5;
         */
        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo27685l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 302
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C4775d.mo27685l(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: m */
        public boolean mo27684m(View view, int i) {
            View view2;
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.f13141K;
            if (i2 == 1 || bottomSheetBehavior.f13156Z) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.f13154X == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.f13151U;
                if (weakReference != null) {
                    view2 = weakReference.get();
                } else {
                    view2 = null;
                }
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f13192a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.f13150T;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4776e implements AccessibilityViewCommand {

        /* renamed from: a */
        final /* synthetic */ int f13194a;

        C4776e(int i) {
            BottomSheetBehavior.this = r1;
            this.f13194a = i;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: a */
        public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
            BottomSheetBehavior.this.m27759B0(this.f13194a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC4777f {
        /* renamed from: a */
        void m27681a(View view) {
        }

        /* renamed from: b */
        public abstract void m27680b(View view, float f);

        /* renamed from: c */
        public abstract void m27679c(View view, int i);
    }

    public BottomSheetBehavior() {
        this.f13157a = 0;
        this.f13159b = true;
        this.f13161c = false;
        this.f13170k = -1;
        this.f13171l = -1;
        this.f13185z = new C4780h(this, null);
        this.f13135E = 0.5f;
        this.f13137G = -1.0f;
        this.f13140J = true;
        this.f13141K = 4;
        this.f13142L = 4;
        this.f13152V = new ArrayList<>();
        this.f13160b0 = -1;
        this.f13162c0 = new C4775d();
    }

    /* renamed from: D0 */
    private void m27756D0(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 29 && !m27715i0() && !this.f13165f) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f13174o && !this.f13175p && !this.f13176q && !this.f13178s && !this.f13179t && !this.f13180u && !z) {
            return;
        }
        C4911o.m26937a(view, new C4774c(z));
    }

    /* renamed from: F0 */
    private boolean m27752F0() {
        return this.f13143M != null && (this.f13140J || this.f13141K == 1);
    }

    /* renamed from: J0 */
    public void m27744J0(View view, int i, boolean z) {
        boolean z2;
        int m27717g0 = m27717g0(i);
        ViewDragHelper viewDragHelper = this.f13143M;
        if (viewDragHelper != null && (!z ? viewDragHelper.m36789Q(view, view.getLeft(), m27717g0) : viewDragHelper.m36791O(view.getLeft(), m27717g0))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m27757C0(2);
            m27740L0(i);
            this.f13185z.m27673c(i);
            return;
        }
        m27757C0(i);
    }

    /* renamed from: K0 */
    private void m27742K0() {
        V v;
        WeakReference<V> weakReference = this.f13150T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        C1365w0.m37197k0(v, 524288);
        C1365w0.m37197k0(v, 262144);
        C1365w0.m37197k0(v, 1048576);
        int i = this.f13160b0;
        if (i != -1) {
            C1365w0.m37197k0(v, i);
        }
        int i2 = 6;
        if (!this.f13159b && this.f13141K != 6) {
            this.f13160b0 = m27728V(v, C7487i.f20248a, 6);
        }
        if (this.f13138H && this.f13141K != 5) {
            m27711l0(v, AccessibilityNodeInfoCompat.C1178a.f3626y, 5);
        }
        int i3 = this.f13141K;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 == 6) {
                    m27711l0(v, AccessibilityNodeInfoCompat.C1178a.f3625x, 4);
                    m27711l0(v, AccessibilityNodeInfoCompat.C1178a.f3624w, 3);
                    return;
                }
                return;
            }
            if (this.f13159b) {
                i2 = 3;
            }
            m27711l0(v, AccessibilityNodeInfoCompat.C1178a.f3624w, i2);
            return;
        }
        if (this.f13159b) {
            i2 = 4;
        }
        m27711l0(v, AccessibilityNodeInfoCompat.C1178a.f3625x, i2);
    }

    /* renamed from: L0 */
    private void m27740L0(int i) {
        boolean z;
        ValueAnimator valueAnimator;
        float f;
        if (i == 2) {
            return;
        }
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        if (this.f13184y != z) {
            this.f13184y = z;
            if (this.f13168i != null && (valueAnimator = this.f13131A) != null) {
                if (valueAnimator.isRunning()) {
                    this.f13131A.reverse();
                    return;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                this.f13131A.setFloatValues(1.0f - f, f);
                this.f13131A.start();
            }
        }
    }

    /* renamed from: M0 */
    private void m27738M0(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.f13150T;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.f13158a0 == null) {
                this.f13158a0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.f13150T.get()) {
                if (z) {
                    this.f13158a0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    if (this.f13161c) {
                        C1365w0.m37259A0(childAt, 4);
                    }
                } else if (this.f13161c && (map = this.f13158a0) != null && map.containsKey(childAt)) {
                    C1365w0.m37259A0(childAt, this.f13158a0.get(childAt).intValue());
                }
            }
        }
        if (!z) {
            this.f13158a0 = null;
        } else if (this.f13161c) {
            this.f13150T.get().sendAccessibilityEvent(8);
        }
    }

    /* renamed from: N0 */
    public void m27736N0(boolean z) {
        V v;
        if (this.f13150T != null) {
            m27727W();
            if (this.f13141K == 4 && (v = this.f13150T.get()) != null) {
                if (z) {
                    m27759B0(4);
                } else {
                    v.requestLayout();
                }
            }
        }
    }

    /* renamed from: V */
    private int m27728V(V v, int i, int i2) {
        return C1365w0.m37214c(v, v.getResources().getString(i), m27724Z(i2));
    }

    /* renamed from: W */
    private void m27727W() {
        int m27725Y = m27725Y();
        if (this.f13159b) {
            this.f13136F = Math.max(this.f13149S - m27725Y, this.f13133C);
        } else {
            this.f13136F = this.f13149S - m27725Y;
        }
    }

    /* renamed from: X */
    private void m27726X() {
        this.f13134D = (int) (this.f13149S * (1.0f - this.f13135E));
    }

    /* renamed from: Y */
    private int m27725Y() {
        int i;
        if (this.f13165f) {
            return Math.min(Math.max(this.f13166g, this.f13149S - ((this.f13148R * 9) / 16)), this.f13147Q) + this.f13181v;
        }
        if (!this.f13173n && !this.f13174o && (i = this.f13172m) > 0) {
            return Math.max(this.f13164e, i + this.f13167h);
        }
        return this.f13164e + this.f13181v;
    }

    /* renamed from: Z */
    private AccessibilityViewCommand m27724Z(int i) {
        return new C4776e(i);
    }

    /* renamed from: a0 */
    private void m27723a0(Context context) {
        if (this.f13183x == null) {
            return;
        }
        C2232g c2232g = new C2232g(this.f13183x);
        this.f13168i = c2232g;
        c2232g.m33929O(context);
        ColorStateList colorStateList = this.f13169j;
        if (colorStateList != null) {
            this.f13168i.m33919Y(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842801, typedValue, true);
        this.f13168i.setTint(typedValue.data);
    }

    /* renamed from: b0 */
    private void m27722b0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f13131A = ofFloat;
        ofFloat.setDuration(500L);
        this.f13131A.addUpdateListener(new C4773b());
    }

    /* renamed from: e0 */
    private int m27719e0(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    /* renamed from: g0 */
    private int m27717g0(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.f13134D;
                    }
                    throw new IllegalArgumentException("Invalid state to get top offset: " + i);
                }
                return this.f13149S;
            }
            return this.f13136F;
        }
        return m27718f0();
    }

    /* renamed from: h0 */
    private float m27716h0() {
        VelocityTracker velocityTracker = this.f13153W;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f13163d);
        return this.f13153W.getYVelocity(this.f13154X);
    }

    /* renamed from: j0 */
    private boolean m27713j0(V v) {
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C1365w0.m37225T(v)) {
            return true;
        }
        return false;
    }

    /* renamed from: l0 */
    private void m27711l0(V v, AccessibilityNodeInfoCompat.C1178a c1178a, int i) {
        C1365w0.m37193m0(v, c1178a, null, m27724Z(i));
    }

    /* renamed from: m0 */
    private void m27709m0() {
        this.f13154X = -1;
        VelocityTracker velocityTracker = this.f13153W;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f13153W = null;
        }
    }

    /* renamed from: n0 */
    private void m27708n0(C4778g c4778g) {
        int i = this.f13157a;
        if (i == 0) {
            return;
        }
        if (i == -1 || (i & 1) == 1) {
            this.f13164e = c4778g.f13197m;
        }
        if (i == -1 || (i & 2) == 2) {
            this.f13159b = c4778g.f13198n;
        }
        if (i == -1 || (i & 4) == 4) {
            this.f13138H = c4778g.f13199o;
        }
        if (i == -1 || (i & 8) == 8) {
            this.f13139I = c4778g.f13200p;
        }
    }

    /* renamed from: o0 */
    private void m27706o0(V v, Runnable runnable) {
        if (m27713j0(v)) {
            v.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: A */
    public boolean mo27761A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.f13145O = 0;
        this.f13146P = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: A0 */
    public void m27760A0(boolean z) {
        this.f13139I = z;
    }

    /* renamed from: B0 */
    public void m27759B0(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2) {
            if (!this.f13138H && i == 5) {
                Log.w("BottomSheetBehavior", "Cannot set state: " + i);
                return;
            }
            if (i == 6 && this.f13159b && m27717g0(i) <= this.f13133C) {
                i2 = 3;
            } else {
                i2 = i;
            }
            WeakReference<V> weakReference = this.f13150T;
            if (weakReference != null && weakReference.get() != null) {
                V v = this.f13150T.get();
                m27706o0(v, new RunnableC4772a(v, i2));
                return;
            }
            m27757C0(i);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("STATE_");
        if (i == 1) {
            str = "DRAGGING";
        } else {
            str = "SETTLING";
        }
        sb2.append(str);
        sb2.append(" should not be set externally.");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x008b, code lost:
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f13136F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x00a7, code lost:
        if (java.lang.Math.abs(r3 - r2.f13134D) < java.lang.Math.abs(r3 - r2.f13136F)) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x00a9, code lost:
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0035, code lost:
        if (r4.getTop() <= r2.f13134D) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0065, code lost:
        if (java.lang.Math.abs(r3 - r2.f13133C) < java.lang.Math.abs(r3 - r2.f13136F)) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x007b, code lost:
        if (m27748H0() != false) goto L37;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo27758C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m27718f0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.m27757C0(r0)
            return
        Lf:
            boolean r3 = r2.m27712k0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference<android.view.View> r3 = r2.f13151U
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f13146P
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f13145O
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f13159b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f13134D
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f13138H
            if (r3 == 0) goto L49
            float r3 = r2.m27716h0()
            boolean r3 = r2.m27750G0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f13145O
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f13159b
            if (r1 == 0) goto L68
            int r5 = r2.f13133C
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f13136F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f13134D
            if (r3 >= r1) goto L7e
            int r1 = r2.f13136F
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.m27748H0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f13136F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f13159b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f13134D
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f13136F
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.m27744J0(r4, r0, r3)
            r2.f13146P = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.mo27758C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    /* renamed from: C0 */
    void m27757C0(int i) {
        V v;
        if (this.f13141K == i) {
            return;
        }
        this.f13141K = i;
        if (i == 4 || i == 3 || i == 6 || (this.f13138H && i == 5)) {
            this.f13142L = i;
        }
        WeakReference<V> weakReference = this.f13150T;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            m27738M0(true);
        } else if (i == 6 || i == 5 || i == 4) {
            m27738M0(false);
        }
        m27740L0(i);
        for (int i2 = 0; i2 < this.f13152V.size(); i2++) {
            this.f13152V.get(i2).m27679c(v, i);
        }
        m27742K0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: D */
    public boolean mo26457D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f13141K == 1 && actionMasked == 0) {
            return true;
        }
        if (m27752F0()) {
            this.f13143M.m36800F(motionEvent);
        }
        if (actionMasked == 0) {
            m27709m0();
        }
        if (this.f13153W == null) {
            this.f13153W = VelocityTracker.obtain();
        }
        this.f13153W.addMovement(motionEvent);
        if (m27752F0() && actionMasked == 2 && !this.f13144N && Math.abs(this.f13155Y - motionEvent.getY()) > this.f13143M.m36762z()) {
            this.f13143M.m36786b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f13144N;
    }

    /* renamed from: E0 */
    public boolean m27754E0(long j, float f) {
        return false;
    }

    /* renamed from: G0 */
    boolean m27750G0(View view, float f) {
        if (this.f13139I) {
            return true;
        }
        if (view.getTop() < this.f13136F) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.f13136F) / m27725Y() > 0.5f) {
            return true;
        }
        return false;
    }

    /* renamed from: H0 */
    public boolean m27748H0() {
        return false;
    }

    /* renamed from: I0 */
    public boolean m27746I0() {
        return true;
    }

    /* renamed from: c0 */
    void m27721c0(int i) {
        float f;
        float f2;
        V v = this.f13150T.get();
        if (v != null && !this.f13152V.isEmpty()) {
            int i2 = this.f13136F;
            if (i <= i2 && i2 != m27718f0()) {
                int i3 = this.f13136F;
                f = i3 - i;
                f2 = i3 - m27718f0();
            } else {
                int i4 = this.f13136F;
                f = i4 - i;
                f2 = this.f13149S - i4;
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.f13152V.size(); i5++) {
                this.f13152V.get(i5).m27680b(v, f3);
            }
        }
    }

    /* renamed from: d0 */
    View m27720d0(View view) {
        if (C1365w0.m37223V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View m27720d0 = m27720d0(viewGroup.getChildAt(i));
                if (m27720d0 != null) {
                    return m27720d0;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: f0 */
    public int m27718f0() {
        int i;
        if (this.f13159b) {
            return this.f13133C;
        }
        int i2 = this.f13132B;
        if (this.f13177r) {
            i = 0;
        } else {
            i = this.f13182w;
        }
        return Math.max(i2, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: g */
    public void mo26458g(CoordinatorLayout.C0685f c0685f) {
        super.mo26458g(c0685f);
        this.f13150T = null;
        this.f13143M = null;
    }

    /* renamed from: i0 */
    public boolean m27715i0() {
        return this.f13173n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: j */
    public void mo27714j() {
        super.mo27714j();
        this.f13150T = null;
        this.f13143M = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: k */
    public boolean mo26796k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        ViewDragHelper viewDragHelper;
        if (v.isShown() && this.f13140J) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                m27709m0();
            }
            if (this.f13153W == null) {
                this.f13153W = VelocityTracker.obtain();
            }
            this.f13153W.addMovement(motionEvent);
            View view2 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.f13156Z = false;
                    this.f13154X = -1;
                    if (this.f13144N) {
                        this.f13144N = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.f13155Y = (int) motionEvent.getY();
                if (this.f13141K != 2) {
                    WeakReference<View> weakReference = this.f13151U;
                    if (weakReference != null) {
                        view = weakReference.get();
                    } else {
                        view = null;
                    }
                    if (view != null && coordinatorLayout.m39188v(view, x, this.f13155Y)) {
                        this.f13154X = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.f13156Z = true;
                    }
                }
                if (this.f13154X == -1 && !coordinatorLayout.m39188v(v, x, this.f13155Y)) {
                    z = true;
                } else {
                    z = false;
                }
                this.f13144N = z;
            }
            if (!this.f13144N && (viewDragHelper = this.f13143M) != null && viewDragHelper.m36790P(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.f13151U;
            if (weakReference2 != null) {
                view2 = weakReference2.get();
            }
            if (actionMasked != 2 || view2 == null || this.f13144N || this.f13141K == 1 || coordinatorLayout.m39188v(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f13143M == null || Math.abs(this.f13155Y - motionEvent.getY()) <= this.f13143M.m36762z()) {
                return false;
            }
            return true;
        }
        this.f13144N = true;
        return false;
    }

    /* renamed from: k0 */
    public boolean m27712k0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: l */
    public boolean mo26481l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean z;
        float f;
        if (C1365w0.m37170y(coordinatorLayout) && !C1365w0.m37170y(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.f13150T == null) {
            this.f13166g = coordinatorLayout.getResources().getDimensionPixelSize(C7482d.f20153b);
            m27756D0(v);
            this.f13150T = new WeakReference<>(v);
            C2232g c2232g = this.f13168i;
            if (c2232g != null) {
                C1365w0.m37177u0(v, c2232g);
                C2232g c2232g2 = this.f13168i;
                float f2 = this.f13137G;
                if (f2 == -1.0f) {
                    f2 = C1365w0.m37174w(v);
                }
                c2232g2.m33920X(f2);
                if (this.f13141K == 3) {
                    z = true;
                } else {
                    z = false;
                }
                this.f13184y = z;
                C2232g c2232g3 = this.f13168i;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                c2232g3.m33918Z(f);
            } else {
                ColorStateList colorStateList = this.f13169j;
                if (colorStateList != null) {
                    C1365w0.m37175v0(v, colorStateList);
                }
            }
            m27742K0();
            if (C1365w0.m37168z(v) == 0) {
                C1365w0.m37259A0(v, 1);
            }
        }
        if (this.f13143M == null) {
            this.f13143M = ViewDragHelper.m36773o(coordinatorLayout, this.f13162c0);
        }
        int top = v.getTop();
        coordinatorLayout.m39225C(v, i);
        this.f13148R = coordinatorLayout.getWidth();
        this.f13149S = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.f13147Q = height;
        int i2 = this.f13149S;
        int i3 = i2 - height;
        int i4 = this.f13182w;
        if (i3 < i4) {
            if (this.f13177r) {
                this.f13147Q = i2;
            } else {
                this.f13147Q = i2 - i4;
            }
        }
        this.f13133C = Math.max(0, i2 - this.f13147Q);
        m27726X();
        m27727W();
        int i5 = this.f13141K;
        if (i5 == 3) {
            C1365w0.m37215b0(v, m27718f0());
        } else if (i5 == 6) {
            C1365w0.m37215b0(v, this.f13134D);
        } else if (this.f13138H && i5 == 5) {
            C1365w0.m37215b0(v, this.f13149S);
        } else if (i5 == 4) {
            C1365w0.m37215b0(v, this.f13136F);
        } else if (i5 == 1 || i5 == 2) {
            C1365w0.m37215b0(v, top - v.getTop());
        }
        this.f13151U = new WeakReference<>(m27720d0(v));
        for (int i6 = 0; i6 < this.f13152V.size(); i6++) {
            this.f13152V.get(i6).m27681a(v);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: m */
    public boolean mo27710m(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(m27719e0(i, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.f13170k, marginLayoutParams.width), m27719e0(i3, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.f13171l, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: o */
    public boolean mo27707o(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!m27712k0() || (weakReference = this.f13151U) == null || view != weakReference.get()) {
            return false;
        }
        if (this.f13141K == 3 && !super.mo27707o(coordinatorLayout, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    public void m27705p0(boolean z) {
        this.f13140J = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: q */
    public void mo27704q(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f13151U;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (m27712k0() && view != view2) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < m27718f0()) {
                int m27718f0 = top - m27718f0();
                iArr[1] = m27718f0;
                C1365w0.m37215b0(v, -m27718f0);
                m27757C0(3);
            } else if (!this.f13140J) {
                return;
            } else {
                iArr[1] = i2;
                C1365w0.m37215b0(v, -i2);
                m27757C0(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.f13136F;
            if (i4 > i5 && !this.f13138H) {
                int i6 = top - i5;
                iArr[1] = i6;
                C1365w0.m37215b0(v, -i6);
                m27757C0(4);
            } else if (!this.f13140J) {
                return;
            } else {
                iArr[1] = i2;
                C1365w0.m37215b0(v, -i2);
                m27757C0(1);
            }
        }
        m27721c0(v.getTop());
        this.f13145O = i2;
        this.f13146P = true;
    }

    /* renamed from: q0 */
    public void m27703q0(int i) {
        if (i >= 0) {
            this.f13132B = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    /* renamed from: r0 */
    public void m27702r0(boolean z) {
        int i;
        if (this.f13159b == z) {
            return;
        }
        this.f13159b = z;
        if (this.f13150T != null) {
            m27727W();
        }
        if (this.f13159b && this.f13141K == 6) {
            i = 3;
        } else {
            i = this.f13141K;
        }
        m27757C0(i);
        m27742K0();
    }

    /* renamed from: s0 */
    public void m27701s0(boolean z) {
        this.f13173n = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: t */
    public void mo27700t(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    /* renamed from: t0 */
    public void m27699t0(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.f13135E = f;
            if (this.f13150T != null) {
                m27726X();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    /* renamed from: u0 */
    public void m27698u0(boolean z) {
        if (this.f13138H != z) {
            this.f13138H = z;
            if (!z && this.f13141K == 5) {
                m27759B0(4);
            }
            m27742K0();
        }
    }

    /* renamed from: v0 */
    public void m27697v0(int i) {
        this.f13171l = i;
    }

    /* renamed from: w0 */
    public void m27696w0(int i) {
        this.f13170k = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: x */
    public void mo27695x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        C4778g c4778g = (C4778g) parcelable;
        super.mo27695x(coordinatorLayout, v, c4778g.m34884a());
        m27708n0(c4778g);
        int i = c4778g.f13196l;
        if (i != 1 && i != 2) {
            this.f13141K = i;
            this.f13142L = i;
            return;
        }
        this.f13141K = 4;
        this.f13142L = 4;
    }

    /* renamed from: x0 */
    public void m27694x0(int i) {
        m27692y0(i, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: y */
    public Parcelable mo27693y(CoordinatorLayout coordinatorLayout, V v) {
        return new C4778g(super.mo27693y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    /* renamed from: y0 */
    public final void m27692y0(int i, boolean z) {
        boolean z2 = true;
        if (i == -1) {
            if (!this.f13165f) {
                this.f13165f = true;
            }
            z2 = false;
        } else {
            if (this.f13165f || this.f13164e != i) {
                this.f13165f = false;
                this.f13164e = Math.max(0, i);
            }
            z2 = false;
        }
        if (z2) {
            m27736N0(z);
        }
    }

    /* renamed from: z0 */
    public void m27691z0(int i) {
        this.f13157a = i;
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4780h {

        /* renamed from: a */
        private int f13201a;

        /* renamed from: b */
        private boolean f13202b;

        /* renamed from: c */
        private final Runnable f13203c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class RunnableC4781a implements Runnable {
            RunnableC4781a() {
                C4780h.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4780h.this.f13202b = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.f13143M;
                if (viewDragHelper != null && viewDragHelper.m36775m(true)) {
                    C4780h c4780h = C4780h.this;
                    c4780h.m27673c(c4780h.f13201a);
                    return;
                }
                C4780h c4780h2 = C4780h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f13141K == 2) {
                    bottomSheetBehavior.m27757C0(c4780h2.f13201a);
                }
            }
        }

        private C4780h() {
            BottomSheetBehavior.this = r1;
            this.f13203c = new RunnableC4781a();
        }

        /* renamed from: c */
        void m27673c(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.f13150T;
            if (weakReference != null && weakReference.get() != null) {
                this.f13201a = i;
                if (!this.f13202b) {
                    C1365w0.m37201i0(BottomSheetBehavior.this.f13150T.get(), this.f13203c);
                    this.f13202b = true;
                }
            }
        }

        /* synthetic */ C4780h(BottomSheetBehavior bottomSheetBehavior, RunnableC4772a runnableC4772a) {
            this();
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4778g extends AbstractC1964a {
        public static final Parcelable.Creator<C4778g> CREATOR = new C4779a();

        /* renamed from: l */
        final int f13196l;

        /* renamed from: m */
        int f13197m;

        /* renamed from: n */
        boolean f13198n;

        /* renamed from: o */
        boolean f13199o;

        /* renamed from: p */
        boolean f13200p;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4779a implements Parcelable.ClassLoaderCreator<C4778g> {
            C4779a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4778g createFromParcel(Parcel parcel) {
                return new C4778g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4778g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4778g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4778g[] newArray(int i) {
                return new C4778g[i];
            }
        }

        public C4778g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13196l = parcel.readInt();
            this.f13197m = parcel.readInt();
            this.f13198n = parcel.readInt() == 1;
            this.f13199o = parcel.readInt() == 1;
            this.f13200p = parcel.readInt() == 1;
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13196l);
            parcel.writeInt(this.f13197m);
            parcel.writeInt(this.f13198n ? 1 : 0);
            parcel.writeInt(this.f13199o ? 1 : 0);
            parcel.writeInt(this.f13200p ? 1 : 0);
        }

        public C4778g(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f13196l = bottomSheetBehavior.f13141K;
            this.f13197m = ((BottomSheetBehavior) bottomSheetBehavior).f13164e;
            this.f13198n = ((BottomSheetBehavior) bottomSheetBehavior).f13159b;
            this.f13199o = bottomSheetBehavior.f13138H;
            this.f13200p = ((BottomSheetBehavior) bottomSheetBehavior).f13139I;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.f13157a = 0;
        this.f13159b = true;
        this.f13161c = false;
        this.f13170k = -1;
        this.f13171l = -1;
        this.f13185z = new C4780h(this, null);
        this.f13135E = 0.5f;
        this.f13137G = -1.0f;
        this.f13140J = true;
        this.f13141K = 4;
        this.f13142L = 4;
        this.f13152V = new ArrayList<>();
        this.f13160b0 = -1;
        this.f13162c0 = new C4775d();
        this.f13167h = context.getResources().getDimensionPixelSize(C7482d.f20142M);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7489k.f20406P);
        int i2 = C7489k.f20438T;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f13169j = C13957c.m1089a(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(C7489k.f20571k0)) {
            this.f13183x = C2239k.m33870e(context, attributeSet, C7480b.f20100c, f13130d0).m33831m();
        }
        m27723a0(context);
        m27722b0();
        this.f13137G = obtainStyledAttributes.getDimension(C7489k.f20430S, -1.0f);
        int i3 = C7489k.f20414Q;
        if (obtainStyledAttributes.hasValue(i3)) {
            m27696w0(obtainStyledAttributes.getDimensionPixelSize(i3, -1));
        }
        int i4 = C7489k.f20422R;
        if (obtainStyledAttributes.hasValue(i4)) {
            m27697v0(obtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = C7489k.f20483Z;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            m27694x0(i);
        } else {
            m27694x0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        m27698u0(obtainStyledAttributes.getBoolean(C7489k.f20476Y, false));
        m27701s0(obtainStyledAttributes.getBoolean(C7489k.f20507c0, false));
        m27702r0(obtainStyledAttributes.getBoolean(C7489k.f20462W, true));
        m27760A0(obtainStyledAttributes.getBoolean(C7489k.f20499b0, false));
        m27705p0(obtainStyledAttributes.getBoolean(C7489k.f20446U, true));
        m27691z0(obtainStyledAttributes.getInt(C7489k.f20491a0, 0));
        m27699t0(obtainStyledAttributes.getFloat(C7489k.f20469X, 0.5f));
        int i6 = C7489k.f20454V;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
        if (peekValue2 != null && peekValue2.type == 16) {
            m27703q0(peekValue2.data);
        } else {
            m27703q0(obtainStyledAttributes.getDimensionPixelOffset(i6, 0));
        }
        this.f13174o = obtainStyledAttributes.getBoolean(C7489k.f20539g0, false);
        this.f13175p = obtainStyledAttributes.getBoolean(C7489k.f20547h0, false);
        this.f13176q = obtainStyledAttributes.getBoolean(C7489k.f20555i0, false);
        this.f13177r = obtainStyledAttributes.getBoolean(C7489k.f20563j0, true);
        this.f13178s = obtainStyledAttributes.getBoolean(C7489k.f20515d0, false);
        this.f13179t = obtainStyledAttributes.getBoolean(C7489k.f20523e0, false);
        this.f13180u = obtainStyledAttributes.getBoolean(C7489k.f20531f0, false);
        obtainStyledAttributes.recycle();
        this.f13163d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}