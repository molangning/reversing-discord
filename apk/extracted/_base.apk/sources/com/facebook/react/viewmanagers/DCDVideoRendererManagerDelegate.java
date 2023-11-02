package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDVideoRendererManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDVideoRendererManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDVideoRendererManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDVideoRendererManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        boolean booleanValue;
        String str2;
        str.hashCode();
        if (!str.equals("mirror")) {
            if (!str.equals("streamId")) {
                super.setProperty(t, str, obj);
                return;
            }
            DCDVideoRendererManagerInterface dCDVideoRendererManagerInterface = (DCDVideoRendererManagerInterface) this.mViewManager;
            if (obj == null) {
                str2 = null;
            } else {
                str2 = (String) obj;
            }
            dCDVideoRendererManagerInterface.setStreamId(t, str2);
            return;
        }
        DCDVideoRendererManagerInterface dCDVideoRendererManagerInterface2 = (DCDVideoRendererManagerInterface) this.mViewManager;
        if (obj == null) {
            booleanValue = false;
        } else {
            booleanValue = ((Boolean) obj).booleanValue();
        }
        dCDVideoRendererManagerInterface2.setMirror(t, booleanValue);
    }
}
