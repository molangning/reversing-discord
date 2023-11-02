package com.facebook.react.views.drawer;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.events.NativeGestureUtil;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class ReactDrawerLayout extends DrawerLayout {
    public static final int DEFAULT_DRAWER_WIDTH = -1;
    private boolean mDragging;
    private int mDrawerPosition;
    private int mDrawerWidth;

    public ReactDrawerLayout(ReactContext reactContext) {
        super(reactContext);
        this.mDrawerPosition = 8388611;
        this.mDrawerWidth = -1;
        this.mDragging = false;
        C1365w0.m37185q0(this, new C1170a() { // from class: com.facebook.react.views.drawer.ReactDrawerLayout.1
            @Override // androidx.core.view.C1170a
            public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                ReactAccessibilityDelegate.AccessibilityRole accessibilityRole = (ReactAccessibilityDelegate.AccessibilityRole) view.getTag(C3893R.C3895id.accessibility_role);
                if (accessibilityRole != null) {
                    accessibilityEvent.setClassName(ReactAccessibilityDelegate.AccessibilityRole.getValue(accessibilityRole));
                }
            }

            @Override // androidx.core.view.C1170a
            public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                ReactAccessibilityDelegate.AccessibilityRole accessibilityRole = (ReactAccessibilityDelegate.AccessibilityRole) view.getTag(C3893R.C3895id.accessibility_role);
                if (accessibilityRole != null) {
                    accessibilityNodeInfoCompat.m37590g0(ReactAccessibilityDelegate.AccessibilityRole.getValue(accessibilityRole));
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void closeDrawer() {
        closeDrawer(this.mDrawerPosition);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                NativeGestureUtil.notifyNativeGestureStarted(this, motionEvent);
                this.mDragging = true;
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            C13677a.m1869I(ReactConstants.TAG, "Error intercepting touch event.", e);
            return false;
        }
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1 && this.mDragging) {
            NativeGestureUtil.notifyNativeGestureEnded(this, motionEvent);
            this.mDragging = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void openDrawer() {
        openDrawer(this.mDrawerPosition);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawerPosition(int i) {
        this.mDrawerPosition = i;
        setDrawerProperties();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawerProperties() {
        if (getChildCount() == 2) {
            View childAt = getChildAt(1);
            DrawerLayout.C1457d c1457d = (DrawerLayout.C1457d) childAt.getLayoutParams();
            c1457d.f3831a = this.mDrawerPosition;
            ((ViewGroup.MarginLayoutParams) c1457d).width = this.mDrawerWidth;
            childAt.setLayoutParams(c1457d);
            childAt.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDrawerWidth(int i) {
        this.mDrawerWidth = i;
        setDrawerProperties();
    }
}
