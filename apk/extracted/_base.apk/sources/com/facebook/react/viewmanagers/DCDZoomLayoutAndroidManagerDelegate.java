package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDZoomLayoutAndroidManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDZoomLayoutAndroidManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDZoomLayoutAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDZoomLayoutAndroidManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        if (!str.equals("unzoom")) {
            if (str.equals("zoomTo")) {
                ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).zoomTo(t, (float) readableArray.getDouble(0), (float) readableArray.getDouble(1));
                return;
            }
            return;
        }
        ((DCDZoomLayoutAndroidManagerInterface) this.mViewManager).unzoom(t);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 0;
                    break;
                }
                break;
            case -153607991:
                if (str.equals("minimumZoomScale")) {
                    c = 1;
                    break;
                }
                break;
            case -89739529:
                if (str.equals("maximumZoomScale")) {
                    c = 2;
                    break;
                }
                break;
        }
        float f = 0.0f;
        switch (c) {
            case 0:
                DCDZoomLayoutAndroidManagerInterface dCDZoomLayoutAndroidManagerInterface = (DCDZoomLayoutAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                dCDZoomLayoutAndroidManagerInterface.setGestureEnabled(t, z);
                return;
            case 1:
                DCDZoomLayoutAndroidManagerInterface dCDZoomLayoutAndroidManagerInterface2 = (DCDZoomLayoutAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                dCDZoomLayoutAndroidManagerInterface2.setMinimumZoomScale(t, f);
                return;
            case 2:
                DCDZoomLayoutAndroidManagerInterface dCDZoomLayoutAndroidManagerInterface3 = (DCDZoomLayoutAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                dCDZoomLayoutAndroidManagerInterface3.setMaximumZoomScale(t, f);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
