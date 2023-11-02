package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RootViewUtil {
    public static RootView getRootView(View view) {
        while (!(view instanceof RootView)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C5743a.m24585a(parent instanceof View);
            view = (View) parent;
        }
        return (RootView) view;
    }

    public static Point getViewportOffset(View view) {
        view.getLocationInWindow(r0);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int[] iArr = {iArr[0] - rect.left, iArr[1] - rect.top};
        return new Point(iArr[0], iArr[1]);
    }
}