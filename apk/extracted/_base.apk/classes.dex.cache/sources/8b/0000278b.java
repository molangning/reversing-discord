package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.DCDChatInputManagerInterface;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DCDChatInputManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & DCDChatInputManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    public DCDChatInputManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1505238496:
                if (str.equals("setSelectedRange")) {
                    c = 0;
                    break;
                }
                break;
            case -1482107872:
                if (str.equals("openSystemKeyboard")) {
                    c = 1;
                    break;
                }
                break;
            case 3027047:
                if (str.equals("blur")) {
                    c = 2;
                    break;
                }
                break;
            case 73995964:
                if (str.equals("updateTextBlocks")) {
                    c = 3;
                    break;
                }
                break;
            case 97604824:
                if (str.equals("focus")) {
                    c = 4;
                    break;
                }
                break;
            case 448538345:
                if (str.equals("replaceRange")) {
                    c = 5;
                    break;
                }
                break;
            case 1353507967:
                if (str.equals("backspace")) {
                    c = 6;
                    break;
                }
                break;
            case 1520339810:
                if (str.equals("openCustomKeyboard")) {
                    c = 7;
                    break;
                }
                break;
            case 1984984239:
                if (str.equals("setText")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((DCDChatInputManagerInterface) this.mViewManager).setSelectedRange(t, readableArray.getInt(0), readableArray.getInt(1));
                return;
            case 1:
                ((DCDChatInputManagerInterface) this.mViewManager).openSystemKeyboard(t);
                return;
            case 2:
                ((DCDChatInputManagerInterface) this.mViewManager).blur(t);
                return;
            case 3:
                ((DCDChatInputManagerInterface) this.mViewManager).updateTextBlocks(t, readableArray.getString(0), readableArray.getString(1));
                return;
            case 4:
                ((DCDChatInputManagerInterface) this.mViewManager).focus(t);
                return;
            case 5:
                ((DCDChatInputManagerInterface) this.mViewManager).replaceRange(t, readableArray.getInt(0), readableArray.getInt(1), readableArray.getString(2), readableArray.getString(3), readableArray.getBoolean(4), readableArray.getString(5));
                return;
            case 6:
                ((DCDChatInputManagerInterface) this.mViewManager).backspace(t);
                return;
            case 7:
                ((DCDChatInputManagerInterface) this.mViewManager).openCustomKeyboard(t);
                return;
            case '\b':
                ((DCDChatInputManagerInterface) this.mViewManager).setText(t, readableArray.getString(0));
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
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1710287051:
                if (str.equals("markAsSpoilerTitle")) {
                    c = 0;
                    break;
                }
                break;
            case -1576785488:
                if (str.equals("placeholderColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1187146042:
                if (str.equals("shouldShowCursor")) {
                    c = 2;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c = 3;
                    break;
                }
                break;
            case -954624085:
                if (str.equals("keyboardAppearance")) {
                    c = 4;
                    break;
                }
                break;
            case 598246771:
                if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    c = 5;
                    break;
                }
                break;
            case 1602416228:
                if (str.equals("editable")) {
                    c = 6;
                    break;
                }
                break;
            case 2142299447:
                if (str.equals("selectionColor")) {
                    c = 7;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                DCDChatInputManagerInterface dCDChatInputManagerInterface = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDChatInputManagerInterface.setMarkAsSpoilerTitle(t, str2);
                return;
            case 1:
                DCDChatInputManagerInterface dCDChatInputManagerInterface2 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDChatInputManagerInterface2.setPlaceholderColor(t, str2);
                return;
            case 2:
                DCDChatInputManagerInterface dCDChatInputManagerInterface3 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                dCDChatInputManagerInterface3.setShouldShowCursor(t, z);
                return;
            case 3:
                DCDChatInputManagerInterface dCDChatInputManagerInterface4 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDChatInputManagerInterface4.setTextColor(t, str2);
                return;
            case 4:
                DCDChatInputManagerInterface dCDChatInputManagerInterface5 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                dCDChatInputManagerInterface5.setKeyboardAppearance(t, i);
                return;
            case 5:
                DCDChatInputManagerInterface dCDChatInputManagerInterface6 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDChatInputManagerInterface6.setPlaceholder(t, str2);
                return;
            case 6:
                DCDChatInputManagerInterface dCDChatInputManagerInterface7 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                dCDChatInputManagerInterface7.setEditable(t, z2);
                return;
            case 7:
                DCDChatInputManagerInterface dCDChatInputManagerInterface8 = (DCDChatInputManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                dCDChatInputManagerInterface8.setSelectionColor(t, str2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}