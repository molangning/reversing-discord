package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyManager;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.UIBlock;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, m14357d2 = {"Lcom/swmansion/rnscreens/b0;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "", "onBeforeLayout", "Lcom/facebook/react/bridge/ReactContext;", "a", "Lcom/facebook/react/bridge/ReactContext;", "mContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5600b0 extends LayoutShadowNode {

    /* renamed from: a */
    private ReactContext f15608a;

    public C5600b0(ReactContext mContext) {
        C9612q.m13917h(mContext, "mContext");
        this.f15608a = mContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24977b(C5600b0 this$0, NativeViewHierarchyManager nativeViewHierarchyManager) {
        C9612q.m13917h(this$0, "this$0");
        C9612q.m13917h(nativeViewHierarchyManager, "nativeViewHierarchyManager");
        View resolveView = nativeViewHierarchyManager.resolveView(this$0.getReactTag());
        if (resolveView instanceof C5631l) {
            ((C5631l) resolveView).m24900q();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        C9612q.m13917h(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        super.onBeforeLayout(nativeViewHierarchyOptimizer);
        UIManagerModule uIManagerModule = (UIManagerModule) this.f15608a.getNativeModule(UIManagerModule.class);
        if (uIManagerModule != null) {
            uIManagerModule.addUIBlock(new UIBlock() { // from class: com.swmansion.rnscreens.a0
                @Override // com.facebook.react.uimanager.UIBlock
                public final void execute(NativeViewHierarchyManager nativeViewHierarchyManager) {
                    C5600b0.m24977b(C5600b0.this, nativeViewHierarchyManager);
                }
            });
        }
    }
}
