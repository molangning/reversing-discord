package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0570s1;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0407n.InterfaceC0408a, View.OnClickListener, ActionMenuView.InterfaceC0423a {

    /* renamed from: j */
    C0393i f1210j;

    /* renamed from: k */
    private CharSequence f1211k;

    /* renamed from: l */
    private Drawable f1212l;

    /* renamed from: m */
    C0389g.InterfaceC0391b f1213m;

    /* renamed from: n */
    private AbstractView$OnTouchListenerC0574t0 f1214n;

    /* renamed from: o */
    AbstractC0376b f1215o;

    /* renamed from: p */
    private boolean f1216p;

    /* renamed from: q */
    private boolean f1217q;

    /* renamed from: r */
    private int f1218r;

    /* renamed from: s */
    private int f1219s;

    /* renamed from: t */
    private int f1220t;

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C0375a extends AbstractView$OnTouchListenerC0574t0 {
        public C0375a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
        /* renamed from: b */
        public InterfaceC0410p mo39611b() {
            AbstractC0376b abstractC0376b = ActionMenuItemView.this.f1215o;
            if (abstractC0376b != null) {
                return abstractC0376b.mo39973a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.AbstractView$OnTouchListenerC0574t0
        /* renamed from: c */
        protected boolean mo39610c() {
            InterfaceC0410p mo39611b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            C0389g.InterfaceC0391b interfaceC0391b = actionMenuItemView.f1213m;
            if (interfaceC0391b == null || !interfaceC0391b.mo40234b(actionMenuItemView.f1210j) || (mo39611b = mo39611b()) == null || !mo39611b.isShowing()) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.ActionMenuItemView$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0376b {
        /* renamed from: a */
        public abstract InterfaceC0410p mo39973a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: f */
    private boolean m40430f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 480 && ((i < 640 || i2 < 480) && configuration.orientation != 2)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m40429g() {
        CharSequence charSequence;
        CharSequence title;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1211k);
        if (this.f1212l != null && (!this.f1210j.m40343B() || (!this.f1216p && !this.f1217q))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.f1211k;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f1210j.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                title = null;
            } else {
                title = this.f1210j.getTitle();
            }
            setContentDescription(title);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1210j.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence2 = this.f1210j.getTitle();
            }
            C0570s1.m39702a(this, charSequence2);
            return;
        }
        C0570s1.m39702a(this, tooltipText);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0423a
    /* renamed from: a */
    public boolean mo39972a() {
        return m40431e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC0423a
    /* renamed from: b */
    public boolean mo39971b() {
        return m40431e() && this.f1210j.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: c */
    public void mo27073c(C0393i c0393i, int i) {
        int i2;
        this.f1210j = c0393i;
        setIcon(c0393i.getIcon());
        setTitle(c0393i.m40336i(this));
        setId(c0393i.getItemId());
        if (c0393i.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(c0393i.isEnabled());
        if (c0393i.hasSubMenu() && this.f1214n == null) {
            this.f1214n = new C0375a();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: d */
    public boolean mo27072d() {
        return true;
    }

    /* renamed from: e */
    public boolean m40431e() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    public C0393i getItemData() {
        return this.f1210j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C0389g.InterfaceC0391b interfaceC0391b = this.f1213m;
        if (interfaceC0391b != null) {
            interfaceC0391b.mo40234b(this.f1210j);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1216p = m40430f();
        m40429g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean m40431e = m40431e();
        if (m40431e && (i4 = this.f1219s) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f1218r);
        } else {
            i3 = this.f1218r;
        }
        if (mode != 1073741824 && this.f1218r > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!m40431e && this.f1212l != null) {
            super.setPadding((getMeasuredWidth() - this.f1212l.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnTouchListenerC0574t0 abstractView$OnTouchListenerC0574t0;
        if (this.f1210j.hasSubMenu() && (abstractView$OnTouchListenerC0574t0 = this.f1214n) != null && abstractView$OnTouchListenerC0574t0.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1217q != z) {
            this.f1217q = z;
            C0393i c0393i = this.f1210j;
            if (c0393i != null) {
                c0393i.m40342c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1212l = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1220t;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m40429g();
    }

    public void setItemInvoker(C0389g.InterfaceC0391b interfaceC0391b) {
        this.f1213m = interfaceC0391b;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1219s = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0376b abstractC0376b) {
        this.f1215o = abstractC0376b;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1211k = charSequence;
        m40429g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1216p = m40430f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16450v, i, 0);
        this.f1218r = obtainStyledAttributes.getDimensionPixelSize(C5715j.f16455w, 0);
        obtainStyledAttributes.recycle();
        this.f1220t = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1219s = -1;
        setSaveEnabled(false);
    }
}
