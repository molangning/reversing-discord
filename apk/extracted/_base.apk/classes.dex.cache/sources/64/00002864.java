package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.C4340d;
import com.facebook.yoga.YogaBaselineFunction;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.ArrayList;
import java.util.Map;
import p058d5.C5743a;

@TargetApi(23)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactTextShadowNode extends ReactBaseTextShadowNode {
    private static final TextPaint sTextPaintInstance = new TextPaint(1);
    private Spannable mPreparedSpannableText;
    private boolean mShouldNotifyOnTextLayout;
    private final YogaBaselineFunction mTextBaselineFunction;
    private final YogaMeasureFunction mTextMeasureFunction;

    public ReactTextShadowNode() {
        this(null);
    }

    private int getTextAlign() {
        int i = this.mTextAlign;
        if (getLayoutDirection() == YogaDirection.RTL) {
            if (i == 5) {
                return 3;
            }
            if (i == 3) {
                return 5;
            }
            return i;
        }
        return i;
    }

    private void initMeasureFunction() {
        if (!isVirtual()) {
            setMeasureFunction(this.mTextMeasureFunction);
            setBaselineFunction(this.mTextBaselineFunction);
        }
    }

    public Layout measureSpannedText(Spannable spannable, float f, YogaMeasureMode yogaMeasureMode) {
        float f2;
        boolean z;
        TextPaint textPaint = sTextPaintInstance;
        textPaint.setTextSize(this.mTextAttributes.getEffectiveFontSize());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        if (isBoring == null) {
            f2 = Layout.getDesiredWidth(spannable, textPaint);
        } else {
            f2 = Float.NaN;
        }
        if (yogaMeasureMode != YogaMeasureMode.UNDEFINED && f >= 0.0f) {
            z = false;
        } else {
            z = true;
        }
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int textAlign = getTextAlign();
        if (textAlign != 1) {
            if (textAlign != 3) {
                if (textAlign == 5) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                }
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
        } else {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        Layout.Alignment alignment2 = alignment;
        if (isBoring == null && (z || (!C4340d.m29971a(f2) && f2 <= f))) {
            int i = Build.VERSION.SDK_INT;
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) Math.ceil(f2)).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            if (i >= 26) {
                hyphenationFrequency.setJustificationMode(this.mJustificationMode);
            }
            if (i >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring != null && (z || isBoring.width <= f)) {
            return BoringLayout.make(spannable, textPaint, Math.max(isBoring.width, 0), alignment2, 1.0f, 0.0f, isBoring, this.mIncludeFontPadding);
        } else {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 > 29) {
                f = (float) Math.ceil(f);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(this.mIncludeFontPadding).setBreakStrategy(this.mTextBreakStrategy).setHyphenationFrequency(this.mHyphenationFrequency);
            if (i2 >= 28) {
                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public Iterable<? extends ReactShadowNode> calculateLayoutOnChildren() {
        Map<Integer, ReactShadowNode> map = this.mInlineViews;
        if (map != null && !map.isEmpty()) {
            Spanned spanned = (Spanned) C5743a.m24582d(this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout");
            TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spanned.getSpans(0, spanned.length(), TextInlineViewPlaceholderSpan.class);
            ArrayList arrayList = new ArrayList(textInlineViewPlaceholderSpanArr.length);
            for (TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan : textInlineViewPlaceholderSpanArr) {
                ReactShadowNode reactShadowNode = this.mInlineViews.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                reactShadowNode.calculateLayout();
                arrayList.add(reactShadowNode);
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        this.mPreparedSpannableText = spannedFromShadowNode(this, null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        Spannable spannable = this.mPreparedSpannableText;
        if (spannable != null) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannable, -1, this.mContainsImages, getPadding(4), getPadding(1), getPadding(5), getPadding(3), getTextAlign(), this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @ReactProp(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.mShouldNotifyOnTextLayout = z;
    }

    public ReactTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mTextMeasureFunction = new YogaMeasureFunction() { // from class: com.facebook.react.views.text.ReactTextShadowNode.1
            /* JADX WARN: Code restructure failed: missing block: B:131:0x0165, code lost:
                if (r2 > r21) goto L67;
             */
            @Override // com.facebook.yoga.YogaMeasureFunction
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public long measure(com.facebook.yoga.YogaNode r18, float r19, com.facebook.yoga.YogaMeasureMode r20, float r21, com.facebook.yoga.YogaMeasureMode r22) {
                /*
                    Method dump skipped, instructions count: 366
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.text.ReactTextShadowNode.C42661.measure(com.facebook.yoga.YogaNode, float, com.facebook.yoga.YogaMeasureMode, float, com.facebook.yoga.YogaMeasureMode):long");
            }
        };
        this.mTextBaselineFunction = new YogaBaselineFunction() { // from class: com.facebook.react.views.text.ReactTextShadowNode.2
            @Override // com.facebook.yoga.YogaBaselineFunction
            public float baseline(YogaNode yogaNode, float f, float f2) {
                Layout measureSpannedText = ReactTextShadowNode.this.measureSpannedText((Spannable) C5743a.m24582d(ReactTextShadowNode.this.mPreparedSpannableText, "Spannable element has not been prepared in onBeforeLayout"), f, YogaMeasureMode.EXACTLY);
                return measureSpannedText.getLineBaseline(measureSpannedText.getLineCount() - 1);
            }
        };
        initMeasureFunction();
    }
}