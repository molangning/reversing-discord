package com.facebook.react.views.scroll;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1170a;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.AssertionException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactScrollViewAccessibilityDelegate extends C1170a {
    private final String TAG = ReactScrollViewAccessibilityDelegate.class.getSimpleName();

    private void onInitializeAccessibilityEventInternal(View view, AccessibilityEvent accessibilityEvent) {
        boolean isPartiallyScrolledInView;
        View childAt;
        ReadableMap readableMap;
        ReadableMap readableMap2 = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_collection);
        if (readableMap2 != null) {
            accessibilityEvent.setItemCount(readableMap2.getInt("itemCount"));
            if (view instanceof ViewGroup) {
                View childAt2 = ((ViewGroup) view).getChildAt(0);
                if (!(childAt2 instanceof ViewGroup)) {
                    return;
                }
                Integer num = null;
                int i = 0;
                Integer num2 = null;
                while (true) {
                    ViewGroup viewGroup = (ViewGroup) childAt2;
                    if (i < viewGroup.getChildCount()) {
                        View childAt3 = viewGroup.getChildAt(i);
                        if (view instanceof ReactScrollView) {
                            isPartiallyScrolledInView = ((ReactScrollView) view).isPartiallyScrolledInView(childAt3);
                        } else if (view instanceof ReactHorizontalScrollView) {
                            isPartiallyScrolledInView = ((ReactHorizontalScrollView) view).isPartiallyScrolledInView(childAt3);
                        } else {
                            return;
                        }
                        int i2 = C3893R.C3895id.accessibility_collection_item;
                        ReadableMap readableMap3 = (ReadableMap) childAt3.getTag(i2);
                        if (!(childAt3 instanceof ViewGroup)) {
                            return;
                        }
                        ViewGroup viewGroup2 = (ViewGroup) childAt3;
                        if (viewGroup2.getChildCount() > 0 && readableMap3 == null && (childAt = viewGroup2.getChildAt(0)) != null && (readableMap = (ReadableMap) childAt.getTag(i2)) != null) {
                            readableMap3 = readableMap;
                        }
                        if (isPartiallyScrolledInView && readableMap3 != null) {
                            if (num == null) {
                                num = Integer.valueOf(readableMap3.getInt("itemIndex"));
                            }
                            num2 = Integer.valueOf(readableMap3.getInt("itemIndex"));
                        }
                        if (num != null && num2 != null) {
                            accessibilityEvent.setFromIndex(num.intValue());
                            accessibilityEvent.setToIndex(num2.intValue());
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ReactAccessibilityDelegate.AccessibilityRole accessibilityRole = (ReactAccessibilityDelegate.AccessibilityRole) view.getTag(C3893R.C3895id.accessibility_role);
        if (accessibilityRole != null) {
            ReactAccessibilityDelegate.setRole(accessibilityNodeInfoCompat, accessibilityRole, view.getContext());
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(C3893R.C3895id.accessibility_collection);
        if (readableMap != null) {
            accessibilityNodeInfoCompat.m37586i0(AccessibilityNodeInfoCompat.C1180c.m37546a(readableMap.getInt("rowCount"), readableMap.getInt("columnCount"), readableMap.getBoolean("hierarchical")));
        }
        if (view instanceof ReactScrollView) {
            accessibilityNodeInfoCompat.m37638D0(((ReactScrollView) view).getScrollEnabled());
        } else if (view instanceof ReactHorizontalScrollView) {
            accessibilityNodeInfoCompat.m37638D0(((ReactHorizontalScrollView) view).getScrollEnabled());
        }
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof ReactScrollView) && !(view instanceof ReactHorizontalScrollView)) {
            String str = this.TAG;
            ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
            return;
        }
        onInitializeAccessibilityEventInternal(view, accessibilityEvent);
    }

    @Override // androidx.core.view.C1170a
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!(view instanceof ReactScrollView) && !(view instanceof ReactHorizontalScrollView)) {
            String str = this.TAG;
            ReactSoftExceptionLogger.logSoftException(str, new AssertionException("ReactScrollViewAccessibilityDelegate should only be used with ReactScrollView or ReactHorizontalScrollView, not with class: " + view.getClass().getSimpleName()));
            return;
        }
        onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfoCompat);
    }
}