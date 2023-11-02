package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BlurView extends FrameLayout {
    private static final String TAG = "BlurView";
    BlurController blurController;
    private int overlayColor;

    public BlurView(Context context) {
        super(context);
        this.blurController = new C6244b();
        init(null, 0);
    }

    private BlurAlgorithm getBlurAlgorithm() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new C6249f();
        }
        return new C6250g(getContext());
    }

    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6247d.f17681a, i, 0);
        this.overlayColor = obtainStyledAttributes.getColor(C6247d.f17682b, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.blurController.mo23166f(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(TAG, "BlurView can't be used in not hardware-accelerated window!");
        } else {
            this.blurController.mo23169c(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.blurController.mo23169c(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.blurController.mo23167e();
    }

    public BlurViewFacade setBlurAutoUpdate(boolean z) {
        return this.blurController.mo23169c(z);
    }

    public BlurViewFacade setBlurEnabled(boolean z) {
        return this.blurController.mo23170b(z);
    }

    public BlurViewFacade setBlurRadius(float f) {
        return this.blurController.mo23165g(f);
    }

    public BlurViewFacade setOverlayColor(int i) {
        this.overlayColor = i;
        return this.blurController.mo23171a(i);
    }

    public BlurViewFacade setupWith(ViewGroup viewGroup, BlurAlgorithm blurAlgorithm) {
        this.blurController.destroy();
        C6245c c6245c = new C6245c(this, viewGroup, this.overlayColor, blurAlgorithm);
        this.blurController = c6245c;
        return c6245c;
    }

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.blurController = new C6244b();
        init(attributeSet, 0);
    }

    public BlurViewFacade setupWith(ViewGroup viewGroup) {
        this.blurController.destroy();
        C6245c c6245c = new C6245c(this, viewGroup, this.overlayColor, getBlurAlgorithm());
        this.blurController = c6245c;
        return c6245c;
    }

    public BlurView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.blurController = new C6244b();
        init(attributeSet, i);
    }
}