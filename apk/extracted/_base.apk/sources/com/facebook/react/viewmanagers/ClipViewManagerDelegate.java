package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.ClipViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ClipViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ClipViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ClipViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        boolean booleanValue;
        str.hashCode();
        if (!str.equals("cutouts")) {
            if (!str.equals("clipToCircle")) {
                super.setProperty(t, str, obj);
                return;
            }
            ClipViewManagerInterface clipViewManagerInterface = (ClipViewManagerInterface) this.mViewManager;
            if (obj == null) {
                booleanValue = false;
            } else {
                booleanValue = ((Boolean) obj).booleanValue();
            }
            clipViewManagerInterface.setClipToCircle(t, booleanValue);
            return;
        }
        ((ClipViewManagerInterface) this.mViewManager).setCutouts(t, (ReadableArray) obj);
    }
}
