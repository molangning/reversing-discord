package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.EmojiPickerRowViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class EmojiPickerRowViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & EmojiPickerRowViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public EmojiPickerRowViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        if (!str.equals("rowData")) {
            super.setProperty(t, str, obj);
        } else {
            ((EmojiPickerRowViewManagerInterface) this.mViewManager).setRowData(t, (ReadableMap) obj);
        }
    }
}