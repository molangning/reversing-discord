package com.facebook.react;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.modules.appregistry.AppRegistry;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactClippingProhibitedView;
import com.facebook.react.uimanager.ReactRoot;
import com.facebook.react.uimanager.ReactRootViewTagGenerator;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.concurrent.atomic.AtomicInteger;
import p058d5.C5743a;
import p150i5.C7382a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactRootView extends FrameLayout implements RootView, ReactRoot {
    private static final String TAG = "ReactRootView";
    private final ReactAndroidHWInputDeviceHelper mAndroidHWInputDeviceHelper;
    private Bundle mAppProperties;
    private CustomGlobalLayoutListener mCustomGlobalLayoutListener;
    private int mHeightMeasureSpec;
    private String mInitialUITemplate;
    private boolean mIsAttachedToInstance;
    private String mJSModuleName;
    private JSPointerDispatcher mJSPointerDispatcher;
    private JSTouchDispatcher mJSTouchDispatcher;
    private int mLastHeight;
    private int mLastOffsetX;
    private int mLastOffsetY;
    private int mLastWidth;
    private ReactInstanceManager mReactInstanceManager;
    private ReactRootViewEventListener mRootViewEventListener;
    private int mRootViewTag;
    private boolean mShouldLogContentAppeared;
    private final AtomicInteger mState;
    private int mUIManagerType;
    private boolean mWasMeasured;
    private int mWidthMeasureSpec;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class CustomGlobalLayoutListener implements ViewTreeObserver.OnGlobalLayoutListener {
        private final int mMinKeyboardHeightDetected;
        private final Rect mVisibleViewArea;
        private boolean mKeyboardIsVisible = false;
        private int mKeyboardHeight = 0;
        private int mDeviceRotation = 0;

        CustomGlobalLayoutListener() {
            DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(ReactRootView.this.getContext().getApplicationContext());
            this.mVisibleViewArea = new Rect();
            this.mMinKeyboardHeightDetected = (int) PixelUtil.toPixelFromDIP(60.0f);
        }

        private void checkForDeviceDimensionsChanges() {
            emitUpdateDimensionsEvent();
        }

        private void checkForDeviceOrientationChanges() {
            int rotation = ((WindowManager) ReactRootView.this.getContext().getSystemService("window")).getDefaultDisplay().getRotation();
            if (this.mDeviceRotation == rotation) {
                return;
            }
            this.mDeviceRotation = rotation;
            DisplayMetricsHolder.initDisplayMetrics(ReactRootView.this.getContext().getApplicationContext());
            emitOrientationChanged(rotation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void checkForKeyboardEvents() {
            int ime;
            boolean isVisible;
            int ime2;
            Insets insets;
            int systemBars;
            Insets insets2;
            int i;
            int i2;
            int i3;
            ReactRootView.this.getRootView().getWindowVisibleDisplayFrame(this.mVisibleViewArea);
            WindowInsets rootWindowInsets = ReactRootView.this.getRootView().getRootWindowInsets();
            if (rootWindowInsets == null) {
                return;
            }
            ime = WindowInsets.Type.ime();
            isVisible = rootWindowInsets.isVisible(ime);
            if (isVisible != this.mKeyboardIsVisible) {
                this.mKeyboardIsVisible = isVisible;
                if (isVisible) {
                    ime2 = WindowInsets.Type.ime();
                    insets = rootWindowInsets.getInsets(ime2);
                    systemBars = WindowInsets.Type.systemBars();
                    insets2 = rootWindowInsets.getInsets(systemBars);
                    i = insets.bottom;
                    i2 = insets2.bottom;
                    int i4 = i - i2;
                    if (getActivity().getWindow().getAttributes().softInputMode == 48) {
                        i3 = this.mVisibleViewArea.bottom - i4;
                    } else {
                        i3 = this.mVisibleViewArea.bottom;
                    }
                    ReactRootView.this.sendEvent("keyboardDidShow", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(i3), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.left), PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), PixelUtil.toDIPFromPixel(i4)));
                    return;
                }
                ReactRootView reactRootView = ReactRootView.this;
                reactRootView.sendEvent("keyboardDidHide", createKeyboardEventPayload(PixelUtil.toDIPFromPixel(reactRootView.mLastHeight), 0.0d, PixelUtil.toDIPFromPixel(this.mVisibleViewArea.width()), 0.0d));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
            r0 = r0.getDisplayCutout();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void checkForKeyboardEventsLegacy() {
            /*
                r11 = this;
                com.facebook.react.ReactRootView r0 = com.facebook.react.ReactRootView.this
                android.view.View r0 = r0.getRootView()
                android.graphics.Rect r1 = r11.mVisibleViewArea
                r0.getWindowVisibleDisplayFrame(r1)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                r2 = 0
                if (r0 < r1) goto L29
                com.facebook.react.ReactRootView r0 = com.facebook.react.ReactRootView.this
                android.view.View r0 = r0.getRootView()
                android.view.WindowInsets r0 = r0.getRootWindowInsets()
                if (r0 == 0) goto L29
                android.view.DisplayCutout r0 = androidx.core.view.C1275i3.m37431a(r0)
                if (r0 == 0) goto L29
                int r0 = androidx.core.view.C1318q.m37347a(r0)
                goto L2a
            L29:
                r0 = r2
            L2a:
                android.util.DisplayMetrics r1 = com.facebook.react.uimanager.DisplayMetricsHolder.getWindowDisplayMetrics()
                int r1 = r1.heightPixels
                android.graphics.Rect r3 = r11.mVisibleViewArea
                int r3 = r3.bottom
                int r1 = r1 - r3
                int r1 = r1 + r0
                int r0 = r11.mKeyboardHeight
                r4 = 1
                if (r0 == r1) goto L41
                int r5 = r11.mMinKeyboardHeightDetected
                if (r1 <= r5) goto L41
                r5 = r4
                goto L42
            L41:
                r5 = r2
            L42:
                if (r5 == 0) goto L79
                r11.mKeyboardHeight = r1
                r11.mKeyboardIsVisible = r4
                com.facebook.react.ReactRootView r0 = com.facebook.react.ReactRootView.this
                float r1 = (float) r3
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r3 = (double) r1
                android.graphics.Rect r1 = r11.mVisibleViewArea
                int r1 = r1.left
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r5 = (double) r1
                android.graphics.Rect r1 = r11.mVisibleViewArea
                int r1 = r1.width()
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r7 = (double) r1
                int r1 = r11.mKeyboardHeight
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r9 = (double) r1
                r2 = r11
                com.facebook.react.bridge.WritableMap r1 = r2.createKeyboardEventPayload(r3, r5, r7, r9)
                java.lang.String r2 = "keyboardDidShow"
                r0.sendEvent(r2, r1)
                return
            L79:
                if (r0 == 0) goto L80
                int r0 = r11.mMinKeyboardHeightDetected
                if (r1 > r0) goto L80
                goto L81
            L80:
                r4 = r2
            L81:
                if (r4 == 0) goto Lad
                r11.mKeyboardHeight = r2
                r11.mKeyboardIsVisible = r2
                com.facebook.react.ReactRootView r0 = com.facebook.react.ReactRootView.this
                int r1 = com.facebook.react.ReactRootView.m30502a(r0)
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r3 = (double) r1
                r5 = 0
                android.graphics.Rect r1 = r11.mVisibleViewArea
                int r1 = r1.width()
                float r1 = (float) r1
                float r1 = com.facebook.react.uimanager.PixelUtil.toDIPFromPixel(r1)
                double r7 = (double) r1
                r9 = 0
                r2 = r11
                com.facebook.react.bridge.WritableMap r1 = r2.createKeyboardEventPayload(r3, r5, r7, r9)
                java.lang.String r2 = "keyboardDidHide"
                r0.sendEvent(r2, r1)
            Lad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.CustomGlobalLayoutListener.checkForKeyboardEventsLegacy():void");
        }

        private WritableMap createKeyboardEventPayload(double d, double d2, double d3, double d4) {
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putDouble("height", d4);
            createMap2.putDouble("screenX", d2);
            createMap2.putDouble("width", d3);
            createMap2.putDouble("screenY", d);
            createMap.putMap("endCoordinates", createMap2);
            createMap.putString("easing", "keyboard");
            createMap.putDouble("duration", 0.0d);
            return createMap;
        }

        private void emitOrientationChanged(int i) {
            String str;
            double d;
            boolean z = false;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        str = "landscape-secondary";
                        d = 90.0d;
                    } else {
                        str = "portrait-secondary";
                        d = 180.0d;
                    }
                } else {
                    str = "landscape-primary";
                    d = -90.0d;
                }
                z = true;
            } else {
                str = "portrait-primary";
                d = 0.0d;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString(ZeroconfModule.KEY_SERVICE_NAME, str);
            createMap.putDouble("rotationDegrees", d);
            createMap.putBoolean("isLandscape", z);
            ReactRootView.this.sendEvent("namedOrientationDidChange", createMap);
        }

        private void emitUpdateDimensionsEvent() {
            DeviceInfoModule deviceInfoModule = (DeviceInfoModule) ReactRootView.this.getCurrentReactContext().getNativeModule(DeviceInfoModule.class);
            if (deviceInfoModule != null) {
                deviceInfoModule.emitUpdateDimensionsEvent();
            }
        }

        private Activity getActivity() {
            Context context = ReactRootView.this.getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            return (Activity) context;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (ReactRootView.this.hasActiveReactContext() && ReactRootView.this.isViewAttachedToReactInstance()) {
                if (Build.VERSION.SDK_INT >= 30) {
                    checkForKeyboardEvents();
                } else {
                    checkForKeyboardEventsLegacy();
                }
                checkForDeviceOrientationChanges();
                checkForDeviceDimensionsChanges();
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ReactRootViewEventListener {
        void onAttachedToReactInstance(ReactRootView reactRootView);
    }

    public ReactRootView(Context context) {
        super(context);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }

    private void attachToReactInstanceManager() {
        C7382a.m20813c(0L, "attachToReactInstanceManager");
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_START);
        if (getId() != -1) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalViewOperationException("Trying to attach a ReactRootView with an explicit id already set to [" + getId() + "]. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID."));
        }
        try {
            if (this.mIsAttachedToInstance) {
                return;
            }
            this.mIsAttachedToInstance = true;
            ((ReactInstanceManager) C5743a.m24583c(this.mReactInstanceManager)).attachRootView(this);
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_ATTACH_TO_REACT_INSTANCE_MANAGER_END);
            C7382a.m20809g(0L);
        }
    }

    private CustomGlobalLayoutListener getCustomGlobalLayoutListener() {
        if (this.mCustomGlobalLayoutListener == null) {
            this.mCustomGlobalLayoutListener = new CustomGlobalLayoutListener();
        }
        return this.mCustomGlobalLayoutListener;
    }

    private void init() {
        setRootViewTag(ReactRootViewTagGenerator.getNextRootViewTag());
        setClipChildren(false);
    }

    private boolean isDispatcherReady() {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSTouchDispatcher == null) {
                C13677a.m1870H(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
                return false;
            } else if (ReactFeatureFlags.dispatchPointerEvents && this.mJSPointerDispatcher == null) {
                C13677a.m1870H(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return false;
            } else {
                return true;
            }
        }
        C13677a.m1870H(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
        return false;
    }

    private boolean isFabric() {
        return getUIManagerType() == 2;
    }

    private boolean isRootViewTagSet() {
        int i = this.mRootViewTag;
        return (i == 0 || i == -1) ? false : true;
    }

    private void removeOnGlobalLayoutListener() {
        getViewTreeObserver().removeOnGlobalLayoutListener(getCustomGlobalLayoutListener());
    }

    private void setSurfaceConstraintsToScreenSize() {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, Integer.MIN_VALUE);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(displayMetrics.heightPixels, Integer.MIN_VALUE);
    }

    private void updateRootLayoutSpecs(boolean z, int i, int i2) {
        UIManager uIManager;
        int i3;
        int i4;
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_START);
        if (!hasActiveReactInstance()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C13677a.m1870H(TAG, "Unable to update root layout specs for uninitialized ReactInstanceManager");
            return;
        }
        boolean isFabric = isFabric();
        if (isFabric && !isRootViewTagSet()) {
            ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
            C13677a.m1854j(TAG, "Unable to update root layout specs for ReactRootView: no rootViewTag set yet");
            return;
        }
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null && (uIManager = UIManagerHelper.getUIManager(currentReactContext, getUIManagerType())) != null) {
            if (isFabric) {
                Point viewportOffset = RootViewUtil.getViewportOffset(this);
                i3 = viewportOffset.x;
                i4 = viewportOffset.y;
            } else {
                i3 = 0;
                i4 = 0;
            }
            if (z || i3 != this.mLastOffsetX || i4 != this.mLastOffsetY) {
                uIManager.updateRootLayoutSpecs(getRootViewTag(), i, i2, i3, i4);
            }
            this.mLastOffsetX = i3;
            this.mLastOffsetY = i4;
        }
        ReactMarker.logMarker(ReactMarkerConstants.ROOT_VIEW_UPDATE_LAYOUT_SPECS_END);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (StackOverflowError e) {
            handleException(e);
        }
    }

    protected void dispatchJSPointerEvent(MotionEvent motionEvent, boolean z) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSPointerDispatcher == null) {
                if (!ReactFeatureFlags.dispatchPointerEvents) {
                    return;
                }
                C13677a.m1870H(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            UIManager uIManager = UIManagerHelper.getUIManager(getCurrentReactContext(), getUIManagerType());
            if (uIManager != null) {
                this.mJSPointerDispatcher.handleMotionEvent(motionEvent, (EventDispatcher) uIManager.getEventDispatcher(), z);
                return;
            }
            return;
        }
        C13677a.m1870H(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    protected void dispatchJSTouchEvent(MotionEvent motionEvent) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            if (this.mJSTouchDispatcher == null) {
                C13677a.m1870H(TAG, "Unable to dispatch touch to JS before the dispatcher is available");
                return;
            }
            UIManager uIManager = UIManagerHelper.getUIManager(getCurrentReactContext(), getUIManagerType());
            if (uIManager != null) {
                this.mJSTouchDispatcher.handleTouchEvent(motionEvent, (EventDispatcher) uIManager.getEventDispatcher());
                return;
            }
            return;
        }
        C13677a.m1870H(TAG, "Unable to dispatch touch to JS as the catalyst instance has not been attached");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.handleKeyEvent(keyEvent);
            return super.dispatchKeyEvent(keyEvent);
        }
        C13677a.m1870H(TAG, "Unable to handle key event as the catalyst instance has not been attached");
        return super.dispatchKeyEvent(keyEvent);
    }

    protected void finalize() {
        super.finalize();
        C5743a.m24584b(!this.mIsAttachedToInstance, "The application this ReactRootView was rendering was not unmounted before the ReactRootView was garbage collected. This usually means that your application is leaking large amounts of memory. To solve this, make sure to call ReactRootView#unmountReactApplication in the onDestroy() of your hosting Activity or in the onDestroyView() of your hosting Fragment.");
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public Bundle getAppProperties() {
        return this.mAppProperties;
    }

    public ReactContext getCurrentReactContext() {
        return this.mReactInstanceManager.getCurrentReactContext();
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getHeightMeasureSpec() {
        return this.mHeightMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public String getInitialUITemplate() {
        return this.mInitialUITemplate;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public String getJSModuleName() {
        return (String) C5743a.m24583c(this.mJSModuleName);
    }

    public ReactInstanceManager getReactInstanceManager() {
        return this.mReactInstanceManager;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public ViewGroup getRootViewGroup() {
        return this;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getRootViewTag() {
        return this.mRootViewTag;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public AtomicInteger getState() {
        return this.mState;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public String getSurfaceID() {
        Bundle appProperties = getAppProperties();
        if (appProperties != null) {
            return appProperties.getString("surfaceID");
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getUIManagerType() {
        return this.mUIManagerType;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public int getWidthMeasureSpec() {
        return this.mWidthMeasureSpec;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void handleException(Throwable th2) {
        if (hasActiveReactContext()) {
            getCurrentReactContext().handleException(new IllegalViewOperationException(th2.getMessage(), this, th2));
            return;
        }
        throw new RuntimeException(th2);
    }

    public boolean hasActiveReactContext() {
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        return (reactInstanceManager == null || reactInstanceManager.getCurrentReactContext() == null) ? false : true;
    }

    public boolean hasActiveReactInstance() {
        return this.mReactInstanceManager != null;
    }

    public boolean isViewAttachedToReactInstance() {
        return this.mIsAttachedToInstance;
    }

    public void onAttachedToReactInstance() {
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.mJSPointerDispatcher = new JSPointerDispatcher(this);
        }
        ReactRootViewEventListener reactRootViewEventListener = this.mRootViewEventListener;
        if (reactRootViewEventListener != null) {
            reactRootViewEventListener.onAttachedToReactInstance(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isViewAttachedToReactInstance()) {
            removeOnGlobalLayoutListener();
            getViewTreeObserver().addOnGlobalLayoutListener(getCustomGlobalLayoutListener());
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
        UIManager uIManager;
        if (isDispatcherReady() && (uIManager = UIManagerHelper.getUIManager(getCurrentReactContext(), getUIManagerType())) != null) {
            this.mJSTouchDispatcher.onChildEndedNativeGesture(motionEvent, (EventDispatcher) uIManager.getEventDispatcher());
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildEndedNativeGesture();
            }
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(MotionEvent motionEvent) {
        onChildStartedNativeGesture(null, motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isViewAttachedToReactInstance()) {
            removeOnGlobalLayoutListener();
        }
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.clearFocus();
            super.onFocusChanged(z, i, rect);
            return;
        }
        C13677a.m1870H(TAG, "Unable to handle focus changed event as the catalyst instance has not been attached");
        super.onFocusChanged(z, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        dispatchJSPointerEvent(motionEvent, false);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        dispatchJSPointerEvent(motionEvent, true);
        return super.onInterceptHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (shouldDispatchJSTouchEvent(motionEvent)) {
            dispatchJSTouchEvent(motionEvent);
        }
        dispatchJSPointerEvent(motionEvent, true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mWasMeasured && isFabric()) {
            updateRootLayoutSpecs(false, this.mWidthMeasureSpec, this.mHeightMeasureSpec);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x00ba, LOOP:1: B:16:0x0030->B:18:0x0036, LOOP_END, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:39:0x00ad, B:34:0x009e, B:36:0x00a2, B:38:0x00a6, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0069 A[Catch: all -> 0x00ba, LOOP:0: B:25:0x0063->B:27:0x0069, LOOP_END, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:39:0x00ad, B:34:0x009e, B:36:0x00a2, B:38:0x00a6, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:39:0x00ad, B:34:0x009e, B:36:0x00a2, B:38:0x00a6, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x00ba, TryCatch #0 {all -> 0x00ba, blocks: (B:3:0x000c, B:5:0x0012, B:10:0x001a, B:14:0x0029, B:19:0x0054, B:23:0x005d, B:28:0x0087, B:30:0x0092, B:32:0x0098, B:39:0x00ad, B:34:0x009e, B:36:0x00a2, B:38:0x00a6, B:25:0x0063, B:27:0x0069, B:16:0x0030, B:18:0x0036), top: B:45:0x000c }] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            java.lang.String r0 = "ReactRootView.onMeasure"
            r1 = 0
            p150i5.C7382a.m20813c(r1, r0)
            com.facebook.react.bridge.ReactMarkerConstants r0 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_START
            com.facebook.react.bridge.ReactMarker.logMarker(r0)
            int r0 = r10.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lba
            r3 = 0
            r4 = 1
            if (r11 != r0) goto L19
            int r0 = r10.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lba
            if (r12 == r0) goto L17
            goto L19
        L17:
            r0 = r3
            goto L1a
        L19:
            r0 = r4
        L1a:
            r10.mWidthMeasureSpec = r11     // Catch: java.lang.Throwable -> Lba
            r10.mHeightMeasureSpec = r12     // Catch: java.lang.Throwable -> Lba
            int r5 = android.view.View.MeasureSpec.getMode(r11)     // Catch: java.lang.Throwable -> Lba
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L2e
            if (r5 != 0) goto L29
            goto L2e
        L29:
            int r11 = android.view.View.MeasureSpec.getSize(r11)     // Catch: java.lang.Throwable -> Lba
            goto L54
        L2e:
            r11 = r3
            r5 = r11
        L30:
            int r7 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lba
            if (r5 >= r7) goto L54
            android.view.View r7 = r10.getChildAt(r5)     // Catch: java.lang.Throwable -> Lba
            int r8 = r7.getLeft()     // Catch: java.lang.Throwable -> Lba
            int r9 = r7.getMeasuredWidth()     // Catch: java.lang.Throwable -> Lba
            int r8 = r8 + r9
            int r9 = r7.getPaddingLeft()     // Catch: java.lang.Throwable -> Lba
            int r8 = r8 + r9
            int r7 = r7.getPaddingRight()     // Catch: java.lang.Throwable -> Lba
            int r8 = r8 + r7
            int r11 = java.lang.Math.max(r11, r8)     // Catch: java.lang.Throwable -> Lba
            int r5 = r5 + 1
            goto L30
        L54:
            int r5 = android.view.View.MeasureSpec.getMode(r12)     // Catch: java.lang.Throwable -> Lba
            if (r5 == r6) goto L62
            if (r5 != 0) goto L5d
            goto L62
        L5d:
            int r12 = android.view.View.MeasureSpec.getSize(r12)     // Catch: java.lang.Throwable -> Lba
            goto L87
        L62:
            r12 = r3
        L63:
            int r5 = r10.getChildCount()     // Catch: java.lang.Throwable -> Lba
            if (r3 >= r5) goto L87
            android.view.View r5 = r10.getChildAt(r3)     // Catch: java.lang.Throwable -> Lba
            int r6 = r5.getTop()     // Catch: java.lang.Throwable -> Lba
            int r7 = r5.getMeasuredHeight()     // Catch: java.lang.Throwable -> Lba
            int r6 = r6 + r7
            int r7 = r5.getPaddingTop()     // Catch: java.lang.Throwable -> Lba
            int r6 = r6 + r7
            int r5 = r5.getPaddingBottom()     // Catch: java.lang.Throwable -> Lba
            int r6 = r6 + r5
            int r12 = java.lang.Math.max(r12, r6)     // Catch: java.lang.Throwable -> Lba
            int r3 = r3 + 1
            goto L63
        L87:
            r10.setMeasuredDimension(r11, r12)     // Catch: java.lang.Throwable -> Lba
            r10.mWasMeasured = r4     // Catch: java.lang.Throwable -> Lba
            boolean r3 = r10.hasActiveReactInstance()     // Catch: java.lang.Throwable -> Lba
            if (r3 == 0) goto L9c
            boolean r3 = r10.isViewAttachedToReactInstance()     // Catch: java.lang.Throwable -> Lba
            if (r3 != 0) goto L9c
            r10.attachToReactInstanceManager()     // Catch: java.lang.Throwable -> Lba
            goto Lad
        L9c:
            if (r0 != 0) goto La6
            int r0 = r10.mLastWidth     // Catch: java.lang.Throwable -> Lba
            if (r0 != r11) goto La6
            int r0 = r10.mLastHeight     // Catch: java.lang.Throwable -> Lba
            if (r0 == r12) goto Lad
        La6:
            int r0 = r10.mWidthMeasureSpec     // Catch: java.lang.Throwable -> Lba
            int r3 = r10.mHeightMeasureSpec     // Catch: java.lang.Throwable -> Lba
            r10.updateRootLayoutSpecs(r4, r0, r3)     // Catch: java.lang.Throwable -> Lba
        Lad:
            r10.mLastWidth = r11     // Catch: java.lang.Throwable -> Lba
            r10.mLastHeight = r12     // Catch: java.lang.Throwable -> Lba
            com.facebook.react.bridge.ReactMarkerConstants r11 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r11)
            p150i5.C7382a.m20809g(r1)
            return
        Lba:
            r11 = move-exception
            com.facebook.react.bridge.ReactMarkerConstants r12 = com.facebook.react.bridge.ReactMarkerConstants.ROOT_VIEW_ON_MEASURE_END
            com.facebook.react.bridge.ReactMarker.logMarker(r12)
            p150i5.C7382a.m20809g(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.ReactRootView.onMeasure(int, int):void");
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void onStage(int i) {
        if (i != 101) {
            return;
        }
        onAttachedToReactInstance();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (shouldDispatchJSTouchEvent(motionEvent)) {
            dispatchJSTouchEvent(motionEvent);
        }
        dispatchJSPointerEvent(motionEvent, false);
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (view instanceof ReactClippingProhibitedView) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.ReactRootView.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!view.isShown()) {
                        ReactSoftExceptionLogger.logSoftException(ReactRootView.TAG, new ReactNoCrashSoftException("A view was illegally added as a child of a ReactRootView. This View should not be a direct child of a ReactRootView, because it is not visible and will never be reachable. Child: " + view.getClass().getCanonicalName().toString() + " child ID: " + view.getId()));
                    }
                }
            });
        }
        if (this.mShouldLogContentAppeared) {
            this.mShouldLogContentAppeared = false;
            String str = this.mJSModuleName;
            if (str != null) {
                ReactMarker.logMarker(ReactMarkerConstants.CONTENT_APPEARED, str, this.mRootViewTag);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (hasActiveReactContext() && isViewAttachedToReactInstance()) {
            this.mAndroidHWInputDeviceHelper.onFocusChanged(view2);
            super.requestChildFocus(view, view2);
            return;
        }
        C13677a.m1870H(TAG, "Unable to handle child focus changed event as the catalyst instance has not been attached");
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void runApplication() {
        C7382a.m20813c(0L, "ReactRootView.runApplication");
        try {
            if (hasActiveReactInstance() && isViewAttachedToReactInstance()) {
                ReactContext currentReactContext = getCurrentReactContext();
                if (currentReactContext == null) {
                    return;
                }
                CatalystInstance catalystInstance = currentReactContext.getCatalystInstance();
                String jSModuleName = getJSModuleName();
                if (this.mWasMeasured) {
                    updateRootLayoutSpecs(true, this.mWidthMeasureSpec, this.mHeightMeasureSpec);
                }
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putDouble("rootTag", getRootViewTag());
                Bundle appProperties = getAppProperties();
                if (appProperties != null) {
                    writableNativeMap.putMap("initialProps", Arguments.fromBundle(appProperties));
                }
                this.mShouldLogContentAppeared = true;
                ((AppRegistry) catalystInstance.getJSModule(AppRegistry.class)).runApplication(jSModuleName, writableNativeMap);
            }
        } finally {
            C7382a.m20809g(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendEvent(String str, WritableMap writableMap) {
        if (hasActiveReactInstance()) {
            getCurrentReactContext().emitDeviceEvent(str, writableMap);
        }
    }

    public void setAppProperties(Bundle bundle) {
        UiThreadUtil.assertOnUiThread();
        this.mAppProperties = bundle;
        if (isRootViewTagSet()) {
            runApplication();
        }
    }

    public void setEventListener(ReactRootViewEventListener reactRootViewEventListener) {
        this.mRootViewEventListener = reactRootViewEventListener;
    }

    public void setIsFabric(boolean z) {
        this.mUIManagerType = z ? 2 : 1;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void setRootViewTag(int i) {
        this.mRootViewTag = i;
    }

    @Override // com.facebook.react.uimanager.ReactRoot
    public void setShouldLogContentAppeared(boolean z) {
        this.mShouldLogContentAppeared = z;
    }

    public boolean shouldDispatchJSTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @VisibleForTesting
    void simulateAttachForTesting() {
        this.mIsAttachedToInstance = true;
        this.mJSTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.mJSPointerDispatcher = new JSPointerDispatcher(this);
        }
    }

    @VisibleForTesting
    void simulateCheckForKeyboardForTesting() {
        if (Build.VERSION.SDK_INT >= 30) {
            getCustomGlobalLayoutListener().checkForKeyboardEvents();
        } else {
            getCustomGlobalLayoutListener().checkForKeyboardEventsLegacy();
        }
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str) {
        startReactApplication(reactInstanceManager, str, null);
    }

    public void unmountReactApplication() {
        ReactContext currentReactContext;
        UIManager uIManager;
        UiThreadUtil.assertOnUiThread();
        if (hasActiveReactInstance() && (currentReactContext = getCurrentReactContext()) != null && isFabric() && (uIManager = UIManagerHelper.getUIManager(currentReactContext, getUIManagerType())) != null) {
            int id2 = getId();
            setId(-1);
            removeAllViews();
            if (id2 == -1) {
                ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("unmountReactApplication called on ReactRootView with invalid id"));
            } else {
                uIManager.stopSurface(id2);
            }
        }
        ReactInstanceManager reactInstanceManager = this.mReactInstanceManager;
        if (reactInstanceManager != null && this.mIsAttachedToInstance) {
            reactInstanceManager.detachRootView(this);
            this.mIsAttachedToInstance = false;
        }
        this.mReactInstanceManager = null;
        this.mShouldLogContentAppeared = false;
    }

    @Override // com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
        UIManager uIManager;
        JSPointerDispatcher jSPointerDispatcher;
        if (isDispatcherReady() && (uIManager = UIManagerHelper.getUIManager(getCurrentReactContext(), getUIManagerType())) != null) {
            EventDispatcher eventDispatcher = (EventDispatcher) uIManager.getEventDispatcher();
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, eventDispatcher);
            if (view == null || (jSPointerDispatcher = this.mJSPointerDispatcher) == null) {
                return;
            }
            jSPointerDispatcher.onChildStartedNativeGesture(view, motionEvent, eventDispatcher);
        }
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, Bundle bundle) {
        startReactApplication(reactInstanceManager, str, bundle, null);
    }

    public void startReactApplication(ReactInstanceManager reactInstanceManager, String str, Bundle bundle, String str2) {
        C7382a.m20813c(0L, "startReactApplication");
        try {
            UiThreadUtil.assertOnUiThread();
            C5743a.m24584b(this.mReactInstanceManager == null, "This root view has already been attached to a catalyst instance manager");
            this.mReactInstanceManager = reactInstanceManager;
            this.mJSModuleName = str;
            this.mAppProperties = bundle;
            this.mInitialUITemplate = str2;
            reactInstanceManager.createReactContextInBackground();
            if (ReactFeatureFlags.enableEagerRootViewAttachment) {
                if (!this.mWasMeasured) {
                    setSurfaceConstraintsToScreenSize();
                }
                attachToReactInstanceManager();
            }
        } finally {
            C7382a.m20809g(0L);
        }
    }

    public ReactRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }

    public ReactRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mRootViewTag = 0;
        this.mAndroidHWInputDeviceHelper = new ReactAndroidHWInputDeviceHelper(this);
        this.mWasMeasured = false;
        this.mWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mLastWidth = 0;
        this.mLastHeight = 0;
        this.mLastOffsetX = Integer.MIN_VALUE;
        this.mLastOffsetY = Integer.MIN_VALUE;
        this.mUIManagerType = 1;
        this.mState = new AtomicInteger(0);
        init();
    }
}
