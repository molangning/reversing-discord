package com.swmansion.reanimated.nativeProxy;

import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import com.facebook.jni.HybridData;
import com.facebook.react.ReactApplication;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.RNGestureHandlerModule;
import com.swmansion.reanimated.AndroidUIScheduler;
import com.swmansion.reanimated.NativeProxy;
import com.swmansion.reanimated.NodesManager;
import com.swmansion.reanimated.ReanimatedModule;
import com.swmansion.reanimated.Utils;
import com.swmansion.reanimated.keyboardObserver.ReanimatedKeyboardEventListener;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.sensor.ReanimatedSensorContainer;
import com.swmansion.reanimated.sensor.ReanimatedSensorType;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ne.InterfaceC10580a;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class NativeProxyCommon {
    private final InterfaceC10580a gestureHandlerStateManager;
    protected AndroidUIScheduler mAndroidUIScheduler;
    protected final WeakReference<ReactApplicationContext> mContext;
    protected NodesManager mNodesManager;
    private ReanimatedKeyboardEventListener reanimatedKeyboardEventListener;
    private ReanimatedSensorContainer reanimatedSensorContainer;
    private Long firstUptime = Long.valueOf(SystemClock.uptimeMillis());
    private boolean slowAnimationsEnabled = false;

    static {
        SoLoader.m30164r("reanimated");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NativeProxyCommon(ReactApplicationContext reactApplicationContext) {
        InterfaceC10580a interfaceC10580a;
        this.mAndroidUIScheduler = new AndroidUIScheduler(reactApplicationContext);
        WeakReference<ReactApplicationContext> weakReference = new WeakReference<>(reactApplicationContext);
        this.mContext = weakReference;
        this.reanimatedSensorContainer = new ReanimatedSensorContainer(weakReference);
        this.reanimatedKeyboardEventListener = new ReanimatedKeyboardEventListener(weakReference);
        addDevMenuOption();
        try {
            RNGestureHandlerModule.C5537a c5537a = RNGestureHandlerModule.Companion;
            interfaceC10580a = (InterfaceC10580a) reactApplicationContext.getNativeModule(RNGestureHandlerModule.class);
        } catch (ClassCastException | ClassNotFoundException unused) {
            interfaceC10580a = null;
        }
        this.gestureHandlerStateManager = interfaceC10580a;
    }

    private void addDevMenuOption() {
        if (this.mContext.get().getApplicationContext() instanceof ReactApplication) {
            ((ReactApplication) this.mContext.get().getApplicationContext()).getReactNativeHost().getReactInstanceManager().getDevSupportManager().addCustomDevOption("Toggle slow animations (Reanimated)", new DevOptionHandler() { // from class: com.swmansion.reanimated.nativeProxy.a
                @Override // com.facebook.react.devsupport.interfaces.DevOptionHandler
                public final void onOptionSelected() {
                    NativeProxyCommon.this.toggleSlowAnimations();
                }
            });
        }
    }

    private Set<String> convertProps(ReadableNativeArray readableNativeArray) {
        HashSet hashSet = new HashSet();
        ArrayList<Object> arrayList = readableNativeArray.toArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            hashSet.add((String) arrayList.get(i));
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleSlowAnimations() {
        boolean z = !this.slowAnimationsEnabled;
        this.slowAnimationsEnabled = z;
        if (z) {
            this.firstUptime = Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    @InterfaceC6107a
    public void configureProps(ReadableNativeArray readableNativeArray, ReadableNativeArray readableNativeArray2) {
        this.mNodesManager.configureProps(convertProps(readableNativeArray), convertProps(readableNativeArray2));
    }

    @InterfaceC6107a
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mNodesManager.dispatchCommand(i, str, readableArray);
    }

    public AndroidUIScheduler getAndroidUIScheduler() {
        return this.mAndroidUIScheduler;
    }

    @InterfaceC6107a
    public long getCurrentTime() {
        if (this.slowAnimationsEnabled) {
            return this.firstUptime.longValue() + ((SystemClock.uptimeMillis() - this.firstUptime.longValue()) / 10);
        }
        return SystemClock.uptimeMillis();
    }

    protected abstract HybridData getHybridData();

    @InterfaceC6107a
    public boolean getIsReducedMotion() {
        float f;
        String string = Settings.Global.getString(this.mContext.get().getContentResolver(), "transition_animation_scale");
        if (string != null) {
            f = Float.parseFloat(string);
        } else {
            f = 1.0f;
        }
        if (f == 0.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public native void installJSIBindings();

    @InterfaceC6107a
    void maybeFlushUIUpdatesQueue() {
        if (!this.mNodesManager.isAnimationRunning()) {
            this.mNodesManager.performOperations();
        }
    }

    @InterfaceC6107a
    public float[] measure(int i) {
        return this.mNodesManager.measure(i);
    }

    @InterfaceC6107a
    public String obtainProp(int i, String str) {
        return this.mNodesManager.obtainProp(i, str);
    }

    public void onCatalystInstanceDestroy() {
        this.mAndroidUIScheduler.deactivate();
        getHybridData().resetNative();
    }

    public void prepareLayoutAnimations(LayoutAnimations layoutAnimations) {
        if (Utils.isChromeDebugger) {
            Log.w("[REANIMATED]", "You can not use LayoutAnimation with enabled Chrome Debugger");
            return;
        }
        this.mNodesManager = ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager();
        ((ReanimatedModule) this.mContext.get().getNativeModule(ReanimatedModule.class)).getNodesManager().getAnimationsManager().setNativeMethods(NativeProxy.createNativeMethodsHolder(layoutAnimations));
    }

    @InterfaceC6107a
    public void registerEventHandler(EventHandler eventHandler) {
        eventHandler.mCustomEventNamesResolver = this.mNodesManager.getEventNameResolver();
        this.mNodesManager.registerEventHandler(eventHandler);
    }

    @InterfaceC6107a
    public int registerSensor(int i, int i2, SensorSetter sensorSetter) {
        return this.reanimatedSensorContainer.registerSensor(ReanimatedSensorType.getInstanceById(i), i2, sensorSetter);
    }

    @InterfaceC6107a
    public void requestRender(AnimationFrameCallback animationFrameCallback) {
        this.mNodesManager.postOnAnimation(animationFrameCallback);
    }

    @InterfaceC6107a
    public void scrollTo(int i, double d, double d2, boolean z) {
        this.mNodesManager.scrollTo(i, d, d2, z);
    }

    @InterfaceC6107a
    public void setGestureState(int i, int i2) {
        InterfaceC10580a interfaceC10580a = this.gestureHandlerStateManager;
        if (interfaceC10580a != null) {
            interfaceC10580a.setGestureHandlerState(i, i2);
        }
    }

    @InterfaceC6107a
    public int subscribeForKeyboardEvents(KeyboardEventDataUpdater keyboardEventDataUpdater, boolean z) {
        return this.reanimatedKeyboardEventListener.subscribeForKeyboardEvents(keyboardEventDataUpdater, z);
    }

    @InterfaceC6107a
    public void synchronouslyUpdateUIProps(int i, ReadableMap readableMap) {
        this.mNodesManager.synchronouslyUpdateUIProps(i, readableMap);
    }

    @InterfaceC6107a
    public void unregisterSensor(int i) {
        this.reanimatedSensorContainer.unregisterSensor(i);
    }

    @InterfaceC6107a
    public void unsubscribeFromKeyboardEvents(int i) {
        this.reanimatedKeyboardEventListener.unsubscribeFromKeyboardEvents(i);
    }

    @InterfaceC6107a
    public void updateProps(int i, Map<String, Object> map) {
        this.mNodesManager.updateProps(i, map);
    }
}
