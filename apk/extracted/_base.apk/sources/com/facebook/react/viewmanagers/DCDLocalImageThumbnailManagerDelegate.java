package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDLocalImageThumbnailManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDLocalImageThumbnailManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDLocalImageThumbnailManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDLocalImageThumbnailManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (!str.equals("localImageSource")) {
            super.setProperty(t, str, obj);
        } else {
            ((DCDLocalImageThumbnailManagerInterface) this.mViewManager).setLocalImageSource(t, (ReadableMap) obj);
        }
    }
}
