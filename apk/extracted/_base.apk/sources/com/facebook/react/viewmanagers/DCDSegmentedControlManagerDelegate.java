package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.DCDSegmentedControlManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDSegmentedControlManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDSegmentedControlManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDSegmentedControlManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -823812830:
                if (str.equals("values")) {
                    c = 0;
                    break;
                }
                break;
            case -758089477:
                if (str.equals("accessibilityRoleDescriptions")) {
                    c = 1;
                    break;
                }
                break;
            case -85026353:
                if (str.equals("titleAttributes")) {
                    c = 2;
                    break;
                }
                break;
            case 583595847:
                if (str.equals("cornerRadius")) {
                    c = 3;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    c = 4;
                    break;
                }
                break;
            case 1433491354:
                if (str.equals("selectedSegmentIndex")) {
                    c = 5;
                    break;
                }
                break;
            case 1693087156:
                if (str.equals("selectedTitleAttributes")) {
                    c = 6;
                    break;
                }
                break;
            case 2125422940:
                if (str.equals("customSelectedTintColor")) {
                    c = 7;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                ((DCDSegmentedControlManagerInterface) this.mViewManager).setValues(t, (ReadableArray) obj);
                return;
            case 1:
                ((DCDSegmentedControlManagerInterface) this.mViewManager).setAccessibilityRoleDescriptions(t, (ReadableArray) obj);
                return;
            case 2:
                ((DCDSegmentedControlManagerInterface) this.mViewManager).setTitleAttributes(t, (ReadableMap) obj);
                return;
            case 3:
                DCDSegmentedControlManagerInterface dCDSegmentedControlManagerInterface = (DCDSegmentedControlManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                dCDSegmentedControlManagerInterface.setCornerRadius(t, i);
                return;
            case 4:
                DCDSegmentedControlManagerInterface dCDSegmentedControlManagerInterface2 = (DCDSegmentedControlManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDSegmentedControlManagerInterface2.setBackgroundColor(t, str2);
                return;
            case 5:
                DCDSegmentedControlManagerInterface dCDSegmentedControlManagerInterface3 = (DCDSegmentedControlManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                dCDSegmentedControlManagerInterface3.setSelectedSegmentIndex(t, i);
                return;
            case 6:
                ((DCDSegmentedControlManagerInterface) this.mViewManager).setSelectedTitleAttributes(t, (ReadableMap) obj);
                return;
            case 7:
                DCDSegmentedControlManagerInterface dCDSegmentedControlManagerInterface4 = (DCDSegmentedControlManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDSegmentedControlManagerInterface4.setCustomSelectedTintColor(t, str2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
