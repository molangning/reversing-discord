package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.UIImplementation;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p150i5.C7382a;
import p150i5.C7384b;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class UIViewOperationQueue {
    public static final int DEFAULT_MIN_TIME_LEFT_IN_FRAME_FOR_NONBATCHED_OPERATION_MS = 8;
    private static final String TAG = "UIViewOperationQueue";
    private long mCreateViewCount;
    private final DispatchUIFrameCallback mDispatchUIFrameCallback;
    private final NativeViewHierarchyManager mNativeViewHierarchyManager;
    private long mNonBatchedExecutionTotalTime;
    private long mProfiledBatchBatchedExecutionTime;
    private long mProfiledBatchCommitEndTime;
    private long mProfiledBatchCommitStartTime;
    private long mProfiledBatchDispatchViewUpdatesTime;
    private long mProfiledBatchLayoutTime;
    private long mProfiledBatchNonBatchedExecutionTime;
    private long mProfiledBatchRunEndTime;
    private long mProfiledBatchRunStartTime;
    private final ReactApplicationContext mReactApplicationContext;
    private long mThreadCpuTime;
    private long mUpdatePropertiesOperationCount;
    private NotThreadSafeViewHierarchyUpdateDebugListener mViewHierarchyUpdateDebugListener;
    private final int[] mMeasureBuffer = new int[4];
    private final Object mDispatchRunnablesLock = new Object();
    private final Object mNonBatchedOperationsLock = new Object();
    private ArrayList<DispatchCommandViewOperation> mViewCommandOperations = new ArrayList<>();
    private ArrayList<UIOperation> mOperations = new ArrayList<>();
    private ArrayList<Runnable> mDispatchUIRunnables = new ArrayList<>();
    private ArrayDeque<UIOperation> mNonBatchedOperations = new ArrayDeque<>();
    private boolean mIsDispatchUIFrameCallbackEnqueued = false;
    private boolean mIsInIllegalUIState = false;
    private boolean mIsProfilingNextBatch = false;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static abstract class AnimationOperation implements UIOperation {
        protected final int mAnimationID;

        public AnimationOperation(int i) {
            this.mAnimationID = i;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class ChangeJSResponderOperation extends ViewOperation {
        private final boolean mBlockNativeResponder;
        private final boolean mClearResponder;
        private final int mInitialTag;

        public ChangeJSResponderOperation(int i, int i2, boolean z, boolean z2) {
            super(i);
            this.mInitialTag = i2;
            this.mClearResponder = z;
            this.mBlockNativeResponder = z2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            if (!this.mClearResponder) {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.setJSResponder(this.mTag, this.mInitialTag, this.mBlockNativeResponder);
            } else {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearJSResponder();
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class ConfigureLayoutAnimationOperation implements UIOperation {
        private final Callback mAnimationComplete;
        private final ReadableMap mConfig;

        private ConfigureLayoutAnimationOperation(ReadableMap readableMap, Callback callback) {
            this.mConfig = readableMap;
            this.mAnimationComplete = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.configureLayoutAnimation(this.mConfig, this.mAnimationComplete);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class CreateViewOperation extends ViewOperation {
        private final String mClassName;
        private final ReactStylesDiffMap mInitialProps;
        private final ThemedReactContext mThemedContext;

        public CreateViewOperation(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mThemedContext = themedReactContext;
            this.mClassName = str;
            this.mInitialProps = reactStylesDiffMap;
            C7382a.m20806j(0L, "createView", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            C7382a.m20812d(0L, "createView", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.createView(this.mThemedContext, this.mTag, this.mClassName, this.mInitialProps);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class DismissPopupMenuOperation implements UIOperation {
        private DismissPopupMenuOperation() {
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dismissPopupMenu();
        }
    }

    @Deprecated
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class DispatchCommandOperation extends ViewOperation implements DispatchCommandViewOperation {
        private final ReadableArray mArgs;
        private final int mCommand;
        private int numRetries;

        public DispatchCommandOperation(int i, int i2, ReadableArray readableArray) {
            super(i);
            this.numRetries = 0;
            this.mCommand = i2;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private interface DispatchCommandViewOperation {
        void executeWithExceptions();

        int getRetries();

        void incrementRetries();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class DispatchStringCommandOperation extends ViewOperation implements DispatchCommandViewOperation {
        private final ReadableArray mArgs;
        private final String mCommand;
        private int numRetries;

        public DispatchStringCommandOperation(int i, String str, ReadableArray readableArray) {
            super(i);
            this.numRetries = 0;
            this.mCommand = str;
            this.mArgs = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
            } catch (Throwable th2) {
                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new RuntimeException("Error dispatching View Command", th2));
            }
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void executeWithExceptions() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.dispatchCommand(this.mTag, this.mCommand, this.mArgs);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public int getRetries() {
            return this.numRetries;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.DispatchCommandViewOperation
        public void incrementRetries() {
            this.numRetries++;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class DispatchUIFrameCallback extends GuardedFrameCallback {
        private static final int FRAME_TIME_MS = 16;
        private final int mMinTimeLeftInFrameForNonBatchedOperationMs;

        private DispatchUIFrameCallback(ReactContext reactContext, int i) {
            super(reactContext);
            this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        }

        private void dispatchPendingNonBatchedOperations(long j) {
            UIOperation uIOperation;
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.mMinTimeLeftInFrameForNonBatchedOperationMs) {
                synchronized (UIViewOperationQueue.this.mNonBatchedOperationsLock) {
                    if (UIViewOperationQueue.this.mNonBatchedOperations.isEmpty()) {
                        return;
                    }
                    uIOperation = (UIOperation) UIViewOperationQueue.this.mNonBatchedOperations.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    uIOperation.execute();
                    UIViewOperationQueue.this.mNonBatchedExecutionTotalTime += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e) {
                    UIViewOperationQueue.this.mIsInIllegalUIState = true;
                    throw e;
                }
            }
        }

        @Override // com.facebook.react.uimanager.GuardedFrameCallback
        public void doFrameGuarded(long j) {
            if (UIViewOperationQueue.this.mIsInIllegalUIState) {
                C13677a.m1870H(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            C7382a.m20813c(0L, "dispatchNonBatchedUIOperations");
            try {
                dispatchPendingNonBatchedOperations(j);
                C7382a.m20809g(0L);
                UIViewOperationQueue.this.flushPendingBatches();
                ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this);
            } catch (Throwable th2) {
                C7382a.m20809g(0L);
                throw th2;
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class EmitOnLayoutEventOperation extends ViewOperation {
        private final int mScreenHeight;
        private final int mScreenWidth;
        private final int mScreenX;
        private final int mScreenY;

        public EmitOnLayoutEventOperation(int i, int i2, int i3, int i4, int i5) {
            super(i);
            this.mScreenX = i2;
            this.mScreenY = i3;
            this.mScreenWidth = i4;
            this.mScreenHeight = i5;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIManagerModule uIManagerModule = (UIManagerModule) UIViewOperationQueue.this.mReactApplicationContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.getEventDispatcher().dispatchEvent(OnLayoutEvent.obtain(-1, this.mTag, this.mScreenX, this.mScreenY, this.mScreenWidth, this.mScreenHeight));
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class FindTargetForTouchOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;
        private final float mTargetX;
        private final float mTargetY;

        private FindTargetForTouchOperation(int i, float f, float f2, Callback callback) {
            this.mReactTag = i;
            this.mTargetX = f;
            this.mTargetY = f2;
            this.mCallback = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float f = UIViewOperationQueue.this.mMeasureBuffer[0];
                float f2 = UIViewOperationQueue.this.mMeasureBuffer[1];
                int findTargetTagForTouch = UIViewOperationQueue.this.mNativeViewHierarchyManager.findTargetTagForTouch(this.mReactTag, this.mTargetX, this.mTargetY);
                try {
                    UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(findTargetTagForTouch, UIViewOperationQueue.this.mMeasureBuffer);
                    this.mCallback.invoke(Integer.valueOf(findTargetTagForTouch), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0] - f)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1] - f2)), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
                } catch (IllegalViewOperationException unused) {
                    this.mCallback.invoke(new Object[0]);
                }
            } catch (IllegalViewOperationException unused2) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class LayoutUpdateFinishedOperation implements UIOperation {
        private final UIImplementation.LayoutUpdateListener mListener;
        private final ReactShadowNode mNode;

        private LayoutUpdateFinishedOperation(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
            this.mNode = reactShadowNode;
            this.mListener = layoutUpdateListener;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mListener.onLayoutUpdated(this.mNode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class ManageChildrenOperation extends ViewOperation {
        private final int[] mIndicesToRemove;
        private final int[] mTagsToDelete;
        private final ViewAtIndex[] mViewsToAdd;

        public ManageChildrenOperation(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
            super(i);
            this.mIndicesToRemove = iArr;
            this.mViewsToAdd = viewAtIndexArr;
            this.mTagsToDelete = iArr2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.manageChildren(this.mTag, this.mIndicesToRemove, this.mViewsToAdd, this.mTagsToDelete);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class MeasureInWindowOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        private MeasureInWindowOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measureInWindow(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                this.mCallback.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class MeasureOperation implements UIOperation {
        private final Callback mCallback;
        private final int mReactTag;

        private MeasureOperation(int i, Callback callback) {
            this.mReactTag = i;
            this.mCallback = callback;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            try {
                UIViewOperationQueue.this.mNativeViewHierarchyManager.measure(this.mReactTag, UIViewOperationQueue.this.mMeasureBuffer);
                float dIPFromPixel = PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[0]);
                float dIPFromPixel2 = PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[1]);
                this.mCallback.invoke(0, 0, Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[2])), Float.valueOf(PixelUtil.toDIPFromPixel(UIViewOperationQueue.this.mMeasureBuffer[3])), Float.valueOf(dIPFromPixel), Float.valueOf(dIPFromPixel2));
            } catch (NoSuchNativeViewException unused) {
                this.mCallback.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class RemoveRootViewOperation extends ViewOperation {
        public RemoveRootViewOperation(int i) {
            super(i);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.removeRootView(this.mTag);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class SendAccessibilityEvent extends ViewOperation {
        private final int mEventType;

        private SendAccessibilityEvent(int i, int i2) {
            super(i);
            this.mEventType = i2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.sendAccessibilityEvent(this.mTag, this.mEventType);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class SetChildrenOperation extends ViewOperation {
        private final ReadableArray mChildrenTags;

        public SetChildrenOperation(int i, ReadableArray readableArray) {
            super(i);
            this.mChildrenTags = readableArray;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setChildren(this.mTag, this.mChildrenTags);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class SetLayoutAnimationEnabledOperation implements UIOperation {
        private final boolean mEnabled;

        private SetLayoutAnimationEnabledOperation(boolean z) {
            this.mEnabled = z;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.setLayoutAnimationEnabled(this.mEnabled);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class ShowPopupMenuOperation extends ViewOperation {
        private final Callback mError;
        private final ReadableArray mItems;
        private final Callback mSuccess;

        public ShowPopupMenuOperation(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(i);
            this.mItems = readableArray;
            this.mError = callback;
            this.mSuccess = callback2;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.showPopupMenu(this.mTag, this.mItems, this.mSuccess, this.mError);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class UIBlockOperation implements UIOperation {
        private final UIBlock mBlock;

        public UIBlockOperation(UIBlock uIBlock) {
            this.mBlock = uIBlock;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            this.mBlock.execute(UIViewOperationQueue.this.mNativeViewHierarchyManager);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface UIOperation {
        void execute();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class UpdateInstanceHandleOperation extends ViewOperation {
        private final long mInstanceHandle;

        private UpdateInstanceHandleOperation(int i, long j) {
            super(i);
            this.mInstanceHandle = j;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateInstanceHandle(this.mTag, this.mInstanceHandle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class UpdateLayoutOperation extends ViewOperation {
        private final int mHeight;
        private final int mParentTag;
        private final int mWidth;

        /* renamed from: mX */
        private final int f10918mX;

        /* renamed from: mY */
        private final int f10919mY;

        public UpdateLayoutOperation(int i, int i2, int i3, int i4, int i5, int i6) {
            super(i2);
            this.mParentTag = i;
            this.f10918mX = i3;
            this.f10919mY = i4;
            this.mWidth = i5;
            this.mHeight = i6;
            C7382a.m20806j(0L, "updateLayout", this.mTag);
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            C7382a.m20812d(0L, "updateLayout", this.mTag);
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateLayout(this.mParentTag, this.mTag, this.f10918mX, this.f10919mY, this.mWidth, this.mHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public final class UpdatePropertiesOperation extends ViewOperation {
        private final ReactStylesDiffMap mProps;

        private UpdatePropertiesOperation(int i, ReactStylesDiffMap reactStylesDiffMap) {
            super(i);
            this.mProps = reactStylesDiffMap;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateProperties(this.mTag, this.mProps);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private final class UpdateViewExtraData extends ViewOperation {
        private final Object mExtraData;

        public UpdateViewExtraData(int i, Object obj) {
            super(i);
            this.mExtraData = obj;
        }

        @Override // com.facebook.react.uimanager.UIViewOperationQueue.UIOperation
        public void execute() {
            UIViewOperationQueue.this.mNativeViewHierarchyManager.updateViewExtraData(this.mTag, this.mExtraData);
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private abstract class ViewOperation implements UIOperation {
        public int mTag;

        public ViewOperation(int i) {
            this.mTag = i;
        }
    }

    public UIViewOperationQueue(ReactApplicationContext reactApplicationContext, NativeViewHierarchyManager nativeViewHierarchyManager, int i) {
        this.mNativeViewHierarchyManager = nativeViewHierarchyManager;
        this.mDispatchUIFrameCallback = new DispatchUIFrameCallback(reactApplicationContext, i == -1 ? 8 : i);
        this.mReactApplicationContext = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void flushPendingBatches() {
        if (this.mIsInIllegalUIState) {
            C13677a.m1870H(ReactConstants.TAG, "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.mDispatchRunnablesLock) {
            if (!this.mDispatchUIRunnables.isEmpty()) {
                ArrayList<Runnable> arrayList = this.mDispatchUIRunnables;
                this.mDispatchUIRunnables = new ArrayList<>();
                long uptimeMillis = SystemClock.uptimeMillis();
                Iterator<Runnable> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().run();
                }
                if (this.mIsProfilingNextBatch) {
                    this.mProfiledBatchBatchedExecutionTime = SystemClock.uptimeMillis() - uptimeMillis;
                    this.mProfiledBatchNonBatchedExecutionTime = this.mNonBatchedExecutionTotalTime;
                    this.mIsProfilingNextBatch = false;
                    C7382a.m20814b(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                    C7382a.m20811e(0L, "batchedExecutionTime", 0);
                }
                this.mNonBatchedExecutionTotalTime = 0L;
            }
        }
    }

    public void addRootView(int i, View view) {
        this.mNativeViewHierarchyManager.addRootView(i, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public void dispatchViewUpdates(final int i, final long j, final long j2) {
        long j3;
        final ArrayList<DispatchCommandViewOperation> arrayList;
        final ArrayList<UIOperation> arrayList2;
        final ArrayDeque<UIOperation> arrayDeque;
        C7384b.m20802a(0L, "UIViewOperationQueue.dispatchViewUpdates").mo20800a("batchId", i).mo20798c();
        try {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j3 = 0;
            ArrayDeque<UIOperation> arrayDeque2 = null;
            if (!this.mViewCommandOperations.isEmpty()) {
                ArrayList<DispatchCommandViewOperation> arrayList3 = this.mViewCommandOperations;
                this.mViewCommandOperations = new ArrayList<>();
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            if (!this.mOperations.isEmpty()) {
                ArrayList<UIOperation> arrayList4 = this.mOperations;
                this.mOperations = new ArrayList<>();
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            synchronized (this.mNonBatchedOperationsLock) {
                try {
                    if (!this.mNonBatchedOperations.isEmpty()) {
                        arrayDeque2 = this.mNonBatchedOperations;
                        this.mNonBatchedOperations = new ArrayDeque<>();
                    }
                    arrayDeque = arrayDeque2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener = this.mViewHierarchyUpdateDebugListener;
            if (notThreadSafeViewHierarchyUpdateDebugListener != null) {
                notThreadSafeViewHierarchyUpdateDebugListener.onViewHierarchyUpdateEnqueued();
            }
            try {
                Runnable runnable = new Runnable() { // from class: com.facebook.react.uimanager.UIViewOperationQueue.1
                    @Override // java.lang.Runnable
                    public void run() {
                        C7384b.m20802a(0L, "DispatchUI").mo20800a("BatchId", i).mo20798c();
                        try {
                            try {
                                long uptimeMillis2 = SystemClock.uptimeMillis();
                                ArrayList arrayList5 = arrayList;
                                if (arrayList5 != null) {
                                    Iterator it = arrayList5.iterator();
                                    while (it.hasNext()) {
                                        DispatchCommandViewOperation dispatchCommandViewOperation = (DispatchCommandViewOperation) it.next();
                                        try {
                                            dispatchCommandViewOperation.executeWithExceptions();
                                        } catch (RetryableMountingLayerException e) {
                                            if (dispatchCommandViewOperation.getRetries() == 0) {
                                                dispatchCommandViewOperation.incrementRetries();
                                                UIViewOperationQueue.this.mViewCommandOperations.add(dispatchCommandViewOperation);
                                            } else {
                                                ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, new ReactNoCrashSoftException(e));
                                            }
                                        } catch (Throwable th3) {
                                            ReactSoftExceptionLogger.logSoftException(UIViewOperationQueue.TAG, th3);
                                        }
                                    }
                                }
                                ArrayDeque arrayDeque3 = arrayDeque;
                                if (arrayDeque3 != null) {
                                    Iterator it2 = arrayDeque3.iterator();
                                    while (it2.hasNext()) {
                                        ((UIOperation) it2.next()).execute();
                                    }
                                }
                                ArrayList arrayList6 = arrayList2;
                                if (arrayList6 != null) {
                                    Iterator it3 = arrayList6.iterator();
                                    while (it3.hasNext()) {
                                        ((UIOperation) it3.next()).execute();
                                    }
                                }
                                if (UIViewOperationQueue.this.mIsProfilingNextBatch && UIViewOperationQueue.this.mProfiledBatchCommitStartTime == 0) {
                                    UIViewOperationQueue.this.mProfiledBatchCommitStartTime = j;
                                    UIViewOperationQueue.this.mProfiledBatchCommitEndTime = SystemClock.uptimeMillis();
                                    UIViewOperationQueue.this.mProfiledBatchLayoutTime = j2;
                                    UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime = uptimeMillis;
                                    UIViewOperationQueue.this.mProfiledBatchRunStartTime = uptimeMillis2;
                                    UIViewOperationQueue uIViewOperationQueue = UIViewOperationQueue.this;
                                    uIViewOperationQueue.mProfiledBatchRunEndTime = uIViewOperationQueue.mProfiledBatchCommitEndTime;
                                    UIViewOperationQueue.this.mThreadCpuTime = currentThreadTimeMillis;
                                    C7382a.m20814b(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchCommitStartTime * 1000000);
                                    C7382a.m20810f(0L, "delayBeforeDispatchViewUpdates", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                                    C7382a.m20814b(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchDispatchViewUpdatesTime * 1000000);
                                    C7382a.m20810f(0L, "delayBeforeBatchRunStart", 0, UIViewOperationQueue.this.mProfiledBatchRunStartTime * 1000000);
                                }
                                UIViewOperationQueue.this.mNativeViewHierarchyManager.clearLayoutAnimation();
                                if (UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener != null) {
                                    UIViewOperationQueue.this.mViewHierarchyUpdateDebugListener.onViewHierarchyUpdateFinished();
                                }
                            } catch (Exception e2) {
                                UIViewOperationQueue.this.mIsInIllegalUIState = true;
                                throw e2;
                            }
                        } finally {
                            C7382a.m20809g(0L);
                        }
                    }
                };
                j3 = 0;
                C7384b.m20802a(0L, "acquiring mDispatchRunnablesLock").mo20800a("batchId", i).mo20798c();
                synchronized (this.mDispatchRunnablesLock) {
                    C7382a.m20809g(0L);
                    this.mDispatchUIRunnables.add(runnable);
                }
                if (!this.mIsDispatchUIFrameCallbackEnqueued) {
                    UiThreadUtil.runOnUiThread(new GuardedRunnable(this.mReactApplicationContext) { // from class: com.facebook.react.uimanager.UIViewOperationQueue.2
                        @Override // com.facebook.react.bridge.GuardedRunnable
                        public void runGuarded() {
                            UIViewOperationQueue.this.flushPendingBatches();
                        }
                    });
                }
                C7382a.m20809g(0L);
            } catch (Throwable th3) {
                th = th3;
                j3 = 0;
                C7382a.m20809g(j3);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            j3 = 0;
        }
    }

    public void enqueueClearJSResponder() {
        this.mOperations.add(new ChangeJSResponderOperation(0, 0, true, false));
    }

    public void enqueueConfigureLayoutAnimation(ReadableMap readableMap, Callback callback) {
        this.mOperations.add(new ConfigureLayoutAnimationOperation(readableMap, callback));
    }

    public void enqueueCreateView(ThemedReactContext themedReactContext, int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        synchronized (this.mNonBatchedOperationsLock) {
            this.mCreateViewCount++;
            this.mNonBatchedOperations.addLast(new CreateViewOperation(themedReactContext, i, str, reactStylesDiffMap));
        }
    }

    public void enqueueDismissPopupMenu() {
        this.mOperations.add(new DismissPopupMenuOperation());
    }

    @Deprecated
    public void enqueueDispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchCommandOperation(i, i2, readableArray));
    }

    public void enqueueFindTargetForTouch(int i, float f, float f2, Callback callback) {
        this.mOperations.add(new FindTargetForTouchOperation(i, f, f2, callback));
    }

    public void enqueueLayoutUpdateFinished(ReactShadowNode reactShadowNode, UIImplementation.LayoutUpdateListener layoutUpdateListener) {
        this.mOperations.add(new LayoutUpdateFinishedOperation(reactShadowNode, layoutUpdateListener));
    }

    public void enqueueManageChildren(int i, int[] iArr, ViewAtIndex[] viewAtIndexArr, int[] iArr2) {
        this.mOperations.add(new ManageChildrenOperation(i, iArr, viewAtIndexArr, iArr2));
    }

    public void enqueueMeasure(int i, Callback callback) {
        this.mOperations.add(new MeasureOperation(i, callback));
    }

    public void enqueueMeasureInWindow(int i, Callback callback) {
        this.mOperations.add(new MeasureInWindowOperation(i, callback));
    }

    public void enqueueOnLayoutEvent(int i, int i2, int i3, int i4, int i5) {
        this.mOperations.add(new EmitOnLayoutEventOperation(i, i2, i3, i4, i5));
    }

    public void enqueueRemoveRootView(int i) {
        this.mOperations.add(new RemoveRootViewOperation(i));
    }

    public void enqueueSendAccessibilityEvent(int i, int i2) {
        this.mOperations.add(new SendAccessibilityEvent(i, i2));
    }

    public void enqueueSetChildren(int i, ReadableArray readableArray) {
        this.mOperations.add(new SetChildrenOperation(i, readableArray));
    }

    public void enqueueSetJSResponder(int i, int i2, boolean z) {
        this.mOperations.add(new ChangeJSResponderOperation(i, i2, false, z));
    }

    public void enqueueSetLayoutAnimationEnabled(boolean z) {
        this.mOperations.add(new SetLayoutAnimationEnabledOperation(z));
    }

    public void enqueueShowPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mOperations.add(new ShowPopupMenuOperation(i, readableArray, callback, callback2));
    }

    public void enqueueUIBlock(UIBlock uIBlock) {
        this.mOperations.add(new UIBlockOperation(uIBlock));
    }

    protected void enqueueUIOperation(UIOperation uIOperation) {
        SoftAssertions.assertNotNull(uIOperation);
        this.mOperations.add(uIOperation);
    }

    public void enqueueUpdateExtraData(int i, Object obj) {
        this.mOperations.add(new UpdateViewExtraData(i, obj));
    }

    public void enqueueUpdateInstanceHandle(int i, long j) {
        this.mOperations.add(new UpdateInstanceHandleOperation(i, j));
    }

    public void enqueueUpdateLayout(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mOperations.add(new UpdateLayoutOperation(i, i2, i3, i4, i5, i6));
    }

    public void enqueueUpdateProperties(int i, String str, ReactStylesDiffMap reactStylesDiffMap) {
        this.mUpdatePropertiesOperationCount++;
        this.mOperations.add(new UpdatePropertiesOperation(i, reactStylesDiffMap));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeViewHierarchyManager getNativeViewHierarchyManager() {
        return this.mNativeViewHierarchyManager;
    }

    public Map<String, Long> getProfiledBatchPerfCounters() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.mProfiledBatchCommitStartTime));
        hashMap.put("CommitEndTime", Long.valueOf(this.mProfiledBatchCommitEndTime));
        hashMap.put("LayoutTime", Long.valueOf(this.mProfiledBatchLayoutTime));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.mProfiledBatchDispatchViewUpdatesTime));
        hashMap.put("RunStartTime", Long.valueOf(this.mProfiledBatchRunStartTime));
        hashMap.put("RunEndTime", Long.valueOf(this.mProfiledBatchRunEndTime));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.mProfiledBatchBatchedExecutionTime));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.mProfiledBatchNonBatchedExecutionTime));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.mThreadCpuTime));
        hashMap.put("CreateViewCount", Long.valueOf(this.mCreateViewCount));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.mUpdatePropertiesOperationCount));
        return hashMap;
    }

    public boolean isEmpty() {
        return this.mOperations.isEmpty() && this.mViewCommandOperations.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pauseFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = false;
        ReactChoreographer.getInstance().removeFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
        flushPendingBatches();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mOperations.add(0, new UIBlockOperation(uIBlock));
    }

    public void profileNextBatch() {
        this.mIsProfilingNextBatch = true;
        this.mProfiledBatchCommitStartTime = 0L;
        this.mCreateViewCount = 0L;
        this.mUpdatePropertiesOperationCount = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resumeFrameCallback() {
        this.mIsDispatchUIFrameCallbackEnqueued = true;
        ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.DISPATCH_UI, this.mDispatchUIFrameCallback);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mViewHierarchyUpdateDebugListener = notThreadSafeViewHierarchyUpdateDebugListener;
    }

    public void enqueueDispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mViewCommandOperations.add(new DispatchStringCommandOperation(i, str, readableArray));
    }
}
