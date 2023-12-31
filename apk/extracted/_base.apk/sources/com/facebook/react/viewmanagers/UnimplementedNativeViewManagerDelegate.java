package com.facebook.react.viewmanagers;

import android.view.View;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.UnimplementedNativeViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class UnimplementedNativeViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & UnimplementedNativeViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public UnimplementedNativeViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        String str2;
        str.hashCode();
        if (!str.equals(ZeroconfModule.KEY_SERVICE_NAME)) {
            super.setProperty(t, str, obj);
            return;
        }
        UnimplementedNativeViewManagerInterface unimplementedNativeViewManagerInterface = (UnimplementedNativeViewManagerInterface) this.mViewManager;
        if (obj == null) {
            str2 = "";
        } else {
            str2 = (String) obj;
        }
        unimplementedNativeViewManagerInterface.setName(t, str2);
    }
}
