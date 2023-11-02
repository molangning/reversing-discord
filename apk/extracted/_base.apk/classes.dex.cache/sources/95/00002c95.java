package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.C0500d;
import androidx.appcompat.widget.C0583v0;
import com.google.android.material.internal.C4896g;
import com.google.android.material.internal.C4908m;
import p064db.C5810a;
import p155ia.C7480b;
import p155ia.C7486h;
import p155ia.C7488j;
import p155ia.C7489k;

/* renamed from: com.google.android.material.textfield.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5004i extends C0500d {

    /* renamed from: n */
    private final C0583v0 f14105n;

    /* renamed from: o */
    private final AccessibilityManager f14106o;

    /* renamed from: p */
    private final Rect f14107p;

    /* renamed from: q */
    private final int f14108q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C5005a implements AdapterView.OnItemClickListener {
        C5005a() {
            C5004i.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            Object item;
            C5004i c5004i = C5004i.this;
            if (i < 0) {
                item = c5004i.f14105n.m39633t();
            } else {
                item = c5004i.getAdapter().getItem(i);
            }
            C5004i.this.m26569f(item);
            AdapterView.OnItemClickListener onItemClickListener = C5004i.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i < 0) {
                    view = C5004i.this.f14105n.m39630w();
                    i = C5004i.this.f14105n.m39631v();
                    j = C5004i.this.f14105n.m39632u();
                }
                onItemClickListener.onItemClick(C5004i.this.f14105n.mo39639n(), view, i, j);
            }
            C5004i.this.f14105n.dismiss();
        }
    }

    public C5004i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20099b);
    }

    /* renamed from: d */
    private TextInputLayout m26571d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: e */
    private int m26570e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout m26571d = m26571d();
        int i = 0;
        if (adapter == null || m26571d == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f14105n.m39631v()) + 15);
        View view = null;
        int i2 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = adapter.getView(max, view, m26571d);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        Drawable m39642f = this.f14105n.m39642f();
        if (m39642f != null) {
            m39642f.getPadding(this.f14107p);
            Rect rect = this.f14107p;
            i2 += rect.left + rect.right;
        }
        return i2 + m26571d.getEndIconView().getMeasuredWidth();
    }

    /* renamed from: f */
    public <T extends ListAdapter & Filterable> void m26569f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m26571d = m26571d();
        if (m26571d != null && m26571d.m26745O()) {
            return m26571d.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m26571d = m26571d();
        if (m26571d != null && m26571d.m26745O() && super.getHint() == null && C4896g.m26975a()) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m26570e()), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f14105n.mo39587l(getAdapter());
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f14106o;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f14105n.show();
        } else {
            super.showDropDown();
        }
    }

    public C5004i(Context context, AttributeSet attributeSet, int i) {
        super(C5810a.m24498c(context, attributeSet, i, 0), attributeSet, i);
        this.f14107p = new Rect();
        Context context2 = getContext();
        TypedArray m26945h = C4908m.m26945h(context2, attributeSet, C7489k.f20629r2, i, C7488j.f20266c, new int[0]);
        int i2 = C7489k.f20637s2;
        if (m26945h.hasValue(i2) && m26945h.getInt(i2, 0) == 0) {
            setKeyListener(null);
        }
        this.f14108q = m26945h.getResourceId(C7489k.f20645t2, C7486h.f20239j);
        this.f14106o = (AccessibilityManager) context2.getSystemService("accessibility");
        C0583v0 c0583v0 = new C0583v0(context2);
        this.f14105n = c0583v0;
        c0583v0.m39653H(true);
        c0583v0.m39659B(this);
        c0583v0.m39654G(2);
        c0583v0.mo39587l(getAdapter());
        c0583v0.m39651J(new C5005a());
        int i3 = C7489k.f20653u2;
        if (m26945h.hasValue(i3)) {
            setSimpleItems(m26945h.getResourceId(i3, 0));
        }
        m26945h.recycle();
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f14108q, strArr));
    }
}