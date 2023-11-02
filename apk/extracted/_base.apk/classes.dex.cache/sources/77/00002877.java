package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.yoga.C4340d;
import com.facebook.yoga.YogaMeasureMode;
import java.util.ArrayList;
import java.util.List;
import p164j$.util.concurrent.ConcurrentHashMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TextLayoutManagerMapBuffer {
    public static final short AS_KEY_CACHE_ID = 3;
    public static final short AS_KEY_FRAGMENTS = 2;
    public static final short AS_KEY_HASH = 0;
    public static final short AS_KEY_STRING = 1;
    private static final boolean DEFAULT_INCLUDE_FONT_PADDING = true;
    private static final boolean ENABLE_MEASURE_LOGGING = false;
    public static final short FR_KEY_HEIGHT = 4;
    public static final short FR_KEY_IS_ATTACHMENT = 2;
    public static final short FR_KEY_REACT_TAG = 1;
    public static final short FR_KEY_STRING = 0;
    public static final short FR_KEY_TEXT_ATTRIBUTES = 5;
    public static final short FR_KEY_WIDTH = 3;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final short PA_KEY_ADJUST_FONT_SIZE_TO_FIT = 3;
    public static final short PA_KEY_ELLIPSIZE_MODE = 1;
    public static final short PA_KEY_HYPHENATION_FREQUENCY = 5;
    public static final short PA_KEY_INCLUDE_FONT_PADDING = 4;
    public static final short PA_KEY_MAX_NUMBER_OF_LINES = 0;
    public static final short PA_KEY_TEXT_BREAK_STRATEGY = 2;
    private static final String TAG = "TextLayoutManagerMapBuffer";
    private static final short spannableCacheSize = 100;
    private static final TextPaint sTextPaintInstance = new TextPaint(1);
    private static final LruCache<MapBuffer, Spannable> sSpannableCache = new LruCache<>(100);
    private static final ConcurrentHashMap<Integer, Spannable> sTagToSpannableCache = new ConcurrentHashMap<>();

    private static void buildSpannableFromFragment(Context context, MapBuffer mapBuffer, SpannableStringBuilder spannableStringBuilder, List<SetSpanOperation> list) {
        int i;
        int count = mapBuffer.getCount();
        for (int i2 = 0; i2 < count; i2++) {
            MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(i2);
            int length = spannableStringBuilder.length();
            TextAttributeProps fromMapBuffer = TextAttributeProps.fromMapBuffer(mapBuffer2.getMapBuffer(5));
            spannableStringBuilder.append((CharSequence) TextTransform.apply(mapBuffer2.getString(0), fromMapBuffer.mTextTransform));
            int length2 = spannableStringBuilder.length();
            if (mapBuffer2.contains(1)) {
                i = mapBuffer2.getInt(1);
            } else {
                i = -1;
            }
            if (mapBuffer2.contains(2) && mapBuffer2.getBoolean(2)) {
                list.add(new SetSpanOperation(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new TextInlineViewPlaceholderSpan(i, (int) PixelUtil.toPixelFromSP(mapBuffer2.getDouble(3)), (int) PixelUtil.toPixelFromSP(mapBuffer2.getDouble(4)))));
            } else if (length2 >= length) {
                if (fromMapBuffer.mIsAccessibilityLink) {
                    list.add(new SetSpanOperation(length, length2, new ReactClickableSpan(i)));
                }
                if (fromMapBuffer.mIsColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactForegroundColorSpan(fromMapBuffer.mColor)));
                }
                if (fromMapBuffer.mIsBackgroundColorSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactBackgroundColorSpan(fromMapBuffer.mBackgroundColor)));
                }
                if (!Float.isNaN(fromMapBuffer.getLetterSpacing())) {
                    list.add(new SetSpanOperation(length, length2, new CustomLetterSpacingSpan(fromMapBuffer.getLetterSpacing())));
                }
                list.add(new SetSpanOperation(length, length2, new ReactAbsoluteSizeSpan(fromMapBuffer.mFontSize)));
                if (fromMapBuffer.mFontStyle != -1 || fromMapBuffer.mFontWeight != -1 || fromMapBuffer.mFontFamily != null) {
                    list.add(new SetSpanOperation(length, length2, new CustomStyleSpan(fromMapBuffer.mFontStyle, fromMapBuffer.mFontWeight, fromMapBuffer.mFontFeatureSettings, fromMapBuffer.mFontFamily, context.getAssets())));
                }
                if (fromMapBuffer.mIsUnderlineTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactUnderlineSpan()));
                }
                if (fromMapBuffer.mIsLineThroughTextDecorationSet) {
                    list.add(new SetSpanOperation(length, length2, new ReactStrikethroughSpan()));
                }
                if (fromMapBuffer.mTextShadowOffsetDx != 0.0f || fromMapBuffer.mTextShadowOffsetDy != 0.0f) {
                    list.add(new SetSpanOperation(length, length2, new ShadowStyleSpan(fromMapBuffer.mTextShadowOffsetDx, fromMapBuffer.mTextShadowOffsetDy, fromMapBuffer.mTextShadowRadius, fromMapBuffer.mTextShadowColor)));
                }
                if (!Float.isNaN(fromMapBuffer.getEffectiveLineHeight())) {
                    list.add(new SetSpanOperation(length, length2, new CustomLineHeightSpan(fromMapBuffer.getEffectiveLineHeight())));
                }
                list.add(new SetSpanOperation(length, length2, new ReactTagSpan(i)));
            }
        }
    }

    private static Layout createLayout(Spannable spannable, BoringLayout.Metrics metrics, float f, YogaMeasureMode yogaMeasureMode, boolean z, int i, int i2) {
        boolean z2;
        float f2;
        int i3;
        int length = spannable.length();
        if (yogaMeasureMode != YogaMeasureMode.UNDEFINED && f >= 0.0f) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (metrics == null) {
            f2 = Layout.getDesiredWidth(spannable, sTextPaintInstance);
        } else {
            f2 = Float.NaN;
        }
        if (metrics == null && (z2 || (!C4340d.m29971a(f2) && f2 <= f))) {
            return StaticLayout.Builder.obtain(spannable, 0, length, sTextPaintInstance, (int) Math.ceil(f2)).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2).build();
        } else if (metrics != null && (z2 || metrics.width <= f)) {
            int i4 = metrics.width;
            if (i4 < 0) {
                ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Text width is invalid: " + metrics.width));
                i3 = 0;
            } else {
                i3 = i4;
            }
            return BoringLayout.make(spannable, sTextPaintInstance, i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, metrics, z);
        } else {
            int i5 = Build.VERSION.SDK_INT;
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, length, sTextPaintInstance, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setBreakStrategy(i).setHyphenationFrequency(i2);
            if (i5 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        }
    }

    private static Spannable createSpannableFromAttributedString(Context context, MapBuffer mapBuffer, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        buildSpannableFromFragment(context, mapBuffer.getMapBuffer(2), spannableStringBuilder, arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            ((SetSpanOperation) arrayList.get((arrayList.size() - i) - 1)).execute(spannableStringBuilder, i);
        }
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static void deleteCachedSpannableForTag(int i) {
        sTagToSpannableCache.remove(Integer.valueOf(i));
    }

    public static Spannable getOrCreateSpannableForText(Context context, MapBuffer mapBuffer, ReactTextViewManagerCallback reactTextViewManagerCallback) {
        return createSpannableFromAttributedString(context, mapBuffer, reactTextViewManagerCallback);
    }

    public static boolean isRTL(MapBuffer mapBuffer) {
        MapBuffer mapBuffer2 = mapBuffer.getMapBuffer(2);
        if (mapBuffer2.getCount() == 0) {
            return false;
        }
        MapBuffer mapBuffer3 = mapBuffer2.getMapBuffer(0).getMapBuffer(5);
        if (!mapBuffer3.contains(21) || TextAttributeProps.getLayoutDirection(mapBuffer3.getString(21)) != 1) {
            return false;
        }
        return true;
    }

    public static WritableArray measureLines(Context context, MapBuffer mapBuffer, MapBuffer mapBuffer2, float f) {
        boolean z;
        Spannable orCreateSpannableForText = getOrCreateSpannableForText(context, mapBuffer, null);
        TextPaint textPaint = sTextPaintInstance;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(orCreateSpannableForText, textPaint);
        int textBreakStrategy = TextAttributeProps.getTextBreakStrategy(mapBuffer2.getString(2));
        if (mapBuffer2.contains(4)) {
            z = mapBuffer2.getBoolean(4);
        } else {
            z = true;
        }
        int textBreakStrategy2 = TextAttributeProps.getTextBreakStrategy(mapBuffer2.getString(5));
        return FontMetricsUtil.getFontMetrics(orCreateSpannableForText, createLayout(orCreateSpannableForText, isBoring, f, YogaMeasureMode.EXACTLY, z, textBreakStrategy, textBreakStrategy2), textPaint, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x00bf, code lost:
        if (r4 > r21) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00df, code lost:
        if (r1 > r23) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long measureText(android.content.Context r18, com.facebook.react.common.mapbuffer.MapBuffer r19, com.facebook.react.common.mapbuffer.MapBuffer r20, float r21, com.facebook.yoga.YogaMeasureMode r22, float r23, com.facebook.yoga.YogaMeasureMode r24, com.facebook.react.views.text.ReactTextViewManagerCallback r25, float[] r26) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.TextLayoutManagerMapBuffer.measureText(android.content.Context, com.facebook.react.common.mapbuffer.MapBuffer, com.facebook.react.common.mapbuffer.MapBuffer, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode, com.facebook.react.views.text.ReactTextViewManagerCallback, float[]):long");
    }

    public static void setCachedSpannabledForTag(int i, Spannable spannable) {
        sTagToSpannableCache.put(Integer.valueOf(i), spannable);
    }
}