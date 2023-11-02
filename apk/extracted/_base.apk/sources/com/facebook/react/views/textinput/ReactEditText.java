package com.facebook.react.views.textinput;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.text.method.QwertyKeyListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.C1365w0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.uimanager.FabricViewStateManager;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.text.CustomLetterSpacingSpan;
import com.facebook.react.views.text.CustomLineHeightSpan;
import com.facebook.react.views.text.CustomStyleSpan;
import com.facebook.react.views.text.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.ReactBackgroundColorSpan;
import com.facebook.react.views.text.ReactForegroundColorSpan;
import com.facebook.react.views.text.ReactSpan;
import com.facebook.react.views.text.ReactStrikethroughSpan;
import com.facebook.react.views.text.ReactTextUpdate;
import com.facebook.react.views.text.ReactTypefaceUtils;
import com.facebook.react.views.text.ReactUnderlineSpan;
import com.facebook.react.views.text.TextAttributes;
import com.facebook.react.views.text.TextInlineImageSpan;
import com.facebook.react.views.text.TextLayoutManager;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactEditText extends AppCompatEditText implements FabricViewStateManager.HasFabricViewStateManager {
    public static final boolean DEBUG_MODE = false;
    private static final int UNSET = -1;
    private static final KeyListener sKeyListener = QwertyKeyListener.getInstanceForFullKeyboard();
    private final String TAG;
    private final ReactEditTextClickDetector clickDetector;
    private boolean mAutoFocus;
    protected boolean mContainsImages;
    private ContentSizeWatcher mContentSizeWatcher;
    private int mDefaultGravityHorizontal;
    private int mDefaultGravityVertical;
    private boolean mDetectScrollMovement;
    private boolean mDidAttachToWindow;
    private boolean mDisableFullscreen;
    protected boolean mDisableTextDiffing;
    private EventDispatcher mEventDispatcher;
    private final FabricViewStateManager mFabricViewStateManager;
    private String mFontFamily;
    private int mFontStyle;
    private int mFontWeight;
    private final InputMethodManager mInputMethodManager;
    protected boolean mIsSettingTextFromJS;
    protected boolean mIsSettingTextFromState;
    private InternalKeyListener mKeyListener;
    private ArrayList<TextWatcher> mListeners;
    protected int mNativeEventCount;
    private boolean mOnKeyPress;
    private String mPlaceholder;
    private ReactViewBackgroundManager mReactBackgroundManager;
    private String mReturnKeyType;
    private ScrollWatcher mScrollWatcher;
    private SelectionWatcher mSelectionWatcher;
    private int mStagedInputType;
    private String mSubmitBehavior;
    private TextAttributes mTextAttributes;
    private TextWatcherDelegator mTextWatcherDelegator;
    private boolean mTypefaceDirty;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class InternalKeyListener implements KeyListener {
        private int mInputType = 0;

        @Override // android.text.method.KeyListener
        public void clearMetaKeyState(View view, Editable editable, int i) {
            ReactEditText.sKeyListener.clearMetaKeyState(view, editable, i);
        }

        @Override // android.text.method.KeyListener
        public int getInputType() {
            return this.mInputType;
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyDown(view, editable, i, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyOther(view, editable, keyEvent);
        }

        @Override // android.text.method.KeyListener
        public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
            return ReactEditText.sKeyListener.onKeyUp(view, editable, i, keyEvent);
        }

        public void setInputType(int i) {
            this.mInputType = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface SpanPredicate<T> {
        boolean test(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class TextWatcherDelegator implements TextWatcher {
        private TextWatcherDelegator() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ReactEditText reactEditText = ReactEditText.this;
            if (!reactEditText.mIsSettingTextFromJS && reactEditText.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).afterTextChanged(editable);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ReactEditText reactEditText = ReactEditText.this;
            if (!reactEditText.mIsSettingTextFromJS && reactEditText.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
                }
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ReactEditText reactEditText = ReactEditText.this;
            if (!reactEditText.mIsSettingTextFromJS && reactEditText.mListeners != null) {
                Iterator it = ReactEditText.this.mListeners.iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText.this.updateCachedSpannable();
            ReactEditText.this.onContentSizeChange();
        }
    }

    public ReactEditText(Context context) {
        super(context);
        this.TAG = ReactEditText.class.getSimpleName();
        this.mSubmitBehavior = null;
        this.mDetectScrollMovement = false;
        this.mOnKeyPress = false;
        this.mTypefaceDirty = false;
        this.mFontFamily = null;
        this.mFontWeight = -1;
        this.mFontStyle = -1;
        this.mAutoFocus = false;
        this.mDidAttachToWindow = false;
        this.mPlaceholder = null;
        this.mFabricViewStateManager = new FabricViewStateManager();
        this.mDisableTextDiffing = false;
        this.mIsSettingTextFromState = false;
        this.clickDetector = new ReactEditTextClickDetector(this);
        setFocusableInTouchMode(false);
        this.mReactBackgroundManager = new ReactViewBackgroundManager(this);
        this.mInputMethodManager = (InputMethodManager) C5743a.m24583c(context.getSystemService("input_method"));
        this.mDefaultGravityHorizontal = getGravity() & 8388615;
        this.mDefaultGravityVertical = getGravity() & 112;
        this.mNativeEventCount = 0;
        this.mIsSettingTextFromJS = false;
        this.mDisableFullscreen = false;
        this.mListeners = null;
        this.mTextWatcherDelegator = null;
        this.mStagedInputType = getInputType();
        if (this.mKeyListener == null) {
            this.mKeyListener = new InternalKeyListener();
        }
        this.mScrollWatcher = null;
        this.mTextAttributes = new TextAttributes();
        applyTextAttributes();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27) {
            setLayerType(1, null);
        }
        C1365w0.m37185q0(this, new ReactAccessibilityDelegate(this, isFocusable(), getImportantForAccessibility()) { // from class: com.facebook.react.views.textinput.ReactEditText.1
            @Override // com.facebook.react.uimanager.ReactAccessibilityDelegate, androidx.core.view.C1170a
            public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                if (i2 == 16) {
                    int length = ReactEditText.this.getText().length();
                    if (length > 0) {
                        ReactEditText.this.setSelection(length);
                    }
                    return ReactEditText.this.requestFocusInternal();
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        });
    }

    private void addSpansFromStyleAttributes(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.setSpan(new ReactAbsoluteSizeSpan(this.mTextAttributes.getEffectiveFontSize()), 0, spannableStringBuilder.length(), 16711698);
        spannableStringBuilder.setSpan(new ReactForegroundColorSpan(getCurrentTextColor()), 0, spannableStringBuilder.length(), 16711698);
        int backgroundColor = this.mReactBackgroundManager.getBackgroundColor();
        if (backgroundColor != 0) {
            spannableStringBuilder.setSpan(new ReactBackgroundColorSpan(backgroundColor), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 16) != 0) {
            spannableStringBuilder.setSpan(new ReactStrikethroughSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        if ((getPaintFlags() & 8) != 0) {
            spannableStringBuilder.setSpan(new ReactUnderlineSpan(), 0, spannableStringBuilder.length(), 16711698);
        }
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            spannableStringBuilder.setSpan(new CustomLetterSpacingSpan(effectiveLetterSpacing), 0, spannableStringBuilder.length(), 16711698);
        }
        if (this.mFontStyle != -1 || this.mFontWeight != -1 || this.mFontFamily != null || getFontFeatureSettings() != null) {
            spannableStringBuilder.setSpan(new CustomStyleSpan(this.mFontStyle, this.mFontWeight, getFontFeatureSettings(), this.mFontFamily, getContext().getAssets()), 0, spannableStringBuilder.length(), 16711698);
        }
        float effectiveLineHeight = this.mTextAttributes.getEffectiveLineHeight();
        if (!Float.isNaN(effectiveLineHeight)) {
            spannableStringBuilder.setSpan(new CustomLineHeightSpan(effectiveLineHeight), 0, spannableStringBuilder.length(), 16711698);
        }
    }

    private int clampToTextLength(int i) {
        int length;
        if (getText() == null) {
            length = 0;
        } else {
            length = getText().length();
        }
        return Math.max(0, Math.min(i, length));
    }

    private TextWatcherDelegator getTextWatcherDelegator() {
        if (this.mTextWatcherDelegator == null) {
            this.mTextWatcherDelegator = new TextWatcherDelegator();
        }
        return this.mTextWatcherDelegator;
    }

    private boolean isSecureText() {
        return (getInputType() & 144) != 0;
    }

    private void manageSpans(SpannableStringBuilder spannableStringBuilder) {
        Object[] spans;
        boolean z;
        for (Object obj : getText().getSpans(0, length(), Object.class)) {
            int spanFlags = getText().getSpanFlags(obj);
            if ((spanFlags & 33) == 33) {
                z = true;
            } else {
                z = false;
            }
            if (obj instanceof ReactSpan) {
                getText().removeSpan(obj);
            }
            if (z) {
                int spanStart = getText().getSpanStart(obj);
                int spanEnd = getText().getSpanEnd(obj);
                getText().removeSpan(obj);
                if (sameTextForSpan(getText(), spannableStringBuilder, spanStart, spanEnd)) {
                    spannableStringBuilder.setSpan(obj, spanStart, spanEnd, spanFlags);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onContentSizeChange() {
        ContentSizeWatcher contentSizeWatcher = this.mContentSizeWatcher;
        if (contentSizeWatcher != null) {
            contentSizeWatcher.onLayout();
        }
        setIntrinsicContentSize();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean requestFocusInternal() {
        setFocusableInTouchMode(true);
        boolean requestFocus = super.requestFocus(130, null);
        if (getShowSoftInputOnFocus()) {
            showSoftKeyboard();
        }
        return requestFocus;
    }

    private static boolean sameTextForSpan(Editable editable, SpannableStringBuilder spannableStringBuilder, int i, int i2) {
        if (i > spannableStringBuilder.length() || i2 > spannableStringBuilder.length()) {
            return false;
        }
        while (i < i2) {
            if (editable.charAt(i) != spannableStringBuilder.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    private void setIntrinsicContentSize() {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        FabricViewStateManager fabricViewStateManager = this.mFabricViewStateManager;
        if (fabricViewStateManager != null && !fabricViewStateManager.hasStateWrapper() && !reactContext.isBridgeless()) {
            ReactTextInputLocalData reactTextInputLocalData = new ReactTextInputLocalData(this);
            UIManagerModule uIManagerModule = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), reactTextInputLocalData);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T> void stripSpansOfKind(SpannableStringBuilder spannableStringBuilder, Class<T> cls, SpanPredicate<T> spanPredicate) {
        Object[] spans;
        for (Object obj : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
            if (spanPredicate.test(obj)) {
                spannableStringBuilder.removeSpan(obj);
            }
        }
    }

    private void stripStyleEquivalentSpans(SpannableStringBuilder spannableStringBuilder) {
        stripSpansOfKind(spannableStringBuilder, ReactAbsoluteSizeSpan.class, new SpanPredicate<ReactAbsoluteSizeSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.2
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(ReactAbsoluteSizeSpan reactAbsoluteSizeSpan) {
                return reactAbsoluteSizeSpan.getSize() == ReactEditText.this.mTextAttributes.getEffectiveFontSize();
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactBackgroundColorSpan.class, new SpanPredicate<ReactBackgroundColorSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.3
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(ReactBackgroundColorSpan reactBackgroundColorSpan) {
                return reactBackgroundColorSpan.getBackgroundColor() == ReactEditText.this.mReactBackgroundManager.getBackgroundColor();
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactForegroundColorSpan.class, new SpanPredicate<ReactForegroundColorSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.4
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(ReactForegroundColorSpan reactForegroundColorSpan) {
                return reactForegroundColorSpan.getForegroundColor() == ReactEditText.this.getCurrentTextColor();
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactStrikethroughSpan.class, new SpanPredicate<ReactStrikethroughSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.5
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(ReactStrikethroughSpan reactStrikethroughSpan) {
                return (ReactEditText.this.getPaintFlags() & 16) != 0;
            }
        });
        stripSpansOfKind(spannableStringBuilder, ReactUnderlineSpan.class, new SpanPredicate<ReactUnderlineSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.6
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(ReactUnderlineSpan reactUnderlineSpan) {
                return (ReactEditText.this.getPaintFlags() & 8) != 0;
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomLetterSpacingSpan.class, new SpanPredicate<CustomLetterSpacingSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.7
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(CustomLetterSpacingSpan customLetterSpacingSpan) {
                return customLetterSpacingSpan.getSpacing() == ReactEditText.this.mTextAttributes.getEffectiveLetterSpacing();
            }
        });
        stripSpansOfKind(spannableStringBuilder, CustomStyleSpan.class, new SpanPredicate<CustomStyleSpan>() { // from class: com.facebook.react.views.textinput.ReactEditText.8
            @Override // com.facebook.react.views.textinput.ReactEditText.SpanPredicate
            public boolean test(CustomStyleSpan customStyleSpan) {
                return customStyleSpan.getStyle() == ReactEditText.this.mFontStyle && Objects.equals(customStyleSpan.getFontFamily(), ReactEditText.this.mFontFamily) && customStyleSpan.getWeight() == ReactEditText.this.mFontWeight && Objects.equals(customStyleSpan.getFontFeatureSettings(), ReactEditText.this.getFontFeatureSettings());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCachedSpannable() {
        boolean z;
        FabricViewStateManager fabricViewStateManager = this.mFabricViewStateManager;
        if (fabricViewStateManager == null || !fabricViewStateManager.hasStateWrapper() || getId() == -1) {
            return;
        }
        Editable text = getText();
        if (text != null && text.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            try {
                spannableStringBuilder.append(text.subSequence(0, text.length()));
            } catch (IndexOutOfBoundsException e) {
                ReactSoftExceptionLogger.logSoftException(this.TAG, e);
            }
        }
        if (!z) {
            if (getHint() != null && getHint().length() > 0) {
                spannableStringBuilder.append(getHint());
            } else {
                spannableStringBuilder.append("I");
            }
        }
        addSpansFromStyleAttributes(spannableStringBuilder);
        TextLayoutManager.setCachedSpannabledForTag(getId(), spannableStringBuilder);
    }

    private void updateImeOptions() {
        String str = this.mReturnKeyType;
        int i = 6;
        if (str != null) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1273775369:
                    if (str.equals("previous")) {
                        c = 0;
                        break;
                    }
                    break;
                case -906336856:
                    if (str.equals("search")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3304:
                    if (str.equals("go")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3089282:
                    if (str.equals("done")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3377907:
                    if (str.equals("next")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3387192:
                    if (str.equals(ViewProps.NONE)) {
                        c = 5;
                        break;
                    }
                    break;
                case 3526536:
                    if (str.equals("send")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = 7;
                    break;
                case 1:
                    i = 3;
                    break;
                case 2:
                    i = 2;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 1;
                    break;
                case 6:
                    i = 4;
                    break;
            }
        }
        if (this.mDisableFullscreen) {
            setImeOptions(33554432 | i);
        } else {
            setImeOptions(i);
        }
    }

    @Override // android.widget.TextView
    public void addTextChangedListener(TextWatcher textWatcher) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
            super.addTextChangedListener(getTextWatcherDelegator());
        }
        this.mListeners.add(textWatcher);
    }

    protected void applyTextAttributes() {
        setTextSize(0, this.mTextAttributes.getEffectiveFontSize());
        float effectiveLetterSpacing = this.mTextAttributes.getEffectiveLetterSpacing();
        if (!Float.isNaN(effectiveLetterSpacing)) {
            setLetterSpacing(effectiveLetterSpacing);
        }
    }

    public boolean canUpdateWithEventCount(int i) {
        return i >= this.mNativeEventCount;
    }

    @Override // android.view.View
    public void clearFocus() {
        setFocusableInTouchMode(false);
        super.clearFocus();
        hideSoftKeyboard();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearFocusFromJS() {
        clearFocus();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void commitStagedInputType() {
        if (getInputType() != this.mStagedInputType) {
            int selectionStart = getSelectionStart();
            int selectionEnd = getSelectionEnd();
            setInputType(this.mStagedInputType);
            setSelection(selectionStart, selectionEnd);
        }
    }

    protected void finalize() {
        TextLayoutManager.deleteCachedSpannableForTag(getId());
    }

    public int getBorderColor(int i) {
        return this.mReactBackgroundManager.getBorderColor(i);
    }

    public boolean getDisableFullscreenUI() {
        return this.mDisableFullscreen;
    }

    @Override // com.facebook.react.uimanager.FabricViewStateManager.HasFabricViewStateManager
    public FabricViewStateManager getFabricViewStateManager() {
        return this.mFabricViewStateManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getGravityHorizontal() {
        return getGravity() & 8388615;
    }

    public String getReturnKeyType() {
        return this.mReturnKeyType;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getStagedInputType() {
        return this.mStagedInputType;
    }

    public String getSubmitBehavior() {
        return this.mSubmitBehavior;
    }

    protected void hideSoftKeyboard() {
        this.mInputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
    }

    public int incrementAndGetEventCounter() {
        int i = this.mNativeEventCount + 1;
        this.mNativeEventCount = i;
        return i;
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    @Override // android.view.View
    public boolean isLayoutRequested() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isMultiline() {
        return (getInputType() & 131072) != 0;
    }

    public void maybeSetSelection(int i, int i2, int i3) {
        if (canUpdateWithEventCount(i) && i2 != -1 && i3 != -1) {
            setSelection(clampToTextLength(i2), clampToTextLength(i3));
        }
    }

    public void maybeSetText(ReactTextUpdate reactTextUpdate) {
        if ((isSecureText() && TextUtils.equals(getText(), reactTextUpdate.getText())) || !canUpdateWithEventCount(reactTextUpdate.getJsEventCounter())) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(reactTextUpdate.getText());
        manageSpans(spannableStringBuilder);
        stripStyleEquivalentSpans(spannableStringBuilder);
        this.mContainsImages = reactTextUpdate.containsImages();
        this.mDisableTextDiffing = true;
        if (reactTextUpdate.getText().length() == 0) {
            setText((CharSequence) null);
        } else {
            getText().replace(0, length(), spannableStringBuilder);
        }
        this.mDisableTextDiffing = false;
        if (getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
            setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
        }
        updateCachedSpannable();
    }

    public void maybeSetTextFromJS(ReactTextUpdate reactTextUpdate) {
        this.mIsSettingTextFromJS = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromJS = false;
    }

    public void maybeSetTextFromState(ReactTextUpdate reactTextUpdate) {
        this.mIsSettingTextFromState = true;
        maybeSetText(reactTextUpdate);
        this.mIsSettingTextFromState = false;
    }

    public void maybeUpdateTypeface() {
        if (!this.mTypefaceDirty) {
            return;
        }
        this.mTypefaceDirty = false;
        setTypeface(ReactTypefaceUtils.applyStyles(getTypeface(), this.mFontStyle, this.mFontWeight, this.mFontFamily, getContext().getAssets()));
        if (this.mFontStyle == -1 && this.mFontWeight == -1 && this.mFontFamily == null && getFontFeatureSettings() == null) {
            setPaintFlags(getPaintFlags() & (-129));
        } else {
            setPaintFlags(getPaintFlags() | 128);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.setTextIsSelectable(true);
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onAttachedToWindow();
            }
        }
        if (this.mAutoFocus && !this.mDidAttachToWindow) {
            requestFocusInternal();
        }
        this.mDidAttachToWindow = true;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        ReactContext reactContext = UIManagerHelper.getReactContext(this);
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && this.mOnKeyPress) {
            onCreateInputConnection = new ReactEditTextInputConnectionWrapper(onCreateInputConnection, reactContext, this, this.mEventDispatcher);
        }
        if (isMultiline() && (shouldBlurOnReturn() || shouldSubmitOnReturn())) {
            editorInfo.imeOptions &= -1073741825;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onDetachedFromWindow();
            }
        }
    }

    @Override // android.view.View
    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onFinishTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        SelectionWatcher selectionWatcher;
        super.onFocusChanged(z, i, rect);
        if (z && (selectionWatcher = this.mSelectionWatcher) != null) {
            selectionWatcher.onSelectionChanged(getSelectionStart(), getSelectionEnd());
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 66 && !isMultiline()) {
            hideSoftKeyboard();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        onContentSizeChange();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        ScrollWatcher scrollWatcher = this.mScrollWatcher;
        if (scrollWatcher != null) {
            scrollWatcher.onScrollChanged(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.mSelectionWatcher != null && hasFocus()) {
            this.mSelectionWatcher.onSelectionChanged(i, i2);
        }
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                textInlineImageSpan.onStartTemporaryDetach();
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        this.clickDetector.cancelPress();
                    }
                } else if (this.mDetectScrollMovement) {
                    if (!canScrollVertically(-1) && !canScrollVertically(1) && !canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    this.mDetectScrollMovement = false;
                }
            } else {
                this.clickDetector.handleUp(motionEvent);
            }
        } else {
            this.mDetectScrollMovement = true;
            getParent().requestDisallowInterceptTouchEvent(true);
            this.clickDetector.handleDown(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.TextView
    public void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(textWatcher);
            if (this.mListeners.isEmpty()) {
                this.mListeners = null;
                super.removeTextChangedListener(getTextWatcherDelegator());
            }
        }
    }

    @Override // android.view.View
    public boolean requestFocus(int i, Rect rect) {
        return isFocused();
    }

    public void requestFocusFromJS() {
        requestFocusInternal();
    }

    public void setAllowFontScaling(boolean z) {
        if (this.mTextAttributes.getAllowFontScaling() != z) {
            this.mTextAttributes.setAllowFontScaling(z);
            applyTextAttributes();
        }
    }

    public void setAutoFocus(boolean z) {
        this.mAutoFocus = z;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBorderColor(int i, float f, float f2) {
        this.mReactBackgroundManager.setBorderColor(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.mReactBackgroundManager.setBorderRadius(f);
    }

    public void setBorderStyle(String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public void setBorderWidth(int i, float f) {
        this.mReactBackgroundManager.setBorderWidth(i, f);
    }

    public void setContentSizeWatcher(ContentSizeWatcher contentSizeWatcher) {
        this.mContentSizeWatcher = contentSizeWatcher;
    }

    public void setDisableFullscreenUI(boolean z) {
        this.mDisableFullscreen = z;
        updateImeOptions();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setEventDispatcher(EventDispatcher eventDispatcher) {
        this.mEventDispatcher = eventDispatcher;
    }

    public void setFontFamily(String str) {
        this.mFontFamily = str;
        this.mTypefaceDirty = true;
    }

    @Override // android.widget.TextView
    public void setFontFeatureSettings(String str) {
        if (!Objects.equals(str, getFontFeatureSettings())) {
            super.setFontFeatureSettings(str);
            this.mTypefaceDirty = true;
        }
    }

    public void setFontSize(float f) {
        this.mTextAttributes.setFontSize(f);
        applyTextAttributes();
    }

    public void setFontStyle(String str) {
        int parseFontStyle = ReactTypefaceUtils.parseFontStyle(str);
        if (parseFontStyle != this.mFontStyle) {
            this.mFontStyle = parseFontStyle;
            this.mTypefaceDirty = true;
        }
    }

    public void setFontWeight(String str) {
        int parseFontWeight = ReactTypefaceUtils.parseFontWeight(str);
        if (parseFontWeight != this.mFontWeight) {
            this.mFontWeight = parseFontWeight;
            this.mTypefaceDirty = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | (getGravity() & (-8) & (-8388616)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & (-113)));
    }

    @Override // android.widget.TextView
    public void setInputType(int i) {
        Typeface typeface = super.getTypeface();
        super.setInputType(i);
        this.mStagedInputType = i;
        super.setTypeface(typeface);
        if (isMultiline()) {
            setSingleLine(false);
        }
        if (this.mKeyListener == null) {
            this.mKeyListener = new InternalKeyListener();
        }
        this.mKeyListener.setInputType(i);
        setKeyListener(this.mKeyListener);
    }

    public void setLetterSpacingPt(float f) {
        this.mTextAttributes.setLetterSpacing(f);
        applyTextAttributes();
    }

    public void setMaxFontSizeMultiplier(float f) {
        if (f != this.mTextAttributes.getMaxFontSizeMultiplier()) {
            this.mTextAttributes.setMaxFontSizeMultiplier(f);
            applyTextAttributes();
        }
    }

    public void setOnKeyPress(boolean z) {
        this.mOnKeyPress = z;
    }

    public void setPlaceholder(String str) {
        if (!Objects.equals(str, this.mPlaceholder)) {
            this.mPlaceholder = str;
            setHint(str);
        }
    }

    public void setReturnKeyType(String str) {
        this.mReturnKeyType = str;
        updateImeOptions();
    }

    public void setScrollWatcher(ScrollWatcher scrollWatcher) {
        this.mScrollWatcher = scrollWatcher;
    }

    @Override // android.widget.EditText
    public void setSelection(int i, int i2) {
        super.setSelection(i, i2);
    }

    public void setSelectionWatcher(SelectionWatcher selectionWatcher) {
        this.mSelectionWatcher = selectionWatcher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setStagedInputType(int i) {
        this.mStagedInputType = i;
    }

    public void setSubmitBehavior(String str) {
        this.mSubmitBehavior = str;
    }

    public boolean shouldBlurOnReturn() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (!isMultiline()) {
                return true;
            }
            return false;
        }
        return submitBehavior.equals("blurAndSubmit");
    }

    public boolean shouldSubmitOnReturn() {
        String submitBehavior = getSubmitBehavior();
        if (submitBehavior == null) {
            if (isMultiline()) {
                return false;
            }
        } else if (!submitBehavior.equals("submit") && !submitBehavior.equals("blurAndSubmit")) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean showSoftKeyboard() {
        return this.mInputMethodManager.showSoftInput(this, 0);
    }

    @Override // android.widget.TextView, android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages) {
            Editable text = getText();
            for (TextInlineImageSpan textInlineImageSpan : (TextInlineImageSpan[]) text.getSpans(0, text.length(), TextInlineImageSpan.class)) {
                if (textInlineImageSpan.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void setBorderRadius(float f, int i) {
        this.mReactBackgroundManager.setBorderRadius(f, i);
    }
}
