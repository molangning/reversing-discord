package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.ChannelSpineManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ChannelSpineManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ChannelSpineManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public ChannelSpineManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        int intValue;
        float floatValue;
        str.hashCode();
        if (!str.equals("numRows")) {
            if (!str.equals("rowHeight")) {
                super.setProperty(t, str, obj);
                return;
            }
            ChannelSpineManagerInterface channelSpineManagerInterface = (ChannelSpineManagerInterface) this.mViewManager;
            if (obj == null) {
                floatValue = Float.NaN;
            } else {
                floatValue = ((Double) obj).floatValue();
            }
            channelSpineManagerInterface.setRowHeight(t, floatValue);
            return;
        }
        ChannelSpineManagerInterface channelSpineManagerInterface2 = (ChannelSpineManagerInterface) this.mViewManager;
        if (obj == null) {
            intValue = 0;
        } else {
            intValue = ((Double) obj).intValue();
        }
        channelSpineManagerInterface2.setNumRows(t, intValue);
    }
}