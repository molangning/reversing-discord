package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public RNSScreenManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        int intValue;
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 0;
                    break;
                }
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 2;
                    break;
                }
                break;
            case -1349152186:
                if (str.equals("sheetCornerRadius")) {
                    c = 3;
                    break;
                }
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c = 4;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = 5;
                    break;
                }
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 6;
                    break;
                }
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = 7;
                    break;
                }
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = '\b';
                    break;
                }
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = '\t';
                    break;
                }
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = '\n';
                    break;
                }
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = 11;
                    break;
                }
                break;
            case -274098190:
                if (str.equals("sheetAllowedDetents")) {
                    c = '\f';
                    break;
                }
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = '\r';
                    break;
                }
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = 14;
                    break;
                }
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = 15;
                    break;
                }
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 16;
                    break;
                }
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 17;
                    break;
                }
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 18;
                    break;
                }
                break;
            case 241896530:
                if (str.equals("sheetLargestUndimmedDetent")) {
                    c = 19;
                    break;
                }
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 20;
                    break;
                }
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 21;
                    break;
                }
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 22;
                    break;
                }
                break;
            case 1357942638:
                if (str.equals("sheetGrabberVisible")) {
                    c = 23;
                    break;
                }
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = 24;
                    break;
                }
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = 25;
                    break;
                }
                break;
            case 2097450072:
                if (str.equals("sheetExpandsWhenScrolledToEdge")) {
                    c = 26;
                    break;
                }
                break;
        }
        float f = -1.0f;
        String str2 = null;
        switch (c) {
            case 0:
                RNSScreenManagerInterface rNSScreenManagerInterface = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface.setHomeIndicatorHidden(t, z2);
                return;
            case 1:
                RNSScreenManagerInterface rNSScreenManagerInterface2 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface2.setGestureEnabled(t, z);
                return;
            case 2:
                RNSScreenManagerInterface rNSScreenManagerInterface3 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface3.setHideKeyboardOnSwipe(t, z2);
                return;
            case 3:
                RNSScreenManagerInterface rNSScreenManagerInterface4 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSScreenManagerInterface4.setSheetCornerRadius(t, f);
                return;
            case 4:
                RNSScreenManagerInterface rNSScreenManagerInterface5 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface5.setNavigationBarHidden(t, z2);
                return;
            case 5:
                RNSScreenManagerInterface rNSScreenManagerInterface6 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface6.setStatusBarTranslucent(t, z2);
                return;
            case 6:
                ((RNSScreenManagerInterface) this.mViewManager).setStackPresentation(t, (String) obj);
                return;
            case 7:
                RNSScreenManagerInterface rNSScreenManagerInterface7 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSScreenManagerInterface7.setActivityState(t, f);
                return;
            case '\b':
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\t':
                RNSScreenManagerInterface rNSScreenManagerInterface8 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface8.setStatusBarStyle(t, str2);
                return;
            case '\n':
                ((RNSScreenManagerInterface) this.mViewManager).setStackAnimation(t, (String) obj);
                return;
            case 11:
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\f':
                ((RNSScreenManagerInterface) this.mViewManager).setSheetAllowedDetents(t, (String) obj);
                return;
            case '\r':
                ((RNSScreenManagerInterface) this.mViewManager).setReplaceAnimation(t, (String) obj);
                return;
            case 14:
                RNSScreenManagerInterface rNSScreenManagerInterface9 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface9.setPreventNativeDismiss(t, z2);
                return;
            case 15:
                RNSScreenManagerInterface rNSScreenManagerInterface10 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface10.setStatusBarHidden(t, z2);
                return;
            case 16:
                RNSScreenManagerInterface rNSScreenManagerInterface11 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface11.setFullScreenSwipeEnabled(t, z2);
                return;
            case 17:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                return;
            case 18:
                RNSScreenManagerInterface rNSScreenManagerInterface12 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface12.setScreenOrientation(t, str2);
                return;
            case 19:
                ((RNSScreenManagerInterface) this.mViewManager).setSheetLargestUndimmedDetent(t, (String) obj);
                return;
            case 20:
                RNSScreenManagerInterface rNSScreenManagerInterface13 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj == null) {
                    intValue = 350;
                } else {
                    intValue = ((Double) obj).intValue();
                }
                rNSScreenManagerInterface13.setTransitionDuration(t, intValue);
                return;
            case 21:
                ((RNSScreenManagerInterface) this.mViewManager).setSwipeDirection(t, (String) obj);
                return;
            case 22:
                RNSScreenManagerInterface rNSScreenManagerInterface14 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface14.setCustomAnimationOnSwipe(t, z2);
                return;
            case 23:
                RNSScreenManagerInterface rNSScreenManagerInterface15 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface15.setSheetGrabberVisible(t, z2);
                return;
            case 24:
                RNSScreenManagerInterface rNSScreenManagerInterface16 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface16.setStatusBarAnimation(t, str2);
                return;
            case 25:
                RNSScreenManagerInterface rNSScreenManagerInterface17 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface17.setNativeBackButtonDismissalEnabled(t, z2);
                return;
            case 26:
                RNSScreenManagerInterface rNSScreenManagerInterface18 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface18.setSheetExpandsWhenScrolledToEdge(t, z2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}