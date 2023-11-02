package com.facebook.drawee.span;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SimpleDraweeSpanTextView extends TextView {
    private DraweeSpanStringBuilder mDraweeStringBuilder;
    private boolean mIsAttached;

    public SimpleDraweeSpanTextView(Context context) {
        super(context);
        this.mIsAttached = false;
    }

    public void detachCurrentDraweeSpanStringBuilder() {
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.m31376h(this);
        }
        this.mDraweeStringBuilder = null;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsAttached = true;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.m31378f(this);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        this.mIsAttached = false;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.m31376h(this);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.mIsAttached = true;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.m31378f(this);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        this.mIsAttached = false;
        DraweeSpanStringBuilder draweeSpanStringBuilder = this.mDraweeStringBuilder;
        if (draweeSpanStringBuilder != null) {
            draweeSpanStringBuilder.m31376h(this);
        }
        super.onStartTemporaryDetach();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        detachCurrentDraweeSpanStringBuilder();
    }

    public void setDraweeSpanStringBuilder(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        setText(draweeSpanStringBuilder, TextView.BufferType.SPANNABLE);
        this.mDraweeStringBuilder = draweeSpanStringBuilder;
        if (draweeSpanStringBuilder != null && this.mIsAttached) {
            draweeSpanStringBuilder.m31378f(this);
        }
    }

    public SimpleDraweeSpanTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIsAttached = false;
    }

    public SimpleDraweeSpanTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIsAttached = false;
    }
}
