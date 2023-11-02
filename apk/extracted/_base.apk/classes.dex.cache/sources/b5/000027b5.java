package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RNCSafeAreaViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNCSafeAreaViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNCSafeAreaViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNCSafeAreaViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (!str.equals("mode")) {
            if (!str.equals("edges")) {
                super.setProperty(t, str, obj);
                return;
            } else {
                ((RNCSafeAreaViewManagerInterface) this.mViewManager).setEdges(t, (ReadableMap) obj);
                return;
            }
        }
        ((RNCSafeAreaViewManagerInterface) this.mViewManager).setMode(t, (String) obj);
    }
}