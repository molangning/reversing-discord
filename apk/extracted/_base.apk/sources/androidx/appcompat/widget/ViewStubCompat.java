package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p052d.C5715j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: j */
    private int f1709j;

    /* renamed from: k */
    private int f1710k;

    /* renamed from: l */
    private WeakReference<View> f1711l;

    /* renamed from: m */
    private LayoutInflater f1712m;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0470a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View m40023a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1709j != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1712m;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1709j, viewGroup, false);
                int i = this.f1710k;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1711l = new WeakReference<>(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1710k;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1712m;
    }

    public int getLayoutResource() {
        return this.f1709j;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1710k = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1712m = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1709j = i;
    }

    public void setOnInflateListener(InterfaceC0470a interfaceC0470a) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1711l;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m40023a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1709j = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5715j.f16297O3, i, 0);
        this.f1710k = obtainStyledAttributes.getResourceId(C5715j.f16312R3, -1);
        this.f1709j = obtainStyledAttributes.getResourceId(C5715j.f16307Q3, 0);
        setId(obtainStyledAttributes.getResourceId(C5715j.f16302P3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
