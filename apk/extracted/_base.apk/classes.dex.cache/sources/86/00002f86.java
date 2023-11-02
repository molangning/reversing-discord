package com.swmansion.reanimated;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.swmansion.reanimated.layoutReanimation.LayoutAnimations;
import com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder;
import com.swmansion.reanimated.nativeProxy.NativeProxyCommon;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import p077e5.InterfaceC6107a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeProxy extends NativeProxyCommon {
    @InterfaceC6107a
    private final HybridData mHybridData;

    public NativeProxy(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        CallInvokerHolderImpl callInvokerHolderImpl = (CallInvokerHolderImpl) reactApplicationContext.getCatalystInstance().getJSCallInvokerHolder();
        LayoutAnimations layoutAnimations = new LayoutAnimations(reactApplicationContext);
        this.mHybridData = initHybrid(reactApplicationContext.getJavaScriptContextHolder().get(), callInvokerHolderImpl, this.mAndroidUIScheduler, layoutAnimations, new ReanimatedMessageQueueThread());
        prepareLayoutAnimations(layoutAnimations);
        installJSIBindings();
    }

    public static NativeMethodsHolder createNativeMethodsHolder(LayoutAnimations layoutAnimations) {
        final WeakReference weakReference = new WeakReference(layoutAnimations);
        return new NativeMethodsHolder() { // from class: com.swmansion.reanimated.NativeProxy.1
            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void cancelAnimation(int i) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.cancelAnimationForTag(i);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void checkDuplicateSharedTag(int i, int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.checkDuplicateSharedTag(i, i2);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void clearAnimationConfig(int i) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    layoutAnimations2.clearAnimationConfigForTag(i);
                }
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public int findPrecedingViewTagForTransition(int i) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.findPrecedingViewTagForTransition(i);
                }
                return -1;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean hasAnimation(int i, int i2) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.hasAnimationForTag(i, i2);
                }
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public boolean isLayoutAnimationEnabled() {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    return layoutAnimations2.isLayoutAnimationEnabled();
                }
                return false;
            }

            @Override // com.swmansion.reanimated.layoutReanimation.NativeMethodsHolder
            public void startAnimation(int i, int i2, HashMap<String, Object> hashMap) {
                LayoutAnimations layoutAnimations2 = (LayoutAnimations) weakReference.get();
                if (layoutAnimations2 != null) {
                    HashMap hashMap2 = new HashMap();
                    for (String str : hashMap.keySet()) {
                        String obj = hashMap.get(str).toString();
                        if (str.endsWith("TransformMatrix")) {
                            hashMap2.put(str, Utils.simplifyStringNumbersList(obj));
                        } else {
                            hashMap2.put(str, obj);
                        }
                    }
                    layoutAnimations2.startAnimationForTag(i, i2, hashMap2);
                }
            }
        };
    }

    private native HybridData initHybrid(long j, CallInvokerHolderImpl callInvokerHolderImpl, AndroidUIScheduler androidUIScheduler, LayoutAnimations layoutAnimations, MessageQueueThread messageQueueThread);

    @Override // com.swmansion.reanimated.nativeProxy.NativeProxyCommon
    protected HybridData getHybridData() {
        return this.mHybridData;
    }

    public native boolean isAnyHandlerWaitingForEvent(String str, int i);

    public native void performOperations();
}