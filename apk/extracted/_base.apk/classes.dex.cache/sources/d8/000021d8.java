package com.facebook.drawee.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.AspectRatioMeasure;
import p006a5.C0025b;
import p394w2.C13375i;

/* renamed from: com.facebook.drawee.view.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3636a<DH extends DraweeHierarchy> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled = false;
    private float mAspectRatio;
    private DraweeHolder<DH> mDraweeHolder;
    private boolean mInitialised;
    private boolean mLegacyVisibilityHandlingEnabled;
    private final AspectRatioMeasure.Spec mMeasureSpec;

    public C3636a(Context context) {
        super(context);
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    private void init(Context context) {
        boolean m41375d;
        try {
            if (C0025b.m41375d()) {
                C0025b.m41378a("DraweeView#init");
            }
            if (this.mInitialised) {
                if (m41375d) {
                    return;
                }
                return;
            }
            boolean z = true;
            this.mInitialised = true;
            this.mDraweeHolder = DraweeHolder.m31360d(null, context);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                if (C0025b.m41375d()) {
                    C0025b.m41377b();
                    return;
                }
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.mLegacyVisibilityHandlingEnabled = z;
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        } finally {
            if (C0025b.m41375d()) {
                C0025b.m41377b();
            }
        }
    }

    private void maybeOverrideVisibilityHandling() {
        Drawable drawable;
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled && (drawable = getDrawable()) != null) {
            if (getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    protected void doAttach() {
        this.mDraweeHolder.m31353k();
    }

    protected void doDetach() {
        this.mDraweeHolder.m31352l();
    }

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    public DraweeController getController() {
        return this.mDraweeHolder.m31358f();
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.m31357g();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.m31356h();
    }

    public boolean hasController() {
        return this.mDraweeHolder.m31358f() != null;
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.m31355i();
    }

    protected void onAttach() {
        doAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    protected void onDetach() {
        doDetach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        AspectRatioMeasure.Spec spec = this.mMeasureSpec;
        spec.f10008a = i;
        spec.f10009b = i2;
        AspectRatioMeasure.m31364b(spec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        AspectRatioMeasure.Spec spec2 = this.mMeasureSpec;
        super.onMeasure(spec2.f10008a, spec2.f10009b);
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.m31351m(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public void setAspectRatio(float f) {
        if (f == this.mAspectRatio) {
            return;
        }
        this.mAspectRatio = f;
        requestLayout();
    }

    public void setController(DraweeController draweeController) {
        this.mDraweeHolder.m31349o(draweeController);
        super.setImageDrawable(this.mDraweeHolder.m31356h());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.m31348p(dh);
        super.setImageDrawable(this.mDraweeHolder.m31356h());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.m31349o(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.m31349o(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.m31349o(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.m31349o(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    @Override // android.view.View
    public String toString() {
        String str;
        C13375i.C13377b m2689c = C13375i.m2689c(this);
        DraweeHolder<DH> draweeHolder = this.mDraweeHolder;
        if (draweeHolder != null) {
            str = draweeHolder.toString();
        } else {
            str = "<no holder set>";
        }
        return m2689c.m2687b("holder", str).toString();
    }

    public C3636a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    public C3636a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }

    @TargetApi(21)
    public C3636a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mMeasureSpec = new AspectRatioMeasure.Spec();
        this.mAspectRatio = 0.0f;
        this.mInitialised = false;
        this.mLegacyVisibilityHandlingEnabled = false;
        init(context);
    }
}