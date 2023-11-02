package com.swmansion.reanimated;

import android.util.Log;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.UIManagerModuleListener;
import java.util.ArrayList;
import java.util.Iterator;

@ReactModule(name = ReanimatedModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReanimatedModule extends ReactContextBaseJavaModule implements LifecycleEventListener, UIManagerModuleListener {
    public static final String NAME = "ReanimatedModule";
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext());
        }
        return this.mNodesManager;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        ((UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class)).addUIManagerListener(this);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public void installTurboModule() {
        boolean z;
        if (getReactApplicationContext().getJavaScriptContextHolder().get() == 0) {
            z = true;
        } else {
            z = false;
        }
        Utils.isChromeDebugger = z;
        if (!z) {
            getNodesManager().initWithContext(getReactApplicationContext());
        } else {
            Log.w("[REANIMATED]", "Unable to create Reanimated Native Module. You can ignore this message if you are using Chrome Debugger now.");
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onCatalystInstanceDestroy();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // com.facebook.react.uimanager.UIManagerModuleListener
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new UIBlock() { // from class: com.swmansion.reanimated.ReanimatedModule.1
            @Override // com.facebook.react.uimanager.UIBlock
            public void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                NodesManager nodesManager = ReanimatedModule.this.getNodesManager();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((UIThreadOperation) it.next()).execute(nodesManager);
                }
            }
        });
    }
}