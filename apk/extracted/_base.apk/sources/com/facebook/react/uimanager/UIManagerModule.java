package com.facebook.react.uimanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.debug.NotThreadSafeViewHierarchyUpdateDebugListener;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.EventDispatcherImpl;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p127h3.C6889c;
import p148i3.C7380a;
import p150i5.C7382a;
import p150i5.C7384b;
import p414x2.C13677a;

@ReactModule(name = UIManagerModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class UIManagerModule extends ReactContextBaseJavaModule implements OnBatchCompleteListener, LifecycleEventListener, UIManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = C6889c.m21705a().mo21707b(C7380a.f19864f);
    public static final String NAME = "UIManager";
    public static final String TAG = "UIManagerModule";
    private int mBatchId;
    private final Map<String, Object> mCustomDirectEvents;
    private final EventDispatcher mEventDispatcher;
    private final List<UIManagerModuleListener> mListeners;
    private final MemoryTrimCallback mMemoryTrimCallback;
    private final Map<String, Object> mModuleConstants;
    private final UIImplementation mUIImplementation;
    private final CopyOnWriteArrayList<UIManagerListener> mUIManagerListeners;
    private final ViewManagerRegistry mViewManagerRegistry;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface CustomEventNamesResolver {
        String resolveCustomEventName(String str);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class MemoryTrimCallback implements ComponentCallbacks2 {
        private MemoryTrimCallback() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i >= 60) {
                YogaNodePool.get().clear();
            }
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, ViewManagerResolver viewManagerResolver, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        this.mModuleConstants = createConstants(viewManagerResolver);
        this.mCustomDirectEvents = UIManagerModuleConstants.getDirectEventTypeConstants();
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(viewManagerResolver);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private static Map<String, Object> createConstants(ViewManagerResolver viewManagerResolver) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C7384b.m20802a(0L, "CreateUIManagerConstants").mo20799b("Lazy", Boolean.TRUE).mo20798c();
        try {
            return UIManagerModuleConstantsHelper.createConstants(viewManagerResolver);
        } finally {
            C7382a.m20809g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public <T extends View> int addRootView(T t) {
        return addRootView(t, null, null);
    }

    public void addUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.addUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void addUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.add(uIManagerListener);
    }

    @Deprecated
    public void addUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.add(uIManagerModuleListener);
    }

    @ReactMethod
    public void clearJSResponder() {
        this.mUIImplementation.clearJSResponder();
    }

    @ReactMethod
    public void configureNextLayoutAnimation(ReadableMap readableMap, Callback callback, Callback callback2) {
        this.mUIImplementation.configureNextLayoutAnimation(readableMap, callback);
    }

    @ReactMethod
    public void createView(int i, String str, int i2, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.createView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C13677a.m1862b(ReactConstants.TAG, str2);
            C6889c.m21705a().mo21706c(C7380a.f19864f, str2);
        }
        this.mUIImplementation.createView(i, str, i2, readableMap);
    }

    @ReactMethod
    public void dismissPopupMenu() {
        this.mUIImplementation.dismissPopupMenu();
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public void dispatchCommand(int i, int i2, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, i2, readableArray);
    }

    @ReactMethod
    public void dispatchViewManagerCommand(int i, Dynamic dynamic, ReadableArray readableArray) {
        UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), ViewUtil.getUIManagerType(i));
        if (uIManager == null) {
            return;
        }
        if (dynamic.getType() == ReadableType.Number) {
            uIManager.dispatchCommand(i, dynamic.asInt(), readableArray);
        } else if (dynamic.getType() == ReadableType.String) {
            uIManager.dispatchCommand(i, dynamic.asString(), readableArray);
        }
    }

    @ReactMethod
    public void findSubviewIn(int i, ReadableArray readableArray, Callback callback) {
        this.mUIImplementation.findSubviewIn(i, Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(0))), Math.round(PixelUtil.toPixelFromDIP(readableArray.getDouble(1))), callback);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.mModuleConstants;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getConstantsForViewManager(String str) {
        ViewManager viewManager;
        if (str != null) {
            viewManager = this.mUIImplementation.resolveViewManager(str);
        } else {
            viewManager = null;
        }
        if (viewManager == null) {
            return null;
        }
        C7384b.m20802a(0L, "UIManagerModule.getConstantsForViewManager").mo20799b("ViewManager", viewManager.getName()).mo20799b("Lazy", Boolean.TRUE).mo20798c();
        try {
            Map<String, Object> createConstantsForViewManager = UIManagerModuleConstantsHelper.createConstantsForViewManager(viewManager, null, null, null, this.mCustomDirectEvents);
            if (createConstantsForViewManager == null) {
                return null;
            }
            return Arguments.makeNativeMap(createConstantsForViewManager);
        } finally {
            C7384b.m20801b(0L).mo20798c();
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public WritableMap getDefaultEventTypes() {
        return Arguments.makeNativeMap(UIManagerModuleConstantsHelper.getDefaultExportableEventTypes());
    }

    @Deprecated
    public CustomEventNamesResolver getDirectEventNamesResolver() {
        return new CustomEventNamesResolver() { // from class: com.facebook.react.uimanager.UIManagerModule.1
            @Override // com.facebook.react.uimanager.UIManagerModule.CustomEventNamesResolver
            public String resolveCustomEventName(String str) {
                return UIManagerModule.this.resolveCustomDirectEventName(str);
            }
        };
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public Map<String, Long> getPerformanceCounters() {
        return this.mUIImplementation.getProfiledBatchPerfCounters();
    }

    @Deprecated
    public UIImplementation getUIImplementation() {
        return this.mUIImplementation;
    }

    @Deprecated
    public ViewManagerRegistry getViewManagerRegistry_DO_NOT_USE() {
        return this.mViewManagerRegistry;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().registerComponentCallbacks(this.mMemoryTrimCallback);
        getReactApplicationContext().registerComponentCallbacks(this.mViewManagerRegistry);
        this.mEventDispatcher.registerEventEmitter(1, (RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class));
    }

    public void invalidateNodeLayout(int i) {
        ReactShadowNode resolveShadowNode = this.mUIImplementation.resolveShadowNode(i);
        if (resolveShadowNode == null) {
            C13677a.m1870H(ReactConstants.TAG, "Warning : attempted to dirty a non-existent react shadow node. reactTag=" + i);
            return;
        }
        resolveShadowNode.dirty();
        this.mUIImplementation.dispatchViewUpdates(-1);
    }

    @ReactMethod
    public void manageChildren(int i, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        if (DEBUG) {
            String str = "(UIManager.manageChildren) tag: " + i + ", moveFrom: " + readableArray + ", moveTo: " + readableArray2 + ", addTags: " + readableArray3 + ", atIndices: " + readableArray4 + ", removeFrom: " + readableArray5;
            C13677a.m1862b(ReactConstants.TAG, str);
            C6889c.m21705a().mo21706c(C7380a.f19864f, str);
        }
        this.mUIImplementation.manageChildren(i, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }

    @ReactMethod
    public void measure(int i, Callback callback) {
        this.mUIImplementation.measure(i, callback);
    }

    @ReactMethod
    public void measureInWindow(int i, Callback callback) {
        this.mUIImplementation.measureInWindow(i, callback);
    }

    @ReactMethod
    public void measureLayout(int i, int i2, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayout(i, i2, callback, callback2);
    }

    @ReactMethod
    @Deprecated
    public void measureLayoutRelativeToParent(int i, Callback callback, Callback callback2) {
        this.mUIImplementation.measureLayoutRelativeToParent(i, callback, callback2);
    }

    public void onBatchComplete() {
        int i = this.mBatchId;
        this.mBatchId = i + 1;
        C7384b.m20802a(0L, "onBatchCompleteUI").mo20800a("BatchId", i).mo20798c();
        for (UIManagerModuleListener uIManagerModuleListener : this.mListeners) {
            uIManagerModuleListener.willDispatchViewUpdates(this);
        }
        Iterator<UIManagerListener> it = this.mUIManagerListeners.iterator();
        while (it.hasNext()) {
            it.next().willDispatchViewUpdates(this);
        }
        try {
            this.mUIImplementation.dispatchViewUpdates(i);
        } finally {
            C7382a.m20809g(0L);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        this.mEventDispatcher.onCatalystInstanceDestroyed();
        this.mUIImplementation.onCatalystInstanceDestroyed();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.unregisterComponentCallbacks(this.mMemoryTrimCallback);
        reactApplicationContext.unregisterComponentCallbacks(this.mViewManagerRegistry);
        YogaNodePool.get().clear();
        ViewManagerPropertyUpdater.clear();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        this.mUIImplementation.onHostDestroy();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mUIImplementation.onHostPause();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mUIImplementation.onHostResume();
    }

    public void prependUIBlock(UIBlock uIBlock) {
        this.mUIImplementation.prependUIBlock(uIBlock);
    }

    @Override // com.facebook.react.bridge.PerformanceCounter
    public void profileNextBatch() {
        this.mUIImplementation.profileNextBatch();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, String str, WritableMap writableMap) {
        receiveEvent(-1, i, str, writableMap);
    }

    @ReactMethod
    public void removeRootView(int i) {
        this.mUIImplementation.removeRootView(i);
    }

    @ReactMethod
    @Deprecated
    public void removeSubviewsFromContainerWithID(int i) {
        this.mUIImplementation.removeSubviewsFromContainerWithID(i);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void removeUIManagerEventListener(UIManagerListener uIManagerListener) {
        this.mUIManagerListeners.remove(uIManagerListener);
    }

    @Deprecated
    public void removeUIManagerListener(UIManagerModuleListener uIManagerModuleListener) {
        this.mListeners.remove(uIManagerModuleListener);
    }

    @ReactMethod
    @Deprecated
    public void replaceExistingNonRootView(int i, int i2) {
        this.mUIImplementation.replaceExistingNonRootView(i, i2);
    }

    @Override // com.facebook.react.bridge.UIManager
    @Deprecated
    public String resolveCustomDirectEventName(String str) {
        Map map;
        if (str != null && (map = (Map) this.mCustomDirectEvents.get(str)) != null) {
            return (String) map.get("registrationName");
        }
        return str;
    }

    @Deprecated
    public int resolveRootTagFromReactTag(int i) {
        if (!ViewUtil.isRootTag(i)) {
            return this.mUIImplementation.resolveRootTagFromReactTag(i);
        }
        return i;
    }

    @Override // com.facebook.react.bridge.UIManager
    public View resolveView(int i) {
        UiThreadUtil.assertOnUiThread();
        return this.mUIImplementation.getUIViewOperationQueue().getNativeViewHierarchyManager().resolveView(i);
    }

    @ReactMethod
    public void sendAccessibilityEvent(int i, int i2) {
        int uIManagerType = ViewUtil.getUIManagerType(i);
        if (uIManagerType == 2) {
            UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), uIManagerType);
            if (uIManager != null) {
                uIManager.sendAccessibilityEvent(i, i2);
                return;
            }
            return;
        }
        this.mUIImplementation.sendAccessibilityEvent(i, i2);
    }

    @ReactMethod
    public void setChildren(int i, ReadableArray readableArray) {
        if (DEBUG) {
            String str = "(UIManager.setChildren) tag: " + i + ", children: " + readableArray;
            C13677a.m1862b(ReactConstants.TAG, str);
            C6889c.m21705a().mo21706c(C7380a.f19864f, str);
        }
        this.mUIImplementation.setChildren(i, readableArray);
    }

    @ReactMethod
    public void setJSResponder(int i, boolean z) {
        this.mUIImplementation.setJSResponder(i, z);
    }

    @ReactMethod
    public void setLayoutAnimationEnabledExperimental(boolean z) {
        this.mUIImplementation.setLayoutAnimationEnabledExperimental(z);
    }

    public void setViewHierarchyUpdateDebugListener(NotThreadSafeViewHierarchyUpdateDebugListener notThreadSafeViewHierarchyUpdateDebugListener) {
        this.mUIImplementation.setViewHierarchyUpdateDebugListener(notThreadSafeViewHierarchyUpdateDebugListener);
    }

    public void setViewLocalData(final int i, final Object obj) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.assertOnUiQueueThread();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.2
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.setViewLocalData(i, obj);
            }
        });
    }

    @ReactMethod
    public void showPopupMenu(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.mUIImplementation.showPopupMenu(i, readableArray, callback, callback2);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int startSurface(T t, String str, WritableMap writableMap, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void stopSurface(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.facebook.react.bridge.UIManager
    public void synchronouslyUpdateViewOnUIThread(int i, ReadableMap readableMap) {
        this.mUIImplementation.synchronouslyUpdateViewOnUIThread(i, new ReactStylesDiffMap(readableMap));
    }

    public void updateNodeSize(int i, int i2, int i3) {
        getReactApplicationContext().assertOnNativeModulesQueueThread();
        this.mUIImplementation.updateNodeSize(i, i2, i3);
    }

    @Override // com.facebook.react.bridge.UIManager
    public void updateRootLayoutSpecs(final int i, final int i2, final int i3, int i4, int i5) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.runOnNativeModulesQueueThread(new GuardedRunnable(reactApplicationContext) { // from class: com.facebook.react.uimanager.UIManagerModule.3
            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                UIManagerModule.this.mUIImplementation.updateRootView(i, i2, i3);
                UIManagerModule.this.mUIImplementation.dispatchViewUpdates(-1);
            }
        });
    }

    @ReactMethod
    public void updateView(int i, String str, ReadableMap readableMap) {
        if (DEBUG) {
            String str2 = "(UIManager.updateView) tag: " + i + ", class: " + str + ", props: " + readableMap;
            C13677a.m1862b(ReactConstants.TAG, str2);
            C6889c.m21705a().mo21706c(C7380a.f19864f, str2);
        }
        this.mUIImplementation.updateView(i, str, readableMap);
    }

    @ReactMethod
    @Deprecated
    public void viewIsDescendantOf(int i, int i2, Callback callback) {
        this.mUIImplementation.viewIsDescendantOf(i, i2, callback);
    }

    @Override // com.facebook.react.bridge.UIManager
    public <T extends View> int addRootView(T t, WritableMap writableMap, String str) {
        C7382a.m20813c(0L, "UIManagerModule.addRootView");
        int nextRootViewTag = ReactRootViewTagGenerator.getNextRootViewTag();
        this.mUIImplementation.registerRootView(t, nextRootViewTag, new ThemedReactContext(getReactApplicationContext(), t.getContext(), ((ReactRoot) t).getSurfaceID(), -1));
        C7382a.m20809g(0L);
        return nextRootViewTag;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void dispatchCommand(int i, String str, ReadableArray readableArray) {
        this.mUIImplementation.dispatchViewManagerCommand(i, str, readableArray);
    }

    @Override // com.facebook.react.bridge.UIManager
    public EventDispatcher getEventDispatcher() {
        return this.mEventDispatcher;
    }

    @Override // com.facebook.react.bridge.UIManager
    public void receiveEvent(int i, int i2, String str, WritableMap writableMap) {
        ((RCTEventEmitter) getReactApplicationContext().getJSModule(RCTEventEmitter.class)).receiveEvent(i2, str, writableMap);
    }

    private static Map<String, Object> createConstants(List<ViewManager> list, Map<String, Object> map, Map<String, Object> map2) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_START);
        C7384b.m20802a(0L, "CreateUIManagerConstants").mo20799b("Lazy", Boolean.FALSE).mo20798c();
        try {
            return UIManagerModuleConstantsHelper.createConstants(list, map, map2);
        } finally {
            C7382a.m20809g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_CONSTANTS_END);
        }
    }

    public UIManagerModule(ReactApplicationContext reactApplicationContext, List<ViewManager> list, int i) {
        super(reactApplicationContext);
        this.mMemoryTrimCallback = new MemoryTrimCallback();
        this.mListeners = new ArrayList();
        this.mUIManagerListeners = new CopyOnWriteArrayList<>();
        this.mBatchId = 0;
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(reactApplicationContext);
        EventDispatcherImpl eventDispatcherImpl = new EventDispatcherImpl(reactApplicationContext);
        this.mEventDispatcher = eventDispatcherImpl;
        HashMap newHashMap = MapBuilder.newHashMap();
        this.mCustomDirectEvents = newHashMap;
        this.mModuleConstants = createConstants(list, null, newHashMap);
        ViewManagerRegistry viewManagerRegistry = new ViewManagerRegistry(list);
        this.mViewManagerRegistry = viewManagerRegistry;
        this.mUIImplementation = new UIImplementation(reactApplicationContext, viewManagerRegistry, eventDispatcherImpl, i);
        reactApplicationContext.addLifecycleEventListener(this);
    }
}
