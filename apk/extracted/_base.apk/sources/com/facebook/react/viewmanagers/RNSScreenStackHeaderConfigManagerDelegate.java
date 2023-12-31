package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        boolean z8 = false;
        int i3 = 0;
        boolean z9 = false;
        boolean z10 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1822687399:
                if (str.equals("translucent")) {
                    c = 0;
                    break;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    c = 2;
                    break;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    c = 3;
                    break;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    c = 4;
                    break;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    c = 5;
                    break;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    c = 6;
                    break;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    c = 7;
                    break;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    c = '\b';
                    break;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c = '\t';
                    break;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    c = '\n';
                    break;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    c = 11;
                    break;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    c = '\f';
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c = '\r';
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 14;
                    break;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    c = 15;
                    break;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    c = 16;
                    break;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    c = 17;
                    break;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    c = 18;
                    break;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    c = 19;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    c = 20;
                    break;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    c = 21;
                    break;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    c = 22;
                    break;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    c = 23;
                    break;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    c = 24;
                    break;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    c = 25;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface.setTranslucent(t, z2);
                return;
            case 1:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 2:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface2 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface2.setTitleFontFamily(t, str2);
                return;
            case 4:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface3 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z10 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface3.setDisableBackButtonMenu(t, z10);
                return;
            case 5:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface4 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface4.setTitleFontWeight(t, str2);
                return;
            case 6:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface5 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z9 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface5.setHidden(t, z9);
                return;
            case 7:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface6 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSScreenStackHeaderConfigManagerInterface6.setLargeTitleFontSize(t, i3);
                return;
            case '\b':
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface7 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface7.setBackTitleVisible(t, z);
                return;
            case '\t':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDirection(t, (String) obj);
                return;
            case '\n':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 11:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface8 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z8 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface8.setBackButtonInCustomView(t, z8);
                return;
            case '\f':
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface9 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface9.setLargeTitleFontFamily(t, str2);
                return;
            case '\r':
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 14:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface10 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface10.setTitle(t, str2);
                return;
            case 15:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface11 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSScreenStackHeaderConfigManagerInterface11.setBackTitleFontSize(t, i2);
                return;
            case 16:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface12 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface12.setBackTitleFontFamily(t, str2);
                return;
            case 17:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface13 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z7 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface13.setHideShadow(t, z7);
                return;
            case 18:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface14 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface14.setLargeTitleFontWeight(t, str2);
                return;
            case 19:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface15 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z6 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface15.setHideBackButton(t, z6);
                return;
            case 20:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 21:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface16 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenStackHeaderConfigManagerInterface16.setBackTitle(t, str2);
                return;
            case 22:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface17 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSScreenStackHeaderConfigManagerInterface17.setTitleFontSize(t, i);
                return;
            case 23:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface18 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z5 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface18.setLargeTitleHideShadow(t, z5);
                return;
            case 24:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface19 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface19.setLargeTitle(t, z4);
                return;
            case 25:
                RNSScreenStackHeaderConfigManagerInterface rNSScreenStackHeaderConfigManagerInterface20 = (RNSScreenStackHeaderConfigManagerInterface) this.mViewManager;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                rNSScreenStackHeaderConfigManagerInterface20.setTopInsetEnabled(t, z3);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
