package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDGuildFeedMessageItemViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDGuildFeedMessageItemViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDGuildFeedMessageItemViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public DCDGuildFeedMessageItemViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        String str2;
        str.hashCode();
        if (!str.equals("data")) {
            super.setProperty(t, str, obj);
            return;
        }
        DCDGuildFeedMessageItemViewManagerInterface dCDGuildFeedMessageItemViewManagerInterface = (DCDGuildFeedMessageItemViewManagerInterface) this.mViewManager;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = (String) obj;
        }
        dCDGuildFeedMessageItemViewManagerInterface.setData(t, str2);
    }
}