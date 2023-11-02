package com.facebook.react.views.textinput;

import android.annotation.TargetApi;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.view.C1365w0;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.text.ReactBaseTextShadowNode;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTextViewManagerCallback;
import com.facebook.react.views.view.MeasureUtil;
import com.facebook.yoga.C4343g;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import p058d5.C5743a;
import p414x2.C13677a;

@TargetApi(23)
@VisibleForTesting
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactTextInputShadowNode extends ReactBaseTextShadowNode implements YogaMeasureFunction {
    @VisibleForTesting
    public static final String PROP_PLACEHOLDER = "placeholder";
    @VisibleForTesting
    public static final String PROP_TEXT = "text";
    private EditText mInternalEditText;
    private ReactTextInputLocalData mLocalData;
    private int mMostRecentEventCount;
    private String mPlaceholder;
    private String mText;

    public ReactTextInputShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.mMostRecentEventCount = -1;
        this.mText = null;
        this.mPlaceholder = null;
        this.mTextBreakStrategy = 1;
        initMeasureFunction();
    }

    private void initMeasureFunction() {
        setMeasureFunction(this);
    }

    protected EditText createInternalEditText() {
        return new EditText(getThemedContext());
    }

    public String getPlaceholder() {
        return this.mPlaceholder;
    }

    public String getText() {
        return this.mText;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isYogaLeafNode() {
        return true;
    }

    @Override // com.facebook.yoga.YogaMeasureFunction
    public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
        EditText editText = (EditText) C5743a.m24583c(this.mInternalEditText);
        ReactTextInputLocalData reactTextInputLocalData = this.mLocalData;
        if (reactTextInputLocalData != null) {
            reactTextInputLocalData.apply(editText);
        } else {
            editText.setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
            int i = this.mNumberOfLines;
            if (i != -1) {
                editText.setLines(i);
            }
            int breakStrategy = editText.getBreakStrategy();
            int i2 = this.mTextBreakStrategy;
            if (breakStrategy != i2) {
                editText.setBreakStrategy(i2);
            }
        }
        editText.setHint(getPlaceholder());
        editText.measure(MeasureUtil.getMeasureSpec(f, yogaMeasureMode), MeasureUtil.getMeasureSpec(f2, yogaMeasureMode2));
        return C4343g.m29966b(editText.getMeasuredWidth(), editText.getMeasuredHeight());
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uIViewOperationQueue) {
        super.onCollectExtraUpdates(uIViewOperationQueue);
        if (this.mMostRecentEventCount != -1) {
            uIViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannedFromShadowNode(this, getText(), false, null), this.mMostRecentEventCount, this.mContainsImages, getPadding(0), getPadding(1), getPadding(2), getPadding(3), this.mTextAlign, this.mTextBreakStrategy, this.mJustificationMode));
        }
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setLocalData(Object obj) {
        C5743a.m24585a(obj instanceof ReactTextInputLocalData);
        this.mLocalData = (ReactTextInputLocalData) obj;
        dirty();
    }

    @ReactProp(name = "mostRecentEventCount")
    public void setMostRecentEventCount(int i) {
        this.mMostRecentEventCount = i;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setPadding(int i, float f) {
        super.setPadding(i, f);
        markUpdated();
    }

    @ReactProp(name = PROP_PLACEHOLDER)
    public void setPlaceholder(String str) {
        this.mPlaceholder = str;
        markUpdated();
    }

    @ReactProp(name = "text")
    public void setText(String str) {
        this.mText = str;
        markUpdated();
    }

    @Override // com.facebook.react.views.text.ReactBaseTextShadowNode
    public void setTextBreakStrategy(String str) {
        if (str != null && !"simple".equals(str)) {
            if ("highQuality".equals(str)) {
                this.mTextBreakStrategy = 1;
                return;
            } else if ("balanced".equals(str)) {
                this.mTextBreakStrategy = 2;
                return;
            } else {
                C13677a.m1870H(ReactConstants.TAG, "Invalid textBreakStrategy: " + str);
                this.mTextBreakStrategy = 0;
                return;
            }
        }
        this.mTextBreakStrategy = 0;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void setThemedContext(ThemedReactContext themedReactContext) {
        super.setThemedContext(themedReactContext);
        EditText createInternalEditText = createInternalEditText();
        setDefaultPadding(4, C1365w0.m37248G(createInternalEditText));
        setDefaultPadding(1, createInternalEditText.getPaddingTop());
        setDefaultPadding(5, C1365w0.m37250F(createInternalEditText));
        setDefaultPadding(3, createInternalEditText.getPaddingBottom());
        this.mInternalEditText = createInternalEditText;
        createInternalEditText.setPadding(0, 0, 0, 0);
        this.mInternalEditText.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public ReactTextInputShadowNode() {
        this(null);
    }
}
