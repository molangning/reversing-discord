package com.facebook.react.views.drawer;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerDelegate;
import com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface;
import com.facebook.react.views.drawer.events.DrawerClosedEvent;
import com.facebook.react.views.drawer.events.DrawerOpenedEvent;
import com.facebook.react.views.drawer.events.DrawerSlideEvent;
import com.facebook.react.views.drawer.events.DrawerStateChangedEvent;
import java.util.HashMap;
import java.util.Map;
import p414x2.C13677a;

@ReactModule(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<ReactDrawerLayout> implements AndroidDrawerLayoutManagerInterface<ReactDrawerLayout> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final ViewManagerDelegate<ReactDrawerLayout> mDelegate = new AndroidDrawerLayoutManagerDelegate(this);

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class DrawerEventEmitter implements DrawerLayout.DrawerListener {
        private final DrawerLayout mDrawerLayout;
        private final EventDispatcher mEventDispatcher;

        public DrawerEventEmitter(DrawerLayout drawerLayout, EventDispatcher eventDispatcher) {
            this.mDrawerLayout = drawerLayout;
            this.mEventDispatcher = eventDispatcher;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerClosedEvent(UIManagerHelper.getSurfaceId(this.mDrawerLayout), this.mDrawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(View view) {
            this.mEventDispatcher.dispatchEvent(new DrawerOpenedEvent(UIManagerHelper.getSurfaceId(this.mDrawerLayout), this.mDrawerLayout.getId()));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(View view, float f) {
            this.mEventDispatcher.dispatchEvent(new DrawerSlideEvent(UIManagerHelper.getSurfaceId(this.mDrawerLayout), this.mDrawerLayout.getId(), f));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int i) {
            this.mEventDispatcher.dispatchEvent(new DrawerStateChangedEvent(UIManagerHelper.getSurfaceId(this.mDrawerLayout), this.mDrawerLayout.getId(), i));
        }
    }

    private void setDrawerPositionInternal(ReactDrawerLayout reactDrawerLayout, String str) {
        if (str.equals(ViewProps.LEFT)) {
            reactDrawerLayout.setDrawerPosition(8388611);
        } else if (str.equals(ViewProps.RIGHT)) {
            reactDrawerLayout.setDrawerPosition(8388613);
        } else {
            C13677a.m1870H(ReactConstants.TAG, "drawerPosition must be 'left' or 'right', received" + str);
            reactDrawerLayout.setDrawerPosition(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.m30469of("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<ReactDrawerLayout> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(MapBuilder.m30467of(DrawerSlideEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onDrawerSlide"), DrawerOpenedEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onDrawerOpen"), DrawerClosedEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onDrawerClose"), DrawerStateChangedEvent.EVENT_NAME, MapBuilder.m30470of("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return MapBuilder.m30470of("DrawerPosition", MapBuilder.m30469of("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(ReactDrawerLayout reactDrawerLayout, Integer num) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(ReactDrawerLayout reactDrawerLayout, String str) {
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(ReactDrawerLayout reactDrawerLayout, Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, ReactDrawerLayout reactDrawerLayout) {
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(themedReactContext, reactDrawerLayout.getId());
        if (eventDispatcherForReactTag == null) {
            return;
        }
        reactDrawerLayout.addDrawerListener(new DrawerEventEmitter(reactDrawerLayout, eventDispatcherForReactTag));
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void closeDrawer(ReactDrawerLayout reactDrawerLayout) {
        reactDrawerLayout.closeDrawer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ReactDrawerLayout createViewInstance(ThemedReactContext themedReactContext) {
        return new ReactDrawerLayout(themedReactContext);
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void openDrawer(ReactDrawerLayout reactDrawerLayout) {
        reactDrawerLayout.openDrawer();
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    @ReactProp(name = "drawerLockMode")
    public void setDrawerLockMode(ReactDrawerLayout reactDrawerLayout, String str) {
        if (str != null && !"unlocked".equals(str)) {
            if ("locked-closed".equals(str)) {
                reactDrawerLayout.setDrawerLockMode(1);
                return;
            } else if ("locked-open".equals(str)) {
                reactDrawerLayout.setDrawerLockMode(2);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Unknown drawerLockMode " + str);
                reactDrawerLayout.setDrawerLockMode(0);
                return;
            }
        }
        reactDrawerLayout.setDrawerLockMode(0);
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerPosition(ReactDrawerLayout reactDrawerLayout, String str) {
        if (str == null) {
            reactDrawerLayout.setDrawerPosition(8388611);
        } else {
            setDrawerPositionInternal(reactDrawerLayout, str);
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(ReactDrawerLayout reactDrawerLayout, float f) {
        reactDrawerLayout.setDrawerWidth(Float.isNaN(f) ? -1 : Math.round(PixelUtil.toPixelFromDIP(f)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.BaseViewManagerInterface
    public void setElevation(ReactDrawerLayout reactDrawerLayout, float f) {
        reactDrawerLayout.setDrawerElevation(PixelUtil.toPixelFromDIP(f));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(ReactDrawerLayout reactDrawerLayout, View view, int i) {
        if (getChildCount((ReactDrawerLayoutManager) reactDrawerLayout) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i != 0 && i != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i + " instead.");
        }
        reactDrawerLayout.addView(view, i);
        reactDrawerLayout.setDrawerProperties();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactDrawerLayout reactDrawerLayout, int i, ReadableArray readableArray) {
        if (i == 1) {
            reactDrawerLayout.openDrawer();
        } else if (i != 2) {
        } else {
            reactDrawerLayout.closeDrawer();
        }
    }

    @ReactProp(name = "drawerPosition")
    public void setDrawerPosition(ReactDrawerLayout reactDrawerLayout, Dynamic dynamic) {
        if (dynamic.isNull()) {
            reactDrawerLayout.setDrawerPosition(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 != asInt && 8388613 != asInt) {
                C13677a.m1870H(ReactConstants.TAG, "Unknown drawerPosition " + asInt);
                reactDrawerLayout.setDrawerPosition(8388611);
                return;
            }
            reactDrawerLayout.setDrawerPosition(asInt);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(reactDrawerLayout, dynamic.asString());
        } else {
            C13677a.m1870H(ReactConstants.TAG, "drawerPosition must be a string or int");
            reactDrawerLayout.setDrawerPosition(8388611);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(ReactDrawerLayout reactDrawerLayout, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            reactDrawerLayout.closeDrawer();
        } else if (str.equals("openDrawer")) {
            reactDrawerLayout.openDrawer();
        }
    }

    @Override // com.facebook.react.viewmanagers.AndroidDrawerLayoutManagerInterface
    public void setDrawerWidth(ReactDrawerLayout reactDrawerLayout, Float f) {
        reactDrawerLayout.setDrawerWidth(f == null ? -1 : Math.round(PixelUtil.toPixelFromDIP(f.floatValue())));
    }
}
