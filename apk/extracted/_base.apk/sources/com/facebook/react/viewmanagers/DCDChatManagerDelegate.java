package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDChatManagerInterface;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDChatManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDChatManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public DCDChatManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -938100109:
                if (str.equals("scrollToBottom")) {
                    c = 0;
                    break;
                }
                break;
            case -402165208:
                if (str.equals("scrollTo")) {
                    c = 1;
                    break;
                }
                break;
            case 1908871954:
                if (str.equals("scrollIntoView")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((DCDChatManagerInterface) this.mViewManager).scrollToBottom(t, readableArray.getBoolean(0));
                return;
            case 1:
                ((DCDChatManagerInterface) this.mViewManager).scrollTo(t, readableArray.getInt(0), readableArray.getBoolean(1));
                return;
            case 2:
                ((DCDChatManagerInterface) this.mViewManager).scrollIntoView(t, readableArray.getInt(0), readableArray.getBoolean(1));
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1151046732:
                if (str.equals("scrollEnabled")) {
                    c = 0;
                    break;
                }
                break;
            case -309398713:
                if (str.equals("keyboardResponderProxyTag")) {
                    c = 1;
                    break;
                }
                break;
            case -144215618:
                if (str.equals("alwaysRespectKeyboard")) {
                    c = 2;
                    break;
                }
                break;
            case 324962011:
                if (str.equals("roleStyle")) {
                    c = 3;
                    break;
                }
                break;
            case 627674869:
                if (str.equals("inverted")) {
                    c = 4;
                    break;
                }
                break;
            case 1020592613:
                if (str.equals("animateEmoji")) {
                    c = 5;
                    break;
                }
                break;
            case 1148532961:
                if (str.equals("shouldAnimateAndroid")) {
                    c = 6;
                    break;
                }
                break;
            case 1825598780:
                if (str.equals("HACK_fixModalInteraction")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                DCDChatManagerInterface dCDChatManagerInterface = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface.setScrollEnabled(t, z);
                return;
            case 1:
                DCDChatManagerInterface dCDChatManagerInterface2 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                dCDChatManagerInterface2.setKeyboardResponderProxyTag(t, i);
                return;
            case 2:
                DCDChatManagerInterface dCDChatManagerInterface3 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z6 = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface3.setAlwaysRespectKeyboard(t, z6);
                return;
            case 3:
                ((DCDChatManagerInterface) this.mViewManager).setRoleStyle(t, (String) obj);
                return;
            case 4:
                DCDChatManagerInterface dCDChatManagerInterface4 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z5 = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface4.setInverted(t, z5);
                return;
            case 5:
                DCDChatManagerInterface dCDChatManagerInterface5 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface5.setAnimateEmoji(t, z4);
                return;
            case 6:
                DCDChatManagerInterface dCDChatManagerInterface6 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface6.setShouldAnimateAndroid(t, z3);
                return;
            case 7:
                DCDChatManagerInterface dCDChatManagerInterface7 = (DCDChatManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                dCDChatManagerInterface7.setHACK_fixModalInteraction(t, z2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
