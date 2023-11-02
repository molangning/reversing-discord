package com.facebook.react.uimanager;

import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface IViewGroupManager<T extends View> extends IViewManagerWithChildren {
    void addView(T t, View view, int i);

    View getChildAt(T t, int i);

    int getChildCount(T t);

    void removeViewAt(T t, int i);
}
