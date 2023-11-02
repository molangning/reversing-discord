package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.react.bridge.interop.InteropModuleRegistry;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.common.ReactConstants;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactContext extends ContextWrapper {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module before the React instance was fully set up. Calls to ReactContext#getJSModule should only happen once initialize() has been called on your native module.";
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module before CatalystInstance has been set!";
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = "Tried to access a JS module after the React instance was destroyed.";
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = "Trying to call native module after CatalystInstance has been destroyed!";
    private static final String TAG = "ReactContext";
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners;
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private volatile boolean mDestroyed;
    private JSExceptionHandler mExceptionHandlerWrapper;
    private LayoutInflater mInflater;
    private InteropModuleRegistry mInteropModuleRegistry;
    private boolean mIsInitialized;
    private JSExceptionHandler mJSExceptionHandler;
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners;
    private LifecycleState mLifecycleState;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.ReactContext$2 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C39882 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState;

        static {
            int[] iArr = new int[LifecycleState.values().length];
            $SwitchMap$com$facebook$react$common$LifecycleState = iArr;
            try {
                iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class ExceptionHandlerWrapper implements JSExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.JSExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public ReactContext(Context context) {
        super(context);
        this.mLifecycleEventListeners = new CopyOnWriteArraySet<>();
        this.mActivityEventListeners = new CopyOnWriteArraySet<>();
        this.mWindowFocusEventListeners = new CopyOnWriteArraySet<>();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        this.mDestroyed = false;
        this.mIsInitialized = false;
    }

    private void raiseCatalystInstanceMissingException() {
        String str;
        if (this.mDestroyed) {
            str = LATE_NATIVE_MODULE_EXCEPTION_MESSAGE;
        } else {
            str = EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE;
        }
        throw new IllegalStateException(str);
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        int i;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if ((hasActiveReactInstance() || isBridgeless()) && (i = C39882.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) != 1 && i != 2) {
            if (i == 3) {
                runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.bridge.ReactContext.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                            return;
                        }
                        try {
                            lifecycleEventListener.onHostResume();
                        } catch (RuntimeException e) {
                            ReactContext.this.handleException(e);
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException("Unhandled lifecycle state.");
        }
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void assertOnJSQueueThread() {
        ((MessageQueueThread) C5743a.m24583c(this.mJSMessageQueueThread)).assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        if (this.mIsInitialized) {
            ((MessageQueueThread) C5743a.m24583c(this.mNativeModulesMessageQueueThread)).assertIsOnThread();
            return;
        }
        throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread() on an uninitialized ReactContext");
    }

    public void assertOnUiQueueThread() {
        ((MessageQueueThread) C5743a.m24583c(this.mUiMessageQueueThread)).assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
        }
    }

    public void emitDeviceEvent(String str, Object obj) {
        RCTDeviceEventEmitter rCTDeviceEventEmitter = (RCTDeviceEventEmitter) getJSModule(RCTDeviceEventEmitter.class);
        if (rCTDeviceEventEmitter != null) {
            rCTDeviceEventEmitter.emit(str, obj);
        }
    }

    public CatalystInstance getCatalystInstance() {
        return (CatalystInstance) C5743a.m24583c(this.mCatalystInstance);
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public JSExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    public JSExceptionHandler getJSExceptionHandler() {
        return this.mJSExceptionHandler;
    }

    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (hasActiveReactInstance()) {
            return this.mCatalystInstance.getJSIModule(jSIModuleType);
        }
        throw new IllegalStateException("Unable to retrieve a JSIModule if CatalystInstance is not active.");
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException(LATE_JS_ACCESS_EXCEPTION_MESSAGE);
            }
            throw new IllegalStateException(EARLY_JS_ACCESS_EXCEPTION_MESSAGE);
        }
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null && interopModuleRegistry.shouldReturnInteropModule(cls)) {
            return (T) this.mInteropModuleRegistry.getInteropModule(cls);
        }
        return (T) this.mCatalystInstance.getJSModule(cls);
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return catalystInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    public Collection<NativeModule> getNativeModules() {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.getNativeModules();
    }

    public String getSourceURL() {
        return this.mCatalystInstance.getSourceURL();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.mInflater;
        }
        return getBaseContext().getSystemService(str);
    }

    public void handleException(Exception exc) {
        boolean z;
        boolean z2;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        boolean z3 = true;
        if (catalystInstance != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && !catalystInstance.isDestroyed()) {
            z2 = true;
        } else {
            z2 = false;
        }
        JSExceptionHandler jSExceptionHandler = this.mJSExceptionHandler;
        if (jSExceptionHandler == null) {
            z3 = false;
        }
        if (z2 && z3) {
            jSExceptionHandler.handleException(exc);
            return;
        }
        C13677a.m1853k(ReactConstants.TAG, "Unable to handle Exception - catalystInstanceVariableExists: " + z + " - isCatalystInstanceAlive: " + z2 + " - hasExceptionHandler: " + z3, exc);
        throw new IllegalStateException(exc);
    }

    @Deprecated
    public boolean hasActiveCatalystInstance() {
        return hasActiveReactInstance();
    }

    public boolean hasActiveReactInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return (catalystInstance == null || catalystInstance.isDestroyed()) ? false : true;
    }

    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    protected void initializeInteropModules() {
        this.mInteropModuleRegistry = new InteropModuleRegistry();
    }

    public synchronized void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        C13677a.m1870H(TAG, "initializeMessageQueueThreads() is called.");
        if (this.mUiMessageQueueThread == null && this.mNativeModulesMessageQueueThread == null && this.mJSMessageQueueThread == null) {
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            MessageQueueThread jSQueueThread = reactQueueConfiguration.getJSQueueThread();
            this.mJSMessageQueueThread = jSQueueThread;
            if (this.mUiMessageQueueThread != null) {
                if (this.mNativeModulesMessageQueueThread != null) {
                    if (jSQueueThread != null) {
                        this.mIsInitialized = true;
                    } else {
                        throw new IllegalStateException("JavaScript thread is null");
                    }
                } else {
                    throw new IllegalStateException("NativeModules thread is null");
                }
            } else {
                throw new IllegalStateException("UI thread is null");
            }
        } else {
            throw new IllegalStateException("Message queue threads already initialized");
        }
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance != null) {
            if (this.mCatalystInstance == null) {
                if (this.mDestroyed) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot initialize ReactContext after it has been destroyed."));
                }
                this.mCatalystInstance = catalystInstance;
                initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
                initializeInteropModules();
                return;
            }
            throw new IllegalStateException("ReactContext has been already initialized");
        }
        throw new IllegalArgumentException("CatalystInstance cannot be null.");
    }

    public <T extends JavaScriptModule> void internal_registerInteropModule(Class<T> cls, Object obj) {
        InteropModuleRegistry interopModuleRegistry = this.mInteropModuleRegistry;
        if (interopModuleRegistry != null) {
            interopModuleRegistry.registerInteropModule(cls, obj);
        }
    }

    public boolean isBridgeless() {
        return false;
    }

    public boolean isOnJSQueueThread() {
        return ((MessageQueueThread) C5743a.m24583c(this.mJSMessageQueueThread)).isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        return ((MessageQueueThread) C5743a.m24583c(this.mNativeModulesMessageQueueThread)).isOnThread();
    }

    public boolean isOnUiQueueThread() {
        return ((MessageQueueThread) C5743a.m24583c(this.mUiMessageQueueThread)).isOnThread();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onWindowFocusChange(boolean z) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void registerSegment(int i, String str, Callback callback) {
        ((CatalystInstance) C5743a.m24583c(this.mCatalystInstance)).registerSegment(i, str);
        ((Callback) C5743a.m24583c(callback)).invoke(new Object[0]);
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    public boolean runOnJSQueueThread(Runnable runnable) {
        return ((MessageQueueThread) C5743a.m24583c(this.mJSMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        ((MessageQueueThread) C5743a.m24583c(this.mNativeModulesMessageQueueThread)).runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        ((MessageQueueThread) C5743a.m24583c(this.mUiMessageQueueThread)).runOnQueue(runnable);
    }

    public void setJSExceptionHandler(JSExceptionHandler jSExceptionHandler) {
        this.mJSExceptionHandler = jSExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivityForResult(intent, i, bundle);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void initializeInteropModules(ReactContext reactContext) {
        this.mInteropModuleRegistry = reactContext.mInteropModuleRegistry;
    }

    public void emitDeviceEvent(String str) {
        emitDeviceEvent(str, null);
    }

    public void assertOnNativeModulesQueueThread(String str) {
        if (this.mIsInitialized) {
            ((MessageQueueThread) C5743a.m24583c(this.mNativeModulesMessageQueueThread)).assertIsOnThread(str);
            return;
        }
        throw new IllegalStateException("Tried to call assertOnNativeModulesQueueThread(message) on an uninitialized ReactContext");
    }
}
