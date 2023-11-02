package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.BlockingGestureViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BlockingGestureViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & BlockingGestureViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public BlockingGestureViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        super.setProperty(t, str, obj);
    }
}