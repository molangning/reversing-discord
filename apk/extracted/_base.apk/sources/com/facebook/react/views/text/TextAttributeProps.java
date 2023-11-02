package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TextAttributeProps {
    private static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String PROP_SHADOW_COLOR = "textShadowColor";
    private static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    private static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    private static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    private static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    private static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final short TA_KEY_ACCESSIBILITY_ROLE = 22;
    public static final short TA_KEY_ALIGNMENT = 12;
    public static final short TA_KEY_ALLOW_FONT_SCALING = 9;
    public static final short TA_KEY_BACKGROUND_COLOR = 1;
    public static final short TA_KEY_BEST_WRITING_DIRECTION = 13;
    public static final short TA_KEY_FONT_FAMILY = 3;
    public static final short TA_KEY_FONT_SIZE = 4;
    public static final short TA_KEY_FONT_SIZE_MULTIPLIER = 5;
    public static final short TA_KEY_FONT_STYLE = 7;
    public static final short TA_KEY_FONT_VARIANT = 8;
    public static final short TA_KEY_FONT_WEIGHT = 6;
    public static final short TA_KEY_FOREGROUND_COLOR = 0;
    public static final short TA_KEY_IS_HIGHLIGHTED = 20;
    public static final short TA_KEY_LAYOUT_DIRECTION = 21;
    public static final short TA_KEY_LETTER_SPACING = 10;
    public static final short TA_KEY_LINE_HEIGHT = 11;
    public static final short TA_KEY_OPACITY = 2;
    public static final short TA_KEY_TEXT_DECORATION_COLOR = 14;
    public static final short TA_KEY_TEXT_DECORATION_LINE = 15;
    public static final short TA_KEY_TEXT_DECORATION_STYLE = 16;
    public static final short TA_KEY_TEXT_SHADOW_COLOR = 19;
    public static final short TA_KEY_TEXT_SHADOW_RADIUS = 18;
    public static final int UNSET = -1;
    protected int mBackgroundColor;
    protected int mColor;
    private static final int DEFAULT_JUSTIFICATION_MODE = 0;
    private static final int DEFAULT_BREAK_STRATEGY = 1;
    private static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    protected float mLineHeight = Float.NaN;
    protected boolean mIsColorSet = false;
    protected boolean mAllowFontScaling = true;
    protected boolean mIsBackgroundColorSet = false;
    protected int mNumberOfLines = -1;
    protected int mFontSize = -1;
    protected float mFontSizeInput = -1.0f;
    protected float mLineHeightInput = -1.0f;
    protected float mLetterSpacingInput = Float.NaN;
    protected int mTextAlign = 0;
    protected int mLayoutDirection = -1;
    protected TextTransform mTextTransform = TextTransform.NONE;
    protected float mTextShadowOffsetDx = 0.0f;
    protected float mTextShadowOffsetDy = 0.0f;
    protected float mTextShadowRadius = 1.0f;
    protected int mTextShadowColor = 1426063360;
    protected boolean mIsUnderlineTextDecorationSet = false;
    protected boolean mIsLineThroughTextDecorationSet = false;
    protected boolean mIncludeFontPadding = true;
    protected ReactAccessibilityDelegate.AccessibilityRole mAccessibilityRole = null;
    protected boolean mIsAccessibilityRoleSet = false;
    protected boolean mIsAccessibilityLink = false;
    protected int mFontStyle = -1;
    protected int mFontWeight = -1;
    protected String mFontFamily = null;
    protected String mFontFeatureSettings = null;
    protected boolean mContainsImages = false;
    protected float mHeightOfTallestInlineImage = Float.NaN;

    private TextAttributeProps() {
    }

    public static TextAttributeProps fromMapBuffer(MapBuffer mapBuffer) {
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        for (MapBuffer.Entry entry : mapBuffer) {
            int key = entry.getKey();
            if (key != 0) {
                if (key != 1) {
                    if (key != 3) {
                        if (key != 4) {
                            if (key != 15) {
                                if (key != 18) {
                                    if (key != 19) {
                                        if (key != 21) {
                                            if (key != 22) {
                                                switch (key) {
                                                    case 6:
                                                        textAttributeProps.setFontWeight(entry.getStringValue());
                                                        continue;
                                                    case 7:
                                                        textAttributeProps.setFontStyle(entry.getStringValue());
                                                        continue;
                                                    case 8:
                                                        textAttributeProps.setFontVariant(entry.getMapBufferValue());
                                                        continue;
                                                    case 9:
                                                        textAttributeProps.setAllowFontScaling(entry.getBooleanValue());
                                                        continue;
                                                    case 10:
                                                        textAttributeProps.setLetterSpacing((float) entry.getDoubleValue());
                                                        continue;
                                                    case 11:
                                                        textAttributeProps.setLineHeight((float) entry.getDoubleValue());
                                                        continue;
                                                }
                                            } else {
                                                textAttributeProps.setAccessibilityRole(entry.getStringValue());
                                            }
                                        } else {
                                            textAttributeProps.setLayoutDirection(entry.getStringValue());
                                        }
                                    } else {
                                        textAttributeProps.setTextShadowColor(entry.getIntValue());
                                    }
                                } else {
                                    textAttributeProps.setTextShadowRadius((float) entry.getDoubleValue());
                                }
                            } else {
                                textAttributeProps.setTextDecorationLine(entry.getStringValue());
                            }
                        } else {
                            textAttributeProps.setFontSize((float) entry.getDoubleValue());
                        }
                    } else {
                        textAttributeProps.setFontFamily(entry.getStringValue());
                    }
                } else {
                    textAttributeProps.setBackgroundColor(Integer.valueOf(entry.getIntValue()));
                }
            } else {
                textAttributeProps.setColor(Integer.valueOf(entry.getIntValue()));
            }
        }
        return textAttributeProps;
    }

    public static TextAttributeProps fromReadableMap(ReactStylesDiffMap reactStylesDiffMap) {
        Integer num;
        Integer num2;
        Integer num3;
        TextAttributeProps textAttributeProps = new TextAttributeProps();
        textAttributeProps.setNumberOfLines(getIntProp(reactStylesDiffMap, ViewProps.NUMBER_OF_LINES, -1));
        textAttributeProps.setLineHeight(getFloatProp(reactStylesDiffMap, ViewProps.LINE_HEIGHT, -1.0f));
        textAttributeProps.setLetterSpacing(getFloatProp(reactStylesDiffMap, ViewProps.LETTER_SPACING, Float.NaN));
        textAttributeProps.setAllowFontScaling(getBooleanProp(reactStylesDiffMap, ViewProps.ALLOW_FONT_SCALING, true));
        textAttributeProps.setFontSize(getFloatProp(reactStylesDiffMap, ViewProps.FONT_SIZE, -1.0f));
        ReadableMap readableMap = null;
        if (reactStylesDiffMap.hasKey(ViewProps.COLOR)) {
            num = Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.COLOR, 0));
        } else {
            num = null;
        }
        textAttributeProps.setColor(num);
        if (reactStylesDiffMap.hasKey(ViewProps.FOREGROUND_COLOR)) {
            num2 = Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.FOREGROUND_COLOR, 0));
        } else {
            num2 = null;
        }
        textAttributeProps.setColor(num2);
        if (reactStylesDiffMap.hasKey(ViewProps.BACKGROUND_COLOR)) {
            num3 = Integer.valueOf(reactStylesDiffMap.getInt(ViewProps.BACKGROUND_COLOR, 0));
        } else {
            num3 = null;
        }
        textAttributeProps.setBackgroundColor(num3);
        textAttributeProps.setFontFamily(getStringProp(reactStylesDiffMap, ViewProps.FONT_FAMILY));
        textAttributeProps.setFontWeight(getStringProp(reactStylesDiffMap, ViewProps.FONT_WEIGHT));
        textAttributeProps.setFontStyle(getStringProp(reactStylesDiffMap, ViewProps.FONT_STYLE));
        textAttributeProps.setFontVariant(getArrayProp(reactStylesDiffMap, ViewProps.FONT_VARIANT));
        textAttributeProps.setIncludeFontPadding(getBooleanProp(reactStylesDiffMap, ViewProps.INCLUDE_FONT_PADDING, true));
        textAttributeProps.setTextDecorationLine(getStringProp(reactStylesDiffMap, ViewProps.TEXT_DECORATION_LINE));
        if (reactStylesDiffMap.hasKey("textShadowOffset")) {
            readableMap = reactStylesDiffMap.getMap("textShadowOffset");
        }
        textAttributeProps.setTextShadowOffset(readableMap);
        textAttributeProps.setTextShadowRadius(getFloatProp(reactStylesDiffMap, "textShadowRadius", 1.0f));
        textAttributeProps.setTextShadowColor(getIntProp(reactStylesDiffMap, "textShadowColor", 1426063360));
        textAttributeProps.setTextTransform(getStringProp(reactStylesDiffMap, "textTransform"));
        textAttributeProps.setLayoutDirection(getStringProp(reactStylesDiffMap, ViewProps.LAYOUT_DIRECTION));
        textAttributeProps.setAccessibilityRole(getStringProp(reactStylesDiffMap, ViewProps.ACCESSIBILITY_ROLE));
        return textAttributeProps;
    }

    private static ReadableArray getArrayProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getArray(str);
        }
        return null;
    }

    private static boolean getBooleanProp(ReactStylesDiffMap reactStylesDiffMap, String str, boolean z) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getBoolean(str, z);
        }
        return z;
    }

    private static float getFloatProp(ReactStylesDiffMap reactStylesDiffMap, String str, float f) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getFloat(str, f);
        }
        return f;
    }

    public static int getHyphenationFrequency(String str) {
        int i = DEFAULT_HYPHENATION_FREQUENCY;
        if (str != null) {
            if (!str.equals("normal")) {
                if (!str.equals(ViewProps.NONE)) {
                    return 2;
                }
                return 0;
            }
            return 1;
        }
        return i;
    }

    private static int getIntProp(ReactStylesDiffMap reactStylesDiffMap, String str, int i) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getInt(str, i);
        }
        return i;
    }

    public static int getJustificationMode(ReactStylesDiffMap reactStylesDiffMap, int i) {
        if (!reactStylesDiffMap.hasKey(ViewProps.TEXT_ALIGN)) {
            return i;
        }
        if ("justify".equals(reactStylesDiffMap.getString(ViewProps.TEXT_ALIGN)) && Build.VERSION.SDK_INT >= 26) {
            return 1;
        }
        return DEFAULT_JUSTIFICATION_MODE;
    }

    public static int getLayoutDirection(String str) {
        if (str == null || "undefined".equals(str)) {
            return -1;
        }
        if ("rtl".equals(str)) {
            return 1;
        }
        if ("ltr".equals(str)) {
            return 0;
        }
        C13677a.m1870H(ReactConstants.TAG, "Invalid layoutDirection: " + str);
        return -1;
    }

    private static String getStringProp(ReactStylesDiffMap reactStylesDiffMap, String str) {
        if (reactStylesDiffMap.hasKey(str)) {
            return reactStylesDiffMap.getString(str);
        }
        return null;
    }

    public static int getTextAlignment(ReactStylesDiffMap reactStylesDiffMap, boolean z, int i) {
        if (!reactStylesDiffMap.hasKey(ViewProps.TEXT_ALIGN)) {
            return i;
        }
        String string = reactStylesDiffMap.getString(ViewProps.TEXT_ALIGN);
        if ("justify".equals(string)) {
            return 3;
        }
        if (string != null && !"auto".equals(string)) {
            if (ViewProps.LEFT.equals(string)) {
                if (!z) {
                    return 3;
                }
                return 5;
            } else if (ViewProps.RIGHT.equals(string)) {
                if (z) {
                    return 3;
                }
                return 5;
            } else if ("center".equals(string)) {
                return 1;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textAlign: " + string);
            }
        }
        return 0;
    }

    public static int getTextBreakStrategy(String str) {
        int i = DEFAULT_BREAK_STRATEGY;
        if (str != null) {
            if (!str.equals("balanced")) {
                if (!str.equals("simple")) {
                    return 1;
                }
                return 0;
            }
            return 2;
        }
        return i;
    }

    private void setAccessibilityRole(String str) {
        if (str != null) {
            this.mIsAccessibilityRoleSet = true;
            ReactAccessibilityDelegate.AccessibilityRole fromValue = ReactAccessibilityDelegate.AccessibilityRole.fromValue(str);
            this.mAccessibilityRole = fromValue;
            this.mIsAccessibilityLink = fromValue.equals(ReactAccessibilityDelegate.AccessibilityRole.LINK);
        }
    }

    private void setAllowFontScaling(boolean z) {
        if (z != this.mAllowFontScaling) {
            this.mAllowFontScaling = z;
            setFontSize(this.mFontSizeInput);
            setLineHeight(this.mLineHeightInput);
            setLetterSpacing(this.mLetterSpacingInput);
        }
    }

    private void setBackgroundColor(Integer num) {
        boolean z;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsBackgroundColorSet = z;
        if (z) {
            this.mBackgroundColor = num.intValue();
        }
    }

    private void setColor(Integer num) {
        boolean z;
        if (num != null) {
            z = true;
        } else {
            z = false;
        }
        this.mIsColorSet = z;
        if (z) {
            this.mColor = num.intValue();
        }
    }

    private void setFontFamily(String str) {
        this.mFontFamily = str;
    }

    private void setFontSize(float f) {
        double ceil;
        this.mFontSizeInput = f;
        if (f != -1.0f) {
            if (this.mAllowFontScaling) {
                ceil = Math.ceil(PixelUtil.toPixelFromSP(f));
            } else {
                ceil = Math.ceil(PixelUtil.toPixelFromDIP(f));
            }
            f = (float) ceil;
        }
        this.mFontSize = (int) f;
    }

    private void setFontStyle(String str) {
        this.mFontStyle = ReactTypefaceUtils.parseFontStyle(str);
    }

    private void setFontVariant(ReadableArray readableArray) {
        this.mFontFeatureSettings = ReactTypefaceUtils.parseFontVariant(readableArray);
    }

    private void setFontWeight(String str) {
        this.mFontWeight = ReactTypefaceUtils.parseFontWeight(str);
    }

    private void setIncludeFontPadding(boolean z) {
        this.mIncludeFontPadding = z;
    }

    private void setLayoutDirection(String str) {
        this.mLayoutDirection = getLayoutDirection(str);
    }

    private void setLetterSpacing(float f) {
        this.mLetterSpacingInput = f;
    }

    private void setLineHeight(float f) {
        float pixelFromDIP;
        this.mLineHeightInput = f;
        if (f == -1.0f) {
            this.mLineHeight = Float.NaN;
            return;
        }
        if (this.mAllowFontScaling) {
            pixelFromDIP = PixelUtil.toPixelFromSP(f);
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(f);
        }
        this.mLineHeight = pixelFromDIP;
    }

    private void setNumberOfLines(int i) {
        if (i == 0) {
            i = -1;
        }
        this.mNumberOfLines = i;
    }

    private void setTextDecorationLine(String str) {
        String[] split;
        this.mIsUnderlineTextDecorationSet = false;
        this.mIsLineThroughTextDecorationSet = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.mIsUnderlineTextDecorationSet = true;
                } else if ("strikethrough".equals(str2)) {
                    this.mIsLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    private void setTextShadowColor(int i) {
        if (i != this.mTextShadowColor) {
            this.mTextShadowColor = i;
        }
    }

    private void setTextShadowOffset(ReadableMap readableMap) {
        this.mTextShadowOffsetDx = 0.0f;
        this.mTextShadowOffsetDy = 0.0f;
        if (readableMap != null) {
            if (readableMap.hasKey("width") && !readableMap.isNull("width")) {
                this.mTextShadowOffsetDx = PixelUtil.toPixelFromDIP(readableMap.getDouble("width"));
            }
            if (readableMap.hasKey("height") && !readableMap.isNull("height")) {
                this.mTextShadowOffsetDy = PixelUtil.toPixelFromDIP(readableMap.getDouble("height"));
            }
        }
    }

    private void setTextShadowRadius(float f) {
        if (f != this.mTextShadowRadius) {
            this.mTextShadowRadius = f;
        }
    }

    private void setTextTransform(String str) {
        if (str != null && !ViewProps.NONE.equals(str)) {
            if ("uppercase".equals(str)) {
                this.mTextTransform = TextTransform.UPPERCASE;
                return;
            } else if ("lowercase".equals(str)) {
                this.mTextTransform = TextTransform.LOWERCASE;
                return;
            } else if ("capitalize".equals(str)) {
                this.mTextTransform = TextTransform.CAPITALIZE;
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textTransform: " + str);
                this.mTextTransform = TextTransform.NONE;
                return;
            }
        }
        this.mTextTransform = TextTransform.NONE;
    }

    public float getEffectiveLineHeight() {
        boolean z;
        if (!Float.isNaN(this.mLineHeight) && !Float.isNaN(this.mHeightOfTallestInlineImage) && this.mHeightOfTallestInlineImage > this.mLineHeight) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.mHeightOfTallestInlineImage;
        }
        return this.mLineHeight;
    }

    public float getLetterSpacing() {
        float pixelFromDIP;
        if (this.mAllowFontScaling) {
            pixelFromDIP = PixelUtil.toPixelFromSP(this.mLetterSpacingInput);
        } else {
            pixelFromDIP = PixelUtil.toPixelFromDIP(this.mLetterSpacingInput);
        }
        int i = this.mFontSize;
        if (i > 0) {
            return pixelFromDIP / i;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.mFontSize);
    }

    private void setFontVariant(MapBuffer mapBuffer) {
        if (mapBuffer != null && mapBuffer.getCount() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
            while (it.hasNext()) {
                String stringValue = it.next().getStringValue();
                if (stringValue != null) {
                    char c = 65535;
                    switch (stringValue.hashCode()) {
                        case -1983120972:
                            if (stringValue.equals("stylistic-thirteen")) {
                                c = 0;
                                break;
                            }
                            break;
                        case -1933522176:
                            if (stringValue.equals("stylistic-fifteen")) {
                                c = 1;
                                break;
                            }
                            break;
                        case -1534462052:
                            if (stringValue.equals("stylistic-eighteen")) {
                                c = 2;
                                break;
                            }
                            break;
                        case -1195362251:
                            if (stringValue.equals("proportional-nums")) {
                                c = 3;
                                break;
                            }
                            break;
                        case -1061392823:
                            if (stringValue.equals("lining-nums")) {
                                c = 4;
                                break;
                            }
                            break;
                        case -771984547:
                            if (stringValue.equals("tabular-nums")) {
                                c = 5;
                                break;
                            }
                            break;
                        case -659678800:
                            if (stringValue.equals("oldstyle-nums")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 296506098:
                            if (stringValue.equals("stylistic-eight")) {
                                c = 7;
                                break;
                            }
                            break;
                        case 309330544:
                            if (stringValue.equals("stylistic-seven")) {
                                c = '\b';
                                break;
                            }
                            break;
                        case 310339585:
                            if (stringValue.equals("stylistic-three")) {
                                c = '\t';
                                break;
                            }
                            break;
                        case 604478526:
                            if (stringValue.equals("stylistic-eleven")) {
                                c = '\n';
                                break;
                            }
                            break;
                        case 979426287:
                            if (stringValue.equals("stylistic-five")) {
                                c = 11;
                                break;
                            }
                            break;
                        case 979432035:
                            if (stringValue.equals("stylistic-four")) {
                                c = '\f';
                                break;
                            }
                            break;
                        case 979664367:
                            if (stringValue.equals("stylistic-nine")) {
                                c = '\r';
                                break;
                            }
                            break;
                        case 1001434505:
                            if (stringValue.equals("stylistic-one")) {
                                c = 14;
                                break;
                            }
                            break;
                        case 1001438213:
                            if (stringValue.equals("stylistic-six")) {
                                c = 15;
                                break;
                            }
                            break;
                        case 1001439040:
                            if (stringValue.equals("stylistic-ten")) {
                                c = 16;
                                break;
                            }
                            break;
                        case 1001439599:
                            if (stringValue.equals("stylistic-two")) {
                                c = 17;
                                break;
                            }
                            break;
                        case 1030714463:
                            if (stringValue.equals("stylistic-sixteen")) {
                                c = 18;
                                break;
                            }
                            break;
                        case 1044065430:
                            if (stringValue.equals("stylistic-twelve")) {
                                c = 19;
                                break;
                            }
                            break;
                        case 1044067310:
                            if (stringValue.equals("stylistic-twenty")) {
                                c = 20;
                                break;
                            }
                            break;
                        case 1183323111:
                            if (stringValue.equals("small-caps")) {
                                c = 21;
                                break;
                            }
                            break;
                        case 1463562569:
                            if (stringValue.equals("stylistic-nineteen")) {
                                c = 22;
                                break;
                            }
                            break;
                        case 1648446397:
                            if (stringValue.equals("stylistic-fourteen")) {
                                c = 23;
                                break;
                            }
                            break;
                        case 2097122634:
                            if (stringValue.equals("stylistic-seventeen")) {
                                c = 24;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            arrayList.add("'ss13'");
                            continue;
                        case 1:
                            arrayList.add("'ss15'");
                            continue;
                        case 2:
                            arrayList.add("'ss18'");
                            continue;
                        case 3:
                            arrayList.add("'pnum'");
                            continue;
                        case 4:
                            arrayList.add("'lnum'");
                            continue;
                        case 5:
                            arrayList.add("'tnum'");
                            continue;
                        case 6:
                            arrayList.add("'onum'");
                            continue;
                        case 7:
                            arrayList.add("'ss08'");
                            continue;
                        case '\b':
                            arrayList.add("'ss07'");
                            continue;
                        case '\t':
                            arrayList.add("'ss03'");
                            continue;
                        case '\n':
                            arrayList.add("'ss11'");
                            continue;
                        case 11:
                            arrayList.add("'ss05'");
                            continue;
                        case '\f':
                            arrayList.add("'ss04'");
                            continue;
                        case '\r':
                            arrayList.add("'ss09'");
                            continue;
                        case 14:
                            arrayList.add("'ss01'");
                            continue;
                        case 15:
                            arrayList.add("'ss06'");
                            continue;
                        case 16:
                            arrayList.add("'ss10'");
                            continue;
                        case 17:
                            arrayList.add("'ss02'");
                            continue;
                        case 18:
                            arrayList.add("'ss16'");
                            continue;
                        case 19:
                            arrayList.add("'ss12'");
                            continue;
                        case 20:
                            arrayList.add("'ss20'");
                            continue;
                        case 21:
                            arrayList.add("'smcp'");
                            continue;
                        case 22:
                            arrayList.add("'ss19'");
                            continue;
                        case 23:
                            arrayList.add("'ss14'");
                            continue;
                        case 24:
                            arrayList.add("'ss17'");
                            continue;
                    }
                }
            }
            this.mFontFeatureSettings = TextUtils.join(", ", arrayList);
            return;
        }
        this.mFontFeatureSettings = null;
    }
}
