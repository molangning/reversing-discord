package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.C0503e;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.C1365w0;
import androidx.core.widget.C1435k;
import bb.C2236h;
import bb.C2239k;
import bb.InterfaceC2255n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p020b0.AbstractC1964a;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaterialButton extends C0503e implements Checkable, InterfaceC2255n {

    /* renamed from: m */
    private final C4791a f13209m;

    /* renamed from: n */
    private final LinkedHashSet<InterfaceC4782a> f13210n;

    /* renamed from: o */
    private InterfaceC4783b f13211o;

    /* renamed from: p */
    private PorterDuff.Mode f13212p;

    /* renamed from: q */
    private ColorStateList f13213q;

    /* renamed from: r */
    private Drawable f13214r;

    /* renamed from: s */
    private int f13215s;

    /* renamed from: t */
    private int f13216t;

    /* renamed from: u */
    private int f13217u;

    /* renamed from: v */
    private int f13218v;

    /* renamed from: w */
    private boolean f13219w;

    /* renamed from: x */
    private boolean f13220x;

    /* renamed from: y */
    private int f13221y;

    /* renamed from: z */
    private static final int[] f13208z = {16842911};

    /* renamed from: A */
    private static final int[] f13206A = {16842912};

    /* renamed from: B */
    private static final int f13207B = C7488j.f20273j;

    /* renamed from: com.google.android.material.button.MaterialButton$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4782a {
        /* renamed from: a */
        void m27663a(MaterialButton materialButton, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.button.MaterialButton$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4783b {
        /* renamed from: a */
        void mo27632a(MaterialButton materialButton, boolean z);
    }

    /* renamed from: com.google.android.material.button.MaterialButton$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4784c extends AbstractC1964a {
        public static final Parcelable.Creator<C4784c> CREATOR = new C4785a();

        /* renamed from: l */
        boolean f13222l;

        /* renamed from: com.google.android.material.button.MaterialButton$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4785a implements Parcelable.ClassLoaderCreator<C4784c> {
            C4785a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4784c createFromParcel(Parcel parcel) {
                return new C4784c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4784c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4784c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4784c[] newArray(int i) {
                return new C4784c[i];
            }
        }

        public C4784c(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: b */
        private void m27662b(Parcel parcel) {
            this.f13222l = parcel.readInt() == 1;
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f13222l ? 1 : 0);
        }

        public C4784c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            m27662b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20116s);
    }

    /* renamed from: b */
    private boolean m27671b() {
        int i = this.f13221y;
        return i == 3 || i == 4;
    }

    /* renamed from: c */
    private boolean m27670c() {
        int i = this.f13221y;
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    private boolean m27669d() {
        int i = this.f13221y;
        return i == 16 || i == 32;
    }

    /* renamed from: e */
    private boolean m27668e() {
        return C1365w0.m37258B(this) == 1;
    }

    /* renamed from: f */
    private boolean m27667f() {
        C4791a c4791a = this.f13209m;
        return (c4791a == null || c4791a.m27608o()) ? false : true;
    }

    /* renamed from: g */
    private void m27666g() {
        if (m27670c()) {
            C1435k.m36872i(this, this.f13214r, null, null, null);
        } else if (m27671b()) {
            C1435k.m36872i(this, null, null, this.f13214r, null);
        } else if (m27669d()) {
            C1435k.m36872i(this, null, this.f13214r, null, null);
        }
    }

    private String getA11yClassName() {
        return (m27672a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    /* renamed from: h */
    private void m27665h(boolean z) {
        Drawable drawable = this.f13214r;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = C1013a.m38080r(drawable).mutate();
            this.f13214r = mutate;
            C1013a.m38083o(mutate, this.f13213q);
            PorterDuff.Mode mode = this.f13212p;
            if (mode != null) {
                C1013a.m38082p(this.f13214r, mode);
            }
            int i = this.f13215s;
            if (i == 0) {
                i = this.f13214r.getIntrinsicWidth();
            }
            int i2 = this.f13215s;
            if (i2 == 0) {
                i2 = this.f13214r.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f13214r;
            int i3 = this.f13216t;
            int i4 = this.f13217u;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f13214r.setVisible(true, z);
        }
        if (z) {
            m27666g();
            return;
        }
        Drawable[] m36880a = C1435k.m36880a(this);
        Drawable drawable3 = m36880a[0];
        Drawable drawable4 = m36880a[1];
        Drawable drawable5 = m36880a[2];
        if ((!m27670c() || drawable3 == this.f13214r) && ((!m27671b() || drawable5 == this.f13214r) && (!m27669d() || drawable4 == this.f13214r))) {
            z2 = false;
        }
        if (z2) {
            m27666g();
        }
    }

    /* renamed from: i */
    private void m27664i(int i, int i2) {
        if (this.f13214r != null && getLayout() != null) {
            if (!m27670c() && !m27671b()) {
                if (m27669d()) {
                    this.f13216t = 0;
                    if (this.f13221y == 16) {
                        this.f13217u = 0;
                        m27665h(false);
                        return;
                    }
                    int i3 = this.f13215s;
                    if (i3 == 0) {
                        i3 = this.f13214r.getIntrinsicHeight();
                    }
                    int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i3) - this.f13218v) - getPaddingBottom()) / 2;
                    if (this.f13217u != textHeight) {
                        this.f13217u = textHeight;
                        m27665h(false);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f13217u = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i4 = this.f13221y;
            boolean z = true;
            if (i4 != 1 && i4 != 3 && ((i4 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i4 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i5 = this.f13215s;
                if (i5 == 0) {
                    i5 = this.f13214r.getIntrinsicWidth();
                }
                int textWidth = ((((i - getTextWidth()) - C1365w0.m37250F(this)) - i5) - this.f13218v) - C1365w0.m37248G(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    textWidth /= 2;
                }
                boolean m27668e = m27668e();
                if (this.f13221y != 4) {
                    z = false;
                }
                if (m27668e != z) {
                    textWidth = -textWidth;
                }
                if (this.f13216t != textWidth) {
                    this.f13216t = textWidth;
                    m27665h(false);
                    return;
                }
                return;
            }
            this.f13216t = 0;
            m27665h(false);
        }
    }

    /* renamed from: a */
    public boolean m27672a() {
        C4791a c4791a = this.f13209m;
        return c4791a != null && c4791a.m27607p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m27667f()) {
            return this.f13209m.m27621b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f13214r;
    }

    public int getIconGravity() {
        return this.f13221y;
    }

    public int getIconPadding() {
        return this.f13218v;
    }

    public int getIconSize() {
        return this.f13215s;
    }

    public ColorStateList getIconTint() {
        return this.f13213q;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f13212p;
    }

    public int getInsetBottom() {
        return this.f13209m.m27620c();
    }

    public int getInsetTop() {
        return this.f13209m.m27619d();
    }

    public ColorStateList getRippleColor() {
        if (m27667f()) {
            return this.f13209m.m27615h();
        }
        return null;
    }

    public C2239k getShapeAppearanceModel() {
        if (m27667f()) {
            return this.f13209m.m27614i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m27667f()) {
            return this.f13209m.m27613j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m27667f()) {
            return this.f13209m.m27612k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.C0503e
    public ColorStateList getSupportBackgroundTintList() {
        if (m27667f()) {
            return this.f13209m.m27611l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.C0503e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (m27667f()) {
            return this.f13209m.m27610m();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f13219w;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m27667f()) {
            C2236h.m33877f(this, this.f13209m.m27617f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m27672a()) {
            View.mergeDrawableStates(onCreateDrawableState, f13208z);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f13206A);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.C0503e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.C0503e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m27672a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0503e, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m27664i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4784c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4784c c4784c = (C4784c) parcelable;
        super.onRestoreInstanceState(c4784c.m34884a());
        setChecked(c4784c.f13222l);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C4784c c4784c = new C4784c(super.onSaveInstanceState());
        c4784c.f13222l = this.f13219w;
        return c4784c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.C0503e, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m27664i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f13214r != null) {
            if (this.f13214r.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (m27667f()) {
            this.f13209m.m27605r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.C0503e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (m27667f()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.f13209m.m27604s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0503e, android.view.View
    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C6029a.m23853b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m27667f()) {
            this.f13209m.m27603t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m27672a() && isEnabled() && this.f13219w != z) {
            this.f13219w = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m27646m(this, this.f13219w);
            }
            if (this.f13220x) {
                return;
            }
            this.f13220x = true;
            Iterator<InterfaceC4782a> it = this.f13210n.iterator();
            while (it.hasNext()) {
                it.next().m27663a(this, this.f13219w);
            }
            this.f13220x = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m27667f()) {
            this.f13209m.m27602u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m27667f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m27667f()) {
            this.f13209m.m27617f().m33920X(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f13214r != drawable) {
            this.f13214r = drawable;
            m27665h(true);
            m27664i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f13221y != i) {
            this.f13221y = i;
            m27664i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f13218v != i) {
            this.f13218v = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C6029a.m23853b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i) {
        if (i >= 0) {
            if (this.f13215s != i) {
                this.f13215s = i;
                m27665h(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f13213q != colorStateList) {
            this.f13213q = colorStateList;
            m27665h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f13212p != mode) {
            this.f13212p = mode;
            m27665h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C6029a.m23854a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.f13209m.m27601v(i);
    }

    public void setInsetTop(int i) {
        this.f13209m.m27600w(i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC4783b interfaceC4783b) {
        this.f13211o = interfaceC4783b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC4783b interfaceC4783b = this.f13211o;
        if (interfaceC4783b != null) {
            interfaceC4783b.mo27632a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m27667f()) {
            this.f13209m.m27599x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (m27667f()) {
            setRippleColor(C6029a.m23854a(getContext(), i));
        }
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        if (m27667f()) {
            this.f13209m.m27598y(c2239k);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m27667f()) {
            this.f13209m.m27597z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m27667f()) {
            this.f13209m.m27631A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (m27667f()) {
            setStrokeColor(C6029a.m23854a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m27667f()) {
            this.f13209m.m27630B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m27667f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.C0503e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m27667f()) {
            this.f13209m.m27629C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.C0503e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m27667f()) {
            this.f13209m.m27628D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m27664i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f13219w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.f13207B
            android.content.Context r9 = p064db.C5810a.m24498c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.f13210n = r9
            r9 = 0
            r8.f13219w = r9
            r8.f13220x = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = p155ia.C7489k.f20661v2
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r1 = p155ia.C7489k.f20353I2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f13218v = r1
            int r1 = p155ia.C7489k.f20377L2
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.C4911o.m26932f(r1, r2)
            r8.f13212p = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p155ia.C7489k.f20369K2
            android.content.res.ColorStateList r1 = p443ya.C13957c.m1089a(r1, r0, r2)
            r8.f13213q = r1
            android.content.Context r1 = r8.getContext()
            int r2 = p155ia.C7489k.f20337G2
            android.graphics.drawable.Drawable r1 = p443ya.C13957c.m1086d(r1, r0, r2)
            r8.f13214r = r1
            int r1 = p155ia.C7489k.f20345H2
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.f13221y = r1
            int r1 = p155ia.C7489k.f20361J2
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.f13215s = r1
            bb.k$b r10 = bb.C2239k.m33870e(r7, r10, r11, r6)
            bb.k r10 = r10.m33831m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.f13209m = r11
            r11.m27606q(r0)
            r0.recycle()
            int r10 = r8.f13218v
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.f13214r
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.m27665h(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}