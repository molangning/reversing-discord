package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.ModalHostViewManagerDelegate;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;
import com.facebook.react.views.modal.ReactModalHostView;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactModalHostManager extends ViewGroupManager<ReactModalHostView> implements ModalHostViewManagerInterface<ReactModalHostView> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final ViewManagerDelegate<ReactModalHostView> mDelegate = new ModalHostViewManagerDelegate(this);

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactModalHostView> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.builder().put(RequestCloseEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onRequestClose")).put(ShowEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onShow")).put("topDismiss", MapBuilder.m30470of("registrationName", "onDismiss")).put("topOrientationChange", MapBuilder.m30470of("registrationName", "onOrientationChange")).build());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "animated")
    public void setAnimated(ReactModalHostView reactModalHostView, boolean z) {
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "identifier")
    public void setIdentifier(ReactModalHostView reactModalHostView, int i) {
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "presentationStyle")
    public void setPresentationStyle(ReactModalHostView reactModalHostView, String str) {
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "supportedOrientations")
    public void setSupportedOrientations(ReactModalHostView reactModalHostView, ReadableArray readableArray) {
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = ViewProps.VISIBLE)
    public void setVisible(ReactModalHostView reactModalHostView, boolean z) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(final ThemedReactContext themedReactContext, final ReactModalHostView reactModalHostView) {
        final EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, reactModalHostView.getId());
        if (eventDispatcherForReactTag != null) {
            reactModalHostView.setOnRequestCloseListener(new ReactModalHostView.OnRequestCloseListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager.1
                @Override // com.facebook.react.views.modal.ReactModalHostView.OnRequestCloseListener
                public void onRequestClose(DialogInterface dialogInterface) {
                    eventDispatcherForReactTag.dispatchEvent(new RequestCloseEvent(UIManagerHelper.getSurfaceId(themedReactContext), reactModalHostView.getId()));
                }
            });
            reactModalHostView.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.facebook.react.views.modal.ReactModalHostManager.2
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    eventDispatcherForReactTag.dispatchEvent(new ShowEvent(UIManagerHelper.getSurfaceId(themedReactContext), reactModalHostView.getId()));
                }
            });
            reactModalHostView.setEventDispatcher(eventDispatcherForReactTag);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ReactModalHostView createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactModalHostView(themedReactContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(ReactModalHostView reactModalHostView) {
        super.onAfterUpdateTransaction((ReactModalHostManager) reactModalHostView);
        reactModalHostView.showOrUpdate();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(ReactModalHostView reactModalHostView) {
        super.onDropViewInstance((ReactModalHostManager) reactModalHostView);
        reactModalHostView.onDropInstance();
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "animationType")
    public void setAnimationType(ReactModalHostView reactModalHostView, String str) {
        if (str != null) {
            reactModalHostView.setAnimationType(str);
        }
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setHardwareAccelerated(z);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setStatusBarTranslucent(z);
    }

    @Override // com.facebook.react.viewmanagers.ModalHostViewManagerInterface
    @ReactProp(name = "transparent")
    public void setTransparent(ReactModalHostView reactModalHostView, boolean z) {
        reactModalHostView.setTransparent(z);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(ReactModalHostView reactModalHostView, ReactStylesDiffMap reactStylesDiffMap, StateWrapper stateWrapper) {
        reactModalHostView.getFabricViewStateManager().setStateWrapper(stateWrapper);
        Point modalHostSize = ModalHostHelper.getModalHostSize(reactModalHostView.getContext());
        reactModalHostView.updateState(modalHostSize.x, modalHostSize.y);
        return null;
    }
}