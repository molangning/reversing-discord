package com.facebook.react.views.view;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.common.mapbuffer.ReadableMapBuffer;
import com.facebook.react.touch.JSResponderHandler;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\nH\u0016J\"\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\"\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J0\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fH\u0016J\u001a\u0010$\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\n2\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010&\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J&\u0010(\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0019\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m14357d2 = {"Lcom/facebook/react/views/view/ReactMapBufferViewManager;", "Lcom/facebook/react/views/view/ReactViewManagerWrapper;", "()V", "viewGroupManager", "Lcom/facebook/react/uimanager/ViewGroupManager;", "getViewGroupManager", "()Lcom/facebook/react/uimanager/ViewGroupManager;", "viewManager", "Lcom/facebook/react/views/view/ReactViewManager;", "createView", "Landroid/view/View;", "reactTag", "", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "props", "", "stateWrapper", "Lcom/facebook/react/uimanager/StateWrapper;", "jsResponderHandler", "Lcom/facebook/react/touch/JSResponderHandler;", "getName", "", "onDropViewInstance", "", "view", "receiveCommand", "root", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", "setPadding", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "updateExtraData", "extraData", "updateProperties", "viewToUpdate", "updateState", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReactMapBufferViewManager implements ReactViewManagerWrapper {
    public static final ReactMapBufferViewManager INSTANCE = new ReactMapBufferViewManager();
    private static final ReactViewManager viewManager = new ReactViewManager();

    private ReactMapBufferViewManager() {
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View, java.lang.Object] */
    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public View createView(int i, ThemedReactContext reactContext, Object obj, StateWrapper stateWrapper, JSResponderHandler jsResponderHandler) {
        ReactStylesDiffMap reactStylesDiffMap;
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(jsResponderHandler, "jsResponderHandler");
        ReactViewManager reactViewManager = viewManager;
        if (obj instanceof ReactStylesDiffMap) {
            reactStylesDiffMap = (ReactStylesDiffMap) obj;
        } else {
            reactStylesDiffMap = null;
        }
        ?? createView = reactViewManager.createView(i, reactContext, reactStylesDiffMap, stateWrapper, jsResponderHandler);
        ReactViewGroup view = (ReactViewGroup) createView;
        if (obj instanceof ReadableMapBuffer) {
            ReactMapBufferViewManager reactMapBufferViewManager = INSTANCE;
            C9612q.m13918g(view, "view");
            reactMapBufferViewManager.updateProperties(view, obj);
        }
        C9612q.m13918g(createView, "viewManager\n          .c…            }\n          }");
        return createView;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public String getName() {
        String name = viewManager.getName();
        C9612q.m13918g(name, "viewManager.name");
        return name;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void onDropViewInstance(View view) {
        C9612q.m13917h(view, "view");
        viewManager.onDropViewInstance((ReactViewGroup) view);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void receiveCommand(View root, String commandId, ReadableArray readableArray) {
        C9612q.m13917h(root, "root");
        C9612q.m13917h(commandId, "commandId");
        viewManager.receiveCommand((ReactViewGroup) root, commandId, readableArray);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void setPadding(View view, int i, int i2, int i3, int i4) {
        C9612q.m13917h(view, "view");
        viewManager.setPadding((ReactViewGroup) view, i, i2, i3, i4);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void updateExtraData(View root, Object obj) {
        C9612q.m13917h(root, "root");
        viewManager.updateExtraData((ReactViewManager) ((ReactViewGroup) root), obj);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void updateProperties(View viewToUpdate, Object obj) {
        ReactStylesDiffMap reactStylesDiffMap;
        C9612q.m13917h(viewToUpdate, "viewToUpdate");
        if (!(obj instanceof ReadableMapBuffer)) {
            ReactViewManager reactViewManager = viewManager;
            ReactViewGroup reactViewGroup = (ReactViewGroup) viewToUpdate;
            if (obj instanceof ReactStylesDiffMap) {
                reactStylesDiffMap = (ReactStylesDiffMap) obj;
            } else {
                reactStylesDiffMap = null;
            }
            reactViewManager.updateProperties(reactViewGroup, reactStylesDiffMap);
            return;
        }
        ReactMapBufferPropSetter.INSTANCE.setProps((ReactViewGroup) viewToUpdate, viewManager, (MapBuffer) obj);
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public Object updateState(View view, Object obj, StateWrapper stateWrapper) {
        C9612q.m13917h(view, "view");
        return null;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public ViewGroupManager<?> getViewGroupManager() {
        return viewManager;
    }

    @Override // com.facebook.react.views.view.ReactViewManagerWrapper
    public void receiveCommand(View root, int i, ReadableArray readableArray) {
        C9612q.m13917h(root, "root");
        viewManager.receiveCommand((ReactViewGroup) root, i, readableArray);
    }
}
