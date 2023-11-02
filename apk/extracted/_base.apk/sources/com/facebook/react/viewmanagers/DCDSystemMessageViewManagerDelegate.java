package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDSystemMessageViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDSystemMessageViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDSystemMessageViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDSystemMessageViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        String str2;
        str.hashCode();
        if (!str.equals("row")) {
            super.setProperty(t, str, obj);
            return;
        }
        DCDSystemMessageViewManagerInterface dCDSystemMessageViewManagerInterface = (DCDSystemMessageViewManagerInterface) this.mViewManager;
        if (obj == null) {
            str2 = null;
        } else {
            str2 = (String) obj;
        }
        dCDSystemMessageViewManagerInterface.setRow(t, str2);
    }
}
