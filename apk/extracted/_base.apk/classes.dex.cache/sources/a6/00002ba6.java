package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C1170a;
import androidx.core.view.C1363w;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import bb.C2226a;
import bb.C2239k;
import bb.InterfaceC2228c;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4911o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: t */
    private static final String f13223t = "MaterialButtonToggleGroup";

    /* renamed from: u */
    private static final int f13224u = C7488j.f20281r;

    /* renamed from: j */
    private final List<C4788c> f13225j;

    /* renamed from: k */
    private final C4790e f13226k;

    /* renamed from: l */
    private final LinkedHashSet<InterfaceC4789d> f13227l;

    /* renamed from: m */
    private final Comparator<MaterialButton> f13228m;

    /* renamed from: n */
    private Integer[] f13229n;

    /* renamed from: o */
    private boolean f13230o;

    /* renamed from: p */
    private boolean f13231p;

    /* renamed from: q */
    private boolean f13232q;

    /* renamed from: r */
    private final int f13233r;

    /* renamed from: s */
    private Set<Integer> f13234s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4786a implements Comparator<MaterialButton> {
        C4786a() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            if (compareTo2 != 0) {
                return compareTo2;
            }
            return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4787b extends C1170a {
        C4787b() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37584j0(AccessibilityNodeInfoCompat.C1181d.m37543b(0, 1, MaterialButtonToggleGroup.this.m27650i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4788c {

        /* renamed from: e */
        private static final InterfaceC2228c f13237e = new C2226a(0.0f);

        /* renamed from: a */
        InterfaceC2228c f13238a;

        /* renamed from: b */
        InterfaceC2228c f13239b;

        /* renamed from: c */
        InterfaceC2228c f13240c;

        /* renamed from: d */
        InterfaceC2228c f13241d;

        C4788c(InterfaceC2228c interfaceC2228c, InterfaceC2228c interfaceC2228c2, InterfaceC2228c interfaceC2228c3, InterfaceC2228c interfaceC2228c4) {
            this.f13238a = interfaceC2228c;
            this.f13239b = interfaceC2228c3;
            this.f13240c = interfaceC2228c4;
            this.f13241d = interfaceC2228c2;
        }

        /* renamed from: a */
        public static C4788c m27638a(C4788c c4788c) {
            InterfaceC2228c interfaceC2228c = f13237e;
            return new C4788c(interfaceC2228c, c4788c.f13241d, interfaceC2228c, c4788c.f13240c);
        }

        /* renamed from: b */
        public static C4788c m27637b(C4788c c4788c, View view) {
            return C4911o.m26933e(view) ? m27636c(c4788c) : m27635d(c4788c);
        }

        /* renamed from: c */
        public static C4788c m27636c(C4788c c4788c) {
            InterfaceC2228c interfaceC2228c = c4788c.f13238a;
            InterfaceC2228c interfaceC2228c2 = c4788c.f13241d;
            InterfaceC2228c interfaceC2228c3 = f13237e;
            return new C4788c(interfaceC2228c, interfaceC2228c2, interfaceC2228c3, interfaceC2228c3);
        }

        /* renamed from: d */
        public static C4788c m27635d(C4788c c4788c) {
            InterfaceC2228c interfaceC2228c = f13237e;
            return new C4788c(interfaceC2228c, interfaceC2228c, c4788c.f13239b, c4788c.f13240c);
        }

        /* renamed from: e */
        public static C4788c m27634e(C4788c c4788c, View view) {
            return C4911o.m26933e(view) ? m27635d(c4788c) : m27636c(c4788c);
        }

        /* renamed from: f */
        public static C4788c m27633f(C4788c c4788c) {
            InterfaceC2228c interfaceC2228c = c4788c.f13238a;
            InterfaceC2228c interfaceC2228c2 = f13237e;
            return new C4788c(interfaceC2228c, interfaceC2228c2, c4788c.f13239b, interfaceC2228c2);
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4789d {
        /* renamed from: a */
        void mo26498a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButtonToggleGroup$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4790e implements MaterialButton.InterfaceC4783b {
        private C4790e() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // com.google.android.material.button.MaterialButton.InterfaceC4783b
        /* renamed from: a */
        public void mo27632a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ C4790e(MaterialButtonToggleGroup materialButtonToggleGroup, C4786a c4786a) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20117t);
    }

    /* renamed from: c */
    private void m27656c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton m27651h = m27651h(i);
            int min = Math.min(m27651h.getStrokeWidth(), m27651h(i - 1).getStrokeWidth());
            LinearLayout.LayoutParams m27655d = m27655d(m27651h);
            if (getOrientation() == 0) {
                C1363w.m37270c(m27655d, 0);
                C1363w.m37269d(m27655d, -min);
                m27655d.topMargin = 0;
            } else {
                m27655d.bottomMargin = 0;
                m27655d.topMargin = -min;
                C1363w.m37269d(m27655d, 0);
            }
            m27651h.setLayoutParams(m27655d);
        }
        m27645n(firstVisibleChildIndex);
    }

    /* renamed from: d */
    private LinearLayout.LayoutParams m27655d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        return new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    /* renamed from: e */
    private void m27654e(int i, boolean z) {
        if (i == -1) {
            String str = f13223t;
            Log.e(str, "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f13234s);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f13231p && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (!z && hashSet.contains(Integer.valueOf(i))) {
            if (!this.f13232q || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        } else {
            return;
        }
        m27642q(hashSet);
    }

    /* renamed from: g */
    private void m27652g(int i, boolean z) {
        Iterator<InterfaceC4789d> it = this.f13227l.iterator();
        while (it.hasNext()) {
            it.next().mo26498a(this, i, z);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m27648k(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m27648k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m27648k(i2)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private MaterialButton m27651h(int i) {
        return (MaterialButton) getChildAt(i);
    }

    /* renamed from: i */
    public int m27650i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) == view) {
                return i;
            }
            if ((getChildAt(i2) instanceof MaterialButton) && m27648k(i2)) {
                i++;
            }
        }
        return -1;
    }

    /* renamed from: j */
    private C4788c m27649j(int i, int i2, int i3) {
        boolean z;
        C4788c c4788c = this.f13225j.get(i);
        if (i2 == i3) {
            return c4788c;
        }
        if (getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == i2) {
            if (z) {
                return C4788c.m27634e(c4788c, this);
            }
            return C4788c.m27633f(c4788c);
        } else if (i == i3) {
            if (z) {
                return C4788c.m27637b(c4788c, this);
            }
            return C4788c.m27638a(c4788c);
        } else {
            return null;
        }
    }

    /* renamed from: k */
    private boolean m27648k(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private void m27645n(int i) {
        if (getChildCount() != 0 && i != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) m27651h(i).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C1363w.m37270c(layoutParams, 0);
            C1363w.m37269d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    /* renamed from: o */
    private void m27644o(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.f13230o = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.f13230o = false;
        }
    }

    /* renamed from: p */
    private static void m27643p(C2239k.C2241b c2241b, C4788c c4788c) {
        if (c4788c == null) {
            c2241b.m33829o(0.0f);
        } else {
            c2241b.m33848B(c4788c.f13238a).m33824t(c4788c.f13241d).m33844F(c4788c.f13239b).m33820x(c4788c.f13240c);
        }
    }

    /* renamed from: q */
    private void m27642q(Set<Integer> set) {
        Set<Integer> set2 = this.f13234s;
        this.f13234s = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m27651h(i).getId();
            m27644o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                m27652g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    /* renamed from: r */
    private void m27641r() {
        TreeMap treeMap = new TreeMap(this.f13228m);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(m27651h(i), Integer.valueOf(i));
        }
        this.f13229n = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C1365w0.m37198k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f13226k);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(f13223t, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m27654e(materialButton.getId(), materialButton.isChecked());
        C2239k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f13225j.add(new C4788c(shapeAppearanceModel.m33857r(), shapeAppearanceModel.m33865j(), shapeAppearanceModel.m33855t(), shapeAppearanceModel.m33863l()));
        C1365w0.m37185q0(materialButton, new C4787b());
    }

    /* renamed from: b */
    public void m27657b(InterfaceC4789d interfaceC4789d) {
        this.f13227l.add(interfaceC4789d);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m27641r();
        super.dispatchDraw(canvas);
    }

    /* renamed from: f */
    public void m27653f() {
        m27642q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f13231p || this.f13234s.isEmpty()) {
            return -1;
        }
        return this.f13234s.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id2 = m27651h(i).getId();
            if (this.f13234s.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f13229n;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(f13223t, "Child order wasn't updated");
        return i2;
    }

    /* renamed from: l */
    public boolean m27647l() {
        return this.f13231p;
    }

    /* renamed from: m */
    public void m27646m(MaterialButton materialButton, boolean z) {
        if (this.f13230o) {
            return;
        }
        m27654e(materialButton.getId(), z);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f13233r;
        if (i != -1) {
            m27642q(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat m37614P0 = AccessibilityNodeInfoCompat.m37614P0(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (m27647l()) {
            i = 1;
        } else {
            i = 2;
        }
        m37614P0.m37586i0(AccessibilityNodeInfoCompat.C1180c.m37545b(1, visibleButtonCount, false, i));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        m27640s();
        m27656c();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f13225j.remove(indexOfChild);
        }
        m27640s();
        m27656c();
    }

    /* renamed from: s */
    void m27640s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton m27651h = m27651h(i);
            if (m27651h.getVisibility() != 8) {
                C2239k.C2241b m33853v = m27651h.getShapeAppearanceModel().m33853v();
                m27643p(m33853v, m27649j(i, firstVisibleChildIndex, lastVisibleChildIndex));
                m27651h.setShapeAppearanceModel(m33853v.m33831m());
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.f13232q = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.f13231p != z) {
            this.f13231p = z;
            m27653f();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f13224u
            android.content.Context r7 = p064db.C5810a.m24498c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f13225j = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f13226k = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f13227l = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f13228m = r7
            r7 = 0
            r6.f13230o = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f13234s = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = p155ia.C7489k.f20409P2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r9 = p155ia.C7489k.f20433S2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = p155ia.C7489k.f20417Q2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f13233r = r9
            int r9 = p155ia.C7489k.f20425R2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f13232q = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.C1365w0.m37259A0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}