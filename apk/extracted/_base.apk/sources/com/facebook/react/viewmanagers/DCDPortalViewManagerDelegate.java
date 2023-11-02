package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDPortalViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDPortalViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDPortalViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDPortalViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        double doubleValue;
        str.hashCode();
        if (!str.equals("portal")) {
            super.setProperty(t, str, obj);
            return;
        }
        DCDPortalViewManagerInterface dCDPortalViewManagerInterface = (DCDPortalViewManagerInterface) this.mViewManager;
        if (obj == null) {
            doubleValue = Double.NaN;
        } else {
            doubleValue = ((Double) obj).doubleValue();
        }
        dCDPortalViewManagerInterface.setPortal(t, doubleValue);
    }
}
