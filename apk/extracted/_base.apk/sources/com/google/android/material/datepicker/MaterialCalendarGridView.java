package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1136d;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.C4911o;
import java.util.Calendar;
import java.util.Iterator;
import p155ia.C7484f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: j */
    private final Calendar f13397j;

    /* renamed from: k */
    private final boolean f13398k;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4807a extends C1170a {
        C4807a() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37586i0(null);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m27357a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter2().m27247i());
        } else if (i == 130) {
            setSelection(getAdapter2().m27254b());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* renamed from: c */
    private View m27355c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    /* renamed from: d */
    private static int m27354d(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    /* renamed from: e */
    private static boolean m27353e(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: b */
    public C4843m getAdapter2() {
        return (C4843m) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter2().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        int m27255a;
        int m27354d;
        int m27255a2;
        int m27354d2;
        int i;
        int i2;
        int i3;
        int i4;
        int left;
        int left2;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C4843m adapter2 = getAdapter2();
        InterfaceC4814d<?> interfaceC4814d = adapter2.f13512k;
        C4813c c4813c = adapter2.f13514m;
        int max = Math.max(adapter2.m27254b(), getFirstVisiblePosition());
        int min = Math.min(adapter2.m27247i(), getLastVisiblePosition());
        Long item = adapter2.getItem(max);
        Long item2 = adapter2.getItem(min);
        Iterator<C1136d<Long, Long>> it = interfaceC4814d.m27327w().iterator();
        while (it.hasNext()) {
            C1136d<Long, Long> next = it.next();
            Long l = next.f3508a;
            if (l != null) {
                if (next.f3509b != null) {
                    long longValue = l.longValue();
                    long longValue2 = next.f3509b.longValue();
                    if (!m27353e(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        boolean m26933e = C4911o.m26933e(this);
                        if (longValue < item.longValue()) {
                            if (adapter2.m27250f(max)) {
                                left2 = 0;
                            } else if (!m26933e) {
                                left2 = materialCalendarGridView.m27355c(max - 1).getRight();
                            } else {
                                left2 = materialCalendarGridView.m27355c(max - 1).getLeft();
                            }
                            m27354d = left2;
                            m27255a = max;
                        } else {
                            materialCalendarGridView.f13397j.setTimeInMillis(longValue);
                            m27255a = adapter2.m27255a(materialCalendarGridView.f13397j.get(5));
                            m27354d = m27354d(materialCalendarGridView.m27355c(m27255a));
                        }
                        if (longValue2 > item2.longValue()) {
                            if (adapter2.m27249g(min)) {
                                left = getWidth();
                            } else if (!m26933e) {
                                left = materialCalendarGridView.m27355c(min).getRight();
                            } else {
                                left = materialCalendarGridView.m27355c(min).getLeft();
                            }
                            m27354d2 = left;
                            m27255a2 = min;
                        } else {
                            materialCalendarGridView.f13397j.setTimeInMillis(longValue2);
                            m27255a2 = adapter2.m27255a(materialCalendarGridView.f13397j.get(5));
                            m27354d2 = m27354d(materialCalendarGridView.m27355c(m27255a2));
                        }
                        int itemId = (int) adapter2.getItemId(m27255a);
                        int i5 = max;
                        int i6 = min;
                        int itemId2 = (int) adapter2.getItemId(m27255a2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (numColumns + getNumColumns()) - 1;
                            View m27355c = materialCalendarGridView.m27355c(numColumns);
                            int top = m27355c.getTop() + c4813c.f13418a.m27335c();
                            C4843m c4843m = adapter2;
                            int bottom = m27355c.getBottom() - c4813c.f13418a.m27336b();
                            if (!m26933e) {
                                if (numColumns > m27255a) {
                                    i4 = 0;
                                } else {
                                    i4 = m27354d;
                                }
                                if (m27255a2 > numColumns2) {
                                    i3 = getWidth();
                                } else {
                                    i3 = m27354d2;
                                }
                            } else {
                                if (m27255a2 > numColumns2) {
                                    i = 0;
                                } else {
                                    i = m27354d2;
                                }
                                if (numColumns > m27255a) {
                                    i2 = getWidth();
                                } else {
                                    i2 = m27354d;
                                }
                                int i7 = i;
                                i3 = i2;
                                i4 = i7;
                            }
                            canvas.drawRect(i4, top, i3, bottom, c4813c.f13425h);
                            itemId++;
                            materialCalendarGridView = this;
                            it = it;
                            adapter2 = c4843m;
                        }
                        materialCalendarGridView = this;
                        max = i5;
                        min = i6;
                    }
                }
            } else {
                materialCalendarGridView = this;
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m27357a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter2().m27254b()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter2().m27254b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f13398k) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter2().m27254b()) {
            super.setSelection(getAdapter2().m27254b());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13397j = C4853t.m27217k();
        if (C4832i.m27276t(getContext())) {
            setNextFocusLeftId(C7484f.f20201a);
            setNextFocusRightId(C7484f.f20203c);
        }
        this.f13398k = C4832i.m27275u(getContext());
        C1365w0.m37185q0(this, new C4807a());
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C4843m) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C4843m.class.getCanonicalName()));
    }
}
