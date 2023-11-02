package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import com.facebook.react.views.scroll.ReactScrollViewHelper.HasSmoothScroll;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.ref.WeakReference;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaintainVisibleScrollPositionHelper<ScrollViewT extends ViewGroup & ReactScrollViewHelper.HasSmoothScroll> implements UIManagerListener {
    private Config mConfig;
    private final boolean mHorizontal;
    private final ScrollViewT mScrollView;
    private WeakReference<View> mFirstVisibleView = null;
    private Rect mPrevFirstVisibleFrame = null;
    private boolean mListening = false;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class Config {
        public final Integer autoScrollToTopThreshold;
        public final int minIndexForVisible;

        Config(int i, Integer num) {
            this.minIndexForVisible = i;
            this.autoScrollToTopThreshold = num;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static Config fromReadableMap(ReadableMap readableMap) {
            Integer num;
            int i = readableMap.getInt("minIndexForVisible");
            if (readableMap.hasKey("autoscrollToTopThreshold")) {
                num = Integer.valueOf(readableMap.getInt("autoscrollToTopThreshold"));
            } else {
                num = null;
            }
            return new Config(i, num);
        }
    }

    public MaintainVisibleScrollPositionHelper(ScrollViewT scrollviewt, boolean z) {
        this.mScrollView = scrollviewt;
        this.mHorizontal = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void computeTargetView() {
        ReactViewGroup contentView;
        int scrollY;
        float y;
        if (this.mConfig == null || (contentView = getContentView()) == null) {
            return;
        }
        if (this.mHorizontal) {
            scrollY = ((ScrollViewT) this.mScrollView).getScrollX();
        } else {
            scrollY = ((ScrollViewT) this.mScrollView).getScrollY();
        }
        for (int i = this.mConfig.minIndexForVisible; i < contentView.getChildCount(); i++) {
            View childAt = contentView.getChildAt(i);
            if (this.mHorizontal) {
                y = childAt.getX();
            } else {
                y = childAt.getY();
            }
            if (y > scrollY || i == contentView.getChildCount() - 1) {
                this.mFirstVisibleView = new WeakReference<>(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.mPrevFirstVisibleFrame = rect;
                return;
            }
        }
    }

    private ReactViewGroup getContentView() {
        return (ReactViewGroup) this.mScrollView.getChildAt(0);
    }

    private UIManager getUIManagerModule() {
        return (UIManager) C5743a.m24583c(UIManagerHelper.getUIManager((ReactContext) ((ScrollViewT) this.mScrollView).getContext(), ViewUtil.getUIManagerType(((ScrollViewT) this.mScrollView).getId())));
    }

    private void updateScrollPositionInternal() {
        WeakReference<View> weakReference;
        if (this.mConfig != null && (weakReference = this.mFirstVisibleView) != null && this.mPrevFirstVisibleFrame != null) {
            Rect rect = new Rect();
            weakReference.get().getHitRect(rect);
            if (this.mHorizontal) {
                int i = rect.left - this.mPrevFirstVisibleFrame.left;
                if (i != 0) {
                    int scrollX = ((ScrollViewT) this.mScrollView).getScrollX();
                    ViewGroup viewGroup = (ScrollViewT) this.mScrollView;
                    viewGroup.scrollTo(i + scrollX, viewGroup.getScrollY());
                    this.mPrevFirstVisibleFrame = rect;
                    Integer num = this.mConfig.autoScrollToTopThreshold;
                    if (num != null && scrollX <= num.intValue()) {
                        ViewGroup viewGroup2 = (ScrollViewT) this.mScrollView;
                        ((ReactScrollViewHelper.HasSmoothScroll) viewGroup2).reactSmoothScrollTo(0, viewGroup2.getScrollY());
                        return;
                    }
                    return;
                }
                return;
            }
            int i2 = rect.top - this.mPrevFirstVisibleFrame.top;
            if (i2 != 0) {
                int scrollY = ((ScrollViewT) this.mScrollView).getScrollY();
                ViewGroup viewGroup3 = (ScrollViewT) this.mScrollView;
                viewGroup3.scrollTo(viewGroup3.getScrollX(), i2 + scrollY);
                this.mPrevFirstVisibleFrame = rect;
                Integer num2 = this.mConfig.autoScrollToTopThreshold;
                if (num2 != null && scrollY <= num2.intValue()) {
                    ViewGroup viewGroup4 = (ScrollViewT) this.mScrollView;
                    ((ReactScrollViewHelper.HasSmoothScroll) viewGroup4).reactSmoothScrollTo(viewGroup4.getScrollX(), 0);
                }
            }
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
        updateScrollPositionInternal();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public void setConfig(Config config) {
        this.mConfig = config;
    }

    public void start() {
        if (this.mListening) {
            return;
        }
        this.mListening = true;
        getUIManagerModule().addUIManagerEventListener(this);
    }

    public void stop() {
        if (!this.mListening) {
            return;
        }
        this.mListening = false;
        getUIManagerModule().removeUIManagerEventListener(this);
    }

    public void updateScrollPosition() {
        if (ViewUtil.getUIManagerType(((ScrollViewT) this.mScrollView).getId()) == 2) {
            return;
        }
        updateScrollPositionInternal();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.views.scroll.MaintainVisibleScrollPositionHelper.1
            @Override // java.lang.Runnable
            public void run() {
                MaintainVisibleScrollPositionHelper.this.computeTargetView();
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
        computeTargetView();
    }
}
