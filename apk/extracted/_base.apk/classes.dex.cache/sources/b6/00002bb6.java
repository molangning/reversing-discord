package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.C4887a;
import com.google.android.material.internal.C4894e;
import java.util.List;
import java.util.Set;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ChipGroup extends C4894e {

    /* renamed from: t */
    private static final int f13322t = C7488j.f20275l;

    /* renamed from: n */
    private int f13323n;

    /* renamed from: o */
    private int f13324o;

    /* renamed from: p */
    private InterfaceC4803e f13325p;

    /* renamed from: q */
    private final C4887a<Chip> f13326q;

    /* renamed from: r */
    private final int f13327r;

    /* renamed from: s */
    private final ViewGroup$OnHierarchyChangeListenerC4804f f13328s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.chip.ChipGroup$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4799a implements C4887a.InterfaceC4889b {
        C4799a() {
            ChipGroup.this = r1;
        }

        @Override // com.google.android.material.internal.C4887a.InterfaceC4889b
        /* renamed from: a */
        public void mo27050a(Set<Integer> set) {
            if (ChipGroup.this.f13325p != null) {
                InterfaceC4803e interfaceC4803e = ChipGroup.this.f13325p;
                ChipGroup chipGroup = ChipGroup.this;
                interfaceC4803e.mo27498a(chipGroup, chipGroup.f13326q.m27060j(ChipGroup.this));
            }
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4800b implements InterfaceC4803e {
        C4800b(InterfaceC4802d interfaceC4802d) {
            ChipGroup.this = r1;
        }

        @Override // com.google.android.material.chip.ChipGroup.InterfaceC4803e
        /* renamed from: a */
        public void mo27498a(ChipGroup chipGroup, List<Integer> list) {
            if (!ChipGroup.this.f13326q.m27058l()) {
                return;
            }
            ChipGroup.this.getCheckedChipId();
            throw null;
        }
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4801c extends ViewGroup.MarginLayoutParams {
        public C4801c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C4801c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C4801c(int i, int i2) {
            super(i, i2);
        }
    }

    @Deprecated
    /* renamed from: com.google.android.material.chip.ChipGroup$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4802d {
    }

    /* renamed from: com.google.android.material.chip.ChipGroup$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4803e {
        /* renamed from: a */
        void mo27498a(ChipGroup chipGroup, List<Integer> list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.material.chip.ChipGroup$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ViewGroup$OnHierarchyChangeListenerC4804f implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: j */
        private ViewGroup.OnHierarchyChangeListener f13331j;

        private ViewGroup$OnHierarchyChangeListenerC4804f() {
            ChipGroup.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C1365w0.m37198k());
                }
                ChipGroup.this.f13326q.m27065e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13331j;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f13326q.m27056n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13331j;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ ViewGroup$OnHierarchyChangeListenerC4804f(ChipGroup chipGroup, C4799a c4799a) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20102e);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.C4894e
    /* renamed from: c */
    public boolean mo26977c() {
        return super.mo26977c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C4801c);
    }

    /* renamed from: g */
    public int m27500g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                if (((Chip) getChildAt(i2)) == view) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C4801c(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C4801c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f13326q.m27059k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f13326q.m27060j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f13323n;
    }

    public int getChipSpacingVertical() {
        return this.f13324o;
    }

    /* renamed from: h */
    public boolean m27499h() {
        return this.f13326q.m27058l();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f13327r;
        if (i != -1) {
            this.f13326q.m27064f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat m37614P0 = AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo);
        if (mo26977c()) {
            i = getChipCount();
        } else {
            i = -1;
        }
        int rowCount = getRowCount();
        if (m27499h()) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        m37614P0.m37586i0(AccessibilityNodeInfoCompat.C1180c.m37545b(rowCount, i, false, i2));
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.f13323n != i) {
            this.f13323n = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.f13324o != i) {
            this.f13324o = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(InterfaceC4802d interfaceC4802d) {
        if (interfaceC4802d == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new C4800b(interfaceC4802d));
        }
    }

    public void setOnCheckedStateChangeListener(InterfaceC4803e interfaceC4803e) {
        this.f13325p = interfaceC4803e;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f13328s.f13331j = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.f13326q.m27054p(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C4894e
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.f13326q.m27053q(z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f13322t
            android.content.Context r9 = p064db.C5810a.m24498c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f13326q = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f13328s = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = p155ia.C7489k.f20516d1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r11 = p155ia.C7489k.f20532f1
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = p155ia.C7489k.f20540g1
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = p155ia.C7489k.f20548h1
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = p155ia.C7489k.f20564j1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = p155ia.C7489k.f20572k1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = p155ia.C7489k.f20556i1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = p155ia.C7489k.f20524e1
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f13327r = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.m27055o(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.C1365w0.m37259A0(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C4801c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}