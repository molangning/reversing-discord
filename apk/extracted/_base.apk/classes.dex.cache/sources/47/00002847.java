package com.facebook.react.views.swiperefresh;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.events.NativeGestureUtil;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactSwipeRefreshLayout extends SwipeRefreshLayout {
    private static final float DEFAULT_CIRCLE_TARGET = 64.0f;
    private boolean mDidLayout;
    private boolean mIntercepted;
    private boolean mNativeGestureStarted;
    private float mPrevTouchX;
    private float mProgressViewOffset;
    private boolean mRefreshing;
    private int mTouchSlop;

    public ReactSwipeRefreshLayout(ReactContext reactContext) {
        super(reactContext);
        this.mDidLayout = false;
        this.mRefreshing = false;
        this.mProgressViewOffset = 0.0f;
        this.mNativeGestureStarted = false;
        this.mTouchSlop = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    private boolean shouldInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getX() - this.mPrevTouchX);
                if (this.mIntercepted || abs > this.mTouchSlop) {
                    this.mIntercepted = true;
                    return false;
                }
            }
        } else {
            this.mPrevTouchX = motionEvent.getX();
            this.mIntercepted = false;
        }
        return true;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (shouldInterceptTouchEvent(motionEvent) && super.onInterceptTouchEvent(motionEvent)) {
            NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
            this.mNativeGestureStarted = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.mDidLayout) {
            this.mDidLayout = true;
            setProgressViewOffset(this.mProgressViewOffset);
            setRefreshing(this.mRefreshing);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.mNativeGestureStarted) {
            NativeGestureUtil.notifyNativeGestureEnded(this, motionEvent);
            this.mNativeGestureStarted = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.mProgressViewOffset = f;
        if (this.mDidLayout) {
            int progressCircleDiameter = getProgressCircleDiameter();
            setProgressViewOffset(false, Math.round(PixelUtil.toPixelFromDIP(f)) - progressCircleDiameter, Math.round(PixelUtil.toPixelFromDIP(f + DEFAULT_CIRCLE_TARGET) - progressCircleDiameter));
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.mRefreshing = z;
        if (this.mDidLayout) {
            super.setRefreshing(z);
        }
    }
}