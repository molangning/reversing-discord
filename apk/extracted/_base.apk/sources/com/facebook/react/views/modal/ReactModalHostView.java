package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.core.content.C0946a;
import androidx.core.view.C1326r2;
import com.facebook.react.C3893R;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.FabricViewStateManager;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.common.ContextUtils;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import p058d5.C5743a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactModalHostView extends ViewGroup implements LifecycleEventListener, FabricViewStateManager.HasFabricViewStateManager {
    private static final String TAG = "ReactModalHost";
    private String mAnimationType;
    private Dialog mDialog;
    private boolean mHardwareAccelerated;
    private DialogRootViewGroup mHostView;
    private OnRequestCloseListener mOnRequestCloseListener;
    private DialogInterface.OnShowListener mOnShowListener;
    private boolean mPropertyRequiresNewDialog;
    private boolean mStatusBarTranslucent;
    private boolean mTransparent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class DialogRootViewGroup extends ReactViewGroup implements RootView, FabricViewStateManager.HasFabricViewStateManager {
        private boolean hasAdjustedSize;
        private EventDispatcher mEventDispatcher;
        private final FabricViewStateManager mFabricViewStateManager;
        private JSPointerDispatcher mJSPointerDispatcher;
        private final JSTouchDispatcher mJSTouchDispatcher;
        private int viewHeight;
        private int viewWidth;

        public DialogRootViewGroup(Context context) {
            super(context);
            this.hasAdjustedSize = false;
            this.mFabricViewStateManager = new FabricViewStateManager();
            this.mJSTouchDispatcher = new JSTouchDispatcher(this);
            if (ReactFeatureFlags.dispatchPointerEvents) {
                this.mJSPointerDispatcher = new JSPointerDispatcher(this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ThemedReactContext getReactContext() {
            return (ThemedReactContext) getContext();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventDispatcher(EventDispatcher eventDispatcher) {
            this.mEventDispatcher = eventDispatcher;
        }

        private void updateFirstChildView() {
            if (getChildCount() > 0) {
                this.hasAdjustedSize = false;
                final int id2 = getChildAt(0).getId();
                if (this.mFabricViewStateManager.hasStateWrapper()) {
                    updateState(this.viewWidth, this.viewHeight);
                    return;
                }
                ThemedReactContext reactContext = getReactContext();
                reactContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactContext) { // from class: com.facebook.react.views.modal.ReactModalHostView.DialogRootViewGroup.1
                    @Override // com.facebook.react.bridge.GuardedRunnable
                    public void runGuarded() {
                        UIManagerModule uIManagerModule = (UIManagerModule) DialogRootViewGroup.this.getReactContext().getReactApplicationContext().getNativeModule(UIManagerModule.class);
                        if (uIManagerModule == null) {
                            return;
                        }
                        uIManagerModule.updateNodeSize(id2, DialogRootViewGroup.this.viewWidth, DialogRootViewGroup.this.viewHeight);
                    }
                });
                return;
            }
            this.hasAdjustedSize = true;
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.hasAdjustedSize) {
                updateFirstChildView();
            }
        }

        @Override // com.facebook.react.uimanager.FabricViewStateManager.HasFabricViewStateManager
        public FabricViewStateManager getFabricViewStateManager() {
            return this.mFabricViewStateManager;
        }

        @Override // com.facebook.react.uimanager.RootView
        public void handleException(Throwable th2) {
            getReactContext().getReactApplicationContext().handleException(new RuntimeException(th2));
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildEndedNativeGesture(View view, MotionEvent motionEvent) {
            this.mJSTouchDispatcher.onChildEndedNativeGesture(motionEvent, this.mEventDispatcher);
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildEndedNativeGesture();
            }
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildStartedNativeGesture(MotionEvent motionEvent) {
            onChildStartedNativeGesture(null, motionEvent);
        }

        @Override // android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.handleMotionEvent(motionEvent, this.mEventDispatcher, false);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.handleMotionEvent(motionEvent, this.mEventDispatcher, true);
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, this.mEventDispatcher);
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.handleMotionEvent(motionEvent, this.mEventDispatcher, true);
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.viewWidth = i;
            this.viewHeight = i2;
            updateFirstChildView();
        }

        @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.mJSTouchDispatcher.handleTouchEvent(motionEvent, this.mEventDispatcher);
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.handleMotionEvent(motionEvent, this.mEventDispatcher, false);
            }
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public void updateState(int i, int i2) {
            float f;
            float f2;
            float f3;
            int i3 = this.viewWidth;
            if (i3 > 0) {
                f = i3;
            } else {
                f = i;
            }
            final float dIPFromPixel = PixelUtil.toDIPFromPixel(f);
            int i4 = this.viewHeight;
            if (i4 > 0) {
                f2 = i4;
            } else {
                f2 = i2;
            }
            final float dIPFromPixel2 = PixelUtil.toDIPFromPixel(f2);
            ReadableMap stateData = getFabricViewStateManager().getStateData();
            if (stateData != null) {
                float f4 = 0.0f;
                if (stateData.hasKey("screenHeight")) {
                    f3 = (float) stateData.getDouble("screenHeight");
                } else {
                    f3 = 0.0f;
                }
                if (stateData.hasKey("screenWidth")) {
                    f4 = (float) stateData.getDouble("screenWidth");
                }
                if (Math.abs(f4 - dIPFromPixel) < 0.9f && Math.abs(f3 - dIPFromPixel2) < 0.9f) {
                    return;
                }
            }
            this.mFabricViewStateManager.setState(new FabricViewStateManager.StateUpdateCallback() { // from class: com.facebook.react.views.modal.ReactModalHostView.DialogRootViewGroup.2
                @Override // com.facebook.react.uimanager.FabricViewStateManager.StateUpdateCallback
                public WritableMap getStateUpdate() {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putDouble("screenWidth", dIPFromPixel);
                    writableNativeMap.putDouble("screenHeight", dIPFromPixel2);
                    return writableNativeMap;
                }
            });
        }

        @Override // com.facebook.react.uimanager.RootView
        public void onChildStartedNativeGesture(View view, MotionEvent motionEvent) {
            this.mJSTouchDispatcher.onChildStartedNativeGesture(motionEvent, this.mEventDispatcher);
            JSPointerDispatcher jSPointerDispatcher = this.mJSPointerDispatcher;
            if (jSPointerDispatcher != null) {
                jSPointerDispatcher.onChildStartedNativeGesture(view, motionEvent, this.mEventDispatcher);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface OnRequestCloseListener {
        void onRequestClose(DialogInterface dialogInterface);
    }

    public ReactModalHostView(ThemedReactContext themedReactContext) {
        super(themedReactContext);
        themedReactContext.addLifecycleEventListener(this);
        this.mHostView = new DialogRootViewGroup(themedReactContext);
    }

    private void dismiss() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) ContextUtils.findContextOfType(this.mDialog.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.mDialog.dismiss();
            }
            this.mDialog = null;
            ((ViewGroup) this.mHostView.getParent()).removeViewAt(0);
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.mHostView);
        if (this.mStatusBarTranslucent) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ThemedReactContext) getContext()).getCurrentActivity();
    }

    private void updateProperties() {
        C5743a.m24582d(this.mDialog, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        Window window = this.mDialog.getWindow();
        if (currentActivity != null && !currentActivity.isFinishing() && window.isActive()) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                window.addFlags(1024);
            } else {
                window.clearFlags(1024);
            }
            if (this.mTransparent) {
                window.clearFlags(2);
                return;
            }
            window.setDimAmount(0.5f);
            window.setFlags(2, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.addView(view, i);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.mHostView.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        return this.mHostView.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        DialogRootViewGroup dialogRootViewGroup = this.mHostView;
        if (dialogRootViewGroup == null) {
            return 0;
        }
        return dialogRootViewGroup.getChildCount();
    }

    @VisibleForTesting
    public Dialog getDialog() {
        return this.mDialog;
    }

    @Override // com.facebook.react.uimanager.FabricViewStateManager.HasFabricViewStateManager
    public FabricViewStateManager getFabricViewStateManager() {
        return this.mHostView.getFabricViewStateManager();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dismiss();
    }

    public void onDropInstance() {
        ((ThemedReactContext) getContext()).removeLifecycleEventListener(this);
        dismiss();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        onDropInstance();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        showOrUpdate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.mHostView.removeView(getChildAt(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.mAnimationType = str;
        this.mPropertyRequiresNewDialog = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.mHostView.setEventDispatcher(eventDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.mHardwareAccelerated = z;
        this.mPropertyRequiresNewDialog = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(OnRequestCloseListener onRequestCloseListener) {
        this.mOnRequestCloseListener = onRequestCloseListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.mOnShowListener = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStatusBarTranslucent(boolean z) {
        this.mStatusBarTranslucent = z;
        this.mPropertyRequiresNewDialog = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.mTransparent = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void showOrUpdate() {
        Context context;
        WindowInsetsController insetsController;
        int systemBarsAppearance;
        WindowInsetsController insetsController2;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.mDialog;
        if (dialog != null) {
            Context context2 = (Context) ContextUtils.findContextOfType(dialog.getContext(), Activity.class);
            C13677a.m1854j(TAG, "Updating existing dialog with context: " + context2 + "@" + context2.hashCode());
            if (this.mPropertyRequiresNewDialog) {
                dismiss();
            } else {
                updateProperties();
                return;
            }
        }
        this.mPropertyRequiresNewDialog = false;
        int i = C3893R.style.Theme_FullScreenDialog;
        if (this.mAnimationType.equals("fade")) {
            i = C3893R.style.Theme_FullScreenDialogAnimatedFade;
        } else if (this.mAnimationType.equals("slide")) {
            i = C3893R.style.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            context = getContext();
        } else {
            context = currentActivity;
        }
        Dialog dialog2 = new Dialog(context, i);
        this.mDialog = dialog2;
        dialog2.getWindow().setFlags(8, 8);
        if (this.mTransparent && this.mStatusBarTranslucent) {
            this.mDialog.getWindow().addFlags(512);
            this.mDialog.getWindow().setNavigationBarColor(C0946a.m38401c(context, 17170445));
            C1326r2.m37340b(this.mDialog.getWindow(), false);
        }
        C13677a.m1854j(TAG, "Creating new dialog from context: " + context + "@" + context.hashCode());
        this.mDialog.setContentView(getContentView());
        updateProperties();
        this.mDialog.setOnShowListener(this.mOnShowListener);
        this.mDialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.facebook.react.views.modal.ReactModalHostView.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1) {
                    if (i2 != 4 && i2 != 111) {
                        Activity currentActivity2 = ((ReactContext) ReactModalHostView.this.getContext()).getCurrentActivity();
                        if (currentActivity2 != null) {
                            return currentActivity2.onKeyUp(i2, keyEvent);
                        }
                        return false;
                    }
                    C5743a.m24582d(ReactModalHostView.this.mOnRequestCloseListener, "setOnRequestCloseListener must be called by the manager");
                    ReactModalHostView.this.mOnRequestCloseListener.onRequestClose(dialogInterface);
                    return true;
                }
                return false;
            }
        });
        this.mDialog.getWindow().setSoftInputMode(16);
        if (this.mHardwareAccelerated) {
            this.mDialog.getWindow().addFlags(16777216);
        }
        if (currentActivity != null && !currentActivity.isFinishing()) {
            this.mDialog.show();
            if (context instanceof Activity) {
                if (Build.VERSION.SDK_INT > 30) {
                    insetsController = ((Activity) context).getWindow().getInsetsController();
                    systemBarsAppearance = insetsController.getSystemBarsAppearance();
                    insetsController2 = this.mDialog.getWindow().getInsetsController();
                    insetsController2.setSystemBarsAppearance(systemBarsAppearance, systemBarsAppearance);
                } else {
                    this.mDialog.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
                }
            }
            this.mDialog.getWindow().clearFlags(8);
        }
    }

    public void updateState(int i, int i2) {
        this.mHostView.updateState(i, i2);
    }
}
