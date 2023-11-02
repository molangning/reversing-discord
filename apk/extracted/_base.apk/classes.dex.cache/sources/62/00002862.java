package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.yoga.C4340d;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ReactTextAnchorViewManager<T extends View, C extends ReactBaseTextShadowNode> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};
    private static final String TAG = "ReactTextAnchorViewManager";

    @ReactProp(name = "accessible")
    public void setAccessible(ReactTextView reactTextView, boolean z) {
        reactTextView.setFocusable(z);
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public void setAdjustFontSizeToFit(ReactTextView reactTextView, boolean z) {
        reactTextView.setAdjustFontSizeToFit(z);
    }

    @ReactProp(name = "android_hyphenationFrequency")
    public void setAndroidHyphenationFrequency(ReactTextView reactTextView, String str) {
        if (str != null && !str.equals(ViewProps.NONE)) {
            if (str.equals("full")) {
                reactTextView.setHyphenationFrequency(2);
                return;
            } else if (str.equals("normal")) {
                reactTextView.setHyphenationFrequency(1);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid android_hyphenationFrequency: " + str);
                reactTextView.setHyphenationFrequency(0);
                return;
            }
        }
        reactTextView.setHyphenationFrequency(0);
    }

    @ReactPropGroup(customType = "Color", names = {ViewProps.BORDER_COLOR, ViewProps.BORDER_LEFT_COLOR, ViewProps.BORDER_RIGHT_COLOR, ViewProps.BORDER_TOP_COLOR, ViewProps.BORDER_BOTTOM_COLOR})
    public void setBorderColor(ReactTextView reactTextView, int i, Integer num) {
        float intValue;
        float f = Float.NaN;
        if (num == null) {
            intValue = Float.NaN;
        } else {
            intValue = num.intValue() & 16777215;
        }
        if (num != null) {
            f = num.intValue() >>> 24;
        }
        reactTextView.setBorderColor(SPACING_TYPES[i], intValue, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", ViewProps.BORDER_TOP_LEFT_RADIUS, ViewProps.BORDER_TOP_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, ViewProps.BORDER_BOTTOM_LEFT_RADIUS})
    public void setBorderRadius(ReactTextView reactTextView, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        if (i == 0) {
            reactTextView.setBorderRadius(f);
        } else {
            reactTextView.setBorderRadius(f, i - 1);
        }
    }

    @ReactProp(name = "borderStyle")
    public void setBorderStyle(ReactTextView reactTextView, String str) {
        reactTextView.setBorderStyle(str);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH})
    public void setBorderWidth(ReactTextView reactTextView, int i, float f) {
        if (!C4340d.m29971a(f)) {
            f = PixelUtil.toPixelFromDIP(f);
        }
        reactTextView.setBorderWidth(SPACING_TYPES[i], f);
    }

    @ReactProp(name = "dataDetectorType")
    public void setDataDetectorType(ReactTextView reactTextView, String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case -1192969641:
                    if (str.equals("phoneNumber")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96673:
                    if (str.equals("all")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3321850:
                    if (str.equals("link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    reactTextView.setLinkifyMask(4);
                    return;
                case 1:
                    reactTextView.setLinkifyMask(15);
                    return;
                case 2:
                    reactTextView.setLinkifyMask(1);
                    return;
                case 3:
                    reactTextView.setLinkifyMask(2);
                    return;
            }
        }
        reactTextView.setLinkifyMask(0);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(ReactTextView reactTextView, boolean z) {
        reactTextView.setEnabled(!z);
    }

    @ReactProp(name = ViewProps.ELLIPSIZE_MODE)
    public void setEllipsizeMode(ReactTextView reactTextView, String str) {
        if (str != null && !str.equals("tail")) {
            if (str.equals("head")) {
                reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.START);
                return;
            } else if (str.equals("middle")) {
                reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
                return;
            } else if (str.equals("clip")) {
                reactTextView.setEllipsizeLocation(null);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid ellipsizeMode: " + str);
                reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
                return;
            }
        }
        reactTextView.setEllipsizeLocation(TextUtils.TruncateAt.END);
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public void setIncludeFontPadding(ReactTextView reactTextView, boolean z) {
        reactTextView.setIncludeFontPadding(z);
    }

    @ReactProp(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(ReactTextView reactTextView, boolean z) {
        reactTextView.setNotifyOnInlineViewLayout(z);
    }

    @ReactProp(defaultInt = ViewDefaults.NUMBER_OF_LINES, name = ViewProps.NUMBER_OF_LINES)
    public void setNumberOfLines(ReactTextView reactTextView, int i) {
        reactTextView.setNumberOfLines(i);
    }

    @ReactProp(name = "selectable")
    public void setSelectable(ReactTextView reactTextView, boolean z) {
        reactTextView.setTextIsSelectable(z);
    }

    @ReactProp(customType = "Color", name = "selectionColor")
    public void setSelectionColor(ReactTextView reactTextView, Integer num) {
        if (num == null) {
            reactTextView.setHighlightColor(DefaultStyleValuesUtil.getDefaultTextColorHighlight(reactTextView.getContext()));
        } else {
            reactTextView.setHighlightColor(num.intValue());
        }
    }

    @ReactProp(name = ViewProps.TEXT_ALIGN_VERTICAL)
    public void setTextAlignVertical(ReactTextView reactTextView, String str) {
        if (str != null && !"auto".equals(str)) {
            if (ViewProps.TOP.equals(str)) {
                reactTextView.setGravityVertical(48);
                return;
            } else if (ViewProps.BOTTOM.equals(str)) {
                reactTextView.setGravityVertical(80);
                return;
            } else if ("center".equals(str)) {
                reactTextView.setGravityVertical(16);
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textAlignVertical: " + str);
                reactTextView.setGravityVertical(0);
                return;
            }
        }
        reactTextView.setGravityVertical(0);
    }
}