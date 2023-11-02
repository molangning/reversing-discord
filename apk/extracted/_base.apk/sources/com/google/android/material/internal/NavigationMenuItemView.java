package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.widget.C0570s1;
import androidx.appcompat.widget.C0579u0;
import androidx.core.content.res.C0980h;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1435k;
import androidx.recyclerview.widget.RecyclerView;
import p052d.C5706a;
import p155ia.C7482d;
import p155ia.C7483e;
import p155ia.C7484f;
import p155ia.C7486h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NavigationMenuItemView extends C4895f implements InterfaceC0407n.InterfaceC0408a {

    /* renamed from: O */
    private static final int[] f13645O = {16842912};

    /* renamed from: E */
    private int f13646E;

    /* renamed from: F */
    private boolean f13647F;

    /* renamed from: G */
    boolean f13648G;

    /* renamed from: H */
    private final CheckedTextView f13649H;

    /* renamed from: I */
    private FrameLayout f13650I;

    /* renamed from: J */
    private C0393i f13651J;

    /* renamed from: K */
    private ColorStateList f13652K;

    /* renamed from: L */
    private boolean f13653L;

    /* renamed from: M */
    private Drawable f13654M;

    /* renamed from: N */
    private final C1170a f13655N;

    /* renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4886a extends C1170a {
        C4886a() {
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37594e0(NavigationMenuItemView.this.f13648G);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: A */
    private StateListDrawable m27075A() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C5706a.f16069w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f13645O, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    /* renamed from: B */
    private boolean m27074B() {
        if (this.f13651J.getTitle() == null && this.f13651J.getIcon() == null && this.f13651J.getActionView() != null) {
            return true;
        }
        return false;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f13650I == null) {
                this.f13650I = (FrameLayout) ((ViewStub) findViewById(C7484f.f20204d)).inflate();
            }
            this.f13650I.removeAllViews();
            this.f13650I.addView(view);
        }
    }

    /* renamed from: z */
    private void m27071z() {
        if (m27074B()) {
            this.f13649H.setVisibility(8);
            FrameLayout frameLayout = this.f13650I;
            if (frameLayout != null) {
                C0579u0.C0580a c0580a = (C0579u0.C0580a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c0580a).width = -1;
                this.f13650I.setLayoutParams(c0580a);
                return;
            }
            return;
        }
        this.f13649H.setVisibility(0);
        FrameLayout frameLayout2 = this.f13650I;
        if (frameLayout2 != null) {
            C0579u0.C0580a c0580a2 = (C0579u0.C0580a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c0580a2).width = -2;
            this.f13650I.setLayoutParams(c0580a2);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: c */
    public void mo27073c(C0393i c0393i, int i) {
        int i2;
        this.f13651J = c0393i;
        if (c0393i.getItemId() > 0) {
            setId(c0393i.getItemId());
        }
        if (c0393i.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            C1365w0.m37177u0(this, m27075A());
        }
        setCheckable(c0393i.isCheckable());
        setChecked(c0393i.isChecked());
        setEnabled(c0393i.isEnabled());
        setTitle(c0393i.getTitle());
        setIcon(c0393i.getIcon());
        setActionView(c0393i.getActionView());
        setContentDescription(c0393i.getContentDescription());
        C0570s1.m39702a(this, c0393i.getTooltipText());
        m27071z();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: d */
    public boolean mo27072d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    public C0393i getItemData() {
        return this.f13651J;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C0393i c0393i = this.f13651J;
        if (c0393i != null && c0393i.isCheckable() && this.f13651J.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13645O);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f13648G != z) {
            this.f13648G = z;
            this.f13655N.sendAccessibilityEvent(this.f13649H, RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f13649H.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f13653L) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C1013a.m38080r(drawable).mutate();
                C1013a.m38083o(drawable, this.f13652K);
            }
            int i = this.f13646E;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f13647F) {
            if (this.f13654M == null) {
                Drawable m38241f = C0980h.m38241f(getResources(), C7483e.f20184g, getContext().getTheme());
                this.f13654M = m38241f;
                if (m38241f != null) {
                    int i2 = this.f13646E;
                    m38241f.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f13654M;
        }
        C1435k.m36872i(this.f13649H, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f13649H.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f13646E = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f13652K = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        this.f13653L = z;
        C0393i c0393i = this.f13651J;
        if (c0393i != null) {
            setIcon(c0393i.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f13649H.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f13647F = z;
    }

    public void setTextAppearance(int i) {
        C1435k.m36867n(this.f13649H, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f13649H.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f13649H.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4886a c4886a = new C4886a();
        this.f13655N = c4886a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(C7486h.f20230a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(C7482d.f20156e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C7484f.f20205e);
        this.f13649H = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1365w0.m37185q0(checkedTextView, c4886a);
    }
}
