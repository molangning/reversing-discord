package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p221m.C10222a;
import p221m.C10223b;
import p221m.C10224c;
import p221m.C10225d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class CardView extends FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {16842801};
    private static final CardViewImpl IMPL;
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    /* renamed from: androidx.cardview.widget.CardView$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0620a implements CardViewDelegate {

        /* renamed from: a */
        private Drawable f2094a;

        C0620a() {
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: a */
        public void mo39566a(int i, int i2, int i3, int i4) {
            CardView.this.mShadowBounds.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.mContentPadding;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: b */
        public void mo39565b(Drawable drawable) {
            this.f2094a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: c */
        public boolean mo39564c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: d */
        public Drawable mo39563d() {
            return this.f2094a;
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: e */
        public boolean mo39562e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.CardViewDelegate
        /* renamed from: f */
        public View mo39561f() {
            return CardView.this;
        }
    }

    static {
        C0621a c0621a = new C0621a();
        IMPL = c0621a;
        c0621a.mo39549l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return IMPL.mo39556e(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return IMPL.mo39552i(this.mCardViewDelegate);
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return IMPL.mo39557d(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return IMPL.mo39559b(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        CardViewImpl cardViewImpl = IMPL;
        if (!(cardViewImpl instanceof C0621a)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo39548m(this.mCardViewDelegate)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(cardViewImpl.mo39555f(this.mCardViewDelegate)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.mo39547n(this.mCardViewDelegate, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        IMPL.mo39558c(this.mCardViewDelegate, f);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.mo39550k(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.mo39546o(this.mCardViewDelegate, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.mo39554g(this.mCardViewDelegate);
        }
    }

    public void setRadius(float f) {
        IMPL.mo39560a(this.mCardViewDelegate, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.mo39551j(this.mCardViewDelegate);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C10222a.f26521a);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        IMPL.mo39547n(this.mCardViewDelegate, colorStateList);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new Rect();
        C0620a c0620a = new C0620a();
        this.mCardViewDelegate = c0620a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10225d.f26525a, i, C10224c.f26524a);
        int i2 = C10225d.f26528d;
        if (obtainStyledAttributes.hasValue(i2)) {
            valueOf = obtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C10223b.f26523b);
            } else {
                color = getResources().getColor(C10223b.f26522a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C10225d.f26529e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C10225d.f26530f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C10225d.f26531g, 0.0f);
        this.mCompatPadding = obtainStyledAttributes.getBoolean(C10225d.f26533i, false);
        this.mPreventCornerOverlap = obtainStyledAttributes.getBoolean(C10225d.f26532h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26534j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26536l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26538n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26537m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26535k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26526b, 0);
        this.mUserSetMinHeight = obtainStyledAttributes.getDimensionPixelSize(C10225d.f26527c, 0);
        obtainStyledAttributes.recycle();
        IMPL.mo39553h(c0620a, context, colorStateList, dimension, dimension2, f);
    }
}
