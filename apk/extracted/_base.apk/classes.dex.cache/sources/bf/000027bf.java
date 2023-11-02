package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNSScreenStackHeaderSubviewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSScreenStackHeaderSubviewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNSScreenStackHeaderSubviewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (!str.equals("type")) {
            super.setProperty(t, str, obj);
        } else {
            ((RNSScreenStackHeaderSubviewManagerInterface) this.mViewManager).setType(t, (String) obj);
        }
    }
}