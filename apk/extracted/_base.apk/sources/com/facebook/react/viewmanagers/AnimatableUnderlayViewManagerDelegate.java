package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.AnimatableUnderlayViewManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AnimatableUnderlayViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AnimatableUnderlayViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AnimatableUnderlayViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2083741526:
                if (str.equals("animatedHeight")) {
                    c = 0;
                    break;
                }
                break;
            case -2031626490:
                if (str.equals("animatedBackgroundColorRgba")) {
                    c = 1;
                    break;
                }
                break;
            case -1854365213:
                if (str.equals("animatedWidth")) {
                    c = 2;
                    break;
                }
                break;
            case -1806389417:
                if (str.equals("animatedBorderWidth")) {
                    c = 3;
                    break;
                }
                break;
            case -936803287:
                if (str.equals("clipDirectionX")) {
                    c = 4;
                    break;
                }
                break;
            case -936803286:
                if (str.equals("clipDirectionY")) {
                    c = 5;
                    break;
                }
                break;
            case 614423495:
                if (str.equals("animatedBottomLeftRadius")) {
                    c = 6;
                    break;
                }
                break;
            case 1128997308:
                if (str.equals("animatedTopRightRadius")) {
                    c = 7;
                    break;
                }
                break;
            case 1616042816:
                if (str.equals("animatedBottomRightRadius")) {
                    c = '\b';
                    break;
                }
                break;
            case 1786440776:
                if (str.equals("animatedBorderColorRgba")) {
                    c = '\t';
                    break;
                }
                break;
            case 2122733003:
                if (str.equals("animatedTopLeftRadius")) {
                    c = '\n';
                    break;
                }
                break;
        }
        String str2 = null;
        float f = 0.0f;
        switch (c) {
            case 0:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface.setAnimatedHeight(t, f);
                return;
            case 1:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface2 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                animatableUnderlayViewManagerInterface2.setAnimatedBackgroundColorRgba(t, str2);
                return;
            case 2:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface3 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface3.setAnimatedWidth(t, f);
                return;
            case 3:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface4 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface4.setAnimatedBorderWidth(t, f);
                return;
            case 4:
                ((AnimatableUnderlayViewManagerInterface) this.mViewManager).setClipDirectionX(t, (String) obj);
                return;
            case 5:
                ((AnimatableUnderlayViewManagerInterface) this.mViewManager).setClipDirectionY(t, (String) obj);
                return;
            case 6:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface5 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface5.setAnimatedBottomLeftRadius(t, f);
                return;
            case 7:
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface6 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface6.setAnimatedTopRightRadius(t, f);
                return;
            case '\b':
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface7 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface7.setAnimatedBottomRightRadius(t, f);
                return;
            case '\t':
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface8 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                animatableUnderlayViewManagerInterface8.setAnimatedBorderColorRgba(t, str2);
                return;
            case '\n':
                AnimatableUnderlayViewManagerInterface animatableUnderlayViewManagerInterface9 = (AnimatableUnderlayViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                animatableUnderlayViewManagerInterface9.setAnimatedTopLeftRadius(t, f);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
