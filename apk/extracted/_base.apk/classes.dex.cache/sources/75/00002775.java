package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.APNGStickerViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class APNGStickerViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & APNGStickerViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public APNGStickerViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        String str2;
        str.hashCode();
        if (!str.equals("url")) {
            super.setProperty(t, str, obj);
            return;
        }
        APNGStickerViewManagerInterface aPNGStickerViewManagerInterface = (APNGStickerViewManagerInterface) this.mViewManager;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = (String) obj;
        }
        aPNGStickerViewManagerInterface.setUrl(t, str2);
    }
}