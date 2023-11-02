package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.widgets.C0654d;
import androidx.constraintlayout.solver.widgets.C0657e;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.ConstraintWidgetContainer;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.HashMap;
import p329s.C12319b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.1";
    SparseArray<View> mChildrenByIds;
    private ArrayList<AbstractC0673b> mConstraintHelpers;
    protected ConstraintLayoutStates mConstraintLayoutSpec;
    private ConstraintSet mConstraintSet;
    private int mConstraintSetId;
    private ConstraintsChangedListener mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds;
    protected boolean mDirtyHierarchy;
    private int mLastMeasureHeight;
    int mLastMeasureHeightMode;
    int mLastMeasureHeightSize;
    private int mLastMeasureWidth;
    int mLastMeasureWidthMode;
    int mLastMeasureWidthSize;
    protected ConstraintWidgetContainer mLayoutWidget;
    private int mMaxHeight;
    private int mMaxWidth;
    Measurer mMeasurer;
    private Metrics mMetrics;
    private int mMinHeight;
    private int mMinWidth;
    private int mOnMeasureHeightMeasureSpec;
    private int mOnMeasureWidthMeasureSpec;
    private int mOptimizationLevel;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class Measurer implements C12319b.InterfaceC12321b {

        /* renamed from: a */
        ConstraintLayout f2453a;

        /* renamed from: b */
        int f2454b;

        /* renamed from: c */
        int f2455c;

        /* renamed from: d */
        int f2456d;

        /* renamed from: e */
        int f2457e;

        /* renamed from: f */
        int f2458f;

        /* renamed from: g */
        int f2459g;

        public Measurer(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.f2453a = constraintLayout;
        }

        @Override // p329s.C12319b.InterfaceC12321b
        /* renamed from: a */
        public final void mo5496a() {
            int childCount = this.f2453a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2453a.getChildAt(i);
                if (childAt instanceof C0676d) {
                    ((C0676d) childAt).m39231a(this.f2453a);
                }
            }
            int size = this.f2453a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((AbstractC0673b) this.f2453a.mConstraintHelpers.get(i2)).m39237j(this.f2453a);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:221:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:248:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:252:0x012f  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:255:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:256:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:259:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:265:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x0150  */
        /* JADX WARN: Removed duplicated region for block: B:277:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x016e A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:293:0x0187  */
        /* JADX WARN: Removed duplicated region for block: B:299:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:300:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:302:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x01c7  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x01d4  */
        /* JADX WARN: Removed duplicated region for block: B:307:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:310:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:313:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:314:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:317:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:320:0x01f8 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:323:0x0204 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:326:0x020f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:332:0x021b  */
        /* JADX WARN: Removed duplicated region for block: B:334:0x0221  */
        /* JADX WARN: Removed duplicated region for block: B:337:0x0237  */
        /* JADX WARN: Removed duplicated region for block: B:338:0x0239  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x023f  */
        /* JADX WARN: Removed duplicated region for block: B:348:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:351:0x0253  */
        @Override // p329s.C12319b.InterfaceC12321b
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void mo5495b(androidx.constraintlayout.solver.widgets.ConstraintWidget r20, p329s.C12319b.C12320a r21) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.Measurer.mo5495b(androidx.constraintlayout.solver.widgets.ConstraintWidget, s.b$a):void");
        }

        /* renamed from: c */
        public void m39291c(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f2454b = i3;
            this.f2455c = i4;
            this.f2456d = i5;
            this.f2457e = i6;
            this.f2458f = i;
            this.f2459g = i2;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C0662a {

        /* renamed from: a */
        static final /* synthetic */ int[] f2461a;

        static {
            int[] iArr = new int[ConstraintWidget.EnumC0650b.values().length];
            f2461a = iArr;
            try {
                iArr[ConstraintWidget.EnumC0650b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2461a[ConstraintWidget.EnumC0650b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2461a[ConstraintWidget.EnumC0650b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2461a[ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = ViewDefaults.NUMBER_OF_LINES;
        this.mMaxHeight = ViewDefaults.NUMBER_OF_LINES;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2438n0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.m39405Z(this);
        this.mLayoutWidget.m39339c1(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0678f.f2779a1, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0678f.f2814f1) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C0678f.f2821g1) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C0678f.f2800d1) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C0678f.f2807e1) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C0678f.f2861m2) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C0678f.f2866n1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C0678f.f2854l1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.mConstraintSet = constraintSet;
                        constraintSet.m39271m(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.m39338d1(this.mOptimizationLevel);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo6609W();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).m39404a0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof C0674c)) {
                    this.mConstraintSet = ((C0674c) childAt2).getConstraintSet();
                }
            }
        }
        ConstraintSet constraintSet = this.mConstraintSet;
        if (constraintSet != null) {
            constraintSet.m39280d(this, true);
        }
        this.mLayoutWidget.m6610J0();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).m39235l(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof C0676d) {
                ((C0676d) childAt3).m39230b(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                this.mLayoutWidget.m6607a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    protected void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        float f;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i;
        layoutParams.m39292a();
        layoutParams.f2440o0 = false;
        constraintWidget.m39432A0(view.getVisibility());
        if (layoutParams.f2414b0) {
            constraintWidget.m39385m0(true);
            constraintWidget.m39432A0(8);
        }
        constraintWidget.m39405Z(view);
        if (view instanceof AbstractC0673b) {
            ((AbstractC0673b) view).mo39239h(constraintWidget, this.mLayoutWidget.m39344X0());
        }
        if (layoutParams.f2410Z) {
            C0657e c0657e = (C0657e) constraintWidget;
            int i2 = layoutParams.f2432k0;
            int i3 = layoutParams.f2434l0;
            float f2 = layoutParams.f2436m0;
            if (f2 != -1.0f) {
                c0657e.m39303N0(f2);
                return;
            } else if (i2 != -1) {
                c0657e.m39305L0(i2);
                return;
            } else if (i3 != -1) {
                c0657e.m39304M0(i3);
                return;
            } else {
                return;
            }
        }
        int i4 = layoutParams.f2418d0;
        int i5 = layoutParams.f2420e0;
        int i6 = layoutParams.f2422f0;
        int i7 = layoutParams.f2424g0;
        int i8 = layoutParams.f2426h0;
        int i9 = layoutParams.f2428i0;
        float f3 = layoutParams.f2430j0;
        int i10 = layoutParams.f2435m;
        if (i10 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i10);
            if (constraintWidget6 != null) {
                constraintWidget.m39393i(constraintWidget6, layoutParams.f2439o, layoutParams.f2437n);
            }
        } else {
            if (i4 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i4);
                if (constraintWidget7 != null) {
                    C0654d.EnumC0656b enumC0656b = C0654d.EnumC0656b.LEFT;
                    f = f3;
                    constraintWidget.m39411R(enumC0656b, constraintWidget7, enumC0656b, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                } else {
                    f = f3;
                }
            } else {
                f = f3;
                if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                    constraintWidget.m39411R(C0654d.EnumC0656b.LEFT, constraintWidget2, C0654d.EnumC0656b.RIGHT, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i8);
                }
            }
            if (i6 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i6);
                if (constraintWidget8 != null) {
                    constraintWidget.m39411R(C0654d.EnumC0656b.RIGHT, constraintWidget8, C0654d.EnumC0656b.LEFT, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
                }
            } else if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                C0654d.EnumC0656b enumC0656b2 = C0654d.EnumC0656b.RIGHT;
                constraintWidget.m39411R(enumC0656b2, constraintWidget3, enumC0656b2, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, i9);
            }
            int i11 = layoutParams.f2425h;
            if (i11 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i11);
                if (constraintWidget9 != null) {
                    C0654d.EnumC0656b enumC0656b3 = C0654d.EnumC0656b.TOP;
                    constraintWidget.m39411R(enumC0656b3, constraintWidget9, enumC0656b3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2446u);
                }
            } else {
                int i12 = layoutParams.f2427i;
                if (i12 != -1 && (constraintWidget4 = sparseArray.get(i12)) != null) {
                    constraintWidget.m39411R(C0654d.EnumC0656b.TOP, constraintWidget4, C0654d.EnumC0656b.BOTTOM, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, layoutParams.f2446u);
                }
            }
            int i13 = layoutParams.f2429j;
            if (i13 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i13);
                if (constraintWidget10 != null) {
                    constraintWidget.m39411R(C0654d.EnumC0656b.BOTTOM, constraintWidget10, C0654d.EnumC0656b.TOP, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2448w);
                }
            } else {
                int i14 = layoutParams.f2431k;
                if (i14 != -1 && (constraintWidget5 = sparseArray.get(i14)) != null) {
                    C0654d.EnumC0656b enumC0656b4 = C0654d.EnumC0656b.BOTTOM;
                    constraintWidget.m39411R(enumC0656b4, constraintWidget5, enumC0656b4, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, layoutParams.f2448w);
                }
            }
            int i15 = layoutParams.f2433l;
            if (i15 != -1) {
                View view2 = this.mChildrenByIds.get(i15);
                ConstraintWidget constraintWidget11 = sparseArray.get(layoutParams.f2433l);
                if (constraintWidget11 != null && view2 != null && (view2.getLayoutParams() instanceof LayoutParams)) {
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams.f2409Y = true;
                    layoutParams2.f2409Y = true;
                    C0654d.EnumC0656b enumC0656b5 = C0654d.EnumC0656b.BASELINE;
                    constraintWidget.mo39299k(enumC0656b5).m39322a(constraintWidget11.mo39299k(enumC0656b5), 0, -1, true);
                    constraintWidget.m39400d0(true);
                    layoutParams2.f2438n0.m39400d0(true);
                    constraintWidget.mo39299k(C0654d.EnumC0656b.TOP).m39312k();
                    constraintWidget.mo39299k(C0654d.EnumC0656b.BOTTOM).m39312k();
                }
            }
            float f4 = f;
            if (f4 >= 0.0f) {
                constraintWidget.m39397f0(f4);
            }
            float f5 = layoutParams.f2385A;
            if (f5 >= 0.0f) {
                constraintWidget.m39369u0(f5);
            }
        }
        if (z && ((i = layoutParams.f2401Q) != -1 || layoutParams.f2402R != -1)) {
            constraintWidget.m39373s0(i, layoutParams.f2402R);
        }
        if (!layoutParams.f2407W) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                if (layoutParams.f2404T) {
                    constraintWidget.m39392i0(ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.m39392i0(ConstraintWidget.EnumC0650b.MATCH_PARENT);
                }
                constraintWidget.mo39299k(C0654d.EnumC0656b.LEFT).f2347e = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                constraintWidget.mo39299k(C0654d.EnumC0656b.RIGHT).f2347e = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else {
                constraintWidget.m39392i0(ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT);
                constraintWidget.m39430B0(0);
            }
        } else {
            constraintWidget.m39392i0(ConstraintWidget.EnumC0650b.FIXED);
            constraintWidget.m39430B0(((ViewGroup.MarginLayoutParams) layoutParams).width);
            if (((ViewGroup.MarginLayoutParams) layoutParams).width == -2) {
                constraintWidget.m39392i0(ConstraintWidget.EnumC0650b.WRAP_CONTENT);
            }
        }
        if (!layoutParams.f2408X) {
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                if (layoutParams.f2405U) {
                    constraintWidget.m39363x0(ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT);
                } else {
                    constraintWidget.m39363x0(ConstraintWidget.EnumC0650b.MATCH_PARENT);
                }
                constraintWidget.mo39299k(C0654d.EnumC0656b.TOP).f2347e = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                constraintWidget.mo39299k(C0654d.EnumC0656b.BOTTOM).f2347e = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            } else {
                constraintWidget.m39363x0(ConstraintWidget.EnumC0650b.MATCH_CONSTRAINT);
                constraintWidget.m39398e0(0);
            }
        } else {
            constraintWidget.m39363x0(ConstraintWidget.EnumC0650b.FIXED);
            constraintWidget.m39398e0(((ViewGroup.MarginLayoutParams) layoutParams).height);
            if (((ViewGroup.MarginLayoutParams) layoutParams).height == -2) {
                constraintWidget.m39363x0(ConstraintWidget.EnumC0650b.WRAP_CONTENT);
            }
        }
        constraintWidget.m39403b0(layoutParams.f2386B);
        constraintWidget.m39389k0(layoutParams.f2389E);
        constraintWidget.m39359z0(layoutParams.f2390F);
        constraintWidget.m39396g0(layoutParams.f2391G);
        constraintWidget.m39367v0(layoutParams.f2392H);
        constraintWidget.m39390j0(layoutParams.f2393I, layoutParams.f2395K, layoutParams.f2397M, layoutParams.f2399O);
        constraintWidget.m39361y0(layoutParams.f2394J, layoutParams.f2396L, layoutParams.f2398N, layoutParams.f2400P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0673b> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).m39236k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(Metrics metrics) {
        this.mMetrics = metrics;
        this.mLayoutWidget.m39350R0(metrics);
    }

    @Override // android.view.View
    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.mDesignIds;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.mDesignIds.get(str);
            }
            return null;
        }
        return null;
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.m39348T0();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f2438n0;
    }

    protected boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
                return;
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
                return;
            }
        }
        this.mConstraintLayoutSpec = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f2438n0;
            if ((childAt.getVisibility() != 8 || layoutParams.f2410Z || layoutParams.f2412a0 || layoutParams.f2416c0 || isInEditMode) && !layoutParams.f2414b0) {
                int m39414O = constraintWidget.m39414O();
                int m39413P = constraintWidget.m39413P();
                int m39415N = constraintWidget.m39415N() + m39414O;
                int m39372t = constraintWidget.m39372t() + m39413P;
                childAt.layout(m39414O, m39413P, m39415N, m39372t);
                if ((childAt instanceof C0676d) && (content = ((C0676d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(m39414O, m39413P, m39415N, m39372t);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo39238i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.m39337e1(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                this.mLayoutWidget.m39335g1();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.m39415N(), this.mLayoutWidget.m39372t(), this.mLayoutWidget.m39343Y0(), this.mLayoutWidget.m39345W0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C0657e)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C0657e c0657e = new C0657e();
            layoutParams.f2438n0 = c0657e;
            layoutParams.f2410Z = true;
            c0657e.m39302O0(layoutParams.f2403S);
        }
        if (view instanceof AbstractC0673b) {
            AbstractC0673b abstractC0673b = (AbstractC0673b) view;
            abstractC0673b.m39234m();
            ((LayoutParams) view.getLayoutParams()).f2412a0 = true;
            if (!this.mConstraintHelpers.contains(abstractC0673b)) {
                this.mConstraintHelpers.add(abstractC0673b);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.m6611I0(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    protected void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new ConstraintLayoutStates(getContext(), this, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    protected void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.f2457e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + measurer.f2456d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    protected void resolveSystem(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.m39291c(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(constraintWidgetContainer, mode, i6, mode2, i7);
        constraintWidgetContainer.m39342Z0(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSet = constraintSet;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.mMaxHeight) {
            return;
        }
        this.mMaxHeight = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.mMaxWidth) {
            return;
        }
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.mMinHeight) {
            return;
        }
        this.mMinHeight = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.mMinWidth) {
            return;
        }
        this.mMinWidth = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        this.mConstraintsChangedListener = constraintsChangedListener;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m39288c(constraintsChangedListener);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.m39338d1(i);
    }

    protected void setSelfDimensionBehaviour(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2, int i3, int i4) {
        ConstraintWidget.EnumC0650b enumC0650b;
        Measurer measurer = this.mMeasurer;
        int i5 = measurer.f2457e;
        int i6 = measurer.f2456d;
        ConstraintWidget.EnumC0650b enumC0650b2 = ConstraintWidget.EnumC0650b.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i != 0) {
                if (i != 1073741824) {
                    enumC0650b = enumC0650b2;
                    i2 = 0;
                } else {
                    i2 = Math.min(this.mMaxWidth - i6, i2);
                    enumC0650b = enumC0650b2;
                }
            } else {
                enumC0650b = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
                i2 = 0;
            }
        } else {
            enumC0650b = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 != 0) {
                if (i3 == 1073741824) {
                    i4 = Math.min(this.mMaxHeight - i5, i4);
                }
                i4 = 0;
            } else {
                enumC0650b2 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
                i4 = 0;
            }
        } else {
            enumC0650b2 = ConstraintWidget.EnumC0650b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (i2 != constraintWidgetContainer.m39415N() || i4 != constraintWidgetContainer.m39372t()) {
            constraintWidgetContainer.m39346V0();
        }
        constraintWidgetContainer.m39428C0(0);
        constraintWidgetContainer.m39426D0(0);
        constraintWidgetContainer.m39379p0(this.mMaxWidth - i6);
        constraintWidgetContainer.m39381o0(this.mMaxHeight - i5);
        constraintWidgetContainer.m39375r0(0);
        constraintWidgetContainer.m39377q0(0);
        constraintWidgetContainer.m39392i0(enumC0650b);
        constraintWidgetContainer.m39430B0(i2);
        constraintWidgetContainer.m39363x0(enumC0650b2);
        constraintWidgetContainer.m39398e0(i4);
        constraintWidgetContainer.m39375r0(this.mMinWidth - i6);
        constraintWidgetContainer.m39377q0(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.m39287d(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = ViewDefaults.NUMBER_OF_LINES;
        this.mMaxHeight = ViewDefaults.NUMBER_OF_LINES;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = ViewDefaults.NUMBER_OF_LINES;
        this.mMaxHeight = ViewDefaults.NUMBER_OF_LINES;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mChildrenByIds = new SparseArray<>();
        this.mConstraintHelpers = new ArrayList<>(4);
        this.mLayoutWidget = new ConstraintWidgetContainer();
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mMaxWidth = ViewDefaults.NUMBER_OF_LINES;
        this.mMaxHeight = ViewDefaults.NUMBER_OF_LINES;
        this.mDirtyHierarchy = true;
        this.mOptimizationLevel = 263;
        this.mConstraintSet = null;
        this.mConstraintLayoutSpec = null;
        this.mConstraintSetId = -1;
        this.mDesignIds = new HashMap<>();
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
        this.mTempMapIdToWidget = new SparseArray<>();
        this.mMeasurer = new Measurer(this);
        this.mOnMeasureWidthMeasureSpec = 0;
        this.mOnMeasureHeightMeasureSpec = 0;
        init(attributeSet, i, i2);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public float f2385A;

        /* renamed from: B */
        public String f2386B;

        /* renamed from: C */
        float f2387C;

        /* renamed from: D */
        int f2388D;

        /* renamed from: E */
        public float f2389E;

        /* renamed from: F */
        public float f2390F;

        /* renamed from: G */
        public int f2391G;

        /* renamed from: H */
        public int f2392H;

        /* renamed from: I */
        public int f2393I;

        /* renamed from: J */
        public int f2394J;

        /* renamed from: K */
        public int f2395K;

        /* renamed from: L */
        public int f2396L;

        /* renamed from: M */
        public int f2397M;

        /* renamed from: N */
        public int f2398N;

        /* renamed from: O */
        public float f2399O;

        /* renamed from: P */
        public float f2400P;

        /* renamed from: Q */
        public int f2401Q;

        /* renamed from: R */
        public int f2402R;

        /* renamed from: S */
        public int f2403S;

        /* renamed from: T */
        public boolean f2404T;

        /* renamed from: U */
        public boolean f2405U;

        /* renamed from: V */
        public String f2406V;

        /* renamed from: W */
        boolean f2407W;

        /* renamed from: X */
        boolean f2408X;

        /* renamed from: Y */
        boolean f2409Y;

        /* renamed from: Z */
        boolean f2410Z;

        /* renamed from: a */
        public int f2411a;

        /* renamed from: a0 */
        boolean f2412a0;

        /* renamed from: b */
        public int f2413b;

        /* renamed from: b0 */
        boolean f2414b0;

        /* renamed from: c */
        public float f2415c;

        /* renamed from: c0 */
        boolean f2416c0;

        /* renamed from: d */
        public int f2417d;

        /* renamed from: d0 */
        int f2418d0;

        /* renamed from: e */
        public int f2419e;

        /* renamed from: e0 */
        int f2420e0;

        /* renamed from: f */
        public int f2421f;

        /* renamed from: f0 */
        int f2422f0;

        /* renamed from: g */
        public int f2423g;

        /* renamed from: g0 */
        int f2424g0;

        /* renamed from: h */
        public int f2425h;

        /* renamed from: h0 */
        int f2426h0;

        /* renamed from: i */
        public int f2427i;

        /* renamed from: i0 */
        int f2428i0;

        /* renamed from: j */
        public int f2429j;

        /* renamed from: j0 */
        float f2430j0;

        /* renamed from: k */
        public int f2431k;

        /* renamed from: k0 */
        int f2432k0;

        /* renamed from: l */
        public int f2433l;

        /* renamed from: l0 */
        int f2434l0;

        /* renamed from: m */
        public int f2435m;

        /* renamed from: m0 */
        float f2436m0;

        /* renamed from: n */
        public int f2437n;

        /* renamed from: n0 */
        ConstraintWidget f2438n0;

        /* renamed from: o */
        public float f2439o;

        /* renamed from: o0 */
        public boolean f2440o0;

        /* renamed from: p */
        public int f2441p;

        /* renamed from: q */
        public int f2442q;

        /* renamed from: r */
        public int f2443r;

        /* renamed from: s */
        public int f2444s;

        /* renamed from: t */
        public int f2445t;

        /* renamed from: u */
        public int f2446u;

        /* renamed from: v */
        public int f2447v;

        /* renamed from: w */
        public int f2448w;

        /* renamed from: x */
        public int f2449x;

        /* renamed from: y */
        public int f2450y;

        /* renamed from: z */
        public float f2451z;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0661a {

            /* renamed from: a */
            public static final SparseIntArray f2452a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f2452a = sparseIntArray;
                sparseIntArray.append(C0678f.f2695M1, 8);
                sparseIntArray.append(C0678f.f2701N1, 9);
                sparseIntArray.append(C0678f.f2713P1, 10);
                sparseIntArray.append(C0678f.f2719Q1, 11);
                sparseIntArray.append(C0678f.f2755W1, 12);
                sparseIntArray.append(C0678f.f2749V1, 13);
                sparseIntArray.append(C0678f.f2908u1, 14);
                sparseIntArray.append(C0678f.f2902t1, 15);
                sparseIntArray.append(C0678f.f2890r1, 16);
                sparseIntArray.append(C0678f.f2914v1, 2);
                sparseIntArray.append(C0678f.f2926x1, 3);
                sparseIntArray.append(C0678f.f2920w1, 4);
                sparseIntArray.append(C0678f.f2808e2, 49);
                sparseIntArray.append(C0678f.f2815f2, 50);
                sparseIntArray.append(C0678f.f2629B1, 5);
                sparseIntArray.append(C0678f.f2635C1, 6);
                sparseIntArray.append(C0678f.f2641D1, 7);
                sparseIntArray.append(C0678f.f2786b1, 1);
                sparseIntArray.append(C0678f.f2725R1, 17);
                sparseIntArray.append(C0678f.f2731S1, 18);
                sparseIntArray.append(C0678f.f2623A1, 19);
                sparseIntArray.append(C0678f.f2938z1, 20);
                sparseIntArray.append(C0678f.f2836i2, 21);
                sparseIntArray.append(C0678f.f2855l2, 22);
                sparseIntArray.append(C0678f.f2843j2, 23);
                sparseIntArray.append(C0678f.f2822g2, 24);
                sparseIntArray.append(C0678f.f2849k2, 25);
                sparseIntArray.append(C0678f.f2829h2, 26);
                sparseIntArray.append(C0678f.f2671I1, 29);
                sparseIntArray.append(C0678f.f2761X1, 30);
                sparseIntArray.append(C0678f.f2932y1, 44);
                sparseIntArray.append(C0678f.f2683K1, 45);
                sparseIntArray.append(C0678f.f2773Z1, 46);
                sparseIntArray.append(C0678f.f2677J1, 47);
                sparseIntArray.append(C0678f.f2767Y1, 48);
                sparseIntArray.append(C0678f.f2878p1, 27);
                sparseIntArray.append(C0678f.f2872o1, 28);
                sparseIntArray.append(C0678f.f2780a2, 31);
                sparseIntArray.append(C0678f.f2647E1, 32);
                sparseIntArray.append(C0678f.f2794c2, 33);
                sparseIntArray.append(C0678f.f2787b2, 34);
                sparseIntArray.append(C0678f.f2801d2, 35);
                sparseIntArray.append(C0678f.f2659G1, 36);
                sparseIntArray.append(C0678f.f2653F1, 37);
                sparseIntArray.append(C0678f.f2665H1, 38);
                sparseIntArray.append(C0678f.f2689L1, 39);
                sparseIntArray.append(C0678f.f2743U1, 40);
                sparseIntArray.append(C0678f.f2707O1, 41);
                sparseIntArray.append(C0678f.f2896s1, 42);
                sparseIntArray.append(C0678f.f2884q1, 43);
                sparseIntArray.append(C0678f.f2737T1, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.f2411a = -1;
            this.f2413b = -1;
            this.f2415c = -1.0f;
            this.f2417d = -1;
            this.f2419e = -1;
            this.f2421f = -1;
            this.f2423g = -1;
            this.f2425h = -1;
            this.f2427i = -1;
            this.f2429j = -1;
            this.f2431k = -1;
            this.f2433l = -1;
            this.f2435m = -1;
            this.f2437n = 0;
            this.f2439o = 0.0f;
            this.f2441p = -1;
            this.f2442q = -1;
            this.f2443r = -1;
            this.f2444s = -1;
            this.f2445t = -1;
            this.f2446u = -1;
            this.f2447v = -1;
            this.f2448w = -1;
            this.f2449x = -1;
            this.f2450y = -1;
            this.f2451z = 0.5f;
            this.f2385A = 0.5f;
            this.f2386B = null;
            this.f2387C = 0.0f;
            this.f2388D = 1;
            this.f2389E = -1.0f;
            this.f2390F = -1.0f;
            this.f2391G = 0;
            this.f2392H = 0;
            this.f2393I = 0;
            this.f2394J = 0;
            this.f2395K = 0;
            this.f2396L = 0;
            this.f2397M = 0;
            this.f2398N = 0;
            this.f2399O = 1.0f;
            this.f2400P = 1.0f;
            this.f2401Q = -1;
            this.f2402R = -1;
            this.f2403S = -1;
            this.f2404T = false;
            this.f2405U = false;
            this.f2406V = null;
            this.f2407W = true;
            this.f2408X = true;
            this.f2409Y = false;
            this.f2410Z = false;
            this.f2412a0 = false;
            this.f2414b0 = false;
            this.f2416c0 = false;
            this.f2418d0 = -1;
            this.f2420e0 = -1;
            this.f2422f0 = -1;
            this.f2424g0 = -1;
            this.f2426h0 = -1;
            this.f2428i0 = -1;
            this.f2430j0 = 0.5f;
            this.f2438n0 = new ConstraintWidget();
            this.f2440o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0678f.f2779a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C0661a.f2452a.get(index);
                switch (i3) {
                    case 1:
                        this.f2403S = obtainStyledAttributes.getInt(index, this.f2403S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f2435m);
                        this.f2435m = resourceId;
                        if (resourceId == -1) {
                            this.f2435m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f2437n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2437n);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f2439o) % 360.0f;
                        this.f2439o = f;
                        if (f < 0.0f) {
                            this.f2439o = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f2411a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2411a);
                        break;
                    case 6:
                        this.f2413b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2413b);
                        break;
                    case 7:
                        this.f2415c = obtainStyledAttributes.getFloat(index, this.f2415c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f2417d);
                        this.f2417d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f2417d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f2419e);
                        this.f2419e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f2419e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f2421f);
                        this.f2421f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f2421f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f2423g);
                        this.f2423g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f2423g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f2425h);
                        this.f2425h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f2425h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f2427i);
                        this.f2427i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f2427i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f2429j);
                        this.f2429j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f2429j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f2431k);
                        this.f2431k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f2431k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f2433l);
                        this.f2433l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f2433l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f2441p);
                        this.f2441p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f2441p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f2442q);
                        this.f2442q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f2442q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f2443r);
                        this.f2443r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f2443r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f2444s);
                        this.f2444s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f2444s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f2445t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2445t);
                        break;
                    case 22:
                        this.f2446u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2446u);
                        break;
                    case 23:
                        this.f2447v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2447v);
                        break;
                    case 24:
                        this.f2448w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2448w);
                        break;
                    case 25:
                        this.f2449x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2449x);
                        break;
                    case 26:
                        this.f2450y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2450y);
                        break;
                    case 27:
                        this.f2404T = obtainStyledAttributes.getBoolean(index, this.f2404T);
                        break;
                    case 28:
                        this.f2405U = obtainStyledAttributes.getBoolean(index, this.f2405U);
                        break;
                    case 29:
                        this.f2451z = obtainStyledAttributes.getFloat(index, this.f2451z);
                        break;
                    case 30:
                        this.f2385A = obtainStyledAttributes.getFloat(index, this.f2385A);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.f2393I = i4;
                        if (i4 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.f2394J = i5;
                        if (i5 == 1) {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f2395K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2395K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2395K) == -2) {
                                this.f2395K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2397M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2397M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2397M) == -2) {
                                this.f2397M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f2399O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2399O));
                        this.f2393I = 2;
                        break;
                    case 36:
                        try {
                            this.f2396L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2396L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2396L) == -2) {
                                this.f2396L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2398N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2398N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2398N) == -2) {
                                this.f2398N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f2400P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2400P));
                        this.f2394J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f2386B = string;
                                this.f2387C = Float.NaN;
                                this.f2388D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f2386B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.f2386B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f2388D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f2388D = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.f2386B.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.f2386B.substring(i, indexOf2);
                                        String substring3 = this.f2386B.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f2388D == 1) {
                                                        this.f2387C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f2387C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.f2386B.substring(i);
                                        if (substring4.length() > 0) {
                                            this.f2387C = Float.parseFloat(substring4);
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                                break;
                            case 45:
                                this.f2389E = obtainStyledAttributes.getFloat(index, this.f2389E);
                                continue;
                            case 46:
                                this.f2390F = obtainStyledAttributes.getFloat(index, this.f2390F);
                                continue;
                            case 47:
                                this.f2391G = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.f2392H = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.f2401Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2401Q);
                                continue;
                            case 50:
                                this.f2402R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2402R);
                                continue;
                            case 51:
                                this.f2406V = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            m39292a();
        }

        /* renamed from: a */
        public void m39292a() {
            this.f2410Z = false;
            this.f2407W = true;
            this.f2408X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f2404T) {
                this.f2407W = false;
                if (this.f2393I == 0) {
                    this.f2393I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f2405U) {
                this.f2408X = false;
                if (this.f2394J == 0) {
                    this.f2394J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f2407W = false;
                if (i == 0 && this.f2393I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f2404T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f2408X = false;
                if (i2 == 0 && this.f2394J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f2405U = true;
                }
            }
            if (this.f2415c != -1.0f || this.f2411a != -1 || this.f2413b != -1) {
                this.f2410Z = true;
                this.f2407W = true;
                this.f2408X = true;
                if (!(this.f2438n0 instanceof C0657e)) {
                    this.f2438n0 = new C0657e();
                }
                ((C0657e) this.f2438n0).m39302O0(this.f2403S);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:138:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:139:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @android.annotation.TargetApi(17)
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f2411a = -1;
            this.f2413b = -1;
            this.f2415c = -1.0f;
            this.f2417d = -1;
            this.f2419e = -1;
            this.f2421f = -1;
            this.f2423g = -1;
            this.f2425h = -1;
            this.f2427i = -1;
            this.f2429j = -1;
            this.f2431k = -1;
            this.f2433l = -1;
            this.f2435m = -1;
            this.f2437n = 0;
            this.f2439o = 0.0f;
            this.f2441p = -1;
            this.f2442q = -1;
            this.f2443r = -1;
            this.f2444s = -1;
            this.f2445t = -1;
            this.f2446u = -1;
            this.f2447v = -1;
            this.f2448w = -1;
            this.f2449x = -1;
            this.f2450y = -1;
            this.f2451z = 0.5f;
            this.f2385A = 0.5f;
            this.f2386B = null;
            this.f2387C = 0.0f;
            this.f2388D = 1;
            this.f2389E = -1.0f;
            this.f2390F = -1.0f;
            this.f2391G = 0;
            this.f2392H = 0;
            this.f2393I = 0;
            this.f2394J = 0;
            this.f2395K = 0;
            this.f2396L = 0;
            this.f2397M = 0;
            this.f2398N = 0;
            this.f2399O = 1.0f;
            this.f2400P = 1.0f;
            this.f2401Q = -1;
            this.f2402R = -1;
            this.f2403S = -1;
            this.f2404T = false;
            this.f2405U = false;
            this.f2406V = null;
            this.f2407W = true;
            this.f2408X = true;
            this.f2409Y = false;
            this.f2410Z = false;
            this.f2412a0 = false;
            this.f2414b0 = false;
            this.f2416c0 = false;
            this.f2418d0 = -1;
            this.f2420e0 = -1;
            this.f2422f0 = -1;
            this.f2424g0 = -1;
            this.f2426h0 = -1;
            this.f2428i0 = -1;
            this.f2430j0 = 0.5f;
            this.f2438n0 = new ConstraintWidget();
            this.f2440o0 = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2411a = -1;
            this.f2413b = -1;
            this.f2415c = -1.0f;
            this.f2417d = -1;
            this.f2419e = -1;
            this.f2421f = -1;
            this.f2423g = -1;
            this.f2425h = -1;
            this.f2427i = -1;
            this.f2429j = -1;
            this.f2431k = -1;
            this.f2433l = -1;
            this.f2435m = -1;
            this.f2437n = 0;
            this.f2439o = 0.0f;
            this.f2441p = -1;
            this.f2442q = -1;
            this.f2443r = -1;
            this.f2444s = -1;
            this.f2445t = -1;
            this.f2446u = -1;
            this.f2447v = -1;
            this.f2448w = -1;
            this.f2449x = -1;
            this.f2450y = -1;
            this.f2451z = 0.5f;
            this.f2385A = 0.5f;
            this.f2386B = null;
            this.f2387C = 0.0f;
            this.f2388D = 1;
            this.f2389E = -1.0f;
            this.f2390F = -1.0f;
            this.f2391G = 0;
            this.f2392H = 0;
            this.f2393I = 0;
            this.f2394J = 0;
            this.f2395K = 0;
            this.f2396L = 0;
            this.f2397M = 0;
            this.f2398N = 0;
            this.f2399O = 1.0f;
            this.f2400P = 1.0f;
            this.f2401Q = -1;
            this.f2402R = -1;
            this.f2403S = -1;
            this.f2404T = false;
            this.f2405U = false;
            this.f2406V = null;
            this.f2407W = true;
            this.f2408X = true;
            this.f2409Y = false;
            this.f2410Z = false;
            this.f2412a0 = false;
            this.f2414b0 = false;
            this.f2416c0 = false;
            this.f2418d0 = -1;
            this.f2420e0 = -1;
            this.f2422f0 = -1;
            this.f2424g0 = -1;
            this.f2426h0 = -1;
            this.f2428i0 = -1;
            this.f2430j0 = 0.5f;
            this.f2438n0 = new ConstraintWidget();
            this.f2440o0 = false;
        }
    }
}