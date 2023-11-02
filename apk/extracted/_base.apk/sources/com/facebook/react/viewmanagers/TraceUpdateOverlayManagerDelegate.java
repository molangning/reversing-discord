package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.TraceUpdateOverlayManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TraceUpdateOverlayManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & TraceUpdateOverlayManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public TraceUpdateOverlayManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("draw")) {
            ((TraceUpdateOverlayManagerInterface) this.mViewManager).draw(t, readableArray.getString(0));
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        super.setProperty(t, str, obj);
    }
}
