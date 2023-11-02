package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.widget.C0544n1;
import androidx.core.view.C1365w0;
import p052d.C5706a;
import p052d.C5711f;
import p052d.C5712g;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0407n.InterfaceC0408a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: j */
    private C0393i f1225j;

    /* renamed from: k */
    private ImageView f1226k;

    /* renamed from: l */
    private RadioButton f1227l;

    /* renamed from: m */
    private TextView f1228m;

    /* renamed from: n */
    private CheckBox f1229n;

    /* renamed from: o */
    private TextView f1230o;

    /* renamed from: p */
    private ImageView f1231p;

    /* renamed from: q */
    private ImageView f1232q;

    /* renamed from: r */
    private LinearLayout f1233r;

    /* renamed from: s */
    private Drawable f1234s;

    /* renamed from: t */
    private int f1235t;

    /* renamed from: u */
    private Context f1236u;

    /* renamed from: v */
    private boolean f1237v;

    /* renamed from: w */
    private Drawable f1238w;

    /* renamed from: x */
    private boolean f1239x;

    /* renamed from: y */
    private LayoutInflater f1240y;

    /* renamed from: z */
    private boolean f1241z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5706a.f16035D);
    }

    /* renamed from: a */
    private void m40428a(View view) {
        m40427b(view, -1);
    }

    /* renamed from: b */
    private void m40427b(View view, int i) {
        LinearLayout linearLayout = this.f1233r;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: e */
    private void m40426e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(C5712g.f16192h, (ViewGroup) this, false);
        this.f1229n = checkBox;
        m40428a(checkBox);
    }

    /* renamed from: f */
    private void m40425f() {
        ImageView imageView = (ImageView) getInflater().inflate(C5712g.f16193i, (ViewGroup) this, false);
        this.f1226k = imageView;
        m40427b(imageView, 0);
    }

    /* renamed from: g */
    private void m40424g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(C5712g.f16195k, (ViewGroup) this, false);
        this.f1227l = radioButton;
        m40428a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1240y == null) {
            this.f1240y = LayoutInflater.from(getContext());
        }
        return this.f1240y;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.f1231p;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1232q;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1232q.getLayoutParams();
            rect.top += this.f1232q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: c */
    public void mo27073c(C0393i c0393i, int i) {
        int i2;
        this.f1225j = c0393i;
        if (c0393i.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setTitle(c0393i.m40336i(this));
        setCheckable(c0393i.isCheckable());
        m40423h(c0393i.m40344A(), c0393i.m40338g());
        setIcon(c0393i.getIcon());
        setEnabled(c0393i.isEnabled());
        setSubMenuArrowVisible(c0393i.hasSubMenu());
        setContentDescription(c0393i.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    /* renamed from: d */
    public boolean mo27072d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0407n.InterfaceC0408a
    public C0393i getItemData() {
        return this.f1225j;
    }

    /* renamed from: h */
    public void m40423h(boolean z, char c) {
        int i;
        if (z && this.f1225j.m40344A()) {
            i = 0;
        } else {
            i = 8;
        }
        if (i == 0) {
            this.f1230o.setText(this.f1225j.m40337h());
        }
        if (this.f1230o.getVisibility() != i) {
            this.f1230o.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C1365w0.m37177u0(this, this.f1234s);
        TextView textView = (TextView) findViewById(C5711f.f16155N);
        this.f1228m = textView;
        int i = this.f1235t;
        if (i != -1) {
            textView.setTextAppearance(this.f1236u, i);
        }
        this.f1230o = (TextView) findViewById(C5711f.f16148G);
        ImageView imageView = (ImageView) findViewById(C5711f.f16151J);
        this.f1231p = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1238w);
        }
        this.f1232q = (ImageView) findViewById(C5711f.f16177s);
        this.f1233r = (LinearLayout) findViewById(C5711f.f16171m);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1226k != null && this.f1237v) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1226k.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.f1227l == null && this.f1229n == null) {
            return;
        }
        if (this.f1225j.m40332m()) {
            if (this.f1227l == null) {
                m40424g();
            }
            compoundButton = this.f1227l;
            view = this.f1229n;
        } else {
            if (this.f1229n == null) {
                m40426e();
            }
            compoundButton = this.f1229n;
            view = this.f1227l;
        }
        if (z) {
            compoundButton.setChecked(this.f1225j.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox = this.f1229n;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1227l;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1225j.m40332m()) {
            if (this.f1227l == null) {
                m40424g();
            }
            compoundButton = this.f1227l;
        } else {
            if (this.f1229n == null) {
                m40426e();
            }
            compoundButton = this.f1229n;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f1241z = z;
        this.f1237v = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.f1232q;
        if (imageView != null) {
            if (!this.f1239x && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z;
        if (!this.f1225j.m40319z() && !this.f1241z) {
            z = false;
        } else {
            z = true;
        }
        if (!z && !this.f1237v) {
            return;
        }
        ImageView imageView = this.f1226k;
        if (imageView == null && drawable == null && !this.f1237v) {
            return;
        }
        if (imageView == null) {
            m40425f();
        }
        if (drawable == null && !this.f1237v) {
            this.f1226k.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.f1226k;
        if (!z) {
            drawable = null;
        }
        imageView2.setImageDrawable(drawable);
        if (this.f1226k.getVisibility() != 0) {
            this.f1226k.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1228m.setText(charSequence);
            if (this.f1228m.getVisibility() != 0) {
                this.f1228m.setVisibility(0);
            }
        } else if (this.f1228m.getVisibility() != 8) {
            this.f1228m.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0544n1 m39780v = C0544n1.m39780v(getContext(), attributeSet, C5715j.f16319T1, i, 0);
        this.f1234s = m39780v.m39795g(C5715j.f16327V1);
        this.f1235t = m39780v.m39788n(C5715j.f16323U1, -1);
        this.f1237v = m39780v.m39801a(C5715j.f16331W1, false);
        this.f1236u = context;
        this.f1238w = m39780v.m39795g(C5715j.f16335X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C5706a.f16032A, 0);
        this.f1239x = obtainStyledAttributes.hasValue(0);
        m39780v.m39779w();
        obtainStyledAttributes.recycle();
    }
}