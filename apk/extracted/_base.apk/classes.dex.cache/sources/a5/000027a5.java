package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDVisualEffectViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDVisualEffectViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDVisualEffectViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public DCDVisualEffectViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        float floatValue;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1903475809:
                if (str.equals("blurAmount")) {
                    c = 0;
                    break;
                }
                break;
            case -1896608177:
                if (str.equals("blurTargetViewNativeId")) {
                    c = 1;
                    break;
                }
                break;
            case -115969962:
                if (str.equals("blurTintRgba")) {
                    c = 2;
                    break;
                }
                break;
            case 1230373318:
                if (str.equals("blurTintIOSParityCompensationRgba")) {
                    c = 3;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                DCDVisualEffectViewManagerInterface dCDVisualEffectViewManagerInterface = (DCDVisualEffectViewManagerInterface) this.mViewManager;
                if (obj == null) {
                    floatValue = 0.0f;
                } else {
                    floatValue = ((Double) obj).floatValue();
                }
                dCDVisualEffectViewManagerInterface.setBlurAmount(t, floatValue);
                return;
            case 1:
                DCDVisualEffectViewManagerInterface dCDVisualEffectViewManagerInterface2 = (DCDVisualEffectViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDVisualEffectViewManagerInterface2.setBlurTargetViewNativeId(t, str2);
                return;
            case 2:
                DCDVisualEffectViewManagerInterface dCDVisualEffectViewManagerInterface3 = (DCDVisualEffectViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDVisualEffectViewManagerInterface3.setBlurTintRgba(t, str2);
                return;
            case 3:
                DCDVisualEffectViewManagerInterface dCDVisualEffectViewManagerInterface4 = (DCDVisualEffectViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDVisualEffectViewManagerInterface4.setBlurTintIOSParityCompensationRgba(t, str2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}