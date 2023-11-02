package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import com.facebook.yoga.YogaAlign;
import com.facebook.yoga.YogaDisplay;
import com.facebook.yoga.YogaFlexDirection;
import com.facebook.yoga.YogaJustify;
import com.facebook.yoga.YogaOverflow;
import com.facebook.yoga.YogaPositionType;
import com.facebook.yoga.YogaUnit;
import com.facebook.yoga.YogaWrap;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class LayoutShadowNode extends ReactShadowNodeImpl {
    boolean mCollapsable;
    private final MutableYogaValue mTempYogaValue = new MutableYogaValue();

    /* renamed from: com.facebook.react.uimanager.LayoutShadowNode$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C41901 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[YogaUnit.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[YogaUnit.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[YogaUnit.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static class MutableYogaValue {
        YogaUnit unit;
        float value;

        private MutableYogaValue() {
        }

        private MutableYogaValue(MutableYogaValue mutableYogaValue) {
            this.value = mutableYogaValue.value;
            this.unit = mutableYogaValue.unit;
        }

        void setFromDynamic(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals("auto")) {
                    this.unit = YogaUnit.AUTO;
                    this.value = Float.NaN;
                } else if (asString.endsWith("%")) {
                    this.unit = YogaUnit.PERCENT;
                    this.value = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    C13677a.m1870H(ReactConstants.TAG, "Unknown value: " + asString);
                    this.unit = YogaUnit.UNDEFINED;
                    this.value = Float.NaN;
                }
            } else if (dynamic.getType() == ReadableType.Number) {
                this.unit = YogaUnit.POINT;
                this.value = PixelUtil.toPixelFromDIP(dynamic.asDouble());
            } else {
                this.unit = YogaUnit.UNDEFINED;
                this.value = Float.NaN;
            }
        }
    }

    private int maybeTransformLeftRightToStartEnd(int i) {
        if (I18nUtil.getInstance().doLeftAndRightSwapInRTL(getThemedContext())) {
            if (i != 0) {
                if (i != 2) {
                    return i;
                }
                return 5;
            }
            return 4;
        }
        return i;
    }

    @ReactProp(name = ViewProps.ALIGN_CONTENT)
    public void setAlignContent(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignContent(YogaAlign.FLEX_START);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignContent(YogaAlign.STRETCH);
                return;
            case 1:
                setAlignContent(YogaAlign.BASELINE);
                return;
            case 2:
                setAlignContent(YogaAlign.CENTER);
                return;
            case 3:
                setAlignContent(YogaAlign.FLEX_START);
                return;
            case 4:
                setAlignContent(YogaAlign.AUTO);
                return;
            case 5:
                setAlignContent(YogaAlign.SPACE_BETWEEN);
                return;
            case 6:
                setAlignContent(YogaAlign.FLEX_END);
                return;
            case 7:
                setAlignContent(YogaAlign.SPACE_AROUND);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for alignContent: " + str);
                setAlignContent(YogaAlign.FLEX_START);
                return;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_ITEMS)
    public void setAlignItems(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignItems(YogaAlign.STRETCH);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignItems(YogaAlign.STRETCH);
                return;
            case 1:
                setAlignItems(YogaAlign.BASELINE);
                return;
            case 2:
                setAlignItems(YogaAlign.CENTER);
                return;
            case 3:
                setAlignItems(YogaAlign.FLEX_START);
                return;
            case 4:
                setAlignItems(YogaAlign.AUTO);
                return;
            case 5:
                setAlignItems(YogaAlign.SPACE_BETWEEN);
                return;
            case 6:
                setAlignItems(YogaAlign.FLEX_END);
                return;
            case 7:
                setAlignItems(YogaAlign.SPACE_AROUND);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for alignItems: " + str);
                setAlignItems(YogaAlign.STRETCH);
                return;
        }
    }

    @ReactProp(name = ViewProps.ALIGN_SELF)
    public void setAlignSelf(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setAlignSelf(YogaAlign.AUTO);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 0;
                    break;
                }
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 1;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 3;
                    break;
                }
                break;
            case 3005871:
                if (str.equals("auto")) {
                    c = 4;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 5;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 6;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setAlignSelf(YogaAlign.STRETCH);
                return;
            case 1:
                setAlignSelf(YogaAlign.BASELINE);
                return;
            case 2:
                setAlignSelf(YogaAlign.CENTER);
                return;
            case 3:
                setAlignSelf(YogaAlign.FLEX_START);
                return;
            case 4:
                setAlignSelf(YogaAlign.AUTO);
                return;
            case 5:
                setAlignSelf(YogaAlign.SPACE_BETWEEN);
                return;
            case 6:
                setAlignSelf(YogaAlign.FLEX_END);
                return;
            case 7:
                setAlignSelf(YogaAlign.SPACE_AROUND);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for alignSelf: " + str);
                setAlignSelf(YogaAlign.AUTO);
                return;
        }
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.ASPECT_RATIO)
    public void setAspectRatio(float f) {
        setStyleAspectRatio(f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {ViewProps.BORDER_WIDTH, ViewProps.BORDER_START_WIDTH, ViewProps.BORDER_END_WIDTH, ViewProps.BORDER_TOP_WIDTH, ViewProps.BORDER_BOTTOM_WIDTH, ViewProps.BORDER_LEFT_WIDTH, ViewProps.BORDER_RIGHT_WIDTH})
    public void setBorderWidths(int i, float f) {
        if (isVirtual()) {
            return;
        }
        setBorder(maybeTransformLeftRightToStartEnd(ViewProps.BORDER_SPACING_TYPES[i]), PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = ViewProps.COLLAPSABLE)
    public void setCollapsable(boolean z) {
        this.mCollapsable = z;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.COLUMN_GAP)
    public void setColumnGap(float f) {
        if (isVirtual()) {
            return;
        }
        super.setColumnGap(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = ViewProps.DISPLAY)
    public void setDisplay(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setDisplay(YogaDisplay.FLEX);
        } else if (!str.equals(ViewProps.FLEX)) {
            if (!str.equals(ViewProps.NONE)) {
                C13677a.m1870H(ReactConstants.TAG, "invalid value for display: " + str);
                setDisplay(YogaDisplay.FLEX);
                return;
            }
            setDisplay(YogaDisplay.NONE);
        } else {
            setDisplay(YogaDisplay.FLEX);
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX)
    public void setFlex(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlex(f);
    }

    @ReactProp(name = ViewProps.FLEX_BASIS)
    public void setFlexBasis(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    setFlexBasisPercent(this.mTempYogaValue.value);
                }
            } else {
                setFlexBasisAuto();
            }
        } else {
            setFlexBasis(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.FLEX_DIRECTION)
    public void setFlexDirection(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexDirection(YogaFlexDirection.COLUMN);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1448970769:
                if (str.equals("row-reverse")) {
                    c = 0;
                    break;
                }
                break;
            case -1354837162:
                if (str.equals("column")) {
                    c = 1;
                    break;
                }
                break;
            case 113114:
                if (str.equals("row")) {
                    c = 2;
                    break;
                }
                break;
            case 1272730475:
                if (str.equals("column-reverse")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setFlexDirection(YogaFlexDirection.ROW_REVERSE);
                return;
            case 1:
                setFlexDirection(YogaFlexDirection.COLUMN);
                return;
            case 2:
                setFlexDirection(YogaFlexDirection.ROW);
                return;
            case 3:
                setFlexDirection(YogaFlexDirection.COLUMN_REVERSE);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for flexDirection: " + str);
                setFlexDirection(YogaFlexDirection.COLUMN);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_GROW)
    public void setFlexGrow(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexGrow(f);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = 0.0f, name = ViewProps.FLEX_SHRINK)
    public void setFlexShrink(float f) {
        if (isVirtual()) {
            return;
        }
        super.setFlexShrink(f);
    }

    @ReactProp(name = ViewProps.FLEX_WRAP)
    public void setFlexWrap(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setFlexWrap(YogaWrap.NO_WRAP);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1039592053:
                if (str.equals("nowrap")) {
                    c = 0;
                    break;
                }
                break;
            case -749527969:
                if (str.equals("wrap-reverse")) {
                    c = 1;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setFlexWrap(YogaWrap.NO_WRAP);
                return;
            case 1:
                setFlexWrap(YogaWrap.WRAP_REVERSE);
                return;
            case 2:
                setFlexWrap(YogaWrap.WRAP);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for flexWrap: " + str);
                setFlexWrap(YogaWrap.NO_WRAP);
                return;
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.GAP)
    public void setGap(float f) {
        if (isVirtual()) {
            return;
        }
        super.setGap(PixelUtil.toPixelFromDIP(f));
    }

    @ReactProp(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    setStyleHeightPercent(this.mTempYogaValue.value);
                }
            } else {
                setStyleHeightAuto();
            }
        } else {
            setStyleHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.JUSTIFY_CONTENT)
    public void setJustifyContent(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setJustifyContent(YogaJustify.FLEX_START);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -46581362:
                if (str.equals("flex-start")) {
                    c = 1;
                    break;
                }
                break;
            case 441309761:
                if (str.equals("space-between")) {
                    c = 2;
                    break;
                }
                break;
            case 1742952711:
                if (str.equals("flex-end")) {
                    c = 3;
                    break;
                }
                break;
            case 1937124468:
                if (str.equals("space-around")) {
                    c = 4;
                    break;
                }
                break;
            case 2055030478:
                if (str.equals("space-evenly")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setJustifyContent(YogaJustify.CENTER);
                return;
            case 1:
                setJustifyContent(YogaJustify.FLEX_START);
                return;
            case 2:
                setJustifyContent(YogaJustify.SPACE_BETWEEN);
                return;
            case 3:
                setJustifyContent(YogaJustify.FLEX_END);
                return;
            case 4:
                setJustifyContent(YogaJustify.SPACE_AROUND);
                return;
            case 5:
                setJustifyContent(YogaJustify.SPACE_EVENLY);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for justifyContent: " + str);
                setJustifyContent(YogaJustify.FLEX_START);
                return;
        }
    }

    @ReactPropGroup(names = {ViewProps.MARGIN, ViewProps.MARGIN_VERTICAL, ViewProps.MARGIN_HORIZONTAL, ViewProps.MARGIN_START, ViewProps.MARGIN_END, ViewProps.MARGIN_TOP, ViewProps.MARGIN_BOTTOM, ViewProps.MARGIN_LEFT, ViewProps.MARGIN_RIGHT})
    public void setMargins(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    setMarginPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
                }
            } else {
                setMarginAuto(maybeTransformLeftRightToStartEnd);
            }
        } else {
            setMargin(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_HEIGHT)
    public void setMaxHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 4) {
                setStyleMaxHeightPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMaxHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MAX_WIDTH)
    public void setMaxWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 4) {
                setStyleMaxWidthPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMaxWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_HEIGHT)
    public void setMinHeight(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 4) {
                setStyleMinHeightPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMinHeight(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.MIN_WIDTH)
    public void setMinWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 4) {
                setStyleMinWidthPercent(this.mTempYogaValue.value);
            }
        } else {
            setStyleMinWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.OVERFLOW)
    public void setOverflow(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setOverflow(YogaOverflow.VISIBLE);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    c = 0;
                    break;
                }
                break;
            case -907680051:
                if (str.equals(ViewProps.SCROLL)) {
                    c = 1;
                    break;
                }
                break;
            case 466743410:
                if (str.equals(ViewProps.VISIBLE)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setOverflow(YogaOverflow.HIDDEN);
                return;
            case 1:
                setOverflow(YogaOverflow.SCROLL);
                return;
            case 2:
                setOverflow(YogaOverflow.VISIBLE);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for overflow: " + str);
                setOverflow(YogaOverflow.VISIBLE);
                return;
        }
    }

    @ReactPropGroup(names = {ViewProps.PADDING, ViewProps.PADDING_VERTICAL, ViewProps.PADDING_HORIZONTAL, ViewProps.PADDING_START, ViewProps.PADDING_END, ViewProps.PADDING_TOP, ViewProps.PADDING_BOTTOM, ViewProps.PADDING_LEFT, ViewProps.PADDING_RIGHT})
    public void setPaddings(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(ViewProps.PADDING_MARGIN_SPACING_TYPES[i]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                setPaddingPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
            }
        } else {
            setPadding(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @ReactProp(name = ViewProps.POSITION)
    public void setPosition(String str) {
        if (isVirtual()) {
            return;
        }
        if (str == null) {
            setPositionType(YogaPositionType.RELATIVE);
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -892481938:
                if (str.equals("static")) {
                    c = 0;
                    break;
                }
                break;
            case -554435892:
                if (str.equals("relative")) {
                    c = 1;
                    break;
                }
                break;
            case 1728122231:
                if (str.equals("absolute")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                setPositionType(YogaPositionType.STATIC);
                return;
            case 1:
                setPositionType(YogaPositionType.RELATIVE);
                return;
            case 2:
                setPositionType(YogaPositionType.ABSOLUTE);
                return;
            default:
                C13677a.m1870H(ReactConstants.TAG, "invalid value for position: " + str);
                setPositionType(YogaPositionType.RELATIVE);
                return;
        }
    }

    @ReactPropGroup(names = {ViewProps.START, ViewProps.END, ViewProps.LEFT, ViewProps.RIGHT, ViewProps.TOP, ViewProps.BOTTOM})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i]);
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i2 = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                setPositionPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
            }
        } else {
            setPosition(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.ROW_GAP)
    public void setRowGap(float f) {
        if (isVirtual()) {
            return;
        }
        super.setRowGap(PixelUtil.toPixelFromDIP(f));
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    @ReactProp(name = ViewProps.ON_LAYOUT)
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @ReactProp(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z) {
    }

    @ReactProp(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z) {
    }

    @ReactProp(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z) {
    }

    @ReactProp(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (isVirtual()) {
            return;
        }
        this.mTempYogaValue.setFromDynamic(dynamic);
        int i = C41901.$SwitchMap$com$facebook$yoga$YogaUnit[this.mTempYogaValue.unit.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4) {
                    setStyleWidthPercent(this.mTempYogaValue.value);
                }
            } else {
                setStyleWidthAuto();
            }
        } else {
            setStyleWidth(this.mTempYogaValue.value);
        }
        dynamic.recycle();
    }
}
